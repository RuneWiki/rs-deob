import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class764 extends class202 {

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Low;")
    private class665 field10575 = new class665();

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Low;")
    private class665 field10576 = new class665();

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    private int field10577 = -1;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    private int field10578 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()I")
    public final int method1418() {
        return 0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([III)V")
    public final synchronized void method1422(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field10577 < 0) {
                this.method4226(arg0, arg1, arg2);
                return;
            }
            if (this.field10578 + arg2 < this.field10577) {
                this.field10578 += arg2;
                this.method4226(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field10577 - this.field10578;
            this.method4226(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field10578 += var4;
            this.method4227();
            class559 var5 = (class559) this.field10576.method3731((byte) -128);
            synchronized (var5) {
                int var7 = var5.method3259(this);
                if (var7 < 0) {
                    var5.field7755 = 0;
                    this.method4225(var5);
                } else {
                    var5.field7755 = var7;
                    this.method4222(var5.field10591, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()Lfja;")
    public final class202 method1423() {
        return (class202) this.field10575.method3731((byte) -73);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfja;)V")
    public final synchronized void method4220(class202 arg0) {
        arg0.method4237(-1);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lfja;)V")
    public final synchronized void method4221(class202 arg0) {
        this.field10575.method3725(arg0, (byte) -57);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lit;Ljh;)V")
    private final void method4222(class766 arg0, class559 arg1) {
        while (this.field10576.field9375 != arg0 && ((class559) arg0).field7755 <= arg1.field7755) {
            arg0 = arg0.field10591;
        }
        class383.method2316(arg0, 121, arg1);
        this.field10577 = ((class559) this.field10576.field9375.field10591).field7755;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    private final void method4223(int arg0) {
        for (class202 var2 = (class202) this.field10575.method3731((byte) -89); var2 != null; var2 = (class202) this.field10575.method3729((byte) 77)) {
            var2.method1421(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()Lfja;")
    public final class202 method1420() {
        return (class202) this.field10575.method3729((byte) 67);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()I")
    public final synchronized int method4224() {
        return this.field10575.method3732(256);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljh;)V")
    private final void method4225(class559 arg0) {
        arg0.method4237(-1);
        arg0.method3258();
        class766 var2 = this.field10576.field9375.field10591;
        if (this.field10576.field9375 == var2) {
            this.field10577 = -1;
        } else {
            this.field10577 = ((class559) var2).field7755;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final synchronized void method1421(int arg0) {
        do {
            if (this.field10577 < 0) {
                this.method4223(arg0);
                return;
            }
            if (this.field10578 + arg0 < this.field10577) {
                this.field10578 += arg0;
                this.method4223(arg0);
                return;
            }
            int var2 = this.field10577 - this.field10578;
            this.method4223(var2);
            arg0 -= var2;
            this.field10578 += var2;
            this.method4227();
            class559 var3 = (class559) this.field10576.method3731((byte) -99);
            synchronized (var3) {
                int var5 = var3.method3259(this);
                if (var5 < 0) {
                    var3.field7755 = 0;
                    this.method4225(var3);
                } else {
                    var3.field7755 = var5;
                    this.method4222(var3.field10591, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "([III)V")
    private final void method4226(int[] arg0, int arg1, int arg2) {
        for (class202 var4 = (class202) this.field10575.method3731((byte) -118); var4 != null; var4 = (class202) this.field10575.method3729((byte) 117)) {
            var4.method1417(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "()V")
    private final void method4227() {
        if (this.field10578 <= 0) {
            return;
        }
        for (class559 var1 = (class559) this.field10576.method3731((byte) -67); var1 != null; var1 = (class559) this.field10576.method3729((byte) -117)) {
            var1.field7755 -= this.field10578;
        }
        this.field10577 -= this.field10578;
        this.field10578 = 0;
    }
}
