import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class119 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    private int field1811 = 128;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    private int field1816 = 128;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    private int field1814 = 0;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field1826 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Z")
    public boolean field1825 = false;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Z")
    public boolean field1833 = false;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public int field1810 = -1;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lid;")
    public static class157 field1828 = new class157();

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Z")
    public static boolean field1836 = false;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1837 = new String[8];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lfa;")
    public static class273 field1835;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lkb;")
    public static class54 field1813;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[S")
    private short[] field1812;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[S")
    private short[] field1817;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[S")
    private short[] field1821;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "[S")
    private short[] field1823;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIII)Lrk;")
    public final class293 method774(byte arg0, int arg1, int arg2, int arg3) {
        class293 var5 = (class293) class175.field2733.method149((byte) -77, (long) this.field1820);
        field1827++;
        if (var5 == null) {
            class228 var6 = class228.method1590(class247.field3937, this.field1829, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1821 != null) {
                for (int var7 = 0; var7 < this.field1821.length; var7++) {
                    var6.method1611(this.field1821[var7], this.field1817[var7]);
                }
            }
            if (this.field1823 != null) {
                for (int var8 = 0; var8 < this.field1823.length; var8++) {
                    var6.method1607(this.field1823[var8], this.field1812[var8]);
                }
            }
            var5 = var6.method1594(this.field1826 + 64, this.field1819 + 850, -30, -50, -30);
            class175.field2733.method152(var5, (long) this.field1820, true);
        }
        if (arg0 <= 45) {
            method775((byte) -3, -62);
        }
        class293 var9;
        if (this.field1810 == -1 || arg3 == -1) {
            var9 = var5.method1295(true, true, true);
        } else {
            var9 = class196.method1359(this.field1810, (byte) 21).method1382((byte) -120, arg2, var5, arg3, arg1);
        }
        if (this.field1816 != 128 || this.field1811 != 128) {
            var9.method1302(this.field1816, this.field1811, this.field1816);
        }
        if (this.field1814 != 0) {
            if (this.field1814 == 90) {
                var9.method1296();
            }
            if (this.field1814 == 180) {
                var9.method1294();
            }
            if (this.field1814 == 270) {
                var9.method1303();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
    public static final int method775(byte arg0, int arg1) {
        int var2 = -54 % ((-arg0 - 29) / 38);
        field1838++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
    public static final int method776(int arg0, byte arg1) {
        field1831++;
        if (arg1 <= 14) {
            field1834 = -81;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method777(int arg0) {
        field1837 = null;
        if (arg0 >= 76) {
            field1828 = null;
            field1835 = null;
            field1813 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method778(int arg0) {
        if (arg0 != -5490) {
            method780(-12, -21, 100, -107, -67, (byte) 86);
        }
        field1832++;
        class283.field4741 = new class254[class224.field3561.method1892((byte) -107)][];
        class210.field3373 = new boolean[class224.field3561.method1892((byte) -95)];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lma;B)V")
    public final void method779(class202 arg0, byte arg1) {
        field1818++;
        int var3 = -104 % ((arg1 - 8) / 57);
        while (true) {
            int var4 = arg0.method1420((byte) 0);
            if (var4 == 0) {
                return;
            }
            this.method781((byte) -112, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIB)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1815++;
        int var6 = arg3 - arg4;
        if (arg5 != 48) {
            field1813 = null;
        }
        int var7 = arg1 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class47.method297(arg2, arg1, arg0, (byte) -107, arg4);
            }
        } else if (var7 == 0) {
            class226.method1571(arg3, (byte) 64, arg0, arg4, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class53.field711 > arg4) {
                var10 = class53.field711;
                var11 = (class53.field711 * var8 >> 12) + var9;
            } else if (class87.field1356 >= arg4) {
                var10 = arg4;
                var11 = arg0;
            } else {
                var10 = class87.field1356;
                var11 = (class87.field1356 * var8 >> 12) + var9;
            }
            if (class63.field941 > var11) {
                var11 = class63.field941;
                var10 = (class63.field941 - var9 << 12) / var8;
            } else if (class75.field1180 < var11) {
                var10 = (class75.field1180 - var9 << 12) / var8;
                var11 = class75.field1180;
            }
            int var12;
            int var13;
            if (arg3 < class53.field711) {
                var12 = class53.field711;
                var13 = (class53.field711 * var8 >> 12) + var9;
            } else if (arg3 > class87.field1356) {
                var13 = (class87.field1356 * var8 >> 12) + var9;
                var12 = class87.field1356;
            } else {
                var12 = arg3;
                var13 = arg1;
            }
            if (class63.field941 > var13) {
                var12 = (class63.field941 - var9 << 12) / var8;
                var13 = class63.field941;
            } else if (class75.field1180 < var13) {
                var13 = class75.field1180;
                var12 = (class75.field1180 - var9 << 12) / var8;
            }
            class263.method1820(var11, 1, var12, var13, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILma;)V")
    private final void method781(byte arg0, int arg1, class202 arg2) {
        if (arg0 != -112) {
            this.field1814 = -81;
        }
        if (arg1 == 1) {
            this.field1829 = arg2.method1419(102);
        } else if (arg1 == 2) {
            this.field1810 = arg2.method1419(82);
        } else if (arg1 == 4) {
            this.field1816 = arg2.method1419(117);
        } else if (arg1 == 5) {
            this.field1811 = arg2.method1419(121);
        } else if (arg1 == 6) {
            this.field1814 = arg2.method1419(117);
        } else if (arg1 == 7) {
            this.field1826 = arg2.method1420((byte) 0);
        } else if (arg1 == 8) {
            this.field1819 = arg2.method1420((byte) 0);
        } else if (arg1 == 9) {
            this.field1825 = true;
        } else if (arg1 == 10) {
            this.field1833 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method1420((byte) 0);
            this.field1821 = new short[var6];
            this.field1817 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1821[var7] = (short) arg2.method1419(66);
                this.field1817[var7] = (short) arg2.method1419(99);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method1420((byte) 0);
            this.field1823 = new short[var4];
            this.field1812 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1823[var5] = (short) arg2.method1419(90);
                this.field1812[var5] = (short) arg2.method1419(arg0 + 207);
            }
        }
        field1824++;
    }
}
