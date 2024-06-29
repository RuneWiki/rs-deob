import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class class433 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lbv;")
    public static class567 field6372 = new class567("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lpp;")
    public static class464 field6373 = new class464(78, -1);

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lid;")
    public static class224 field6374 = new class224("", 13);

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Lpp;")
    public static class464 field6375 = new class464(38, 8);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static final void method2583(int arg0) {
        field6370++;
        class135 var1 = null;
        try {
            class329 var2 = class270.field3976.method364(true, "2", (byte) 68);
            while (var2.field4739 == 0) {
                class210.method1342(arg0 ^ 0xFFFFE6A3, 1L);
            }
            if (var2.field4739 == 1) {
                var1 = (class135) var2.field4737;
                class268 var3 = new class268(class17.field256 * 6 + 3);
                var3.method1710(1, 44);
                var3.method1699(true, class17.field256);
                for (int var4 = 0; var4 < class310.field4551.length; var4++) {
                    if (class459.field6618[var4]) {
                        var3.method1699(true, var4);
                        var3.method1702(class310.field4551[var4], false);
                    }
                }
                var1.method1034(var3.field3952, 0, 117, var3.field3913);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1036(107);
            }
            if (arg0 != 6428) {
                method2585(-98, true, true, (byte) -27, -117);
            }
        } catch (Exception var5) {
        }
        class437.field6385 = class508.method2860(false);
        class2.field14 = false;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIFFIIIIF[FF)V")
    public abstract void method2014(byte arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float[] arg9, float arg10);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method2584(boolean arg0) {
        field6372 = null;
        field6373 = null;
        field6374 = null;
        if (arg0) {
            field6374 = null;
        }
        field6375 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZZBI)V")
    public static final void method2585(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        class233.method1522(arg3 - 103, arg4, 0, arg1, class445.field6493.length - 1, arg2, arg0);
        field6371++;
        if (arg3 != 105) {
            field6373 = null;
        }
        class286.field4167 = 0;
        class286.field4170 = null;
    }
}
