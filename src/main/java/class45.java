import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 {

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
    public boolean field741 = true;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public int[] field731;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[I")
    public int[] field730;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[I")
    public int[] field727;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[I")
    public int[] field747;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
    public int[] field734;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
    public int[] field742;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "[I")
    public int[] field743;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[I")
    public static int[] field729 = new int[6];

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    public static int[] field740 = new int[6];

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "[I")
    public static int[] field732 = new int[6];

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field728 = new int[6];

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[[I")
    private static int[][] field735 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "[I")
    public static int[] field737 = new int[6];

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "[[I")
    private static int[][] field746 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 11)
    public static void method340() {
        field737 = null;
        field729 = null;
        field728 = null;
        field740 = null;
        field732 = null;
        field735 = (int[][]) null;
        field746 = (int[][]) null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field741 = false;
        }
        this.field733 = arg0;
        this.field748 = arg1;
        this.field745 = arg17;
        this.field744 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field735[arg0];
        int var25 = var24.length;
        this.field731 = new int[var25];
        this.field730 = new int[var25];
        this.field736 = new int[var25];
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
            this.field731[var30] = var32;
            this.field730[var30] = var34;
            this.field736[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field746[arg0];
        int var38 = var37.length / 4;
        this.field738 = new int[var38];
        this.field727 = new int[var38];
        this.field747 = new int[var38];
        this.field739 = new int[var38];
        this.field734 = new int[var38];
        this.field742 = new int[var38];
        if (arg2 != -1) {
            this.field743 = new int[var38];
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
            this.field738[var40] = var42;
            this.field727[var40] = var43;
            this.field747[var40] = var44;
            if (var41 == 0) {
                this.field739[var40] = var26[var42];
                this.field734[var40] = var26[var43];
                this.field742[var40] = var26[var44];
                if (this.field743 != null) {
                    this.field743[var40] = -1;
                }
            } else {
                this.field739[var40] = var27[var42];
                this.field734[var40] = var27[var43];
                this.field742[var40] = var27[var44];
                if (this.field743 != null) {
                    this.field743[var40] = arg2;
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
}
