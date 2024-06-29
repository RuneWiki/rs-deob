import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class563 extends class86 implements class147 {

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "Lal;")
    public class86 field7606;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field7594 = 1406;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLoa;)V", line = 3)
    public final void method552(boolean arg0, class638 arg1) {
        field7598++;
        if (!arg0) {
            this.field7606 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 15)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        field7602++;
        int var8 = -86 % (arg3 / 54);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I", line = 24)
    public final int method560(int arg0) {
        if (arg0 == 15654) {
            field7595++;
            return 0;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V", line = 39)
    public final void method550(int arg0) {
        if (arg0 > -4) {
            this.method554(72);
        }
        field7599++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILoa;)Lwc;", line = 50)
    public final class60 method555(int arg0, class638 arg1) {
        field7603++;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIIILal;)V", line = 63)
    public class563(int arg0, int arg1, int arg2, int arg3, int arg4, class86 arg5) {
        super(arg2, arg3, arg4, class533.method2948((byte) 120, arg0, arg1));
        this.field7606 = arg5;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILoa;I)Z", line = 71)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        field7605++;
        if (arg1 != -8003) {
            this.method554(-15);
        }
        return false;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILoa;)Lba;", line = 84)
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        field7596++;
        if (arg0 != -585) {
            this.method550(123);
        }
        return null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 99)
    public static final String method3120(String arg0, byte arg1) {
        if (arg1 != 119) {
            return null;
        }
        field7601++;
        if (class339.field4919.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class339.field4919.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class339.field4919.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Loa;B)Lac;", line = 122)
    public final class496 method551(class638 arg0, byte arg1) {
        field7597++;
        if (arg1 >= -62) {
            this.method551(null, (byte) -98);
        }
        return this.field7606.method551(arg0, (byte) -87);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)I", line = 133)
    public final int method554(int arg0) {
        if (arg0 != -18971) {
            this.field7606 = null;
        }
        field7592++;
        return 0;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLoa;)V", line = 146)
    public final void method556(byte arg0, class638 arg1) {
        if (arg0 < 5) {
            this.method554(-49);
        }
        field7591++;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)Z", line = 156)
    public final boolean method562(int arg0) {
        if (arg0 != 29008) {
            this.field7606 = null;
        }
        field7593++;
        return false;
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)Z", line = 167)
    public final boolean method140(int arg0) {
        field7604++;
        if (arg0 != 0) {
            this.field7606 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BLoa;)V", line = 181)
    public final void method561(byte arg0, class638 arg1) {
        if (arg0 != 111) {
            method3120(null, (byte) -26);
        }
        field7590++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V", line = 193)
    public final void method142(boolean arg0) {
        field7588++;
        if (arg0) {
            this.field7606 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)I", line = 204)
    public final int method549(int arg0) {
        if (arg0 != 12352) {
            this.field7606 = null;
        }
        field7589++;
        return 0;
    }
}
