import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class209 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field3784 = 0;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[J")
    public static long[] field3780 = new long[200];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lmk;")
    public static class101 field3785 = null;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3786 = 0;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "J")
    public static long field3782;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lbj;")
    public static class151 field3778;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[Lmk;")
    public static class101[] field3781;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[Lfj;")
    public static class239[] field3783;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZI)I")
    public static final int method1483(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method1483(75, 77, 39, true, 56);
        }
        field3779++;
        int var5 = 65536 - class145.field2742[arg1 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field3778 = null;
        if (arg0 != 85) {
            field3780 = null;
        }
        field3785 = null;
        field3783 = null;
        field3781 = null;
        field3780 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILqk;)V")
    public final void method1485(int arg0, class200 arg1) {
        while (true) {
            int var3 = arg1.method1408((byte) -37);
            if (var3 == 0) {
                field3777++;
                if (arg0 <= 64) {
                    field3787 = 5;
                    return;
                }
                return;
            }
            this.method1486(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLqk;)V")
    private final void method1486(int arg0, boolean arg1, class200 arg2) {
        if (!arg1) {
            method1484((byte) 111);
        }
        if (arg0 == 5) {
            this.field3784 = arg2.method1410(-82);
        }
        field3790++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)I")
    public static final int method1487(int arg0, boolean arg1) {
        field3789++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF6A) >> 8) / 256.0D;
        if (!arg1) {
            method1487(-78, false);
        }
        double var6 = var2;
        double var8 = 0.0D;
        double var10 = var2;
        double var12 = (double) (arg0 & 0xFF) / 256.0D;
        if (var4 < var2) {
            var10 = var4;
        }
        if (var4 > var2) {
            var6 = var4;
        }
        if (var6 < var12) {
            var6 = var12;
        }
        if (var10 > var12) {
            var10 = var12;
        }
        double var14 = 0.0D;
        double var16 = (var6 + var10) / 2.0D;
        if (var6 != var10) {
            if (var16 < 0.5D) {
                var14 = (var6 - var10) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var6 - var10) / (2.0D - var6 - var10);
            }
            if (var2 == var6) {
                var8 = (var4 - var12) / (var6 - var10);
            } else if (var4 == var6) {
                var8 = (var12 - var2) / (var6 - var10) + 2.0D;
            } else if (var6 == var12) {
                var8 = (var2 - var4) / (var6 - var10) + 4.0D;
            }
        }
        double var18 = var8 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 > 243) {
            var22 >>= 0x4;
        } else if (var21 > 217) {
            var22 >>= 0x3;
        } else if (var21 > 192) {
            var22 >>= 0x2;
        } else if (var21 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 1) + (var20 >> 2 << 10) + (var22 >> 5 << 7);
    }
}
