import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class299 extends class450 {

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field4249 = -2;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "[I")
    public static int[] field4255 = new int[1];

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "[F")
    public static float[] field4257 = new float[4];

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "Z")
    public static boolean field4247;

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(ILup;)V", line = 3)
    public class299(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lup;)V", line = 6)
    public class299(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(Z)I", line = 9)
    public final int method1838(boolean arg0) {
        ++field4254;
        if (!arg0) {
            field4257 = null;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLwu;)V", line = 21)
    public static final void method1839(boolean arg0, class376 arg1) {
        ++field4258;
        if (!arg0) {
            class236.field3314 = arg1;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 32)
    public final void method73(byte arg0) {
        if (super.field6171.method1672(arg0 + -98)) {
            super.field6170 = 2;
        }
        if (arg0 != 98) {
            field4247 = true;
        }
        ++field4252;
        if (~super.field6170 > -1 || ~super.field6170 < -3) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)I", line = 52)
    public final int method68(boolean arg0) {
        ++field4246;
        if (arg0) {
            field4247 = false;
        }
        if (super.field6171.method1672(0)) {
            return 2;
        } else {
            return super.field6171.field3913.method3277((byte) 121) && class474.method2672((byte) 117, super.field6171.field3913.method3282(true)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V", line = 77)
    public static void method1840(int arg0) {
        if (arg0 == 1) {
            field4255 = null;
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZI)V", line = 94)
    public final void method67(boolean arg0, int arg1) {
        ++field4248;
        if (arg0) {
            super.field6170 = arg1;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)Z", line = 106)
    public final boolean method1841(int arg0) {
        ++field4253;
        return !super.field6171.method1672(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)I", line = 119)
    public final int method75(int arg0, int arg1) {
        ++field4251;
        return super.field6171.method1672(arg0) ? 3 : 1;
    }
}
