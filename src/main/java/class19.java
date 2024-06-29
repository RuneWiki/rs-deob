import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class227 {

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Lpfa;")
    public static class275 field203;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "[[[Lqs;")
    public static class565[][][] field205;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIII)V", line = 7)
    public final void method116(byte arg0, int arg1, int arg2, int arg3) {
        super.field2931 = arg3;
        ++field202;
        super.field2936 = arg2;
        super.field2929 = arg1;
        int var5 = -100 % ((arg0 - 47) / 34);
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIF)V", line = 19)
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)V", line = 22)
    public static void method117(int arg0) {
        field203 = null;
        field205 = null;
        if (arg0 != 1121) {
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(FZ)V", line = 33)
    public final void method118(float arg0, boolean arg1) {
        ++field204;
        super.field2933 = arg0;
        if (arg1) {
            field205 = null;
        }
    }
}
