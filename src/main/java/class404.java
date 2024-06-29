import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class404 extends class649 {

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field5991 = -1;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lvh;")
    public static class626 field5988;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[[B")
    public static byte[][] field5987;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lhs;)V", line = 4)
    public class404(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILhs;)V", line = 12)
    public class404(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I", line = 15)
    public final int method133(int arg0, int arg1) {
        ++field5996;
        if (arg0 != 18648) {
            field5987 = null;
        }
        return !class422.method2630(super.field9224.field5415.method2004(arg0 + -18645), true) ? 3 : 1;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 31)
    public final void method134(int arg0) {
        if (super.field9224.field5415.method2000(arg0 ^ 3) && !class422.method2630(super.field9224.field5415.method2004(arg0 + 2), true)) {
            super.field9223 = 0;
        }
        if (arg0 != 1) {
            field5987 = null;
        }
        ++field5997;
        if (super.field9223 < 0 || ~super.field9223 < -3) {
            super.field9223 = this.method135(94);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)V", line = 50)
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        ++field5990;
        if (arg1 > -120) {
            field5993 = -81;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 61)
    public static void method2493(int arg0) {
        field5988 = null;
        if (arg0 != -1) {
            field5993 = 80;
        }
        field5987 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I", line = 75)
    public final int method135(int arg0) {
        ++field5995;
        int var2 = -58 % ((-18 - arg0) / 50);
        return 0;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)Z", line = 85)
    public final boolean method2494(int arg0) {
        if (arg0 != -16181) {
            field5993 = -89;
        }
        ++field5994;
        return class422.method2630(super.field9224.field5415.method2004(3), true);
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)I", line = 102)
    public final int method2495(int arg0) {
        ++field5989;
        return arg0 != 3 ? 20 : super.field9223;
    }
}
