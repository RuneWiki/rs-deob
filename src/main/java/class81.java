import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 extends class42 {

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    public int field1907 = 0;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lad;")
    public static class5 field1899 = class88.method674("Mitteilung", 44);

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "Lad;")
    public static class5 field1911 = class88.method674("Verbindung mit Freunde)2Server)3)3)3", -94);

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lad;")
    public static class5 field1903 = class88.method674("backright2", -102);

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lad;")
    private static class5 field1912 = class88.method674("Your ignore list is full)3 Max of 100 hit", 42);

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lad;")
    private static class5 field1914 = class88.method674("K", 100);

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "Lad;")
    public static class5 field1917 = class88.method674("Fehler bei der Verbindung zum Server)3", -107);

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
    public static int field1913 = 3;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lad;")
    public static class5 field1904 = class88.method674("Suche nach Updates )2 ", 103);

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "Lad;")
    public static class5 field1915 = field1912;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "Lad;")
    public static class5 field1902 = field1914;

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lad;")
    private static class5 field1921 = class88.method674("Loading game screen )2 ", 80);

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
    public static int field1916 = 1;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "Z")
    public static boolean field1909 = false;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "Lad;")
    public static class5 field1910 = class88.method674("Unerwartete Antwort vom Anmelde)2Server)3", -122);

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "Lad;")
    public static class5 field1919 = class88.method674("gr-Un:", -120);

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lad;")
    public static class5 field1905 = field1921;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "Lad;")
    public static class5 field1901 = field1914;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!nc", name = "Ab", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
    public static int[] field1900;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lgb;II)V", line = 14)
    private final void method629(class39 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field1907 = arg0.method343((byte) -6);
        }
        field1923++;
        if (arg1 != 4) {
            method632(86, false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILgb;)V", line = 37)
    public final void method630(int arg0, class39 arg1) {
        while (true) {
            int var3 = arg1.method330(arg0 - 30863);
            if (var3 == 0) {
                field1908++;
                if (arg0 != -1) {
                    this.method630(10, null);
                    return;
                }
                return;
            }
            this.method629(arg1, 4, var3);
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 79)
    public static void method631(int arg0) {
        field1902 = null;
        if (arg0 != 0) {
            method631(112);
        }
        field1912 = null;
        field1900 = null;
        field1914 = null;
        field1904 = null;
        field1910 = null;
        field1915 = null;
        field1911 = null;
        field1905 = null;
        field1921 = null;
        field1901 = null;
        field1903 = null;
        field1919 = null;
        field1899 = null;
        field1917 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V", line = 119)
    public static final void method632(int arg0, boolean arg1) {
        field1922++;
        if (class60.field1464 == null) {
            return;
        }
        try {
            class39 var2 = new class39(4);
            var2.method307(-388270616, arg1 ? 2 : 3);
            if (arg0 == 3) {
                var2.method325(255, 0);
                class60.field1464.method349(0, -1, 4, var2.field974);
            }
        } catch (IOException var4) {
            try {
                class60.field1464.method350(-5918);
            } catch (Exception var3) {
            }
            class35.field893++;
            class60.field1464 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V", line = 156)
    public static final void method633(int arg0) {
        class97.field2341 = false;
        field1918++;
        class40.field1048 = false;
        if (arg0 != 3) {
            method631(120);
        }
    }
}
