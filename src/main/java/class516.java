import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class516 extends class270 implements class323 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lnm;")
    public class270 field7584;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Lpb;")
    public static class296 field7575 = new class296("", 11);

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Loi;")
    public static class169 field7591 = new class169("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lbr;")
    public static class144 field7577;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field7590;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqa;B)V", line = 3)
    public final void method421(class129 arg0, byte arg1) {
        field7580++;
        if (arg1 > -88) {
            field7590 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 14)
    public final void method418(int arg0) {
        if (arg0 == -14924) {
            field7574++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V", line = 24)
    public static void method3065(int arg0) {
        field7591 = null;
        field7575 = null;
        field7590 = null;
        field7577 = null;
        if (arg0 > -47) {
            method3065(73);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 44)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        if (arg0 != 91) {
            this.method413(-53);
        }
        field7582++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lqa;B)Lvs;", line = 54)
    public final class465 method172(class129 arg0, byte arg1) {
        int var3 = 13 % ((arg1 - 48) / 60);
        field7581++;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILqa;)Lc;", line = 65)
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            this.method413(112);
        }
        field7576++;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I", line = 76)
    public final int method414(int arg0) {
        field7585++;
        if (arg0 != 17350) {
            field7591 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqa;I)V", line = 87)
    public final void method416(class129 arg0, int arg1) {
        if (arg1 != 16663) {
            field7575 = null;
        }
        field7592++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZILqa;)Z", line = 105)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        field7587++;
        return arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 117)
    public final void method173(byte arg0) {
        field7583++;
        if (arg0 != -32) {
            this.field7584 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z", line = 131)
    public final boolean method177(int arg0) {
        if (arg0 != 5) {
            method3065(113);
        }
        field7579++;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I", line = 143)
    public final int method415(int arg0) {
        if (arg0 == -15317) {
            field7586++;
            return 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z", line = 154)
    public final boolean method417(boolean arg0) {
        if (arg0) {
            field7590 = null;
        }
        field7578++;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIILnm;)V", line = 167)
    public class516(int arg0, int arg1, int arg2, int arg3, int arg4, class270 arg5) {
        super(arg2, arg3, arg4, class471.method2825(arg1, 3, arg0));
        this.field7584 = arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I", line = 178)
    public final int method413(int arg0) {
        field7588++;
        if (arg0 != -30502) {
            field7590 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLqa;)V", line = 190)
    public final void method175(byte arg0, class129 arg1) {
        field7589++;
        if (arg0 != 91) {
            this.field7584 = null;
        }
    }
}
