import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class260 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lbd;")
    public static class44 field3845 = new class44("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lge;")
    public static class511 field3847 = new class511(8);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lqt;")
    public static class459 field3848 = new class459(19, 8);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3846++;
        if (arg1 >= class465.field6763 && arg1 <= class176.field2630) {
            int var5 = class252.method1631(class333.field4936, class424.field5996, arg4, -124);
            int var6 = class252.method1631(class333.field4936, class424.field5996, arg3, -25);
            class190.method1295(arg0, var5, 87, arg1, var6);
        }
        if (arg2 <= 44) {
            method1670(-126, -29, 3, -89, -101);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1671(int arg0) {
        field3847 = null;
        field3845 = null;
        if (arg0 != 0) {
            field3845 = null;
        }
        field3848 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1672(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1671(-35);
        }
        field3844++;
        return (arg2 & 0x400) != 0;
    }
}
