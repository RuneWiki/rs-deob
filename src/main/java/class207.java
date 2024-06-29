import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class207 extends class138 {

    @OriginalMember(owner = "client!th", name = "r", descriptor = "[I")
    public static int[] field2690 = new int[1];

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field2689;

    static {
        new class169("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field2691 = 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZII)V", line = 5)
    public static final void method1348(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class408.field5462 = 0L;
        field2689++;
        int var5 = class144.method1008((byte) 109);
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class512.field7538.method834()) {
            arg2 = true;
        }
        if (arg4 == 6271) {
            class72.method412(arg0, var5, arg3, -1490384057, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 32)
    public static void method1349(int arg0) {
        field2690 = null;
        if (arg0 != -190) {
            method1349(124);
        }
    }
}
