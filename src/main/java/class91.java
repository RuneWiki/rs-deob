import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class91 {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private int field1624 = 128;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field1626 = 0;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    private int field1633 = 128;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    private int field1632 = 0;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Z")
    public boolean field1639 = false;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public int field1647 = -1;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    private int field1649 = 0;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field1640 = 50;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
    public static int[] field1619 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[I")
    public static int[] field1627 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lcd;")
    public static class64[] field1618 = new class64[field1640];

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "[Lwf;")
    public static class54[] field1637 = new class54[4];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    public static int[] field1622 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lcd;")
    private static class64 field1644 = class44.method335((byte) 71, "Loading config )2 ");

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "[I")
    public static int[] field1645 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
    public static int[] field1631 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lcd;")
    public static class64 field1642 = class44.method335((byte) 71, "::serverjs5drop");

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lcd;")
    public static class64 field1636 = field1644;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
    public static int[] field1646 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "[I")
    public static int[] field1648 = new int[field1640];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[S")
    private short[] field1621;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[S")
    private short[] field1634;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[S")
    private short[] field1638;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[S")
    private short[] field1641;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILkh;I)V", line = 14)
    private final void method684(int arg0, class13 arg1, int arg2) {
        if (arg2 <= 57) {
            return;
        }
        if (arg0 == 1) {
            this.field1630 = arg1.method112((byte) 92);
        } else if (arg0 == 2) {
            this.field1647 = arg1.method112((byte) 92);
        } else if (arg0 == 4) {
            this.field1633 = arg1.method112((byte) 92);
        } else if (arg0 == 5) {
            this.field1624 = arg1.method112((byte) 92);
        } else if (arg0 == 6) {
            this.field1632 = arg1.method112((byte) 92);
        } else if (arg0 == 7) {
            this.field1649 = arg1.method152((byte) -123);
        } else if (arg0 == 8) {
            this.field1626 = arg1.method152((byte) -70);
        } else if (arg0 == 9) {
            this.field1639 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method152((byte) -127);
            this.field1641 = new short[var6];
            this.field1634 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1634[var7] = (short) arg1.method112((byte) 92);
                this.field1641[var7] = (short) arg1.method112((byte) 92);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method152((byte) -91);
            this.field1638 = new short[var4];
            this.field1621 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1638[var5] = (short) arg1.method112((byte) 92);
                this.field1621[var5] = (short) arg1.method112((byte) 92);
            }
        }
        field1635++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lam;", line = 100)
    public final class243 method685(int arg0, int arg1) {
        field1625++;
        class243 var3 = (class243) class27.field435.method1194((long) this.field1623, (byte) -79);
        if (var3 == null) {
            class150 var4 = class150.method1090(class297.field5120, this.field1630, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1634 != null) {
                for (int var5 = 0; var5 < this.field1634.length; var5++) {
                    var4.method1087(this.field1634[var5], this.field1641[var5]);
                }
            }
            if (this.field1638 != null) {
                for (int var6 = 0; var6 < this.field1638.length; var6++) {
                    var4.method1068(this.field1638[var6], this.field1621[var6]);
                }
            }
            var3 = var4.method1076(this.field1649 + 64, this.field1626 + 850, -30, -50, -30);
            class27.field435.method1190(arg1 ^ 0xFFFFCE82, var3, (long) this.field1623);
        }
        class243 var7;
        if (this.field1647 == arg1 || arg0 == -1) {
            var7 = var3.method24(true, true);
        } else {
            var7 = class281.method1944(this.field1647, arg1 + 1).method1392(var3, arg0, 77);
        }
        if (this.field1633 != 128 || this.field1624 != 128) {
            var7.method23(this.field1633, this.field1624, this.field1633);
        }
        if (this.field1632 != 0) {
            if (this.field1632 == 90) {
                var7.method31();
            }
            if (this.field1632 == 180) {
                var7.method45();
            }
            if (this.field1632 == 270) {
                var7.method21();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lkh;B)V", line = 177)
    public final void method686(class13 arg0, byte arg1) {
        if (arg1 > -102) {
            this.method686((class13) null, (byte) -101);
        }
        field1643++;
        while (true) {
            int var3 = arg0.method152((byte) -102);
            if (var3 == 0) {
                return;
            }
            this.method684(var3, arg0, 62);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILqi;III)V", line = 218)
    public static final void method687(int arg0, class290 arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -126) {
            method690(123);
        }
        field1628++;
        for (class246 var5 = (class246) class93.field1733.method778(0); var5 != null; var5 = (class246) class93.field1733.method775(26517)) {
            if (var5.field4271 == arg2 && arg3 * 128 == var5.field4285 && arg4 * 128 == var5.field4266 && var5.field4275.field4962 == arg1.field4962) {
                if (var5.field4283 != null) {
                    class250.field4341.method1419(var5.field4283);
                    var5.field4283 = null;
                }
                if (var5.field4270 != null) {
                    class250.field4341.method1419(var5.field4270);
                    var5.field4270 = null;
                }
                var5.method232(128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILwj;)V", line = 264)
    public static final void method688(int arg0, class207 arg1) {
        arg1.field3520 = false;
        if (arg0 != 0) {
            return;
        }
        if (arg1.field3521 != null) {
            arg1.field3521.field1786 = 0;
        }
        for (class207 var2 = arg1.method477(); var2 != null; var2 = arg1.method480()) {
            method688(0, var2);
        }
        field1617++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLsa;)V", line = 289)
    public static final void method689(byte arg0, class103 arg1) {
        field1620++;
        if (arg1.field1887 == 0) {
            return;
        }
        if (arg1.field1912 != -1 && arg1.field1912 < 32768) {
            class232 var2 = class2.field12[arg1.field1912];
            if (var2 != null) {
                int var3 = arg1.field1859 - var2.field1859;
                int var4 = arg1.field1865 - var2.field1865;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1889 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1912 >= 32768) {
            int var5 = arg1.field1912 - 32768;
            if (class149.field2632 == var5) {
                var5 = 2047;
            }
            class41 var6 = class284.field4888[var5];
            if (var6 != null) {
                int var7 = arg1.field1865 - var6.field1865;
                int var8 = arg1.field1859 - var6.field1859;
                if (var8 != 0 || var7 != 0) {
                    arg1.field1889 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 != 57) {
            return;
        }
        if ((arg1.field1853 != 0 || arg1.field1867 != 0) && (arg1.field1862 == 0 || arg1.field1890 > 0)) {
            int var9 = arg1.field1859 + (arg1.method325(-12808) - 1) * 64 - ((-class190.field3269 + -class190.field3269 + arg1.field1853) * 64);
            int var10 = arg1.field1865 + (arg1.method325(arg0 ^ -12863) - 1) * 64 - ((-class121.field2184 + arg1.field1867 + -class121.field2184) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field1889 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1867 = 0;
            arg1.field1853 = 0;
        }
        int var11 = arg1.field1889 - arg1.field1863 & 0x7FF;
        if (var11 == 0) {
            arg1.field1857 = 0;
            return;
        }
        arg1.field1857++;
        if (var11 <= 1024) {
            arg1.field1863 += arg1.field1887;
            boolean var12 = true;
            if (arg1.field1887 > var11 || 2048 - arg1.field1887 < var11) {
                var12 = false;
                arg1.field1863 = arg1.field1889;
            }
            if (arg1.field1901 == arg1.field1896 && (arg1.field1857 > 25 || var12)) {
                if (arg1.field1854 == -1) {
                    arg1.field1896 = arg1.field1873;
                } else {
                    arg1.field1896 = arg1.field1854;
                }
            }
        } else {
            arg1.field1863 -= arg1.field1887;
            boolean var13 = true;
            if (arg1.field1887 > var11 || 2048 - arg1.field1887 < var11) {
                arg1.field1863 = arg1.field1889;
                var13 = false;
            }
            if (arg1.field1901 == arg1.field1896 && (arg1.field1857 > 25 || var13)) {
                if (arg1.field1856 == -1) {
                    arg1.field1896 = arg1.field1873;
                } else {
                    arg1.field1896 = arg1.field1856;
                }
            }
        }
        arg1.field1863 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 413)
    public static void method690(int arg0) {
        field1622 = null;
        field1636 = null;
        field1637 = null;
        field1644 = null;
        field1631 = null;
        field1618 = null;
        field1646 = null;
        field1619 = null;
        field1645 = null;
        field1642 = null;
        field1627 = null;
        if (arg0 != 0) {
            field1619 = (int[]) null;
        }
        field1648 = null;
    }
}
