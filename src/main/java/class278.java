import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class278 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4581 = new String[8];

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field4586 = 100;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lnm;")
    public static class221 field4582;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lnm;")
    public static class221 field4589;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1975(int arg0, int arg1) {
        class41.field627.method645(arg1, (byte) -91);
        field4584++;
        if (arg0 < 126) {
            method1979(30);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B", line = 20)
    public static final byte[] method1976(Object arg0, byte arg1, boolean arg2) {
        field4591++;
        if (arg1 < 13) {
            field4589 = (class221) null;
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg0);
            return arg2 ? class86.method563(var3, 0) : var3;
        } else if (arg0 instanceof class11) {
            class11 var4 = (class11) arg0;
            return var4.method68(76);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1977(int arg0) {
        field4585++;
        if (arg0 == 1533177089) {
            class268.field4419.method651(0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I", line = 71)
    public static final int method1978(int arg0, int arg1) {
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        field4587++;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 == 128 ? arg1 & ~var7 : -52;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 89)
    public static void method1979(int arg0) {
        field4581 = null;
        if (arg0 != 7502) {
            method1983(-4);
        }
        field4589 = null;
        field4582 = null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V", line = 103)
    public static final void method1980(int arg0, int arg1) {
        field4588++;
        class6.field76 = 100;
        class2.field14 = arg0;
        class325.field5326 = arg1;
        class268.field4416 = 3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 114)
    public static final void method1981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4583++;
        if (arg0 <= 2) {
            method1976((Object) null, (byte) 70, false);
        }
        class211 var5 = class17.method115(4, arg4, 4086);
        var5.method1433(true);
        var5.field3211 = arg3;
        var5.field3210 = arg1;
        var5.field3209 = arg2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([[B[[F[[I[[I[[I[[B[[[I[[F[[[BZ[[II[[B[[F[[I[[B)[Ljb;", line = 133)
    public static final class226[] method1982(byte[][] arg0, float[][] arg1, int[][] arg2, int[][] arg3, int[][] arg4, byte[][] arg5, int[][][] arg6, float[][] arg7, byte[][][] arg8, boolean arg9, int[][] arg10, int arg11, byte[][] arg12, float[][] arg13, int[][] arg14, byte[][] arg15) {
        field4592++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg6 != null) {
                    int var20 = arg6[arg11][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg5[var17][var18];
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg5[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg5[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg5[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg5[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17][var18];
                    }
                } else {
                    var22 = arg5[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg5[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg5[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class324 var23 = class78.method533(1, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field5311 + 1 << 16) + var23.field5312;
                }
            }
        }
        class4 var24 = new class4(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg5[var25][var26] != 0) {
                    int[] var27;
                    if (arg12[var25][var26] == 0) {
                        var27 = class146.field2357[0];
                    } else {
                        var27 = class16.field211[arg15[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg10 != null) {
                        var28 = arg10[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25][var26];
                    int var31 = var16[var25 + 1][var26 + 1];
                    int var32 = var16[var25][var26 + 1];
                    long var33 = (long) var28 | (long) var30 << 32;
                    long var35 = (long) var31 << 32 | (long) var28;
                    long var37 = (long) var28 | (long) var29 << 32;
                    int var39 = var27.length / 2;
                    long var40 = (long) var32 << 32 | (long) var28;
                    class226 var42 = (class226) var24.method29(var33, 103);
                    if (var42 == null) {
                        var42 = new class226((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg4 != null, var28);
                        var24.method37(false, var42, var33);
                    }
                    var42.field3546++;
                    var42.field3537 += var39;
                    if (var33 != var37) {
                        class226 var43 = (class226) var24.method29(var37, 103);
                        if (var43 == null) {
                            var43 = new class226((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg4 != null, var28);
                            var24.method37(false, var43, var37);
                        }
                        var43.field3537 += var39;
                        var43.field3546++;
                    }
                    if (var33 != var35 && var35 != var37) {
                        class226 var44 = (class226) var24.method29(var35, 103);
                        if (var44 == null) {
                            var44 = new class226((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg4 != null, var28);
                            var24.method37(false, var44, var35);
                        }
                        var44.field3546++;
                        var44.field3537 += var39;
                    }
                    if (var33 != var40 && var37 != var40 && var35 != var40) {
                        class226 var45 = (class226) var24.method29(var40, 103);
                        if (var45 == null) {
                            var45 = new class226((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg4 != null, var28);
                            var24.method37(false, var45, var40);
                        }
                        var45.field3537 += var39;
                        var45.field3546++;
                    }
                }
            }
        }
        if (arg9) {
            field4586 = 96;
        }
        for (class226 var46 = (class226) var24.method27(123); var46 != null; var46 = (class226) var24.method34(8)) {
            var46.method1532();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg5[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg8[arg11][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg8[1][var47][var48] & 0x2) == 2 && arg11 > 0) {
                        var50 = arg11 - 1;
                    } else {
                        var50 = arg11;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg10 != null) {
                        var51 = arg10[var47][var48] & 0xFFFFFF;
                        var52 = arg10[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    byte var54;
                    int[] var55;
                    if (arg12[var47][var48] == 0) {
                        var55 = class146.field2357[0];
                        byte var56 = 0;
                        byte var57 = 0;
                        int var58 = var56 + (arg5[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        int var59 = var57 + (arg5[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        byte var61 = 0;
                        int var62 = var61 + (arg5[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        int var63 = var60 + (arg5[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg5[var47][var48 - 1] == var49) {
                            var63++;
                            var59++;
                        } else {
                            var59--;
                            var63--;
                        }
                        if (arg5[var47 + 1][var48] == var49) {
                            var58++;
                            var63++;
                        } else {
                            var63--;
                            var58--;
                        }
                        if (arg5[var47][var48 + 1] == var49) {
                            var58++;
                            var62++;
                        } else {
                            var58--;
                            var62--;
                        }
                        if (arg5[var47 - 1][var48] == var49) {
                            var59++;
                            var62++;
                        } else {
                            var59--;
                            var62--;
                        }
                        int var64 = var59 - var58;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        int var65 = var63 - var62;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var54 = (byte) (var64 < var65 ? 1 : 0);
                        arg0[var47][var48] = var54;
                    } else {
                        var54 = arg0[var47][var48];
                        var53 = class198.field3046[arg15[var47][var48]];
                        var55 = class16.field211[arg15[var47][var48]];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48 + 1];
                    int var68 = var16[var47][var48 + 1];
                    int var69 = var16[var47 + 1][var48];
                    long var70 = (long) var51 | (long) var69 << 32;
                    long var72 = (long) var51 | (long) var66 << 32;
                    long var74 = (long) var51 | (long) var67 << 32;
                    long var76 = (long) var51 | (long) var68 << 32;
                    int var78 = arg14[var47][var48];
                    int var79 = arg14[var47 + 1][var48];
                    int var80 = arg14[var47][var48 + 1];
                    int var81 = arg14[var47 + 1][var48 + 1];
                    int var82 = arg3[var47][var48];
                    int var83 = arg3[var47 + 1][var48];
                    int var84 = arg3[var47 + 1][var48 + 1];
                    int var85 = arg3[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var69 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class226 var89 = (class226) var24.method29(var72, 103);
                    class270.method1908(arg2, arg1, var66 <= var66, var52, var50, class179.method1254(var86, false, var80, var85), var55, class179.method1254(var86, false, var78, var82), var89, var66 <= var69, var48, var54, 0, var47, class179.method1254(var86, arg9, var81, var84), class179.method1254(var86, arg9, var79, var83), var53, var66 <= var67, arg7, arg4, arg13, var68 >= var66);
                    int var90 = (var67 >> 16) - 1;
                    if (var70 != var72) {
                        class226 var91 = (class226) var24.method29(var70, 103);
                        class270.method1908(arg2, arg1, var66 >= var69, var52, var50, class179.method1254(var87, false, var80, var85), var55, class179.method1254(var87, false, var78, var82), var91, var69 <= var69, var48, var54, 0, var47, class179.method1254(var87, false, var81, var84), class179.method1254(var87, false, var79, var83), var53, var67 >= var69, arg7, arg4, arg13, var69 <= var68);
                    }
                    if (var72 != var74 && var70 != var74) {
                        class226 var92 = (class226) var24.method29(var74, 103);
                        class270.method1908(arg2, arg1, var67 <= var66, var52, var50, class179.method1254(var90, arg9, var80, var85), var55, class179.method1254(var90, false, var78, var82), var92, var69 >= var67, var48, var54, 0, var47, class179.method1254(var90, false, var81, var84), class179.method1254(var90, false, var79, var83), var53, var67 <= var67, arg7, arg4, arg13, var68 >= var67);
                    }
                    if (var72 != var76 && var70 != var76 && var74 != var76) {
                        class226 var93 = (class226) var24.method29(var76, 103);
                        class270.method1908(arg2, arg1, var66 >= var68, var52, var50, class179.method1254(var88, arg9, var80, var85), var55, class179.method1254(var88, false, var78, var82), var93, var69 >= var68, var48, var54, 0, var47, class179.method1254(var88, false, var81, var84), class179.method1254(var88, false, var79, var83), var53, var68 <= var67, arg7, arg4, arg13, var68 >= var68);
                    }
                }
            }
        }
        for (class226 var94 = (class226) var24.method27(118); var94 != null; var94 = (class226) var24.method34(8)) {
            if (var94.field3527 == 0) {
                var94.method1131(8);
            } else {
                var94.method1533();
            }
        }
        int var95 = var24.method28(!arg9);
        class226[] var96 = new class226[var95];
        long[] var97 = new long[var95];
        var24.method30(-122, var96);
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field2549;
        }
        class157.method1125(var97, var96, 105);
        return var96;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 588)
    public static final void method1983(int arg0) {
        if (class346.field5545 != null) {
            class346.field5545.method674((byte) -83);
            class346.field5545 = null;
        }
        class262.method1840((byte) 111);
        class171.method1179();
        field4580++;
        for (int var1 = 0; var1 < 4; var1++) {
            class124.field1860[var1].method1119(-16746);
        }
        class183.method1270(false, arg0 ^ 0xFFFFFFFE);
        System.gc();
        class223.method1522(2, arg0);
        class214.field3279 = -1;
        class310.field5053 = false;
        class258.method1827(5, true);
        class150.field2420 = 0;
        class328.field5362 = 0;
        class96.field1383 = false;
        class50.field749 = 0;
        class215.field3313 = 0;
        for (int var2 = 0; var2 < class165.field2602.length; var2++) {
            class165.field2602[var2] = null;
        }
        class38.field561 = 0;
        class294.field4892 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class130.field1984[var3] = null;
            class310.field5051[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class329.field5377[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class171.field2668[var5][var6][var7] = null;
                }
            }
        }
        class70.method485(-6);
        class92.field1356 = 0;
        class132.method858(63);
        class203.method1384(-88, true);
        try {
            class73.method499(117, "loggedout", class96.field1382.field4515);
        } catch (Throwable var9) {
        }
    }
}
