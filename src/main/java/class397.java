import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class397 extends class125 {

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "F")
    public static float field5693;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[[B")
    public static byte[][] field5685;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method2407(int arg0) {
        if (arg0 != -7558) {
            field5685 = null;
        }
        ++field5690;
        return !super.field1733.method3308(-112);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 18)
    public static void method2408(int arg0) {
        field5685 = null;
        if (arg0 != 6410) {
            field5693 = -0.4989342F;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lgp;)V", line = 28)
    public class397(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ILgp;)V", line = 31)
    public class397(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILsl;)Lfk;", line = 35)
    public static final class313 method2409(int arg0, class479 arg1) {
        ++field5686;
        int var2 = arg1.method2882(-1);
        return arg0 != 6409 ? null : new class313(var2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V", line = 48)
    public final void method157(byte arg0, int arg1) {
        if (arg0 < -32) {
            super.field1732 = arg1;
            ++field5687;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)I", line = 66)
    public final int method2410(boolean arg0) {
        if (arg0) {
            field5685 = null;
        }
        ++field5689;
        return super.field1732;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILkca;)I", line = 77)
    public static final int method2411(int arg0, class755 arg1) {
        if (arg0 != 6145) {
            field5685 = null;
        }
        ++field5692;
        if (class456.field6496 == arg1) {
            return 6407;
        } else if (class482.field6922 == arg1) {
            return 6408;
        } else if (class315.field4259 != arg1) {
            if (class83.field1217 == arg1) {
                return 6409;
            } else if (class367.field5365 == arg1) {
                return 6410;
            } else if (class268.field3818 == arg1) {
                return 6145;
            } else {
                throw new IllegalStateException();
            }
        } else {
            return 6406;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V", line = 112)
    public final void method156(boolean arg0) {
        if (arg0) {
            ++field5688;
            if (super.field1733.method3308(-120)) {
                super.field1732 = 0;
            }
            if (super.field1732 != 1 && ~super.field1732 != -1) {
                super.field1732 = this.method158((byte) 20);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)I", line = 129)
    public final int method155(boolean arg0, int arg1) {
        ++field5691;
        if (super.field1733.method3308(-65)) {
            return 3;
        } else {
            if (!arg0) {
                field5693 = -1.1104891F;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I", line = 144)
    public final int method158(byte arg0) {
        int var2 = -12 / ((arg0 - -63) / 49);
        ++field5684;
        return 1;
    }
}
