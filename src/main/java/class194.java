import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class194 {

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Z")
    public boolean field3091 = true;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[I")
    public int[] field3081;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[I")
    public int[] field3084;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
    public int[] field3092;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[I")
    public int[] field3083;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "[I")
    public int[] field3098;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
    public int[] field3082;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "[I")
    public int[] field3097;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
    public int[] field3089;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[I")
    public int[] field3079;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "[I")
    public int[] field3095;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[I")
    public static int[] field3085 = new int[6];

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "[[I")
    private static int[][] field3087 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[I")
    public static int[] field3078 = new int[6];

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "[I")
    public static int[] field3090 = new int[6];

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[I")
    public static int[] field3093 = new int[6];

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "[[I")
    private static int[][] field3096 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "[I")
    public static int[] field3088 = new int[6];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 17)
    public static void method1423() {
        field3093 = null;
        field3088 = null;
        field3090 = null;
        field3085 = null;
        field3078 = null;
        field3087 = (int[][]) null;
        field3096 = (int[][]) null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field3091 = false;
        }
        this.field3077 = arg0;
        this.field3080 = arg1;
        this.field3094 = arg17;
        this.field3086 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field3087[arg0];
        int var25 = var24.length;
        this.field3081 = new int[var25];
        this.field3084 = new int[var25];
        this.field3092 = new int[var25];
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
            this.field3081[var30] = var32;
            this.field3084[var30] = var34;
            this.field3092[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field3096[arg0];
        int var38 = var37.length / 4;
        this.field3083 = new int[var38];
        this.field3098 = new int[var38];
        this.field3082 = new int[var38];
        this.field3097 = new int[var38];
        this.field3089 = new int[var38];
        this.field3079 = new int[var38];
        if (arg2 != -1) {
            this.field3095 = new int[var38];
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
            this.field3083[var40] = var42;
            this.field3098[var40] = var43;
            this.field3082[var40] = var44;
            if (var41 == 0) {
                this.field3097[var40] = var26[var42];
                this.field3089[var40] = var26[var43];
                this.field3079[var40] = var26[var44];
                if (this.field3095 != null) {
                    this.field3095[var40] = -1;
                }
            } else {
                this.field3097[var40] = var27[var42];
                this.field3089[var40] = var27[var43];
                this.field3079[var40] = var27[var44];
                if (this.field3095 != null) {
                    this.field3095[var40] = arg2;
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
