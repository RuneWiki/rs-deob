import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class644 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field9149 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lvh;")
    public static class125 field9152 = new class125(76, 4);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lms;")
    public static class44 field9145;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILek;)V", line = 3)
    public final void method3619(int arg0, class465 arg1) {
        field9151++;
        if (arg0 >= -7) {
            field9152 = null;
        }
        while (true) {
            int var3 = arg1.method2705(-56);
            if (var3 == 0) {
                return;
            }
            this.method3624(76, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 28)
    public static void method3620(byte arg0) {
        field9145 = null;
        field9152 = null;
        if (arg0 != -64) {
            field9145 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)Z", line = 48)
    public static final boolean method3621(int arg0, byte arg1, int arg2) {
        if (arg1 > -73) {
            method3622(null, null, null, (byte) 127);
        }
        field9147++;
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([ILvo;Lvo;B)V", line = 61)
    public static final void method3622(int[] arg0, class345 arg1, class345 arg2, byte arg3) {
        class662.field9306 = arg1;
        int var4 = -97 % ((arg3 + 68) / 54);
        field9146++;
        class609.field8758 = arg2;
        if (arg0 != null) {
            class634.field8978 = arg0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 79)
    public static final void method3623(byte arg0) {
        field9148++;
        if (class531.field7839 != null) {
            return;
        }
        class531.field7839 = new int[65536];
        if (arg0 != -42) {
            method3620((byte) -112);
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3D7) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) - (-(var33 << 8) - var34);
            class531.field7839[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILek;I)V", line = 192)
    private final void method3624(int arg0, class465 arg1, int arg2) {
        if (arg2 == 5) {
            this.field9149 = arg1.method2755((byte) -108);
        }
        field9150++;
        int var4 = -5 / ((16 - arg0) / 32);
    }
}
