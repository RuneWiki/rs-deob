import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class177 extends class81 {

    @OriginalMember(owner = "client!sg", name = "Hb", descriptor = "I")
    private int field3613 = 0;

    @OriginalMember(owner = "client!sg", name = "Eb", descriptor = "B")
    private byte field3610 = 0;

    @OriginalMember(owner = "client!sg", name = "Cb", descriptor = "[I")
    private int[] field3608;

    @OriginalMember(owner = "client!sg", name = "Kb", descriptor = "[I")
    private int[] field3616;

    @OriginalMember(owner = "client!sg", name = "wb", descriptor = "[I")
    private int[] field3602;

    @OriginalMember(owner = "client!sg", name = "zb", descriptor = "[B")
    private byte[] field3605;

    @OriginalMember(owner = "client!sg", name = "Mb", descriptor = "[B")
    private byte[] field3618;

    @OriginalMember(owner = "client!sg", name = "yb", descriptor = "[I")
    private int[] field3604;

    @OriginalMember(owner = "client!sg", name = "vb", descriptor = "[I")
    private int[] field3601;

    @OriginalMember(owner = "client!sg", name = "Gb", descriptor = "[I")
    private int[] field3612;

    @OriginalMember(owner = "client!sg", name = "Ib", descriptor = "[S")
    private short[] field3614;

    @OriginalMember(owner = "client!sg", name = "Db", descriptor = "[I")
    private int[] field3609;

    @OriginalMember(owner = "client!sg", name = "Fb", descriptor = "[I")
    private int[] field3611;

    @OriginalMember(owner = "client!sg", name = "Bb", descriptor = "[I")
    private int[] field3607;

    @OriginalMember(owner = "client!sg", name = "xb", descriptor = "[B")
    private byte[] field3603;

    @OriginalMember(owner = "client!sg", name = "Ab", descriptor = "Lsg;")
    private static class177 field3606 = new class177();

    @OriginalMember(owner = "client!sg", name = "Jb", descriptor = "[B")
    private static byte[] field3615 = new byte[1];

    @OriginalMember(owner = "client!sg", name = "Lb", descriptor = "Lsg;")
    private static class177 field3617 = new class177();

    @OriginalMember(owner = "client!sg", name = "Pb", descriptor = "[I")
    private static int[] field3621 = new int[12];

    @OriginalMember(owner = "client!sg", name = "Nb", descriptor = "[I")
    private static int[] field3619 = new int[1600];

    @OriginalMember(owner = "client!sg", name = "Xb", descriptor = "[I")
    private static int[] field3629 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "Qb", descriptor = "[I")
    private static int[] field3622 = class11.field199;

    @OriginalMember(owner = "client!sg", name = "Rb", descriptor = "[I")
    private static int[] field3623 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "Tb", descriptor = "[[I")
    private static int[][] field3625 = new int[1600][512];

    @OriginalMember(owner = "client!sg", name = "Sb", descriptor = "[I")
    private static int[] field3624 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "ac", descriptor = "[B")
    private static byte[] field3632 = new byte[1];

    @OriginalMember(owner = "client!sg", name = "Ob", descriptor = "[I")
    private static int[] field3620 = class11.field211;

    @OriginalMember(owner = "client!sg", name = "Vb", descriptor = "[I")
    private static int[] field3627 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "dc", descriptor = "[Z")
    private static boolean[] field3635 = new boolean[4096];

    @OriginalMember(owner = "client!sg", name = "Zb", descriptor = "[I")
    private static int[] field3631 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "Yb", descriptor = "[I")
    private static int[] field3630 = new int[10];

    @OriginalMember(owner = "client!sg", name = "bc", descriptor = "[I")
    private static int[] field3633 = class11.field202;

    @OriginalMember(owner = "client!sg", name = "cc", descriptor = "[I")
    private static int[] field3634 = class11.field201;

    @OriginalMember(owner = "client!sg", name = "ec", descriptor = "[I")
    private static int[] field3636 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "fc", descriptor = "[I")
    private static int[] field3637 = new int[12];

    @OriginalMember(owner = "client!sg", name = "gc", descriptor = "[I")
    private static int[] field3638 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "kc", descriptor = "[Z")
    private static boolean[] field3642 = new boolean[4096];

    @OriginalMember(owner = "client!sg", name = "ic", descriptor = "[I")
    private static int[] field3640 = new int[10];

    @OriginalMember(owner = "client!sg", name = "hc", descriptor = "[I")
    private static int[] field3639 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "lc", descriptor = "[I")
    private static int[] field3643 = new int[10];

    @OriginalMember(owner = "client!sg", name = "mc", descriptor = "[[I")
    private static int[][] field3644 = new int[12][4096];

    @OriginalMember(owner = "client!sg", name = "Ub", descriptor = "I")
    private static int field3626;

    @OriginalMember(owner = "client!sg", name = "Wb", descriptor = "I")
    private static int field3628;

    @OriginalMember(owner = "client!sg", name = "jc", descriptor = "I")
    private static int field3641;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLsg;[B)Lsg;")
    private final class177 method1174(boolean arg0, class177 arg1, byte[] arg2) {
        arg1.field1874 = super.field1874;
        arg1.field1883 = super.field1883;
        arg1.field3613 = this.field3613;
        if (arg1.field1896 == null || arg1.field1896.length < super.field1874) {
            arg1.field1896 = new int[super.field1874 + 100];
            arg1.field1889 = new int[super.field1874 + 100];
            arg1.field1894 = new int[super.field1874 + 100];
        }
        for (int var4 = 0; var4 < super.field1874; ++var4) {
            arg1.field1896[var4] = super.field1896[var4];
            arg1.field1889[var4] = super.field1889[var4];
            arg1.field1894[var4] = super.field1894[var4];
        }
        if (arg0) {
            arg1.field3618 = this.field3618;
        } else {
            arg1.field3618 = arg2;
            if (this.field3618 == null) {
                for (int var5 = 0; var5 < super.field1883; ++var5) {
                    arg1.field3618[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field1883; ++var6) {
                    arg1.field3618[var6] = this.field3618[var6];
                }
            }
        }
        arg1.field3608 = this.field3608;
        arg1.field3616 = this.field3616;
        arg1.field3602 = this.field3602;
        arg1.field3604 = this.field3604;
        arg1.field3601 = this.field3601;
        arg1.field3612 = this.field3612;
        arg1.field3605 = this.field3605;
        arg1.field3603 = this.field3603;
        arg1.field3614 = this.field3614;
        arg1.field3610 = this.field3610;
        arg1.field3609 = this.field3609;
        arg1.field3611 = this.field3611;
        arg1.field3607 = this.field3607;
        arg1.field1888 = super.field1888;
        arg1.field1890 = super.field1890;
        arg1.field1892 = super.field1892;
        arg1.field1884 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZJII)V")
    private final void method1175(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field3619[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field1883; ++var8) {
                if (this.field3612[var8] != -2) {
                    int var33 = this.field3608[var8];
                    int var34 = this.field3616[var8];
                    int var35 = this.field3602[var8];
                    int var36 = field3627[var33];
                    int var37 = field3627[var34];
                    int var38 = field3627[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method1179(class81.field1895, class81.field1876, field3638[var33], field3638[var34], field3638[var35], var36, var37, var38)) {
                            class81.field1885[class81.field1875++] = arg2;
                            arg1 = false;
                        }
                        if ((field3638[var35] - field3638[var34]) * (var36 - var37) - (field3638[var33] - field3638[var34]) * (var38 - var37) > 0) {
                            field3635[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class11.field209 && var37 <= class11.field209 && var38 <= class11.field209) {
                                field3642[var8] = false;
                            } else {
                                field3642[var8] = true;
                            }
                            int var58 = (field3624[var33] + field3624[var34] + field3624[var35]) / 3 + arg3;
                            field3625[var58][field3619[var58]++] = var8;
                        }
                    } else {
                        int var39 = field3636[var33];
                        int var40 = field3636[var34];
                        int var41 = field3636[var35];
                        int var42 = field3639[var33];
                        int var43 = field3639[var34];
                        int var44 = field3639[var35];
                        int var45 = field3623[var33];
                        int var46 = field3623[var34];
                        int var47 = field3623[var35];
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
                            field3635[var8] = true;
                            int var57 = (field3624[var33] + field3624[var34] + field3624[var35]) / 3 + arg3;
                            field3625[var57][field3619[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field3605 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field3619[var9];
                    if (var10 > 0) {
                        int[] var11 = field3625[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method1180(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field3621[var13] = 0;
                    field3637[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field3619[var14];
                    if (var27 > 0) {
                        int[] var28 = field3625[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field3605[var30];
                            int var32 = field3621[var31]++;
                            field3644[var31][var32] = var30;
                            if (var31 < 10) {
                                field3637[var31] += var14;
                            } else if (var31 == 10) {
                                field3631[var32] = var14;
                            } else {
                                field3629[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field3621[1] > 0 || field3621[2] > 0) {
                    var15 = (field3637[1] + field3637[2]) / (field3621[1] + field3621[2]);
                }
                int var16 = 0;
                if (field3621[3] > 0 || field3621[4] > 0) {
                    var16 = (field3637[3] + field3637[4]) / (field3621[3] + field3621[4]);
                }
                int var17 = 0;
                if (field3621[6] > 0 || field3621[8] > 0) {
                    var17 = (field3637[6] + field3637[8]) / (field3621[6] + field3621[8]);
                }
                int var18 = 0;
                int var19 = field3621[10];
                int[] var20 = field3644[10];
                int[] var21 = field3631;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field3621[11];
                    var20 = field3644[11];
                    var21 = field3629;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method1180(var20[var18++]);
                        if (var18 == var19 && field3644[11] != var20) {
                            var18 = 0;
                            var19 = field3621[11];
                            var20 = field3644[11];
                            var21 = field3629;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method1180(var20[var18++]);
                        if (var18 == var19 && field3644[11] != var20) {
                            var18 = 0;
                            var19 = field3621[11];
                            var20 = field3644[11];
                            var21 = field3629;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method1180(var20[var18++]);
                        if (var18 == var19 && field3644[11] != var20) {
                            var18 = 0;
                            var19 = field3621[11];
                            var20 = field3644[11];
                            var21 = field3629;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field3621[var23];
                    int[] var25 = field3644[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method1180(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method1180(var20[var18++]);
                    if (var18 == var19 && field3644[11] != var20) {
                        var18 = 0;
                        var20 = field3644[11];
                        var19 = field3621[11];
                        var21 = field3629;
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

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
    private static final int method1176(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)Lia;")
    public final class81 method615(boolean arg0) {
        if (!arg0 && field3615.length < super.field1883) {
            field3615 = new byte[super.field1883 + 100];
        }
        return this.method1174(arg0, field3606, field3615);
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "()V")
    public static void method1177() {
        field3606 = null;
        field3615 = null;
        field3617 = null;
        field3632 = null;
        field3642 = null;
        field3635 = null;
        field3627 = null;
        field3638 = null;
        field3624 = null;
        field3636 = null;
        field3639 = null;
        field3623 = null;
        field3619 = null;
        field3625 = null;
        field3621 = null;
        field3644 = null;
        field3631 = null;
        field3629 = null;
        field3637 = null;
        field3630 = null;
        field3643 = null;
        field3640 = null;
        field3620 = null;
        field3634 = null;
        field3633 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method608();
            int var9 = class11.field207;
            int var10 = class11.field208;
            int var11 = field3620[arg0];
            int var12 = field3634[arg0];
            int var13 = field3620[arg1];
            int var14 = field3634[arg1];
            int var15 = field3620[arg2];
            int var16 = field3634[arg2];
            int var17 = field3620[arg3];
            int var18 = field3634[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field1874; ++var20) {
                int var21 = super.field1896[var20];
                int var22 = super.field1889[var20];
                int var23 = super.field1894[var20];
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
                field3624[var20] = var31 - var19;
                field3627[var20] = (var27 << 9) / arg7 + var9;
                field3638[var20] = (var30 << 9) / arg7 + var10;
                if (this.field3613 > 0) {
                    field3636[var20] = var27;
                    field3639[var20] = var30;
                    field3623[var20] = var31;
                }
            }
            this.method1175(false, false, 0L, super.field1878, super.field1878 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lf;ILf;I[I)V")
    public final void method616(class51 arg0, int arg1, class51 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class112 var6 = arg0.field1153[arg1];
                class112 var7 = arg2.field1153[arg3];
                class7 var8 = var6.field2471;
                field3641 = 0;
                field3628 = 0;
                field3626 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2470; ++var11) {
                    short var16 = var6.field2467[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field102[var16] == 0) {
                        if (var6.field2468[var11] != -1) {
                            this.method1182(0, var8.field114[var6.field2468[var11]], 0, 0, 0);
                        }
                        this.method1182(var8.field102[var16], var8.field114[var16], var6.field2466[var11], var6.field2472[var11], var6.field2469[var11]);
                    }
                }
                field3641 = 0;
                field3628 = 0;
                field3626 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2470; ++var14) {
                    short var15 = var7.field2467[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field102[var15] == 0) {
                        if (var7.field2468[var14] != -1) {
                            this.method1182(0, var8.field114[var7.field2468[var14]], 0, 0, 0);
                        }
                        this.method1182(var8.field102[var15], var8.field114[var15], var7.field2466[var14], var7.field2472[var14], var7.field2469[var14]);
                    }
                }
                super.field1884 = false;
            } else {
                this.method614(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lf;I)V")
    public final void method614(class51 arg0, int arg1) {
        if (super.field1888 != null) {
            if (arg1 != -1) {
                class112 var3 = arg0.field1153[arg1];
                class7 var4 = var3.field2471;
                field3641 = 0;
                field3628 = 0;
                field3626 = 0;
                for (int var5 = 0; var5 < var3.field2470; ++var5) {
                    short var6 = var3.field2467[var5];
                    if (var3.field2468[var5] != -1) {
                        this.method1182(0, var4.field114[var3.field2468[var5]], 0, 0, 0);
                    }
                    this.method1182(var4.field102[var6], var4.field114[var6], var3.field2466[var5], var3.field2472[var5], var3.field2469[var5]);
                }
                super.field1884 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lia;")
    public final class81 method607(boolean arg0) {
        if (!arg0 && field3632.length < super.field1883) {
            field3632 = new byte[super.field1883 + 100];
        }
        return this.method1174(arg0, field3617, field3632);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method608();
            int var8 = class11.field207;
            int var9 = class11.field208;
            int var10 = field3620[arg0];
            int var11 = field3634[arg0];
            int var12 = field3620[arg1];
            int var13 = field3634[arg1];
            int var14 = field3620[arg2];
            int var15 = field3634[arg2];
            int var16 = field3620[arg3];
            int var17 = field3634[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field1874; ++var19) {
                int var20 = super.field1896[var19];
                int var21 = super.field1889[var19];
                int var22 = super.field1894[var19];
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
                field3624[var19] = var30 - var18;
                field3627[var19] = (var26 << 9) / var30 + var8;
                field3638[var19] = (var29 << 9) / var30 + var9;
                if (this.field3613 > 0) {
                    field3636[var19] = var26;
                    field3639[var19] = var29;
                    field3623[var19] = var30;
                }
            }
            this.method1175(false, false, 0L, super.field1878, super.field1878 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field1884) {
            this.method608();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field1893 * arg2 + super.field1886 * arg1 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field1893 * arg2 + super.field2440 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field1893 + var15 << 9;
                if (var16 / var13 > class11.field203) {
                    int var17 = var15 - super.field1893 << 9;
                    if (var17 / var13 < class11.field210) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field1893 * arg1 + super.field1886 * arg2 >> 16) + var18 << 9;
                        if (var19 / var13 > class11.field212) {
                            int var20 = (-super.field1893 * arg1 + super.field2440 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class11.field214) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field3613 > 0;
                                int var24 = class11.field207;
                                int var25 = class11.field208;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field3620[arg0];
                                    var27 = field3634[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class81.field1877 && var14 > 0) {
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
                                    int var33 = class81.field1895 - class11.field207;
                                    int var34 = class81.field1876 - class11.field208;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field1880, super.field1881, super.field1880, super.field1881, super.field1880, super.field1881, super.field1880, super.field1881 };
                                        int[] var40 = new int[] { super.field1887, super.field1887, super.field1882, super.field1882, super.field1887, super.field1887, super.field1882, super.field1882 };
                                        int[] var41 = new int[] { super.field2440, super.field2440, super.field2440, super.field2440, super.field1886, super.field1886, super.field1886, super.field1886 };
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
                                            if (super.field1892) {
                                                class81.field1885[class81.field1875++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field1874; ++var58) {
                                    int var59 = super.field1896[var58];
                                    int var60 = super.field1889[var58];
                                    int var61 = super.field1894[var58];
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
                                    field3624[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field3627[var58] = (var66 << 9) / var70 + var24;
                                        field3638[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field3627[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field3636[var58] = var66;
                                        field3639[var58] = var69;
                                        field3623[var58] = var70;
                                    }
                                }
                                try {
                                    this.method1175(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lia;)Lia;")
    public final class81 method1178(class81 arg0) {
        return new class177(new class177[] { this, (class177) arg0 }, 2);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([[IIIIZI)Lia;")
    public final class81 method606(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method608();
        int var7 = super.field1880 + arg1;
        int var8 = super.field1881 + arg1;
        int var9 = super.field1887 + arg3;
        int var10 = super.field1882 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class177 var15;
                if (arg4) {
                    var15 = new class177();
                    var15.field1874 = super.field1874;
                    var15.field1883 = super.field1883;
                    var15.field3613 = this.field3613;
                    var15.field1896 = super.field1896;
                    var15.field1894 = super.field1894;
                    var15.field3608 = this.field3608;
                    var15.field3616 = this.field3616;
                    var15.field3602 = this.field3602;
                    var15.field3604 = this.field3604;
                    var15.field3601 = this.field3601;
                    var15.field3612 = this.field3612;
                    var15.field3605 = this.field3605;
                    var15.field3618 = this.field3618;
                    var15.field3603 = this.field3603;
                    var15.field3614 = this.field3614;
                    var15.field3610 = this.field3610;
                    var15.field3609 = this.field3609;
                    var15.field3611 = this.field3611;
                    var15.field3607 = this.field3607;
                    var15.field1888 = super.field1888;
                    var15.field1890 = super.field1890;
                    var15.field1892 = super.field1892;
                    var15.field1889 = new int[var15.field1874];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field1874; ++var16) {
                        int var17 = super.field1896[var16] + arg1;
                        int var18 = super.field1894[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field1889[var16] = super.field1889[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field1874; ++var26) {
                        int var27 = (super.field1889[var26] << 16) / super.field2440;
                        if (var27 < arg5) {
                            int var28 = super.field1896[var26] + arg1;
                            int var29 = super.field1894[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field1889[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field1889[var26];
                        } else {
                            var15.field1889[var26] = super.field1889[var26];
                        }
                    }
                }
                super.field1884 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V")
    private final void method1180(int arg0) {
        if (field3635[arg0]) {
            this.method1183(arg0);
        } else {
            int var2 = this.field3608[arg0];
            int var3 = this.field3616[arg0];
            int var4 = this.field3602[arg0];
            class11.field213 = field3642[arg0];
            if (this.field3618 == null) {
                class11.field205 = 0;
            } else {
                class11.field205 = this.field3618[arg0] & 255;
            }
            if (this.field3614 != null && this.field3614[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field3603 != null && this.field3603[arg0] != -1) {
                    int var5 = this.field3603[arg0] & 255;
                    var6 = this.field3609[var5];
                    var7 = this.field3611[var5];
                    var8 = this.field3607[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field3612[arg0] == -1) {
                    class11.method86(field3638[var2], field3638[var3], field3638[var4], field3627[var2], field3627[var3], field3627[var4], this.field3604[arg0], this.field3604[arg0], this.field3604[arg0], field3636[var6], field3636[var7], field3636[var8], field3639[var6], field3639[var7], field3639[var8], field3623[var6], field3623[var7], field3623[var8], this.field3614[arg0]);
                } else {
                    class11.method86(field3638[var2], field3638[var3], field3638[var4], field3627[var2], field3627[var3], field3627[var4], this.field3604[arg0], this.field3601[arg0], this.field3612[arg0], field3636[var6], field3636[var7], field3636[var8], field3639[var6], field3639[var7], field3639[var8], field3623[var6], field3623[var7], field3623[var8], this.field3614[arg0]);
                }
            } else if (this.field3612[arg0] == -1) {
                class11.method79(field3638[var2], field3638[var3], field3638[var4], field3627[var2], field3627[var3], field3627[var4], field3633[this.field3604[arg0]]);
            } else {
                class11.method83(field3638[var2], field3638[var3], field3638[var4], field3627[var2], field3627[var3], field3627[var4], this.field3604[arg0], this.field3601[arg0], this.field3612[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)I")
    private static final int method1181(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[IIII)V")
    private final void method1182(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field3641 = 0;
            field3628 = 0;
            field3626 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field1888.length) {
                    int[] var10 = super.field1888[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field3641 += super.field1896[var12];
                        field3628 += super.field1889[var12];
                        field3626 += super.field1894[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field3641 = field3641 / var7 + arg2;
                field3628 = field3628 / var7 + arg3;
                field3626 = field3626 / var7 + arg4;
            } else {
                field3641 = arg2;
                field3628 = arg3;
                field3626 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field1888.length) {
                    int[] var15 = super.field1888[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field1896[var17] += arg2;
                        super.field1889[var17] += arg3;
                        super.field1894[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field1888.length) {
                    int[] var20 = super.field1888[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field1896[var22] -= field3641;
                        super.field1889[var22] -= field3628;
                        super.field1894[var22] -= field3626;
                        if (arg4 != 0) {
                            int var23 = field3620[arg4];
                            int var24 = field3634[arg4];
                            int var25 = super.field1896[var22] * var24 + super.field1889[var22] * var23 + 32767 >> 16;
                            super.field1889[var22] = super.field1889[var22] * var24 - super.field1896[var22] * var23 + 32767 >> 16;
                            super.field1896[var22] = var25;
                        }
                        if (arg2 != 0) {
                            int var26 = field3620[arg2];
                            int var27 = field3634[arg2];
                            int var28 = super.field1889[var22] * var27 - super.field1894[var22] * var26 + 32767 >> 16;
                            super.field1894[var22] = super.field1894[var22] * var27 + super.field1889[var22] * var26 + 32767 >> 16;
                            super.field1889[var22] = var28;
                        }
                        if (arg3 != 0) {
                            int var29 = field3620[arg3];
                            int var30 = field3634[arg3];
                            int var31 = super.field1896[var22] * var30 + super.field1894[var22] * var29 + 32767 >> 16;
                            super.field1894[var22] = super.field1894[var22] * var30 - super.field1896[var22] * var29 + 32767 >> 16;
                            super.field1896[var22] = var31;
                        }
                        super.field1896[var22] += field3641;
                        super.field1889[var22] += field3628;
                        super.field1894[var22] += field3626;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var32 = 0; var32 < var6; ++var32) {
                int var33 = arg1[var32];
                if (var33 < super.field1888.length) {
                    int[] var34 = super.field1888[var33];
                    for (int var35 = 0; var35 < var34.length; ++var35) {
                        int var36 = var34[var35];
                        super.field1896[var36] -= field3641;
                        super.field1889[var36] -= field3628;
                        super.field1894[var36] -= field3626;
                        super.field1896[var36] = super.field1896[var36] * arg2 / 128;
                        super.field1889[var36] = super.field1889[var36] * arg3 / 128;
                        super.field1894[var36] = super.field1894[var36] * arg4 / 128;
                        super.field1896[var36] += field3641;
                        super.field1889[var36] += field3628;
                        super.field1894[var36] += field3626;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field1890 != null && this.field3618 != null) {
                for (int var37 = 0; var37 < var6; ++var37) {
                    int var38 = arg1[var37];
                    if (var38 < super.field1890.length) {
                        int[] var39 = super.field1890[var38];
                        for (int var40 = 0; var40 < var39.length; ++var40) {
                            int var41 = var39[var40];
                            int var42 = (this.field3618[var41] & 255) + arg2 * 8;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 255) {
                                var42 = 255;
                            }
                            this.field3618[var41] = (byte) var42;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
    private final void method1183(int arg0) {
        int var2 = class11.field207;
        int var3 = class11.field208;
        int var4 = 0;
        int var5 = this.field3608[arg0];
        int var6 = this.field3616[arg0];
        int var7 = this.field3602[arg0];
        int var8 = field3623[var5];
        int var9 = field3623[var6];
        int var10 = field3623[var7];
        if (this.field3618 == null) {
            class11.field205 = 0;
        } else {
            class11.field205 = this.field3618[arg0] & 255;
        }
        if (var8 >= 50) {
            field3630[var4] = field3627[var5];
            field3643[var4] = field3638[var5];
            field3640[var4++] = this.field3604[arg0];
        } else {
            int var11 = field3636[var5];
            int var12 = field3639[var5];
            int var13 = this.field3604[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field3622[var10 - var8];
                field3630[var4] = (((field3636[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3612[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field3622[var9 - var8];
                field3630[var4] = (((field3636[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3601[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field3630[var4] = field3627[var6];
            field3643[var4] = field3638[var6];
            field3640[var4++] = this.field3601[arg0];
        } else {
            int var16 = field3636[var6];
            int var17 = field3639[var6];
            int var18 = this.field3601[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field3622[var8 - var9];
                field3630[var4] = (((field3636[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3604[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field3622[var10 - var9];
                field3630[var4] = (((field3636[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3612[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field3630[var4] = field3627[var7];
            field3643[var4] = field3638[var7];
            field3640[var4++] = this.field3612[arg0];
        } else {
            int var21 = field3636[var7];
            int var22 = field3639[var7];
            int var23 = this.field3612[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field3622[var9 - var10];
                field3630[var4] = (((field3636[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3601[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field3622[var8 - var10];
                field3630[var4] = (((field3636[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field3643[var4] = (((field3639[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field3640[var4++] = ((this.field3604[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field3630[0];
        int var27 = field3630[1];
        int var28 = field3630[2];
        int var29 = field3643[0];
        int var30 = field3643[1];
        int var31 = field3643[2];
        class11.field213 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class11.field209 || var27 > class11.field209 || var28 > class11.field209) {
                class11.field213 = true;
            }
            if (this.field3614 != null && this.field3614[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field3603 != null && this.field3603[arg0] != -1) {
                    int var32 = this.field3603[arg0] & 255;
                    var33 = this.field3609[var32];
                    var34 = this.field3611[var32];
                    var35 = this.field3607[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field3612[arg0] == -1) {
                    class11.method86(var29, var30, var31, var26, var27, var28, this.field3604[arg0], this.field3604[arg0], this.field3604[arg0], field3636[var33], field3636[var34], field3636[var35], field3639[var33], field3639[var34], field3639[var35], field3623[var33], field3623[var34], field3623[var35], this.field3614[arg0]);
                } else {
                    class11.method86(var29, var30, var31, var26, var27, var28, field3640[0], field3640[1], field3640[2], field3636[var33], field3636[var34], field3636[var35], field3639[var33], field3639[var34], field3639[var35], field3623[var33], field3623[var34], field3623[var35], this.field3614[arg0]);
                }
            } else if (this.field3612[arg0] == -1) {
                class11.method79(var29, var30, var31, var26, var27, var28, field3633[this.field3604[arg0]]);
            } else {
                class11.method83(var29, var30, var31, var26, var27, var28, field3640[0], field3640[1], field3640[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class11.field209 || var27 > class11.field209 || var28 > class11.field209 || field3630[3] < 0 || field3630[3] > class11.field209) {
                class11.field213 = true;
            }
            if (this.field3614 == null || this.field3614[arg0] == -1) {
                if (this.field3612[arg0] == -1) {
                    int var41 = field3633[this.field3604[arg0]];
                    class11.method79(var29, var30, var31, var26, var27, var28, var41);
                    class11.method79(var29, var31, field3643[3], var26, var28, field3630[3], var41);
                    return;
                }
                class11.method83(var29, var30, var31, var26, var27, var28, field3640[0], field3640[1], field3640[2]);
                class11.method83(var29, var31, field3643[3], var26, var28, field3630[3], field3640[0], field3640[2], field3640[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field3603 != null && this.field3603[arg0] != -1) {
                int var36 = this.field3603[arg0] & 255;
                var37 = this.field3609[var36];
                var38 = this.field3611[var36];
                var39 = this.field3607[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field3614[arg0];
            if (this.field3612[arg0] == -1) {
                class11.method86(var29, var30, var31, var26, var27, var28, this.field3604[arg0], this.field3604[arg0], this.field3604[arg0], field3636[var37], field3636[var38], field3636[var39], field3639[var37], field3639[var38], field3639[var39], field3623[var37], field3623[var38], field3623[var39], var40);
                class11.method86(var29, var31, field3643[3], var26, var28, field3630[3], this.field3604[arg0], this.field3604[arg0], this.field3604[arg0], field3636[var37], field3636[var38], field3636[var39], field3639[var37], field3639[var38], field3639[var39], field3623[var37], field3623[var38], field3623[var39], var40);
                return;
            }
            class11.method86(var29, var30, var31, var26, var27, var28, field3640[0], field3640[1], field3640[2], field3636[var37], field3636[var38], field3636[var39], field3639[var37], field3639[var38], field3639[var39], field3623[var37], field3623[var38], field3623[var39], var40);
            class11.method86(var29, var31, field3643[3], var26, var28, field3630[3], field3640[0], field3640[2], field3640[3], field3636[var37], field3636[var38], field3636[var39], field3639[var37], field3639[var38], field3639[var39], field3623[var37], field3623[var38], field3623[var39], var40);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class177() {
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbe;IIIII)V")
    public class177(class16 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method138();
        arg0.method133();
        super.field1874 = arg0.field298;
        super.field1896 = arg0.field281;
        super.field1889 = arg0.field316;
        super.field1894 = arg0.field317;
        super.field1883 = arg0.field322;
        this.field3608 = arg0.field325;
        this.field3616 = arg0.field289;
        this.field3602 = arg0.field320;
        this.field3605 = arg0.field309;
        this.field3618 = arg0.field314;
        this.field3610 = arg0.field280;
        super.field1888 = arg0.field297;
        super.field1890 = arg0.field305;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field3604 = new int[super.field1883];
        this.field3601 = new int[super.field1883];
        this.field3612 = new int[super.field1883];
        if (arg0.field308 != null) {
            this.field3614 = new short[super.field1883];
            for (int var9 = 0; var9 < super.field1883; ++var9) {
                short var10 = arg0.field308[var9];
                if (var10 != -1 && class11.field217.method834(var10, 28222)) {
                    this.field3614[var9] = var10;
                } else {
                    this.field3614[var9] = -1;
                }
            }
        } else {
            this.field3614 = null;
        }
        if (arg0.field319 > 0 && arg0.field285 != null) {
            int[] var11 = new int[arg0.field319];
            for (int var12 = 0; var12 < super.field1883; ++var12) {
                if (arg0.field285[var12] != -1) {
                    ++var11[arg0.field285[var12] & 255];
                }
            }
            this.field3613 = 0;
            for (int var13 = 0; var13 < arg0.field319; ++var13) {
                if (var11[var13] > 0 && arg0.field284[var13] == 0) {
                    ++this.field3613;
                }
            }
            this.field3609 = new int[this.field3613];
            this.field3611 = new int[this.field3613];
            this.field3607 = new int[this.field3613];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field319; ++var15) {
                if (var11[var15] > 0 && arg0.field284[var15] == 0) {
                    this.field3609[var14] = arg0.field278[var15] & 65535;
                    this.field3611[var14] = arg0.field303[var15] & 65535;
                    this.field3607[var14] = arg0.field315[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field3603 = new byte[super.field1883];
            for (int var16 = 0; var16 < super.field1883; ++var16) {
                if (arg0.field285[var16] != -1) {
                    this.field3603[var16] = (byte) var11[arg0.field285[var16] & 255];
                    if (this.field3603[var16] == -1 && this.field3614 != null) {
                        this.field3614[var16] = -1;
                    }
                } else {
                    this.field3603[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field1883; ++var17) {
            byte var18;
            if (arg0.field311 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field311[var17];
            }
            byte var19;
            if (arg0.field314 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field314[var17];
            }
            short var20;
            if (this.field3614 == null) {
                var20 = -1;
            } else {
                var20 = this.field3614[var17];
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
                        class73 var28 = arg0.field324[var17];
                        int var29 = (var28.field1745 * arg5 + var28.field1746 * arg4 + var28.field1744 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field3604[var17] = method1176(arg0.field313[var17] & 65535, var29);
                        this.field3612[var17] = -1;
                    } else if (var18 == 3) {
                        this.field3604[var17] = 128;
                        this.field3612[var17] = -1;
                    } else {
                        this.field3612[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field313[var17] & 65535;
                    class198 var22;
                    if (arg0.field296 != null && arg0.field296[this.field3608[var17]] != null) {
                        var22 = arg0.field296[this.field3608[var17]];
                    } else {
                        var22 = arg0.field279[this.field3608[var17]];
                    }
                    int var23 = (var22.field3941 * arg5 + var22.field3945 * arg4 + var22.field3940 * arg3) / (var22.field3942 * var8) + arg1;
                    this.field3604[var17] = method1176(var21, var23);
                    class198 var24;
                    if (arg0.field296 != null && arg0.field296[this.field3616[var17]] != null) {
                        var24 = arg0.field296[this.field3616[var17]];
                    } else {
                        var24 = arg0.field279[this.field3616[var17]];
                    }
                    int var25 = (var24.field3941 * arg5 + var24.field3945 * arg4 + var24.field3940 * arg3) / (var24.field3942 * var8) + arg1;
                    this.field3601[var17] = method1176(var21, var25);
                    class198 var26;
                    if (arg0.field296 != null && arg0.field296[this.field3602[var17]] != null) {
                        var26 = arg0.field296[this.field3602[var17]];
                    } else {
                        var26 = arg0.field279[this.field3602[var17]];
                    }
                    int var27 = (var26.field3941 * arg5 + var26.field3945 * arg4 + var26.field3940 * arg3) / (var26.field3942 * var8) + arg1;
                    this.field3612[var17] = method1176(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class73 var36 = arg0.field324[var17];
                    int var37 = (var36.field1745 * arg5 + var36.field1746 * arg4 + var36.field1744 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field3604[var17] = method1181(var37);
                    this.field3612[var17] = -1;
                } else {
                    this.field3612[var17] = -2;
                }
            } else {
                class198 var30;
                if (arg0.field296 != null && arg0.field296[this.field3608[var17]] != null) {
                    var30 = arg0.field296[this.field3608[var17]];
                } else {
                    var30 = arg0.field279[this.field3608[var17]];
                }
                int var31 = (var30.field3941 * arg5 + var30.field3945 * arg4 + var30.field3940 * arg3) / (var30.field3942 * var8) + arg1;
                this.field3604[var17] = method1181(var31);
                class198 var32;
                if (arg0.field296 != null && arg0.field296[this.field3616[var17]] != null) {
                    var32 = arg0.field296[this.field3616[var17]];
                } else {
                    var32 = arg0.field279[this.field3616[var17]];
                }
                int var33 = (var32.field3941 * arg5 + var32.field3945 * arg4 + var32.field3940 * arg3) / (var32.field3942 * var8) + arg1;
                this.field3601[var17] = method1181(var33);
                class198 var34;
                if (arg0.field296 != null && arg0.field296[this.field3602[var17]] != null) {
                    var34 = arg0.field296[this.field3602[var17]];
                } else {
                    var34 = arg0.field279[this.field3602[var17]];
                }
                int var35 = (var34.field3941 * arg5 + var34.field3945 * arg4 + var34.field3940 * arg3) / (var34.field3942 * var8) + arg1;
                this.field3612[var17] = method1181(var35);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([Lsg;I)V")
    private class177(class177[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field1874 = 0;
        super.field1883 = 0;
        this.field3613 = 0;
        this.field3610 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class177 var13 = arg0[var7];
            if (var13 != null) {
                super.field1874 += var13.field1874;
                super.field1883 += var13.field1883;
                this.field3613 += var13.field3613;
                if (var13.field3605 != null) {
                    var3 = true;
                } else {
                    if (this.field3610 == -1) {
                        this.field3610 = var13.field3610;
                    }
                    if (this.field3610 != var13.field3610) {
                        var3 = true;
                    }
                }
                var4 |= var13.field3618 != null;
                var5 |= var13.field3614 != null;
                var6 |= var13.field3603 != null;
            }
        }
        super.field1896 = new int[super.field1874];
        super.field1889 = new int[super.field1874];
        super.field1894 = new int[super.field1874];
        this.field3608 = new int[super.field1883];
        this.field3616 = new int[super.field1883];
        this.field3602 = new int[super.field1883];
        this.field3604 = new int[super.field1883];
        this.field3601 = new int[super.field1883];
        this.field3612 = new int[super.field1883];
        if (var3) {
            this.field3605 = new byte[super.field1883];
        }
        if (var4) {
            this.field3618 = new byte[super.field1883];
        }
        if (var5) {
            this.field3614 = new short[super.field1883];
        }
        if (var6) {
            this.field3603 = new byte[super.field1883];
        }
        if (this.field3613 > 0) {
            this.field3609 = new int[this.field3613];
            this.field3611 = new int[this.field3613];
            this.field3607 = new int[this.field3613];
        }
        super.field1874 = 0;
        super.field1883 = 0;
        this.field3613 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class177 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field1883; ++var10) {
                    this.field3608[super.field1883] = var9.field3608[var10] + super.field1874;
                    this.field3616[super.field1883] = var9.field3616[var10] + super.field1874;
                    this.field3602[super.field1883] = var9.field3602[var10] + super.field1874;
                    this.field3604[super.field1883] = var9.field3604[var10];
                    this.field3601[super.field1883] = var9.field3601[var10];
                    this.field3612[super.field1883] = var9.field3612[var10];
                    if (var3) {
                        if (var9.field3605 != null) {
                            this.field3605[super.field1883] = var9.field3605[var10];
                        } else {
                            this.field3605[super.field1883] = var9.field3610;
                        }
                    }
                    if (var4 && var9.field3618 != null) {
                        this.field3618[super.field1883] = var9.field3618[var10];
                    }
                    if (var5) {
                        if (var9.field3614 != null) {
                            this.field3614[super.field1883] = var9.field3614[var10];
                        } else {
                            this.field3614[super.field1883] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field3603 != null && var9.field3603[var10] != -1) {
                            this.field3603[super.field1883] = (byte) (var9.field3603[var10] + this.field3613);
                        } else {
                            this.field3603[super.field1883] = -1;
                        }
                    }
                    ++super.field1883;
                }
                for (int var11 = 0; var11 < var9.field3613; ++var11) {
                    this.field3609[this.field3613] = var9.field3609[var11] + super.field1874;
                    this.field3611[this.field3613] = var9.field3611[var11] + super.field1874;
                    this.field3607[this.field3613] = var9.field3607[var11] + super.field1874;
                    ++this.field3613;
                }
                for (int var12 = 0; var12 < var9.field1874; ++var12) {
                    super.field1896[super.field1874] = var9.field1896[var12];
                    super.field1889[super.field1874] = var9.field1889[var12];
                    super.field1894[super.field1874] = var9.field1894[var12];
                    ++super.field1874;
                }
            }
        }
    }
}
