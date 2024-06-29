import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class503 extends class138 {

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Lsk;")
    public static class423 field7603 = new class423("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "J")
    public static long field7607;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
    public static final void method3012(byte arg0, int arg1) {
        class466.field7158 = arg1;
        if (arg0 == -100) {
            class226.field3471 = -1;
            field7604++;
            class403.field5863 = -1;
            class419.method2454((byte) 126);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
    public static final void method3013(boolean arg0, int arg1) {
        field7606++;
        for (class179 var2 = class437.field6439.method2415((byte) 24); var2 != null; var2 = class437.field6439.method2416((byte) -127)) {
            if ((long) arg1 == (var2.field2798 >> 48 & 0xFFFFL)) {
                var2.method1121(false);
            }
        }
        if (!arg0) {
            method3015(118);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
    public static final void method3014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7605++;
        class64 var5 = class230.method1387(arg1, (byte) 40, 8);
        if (arg3 == 65535) {
            var5.method441((byte) 58);
            var5.field1054 = arg0;
            var5.field1051 = arg2;
            var5.field1059 = arg4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
    public static void method3015(int arg0) {
        if (arg0 < -54) {
            field7603 = null;
        }
    }
}
