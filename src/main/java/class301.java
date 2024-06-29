import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class301 extends class515 {

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "Lat;")
    private class398 field4866 = new class398();

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "Lat;")
    private class398 field4867 = new class398();

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    private int field4868 = 0;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    private int field4869 = -1;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()Lef;")
    public final class515 method1136() {
        return (class515) this.field4866.method3216(true);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "([III)V")
    public final synchronized void method1097(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4869 < 0) {
                this.method2590(arg0, arg1, arg2);
                return;
            }
            if (this.field4868 + arg2 < this.field4869) {
                this.field4868 += arg2;
                this.method2590(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4869 - this.field4868;
            this.method2590(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4868 += var4;
            this.method2592();
            class604 var5 = (class604) this.field4867.method3228(11);
            synchronized (var5) {
                int var7 = var5.method4420(this);
                if (var7 < 0) {
                    var5.field8718 = 0;
                    this.method2595(var5);
                } else {
                    var5.field8718 = var7;
                    this.method2593(var5.field8249, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "([III)V")
    private final void method2590(int[] arg0, int arg1, int arg2) {
        for (class515 var4 = (class515) this.field4866.method3228(11); var4 != null; var4 = (class515) this.field4866.method3216(true)) {
            var4.method3863(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    private final void method2591(int arg0) {
        for (class515 var2 = (class515) this.field4866.method3228(11); var2 != null; var2 = (class515) this.field4866.method3216(true)) {
            var2.method1116(arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()V")
    private final void method2592() {
        if (this.field4868 <= 0) {
            return;
        }
        for (class604 var1 = (class604) this.field4867.method3228(11); var1 != null; var1 = (class604) this.field4867.method3216(true)) {
            var1.field8718 -= this.field4868;
        }
        this.field4869 -= this.field4868;
        this.field4868 = 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lac;Lnf;)V")
    private final void method2593(class568 arg0, class604 arg1) {
        while (this.field4867.field6307 != arg0 && ((class604) arg0).field8718 <= arg1.field8718) {
            arg0 = arg0.field8249;
        }
        class263.method2288(arg0, arg1, (byte) -97);
        this.field4869 = ((class604) this.field4867.field6307.field8249).field8718;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lef;)V")
    public final synchronized void method2594(class515 arg0) {
        arg0.method4173(-1);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
    public final int method1108() {
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final synchronized void method1116(int arg0) {
        do {
            if (this.field4869 < 0) {
                this.method2591(arg0);
                return;
            }
            if (this.field4868 + arg0 < this.field4869) {
                this.field4868 += arg0;
                this.method2591(arg0);
                return;
            }
            int var2 = this.field4869 - this.field4868;
            this.method2591(var2);
            arg0 -= var2;
            this.field4868 += var2;
            this.method2592();
            class604 var3 = (class604) this.field4867.method3228(11);
            synchronized (var3) {
                int var5 = var3.method4420(this);
                if (var5 < 0) {
                    var3.field8718 = 0;
                    this.method2595(var3);
                } else {
                    var3.field8718 = var5;
                    this.method2593(var3.field8249, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lnf;)V")
    private final void method2595(class604 arg0) {
        arg0.method4173(-1);
        arg0.method4419();
        class568 var2 = this.field4867.field6307.field8249;
        if (this.field4867.field6307 == var2) {
            this.field4869 = -1;
        } else {
            this.field4869 = ((class604) var2).field8718;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lef;)V")
    public final synchronized void method2596(class515 arg0) {
        this.field4866.method3221(arg0, (byte) 81);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()I")
    public final synchronized int method2597() {
        return this.field4866.method3222(false);
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()Lef;")
    public final class515 method1134() {
        return (class515) this.field4866.method3228(11);
    }
}
