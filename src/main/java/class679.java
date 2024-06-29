import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class679 extends class213 {

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lef;")
    private class513 field9845 = new class513();

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lef;")
    private class513 field9846 = new class513();

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    private int field9848 = 0;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    private int field9847 = -1;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()V", line = 6)
    private final void method4974() {
        if (this.field9848 <= 0) {
            return;
        }
        for (class658 var1 = (class658) this.field9846.method3863((byte) 64); var1 != null; var1 = (class658) this.field9846.method3862(-353)) {
            var1.field9498 -= this.field9848;
        }
        this.field9847 -= this.field9848;
        this.field9848 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()Lfq;", line = 24)
    public final class213 method1151() {
        return (class213) this.field9845.method3862(-353);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()I", line = 28)
    public final int method1152() {
        return 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lam;)V", line = 31)
    private final void method4975(class658 arg0) {
        arg0.method1824(1);
        arg0.method4828();
        class206 var2 = this.field9846.field7374.field3180;
        if (this.field9846.field7374 == var2) {
            this.field9847 = -1;
        } else {
            this.field9847 = ((class658) var2).field9498;
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()I", line = 45)
    public final synchronized int method4976() {
        return this.field9845.method3874(-32154);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([III)V", line = 55)
    public final synchronized void method1156(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field9847 < 0) {
                this.method4977(arg0, arg1, arg2);
                return;
            }
            if (this.field9848 + arg2 < this.field9847) {
                this.field9848 += arg2;
                this.method4977(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field9847 - this.field9848;
            this.method4977(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field9848 += var4;
            this.method4974();
            class658 var5 = (class658) this.field9846.method3863((byte) 64);
            synchronized (var5) {
                int var7 = var5.method4829(this);
                if (var7 < 0) {
                    var5.field9498 = 0;
                    this.method4975(var5);
                } else {
                    var5.field9498 = var7;
                    this.method4978(var5.field3180, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()Lfq;", line = 99)
    public final class213 method1158() {
        return (class213) this.field9845.method3863((byte) 64);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "([III)V", line = 104)
    private final void method4977(int[] arg0, int arg1, int arg2) {
        for (class213 var4 = (class213) this.field9845.method3863((byte) 64); var4 != null; var4 = (class213) this.field9845.method3862(-353)) {
            var4.method1871(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lme;Lam;)V", line = 115)
    private final void method4978(class206 arg0, class658 arg1) {
        while (this.field9846.field7374 != arg0 && ((class658) arg0).field9498 <= arg1.field9498) {
            arg0 = arg0.field3180;
        }
        class717.method5224(-86, arg0, arg1);
        this.field9847 = ((class658) this.field9846.field7374.field3180).field9498;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 126)
    public final synchronized void method1160(int arg0) {
        do {
            if (this.field9847 < 0) {
                this.method4979(arg0);
                return;
            }
            if (this.field9848 + arg0 < this.field9847) {
                this.field9848 += arg0;
                this.method4979(arg0);
                return;
            }
            int var2 = this.field9847 - this.field9848;
            this.method4979(var2);
            arg0 -= var2;
            this.field9848 += var2;
            this.method4974();
            class658 var3 = (class658) this.field9846.method3863((byte) 64);
            synchronized (var3) {
                int var5 = var3.method4829(this);
                if (var5 < 0) {
                    var3.field9498 = 0;
                    this.method4975(var3);
                } else {
                    var3.field9498 = var5;
                    this.method4978(var3.field3180, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 175)
    private final void method4979(int arg0) {
        for (class213 var2 = (class213) this.field9845.method3863((byte) 64); var2 != null; var2 = (class213) this.field9845.method3862(-353)) {
            var2.method1160(arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lfq;)V", line = 189)
    public final synchronized void method4980(class213 arg0) {
        arg0.method1824(1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfq;)V", line = 194)
    public final synchronized void method4981(class213 arg0) {
        this.field9845.method3876(false, arg0);
    }
}
