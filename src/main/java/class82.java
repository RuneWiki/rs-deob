import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class37 {

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field1775 = 0;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "[I")
    public int[] field1784 = new int[5];

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[Ln;")
    public class78[] field1791 = new class78[5];

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lo;")
    public static class84 field1755 = class15.method124("::clientdrop", 255);

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lo;")
    public static class84 field1763 = class15.method124(" x ", 255);

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lo;")
    public static class84 field1761 = class15.method124("(U5", 255);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[[I")
    public static int[][] field1758 = new int[104][104];

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lra;")
    public class100 field1788;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "Lrb;")
    public class101 field1777;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Luc;")
    public class117 field1790;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "La;")
    public class1 field1782;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lhc;")
    public static class45 field1764;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lac;")
    public class4 field1792;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Lnc;")
    public class81 field1774;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lnd;")
    public class82 field1773;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
    public boolean field1776;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "Z")
    public boolean field1779;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Z")
    public boolean field1780;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
    public static int[] field1768;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[Lqb;")
    public static class96[] field1770;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 4)
    public static int method595(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V", line = 17)
    public static final void method596(boolean arg0) {
        field1762++;
        if (arg0) {
            method601(-54, null, 103, 25);
        }
        for (int var1 = 0; var1 < class62.field1290; var1++) {
            int var2 = class117.field2552[var1];
            class115 var3 = class3.field30[var2];
            int var4 = class65.field1405.method231(255);
            if ((var4 & 0x20) != 0) {
                var3.field1442 = class65.field1405.method227(127);
                if (var3.field1442 == 65535) {
                    var3.field1442 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class65.field1405.method253(-17254);
                int var6 = class65.field1405.method229(false);
                var3.method503(var5, 112, class128.field2837, var6);
                var3.field1431 = class128.field2837 + 300;
                var3.field1412 = class65.field1405.method238(74);
                var3.field1386 = class65.field1405.method253(-17254);
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class65.field1405.method204(122);
                int var8 = class65.field1405.method231(255);
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var3.field1423 == var7 && var7 != -1) {
                    int var9 = class74.method554(var7, 4867).field610;
                    if (var9 == 1) {
                        var3.field1432 = 0;
                        var3.field1370 = 0;
                        var3.field1429 = var8;
                        var3.field1414 = 0;
                    }
                    if (var9 == 2) {
                        var3.field1414 = 0;
                    }
                } else if (var7 == -1 || var3.field1423 == -1 || class74.method554(var7, 4867).field606 >= class74.method554(var3.field1423, 4867).field606) {
                    var3.field1432 = 0;
                    var3.field1414 = 0;
                    var3.field1370 = 0;
                    var3.field1423 = var7;
                    var3.field1388 = var3.field1425;
                    var3.field1429 = var8;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class65.field1405.method253(-17254);
                int var11 = class65.field1405.method229(false);
                var3.method503(var10, 59, class128.field2837, var11);
                var3.field1431 = class128.field2837 + 300;
                var3.field1412 = class65.field1405.method231(255);
                var3.field1386 = class65.field1405.method253(-17254);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1417 = class65.field1405.method237(63);
                int var12 = class65.field1405.method233(-72);
                var3.field1437 = class128.field2837 + (var12 & 0xFFFF);
                var3.field1398 = var12 >> 16;
                var3.field1401 = 0;
                if (var3.field1437 > class128.field2837) {
                    var3.field1401 = -1;
                }
                if (var3.field1417 == 65535) {
                    var3.field1417 = -1;
                }
                var3.field1372 = 0;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1416 = class65.field1405.method244((byte) 127);
                var3.field1408 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field2501 = class42.method366(89, class65.field1405.method227(127));
                var3.field1399 = var3.field2501.field766;
                var3.field1373 = var3.field2501.field780;
                var3.field1420 = var3.field2501.field771;
                var3.field1392 = var3.field2501.field769;
                var3.field1384 = var3.field2501.field754;
                var3.field1440 = var3.field2501.field758;
                var3.field1419 = var3.field2501.field762;
            }
            if ((var4 & 0x10) != 0) {
                var3.field1387 = class65.field1405.method227(127);
                var3.field1406 = class65.field1405.method228(127);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z", line = 185)
    public static final boolean method597(boolean arg0) {
        if (!arg0) {
            field1758 = null;
        }
        field1766++;
        return class127.field2813 != null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lbb;IILeb;)V", line = 196)
    public static final void method598(class9 arg0, int arg1, int arg2, class27 arg3) {
        field1771++;
        if (class67.field1461) {
            return;
        }
        class116 var4 = new class116();
        var4.field2512 = arg3.method231(255);
        var4.field2522 = arg3.method251((byte) 105);
        var4.field2527 = new byte[var4.field2512][][];
        var4.field2537 = new class98[var4.field2512];
        var4.field2535 = new int[var4.field2512];
        var4.field2526 = new int[var4.field2512];
        if (arg1 != 6364) {
            return;
        }
        var4.field2523 = new int[var4.field2512];
        var4.field2519 = new class98[var4.field2512];
        for (int var5 = 0; var5 < var4.field2512; var5++) {
            try {
                int var6 = arg3.method231(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method244((byte) 127).method659(false));
                    int var8 = 0;
                    String var9 = new String(arg3.method244((byte) 127).method659(false));
                    if (var6 == 1) {
                        var8 = arg3.method251((byte) 105);
                    }
                    var4.field2526[var5] = var6;
                    var4.field2535[var5] = var8;
                    var4.field2537[var5] = arg0.method80((byte) 34, var9, class119.method928(29609, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method244((byte) 127).method659(false));
                    String var11 = new String(arg3.method244((byte) 127).method659(false));
                    int var12 = arg3.method231(arg1 - 6109);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method244((byte) 127).method659(false));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method251((byte) 105);
                            var15[var16] = new byte[var17];
                            arg3.method232(0, var17, var15[var16], -41);
                        }
                    }
                    var4.field2526[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class119.method928(29609, var13[var19]);
                    }
                    var4.field2519[var5] = arg0.method77(class119.method928(29609, var10), var11, var18, 9);
                    var4.field2527[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2523[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2523[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2523[var5] = -3;
            } catch (Exception var23) {
                var4.field2523[var5] = -4;
            } catch (Throwable var24) {
                var4.field2523[var5] = -5;
            }
        }
        class125.field2775.method692((byte) -98, var4);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 310)
    public static void method599(byte arg0) {
        field1755 = null;
        field1764 = null;
        field1770 = null;
        field1763 = null;
        field1758 = null;
        field1761 = null;
        if (arg0 == -35) {
            field1768 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLud;I)Z", line = 336)
    public static final boolean method600(byte arg0, class118 arg1, int arg2) {
        field1760++;
        byte[] var3 = arg1.method906(0, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg0 != -34) {
            field1763 = null;
        }
        class105.method779(0, var3);
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BII)Lo;", line = 354)
    public static final class84 method601(int arg0, byte[] arg1, int arg2, int arg3) {
        field1757++;
        class84 var4 = new class84();
        var4.field1906 = arg0;
        var4.field1869 = new byte[arg0];
        if (arg2 != 0) {
            method599((byte) 57);
        }
        class68.method518(arg1, arg3, var4.field1869, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V", line = 380)
    public static final void method602(int arg0, long arg1) {
        field1756++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 > -17) {
            return;
        }
        while (var3 < class27.field537) {
            if (class26.field442[var3] == arg1) {
                class27.field537--;
                class39.field798 = true;
                class88.field1986++;
                for (int var4 = var3; var4 < class27.field537; var4++) {
                    class60.field1256[var4] = class60.field1256[var4 + 1];
                    class74.field1547[var4] = class74.field1547[var4 + 1];
                    class26.field442[var4] = class26.field442[var4 + 1];
                }
                class97.field2070.method979(1, 30);
                class97.field2070.method203(-24628, arg1);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 429)
    public class82(int arg0, int arg1, int arg2) {
        this.field1785 = this.field1787 = arg0;
        this.field1793 = arg2;
        this.field1778 = arg1;
    }
}
