import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class151 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lo;")
    public static class24 field2128 = null;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lgd;")
    public static class206 field2129 = new class206("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Lmc;")
    public static class78 field2134 = new class78(30, -1);

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "[I")
    public static int[] field2135 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
    public static int[] field2136 = new int[25];

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field2128 = null;
        field2134 = null;
        field2135 = null;
        if (arg0 != -96) {
            field2134 = null;
        }
        field2136 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lo;Lr;Lr;B)V")
    public static final void method893(class24 arg0, class110 arg1, class110 arg2, byte arg3) {
        if (arg3 != -20) {
            method893((class24) null, (class110) null, (class110) null, (byte) 63);
        }
        class99.field1449 = arg1;
        field2128 = arg0;
        class223.field2965 = arg2;
        field2131++;
        if (class99.field1449 != null) {
            class28.field376 = class99.field1449.method694(1, (byte) 119);
        }
        if (class223.field2965 != null) {
            class190.field2584 = class223.field2965.method694(1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
    public static final boolean method894(byte arg0, int arg1, int arg2) {
        field2130++;
        int var3 = -88 % ((-arg0 - 34) / 57);
        return (class1.field26[1][arg2][arg1] & 0x2) != 0;
    }
}
