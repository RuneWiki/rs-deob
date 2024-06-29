import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class291 extends class204 {

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(ILfs;)V")
    public class291(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)I")
    public final int method1929(byte arg0) {
        ++field4281;
        return arg0 != -98 ? -46 : super.field2852;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field4280;
        if (arg0 < 83) {
            this.method487(36, 24);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field4282;
        if (super.field2852 != 1 && ~super.field2852 != -1) {
            super.field2852 = this.method490((byte) 122);
        }
        if (arg0 != -4591) {
            this.method486(1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        if (arg1 > -105) {
            field4283 = 70;
        }
        super.field2852 = arg0;
        ++field4284;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field4286;
        int var3 = 41 / ((arg1 - -57) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lfs;)V")
    public class291(class607 arg0) {
        super(arg0);
    }
}
