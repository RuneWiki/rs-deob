import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class646 {

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "Lqj;")
    private class535 field8706 = new class535(64);

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "Lqj;")
    public class535 field8717 = new class535(50);

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "Lqj;")
    public class535 field8718 = new class535(5);

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "Lkw;")
    public class263 field8701;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "Luq;")
    private class172 field8704;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "Z")
    public boolean field8709;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "Luq;")
    public class172 field8715;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field8702 = 0;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
    public int field8719;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "[I")
    public static int[] field8703;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 7)
    public final void method3580(int arg0) {
        class535 var2 = this.field8706;
        synchronized (this.field8706) {
            this.field8706.method3113(-128);
        }
        field8711++;
        class535 var3 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3113(-127);
        }
        class535 var4 = this.field8718;
        synchronized (this.field8718) {
            this.field8718.method3113(-127);
            if (arg0 != -12) {
                this.method3582((byte) 101, true);
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V", line = 30)
    public final void method3581(int arg0, int arg1) {
        field8707++;
        class535 var3 = this.field8706;
        synchronized (this.field8706) {
            this.field8706.method3101(false, arg1);
        }
        class535 var4 = this.field8717;
        synchronized (this.field8717) {
            if (arg0 != -11153) {
                field8702 = -80;
            }
            this.field8717.method3101(false, arg1);
        }
        class535 var5 = this.field8718;
        synchronized (this.field8718) {
            this.field8718.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BZ)V", line = 49)
    public final void method3582(byte arg0, boolean arg1) {
        field8710++;
        if (this.field8709 != arg1) {
            this.field8709 = arg1;
            int var3 = -119 % ((-arg0 - 25) / 44);
            this.method3586(-110);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method3583(int arg0, int arg1, int arg2) {
        field8712++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class412 var3 = class210.field2705.method1362(0, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        if (arg1 < 9) {
            field8703 = null;
        }
        return var3.method2479(arg2, -4);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V", line = 87)
    public final void method3584(byte arg0) {
        class535 var2 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3103(-11294);
        }
        field8714++;
        class535 var3 = this.field8718;
        synchronized (this.field8718) {
            this.field8718.method3103(-11294);
        }
        if (arg0 >= -87) {
            this.field8717 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V", line = 103)
    public final void method3585(int arg0, int arg1) {
        field8713++;
        this.field8719 = arg0;
        class535 var3 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3103(arg1 - 11294);
        }
        if (arg1 != 0) {
            this.field8704 = null;
        }
        class535 var4 = this.field8718;
        synchronized (this.field8718) {
            this.field8718.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V", line = 125)
    public final void method3586(int arg0) {
        if (arg0 >= -26) {
            this.field8715 = null;
        }
        class535 var2 = this.field8706;
        synchronized (this.field8706) {
            this.field8706.method3103(-11294);
        }
        field8716++;
        class535 var3 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3103(-11294);
        }
        class535 var4 = this.field8718;
        synchronized (this.field8718) {
            this.field8718.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)Loaa;", line = 145)
    public final class304 method3587(int arg0, int arg1) {
        field8705++;
        class535 var3 = this.field8706;
        class304 var4;
        synchronized (this.field8706) {
            var4 = (class304) this.field8706.method3109((byte) 120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field8704;
        byte[] var6;
        synchronized (this.field8704) {
            var6 = this.field8704.method1188(class382.method2371(-16, arg0), -18047, class268.method1787((byte) -58, arg0));
        }
        if (arg1 != 0) {
            this.method3582((byte) 17, true);
        }
        class304 var7 = new class304();
        var7.field4326 = this;
        var7.field4272 = arg0;
        if (var6 != null) {
            var7.method1964(new class254(var6), (byte) 112);
        }
        var7.method1967((byte) 20);
        class535 var8 = this.field8706;
        synchronized (this.field8706) {
            this.field8706.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)V", line = 183)
    public static void method3588(boolean arg0) {
        if (arg0) {
            field8703 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lkw;IZLuq;Luq;)V", line = 205)
    public class646(class263 arg0, int arg1, boolean arg2, class172 arg3, class172 arg4) {
        this.field8701 = arg0;
        this.field8704 = arg3;
        this.field8709 = arg2;
        this.field8715 = arg4;
        if (this.field8704 != null) {
            int var6 = this.field8704.method1193(true) - 1;
            this.field8704.method1175(var6, (byte) 122);
        }
    }
}
