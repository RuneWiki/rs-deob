import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class392 {

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lqp;")
    private class609 field5808 = new class609();

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field5800 = -1;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lqp;")
    private class609 field5809;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 11)
    public final void method2409(int arg0) {
        while (true) {
            class609 var2 = this.field5808.field8562;
            if (this.field5808 == var2) {
                field5806++;
                this.field5809 = null;
                if (arg0 <= 80) {
                    this.method2412(false);
                    return;
                }
                return;
            }
            var2.method3414(0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I", line = 33)
    public static final int method2410(int arg0, int arg1, int arg2, int arg3) {
        field5804++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (arg3 == var4) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Z", line = 52)
    public final boolean method2411(byte arg0) {
        if (arg0 >= -41) {
            this.field5809 = null;
        }
        field5807++;
        return this.field5808.field8562 == this.field5808;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lqp;", line = 67)
    public final class609 method2412(boolean arg0) {
        if (!arg0) {
            this.method2411((byte) -49);
        }
        field5803++;
        class609 var2 = this.field5808.field8563;
        if (this.field5808 == var2) {
            this.field5809 = null;
            return null;
        } else {
            this.field5809 = var2.field8563;
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lqp;B)V", line = 87)
    public final void method2413(class609 arg0, byte arg1) {
        field5805++;
        if (arg1 < 95) {
            this.method2417(true);
        }
        if (arg0.field8563 != null) {
            arg0.method3414(0);
        }
        arg0.field8563 = this.field5808.field8563;
        arg0.field8562 = this.field5808;
        arg0.field8563.field8562 = arg0;
        arg0.field8562.field8563 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)Lqp;", line = 106)
    public final class609 method2414(boolean arg0) {
        field5798++;
        if (!arg0) {
            method2410(-110, -111, -115, 3);
        }
        class609 var2 = this.field5809;
        if (this.field5808 == var2) {
            this.field5809 = null;
            return null;
        } else {
            this.field5809 = var2.field8562;
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lqp;", line = 133)
    public final class609 method2415(int arg0) {
        field5801++;
        class609 var2 = this.field5808.field8562;
        if (this.field5808 == var2) {
            return null;
        }
        if (arg0 > -127) {
            this.field5808 = null;
        }
        var2.method3414(0);
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)I", line = 150)
    public final int method2416(int arg0) {
        field5799++;
        int var2 = 0;
        if (arg0 == 23609) {
            for (class609 var3 = this.field5808.field8562; var3 != this.field5808; var3 = var3.field8562) {
                var2++;
            }
            return var2;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)Lqp;", line = 172)
    public final class609 method2417(boolean arg0) {
        field5810++;
        class609 var2 = this.field5808.field8562;
        if (this.field5808 == var2) {
            this.field5809 = null;
            return null;
        }
        if (arg0) {
            field5800 = 116;
        }
        this.field5809 = var2.field8562;
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 198)
    public class392() {
        this.field5808.field8563 = this.field5808;
        this.field5808.field8562 = this.field5808;
    }
}
