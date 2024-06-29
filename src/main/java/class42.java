import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 {

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
    public boolean field697 = true;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[I")
    public int[] field703;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    public int[] field695;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    public int[] field688;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    public int[] field690;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
    public int[] field699;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    public int[] field698;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[I")
    public int[] field691;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
    public int[] field693;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
    public int[] field689;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field683 = new int[6];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field687 = new int[6];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
    public static int[] field692 = new int[6];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field686 = new int[6];

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    public static int[] field702 = new int[6];

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[[I")
    private static int[][] field704 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[[I")
    private static int[][] field684 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public static void method335() {
        field702 = null;
        field683 = null;
        field692 = null;
        field686 = null;
        field687 = null;
        field704 = null;
        field684 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field697 = false;
        }
        this.field701 = arg0;
        this.field694 = arg1;
        this.field696 = arg17;
        this.field700 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field704[arg0];
        int var25 = var24.length;
        this.field703 = new int[var25];
        this.field685 = new int[var25];
        this.field695 = new int[var25];
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
            this.field703[var30] = var44;
            this.field685[var30] = var46;
            this.field695[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field684[arg0];
        int var32 = var31.length / 4;
        this.field688 = new int[var32];
        this.field690 = new int[var32];
        this.field699 = new int[var32];
        this.field698 = new int[var32];
        this.field691 = new int[var32];
        this.field693 = new int[var32];
        if (arg2 != -1) {
            this.field689 = new int[var32];
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
            this.field688[var34] = var40;
            this.field690[var34] = var41;
            this.field699[var34] = var42;
            if (var39 == 0) {
                this.field698[var34] = var26[var40];
                this.field691[var34] = var26[var41];
                this.field693[var34] = var26[var42];
                if (this.field689 != null) {
                    this.field689[var34] = -1;
                }
            } else {
                this.field698[var34] = var27[var40];
                this.field691[var34] = var27[var41];
                this.field693[var34] = var27[var42];
                if (this.field689 != null) {
                    this.field689[var34] = arg2;
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
