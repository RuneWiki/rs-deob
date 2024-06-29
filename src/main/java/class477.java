import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class477 extends class72 {

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field6814 = 503;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(ILcq;)V", line = 6)
    public class477(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)I", line = 11)
    public final int method2872(int arg0) {
        ++field6816;
        if (arg0 != 27669) {
            field6814 = -127;
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lcq;)V", line = 22)
    public class477(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 28)
    public final void method55(int arg0) {
        if (arg0 >= 30) {
            if (~super.field1282 > -1 || ~super.field1282 < -5) {
                super.field1282 = this.method60(-3271);
            }
            ++field6815;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V", line = 42)
    public final void method59(int arg0, int arg1) {
        ++field6818;
        if (arg1 != 3) {
            field6814 = 105;
        }
        super.field1282 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)I", line = 53)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            this.method58(-91, -2);
        }
        ++field6817;
        return 1;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)I", line = 69)
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method2872(32);
        }
        ++field6813;
        return 0;
    }
}
