import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class296 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    public static int[] field4670 = new int[2];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4675 = 0;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4676 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Z")
    public static boolean field4678 = false;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "J")
    public static long field4680;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lji;")
    public static class145 field4684;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lfc;")
    public static class149 field4673;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lbc;")
    public static class282 field4674;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[I")
    public static int[] field4677;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1970(byte arg0) {
        if (arg0 < 67) {
            method1970((byte) 5);
        }
        field4674 = null;
        field4677 = null;
        field4670 = null;
        field4684 = null;
        field4673 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLbc;I)Lr;")
    public static final class238 method1971(byte arg0, class282 arg1, int arg2) {
        field4681++;
        byte[] var3 = arg1.method1863((byte) 86, arg2);
        if (var3 == null) {
            return null;
        } else if (arg0 < 9) {
            return null;
        } else {
            return new class238(var3);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIB[Lhl;[BZIII)[I")
    public static final int[] method1972(int arg0, int arg1, int arg2, int arg3, byte arg4, class137[] arg5, byte[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field4682++;
        int var11 = (arg0 & 0x7) * 8;
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        if (!arg7) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class52.method315(var14 & 0x7, var13 & 0x7, arg2, 12439) + arg3;
                    int var16 = arg9 + class206.method1322(var13 & 0x7, arg2, 2, var14 & 0x7);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg5[arg8].field1988[var15][var16] = class5.method26(arg5[arg8].field1988[var15][var16], -2097153);
                    }
                }
            }
        }
        class216 var17 = new class216(arg6);
        int var18 = (arg10 & 0x7) * 8;
        int var19 = arg10 & 0x1FFFFFF8 << 3;
        int var20 = arg0 & 0x1FFFFFF8 << 3;
        int var21 = 41 % ((-arg4 - 17) / 46);
        byte var22 = 0;
        byte var23 = 0;
        if (arg2 == 1) {
            var22 = 1;
        } else if (arg2 == 2) {
            var23 = 1;
            var22 = 1;
        } else if (arg2 == 3) {
            var23 = 1;
        }
        for (int var24 = 0; var24 < var12; var24++) {
            for (int var45 = 0; var45 < 64; var45++) {
                for (int var46 = 0; var46 < 64; var46++) {
                    if (arg1 != var24 || var18 > var45 || var45 > var18 + 8 || var11 > var46 || var46 > (var11 + 8)) {
                        class130.method856(-1, arg7, 0, -1, false, 0, var17, 0, (byte) 107, 0, 0, 0);
                    } else if (var18 + 8 == var45 || var11 + 8 == var46) {
                        int var53;
                        int var54;
                        if (arg2 == 0) {
                            var53 = arg3 + var45 - var18;
                            var54 = var46 + arg9 - var11;
                        } else if (arg2 == 1) {
                            var53 = var46 - (var11 - arg3);
                            var54 = arg9 + var18 + 8 - var45;
                        } else if (arg2 == 2) {
                            var54 = var11 + arg9 + 8 - var46;
                            var53 = arg3 + 8 - (-var18 + var45);
                        } else {
                            var54 = arg9 + var45 - var18;
                            var53 = -var46 - (-var11 - (arg3 + 8));
                        }
                        class130.method856(var53, arg7, 0, var54, true, var19 + var45, var17, arg8, (byte) 119, var20 + var46, 0, 0);
                    } else {
                        int var47 = arg3 + class52.method315(var46 & 0x7, var45 & 0x7, arg2, 12439);
                        int var48 = class206.method1322(var45 & 0x7, arg2, 2, var46 & 0x7) + arg9;
                        class130.method856(var47, arg7, arg2, var48, false, var19 + var45, var17, arg8, (byte) 115, var20 + var46, var22, var23);
                        if (var45 == 63 || var46 == 63) {
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50 = var46 == 63 ? 64 : var46;
                            int var51;
                            int var52;
                            if (arg2 == 0) {
                                var51 = arg3 + var49 - var18;
                                var52 = arg9 + var50 - var11;
                            } else if (arg2 == 1) {
                                var52 = var18 + arg9 + 8 - var49;
                                var51 = var50 + arg3 - var11;
                            } else if (arg2 == 2) {
                                var52 = arg9 + var11 + 8 - var50;
                                var51 = var18 + arg3 + 8 - var49;
                            } else {
                                var52 = arg9 + var49 - var18;
                                var51 = var11 + arg3 + 8 - var50;
                            }
                            if (var51 >= 0 && var51 < 104 && var52 >= 0 && var52 < 104) {
                                class290.field4536[arg8][var51][var52] = class290.field4536[arg8][var23 + var47][var22 + var48];
                            }
                        }
                    }
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        while (var17.field3030.length > var17.field3021) {
            int var27 = var17.method1407(103);
            if (var27 == 128) {
                class287.field4478[0] = var17.method1380(true);
                var26 = true;
                class287.field4478[1] = var17.method1357((byte) 50);
                class287.field4478[2] = var17.method1357((byte) 50);
                class287.field4478[3] = var17.method1357((byte) 50);
                class287.field4478[4] = var17.method1380(true);
            } else {
                if (var27 != 129) {
                    var17.field3021--;
                    break;
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    byte var33 = var17.method1355(true);
                    if (var33 == 0) {
                        if (var32 <= arg1) {
                            int var34 = arg3;
                            int var35 = arg3 + 7;
                            if (arg3 < 0) {
                                var34 = 0;
                            } else if (arg3 >= 104) {
                                var34 = 104;
                            }
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (var35 >= 104) {
                                var35 = 104;
                            }
                            int var36 = arg9;
                            int var37 = arg9 + 7;
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (var37 >= 104) {
                                var37 = 104;
                            }
                            if (arg9 < 0) {
                                var36 = 0;
                            } else if (arg9 >= 104) {
                                var36 = 104;
                            }
                            while (var35 > var34) {
                                while (var37 > var36) {
                                    class214.field2986[arg8][var34][var36] = 0;
                                    var36++;
                                }
                                var34++;
                            }
                        }
                    } else if (var33 == 1) {
                        for (int var38 = 0; var38 < 64; var38 += 4) {
                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                byte var40 = var17.method1355(true);
                                if (arg1 >= var32) {
                                    for (int var41 = var38; var41 < (var38 + 4); var41++) {
                                        for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                            if (var41 >= var18 && var41 < var18 + 8 && var11 <= var42 && var11 < (var11 + 8)) {
                                                int var43 = class52.method315(var42 & 0x7, var41 & 0x7, arg2, 12439) + arg3;
                                                int var44 = class206.method1322(var41 & 0x7, arg2, 2, var42 & 0x7) + arg9;
                                                if (var43 >= 0 && var43 < 104 && var44 >= 0 && var44 < 104) {
                                                    class214.field2986[arg8][var43][var44] = var40;
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
            int var28 = arg3 + 7;
            int var29 = arg9 + 7;
            for (int var30 = arg3; var30 < var28; var30++) {
                for (int var31 = arg9; var31 < var29; var31++) {
                    class214.field2986[arg8][var30][var31] = 0;
                }
            }
        }
        if (var26) {
            return class287.field4478;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([[[Lab;IIZII)Z")
    public static final boolean method1973(class133[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4683++;
        byte var6 = arg3 ? 1 : (byte) (class241.field3505 & 0xFF);
        if (class197.field2806[class199.field2833][arg2][arg1] == var6) {
            return false;
        } else if ((class241.field3507[class199.field2833][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class152.field2212[var7] = arg2;
            int var31 = var7 + 1;
            class204.field2908[var7] = arg1;
            class197.field2806[class199.field2833][arg2][arg1] = var6;
            if (arg4 > -87) {
                method1971((byte) -96, (class282) null, 17);
            }
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class152.field2212[var8] & 0xFFFF;
                int var10 = (class152.field2212[var8] & 0xFFA780) >> 16;
                int var11 = class204.field2908[var8] & 0xFFFF;
                int var12 = class152.field2212[var8] >> 24 & 0xFF;
                int var13 = class204.field2908[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class241.field3507[class199.field2833][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                label229: for (int var16 = class199.field2833 + 1; var16 <= 3; var16++) {
                    if ((class241.field3507[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var11] != null) {
                            if (arg0[var16][var9][var11].field1927 != null) {
                                int var19 = class156.method1039(var10, (byte) -116);
                                if (arg0[var16][var9][var11].field1927.field1664 == var19 || arg0[var16][var9][var11].field1927.field1677 == var19) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var20 = class156.method1039(var12, (byte) 38);
                                    if (arg0[var16][var9][var11].field1927.field1664 == var20 || arg0[var16][var9][var11].field1927.field1677 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class156.method1039(var13, (byte) -5);
                                    if (arg0[var16][var9][var11].field1927.field1664 == var21 || arg0[var16][var9][var11].field1927.field1677 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var11].field1930 != null) {
                                for (int var22 = 0; var22 < arg0[var16][var9][var11].field1934; var22++) {
                                    int var23 = (int) (arg0[var16][var9][var11].field1930[var22].field3539 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg0[var16][var9][var11].field1930[var22].field3539 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var12 != 0 && var12 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class133 var26 = arg0[var16][var9][var11];
                        if (var26 != null && var26.field1934 > 0) {
                            for (int var27 = 0; var27 < var26.field1934; var27++) {
                                class243 var28 = var26.field1930[var27];
                                if (var28.field3540 != var28.field3533 || var28.field3532 != var28.field3527) {
                                    for (int var29 = var28.field3540; var29 <= var28.field3533; var29++) {
                                        for (int var30 = var28.field3527; var30 <= var28.field3532; var30++) {
                                            class197.field2806[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class197.field2806[var16][var9][var11] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    if (class290.field4536[class199.field2833 + 1][var9][var11] > class21.field258[arg5]) {
                        class21.field258[arg5] = class290.field4536[class199.field2833 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    if (class279.field4239[arg5] > var17) {
                        class279.field4239[arg5] = var17;
                    } else if (class288.field4481[arg5] < var17) {
                        class288.field4481[arg5] = var17;
                    }
                    int var18 = var11 << 7;
                    if (field4670[arg5] > var18) {
                        field4670[arg5] = var18;
                    } else if (class238.field3428[arg5] < var18) {
                        class238.field3428[arg5] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class197.field2806[class199.field2833][var9 - 1][var11] != var6) {
                        class152.field2212[var31] = class220.method1432(class220.method1432(1179648, var9 - 1), -754974720);
                        class204.field2908[var31] = class220.method1432(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class197.field2806[class199.field2833][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class197.field2806[class199.field2833][var9 - 1][var11] != var6 && (class241.field3507[class199.field2833][var9][var11] & 0x4) == 0 && (class241.field3507[class199.field2833][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class152.field2212[var31] = class220.method1432(1375731712, class220.method1432(1179648, var9 - 1));
                            class204.field2908[var31] = class220.method1432(var11, 1245184);
                            class197.field2806[class199.field2833][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class197.field2806[class199.field2833][var9][var11] != var6) {
                            class152.field2212[var31] = class220.method1432(318767104, class220.method1432(5373952, var9));
                            class204.field2908[var31] = class220.method1432(5439488, var11);
                            class197.field2806[class199.field2833][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class197.field2806[class199.field2833][var9 + 1][var11] != var6 && (class241.field3507[class199.field2833][var9][var11] & 0x4) == 0 && (class241.field3507[class199.field2833][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class152.field2212[var31] = class220.method1432(class220.method1432(5373952, var9 + 1), -1845493760);
                            class204.field2908[var31] = class220.method1432(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class197.field2806[class199.field2833][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class197.field2806[class199.field2833][var9 + 1][var11] != var6) {
                        class152.field2212[var31] = class220.method1432(class220.method1432(9568256, var9 + 1), 1392508928);
                        class204.field2908[var31] = class220.method1432(9633792, var11);
                        class197.field2806[class199.field2833][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class197.field2806[class199.field2833][var9 - 1][var11] != var6 && (class241.field3507[class199.field2833][var9][var11] & 0x4) == 0 && (class241.field3507[class199.field2833][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class152.field2212[var31] = class220.method1432(301989888, class220.method1432(13762560, var9 - 1));
                            class204.field2908[var31] = class220.method1432(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class197.field2806[class199.field2833][var9 - 1][var11] = var6;
                        }
                        if (class197.field2806[class199.field2833][var9][var11] != var6) {
                            class152.field2212[var31] = class220.method1432(class220.method1432(var9, 13762560), -1828716544);
                            class204.field2908[var31] = class220.method1432(var11, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class197.field2806[class199.field2833][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class197.field2806[class199.field2833][var9 + 1][var11] != var6 && (class241.field3507[class199.field2833][var9][var11] & 0x4) == 0 && (class241.field3507[class199.field2833][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class152.field2212[var31] = class220.method1432(class220.method1432(var9 + 1, 9568256), -771751936);
                            class204.field2908[var31] = class220.method1432(9633792, var11);
                            class197.field2806[class199.field2833][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class21.field258[arg5] != -1000000) {
                class21.field258[arg5] += 10;
                class279.field4239[arg5] -= 50;
                class288.field4481[arg5] += 50;
                class238.field3428[arg5] += 50;
                field4670[arg5] -= 50;
            }
            return true;
        }
    }
}
