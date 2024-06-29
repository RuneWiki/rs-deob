import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class304 extends class478 implements class250 {

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I", line = 5)
    public final int method1632(int arg0) {
        if (arg0 > -92) {
            this.method1631((byte) 91);
        }
        ++field3832;
        return this.field3827;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)J", line = 19)
    public final long method1629(int arg0) {
        if (arg0 != 24497) {
            field3830 = -53;
        }
        ++field3831;
        return super.field6194.getAddress();
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZ[B)V", line = 34)
    public final void method1630(int arg0, int arg1, boolean arg2, byte[] arg3) {
        ++field3833;
        this.method2685(arg3, arg1);
        if (!arg2) {
            field3830 = 80;
        }
        this.field3827 = arg0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)I", line = 46)
    public final int method1631(byte arg0) {
        ++field3826;
        if (arg0 > -79) {
            this.field3827 = -48;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLha;)V", line = 57)
    public static final void method1798(byte arg0, class570 arg1) {
        class399.field5278 = class574.method3092(class234.field3199, true, arg1, -118);
        ++field3828;
        class364.field4453 = class628.method3362(class234.field3199, arg0 + -3, arg1);
        class225.field3058 = class574.method3092(class353.field4310, true, arg1, arg0 + -12);
        if (arg0 != -105) {
            field3830 = 75;
        }
        class411.field5453 = class628.method3362(class353.field4310, -69, arg1);
        class595.field7562 = class574.method3092(class657.field8536, true, arg1, 33);
        class66.field868 = class628.method3362(class657.field8536, -122, arg1);
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lck;I[BI)V", line = 76)
    public class304(class733 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3827 = arg1;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 84)
    public static final void method1799(short[] arg0, int arg1, String[] arg2) {
        ++field3829;
        class599.method3239(arg2.length + -1, -1, arg0, arg2, arg1);
    }
}
