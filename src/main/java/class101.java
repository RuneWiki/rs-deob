import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class101 extends class167 {

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1846 = -1;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lkh;")
    private static class117 field1844 = class224.method1450((byte) 124, "To create a new account you need to");

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "Z")
    public static boolean field1851 = false;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1843 = -1;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lkh;")
    public static class117 field1850 = field1844;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    private int field1838;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    private int field1852;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
    private class101(int arg0) {
        super(0, false);
        this.method685(false, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class101() {
        this(0);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field1850 = null;
        field1844 = null;
        if (arg0 < 23) {
            method682(-113, (class73) null, false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)Lnb;")
    public static final class144 method681(byte arg0) {
        ++field1854;
        int var1 = class204.field3690[0] * class11.field376[0];
        int[] var2 = new int[var1];
        byte[] var3 = class105.field1921[0];
        if (arg0 != 3) {
            method683((class117) null, 75, (class10) null, (class117) null);
        }
        for (int var4 = 0; var4 < var1; ++var4) {
            var2[var4] = class122.field2287[class209.method1370(var3[var4], 255)];
        }
        class144 var5 = new class144(class106.field1934, class199.field3582, class100.field1827[0], class106.field1927[0], class204.field3690[0], class11.field376[0], var2);
        class45.method376(5851);
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILgg;Z)V")
    public static final void method682(int arg0, class73 arg1, boolean arg2) {
        ++field1842;
        int var3 = (int) arg1.field389;
        if (arg0 != 28079) {
            method681((byte) -35);
        }
        int var4 = arg1.field1397;
        arg1.method123((byte) -126);
        if (arg2) {
            class204.method1353(var4, arg0 + -3218);
        }
        method684(var4, -78);
        class9 var5 = class119.method837((byte) 111, var3);
        if (var5 != null) {
            class62.method457(var5, 0);
        }
        class182.field3289 = false;
        class100.field1825 = 0;
        class214.method1407(class32.field761, class111.field2092, 18320, class120.field2266, class98.field1809);
        if (class92.field1697 != -1) {
            class158.method1122(class92.field1697, 0, 1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field1840;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; class115.field2146 > var7; ++var7) {
                var5[var7] = this.field1852;
                var4[var7] = this.field1838;
                var6[var7] = this.field1849;
            }
        }
        if (arg1 != -9179) {
            this.field1849 = 121;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lkh;ILai;Lkh;)Lnb;")
    public static final class144 method683(class117 arg0, int arg1, class10 arg2, class117 arg3) {
        ++field1845;
        if (arg1 != -1595137716) {
            field1839 = 50;
        }
        int var4 = arg2.method84(arg0, arg1 + 1595139207);
        int var5 = arg2.method102(false, arg3, var4);
        return class224.method1453(100, var5, var4, arg2);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1837;
        if (~arg2 == -1) {
            this.method685(false, arg0.method1023(-1002744));
        }
        if (arg1) {
            method686(-110, -54, 33);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    private static final void method684(int arg0, int arg1) {
        class123 var2 = (class123) class184.field3306.method456((byte) 127);
        if (arg1 <= -3) {
            while (var2 != null) {
                if (~((long) arg0) == ~(var2.field389 >> 48 & 65535L)) {
                    var2.method123((byte) -126);
                }
                var2 = (class123) class184.field3306.method459((byte) -87);
            }
            ++field1853;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    private final void method685(boolean arg0, int arg1) {
        this.field1852 = (arg1 & 16711680) >> 12;
        ++field1847;
        if (!arg0) {
            this.field1838 = 4080 & arg1 >> 4;
            this.field1849 = 4080 & arg1 << 4;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)Lah;")
    public static final class9 method686(int arg0, int arg1, int arg2) {
        ++field1841;
        if (arg0 < 122) {
            method682(-30, (class73) null, true);
        }
        class9 var3 = class119.method837((byte) 101, arg1);
        if (~arg2 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field157 != null && ~arg2 > ~var3.field157.length ? var3.field157[arg2] : null;
        }
    }
}
