import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class93 {

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lh;")
    public static class572 field1395 = new class572("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lada;")
    public static class144 field1396 = new class144(11, 3);

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1397 = 16777215;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIIII)V", line = 3)
    public static final void method735(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field1396 = null;
        }
        field1394++;
        if (arg1 >= arg2) {
            class140.method969(arg2, 15888, arg3, arg1, class604.field8993[arg4]);
        } else {
            class140.method969(arg1, 15888, arg3, arg2, class604.field8993[arg4]);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z", line = 27)
    public static final boolean method736(boolean arg0) {
        field1393++;
        class417 var1 = class174.field2677.field179.field5648;
        if (var1 == null || class174.field2677.field179 == var1) {
            return false;
        }
        if (arg0) {
            field1397 = -128;
        }
        class583 var2 = (class583) var1;
        if (var2.field8566 >= 2000) {
            var2.field8566 -= 2000;
        }
        return var2.field8566 == 1002;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 52)
    public static void method737(byte arg0) {
        field1395 = null;
        if (arg0 >= 91) {
            field1396 = null;
        }
    }
}
