import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class118 {

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field1718 = -1;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field1730 = -1;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field1713 = -1;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field1720 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field1723 = 0;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public int field1738 = -1;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public int field1721 = -1;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field1729 = -1;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public int field1737 = -1;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field1724 = 0;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field1739 = -1;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public int field1746 = 0;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public int field1740 = 0;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public int field1743 = 0;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public int field1750 = -1;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public int field1741 = -1;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field1719 = -1;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public int field1731 = -1;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public int field1751 = -1;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public int field1752 = -1;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public int field1733 = -1;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field1734 = 0;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public int field1732 = -1;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public int field1742 = -1;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public int field1749 = -1;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public int field1748 = -1;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field1727 = -1;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public int field1736 = 0;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public int field1755 = 0;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public int field1744 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field1728 = -1;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[[[I")
    public static int[][][] field1726 = new int[2][][];

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
    public static boolean field1725 = true;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "B")
    public static byte field1735;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[[I")
    public int[][] field1722;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 12)
    public final void method761(int arg0) {
        if (arg0 >= -127) {
            method766(35);
        }
        field1747++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILfh;)V", line = 43)
    public final void method762(int arg0, class313 arg1) {
        while (true) {
            int var3 = arg1.method2224(-123);
            if (var3 == 0) {
                field1745++;
                if (arg0 < 70) {
                    method763(106, 104, -8, (byte) -111);
                }
                return;
            }
            this.method765((byte) 123, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIB)I", line = 100)
    public static final int method763(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -83) {
            field1735 = 97;
        }
        field1753++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZIILaf;Laf;)I", line = 128)
    public static final int method764(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, class201 arg5, class201 arg6) {
        int var7 = class33.method272(arg5, arg3, (byte) 77, arg1, arg6);
        field1754++;
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class33.method272(arg5, arg4, (byte) 77, arg2, arg6);
            if (arg0 != -34) {
                field1735 = -77;
            }
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BILfh;)V", line = 171)
    private final void method765(byte arg0, int arg1, class313 arg2) {
        if (arg0 <= 94) {
            this.field1727 = 52;
        }
        field1717++;
        if (arg1 == 1) {
            this.field1739 = arg2.method2250(-1613178296);
            this.field1742 = arg2.method2250(-1613178296);
            if (this.field1739 == 65535) {
                this.field1739 = -1;
            }
            if (this.field1742 == 65535) {
                this.field1742 = -1;
            }
        } else if (arg1 == 2) {
            this.field1741 = arg2.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field1751 = arg2.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field1752 = arg2.method2250(-1613178296);
        } else if (arg1 == 5) {
            this.field1727 = arg2.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field1738 = arg2.method2250(-1613178296);
        } else if (arg1 == 7) {
            this.field1749 = arg2.method2250(-1613178296);
        } else if (arg1 == 8) {
            this.field1715 = arg2.method2250(-1613178296);
        } else if (arg1 == 9) {
            this.field1713 = arg2.method2250(-1613178296);
        } else if (arg1 == 26) {
            this.field1734 = (short) (arg2.method2224(-128) * 4);
            this.field1743 = (short) (arg2.method2224(-127) * 4);
        } else if (arg1 == 27) {
            if (this.field1722 == null) {
                this.field1722 = new int[12][];
            }
            int var4 = arg2.method2224(-119);
            this.field1722[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field1722[var4][var5] = arg2.method2214(0);
            }
        } else if (arg1 == 29) {
            this.field1723 = arg2.method2224(-119);
        } else if (arg1 == 30) {
            this.field1744 = arg2.method2250(-1613178296);
        } else if (arg1 == 31) {
            this.field1746 = arg2.method2224(-124);
        } else if (arg1 == 32) {
            this.field1755 = arg2.method2250(-1613178296);
        } else if (arg1 == 33) {
            this.field1736 = arg2.method2214(0);
        } else if (arg1 == 34) {
            this.field1724 = arg2.method2224(-123);
        } else if (arg1 == 35) {
            this.field1740 = arg2.method2250(-1613178296);
        } else if (arg1 == 36) {
            this.field1720 = arg2.method2214(0);
        } else if (arg1 == 37) {
            this.field1730 = arg2.method2224(-126);
        } else if (arg1 == 38) {
            this.field1750 = arg2.method2250(-1613178296);
        } else if (arg1 == 39) {
            this.field1737 = arg2.method2250(-1613178296);
        } else if (arg1 == 40) {
            this.field1718 = arg2.method2250(-1613178296);
        } else if (arg1 == 41) {
            this.field1719 = arg2.method2250(-1613178296);
        } else if (arg1 == 42) {
            this.field1748 = arg2.method2250(-1613178296);
        } else if (arg1 == 43) {
            arg2.method2250(-1613178296);
        } else if (arg1 == 44) {
            arg2.method2250(-1613178296);
        } else if (arg1 == 45) {
            arg2.method2250(-1613178296);
        } else if (arg1 == 46) {
            this.field1728 = arg2.method2250(-1613178296);
        } else if (arg1 == 47) {
            this.field1733 = arg2.method2250(-1613178296);
        } else if (arg1 == 48) {
            this.field1729 = arg2.method2250(-1613178296);
        } else if (arg1 == 49) {
            this.field1732 = arg2.method2250(-1613178296);
        } else if (arg1 == 50) {
            this.field1721 = arg2.method2250(-1613178296);
        } else if (arg1 == 51) {
            this.field1731 = arg2.method2250(-1613178296);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 376)
    public static void method766(int arg0) {
        if (arg0 != 0) {
            method767((class39) null, -88, 20, -66, 123);
        }
        field1726 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lkl;IIII)V", line = 430)
    public static final void method767(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1714++;
        if (class329.field5388 == arg0 || class117.field1701 >= 400) {
            return;
        }
        String var5;
        if (arg0.field575 == 0) {
            boolean var6 = true;
            if (class329.field5388.field568 != -1 && arg0.field568 != -1) {
                int var7 = class329.field5388.field591 > arg0.field591 ? class329.field5388.field591 : arg0.field591;
                int var8 = arg0.field568 <= class329.field5388.field568 ? arg0.field568 : class329.field5388.field568;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class329.field5388.field591 - arg0.field591;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class179.field2789 == 1 ? class352.field5608 : class138.field2180;
            if (arg0.field581 > arg0.field591) {
                var5 = arg0.method316(false) + (var6 ? class27.method231(class329.field5388.field591, arg0.field591, -23750) : "<col=ffffff>") + " (" + var11 + arg0.field591 + "+" + (arg0.field581 - arg0.field591) + ")";
            } else {
                var5 = arg0.method316(false) + (var6 ? class27.method231(class329.field5388.field591, arg0.field591, -23750) : "<col=ffffff>") + " (" + var11 + arg0.field591 + ")";
            }
        } else {
            var5 = arg0.method316(false) + " (" + class230.field3665 + arg0.field575 + ")";
        }
        if (class56.field856 == 1) {
            class300.field4950++;
            class322.method2309(class37.field550 + " -> <col=ffffff>" + var5, arg4, (short) 1, false, class210.field3203, class182.field2834, arg3, (long) arg1);
        } else if (!class107.field1532) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class278.field4581[var12] != null) {
                    class74.field1119++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class179.field2789 == 0 && class278.field4581[var12].equalsIgnoreCase(class273.field4491)) {
                        if (class329.field5388.field591 < arg0.field591) {
                            var13 = 2000;
                        }
                        if (class329.field5388.field571 != 0 && arg0.field571 != 0) {
                            if (class329.field5388.field571 == arg0.field571) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class182.field2830[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class27.field415[var12];
                    short var16 = (short) (var13 + var15);
                    class322.method2309("<col=ffffff>" + var5, arg4, var16, false, class140.field2259[var12], class278.field4581[var12], arg3, (long) arg1);
                }
            }
        } else if ((class29.field447 & 0x8) != 0) {
            class322.method2309(class167.field2630 + " -> <col=ffffff>" + var5, arg4, (short) 20, false, class339.field5457, class120.field1776, arg3, (long) arg1);
            class315.field5203++;
        }
        int var17 = 0;
        int var18 = -14 / ((arg2 + 54) / 47);
        while (class117.field1701 > var17) {
            if (class300.field4949[var17] == 38) {
                class190.field2938[var17] = "<col=ffffff>" + var5;
                break;
            }
            var17++;
        }
    }
}
