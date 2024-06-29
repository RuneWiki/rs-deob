import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class170 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "F")
    public static float field2220 = 1024.0F;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Ljn;")
    public static class409 field2219 = new class409("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Z")
    public static boolean field2221 = false;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "Ljn;")
    public static class409 field2222 = new class409("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
    public static final void method1106(int arg0, int arg1) {
        field2218++;
        if (arg1 != 2501) {
            field2219 = null;
        }
        class125 var2 = class56.method428(arg0, 6, arg1 ^ 0xFFFFF809);
        var2.method847(87);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static void method1107(int arg0) {
        field2219 = null;
        if (arg0 == 6) {
            field2222 = null;
        }
    }
}
