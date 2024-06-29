import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class715 extends class649 {

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILvp;)Lqi;", line = 6)
    public static final class291 method3953(int arg0, class559 arg1) {
        if (arg0 != 0) {
            method3953(-78, (class559) null);
        }
        ++field10044;
        class291 var2;
        if (class210.field3498 == null) {
            var2 = new class291();
        } else {
            var2 = class210.field3498;
            class210.field3498 = class210.field3498.field4479;
            --class416.field6106;
            var2.field4479 = null;
        }
        var2.field4482 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I", line = 29)
    public static final int method3954(int arg0, int arg1) {
        ++field10047;
        return arg1 < 10 ? 19 : arg0 & 255;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 40)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            this.method129(30, (byte) -24);
        }
        if (super.field9224.method2291(-11) == class565.field8012) {
            if (super.field9224.method2294((byte) -112)) {
                super.field9223 = 0;
            }
        } else {
            super.field9223 = 1;
        }
        ++field10045;
        if (super.field9223 != 0 && super.field9223 != 1) {
            super.field9223 = this.method135(-125);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)I", line = 61)
    public final int method133(int arg0, int arg1) {
        ++field10046;
        if (super.field9224.method2294((byte) -127)) {
            return 3;
        } else if (super.field9224.method2291(-11) == class565.field8012) {
            if (~arg1 == -1) {
                if (~super.field9224.field5436.method2435(3) == -2) {
                    return 2;
                }
                if (super.field9224.field5448.method3596(arg0 + -18645) == 1) {
                    return 2;
                }
                if (~super.field9224.field5440.method476(3) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            if (arg0 != 18648) {
                this.method134(-116);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)V", line = 97)
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            this.method3956(31);
        }
        ++field10049;
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Z", line = 108)
    public final boolean method3955(int arg0) {
        ++field10043;
        if (arg0 != -16181) {
            field10041 = 62;
        }
        if (super.field9224.method2294((byte) -125)) {
            return false;
        } else {
            return super.field9224.method2291(-11) == class565.field8012;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lhs;)V", line = 128)
    public class715(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILhs;)V", line = 135)
    public class715(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I", line = 138)
    public final int method135(int arg0) {
        ++field10042;
        int var2 = 46 % ((arg0 - -18) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)I", line = 148)
    public final int method3956(int arg0) {
        ++field10048;
        return arg0 != 3 ? -53 : super.field9223;
    }
}
