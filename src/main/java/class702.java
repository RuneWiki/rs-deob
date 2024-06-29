import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class702 extends class529 {

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "Lgk;")
    private class616 field9860 = new class616();

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "Lgk;")
    private class616 field9861 = new class616();

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    private int field9862 = -1;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "I")
    private int field9863 = 0;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lnj;)V")
    public final synchronized void method3885(class529 arg0) {
        arg0.method1922(86);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([III)V")
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field9862 < 0) {
                this.method3890(arg0, arg1, arg2);
                return;
            }
            if (this.field9863 + arg2 < this.field9862) {
                this.field9863 += arg2;
                this.method3890(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field9862 - this.field9863;
            this.method3890(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field9863 += var4;
            this.method3889();
            class28 var5 = (class28) this.field9861.method3434((byte) 2);
            synchronized (var5) {
                int var7 = var5.method153(this);
                if (var7 < 0) {
                    var5.field284 = 0;
                    this.method3892(var5);
                } else {
                    var5.field284 = var7;
                    this.method3886(var5.field4181, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lgga;Ljf;)V")
    private final void method3886(class333 arg0, class28 arg1) {
        while (this.field9861.field8677 != arg0 && ((class28) arg0).field284 <= arg1.field284) {
            arg0 = arg0.field4181;
        }
        class357.method2101(-128, arg0, arg1);
        this.field9862 = ((class28) this.field9861.field8677.field4181).field284;
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "()Lnj;")
    public final class529 method521() {
        return (class529) this.field9860.method3430(true);
    }

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "()I")
    public final synchronized int method3887() {
        return this.field9860.method3429((byte) -88);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    private final void method3888(int arg0) {
        for (class529 var2 = (class529) this.field9860.method3434((byte) 2); var2 != null; var2 = (class529) this.field9860.method3430(true)) {
            var2.method490(arg0);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "()Lnj;")
    public final class529 method505() {
        return (class529) this.field9860.method3434((byte) 2);
    }

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "()V")
    private final void method3889() {
        if (this.field9863 <= 0) {
            return;
        }
        for (class28 var1 = (class28) this.field9861.method3434((byte) 2); var1 != null; var1 = (class28) this.field9861.method3430(true)) {
            var1.field284 -= this.field9863;
        }
        this.field9862 -= this.field9863;
        this.field9863 = 0;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "([III)V")
    private final void method3890(int[] arg0, int arg1, int arg2) {
        for (class529 var4 = (class529) this.field9860.method3434((byte) 2); var4 != null; var4 = (class529) this.field9860.method3430(true)) {
            var4.method2974(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Lnj;)V")
    public final synchronized void method3891(class529 arg0) {
        this.field9860.method3437((byte) 94, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public final synchronized void method490(int arg0) {
        do {
            if (this.field9862 < 0) {
                this.method3888(arg0);
                return;
            }
            if (this.field9863 + arg0 < this.field9862) {
                this.field9863 += arg0;
                this.method3888(arg0);
                return;
            }
            int var2 = this.field9862 - this.field9863;
            this.method3888(var2);
            arg0 -= var2;
            this.field9863 += var2;
            this.method3889();
            class28 var3 = (class28) this.field9861.method3434((byte) 2);
            synchronized (var3) {
                int var5 = var3.method153(this);
                if (var5 < 0) {
                    var3.field284 = 0;
                    this.method3892(var3);
                } else {
                    var3.field284 = var5;
                    this.method3886(var3.field4181, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "()I")
    public final int method497() {
        return 0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljf;)V")
    private final void method3892(class28 arg0) {
        arg0.method1922(106);
        arg0.method152();
        class333 var2 = this.field9861.field8677.field4181;
        if (this.field9861.field8677 == var2) {
            this.field9862 = -1;
        } else {
            this.field9862 = ((class28) var2).field284;
        }
    }
}
