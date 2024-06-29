import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 extends class53 {

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "I")
    private int field1722 = 0;

    @OriginalMember(owner = "client!ka", name = "zb", descriptor = "Z")
    private boolean field1728 = false;

    @OriginalMember(owner = "client!ka", name = "Nb", descriptor = "I")
    private int field1742 = 0;

    @OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!ka", name = "Vb", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!ka", name = "hc", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!ka", name = "gc", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!ka", name = "Kb", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ka", name = "xb", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!ka", name = "Eb", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "Luc;")
    private class142 field1718;

    @OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!ka", name = "Xb", descriptor = "I")
    public static int field1752 = 2;

    @OriginalMember(owner = "client!ka", name = "Mb", descriptor = "Lhe;")
    public static class54 field1741 = class6.method58(")1", false);

    @OriginalMember(owner = "client!ka", name = "bc", descriptor = "I")
    public static int field1756 = 0;

    @OriginalMember(owner = "client!ka", name = "ec", descriptor = "Lhe;")
    private static class54 field1759 = class6.method58("Please use a different world)3", false);

    @OriginalMember(owner = "client!ka", name = "Sb", descriptor = "Lhe;")
    public static class54 field1747 = field1759;

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lhe;")
    public static class54 field1720 = field1759;

    @OriginalMember(owner = "client!ka", name = "Lb", descriptor = "D")
    private double field1740;

    @OriginalMember(owner = "client!ka", name = "Qb", descriptor = "D")
    private double field1745;

    @OriginalMember(owner = "client!ka", name = "Rb", descriptor = "D")
    public double field1746;

    @OriginalMember(owner = "client!ka", name = "Wb", descriptor = "D")
    private double field1751;

    @OriginalMember(owner = "client!ka", name = "Zb", descriptor = "D")
    private double field1754;

    @OriginalMember(owner = "client!ka", name = "ac", descriptor = "D")
    public double field1755;

    @OriginalMember(owner = "client!ka", name = "cc", descriptor = "D")
    private double field1757;

    @OriginalMember(owner = "client!ka", name = "fc", descriptor = "D")
    public double field1760;

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ka", name = "Ab", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ka", name = "Bb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ka", name = "Cb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ka", name = "Gb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ka", name = "Jb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ka", name = "Ob", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!ka", name = "Pb", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ka", name = "Tb", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!ka", name = "Ub", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ka", name = "dc", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ka", name = "Yb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1753;

    @OriginalMember(owner = "client!ka", name = "Db", descriptor = "[I")
    public static int[] field1732;

    @OriginalMember(owner = "client!ka", name = "yb", descriptor = "[[I")
    public static int[][] field1727;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1728) {
            double var6 = (double) (arg0 - this.field1739);
            double var8 = (double) (arg3 - this.field1733);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1746 = this.field1762;
            this.field1760 = (double) this.field1750 * var6 / var10 + (double) this.field1739;
            this.field1755 = (double) this.field1750 * var8 / var10 + (double) this.field1733;
        }
        field1744++;
        double var12 = (double) (this.field1761 + 1 - arg2);
        this.field1745 = ((double) arg3 - this.field1755) / var12;
        this.field1740 = ((double) arg0 - this.field1760) / var12;
        this.field1754 = Math.sqrt(this.field1745 * this.field1745 + this.field1740 * this.field1740);
        if (!this.field1728) {
            this.field1751 = -this.field1754 * Math.tan((double) this.field1734 * 0.02454369D);
        }
        if (arg4 < 82) {
            this.field1751 = 1.981091349703998D;
        }
        this.field1757 = ((double) arg1 - this.field1746 - this.field1751 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
    public static final void method553(int arg0, boolean arg1) {
        field1758++;
        if (class75.field1862 == null) {
            return;
        }
        try {
            class83 var2 = new class83(4);
            if (arg0 >= 26) {
                var2.method649((byte) -27, arg1 ? 2 : 3);
                var2.method653(0, -83);
                class75.field1862.method1132(4, 0, 127, var2.field2055);
            }
        } catch (IOException var4) {
            try {
                class75.field1862.method1130(-31709);
            } catch (Exception var3) {
            }
            class75.field1862 = null;
            class133.field3002++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(Z)V")
    public static void method554(boolean arg0) {
        field1732 = null;
        field1727 = null;
        field1753 = null;
        field1720 = null;
        field1747 = null;
        field1759 = null;
        if (arg0) {
            field1723 = -82;
        }
        field1741 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        field1736++;
        class52 var2 = class107.method813(-23222, this.field1721);
        class98 var3 = var2.method371(-59, this.field1722);
        if (var3 == null) {
            return null;
        }
        if (arg0) {
            field1741 = null;
        }
        var3.method786(this.field1748);
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static final void method555(int arg0) {
        if (arg0 != 1) {
            method557((byte) -73, null, 10);
        }
        field1735++;
        class13.field365.method992(0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public static final void method556(int arg0, int arg1) {
        int[] var2 = class6.field185.field2699;
        field1749++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class87.field2152[arg1][var21][var5] & 0x18) == 0) {
                    class74.field1831.method1054(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class87.field2152[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class74.field1831.method1054(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        class6.field185.method849();
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class87.field2152[arg1][var19][var8] & 0x18) == 0) {
                    class111.method836(arg1, (byte) -91, var19, var7, var6, var8);
                }
                if (arg1 < 3 && (class87.field2152[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class111.method836(arg1 + 1, (byte) -97, var19, var7, var6, var8);
                }
            }
        }
        if (arg0 != 4) {
            field1747 = null;
        }
        class56.field1402 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class74.field1831.method1018(class157.field3573, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class4.method34(true, var12).field53;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class111.field2652[class157.field3573].field117;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class14.field420[class56.field1402] = class35.field884[var13];
                        class12.field327[class56.field1402] = var14;
                        class51.field1234[class56.field1402] = var15;
                        class56.field1402++;
                    }
                }
            }
        }
        class124.field2852.method204(-119);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLhe;I)V")
    public static final void method557(byte arg0, class54 arg1, int arg2) {
        field1719++;
        class54 var3 = arg1.method395(104).method418(89);
        int var4 = 64 % ((arg0 - 21) / 47);
        boolean var5 = false;
        for (int var6 = 0; var6 < class74.field1823; var6++) {
            class22 var7 = class48.field1148[class141.field3227[var6]];
            if (var7 != null && var7.field626 != null && var7.field626.method397(var3, (byte) -105)) {
                class121.method935(1, class108.field2639.field951[0], var7.field951[0], var7.field952[0], 1, 0, false, 2, 0, 0, 0, class108.field2639.field952[0]);
                var5 = true;
                if (arg2 == 1) {
                    class131.field2969.method454(84, 118);
                    class72.field1796++;
                    class131.field2969.method629(class141.field3227[var6], 2018779304);
                } else if (arg2 == 4) {
                    class134.field3022++;
                    class131.field2969.method454(183, 121);
                    class131.field2969.method673(class141.field3227[var6], (byte) 53);
                } else if (arg2 == 6) {
                    class131.field2969.method454(114, 122);
                    class131.field2969.method629(class141.field3227[var6], 2018779304);
                    class128.field2889++;
                } else if (arg2 == 7) {
                    class5.field145++;
                    class131.field2969.method454(117, -26);
                    class131.field2969.method640(81, class141.field3227[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class80.method612(class143.method1105(new class54[] { class9.field274, var3 }, -842), class24.field671, (byte) 122, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public final void method558(int arg0, int arg1) {
        this.field1760 += (double) arg0 * this.field1740;
        field1731++;
        this.field1755 += (double) arg0 * this.field1745;
        this.field1728 = true;
        this.field1746 += this.field1757 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1751;
        this.field1751 += (double) arg0 * this.field1757;
        this.field1743 = (int) (Math.atan2(this.field1740, this.field1745) * 325.949D) + 1024 & 0x7FF;
        if (arg1 != -4) {
            method555(-123);
        }
        this.field1748 = (int) (Math.atan2(this.field1751, this.field1754) * 325.949D) & 0x7FF;
        if (this.field1718 == null) {
            return;
        }
        this.field1742 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1718.field3247[this.field1722] >= this.field1742) {
                        return;
                    }
                    this.field1742 -= this.field1718.field3247[this.field1722];
                    this.field1722++;
                } while (this.field1718.field3258.length > this.field1722);
                this.field1722 -= this.field1718.field3249;
            } while (this.field1722 >= 0 && this.field1718.field3258.length > this.field1722);
            this.field1722 = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(Z)V")
    public static final void method559(boolean arg0) {
        field1729++;
        if (!class141.field3216) {
            return;
        }
        class93 var1 = class105.method811(class121.field2811, -1, class85.field2119);
        if (var1 != null && var1.field2253 != null) {
            class100 var2 = new class100();
            var2.field2537 = var1;
            var2.field2522 = var1.field2253;
            class32.method242(1, var2);
        }
        class141.field3216 = arg0;
        class134.method1005(var1, 0);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1734 = arg7;
        this.field1750 = arg8;
        this.field1762 = arg4;
        this.field1761 = arg6;
        this.field1739 = arg2;
        this.field1721 = arg0;
        this.field1725 = arg5;
        this.field1737 = arg9;
        this.field1728 = false;
        this.field1724 = arg10;
        this.field1726 = arg1;
        this.field1733 = arg3;
        int var12 = class107.method813(-23222, this.field1721).field1250;
        if (var12 == -1) {
            this.field1718 = null;
        } else {
            this.field1718 = class135.method1010(var12, (byte) -123);
        }
    }
}
