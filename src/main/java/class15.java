import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class15 {

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Z")
    public boolean field175 = true;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "[I")
    public int[] field177;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
    public int[] field159;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public int[] field163;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[I")
    public int[] field179;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    public static int[] field167 = new int[6];

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[I")
    private static int[][] field173 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[[I")
    private static int[][] field166 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field162 = new int[6];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
    public static int[] field170 = new int[6];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    public static int[] field169 = new int[6];

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    public static int[] field171 = new int[6];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 12)
    public static void method84() {
        field169 = null;
        field167 = null;
        field170 = null;
        field171 = null;
        field162 = null;
        field173 = (int[][]) null;
        field166 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field175 = false;
        }
        this.field158 = arg0;
        this.field164 = arg1;
        this.field178 = arg17;
        this.field165 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field173[arg0];
        int var25 = var24.length;
        this.field172 = new int[var25];
        this.field177 = new int[var25];
        this.field174 = new int[var25];
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
            this.field172[var30] = var32;
            this.field177[var30] = var34;
            this.field174[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field166[arg0];
        int var38 = var37.length / 4;
        this.field159 = new int[var38];
        this.field160 = new int[var38];
        this.field168 = new int[var38];
        this.field163 = new int[var38];
        this.field161 = new int[var38];
        this.field179 = new int[var38];
        if (arg2 != -1) {
            this.field176 = new int[var38];
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
            this.field159[var40] = var42;
            this.field160[var40] = var43;
            this.field168[var40] = var44;
            if (var41 == 0) {
                this.field163[var40] = var26[var42];
                this.field161[var40] = var26[var43];
                this.field179[var40] = var26[var44];
                if (this.field176 != null) {
                    this.field176[var40] = -1;
                }
            } else {
                this.field163[var40] = var27[var42];
                this.field161[var40] = var27[var43];
                this.field179[var40] = var27[var44];
                if (this.field176 != null) {
                    this.field176[var40] = arg2;
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
