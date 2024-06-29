import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class29 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field403 = new int[13];

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Llr;")
    public static class105 field407;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lij;")
    public static class316 field408;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Z")
    public static boolean field409;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field404++;
        float var5 = (float) class333.field4501 / (float) class333.field4520;
        int var6 = arg4;
        int var7 = arg2;
        if (arg1 >= -64) {
            return;
        }
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg4 - var6) / 2;
        int var9 = arg0 - (arg2 - var7) / 2;
        class274.field3747 = class333.field4501 - (class333.field4501 * var9 / var7);
        class258.field3572 = -1;
        class24.field312 = -1;
        class350.field4719 = class333.field4520 * var8 / var6;
        class302.method1833(119);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public static final void method278(int arg0, byte arg1) {
        class68.field967.method2531(arg0, 112);
        field405++;
        if (arg1 <= 3) {
            method279(62);
        }
        class273.field3739.method2531(arg0, 112);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        field407 = null;
        field408 = null;
        if (arg0 > 43) {
            field403 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;B)Laa;")
    public static final class276 method280(Component arg0, byte arg1) {
        if (arg1 < 60) {
            method277(-80, 77, -75, -128, 59);
        }
        field402++;
        return new class225(arg0);
    }

    static {
        new class368("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field406 = 0;
    }
}
