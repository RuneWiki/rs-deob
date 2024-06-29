import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class271 extends class49 {

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Lwt;")
    public static class194 field3783 = new class194("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lwt;")
    public static class194 field3785 = new class194("M", "M", "M", "M");

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "Lhe;")
    public static class239 field3784;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public static void method1652(byte arg0) {
        field3785 = null;
        if (arg0 < -74) {
            field3784 = null;
            field3783 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lmd;I)I")
    public static final int method1653(class364 arg0, int arg1) {
        field3781++;
        if (arg1 != 8) {
            field3784 = null;
        }
        int var2 = arg0.method2229(2, arg1 - 9);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2229(5, -1);
        } else if (var2 == 2) {
            var3 = arg0.method2229(8, arg1 ^ 0xFFFFFFF7);
        } else {
            var3 = arg0.method2229(11, arg1 ^ 0xFFFFFFF7);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Lgh;")
    public abstract class368 method1586(int arg0);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3782++;
        int var6 = -43 / ((arg0 - 65) / 54);
        for (int var7 = arg2; var7 <= arg3; var7++) {
            class238.method1440(class41.field629[var7], arg1, arg5, arg4, -14726);
        }
    }
}
