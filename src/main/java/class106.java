import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field1916 = -1;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Leb;")
    private static class230 field1914 = class68.method589(0, "Hidden");

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Leb;")
    public static class230 field1920 = class68.method589(0, "null");

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1924 = -1;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Leb;")
    public static class230 field1915 = field1914;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[I")
    public static int[] field1923 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Leb;")
    public static class230 field1921 = class68.method589(0, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1927 = -1;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[I")
    public static int[] field1926 = new int[100];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ls;")
    public class228 field1918;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
    public int[] field1922;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Leb;")
    public class230[] field1919;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[[[I")
    public static int[][][] field1912;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1914 = null;
        field1920 = null;
        field1926 = null;
        field1921 = null;
        field1915 = null;
        field1923 = null;
        if (arg0 == 0) {
            field1912 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Z")
    public static final boolean method881(int arg0, byte arg1) {
        field1917++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 < 29) {
            field1924 = 83;
        }
        int var2 = class225.field3890[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
    public static final int method882(int arg0, int arg1, int arg2, int arg3) {
        field1913++;
        if (arg1 != 1) {
            return 91;
        } else if (arg3 < arg0) {
            return arg0;
        } else if (arg2 >= arg3) {
            return arg3;
        } else {
            return arg2;
        }
    }
}
