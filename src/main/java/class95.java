import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class95 extends class140 {

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "B")
    private byte field1728 = 0;

    @OriginalMember(owner = "client!jh", name = "Sb", descriptor = "I")
    private int field1755 = 0;

    @OriginalMember(owner = "client!jh", name = "tb", descriptor = "[I")
    private int[] field1730;

    @OriginalMember(owner = "client!jh", name = "yb", descriptor = "[I")
    private int[] field1735;

    @OriginalMember(owner = "client!jh", name = "Ab", descriptor = "[I")
    private int[] field1737;

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "[B")
    private byte[] field1726;

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "[B")
    private byte[] field1727;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "[I")
    private int[] field1722;

    @OriginalMember(owner = "client!jh", name = "sb", descriptor = "[I")
    private int[] field1729;

    @OriginalMember(owner = "client!jh", name = "xb", descriptor = "[I")
    private int[] field1734;

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "[S")
    private short[] field1724;

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "[I")
    private int[] field1725;

    @OriginalMember(owner = "client!jh", name = "vb", descriptor = "[I")
    private int[] field1732;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "[I")
    private int[] field1721;

    @OriginalMember(owner = "client!jh", name = "ub", descriptor = "[B")
    private byte[] field1731;

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "Ljh;")
    private static class95 field1723 = new class95();

    @OriginalMember(owner = "client!jh", name = "wb", descriptor = "[B")
    private static byte[] field1733 = new byte[1];

    @OriginalMember(owner = "client!jh", name = "zb", descriptor = "Ljh;")
    private static class95 field1736 = new class95();

    @OriginalMember(owner = "client!jh", name = "Db", descriptor = "[B")
    private static byte[] field1740 = new byte[1];

    @OriginalMember(owner = "client!jh", name = "Jb", descriptor = "[I")
    private static int[] field1746 = new int[12];

    @OriginalMember(owner = "client!jh", name = "Bb", descriptor = "[Z")
    private static boolean[] field1738 = new boolean[4096];

    @OriginalMember(owner = "client!jh", name = "Lb", descriptor = "[Z")
    private static boolean[] field1748 = new boolean[4096];

    @OriginalMember(owner = "client!jh", name = "Nb", descriptor = "[[I")
    private static int[][] field1750 = new int[1600][512];

    @OriginalMember(owner = "client!jh", name = "Kb", descriptor = "[I")
    private static int[] field1747 = new int[2000];

    @OriginalMember(owner = "client!jh", name = "Eb", descriptor = "[I")
    private static int[] field1741 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Fb", descriptor = "[I")
    private static int[] field1742 = class23.field422;

    @OriginalMember(owner = "client!jh", name = "Ob", descriptor = "[I")
    private static int[] field1751 = new int[10];

    @OriginalMember(owner = "client!jh", name = "Rb", descriptor = "[I")
    private static int[] field1754 = new int[2000];

    @OriginalMember(owner = "client!jh", name = "Vb", descriptor = "[I")
    private static int[] field1758 = class23.field429;

    @OriginalMember(owner = "client!jh", name = "Mb", descriptor = "[I")
    private static int[] field1749 = class23.field434;

    @OriginalMember(owner = "client!jh", name = "Qb", descriptor = "[I")
    private static int[] field1753 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Yb", descriptor = "[I")
    private static int[] field1761 = new int[10];

    @OriginalMember(owner = "client!jh", name = "Ub", descriptor = "[I")
    private static int[] field1757 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Hb", descriptor = "[[I")
    private static int[][] field1744 = new int[12][2000];

    @OriginalMember(owner = "client!jh", name = "Pb", descriptor = "[I")
    private static int[] field1752 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Gb", descriptor = "[I")
    private static int[] field1743 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Tb", descriptor = "[I")
    private static int[] field1756 = class23.field421;

    @OriginalMember(owner = "client!jh", name = "ac", descriptor = "[I")
    private static int[] field1763 = new int[1600];

    @OriginalMember(owner = "client!jh", name = "bc", descriptor = "[I")
    private static int[] field1764 = new int[12];

    @OriginalMember(owner = "client!jh", name = "Xb", descriptor = "[I")
    private static int[] field1760 = new int[10];

    @OriginalMember(owner = "client!jh", name = "Ib", descriptor = "[I")
    private static int[] field1745 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "Cb", descriptor = "I")
    private static int field1739;

    @OriginalMember(owner = "client!jh", name = "Wb", descriptor = "I")
    private static int field1759;

    @OriginalMember(owner = "client!jh", name = "Zb", descriptor = "I")
    private static int field1762;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[IIII)V")
    private final void method544(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1759 = 0;
            field1739 = 0;
            field1762 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field2547.length) {
                    int[] var10 = super.field2547[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1759 += super.field2538[var12];
                        field1739 += super.field2544[var12];
                        field1762 += super.field2539[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1759 = field1759 / var7 + arg2;
                field1739 = field1739 / var7 + arg3;
                field1762 = field1762 / var7 + arg4;
            } else {
                field1759 = arg2;
                field1739 = arg3;
                field1762 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field2547.length) {
                    int[] var15 = super.field2547[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field2538[var17] += arg2;
                        super.field2544[var17] += arg3;
                        super.field2539[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field2547.length) {
                    int[] var20 = super.field2547[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field2538[var22] -= field1759;
                        super.field2544[var22] -= field1739;
                        super.field2539[var22] -= field1762;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field1742[var25];
                            int var27 = field1749[var25];
                            int var28 = super.field2544[var22] * var26 + super.field2538[var22] * var27 + 32767 >> 16;
                            super.field2544[var22] = super.field2544[var22] * var27 - super.field2538[var22] * var26 + 32767 >> 16;
                            super.field2538[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1742[var23];
                            int var30 = field1749[var23];
                            int var31 = super.field2544[var22] * var30 - super.field2539[var22] * var29 + 32767 >> 16;
                            super.field2539[var22] = super.field2544[var22] * var29 + super.field2539[var22] * var30 + 32767 >> 16;
                            super.field2544[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1742[var24];
                            int var33 = field1749[var24];
                            int var34 = super.field2539[var22] * var32 + super.field2538[var22] * var33 + 32767 >> 16;
                            super.field2539[var22] = super.field2539[var22] * var33 - super.field2538[var22] * var32 + 32767 >> 16;
                            super.field2538[var22] = var34;
                        }
                        super.field2538[var22] += field1759;
                        super.field2544[var22] += field1739;
                        super.field2539[var22] += field1762;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field2547.length) {
                    int[] var37 = super.field2547[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field2538[var39] -= field1759;
                        super.field2544[var39] -= field1739;
                        super.field2539[var39] -= field1762;
                        super.field2538[var39] = super.field2538[var39] * arg2 / 128;
                        super.field2544[var39] = super.field2544[var39] * arg3 / 128;
                        super.field2539[var39] = super.field2539[var39] * arg4 / 128;
                        super.field2538[var39] += field1759;
                        super.field2544[var39] += field1739;
                        super.field2539[var39] += field1762;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field2558 != null && this.field1727 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field2558.length) {
                        int[] var42 = super.field2558[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field1727[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field1727[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I")
    private static final int method545(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Loh;")
    public final class140 method546(boolean arg0) {
        if (!arg0 && field1733.length < super.field2555) {
            field1733 = new byte[super.field2555 + 100];
        }
        return this.method551(arg0, field1723, field1733);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfd;I)V")
    public final void method548(class54 arg0, int arg1) {
        if (super.field2547 != null) {
            if (arg1 != -1) {
                class152 var3 = arg0.field966[arg1];
                class103 var4 = var3.field2736;
                field1759 = 0;
                field1739 = 0;
                field1762 = 0;
                for (int var5 = 0; var5 < var3.field2724; ++var5) {
                    short var6 = var3.field2732[var5];
                    if (var3.field2730[var5] != -1) {
                        this.method544(0, var4.field1888[var3.field2730[var5]], 0, 0, 0);
                    }
                    this.method544(var4.field1877[var6], var4.field1888[var6], var3.field2727[var5], var3.field2728[var5], var3.field2729[var5]);
                }
                super.field2540 = false;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)Loh;")
    public final class140 method549(boolean arg0) {
        if (!arg0 && field1740.length < super.field2555) {
            field1740 = new byte[super.field2555 + 100];
        }
        return this.method551(arg0, field1736, field1740);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    private static final int method550(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLjh;[B)Ljh;")
    private final class95 method551(boolean arg0, class95 arg1, byte[] arg2) {
        arg1.field2557 = super.field2557;
        arg1.field2555 = super.field2555;
        arg1.field1755 = this.field1755;
        if (arg1.field2538 == null || arg1.field2538.length < super.field2557) {
            arg1.field2538 = new int[super.field2557 + 100];
            arg1.field2544 = new int[super.field2557 + 100];
            arg1.field2539 = new int[super.field2557 + 100];
        }
        for (int var4 = 0; var4 < super.field2557; ++var4) {
            arg1.field2538[var4] = super.field2538[var4];
            arg1.field2544[var4] = super.field2544[var4];
            arg1.field2539[var4] = super.field2539[var4];
        }
        if (arg0) {
            arg1.field1727 = this.field1727;
        } else {
            arg1.field1727 = arg2;
            if (this.field1727 == null) {
                for (int var5 = 0; var5 < super.field2555; ++var5) {
                    arg1.field1727[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field2555; ++var6) {
                    arg1.field1727[var6] = this.field1727[var6];
                }
            }
        }
        arg1.field1730 = this.field1730;
        arg1.field1735 = this.field1735;
        arg1.field1737 = this.field1737;
        arg1.field1722 = this.field1722;
        arg1.field1729 = this.field1729;
        arg1.field1734 = this.field1734;
        arg1.field1726 = this.field1726;
        arg1.field1731 = this.field1731;
        arg1.field1724 = this.field1724;
        arg1.field1728 = this.field1728;
        arg1.field1725 = this.field1725;
        arg1.field1732 = this.field1732;
        arg1.field1721 = this.field1721;
        arg1.field2547 = super.field2547;
        arg1.field2558 = super.field2558;
        arg1.field2537 = super.field2537;
        arg1.field2540 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIII)V")
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method870();
            int var8 = class23.field418;
            int var9 = class23.field432;
            int var10 = field1742[arg0];
            int var11 = field1749[arg0];
            int var12 = field1742[arg1];
            int var13 = field1749[arg1];
            int var14 = field1742[arg2];
            int var15 = field1749[arg2];
            int var16 = field1742[arg3];
            int var17 = field1749[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field2557; ++var19) {
                int var20 = super.field2538[var19];
                int var21 = super.field2544[var19];
                int var22 = super.field2539[var19];
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
                field1743[var19] = var30 - var18;
                field1757[var19] = (var26 << 9) / var30 + var8;
                field1745[var19] = (var29 << 9) / var30 + var9;
                if (this.field1755 > 0) {
                    field1753[var19] = var26;
                    field1741[var19] = var29;
                    field1752[var19] = var30;
                }
            }
            this.method554(false, false, 0L, super.field2546, super.field2546 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field2540) {
            this.method870();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field2552 * arg2 + super.field2548 * arg1 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field2552 * arg2 + super.field949 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field2552 + var15 << 9;
                if (var16 / var13 > class23.field423) {
                    int var17 = var15 - super.field2552 << 9;
                    if (var17 / var13 < class23.field416) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field2552 * arg1 + super.field2548 * arg2 >> 16) + var18 << 9;
                        if (var19 / var13 > class23.field433) {
                            int var20 = (-super.field2552 * arg1 + super.field949 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class23.field424) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field1755 > 0;
                                int var24 = class23.field418;
                                int var25 = class23.field432;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field1742[arg0];
                                    var27 = field1749[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class140.field2543 && var14 > 0) {
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
                                    int var33 = class140.field2536 - class23.field418;
                                    int var34 = class140.field2551 - class23.field432;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field2541, super.field2542, super.field2541, super.field2542, super.field2541, super.field2542, super.field2541, super.field2542 };
                                        int[] var40 = new int[] { super.field2556, super.field2556, super.field2549, super.field2549, super.field2556, super.field2556, super.field2549, super.field2549 };
                                        int[] var41 = new int[] { super.field949, super.field949, super.field949, super.field949, super.field2548, super.field2548, super.field2548, super.field2548 };
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
                                            if (super.field2537) {
                                                class140.field2553[class140.field2554++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field2557; ++var58) {
                                    int var59 = super.field2538[var58];
                                    int var60 = super.field2544[var58];
                                    int var61 = super.field2539[var58];
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
                                    field1743[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field1757[var58] = (var66 << 9) / var70 + var24;
                                        field1745[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field1757[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field1753[var58] = var66;
                                        field1741[var58] = var69;
                                        field1752[var58] = var70;
                                    }
                                }
                                try {
                                    this.method554(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "()V")
    public static void method553() {
        field1723 = null;
        field1733 = null;
        field1736 = null;
        field1740 = null;
        field1748 = null;
        field1738 = null;
        field1757 = null;
        field1745 = null;
        field1743 = null;
        field1753 = null;
        field1741 = null;
        field1752 = null;
        field1763 = null;
        field1750 = null;
        field1764 = null;
        field1744 = null;
        field1754 = null;
        field1747 = null;
        field1746 = null;
        field1751 = null;
        field1761 = null;
        field1760 = null;
        field1742 = null;
        field1749 = null;
        field1756 = null;
        field1758 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZJII)V")
    private final void method554(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field1763[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field2555; ++var8) {
                if (this.field1734[var8] != -2) {
                    int var33 = this.field1730[var8];
                    int var34 = this.field1735[var8];
                    int var35 = this.field1737[var8];
                    int var36 = field1757[var33];
                    int var37 = field1757[var34];
                    int var38 = field1757[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method547(class140.field2536, class140.field2551, field1745[var33], field1745[var34], field1745[var35], var36, var37, var38)) {
                            class140.field2553[class140.field2554++] = arg2;
                            arg1 = false;
                        }
                        if ((field1745[var35] - field1745[var34]) * (var36 - var37) - (field1745[var33] - field1745[var34]) * (var38 - var37) > 0) {
                            field1738[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class23.field417 && var37 <= class23.field417 && var38 <= class23.field417) {
                                field1748[var8] = false;
                            } else {
                                field1748[var8] = true;
                            }
                            int var58 = (field1743[var33] + field1743[var34] + field1743[var35]) / 3 + arg3;
                            field1750[var58][field1763[var58]++] = var8;
                        }
                    } else {
                        int var39 = field1753[var33];
                        int var40 = field1753[var34];
                        int var41 = field1753[var35];
                        int var42 = field1741[var33];
                        int var43 = field1741[var34];
                        int var44 = field1741[var35];
                        int var45 = field1752[var33];
                        int var46 = field1752[var34];
                        int var47 = field1752[var35];
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
                            field1738[var8] = true;
                            int var57 = (field1743[var33] + field1743[var34] + field1743[var35]) / 3 + arg3;
                            field1750[var57][field1763[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field1726 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field1763[var9];
                    if (var10 > 0) {
                        int[] var11 = field1750[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method559(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field1764[var13] = 0;
                    field1746[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field1763[var14];
                    if (var27 > 0) {
                        int[] var28 = field1750[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field1726[var30];
                            int var32 = field1764[var31]++;
                            field1744[var31][var32] = var30;
                            if (var31 < 10) {
                                field1746[var31] += var14;
                            } else if (var31 == 10) {
                                field1754[var32] = var14;
                            } else {
                                field1747[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field1764[1] > 0 || field1764[2] > 0) {
                    var15 = (field1746[1] + field1746[2]) / (field1764[1] + field1764[2]);
                }
                int var16 = 0;
                if (field1764[3] > 0 || field1764[4] > 0) {
                    var16 = (field1746[3] + field1746[4]) / (field1764[3] + field1764[4]);
                }
                int var17 = 0;
                if (field1764[6] > 0 || field1764[8] > 0) {
                    var17 = (field1746[6] + field1746[8]) / (field1764[6] + field1764[8]);
                }
                int var18 = 0;
                int var19 = field1764[10];
                int[] var20 = field1744[10];
                int[] var21 = field1754;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field1764[11];
                    var20 = field1744[11];
                    var21 = field1747;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method559(var20[var18++]);
                        if (var18 == var19 && field1744[11] != var20) {
                            var18 = 0;
                            var19 = field1764[11];
                            var20 = field1744[11];
                            var21 = field1747;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method559(var20[var18++]);
                        if (var18 == var19 && field1744[11] != var20) {
                            var18 = 0;
                            var19 = field1764[11];
                            var20 = field1744[11];
                            var21 = field1747;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method559(var20[var18++]);
                        if (var18 == var19 && field1744[11] != var20) {
                            var18 = 0;
                            var19 = field1764[11];
                            var20 = field1744[11];
                            var21 = field1747;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field1764[var23];
                    int[] var25 = field1744[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method559(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method559(var20[var18++]);
                    if (var18 == var19 && field1744[11] != var20) {
                        var18 = 0;
                        var20 = field1744[11];
                        var19 = field1764[11];
                        var21 = field1747;
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

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([[IIIIZI)Loh;")
    public final class140 method555(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method870();
        int var7 = super.field2541 + arg1;
        int var8 = super.field2542 + arg1;
        int var9 = super.field2556 + arg3;
        int var10 = super.field2549 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class95 var15;
                if (arg4) {
                    var15 = new class95();
                    var15.field2557 = super.field2557;
                    var15.field2555 = super.field2555;
                    var15.field1755 = this.field1755;
                    var15.field2538 = super.field2538;
                    var15.field2539 = super.field2539;
                    var15.field1730 = this.field1730;
                    var15.field1735 = this.field1735;
                    var15.field1737 = this.field1737;
                    var15.field1722 = this.field1722;
                    var15.field1729 = this.field1729;
                    var15.field1734 = this.field1734;
                    var15.field1726 = this.field1726;
                    var15.field1727 = this.field1727;
                    var15.field1731 = this.field1731;
                    var15.field1724 = this.field1724;
                    var15.field1728 = this.field1728;
                    var15.field1725 = this.field1725;
                    var15.field1732 = this.field1732;
                    var15.field1721 = this.field1721;
                    var15.field2547 = super.field2547;
                    var15.field2558 = super.field2558;
                    var15.field2537 = super.field2537;
                    var15.field2544 = new int[var15.field2557];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2557; ++var16) {
                        int var17 = super.field2538[var16] + arg1;
                        int var18 = super.field2539[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2544[var16] = super.field2544[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2557; ++var26) {
                        int var27 = (super.field2544[var26] << 16) / super.field949;
                        if (var27 < arg5) {
                            int var28 = super.field2538[var26] + arg1;
                            int var29 = super.field2539[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2544[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field2544[var26];
                        } else {
                            var15.field2544[var26] = super.field2544[var26];
                        }
                    }
                }
                super.field2540 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Loh;)Loh;")
    public final class140 method556(class140 arg0) {
        return new class95(new class95[] { this, (class95) arg0 }, 2);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method870();
            int var9 = class23.field418;
            int var10 = class23.field432;
            int var11 = field1742[arg0];
            int var12 = field1749[arg0];
            int var13 = field1742[arg1];
            int var14 = field1749[arg1];
            int var15 = field1742[arg2];
            int var16 = field1749[arg2];
            int var17 = field1742[arg3];
            int var18 = field1749[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field2557; ++var20) {
                int var21 = super.field2538[var20];
                int var22 = super.field2544[var20];
                int var23 = super.field2539[var20];
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
                field1743[var20] = var31 - var19;
                field1757[var20] = (var27 << 9) / arg7 + var9;
                field1745[var20] = (var30 << 9) / arg7 + var10;
                if (this.field1755 > 0) {
                    field1753[var20] = var27;
                    field1741[var20] = var30;
                    field1752[var20] = var31;
                }
            }
            this.method554(false, false, 0L, super.field2546, super.field2546 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    private final void method558(int arg0) {
        int var2 = class23.field418;
        int var3 = class23.field432;
        int var4 = 0;
        int var5 = this.field1730[arg0];
        int var6 = this.field1735[arg0];
        int var7 = this.field1737[arg0];
        int var8 = field1752[var5];
        int var9 = field1752[var6];
        int var10 = field1752[var7];
        if (this.field1727 == null) {
            class23.field428 = 0;
        } else {
            class23.field428 = this.field1727[arg0] & 255;
        }
        if (var8 >= 50) {
            field1751[var4] = field1757[var5];
            field1761[var4] = field1745[var5];
            field1760[var4++] = this.field1722[arg0];
        } else {
            int var11 = field1753[var5];
            int var12 = field1741[var5];
            int var13 = this.field1722[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1758[var10 - var8];
                field1751[var4] = (((field1753[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1734[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1758[var9 - var8];
                field1751[var4] = (((field1753[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1729[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1751[var4] = field1757[var6];
            field1761[var4] = field1745[var6];
            field1760[var4++] = this.field1729[arg0];
        } else {
            int var16 = field1753[var6];
            int var17 = field1741[var6];
            int var18 = this.field1729[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1758[var8 - var9];
                field1751[var4] = (((field1753[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1722[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1758[var10 - var9];
                field1751[var4] = (((field1753[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1734[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1751[var4] = field1757[var7];
            field1761[var4] = field1745[var7];
            field1760[var4++] = this.field1734[arg0];
        } else {
            int var21 = field1753[var7];
            int var22 = field1741[var7];
            int var23 = this.field1734[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1758[var9 - var10];
                field1751[var4] = (((field1753[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1729[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1758[var8 - var10];
                field1751[var4] = (((field1753[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1761[var4] = (((field1741[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1760[var4++] = ((this.field1722[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1751[0];
        int var27 = field1751[1];
        int var28 = field1751[2];
        int var29 = field1761[0];
        int var30 = field1761[1];
        int var31 = field1761[2];
        class23.field431 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class23.field417 || var27 > class23.field417 || var28 > class23.field417) {
                class23.field431 = true;
            }
            if (this.field1724 != null && this.field1724[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1731 != null && this.field1731[arg0] != -1) {
                    int var32 = this.field1731[arg0] & 255;
                    var33 = this.field1725[var32];
                    var34 = this.field1732[var32];
                    var35 = this.field1721[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field1734[arg0] == -1) {
                    class23.method149(var29, var30, var31, var26, var27, var28, this.field1722[arg0], this.field1722[arg0], this.field1722[arg0], field1753[var33], field1753[var34], field1753[var35], field1741[var33], field1741[var34], field1741[var35], field1752[var33], field1752[var34], field1752[var35], this.field1724[arg0]);
                } else {
                    class23.method149(var29, var30, var31, var26, var27, var28, field1760[0], field1760[1], field1760[2], field1753[var33], field1753[var34], field1753[var35], field1741[var33], field1741[var34], field1741[var35], field1752[var33], field1752[var34], field1752[var35], this.field1724[arg0]);
                }
            } else if (this.field1734[arg0] == -1) {
                class23.method146(var29, var30, var31, var26, var27, var28, field1756[this.field1722[arg0]]);
            } else {
                class23.method156(var29, var30, var31, var26, var27, var28, field1760[0], field1760[1], field1760[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class23.field417 || var27 > class23.field417 || var28 > class23.field417 || field1751[3] < 0 || field1751[3] > class23.field417) {
                class23.field431 = true;
            }
            if (this.field1724 == null || this.field1724[arg0] == -1) {
                if (this.field1734[arg0] == -1) {
                    int var41 = field1756[this.field1722[arg0]];
                    class23.method146(var29, var30, var31, var26, var27, var28, var41);
                    class23.method146(var29, var31, field1761[3], var26, var28, field1751[3], var41);
                    return;
                }
                class23.method156(var29, var30, var31, var26, var27, var28, field1760[0], field1760[1], field1760[2]);
                class23.method156(var29, var31, field1761[3], var26, var28, field1751[3], field1760[0], field1760[2], field1760[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field1731 != null && this.field1731[arg0] != -1) {
                int var36 = this.field1731[arg0] & 255;
                var37 = this.field1725[var36];
                var38 = this.field1732[var36];
                var39 = this.field1721[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field1724[arg0];
            if (this.field1734[arg0] == -1) {
                class23.method149(var29, var30, var31, var26, var27, var28, this.field1722[arg0], this.field1722[arg0], this.field1722[arg0], field1753[var37], field1753[var38], field1753[var39], field1741[var37], field1741[var38], field1741[var39], field1752[var37], field1752[var38], field1752[var39], var40);
                class23.method149(var29, var31, field1761[3], var26, var28, field1751[3], this.field1722[arg0], this.field1722[arg0], this.field1722[arg0], field1753[var37], field1753[var38], field1753[var39], field1741[var37], field1741[var38], field1741[var39], field1752[var37], field1752[var38], field1752[var39], var40);
                return;
            }
            class23.method149(var29, var30, var31, var26, var27, var28, field1760[0], field1760[1], field1760[2], field1753[var37], field1753[var38], field1753[var39], field1741[var37], field1741[var38], field1741[var39], field1752[var37], field1752[var38], field1752[var39], var40);
            class23.method149(var29, var31, field1761[3], var26, var28, field1751[3], field1760[0], field1760[2], field1760[3], field1753[var37], field1753[var38], field1753[var39], field1741[var37], field1741[var38], field1741[var39], field1752[var37], field1752[var38], field1752[var39], var40);
        }
    }

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V")
    private final void method559(int arg0) {
        if (field1738[arg0]) {
            this.method558(arg0);
        } else {
            int var2 = this.field1730[arg0];
            int var3 = this.field1735[arg0];
            int var4 = this.field1737[arg0];
            class23.field431 = field1748[arg0];
            if (this.field1727 == null) {
                class23.field428 = 0;
            } else {
                class23.field428 = this.field1727[arg0] & 255;
            }
            if (this.field1724 != null && this.field1724[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field1731 != null && this.field1731[arg0] != -1) {
                    int var5 = this.field1731[arg0] & 255;
                    var6 = this.field1725[var5];
                    var7 = this.field1732[var5];
                    var8 = this.field1721[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field1734[arg0] == -1) {
                    class23.method149(field1745[var2], field1745[var3], field1745[var4], field1757[var2], field1757[var3], field1757[var4], this.field1722[arg0], this.field1722[arg0], this.field1722[arg0], field1753[var6], field1753[var7], field1753[var8], field1741[var6], field1741[var7], field1741[var8], field1752[var6], field1752[var7], field1752[var8], this.field1724[arg0]);
                } else {
                    class23.method149(field1745[var2], field1745[var3], field1745[var4], field1757[var2], field1757[var3], field1757[var4], this.field1722[arg0], this.field1729[arg0], this.field1734[arg0], field1753[var6], field1753[var7], field1753[var8], field1741[var6], field1741[var7], field1741[var8], field1752[var6], field1752[var7], field1752[var8], this.field1724[arg0]);
                }
            } else if (this.field1734[arg0] == -1) {
                class23.method146(field1745[var2], field1745[var3], field1745[var4], field1757[var2], field1757[var3], field1757[var4], field1756[this.field1722[arg0]]);
            } else {
                class23.method156(field1745[var2], field1745[var3], field1745[var4], field1757[var2], field1757[var3], field1757[var4], this.field1722[arg0], this.field1729[arg0], this.field1734[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfd;ILfd;I[I)V")
    public final void method560(class54 arg0, int arg1, class54 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class152 var6 = arg0.field966[arg1];
                class152 var7 = arg2.field966[arg3];
                class103 var8 = var6.field2736;
                field1759 = 0;
                field1739 = 0;
                field1762 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2724; ++var11) {
                    short var16 = var6.field2732[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field1877[var16] == 0) {
                        if (var6.field2730[var11] != -1) {
                            this.method544(0, var8.field1888[var6.field2730[var11]], 0, 0, 0);
                        }
                        this.method544(var8.field1877[var16], var8.field1888[var16], var6.field2727[var11], var6.field2728[var11], var6.field2729[var11]);
                    }
                }
                field1759 = 0;
                field1739 = 0;
                field1762 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2724; ++var14) {
                    short var15 = var7.field2732[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field1877[var15] == 0) {
                        if (var7.field2730[var14] != -1) {
                            this.method544(0, var8.field1888[var7.field2730[var14]], 0, 0, 0);
                        }
                        this.method544(var8.field1877[var15], var8.field1888[var15], var7.field2727[var14], var7.field2728[var14], var7.field2729[var14]);
                    }
                }
                super.field2540 = false;
            } else {
                this.method548(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class95() {
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ltd;IIIII)V")
    public class95(class181 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method1106();
        arg0.method1103();
        super.field2557 = arg0.field3473;
        super.field2538 = arg0.field3454;
        super.field2544 = arg0.field3450;
        super.field2539 = arg0.field3464;
        super.field2555 = arg0.field3441;
        this.field1730 = arg0.field3474;
        this.field1735 = arg0.field3469;
        this.field1737 = arg0.field3484;
        this.field1726 = arg0.field3444;
        this.field1727 = arg0.field3462;
        this.field1728 = arg0.field3446;
        super.field2547 = arg0.field3466;
        super.field2558 = arg0.field3443;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field1722 = new int[super.field2555];
        this.field1729 = new int[super.field2555];
        this.field1734 = new int[super.field2555];
        if (arg0.field3475 != null) {
            this.field1724 = new short[super.field2555];
            for (int var9 = 0; var9 < super.field2555; ++var9) {
                short var10 = arg0.field3475[var9];
                if (var10 != -1 && class23.field427.method367(27094, var10)) {
                    this.field1724[var9] = var10;
                } else {
                    this.field1724[var9] = -1;
                }
            }
        } else {
            this.field1724 = null;
        }
        if (arg0.field3452 > 0 && arg0.field3455 != null) {
            int[] var11 = new int[arg0.field3452];
            for (int var12 = 0; var12 < super.field2555; ++var12) {
                if (arg0.field3455[var12] != -1) {
                    ++var11[arg0.field3455[var12] & 255];
                }
            }
            this.field1755 = 0;
            for (int var13 = 0; var13 < arg0.field3452; ++var13) {
                if (var11[var13] > 0 && arg0.field3465[var13] == 0) {
                    ++this.field1755;
                }
            }
            this.field1725 = new int[this.field1755];
            this.field1732 = new int[this.field1755];
            this.field1721 = new int[this.field1755];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field3452; ++var15) {
                if (var11[var15] > 0 && arg0.field3465[var15] == 0) {
                    this.field1725[var14] = arg0.field3451[var15] & 65535;
                    this.field1732[var14] = arg0.field3476[var15] & 65535;
                    this.field1721[var14] = arg0.field3439[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field1731 = new byte[super.field2555];
            for (int var16 = 0; var16 < super.field2555; ++var16) {
                if (arg0.field3455[var16] != -1) {
                    this.field1731[var16] = (byte) var11[arg0.field3455[var16] & 255];
                    if (this.field1731[var16] == -1 && this.field1724 != null) {
                        this.field1724[var16] = -1;
                    }
                } else {
                    this.field1731[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field2555; ++var17) {
            byte var18;
            if (arg0.field3478 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field3478[var17];
            }
            byte var19;
            if (arg0.field3462 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field3462[var17];
            }
            short var20;
            if (this.field1724 == null) {
                var20 = -1;
            } else {
                var20 = this.field1724[var17];
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
                        class125 var28 = arg0.field3470[var17];
                        int var29 = (var28.field2254 * arg5 + var28.field2251 * arg4 + var28.field2244 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field1722[var17] = method550(arg0.field3471[var17] & 65535, var29);
                        this.field1734[var17] = -1;
                    } else if (var18 == 3) {
                        this.field1722[var17] = 128;
                        this.field1734[var17] = -1;
                    } else {
                        this.field1734[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field3471[var17] & 65535;
                    class126 var22;
                    if (arg0.field3440 != null && arg0.field3440[this.field1730[var17]] != null) {
                        var22 = arg0.field3440[this.field1730[var17]];
                    } else {
                        var22 = arg0.field3479[this.field1730[var17]];
                    }
                    int var23 = (var22.field2266 * arg5 + var22.field2274 * arg4 + var22.field2263 * arg3) / (var22.field2275 * var8) + arg1;
                    this.field1722[var17] = method550(var21, var23);
                    class126 var24;
                    if (arg0.field3440 != null && arg0.field3440[this.field1735[var17]] != null) {
                        var24 = arg0.field3440[this.field1735[var17]];
                    } else {
                        var24 = arg0.field3479[this.field1735[var17]];
                    }
                    int var25 = (var24.field2266 * arg5 + var24.field2274 * arg4 + var24.field2263 * arg3) / (var24.field2275 * var8) + arg1;
                    this.field1729[var17] = method550(var21, var25);
                    class126 var26;
                    if (arg0.field3440 != null && arg0.field3440[this.field1737[var17]] != null) {
                        var26 = arg0.field3440[this.field1737[var17]];
                    } else {
                        var26 = arg0.field3479[this.field1737[var17]];
                    }
                    int var27 = (var26.field2266 * arg5 + var26.field2274 * arg4 + var26.field2263 * arg3) / (var26.field2275 * var8) + arg1;
                    this.field1734[var17] = method550(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class125 var36 = arg0.field3470[var17];
                    int var37 = (var36.field2254 * arg5 + var36.field2251 * arg4 + var36.field2244 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field1722[var17] = method545(var37);
                    this.field1734[var17] = -1;
                } else {
                    this.field1734[var17] = -2;
                }
            } else {
                class126 var30;
                if (arg0.field3440 != null && arg0.field3440[this.field1730[var17]] != null) {
                    var30 = arg0.field3440[this.field1730[var17]];
                } else {
                    var30 = arg0.field3479[this.field1730[var17]];
                }
                int var31 = (var30.field2266 * arg5 + var30.field2274 * arg4 + var30.field2263 * arg3) / (var30.field2275 * var8) + arg1;
                this.field1722[var17] = method545(var31);
                class126 var32;
                if (arg0.field3440 != null && arg0.field3440[this.field1735[var17]] != null) {
                    var32 = arg0.field3440[this.field1735[var17]];
                } else {
                    var32 = arg0.field3479[this.field1735[var17]];
                }
                int var33 = (var32.field2266 * arg5 + var32.field2274 * arg4 + var32.field2263 * arg3) / (var32.field2275 * var8) + arg1;
                this.field1729[var17] = method545(var33);
                class126 var34;
                if (arg0.field3440 != null && arg0.field3440[this.field1737[var17]] != null) {
                    var34 = arg0.field3440[this.field1737[var17]];
                } else {
                    var34 = arg0.field3479[this.field1737[var17]];
                }
                int var35 = (var34.field2266 * arg5 + var34.field2274 * arg4 + var34.field2263 * arg3) / (var34.field2275 * var8) + arg1;
                this.field1734[var17] = method545(var35);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([Ljh;I)V")
    private class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field2557 = 0;
        super.field2555 = 0;
        this.field1755 = 0;
        this.field1728 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class95 var13 = arg0[var7];
            if (var13 != null) {
                super.field2557 += var13.field2557;
                super.field2555 += var13.field2555;
                this.field1755 += var13.field1755;
                if (var13.field1726 != null) {
                    var3 = true;
                } else {
                    if (this.field1728 == -1) {
                        this.field1728 = var13.field1728;
                    }
                    if (this.field1728 != var13.field1728) {
                        var3 = true;
                    }
                }
                var4 |= var13.field1727 != null;
                var5 |= var13.field1724 != null;
                var6 |= var13.field1731 != null;
            }
        }
        super.field2538 = new int[super.field2557];
        super.field2544 = new int[super.field2557];
        super.field2539 = new int[super.field2557];
        this.field1730 = new int[super.field2555];
        this.field1735 = new int[super.field2555];
        this.field1737 = new int[super.field2555];
        this.field1722 = new int[super.field2555];
        this.field1729 = new int[super.field2555];
        this.field1734 = new int[super.field2555];
        if (var3) {
            this.field1726 = new byte[super.field2555];
        }
        if (var4) {
            this.field1727 = new byte[super.field2555];
        }
        if (var5) {
            this.field1724 = new short[super.field2555];
        }
        if (var6) {
            this.field1731 = new byte[super.field2555];
        }
        if (this.field1755 > 0) {
            this.field1725 = new int[this.field1755];
            this.field1732 = new int[this.field1755];
            this.field1721 = new int[this.field1755];
        }
        super.field2557 = 0;
        super.field2555 = 0;
        this.field1755 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class95 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field2555; ++var10) {
                    this.field1730[super.field2555] = var9.field1730[var10] + super.field2557;
                    this.field1735[super.field2555] = var9.field1735[var10] + super.field2557;
                    this.field1737[super.field2555] = var9.field1737[var10] + super.field2557;
                    this.field1722[super.field2555] = var9.field1722[var10];
                    this.field1729[super.field2555] = var9.field1729[var10];
                    this.field1734[super.field2555] = var9.field1734[var10];
                    if (var3) {
                        if (var9.field1726 != null) {
                            this.field1726[super.field2555] = var9.field1726[var10];
                        } else {
                            this.field1726[super.field2555] = var9.field1728;
                        }
                    }
                    if (var4 && var9.field1727 != null) {
                        this.field1727[super.field2555] = var9.field1727[var10];
                    }
                    if (var5) {
                        if (var9.field1724 != null) {
                            this.field1724[super.field2555] = var9.field1724[var10];
                        } else {
                            this.field1724[super.field2555] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field1731 != null && var9.field1731[var10] != -1) {
                            this.field1731[super.field2555] = (byte) (var9.field1731[var10] + this.field1755);
                        } else {
                            this.field1731[super.field2555] = -1;
                        }
                    }
                    ++super.field2555;
                }
                for (int var11 = 0; var11 < var9.field1755; ++var11) {
                    this.field1725[this.field1755] = var9.field1725[var11] + super.field2557;
                    this.field1732[this.field1755] = var9.field1732[var11] + super.field2557;
                    this.field1721[this.field1755] = var9.field1721[var11] + super.field2557;
                    ++this.field1755;
                }
                for (int var12 = 0; var12 < var9.field2557; ++var12) {
                    super.field2538[super.field2557] = var9.field2538[var12];
                    super.field2544[super.field2557] = var9.field2544[var12];
                    super.field2539[super.field2557] = var9.field2539[var12];
                    ++super.field2557;
                }
            }
        }
    }
}
