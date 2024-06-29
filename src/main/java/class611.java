import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class611 {

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "Lea;")
    public static class474 field8897 = new class474(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "F")
    public static float field8899;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "F")
    public static float field8900;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3536(int arg0) {
        class285.field3940++;
        field8898++;
        class308.method2044(class195.field2640, -7434);
        class468.field6960.method1205((byte) -69, class562.method3250(-32068));
        class468.field6960.method1229(class581.field8366, 30364);
        class468.field6960.method1229(class298.field4407, 30364);
        if (arg0 == -1) {
            class468.field6960.method1205((byte) -69, class595.field8694.field6538);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III[BIII)Z", line = 23)
    public static final boolean method3537(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field8895++;
        int var7 = arg0 % arg1;
        int var8;
        if (~var7 == arg2) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg4 - 1) / arg1);
        int var10 = -((arg0 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg6] == 0) {
                    return true;
                }
                arg6 += arg1;
            }
            int var13 = arg6 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V", line = 74)
    public static void method3538(int arg0) {
        field8897 = null;
        if (arg0 != -14466) {
            field8897 = null;
        }
    }
}
