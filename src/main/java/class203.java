import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class203 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Llt;")
    public static class475 field2930 = new class475(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public static int[] field2928;

    static {
        new class475("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)Z", line = 6)
    public static final boolean method1375(int arg0, byte arg1) {
        field2931++;
        class483.field7081 = arg0 + 1 & 0xFFFF;
        class223.field3289 = true;
        int var2 = -84 / ((-arg1 - 18) / 61);
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 6306) {
            return;
        }
        field2932++;
        if (class494.field7297 <= arg3 && arg1 <= class445.field6629 && arg2 >= class37.field393 && class509.field7436 >= arg4) {
            class367.method2276(arg1, arg2, arg3, arg4, -18394, arg0);
        } else {
            class185.method1276(arg3, (byte) -120, arg1, arg4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method1377(boolean arg0) {
        field2929++;
        class450.field6706 = 0;
        class312.field4467.method817(-4);
        class207.field2963 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 59)
    public static void method1378(int arg0) {
        field2928 = null;
        field2930 = null;
        if (arg0 != -1) {
            field2930 = null;
        }
    }
}
