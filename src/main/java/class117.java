import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class117 {

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    public boolean field1970 = true;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    public int[] field1981;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    public int[] field1978;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public int[] field1975;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
    public int[] field1969;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
    public int[] field1977;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public int[] field1965;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    public int[] field1974;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
    public int[] field1979;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public int[] field1961;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    public int[] field1964;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field1967 = new int[6];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[[I")
    private static int[][] field1966 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    public static int[] field1972 = new int[6];

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    public static int[] field1963 = new int[6];

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    public static int[] field1973 = new int[6];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    public static int[] field1960 = new int[6];

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[[I")
    private static int[][] field1971 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
    public static void method863() {
        field1972 = null;
        field1963 = null;
        field1967 = null;
        field1973 = null;
        field1960 = null;
        field1971 = null;
        field1966 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field1970 = false;
        }
        this.field1968 = arg0;
        this.field1976 = arg1;
        this.field1980 = arg17;
        this.field1962 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field1971[arg0];
        int var25 = var24.length;
        this.field1981 = new int[var25];
        this.field1978 = new int[var25];
        this.field1975 = new int[var25];
        int[] var26 = new int[var25];
        int[] var27 = new int[var25];
        int var28 = arg3 * var20;
        int var29 = arg4 * var20;
        for (int var30 = 0; var30 < var25; var30++) {
            int var43 = var24[var30];
            if ((var43 & 0x1) == 0 && var43 <= 8) {
                var43 = (var43 - arg1 - arg1 - 1 & 0x7) + 1;
            }
            if (var43 > 8 && var43 <= 12) {
                var43 = (var43 - arg1 - 9 & 0x3) + 9;
            }
            if (var43 > 12 && var43 <= 16) {
                var43 = (var43 - arg1 - 13 & 0x3) + 13;
            }
            int var44;
            int var45;
            int var46;
            int var47;
            int var48;
            if (var43 == 1) {
                var44 = var28;
                var45 = var29;
                var46 = arg5;
                var47 = arg9;
                var48 = arg13;
            } else if (var43 == 2) {
                var44 = var21 + var28;
                var45 = var29;
                var46 = arg5 + arg6 >> 1;
                var47 = arg9 + arg10 >> 1;
                var48 = arg13 + arg14 >> 1;
            } else if (var43 == 3) {
                var44 = var20 + var28;
                var45 = var29;
                var46 = arg6;
                var47 = arg10;
                var48 = arg14;
            } else if (var43 == 4) {
                var44 = var20 + var28;
                var45 = var21 + var29;
                var46 = arg6 + arg7 >> 1;
                var47 = arg10 + arg11 >> 1;
                var48 = arg14 + arg15 >> 1;
            } else if (var43 == 5) {
                var44 = var20 + var28;
                var45 = var20 + var29;
                var46 = arg7;
                var47 = arg11;
                var48 = arg15;
            } else if (var43 == 6) {
                var44 = var21 + var28;
                var45 = var20 + var29;
                var46 = arg7 + arg8 >> 1;
                var47 = arg11 + arg12 >> 1;
                var48 = arg15 + arg16 >> 1;
            } else if (var43 == 7) {
                var44 = var28;
                var45 = var20 + var29;
                var46 = arg8;
                var47 = arg12;
                var48 = arg16;
            } else if (var43 == 8) {
                var44 = var28;
                var45 = var21 + var29;
                var46 = arg5 + arg8 >> 1;
                var47 = arg9 + arg12 >> 1;
                var48 = arg13 + arg16 >> 1;
            } else if (var43 == 9) {
                var44 = var21 + var28;
                var45 = var22 + var29;
                var46 = arg5 + arg6 >> 1;
                var47 = arg9 + arg10 >> 1;
                var48 = arg13 + arg14 >> 1;
            } else if (var43 == 10) {
                var44 = var23 + var28;
                var45 = var21 + var29;
                var46 = arg6 + arg7 >> 1;
                var47 = arg10 + arg11 >> 1;
                var48 = arg14 + arg15 >> 1;
            } else if (var43 == 11) {
                var44 = var21 + var28;
                var45 = var23 + var29;
                var46 = arg7 + arg8 >> 1;
                var47 = arg11 + arg12 >> 1;
                var48 = arg15 + arg16 >> 1;
            } else if (var43 == 12) {
                var44 = var22 + var28;
                var45 = var21 + var29;
                var46 = arg5 + arg8 >> 1;
                var47 = arg9 + arg12 >> 1;
                var48 = arg13 + arg16 >> 1;
            } else if (var43 == 13) {
                var44 = var22 + var28;
                var45 = var22 + var29;
                var46 = arg5;
                var47 = arg9;
                var48 = arg13;
            } else if (var43 == 14) {
                var44 = var23 + var28;
                var45 = var22 + var29;
                var46 = arg6;
                var47 = arg10;
                var48 = arg14;
            } else if (var43 == 15) {
                var44 = var23 + var28;
                var45 = var23 + var29;
                var46 = arg7;
                var47 = arg11;
                var48 = arg15;
            } else {
                var44 = var22 + var28;
                var45 = var23 + var29;
                var46 = arg8;
                var47 = arg12;
                var48 = arg16;
            }
            this.field1981[var30] = var44;
            this.field1978[var30] = var46;
            this.field1975[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field1966[arg0];
        int var32 = var31.length / 4;
        this.field1969 = new int[var32];
        this.field1977 = new int[var32];
        this.field1965 = new int[var32];
        this.field1974 = new int[var32];
        this.field1979 = new int[var32];
        this.field1961 = new int[var32];
        if (arg2 != -1) {
            this.field1964 = new int[var32];
        }
        int var33 = 0;
        for (int var34 = 0; var34 < var32; var34++) {
            int var39 = var31[var33];
            int var40 = var31[var33 + 1];
            int var41 = var31[var33 + 2];
            int var42 = var31[var33 + 3];
            var33 += 4;
            if (var40 < 4) {
                var40 = var40 - arg1 & 0x3;
            }
            if (var41 < 4) {
                var41 = var41 - arg1 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg1 & 0x3;
            }
            this.field1969[var34] = var40;
            this.field1977[var34] = var41;
            this.field1965[var34] = var42;
            if (var39 == 0) {
                this.field1974[var34] = var26[var40];
                this.field1979[var34] = var26[var41];
                this.field1961[var34] = var26[var42];
                if (this.field1964 != null) {
                    this.field1964[var34] = -1;
                }
            } else {
                this.field1974[var34] = var27[var40];
                this.field1979[var34] = var27[var41];
                this.field1961[var34] = var27[var42];
                if (this.field1964 != null) {
                    this.field1964[var34] = arg2;
                }
            }
        }
        int var35 = arg5;
        int var36 = arg6;
        if (arg6 < arg5) {
            var35 = arg6;
        }
        if (arg6 > arg6) {
            var36 = arg6;
        }
        if (arg7 < var35) {
            var35 = arg7;
        }
        if (arg7 > var36) {
            var36 = arg7;
        }
        if (arg8 < var35) {
            var35 = arg8;
        }
        if (arg8 > var36) {
            var36 = arg8;
        }
        int var37 = var35 / 14;
        int var38 = var36 / 14;
    }
}
