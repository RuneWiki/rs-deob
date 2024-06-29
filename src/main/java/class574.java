import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class574 extends class56 implements class269 {

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Lqn;")
    public class56 field8385;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field8397;

    static {
        new class180("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILqa;Z)Lr;", line = 3)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            this.field8385 = null;
        }
        field8394++;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(ILqa;)Loj;", line = 16)
    public final class318 method320(int arg0, class206 arg1) {
        if (arg0 == -1) {
            field8392++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I", line = 32)
    public final int method337(boolean arg0) {
        if (arg0) {
            field8382++;
            return 0;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z", line = 43)
    public final boolean method332(int arg0) {
        field8389++;
        int var2 = 122 / ((arg0 - 1) / 49);
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)I", line = 53)
    public final int method315(int arg0) {
        if (arg0 != 0) {
            this.method326(-10, null);
        }
        field8390++;
        return 0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILqa;)Lso;", line = 67)
    public final class398 method328(int arg0, class206 arg1) {
        field8396++;
        return arg0 == 12 ? this.field8385.method328(12, arg1) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLqa;)V", line = 79)
    public final void method336(boolean arg0, class206 arg1) {
        field8391++;
        if (arg0) {
            this.field8385 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lqa;Z)V", line = 89)
    public final void method341(class206 arg0, boolean arg1) {
        if (!arg1) {
            field8383++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILqa;)V", line = 101)
    public final void method326(int arg0, class206 arg1) {
        if (arg0 == 29657) {
            field8387++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 113)
    public final int method342(int arg0) {
        if (arg0 == -2329) {
            field8386++;
            return 0;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I", line = 124)
    public final int method333(byte arg0) {
        if (arg0 != 70) {
            field8384 = 120;
        }
        field8397++;
        return 0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 137)
    public final void method339(byte arg0) {
        field8395++;
        if (arg0 > -114) {
            field8384 = -58;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIILqn;)V", line = 149)
    public class574(int arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class399.method2289(arg0, arg1, 70));
        this.field8385 = arg5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILqa;II)Z", line = 158)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        field8393++;
        if (arg0 != -21851) {
            field8384 = -51;
        }
        return false;
    }
}
