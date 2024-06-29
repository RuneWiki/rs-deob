import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class157 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
    public boolean field2358 = true;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[I")
    public int[] field2365;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
    public int[] field2360;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public int[] field2359;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[I")
    public int[] field2350;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
    public int[] field2357;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[I")
    public int[] field2366;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "[I")
    public int[] field2367;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[I")
    public int[] field2351;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[I")
    public int[] field2369;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "[I")
    public static int[] field2348 = new int[6];

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[[I")
    private static int[][] field2353 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[[I")
    private static int[][] field2355 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[I")
    public static int[] field2361 = new int[6];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[I")
    public static int[] field2352 = new int[6];

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    public static int[] field2349 = new int[6];

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "[I")
    public static int[] field2368 = new int[6];

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2358 = false;
        }
        this.field2362 = arg0;
        this.field2364 = arg1;
        this.field2363 = arg17;
        this.field2356 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2353[arg0];
        int var25 = var24.length;
        this.field2365 = new int[var25];
        this.field2360 = new int[var25];
        this.field2359 = new int[var25];
        int[] var26 = new int[var25];
        int[] var27 = new int[var25];
        int var28 = arg3 * var20;
        int var29 = arg4 * var20;
        for (int var30 = 0; var30 < var25; var30++) {
            int var31 = var24[var30];
            if ((var31 & 0x1) == 0 && var31 <= 8) {
                var31 = (var31 - arg1 - arg1 - 1 & 0x7) + 1;
            }
            if (var31 > 8 && var31 <= 12) {
                var31 = (var31 - arg1 - 9 & 0x3) + 9;
            }
            if (var31 > 12 && var31 <= 16) {
                var31 = (var31 - arg1 - 13 & 0x3) + 13;
            }
            int var32;
            int var33;
            int var34;
            int var35;
            int var36;
            if (var31 == 1) {
                var32 = var28;
                var33 = var29;
                var34 = arg5;
                var35 = arg9;
                var36 = arg13;
            } else if (var31 == 2) {
                var32 = var21 + var28;
                var33 = var29;
                var34 = arg5 + arg6 >> 1;
                var35 = arg9 + arg10 >> 1;
                var36 = arg13 + arg14 >> 1;
            } else if (var31 == 3) {
                var32 = var20 + var28;
                var33 = var29;
                var34 = arg6;
                var35 = arg10;
                var36 = arg14;
            } else if (var31 == 4) {
                var32 = var20 + var28;
                var33 = var21 + var29;
                var34 = arg6 + arg7 >> 1;
                var35 = arg10 + arg11 >> 1;
                var36 = arg14 + arg15 >> 1;
            } else if (var31 == 5) {
                var32 = var20 + var28;
                var33 = var20 + var29;
                var34 = arg7;
                var35 = arg11;
                var36 = arg15;
            } else if (var31 == 6) {
                var32 = var21 + var28;
                var33 = var20 + var29;
                var34 = arg7 + arg8 >> 1;
                var35 = arg11 + arg12 >> 1;
                var36 = arg15 + arg16 >> 1;
            } else if (var31 == 7) {
                var32 = var28;
                var33 = var20 + var29;
                var34 = arg8;
                var35 = arg12;
                var36 = arg16;
            } else if (var31 == 8) {
                var32 = var28;
                var33 = var21 + var29;
                var34 = arg5 + arg8 >> 1;
                var35 = arg9 + arg12 >> 1;
                var36 = arg13 + arg16 >> 1;
            } else if (var31 == 9) {
                var32 = var21 + var28;
                var33 = var22 + var29;
                var34 = arg5 + arg6 >> 1;
                var35 = arg9 + arg10 >> 1;
                var36 = arg13 + arg14 >> 1;
            } else if (var31 == 10) {
                var32 = var23 + var28;
                var33 = var21 + var29;
                var34 = arg6 + arg7 >> 1;
                var35 = arg10 + arg11 >> 1;
                var36 = arg14 + arg15 >> 1;
            } else if (var31 == 11) {
                var32 = var21 + var28;
                var33 = var23 + var29;
                var34 = arg7 + arg8 >> 1;
                var35 = arg11 + arg12 >> 1;
                var36 = arg15 + arg16 >> 1;
            } else if (var31 == 12) {
                var32 = var22 + var28;
                var33 = var21 + var29;
                var34 = arg5 + arg8 >> 1;
                var35 = arg9 + arg12 >> 1;
                var36 = arg13 + arg16 >> 1;
            } else if (var31 == 13) {
                var32 = var22 + var28;
                var33 = var22 + var29;
                var34 = arg5;
                var35 = arg9;
                var36 = arg13;
            } else if (var31 == 14) {
                var32 = var23 + var28;
                var33 = var22 + var29;
                var34 = arg6;
                var35 = arg10;
                var36 = arg14;
            } else if (var31 == 15) {
                var32 = var23 + var28;
                var33 = var23 + var29;
                var34 = arg7;
                var35 = arg11;
                var36 = arg15;
            } else {
                var32 = var22 + var28;
                var33 = var23 + var29;
                var34 = arg8;
                var35 = arg12;
                var36 = arg16;
            }
            this.field2365[var30] = var32;
            this.field2360[var30] = var34;
            this.field2359[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field2355[arg0];
        int var38 = var37.length / 4;
        this.field2350 = new int[var38];
        this.field2357 = new int[var38];
        this.field2366 = new int[var38];
        this.field2367 = new int[var38];
        this.field2354 = new int[var38];
        this.field2351 = new int[var38];
        if (arg2 != -1) {
            this.field2369 = new int[var38];
        }
        int var39 = 0;
        for (int var40 = 0; var40 < var38; var40++) {
            int var41 = var37[var39];
            int var42 = var37[var39 + 1];
            int var43 = var37[var39 + 2];
            int var44 = var37[var39 + 3];
            var39 += 4;
            if (var42 < 4) {
                var42 = var42 - arg1 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg1 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg1 & 0x3;
            }
            this.field2350[var40] = var42;
            this.field2357[var40] = var43;
            this.field2366[var40] = var44;
            if (var41 == 0) {
                this.field2367[var40] = var26[var42];
                this.field2354[var40] = var26[var43];
                this.field2351[var40] = var26[var44];
                if (this.field2369 != null) {
                    this.field2369[var40] = -1;
                }
            } else {
                this.field2367[var40] = var27[var42];
                this.field2354[var40] = var27[var43];
                this.field2351[var40] = var27[var44];
                if (this.field2369 != null) {
                    this.field2369[var40] = arg2;
                }
            }
        }
        int var45 = arg5;
        int var46 = arg6;
        if (arg6 < arg5) {
            var45 = arg6;
        }
        if (arg6 > arg6) {
            var46 = arg6;
        }
        if (arg7 < var45) {
            var45 = arg7;
        }
        if (arg7 > var46) {
            var46 = arg7;
        }
        if (arg8 < var45) {
            var45 = arg8;
        }
        if (arg8 > var46) {
            var46 = arg8;
        }
        int var47 = var45 / 14;
        int var48 = var46 / 14;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V", line = 37)
    public static void method1071() {
        field2348 = null;
        field2368 = null;
        field2352 = null;
        field2361 = null;
        field2349 = null;
        field2353 = (int[][]) null;
        field2355 = (int[][]) null;
    }
}
