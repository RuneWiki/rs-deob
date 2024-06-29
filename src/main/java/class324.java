import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class324 extends class649 {

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "Lmda;")
    public static class349 field4793;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "[[[J")
    public static long[][][] field4792;

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILhs;)V")
    public class324(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            field4792 = null;
        }
        ++field4790;
        return !class422.method2630(super.field9224.field5415.method2004(3), true) ? 3 : 1;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public static void method2099(int arg0) {
        if (arg0 > -8) {
            field4787 = 20;
        }
        field4792 = null;
        field4793 = null;
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)I")
    public final int method2100(int arg0) {
        ++field4786;
        if (arg0 != 3) {
            this.method2100(35);
        }
        return super.field9223;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            this.method135(106);
        }
        super.field9223 = arg0;
        ++field4788;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field4791;
        int var2 = 77 % ((-18 - arg0) / 50);
        return 0;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)Z")
    public final boolean method2101(int arg0) {
        if (arg0 != -16181) {
            return false;
        } else {
            ++field4785;
            return class422.method2630(super.field9224.field5415.method2004(3), true);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field4789;
        if (super.field9224.field5415.method2000(2) && !class422.method2630(super.field9224.field5415.method2004(arg0 ^ 2), true)) {
            super.field9223 = 0;
        }
        if (super.field9223 < 0 || ~super.field9223 < -2) {
            super.field9223 = this.method135(arg0 + 63);
        }
        if (arg0 != 1) {
            field4792 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lhs;)V")
    public class324(class358 arg0) {
        super(arg0);
    }
}
