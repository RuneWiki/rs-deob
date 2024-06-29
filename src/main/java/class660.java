import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class660 {

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Ljava/lang/String;")
    public String field8717;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Ljava/lang/String;")
    public String field8711;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Ljava/lang/String;")
    public String field8708;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8710 = 999999;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lkaa;")
    public static class47 field8712 = new class47(69, 5);

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "[I")
    public static int[] field8719 = new int[32];

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[[[Lih;")
    public static class701[][][] field8718;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public static final void method3577(boolean arg0) {
        field8716++;
        if (class656.field8679 != null) {
            return;
        }
        class656.field8679 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (!arg0) {
            field8718 = null;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class656.field8679[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static final void method3578(byte arg0) {
        class411.field5711.method1677(class411.field5711.field3908, (byte) -71, 1);
        field8709++;
        class411.field5711.method1677(class411.field5711.field3890, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3882, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3888, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3904, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3900, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3879, (byte) -71, 1);
        if (arg0 != -95) {
            return;
        }
        class411.field5711.method1677(class411.field5711.field3869, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3918, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3868, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3897, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3902, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3915, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3884, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3895, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3912, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3911, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3891, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3876, (byte) -71, 0);
        class371.method2179(8583);
        class411.field5711.method1677(class411.field5711.field3874, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3903, (byte) -71, 4);
        class505.method2837((byte) 120);
        class320.method1940(arg0 + 96);
        class50.field641 = true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method3579(int arg0) {
        field8718 = null;
        field8719 = null;
        if (arg0 != -32636) {
            method3580(-120, 8, 125, 48, -21, null, -93, 2, 102, -126, -77, 100);
        }
        field8712 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIILkb;IIIIII)Z")
    public static final boolean method3580(int arg0, int arg1, int arg2, int arg3, int arg4, class691 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field8713++;
        int var12 = arg10;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg10 - var14;
        int var17 = arg4 - var15;
        class372.field5176[var14][var15] = 99;
        class8.field155[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class50.field638[var18] = arg10;
        int var35 = var18 + 1;
        class10.field169[var18] = arg4;
        if (arg9 != -19272) {
            field8719 = null;
        }
        int[][] var20 = arg5.field9639;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class524.field6955 = var13;
                                    class156.field2385 = var12;
                                    return false;
                                }
                                var12 = class50.field638[var19];
                                var13 = class10.field169[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg5.field9624;
                                var24 = var13 - arg5.field9640;
                                if (arg2 == -4) {
                                    if (arg11 == var12 && arg3 == var13) {
                                        class156.field2385 = var12;
                                        class524.field6955 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -3) {
                                    if (class287.method1780(arg0, arg8, var13, arg3, arg0, arg1, arg11, var12, true)) {
                                        class156.field2385 = var12;
                                        class524.field6955 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -2) {
                                    if (arg5.method3899(arg0, arg1, arg8, arg3, var12, -101, arg11, arg7, arg0, var13)) {
                                        class524.field6955 = var13;
                                        class156.field2385 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -1) {
                                    if (arg5.method3894(arg11, arg1, arg0, arg9 ^ 0x4B47, arg3, var13, arg8, var12, arg7)) {
                                        class156.field2385 = var12;
                                        class524.field6955 = var13;
                                        return true;
                                    }
                                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                                    if (arg5.method3901(arg6, (byte) -119, var13, arg2, arg0, arg11, var12, arg3)) {
                                        class524.field6955 = var13;
                                        class156.field2385 = var12;
                                        return true;
                                    }
                                } else if (arg5.method3893(arg9 ^ 0xFFFFB4B9, arg0, arg6, arg2, var12, arg3, arg11, var13)) {
                                    class156.field2385 = var12;
                                    class524.field6955 = var13;
                                    return true;
                                }
                                var26 = class8.field155[var21][var22] + 1;
                                if (var21 > 0 && class372.field5176[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg0 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg0 - 1) <= var27) {
                                            class50.field638[var35] = var12 - 1;
                                            class10.field169[var35] = var13;
                                            class372.field5176[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class8.field155[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg0) > var21 && class372.field5176[var21 + 1][var22] == 0 && (var20[var23 + arg0][var24] & 0x60E40000) == 0 && (var20[arg0 + var23][var24 + arg0 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg0 - 1) <= var28) {
                                            class50.field638[var35] = var12 + 1;
                                            class10.field169[var35] = var13;
                                            class372.field5176[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class8.field155[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg0][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class372.field5176[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg0 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg0 - 1)) {
                                            class50.field638[var35] = var12;
                                            class10.field169[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class372.field5176[var21][var22 - 1] = 1;
                                            class8.field155[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg0) && class372.field5176[var21][var22 + 1] == 0 && (var20[var23][arg0 + var24] & 0x4E240000) == 0 && (var20[arg0 + var23 - 1][var24 + arg0] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg0 - 1)) {
                                            class50.field638[var35] = var12;
                                            class10.field169[var35] = var13 + 1;
                                            class372.field5176[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class8.field155[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg0 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class372.field5176[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg0 <= var31) {
                                            class50.field638[var35] = var12 - 1;
                                            class10.field169[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class372.field5176[var21 - 1][var22 - 1] = 3;
                                            class8.field155[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg0) > var21 && var22 > 0 && class372.field5176[var21 + 1][var22 - 1] == 0 && (var20[arg0 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg0 <= var32) {
                                            class50.field638[var35] = var12 + 1;
                                            class10.field169[var35] = var13 - 1;
                                            class372.field5176[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class8.field155[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg0 > var22 && class372.field5176[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg0 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg0; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg0] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class50.field638[var35] = var12 - 1;
                                    class10.field169[var35] = var13 + 1;
                                    class372.field5176[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class8.field155[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg0));
                        } while (var22 >= (128 - arg0));
                    } while (class372.field5176[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg0 + var23][arg0 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg0; var34++) {
                    if ((var20[var23 + var34][arg0 + var24] & 0x7E240000) != 0 || (var20[arg0 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class50.field638[var35] = var12 + 1;
                class10.field169[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class372.field5176[var21 + 1][var22 + 1] = 12;
                class8.field155[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBI)V")
    public static final void method3581(int arg0, byte arg1, int arg2) {
        field8714++;
        if (arg1 > -71) {
            field8712 = null;
        }
        class127 var3 = class760.method4231(arg2, -874792672, 1);
        var3.method1010(614);
        var3.field2099 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class660(String arg0, String arg1, String arg2) {
        this.field8717 = arg1;
        this.field8711 = arg2;
        this.field8708 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lrda;IIBII)Lqd;")
    public static final class452 method3582(class663 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -54) {
            method3582(null, 109, -122, (byte) -89, 73, 120);
        }
        field8715++;
        if (!arg0.field9062 && (!class538.method2993(arg2, -31218) || !class538.method2993(arg4, -31218))) {
            return arg0.field8986 ? new class452(arg0, 34037, arg1, arg5, arg2, arg4, true) : new class452(arg0, arg1, arg5, arg2, arg4, class737.method4119(arg2, (byte) -128), class737.method4119(arg4, (byte) -128), true);
        } else {
            return new class452(arg0, 3553, arg1, arg5, arg2, arg4, true);
        }
    }
}
