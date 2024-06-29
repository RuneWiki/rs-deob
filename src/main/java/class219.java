import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class219 {

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Lpp;")
    public static class464 field3292 = new class464(67, 4);

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Lbv;")
    public static class567 field3293 = new class567("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "Liu;")
    public static class517 field3294 = new class517(1, -2);

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Lpp;")
    public static class464 field3295 = new class464(56, -1);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)Z", line = 10)
    public static final boolean method1469(byte arg0, int arg1, int arg2) {
        field3291++;
        if (arg0 != 67) {
            field3294 = null;
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 28)
    public static void method1470(int arg0) {
        field3295 = null;
        field3293 = null;
        field3294 = null;
        if (arg0 == -28066) {
            field3292 = null;
        }
    }
}
