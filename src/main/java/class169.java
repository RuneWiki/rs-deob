import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class169 extends class464 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[Lqo;")
    public static class19[] field2234 = new class19[4];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lwt;")
    public static class194 field2232 = new class194("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1064(int arg0, int arg1, byte arg2) {
        field2230++;
        int var3 = 68 / ((-arg2 - 11) / 33);
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILae;)Lp;")
    public static final class138 method1065(int arg0, class156 arg1) {
        if (arg0 != -2) {
            field2234 = null;
        }
        field2233++;
        class138 var2 = new class138();
        var2.field1805 = arg1.method993((byte) -57);
        var2.field1803 = class195.field2749.method2212(var2.field1805, -455528836);
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1066(byte arg0) {
        field2232 = null;
        if (arg0 != 62) {
            field2234 = null;
        }
        field2234 = null;
    }

    static {
        new class194("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
