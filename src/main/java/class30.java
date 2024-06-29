import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class30 extends class91 {

    @OriginalMember(owner = "client!ci", name = "zb", descriptor = "B")
    private byte field555 = 0;

    @OriginalMember(owner = "client!ci", name = "Tb", descriptor = "I")
    private int field575 = 0;

    @OriginalMember(owner = "client!ci", name = "Db", descriptor = "[I")
    private int[] field559;

    @OriginalMember(owner = "client!ci", name = "ub", descriptor = "[I")
    private int[] field550;

    @OriginalMember(owner = "client!ci", name = "wb", descriptor = "[I")
    private int[] field552;

    @OriginalMember(owner = "client!ci", name = "tb", descriptor = "[B")
    private byte[] field549;

    @OriginalMember(owner = "client!ci", name = "Fb", descriptor = "[B")
    private byte[] field561;

    @OriginalMember(owner = "client!ci", name = "Xb", descriptor = "[I")
    private int[] field579;

    @OriginalMember(owner = "client!ci", name = "yb", descriptor = "[I")
    private int[] field554;

    @OriginalMember(owner = "client!ci", name = "vb", descriptor = "[I")
    private int[] field551;

    @OriginalMember(owner = "client!ci", name = "sb", descriptor = "[S")
    private short[] field548;

    @OriginalMember(owner = "client!ci", name = "xb", descriptor = "[I")
    private int[] field553;

    @OriginalMember(owner = "client!ci", name = "Bb", descriptor = "[I")
    private int[] field557;

    @OriginalMember(owner = "client!ci", name = "qb", descriptor = "[I")
    private int[] field546;

    @OriginalMember(owner = "client!ci", name = "Eb", descriptor = "[B")
    private byte[] field560;

    @OriginalMember(owner = "client!ci", name = "rb", descriptor = "Lci;")
    private static class30 field547 = new class30();

    @OriginalMember(owner = "client!ci", name = "Cb", descriptor = "[B")
    private static byte[] field558 = new byte[1];

    @OriginalMember(owner = "client!ci", name = "Ab", descriptor = "Lci;")
    private static class30 field556 = new class30();

    @OriginalMember(owner = "client!ci", name = "Kb", descriptor = "[I")
    private static int[] field566 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "Gb", descriptor = "[I")
    private static int[] field562 = class1.field21;

    @OriginalMember(owner = "client!ci", name = "Lb", descriptor = "[[I")
    private static int[][] field567 = new int[1600][512];

    @OriginalMember(owner = "client!ci", name = "Sb", descriptor = "[I")
    private static int[] field574 = new int[12];

    @OriginalMember(owner = "client!ci", name = "Ib", descriptor = "[I")
    private static int[] field564 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "Qb", descriptor = "[I")
    private static int[] field572 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "Rb", descriptor = "[I")
    private static int[] field573 = new int[12];

    @OriginalMember(owner = "client!ci", name = "Pb", descriptor = "[I")
    private static int[] field571 = new int[1600];

    @OriginalMember(owner = "client!ci", name = "Mb", descriptor = "[I")
    private static int[] field568 = class1.field8;

    @OriginalMember(owner = "client!ci", name = "Hb", descriptor = "[I")
    private static int[] field563 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "Jb", descriptor = "[I")
    private static int[] field565 = new int[2000];

    @OriginalMember(owner = "client!ci", name = "Yb", descriptor = "[I")
    private static int[] field580 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "Wb", descriptor = "[[I")
    private static int[][] field578 = new int[12][2000];

    @OriginalMember(owner = "client!ci", name = "ac", descriptor = "[I")
    private static int[] field582 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "ec", descriptor = "[I")
    private static int[] field586 = new int[10];

    @OriginalMember(owner = "client!ci", name = "Vb", descriptor = "[I")
    private static int[] field577 = new int[2000];

    @OriginalMember(owner = "client!ci", name = "Ob", descriptor = "[Z")
    private static boolean[] field570 = new boolean[4096];

    @OriginalMember(owner = "client!ci", name = "cc", descriptor = "[B")
    private static byte[] field584 = new byte[1];

    @OriginalMember(owner = "client!ci", name = "Ub", descriptor = "[I")
    private static int[] field576 = new int[10];

    @OriginalMember(owner = "client!ci", name = "Zb", descriptor = "[Z")
    private static boolean[] field581 = new boolean[4096];

    @OriginalMember(owner = "client!ci", name = "Nb", descriptor = "[I")
    private static int[] field569 = class1.field11;

    @OriginalMember(owner = "client!ci", name = "gc", descriptor = "[I")
    private static int[] field588 = new int[10];

    @OriginalMember(owner = "client!ci", name = "hc", descriptor = "[I")
    private static int[] field589 = class1.field3;

    @OriginalMember(owner = "client!ci", name = "bc", descriptor = "I")
    private static int field583;

    @OriginalMember(owner = "client!ci", name = "dc", descriptor = "I")
    private static int field585;

    @OriginalMember(owner = "client!ci", name = "fc", descriptor = "I")
    private static int field587;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method635();
            int var8 = class1.field7;
            int var9 = class1.field9;
            int var10 = field562[arg0];
            int var11 = field568[arg0];
            int var12 = field562[arg1];
            int var13 = field568[arg1];
            int var14 = field562[arg2];
            int var15 = field568[arg2];
            int var16 = field562[arg3];
            int var17 = field568[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field1963; ++var19) {
                int var20 = super.field1964[var19];
                int var21 = super.field1962[var19];
                int var22 = super.field1970[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field572[var19] = var30 - var18;
                field566[var19] = (var26 << 9) / var30 + var8;
                field564[var19] = (var29 << 9) / var30 + var9;
                if (this.field575 > 0) {
                    field582[var19] = var26;
                    field563[var19] = var29;
                    field580[var19] = var30;
                }
            }
            this.method178(false, false, 0L, super.field1961, super.field1961 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lj;ILj;I[I)V")
    public final void method175(class86 arg0, int arg1, class86 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class198 var6 = arg0.field1878[arg1];
                class198 var7 = arg2.field1878[arg3];
                class161 var8 = var6.field3927;
                field587 = 0;
                field585 = 0;
                field583 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field3923; ++var11) {
                    short var16 = var6.field3926[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3252[var16] == 0) {
                        if (var6.field3929[var11] != -1) {
                            this.method180(0, var8.field3260[var6.field3929[var11]], 0, 0, 0);
                        }
                        this.method180(var8.field3252[var16], var8.field3260[var16], var6.field3931[var11], var6.field3932[var11], var6.field3928[var11]);
                    }
                }
                field587 = 0;
                field585 = 0;
                field583 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field3923; ++var14) {
                    short var15 = var7.field3926[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3252[var15] == 0) {
                        if (var7.field3929[var14] != -1) {
                            this.method180(0, var8.field3260[var7.field3929[var14]], 0, 0, 0);
                        }
                        this.method180(var8.field3252[var15], var8.field3260[var15], var7.field3931[var14], var7.field3932[var14], var7.field3928[var14]);
                    }
                }
                super.field1967 = false;
            } else {
                this.method186(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)Lje;")
    public final class91 method176(boolean arg0) {
        if (!arg0 && field584.length < super.field1975) {
            field584 = new byte[super.field1975 + 100];
        }
        return this.method181(arg0, field556, field584);
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "()V")
    public static void method177() {
        field547 = null;
        field558 = null;
        field556 = null;
        field584 = null;
        field570 = null;
        field581 = null;
        field566 = null;
        field564 = null;
        field572 = null;
        field582 = null;
        field563 = null;
        field580 = null;
        field571 = null;
        field567 = null;
        field573 = null;
        field578 = null;
        field577 = null;
        field565 = null;
        field574 = null;
        field588 = null;
        field586 = null;
        field576 = null;
        field562 = null;
        field568 = null;
        field569 = null;
        field589 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZJII)V")
    private final void method178(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field571[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field1975; ++var8) {
                if (this.field551[var8] != -2) {
                    int var33 = this.field559[var8];
                    int var34 = this.field550[var8];
                    int var35 = this.field552[var8];
                    int var36 = field566[var33];
                    int var37 = field566[var34];
                    int var38 = field566[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method182(class91.field1966, class91.field1978, field564[var33], field564[var34], field564[var35], var36, var37, var38)) {
                            class91.field1959[class91.field1979++] = arg2;
                            arg1 = false;
                        }
                        if ((field564[var35] - field564[var34]) * (var36 - var37) - (field564[var33] - field564[var34]) * (var38 - var37) > 0) {
                            field581[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class1.field2 && var37 <= class1.field2 && var38 <= class1.field2) {
                                field570[var8] = false;
                            } else {
                                field570[var8] = true;
                            }
                            int var58 = (field572[var33] + field572[var34] + field572[var35]) / 3 + arg3;
                            field567[var58][field571[var58]++] = var8;
                        }
                    } else {
                        int var39 = field582[var33];
                        int var40 = field582[var34];
                        int var41 = field582[var35];
                        int var42 = field563[var33];
                        int var43 = field563[var34];
                        int var44 = field563[var35];
                        int var45 = field580[var33];
                        int var46 = field580[var34];
                        int var47 = field580[var35];
                        int var48 = var39 - var40;
                        int var49 = var41 - var40;
                        int var50 = var42 - var43;
                        int var51 = var44 - var43;
                        int var52 = var45 - var46;
                        int var53 = var47 - var46;
                        int var54 = var50 * var53 - var51 * var52;
                        int var55 = var49 * var52 - var48 * var53;
                        int var56 = var48 * var51 - var49 * var50;
                        if (var46 * var56 + var40 * var54 + var43 * var55 > 0) {
                            field581[var8] = true;
                            int var57 = (field572[var33] + field572[var34] + field572[var35]) / 3 + arg3;
                            field567[var57][field571[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field549 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field571[var9];
                    if (var10 > 0) {
                        int[] var11 = field567[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method189(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field573[var13] = 0;
                    field574[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field571[var14];
                    if (var27 > 0) {
                        int[] var28 = field567[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field549[var30];
                            int var32 = field573[var31]++;
                            field578[var31][var32] = var30;
                            if (var31 < 10) {
                                field574[var31] += var14;
                            } else if (var31 == 10) {
                                field577[var32] = var14;
                            } else {
                                field565[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field573[1] > 0 || field573[2] > 0) {
                    var15 = (field574[1] + field574[2]) / (field573[1] + field573[2]);
                }
                int var16 = 0;
                if (field573[3] > 0 || field573[4] > 0) {
                    var16 = (field574[3] + field574[4]) / (field573[3] + field573[4]);
                }
                int var17 = 0;
                if (field573[6] > 0 || field573[8] > 0) {
                    var17 = (field574[6] + field574[8]) / (field573[6] + field573[8]);
                }
                int var18 = 0;
                int var19 = field573[10];
                int[] var20 = field578[10];
                int[] var21 = field577;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field573[11];
                    var20 = field578[11];
                    var21 = field565;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method189(var20[var18++]);
                        if (var18 == var19 && field578[11] != var20) {
                            var18 = 0;
                            var19 = field573[11];
                            var20 = field578[11];
                            var21 = field565;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method189(var20[var18++]);
                        if (var18 == var19 && field578[11] != var20) {
                            var18 = 0;
                            var19 = field573[11];
                            var20 = field578[11];
                            var21 = field565;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method189(var20[var18++]);
                        if (var18 == var19 && field578[11] != var20) {
                            var18 = 0;
                            var19 = field573[11];
                            var20 = field578[11];
                            var21 = field565;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field573[var23];
                    int[] var25 = field578[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method189(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method189(var20[var18++]);
                    if (var18 == var19 && field578[11] != var20) {
                        var18 = 0;
                        var20 = field578[11];
                        var19 = field573[11];
                        var21 = field565;
                    }
                    if (var18 < var19) {
                        var22 = var21[var18];
                    } else {
                        var22 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(Z)Lje;")
    public final class91 method179(boolean arg0) {
        if (!arg0 && field558.length < super.field1975) {
            field558 = new byte[super.field1975 + 100];
        }
        return this.method181(arg0, field547, field558);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIII)V")
    private final void method180(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field587 = 0;
            field585 = 0;
            field583 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field1974.length) {
                    int[] var10 = super.field1974[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field587 += super.field1964[var12];
                        field585 += super.field1962[var12];
                        field583 += super.field1970[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field587 = field587 / var7 + arg2;
                field585 = field585 / var7 + arg3;
                field583 = field583 / var7 + arg4;
            } else {
                field587 = arg2;
                field585 = arg3;
                field583 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field1974.length) {
                    int[] var15 = super.field1974[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field1964[var17] += arg2;
                        super.field1962[var17] += arg3;
                        super.field1970[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field1974.length) {
                    int[] var20 = super.field1974[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field1964[var22] -= field587;
                        super.field1962[var22] -= field585;
                        super.field1970[var22] -= field583;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field562[var25];
                            int var27 = field568[var25];
                            int var28 = super.field1964[var22] * var27 + super.field1962[var22] * var26 + 32767 >> 16;
                            super.field1962[var22] = super.field1962[var22] * var27 - super.field1964[var22] * var26 + 32767 >> 16;
                            super.field1964[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field562[var23];
                            int var30 = field568[var23];
                            int var31 = super.field1962[var22] * var30 - super.field1970[var22] * var29 + 32767 >> 16;
                            super.field1970[var22] = super.field1970[var22] * var30 + super.field1962[var22] * var29 + 32767 >> 16;
                            super.field1962[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field562[var24];
                            int var33 = field568[var24];
                            int var34 = super.field1970[var22] * var32 + super.field1964[var22] * var33 + 32767 >> 16;
                            super.field1970[var22] = super.field1970[var22] * var33 - super.field1964[var22] * var32 + 32767 >> 16;
                            super.field1964[var22] = var34;
                        }
                        super.field1964[var22] += field587;
                        super.field1962[var22] += field585;
                        super.field1970[var22] += field583;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field1974.length) {
                    int[] var37 = super.field1974[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field1964[var39] -= field587;
                        super.field1962[var39] -= field585;
                        super.field1970[var39] -= field583;
                        super.field1964[var39] = super.field1964[var39] * arg2 / 128;
                        super.field1962[var39] = super.field1962[var39] * arg3 / 128;
                        super.field1970[var39] = super.field1970[var39] * arg4 / 128;
                        super.field1964[var39] += field587;
                        super.field1962[var39] += field585;
                        super.field1970[var39] += field583;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field1960 != null && this.field561 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field1960.length) {
                        int[] var42 = super.field1960[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field561[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field561[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLci;[B)Lci;")
    private final class30 method181(boolean arg0, class30 arg1, byte[] arg2) {
        arg1.field1963 = super.field1963;
        arg1.field1975 = super.field1975;
        arg1.field575 = this.field575;
        if (arg1.field1964 == null || arg1.field1964.length < super.field1963) {
            arg1.field1964 = new int[super.field1963 + 100];
            arg1.field1962 = new int[super.field1963 + 100];
            arg1.field1970 = new int[super.field1963 + 100];
        }
        for (int var4 = 0; var4 < super.field1963; ++var4) {
            arg1.field1964[var4] = super.field1964[var4];
            arg1.field1962[var4] = super.field1962[var4];
            arg1.field1970[var4] = super.field1970[var4];
        }
        if (arg0) {
            arg1.field561 = this.field561;
        } else {
            arg1.field561 = arg2;
            if (this.field561 == null) {
                for (int var5 = 0; var5 < super.field1975; ++var5) {
                    arg1.field561[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field1975; ++var6) {
                    arg1.field561[var6] = this.field561[var6];
                }
            }
        }
        arg1.field559 = this.field559;
        arg1.field550 = this.field550;
        arg1.field552 = this.field552;
        arg1.field579 = this.field579;
        arg1.field554 = this.field554;
        arg1.field551 = this.field551;
        arg1.field549 = this.field549;
        arg1.field560 = this.field560;
        arg1.field548 = this.field548;
        arg1.field555 = this.field555;
        arg1.field553 = this.field553;
        arg1.field557 = this.field557;
        arg1.field546 = this.field546;
        arg1.field1974 = super.field1974;
        arg1.field1960 = super.field1960;
        arg1.field1957 = super.field1957;
        arg1.field1967 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field1967) {
            this.method635();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field1971 * arg2 + super.field1965 * arg1 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field1971 * arg2 + super.field3376 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field1971 + var15 << 9;
                if (var16 / var13 > class1.field1) {
                    int var17 = var15 - super.field1971 << 9;
                    if (var17 / var13 < class1.field5) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field1971 * arg1 + super.field1965 * arg2 >> 16) + var18 << 9;
                        if (var19 / var13 > class1.field15) {
                            int var20 = (-super.field1971 * arg1 + super.field3376 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class1.field6) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field575 > 0;
                                int var24 = class1.field7;
                                int var25 = class1.field9;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field562[arg0];
                                    var27 = field568[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class91.field1972 && var14 > 0) {
                                    int var29;
                                    int var30;
                                    if (var15 > 0) {
                                        var29 = var17 / var13;
                                        var30 = var16 / var14;
                                    } else {
                                        var29 = var17 / var14;
                                        var30 = var16 / var13;
                                    }
                                    int var31;
                                    int var32;
                                    if (var18 > 0) {
                                        var31 = var20 / var13;
                                        var32 = var19 / var14;
                                    } else {
                                        var31 = var20 / var14;
                                        var32 = var19 / var13;
                                    }
                                    int var33 = class91.field1966 - class1.field7;
                                    int var34 = class91.field1978 - class1.field9;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field1969, super.field1958, super.field1969, super.field1958, super.field1969, super.field1958, super.field1969, super.field1958 };
                                        int[] var40 = new int[] { super.field1968, super.field1968, super.field1977, super.field1977, super.field1968, super.field1968, super.field1977, super.field1977 };
                                        int[] var41 = new int[] { super.field3376, super.field3376, super.field3376, super.field3376, super.field1965, super.field1965, super.field1965, super.field1965 };
                                        for (int var42 = 0; var42 < 8; ++var42) {
                                            int var43 = var39[var42];
                                            int var44 = var41[var42];
                                            int var45 = var40[var42];
                                            if (arg0 != 0) {
                                                int var46 = var26 * var45 + var27 * var43 >> 16;
                                                var45 = var27 * var45 - var26 * var43 >> 16;
                                                var43 = var46;
                                            }
                                            int var47 = arg5 + var43;
                                            int var48 = arg6 + var44;
                                            int var49 = arg7 + var45;
                                            int var50 = arg3 * var49 + arg4 * var47 >> 16;
                                            int var51 = arg4 * var49 - arg3 * var47 >> 16;
                                            int var53 = arg2 * var48 - arg1 * var51 >> 16;
                                            int var54 = arg1 * var48 + arg2 * var51 >> 16;
                                            if (var54 > 0) {
                                                int var56 = (var50 << 9) / var54;
                                                int var57 = (var53 << 9) / var54;
                                                if (var56 < var35) {
                                                    var35 = var56;
                                                }
                                                if (var56 > var36) {
                                                    var36 = var56;
                                                }
                                                if (var57 < var37) {
                                                    var37 = var57;
                                                }
                                                if (var57 > var38) {
                                                    var38 = var57;
                                                }
                                            }
                                        }
                                        if (var33 >= var35 && var33 <= var36 && var34 >= var37 && var34 <= var38) {
                                            if (super.field1957) {
                                                class91.field1959[class91.field1979++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field1963; ++var58) {
                                    int var59 = super.field1964[var58];
                                    int var60 = super.field1962[var58];
                                    int var61 = super.field1970[var58];
                                    if (arg0 != 0) {
                                        int var62 = var26 * var61 + var27 * var59 >> 16;
                                        var61 = var27 * var61 - var26 * var59 >> 16;
                                        var59 = var62;
                                    }
                                    int var63 = arg5 + var59;
                                    int var64 = arg6 + var60;
                                    int var65 = arg7 + var61;
                                    int var66 = arg3 * var65 + arg4 * var63 >> 16;
                                    int var67 = arg4 * var65 - arg3 * var63 >> 16;
                                    int var69 = arg2 * var64 - arg1 * var67 >> 16;
                                    int var70 = arg1 * var64 + arg2 * var67 >> 16;
                                    field572[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field566[var58] = (var66 << 9) / var70 + var24;
                                        field564[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field566[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field582[var58] = var66;
                                        field563[var58] = var69;
                                        field580[var58] = var70;
                                    }
                                }
                                try {
                                    this.method178(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)I")
    private static final int method184(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lje;)Lje;")
    public final class91 method185(class91 arg0) {
        return new class30(new class30[] { this, (class30) arg0 }, 2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lj;I)V")
    public final void method186(class86 arg0, int arg1) {
        if (super.field1974 != null) {
            if (arg1 != -1) {
                class198 var3 = arg0.field1878[arg1];
                class161 var4 = var3.field3927;
                field587 = 0;
                field585 = 0;
                field583 = 0;
                for (int var5 = 0; var5 < var3.field3923; ++var5) {
                    short var6 = var3.field3926[var5];
                    if (var3.field3929[var5] != -1) {
                        this.method180(0, var4.field3260[var3.field3929[var5]], 0, 0, 0);
                    }
                    this.method180(var4.field3252[var6], var4.field3260[var6], var3.field3931[var5], var3.field3932[var5], var3.field3928[var5]);
                }
                super.field1967 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([[IIIIZI)Lje;")
    public final class91 method187(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method635();
        int var7 = super.field1969 + arg1;
        int var8 = super.field1958 + arg1;
        int var9 = super.field1968 + arg3;
        int var10 = super.field1977 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class30 var15;
                if (arg4) {
                    var15 = new class30();
                    var15.field1963 = super.field1963;
                    var15.field1975 = super.field1975;
                    var15.field575 = this.field575;
                    var15.field1964 = super.field1964;
                    var15.field1970 = super.field1970;
                    var15.field559 = this.field559;
                    var15.field550 = this.field550;
                    var15.field552 = this.field552;
                    var15.field579 = this.field579;
                    var15.field554 = this.field554;
                    var15.field551 = this.field551;
                    var15.field549 = this.field549;
                    var15.field561 = this.field561;
                    var15.field560 = this.field560;
                    var15.field548 = this.field548;
                    var15.field555 = this.field555;
                    var15.field553 = this.field553;
                    var15.field557 = this.field557;
                    var15.field546 = this.field546;
                    var15.field1974 = super.field1974;
                    var15.field1960 = super.field1960;
                    var15.field1957 = super.field1957;
                    var15.field1962 = new int[var15.field1963];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field1963; ++var16) {
                        int var17 = super.field1964[var16] + arg1;
                        int var18 = super.field1970[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field1962[var16] = super.field1962[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field1963; ++var26) {
                        int var27 = (super.field1962[var26] << 16) / super.field3376;
                        if (var27 < arg5) {
                            int var28 = super.field1964[var26] + arg1;
                            int var29 = super.field1970[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field1962[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field1962[var26];
                        } else {
                            var15.field1962[var26] = super.field1962[var26];
                        }
                    }
                }
                super.field1967 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V")
    private final void method188(int arg0) {
        int var2 = class1.field7;
        int var3 = class1.field9;
        int var4 = 0;
        int var5 = this.field559[arg0];
        int var6 = this.field550[arg0];
        int var7 = this.field552[arg0];
        int var8 = field580[var5];
        int var9 = field580[var6];
        int var10 = field580[var7];
        if (this.field561 == null) {
            class1.field10 = 0;
        } else {
            class1.field10 = this.field561[arg0] & 255;
        }
        if (var8 >= 50) {
            field588[var4] = field566[var5];
            field586[var4] = field564[var5];
            field576[var4++] = this.field579[arg0];
        } else {
            int var11 = field582[var5];
            int var12 = field563[var5];
            int var13 = this.field579[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field589[var10 - var8];
                field588[var4] = (((field582[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field586[var4] = (((field563[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field576[var4++] = ((this.field551[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field589[var9 - var8];
                field588[var4] = (((field582[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field586[var4] = (((field563[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field576[var4++] = ((this.field554[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field588[var4] = field566[var6];
            field586[var4] = field564[var6];
            field576[var4++] = this.field554[arg0];
        } else {
            int var16 = field582[var6];
            int var17 = field563[var6];
            int var18 = this.field554[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field589[var8 - var9];
                field588[var4] = (((field582[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field586[var4] = (((field563[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field576[var4++] = ((this.field579[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field589[var10 - var9];
                field588[var4] = (((field582[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field586[var4] = (((field563[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field576[var4++] = ((this.field551[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field588[var4] = field566[var7];
            field586[var4] = field564[var7];
            field576[var4++] = this.field551[arg0];
        } else {
            int var21 = field582[var7];
            int var22 = field563[var7];
            int var23 = this.field551[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field589[var9 - var10];
                field588[var4] = (((field582[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field586[var4] = (((field563[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field576[var4++] = ((this.field554[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field589[var8 - var10];
                field588[var4] = (((field582[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field586[var4] = (((field563[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field576[var4++] = ((this.field579[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field588[0];
        int var27 = field588[1];
        int var28 = field588[2];
        int var29 = field586[0];
        int var30 = field586[1];
        int var31 = field586[2];
        class1.field18 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class1.field2 || var27 > class1.field2 || var28 > class1.field2) {
                class1.field18 = true;
            }
            if (this.field548 != null && this.field548[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field560 != null && this.field560[arg0] != -1) {
                    int var32 = this.field560[arg0] & 255;
                    var33 = this.field553[var32];
                    var34 = this.field557[var32];
                    var35 = this.field546[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field551[arg0] == -1) {
                    class1.method18(var29, var30, var31, var26, var27, var28, this.field579[arg0], this.field579[arg0], this.field579[arg0], field582[var33], field582[var34], field582[var35], field563[var33], field563[var34], field563[var35], field580[var33], field580[var34], field580[var35], this.field548[arg0]);
                } else {
                    class1.method18(var29, var30, var31, var26, var27, var28, field576[0], field576[1], field576[2], field582[var33], field582[var34], field582[var35], field563[var33], field563[var34], field563[var35], field580[var33], field580[var34], field580[var35], this.field548[arg0]);
                }
            } else if (this.field551[arg0] == -1) {
                class1.method10(var29, var30, var31, var26, var27, var28, field569[this.field579[arg0]]);
            } else {
                class1.method5(var29, var30, var31, var26, var27, var28, field576[0], field576[1], field576[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class1.field2 || var27 > class1.field2 || var28 > class1.field2 || field588[3] < 0 || field588[3] > class1.field2) {
                class1.field18 = true;
            }
            if (this.field548 == null || this.field548[arg0] == -1) {
                if (this.field551[arg0] == -1) {
                    int var41 = field569[this.field579[arg0]];
                    class1.method10(var29, var30, var31, var26, var27, var28, var41);
                    class1.method10(var29, var31, field586[3], var26, var28, field588[3], var41);
                    return;
                }
                class1.method5(var29, var30, var31, var26, var27, var28, field576[0], field576[1], field576[2]);
                class1.method5(var29, var31, field586[3], var26, var28, field588[3], field576[0], field576[2], field576[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field560 != null && this.field560[arg0] != -1) {
                int var36 = this.field560[arg0] & 255;
                var37 = this.field553[var36];
                var38 = this.field557[var36];
                var39 = this.field546[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field548[arg0];
            if (this.field551[arg0] == -1) {
                class1.method18(var29, var30, var31, var26, var27, var28, this.field579[arg0], this.field579[arg0], this.field579[arg0], field582[var37], field582[var38], field582[var39], field563[var37], field563[var38], field563[var39], field580[var37], field580[var38], field580[var39], var40);
                class1.method18(var29, var31, field586[3], var26, var28, field588[3], this.field579[arg0], this.field579[arg0], this.field579[arg0], field582[var37], field582[var38], field582[var39], field563[var37], field563[var38], field563[var39], field580[var37], field580[var38], field580[var39], var40);
                return;
            }
            class1.method18(var29, var30, var31, var26, var27, var28, field576[0], field576[1], field576[2], field582[var37], field582[var38], field582[var39], field563[var37], field563[var38], field563[var39], field580[var37], field580[var38], field580[var39], var40);
            class1.method18(var29, var31, field586[3], var26, var28, field588[3], field576[0], field576[2], field576[3], field582[var37], field582[var38], field582[var39], field563[var37], field563[var38], field563[var39], field580[var37], field580[var38], field580[var39], var40);
        }
    }

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "(I)V")
    private final void method189(int arg0) {
        if (field581[arg0]) {
            this.method188(arg0);
        } else {
            int var2 = this.field559[arg0];
            int var3 = this.field550[arg0];
            int var4 = this.field552[arg0];
            class1.field18 = field570[arg0];
            if (this.field561 == null) {
                class1.field10 = 0;
            } else {
                class1.field10 = this.field561[arg0] & 255;
            }
            if (this.field548 != null && this.field548[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field560 != null && this.field560[arg0] != -1) {
                    int var5 = this.field560[arg0] & 255;
                    var6 = this.field553[var5];
                    var7 = this.field557[var5];
                    var8 = this.field546[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field551[arg0] == -1) {
                    class1.method18(field564[var2], field564[var3], field564[var4], field566[var2], field566[var3], field566[var4], this.field579[arg0], this.field579[arg0], this.field579[arg0], field582[var6], field582[var7], field582[var8], field563[var6], field563[var7], field563[var8], field580[var6], field580[var7], field580[var8], this.field548[arg0]);
                } else {
                    class1.method18(field564[var2], field564[var3], field564[var4], field566[var2], field566[var3], field566[var4], this.field579[arg0], this.field554[arg0], this.field551[arg0], field582[var6], field582[var7], field582[var8], field563[var6], field563[var7], field563[var8], field580[var6], field580[var7], field580[var8], this.field548[arg0]);
                }
            } else if (this.field551[arg0] == -1) {
                class1.method10(field564[var2], field564[var3], field564[var4], field566[var2], field566[var3], field566[var4], field569[this.field579[arg0]]);
            } else {
                class1.method5(field564[var2], field564[var3], field564[var4], field566[var2], field566[var3], field566[var4], this.field579[arg0], this.field554[arg0], this.field551[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method635();
            int var9 = class1.field7;
            int var10 = class1.field9;
            int var11 = field562[arg0];
            int var12 = field568[arg0];
            int var13 = field562[arg1];
            int var14 = field568[arg1];
            int var15 = field562[arg2];
            int var16 = field568[arg2];
            int var17 = field562[arg3];
            int var18 = field568[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field1963; ++var20) {
                int var21 = super.field1964[var20];
                int var22 = super.field1962[var20];
                int var23 = super.field1970[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field572[var20] = var31 - var19;
                field566[var20] = (var27 << 9) / arg7 + var9;
                field564[var20] = (var30 << 9) / arg7 + var10;
                if (this.field575 > 0) {
                    field582[var20] = var27;
                    field563[var20] = var30;
                    field580[var20] = var31;
                }
            }
            this.method178(false, false, 0L, super.field1961, super.field1961 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I")
    private static final int method191(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lei;IIIII)V")
    public class30(class50 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method323();
        arg0.method305();
        super.field1963 = arg0.field965;
        super.field1964 = arg0.field1003;
        super.field1962 = arg0.field984;
        super.field1970 = arg0.field997;
        super.field1975 = arg0.field987;
        this.field559 = arg0.field967;
        this.field550 = arg0.field992;
        this.field552 = arg0.field993;
        this.field549 = arg0.field1002;
        this.field561 = arg0.field988;
        this.field555 = arg0.field1008;
        super.field1974 = arg0.field978;
        super.field1960 = arg0.field994;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field579 = new int[super.field1975];
        this.field554 = new int[super.field1975];
        this.field551 = new int[super.field1975];
        if (arg0.field991 != null) {
            this.field548 = new short[super.field1975];
            for (int var9 = 0; var9 < super.field1975; ++var9) {
                short var10 = arg0.field991[var9];
                if (var10 != -1 && class1.field17.method1222(var10, (byte) -87)) {
                    this.field548[var9] = var10;
                } else {
                    this.field548[var9] = -1;
                }
            }
        } else {
            this.field548 = null;
        }
        if (arg0.field996 > 0 && arg0.field990 != null) {
            int[] var11 = new int[arg0.field996];
            for (int var12 = 0; var12 < super.field1975; ++var12) {
                if (arg0.field990[var12] != -1) {
                    ++var11[arg0.field990[var12] & 255];
                }
            }
            this.field575 = 0;
            for (int var13 = 0; var13 < arg0.field996; ++var13) {
                if (var11[var13] > 0 && arg0.field998[var13] == 0) {
                    ++this.field575;
                }
            }
            this.field553 = new int[this.field575];
            this.field557 = new int[this.field575];
            this.field546 = new int[this.field575];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field996; ++var15) {
                if (var11[var15] > 0 && arg0.field998[var15] == 0) {
                    this.field553[var14] = arg0.field975[var15] & 65535;
                    this.field557[var14] = arg0.field974[var15] & 65535;
                    this.field546[var14] = arg0.field1001[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field560 = new byte[super.field1975];
            for (int var16 = 0; var16 < super.field1975; ++var16) {
                if (arg0.field990[var16] != -1) {
                    this.field560[var16] = (byte) var11[arg0.field990[var16] & 255];
                    if (this.field560[var16] == -1 && this.field548 != null) {
                        this.field548[var16] = -1;
                    }
                } else {
                    this.field560[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field1975; ++var17) {
            byte var18;
            if (arg0.field985 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field985[var17];
            }
            byte var19;
            if (arg0.field988 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field988[var17];
            }
            short var20;
            if (this.field548 == null) {
                var20 = -1;
            } else {
                var20 = this.field548[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class133 var28 = arg0.field961[var17];
                        int var29 = (var28.field2765 * arg5 + var28.field2761 * arg3 + var28.field2758 * arg4) / (var8 / 2 + var8) + arg1;
                        this.field579[var17] = method191(arg0.field989[var17] & 65535, var29);
                        this.field551[var17] = -1;
                    } else if (var18 == 3) {
                        this.field579[var17] = 128;
                        this.field551[var17] = -1;
                    } else {
                        this.field551[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field989[var17] & 65535;
                    class27 var22;
                    if (arg0.field1004 != null && arg0.field1004[this.field559[var17]] != null) {
                        var22 = arg0.field1004[this.field559[var17]];
                    } else {
                        var22 = arg0.field1000[this.field559[var17]];
                    }
                    int var23 = (var22.field500 * arg5 + var22.field495 * arg3 + var22.field492 * arg4) / (var22.field497 * var8) + arg1;
                    this.field579[var17] = method191(var21, var23);
                    class27 var24;
                    if (arg0.field1004 != null && arg0.field1004[this.field550[var17]] != null) {
                        var24 = arg0.field1004[this.field550[var17]];
                    } else {
                        var24 = arg0.field1000[this.field550[var17]];
                    }
                    int var25 = (var24.field500 * arg5 + var24.field495 * arg3 + var24.field492 * arg4) / (var24.field497 * var8) + arg1;
                    this.field554[var17] = method191(var21, var25);
                    class27 var26;
                    if (arg0.field1004 != null && arg0.field1004[this.field552[var17]] != null) {
                        var26 = arg0.field1004[this.field552[var17]];
                    } else {
                        var26 = arg0.field1000[this.field552[var17]];
                    }
                    int var27 = (var26.field500 * arg5 + var26.field495 * arg3 + var26.field492 * arg4) / (var26.field497 * var8) + arg1;
                    this.field551[var17] = method191(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class133 var36 = arg0.field961[var17];
                    int var37 = (var36.field2765 * arg5 + var36.field2761 * arg3 + var36.field2758 * arg4) / (var8 / 2 + var8) + arg1;
                    this.field579[var17] = method184(var37);
                    this.field551[var17] = -1;
                } else {
                    this.field551[var17] = -2;
                }
            } else {
                class27 var30;
                if (arg0.field1004 != null && arg0.field1004[this.field559[var17]] != null) {
                    var30 = arg0.field1004[this.field559[var17]];
                } else {
                    var30 = arg0.field1000[this.field559[var17]];
                }
                int var31 = (var30.field500 * arg5 + var30.field495 * arg3 + var30.field492 * arg4) / (var30.field497 * var8) + arg1;
                this.field579[var17] = method184(var31);
                class27 var32;
                if (arg0.field1004 != null && arg0.field1004[this.field550[var17]] != null) {
                    var32 = arg0.field1004[this.field550[var17]];
                } else {
                    var32 = arg0.field1000[this.field550[var17]];
                }
                int var33 = (var32.field500 * arg5 + var32.field495 * arg3 + var32.field492 * arg4) / (var32.field497 * var8) + arg1;
                this.field554[var17] = method184(var33);
                class27 var34;
                if (arg0.field1004 != null && arg0.field1004[this.field552[var17]] != null) {
                    var34 = arg0.field1004[this.field552[var17]];
                } else {
                    var34 = arg0.field1000[this.field552[var17]];
                }
                int var35 = (var34.field500 * arg5 + var34.field495 * arg3 + var34.field492 * arg4) / (var34.field497 * var8) + arg1;
                this.field551[var17] = method184(var35);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([Lci;I)V")
    private class30(class30[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field1963 = 0;
        super.field1975 = 0;
        this.field575 = 0;
        this.field555 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class30 var13 = arg0[var7];
            if (var13 != null) {
                super.field1963 += var13.field1963;
                super.field1975 += var13.field1975;
                this.field575 += var13.field575;
                if (var13.field549 != null) {
                    var3 = true;
                } else {
                    if (this.field555 == -1) {
                        this.field555 = var13.field555;
                    }
                    if (this.field555 != var13.field555) {
                        var3 = true;
                    }
                }
                var4 |= var13.field561 != null;
                var5 |= var13.field548 != null;
                var6 |= var13.field560 != null;
            }
        }
        super.field1964 = new int[super.field1963];
        super.field1962 = new int[super.field1963];
        super.field1970 = new int[super.field1963];
        this.field559 = new int[super.field1975];
        this.field550 = new int[super.field1975];
        this.field552 = new int[super.field1975];
        this.field579 = new int[super.field1975];
        this.field554 = new int[super.field1975];
        this.field551 = new int[super.field1975];
        if (var3) {
            this.field549 = new byte[super.field1975];
        }
        if (var4) {
            this.field561 = new byte[super.field1975];
        }
        if (var5) {
            this.field548 = new short[super.field1975];
        }
        if (var6) {
            this.field560 = new byte[super.field1975];
        }
        if (this.field575 > 0) {
            this.field553 = new int[this.field575];
            this.field557 = new int[this.field575];
            this.field546 = new int[this.field575];
        }
        super.field1963 = 0;
        super.field1975 = 0;
        this.field575 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class30 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field1975; ++var10) {
                    this.field559[super.field1975] = var9.field559[var10] + super.field1963;
                    this.field550[super.field1975] = var9.field550[var10] + super.field1963;
                    this.field552[super.field1975] = var9.field552[var10] + super.field1963;
                    this.field579[super.field1975] = var9.field579[var10];
                    this.field554[super.field1975] = var9.field554[var10];
                    this.field551[super.field1975] = var9.field551[var10];
                    if (var3) {
                        if (var9.field549 != null) {
                            this.field549[super.field1975] = var9.field549[var10];
                        } else {
                            this.field549[super.field1975] = var9.field555;
                        }
                    }
                    if (var4 && var9.field561 != null) {
                        this.field561[super.field1975] = var9.field561[var10];
                    }
                    if (var5) {
                        if (var9.field548 != null) {
                            this.field548[super.field1975] = var9.field548[var10];
                        } else {
                            this.field548[super.field1975] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field560 != null && var9.field560[var10] != -1) {
                            this.field560[super.field1975] = (byte) (var9.field560[var10] + this.field575);
                        } else {
                            this.field560[super.field1975] = -1;
                        }
                    }
                    ++super.field1975;
                }
                for (int var11 = 0; var11 < var9.field575; ++var11) {
                    this.field553[this.field575] = var9.field553[var11] + super.field1963;
                    this.field557[this.field575] = var9.field557[var11] + super.field1963;
                    this.field546[this.field575] = var9.field546[var11] + super.field1963;
                    ++this.field575;
                }
                for (int var12 = 0; var12 < var9.field1963; ++var12) {
                    super.field1964[super.field1963] = var9.field1964[var12];
                    super.field1962[super.field1963] = var9.field1962[var12];
                    super.field1970[super.field1963] = var9.field1970[var12];
                    ++super.field1963;
                }
            }
        }
    }
}
