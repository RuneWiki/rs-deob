import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class62 {

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "Z")
    public boolean field763 = true;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "[I")
    public static int[] field758 = new int[1];

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "[Lpv;")
    public static class71[] field766 = new class71[37];

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "Lcda;")
    public static class173 field759 = new class173();

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "C")
    private char field762;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "Ljava/lang/String;")
    public String field756;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method536(int arg0) {
        if (arg0 == Integer.MAX_VALUE) {
            field760++;
            return this.field762 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)I", line = 16)
    public static final int method537(int arg0, int arg1, int arg2) {
        field764++;
        if (arg2 != -15800) {
            field759 = null;
        }
        int var3 = arg1 + (arg0 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lee;Z)V", line = 32)
    public final void method538(class677 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3821((byte) -87);
            if (var3 == 0) {
                if (!arg1) {
                    field758 = null;
                }
                field757++;
                return;
            }
            this.method541(-82, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIBII)V", line = 54)
    public static final void method539(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field755++;
        if (class410.field5681 != 1) {
            return;
        }
        int var5 = arg1 / class300.field4261;
        int var6 = arg0 / class300.field4261;
        if (arg2 > -36) {
            method540((byte) 39);
        }
        int var7 = arg4 / class296.field4227;
        int var8 = arg3 / class296.field4227;
        if (var5 >= class237.field3335 || var6 < 0 || class176.field2654 <= var7 || var8 < 0) {
            return;
        }
        if (class176.field2654 <= var8) {
            var8 = class176.field2654 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class237.field3335 <= var6) {
            var6 = class237.field3335 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class353.method2114(class176.field2654, -429911713, class252.field3472 + var9) * class237.field3335;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class353.method2114(class237.field3335, -429911713, class446.field6124 + var11) + var10;
                class577.field7567[var12] = class595.field7749;
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V", line = 126)
    public static void method540(byte arg0) {
        field766 = null;
        field758 = null;
        field759 = null;
        if (arg0 != 21) {
            method537(-19, 59, 70);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IILee;)V", line = 144)
    private final void method541(int arg0, int arg1, class677 arg2) {
        if (arg1 == 1) {
            this.field762 = class703.method3957((byte) -71, arg2.method3811(117));
        } else if (arg1 == 2) {
            this.field761 = arg2.method3799(false);
        } else if (arg1 == 4) {
            this.field763 = false;
        } else if (arg1 == 5) {
            this.field756 = arg2.method3793(15598);
        }
        field765++;
        if (arg0 >= -63) {
            method539(-46, 102, (byte) -11, -30, -91);
        }
    }
}
