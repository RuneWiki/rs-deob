import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class719 extends class502 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (super.field6865 < 0 || ~super.field6865 < -5) {
            super.field6865 = this.method55(-2);
        }
        ++field9884;
        if (!arg0) {
            this.method3991((byte) 97);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field9889;
            super.field6865 = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILeka;)V")
    public class719(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field9887;
        return arg0 != -2 ? -90 : 0;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Leka;)V")
    public class719(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field9885;
        return arg1 != 0 ? 108 : 1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLsm;)V")
    public static final void method3990(int arg0, boolean arg1, class300 arg2) {
        if (!arg2.field4127) {
            if (arg2.field4122 && arg2.field4132 >= 1 && ~arg2.field4125 <= -2 && class483.field6515 + -2 >= arg2.field4132 && ~(class65.field926 - 2) <= ~arg2.field4125 && (~arg2.field4137 > -1 || class628.method3529(arg2.field4126, 94, arg2.field4137))) {
                if (!arg1) {
                    class300.method1930(arg2.field4126, arg2.field4123, arg2.field4131, arg2.field4132, arg2.field4130, arg2.field4125, false, -1, arg2.field4137);
                } else {
                    class132.method1105(arg2.field4131, -44, arg2.field4130, arg2.field4125, arg2.field4132, arg2.field4128);
                }
                arg2.field4122 = false;
                if (!arg1 && ~arg2.field4137 == ~arg2.field4129 && ~arg2.field4129 == 0) {
                    arg2.method1207(100);
                } else if (!arg1 && ~arg2.field4137 == ~arg2.field4129 && ~arg2.field4124 == ~arg2.field4123 && arg2.field4135 == arg2.field4126) {
                    arg2.method1207(116);
                }
            }
        } else if (arg2.field4129 < 0 || class628.method3529(arg2.field4135, 116, arg2.field4129)) {
            if (arg1) {
                class132.method1105(arg2.field4131, -46, arg2.field4130, arg2.field4125, arg2.field4132, (class326) null);
            } else {
                class300.method1930(arg2.field4135, arg2.field4124, arg2.field4131, arg2.field4132, arg2.field4130, arg2.field4125, false, -1, arg2.field4129);
            }
            arg2.method1207(106);
        }
        ++field9890;
        int var3 = -93 % ((45 - arg0) / 54);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)I")
    public final int method3991(byte arg0) {
        if (arg0 < 49) {
            this.method58(false);
        }
        ++field9886;
        return super.field6865;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLlu;Ljava/lang/Object;)V")
    public static final void method3992(byte arg0, class742 arg1, Object arg2) {
        ++field9888;
        if (arg1.field10255 != null) {
            for (int var3 = 0; var3 < 50 && arg1.field10255.peekEvent() != null; ++var3) {
                class643.method3577(1L, 0);
            }
            if (arg0 < -36) {
                try {
                    if (arg2 != null) {
                        arg1.field10255.postEvent(new ActionEvent(arg2, 1001, "dummy"));
                    }
                } catch (Exception var4) {
                }
            }
        }
    }
}
