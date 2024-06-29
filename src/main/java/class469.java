import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class469 extends class197 implements class115 {

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Lfa;")
    public class197 field6602;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6604 = new Hashtable();

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        if (arg0 >= 0) {
            field6604 = null;
        }
        field6594++;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        field6605++;
        if (arg0 != -23611) {
            this.method749(-67);
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        field6603++;
        int var4 = 69 % ((-arg0 - 54) / 60);
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 24194) {
            this.field6602 = null;
        }
        field6591++;
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        field6606++;
        if (!arg0) {
            this.method264(-72);
        }
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 != 1) {
            this.method744((byte) -32, null, 43);
        }
        field6596++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            this.method749(-11);
        }
        field6601++;
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIILfa;)V")
    public class469(int arg0, int arg1, int arg2, class197 arg3) {
        super(arg0, arg1, arg2, arg3.field2793, false, false);
        this.field6602 = arg3;
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
    public static void method2737(int arg0) {
        field6604 = null;
        if (arg0 != 0) {
            field6604 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        field6593++;
        if (arg0 >= -50) {
            this.method490(false, null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        field6590++;
        if (arg0 <= 88) {
            field6604 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        field6597++;
        if (arg1 != 21) {
            field6604 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        field6592++;
        return arg0 != 1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        field6598++;
        if (arg2 <= 79) {
            field6604 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            field6599++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        field6600++;
        return arg0 ? null : this.field6602.method490(false, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        if (!arg0) {
            field6604 = null;
        }
        field6595++;
        return null;
    }
}
