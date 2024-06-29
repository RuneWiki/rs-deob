import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class61 {

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Z")
    public boolean field1135 = true;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public int[] field1123;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
    public int[] field1139;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "[I")
    public int[] field1136;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[I")
    public int[] field1132;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[I")
    public int[] field1142;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
    public int[] field1143;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public int[] field1125;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public static int[] field1128 = new int[6];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    public static int[] field1122 = new int[6];

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[I")
    public static int[] field1137 = new int[6];

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
    public static int[] field1140 = new int[6];

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[[I")
    private static int[][] field1126 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[[I")
    private static int[][] field1129 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
    public static int[] field1138 = new int[6];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public static void method429() {
        field1140 = null;
        field1122 = null;
        field1138 = null;
        field1137 = null;
        field1128 = null;
        field1129 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field1135 = false;
        }
        this.field1124 = arg0;
        this.field1141 = arg1;
        this.field1133 = arg17;
        this.field1127 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field1129[arg0];
        int var25 = var24.length;
        this.field1123 = new int[var25];
        this.field1139 = new int[var25];
        this.field1136 = new int[var25];
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
            this.field1123[var30] = var44;
            this.field1139[var30] = var46;
            this.field1136[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field1126[arg0];
        int var32 = var31.length / 4;
        this.field1132 = new int[var32];
        this.field1130 = new int[var32];
        this.field1142 = new int[var32];
        this.field1143 = new int[var32];
        this.field1131 = new int[var32];
        this.field1125 = new int[var32];
        if (arg2 != -1) {
            this.field1134 = new int[var32];
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
            this.field1132[var34] = var40;
            this.field1130[var34] = var41;
            this.field1142[var34] = var42;
            if (var39 == 0) {
                this.field1143[var34] = var26[var40];
                this.field1131[var34] = var26[var41];
                this.field1125[var34] = var26[var42];
                if (this.field1134 != null) {
                    this.field1134[var34] = -1;
                }
            } else {
                this.field1143[var34] = var27[var40];
                this.field1131[var34] = var27[var41];
                this.field1125[var34] = var27[var42];
                if (this.field1134 != null) {
                    this.field1134[var34] = arg2;
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
