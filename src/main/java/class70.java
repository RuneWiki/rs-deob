import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 extends class110 {

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Z")
    public boolean field1698 = false;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public int field1696 = -1;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public int field1705 = -1;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
    public int field1718 = -1;

    @OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
    public int field1724 = -1;

    @OriginalMember(owner = "client!ka", name = "xb", descriptor = "I")
    public int field1726 = 5;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public int field1710 = 2;

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
    public int field1719 = 99;

    @OriginalMember(owner = "client!ka", name = "Ab", descriptor = "I")
    public int field1729 = -1;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lmb;")
    public static class84 field1704 = class79.method672(true, "Texturen geladen)3");

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "Lmb;")
    private static class84 field1715 = class79.method672(true, "Classic");

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "[Lhb;")
    public static class51[] field1722 = new class51[2048];

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lmb;")
    public static class84 field1703 = class79.method672(true, "Chat panel redrawn");

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Lmb;")
    private static class84 field1699 = class79.method672(true, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "Lmb;")
    public static class84 field1717 = field1699;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lmb;")
    public static class84 field1712 = field1715;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lmb;")
    public static class84 field1708 = class79.method672(true, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ka", name = "zb", descriptor = "Lmb;")
    public static class84 field1728 = class79.method672(true, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!ka", name = "Bb", descriptor = "I")
    public static int field1730 = 1;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ka", name = "yb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ka", name = "Cb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ka", name = "Db", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    private int[] field1697;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "[I")
    public int[] field1706;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "[I")
    private int[] field1709;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "[I")
    public int[] field1711;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "[I")
    public int[] field1716;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILdd;Lka;I)Ldd;")
    public final class26 method612(byte arg0, int arg1, class26 arg2, class70 arg3, int arg4) {
        field1721++;
        int var6 = this.field1706[arg4];
        class111 var7 = class64.method577(false, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method616(arg1, (byte) -73, arg2);
        }
        int var9 = arg3.field1706[arg1];
        class111 var10 = class64.method577(false, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class26 var12 = arg2.method192(!var7.method901((byte) 127, var8));
            var12.method173(var7, var8);
            return var12;
        }
        class26 var13 = arg2.method192(!var7.method901((byte) 127, var8) & !var10.method901((byte) 127, var11));
        var13.method188(var7, var8, var10, var11, this.field1709);
        if (arg0 >= -18) {
            this.method612((byte) 104, -103, null, null, 105);
        }
        return var13;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhb;BI)V")
    private final void method613(class51 arg0, byte arg1, int arg2) {
        if (arg1 >= -47) {
            method619(-63, -102, -19, null);
        }
        field1732++;
        if (arg2 == 1) {
            int var4 = arg0.method373(25094);
            this.field1716 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1716[var5] = arg0.method383(-2056200760);
            }
            this.field1706 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1706[var6] = arg0.method383(-2056200760);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1706[var7] = (arg0.method383(-2056200760) << 16) + this.field1706[var7];
            }
        } else if (arg2 == 2) {
            this.field1724 = arg0.method383(-2056200760);
        } else if (arg2 == 3) {
            int var13 = arg0.method373(25094);
            this.field1709 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1709[var14] = arg0.method373(25094);
            }
            this.field1709[var13] = 9999999;
        } else if (arg2 == 4) {
            this.field1698 = true;
        } else if (arg2 == 5) {
            this.field1726 = arg0.method373(25094);
        } else if (arg2 == 6) {
            this.field1729 = arg0.method383(-2056200760);
        } else if (arg2 == 7) {
            this.field1718 = arg0.method383(-2056200760);
        } else if (arg2 == 8) {
            this.field1719 = arg0.method373(25094);
        } else if (arg2 == 9) {
            this.field1696 = arg0.method373(25094);
        } else if (arg2 == 10) {
            this.field1705 = arg0.method373(25094);
        } else if (arg2 == 11) {
            this.field1710 = arg0.method373(25094);
        } else if (arg2 == 12) {
            int var10 = arg0.method373(25094);
            this.field1697 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1697[var11] = arg0.method383(-2056200760);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1697[var12] = (arg0.method383(-2056200760) << 16) + this.field1697[var12];
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method373(25094);
            this.field1711 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1711[var9] = arg0.method374((byte) -115);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public final void method614(byte arg0) {
        field1720++;
        if (this.field1696 == -1) {
            if (this.field1709 == null) {
                this.field1696 = 0;
            } else {
                this.field1696 = 2;
            }
        }
        if (this.field1705 == -1) {
            if (this.field1709 == null) {
                this.field1705 = 0;
            } else {
                this.field1705 = 2;
            }
        }
        if (arg0 <= 16) {
            this.method612((byte) -74, -33, null, null, -93);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public static void method615(int arg0) {
        field1715 = null;
        field1708 = null;
        field1703 = null;
        field1717 = null;
        field1712 = null;
        field1722 = null;
        field1728 = null;
        field1699 = null;
        if (arg0 != 4) {
            method619(-115, -54, 63, null);
        }
        field1704 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLdd;)Ldd;")
    public final class26 method616(int arg0, byte arg1, class26 arg2) {
        int var4 = this.field1706[arg0];
        field1713++;
        class111 var5 = class64.method577(false, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method192(true);
        }
        class26 var7 = arg2.method192(!var5.method901((byte) 127, var6));
        var7.method173(var5, var6);
        if (arg1 > -47) {
            this.method618(null, (byte) 59);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILmb;Lmb;Lsd;)Ldf;")
    public static final class28 method617(int arg0, class84 arg1, class84 arg2, class122 arg3) {
        if (arg0 == 1) {
            field1707++;
            int var4 = arg3.method997(49, arg2);
            int var5 = arg3.method1004(false, arg1, var4);
            return class41.method311(false, arg3, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhb;B)V")
    public final void method618(class51 arg0, byte arg1) {
        if (arg1 != -49) {
            return;
        }
        field1723++;
        while (true) {
            int var3 = arg0.method373(25094);
            if (var3 == 0) {
                return;
            }
            this.method613(arg0, (byte) -60, var3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILjava/awt/Component;)Ljd;")
    public static final class66 method619(int arg0, int arg1, int arg2, Component arg3) {
        field1701++;
        try {
            if (arg2 == 4) {
                Class var4 = Class.forName("cc");
                class66 var5 = (class66) var4.getDeclaredConstructor().newInstance();
                var5.method123(arg1, arg0, 112, arg3);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class146 var6 = new class146();
            var6.method123(arg1, arg0, 42, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILi;Ljc;IBIII)V")
    public static final void method620(int arg0, int arg1, class56 arg2, class65 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field1702++;
        if (class124.field3012 && (class62.field1540[0][arg0][arg1] & 0x2) == 0) {
            if ((class62.field1540[arg4][arg0][arg1] & 0x10) != 0) {
                return;
            }
            if (class145.method1182(arg1, arg4, arg0, (byte) -125) != class119.field2842) {
                return;
            }
        }
        if (class41.field928 > arg4) {
            class41.field928 = arg4;
        }
        int var9 = class52.field1168[arg4][arg0 + 1][arg1];
        int var10 = class52.field1168[arg4][arg0 + 1][arg1 + 1];
        int var11 = class52.field1168[arg4][arg0][arg1];
        int var12 = class52.field1168[arg4][arg0][arg1 + 1];
        int var13 = var9 + var10 + var11 + var12 >> 2;
        int var14 = (arg1 << 7) + (arg0 + (arg6 << 14)) + 1073741824;
        int var15 = (arg7 << 6) + arg8;
        class36 var16 = class77.method661(arg6, -92);
        if (var16.field755 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        if (var16.field759 == 1) {
            var15 += 256;
        }
        if (var16.method263(arg5 + 65483)) {
            class117.method948(arg1, var16, arg7, arg4, arg0, (byte) 93);
        }
        if (arg8 == 22) {
            if (!class124.field3012 || var16.field755 != 0 || var16.field791) {
                class68 var17;
                if (var16.field758 == -1 && var16.field802 == null) {
                    var17 = var16.method275(arg7, (byte) -70, var9, var12, 22, var10, var11);
                } else {
                    var17 = new class82(arg6, 22, arg7, var11, var9, var10, var12, var16.field758, true, null);
                }
                arg2.method469(arg4, arg0, arg1, var13, var17, var14, var15);
                if (var16.field816 && var16.field755 == 1 && arg3 != null) {
                    arg3.method589(arg1, (byte) -105, arg0);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class68 var37;
            if (var16.field758 == -1 && var16.field802 == null) {
                var37 = var16.method275(arg7, (byte) -70, var9, var12, 10, var10, var11);
            } else {
                var37 = new class82(arg6, 10, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            if (var37 != null) {
                int var38 = 0;
                if (arg8 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg7 == 1 || arg7 == 3) {
                    var39 = var16.field756;
                    var40 = var16.field767;
                } else {
                    var39 = var16.field767;
                    var40 = var16.field756;
                }
                if (arg2.method483(arg4, arg0, arg1, var13, var39, var40, var37, var38, var14, var15) && var16.field815) {
                    int var41 = 15;
                    if (var37 instanceof class26) {
                        var41 = ((class26) var37).method194() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var39; var42++) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            if (var41 > class65.field1604[arg4][arg0 + var42][arg1 + var43]) {
                                class65.field1604[arg4][arg0 + var42][arg1 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var16.field816 && arg3 != null) {
                arg3.method584(var16.field756, var16.field773, arg7, arg1, var16.field767, arg0, (byte) -87);
            }
        } else if (arg8 >= 12) {
            class68 var18;
            if (var16.field758 == -1 && var16.field802 == null) {
                var18 = var16.method275(arg7, (byte) -70, var9, var12, arg8, var10, var11);
            } else {
                var18 = new class82(arg6, arg8, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method483(arg4, arg0, arg1, var13, 1, 1, var18, 0, var14, var15);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg4 > 0) {
                class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 2340);
            }
            if (var16.field816 && arg3 != null) {
                arg3.method584(var16.field756, var16.field773, arg7, arg1, var16.field767, arg0, (byte) -70);
            }
        } else if (arg8 == 0) {
            class68 var19;
            if (var16.field758 == -1 && var16.field802 == null) {
                var19 = var16.method275(arg7, (byte) -70, var9, var12, 0, var10, var11);
            } else {
                var19 = new class82(arg6, 0, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method490(arg4, arg0, arg1, var13, var19, null, class68.field1661[arg7], 0, var14, var15);
            if (arg7 == 0) {
                if (var16.field815) {
                    class65.field1604[arg4][arg0][arg1] = 50;
                    class65.field1604[arg4][arg0][arg1 + 1] = 50;
                }
                if (var16.field790) {
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 585);
                }
            } else if (arg7 == 1) {
                if (var16.field815) {
                    class65.field1604[arg4][arg0][arg1 + 1] = 50;
                    class65.field1604[arg4][arg0 + 1][arg1 + 1] = 50;
                }
                if (var16.field790) {
                    class52.field1163[arg4][arg0][arg1 + 1] = class24.method166(class52.field1163[arg4][arg0][arg1 + 1], 1170);
                }
            } else if (arg7 == 2) {
                if (var16.field815) {
                    class65.field1604[arg4][arg0 + 1][arg1] = 50;
                    class65.field1604[arg4][arg0 + 1][arg1 + 1] = 50;
                }
                if (var16.field790) {
                    class52.field1163[arg4][arg0 + 1][arg1] = class24.method166(class52.field1163[arg4][arg0 + 1][arg1], 585);
                }
            } else if (arg7 == 3) {
                if (var16.field815) {
                    class65.field1604[arg4][arg0][arg1] = 50;
                    class65.field1604[arg4][arg0 + 1][arg1] = 50;
                }
                if (var16.field790) {
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 1170);
                }
            }
            if (var16.field816 && arg3 != null) {
                arg3.method586(true, arg7, var16.field773, arg8, arg1, arg0);
            }
            if (var16.field765 != 16) {
                arg2.method461(arg4, arg0, arg1, var16.field765);
            }
        } else if (arg8 == 1) {
            class68 var20;
            if (var16.field758 == -1 && var16.field802 == null) {
                var20 = var16.method275(arg7, (byte) -70, var9, var12, 1, var10, var11);
            } else {
                var20 = new class82(arg6, 1, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method490(arg4, arg0, arg1, var13, var20, null, class38.field856[arg7], 0, var14, var15);
            if (var16.field815) {
                if (arg7 == 0) {
                    class65.field1604[arg4][arg0][arg1 + 1] = 50;
                } else if (arg7 == 1) {
                    class65.field1604[arg4][arg0 + 1][arg1 + 1] = 50;
                } else if (arg7 == 2) {
                    class65.field1604[arg4][arg0 + 1][arg1] = 50;
                } else if (arg7 == 3) {
                    class65.field1604[arg4][arg0][arg1] = 50;
                }
            }
            if (var16.field816 && arg3 != null) {
                arg3.method586(true, arg7, var16.field773, arg8, arg1, arg0);
            }
        } else if (arg8 == 2) {
            int var21 = arg7 + 1 & 0x3;
            class68 var22;
            class68 var23;
            if (var16.field758 == -1 && var16.field802 == null) {
                var22 = var16.method275(arg7 + 4, (byte) -70, var9, var12, 2, var10, var11);
                var23 = var16.method275(var21, (byte) -70, var9, var12, 2, var10, var11);
            } else {
                var22 = new class82(arg6, 2, arg7 + 4, var11, var9, var10, var12, var16.field758, true, null);
                var23 = new class82(arg6, 2, var21, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method490(arg4, arg0, arg1, var13, var22, var23, class68.field1661[arg7], class68.field1661[var21], var14, var15);
            if (var16.field790) {
                if (arg7 == 0) {
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 585);
                    class52.field1163[arg4][arg0][arg1 + 1] = class24.method166(class52.field1163[arg4][arg0][arg1 + 1], 1170);
                } else if (arg7 == 1) {
                    class52.field1163[arg4][arg0][arg1 + 1] = class24.method166(class52.field1163[arg4][arg0][arg1 + 1], 1170);
                    class52.field1163[arg4][arg0 + 1][arg1] = class24.method166(class52.field1163[arg4][arg0 + 1][arg1], 585);
                } else if (arg7 == 2) {
                    class52.field1163[arg4][arg0 + 1][arg1] = class24.method166(class52.field1163[arg4][arg0 + 1][arg1], 585);
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 1170);
                } else if (arg7 == 3) {
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 1170);
                    class52.field1163[arg4][arg0][arg1] = class24.method166(class52.field1163[arg4][arg0][arg1], 585);
                }
            }
            if (var16.field816 && arg3 != null) {
                arg3.method586(true, arg7, var16.field773, arg8, arg1, arg0);
            }
            if (var16.field765 != 16) {
                arg2.method461(arg4, arg0, arg1, var16.field765);
            }
        } else if (arg8 == 3) {
            class68 var24;
            if (var16.field758 == -1 && var16.field802 == null) {
                var24 = var16.method275(arg7, (byte) -70, var9, var12, 3, var10, var11);
            } else {
                var24 = new class82(arg6, 3, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method490(arg4, arg0, arg1, var13, var24, null, class38.field856[arg7], 0, var14, var15);
            if (var16.field815) {
                if (arg7 == 0) {
                    class65.field1604[arg4][arg0][arg1 + 1] = 50;
                } else if (arg7 == 1) {
                    class65.field1604[arg4][arg0 + 1][arg1 + 1] = 50;
                } else if (arg7 == 2) {
                    class65.field1604[arg4][arg0 + 1][arg1] = 50;
                } else if (arg7 == 3) {
                    class65.field1604[arg4][arg0][arg1] = 50;
                }
            }
            if (var16.field816 && arg3 != null) {
                arg3.method586(true, arg7, var16.field773, arg8, arg1, arg0);
            }
        } else if (arg8 == 9) {
            class68 var25;
            if (var16.field758 == -1 && var16.field802 == null) {
                var25 = var16.method275(arg7, (byte) -70, var9, var12, arg8, var10, var11);
            } else {
                var25 = new class82(arg6, arg8, arg7, var11, var9, var10, var12, var16.field758, true, null);
            }
            arg2.method483(arg4, arg0, arg1, var13, 1, 1, var25, 0, var14, var15);
            if (var16.field816 && arg3 != null) {
                arg3.method584(var16.field756, var16.field773, arg7, arg1, var16.field767, arg0, (byte) -90);
            }
        } else {
            if (var16.field805) {
                if (arg7 == 1) {
                    int var26 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var26;
                } else if (arg7 == 2) {
                    int var27 = var12;
                    var12 = var9;
                    var9 = var27;
                    int var28 = var10;
                    var10 = var11;
                    var11 = var28;
                } else if (arg7 == 3) {
                    int var29 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var29;
                }
            }
            if (arg8 == 4) {
                class68 var30;
                if (var16.field758 == -1 && var16.field802 == null) {
                    var30 = var16.method275(0, (byte) -70, var9, var12, 4, var10, var11);
                } else {
                    var30 = new class82(arg6, 4, 0, var11, var9, var10, var12, var16.field758, true, null);
                }
                arg2.method455(arg4, arg0, arg1, var13, var30, class68.field1661[arg7], arg7 * 512, 0, 0, var14, var15);
            } else if (arg8 == 5) {
                int var31 = 16;
                int var32 = arg2.method487(arg4, arg0, arg1);
                if (var32 != 0) {
                    var31 = class77.method661(var32 >> 14 & 0x7FFF, arg5 ^ 0xFFFFFF86).field765;
                }
                class68 var33;
                if (var16.field758 == -1 && var16.field802 == null) {
                    var33 = var16.method275(0, (byte) -70, var9, var12, 4, var10, var11);
                } else {
                    var33 = new class82(arg6, 4, 0, var11, var9, var10, var12, var16.field758, true, null);
                }
                arg2.method455(arg4, arg0, arg1, var13, var33, class68.field1661[arg7], arg7 * 512, class17.field374[arg7] * var31, class93.field2311[arg7] * var31, var14, var15);
            } else if (arg8 == 6) {
                class68 var34;
                if (var16.field758 == -1 && var16.field802 == null) {
                    var34 = var16.method275(0, (byte) -70, var9, var12, 4, var10, var11);
                } else {
                    var34 = new class82(arg6, 4, 0, var11, var9, var10, var12, var16.field758, true, null);
                }
                arg2.method455(arg4, arg0, arg1, var13, var34, 256, arg7, 0, 0, var14, var15);
            } else {
                if (arg5 != 52) {
                    field1717 = null;
                }
                if (arg8 == 7) {
                    class68 var35;
                    if (var16.field758 == -1 && var16.field802 == null) {
                        var35 = var16.method275(0, (byte) -70, var9, var12, 4, var10, var11);
                    } else {
                        var35 = new class82(arg6, 4, 0, var11, var9, var10, var12, var16.field758, true, null);
                    }
                    arg2.method455(arg4, arg0, arg1, var13, var35, 512, arg7, 0, 0, var14, var15);
                } else if (arg8 == 8) {
                    class68 var36;
                    if (var16.field758 == -1 && var16.field802 == null) {
                        var36 = var16.method275(0, (byte) -70, var9, var12, 4, var10, var11);
                    } else {
                        var36 = new class82(arg6, 4, 0, var11, var9, var10, var12, var16.field758, true, null);
                    }
                    arg2.method455(arg4, arg0, arg1, var13, var36, 768, arg7, 0, 0, var14, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldd;II)Ldd;")
    public final class26 method621(class26 arg0, int arg1, int arg2) {
        int var4 = this.field1706[arg1];
        field1731++;
        class111 var5 = class64.method577(false, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method192(true);
        }
        int var7 = 0;
        class111 var8 = null;
        if (this.field1697 != null && this.field1697.length > arg1) {
            int var9 = this.field1697[arg1];
            var8 = class64.method577(false, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class26 var11 = arg0.method192(!var5.method901((byte) 127, var6));
            var11.method173(var5, var6);
            return var11;
        } else if (arg2 == 29713) {
            class26 var10 = arg0.method192(!var5.method901((byte) 127, var6) & !var8.method901((byte) 127, var7));
            var10.method173(var5, var6);
            var10.method173(var8, var7);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILdd;II)Ldd;")
    public final class26 method622(int arg0, class26 arg1, int arg2, int arg3) {
        int var5 = this.field1706[arg2];
        class111 var6 = class64.method577(false, var5 >> 16);
        field1714++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method192(true);
        }
        int var8 = arg3 & 0x3;
        int var9 = -122 % ((arg0 - 63) / 62);
        class26 var10 = arg1.method192(!var6.method901((byte) 127, var7));
        if (var8 == 1) {
            var10.method179();
        } else if (var8 == 2) {
            var10.method180();
        } else if (var8 == 3) {
            var10.method184();
        }
        var10.method173(var6, var7);
        if (var8 == 1) {
            var10.method184();
        } else if (var8 == 2) {
            var10.method180();
        } else if (var8 == 3) {
            var10.method179();
        }
        return var10;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILdd;I)Ldd;")
    public final class26 method623(int arg0, class26 arg1, int arg2) {
        field1725++;
        int var4 = this.field1706[arg2];
        class111 var5 = class64.method577(false, var4 >> 16);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg1.method190(true);
        } else {
            class26 var7 = arg1.method190(!var5.method901((byte) 127, var6));
            var7.method173(var5, var6);
            return var7;
        }
    }
}
