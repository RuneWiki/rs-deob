import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class349 extends class216 {

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "Ltg;")
    private class605 field5129 = new class605();

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "Ltg;")
    private class605 field5130 = new class605();

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    private int field5132 = 0;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    private int field5131 = -1;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "([III)V")
    private final void method2219(int[] arg0, int arg1, int arg2) {
        for (class216 var4 = (class216) this.field5129.method3463((byte) -50); var4 != null; var4 = (class216) this.field5129.method3469((byte) 107)) {
            var4.method1554(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "([III)V")
    public final synchronized void method563(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5131 < 0) {
                this.method2219(arg0, arg1, arg2);
                return;
            }
            if (this.field5132 + arg2 < this.field5131) {
                this.field5132 += arg2;
                this.method2219(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5131 - this.field5132;
            this.method2219(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5132 += var4;
            this.method2221();
            class479 var5 = (class479) this.field5130.method3463((byte) -50);
            synchronized (var5) {
                int var7 = var5.method2910(this);
                if (var7 < 0) {
                    var5.field6942 = 0;
                    this.method2220(var5);
                } else {
                    var5.field6942 = var7;
                    this.method2225(var5.field1044, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "()I")
    public final int method552() {
        return 0;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lkp;)V")
    private final void method2220(class479 arg0) {
        arg0.method636((byte) 97);
        arg0.method2909();
        class65 var2 = this.field5130.field8547.field1044;
        if (this.field5130.field8547 == var2) {
            this.field5131 = -1;
        } else {
            this.field5131 = ((class479) var2).field6942;
        }
    }

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "()V")
    private final void method2221() {
        if (this.field5132 <= 0) {
            return;
        }
        for (class479 var1 = (class479) this.field5130.method3463((byte) -50); var1 != null; var1 = (class479) this.field5130.method3469((byte) 107)) {
            var1.field6942 -= this.field5132;
        }
        this.field5131 -= this.field5132;
        this.field5132 = 0;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
    private final void method2222(int arg0) {
        for (class216 var2 = (class216) this.field5129.method3463((byte) -50); var2 != null; var2 = (class216) this.field5129.method3469((byte) 107)) {
            var2.method568(arg0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Laca;)V")
    public final synchronized void method2223(class216 arg0) {
        arg0.method636((byte) 97);
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "()Laca;")
    public final class216 method531() {
        return (class216) this.field5129.method3469((byte) 107);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "()Laca;")
    public final class216 method532() {
        return (class216) this.field5129.method3463((byte) -50);
    }

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "()I")
    public final synchronized int method2224() {
        return this.field5129.method3467(25623);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final synchronized void method568(int arg0) {
        do {
            if (this.field5131 < 0) {
                this.method2222(arg0);
                return;
            }
            if (this.field5132 + arg0 < this.field5131) {
                this.field5132 += arg0;
                this.method2222(arg0);
                return;
            }
            int var2 = this.field5131 - this.field5132;
            this.method2222(var2);
            arg0 -= var2;
            this.field5132 += var2;
            this.method2221();
            class479 var3 = (class479) this.field5130.method3463((byte) -50);
            synchronized (var3) {
                int var5 = var3.method2910(this);
                if (var5 < 0) {
                    var3.field6942 = 0;
                    this.method2220(var3);
                } else {
                    var3.field6942 = var5;
                    this.method2225(var3.field1044, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lds;Lkp;)V")
    private final void method2225(class65 arg0, class479 arg1) {
        while (this.field5130.field8547 != arg0 && ((class479) arg0).field6942 <= arg1.field6942) {
            arg0 = arg0.field1044;
        }
        class357.method2283((byte) -126, arg0, arg1);
        this.field5131 = ((class479) this.field5130.field8547.field1044).field6942;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(Laca;)V")
    public final synchronized void method2226(class216 arg0) {
        this.field5129.method3474(1807, arg0);
    }
}
