import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class86 extends class92 {

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "Z")
    private boolean field1832 = false;

    @OriginalMember(owner = "client!je", name = "qb", descriptor = "I")
    private int field1835 = 0;

    @OriginalMember(owner = "client!je", name = "Hb", descriptor = "I")
    private int field1852 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
    private int field1843;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!je", name = "Gb", descriptor = "I")
    private int field1851;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!je", name = "xb", descriptor = "I")
    private int field1842;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!je", name = "Bb", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "Lca;")
    private class22 field1821;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "Lgf;")
    public static class61 field1830 = null;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "Leh;")
    public static class47 field1824 = class195.method1282((byte) -4, "Hier wechseln");

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "Leh;")
    public static class47 field1820 = class195.method1282((byte) -4, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!je", name = "W", descriptor = "[S")
    public static short[] field1815 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!je", name = "Eb", descriptor = "Z")
    public static boolean field1849 = false;

    @OriginalMember(owner = "client!je", name = "Ab", descriptor = "Leh;")
    public static class47 field1845 = class195.method1282((byte) -4, "leuchten3:");

    @OriginalMember(owner = "client!je", name = "Ib", descriptor = "Leh;")
    private static class47 field1853 = class195.method1282((byte) -4, "M");

    @OriginalMember(owner = "client!je", name = "rb", descriptor = "Leh;")
    public static class47 field1836 = field1853;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Leh;")
    public static class47 field1817 = field1853;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "D")
    public double field1814;

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "D")
    public double field1827;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "D")
    private double field1828;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "D")
    private double field1833;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "D")
    private double field1834;

    @OriginalMember(owner = "client!je", name = "tb", descriptor = "D")
    private double field1838;

    @OriginalMember(owner = "client!je", name = "ub", descriptor = "D")
    public double field1839;

    @OriginalMember(owner = "client!je", name = "zb", descriptor = "D")
    private double field1844;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!je", name = "sb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!je", name = "Fb", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!je", name = "Db", descriptor = "Lah;")
    public static class9 field1848;

    @OriginalMember(owner = "client!je", name = "wb", descriptor = "Z")
    public static boolean field1841;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "[Lfb;")
    public static class50[] field1831;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method704(byte arg0) {
        for (class63 var1 = (class63) class138.field2710.method1344(false); var1 != null; var1 = (class63) class138.field2710.method1340(false)) {
            int var3 = var1.field1349;
            if (class57.method493(var3, 2093369712)) {
                boolean var4 = true;
                class61[] var5 = class51.field986[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1313;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field2283;
                    class61 var8 = class23.method224(var7, 484111152);
                    if (var8 != null) {
                        class20.method204(var8, (byte) -5);
                    }
                }
            }
        }
        field1825++;
        int var2 = 76 / ((arg0 - 39) / 44);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method705(byte arg0) {
        field1836 = null;
        field1817 = null;
        field1815 = null;
        field1824 = null;
        field1848 = null;
        field1831 = null;
        field1820 = null;
        field1845 = null;
        field1830 = null;
        field1853 = null;
        if (arg0 != 105) {
            method705((byte) 40);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public final void method706(int arg0, int arg1) {
        this.field1827 += (double) arg1 * this.field1844;
        this.field1839 += this.field1838 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1834;
        this.field1832 = true;
        field1837++;
        if (arg0 != 0) {
            return;
        }
        this.field1834 += (double) arg1 * this.field1838;
        this.field1814 += (double) arg1 * this.field1833;
        this.field1847 = (int) (Math.atan2(this.field1844, this.field1833) * 325.949D) + 1024 & 0x7FF;
        this.field1816 = (int) (Math.atan2(this.field1834, this.field1828) * 325.949D) & 0x7FF;
        if (this.field1821 == null) {
            return;
        }
        this.field1852 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1821.field419[this.field1835] >= this.field1852) {
                        return;
                    }
                    this.field1852 -= this.field1821.field419[this.field1835];
                    this.field1835++;
                } while (this.field1835 < this.field1821.field430.length);
                this.field1835 -= this.field1821.field416;
            } while (this.field1835 >= 0 && this.field1821.field430.length > this.field1835);
            this.field1835 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIII)V")
    public final void method707(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1850++;
        if (!this.field1832) {
            double var6 = (double) (arg2 - this.field1813);
            double var8 = (double) (arg4 - this.field1826);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1814 = (double) this.field1842 * var6 / var10 + (double) this.field1813;
            this.field1827 = (double) this.field1842 * var8 / var10 + (double) this.field1826;
            this.field1839 = this.field1851;
        }
        double var12 = (double) (this.field1823 + 1 - arg3);
        this.field1833 = ((double) arg2 - this.field1814) / var12;
        this.field1844 = ((double) arg4 - this.field1827) / var12;
        this.field1828 = Math.sqrt(this.field1844 * this.field1844 + this.field1833 * this.field1833);
        if (!this.field1832) {
            this.field1834 = -this.field1828 * Math.tan((double) this.field1819 * 0.02454369D);
        }
        this.field1838 = ((double) arg0 - this.field1839 - this.field1834 * var12) * 2.0D / (var12 * var12);
        if (arg1 > -70) {
            this.field1828 = 0.9153740160566283D;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Ld;")
    public final class30 method708(int arg0) {
        field1818++;
        class21 var2 = class2.method8(this.field1843, -122);
        class30 var3 = var2.method212(this.field1835, (byte) -119);
        if (var3 == null) {
            return null;
        }
        if (arg0 != 21831) {
            this.method707(41, (byte) 31, -1, 119, 34);
        }
        var3.method271(this.field1816);
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1819 = arg7;
        this.field1843 = arg0;
        this.field1822 = arg9;
        this.field1840 = arg5;
        this.field1813 = arg3;
        this.field1851 = arg4;
        this.field1826 = arg2;
        this.field1829 = arg1;
        this.field1842 = arg8;
        this.field1823 = arg6;
        this.field1846 = arg10;
        this.field1832 = false;
        int var12 = class2.method8(this.field1843, -111).field390;
        if (var12 == -1) {
            this.field1821 = null;
        } else {
            this.field1821 = class25.method236(false, var12);
        }
    }
}
