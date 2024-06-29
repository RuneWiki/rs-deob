import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class197 extends class204 {

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I", line = 3)
    public final int method487(int arg0, int arg1) {
        ++field2777;
        if (super.field2853.method3505(126)) {
            return 3;
        } else {
            int var3 = 71 % ((-57 - arg1) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 17)
    public final void method486(int arg0) {
        if (super.field2853.method3505(126)) {
            super.field2852 = 2;
        }
        ++field2779;
        if (arg0 != -4591) {
            field2782 = -16;
        }
        if (super.field2852 < 0 || ~super.field2852 < -3) {
            super.field2852 = this.method490((byte) 97);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)Z", line = 41)
    public final boolean method1282(int arg0) {
        int var2 = 98 % ((arg0 - -13) / 44);
        ++field2775;
        return !super.field2853.method3505(121);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lfs;)V", line = 55)
    public class197(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I", line = 59)
    public final int method1283(byte arg0) {
        ++field2778;
        if (arg0 != -98) {
            this.method1282(-4);
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)V", line = 71)
    public final void method488(int arg0, int arg1) {
        ++field2780;
        super.field2852 = arg0;
        if (arg1 >= -105) {
            field2782 = -51;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I", line = 82)
    public final int method490(byte arg0) {
        ++field2776;
        if (arg0 <= 83) {
            this.method1283((byte) 40);
        }
        if (super.field2853.method3505(125)) {
            return 2;
        } else {
            return super.field2853.field8517.method2602((byte) 54) && class126.method873(-987, super.field2853.field8517.method2604((byte) -98)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(ILfs;)V", line = 103)
    public class197(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 106)
    public static final void method1284(int arg0, String arg1, int arg2) {
        if (arg2 > -123) {
            field2782 = 113;
        }
        ++field2781;
        class17 var3 = class245.method1634(1, (long) arg0, 2);
        var3.method66((byte) 23);
        var3.field102 = arg1;
    }
}
