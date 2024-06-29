import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class623 extends class232 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)I", line = 3)
    public static final int method3557(int arg0, int arg1, int arg2) {
        ++field8782;
        int var3 = arg0 >>> 24;
        if (arg1 > -71) {
            method3558(-102, 42, -58);
        }
        int var4 = ((arg0 & 16711935) * var3 & -16711936 | 16711680 & (65280 & arg0) * var3) >>> 8;
        int var5 = 255 - var3;
        return ((-16711936 & (arg2 & 16711935) * var5 | (65280 & arg2) * var5 & 16711680) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V", line = 19)
    public final void method568(boolean arg0, byte arg1) {
        ++field8785;
        if (arg1 != -126) {
            field8779 = -17;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V", line = 29)
    public final void method572(boolean arg0, int arg1) {
        ++field8786;
        if (arg1 <= 21) {
            field8779 = 111;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)Z", line = 43)
    public static final boolean method3558(int arg0, int arg1, int arg2) {
        ++field8784;
        if (arg2 != 458752) {
            return true;
        } else {
            return (458752 & arg0) != 0 | class22.method166(arg0, (byte) -123, arg1) || class428.method2549(-32443, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILdr;I)V", line = 54)
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 == 2305) {
            super.field3368.method1104(true, arg1);
            ++field8787;
            super.field3368.method1088((byte) -31, arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)V", line = 70)
    public static final void method3559(String arg0, String arg1, boolean arg2, int arg3) {
        ++field8780;
        class222.field3160 = arg3;
        class544.field7651 = 2;
        class731.method4097(arg0, 31533, arg2, arg1);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Z", line = 80)
    public final boolean method571(int arg0) {
        ++field8788;
        if (arg0 != -30998) {
            field8779 = -33;
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lwk;)V", line = 91)
    public class623(class151 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 95)
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = 14 / ((48 - arg0) / 51);
        ++field8781;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 105)
    public final void method573(byte arg0) {
        if (arg0 < 77) {
            method3557(-54, -2, -3);
        }
        ++field8783;
    }
}
