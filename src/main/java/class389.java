import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class389 extends class223 {

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Lbg;")
    public static class324 field5747 = new class324(55, 2);

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBII)Z")
    public static final boolean method2392(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5746++;
        if ((class238.field3497[0][arg0][arg4] & 0x2) != 0) {
            return true;
        }
        if (arg2 != 56) {
            field5747 = null;
        }
        if ((class238.field3497[arg3][arg0][arg4] & 0x10) == 0) {
            return class475.method2867(arg4, (byte) 89, arg3, arg0) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public static final void method2393(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2394(-23);
        }
        field5749++;
        if (class518.method3081(arg1 - 91, arg0)) {
            class427.method2604(arg2, 49, class123.field1803[arg0]);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method2394(int arg0) {
        field5747 = null;
        if (arg0 != 0) {
            field5748 = -18;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
    public class389() {
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
    public class389(int arg0) {
        this.field5750 = arg0;
    }
}
