import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class18 {

    @OriginalMember(owner = "client!je", name = "ub", descriptor = "B")
    private byte field1734 = 0;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "Z")
    private boolean field1728 = false;

    @OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
    private int field1752 = 0;

    @OriginalMember(owner = "client!je", name = "Rb", descriptor = "I")
    private int field1757 = 0;

    @OriginalMember(owner = "client!je", name = "Yb", descriptor = "I")
    private int field1764 = 0;

    @OriginalMember(owner = "client!je", name = "Sb", descriptor = "[I")
    private int[] field1758;

    @OriginalMember(owner = "client!je", name = "Nb", descriptor = "[I")
    private int[] field1753;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "[I")
    private int[] field1729;

    @OriginalMember(owner = "client!je", name = "xb", descriptor = "[I")
    private int[] field1737;

    @OriginalMember(owner = "client!je", name = "yb", descriptor = "[I")
    private int[] field1738;

    @OriginalMember(owner = "client!je", name = "Ib", descriptor = "[I")
    private int[] field1748;

    @OriginalMember(owner = "client!je", name = "Qb", descriptor = "[I")
    private int[] field1756;

    @OriginalMember(owner = "client!je", name = "Vb", descriptor = "[I")
    private int[] field1761;

    @OriginalMember(owner = "client!je", name = "rb", descriptor = "[I")
    private int[] field1731;

    @OriginalMember(owner = "client!je", name = "Fb", descriptor = "[I")
    private int[] field1745;

    @OriginalMember(owner = "client!je", name = "Pb", descriptor = "[B")
    private byte[] field1755;

    @OriginalMember(owner = "client!je", name = "Lb", descriptor = "[B")
    private byte[] field1751;

    @OriginalMember(owner = "client!je", name = "Kb", descriptor = "[B")
    private byte[] field1750;

    @OriginalMember(owner = "client!je", name = "Ub", descriptor = "[B")
    private byte[] field1760;

    @OriginalMember(owner = "client!je", name = "Cb", descriptor = "[I")
    private int[] field1742;

    @OriginalMember(owner = "client!je", name = "Wb", descriptor = "[S")
    private short[] field1762;

    @OriginalMember(owner = "client!je", name = "tb", descriptor = "[[I")
    private int[][] field1733;

    @OriginalMember(owner = "client!je", name = "Hb", descriptor = "[[I")
    private int[][] field1747;

    @OriginalMember(owner = "client!je", name = "qb", descriptor = "[Lfa;")
    private class37[] field1730;

    @OriginalMember(owner = "client!je", name = "Tb", descriptor = "[Lpc;")
    private class107[] field1759;

    @OriginalMember(owner = "client!je", name = "wb", descriptor = "[Lfa;")
    private class37[] field1736;

    @OriginalMember(owner = "client!je", name = "Bb", descriptor = "S")
    public short field1741;

    @OriginalMember(owner = "client!je", name = "Gb", descriptor = "S")
    public short field1746;

    @OriginalMember(owner = "client!je", name = "Db", descriptor = "[I")
    private static int[] field1743 = new int[10000];

    @OriginalMember(owner = "client!je", name = "Ob", descriptor = "I")
    private static int field1754 = 0;

    @OriginalMember(owner = "client!je", name = "zb", descriptor = "[I")
    private static int[] field1739 = new int[10000];

    @OriginalMember(owner = "client!je", name = "sb", descriptor = "[I")
    private static int[] field1732 = new int[128];

    @OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!je", name = "Eb", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!je", name = "Jb", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!je", name = "Xb", descriptor = "I")
    private int field1763;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    private final void method551() {
        int var10002;
        if (this.field1745 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1757; ++var3) {
                int var7 = this.field1745[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1733 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1733[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1757) {
                int var6 = this.field1745[var5];
                this.field1733[var6][var1[var6]++] = var5++;
            }
            this.field1745 = null;
        }
        if (this.field1742 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1764; ++var10) {
                int var14 = this.field1742[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1747 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1747[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1764) {
                int var13 = this.field1742[var12];
                this.field1747[var13][var8[var13]++] = var12++;
            }
            this.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
    public final void method552() {
        if (this.field1730 == null) {
            this.field1730 = new class37[this.field1757];
            for (int var1 = 0; var1 < this.field1757; ++var1) {
                this.field1730[var1] = new class37();
            }
            for (int var2 = 0; var2 < this.field1764; ++var2) {
                int var3 = this.field1737[var2];
                int var4 = this.field1738[var2];
                int var5 = this.field1748[var2];
                int var6 = this.field1758[var4] - this.field1758[var3];
                int var7 = this.field1753[var4] - this.field1753[var3];
                int var8 = this.field1729[var4] - this.field1729[var3];
                int var9 = this.field1758[var5] - this.field1758[var3];
                int var10 = this.field1753[var5] - this.field1753[var3];
                int var11 = this.field1729[var5] - this.field1729[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field1755 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1755[var2];
                }
                if (var19 == 0) {
                    class37 var20 = this.field1730[var3];
                    var20.field1021 += var16;
                    var20.field1009 += var17;
                    var20.field1015 += var18;
                    ++var20.field1010;
                    class37 var21 = this.field1730[var4];
                    var21.field1021 += var16;
                    var21.field1009 += var17;
                    var21.field1015 += var18;
                    ++var21.field1010;
                    class37 var22 = this.field1730[var5];
                    var22.field1021 += var16;
                    var22.field1009 += var17;
                    var22.field1015 += var18;
                    ++var22.field1010;
                } else if (var19 == 1) {
                    if (this.field1759 == null) {
                        this.field1759 = new class107[this.field1764];
                    }
                    class107 var23 = this.field1759[var2] = new class107();
                    var23.field2639 = var16;
                    var23.field2640 = var17;
                    var23.field2632 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
    private final void method553() {
        if (!this.field1728) {
            super.field514 = 0;
            this.field1749 = 0;
            this.field1735 = 999999;
            this.field1740 = -999999;
            this.field1744 = -99999;
            this.field1763 = 99999;
            for (int var1 = 0; var1 < this.field1757; ++var1) {
                int var2 = this.field1758[var1];
                int var3 = this.field1753[var1];
                int var4 = this.field1729[var1];
                if (var2 < this.field1735) {
                    this.field1735 = var2;
                }
                if (var2 > this.field1740) {
                    this.field1740 = var2;
                }
                if (var4 < this.field1763) {
                    this.field1763 = var4;
                }
                if (var4 > this.field1744) {
                    this.field1744 = var4;
                }
                if (-var3 > super.field514) {
                    super.field514 = -var3;
                }
                if (var3 > this.field1749) {
                    this.field1749 = var3;
                }
            }
            this.field1728 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
    public static void method554() {
        field1739 = null;
        field1743 = null;
        field1732 = null;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
    public final void method555() {
        for (int var1 = 0; var1 < this.field1757; ++var1) {
            this.field1758[var1] = -this.field1758[var1];
            this.field1729[var1] = -this.field1729[var1];
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()V")
    public final void method556() {
        for (int var1 = 0; var1 < this.field1757; ++var1) {
            int var2 = this.field1729[var1];
            this.field1729[var1] = this.field1758[var1];
            this.field1758[var1] = -var2;
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method557(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; ++var4) {
            this.field1758[var4] += arg0;
            this.field1753[var4] += arg1;
            this.field1729[var4] += arg2;
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()V")
    public final void method558() {
        for (int var1 = 0; var1 < this.field1757; ++var1) {
            this.field1729[var1] = -this.field1729[var1];
        }
        for (int var2 = 0; var2 < this.field1764; ++var2) {
            int var3 = this.field1737[var2];
            this.field1737[var2] = this.field1748[var2];
            this.field1748[var2] = var3;
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "()V")
    private final void method559() {
        this.field1730 = null;
        this.field1736 = null;
        this.field1759 = null;
        this.field1728 = false;
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "()V")
    public final void method560() {
        for (int var1 = 0; var1 < this.field1757; ++var1) {
            int var2 = this.field1758[var1];
            this.field1758[var1] = this.field1729[var1];
            this.field1729[var1] = -var2;
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "j", descriptor = "()Lje;")
    public final class67 method561() {
        class67 var1 = new class67();
        if (this.field1755 != null) {
            var1.field1755 = new byte[this.field1764];
            for (int var2 = 0; var2 < this.field1764; ++var2) {
                var1.field1755[var2] = this.field1755[var2];
            }
        }
        var1.field1757 = this.field1757;
        var1.field1764 = this.field1764;
        var1.field1752 = this.field1752;
        var1.field1758 = this.field1758;
        var1.field1753 = this.field1753;
        var1.field1729 = this.field1729;
        var1.field1737 = this.field1737;
        var1.field1738 = this.field1738;
        var1.field1748 = this.field1748;
        var1.field1750 = this.field1750;
        var1.field1760 = this.field1760;
        var1.field1751 = this.field1751;
        var1.field1762 = this.field1762;
        var1.field1734 = this.field1734;
        var1.field1756 = this.field1756;
        var1.field1761 = this.field1761;
        var1.field1731 = this.field1731;
        var1.field1745 = this.field1745;
        var1.field1742 = this.field1742;
        var1.field1733 = this.field1733;
        var1.field1747 = this.field1747;
        var1.field1730 = this.field1730;
        var1.field1759 = this.field1759;
        var1.field1741 = this.field1741;
        var1.field1746 = this.field1746;
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lq;II)Lje;")
    public static final class67 method562(class111 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method898((byte) -115, arg2, arg1);
        return var3 == null ? null : new class67(var3);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lje;Lje;IIIZ)V")
    public static final void method563(class67 arg0, class67 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method553();
        arg0.method552();
        arg1.method553();
        arg1.method552();
        ++field1754;
        int var6 = 0;
        int[] var7 = arg1.field1758;
        int var8 = arg1.field1757;
        for (int var9 = 0; var9 < arg0.field1757; ++var9) {
            class37 var12 = arg0.field1730[var9];
            if (var12.field1010 != 0) {
                int var13 = arg0.field1753[var9] - arg3;
                if (var13 <= arg1.field1749) {
                    int var14 = arg0.field1758[var9] - arg2;
                    if (var14 >= arg1.field1735 && var14 <= arg1.field1740) {
                        int var15 = arg0.field1729[var9] - arg4;
                        if (var15 >= arg1.field1763 && var15 <= arg1.field1744) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class37 var17 = arg1.field1730[var16];
                                if (var7[var16] == var14 && arg1.field1729[var16] == var15 && arg1.field1753[var16] == var13 && var17.field1010 != 0) {
                                    if (arg0.field1736 == null) {
                                        arg0.field1736 = new class37[arg0.field1757];
                                    }
                                    if (arg1.field1736 == null) {
                                        arg1.field1736 = new class37[var8];
                                    }
                                    class37 var18 = arg0.field1736[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1736[var9] = new class37(var12);
                                    }
                                    class37 var19 = arg1.field1736[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1736[var16] = new class37(var17);
                                    }
                                    var18.field1021 += var17.field1021;
                                    var18.field1009 += var17.field1009;
                                    var18.field1015 += var17.field1015;
                                    var18.field1010 += var17.field1010;
                                    var19.field1021 += var12.field1021;
                                    var19.field1009 += var12.field1009;
                                    var19.field1015 += var12.field1015;
                                    var19.field1010 += var12.field1010;
                                    ++var6;
                                    field1739[var9] = field1754;
                                    field1743[var16] = field1754;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1764; ++var10) {
                if (field1739[arg0.field1737[var10]] == field1754 && field1739[arg0.field1738[var10]] == field1754 && field1739[arg0.field1748[var10]] == field1754) {
                    if (arg0.field1755 == null) {
                        arg0.field1755 = new byte[arg0.field1764];
                    }
                    arg0.field1755[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1764; ++var11) {
                if (field1743[arg1.field1737[var11]] == field1754 && field1743[arg1.field1738[var11]] == field1754 && field1743[arg1.field1748[var11]] == field1754) {
                    if (arg1.field1755 == null) {
                        arg1.field1755 = new byte[arg1.field1764];
                    }
                    arg1.field1755[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIZ)Lje;")
    public final class67 method564(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class67 var6;
            if (arg4) {
                var6 = new class67();
                var6.field1757 = this.field1757;
                var6.field1764 = this.field1764;
                var6.field1752 = this.field1752;
                var6.field1758 = this.field1758;
                var6.field1729 = this.field1729;
                var6.field1737 = this.field1737;
                var6.field1738 = this.field1738;
                var6.field1748 = this.field1748;
                var6.field1755 = this.field1755;
                var6.field1750 = this.field1750;
                var6.field1760 = this.field1760;
                var6.field1751 = this.field1751;
                var6.field1762 = this.field1762;
                var6.field1734 = this.field1734;
                var6.field1756 = this.field1756;
                var6.field1761 = this.field1761;
                var6.field1731 = this.field1731;
                var6.field1745 = this.field1745;
                var6.field1742 = this.field1742;
                var6.field1733 = this.field1733;
                var6.field1747 = this.field1747;
                var6.field1741 = this.field1741;
                var6.field1746 = this.field1746;
                var6.field1753 = new int[var6.field1757];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field1757; ++var8) {
                int var9 = this.field1758[var8];
                int var10 = this.field1753[var8];
                int var11 = this.field1729[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field1753[var8] = var10 + var14 - var7;
            }
            var6.method559();
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public final void method565(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; ++var4) {
            this.field1758[var4] = this.field1758[var4] * arg0 / 128;
            this.field1753[var4] = this.field1753[var4] * arg1 / 128;
            this.field1729[var4] = this.field1729[var4] * arg2 / 128;
        }
        this.method559();
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIII)Lna;")
    public final class91 method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method552();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class91 var8 = new class91();
        var8.field2323 = new int[this.field1764];
        var8.field2310 = new int[this.field1764];
        var8.field2309 = new int[this.field1764];
        for (int var9 = 0; var9 < this.field1764; ++var9) {
            byte var10;
            if (this.field1755 == null) {
                var10 = 0;
            } else {
                var10 = this.field1755[var9];
            }
            if (this.field1751 != null && this.field1751[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class107 var17 = this.field1759[var9];
                        int var18 = (var17.field2632 * arg4 + var17.field2640 * arg3 + var17.field2639 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field2323[var9] = method570(var18);
                        var8.field2309[var9] = -1;
                    } else {
                        var8.field2309[var9] = -2;
                    }
                } else {
                    class37 var11;
                    if (this.field1736 != null && this.field1736[this.field1737[var9]] != null) {
                        var11 = this.field1736[this.field1737[var9]];
                    } else {
                        var11 = this.field1730[this.field1737[var9]];
                    }
                    int var12 = (var11.field1015 * arg4 + var11.field1021 * arg2 + var11.field1009 * arg3) / (var11.field1010 * var7) + arg0;
                    var8.field2323[var9] = method570(var12);
                    class37 var13;
                    if (this.field1736 != null && this.field1736[this.field1738[var9]] != null) {
                        var13 = this.field1736[this.field1738[var9]];
                    } else {
                        var13 = this.field1730[this.field1738[var9]];
                    }
                    int var14 = (var13.field1015 * arg4 + var13.field1021 * arg2 + var13.field1009 * arg3) / (var13.field1010 * var7) + arg0;
                    var8.field2310[var9] = method570(var14);
                    class37 var15;
                    if (this.field1736 != null && this.field1736[this.field1748[var9]] != null) {
                        var15 = this.field1736[this.field1748[var9]];
                    } else {
                        var15 = this.field1730[this.field1748[var9]];
                    }
                    int var16 = (var15.field1015 * arg4 + var15.field1021 * arg2 + var15.field1009 * arg3) / (var15.field1010 * var7) + arg0;
                    var8.field2309[var9] = method570(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class107 var26 = this.field1759[var9];
                    int var27 = (var26.field2632 * arg4 + var26.field2640 * arg3 + var26.field2639 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2323[var9] = method567(this.field1762[var9] & 65535, var27);
                    var8.field2309[var9] = -1;
                } else {
                    var8.field2309[var9] = -2;
                }
            } else {
                int var19 = this.field1762[var9] & 65535;
                class37 var20;
                if (this.field1736 != null && this.field1736[this.field1737[var9]] != null) {
                    var20 = this.field1736[this.field1737[var9]];
                } else {
                    var20 = this.field1730[this.field1737[var9]];
                }
                int var21 = (var20.field1015 * arg4 + var20.field1021 * arg2 + var20.field1009 * arg3) / (var20.field1010 * var7) + arg0;
                var8.field2323[var9] = method567(var19, var21);
                class37 var22;
                if (this.field1736 != null && this.field1736[this.field1738[var9]] != null) {
                    var22 = this.field1736[this.field1738[var9]];
                } else {
                    var22 = this.field1730[this.field1738[var9]];
                }
                int var23 = (var22.field1015 * arg4 + var22.field1021 * arg2 + var22.field1009 * arg3) / (var22.field1010 * var7) + arg0;
                var8.field2310[var9] = method567(var19, var23);
                class37 var24;
                if (this.field1736 != null && this.field1736[this.field1748[var9]] != null) {
                    var24 = this.field1736[this.field1748[var9]];
                } else {
                    var24 = this.field1730[this.field1748[var9]];
                }
                int var25 = (var24.field1015 * arg4 + var24.field1021 * arg2 + var24.field1009 * arg3) / (var24.field1010 * var7) + arg0;
                var8.field2309[var9] = method567(var19, var25);
            }
        }
        this.method551();
        var8.field2312 = this.field1757;
        var8.field2313 = this.field1758;
        var8.field2315 = this.field1753;
        var8.field2322 = this.field1729;
        var8.field2316 = this.field1764;
        var8.field2327 = this.field1737;
        var8.field2314 = this.field1738;
        var8.field2325 = this.field1748;
        var8.field2320 = this.field1750;
        var8.field2329 = this.field1760;
        var8.field2318 = this.field1751;
        if (var8.field2318 != null) {
            var8.field2331 = this.field1762;
        } else {
            var8.field2331 = null;
        }
        var8.field2307 = this.field1734;
        var8.field2321 = this.field1752;
        var8.field2311 = this.field1756;
        var8.field2317 = this.field1761;
        var8.field2332 = this.field1731;
        var8.field2308 = this.field1733;
        var8.field2328 = this.field1747;
        return var8;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)I")
    private static final int method567(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lje;I)I")
    private final int method568(class67 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1758[arg1];
        int var5 = arg0.field1753[arg1];
        int var6 = arg0.field1729[arg1];
        for (int var7 = 0; var7 < this.field1757; ++var7) {
            if (this.field1758[var7] == var4 && this.field1753[var7] == var5 && this.field1729[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1758[this.field1757] = var4;
            this.field1753[this.field1757] = var5;
            this.field1729[this.field1757] = var6;
            if (arg0.field1745 != null) {
                this.field1745[this.field1757] = arg0.field1745[arg1];
            }
            var3 = this.field1757++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(SS)V")
    public final void method569(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1764; ++var3) {
            if (this.field1762[var3] == arg0) {
                this.field1762[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)I")
    private static final int method570(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field1732[arg0];
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    private class67() {
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
    private class67(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var4.field2816 = arg0.length - 18;
        int var9 = var4.method944((byte) 124);
        int var10 = var4.method944((byte) 114);
        int var11 = var4.method957((byte) 67);
        int var12 = var4.method957((byte) 29);
        int var13 = var4.method957((byte) 31);
        int var14 = var4.method957((byte) 96);
        int var15 = var4.method957((byte) 99);
        int var16 = var4.method957((byte) 40);
        int var17 = var4.method944((byte) 126);
        int var18 = var4.method944((byte) 121);
        int var19 = var4.method944((byte) 114);
        int var20 = var4.method944((byte) 125);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1757 = var9;
        this.field1764 = var10;
        this.field1752 = var11;
        this.field1758 = new int[var9];
        this.field1753 = new int[var9];
        this.field1729 = new int[var9];
        this.field1737 = new int[var10];
        this.field1738 = new int[var10];
        this.field1748 = new int[var10];
        if (var11 > 0) {
            this.field1756 = new int[var11];
            this.field1761 = new int[var11];
            this.field1731 = new int[var11];
        }
        if (var16 == 1) {
            this.field1745 = new int[var9];
        }
        if (var12 == 1) {
            this.field1755 = new byte[var10];
            this.field1751 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1750 = new byte[var10];
        } else {
            this.field1734 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1760 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1742 = new int[var10];
        }
        this.field1762 = new short[var10];
        var4.field2816 = var21;
        var5.field2816 = var36;
        var6.field2816 = var38;
        var7.field2816 = var40;
        var8.field2816 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method957((byte) 11);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method923((byte) -115);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method923((byte) -124);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method923((byte) -127);
            }
            this.field1758[var46] = var43 + var60;
            this.field1753[var46] = var44 + var61;
            this.field1729[var46] = var45 + var62;
            var43 = this.field1758[var46];
            var44 = this.field1753[var46];
            var45 = this.field1729[var46];
            if (var16 == 1) {
                this.field1745[var46] = var8.method957((byte) 34);
            }
        }
        var4.field2816 = var32;
        var5.field2816 = var28;
        var6.field2816 = var26;
        var7.field2816 = var30;
        var8.field2816 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1762[var47] = (short) var4.method944((byte) 125);
            if (var12 == 1) {
                int var58 = var5.method957((byte) 26);
                if ((var58 & 1) == 1) {
                    this.field1755[var47] = 1;
                    var3 = true;
                } else {
                    this.field1755[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field1751[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field1751[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1750[var47] = var6.method966((byte) 53);
            }
            if (var14 == 1) {
                this.field1760[var47] = var7.method966((byte) 118);
            }
            if (var15 == 1) {
                this.field1742[var47] = var8.method957((byte) 100);
            }
        }
        var4.field2816 = var25;
        var5.field2816 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method957((byte) 64);
            if (var54 == 1) {
                var48 = var4.method923((byte) -125) + var51;
                var49 = var4.method923((byte) -126) + var48;
                var50 = var4.method923((byte) -128) + var49;
                var51 = var50;
                this.field1737[var52] = var48;
                this.field1738[var52] = var49;
                this.field1748[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method923((byte) -119) + var51;
                var51 = var50;
                this.field1737[var52] = var48;
                this.field1738[var52] = var49;
                this.field1748[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method923((byte) -123) + var51;
                var51 = var50;
                this.field1737[var52] = var48;
                this.field1738[var52] = var49;
                this.field1748[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method923((byte) -116) + var51;
                var51 = var50;
                this.field1737[var52] = var48;
                this.field1738[var52] = var57;
                this.field1748[var52] = var50;
            }
        }
        var4.field2816 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1756[var53] = var4.method944((byte) 115);
            this.field1761[var53] = var4.method944((byte) 114);
            this.field1731[var53] = var4.method944((byte) 117);
        }
        if (!var2) {
            this.field1751 = null;
        }
        if (!var3) {
            this.field1755 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([Lje;I)V")
    public class67(class67[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field1757 = 0;
        this.field1764 = 0;
        this.field1752 = 0;
        this.field1734 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class67 var14 = arg0[var8];
            if (var14 != null) {
                this.field1757 += var14.field1757;
                this.field1764 += var14.field1764;
                this.field1752 += var14.field1752;
                if (var14.field1750 != null) {
                    var4 = true;
                } else {
                    if (this.field1734 == -1) {
                        this.field1734 = var14.field1734;
                    }
                    if (this.field1734 != var14.field1734) {
                        var4 = true;
                    }
                }
                var3 |= var14.field1755 != null;
                var5 |= var14.field1760 != null;
                var6 |= var14.field1742 != null;
                var7 |= var14.field1751 != null;
            }
        }
        this.field1758 = new int[this.field1757];
        this.field1753 = new int[this.field1757];
        this.field1729 = new int[this.field1757];
        this.field1745 = new int[this.field1757];
        this.field1737 = new int[this.field1764];
        this.field1738 = new int[this.field1764];
        this.field1748 = new int[this.field1764];
        if (this.field1752 > 0) {
            this.field1756 = new int[this.field1752];
            this.field1761 = new int[this.field1752];
            this.field1731 = new int[this.field1752];
        }
        if (var3) {
            this.field1755 = new byte[this.field1764];
        }
        if (var4) {
            this.field1750 = new byte[this.field1764];
        }
        if (var5) {
            this.field1760 = new byte[this.field1764];
        }
        if (var7) {
            this.field1751 = new byte[this.field1764];
        }
        if (var6) {
            this.field1742 = new int[this.field1764];
        }
        this.field1762 = new short[this.field1764];
        this.field1757 = 0;
        this.field1764 = 0;
        this.field1752 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class67 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1764; ++var12) {
                    if (var3 && var11.field1755 != null) {
                        this.field1755[this.field1764] = var11.field1755[var12];
                    }
                    if (var4) {
                        if (var11.field1750 != null) {
                            this.field1750[this.field1764] = var11.field1750[var12];
                        } else {
                            this.field1750[this.field1764] = var11.field1734;
                        }
                    }
                    if (var5 && var11.field1760 != null) {
                        this.field1760[this.field1764] = var11.field1760[var12];
                    }
                    if (var7) {
                        if (var11.field1751 != null && var11.field1751[var12] != -1) {
                            this.field1751[this.field1764] = (byte) (var11.field1751[var12] + var9);
                        } else {
                            this.field1751[this.field1764] = -1;
                        }
                    }
                    if (var6 && var11.field1742 != null) {
                        this.field1742[this.field1764] = var11.field1742[var12];
                    }
                    this.field1762[this.field1764] = var11.field1762[var12];
                    this.field1737[this.field1764] = this.method568(var11, var11.field1737[var12]);
                    this.field1738[this.field1764] = this.method568(var11, var11.field1738[var12]);
                    this.field1748[this.field1764] = this.method568(var11, var11.field1748[var12]);
                    ++this.field1764;
                }
                for (int var13 = 0; var13 < var11.field1752; ++var13) {
                    this.field1756[this.field1752] = this.method568(var11, var11.field1756[var13]);
                    this.field1761[this.field1752] = this.method568(var11, var11.field1761[var13]);
                    this.field1731[this.field1752] = this.method568(var11, var11.field1731[var13]);
                    ++this.field1752;
                }
                var9 += var11.field1752;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lje;ZZZ)V")
    public class67(class67 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field1757 = arg0.field1757;
        this.field1764 = arg0.field1764;
        this.field1752 = arg0.field1752;
        if (arg1) {
            this.field1758 = arg0.field1758;
            this.field1753 = arg0.field1753;
            this.field1729 = arg0.field1729;
        } else {
            this.field1758 = new int[this.field1757];
            this.field1753 = new int[this.field1757];
            this.field1729 = new int[this.field1757];
            for (int var5 = 0; var5 < this.field1757; ++var5) {
                this.field1758[var5] = arg0.field1758[var5];
                this.field1753[var5] = arg0.field1753[var5];
                this.field1729[var5] = arg0.field1729[var5];
            }
        }
        if (arg2) {
            this.field1762 = arg0.field1762;
        } else {
            this.field1762 = new short[this.field1764];
            for (int var6 = 0; var6 < this.field1764; ++var6) {
                this.field1762[var6] = arg0.field1762[var6];
            }
        }
        if (arg3) {
            this.field1760 = arg0.field1760;
        } else {
            this.field1760 = new byte[this.field1764];
            if (arg0.field1760 == null) {
                for (int var7 = 0; var7 < this.field1764; ++var7) {
                    this.field1760[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field1764; ++var8) {
                    this.field1760[var8] = arg0.field1760[var8];
                }
            }
        }
        this.field1737 = arg0.field1737;
        this.field1738 = arg0.field1738;
        this.field1748 = arg0.field1748;
        this.field1755 = arg0.field1755;
        this.field1750 = arg0.field1750;
        this.field1751 = arg0.field1751;
        this.field1734 = arg0.field1734;
        this.field1756 = arg0.field1756;
        this.field1761 = arg0.field1761;
        this.field1731 = arg0.field1731;
        this.field1745 = arg0.field1745;
        this.field1742 = arg0.field1742;
        this.field1733 = arg0.field1733;
        this.field1747 = arg0.field1747;
        this.field1730 = arg0.field1730;
        this.field1759 = arg0.field1759;
        this.field1736 = arg0.field1736;
        this.field1741 = arg0.field1741;
        this.field1746 = arg0.field1746;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field1732[var0++] = 255;
        }
        while (var0 < 16) {
            field1732[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field1732[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field1732[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field1732[var0++] = var1--;
        }
    }
}
