import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class139 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
    public boolean field2008 = true;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    public int[] field2011;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
    public int[] field2010;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field2021;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "[I")
    public int[] field2022;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
    public int[] field2024;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
    public int[] field2006;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[I")
    public int[] field2016;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
    public int[] field2007;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[I")
    public int[] field2019;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public int[] field2009;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
    public static int[] field2014 = new int[6];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
    public static int[] field2012 = new int[6];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[I")
    public static int[] field2005 = new int[6];

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[[I")
    private static int[][] field2020 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
    public static int[] field2026 = new int[6];

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "[I")
    public static int[] field2025 = new int[6];

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[[I")
    private static int[][] field2013 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public static void method930() {
        field2026 = null;
        field2012 = null;
        field2025 = null;
        field2014 = null;
        field2005 = null;
        field2013 = null;
        field2020 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2008 = false;
        }
        this.field2017 = arg0;
        this.field2015 = arg1;
        this.field2023 = arg17;
        this.field2018 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2013[arg0];
        int var25 = var24.length;
        this.field2011 = new int[var25];
        this.field2010 = new int[var25];
        this.field2021 = new int[var25];
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
            this.field2011[var30] = var44;
            this.field2010[var30] = var46;
            this.field2021[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field2020[arg0];
        int var32 = var31.length / 4;
        this.field2022 = new int[var32];
        this.field2024 = new int[var32];
        this.field2006 = new int[var32];
        this.field2016 = new int[var32];
        this.field2007 = new int[var32];
        this.field2019 = new int[var32];
        if (arg2 != -1) {
            this.field2009 = new int[var32];
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
            this.field2022[var34] = var40;
            this.field2024[var34] = var41;
            this.field2006[var34] = var42;
            if (var39 == 0) {
                this.field2016[var34] = var26[var40];
                this.field2007[var34] = var26[var41];
                this.field2019[var34] = var26[var42];
                if (this.field2009 != null) {
                    this.field2009[var34] = -1;
                }
            } else {
                this.field2016[var34] = var27[var40];
                this.field2007[var34] = var27[var41];
                this.field2019[var34] = var27[var42];
                if (this.field2009 != null) {
                    this.field2009[var34] = arg2;
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
