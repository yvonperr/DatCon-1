package DatConRecs.Created4V3;

import DatConRecs.Payload;
import DatConRecs.RecIMU;
import Files.ConvertDat;

public class IMU120_2049 extends RecIMU {
    public IMU120_2049(ConvertDat convertDat) {
        super(convertDat, 2049, 120, 1);
        current = this;
    }

    public void process(Payload _payload) {
        super.process(_payload);
    }
}
