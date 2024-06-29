import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class457 extends class361 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lfh;")
    public static class463 field6575;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method2709(int arg0) {
        field6575 = null;
        if (arg0 != 12371) {
            field6575 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2710(int arg0, byte arg1, int arg2) {
        if (arg1 == 20) {
            field6574++;
            return class25.method205(arg0, arg2, (byte) -21) | (arg2 & 0x40000) != 0 || class9.method57(arg0, arg2, 55);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIILqn;)Lmb;")
    public static final class173 method2711(boolean arg0, int arg1, int arg2, class47 arg3) {
        field6573++;
        if (arg0) {
            method2709(57);
        }
        byte[] var4 = arg3.method481(arg1, arg2, -70);
        return var4 == null ? null : new class173(var4);
    }

    static {
        new class335("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
