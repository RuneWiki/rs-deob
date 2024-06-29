import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class139 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Lfg;")
    public static class83 field1986 = new class83("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)V")
    public static final void method904(byte arg0, int arg1) {
        field1987++;
        class163 var2 = class271.method1546(arg1, 12, true);
        var2.method1010(1504);
        if (arg0 > -13) {
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static void method905(byte arg0) {
        if (arg0 != -27) {
            field1986 = null;
        }
        field1986 = null;
    }
}
