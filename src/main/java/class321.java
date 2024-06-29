import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class321 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    public static int[] field4991 = new int[2];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[I")
    public static int[] field4992 = new int[4096];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([[I[[BII[[I[[B[[F[[I[[F[[I[[[B[[B[[F[[I[[B)[Ljn;", line = 5)
    public static final class123[] method2191(int[][] arg0, byte[][] arg1, int arg2, int arg3, int[][] arg4, byte[][] arg5, float[][] arg6, int[][] arg7, float[][] arg8, int[][] arg9, byte[][][] arg10, byte[][] arg11, float[][] arg12, int[][] arg13, byte[][] arg14) {
        field4996++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg11[var16][var17];
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg11[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class200 var19 = class236.method1656((var18 & 0xFF) - 1, false);
                    var15[var16][var17] = (var19.field3170 + 1 << 16) + var19.field3168;
                }
            }
        }
        class29 var20 = new class29(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg11[var21][var22] != 0) {
                    int[] var23;
                    if (arg14[var21][var22] == 0) {
                        var23 = class138.field2155[0];
                    } else {
                        var23 = class86.field1264[arg1[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21][var22];
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22 + 1];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = 0;
                    if (arg9 != null) {
                        var28 = arg9[var21][var22] & 0xFFFFFF;
                    }
                    long var29 = (long) var27 << 32 | (long) var28;
                    long var31 = (long) var28 | (long) var24 << 32;
                    long var33 = (long) var25 << 32 | (long) var28;
                    long var35 = (long) var26 << 32 | (long) var28;
                    int var37 = var23.length / 2;
                    class123 var38 = (class123) var20.method203(arg2 - 5984, var31);
                    if (var38 == null) {
                        var38 = new class123((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg13 != null, var28);
                        var20.method208(var38, var31, 0);
                    }
                    var38.field1932 += var37;
                    var38.field1936++;
                    if (var31 != var33) {
                        class123 var39 = (class123) var20.method203(1710, var33);
                        if (var39 == null) {
                            var39 = new class123((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg13 != null, var28);
                            var20.method208(var39, var33, 0);
                        }
                        var39.field1936++;
                        var39.field1932 += var37;
                    }
                    if (var29 != var31 && var29 != var33) {
                        class123 var40 = (class123) var20.method203(1710, var29);
                        if (var40 == null) {
                            var40 = new class123((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg13 != null, var28);
                            var20.method208(var40, var29, 0);
                        }
                        var40.field1932 += var37;
                        var40.field1936++;
                    }
                    if (var31 != var35 && var33 != var35 && var29 != var35) {
                        class123 var41 = (class123) var20.method203(1710, var35);
                        if (var41 == null) {
                            var41 = new class123((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg13 != null, var28);
                            var20.method208(var41, var35, 0);
                        }
                        var41.field1932 += var37;
                        var41.field1936++;
                    }
                }
            }
        }
        for (class123 var42 = (class123) var20.method200(arg2 - 7694); var42 != null; var42 = (class123) var20.method202((byte) 119)) {
            var42.method939();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg11[var43][var44];
                if (var45 != 0) {
                    int var46 = 0;
                    int var47 = 128;
                    int var48;
                    if ((arg10[arg3][var43][var44] & 0x8) != 0) {
                        var48 = 0;
                    } else if ((arg10[1][var43][var44] & 0x2) == 2 && arg3 > 0) {
                        var48 = arg3 - 1;
                    } else {
                        var48 = arg3;
                    }
                    if (arg9 != null) {
                        var47 = arg9[var43][var44] >>> 24 << 3;
                        var46 = arg9[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var49 = null;
                    int[] var51;
                    byte var61;
                    if (arg14[var43][var44] == 0) {
                        byte var50 = 0;
                        var51 = class138.field2155[0];
                        int var52 = var50 + (arg11[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        byte var53 = 0;
                        byte var54 = 0;
                        int var55 = var54 + (arg11[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        int var56 = var53 + (arg11[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        byte var57 = 0;
                        if (arg11[var43][var44 - 1] == var45) {
                            var52++;
                            var55++;
                        } else {
                            var55--;
                            var52--;
                        }
                        int var58 = var57 + (arg11[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg11[var43 + 1][var44] == var45) {
                            var58++;
                            var52++;
                        } else {
                            var58--;
                            var52--;
                        }
                        if (arg11[var43][var44 + 1] == var45) {
                            var58++;
                            var56++;
                        } else {
                            var56--;
                            var58--;
                        }
                        if (arg11[var43 - 1][var44] == var45) {
                            var56++;
                            var55++;
                        } else {
                            var55--;
                            var56--;
                        }
                        int var59 = var55 - var58;
                        if (var59 < 0) {
                            var59 = -var59;
                        }
                        int var60 = var52 - var56;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var61 = (byte) (var59 >= var60 ? 0 : 1);
                        arg5[var43][var44] = var61;
                    } else {
                        var49 = class257.field3836[arg1[var43][var44]];
                        var51 = class86.field1264[arg1[var43][var44]];
                        var61 = arg5[var43][var44];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    int var65 = var15[var43][var44 + 1];
                    long var66 = (long) var46 | (long) var63 << 32;
                    long var68 = (long) var62 << 32 | (long) var46;
                    long var70 = (long) var46 | (long) var64 << 32;
                    long var72 = (long) var65 << 32 | (long) var46;
                    int var74 = arg0[var43][var44];
                    int var75 = arg0[var43 + 1][var44];
                    int var76 = arg0[var43 + 1][var44 + 1];
                    int var77 = arg0[var43][var44 + 1];
                    int var78 = arg4[var43][var44];
                    int var79 = arg4[var43 + 1][var44];
                    int var80 = arg4[var43 + 1][var44 + 1];
                    int var81 = arg4[var43][var44 + 1];
                    int var82 = (var62 >> 16) - 1;
                    int var83 = (var64 >> 16) - 1;
                    int var84 = (var63 >> 16) - 1;
                    int var85 = (var65 >> 16) - 1;
                    class123 var86 = (class123) var20.method203(1710, var68);
                    class54.method483(var62 <= var63, class224.method1596(var79, var75, true, var82), arg12, var49, var44, var62 >= var62, var61, var62 <= var64, class224.method1596(var80, var76, true, var82), var47, var43, var51, arg7, arg8, arg13, var62 <= var65, class224.method1596(var81, var77, true, var82), arg6, var86, class224.method1596(var78, var74, true, var82), var48, (byte) -114);
                    if (var66 != var68) {
                        class123 var87 = (class123) var20.method203(arg2 - 5984, var66);
                        class54.method483(var63 <= var63, class224.method1596(var79, var75, true, var84), arg12, var49, var44, var62 >= var63, var61, var64 >= var63, class224.method1596(var80, var76, true, var84), var47, var43, var51, arg7, arg8, arg13, var65 >= var63, class224.method1596(var81, var77, true, var84), arg6, var87, class224.method1596(var78, var74, true, var84), var48, (byte) -121);
                    }
                    if (var68 != var70 && var66 != var70) {
                        class123 var88 = (class123) var20.method203(1710, var70);
                        class54.method483(var63 >= var64, class224.method1596(var79, var75, true, var83), arg12, var49, var44, var64 <= var62, var61, var64 >= var64, class224.method1596(var80, var76, true, var83), var47, var43, var51, arg7, arg8, arg13, var64 <= var65, class224.method1596(var81, var77, true, var83), arg6, var88, class224.method1596(var78, var74, true, var83), var48, (byte) -113);
                    }
                    if (var68 != var72 && var66 != var72 && var70 != var72) {
                        class123 var89 = (class123) var20.method203(1710, var72);
                        class54.method483(var65 <= var63, class224.method1596(var79, var75, true, var85), arg12, var49, var44, var62 >= var65, var61, var64 >= var65, class224.method1596(var80, var76, true, var85), var47, var43, var51, arg7, arg8, arg13, var65 >= var65, class224.method1596(var81, var77, true, var85), arg6, var89, class224.method1596(var78, var74, true, var85), var48, (byte) -119);
                    }
                }
            }
        }
        for (class123 var90 = (class123) var20.method200(arg2 - 7694); var90 != null; var90 = (class123) var20.method202((byte) 98)) {
            if (var90.field1926 == 0) {
                var90.method1554((byte) -107);
            } else {
                var90.method942();
            }
        }
        int var91 = var20.method205(0);
        long[] var92 = new long[var91];
        class123[] var93 = new class123[var91];
        var20.method199(arg2 ^ arg2, var93);
        for (int var94 = 0; var94 < var91; var94++) {
            var92[var94] = var93[var94].field3418;
        }
        class289.method2043(var93, var92, 0);
        return var93;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 394)
    public static final void method2192(int arg0) {
        field4995++;
        class324.method2226(8);
        class196.method1420(true);
        class15.method113(-16);
        class73.method602((byte) -127);
        class222.method1590(false);
        class267.method1857(-25588);
        class282.method1987(true);
        class268.method1867((byte) 95);
        class93.method738((byte) 52);
        class274.method1904(arg0);
        class67.method564(true);
        class149.method1102(true);
        class173.method1265(71);
        class72.method597((byte) 111);
        class3.method38((byte) -80);
        class72.method598((byte) 15);
        if (class183.field2755 != 0) {
            for (int var1 = 0; var1 < class33.field411.length; var1++) {
                class33.field411[var1] = null;
            }
            class96.field1417 = 0;
        }
        class314.method2164(76);
        class201.method1459((byte) 30);
        class78.field1100.method1428(10935);
        if (!class36.field534) {
            ((class262) class56.field829).method1804(true);
        }
        class276.field4239.method825(0);
        class260.field3854.method1501(~arg0);
        class154.field2325.method1501(-1);
        class248.field3724.method1501(-1);
        class232.field3582.method1501(-1);
        class246.field3710.method1501(-1);
        class178.field2663.method1501(-1);
        class302.field4728.method1501(-1);
        class80.field1118.method1501(arg0 - 1);
        class154.field2322.method1501(-1);
        class136.field2123.method1501(-1);
        class133.field2098.method1501(-1);
        class15.field173.method1428(10935);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 453)
    public static final void method2193(int arg0, int arg1) {
        field4994++;
        if (~arg0 == arg1 || !class179.method1294(arg0, arg1 ^ 0x1)) {
            return;
        }
        class184[] var2 = class305.field4779[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class184 var4 = var2[var3];
            if (var4.field2966 != null) {
                class167 var5 = new class167();
                var5.field2518 = var4;
                var5.field2510 = var4.field2966;
                class305.method2129(var5, 2000000, (byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 492)
    public static void method2194(byte arg0) {
        if (arg0 == -90) {
            field4991 = null;
            field4992 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)[B", line = 512)
    public static final byte[] method2195(byte[] arg0, int arg1) {
        field4993++;
        if (arg1 != 6248) {
            field4991 = (int[]) null;
        }
        class35 var2 = new class35(arg0);
        int var3 = var2.method273(65280);
        int var4 = var2.method299(-77);
        if (var4 < 0 || !(class35.field482 == 0 || var4 <= class35.field482)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method275(false, var7, var4, 0);
            return var7;
        } else {
            int var5 = var2.method299(-112);
            if (var5 < 0 || class35.field482 != 0 && var5 > class35.field482) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class164.method1176(var6, var5, arg0, var4, 9);
            } else {
                class133.field2093.method1441((byte) -63, var6, var2);
            }
            return var6;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4992[var0] = class227.method1613(var0, 18442);
        }
    }
}
