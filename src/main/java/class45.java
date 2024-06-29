import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class45 {

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 5)
    public static final void method545(int arg0) {
        if (class309.field4295 == null || class551.field7593 == null) {
            class551.field7593 = new int[256];
            class309.field4295 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class309.field4295[var1] = (int) (Math.sin(var2) * 4096.0D);
                class551.field7593[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field985++;
        if (arg0 != 26188) {
            method546(-76, 98, 86);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)B", line = 46)
    public static final byte method546(int arg0, int arg1, int arg2) {
        field983++;
        if (arg2 != 9) {
            return 0;
        } else if (arg1 == -27939) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return -50;
        }
    }
}
