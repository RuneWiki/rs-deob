import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 extends class97 {

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lwd;")
    public static class150 field1875 = class2.method9(true, "sl_back");

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lwd;")
    public static class150 field1877 = class2.method9(true, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lwd;")
    public static class150 field1872 = class2.method9(true, ")1p");

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lwd;")
    public static class150 field1882 = class2.method9(true, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lwd;")
    private static class150 field1876 = class2.method9(true, "Error loading your profile)3");

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lwd;")
    public static class150 field1883 = field1876;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lwd;")
    public static class150 field1874 = class2.method9(true, "swe");

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "[I")
    public static int[] field1889 = new int[256];

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lwd;")
    public static class150 field1887 = class2.method9(true, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lwd;")
    public static class150 field1869 = class2.method9(true, "title)3jpg");

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Lwd;")
    public static class150 field1890 = class2.method9(true, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[Lwd;")
    public static class150[] field1865 = new class150[5];

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Lwd;")
    public static class150 field1888 = class2.method9(true, "(X");

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Lwd;")
    public static class150 field1893 = class2.method9(true, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lff;")
    public static class42 field1867;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1894;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    public int[] field1871;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    public int[] field1878;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "[I")
    public int[] field1891;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[Loc;")
    public class100[] field1880;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "[Loc;")
    public class100[] field1886;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[[[B")
    public byte[][][] field1881;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lr;")
    public static final class116 method564(Throwable arg0, String arg1) {
        field1884++;
        class116 var2;
        if (arg0 instanceof class116) {
            var2 = (class116) arg0;
            var2.field2666 = var2.field2666 + ' ' + arg1;
        } else {
            var2 = new class116(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V")
    public static final void method565(int arg0, long arg1) {
        field1866++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 65) {
            field1894 = null;
        }
        for (int var3 = 0; var3 < class50.field1347; var3++) {
            if (class3.field61[var3] == arg1) {
                class121.field2780++;
                class82.field1972 = true;
                class50.field1347--;
                for (int var4 = var3; var4 < class50.field1347; var4++) {
                    class146.field3537[var4] = class146.field3537[var4 + 1];
                    class30.field893[var4] = class30.field893[var4 + 1];
                    class3.field61[var4] = class3.field61[var4 + 1];
                    class141.field3392[var4] = class141.field3392[var4 + 1];
                }
                class128.field3024 = class11.field280 + 1;
                class143.field3451.method965(true, 161);
                class143.field3451.method1129(arg1, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILff;Lff;Z)V")
    public static final void method566(int arg0, class42 arg1, class42 arg2, boolean arg3) {
        class68.field1723 = arg3;
        class104.field2363 = arg2;
        field1868++;
        class145.field3520 = arg1;
        if (arg0 >= -63) {
            field1872 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method567(boolean arg0) {
        field1882 = null;
        field1872 = null;
        field1867 = null;
        field1865 = null;
        field1869 = null;
        field1877 = null;
        field1874 = null;
        if (!arg0) {
            method564(null, null);
        }
        field1888 = null;
        field1887 = null;
        field1890 = null;
        field1894 = null;
        field1876 = null;
        field1875 = null;
        field1893 = null;
        field1883 = null;
        field1889 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    public static final boolean method568(int arg0, int arg1) {
        field1873++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 != 27055) {
                field1883 = null;
            }
            return false;
        }
    }
}
