import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class153 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Z")
    public boolean field2941 = true;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public int[] field2936;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
    public int[] field2951;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    public int[] field2943;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
    public int[] field2950;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[I")
    public int[] field2937;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public int[] field2938;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[I")
    public int[] field2956;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    public int[] field2939;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[I")
    public int[] field2954;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[I")
    public int[] field2949;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field2940 = new int[6];

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[I")
    public static int[] field2946 = new int[6];

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[I")
    public static int[] field2944 = new int[6];

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[[I")
    private static int[][] field2952 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
    public static int[] field2955 = new int[6];

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[I")
    public static int[] field2957 = new int[6];

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[[I")
    private static int[][] field2948 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public static void method1003() {
        field2944 = null;
        field2955 = null;
        field2946 = null;
        field2957 = null;
        field2940 = null;
        field2948 = null;
        field2952 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2941 = false;
        }
        this.field2953 = arg0;
        this.field2942 = arg1;
        this.field2945 = arg17;
        this.field2947 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2948[arg0];
        int var25 = var24.length;
        this.field2936 = new int[var25];
        this.field2951 = new int[var25];
        this.field2943 = new int[var25];
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
            this.field2936[var30] = var44;
            this.field2951[var30] = var46;
            this.field2943[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field2952[arg0];
        int var32 = var31.length / 4;
        this.field2950 = new int[var32];
        this.field2937 = new int[var32];
        this.field2938 = new int[var32];
        this.field2956 = new int[var32];
        this.field2939 = new int[var32];
        this.field2954 = new int[var32];
        if (arg2 != -1) {
            this.field2949 = new int[var32];
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
            this.field2950[var34] = var40;
            this.field2937[var34] = var41;
            this.field2938[var34] = var42;
            if (var39 == 0) {
                this.field2956[var34] = var26[var40];
                this.field2939[var34] = var26[var41];
                this.field2954[var34] = var26[var42];
                if (this.field2949 != null) {
                    this.field2949[var34] = -1;
                }
            } else {
                this.field2956[var34] = var27[var40];
                this.field2939[var34] = var27[var41];
                this.field2954[var34] = var27[var42];
                if (this.field2949 != null) {
                    this.field2949[var34] = arg2;
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
