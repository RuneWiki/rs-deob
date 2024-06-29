import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class153 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
    public static boolean field2122 = false;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lap;")
    public static class310 field2121 = new class310(17, 7);

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lch;")
    public static class151 field2124 = new class151("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[Lu;")
    public static class34[] field2126;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 3)
    public static final int method1087(byte arg0, String arg1) {
        field2123++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class349.field4807; var2++) {
            if (arg1.equalsIgnoreCase(class37.field446[var2])) {
                return var2;
            }
        }
        if (arg0 >= -11) {
            method1090(true, 69);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1088(byte arg0) {
        field2119++;
        for (class31 var1 = (class31) class428.field5975.method775(1); var1 != null; var1 = (class31) class428.field5975.method763(0)) {
            if (var1.field330) {
                var1.method198(-108);
            }
        }
        for (class31 var2 = (class31) class357.field4928.method775(1); var2 != null; var2 = (class31) class357.field4928.method763(0)) {
            if (var2.field330) {
                var2.method198(-113);
            }
        }
        int var3 = 63 % ((20 - arg0) / 60);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 63)
    public static void method1089(int arg0) {
        field2121 = null;
        field2126 = null;
        field2124 = null;
        if (arg0 != 17) {
            method1088((byte) -72);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)I", line = 93)
    public static final int method1090(boolean arg0, int arg1) {
        field2120++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0) {
            field2125 = 0;
        }
        return var2 * var4 >> 12;
    }
}
