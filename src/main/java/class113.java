import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class113 {

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Z")
    public boolean field1968 = true;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[I")
    public int[] field1972;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
    public int[] field1959;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    public int[] field1958;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
    public int[] field1970;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
    public int[] field1954;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    public int[] field1962;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public int[] field1965;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[I")
    public int[] field1971;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    public int[] field1963;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
    public int[] field1975;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[[I")
    private static int[][] field1961 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    public static int[] field1964 = new int[6];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    public static int[] field1957 = new int[6];

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public static int[] field1966 = new int[6];

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
    public static int[] field1956 = new int[6];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[I")
    public static int[] field1969 = new int[6];

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[[I")
    private static int[][] field1974 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 32)
    public static void method849() {
        field1956 = null;
        field1969 = null;
        field1964 = null;
        field1966 = null;
        field1957 = null;
        field1961 = (int[][]) null;
        field1974 = (int[][]) null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field1968 = false;
        }
        this.field1955 = arg0;
        this.field1960 = arg1;
        this.field1967 = arg17;
        this.field1973 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field1961[arg0];
        int var25 = var24.length;
        this.field1972 = new int[var25];
        this.field1959 = new int[var25];
        this.field1958 = new int[var25];
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
            this.field1972[var30] = var32;
            this.field1959[var30] = var34;
            this.field1958[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field1974[arg0];
        int var38 = var37.length / 4;
        this.field1970 = new int[var38];
        this.field1954 = new int[var38];
        this.field1962 = new int[var38];
        this.field1965 = new int[var38];
        this.field1971 = new int[var38];
        this.field1963 = new int[var38];
        if (arg2 != -1) {
            this.field1975 = new int[var38];
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
            this.field1970[var40] = var42;
            this.field1954[var40] = var43;
            this.field1962[var40] = var44;
            if (var41 == 0) {
                this.field1965[var40] = var26[var42];
                this.field1971[var40] = var26[var43];
                this.field1963[var40] = var26[var44];
                if (this.field1975 != null) {
                    this.field1975[var40] = -1;
                }
            } else {
                this.field1965[var40] = var27[var42];
                this.field1971[var40] = var27[var43];
                this.field1963[var40] = var27[var44];
                if (this.field1975 != null) {
                    this.field1975[var40] = arg2;
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
