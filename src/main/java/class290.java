import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class290 {

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Z")
    public boolean field4560 = true;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    public int[] field4555;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[I")
    public int[] field4553;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[I")
    public int[] field4552;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "[I")
    public int[] field4550;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "[I")
    public int[] field4562;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    public int[] field4561;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public int[] field4544;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
    public int[] field4551;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public int[] field4557;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
    public int[] field4548;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[[I")
    private static int[][] field4541 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    public static int[] field4547 = new int[6];

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field4545 = new int[6];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[I")
    public static int[] field4554 = new int[6];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    public static int[] field4543 = new int[6];

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[[I")
    private static int[][] field4558 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[I")
    public static int[] field4556 = new int[6];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V", line = 14)
    public static void method2070() {
        field4545 = null;
        field4554 = null;
        field4543 = null;
        field4556 = null;
        field4547 = null;
        field4541 = (int[][]) null;
        field4558 = (int[][]) null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 76)
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field4560 = false;
        }
        this.field4559 = arg0;
        this.field4546 = arg1;
        this.field4549 = arg17;
        this.field4542 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field4541[arg0];
        int var25 = var24.length;
        this.field4555 = new int[var25];
        this.field4553 = new int[var25];
        this.field4552 = new int[var25];
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
            this.field4555[var30] = var32;
            this.field4553[var30] = var34;
            this.field4552[var30] = var33;
            var26[var30] = var35;
            var27[var30] = var36;
        }
        int[] var37 = field4558[arg0];
        int var38 = var37.length / 4;
        this.field4550 = new int[var38];
        this.field4562 = new int[var38];
        this.field4561 = new int[var38];
        this.field4544 = new int[var38];
        this.field4551 = new int[var38];
        this.field4557 = new int[var38];
        if (arg2 != -1) {
            this.field4548 = new int[var38];
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
            this.field4550[var40] = var42;
            this.field4562[var40] = var43;
            this.field4561[var40] = var44;
            if (var41 == 0) {
                this.field4544[var40] = var26[var42];
                this.field4551[var40] = var26[var43];
                this.field4557[var40] = var26[var44];
                if (this.field4548 != null) {
                    this.field4548[var40] = -1;
                }
            } else {
                this.field4544[var40] = var27[var42];
                this.field4551[var40] = var27[var43];
                this.field4557[var40] = var27[var44];
                if (this.field4548 != null) {
                    this.field4548[var40] = arg2;
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
