import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class25 extends class224 {

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Luf;")
    public static class168 field301 = class148.method1019(-1720, " GMT");

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "Z")
    public static boolean field306 = false;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static volatile int field308 = -1;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "[Lfj;")
    public static class283[] field305 = new class283[256];

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "[I")
    public static int[] field307 = new int[32];

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "Llh;")
    public static class55 field303;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "Z")
    public static boolean field299;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "[Lsk;")
    public static class193[] field300;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[[I", line = 6)
    public final int[][] method17(int arg0, byte arg1) {
        field302++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field3631.field3756) {
            int[] var4 = this.method1537(arg0, 2, 0);
            int[][] var5 = this.method1535(0, arg1 + 80, arg0);
            int[][] var6 = this.method1535(1, 3, arg0);
            int[] var7 = var3[2];
            int[] var8 = var5[0];
            int[] var9 = var5[2];
            int[] var10 = var3[0];
            int[] var11 = var6[1];
            int[] var12 = var6[0];
            int[] var13 = var3[1];
            int[] var14 = var6[2];
            int[] var15 = var5[1];
            for (int var16 = 0; var16 < class187.field2961; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var8[var16];
                    var13[var16] = var15[var16];
                    var7[var16] = var9[var16];
                } else if (var17 == 0) {
                    var10[var16] = var12[var16];
                    var13[var16] = var11[var16];
                    var7[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var8[var16] * var17 + var12[var16] * var18 >> 12;
                    var13[var16] = var11[var16] * var18 + var15[var16] * var17 >> 12;
                    var7[var16] = var9[var16] * var17 + (var14[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z", line = 94)
    public static final boolean method126(int arg0, int arg1, int arg2, int arg3) {
        if (class18.method84(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class174.method1258(var4 + 1, class227.field3686[arg0][arg1][arg2] + arg3, var5 + 1) && class174.method1258(var4 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class174.method1258(var4 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class174.method1258(var4 + 1, class227.field3686[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)Z", line = 113)
    public static final boolean method127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class82.field1186 * arg0 + class127.field1956 * arg3 >> 16;
        int var6 = class82.field1186 * arg3 - class127.field1956 * arg0 >> 16;
        int var7 = class293.field4951 * arg1 + class217.field3545 * var6 >> 16;
        int var8 = class217.field3545 * arg1 - class293.field4951 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class293.field4951 * arg2 + class217.field3545 * var6 >> 16;
        int var12 = class217.field3545 * arg2 - class293.field4951 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class2.field11 && var13 < class2.field11) {
            return false;
        } else if (var9 > class133.field2086 && var13 > class133.field2086) {
            return false;
        } else if (var10 < class281.field4720 && var14 < class281.field4720) {
            return false;
        } else {
            return var10 <= class287.field4838 || var14 <= class287.field4838;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 159)
    public class25() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(Z)V", line = 165)
    public static void method128(boolean arg0) {
        field307 = null;
        field300 = null;
        if (!arg0) {
            field307 = (int[]) null;
        }
        field305 = null;
        field301 = null;
        field303 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLj;)V", line = 184)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field313++;
        if (arg0 == 0) {
            this.field3610 = arg2.method1042((byte) 127) == 1;
        }
        if (arg1) {
            method130(-23);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILfj;Lfh;I)V", line = 199)
    public static final void method129(int arg0, class283 arg1, class110 arg2, int arg3) {
        field304++;
        class138 var4 = new class138();
        var4.field292 = (long) arg0;
        var4.field2126 = 1;
        var4.field2129 = arg2;
        var4.field2127 = arg1;
        class76 var5 = class40.field500;
        synchronized (class40.field500) {
            class40.field500.method451(-91453648, var4);
        }
        class175.method1262((byte) 10);
        if (arg3 < 31) {
            method126(-9, 41, -127, -37);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[I", line = 230)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -54 / ((20 - arg0) / 51);
        field311++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            int[] var6 = this.method1537(arg1, 1, 0);
            int[] var7 = this.method1537(arg1, 2, 0);
            for (int var8 = 0; var8 < class187.field2961; var8++) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (var9 == 0) {
                    var4[var8] = var6[var8];
                } else {
                    var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 286)
    public static final void method130(int arg0) {
        field309++;
        if (class102.field1587 == 227) {
            int var1 = class166.field2671.method1093((byte) 52);
            int var2 = (var1 >> 4 & 0x7) + class201.field3312;
            int var3 = (var1 & 0x7) + class94.field1484;
            int var4 = class166.field2671.method1042((byte) -69);
            int var5 = var4 & 0x3;
            int var6 = var4 >> 2;
            int var7 = class174.field2825[var6];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class77.method457(0, var5, var3, var6, var2, -1, class79.field1127, -1, -1, var7);
            }
        } else if (class102.field1587 == 16) {
            int var98 = class166.field2671.method1042((byte) 94);
            int var99 = (var98 >> 4 & 0x7) + class201.field3312;
            int var100 = (var98 & 0x7) + class94.field1484;
            int var101 = class166.field2671.method1069(arg0 ^ 0x38);
            int var102 = class166.field2671.method1042((byte) -55);
            int var103 = class166.field2671.method1069(119);
            if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                int var104 = var100 * 128 + 64;
                int var105 = var99 * 128 + 64;
                class155 var106 = new class155(var101, class79.field1127, var105, var104, class62.method349(arg0 + 12, class79.field1127, var104, var105) - var102, var103, class203.field3335);
                class1.field2.method451(-91453648, new class51(var106));
            }
        } else if (class102.field1587 == 94) {
            int var92 = class166.field2671.method1042((byte) 116);
            int var93 = ((var92 & 0x7B) >> 4) + class201.field3312;
            int var94 = (var92 & 0x7) + class94.field1484;
            int var95 = class166.field2671.method1069(125);
            if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                class76 var96 = class71.field952[class79.field1127][var93][var94];
                if (var96 != null) {
                    for (class18 var97 = (class18) var96.method442(arg0 ^ 0xFF79); var97 != null; var97 = (class18) var96.method440(3)) {
                        if ((var95 & 0x7FFF) == var97.field202.field555) {
                            var97.method124((byte) 97);
                            break;
                        }
                    }
                    if (var96.method442(65293) == null) {
                        class71.field952[class79.field1127][var93][var94] = null;
                    }
                    class204.method1427(var94, -25477, var93);
                }
            }
        } else if (class102.field1587 == 110) {
            int var83 = class166.field2671.method1042((byte) 120);
            int var84 = class94.field1484 + (var83 & 0x7);
            int var85 = (var83 >> 4 & 0x7) + class201.field3312;
            int var86 = class166.field2671.method1069(arg0 + 2);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class166.field2671.method1042((byte) -100);
            int var88 = class166.field2671.method1042((byte) -69);
            int var89 = var87 & 0x7;
            int var90 = (var87 & 0xF3) >> 4;
            if (var85 >= 0 && var84 >= 0 && var85 < 104 && var84 < 104) {
                int var91 = var90 + 1;
                if ((var85 - var91) <= class266.field4489.field3020[0] && (var85 + var91) >= class266.field4489.field3020[0] && class266.field4489.field3033[0] >= var84 - var91 && (var84 + var91) >= class266.field4489.field3033[0] && class72.field968 != 0 && var89 > 0 && class36.field414 < 50 && var86 != -1) {
                    class271.field4554[class36.field414] = var86;
                    class295.field4996[class36.field414] = var89;
                    class242.field4067[class36.field414] = var88;
                    class135.field2114[class36.field414] = null;
                    class221.field3588[class36.field414] = (var85 << 16) + ((var84 << 8) + var90);
                    class36.field414++;
                }
            }
        } else if (class102.field1587 == 214) {
            int var74 = class166.field2671.method1042((byte) -41);
            int var75 = ((var74 & 0x79) >> 4) + class201.field3312;
            int var76 = (var74 & 0x7) + class94.field1484;
            int var77 = class166.field2671.method1069(89);
            int var78 = class166.field2671.method1069(arg0 - 6);
            int var79 = class166.field2671.method1069(126);
            if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                class76 var80 = class71.field952[class79.field1127][var75][var76];
                if (var80 != null) {
                    for (class18 var81 = (class18) var80.method442(65293); var81 != null; var81 = (class18) var80.method440(3)) {
                        class45 var82 = var81.field202;
                        if ((var77 & 0x7FFF) == var82.field555 && var82.field557 == var78) {
                            var82.field557 = var79;
                            break;
                        }
                    }
                    class204.method1427(var76, -25477, var75);
                }
            }
        } else if (class102.field1587 == 145) {
            int var8 = class166.field2671.method1042((byte) -72);
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = class174.field2825[var9];
            int var12 = class166.field2671.method1051(-128);
            int var13 = class166.field2671.method1093((byte) 59);
            int var14 = ((var13 & 0x70) >> 4) + class201.field3312;
            int var15 = (var13 & 0x7) + class94.field1484;
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class77.method457(0, var10, var15, var9, var14, arg0 ^ 0xFFFFFF8B, class79.field1127, var12, -1, var11);
            }
        } else if (class102.field1587 == 43) {
            int var66 = class166.field2671.method1069(arg0 ^ 0x3A);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = class166.field2671.method1042((byte) -55);
            int var68 = var67 >> 2;
            int var69 = var67 & 0x3;
            int var70 = class174.field2825[var68];
            int var71 = class166.field2671.method1094((byte) 123);
            int var72 = ((var71 & 0x74) >> 4) + class201.field3312;
            int var73 = class94.field1484 + (var71 & 0x7);
            class248.method1706(var72, var69, class79.field1127, var73, var66, var68, (byte) 117, var70);
        } else {
            if (class102.field1587 == 97) {
                class166.field2671.method1069(46);
                class166.field2671.method1064((byte) 19);
                class166.field2671.method1059((byte) 91);
                class166.field2671.method1041(64);
                class166.field2671.method1069(124);
                class166.field2671.method1093((byte) 69);
                int var16 = class166.field2671.method1051(-128);
                class166.field2671.method1078(-6338);
                class166.field2671.method1059((byte) 77);
                class166.field2671.method1078(-6338);
                if (class65.field873 != var16) {
                }
            }
            if (class102.field1587 == 184) {
                int var17 = class166.field2671.method1042((byte) 86);
                int var18 = ((var17 & 0x73) >> 4) + class201.field3312;
                int var19 = (var17 & 0x7) + class94.field1484;
                int var20 = class166.field2671.method1078(arg0 - 6454) + var18;
                int var21 = class166.field2671.method1078(-6338) + var19;
                int var22 = class166.field2671.method1081((byte) 115);
                int var23 = class166.field2671.method1069(90);
                int var24 = class166.field2671.method1042((byte) 85) * 4;
                int var25 = class166.field2671.method1042((byte) 109) * 4;
                int var26 = class166.field2671.method1069(56);
                int var27 = class166.field2671.method1069(77);
                int var28 = class166.field2671.method1042((byte) 101);
                int var29 = class166.field2671.method1042((byte) -65);
                if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && var23 != 65535) {
                    int var30 = var20 * 128 + 64;
                    int var31 = var18 * 128 + 64;
                    int var32 = var21 * 128 + 64;
                    int var33 = var19 * 128 + 64;
                    class282 var34 = new class282(var23, class79.field1127, var31, var33, class62.method349(arg0 + 12, class79.field1127, var33, var31) - var24, class203.field3335 + var26, var27 + class203.field3335, var28, var29, var22, var25);
                    var34.method1948(class62.method349(128, class79.field1127, var32, var30) - var25, false, class203.field3335 + var26, var30, var32);
                    class53.field655.method451(arg0 - 91453764, new class227(var34));
                }
            } else {
                if (arg0 != 116) {
                    field310 = -60;
                }
                if (class102.field1587 == 76) {
                    int var59 = class166.field2671.method1042((byte) 95);
                    int var60 = (var59 & 0x7) + class94.field1484;
                    int var61 = (var59 >> 4 & 0x7) + class201.field3312;
                    int var62 = class166.field2671.method1051(arg0 ^ 0xFFFFFFF4);
                    int var63 = class166.field2671.method1051(-128);
                    int var64 = class166.field2671.method1069(84);
                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104 && class65.field873 != var63) {
                        class45 var65 = new class45();
                        var65.field557 = var64;
                        var65.field555 = var62;
                        if (class71.field952[class79.field1127][var61][var60] == null) {
                            class71.field952[class79.field1127][var61][var60] = new class76();
                        }
                        class71.field952[class79.field1127][var61][var60].method451(-91453648, new class18(var65));
                        class204.method1427(var60, arg0 ^ 0xFFFF9C0F, var61);
                    }
                } else if (class102.field1587 == 68) {
                    int var35 = class166.field2671.method1041(-65);
                    int var36 = class166.field2671.method1069(40);
                    int var37 = class166.field2671.method1093((byte) 111);
                    int var38 = class201.field3312 + ((var37 & 0x78) >> 4);
                    int var39 = (var37 & 0x7) + class94.field1484;
                    if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                        class45 var40 = new class45();
                        var40.field555 = var36;
                        var40.field557 = var35;
                        if (class71.field952[class79.field1127][var38][var39] == null) {
                            class71.field952[class79.field1127][var38][var39] = new class76();
                        }
                        class71.field952[class79.field1127][var38][var39].method451(-91453648, new class18(var40));
                        class204.method1427(var39, -25477, var38);
                    }
                } else if (class102.field1587 == 83) {
                    int var41 = class166.field2671.method1042((byte) 94);
                    int var42 = (var41 & 0xF) + class94.field1484 * 2;
                    int var43 = ((var41 & 0xFF) >> 4) + class201.field3312 * 2;
                    int var44 = class166.field2671.method1078(arg0 ^ 0xFFFFE74A) + var43;
                    int var45 = var42 + class166.field2671.method1078(-6338);
                    int var46 = class166.field2671.method1081((byte) 12);
                    int var47 = class166.field2671.method1069(118);
                    int var48 = class166.field2671.method1042((byte) -116) * 4;
                    int var49 = class166.field2671.method1042((byte) 108) * 4;
                    int var50 = class166.field2671.method1069(82);
                    int var51 = class166.field2671.method1069(89);
                    int var52 = class166.field2671.method1042((byte) 108);
                    int var53 = class166.field2671.method1042((byte) -27);
                    if (var43 >= 0 && var42 >= 0 && var43 < 208 && var42 < 208 && var44 >= 0 && var45 >= 0 && var44 < 208 && var45 < 208 && var47 != 65535) {
                        int var54 = var45 * 64;
                        int var55 = var44 * 64;
                        int var56 = var42 * 64;
                        int var57 = var43 * 64;
                        class282 var58 = new class282(var47, class79.field1127, var57, var56, class62.method349(arg0 ^ 0xF4, class79.field1127, var56, var57) - var48, class203.field3335 + var50, class203.field3335 + var51, var52, var53, var46, var49);
                        var58.method1948(class62.method349(128, class79.field1127, var54, var55) - var49, false, class203.field3335 + var50, var55, var54);
                        class53.field655.method451(-91453648, new class227(var58));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([SI)[S", line = 790)
    public static final short[] method131(short[] arg0, int arg1) {
        field312++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 67) {
            method130(75);
        }
        short[] var2 = new short[arg0.length];
        class185.method1314(arg0, 0, var2, 0, arg0.length);
        return var2;
    }
}
