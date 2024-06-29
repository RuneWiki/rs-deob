import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class408 extends class646 {

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    private int field5843;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field5847;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            field5845 = 56;
        }
        if (super.field9156.field5075) {
            class553.method3238(var3, 0, class89.field1330, this.field5843);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field5843 = (arg0.method2705(-31) << 12) / 255;
        }
        if (arg2 > 7) {
            ++field5846;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIILvo;Z)V")
    public static final void method2443(int arg0, int arg1, int arg2, int arg3, int arg4, class345 arg5, boolean arg6) {
        ++field5844;
        if (arg3 != 1) {
            method2443(118, -96, -50, 76, 95, (class345) null, true);
        }
        if (arg0 > 0) {
            class484.field6903 = null;
            class277.field3927 = arg6;
            class160.field2599 = arg2;
            class586.field8566 = arg5;
            class568.field8311 = 1;
            class309.field4295 = arg1;
            class345.field4882 = arg4;
            class434.field6249 = class43.field585.method1824(100) / arg0;
            if (~class434.field6249 > -2) {
                class434.field6249 = 1;
                return;
            }
        } else {
            class513.method3050(arg2, arg5, arg1, arg3 ^ 1, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        super(0, true);
        this.field5843 = 4096;
        this.field5843 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class408() {
        this(4096);
    }
}
