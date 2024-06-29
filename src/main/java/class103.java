import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class103 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lvf;")
    public static class265 field1829 = class87.method582(-46, "p12_full");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Lvf;")
    private static class265 field1834 = class87.method582(-46, "Choose Option");

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lvf;")
    public static class265 field1833 = field1834;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lvf;")
    private static class265 field1839 = class87.method582(-46, "Loading world list data");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lvf;")
    public static class265 field1831 = field1839;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lfl;")
    public static class192 field1838;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field1826;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)[Loe;")
    public static final class108[] method688(boolean arg0) {
        field1832++;
        class108[] var1 = new class108[class43.field958];
        int var2 = 0;
        if (!arg0) {
            field1833 = null;
        }
        while (var2 < class43.field958) {
            byte[] var3 = class6.field230[var2];
            int var4 = class6.field127[var2] * class190.field3417[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class268.field4715[class203.method1395(255, var3[var6])];
            }
            var1[var2] = new class88(class203.field3643, class14.field429, class207.field3737[var2], class269.field4810[var2], class190.field3417[var2], class6.field127[var2], var5);
            var2++;
        }
        class261.method1739(26);
        return var1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z")
    public final boolean method689(int arg0) {
        field1837++;
        if (arg0 >= -123) {
            method691(-71L, 59);
        }
        return (this.field1835 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1829 = null;
        field1839 = null;
        field1831 = null;
        field1833 = null;
        field1826 = null;
        if (arg0 != -12560) {
            method690(-42);
        }
        field1834 = null;
        field1838 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JI)Lvf;")
    public static final class265 method691(long arg0, int arg1) {
        field1825++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else if (arg1 == 22723) {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class87.field1587[(int) (var8 - (arg0 * 37L))];
            }
            class265 var7 = new class265();
            var7.field4643 = var6;
            var7.field4640 = var6.length;
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Z")
    public final boolean method692(int arg0) {
        field1828++;
        int var2 = 61 / ((arg0 - 13) / 60);
        return (this.field1835 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method693(byte arg0) {
        field1827++;
        if (arg0 > -30) {
            this.field1835 = 45;
        }
        return (this.field1835 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Z")
    public final boolean method694(boolean arg0) {
        if (!arg0) {
            field1831 = null;
        }
        field1823++;
        return (this.field1835 & 0x2) != 0;
    }
}
