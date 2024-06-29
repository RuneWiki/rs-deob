import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class211 extends class322 {

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field2785 = -1;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "Lfv;")
    public static class120 field2786 = new class120();

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "Lfp;")
    public static class323 field2784;

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lch;)V")
    public class211(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Z)I")
    public final int method1300(boolean arg0) {
        if (arg0) {
            this.method1300(false);
        }
        ++field2783;
        return super.field4451;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field2788;
        int var2 = 53 / ((arg0 - 70) / 51);
        return ~super.field4450.method2753(true).method1128(false) < -2 ? 4 : 2;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field2782;
        if (arg0) {
            field2786 = null;
        }
        if (super.field4451 < 0 && ~super.field4451 < -5) {
            super.field4451 = this.method17((byte) -88);
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(ILch;)V")
    public class211(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1301(char arg0, boolean arg1) {
        if (arg1) {
            field2787 = -75;
        }
        ++field2789;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || arg0 > 255)) {
            if (arg0 != 0) {
                char[] var2 = class322.field4457;
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (~arg0 == ~var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field2790;
        if (arg0 != 0) {
            field2786 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
    public static void method1302(int arg0) {
        if (arg0 != -129) {
            method1302(99);
        }
        field2786 = null;
        field2784 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field2791;
        return arg1 < 10 ? -29 : 1;
    }
}
