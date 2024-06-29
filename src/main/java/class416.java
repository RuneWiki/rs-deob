import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class416 extends Exception {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5642 = 1406;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lh;")
    public static class572 field5638 = new class572("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5643 = 0;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Llu;")
    public static class610 field5644 = new class610(17, 4);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lha;")
    public static class53[] field5639;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 7)
    public static void method2450(byte arg0) {
        field5644 = null;
        field5639 = null;
        field5638 = null;
        if (arg0 > -6) {
            field5642 = 72;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 21)
    public static final void method2451(byte arg0) {
        if (arg0 < 92) {
            return;
        }
        for (int var1 = 0; var1 < class527.field7717; var1++) {
            int var2 = class634.field9290[var1];
            class505 var3 = (class505) class510.field7260.method2799((long) var2, true);
            if (var3 != null) {
                class571 var4 = var3.field7148;
                class234.method1499(0, var4, var4.field8405.field1237);
            }
        }
        field5640++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)B", line = 55)
    public static final byte method2452(int arg0, int arg1, int arg2) {
        field5641++;
        if (arg0 == 9) {
            return (byte) ((arg2 & arg1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
