import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class144 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
    public boolean field1976 = true;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[I")
    public int[] field1986;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public int[] field1982;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public int[] field1980;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[I")
    public int[] field1969;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
    public int[] field1977;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[I")
    public int[] field1990;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    public int[] field1974;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public int[] field1970;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public int[] field1978;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[I")
    public int[] field1973;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field1972 = new int[6];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[I")
    public static int[] field1983 = new int[6];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public static int[] field1975 = new int[6];

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "[[I")
    private static int[][] field1987 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field1984 = new int[6];

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[[I")
    private static int[][] field1989 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[I")
    public static int[] field1988 = new int[6];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 14)
    public static void method1040() {
        field1984 = null;
        field1972 = null;
        field1988 = null;
        field1983 = null;
        field1975 = null;
        field1989 = (int[][]) null;
        field1987 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field1976 = false;
        }
        this.field1985 = arg0;
        this.field1971 = arg1;
        this.field1979 = arg17;
        this.field1981 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field1989[arg0];
        int var25 = var24.length;
        this.field1986 = new int[var25];
        this.field1982 = new int[var25];
        this.field1980 = new int[var25];
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
            this.field1986[var30] = var32;
            this.field1982[var30] = var34;
            this.field1980[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field1987[arg0];
        int var38 = var37.length / 4;
        this.field1969 = new int[var38];
        this.field1977 = new int[var38];
        this.field1990 = new int[var38];
        this.field1974 = new int[var38];
        this.field1970 = new int[var38];
        this.field1978 = new int[var38];
        if (arg2 != -1) {
            this.field1973 = new int[var38];
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
            this.field1969[var40] = var42;
            this.field1977[var40] = var43;
            this.field1990[var40] = var44;
            if (var41 == 0) {
                this.field1974[var40] = var26[var42];
                this.field1970[var40] = var26[var43];
                this.field1978[var40] = var26[var44];
                if (this.field1973 != null) {
                    this.field1973[var40] = -1;
                }
            } else {
                this.field1974[var40] = var27[var42];
                this.field1970[var40] = var27[var43];
                this.field1978[var40] = var27[var44];
                if (this.field1973 != null) {
                    this.field1973[var40] = arg2;
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
