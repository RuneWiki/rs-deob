import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class44 extends class81 {

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "[I")
    public int[] field958 = new int[1];

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "[I")
    public int[] field970 = new int[] { -1 };

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lpj;")
    public static class237 field959 = class33.method353("<col=40ff00>", 124);

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "Lpj;")
    private static class237 field962 = class33.method353("purple:", 23);

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Lpj;")
    public static class237 field964 = field962;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Lpj;")
    public static class237 field963 = field962;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lpj;")
    public static class237 field968 = class33.method353(")4a=", 112);

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Lfa;")
    public static class239 field969;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Laj;")
    public static class46 field961;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field967++;
        int var8 = 0;
        if (arg7 != 6683) {
            method421((byte) 105, 119);
        }
        int var9 = 0;
        int var10 = arg2;
        int var11 = arg5 - arg0;
        int var12 = arg5 * arg5;
        int var13 = arg2 - arg0;
        int var14 = arg2 * arg2;
        int var15 = var13 * var13;
        int var16 = var14 << 1;
        int var17 = var11 * var11;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = arg2 << 1;
        int var22 = var13 << 1;
        int var23 = var14 - ((var21 - 1) * var18);
        int var24 = (1 - var22) * var17 + var19;
        int var25 = (1 - var21) * var12 + var16;
        int var26 = var15 - ((var22 - 1) * var20);
        int var27 = var12 << 2;
        int var28 = var17 << 2;
        int var29 = var15 << 2;
        int var30 = var14 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var30;
        int var36 = (arg2 - 1) * var27;
        int var37 = var29;
        int var38 = (var13 - 1) * var28;
        int[] var39 = class62.field1241[arg1];
        class199.method1361(arg6, arg3 - var11, var39, arg3 - arg5, 87);
        class199.method1361(arg4, arg3 + var11, var39, arg3 - var11, 104);
        class199.method1361(arg6, arg3 + arg5, var39, arg3 + var11, 92);
        while (var10 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var23 += var35;
                    var35 += var30;
                    var25 += var31;
                    var8++;
                    var31 += var30;
                }
            }
            boolean var40 = var10 <= var13;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var37;
                        var9++;
                        var37 += var29;
                        var24 += var33;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var29;
                    var24 += var33;
                    var9++;
                    var33 += var29;
                }
                var24 += -var38;
                var26 += -var34;
                var34 -= var28;
                var38 -= var28;
            }
            if (var23 < 0) {
                var25 += var31;
                var8++;
                var31 += var30;
                var23 += var35;
                var35 += var30;
            }
            var23 += -var32;
            var32 -= var27;
            var25 += -var36;
            var10--;
            int var41 = arg1 + var10;
            int var42 = arg1 - var10;
            int var43 = arg3 + var8;
            var36 -= var27;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var9;
                int var46 = arg3 - var9;
                class199.method1361(arg6, var46, class62.field1241[var42], var44, arg7 - 6565);
                class199.method1361(arg4, var45, class62.field1241[var42], var46, 67);
                class199.method1361(arg6, var43, class62.field1241[var42], var45, 54);
                class199.method1361(arg6, var46, class62.field1241[var41], var44, 93);
                class199.method1361(arg4, var45, class62.field1241[var41], var46, arg7 ^ 0x1A27);
                class199.method1361(arg6, var43, class62.field1241[var41], var45, 64);
            } else {
                class199.method1361(arg6, var43, class62.field1241[var42], var44, 94);
                class199.method1361(arg6, var43, class62.field1241[var41], var44, 112);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public static void method419(int arg0) {
        field969 = null;
        field959 = null;
        field962 = null;
        field963 = null;
        field964 = null;
        field961 = null;
        field968 = null;
        int var1 = -10 / ((70 - arg0) / 35);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)I")
    public static final int method420(byte arg0, int arg1, int arg2) {
        field960++;
        if (arg0 != -94) {
            return -38;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
    public static final int method421(byte arg0, int arg1) {
        field965++;
        double var2 = (double) ((arg1 & 0xFF2F8B) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
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
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (arg0 != -119) {
            field969 = null;
        }
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
        int var19 = (int) (var14 * 256.0D);
        double var20 = var12 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        int var22 = (int) (var20 * 256.0D);
        return (var19 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }
}
