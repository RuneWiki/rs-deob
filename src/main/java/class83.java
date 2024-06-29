import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Laa;")
    public static class2 field1840 = new class2();

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lfc;")
    public static class39 field1842 = class90.method774("Benutzeroberfl-=che geladen)3", -101);

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lfc;")
    private static class39 field1851 = class90.method774("green:", -105);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lfc;")
    public static class39 field1845 = field1851;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lfc;")
    public static class39 field1848 = field1851;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ltc;")
    public static class133 field1850;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Llf;")
    public static class82 field1843;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Llf;")
    public static class82 field1847;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lmf;")
    public static class89 field1844;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
    public static int[] field1846;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 4)
    public static final void method694(int arg0, int arg1) {
        field1838++;
        class1.field2 = arg0;
        if (arg1 != 23440) {
            return;
        }
        class139.field3513 = false;
        class61.field1497 = null;
        class150.field3711 = 0;
        class142.field3562 = -1;
        class75.field1723 = -1;
        class101.field2547 = 1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 44)
    public static void method695(int arg0) {
        field1840 = null;
        field1843 = null;
        field1842 = null;
        field1847 = null;
        field1851 = null;
        field1846 = null;
        if (arg0 == 6557) {
            field1844 = null;
            field1850 = null;
            field1845 = null;
            field1848 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method696(boolean arg0) {
        field1837++;
        try {
            if (class71.field1670 == null) {
                class71.field1670 = new class3(field1850, class137.method1111(new class39[] { class142.field3588, class107.field2684, class42.field1148 }, (byte) -33).method441(12340));
            } else {
                byte[] var1 = class71.field1670.method26(false);
                if (var1 != null) {
                    class25 var2 = new class25(var1);
                    class79.field1804 = var2.method301(-4853);
                    class142.field3560 = new class13[class79.field1804];
                    for (int var3 = 0; var3 < class79.field1804; var3++) {
                        class13 var4 = class142.field3560[var3] = new class13();
                        int var5 = var2.method301(-4853);
                        var4.field336 = var5 & 0x7FFF;
                        var4.field335 = (var5 & 0x8000) != 0;
                        var4.field337 = var2.method304(-128);
                        var4.field333 = var2.method318(121);
                        var4.field334 = var3;
                        var4.field329 = class140.method1149(var4.field337, (byte) -69);
                    }
                    class97.method814(class61.field1492, class115.field3011, 0, class142.field3560.length - 1, true, class142.field3560);
                    class108.field2718 = true;
                    class71.field1670 = null;
                }
            }
            if (!arg0) {
                method695(80);
            }
        } catch (Exception var6) {
            class71.field1670 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I", line = 121)
    public static int method697(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
