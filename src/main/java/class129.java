import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class129 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public int field3022 = -1;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lvc;")
    public static class137 field3023 = class45.method325("Keine Antwort vom Server)3", -46);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lvc;")
    private static class137 field3028 = class45.method325("Press (Wrecover a locked account(W on front page)3", -46);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lvc;")
    public static class137 field3017 = class45.method325("RuneScape wird geladen )2 bitte warten)3)3)3", -46);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lvc;")
    public static class137 field3019 = class45.method325("zur-Uck auf die RuneScape)2Webseite gehen", -46);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lvc;")
    public static class137 field3020 = class45.method325("gleiten:", -46);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lvc;")
    private static class137 field3027 = class45.method325("as it was used to break our rules)3", -46);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lvc;")
    public static class137 field3033 = class45.method325(" )2> @yel@", -46);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lvc;")
    public static class137 field3032 = class45.method325(" zuerst von Ihrer Freunde)2Liste(Q", -46);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lvc;")
    public static class137 field3026 = field3027;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "J")
    public static volatile long field3018 = 0L;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lvc;")
    public static class137 field3030 = class45.method325("Versteckt", -46);

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lvc;")
    public static class137 field3035 = field3028;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
    public static boolean field3025 = false;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Ldb;")
    public class24 field3021;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[I")
    public int[] field3031;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lvc;")
    public class137[] field3034;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method959(int arg0) {
        field3035 = null;
        field3019 = null;
        if (arg0 != -1) {
            return;
        }
        field3030 = null;
        field3020 = null;
        field3026 = null;
        field3027 = null;
        field3023 = null;
        field3033 = null;
        field3028 = null;
        field3017 = null;
        field3032 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method960(Component arg0, int arg1) {
        field3029++;
        if (arg1 != -1) {
            method959(3);
        }
        arg0.removeKeyListener(class78.field1725);
        arg0.removeFocusListener(class78.field1725);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lnb;Lvc;Lvc;I)[Lia;")
    public static final class57[] method961(class88 arg0, class137 arg1, class137 arg2, int arg3) {
        if (arg3 >= -28) {
            method959(-61);
        }
        field3024++;
        int var4 = arg0.method641(1, arg2);
        int var5 = arg0.method654(28784, arg1, var4);
        return class33.method242(-89, arg0, var4, var5);
    }
}
