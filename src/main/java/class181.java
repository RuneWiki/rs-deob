import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class181 extends class108 {

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Ljk;")
    public class170 field2623;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Liu;")
    public static class517 field2618 = new class517(56, 12);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
    public static boolean field2621 = false;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "F")
    public static float field2622 = 1024.0F;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lbv;")
    public static class567 field2619 = new class567("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lpr;")
    public static class301 field2624;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 3)
    public static void method1221(int arg0) {
        field2624 = null;
        if (arg0 <= -71) {
            field2618 = null;
            field2619 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)Z", line = 20)
    public static final boolean method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2620++;
        if (arg1 != 12) {
            method1221(82);
        }
        if (arg0 < (arg2 + arg6) && arg0 + arg4 > arg6) {
            return arg3 + arg8 > arg7 && arg8 < (arg5 + arg7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljk;)V", line = 51)
    public class181(class170 arg0) {
        this.field2623 = arg0;
    }
}
