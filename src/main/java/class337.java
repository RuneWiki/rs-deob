import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class337 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field4239 = -1;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[[B")
    public static byte[][] field4236 = new byte[250][];

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Z")
    public static boolean field4240;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ldq;")
    public static class493 field4241;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lpi;")
    public class346 field4238;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    public int[] field4235;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field4237;

    static {
        new class335("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4240 = false;
        field4241 = new class493(36, -1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 11)
    public static void method1945(int arg0) {
        field4236 = null;
        field4241 = null;
        if (arg0 != -18508) {
            method1945(-34);
        }
    }
}
