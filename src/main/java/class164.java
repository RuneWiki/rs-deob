import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class164 extends class529 {

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lqu;")
    public static class219 field2371;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lin;")
    public static class262 field2370;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lza;")
    public static class497 field2374;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2372;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2372 = null;
        if (arg0 == -1) {
            field2370 = null;
            field2374 = null;
            field2371 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
    public class164(int arg0, int arg1) {
        this.field2373 = arg0;
        this.field2375 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class135 var7 = new class135();
        var7.field1818 = arg1 >> class56.field908;
        var7.field1826 = arg2 >> class56.field908;
        var7.field1823 = arg3 >> class56.field908;
        var7.field1820 = arg4 >> class56.field908;
        var7.field1822 = arg0;
        var7.field1834 = arg1;
        var7.field1828 = arg2;
        var7.field1832 = arg3;
        var7.field1825 = arg4;
        var7.field1816 = arg5;
        var7.field1836 = arg6;
        class222.field3745[class360.field5584++] = var7;
    }

    static {
        new class213("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field2371 = new class219(70, -1);
    }
}
