import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class230 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field2854 = 1;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field2853 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method1318(boolean arg0, int arg1, byte arg2) {
        field2855++;
        if (arg0 && arg1 >= 0) {
            if (arg2 != 92) {
                field2854 = 70;
            }
            return class586.method3404(arg1, (byte) -3, arg0, 10);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field2853 = null;
        if (arg0 != -32019) {
            field2856 = -28;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)V")
    public static final void method1320(int arg0, int arg1, byte arg2, int arg3) {
        field2852++;
        if (arg2 != 34) {
            field2853 = null;
        }
        class557 var4 = class93.method564(9, arg2 ^ 0xFFFFC925, arg1);
        var4.method3257(1948);
        var4.field8201 = arg0;
        var4.field8207 = arg3;
    }

    static {
        new class180("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
