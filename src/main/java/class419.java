import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class419 extends class406 {

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
    public static boolean field5988;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "F")
    public static float field5992;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "[[[I")
    public static int[][][] field5994;

    static {
        new class362("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field5988 = false;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 5)
    public static void method2657(int arg0) {
        field5994 = null;
        if (arg0 != 0) {
            field5992 = 0.628856F;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lon;III)V", line = 23)
    public static final void method2658(class184 arg0, int arg1, int arg2, int arg3) {
        field5986++;
        if (class225.field3144 != null || class435.field6270 || arg0 == null || class451.method2793(arg1 ^ 0xFFFFB9A8, arg0) == null) {
            return;
        }
        class225.field3144 = arg0;
        class276.field3921 = class451.method2793(arg1 - 18008, arg0);
        class284.field3993 = false;
        class261.field3723 = arg3;
        class3.field24 = arg2;
        class122.field1498 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V", line = 51)
    public class419(int arg0, int arg1) {
        this.field5987 = arg0;
        this.field5991 = arg1;
    }
}
