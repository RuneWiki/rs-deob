import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class144 extends class418 {

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field1836 = 0;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field1835 = -1;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
    public static int[] field1841 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lte;")
    public static class357 field1827 = new class357(128);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lni;")
    public static class279 field1844 = new class279(5000);

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1848 = "Loading config - ";

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lqc;")
    public class163 field1820;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lqr;")
    public class212 field1838;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lkk;")
    public class260 field1822;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lkk;")
    public class260 field1840;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Lkg;")
    public class317 field1830;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
    public boolean field1821;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    public int[] field1833;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[[Lso;")
    public static class238[][] field1829;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public final void method994(int arg0) {
        if (arg0 != 4860) {
            method997(-98);
        }
        field1819++;
        int var2 = this.field1825;
        if (this.field1838 != null) {
            class212 var5 = this.field1838.method1387((byte) -53);
            if (var5 == null) {
                this.field1833 = null;
                this.field1843 = 0;
                this.field1832 = 0;
                this.field1826 = 0;
                this.field1825 = -1;
                this.field1842 = 0;
            } else {
                this.field1833 = var5.field2948;
                this.field1843 = var5.field2955 * 128;
                this.field1842 = var5.field2971;
                this.field1825 = var5.field2914;
                this.field1832 = var5.field2961;
                this.field1826 = var5.field2920;
            }
        } else if (this.field1820 != null) {
            int var3 = class7.method37(this.field1820, 47);
            if (var2 != var3) {
                this.field1825 = var3;
                class189 var4 = this.field1820.field2206;
                if (var4.field2575 != null) {
                    var4 = var4.method1253(-1);
                }
                if (var4 == null) {
                    this.field1826 = this.field1843 = 0;
                } else {
                    this.field1826 = var4.field2577;
                    this.field1843 = var4.field2641 * 128;
                }
            }
        } else if (this.field1830 != null) {
            this.field1825 = class248.method1616(this.field1830, (byte) -95);
            this.field1843 = this.field1830.field4660 * 128;
            this.field1826 = this.field1830.field4672;
        }
        if (this.field1825 != var2 && this.field1840 != null) {
            class40.field602.method249(this.field1840);
            this.field1840 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILsj;IIIII)V")
    public static final void method995(int arg0, int arg1, class248 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 0) {
            return;
        }
        field1831++;
        if (arg2.field3555 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg2.field3661; var11++) {
                for (int var12 = 0; var12 < arg2.field3567; var12++) {
                    int var13 = (arg2.field3519 + 32) * var12 + arg6;
                    int var14 = arg7 + ((arg2.field3664 + 32) * var11);
                    if (var10 < 20) {
                        var13 += arg2.field3612[var10];
                        var14 += arg2.field3645[var10];
                    }
                    if (arg2.field3651[var10] > 0 && (arg1 < var13 + 32 && arg0 > var13 && (var14 + 32) > arg3 && var14 < arg4 || class346.field5156 == arg2 && class295.field4457 == var10)) {
                        if (var9 < var10) {
                            var9 = var10;
                        }
                        if (var10 < var8) {
                            var8 = var10;
                        }
                    }
                    var10++;
                }
            }
            class40.method296(class126.field1647, (byte) -118, var9, arg2, var8);
        } else if (arg2.field3555 == 5 && arg2.field3494 != -1) {
            class212.method1401(class126.field1647, arg5, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static final void method996(int arg0) {
        field1834++;
        class388.field5678 = 0;
        class421.field6124 = 0;
        class211.method1379(false);
        class60.method532(false);
        class204.method1353(false);
        for (int var1 = 0; var1 < class388.field5678; var1++) {
            int var3 = class3.field41[var1];
            if (class231.field3179 != class388.field5670[var3].field2154) {
                if (class388.field5670[var3].field2206.method1252(111)) {
                    class322.method2120(class388.field5670[var3], (byte) -108);
                }
                class388.field5670[var3].method1106((class189) null, (byte) -125);
                class388.field5670[var3] = null;
            }
        }
        if (class20.field342 != class27.field471.field5049) {
            throw new RuntimeException("gnp1 pos:" + class27.field471.field5049 + " psize:" + class20.field342);
        }
        for (int var2 = arg0; var2 < class93.field1274; var2++) {
            if (class388.field5670[class62.field943[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class93.field1274);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public static void method997(int arg0) {
        field1841 = null;
        field1848 = null;
        field1827 = null;
        field1844 = null;
        field1829 = null;
        int var1 = -94 % ((55 - arg0) / 52);
    }
}
