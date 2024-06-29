import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class24 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field611 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lud;")
    private static class279 field618 = class130.method1024("Loaded update list", 255);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lud;")
    public static class279 field616 = field618;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lud;")
    private static class279 field620 = class130.method1024("skill: ", 255);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lud;")
    public static class279 field612 = field620;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lok;")
    public static class149 field617;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[[[Lpl;")
    public static class191[][][] field619;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 6)
    public static void method211(int arg0) {
        field618 = null;
        field612 = null;
        field620 = null;
        if (arg0 != -12477) {
            method211(-46);
        }
        field616 = null;
        field611 = null;
        field617 = null;
        field619 = (class191[][][]) null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[I[[II[[I[[B[[I[[F[[BI[[B[[I[[F[[B[[[B[[F)[Lvk;", line = 30)
    public static final class168[] method212(int[][] arg0, int[][] arg1, int arg2, int[][] arg3, byte[][] arg4, int[][] arg5, float[][] arg6, byte[][] arg7, int arg8, byte[][] arg9, int[][] arg10, float[][] arg11, byte[][] arg12, byte[][][] arg13, float[][] arg14) {
        field613++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg7[var16][var17];
                if (var18 == 0) {
                    var18 = arg7[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg7[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg7[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class124 var19 = class41.method355((var18 & 0xFF) - 1, (byte) 99);
                    var15[var16][var17] = (var19.field2251 + 1 << 16) + var19.field2255;
                }
            }
        }
        class69 var20 = new class69(128);
        for (int var21 = arg2; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg7[var21][var22] != 0) {
                    int[] var23;
                    if (arg9[var21][var22] == 0) {
                        var23 = class20.field577[0];
                    } else {
                        var23 = class164.field2951[arg4[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22 + 1];
                    if (arg10 != null) {
                        var24 = arg10[var21][var22] & 0xFFFFFF;
                    }
                    int var26 = var15[var21 + 1][var22 + 1];
                    int var27 = var15[var21 + 1][var22];
                    int var28 = var15[var21][var22];
                    long var29 = (long) var28 << 32 | (long) var24;
                    long var31 = (long) var24 | (long) var27 << 32;
                    long var33 = (long) var24 | (long) var26 << 32;
                    long var35 = (long) var25 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class168 var38 = (class168) var20.method610(var29, -1);
                    if (var38 == null) {
                        var38 = new class168((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg3 != null, var24);
                        var20.method612(false, var38, var29);
                    }
                    var38.field3027++;
                    var38.field3035 += var37;
                    if (var29 != var31) {
                        class168 var39 = (class168) var20.method610(var31, -1);
                        if (var39 == null) {
                            var39 = new class168((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg3 != null, var24);
                            var20.method612(false, var39, var31);
                        }
                        var39.field3027++;
                        var39.field3035 += var37;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class168 var40 = (class168) var20.method610(var33, -1);
                        if (var40 == null) {
                            var40 = new class168((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg3 != null, var24);
                            var20.method612(false, var40, var33);
                        }
                        var40.field3035 += var37;
                        var40.field3027++;
                    }
                    if (var29 != var35 && var31 != var35 && var33 != var35) {
                        class168 var41 = (class168) var20.method610(var35, arg2 - 2);
                        if (var41 == null) {
                            var41 = new class168((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg3 != null, var24);
                            var20.method612(false, var41, var35);
                        }
                        var41.field3027++;
                        var41.field3035 += var37;
                    }
                }
            }
        }
        for (class168 var42 = (class168) var20.method609(-26368); var42 != null; var42 = (class168) var20.method604(2)) {
            var42.method1314();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg7[var43][var44];
                if (var45 != 0) {
                    int var46 = 0;
                    int var47 = 128;
                    int var48;
                    if ((arg13[arg8][var43][var44] & 0x8) != 0) {
                        var48 = 0;
                    } else if ((arg13[1][var43][var44] & 0x2) == 2 && arg8 > 0) {
                        var48 = arg8 - 1;
                    } else {
                        var48 = arg8;
                    }
                    if (arg10 != null) {
                        var47 = arg10[var43][var44] >>> 24 << 3;
                        var46 = arg10[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var49 = null;
                    int[] var50;
                    byte var51;
                    if (arg9[var43][var44] == 0) {
                        byte var52 = 0;
                        byte var53 = 0;
                        var50 = class20.field577[0];
                        int var54 = var53 + (arg7[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var55 = var52 + (arg7[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg7[var43][var44 - 1] == var45) {
                            var54++;
                            var55++;
                        } else {
                            var55--;
                            var54--;
                        }
                        byte var56 = 0;
                        byte var57 = 0;
                        int var58 = var57 + (arg7[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        int var59 = var56 + (arg7[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg7[var43 + 1][var44] == var45) {
                            var59++;
                            var54++;
                        } else {
                            var59--;
                            var54--;
                        }
                        if (arg7[var43][var44 + 1] == var45) {
                            var59++;
                            var58++;
                        } else {
                            var58--;
                            var59--;
                        }
                        if (arg7[var43 - 1][var44] == var45) {
                            var58++;
                            var55++;
                        } else {
                            var55--;
                            var58--;
                        }
                        int var60 = var54 - var58;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var55 - var59;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        var51 = (byte) (var61 < var60 ? 1 : 0);
                        arg12[var43][var44] = var51;
                    } else {
                        var49 = class107.field1994[arg4[var43][var44]];
                        var50 = class164.field2951[arg4[var43][var44]];
                        var51 = arg12[var43][var44];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    int var65 = var15[var43][var44 + 1];
                    long var66 = (long) var46 | (long) var62 << 32;
                    long var68 = (long) var64 << 32 | (long) var46;
                    int var70 = arg1[var43][var44];
                    int var71 = arg1[var43 + 1][var44];
                    long var72 = (long) var46 | (long) var65 << 32;
                    long var74 = (long) var63 << 32 | (long) var46;
                    int var76 = arg1[var43 + 1][var44 + 1];
                    int var77 = arg1[var43][var44 + 1];
                    int var78 = arg5[var43 + 1][var44];
                    int var79 = arg5[var43][var44];
                    int var80 = arg5[var43][var44 + 1];
                    int var81 = arg5[var43 + 1][var44 + 1];
                    int var82 = (var62 >> 16) - 1;
                    int var83 = (var63 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var65 >> 16) - 1;
                    class168 var86 = (class168) var20.method610(var66, -1);
                    class209.method1534(var62 <= var63, var48, var51, class44.method376(var80, var77, (byte) 41, var82), var49, false, class44.method376(var78, var71, (byte) 41, var82), arg11, var62 <= var62, var62 <= var64, var86, var44, arg6, arg0, class44.method376(var79, var70, (byte) 41, var82), arg3, class44.method376(var81, var76, (byte) 41, var82), arg14, var47, var43, var50, var62 <= var65);
                    if (var66 != var74) {
                        class168 var87 = (class168) var20.method610(var74, -1);
                        class209.method1534(var63 >= var63, var48, var51, class44.method376(var80, var77, (byte) 41, var83), var49, false, class44.method376(var78, var71, (byte) 41, var83), arg11, var63 <= var62, var63 <= var64, var87, var44, arg6, arg0, class44.method376(var79, var70, (byte) 41, var83), arg3, class44.method376(var81, var76, (byte) 41, var83), arg14, var47, var43, var50, var63 <= var65);
                    }
                    if (var66 != var68 && var68 != var74) {
                        class168 var88 = (class168) var20.method610(var68, -1);
                        class209.method1534(var64 <= var63, var48, var51, class44.method376(var80, var77, (byte) 41, var84), var49, false, class44.method376(var78, var71, (byte) 41, var84), arg11, var64 <= var62, var64 >= var64, var88, var44, arg6, arg0, class44.method376(var79, var70, (byte) 41, var84), arg3, class44.method376(var81, var76, (byte) 41, var84), arg14, var47, var43, var50, var65 >= var64);
                    }
                    if (var66 != var72 && var72 != var74 && var68 != var72) {
                        class168 var89 = (class168) var20.method610(var72, -1);
                        class209.method1534(var63 >= var65, var48, var51, class44.method376(var80, var77, (byte) 41, var85), var49, false, class44.method376(var78, var71, (byte) 41, var85), arg11, var65 <= var62, var65 <= var64, var89, var44, arg6, arg0, class44.method376(var79, var70, (byte) 41, var85), arg3, class44.method376(var81, var76, (byte) 41, var85), arg14, var47, var43, var50, var65 >= var65);
                    }
                }
            }
        }
        for (class168 var90 = (class168) var20.method609(-26368); var90 != null; var90 = (class168) var20.method604(2)) {
            if (var90.field3030 == 0) {
                var90.method2221(true);
            } else {
                var90.method1310();
            }
        }
        int var91 = var20.method608(false);
        class168[] var92 = new class168[var91];
        var20.method611(arg2 + 117, var92);
        long[] var93 = new long[var91];
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field5539;
        }
        class110.method905(var93, (byte) -126, var92);
        return var92;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)Lud;", line = 436)
    public static final class279 method213(int arg0, boolean arg1) {
        field610++;
        if (!arg1) {
            field611 = (int[]) null;
        }
        return class184.field3373[arg0].method1984(8) <= 0 ? class171.field3089[arg0] : class115.method929(new class279[] { class171.field3089[arg0], class60.field1258, class184.field3373[arg0] }, (byte) 60);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V", line = 457)
    public static final void method215(byte arg0, int arg1) {
        field621++;
        if (arg0 <= -109) {
            class98.field1845.method1339(arg1, 19326);
            class248.field4407.method1339(arg1, 19326);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(III)V", line = 468)
    public class24(int arg0, int arg1, int arg2) {
        this.field614 = arg1;
        this.field615 = arg2;
        this.field609 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
    public abstract void method214(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public abstract void method216(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V")
    public abstract void method217(int arg0, int arg1, int arg2);
}
