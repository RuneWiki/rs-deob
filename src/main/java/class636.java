import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class636 extends class170 {

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Lmr;")
    private class611 field8972 = new class611();

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Lmr;")
    private class611 field8973 = new class611();

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    private int field8974 = 0;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    private int field8975 = -1;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "()Los;")
    public final class170 method1086() {
        return (class170) this.field8972.method3561((byte) 116);
    }

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "()I")
    public final int method1054() {
        return 0;
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "()Los;")
    public final class170 method1065() {
        return (class170) this.field8972.method3565(-73);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Los;)V")
    public final synchronized void method3652(class170 arg0) {
        arg0.method2656((byte) 121);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public final synchronized void method1083(int arg0) {
        do {
            if (this.field8975 < 0) {
                this.method3658(arg0);
                return;
            }
            if (this.field8974 + arg0 < this.field8975) {
                this.field8974 += arg0;
                this.method3658(arg0);
                return;
            }
            int var2 = this.field8975 - this.field8974;
            this.method3658(var2);
            arg0 -= var2;
            this.field8974 += var2;
            this.method3656();
            class480 var3 = (class480) this.field8973.method3565(-35);
            synchronized (var3) {
                int var5 = var3.method2928(this);
                if (var5 < 0) {
                    var3.field6866 = 0;
                    this.method3659(var3);
                } else {
                    var3.field6866 = var5;
                    this.method3655(var3.field6189, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "([III)V")
    private final void method3653(int[] arg0, int arg1, int arg2) {
        for (class170 var4 = (class170) this.field8972.method3565(105); var4 != null; var4 = (class170) this.field8972.method3561((byte) 102)) {
            var4.method1214(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "()I")
    public final synchronized int method3654() {
        return this.field8972.method3557(-93);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lqm;Lkp;)V")
    private final void method3655(class430 arg0, class480 arg1) {
        while (this.field8973.field8734 != arg0 && ((class480) arg0).field6866 <= arg1.field6866) {
            arg0 = arg0.field6189;
        }
        class527.method3191(arg1, arg0, -99);
        this.field8975 = ((class480) this.field8973.field8734.field6189).field6866;
    }

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "()V")
    private final void method3656() {
        if (this.field8974 <= 0) {
            return;
        }
        for (class480 var1 = (class480) this.field8973.method3565(-16); var1 != null; var1 = (class480) this.field8973.method3561((byte) 46)) {
            var1.field6866 -= this.field8974;
        }
        this.field8975 -= this.field8974;
        this.field8974 = 0;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([III)V")
    public final synchronized void method1088(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field8975 < 0) {
                this.method3653(arg0, arg1, arg2);
                return;
            }
            if (this.field8974 + arg2 < this.field8975) {
                this.field8974 += arg2;
                this.method3653(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field8975 - this.field8974;
            this.method3653(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field8974 += var4;
            this.method3656();
            class480 var5 = (class480) this.field8973.method3565(-18);
            synchronized (var5) {
                int var7 = var5.method2928(this);
                if (var7 < 0) {
                    var5.field6866 = 0;
                    this.method3659(var5);
                } else {
                    var5.field6866 = var7;
                    this.method3655(var5.field6189, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(Los;)V")
    public final synchronized void method3657(class170 arg0) {
        this.field8972.method3558(0, arg0);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    private final void method3658(int arg0) {
        for (class170 var2 = (class170) this.field8972.method3565(113); var2 != null; var2 = (class170) this.field8972.method3561((byte) 115)) {
            var2.method1083(arg0);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lkp;)V")
    private final void method3659(class480 arg0) {
        arg0.method2656((byte) 125);
        arg0.method2929();
        class430 var2 = this.field8973.field8734.field6189;
        if (this.field8973.field8734 == var2) {
            this.field8975 = -1;
        } else {
            this.field8975 = ((class480) var2).field6866;
        }
    }
}
