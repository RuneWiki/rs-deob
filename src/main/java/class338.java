import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class338 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field4978 = 0;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ljn;")
    public static class409 field4979 = new class409("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Ljn;")
    public static class409 field4980 = new class409("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method2185(byte arg0) {
        field4979 = null;
        field4980 = null;
        if (arg0 != 39) {
            field4978 = 63;
        }
    }

    static {
        new class167("", 73);
        field4981 = -1;
    }
}
