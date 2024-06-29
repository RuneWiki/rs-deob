import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class393 {

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Lpi;")
    public static class342 field5950 = new class342("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Z")
    public static final boolean method2434(byte arg0, int arg1) {
        class193.field2859 = true;
        field5949++;
        if (arg0 <= 28) {
            field5950 = null;
        }
        class334.field5043 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static final void method2435(byte arg0) {
        if (arg0 <= 110) {
            method2434((byte) 102, -110);
        }
        field5948++;
        if (class293.field4165.toLowerCase().indexOf("microsoft") != -1) {
            class520.field7730[221] = 43;
            class520.field7730[222] = 59;
            class520.field7730[190] = 72;
            class520.field7730[187] = 27;
            class520.field7730[186] = 57;
            class520.field7730[219] = 42;
            class520.field7730[192] = 58;
            class520.field7730[191] = 73;
            class520.field7730[189] = 26;
            class520.field7730[188] = 71;
            class520.field7730[223] = 28;
            class520.field7730[220] = 74;
            return;
        }
        class520.field7730[92] = 74;
        class520.field7730[61] = 27;
        if (class293.field4184 == null) {
            class520.field7730[192] = 58;
            class520.field7730[222] = 59;
        } else {
            class520.field7730[192] = 28;
            class520.field7730[520] = 59;
            class520.field7730[222] = 58;
        }
        class520.field7730[45] = 26;
        class520.field7730[93] = 43;
        class520.field7730[46] = 72;
        class520.field7730[47] = 73;
        class520.field7730[44] = 71;
        class520.field7730[91] = 42;
        class520.field7730[59] = 57;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public static void method2436(byte arg0) {
        if (arg0 != 6) {
            method2436((byte) -106);
        }
        field5950 = null;
    }
}
