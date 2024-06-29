import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class127 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public boolean field2035 = true;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public int[] field2029;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[I")
    public int[] field2038;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    public int[] field2030;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
    public int[] field2028;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
    public int[] field2042;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
    public int[] field2043;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
    public int[] field2046;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
    public int[] field2036;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
    public int[] field2033;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field2025 = new int[6];

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[[I")
    private static int[][] field2041 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
    public static int[] field2045 = new int[6];

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
    public static int[] field2032 = new int[6];

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public static int[] field2040 = new int[6];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[[I")
    private static int[][] field2031 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "[I")
    public static int[] field2039 = new int[6];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V", line = 18)
    public static void method996() {
        field2039 = null;
        field2040 = null;
        field2025 = null;
        field2032 = null;
        field2045 = null;
        field2031 = (int[][]) null;
        field2041 = (int[][]) null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 63)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2035 = false;
        }
        this.field2026 = arg0;
        this.field2037 = arg1;
        this.field2034 = arg17;
        this.field2027 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2031[arg0];
        int var25 = var24.length;
        this.field2029 = new int[var25];
        this.field2038 = new int[var25];
        this.field2030 = new int[var25];
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
            this.field2029[var30] = var32;
            this.field2038[var30] = var34;
            this.field2030[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field2041[arg0];
        int var38 = var37.length / 4;
        this.field2028 = new int[var38];
        this.field2042 = new int[var38];
        this.field2044 = new int[var38];
        this.field2043 = new int[var38];
        this.field2046 = new int[var38];
        this.field2036 = new int[var38];
        if (arg2 != -1) {
            this.field2033 = new int[var38];
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
            this.field2028[var40] = var42;
            this.field2042[var40] = var43;
            this.field2044[var40] = var44;
            if (var41 == 0) {
                this.field2043[var40] = var26[var42];
                this.field2046[var40] = var26[var43];
                this.field2036[var40] = var26[var44];
                if (this.field2033 != null) {
                    this.field2033[var40] = -1;
                }
            } else {
                this.field2043[var40] = var27[var42];
                this.field2046[var40] = var27[var43];
                this.field2036[var40] = var27[var44];
                if (this.field2033 != null) {
                    this.field2033[var40] = arg2;
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
