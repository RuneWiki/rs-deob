import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("i")
public class TileOverlay {

    @OriginalMember(owner = "i", name = "k", descriptor = "Z")
    public boolean field178 = true;

    @OriginalMember(owner = "i", name = "l", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "i", name = "m", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "i", name = "n", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "i", name = "o", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "i", name = "a", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "i", name = "b", descriptor = "[I")
    public int[] field169;

    @OriginalMember(owner = "i", name = "c", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "i", name = "g", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "i", name = "h", descriptor = "[I")
    public int[] field175;

    @OriginalMember(owner = "i", name = "i", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "i", name = "d", descriptor = "[I")
    public int[] field171;

    @OriginalMember(owner = "i", name = "e", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "i", name = "f", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "i", name = "j", descriptor = "[I")
    public int[] field177;

    @OriginalMember(owner = "i", name = "p", descriptor = "[I")
    public static int[] field183 = new int[6];

    @OriginalMember(owner = "i", name = "q", descriptor = "[I")
    public static int[] field184 = new int[6];

    @OriginalMember(owner = "i", name = "r", descriptor = "[I")
    public static int[] field185 = new int[6];

    @OriginalMember(owner = "i", name = "s", descriptor = "[I")
    public static int[] field186 = new int[6];

    @OriginalMember(owner = "i", name = "t", descriptor = "[I")
    public static int[] field187 = new int[6];

    @OriginalMember(owner = "i", name = "u", descriptor = "[I")
    public static int[] field188 = new int[] { 1, 0 };

    @OriginalMember(owner = "i", name = "v", descriptor = "[I")
    public static int[] field189 = new int[] { 2, 1 };

    @OriginalMember(owner = "i", name = "w", descriptor = "[I")
    public static int[] field190 = new int[] { 3, 3 };

    @OriginalMember(owner = "i", name = "x", descriptor = "[[I")
    public static final int[][] field191 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "i", name = "y", descriptor = "[[I")
    public static final int[][] field192 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "i", name = "<init>", descriptor = "(IZIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg5 != arg12 || arg5 != arg9 || arg5 != arg15) {
            this.field178 = false;
        }
        this.field179 = arg19;
        if (!arg1) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        this.field180 = arg8;
        this.field181 = arg11;
        this.field182 = arg16;
        short var22 = 128;
        int var23 = var22 / 2;
        int var24 = var22 / 4;
        int var25 = var22 * 3 / 4;
        int[] var26 = field191[arg19];
        int var27 = var26.length;
        this.field168 = new int[var27];
        this.field169 = new int[var27];
        this.field170 = new int[var27];
        int[] var28 = new int[var27];
        int[] var29 = new int[var27];
        int var30 = arg7 * var22;
        int var31 = arg10 * var22;
        for (int var32 = 0; var32 < var27; var32++) {
            int var45 = var26[var32];
            if ((var45 & 0x1) == 0 && var45 <= 8) {
                var45 = (var45 - arg8 - arg8 - 1 & 0x7) + 1;
            }
            if (var45 > 8 && var45 <= 12) {
                var45 = (var45 - arg8 - 9 & 0x3) + 9;
            }
            if (var45 > 12 && var45 <= 16) {
                var45 = (var45 - arg8 - 13 & 0x3) + 13;
            }
            int var46;
            int var47;
            int var48;
            int var49;
            int var50;
            if (var45 == 1) {
                var46 = var30;
                var47 = var31;
                var48 = arg5;
                var49 = arg4;
                var50 = arg18;
            } else if (var45 == 2) {
                var46 = var23 + var30;
                var47 = var31;
                var48 = arg5 + arg12 >> 1;
                var49 = arg3 + arg4 >> 1;
                var50 = arg13 + arg18 >> 1;
            } else if (var45 == 3) {
                var46 = var22 + var30;
                var47 = var31;
                var48 = arg12;
                var49 = arg3;
                var50 = arg13;
            } else if (var45 == 4) {
                var46 = var22 + var30;
                var47 = var23 + var31;
                var48 = arg9 + arg12 >> 1;
                var49 = arg3 + arg14 >> 1;
                var50 = arg6 + arg13 >> 1;
            } else if (var45 == 5) {
                var46 = var22 + var30;
                var47 = var22 + var31;
                var48 = arg9;
                var49 = arg14;
                var50 = arg6;
            } else if (var45 == 6) {
                var46 = var23 + var30;
                var47 = var22 + var31;
                var48 = arg9 + arg15 >> 1;
                var49 = arg14 + arg17 >> 1;
                var50 = arg0 + arg6 >> 1;
            } else if (var45 == 7) {
                var46 = var30;
                var47 = var22 + var31;
                var48 = arg15;
                var49 = arg17;
                var50 = arg0;
            } else if (var45 == 8) {
                var46 = var30;
                var47 = var23 + var31;
                var48 = arg5 + arg15 >> 1;
                var49 = arg4 + arg17 >> 1;
                var50 = arg0 + arg18 >> 1;
            } else if (var45 == 9) {
                var46 = var23 + var30;
                var47 = var24 + var31;
                var48 = arg5 + arg12 >> 1;
                var49 = arg3 + arg4 >> 1;
                var50 = arg13 + arg18 >> 1;
            } else if (var45 == 10) {
                var46 = var25 + var30;
                var47 = var23 + var31;
                var48 = arg9 + arg12 >> 1;
                var49 = arg3 + arg14 >> 1;
                var50 = arg6 + arg13 >> 1;
            } else if (var45 == 11) {
                var46 = var23 + var30;
                var47 = var25 + var31;
                var48 = arg9 + arg15 >> 1;
                var49 = arg14 + arg17 >> 1;
                var50 = arg0 + arg6 >> 1;
            } else if (var45 == 12) {
                var46 = var24 + var30;
                var47 = var23 + var31;
                var48 = arg5 + arg15 >> 1;
                var49 = arg4 + arg17 >> 1;
                var50 = arg0 + arg18 >> 1;
            } else if (var45 == 13) {
                var46 = var24 + var30;
                var47 = var24 + var31;
                var48 = arg5;
                var49 = arg4;
                var50 = arg18;
            } else if (var45 == 14) {
                var46 = var25 + var30;
                var47 = var24 + var31;
                var48 = arg12;
                var49 = arg3;
                var50 = arg13;
            } else if (var45 == 15) {
                var46 = var25 + var30;
                var47 = var25 + var31;
                var48 = arg9;
                var49 = arg14;
                var50 = arg6;
            } else {
                var46 = var24 + var30;
                var47 = var25 + var31;
                var48 = arg15;
                var49 = arg17;
                var50 = arg0;
            }
            this.field168[var32] = var46;
            this.field169[var32] = var48;
            this.field170[var32] = var47;
            var28[var32] = var49;
            var29[var32] = var50;
        }
        int[] var33 = field192[arg19];
        int var34 = var33.length / 4;
        this.field174 = new int[var34];
        this.field175 = new int[var34];
        this.field176 = new int[var34];
        this.field171 = new int[var34];
        this.field172 = new int[var34];
        this.field173 = new int[var34];
        if (arg2 != -1) {
            this.field177 = new int[var34];
        }
        int var35 = 0;
        for (int var36 = 0; var36 < var34; var36++) {
            int var41 = var33[var35];
            int var42 = var33[var35 + 1];
            int var43 = var33[var35 + 2];
            int var44 = var33[var35 + 3];
            var35 += 4;
            if (var42 < 4) {
                var42 = var42 - arg8 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg8 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg8 & 0x3;
            }
            this.field174[var36] = var42;
            this.field175[var36] = var43;
            this.field176[var36] = var44;
            if (var41 == 0) {
                this.field171[var36] = var28[var42];
                this.field172[var36] = var28[var43];
                this.field173[var36] = var28[var44];
                if (this.field177 != null) {
                    this.field177[var36] = -1;
                }
            } else {
                this.field171[var36] = var29[var42];
                this.field172[var36] = var29[var43];
                this.field173[var36] = var29[var44];
                if (this.field177 != null) {
                    this.field177[var36] = arg2;
                }
            }
        }
        int var37 = arg5;
        int var38 = arg12;
        if (arg12 < arg5) {
            var37 = arg12;
        }
        if (arg12 > arg12) {
            var38 = arg12;
        }
        if (arg9 < var37) {
            var37 = arg9;
        }
        if (arg9 > var38) {
            var38 = arg9;
        }
        if (arg15 < var37) {
            var37 = arg15;
        }
        if (arg15 > var38) {
            var38 = arg15;
        }
        int var39 = var37 / 14;
        int var40 = var38 / 14;
        if (Linkable.field363) {
        }
    }
}
