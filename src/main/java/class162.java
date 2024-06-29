import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class162 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Z")
    public boolean field2754 = true;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[I")
    public int[] field2766;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    public int[] field2752;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
    public int[] field2762;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
    public int[] field2760;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public int[] field2751;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[I")
    public int[] field2769;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
    public int[] field2761;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[I")
    public int[] field2765;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "[I")
    public int[] field2771;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[[I")
    private static int[][] field2759 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    public static int[] field2753 = new int[6];

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[I")
    public static int[] field2763 = new int[6];

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[I")
    public static int[] field2764 = new int[6];

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "[I")
    public static int[] field2756 = new int[6];

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[[I")
    private static int[][] field2767 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "[I")
    public static int[] field2772 = new int[6];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 16)
    public static void method1267() {
        field2772 = null;
        field2753 = null;
        field2764 = null;
        field2756 = null;
        field2763 = null;
        field2759 = (int[][]) null;
        field2767 = (int[][]) null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 73)
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2754 = false;
        }
        this.field2768 = arg0;
        this.field2757 = arg1;
        this.field2755 = arg17;
        this.field2770 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2759[arg0];
        int var25 = var24.length;
        this.field2766 = new int[var25];
        this.field2752 = new int[var25];
        this.field2762 = new int[var25];
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
            this.field2766[var30] = var32;
            this.field2752[var30] = var34;
            this.field2762[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field2767[arg0];
        int var38 = var37.length / 4;
        this.field2760 = new int[var38];
        this.field2751 = new int[var38];
        this.field2769 = new int[var38];
        this.field2761 = new int[var38];
        this.field2765 = new int[var38];
        this.field2758 = new int[var38];
        if (arg2 != -1) {
            this.field2771 = new int[var38];
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
            this.field2760[var40] = var42;
            this.field2751[var40] = var43;
            this.field2769[var40] = var44;
            if (var41 == 0) {
                this.field2761[var40] = var26[var42];
                this.field2765[var40] = var26[var43];
                this.field2758[var40] = var26[var44];
                if (this.field2771 != null) {
                    this.field2771[var40] = -1;
                }
            } else {
                this.field2761[var40] = var27[var42];
                this.field2765[var40] = var27[var43];
                this.field2758[var40] = var27[var44];
                if (this.field2771 != null) {
                    this.field2771[var40] = arg2;
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
