import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
    public static volatile boolean field82 = false;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ltn;")
    public static class60 field83 = new class60(30, 3);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lkn;")
    public static class530 field85 = new class530("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field87 = -1;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lht;")
    public static class418 field86;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method35(int arg0) {
        field83 = null;
        if (arg0 != 2) {
            method36(null, 116, false, -5, -124, null, -16);
        }
        field86 = null;
        field85 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lza;IZIILla;I)V")
    public static final void method36(class290 arg0, int arg1, boolean arg2, int arg3, int arg4, class319 arg5, int arg6) {
        if (arg2) {
            class33.field381.method151((class147.field1956 - class33.field381.method145()) / 2, (class273.field4048 - class33.field381.method157()) / 2);
            class273.field4047.method151((class147.field1956 - class273.field4047.method145()) / 2, 18);
        }
        field84++;
        String var7 = "";
        if (class519.field7646 == class246.field3594) {
            var7 = class400.field5636.method3116(class149.field1979, (byte) 110);
        } else if (class71.field886 == class246.field3594) {
            var7 = class369.field5258.method3116(class149.field1979, (byte) 102);
        }
        arg5.method1913(var7, arg4, -1, class273.field4048 / 2 - 26, false, class147.field1956 / 2);
        int var8 = class273.field4048 / 2 - 18;
        if (arg1 != -20179) {
            field87 = 8;
        }
        arg0.method288(class147.field1956 / 2 - 152, var8, 304, 34, arg6, 0);
        arg0.method288(class147.field1956 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg0.method325(class147.field1956 / 2 - 150, var8 - -2, class483.field6730 * 3, 30, arg3, 0);
        arg0.method325(class483.field6730 * 3 + class147.field1956 / 2 - 150, var8 + 2, 300 - class483.field6730 * 3, 30, 0, 0);
        arg5.method1913(class520.field7652, arg4, -1, class273.field4048 / 2 + 4, false, class147.field1956 / 2);
    }
}
