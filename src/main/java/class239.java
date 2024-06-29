import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class239 {

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public boolean field3498 = true;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public int[] field3499;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "[I")
    public int[] field3504;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
    public int[] field3505;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "[I")
    public int[] field3509;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
    public int[] field3497;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public int[] field3493;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public int[] field3490;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[I")
    public int[] field3503;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "[I")
    public int[] field3506;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public int[] field3494;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
    public static int[] field3489 = new int[6];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[[I")
    private static int[][] field3495 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[[I")
    private static int[][] field3492 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    public static int[] field3501 = new int[6];

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[I")
    public static int[] field3508 = new int[6];

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[I")
    public static int[] field3500 = new int[6];

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
    public static int[] field3510 = new int[6];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public static void method1638() {
        field3501 = null;
        field3508 = null;
        field3510 = null;
        field3489 = null;
        field3500 = null;
        field3495 = null;
        field3492 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field3498 = false;
        }
        this.field3507 = arg0;
        this.field3502 = arg1;
        this.field3496 = arg17;
        this.field3491 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field3495[arg0];
        int var25 = var24.length;
        this.field3499 = new int[var25];
        this.field3504 = new int[var25];
        this.field3505 = new int[var25];
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
            this.field3499[var30] = var44;
            this.field3504[var30] = var46;
            this.field3505[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field3492[arg0];
        int var32 = var31.length / 4;
        this.field3509 = new int[var32];
        this.field3497 = new int[var32];
        this.field3493 = new int[var32];
        this.field3490 = new int[var32];
        this.field3503 = new int[var32];
        this.field3506 = new int[var32];
        if (arg2 != -1) {
            this.field3494 = new int[var32];
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
            this.field3509[var34] = var40;
            this.field3497[var34] = var41;
            this.field3493[var34] = var42;
            if (var39 == 0) {
                this.field3490[var34] = var26[var40];
                this.field3503[var34] = var26[var41];
                this.field3506[var34] = var26[var42];
                if (this.field3494 != null) {
                    this.field3494[var34] = -1;
                }
            } else {
                this.field3490[var34] = var27[var40];
                this.field3503[var34] = var27[var41];
                this.field3506[var34] = var27[var42];
                if (this.field3494 != null) {
                    this.field3494[var34] = arg2;
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
