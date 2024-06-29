import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class62 extends class246 {

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "[Lob;")
    public static class152[] field1031 = new class152[14];

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "S")
    public static short field1035 = 32767;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "[I")
    public static int[] field1034 = new int[2];

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lji;")
    public static class256 field1037;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
    public static final void method510(int arg0, int arg1) {
        if (arg0 != 583304259) {
            field1033 = 86;
        }
        field1030++;
        if (arg1 == -1 || !class176.method1165(arg1, arg0 ^ 0xDD3B02A4)) {
            return;
        }
        class297[] var2 = class275.field4236[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class297 var4 = var2[var3];
            if (var4.field4557 != null) {
                class43 var5 = new class43();
                var5.field767 = var4.field4557;
                var5.field750 = var4;
                class249.method1701(var5, 2000000, (byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lvd;IZIZII)Lji;")
    public static final class256 method511(class261 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1032++;
        int var8 = arg5 + (arg4 ? 65536 : 0) - (-(arg1 << 17) + -(arg3 << 19));
        long var9 = (long) arg6 * 3147483667L + ((long) var8 * 3849834839L);
        class256 var11 = (class256) class92.field1384.method945(var9, arg2);
        if (var11 != null) {
            return var11;
        }
        class119.field1778 = false;
        class256 var12 = class160.method1078(arg3, arg6, arg4, arg5, false, false, arg0, arg1, (byte) -90);
        if (var12 != null && !class119.field1778) {
            class92.field1384.method941(var12, var9, -8447);
        }
        return var12;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method512(int arg0) {
        if (arg0 > -15) {
            method513(-54, -74, 88, 110, (byte[]) null, 109, 80, 109, (class78[]) null, 43, false);
        }
        field1034 = null;
        field1037 = null;
        field1031 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII[BIII[Lql;IZ)[I")
    public static final int[] method513(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, class78[] arg8, int arg9, boolean arg10) {
        field1036++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        byte var13;
        if (arg10) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg10) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class49.method377((byte) 122, arg9, var14 & 0x7, var15 & 0x7) + arg6;
                    int var17 = class247.method1692(arg9, -3, var14 & 0x7, var15 & 0x7) + arg2;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg8[arg1].field1223[var16][var17] = class131.method904(arg8[arg1].field1223[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = (arg3 & 0xFFFFFFF8) << 3;
        class54 var19 = new class54(arg4);
        int var20 = arg5 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg9 == 1) {
            var22 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg9 == 3) {
            var21 = 1;
        }
        if (arg0 != -3) {
            method511((class261) null, 115, false, 75, true, 53, -85);
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg7 != var23 || var44 < var11 || (var11 + 8) < var44 || var45 < var12 || var12 + 8 < var45) {
                        class90.method687(0, var19, 0, -1, 0, false, -8439, -1, arg10, 0, 0, 0);
                    } else if ((var11 + 8) == var44 || (var12 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg9 == 0) {
                            var53 = var45 + arg2 - var12;
                            var52 = arg6 + var44 - var11;
                        } else if (arg9 == 1) {
                            var52 = var45 + arg6 - var12;
                            var53 = var11 + arg2 + 8 - var44;
                        } else if (arg9 == 2) {
                            var53 = var12 + arg2 + 8 - var45;
                            var52 = var11 - (var44 - arg6 - 8);
                        } else {
                            var52 = var12 - (var45 - arg6 - 8);
                            var53 = arg2 + var44 - var11;
                        }
                        class90.method687(arg1, var19, 0, var53, 0, true, -8439, var52, arg10, var18 + var45, 0, var20 + var44);
                    } else {
                        int var46 = arg6 + class49.method377((byte) 84, arg9, var44 & 0x7, var45 & 0x7);
                        int var47 = class247.method1692(arg9, arg0, var44 & 0x7, var45 & 0x7) + arg2;
                        class90.method687(arg1, var19, arg9, var47, var21, false, -8439, var46, arg10, var18 + var45, var22, var20 + var44);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg9 == 0) {
                                var51 = var48 + arg6 - var11;
                                var50 = var49 + arg2 - var12;
                            } else if (arg9 == 1) {
                                var50 = arg2 + var11 + 8 - var48;
                                var51 = arg6 + var49 - var12;
                            } else if (arg9 == 2) {
                                var50 = var12 + arg2 + 8 - var49;
                                var51 = arg6 + var11 + 8 - var48;
                            } else {
                                var51 = var12 + arg6 + 8 - var49;
                                var50 = var48 + arg2 - var11;
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class166.field2451[arg1][var51][var50] = class166.field2451[arg1][var46 + var21][var22 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (var19.field887 < var19.field848.length) {
            int var26 = var19.method407(255);
            if (var26 == 128) {
                var24 = true;
                class175.field2555[0] = var19.method423(-117);
                class175.field2555[1] = var19.method457((byte) 46);
                class175.field2555[2] = var19.method457((byte) 42);
                class175.field2555[3] = var19.method457((byte) 56);
                class175.field2555[4] = var19.method423(51);
            } else {
                if (var26 != 129) {
                    var19.field887--;
                    break;
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    byte var28 = var19.method459(false);
                    if (var28 == 0) {
                        if (var27 <= arg7) {
                            int var36 = arg6;
                            int var37 = arg6 + 7;
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (var37 >= 104) {
                                var37 = 104;
                            }
                            int var38 = arg2;
                            if (arg6 < 0) {
                                var36 = 0;
                            } else if (arg6 >= 104) {
                                var36 = 104;
                            }
                            int var39 = arg2 + 7;
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            if (arg2 < 0) {
                                var38 = 0;
                            } else if (arg2 >= 104) {
                                var38 = 104;
                            }
                            while (var37 > var36) {
                                while (var39 > var38) {
                                    class23.field383[arg1][var36][var38] = 0;
                                    var38++;
                                }
                                var36++;
                            }
                        }
                    } else if (var28 == 1) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var19.method459(false);
                                if (arg7 >= var27) {
                                    for (int var32 = var29; var32 < var29 + 4; var32++) {
                                        for (int var33 = var30; var33 < var30 + 4; var33++) {
                                            if (var11 <= var32 && (var11 + 8) > var32 && var33 >= var12 && var12 < (var12 + 8)) {
                                                int var34 = arg6 + class49.method377((byte) 99, arg9, var32 & 0x7, var33 & 0x7);
                                                int var35 = class247.method1692(arg9, -3, var32 & 0x7, var33 & 0x7) + arg2;
                                                if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                                    class23.field383[arg1][var34][var35] = var31;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!var25) {
            int var40 = arg6 + 7;
            int var41 = arg2 + 7;
            for (int var42 = arg6; var42 < var40; var42++) {
                for (int var43 = arg2; var43 < var41; var43++) {
                    class23.field383[arg1][var42][var43] = 0;
                }
            }
        }
        if (var24) {
            return class175.field2555;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILpb;IIIZILwg;IIIII)Lpb;")
    public static final class2 method514(int arg0, int arg1, class2 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class220 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = (long) ((arg1 << 24) + (arg3 + (arg5 << 16))) - (-((long) arg4 << 32) - ((long) arg9 << 48));
        field1038++;
        class2 var16 = (class2) class174.field2551.method945(var14, true);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class219 var21 = new class219(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int var22 = var21.method1490(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class119.field1774[var33] * var31 + arg0 >> 16;
                    int var35 = class119.field1776[var33] * var30 + arg10 >> 16;
                    var20[var23][var32] = var21.method1490(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg1 * var25 + arg5 * var26 >> 8);
                short var28 = (short) (((arg4 & 0x7F) * var26 + (arg9 & 0x7F) * var25 & 0x7F00) + ((arg4 & 0xFC00) * var26 + (arg9 & 0xFC00) * var25 & 0xFC0000) + ((arg4 & 0x380) * var26 + (arg9 & 0x380) * var25 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1483(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var28, var27);
                    } else {
                        var21.method1483(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var21.method1483(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var21.method1501(64, 768, -50, -10, -50);
            class174.field2551.method941(var16, var14, -8447);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = var36;
        int var38 = -var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg6) {
            if (arg7 > 1152 && arg7 < 1920) {
                var37 = var36 + 128;
            }
            if (arg7 > 640 && arg7 < 1408) {
                var40 = var36 + 128;
            }
            if (arg7 > 1664 || arg7 < 384) {
                var38 -= 128;
            }
            if (arg7 > 128 && arg7 < 896) {
                var39 -= 128;
            }
        }
        int var41 = arg2.method28();
        int var42 = arg2.method31();
        if (var39 > var41) {
            var41 = var39;
        }
        if (var37 < var42) {
            var42 = var37;
        }
        int var43 = arg2.method15();
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg2.method18();
        if (var44 > var40) {
            var44 = var40;
        }
        class152 var45 = null;
        if (arg8 != null) {
            int var46 = arg8.field3413[arg11];
            var45 = class126.method880(1023, var46 >> 16);
            arg11 = var46 & 0xFFFF;
        }
        class2 var47;
        if (var45 == null) {
            var47 = var16.method26(true, true, true);
            var47.method8((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method39((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method26(!var45.method1033(arg11, -1), !var45.method1032(arg11, 102), true);
            var47.method8((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method39((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method23(var45, arg11);
        }
        if (arg7 != 0) {
            var47.method36(arg7);
        }
        class263 var48 = (class263) var47;
        if (arg12 != class268.method1810(class260.field3986, arg0 + var41, (byte) 118, arg10 + var43) || class268.method1810(class260.field3986, arg0 + var42, (byte) 118, arg10 + var44) != arg12) {
            for (int var49 = 0; var49 < var48.field4045; var49++) {
                var48.field4046[var49] += class268.method1810(class260.field3986, var48.field4083[var49] + arg0, (byte) 118, var48.field4054[var49] + arg10) - arg12;
            }
            var48.field4067 = false;
        }
        if (arg13 <= 62) {
            field1034 = null;
        }
        return var47;
    }
}
