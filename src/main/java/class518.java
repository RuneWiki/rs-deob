import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class518 extends class261 {

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Z")
    public static boolean field7507 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field7515 = 0;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field7510;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field7513;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public int field7516;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field7517;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public int field7521;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field7523;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public int field7526;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public int field7527;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public int field7528;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public int field7529;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public int field7530;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public int field7531;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public int field7532;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public int field7533;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lwq;")
    public class116 field7525;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Let;")
    public class424 field7524;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Lbs;")
    public class487 field7522;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Lcc;")
    public class517 field7520;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[Lak;")
    public static class234[][][] field7511;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILza;)V", line = 4)
    public static final void method3074(int arg0, int arg1, int arg2, class288 arg3) {
        field7514++;
        int var4 = 6 / ((arg2 + 14) / 45);
        if (arg1 < 0 || arg0 < 0 || class39.field566 == 0 || class377.field5514 == 0) {
            return;
        }
        arg3.method324(class84.field1744, class219.field3443, class39.field566, class377.field5514);
        arg3.method371(class521.field7567, class172.field2779, class39.field566, class377.field5514);
        class124 var5 = arg3.method399();
        var5.method839(class447.field6663, class418.field6293, class524.field7614, class144.field2437, class509.field7428, class335.field5063);
        arg3.method326(var5);
        if (class531.field7727 != null) {
            int var6 = -1;
            int var7 = -1;
            int var8 = arg3.method348();
            int var9 = (arg1 - class84.field1744) * var8 / class39.field566;
            int var10 = (arg0 - class219.field3443) * var8 / class377.field5514;
            int var11 = arg3.method391();
            int var12 = (arg1 - class84.field1744) * var11 / class39.field566;
            int var13 = (arg0 - class219.field3443) * var11 / class377.field5514;
            int[] var14 = new int[] { var9, var10, var8 };
            var5.method831(var14);
            int[] var15 = new int[] { var12, var13, var11 };
            var5.method831(var15);
            float var16 = 0.0F;
            int var17 = var15[0] - var14[0];
            int var18 = var15[1] - var14[1];
            int var19 = var15[2] - var14[2];
            while (var16 < 1.0F) {
                int var20 = (int) ((float) var17 * var16 + (float) var14[0]);
                int var21 = var20 >> 7;
                int var22 = (int) ((float) var19 * var16 + (float) var14[2]);
                int var23 = var22 >> 7;
                if (var21 > 0 && var23 > 0 && class339.field5099 > var21 && class484.field7129 > var23) {
                    int var24 = class15.field266.field6084;
                    if (var24 < 3 && (class22.field333[1][var21][var23] & 0x2) != 0) {
                        var24++;
                    }
                    if ((float) class531.field7727[var24].method186(var20, var22) < (float) var18 * var16 + (float) var14[1]) {
                        var6 = (class15.field266.method2241(-7) - 1 << 6) + var20 >> 7;
                        var7 = (class15.field266.method2241(-117) - 1 << 6) + var22 >> 7;
                        break;
                    }
                }
                var16 = (float) ((double) var16 + 0.01D);
            }
            if (var6 != -1 && var7 != -1) {
                if (class233.field3597 && (class364.field5326 & 0x40) != 0) {
                    class388 var25 = class447.method2677(class341.field5130, 0, class506.field7383);
                    if (var25 == null) {
                        class320.method2056(-63);
                    } else {
                        class274.method1739(class101.field1932, 34, 49, 0L, var6, false, class220.field3455, " ->", true, -1, var7);
                    }
                } else {
                    if (class424.field6366 == class209.field3343) {
                        class274.method1739(class137.field2304.method1977(class146.field2452, 68), 16, 48, 0L, var6, false, -1, "", true, -1, var7);
                    }
                    class33.field517++;
                    class274.method1739(class7.field107, 65, 5, 0L, var6, false, class353.field5218, "", true, -1, var7);
                }
            }
        }
        class60 var26 = class146.field2446;
        for (class385 var27 = (class385) var26.method533((byte) -103); var27 != null; var27 = (class385) var26.method536(-50)) {
            if ((class230.field3569 || class15.field266.field6084 == var27.field5625) && var27.method2363(arg0, arg3, arg1, (byte) 71)) {
                if (var27.field5624 instanceof class366) {
                    class366 var28 = (class366) var27.field5624;
                    int var29 = var28.method2241(-6);
                    if ((var29 & 0x1) == 0 && (var28.field6073 & 0x7F) == 0 && (var28.field6078 & 0x7F) == 0 || (var29 & 0x1) == 1 && (var28.field6073 & 0x7F) == 64 && (var28.field6078 & 0x7F) == 64) {
                        int var30 = var28.field6073 - (var28.method2241(-49) - 1 << 6);
                        int var31 = var28.field6078 - (var28.method2241(-23) - 1 << 6);
                        for (int var32 = 0; var32 < class341.field5128; var32++) {
                            class435 var39 = (class435) class209.field3337.method1622((long) class515.field7477[var32], 88);
                            if (var39 != null) {
                                class163 var40 = var39.field6471;
                                if (class62.field1268 != var40.field7813 && var40.field7782) {
                                    int var41 = var40.field6073 - (var40.field2613.field1050 - 1 << 6);
                                    int var42 = var40.field6078 - (var40.field2613.field1050 - 1 << 6);
                                    if (var30 <= var41 && var40.field2613.field1050 <= (var28.method2241(-32) - (var41 - var30 >> 7)) && var42 >= var31 && var40.field2613.field1050 <= var28.method2241(-53) - (var42 - var31 >> 7)) {
                                        class347.method2169(class15.field266.field6084 != var27.field5625, (byte) 81, var40);
                                        var40.field7813 = class62.field1268;
                                    }
                                }
                            }
                        }
                        int var33 = class229.field3560;
                        int[] var34 = class316.field4782;
                        for (int var35 = 0; var35 < var33; var35++) {
                            class366 var36 = class73.field1444[var34[var35]];
                            if (var36 != null && class62.field1268 != var36.field7813 && var28 != var36 && var36.field7782) {
                                int var37 = var36.field6073 - (var36.method2241(-84) - 1 << 6);
                                int var38 = var36.field6078 - (var36.method2241(-77) - 1 << 6);
                                if (var30 <= var37 && var36.method2241(-95) <= (var28.method2241(-41) - (var37 - var30 >> 7)) && var38 >= var31 && var36.method2241(-39) <= var28.method2241(-108) - (var38 - var31 >> 7)) {
                                    class422.method2577(22314, class15.field266.field6084 != var27.field5625, var36);
                                    var36.field7813 = class62.field1268;
                                }
                            }
                        }
                    }
                    if (class62.field1268 == var28.field7813) {
                        continue;
                    }
                    class422.method2577(22314, class15.field266.field6084 != var27.field5625, var28);
                    var28.field7813 = class62.field1268;
                }
                if (var27.field5624 instanceof class163) {
                    class163 var43 = (class163) var27.field5624;
                    if (var43.field2613 != null) {
                        if ((var43.field2613.field1050 & 0x1) == 0 && (var43.field6073 & 0x7F) == 0 && (var43.field6078 & 0x7F) == 0 || (var43.field2613.field1050 & 0x1) == 1 && (var43.field6073 & 0x7F) == 64 && (var43.field6078 & 0x7F) == 64) {
                            int var44 = var43.field6073 - (var43.field2613.field1050 - 1 << 6);
                            int var45 = var43.field6078 - (var43.field2613.field1050 - 1 << 6);
                            for (int var46 = 0; var46 < class341.field5128; var46++) {
                                class435 var53 = (class435) class209.field3337.method1622((long) class515.field7477[var46], -102);
                                if (var53 != null) {
                                    class163 var54 = var53.field6471;
                                    if (class62.field1268 != var54.field7813 && var43 != var54 && var54.field7782) {
                                        int var55 = var54.field6073 - (var54.field2613.field1050 - 1 << 6);
                                        int var56 = var54.field6078 - (var54.field2613.field1050 - 1 << 6);
                                        if (var44 <= var55 && var54.field2613.field1050 <= (var43.field2613.field1050 - (var55 - var44 >> 7)) && var56 >= var45 && var54.field2613.field1050 <= (var43.field2613.field1050 - (var56 - var45 >> 7))) {
                                            class347.method2169(class15.field266.field6084 != var27.field5625, (byte) 102, var54);
                                            var54.field7813 = class62.field1268;
                                        }
                                    }
                                }
                            }
                            int var47 = class229.field3560;
                            int[] var48 = class316.field4782;
                            for (int var49 = 0; var49 < var47; var49++) {
                                class366 var50 = class73.field1444[var48[var49]];
                                if (var50 != null && class62.field1268 != var50.field7813 && var50.field7782) {
                                    int var51 = var50.field6073 - (var50.method2241(-103) - 1 << 6);
                                    int var52 = var50.field6078 - (var50.method2241(-66) - 1 << 6);
                                    if (var51 >= var44 && var50.method2241(-75) <= (var43.field2613.field1050 - (var51 - var44 >> 7)) && var45 <= var52 && var50.method2241(-62) <= var43.field2613.field1050 - (var52 - var45 >> 7)) {
                                        class422.method2577(22314, class15.field266.field6084 != var27.field5625, var50);
                                        var50.field7813 = class62.field1268;
                                    }
                                }
                            }
                        }
                        if (class62.field1268 == var43.field7813) {
                            continue;
                        }
                        class347.method2169(class15.field266.field6084 != var27.field5625, (byte) 40, var43);
                        var43.field7813 = class62.field1268;
                    }
                }
                if (var27.field5624 instanceof class514) {
                    int var57 = var27.field5621 + class496.field7292;
                    int var58 = var27.field5623 + class212.field3378;
                    class354 var59 = (class354) class169.field2757.method1622((long) (var57 | var58 << 14 | var27.field5625 << 28), -106);
                    if (var59 != null) {
                        for (class506 var60 = (class506) var59.field5220.method1884((byte) -30); var60 != null; var60 = (class506) var59.field5220.method1896(76)) {
                            class12 var61 = class135.field2271.method1636(var60.field7376, -113);
                            if (!class233.field3597) {
                                if (class15.field266.field6084 == var27.field5625) {
                                    String[] var62 = var61.field164;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            if (var63 == 0) {
                                                var64 = 57;
                                            }
                                            int var65 = class10.field139;
                                            if (var63 == 1) {
                                                var64 = 10;
                                            }
                                            if (var63 == 2) {
                                                var64 = 16;
                                            }
                                            if (var63 == 3) {
                                                var64 = 59;
                                            }
                                            if (var61.field160 == var63) {
                                                var65 = var61.field234;
                                            }
                                            if (var63 == 4) {
                                                var64 = 15;
                                            }
                                            if (var61.field221 == var63) {
                                                var65 = var61.field155;
                                            }
                                            class41.field571++;
                                            class274.method1739(var62[var63], 56, var64, (long) var60.field7376, var27.field5621, false, var65, "<col=ff9040>" + var61.field192, true, -1, var27.field5623);
                                        }
                                    }
                                }
                                class261.field3973++;
                                class274.method1739(class44.field697.method1977(class146.field2452, 102), 109, 1008, (long) var60.field7376, var27.field5621, class15.field266.field6084 != var27.field5625, class18.field297, "<col=ff9040>" + var61.field192, true, -1, var27.field5623);
                            } else if (class15.field266.field6084 == var27.field5625) {
                                class247 var66 = class352.field5194 == -1 ? null : class453.field6727.method460(class352.field5194, -18297);
                                if ((class364.field5326 & 0x1) != 0 && (var66 == null || var61.method78(true, var66.field3809, class352.field5194) != var66.field3809)) {
                                    class274.method1739(class101.field1932, 53, 47, (long) var60.field7376, var27.field5621, false, class220.field3455, class373.field5465 + " -> <col=ff9040>" + var61.field192, true, -1, var27.field5623);
                                    class128.field2187++;
                                }
                            }
                        }
                    }
                }
                if (var27.field5624 instanceof class425) {
                    class425 var67 = (class425) var27.field5624;
                    class306 var68 = class123.field2142.method1530((byte) -42, var67.method224(-10848));
                    if (var68.field4593 != null) {
                        var68 = var68.method1951(class402.field6080, 0);
                    }
                    if (var68 != null) {
                        if (!class233.field3597) {
                            if (class15.field266.field6084 == var27.field5625) {
                                String[] var69 = var68.field4605;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            int var72 = class10.field139;
                                            if (var70 == 0) {
                                                var71 = 60;
                                            }
                                            if (var70 == 1) {
                                                var71 = 13;
                                            }
                                            if (var70 == 2) {
                                                var71 = 17;
                                            }
                                            if (var70 == 3) {
                                                var71 = 4;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1004;
                                            }
                                            if (var68.field4592 == var70) {
                                                var72 = var68.field4567;
                                            }
                                            if (var68.field4613 == var70) {
                                                var72 = var68.field4643;
                                            }
                                            class274.method1739(var69[var70], 45, var71, class216.method1448(var27.field5621, var27.field5623, -27140, var67), var27.field5621, false, var72, "<col=00ffff>" + var68.field4635, true, -1, var27.field5623);
                                            class270.field4096++;
                                        }
                                    }
                                }
                            }
                            class183.field2955++;
                            class274.method1739(class44.field697.method1977(class146.field2452, -47), 69, 1003, (long) var68.field4626, var27.field5621, class15.field266.field6084 != var27.field5625, class18.field297, "<col=00ffff>" + var68.field4635, true, -1, var27.field5623);
                        } else if (class15.field266.field6084 == var27.field5625) {
                            class247 var73 = class352.field5194 == -1 ? null : class453.field6727.method460(class352.field5194, -18297);
                            if ((class364.field5326 & 0x4) != 0 && (var73 == null || var68.method1954(var73.field3809, -3687, class352.field5194) != var73.field3809)) {
                                class287.field4346++;
                                class274.method1739(class101.field1932, 89, 58, class216.method1448(var27.field5621, var27.field5623, -27140, var67), var27.field5621, false, class220.field3455, class373.field5465 + " -> <col=00ffff>" + var68.field4635, true, -1, var27.field5623);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 484)
    public final void method3075(byte arg0) {
        this.field7520 = null;
        field7509++;
        if (arg0 == -35) {
            this.field7524 = null;
            this.field7525 = null;
            this.field7522 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILha;)V", line = 508)
    public static final void method3076(int arg0, class43 arg1) {
        field7519++;
        int var2 = 0;
        arg1.method268(-29708);
        for (int var3 = 0; var3 < class229.field3560; var3++) {
            int var15 = class316.field4782[var3];
            if ((class320.field4891[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4891[var15] = (byte) class418.method2558(class320.field4891[var15], 2);
                } else {
                    int var16 = arg1.method261(1, arg0);
                    if (var16 == 0) {
                        var2 = class173.method1196(98, arg1);
                        class320.field4891[var15] = (byte) class418.method2558(class320.field4891[var15], 2);
                    } else {
                        class120.method973(-14490, arg1, var15);
                    }
                }
            }
        }
        arg1.method264(-122);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method268(-29708);
        for (int var4 = 0; var4 < class229.field3560; var4++) {
            int var13 = class316.field4782[var4];
            if ((class320.field4891[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4891[var13] = (byte) class418.method2558(class320.field4891[var13], 2);
                } else {
                    int var14 = arg1.method261(1, arg0);
                    if (var14 == 0) {
                        var2 = class173.method1196(arg0 ^ 0x6B, arg1);
                        class320.field4891[var13] = (byte) class418.method2558(class320.field4891[var13], 2);
                    } else {
                        class120.method973(arg0 ^ 0xFFFFC766, arg1, var13);
                    }
                }
            }
        }
        arg1.method264(12);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method268(-29708);
        for (int var5 = 0; var5 < class458.field6799; var5++) {
            int var11 = class514.field7471[var5];
            if ((class320.field4891[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4891[var11] = (byte) class418.method2558(class320.field4891[var11], 2);
                } else {
                    int var12 = arg1.method261(1, arg0);
                    if (var12 == 0) {
                        var2 = class173.method1196(123, arg1);
                        class320.field4891[var11] = (byte) class418.method2558(class320.field4891[var11], 2);
                    } else if (class352.method2182(arg1, var11, arg0 ^ 0xFFFFFF85)) {
                        class320.field4891[var11] = (byte) class418.method2558(class320.field4891[var11], 2);
                    }
                }
            }
        }
        arg1.method264(58);
        if (arg0 != var2) {
            throw new RuntimeException("nsn2");
        }
        arg1.method268(arg0 - 29708);
        for (int var6 = 0; var6 < class458.field6799; var6++) {
            int var9 = class514.field7471[var6];
            if ((class320.field4891[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4891[var9] = (byte) class418.method2558(class320.field4891[var9], 2);
                } else {
                    int var10 = arg1.method261(1, 0);
                    if (var10 == 0) {
                        var2 = class173.method1196(68, arg1);
                        class320.field4891[var9] = (byte) class418.method2558(class320.field4891[var9], 2);
                    } else if (class352.method2182(arg1, var9, -59)) {
                        class320.field4891[var9] = (byte) class418.method2558(class320.field4891[var9], 2);
                    }
                }
            }
        }
        arg1.method264(arg0 ^ 0xFFFFFF87);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class229.field3560 = 0;
        class458.field6799 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class320.field4891[var7] = (byte) (class320.field4891[var7] >> 1);
            class366 var8 = class73.field1444[var7];
            if (var8 == null) {
                class514.field7471[class458.field6799++] = var7;
            } else {
                class316.field4782[class229.field3560++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 717)
    public static void method3077(boolean arg0) {
        field7511 = null;
        if (!arg0) {
            field7511 = null;
        }
    }
}
