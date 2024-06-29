import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class157 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lec;")
    public static class40 field1871 = new class40("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
    public static boolean field1873 = false;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ldb;")
    public static class29 field1872 = new class29("WTQA", 2);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
    public static final boolean method754(int arg0, byte arg1) {
        field1868++;
        if (arg1 >= -76) {
            method755((byte) 51);
        }
        return arg0 == 15 || arg0 == 22 || arg0 == 1010 || arg0 == 18 || arg0 == 49;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method755(byte arg0) {
        if (arg0 != -34) {
            field1873 = false;
        }
        field1867++;
        String var1 = "www";
        if (class258.field3733 == class145.field1754) {
            var1 = "www-wtrc";
        } else if (field1872 == class145.field1754) {
            var1 = "www-wtqa";
        } else if (class451.field6387 == class145.field1754) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class326.field4695 != null) {
            var2 = "/p=" + class326.field4695;
        }
        return "http://" + var1 + "." + class289.field4317.field6077 + ".com/l=" + class68.field849 + "/a=" + class62.field772 + var2 + "/";
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public abstract int method756(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method757(int arg0) {
        if (arg0 == 20028) {
            field1871 = null;
            field1872 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Lup;")
    public abstract class479 method758(byte arg0);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[B")
    public abstract byte[] method759(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
    public abstract void method760(int arg0, int arg1);
}
