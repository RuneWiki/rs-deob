import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class class43 {

    @OriginalMember(owner = "eb", name = "e", descriptor = "Z")
    public boolean field891 = true;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "eb", name = "b", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "eb", name = "k", descriptor = "[I")
    public int[] field897;

    @OriginalMember(owner = "eb", name = "l", descriptor = "[I")
    public int[] field898;

    @OriginalMember(owner = "eb", name = "t", descriptor = "[I")
    public int[] field906;

    @OriginalMember(owner = "eb", name = "v", descriptor = "[I")
    public int[] field908;

    @OriginalMember(owner = "eb", name = "j", descriptor = "[I")
    public int[] field896;

    @OriginalMember(owner = "eb", name = "u", descriptor = "[I")
    public int[] field907;

    @OriginalMember(owner = "eb", name = "c", descriptor = "[I")
    public int[] field889;

    @OriginalMember(owner = "eb", name = "q", descriptor = "[I")
    public int[] field903;

    @OriginalMember(owner = "eb", name = "o", descriptor = "[I")
    public int[] field901;

    @OriginalMember(owner = "eb", name = "h", descriptor = "[I")
    public int[] field894;

    @OriginalMember(owner = "eb", name = "g", descriptor = "[[I")
    private static int[][] field893 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "eb", name = "i", descriptor = "[I")
    public static int[] field895 = new int[6];

    @OriginalMember(owner = "eb", name = "d", descriptor = "[[I")
    private static int[][] field890 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "eb", name = "f", descriptor = "[I")
    public static int[] field892 = new int[6];

    @OriginalMember(owner = "eb", name = "a", descriptor = "[I")
    public static int[] field887 = new int[6];

    @OriginalMember(owner = "eb", name = "p", descriptor = "[I")
    public static int[] field902 = new int[6];

    @OriginalMember(owner = "eb", name = "m", descriptor = "[I")
    public static int[] field899 = new int[6];

    @OriginalMember(owner = "eb", name = "a", descriptor = "()V")
    public static void method307() {
        field892 = null;
        field887 = null;
        field895 = null;
        field899 = null;
        field902 = null;
        field893 = null;
        field890 = null;
    }

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field891 = false;
        }
        this.field905 = arg0;
        this.field900 = arg1;
        this.field888 = arg17;
        this.field904 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field893[arg0];
        int var25 = var24.length;
        this.field897 = new int[var25];
        this.field898 = new int[var25];
        this.field906 = new int[var25];
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
            this.field897[var30] = var44;
            this.field898[var30] = var46;
            this.field906[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field890[arg0];
        int var32 = var31.length / 4;
        this.field908 = new int[var32];
        this.field896 = new int[var32];
        this.field907 = new int[var32];
        this.field889 = new int[var32];
        this.field903 = new int[var32];
        this.field901 = new int[var32];
        if (arg2 != -1) {
            this.field894 = new int[var32];
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
            this.field908[var34] = var40;
            this.field896[var34] = var41;
            this.field907[var34] = var42;
            if (var39 == 0) {
                this.field889[var34] = var26[var40];
                this.field903[var34] = var26[var41];
                this.field901[var34] = var26[var42];
                if (this.field894 != null) {
                    this.field894[var34] = -1;
                }
            } else {
                this.field889[var34] = var27[var40];
                this.field903[var34] = var27[var41];
                this.field901[var34] = var27[var42];
                if (this.field894 != null) {
                    this.field894[var34] = arg2;
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
