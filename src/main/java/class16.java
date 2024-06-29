import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class260 {

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field303 = 0;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lhp;")
    public static class346 field299;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[Lfl;")
    public static class770[] field297;

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(ILgn;)V")
    public class16(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(II)V")
    public static final void method154(int arg0, int arg1) {
        ++field302;
        if (arg1 != 21857) {
            method154(19, 42);
        }
        class313 var2 = class312.method1998((long) arg0, 17, arg1 + -21858);
        var2.method2006(95);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public static void method155(int arg0) {
        field297 = null;
        field299 = null;
        if (arg0 != 1) {
            field298 = -38;
        }
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)I")
    public final int method156(int arg0) {
        if (arg0 > -14) {
            return 117;
        } else {
            ++field296;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        ++field304;
        return arg0 != 4377 ? 23 : 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        ++field295;
        super.field3828 = arg0;
        if (arg1 != 122) {
            method154(2, -116);
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            field300 = 124;
        }
        ++field305;
        return 1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (arg0 < 102) {
            field299 = null;
        }
        ++field301;
        if (~super.field3828 != -2 && super.field3828 != 0) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lgn;)V")
    public class16(class729 arg0) {
        super(arg0);
    }
}
