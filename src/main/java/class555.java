import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class555 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljr;")
    public static class92 field8165;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method3249(byte arg0) {
        int var1 = 51 % ((arg0 + 52) / 42);
        field8165 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILbea;)Lbea;")
    public abstract class188 method1900(int arg0, class188 arg1);

    static {
        new class180("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field8165 = new class92("", 10);
    }
}
