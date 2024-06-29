import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class368 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5557 = 0;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lhp;")
    public static class277 field5560;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field5559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field5562;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "[I")
    public static int[] field5561;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZBZ)V")
    public static final void method2356(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        field5558++;
        class6.method32(arg0, arg2, class257.field3662.length - 1, -70, arg1, arg4, 0);
        class320.field4636 = null;
        if (arg3 < 76) {
            field5557 = -49;
        }
        class594.field8678 = 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method2357(boolean arg0) {
        field5560 = null;
        field5561 = null;
        if (arg0) {
            field5560 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLbd;)V")
    public static final void method2358(boolean arg0, class55 arg1) {
        field5559++;
        if (class431.field6408 == null) {
            return;
        }
        class57 var2 = null;
        if (arg1.field630 == 0) {
            var2 = (class57) class491.method2948(arg1.field629, arg1.field623, arg1.field625);
        }
        if (arg0) {
            method2356(63, 22, false, (byte) -31, true);
        }
        if (arg1.field630 == 1) {
            var2 = (class57) class458.method2824(arg1.field629, arg1.field623, arg1.field625);
        }
        if (arg1.field630 == 2) {
            var2 = (class57) class226.method1473(arg1.field629, arg1.field623, arg1.field625, field5562 == null ? (field5562 = method2359("qn")) : field5562);
        }
        if (arg1.field630 == 3) {
            var2 = (class57) class157.method911(arg1.field629, arg1.field623, arg1.field625);
        }
        if (var2 == null) {
            arg1.field624 = -1;
            arg1.field621 = 0;
            arg1.field627 = 0;
        } else {
            arg1.field624 = var2.method89(80);
            arg1.field627 = var2.method95(-75);
            arg1.field621 = var2.method92(9812);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2359(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class474("Player ", "Spieler ", "Joueur ", "Jogador ");
        field5560 = new class277(64);
    }
}
