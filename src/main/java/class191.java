import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class191 extends class305 {

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)Z")
    public final boolean method1326(int arg0) {
        if (arg0 > -69) {
            return false;
        } else {
            ++field2885;
            return class555.method3243(super.field4320, -90);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
    public final int method1327(int arg0) {
        ++field2887;
        return arg0 != 17503 ? 3 : super.field4320;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
    public static final boolean method1328(int arg0, int arg1, int arg2) {
        ++field2891;
        if (arg2 >= -114) {
            return false;
        } else {
            return class346.method2188(arg1, arg0, false) || class64.method568(arg1, false, arg0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILhb;)V")
    public class191(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field2886;
        if (class555.method3243(arg1, arg0 ^ -31427)) {
            if (super.field4323.field10200.method3847(arg0 ^ 17857) && !class509.method3013(super.field4323.field10200.method3848(17503), -16764)) {
                return 3;
            }
            if (super.field4323.field10180.method953(arg0 + -13898) == 1) {
                return 3;
            }
        }
        if (arg0 != 31401) {
            return -32;
        } else if (~arg1 == -4) {
            return 3;
        } else {
            return class555.method3243(arg1, arg0 + -31490) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method306(37, 47);
        }
        ++field2893;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lhb;)V")
    public class191(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field2892;
        if (arg0 != 68) {
            this.method308((byte) -128);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (this.method1326(-95)) {
            if (super.field4323.field10200.method3847(16232) && !class509.method3013(super.field4323.field10200.method3848(17503), -16764)) {
                super.field4320 = 1;
            }
            if (super.field4323.field10180.method953(17503) == 1) {
                super.field4320 = 1;
            }
        }
        ++field2894;
        if (super.field4320 == 3) {
            super.field4320 = 2;
        }
        if (arg0 <= -40) {
            if (~super.field4320 > -1 || ~super.field4320 < -4) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
    public final boolean method1329(int arg0) {
        if (arg0 != 2) {
            field2888 = 66;
        }
        ++field2889;
        return true;
    }
}
