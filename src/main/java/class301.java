import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class301 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Ljava/lang/String;")
    public String field3758;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIIB)V", line = 11)
    public static final void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg2 == arg4 && arg6 == arg8 && arg3 == arg7 && arg1 == arg5) {
            class604.method3434(arg1, arg0, -105, arg3, arg2, arg8);
        } else {
            int var10 = arg2;
            int var11 = arg8;
            int var12 = arg2 * 3;
            int var13 = arg8 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg7 * 3;
            int var17 = arg5 * 3;
            int var18 = arg3 + var14 - arg2 - var16;
            int var19 = arg1 + var15 - arg8 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 + (var27 + var31 + var29 >> 12);
                int var34 = arg8 + (var30 + var32 + var28 >> 12);
                class604.method3434(var34, arg0, 124, var33, var10, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field3757++;
        if (arg9 >= -73) {
            field3753 = 84;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)I", line = 89)
    public static final int method1802(int arg0, byte arg1) {
        field3754++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        if (arg1 != -6) {
            method1802(-100, (byte) -100);
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;", line = 194)
    public final String toString() {
        field3755++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIBII)V", line = 209)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3756++;
        for (class68 var7 = (class68) class262.field3249.method2790(124); var7 != null; var7 = (class68) class262.field3249.method2794(arg4 + 98)) {
            if (var7.field700 <= class392.field5398) {
                var7.method2401((byte) -57);
            } else {
                class344.method2051(arg2 >> 1, arg5 >> 1, (var7.field698 << 9) + 256, var7.field690 * 2, arg4 ^ 0x3A23, var7.field696, arg3, arg6, (var7.field688 << 9) + 256);
                class567.field8070.method450(0, var7.field697 | 0xFF000000, arg4 ^ 0xFFFFFFC9, var7.field689, arg0 + class595.field8399[0], class595.field8399[1] + arg1);
            }
        }
        if (arg4 != -55) {
            field3751 = 87;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 237)
    public class301(String arg0, int arg1) {
        this.field3752 = arg1;
        this.field3758 = arg0;
    }
}
