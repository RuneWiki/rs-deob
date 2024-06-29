import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class30 {

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "B")
    private byte field112 = 0;

    @OriginalMember(owner = "client!af", name = "Ab", descriptor = "I")
    private int field120 = 0;

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "[I")
    private int[] field115;

    @OriginalMember(owner = "client!af", name = "wb", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "client!af", name = "yb", descriptor = "[I")
    private int[] field118;

    @OriginalMember(owner = "client!af", name = "Db", descriptor = "[B")
    private byte[] field123;

    @OriginalMember(owner = "client!af", name = "Fb", descriptor = "[B")
    private byte[] field125;

    @OriginalMember(owner = "client!af", name = "Bb", descriptor = "[I")
    private int[] field121;

    @OriginalMember(owner = "client!af", name = "Cb", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "[I")
    private int[] field111;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "[S")
    private short[] field114;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!af", name = "xb", descriptor = "[I")
    private int[] field117;

    @OriginalMember(owner = "client!af", name = "Eb", descriptor = "[I")
    private int[] field124;

    @OriginalMember(owner = "client!af", name = "zb", descriptor = "[B")
    private byte[] field119;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "Laf;")
    private static class7 field113 = new class7();

    @OriginalMember(owner = "client!af", name = "Hb", descriptor = "[B")
    private static byte[] field127 = new byte[1];

    @OriginalMember(owner = "client!af", name = "Gb", descriptor = "Laf;")
    private static class7 field126 = new class7();

    @OriginalMember(owner = "client!af", name = "Jb", descriptor = "[I")
    private static int[] field129 = new int[10];

    @OriginalMember(owner = "client!af", name = "Kb", descriptor = "[I")
    private static int[] field130 = new int[4096];

    @OriginalMember(owner = "client!af", name = "Pb", descriptor = "[I")
    private static int[] field135 = new int[1600];

    @OriginalMember(owner = "client!af", name = "Ib", descriptor = "[I")
    private static int[] field128 = new int[10];

    @OriginalMember(owner = "client!af", name = "Mb", descriptor = "[I")
    private static int[] field132 = new int[4096];

    @OriginalMember(owner = "client!af", name = "Ob", descriptor = "[I")
    private static int[] field134 = class17.field341;

    @OriginalMember(owner = "client!af", name = "Lb", descriptor = "[I")
    private static int[] field131 = new int[4096];

    @OriginalMember(owner = "client!af", name = "Yb", descriptor = "[I")
    private static int[] field144 = new int[4096];

    @OriginalMember(owner = "client!af", name = "Sb", descriptor = "[I")
    private static int[] field138 = class17.field344;

    @OriginalMember(owner = "client!af", name = "Rb", descriptor = "[I")
    private static int[] field137 = new int[4096];

    @OriginalMember(owner = "client!af", name = "Nb", descriptor = "[I")
    private static int[] field133 = new int[2000];

    @OriginalMember(owner = "client!af", name = "Qb", descriptor = "[I")
    private static int[] field136 = class17.field353;

    @OriginalMember(owner = "client!af", name = "bc", descriptor = "[I")
    private static int[] field147 = new int[10];

    @OriginalMember(owner = "client!af", name = "Xb", descriptor = "[I")
    private static int[] field143 = new int[12];

    @OriginalMember(owner = "client!af", name = "Zb", descriptor = "[[I")
    private static int[][] field145 = new int[1600][512];

    @OriginalMember(owner = "client!af", name = "cc", descriptor = "[I")
    private static int[] field148 = class17.field350;

    @OriginalMember(owner = "client!af", name = "Vb", descriptor = "[I")
    private static int[] field141 = new int[4096];

    @OriginalMember(owner = "client!af", name = "dc", descriptor = "[B")
    private static byte[] field149 = new byte[1];

    @OriginalMember(owner = "client!af", name = "hc", descriptor = "[I")
    private static int[] field153 = new int[12];

    @OriginalMember(owner = "client!af", name = "gc", descriptor = "[Z")
    private static boolean[] field152 = new boolean[4096];

    @OriginalMember(owner = "client!af", name = "Ub", descriptor = "[[I")
    private static int[][] field140 = new int[12][2000];

    @OriginalMember(owner = "client!af", name = "ac", descriptor = "[Z")
    private static boolean[] field146 = new boolean[4096];

    @OriginalMember(owner = "client!af", name = "Tb", descriptor = "[I")
    private static int[] field139 = new int[2000];

    @OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
    private static int field142;

    @OriginalMember(owner = "client!af", name = "ec", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client!af", name = "fc", descriptor = "I")
    private static int field151;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLaf;[B)Laf;")
    private final class7 method34(boolean arg0, class7 arg1, byte[] arg2) {
        arg1.field566 = super.field566;
        arg1.field568 = super.field568;
        arg1.field120 = this.field120;
        if (arg1.field571 == null || arg1.field571.length < super.field566) {
            arg1.field571 = new int[super.field566 + 100];
            arg1.field578 = new int[super.field566 + 100];
            arg1.field573 = new int[super.field566 + 100];
        }
        for (int var4 = 0; var4 < super.field566; ++var4) {
            arg1.field571[var4] = super.field571[var4];
            arg1.field578[var4] = super.field578[var4];
            arg1.field573[var4] = super.field573[var4];
        }
        if (arg0) {
            arg1.field125 = this.field125;
        } else {
            arg1.field125 = arg2;
            if (this.field125 == null) {
                for (int var5 = 0; var5 < super.field568; ++var5) {
                    arg1.field125[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field568; ++var6) {
                    arg1.field125[var6] = this.field125[var6];
                }
            }
        }
        arg1.field115 = this.field115;
        arg1.field116 = this.field116;
        arg1.field118 = this.field118;
        arg1.field121 = this.field121;
        arg1.field122 = this.field122;
        arg1.field111 = this.field111;
        arg1.field123 = this.field123;
        arg1.field119 = this.field119;
        arg1.field114 = this.field114;
        arg1.field112 = this.field112;
        arg1.field110 = this.field110;
        arg1.field117 = this.field117;
        arg1.field124 = this.field124;
        arg1.field581 = super.field581;
        arg1.field572 = super.field572;
        arg1.field560 = super.field560;
        arg1.field580 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZJII)V")
    private final void method35(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field135[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field568; ++var8) {
                if (this.field111[var8] != -2) {
                    int var33 = this.field115[var8];
                    int var34 = this.field116[var8];
                    int var35 = this.field118[var8];
                    int var36 = field131[var33];
                    int var37 = field131[var34];
                    int var38 = field131[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method36(class30.field563, class30.field570, field130[var33], field130[var34], field130[var35], var36, var37, var38)) {
                            class30.field564[class30.field579++] = arg2;
                            arg1 = false;
                        }
                        if ((field130[var35] - field130[var34]) * (var36 - var37) - (field130[var33] - field130[var34]) * (var38 - var37) > 0) {
                            field152[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class17.field335 && var37 <= class17.field335 && var38 <= class17.field335) {
                                field146[var8] = false;
                            } else {
                                field146[var8] = true;
                            }
                            int var58 = (field132[var33] + field132[var34] + field132[var35]) / 3 + arg3;
                            field145[var58][field135[var58]++] = var8;
                        }
                    } else {
                        int var39 = field141[var33];
                        int var40 = field141[var34];
                        int var41 = field141[var35];
                        int var42 = field137[var33];
                        int var43 = field137[var34];
                        int var44 = field137[var35];
                        int var45 = field144[var33];
                        int var46 = field144[var34];
                        int var47 = field144[var35];
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
                            field152[var8] = true;
                            int var57 = (field132[var33] + field132[var34] + field132[var35]) / 3 + arg3;
                            field145[var57][field135[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field123 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field135[var9];
                    if (var10 > 0) {
                        int[] var11 = field145[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method47(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field143[var13] = 0;
                    field153[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field135[var14];
                    if (var27 > 0) {
                        int[] var28 = field145[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field123[var30];
                            int var32 = field143[var31]++;
                            field140[var31][var32] = var30;
                            if (var31 < 10) {
                                field153[var31] += var14;
                            } else if (var31 == 10) {
                                field139[var32] = var14;
                            } else {
                                field133[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field143[1] > 0 || field143[2] > 0) {
                    var15 = (field153[1] + field153[2]) / (field143[1] + field143[2]);
                }
                int var16 = 0;
                if (field143[3] > 0 || field143[4] > 0) {
                    var16 = (field153[3] + field153[4]) / (field143[3] + field143[4]);
                }
                int var17 = 0;
                if (field143[6] > 0 || field143[8] > 0) {
                    var17 = (field153[6] + field153[8]) / (field143[6] + field143[8]);
                }
                int var18 = 0;
                int var19 = field143[10];
                int[] var20 = field140[10];
                int[] var21 = field139;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field143[11];
                    var20 = field140[11];
                    var21 = field133;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method47(var20[var18++]);
                        if (var18 == var19 && field140[11] != var20) {
                            var18 = 0;
                            var19 = field143[11];
                            var20 = field140[11];
                            var21 = field133;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method47(var20[var18++]);
                        if (var18 == var19 && field140[11] != var20) {
                            var18 = 0;
                            var19 = field143[11];
                            var20 = field140[11];
                            var21 = field133;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method47(var20[var18++]);
                        if (var18 == var19 && field140[11] != var20) {
                            var18 = 0;
                            var19 = field143[11];
                            var20 = field140[11];
                            var21 = field133;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field143[var23];
                    int[] var25 = field140[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method47(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method47(var20[var18++]);
                    if (var18 == var19 && field140[11] != var20) {
                        var18 = 0;
                        var20 = field140[11];
                        var19 = field143[11];
                        var21 = field133;
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

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([[IIIIZI)Ld;")
    public final class30 method37(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method266();
        int var7 = super.field575 + arg1;
        int var8 = super.field576 + arg1;
        int var9 = super.field577 + arg3;
        int var10 = super.field569 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class7 var15;
                if (arg4) {
                    var15 = new class7();
                    var15.field566 = super.field566;
                    var15.field568 = super.field568;
                    var15.field120 = this.field120;
                    var15.field571 = super.field571;
                    var15.field573 = super.field573;
                    var15.field115 = this.field115;
                    var15.field116 = this.field116;
                    var15.field118 = this.field118;
                    var15.field121 = this.field121;
                    var15.field122 = this.field122;
                    var15.field111 = this.field111;
                    var15.field123 = this.field123;
                    var15.field125 = this.field125;
                    var15.field119 = this.field119;
                    var15.field114 = this.field114;
                    var15.field112 = this.field112;
                    var15.field110 = this.field110;
                    var15.field117 = this.field117;
                    var15.field124 = this.field124;
                    var15.field581 = super.field581;
                    var15.field572 = super.field572;
                    var15.field560 = super.field560;
                    var15.field578 = new int[var15.field566];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field566; ++var16) {
                        int var17 = super.field571[var16] + arg1;
                        int var18 = super.field573[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field578[var16] = super.field578[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field566; ++var26) {
                        int var27 = (super.field578[var26] << 16) / super.field1928;
                        if (var27 < arg5) {
                            int var28 = super.field571[var26] + arg1;
                            int var29 = super.field573[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field578[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field578[var26];
                        } else {
                            var15.field578[var26] = super.field578[var26];
                        }
                    }
                }
                super.field580 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lma;ILma;I[I)V")
    public final void method38(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class111 var6 = arg0.field2256[arg1];
                class111 var7 = arg2.field2256[arg3];
                class189 var8 = var6.field2298;
                field150 = 0;
                field151 = 0;
                field142 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2297; ++var11) {
                    int var16 = var6.field2296[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3664[var16] == 0) {
                        this.method46(var8.field3664[var16], var8.field3665[var16], var6.field2290[var11], var6.field2291[var11], var6.field2292[var11]);
                    }
                }
                field150 = 0;
                field151 = 0;
                field142 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2297; ++var14) {
                    int var15 = var7.field2296[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3664[var15] == 0) {
                        this.method46(var8.field3664[var15], var8.field3665[var15], var7.field2290[var14], var7.field2291[var14], var7.field2292[var14]);
                    }
                }
                super.field580 = false;
            } else {
                this.method40(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ld;)Ld;")
    public final class30 method39(class30 arg0) {
        return new class7(new class7[] { this, (class7) arg0 }, 2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lma;I)V")
    public final void method40(class109 arg0, int arg1) {
        if (super.field581 != null) {
            if (arg1 != -1) {
                class111 var3 = arg0.field2256[arg1];
                class189 var4 = var3.field2298;
                field150 = 0;
                field151 = 0;
                field142 = 0;
                for (int var5 = 0; var5 < var3.field2297; ++var5) {
                    int var6 = var3.field2296[var5];
                    this.method46(var4.field3664[var6], var4.field3665[var6], var3.field2290[var5], var3.field2291[var5], var3.field2292[var5]);
                }
                super.field580 = false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)Ld;")
    public final class30 method41(boolean arg0) {
        if (!arg0 && field127.length < super.field568) {
            field127 = new byte[super.field568 + 100];
        }
        return this.method34(arg0, field113, field127);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method266();
            int var9 = class17.field352;
            int var10 = class17.field336;
            int var11 = field134[arg0];
            int var12 = field148[arg0];
            int var13 = field134[arg1];
            int var14 = field148[arg1];
            int var15 = field134[arg2];
            int var16 = field148[arg2];
            int var17 = field134[arg3];
            int var18 = field148[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field566; ++var20) {
                int var21 = super.field571[var20];
                int var22 = super.field578[var20];
                int var23 = super.field573[var20];
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
                field132[var20] = var31 - var19;
                field131[var20] = (var27 << 9) / arg7 + var9;
                field130[var20] = (var30 << 9) / arg7 + var10;
                if (this.field120 > 0) {
                    field141[var20] = var27;
                    field137[var20] = var30;
                    field144[var20] = var31;
                }
            }
            this.method35(false, false, 0L, super.field582, super.field582 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)Ld;")
    public final class30 method43(boolean arg0) {
        if (!arg0 && field149.length < super.field568) {
            field149 = new byte[super.field568 + 100];
        }
        return this.method34(arg0, field126, field149);
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    private final void method44(int arg0) {
        int var2 = class17.field352;
        int var3 = class17.field336;
        int var4 = 0;
        int var5 = this.field115[arg0];
        int var6 = this.field116[arg0];
        int var7 = this.field118[arg0];
        int var8 = field144[var5];
        int var9 = field144[var6];
        int var10 = field144[var7];
        if (this.field125 == null) {
            class17.field343 = 0;
        } else {
            class17.field343 = this.field125[arg0] & 255;
        }
        if (var8 >= 50) {
            field147[var4] = field131[var5];
            field128[var4] = field130[var5];
            field129[var4++] = this.field121[arg0];
        } else {
            int var11 = field141[var5];
            int var12 = field137[var5];
            int var13 = this.field121[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field136[var10 - var8];
                field147[var4] = (((field141[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field128[var4] = (((field137[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field129[var4++] = ((this.field111[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field136[var9 - var8];
                field147[var4] = (((field141[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field128[var4] = (((field137[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field129[var4++] = ((this.field122[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field147[var4] = field131[var6];
            field128[var4] = field130[var6];
            field129[var4++] = this.field122[arg0];
        } else {
            int var16 = field141[var6];
            int var17 = field137[var6];
            int var18 = this.field122[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field136[var8 - var9];
                field147[var4] = (((field141[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field128[var4] = (((field137[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field129[var4++] = ((this.field121[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field136[var10 - var9];
                field147[var4] = (((field141[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field128[var4] = (((field137[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field129[var4++] = ((this.field111[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field147[var4] = field131[var7];
            field128[var4] = field130[var7];
            field129[var4++] = this.field111[arg0];
        } else {
            int var21 = field141[var7];
            int var22 = field137[var7];
            int var23 = this.field111[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field136[var9 - var10];
                field147[var4] = (((field141[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field128[var4] = (((field137[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field129[var4++] = ((this.field122[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field136[var8 - var10];
                field147[var4] = (((field141[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field128[var4] = (((field137[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field129[var4++] = ((this.field121[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field147[0];
        int var27 = field147[1];
        int var28 = field147[2];
        int var29 = field128[0];
        int var30 = field128[1];
        int var31 = field128[2];
        class17.field347 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class17.field335 || var27 > class17.field335 || var28 > class17.field335) {
                class17.field347 = true;
            }
            if (this.field114 != null && this.field114[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field119 != null && this.field119[arg0] != -1) {
                    int var32 = this.field119[arg0] & 255;
                    var33 = this.field110[var32];
                    var34 = this.field117[var32];
                    var35 = this.field124[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field111[arg0] == -1) {
                    class17.method189(var29, var30, var31, var26, var27, var28, this.field121[arg0], this.field121[arg0], this.field121[arg0], field141[var33], field141[var34], field141[var35], field137[var33], field137[var34], field137[var35], field144[var33], field144[var34], field144[var35], this.field114[arg0]);
                } else {
                    class17.method189(var29, var30, var31, var26, var27, var28, field129[0], field129[1], field129[2], field141[var33], field141[var34], field141[var35], field137[var33], field137[var34], field137[var35], field144[var33], field144[var34], field144[var35], this.field114[arg0]);
                }
            } else if (this.field111[arg0] == -1) {
                class17.method188(var29, var30, var31, var26, var27, var28, field138[this.field121[arg0]]);
            } else {
                class17.method191(var29, var30, var31, var26, var27, var28, field129[0], field129[1], field129[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class17.field335 || var27 > class17.field335 || var28 > class17.field335 || field147[3] < 0 || field147[3] > class17.field335) {
                class17.field347 = true;
            }
            if (this.field114 == null || this.field114[arg0] == -1) {
                if (this.field111[arg0] == -1) {
                    int var41 = field138[this.field121[arg0]];
                    class17.method188(var29, var30, var31, var26, var27, var28, var41);
                    class17.method188(var29, var31, field128[3], var26, var28, field147[3], var41);
                    return;
                }
                class17.method191(var29, var30, var31, var26, var27, var28, field129[0], field129[1], field129[2]);
                class17.method191(var29, var31, field128[3], var26, var28, field147[3], field129[0], field129[2], field129[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field119 != null && this.field119[arg0] != -1) {
                int var36 = this.field119[arg0] & 255;
                var37 = this.field110[var36];
                var38 = this.field117[var36];
                var39 = this.field124[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field114[arg0];
            if (this.field111[arg0] == -1) {
                class17.method189(var29, var30, var31, var26, var27, var28, this.field121[arg0], this.field121[arg0], this.field121[arg0], field141[var37], field141[var38], field141[var39], field137[var37], field137[var38], field137[var39], field144[var37], field144[var38], field144[var39], var40);
                class17.method189(var29, var31, field128[3], var26, var28, field147[3], this.field121[arg0], this.field121[arg0], this.field121[arg0], field141[var37], field141[var38], field141[var39], field137[var37], field137[var38], field137[var39], field144[var37], field144[var38], field144[var39], var40);
                return;
            }
            class17.method189(var29, var30, var31, var26, var27, var28, field129[0], field129[1], field129[2], field141[var37], field141[var38], field141[var39], field137[var37], field137[var38], field137[var39], field144[var37], field144[var38], field144[var39], var40);
            class17.method189(var29, var31, field128[3], var26, var28, field147[3], field129[0], field129[2], field129[3], field141[var37], field141[var38], field141[var39], field137[var37], field137[var38], field137[var39], field144[var37], field144[var38], field144[var39], var40);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field580) {
            this.method266();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field574 * arg1 + super.field567 * arg2 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field567 * arg2 + super.field1928 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field567 + var15 << 9;
                if (var16 / var13 > class17.field337) {
                    int var17 = var15 - super.field567 << 9;
                    if (var17 / var13 < class17.field339) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field574 * arg2 + super.field567 * arg1 >> 16) + var18 << 9;
                        if (var19 / var13 > class17.field342) {
                            int var20 = (-super.field567 * arg1 + super.field1928 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class17.field349) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field120 > 0;
                                int var24 = class17.field352;
                                int var25 = class17.field336;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field134[arg0];
                                    var27 = field148[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class30.field565 && var14 > 0) {
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
                                    int var33 = class30.field563 - class17.field352;
                                    int var34 = class30.field570 - class17.field336;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field575, super.field576, super.field575, super.field576, super.field575, super.field576, super.field575, super.field576 };
                                        int[] var40 = new int[] { super.field577, super.field577, super.field569, super.field569, super.field577, super.field577, super.field569, super.field569 };
                                        int[] var41 = new int[] { super.field1928, super.field1928, super.field1928, super.field1928, super.field574, super.field574, super.field574, super.field574 };
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
                                            if (super.field560) {
                                                class30.field564[class30.field579++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field566; ++var58) {
                                    int var59 = super.field571[var58];
                                    int var60 = super.field578[var58];
                                    int var61 = super.field573[var58];
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
                                    field132[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field131[var58] = (var66 << 9) / var70 + var24;
                                        field130[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field131[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field141[var58] = var66;
                                        field137[var58] = var69;
                                        field144[var58] = var70;
                                    }
                                }
                                try {
                                    this.method35(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIII)V")
    private final void method46(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field150 = 0;
            field151 = 0;
            field142 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field581.length) {
                    int[] var10 = super.field581[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field150 += super.field571[var12];
                        field151 += super.field578[var12];
                        field142 += super.field573[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field150 = field150 / var7 + arg2;
                field151 = field151 / var7 + arg3;
                field142 = field142 / var7 + arg4;
            } else {
                field150 = arg2;
                field151 = arg3;
                field142 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field581.length) {
                    int[] var15 = super.field581[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field571[var17] += arg2;
                        super.field578[var17] += arg3;
                        super.field573[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field581.length) {
                    int[] var20 = super.field581[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field571[var22] -= field150;
                        super.field578[var22] -= field151;
                        super.field573[var22] -= field142;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field134[var25];
                            int var27 = field148[var25];
                            int var28 = super.field578[var22] * var26 + super.field571[var22] * var27 + 32767 >> 16;
                            super.field578[var22] = super.field578[var22] * var27 - super.field571[var22] * var26 + 32767 >> 16;
                            super.field571[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field134[var23];
                            int var30 = field148[var23];
                            int var31 = super.field578[var22] * var30 - super.field573[var22] * var29 + 32767 >> 16;
                            super.field573[var22] = super.field578[var22] * var29 + super.field573[var22] * var30 + 32767 >> 16;
                            super.field578[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field134[var24];
                            int var33 = field148[var24];
                            int var34 = super.field573[var22] * var32 + super.field571[var22] * var33 + 32767 >> 16;
                            super.field573[var22] = super.field573[var22] * var33 - super.field571[var22] * var32 + 32767 >> 16;
                            super.field571[var22] = var34;
                        }
                        super.field571[var22] += field150;
                        super.field578[var22] += field151;
                        super.field573[var22] += field142;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field581.length) {
                    int[] var37 = super.field581[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field571[var39] -= field150;
                        super.field578[var39] -= field151;
                        super.field573[var39] -= field142;
                        super.field571[var39] = super.field571[var39] * arg2 / 128;
                        super.field578[var39] = super.field578[var39] * arg3 / 128;
                        super.field573[var39] = super.field573[var39] * arg4 / 128;
                        super.field571[var39] += field150;
                        super.field578[var39] += field151;
                        super.field573[var39] += field142;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field572 != null && this.field125 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field572.length) {
                        int[] var42 = super.field572[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field125[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field125[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
    private final void method47(int arg0) {
        if (field152[arg0]) {
            this.method44(arg0);
        } else {
            int var2 = this.field115[arg0];
            int var3 = this.field116[arg0];
            int var4 = this.field118[arg0];
            class17.field347 = field146[arg0];
            if (this.field125 == null) {
                class17.field343 = 0;
            } else {
                class17.field343 = this.field125[arg0] & 255;
            }
            if (this.field114 != null && this.field114[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field119 != null && this.field119[arg0] != -1) {
                    int var5 = this.field119[arg0] & 255;
                    var6 = this.field110[var5];
                    var7 = this.field117[var5];
                    var8 = this.field124[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field111[arg0] == -1) {
                    class17.method189(field130[var2], field130[var3], field130[var4], field131[var2], field131[var3], field131[var4], this.field121[arg0], this.field121[arg0], this.field121[arg0], field141[var6], field141[var7], field141[var8], field137[var6], field137[var7], field137[var8], field144[var6], field144[var7], field144[var8], this.field114[arg0]);
                } else {
                    class17.method189(field130[var2], field130[var3], field130[var4], field131[var2], field131[var3], field131[var4], this.field121[arg0], this.field122[arg0], this.field111[arg0], field141[var6], field141[var7], field141[var8], field137[var6], field137[var7], field137[var8], field144[var6], field144[var7], field144[var8], this.field114[arg0]);
                }
            } else if (this.field111[arg0] == -1) {
                class17.method188(field130[var2], field130[var3], field130[var4], field131[var2], field131[var3], field131[var4], field138[this.field121[arg0]]);
            } else {
                class17.method191(field130[var2], field130[var3], field130[var4], field131[var2], field131[var3], field131[var4], this.field121[arg0], this.field122[arg0], this.field111[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    private static final int method48(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)I")
    private static final int method49(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "()V")
    public static void method50() {
        field113 = null;
        field127 = null;
        field126 = null;
        field149 = null;
        field146 = null;
        field152 = null;
        field131 = null;
        field130 = null;
        field132 = null;
        field141 = null;
        field137 = null;
        field144 = null;
        field135 = null;
        field145 = null;
        field143 = null;
        field140 = null;
        field139 = null;
        field133 = null;
        field153 = null;
        field147 = null;
        field128 = null;
        field129 = null;
        field134 = null;
        field148 = null;
        field138 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Llc;IIIII)V")
    public class7(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method843();
        arg0.method840();
        super.field566 = arg0.field2109;
        super.field571 = arg0.field2119;
        super.field578 = arg0.field2124;
        super.field573 = arg0.field2135;
        super.field568 = arg0.field2151;
        this.field115 = arg0.field2127;
        this.field116 = arg0.field2128;
        this.field118 = arg0.field2140;
        this.field123 = arg0.field2141;
        this.field125 = arg0.field2150;
        this.field112 = arg0.field2144;
        super.field581 = arg0.field2153;
        super.field572 = arg0.field2152;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field121 = new int[super.field568];
        this.field122 = new int[super.field568];
        this.field111 = new int[super.field568];
        if (arg0.field2154 != null) {
            this.field114 = new short[super.field568];
            for (int var9 = 0; var9 < super.field568; ++var9) {
                short var10 = arg0.field2154[var9];
                if (var10 != -1 && class17.field354.method739(var10, -1193)) {
                    this.field114[var9] = var10;
                } else {
                    this.field114[var9] = -1;
                }
            }
        } else {
            this.field114 = null;
        }
        if (arg0.field2133 > 0 && arg0.field2123 != null) {
            int[] var11 = new int[arg0.field2133];
            for (int var12 = 0; var12 < super.field568; ++var12) {
                if (arg0.field2123[var12] != -1) {
                    ++var11[arg0.field2123[var12] & 255];
                }
            }
            this.field120 = 0;
            for (int var13 = 0; var13 < arg0.field2133; ++var13) {
                if (var11[var13] > 0 && arg0.field2143[var13] == 0) {
                    ++this.field120;
                }
            }
            this.field110 = new int[this.field120];
            this.field117 = new int[this.field120];
            this.field124 = new int[this.field120];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2133; ++var15) {
                if (var11[var15] > 0 && arg0.field2143[var15] == 0) {
                    this.field110[var14] = arg0.field2136[var15] & 65535;
                    this.field117[var14] = arg0.field2155[var15] & 65535;
                    this.field124[var14] = arg0.field2134[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field119 = new byte[super.field568];
            for (int var16 = 0; var16 < super.field568; ++var16) {
                if (arg0.field2123[var16] != -1) {
                    this.field119[var16] = (byte) var11[arg0.field2123[var16] & 255];
                    if (this.field119[var16] == -1 && this.field114 != null) {
                        this.field114[var16] = -1;
                    }
                } else {
                    this.field119[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field568; ++var17) {
            byte var18;
            if (arg0.field2113 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2113[var17];
            }
            byte var19;
            if (arg0.field2150 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2150[var17];
            }
            short var20;
            if (this.field114 == null) {
                var20 = -1;
            } else {
                var20 = this.field114[var17];
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
                        class18 var28 = arg0.field2149[var17];
                        int var29 = (var28.field359 * arg5 + var28.field367 * arg3 + var28.field360 * arg4) / (var8 / 2 + var8) + arg1;
                        this.field121[var17] = method48(arg0.field2112[var17] & 65535, var29);
                        this.field111[var17] = -1;
                    } else if (var18 == 3) {
                        this.field121[var17] = 128;
                        this.field111[var17] = -1;
                    } else {
                        this.field111[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2112[var17] & 65535;
                    class16 var22;
                    if (arg0.field2125 != null && arg0.field2125[this.field115[var17]] != null) {
                        var22 = arg0.field2125[this.field115[var17]];
                    } else {
                        var22 = arg0.field2131[this.field115[var17]];
                    }
                    int var23 = (var22.field333 * arg5 + var22.field330 * arg4 + var22.field328 * arg3) / (var22.field331 * var8) + arg1;
                    this.field121[var17] = method48(var21, var23);
                    class16 var24;
                    if (arg0.field2125 != null && arg0.field2125[this.field116[var17]] != null) {
                        var24 = arg0.field2125[this.field116[var17]];
                    } else {
                        var24 = arg0.field2131[this.field116[var17]];
                    }
                    int var25 = (var24.field333 * arg5 + var24.field330 * arg4 + var24.field328 * arg3) / (var24.field331 * var8) + arg1;
                    this.field122[var17] = method48(var21, var25);
                    class16 var26;
                    if (arg0.field2125 != null && arg0.field2125[this.field118[var17]] != null) {
                        var26 = arg0.field2125[this.field118[var17]];
                    } else {
                        var26 = arg0.field2131[this.field118[var17]];
                    }
                    int var27 = (var26.field333 * arg5 + var26.field330 * arg4 + var26.field328 * arg3) / (var26.field331 * var8) + arg1;
                    this.field111[var17] = method48(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class18 var36 = arg0.field2149[var17];
                    int var37 = (var36.field359 * arg5 + var36.field367 * arg3 + var36.field360 * arg4) / (var8 / 2 + var8) + arg1;
                    this.field121[var17] = method49(var37);
                    this.field111[var17] = -1;
                } else {
                    this.field111[var17] = -2;
                }
            } else {
                class16 var30;
                if (arg0.field2125 != null && arg0.field2125[this.field115[var17]] != null) {
                    var30 = arg0.field2125[this.field115[var17]];
                } else {
                    var30 = arg0.field2131[this.field115[var17]];
                }
                int var31 = (var30.field333 * arg5 + var30.field330 * arg4 + var30.field328 * arg3) / (var30.field331 * var8) + arg1;
                this.field121[var17] = method49(var31);
                class16 var32;
                if (arg0.field2125 != null && arg0.field2125[this.field116[var17]] != null) {
                    var32 = arg0.field2125[this.field116[var17]];
                } else {
                    var32 = arg0.field2131[this.field116[var17]];
                }
                int var33 = (var32.field333 * arg5 + var32.field330 * arg4 + var32.field328 * arg3) / (var32.field331 * var8) + arg1;
                this.field122[var17] = method49(var33);
                class16 var34;
                if (arg0.field2125 != null && arg0.field2125[this.field118[var17]] != null) {
                    var34 = arg0.field2125[this.field118[var17]];
                } else {
                    var34 = arg0.field2131[this.field118[var17]];
                }
                int var35 = (var34.field333 * arg5 + var34.field330 * arg4 + var34.field328 * arg3) / (var34.field331 * var8) + arg1;
                this.field111[var17] = method49(var35);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public final void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method266();
            int var8 = class17.field352;
            int var9 = class17.field336;
            int var10 = field134[arg0];
            int var11 = field148[arg0];
            int var12 = field134[arg1];
            int var13 = field148[arg1];
            int var14 = field134[arg2];
            int var15 = field148[arg2];
            int var16 = field134[arg3];
            int var17 = field148[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field566; ++var19) {
                int var20 = super.field571[var19];
                int var21 = super.field578[var19];
                int var22 = super.field573[var19];
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
                field132[var19] = var30 - var18;
                field131[var19] = (var26 << 9) / var30 + var8;
                field130[var19] = (var29 << 9) / var30 + var9;
                if (this.field120 > 0) {
                    field141[var19] = var26;
                    field137[var19] = var29;
                    field144[var19] = var30;
                }
            }
            this.method35(false, false, 0L, super.field582, super.field582 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([Laf;I)V")
    private class7(class7[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field566 = 0;
        super.field568 = 0;
        this.field120 = 0;
        this.field112 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class7 var13 = arg0[var7];
            if (var13 != null) {
                super.field566 += var13.field566;
                super.field568 += var13.field568;
                this.field120 += var13.field120;
                if (var13.field123 != null) {
                    var3 = true;
                } else {
                    if (this.field112 == -1) {
                        this.field112 = var13.field112;
                    }
                    if (this.field112 != var13.field112) {
                        var3 = true;
                    }
                }
                var4 |= var13.field125 != null;
                var5 |= var13.field114 != null;
                var6 |= var13.field119 != null;
            }
        }
        super.field571 = new int[super.field566];
        super.field578 = new int[super.field566];
        super.field573 = new int[super.field566];
        this.field115 = new int[super.field568];
        this.field116 = new int[super.field568];
        this.field118 = new int[super.field568];
        this.field121 = new int[super.field568];
        this.field122 = new int[super.field568];
        this.field111 = new int[super.field568];
        if (var3) {
            this.field123 = new byte[super.field568];
        }
        if (var4) {
            this.field125 = new byte[super.field568];
        }
        if (var5) {
            this.field114 = new short[super.field568];
        }
        if (var6) {
            this.field119 = new byte[super.field568];
        }
        if (this.field120 > 0) {
            this.field110 = new int[this.field120];
            this.field117 = new int[this.field120];
            this.field124 = new int[this.field120];
        }
        super.field566 = 0;
        super.field568 = 0;
        this.field120 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class7 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field568; ++var10) {
                    this.field115[super.field568] = var9.field115[var10] + super.field566;
                    this.field116[super.field568] = var9.field116[var10] + super.field566;
                    this.field118[super.field568] = var9.field118[var10] + super.field566;
                    this.field121[super.field568] = var9.field121[var10];
                    this.field122[super.field568] = var9.field122[var10];
                    this.field111[super.field568] = var9.field111[var10];
                    if (var3) {
                        if (var9.field123 != null) {
                            this.field123[super.field568] = var9.field123[var10];
                        } else {
                            this.field123[super.field568] = var9.field112;
                        }
                    }
                    if (var4 && var9.field125 != null) {
                        this.field125[super.field568] = var9.field125[var10];
                    }
                    if (var5) {
                        if (var9.field114 != null) {
                            this.field114[super.field568] = var9.field114[var10];
                        } else {
                            this.field114[super.field568] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field119 != null && var9.field119[var10] != -1) {
                            this.field119[super.field568] = (byte) (var9.field119[var10] + this.field120);
                        } else {
                            this.field119[super.field568] = -1;
                        }
                    }
                    ++super.field568;
                }
                for (int var11 = 0; var11 < var9.field120; ++var11) {
                    this.field110[this.field120] = var9.field110[var11] + super.field566;
                    this.field117[this.field120] = var9.field117[var11] + super.field566;
                    this.field124[this.field120] = var9.field124[var11] + super.field566;
                    ++this.field120;
                }
                for (int var12 = 0; var12 < var9.field566; ++var12) {
                    super.field571[super.field566] = var9.field571[var12];
                    super.field578[super.field566] = var9.field578[var12];
                    super.field573[super.field566] = var9.field573[var12];
                    ++super.field566;
                }
            }
        }
    }
}
