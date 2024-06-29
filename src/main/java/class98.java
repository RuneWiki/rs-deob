import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class98 extends class213 {

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "Z")
    public boolean field1828 = false;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    private int field1831 = 0;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    private int field1837 = 128;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    private int field1824 = 0;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public int field1827 = -1;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    private int field1840 = 128;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Lvd;")
    private static class222 field1833 = class212.method1357(" ", 10731);

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lvd;")
    public static class222 field1838 = class212.method1357("leuchten1:", 10731);

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lvd;")
    private static class222 field1845 = class212.method1357("Select", 10731);

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "Lvd;")
    public static class222 field1846 = class212.method1357("<col=ffffff>", 10731);

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "Lvd;")
    public static class222 field1843 = field1833;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "Lvd;")
    public static class222 field1851 = field1845;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "Lvd;")
    public static class222 field1847 = class212.method1357("Stufe)2", 10731);

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "Lcf;")
    public static class28 field1850 = new class28();

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    private int field1844;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lab;")
    public static class3 field1835;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "[Lva;")
    public static class219[] field1829;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[S")
    private short[] field1823;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "[S")
    private short[] field1825;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "[S")
    private short[] field1832;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "[S")
    private short[] field1841;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lee;")
    public final class49 method613(int arg0, int arg1) {
        field1826++;
        if (arg1 != 1067) {
            method615((byte) 7);
        }
        class49 var3 = (class49) class116.field2208.method1071((long) this.field1849, (byte) 122);
        if (var3 == null) {
            class148 var4 = class148.method939(class112.field2113, this.field1844, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1823 != null) {
                for (int var5 = 0; var5 < this.field1823.length; var5++) {
                    var4.method948(this.field1823[var5], this.field1832[var5]);
                }
            }
            if (this.field1841 != null) {
                for (int var6 = 0; var6 < this.field1841.length; var6++) {
                    var4.method952(this.field1841[var6], this.field1825[var6]);
                }
            }
            var3 = var4.method949(this.field1842 + 64, this.field1824 + 850, -30, -50, -30);
            class116.field2208.method1069(var3, (long) this.field1849, 31);
        }
        class49 var7;
        if (this.field1827 == -1 || arg0 == -1) {
            var7 = var3.method353(true);
        } else {
            var7 = class93.method599((byte) -101, this.field1827).method1147(var3, 1778103792, arg0);
        }
        if (this.field1840 != 128 || this.field1837 != 128) {
            var7.method348(this.field1840, this.field1837, this.field1840);
        }
        if (this.field1831 != 0) {
            if (this.field1831 == 90) {
                var7.method357();
            }
            if (this.field1831 == 180) {
                var7.method363();
            }
            if (this.field1831 == 270) {
                var7.method361();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static final void method614(int arg0) {
        if (arg0 < 4) {
            field1846 = null;
        }
        field1836++;
        class118.field2244 = new class28();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method615(byte arg0) {
        field1845 = null;
        field1847 = null;
        field1846 = null;
        field1850 = null;
        field1843 = null;
        field1833 = null;
        field1851 = null;
        field1829 = null;
        field1835 = null;
        field1838 = null;
        if (arg0 != -110) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
    public static final void method616(int arg0, byte arg1, int arg2) {
        if (class118.field2245 != arg0) {
            class230.field4319 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class230.field4319[var3] = (var3 << 12) / arg0;
            }
            class118.field2245 = arg0;
            field1853 = arg0 == 64 ? 2048 : 4096;
            class159.field3039 = arg0 - 1;
        }
        field1822++;
        if (class134.field2598 != arg2) {
            if (class118.field2245 == arg2) {
                class218.field4051 = class230.field4319;
            } else {
                class218.field4051 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class218.field4051[var4] = (var4 << 12) / arg2;
                }
            }
            class17.field433 = arg2 - 1;
            class134.field2598 = arg2;
        }
        if (arg1 >= -99) {
            field1829 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILka;)V")
    public final void method617(int arg0, class109 arg1) {
        while (true) {
            int var3 = arg1.method662((byte) -118);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field1837 = 72;
                }
                field1830++;
                return;
            }
            this.method618(arg1, -1, var3);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lka;II)V")
    private final void method618(class109 arg0, int arg1, int arg2) {
        field1848++;
        if (arg2 == 1) {
            this.field1844 = arg0.method675(2);
        } else if (arg2 == 2) {
            this.field1827 = arg0.method675(arg1 + 3);
        } else if (arg2 == 4) {
            this.field1840 = arg0.method675(2);
        } else if (arg2 == 5) {
            this.field1837 = arg0.method675(arg1 + 3);
        } else if (arg2 == 6) {
            this.field1831 = arg0.method675(2);
        } else if (arg2 == 7) {
            this.field1842 = arg0.method662((byte) -83);
        } else if (arg2 == 8) {
            this.field1824 = arg0.method662((byte) -100);
        } else if (arg2 == 9) {
            this.field1828 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method662((byte) -105);
            this.field1832 = new short[var6];
            this.field1823 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1823[var7] = (short) arg0.method675(arg1 + 3);
                this.field1832[var7] = (short) arg0.method675(2);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method662((byte) -84);
            this.field1825 = new short[var4];
            this.field1841 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1841[var5] = (short) arg0.method675(2);
                this.field1825[var5] = (short) arg0.method675(2);
            }
        }
        if (arg1 != -1) {
            field1829 = null;
        }
    }
}
