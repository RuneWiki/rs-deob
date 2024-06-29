import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class53 {

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!ke", name = "vb", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!ke", name = "wb", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "Luc;")
    private class142 field1820;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
    private int field1828;

    @OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!ke", name = "tb", descriptor = "Lhe;")
    public static class54 field1822 = class6.method58("<col=ff0000>", false);

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lhe;")
    public static class54 field1832 = class6.method58("Null", false);

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!ke", name = "xb", descriptor = "[S")
    public static short[] field1826 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ke", name = "yb", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ke", name = "Hb", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ke", name = "Cb", descriptor = "Ltd;")
    public static class136 field1831;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        if (this.field1820 != null) {
            int var2 = class4.field138 - this.field1819;
            if (var2 > 100 && this.field1820.field3249 > 0) {
                var2 = 100;
            }
            label47: {
                do {
                    do {
                        if (var2 <= this.field1820.field3247[this.field1828]) {
                            break label47;
                        }
                        var2 -= this.field1820.field3247[this.field1828];
                        this.field1828++;
                    } while (this.field1828 < this.field1820.field3258.length);
                    this.field1828 -= this.field1820.field3249;
                } while (this.field1828 >= 0 && this.field1820.field3258.length > this.field1828);
                this.field1820 = null;
            }
            this.field1819 = class4.field138 - var2;
        }
        field1834++;
        if (arg0) {
            this.field1821 = -127;
        }
        class3 var3 = class4.method34(!arg0, this.field1824);
        if (var3.field74 != null) {
            var3 = var3.method14(-63);
        }
        return var3 == null ? null : var3.method23(this.field1820, this.field1830, (byte) -77, this.field1828, this.field1818, this.field1825, this.field1833, this.field1821, this.field1829);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method572(int arg0) {
        if (arg0 != 3052) {
            method573(null, false);
        }
        field1831 = null;
        field1832 = null;
        field1826 = null;
        field1822 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lfb;Z)V")
    public static final void method573(class38 arg0, boolean arg1) {
        if (arg0.field949 == 0) {
            arg0.field921 = 1024;
        }
        int var2 = arg0.field983 * 128 + arg0.field948 * 64;
        if (arg0.field949 == 1) {
            arg0.field921 = 1536;
        }
        int var3 = arg0.field944 * 128 + arg0.field948 * 64;
        int var4 = arg0.field928 - class4.field138;
        if (arg0.field949 == 2) {
            arg0.field921 = 0;
        }
        field1836++;
        arg0.field970 = 0;
        arg0.field974 += (var3 - arg0.field974) / var4;
        if (!arg1) {
            if (arg0.field949 == 3) {
                arg0.field921 = 512;
            }
            arg0.field971 += (var2 - arg0.field971) / var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    public static final void method574(int arg0, boolean arg1) {
        if (arg0 < 89) {
            field1832 = null;
        }
        field1827++;
        int var2 = field1823;
        if (class108.field2639.field974 >> 7 == class1.field15 && class108.field2639.field971 >> 7 == class134.field3035) {
            class1.field15 = 0;
        }
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class22 var4;
            int var5;
            if (arg1) {
                var5 = 33538048;
                var4 = class108.field2639;
            } else {
                var4 = class48.field1148[class141.field3227[var3]];
                var5 = class141.field3227[var3] << 14;
            }
            if (var4 != null && var4.method183(-19456)) {
                var4.field627 = false;
                int var6 = var4.field974 >> 7;
                if ((class118.field2768 && field1823 > 50 || field1823 > 200) && !arg1 && var4.field969 == var4.field961) {
                    var4.field627 = true;
                }
                int var7 = var4.field971 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field629 == null || var4.field641 > class4.field138 || class4.field138 >= var4.field634) {
                        if ((var4.field974 & 0x7F) == 64 && (var4.field971 & 0x7F) == 64) {
                            if (class150.field3397[var6][var7] == class80.field1951) {
                                continue;
                            }
                            class150.field3397[var6][var7] = class80.field1951;
                        }
                        var4.field637 = class134.method1007(var4.field974, var4.field971, true, class157.field3573);
                        field1831.method1049(class157.field3573, var4.field974, var4.field971, var4.field637, 60, var4, var4.field923, var5, var4.field994);
                    } else {
                        var4.field627 = false;
                        var4.field637 = class134.method1007(var4.field974, var4.field971, true, class157.field3573);
                        field1831.method1017(class157.field3573, var4.field974, var4.field971, var4.field637, 60, var4, var4.field923, var5, var4.field644, var4.field638, var4.field645, var4.field624);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIZLhd;)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class53 arg9) {
        this.field1818 = arg4;
        this.field1833 = arg5;
        this.field1830 = arg6;
        this.field1824 = arg0;
        this.field1829 = arg2;
        this.field1821 = arg1;
        this.field1825 = arg3;
        if (arg7 != -1) {
            this.field1820 = class135.method1010(arg7, (byte) -111);
            this.field1819 = class4.field138 - 1;
            this.field1828 = 0;
            if (this.field1820.field3238 == 0 && arg9 != null && arg9 instanceof class74) {
                class74 var11 = (class74) arg9;
                if (this.field1820 == var11.field1820) {
                    this.field1819 = var11.field1819;
                    this.field1828 = var11.field1828;
                    return;
                }
            }
            if (arg8 && this.field1820.field3249 != -1) {
                this.field1828 = (int) ((double) this.field1820.field3258.length * Math.random());
                this.field1819 -= (int) (Math.random() * (double) this.field1820.field3247[this.field1828]);
                return;
            }
        }
    }
}
