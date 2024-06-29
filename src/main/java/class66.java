import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class66 extends class36 {

    @OriginalMember(owner = "client!ha", name = "mc", descriptor = "B")
    private byte field1666 = 0;

    @OriginalMember(owner = "client!ha", name = "sc", descriptor = "I")
    private int field1672 = 0;

    @OriginalMember(owner = "client!ha", name = "pc", descriptor = "[I")
    private int[] field1669;

    @OriginalMember(owner = "client!ha", name = "ec", descriptor = "[I")
    private int[] field1658;

    @OriginalMember(owner = "client!ha", name = "jc", descriptor = "[I")
    private int[] field1663;

    @OriginalMember(owner = "client!ha", name = "qc", descriptor = "[B")
    private byte[] field1670;

    @OriginalMember(owner = "client!ha", name = "bc", descriptor = "[B")
    private byte[] field1655;

    @OriginalMember(owner = "client!ha", name = "rc", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "client!ha", name = "fc", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "client!ha", name = "gc", descriptor = "[I")
    private int[] field1660;

    @OriginalMember(owner = "client!ha", name = "dc", descriptor = "[S")
    private short[] field1657;

    @OriginalMember(owner = "client!ha", name = "kc", descriptor = "[I")
    private int[] field1664;

    @OriginalMember(owner = "client!ha", name = "hc", descriptor = "[I")
    private int[] field1661;

    @OriginalMember(owner = "client!ha", name = "cc", descriptor = "[I")
    private int[] field1656;

    @OriginalMember(owner = "client!ha", name = "nc", descriptor = "[B")
    private byte[] field1667;

    @OriginalMember(owner = "client!ha", name = "ic", descriptor = "Lha;")
    private static class66 field1662 = new class66();

    @OriginalMember(owner = "client!ha", name = "lc", descriptor = "[B")
    private static byte[] field1665 = new byte[1];

    @OriginalMember(owner = "client!ha", name = "oc", descriptor = "Lha;")
    private static class66 field1668 = new class66();

    @OriginalMember(owner = "client!ha", name = "yc", descriptor = "[I")
    private static int[] field1678 = class25.field571;

    @OriginalMember(owner = "client!ha", name = "wc", descriptor = "[I")
    private static int[] field1676 = class25.field570;

    @OriginalMember(owner = "client!ha", name = "xc", descriptor = "[I")
    private static int[] field1677 = class25.field575;

    @OriginalMember(owner = "client!ha", name = "zc", descriptor = "[B")
    private static byte[] field1679 = new byte[1];

    @OriginalMember(owner = "client!ha", name = "vc", descriptor = "[I")
    private static int[] field1675 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Ec", descriptor = "[I")
    private static int[] field1684 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Ac", descriptor = "[I")
    private static int[] field1680 = new int[10];

    @OriginalMember(owner = "client!ha", name = "Dc", descriptor = "[[I")
    private static int[][] field1683 = new int[1600][512];

    @OriginalMember(owner = "client!ha", name = "tc", descriptor = "[I")
    private static int[] field1673 = new int[1600];

    @OriginalMember(owner = "client!ha", name = "Ic", descriptor = "[I")
    private static int[] field1688 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Fc", descriptor = "[Z")
    private static boolean[] field1685 = new boolean[4096];

    @OriginalMember(owner = "client!ha", name = "Bc", descriptor = "[I")
    private static int[] field1681 = new int[2000];

    @OriginalMember(owner = "client!ha", name = "Mc", descriptor = "[I")
    private static int[] field1692 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Jc", descriptor = "[I")
    private static int[] field1689 = new int[10];

    @OriginalMember(owner = "client!ha", name = "Cc", descriptor = "[I")
    private static int[] field1682 = new int[10];

    @OriginalMember(owner = "client!ha", name = "Hc", descriptor = "[I")
    private static int[] field1687 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Pc", descriptor = "[I")
    private static int[] field1695 = new int[2000];

    @OriginalMember(owner = "client!ha", name = "Gc", descriptor = "[Z")
    private static boolean[] field1686 = new boolean[4096];

    @OriginalMember(owner = "client!ha", name = "Qc", descriptor = "[I")
    private static int[] field1696 = new int[12];

    @OriginalMember(owner = "client!ha", name = "uc", descriptor = "[[I")
    private static int[][] field1674 = new int[12][2000];

    @OriginalMember(owner = "client!ha", name = "Rc", descriptor = "[I")
    private static int[] field1697 = class25.field576;

    @OriginalMember(owner = "client!ha", name = "Nc", descriptor = "[I")
    private static int[] field1693 = new int[12];

    @OriginalMember(owner = "client!ha", name = "Sc", descriptor = "[I")
    private static int[] field1698 = new int[4096];

    @OriginalMember(owner = "client!ha", name = "Kc", descriptor = "I")
    private static int field1690;

    @OriginalMember(owner = "client!ha", name = "Lc", descriptor = "I")
    private static int field1691;

    @OriginalMember(owner = "client!ha", name = "Oc", descriptor = "I")
    private static int field1694;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    private static final int method617(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldc;ILdc;I[I)V")
    public final void method336(class33 arg0, int arg1, class33 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class159 var6 = arg0.field803[arg1];
                class159 var7 = arg2.field803[arg3];
                class170 var8 = var6.field3291;
                field1691 = 0;
                field1690 = 0;
                field1694 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field3282; ++var11) {
                    int var16 = var6.field3281[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3503[var16] == 0) {
                        this.method621(var8.field3503[var16], var8.field3493[var16], var6.field3286[var11], var6.field3290[var11], var6.field3285[var11]);
                    }
                }
                field1691 = 0;
                field1690 = 0;
                field1694 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field3282; ++var14) {
                    int var15 = var7.field3281[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3503[var15] == 0) {
                        this.method621(var8.field3503[var15], var8.field3493[var15], var7.field3286[var14], var7.field3290[var14], var7.field3285[var14]);
                    }
                }
                super.field834 = false;
            } else {
                this.method334(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    private final void method618(int arg0) {
        int var2 = class25.field565;
        int var3 = class25.field578;
        int var4 = 0;
        int var5 = this.field1669[arg0];
        int var6 = this.field1658[arg0];
        int var7 = this.field1663[arg0];
        int var8 = field1698[var5];
        int var9 = field1698[var6];
        int var10 = field1698[var7];
        if (this.field1655 == null) {
            class25.field562 = 0;
        } else {
            class25.field562 = this.field1655[arg0] & 255;
        }
        if (var8 >= 50) {
            field1689[var4] = field1675[var5];
            field1680[var4] = field1692[var5];
            field1682[var4++] = this.field1671[arg0];
        } else {
            int var11 = field1684[var5];
            int var12 = field1687[var5];
            int var13 = this.field1671[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1676[var10 - var8];
                field1689[var4] = (((field1684[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1660[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1676[var9 - var8];
                field1689[var4] = (((field1684[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1659[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1689[var4] = field1675[var6];
            field1680[var4] = field1692[var6];
            field1682[var4++] = this.field1659[arg0];
        } else {
            int var16 = field1684[var6];
            int var17 = field1687[var6];
            int var18 = this.field1659[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1676[var8 - var9];
                field1689[var4] = (((field1684[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1671[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1676[var10 - var9];
                field1689[var4] = (((field1684[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1660[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1689[var4] = field1675[var7];
            field1680[var4] = field1692[var7];
            field1682[var4++] = this.field1660[arg0];
        } else {
            int var21 = field1684[var7];
            int var22 = field1687[var7];
            int var23 = this.field1660[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1676[var9 - var10];
                field1689[var4] = (((field1684[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1659[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1676[var8 - var10];
                field1689[var4] = (((field1684[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1680[var4] = (((field1687[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1682[var4++] = ((this.field1671[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1689[0];
        int var27 = field1689[1];
        int var28 = field1689[2];
        int var29 = field1680[0];
        int var30 = field1680[1];
        int var31 = field1680[2];
        class25.field577 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class25.field581 || var27 > class25.field581 || var28 > class25.field581) {
                class25.field577 = true;
            }
            if (this.field1657 != null && this.field1657[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1667 != null && this.field1667[arg0] != -1) {
                    int var32 = this.field1667[arg0] & 255;
                    var33 = this.field1664[var32];
                    var34 = this.field1661[var32];
                    var35 = this.field1656[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field1660[arg0] == -1) {
                    class25.method240(var29, var30, var31, var26, var27, var28, this.field1671[arg0], this.field1671[arg0], this.field1671[arg0], field1684[var33], field1684[var34], field1684[var35], field1687[var33], field1687[var34], field1687[var35], field1698[var33], field1698[var34], field1698[var35], this.field1657[arg0]);
                } else {
                    class25.method240(var29, var30, var31, var26, var27, var28, field1682[0], field1682[1], field1682[2], field1684[var33], field1684[var34], field1684[var35], field1687[var33], field1687[var34], field1687[var35], field1698[var33], field1698[var34], field1698[var35], this.field1657[arg0]);
                }
            } else if (this.field1660[arg0] == -1) {
                class25.method253(var29, var30, var31, var26, var27, var28, field1677[this.field1671[arg0]]);
            } else {
                class25.method246(var29, var30, var31, var26, var27, var28, field1682[0], field1682[1], field1682[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class25.field581 || var27 > class25.field581 || var28 > class25.field581 || field1689[3] < 0 || field1689[3] > class25.field581) {
                class25.field577 = true;
            }
            if (this.field1657 == null || this.field1657[arg0] == -1) {
                if (this.field1660[arg0] == -1) {
                    int var41 = field1677[this.field1671[arg0]];
                    class25.method253(var29, var30, var31, var26, var27, var28, var41);
                    class25.method253(var29, var31, field1680[3], var26, var28, field1689[3], var41);
                    return;
                }
                class25.method246(var29, var30, var31, var26, var27, var28, field1682[0], field1682[1], field1682[2]);
                class25.method246(var29, var31, field1680[3], var26, var28, field1689[3], field1682[0], field1682[2], field1682[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field1667 != null && this.field1667[arg0] != -1) {
                int var36 = this.field1667[arg0] & 255;
                var37 = this.field1664[var36];
                var38 = this.field1661[var36];
                var39 = this.field1656[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field1657[arg0];
            if (this.field1660[arg0] == -1) {
                class25.method240(var29, var30, var31, var26, var27, var28, this.field1671[arg0], this.field1671[arg0], this.field1671[arg0], field1684[var37], field1684[var38], field1684[var39], field1687[var37], field1687[var38], field1687[var39], field1698[var37], field1698[var38], field1698[var39], var40);
                class25.method240(var29, var31, field1680[3], var26, var28, field1689[3], this.field1671[arg0], this.field1671[arg0], this.field1671[arg0], field1684[var37], field1684[var38], field1684[var39], field1687[var37], field1687[var38], field1687[var39], field1698[var37], field1698[var38], field1698[var39], var40);
                return;
            }
            class25.method240(var29, var30, var31, var26, var27, var28, field1682[0], field1682[1], field1682[2], field1684[var37], field1684[var38], field1684[var39], field1687[var37], field1687[var38], field1687[var39], field1698[var37], field1698[var38], field1698[var39], var40);
            class25.method240(var29, var31, field1680[3], var26, var28, field1689[3], field1682[0], field1682[2], field1682[3], field1684[var37], field1684[var38], field1684[var39], field1687[var37], field1687[var38], field1687[var39], field1698[var37], field1698[var38], field1698[var39], var40);
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    private final void method619(int arg0) {
        if (field1685[arg0]) {
            this.method618(arg0);
        } else {
            int var2 = this.field1669[arg0];
            int var3 = this.field1658[arg0];
            int var4 = this.field1663[arg0];
            class25.field577 = field1686[arg0];
            if (this.field1655 == null) {
                class25.field562 = 0;
            } else {
                class25.field562 = this.field1655[arg0] & 255;
            }
            if (this.field1657 != null && this.field1657[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field1667 != null && this.field1667[arg0] != -1) {
                    int var5 = this.field1667[arg0] & 255;
                    var6 = this.field1664[var5];
                    var7 = this.field1661[var5];
                    var8 = this.field1656[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field1660[arg0] == -1) {
                    class25.method240(field1692[var2], field1692[var3], field1692[var4], field1675[var2], field1675[var3], field1675[var4], this.field1671[arg0], this.field1671[arg0], this.field1671[arg0], field1684[var6], field1684[var7], field1684[var8], field1687[var6], field1687[var7], field1687[var8], field1698[var6], field1698[var7], field1698[var8], this.field1657[arg0]);
                } else {
                    class25.method240(field1692[var2], field1692[var3], field1692[var4], field1675[var2], field1675[var3], field1675[var4], this.field1671[arg0], this.field1659[arg0], this.field1660[arg0], field1684[var6], field1684[var7], field1684[var8], field1687[var6], field1687[var7], field1687[var8], field1698[var6], field1698[var7], field1698[var8], this.field1657[arg0]);
                }
            } else if (this.field1660[arg0] == -1) {
                class25.method253(field1692[var2], field1692[var3], field1692[var4], field1675[var2], field1675[var3], field1675[var4], field1677[this.field1671[arg0]]);
            } else {
                class25.method246(field1692[var2], field1692[var3], field1692[var4], field1675[var2], field1675[var3], field1675[var4], this.field1671[arg0], this.field1659[arg0], this.field1660[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field834) {
            this.method331();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field844 * arg2 + super.field831 * arg1 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field844 * arg2 + super.field728 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field844 + var15 << 9;
                if (var16 / var13 > class25.field573) {
                    int var17 = var15 - super.field844 << 9;
                    if (var17 / var13 < class25.field574) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field844 * arg1 + super.field831 * arg2 >> 16) + var18 << 9;
                        if (var19 / var13 > class25.field568) {
                            int var20 = (-super.field844 * arg1 + super.field728 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class25.field564) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field1672 > 0;
                                int var24 = class25.field565;
                                int var25 = class25.field578;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field1678[arg0];
                                    var27 = field1697[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class36.field840 && var14 > 0) {
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
                                    int var33 = class36.field852 - class25.field565;
                                    int var34 = class36.field851 - class25.field578;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field837, super.field845, super.field837, super.field845, super.field837, super.field845, super.field837, super.field845 };
                                        int[] var40 = new int[] { super.field850, super.field850, super.field849, super.field849, super.field850, super.field850, super.field849, super.field849 };
                                        int[] var41 = new int[] { super.field728, super.field728, super.field728, super.field728, super.field831, super.field831, super.field831, super.field831 };
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
                                            if (super.field843) {
                                                class36.field838[class36.field847++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field836; ++var58) {
                                    int var59 = super.field830[var58];
                                    int var60 = super.field848[var58];
                                    int var61 = super.field841[var58];
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
                                    field1688[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field1675[var58] = (var66 << 9) / var70 + var24;
                                        field1692[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field1675[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field1684[var58] = var66;
                                        field1687[var58] = var69;
                                        field1698[var58] = var70;
                                    }
                                }
                                try {
                                    this.method625(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IIII)V")
    private final void method621(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1691 = 0;
            field1690 = 0;
            field1694 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field832.length) {
                    int[] var10 = super.field832[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1691 += super.field830[var12];
                        field1690 += super.field848[var12];
                        field1694 += super.field841[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1691 = field1691 / var7 + arg2;
                field1690 = field1690 / var7 + arg3;
                field1694 = field1694 / var7 + arg4;
            } else {
                field1691 = arg2;
                field1690 = arg3;
                field1694 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field832.length) {
                    int[] var15 = super.field832[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field830[var17] += arg2;
                        super.field848[var17] += arg3;
                        super.field841[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field832.length) {
                    int[] var20 = super.field832[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field830[var22] -= field1691;
                        super.field848[var22] -= field1690;
                        super.field841[var22] -= field1694;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field1678[var25];
                            int var27 = field1697[var25];
                            int var28 = super.field848[var22] * var26 + super.field830[var22] * var27 + 32767 >> 16;
                            super.field848[var22] = super.field848[var22] * var27 - super.field830[var22] * var26 + 32767 >> 16;
                            super.field830[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1678[var23];
                            int var30 = field1697[var23];
                            int var31 = super.field848[var22] * var30 - super.field841[var22] * var29 + 32767 >> 16;
                            super.field841[var22] = super.field848[var22] * var29 + super.field841[var22] * var30 + 32767 >> 16;
                            super.field848[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1678[var24];
                            int var33 = field1697[var24];
                            int var34 = super.field841[var22] * var32 + super.field830[var22] * var33 + 32767 >> 16;
                            super.field841[var22] = super.field841[var22] * var33 - super.field830[var22] * var32 + 32767 >> 16;
                            super.field830[var22] = var34;
                        }
                        super.field830[var22] += field1691;
                        super.field848[var22] += field1690;
                        super.field841[var22] += field1694;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field832.length) {
                    int[] var37 = super.field832[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field830[var39] -= field1691;
                        super.field848[var39] -= field1690;
                        super.field841[var39] -= field1694;
                        super.field830[var39] = super.field830[var39] * arg2 / 128;
                        super.field848[var39] = super.field848[var39] * arg3 / 128;
                        super.field841[var39] = super.field841[var39] * arg4 / 128;
                        super.field830[var39] += field1691;
                        super.field848[var39] += field1690;
                        super.field841[var39] += field1694;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field839 != null && this.field1655 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field839.length) {
                        int[] var42 = super.field839[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field1655[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field1655[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[IIIIZI)Ldf;")
    public final class36 method330(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method331();
        int var7 = super.field837 + arg1;
        int var8 = super.field845 + arg1;
        int var9 = super.field850 + arg3;
        int var10 = super.field849 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class66 var15;
                if (arg4) {
                    var15 = new class66();
                    var15.field836 = super.field836;
                    var15.field833 = super.field833;
                    var15.field1672 = this.field1672;
                    var15.field830 = super.field830;
                    var15.field841 = super.field841;
                    var15.field1669 = this.field1669;
                    var15.field1658 = this.field1658;
                    var15.field1663 = this.field1663;
                    var15.field1671 = this.field1671;
                    var15.field1659 = this.field1659;
                    var15.field1660 = this.field1660;
                    var15.field1670 = this.field1670;
                    var15.field1655 = this.field1655;
                    var15.field1667 = this.field1667;
                    var15.field1657 = this.field1657;
                    var15.field1666 = this.field1666;
                    var15.field1664 = this.field1664;
                    var15.field1661 = this.field1661;
                    var15.field1656 = this.field1656;
                    var15.field832 = super.field832;
                    var15.field839 = super.field839;
                    var15.field843 = super.field843;
                    var15.field848 = new int[var15.field836];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field836; ++var16) {
                        int var17 = super.field830[var16] + arg1;
                        int var18 = super.field841[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field848[var16] = super.field848[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field836; ++var26) {
                        int var27 = (super.field848[var26] << 16) / super.field728;
                        if (var27 < arg5) {
                            int var28 = super.field830[var26] + arg1;
                            int var29 = super.field841[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field848[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field848[var26];
                        } else {
                            var15.field848[var26] = super.field848[var26];
                        }
                    }
                }
                super.field834 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(Z)Ldf;")
    public final class36 method339(boolean arg0) {
        if (!arg0 && field1665.length < super.field833) {
            field1665 = new byte[super.field833 + 100];
        }
        return this.method626(arg0, field1662, field1665);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)Ldf;")
    public final class36 method332(boolean arg0) {
        if (!arg0 && field1679.length < super.field833) {
            field1679 = new byte[super.field833 + 100];
        }
        return this.method626(arg0, field1668, field1679);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldc;I)V")
    public final void method334(class33 arg0, int arg1) {
        if (super.field832 != null) {
            if (arg1 != -1) {
                class159 var3 = arg0.field803[arg1];
                class170 var4 = var3.field3291;
                field1691 = 0;
                field1690 = 0;
                field1694 = 0;
                for (int var5 = 0; var5 < var3.field3282; ++var5) {
                    int var6 = var3.field3281[var5];
                    this.method621(var4.field3503[var6], var4.field3493[var6], var3.field3286[var5], var3.field3290[var5], var3.field3285[var5]);
                }
                super.field834 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldf;)Ldf;")
    public final class36 method622(class36 arg0) {
        return new class66(new class66[] { this, (class66) arg0 }, 2);
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()V")
    public static void method623() {
        field1662 = null;
        field1665 = null;
        field1668 = null;
        field1679 = null;
        field1686 = null;
        field1685 = null;
        field1675 = null;
        field1692 = null;
        field1688 = null;
        field1684 = null;
        field1687 = null;
        field1698 = null;
        field1673 = null;
        field1683 = null;
        field1696 = null;
        field1674 = null;
        field1681 = null;
        field1695 = null;
        field1693 = null;
        field1689 = null;
        field1680 = null;
        field1682 = null;
        field1678 = null;
        field1697 = null;
        field1677 = null;
        field1676 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method331();
            int var8 = class25.field565;
            int var9 = class25.field578;
            int var10 = field1678[arg0];
            int var11 = field1697[arg0];
            int var12 = field1678[arg1];
            int var13 = field1697[arg1];
            int var14 = field1678[arg2];
            int var15 = field1697[arg2];
            int var16 = field1678[arg3];
            int var17 = field1697[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field836; ++var19) {
                int var20 = super.field830[var19];
                int var21 = super.field848[var19];
                int var22 = super.field841[var19];
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
                field1688[var19] = var30 - var18;
                field1675[var19] = (var26 << 9) / var30 + var8;
                field1692[var19] = (var29 << 9) / var30 + var9;
                if (this.field1672 > 0) {
                    field1684[var19] = var26;
                    field1687[var19] = var29;
                    field1698[var19] = var30;
                }
            }
            this.method625(false, false, 0L, super.field846, super.field846 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIII)V")
    public final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method331();
            int var9 = class25.field565;
            int var10 = class25.field578;
            int var11 = field1678[arg0];
            int var12 = field1697[arg0];
            int var13 = field1678[arg1];
            int var14 = field1697[arg1];
            int var15 = field1678[arg2];
            int var16 = field1697[arg2];
            int var17 = field1678[arg3];
            int var18 = field1697[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field836; ++var20) {
                int var21 = super.field830[var20];
                int var22 = super.field848[var20];
                int var23 = super.field841[var20];
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
                field1688[var20] = var31 - var19;
                field1675[var20] = (var27 << 9) / arg7 + var9;
                field1692[var20] = (var30 << 9) / arg7 + var10;
                if (this.field1672 > 0) {
                    field1684[var20] = var27;
                    field1687[var20] = var30;
                    field1698[var20] = var31;
                }
            }
            this.method625(false, false, 0L, super.field846, super.field846 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)I")
    private static final int method624(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZJII)V")
    private final void method625(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field1673[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field833; ++var8) {
                if (this.field1660[var8] != -2) {
                    int var33 = this.field1669[var8];
                    int var34 = this.field1658[var8];
                    int var35 = this.field1663[var8];
                    int var36 = field1675[var33];
                    int var37 = field1675[var34];
                    int var38 = field1675[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method620(class36.field852, class36.field851, field1692[var33], field1692[var34], field1692[var35], var36, var37, var38)) {
                            class36.field838[class36.field847++] = arg2;
                            arg1 = false;
                        }
                        if ((field1692[var35] - field1692[var34]) * (var36 - var37) - (field1692[var33] - field1692[var34]) * (var38 - var37) > 0) {
                            field1685[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class25.field581 && var37 <= class25.field581 && var38 <= class25.field581) {
                                field1686[var8] = false;
                            } else {
                                field1686[var8] = true;
                            }
                            int var58 = (field1688[var33] + field1688[var34] + field1688[var35]) / 3 + arg3;
                            field1683[var58][field1673[var58]++] = var8;
                        }
                    } else {
                        int var39 = field1684[var33];
                        int var40 = field1684[var34];
                        int var41 = field1684[var35];
                        int var42 = field1687[var33];
                        int var43 = field1687[var34];
                        int var44 = field1687[var35];
                        int var45 = field1698[var33];
                        int var46 = field1698[var34];
                        int var47 = field1698[var35];
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
                            field1685[var8] = true;
                            int var57 = (field1688[var33] + field1688[var34] + field1688[var35]) / 3 + arg3;
                            field1683[var57][field1673[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field1670 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field1673[var9];
                    if (var10 > 0) {
                        int[] var11 = field1683[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method619(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field1696[var13] = 0;
                    field1693[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field1673[var14];
                    if (var27 > 0) {
                        int[] var28 = field1683[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field1670[var30];
                            int var32 = field1696[var31]++;
                            field1674[var31][var32] = var30;
                            if (var31 < 10) {
                                field1693[var31] += var14;
                            } else if (var31 == 10) {
                                field1681[var32] = var14;
                            } else {
                                field1695[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field1696[1] > 0 || field1696[2] > 0) {
                    var15 = (field1693[1] + field1693[2]) / (field1696[1] + field1696[2]);
                }
                int var16 = 0;
                if (field1696[3] > 0 || field1696[4] > 0) {
                    var16 = (field1693[3] + field1693[4]) / (field1696[3] + field1696[4]);
                }
                int var17 = 0;
                if (field1696[6] > 0 || field1696[8] > 0) {
                    var17 = (field1693[6] + field1693[8]) / (field1696[6] + field1696[8]);
                }
                int var18 = 0;
                int var19 = field1696[10];
                int[] var20 = field1674[10];
                int[] var21 = field1681;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field1696[11];
                    var20 = field1674[11];
                    var21 = field1695;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method619(var20[var18++]);
                        if (var18 == var19 && field1674[11] != var20) {
                            var18 = 0;
                            var19 = field1696[11];
                            var20 = field1674[11];
                            var21 = field1695;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method619(var20[var18++]);
                        if (var18 == var19 && field1674[11] != var20) {
                            var18 = 0;
                            var19 = field1696[11];
                            var20 = field1674[11];
                            var21 = field1695;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method619(var20[var18++]);
                        if (var18 == var19 && field1674[11] != var20) {
                            var18 = 0;
                            var19 = field1696[11];
                            var20 = field1674[11];
                            var21 = field1695;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field1696[var23];
                    int[] var25 = field1674[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method619(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method619(var20[var18++]);
                    if (var18 == var19 && field1674[11] != var20) {
                        var18 = 0;
                        var20 = field1674[11];
                        var19 = field1696[11];
                        var21 = field1695;
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

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLha;[B)Lha;")
    private final class66 method626(boolean arg0, class66 arg1, byte[] arg2) {
        arg1.field836 = super.field836;
        arg1.field833 = super.field833;
        arg1.field1672 = this.field1672;
        if (arg1.field830 == null || arg1.field830.length < super.field836) {
            arg1.field830 = new int[super.field836 + 100];
            arg1.field848 = new int[super.field836 + 100];
            arg1.field841 = new int[super.field836 + 100];
        }
        for (int var4 = 0; var4 < super.field836; ++var4) {
            arg1.field830[var4] = super.field830[var4];
            arg1.field848[var4] = super.field848[var4];
            arg1.field841[var4] = super.field841[var4];
        }
        if (arg0) {
            arg1.field1655 = this.field1655;
        } else {
            arg1.field1655 = arg2;
            if (this.field1655 == null) {
                for (int var5 = 0; var5 < super.field833; ++var5) {
                    arg1.field1655[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field833; ++var6) {
                    arg1.field1655[var6] = this.field1655[var6];
                }
            }
        }
        arg1.field1669 = this.field1669;
        arg1.field1658 = this.field1658;
        arg1.field1663 = this.field1663;
        arg1.field1671 = this.field1671;
        arg1.field1659 = this.field1659;
        arg1.field1660 = this.field1660;
        arg1.field1670 = this.field1670;
        arg1.field1667 = this.field1667;
        arg1.field1657 = this.field1657;
        arg1.field1666 = this.field1666;
        arg1.field1664 = this.field1664;
        arg1.field1661 = this.field1661;
        arg1.field1656 = this.field1656;
        arg1.field832 = super.field832;
        arg1.field839 = super.field839;
        arg1.field843 = super.field843;
        arg1.field834 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class66() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lka;IIIII)V")
    public class66(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method789();
        arg0.method790();
        super.field836 = arg0.field2134;
        super.field830 = arg0.field2170;
        super.field848 = arg0.field2166;
        super.field841 = arg0.field2169;
        super.field833 = arg0.field2172;
        this.field1669 = arg0.field2144;
        this.field1658 = arg0.field2140;
        this.field1663 = arg0.field2138;
        this.field1670 = arg0.field2152;
        this.field1655 = arg0.field2148;
        this.field1666 = arg0.field2167;
        super.field832 = arg0.field2177;
        super.field839 = arg0.field2161;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field1671 = new int[super.field833];
        this.field1659 = new int[super.field833];
        this.field1660 = new int[super.field833];
        if (arg0.field2142 != null) {
            this.field1657 = new short[super.field833];
            for (int var9 = 0; var9 < super.field833; ++var9) {
                short var10 = arg0.field2142[var9];
                if (var10 != -1 && class25.field569.method1250(-15187, var10)) {
                    this.field1657[var9] = var10;
                } else {
                    this.field1657[var9] = -1;
                }
            }
        } else {
            this.field1657 = null;
        }
        if (arg0.field2135 > 0 && arg0.field2180 != null) {
            int[] var11 = new int[arg0.field2135];
            for (int var12 = 0; var12 < super.field833; ++var12) {
                if (arg0.field2180[var12] != -1) {
                    ++var11[arg0.field2180[var12] & 255];
                }
            }
            this.field1672 = 0;
            for (int var13 = 0; var13 < arg0.field2135; ++var13) {
                if (var11[var13] > 0 && arg0.field2171[var13] == 0) {
                    ++this.field1672;
                }
            }
            this.field1664 = new int[this.field1672];
            this.field1661 = new int[this.field1672];
            this.field1656 = new int[this.field1672];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2135; ++var15) {
                if (var11[var15] > 0 && arg0.field2171[var15] == 0) {
                    this.field1664[var14] = arg0.field2147[var15] & 65535;
                    this.field1661[var14] = arg0.field2160[var15] & 65535;
                    this.field1656[var14] = arg0.field2179[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field1667 = new byte[super.field833];
            for (int var16 = 0; var16 < super.field833; ++var16) {
                if (arg0.field2180[var16] != -1) {
                    this.field1667[var16] = (byte) var11[arg0.field2180[var16] & 255];
                    if (this.field1667[var16] == -1 && this.field1657 != null) {
                        this.field1657[var16] = -1;
                    }
                } else {
                    this.field1667[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field833; ++var17) {
            byte var18;
            if (arg0.field2143 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2143[var17];
            }
            byte var19;
            if (arg0.field2148 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2148[var17];
            }
            short var20;
            if (this.field1657 == null) {
                var20 = -1;
            } else {
                var20 = this.field1657[var17];
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
                        class68 var28 = arg0.field2176[var17];
                        int var29 = (var28.field1712 * arg5 + var28.field1715 * arg4 + var28.field1709 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field1671[var17] = method617(arg0.field2141[var17] & 65535, var29);
                        this.field1660[var17] = -1;
                    } else if (var18 == 3) {
                        this.field1671[var17] = 128;
                        this.field1660[var17] = -1;
                    } else {
                        this.field1660[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2141[var17] & 65535;
                    class43 var22;
                    if (arg0.field2153 != null && arg0.field2153[this.field1669[var17]] != null) {
                        var22 = arg0.field2153[this.field1669[var17]];
                    } else {
                        var22 = arg0.field2156[this.field1669[var17]];
                    }
                    int var23 = (var22.field1041 * arg5 + var22.field1048 * arg3 + var22.field1037 * arg4) / (var22.field1047 * var8) + arg1;
                    this.field1671[var17] = method617(var21, var23);
                    class43 var24;
                    if (arg0.field2153 != null && arg0.field2153[this.field1658[var17]] != null) {
                        var24 = arg0.field2153[this.field1658[var17]];
                    } else {
                        var24 = arg0.field2156[this.field1658[var17]];
                    }
                    int var25 = (var24.field1041 * arg5 + var24.field1048 * arg3 + var24.field1037 * arg4) / (var24.field1047 * var8) + arg1;
                    this.field1659[var17] = method617(var21, var25);
                    class43 var26;
                    if (arg0.field2153 != null && arg0.field2153[this.field1663[var17]] != null) {
                        var26 = arg0.field2153[this.field1663[var17]];
                    } else {
                        var26 = arg0.field2156[this.field1663[var17]];
                    }
                    int var27 = (var26.field1041 * arg5 + var26.field1048 * arg3 + var26.field1037 * arg4) / (var26.field1047 * var8) + arg1;
                    this.field1660[var17] = method617(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class68 var36 = arg0.field2176[var17];
                    int var37 = (var36.field1712 * arg5 + var36.field1715 * arg4 + var36.field1709 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field1671[var17] = method624(var37);
                    this.field1660[var17] = -1;
                } else {
                    this.field1660[var17] = -2;
                }
            } else {
                class43 var30;
                if (arg0.field2153 != null && arg0.field2153[this.field1669[var17]] != null) {
                    var30 = arg0.field2153[this.field1669[var17]];
                } else {
                    var30 = arg0.field2156[this.field1669[var17]];
                }
                int var31 = (var30.field1041 * arg5 + var30.field1048 * arg3 + var30.field1037 * arg4) / (var30.field1047 * var8) + arg1;
                this.field1671[var17] = method624(var31);
                class43 var32;
                if (arg0.field2153 != null && arg0.field2153[this.field1658[var17]] != null) {
                    var32 = arg0.field2153[this.field1658[var17]];
                } else {
                    var32 = arg0.field2156[this.field1658[var17]];
                }
                int var33 = (var32.field1041 * arg5 + var32.field1048 * arg3 + var32.field1037 * arg4) / (var32.field1047 * var8) + arg1;
                this.field1659[var17] = method624(var33);
                class43 var34;
                if (arg0.field2153 != null && arg0.field2153[this.field1663[var17]] != null) {
                    var34 = arg0.field2153[this.field1663[var17]];
                } else {
                    var34 = arg0.field2156[this.field1663[var17]];
                }
                int var35 = (var34.field1041 * arg5 + var34.field1048 * arg3 + var34.field1037 * arg4) / (var34.field1047 * var8) + arg1;
                this.field1660[var17] = method624(var35);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([Lha;I)V")
    private class66(class66[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field836 = 0;
        super.field833 = 0;
        this.field1672 = 0;
        this.field1666 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class66 var13 = arg0[var7];
            if (var13 != null) {
                super.field836 += var13.field836;
                super.field833 += var13.field833;
                this.field1672 += var13.field1672;
                if (var13.field1670 != null) {
                    var3 = true;
                } else {
                    if (this.field1666 == -1) {
                        this.field1666 = var13.field1666;
                    }
                    if (this.field1666 != var13.field1666) {
                        var3 = true;
                    }
                }
                var4 |= var13.field1655 != null;
                var5 |= var13.field1657 != null;
                var6 |= var13.field1667 != null;
            }
        }
        super.field830 = new int[super.field836];
        super.field848 = new int[super.field836];
        super.field841 = new int[super.field836];
        this.field1669 = new int[super.field833];
        this.field1658 = new int[super.field833];
        this.field1663 = new int[super.field833];
        this.field1671 = new int[super.field833];
        this.field1659 = new int[super.field833];
        this.field1660 = new int[super.field833];
        if (var3) {
            this.field1670 = new byte[super.field833];
        }
        if (var4) {
            this.field1655 = new byte[super.field833];
        }
        if (var5) {
            this.field1657 = new short[super.field833];
        }
        if (var6) {
            this.field1667 = new byte[super.field833];
        }
        if (this.field1672 > 0) {
            this.field1664 = new int[this.field1672];
            this.field1661 = new int[this.field1672];
            this.field1656 = new int[this.field1672];
        }
        super.field836 = 0;
        super.field833 = 0;
        this.field1672 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class66 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field833; ++var10) {
                    this.field1669[super.field833] = var9.field1669[var10] + super.field836;
                    this.field1658[super.field833] = var9.field1658[var10] + super.field836;
                    this.field1663[super.field833] = var9.field1663[var10] + super.field836;
                    this.field1671[super.field833] = var9.field1671[var10];
                    this.field1659[super.field833] = var9.field1659[var10];
                    this.field1660[super.field833] = var9.field1660[var10];
                    if (var3) {
                        if (var9.field1670 != null) {
                            this.field1670[super.field833] = var9.field1670[var10];
                        } else {
                            this.field1670[super.field833] = var9.field1666;
                        }
                    }
                    if (var4 && var9.field1655 != null) {
                        this.field1655[super.field833] = var9.field1655[var10];
                    }
                    if (var5) {
                        if (var9.field1657 != null) {
                            this.field1657[super.field833] = var9.field1657[var10];
                        } else {
                            this.field1657[super.field833] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field1667 != null && var9.field1667[var10] != -1) {
                            this.field1667[super.field833] = (byte) (var9.field1667[var10] + this.field1672);
                        } else {
                            this.field1667[super.field833] = -1;
                        }
                    }
                    ++super.field833;
                }
                for (int var11 = 0; var11 < var9.field1672; ++var11) {
                    this.field1664[this.field1672] = var9.field1664[var11] + super.field836;
                    this.field1661[this.field1672] = var9.field1661[var11] + super.field836;
                    this.field1656[this.field1672] = var9.field1656[var11] + super.field836;
                    ++this.field1672;
                }
                for (int var12 = 0; var12 < var9.field836; ++var12) {
                    super.field830[super.field836] = var9.field830[var12];
                    super.field848[super.field836] = var9.field848[var12];
                    super.field841[super.field836] = var9.field841[var12];
                    ++super.field836;
                }
            }
        }
    }
}
