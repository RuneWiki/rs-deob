import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class332 extends class207 {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I", line = 4)
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            this.method2146(-109);
        }
        ++field4705;
        return 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 16)
    public final void method37(int arg0) {
        ++field4704;
        int var2 = -94 % ((-58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V", line = 27)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field4700;
        if (arg1 < -7) {
            ;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I", line = 38)
    public final int method2146(int arg0) {
        ++field4702;
        return arg0 != 43 ? -80 : super.field2669;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILrd;)V", line = 50)
    public class332(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lrd;)V", line = 55)
    public class332(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)I", line = 59)
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            this.method36(59);
        }
        ++field4701;
        return 1;
    }
}
