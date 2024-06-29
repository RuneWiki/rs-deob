import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class66 extends class313 {

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lnj;")
    private class317 field1018 = new class317();

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lnj;")
    private class317 field1019 = new class317();

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    private int field1020 = 0;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    private int field1021 = -1;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final synchronized void method383(int arg0) {
        do {
            if (this.field1021 < 0) {
                this.method481(arg0);
                return;
            }
            if (this.field1020 + arg0 < this.field1021) {
                this.field1020 += arg0;
                this.method481(arg0);
                return;
            }
            int var2 = this.field1021 - this.field1020;
            this.method481(var2);
            arg0 -= var2;
            this.field1020 += var2;
            this.method475();
            class366 var3 = (class366) this.field1019.method2123(-101);
            synchronized (var3) {
                int var5 = var3.method2402(this);
                if (var5 < 0) {
                    var3.field5661 = 0;
                    this.method477(var3);
                } else {
                    var3.field5661 = var5;
                    this.method478(var3.field7779, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
    public final synchronized void method408(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1021 < 0) {
                this.method476(arg0, arg1, arg2);
                return;
            }
            if (this.field1020 + arg2 < this.field1021) {
                this.field1020 += arg2;
                this.method476(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1021 - this.field1020;
            this.method476(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1020 += var4;
            this.method475();
            class366 var5 = (class366) this.field1019.method2123(-52);
            synchronized (var5) {
                int var7 = var5.method2402(this);
                if (var7 < 0) {
                    var5.field5661 = 0;
                    this.method477(var5);
                } else {
                    var5.field5661 = var7;
                    this.method478(var5.field7779, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
    private final void method475() {
        if (this.field1020 <= 0) {
            return;
        }
        for (class366 var1 = (class366) this.field1019.method2123(97); var1 != null; var1 = (class366) this.field1019.method2126((byte) 61)) {
            var1.field5661 -= this.field1020;
        }
        this.field1021 -= this.field1020;
        this.field1020 = 0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "([III)V")
    private final void method476(int[] arg0, int arg1, int arg2) {
        for (class313 var4 = (class313) this.field1018.method2123(73); var4 != null; var4 = (class313) this.field1018.method2126((byte) 61)) {
            var4.method2097(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqn;)V")
    private final void method477(class366 arg0) {
        arg0.method3149(60);
        arg0.method2401();
        class529 var2 = this.field1019.field4939.field7779;
        if (this.field1019.field4939 == var2) {
            this.field1021 = -1;
        } else {
            this.field1021 = ((class366) var2).field5661;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lwh;Lqn;)V")
    private final void method478(class529 arg0, class366 arg1) {
        while (this.field1019.field4939 != arg0 && ((class366) arg0).field5661 <= arg1.field5661) {
            arg0 = arg0.field7779;
        }
        class523.method3124(arg0, -1, arg1);
        this.field1021 = ((class366) this.field1019.field4939.field7779).field5661;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "()I")
    public final synchronized int method479() {
        return this.field1018.method2114((byte) -95);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lnu;)V")
    public final synchronized void method480(class313 arg0) {
        this.field1018.method2116(arg0, (byte) -96);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    private final void method481(int arg0) {
        for (class313 var2 = (class313) this.field1018.method2123(-123); var2 != null; var2 = (class313) this.field1018.method2126((byte) 61)) {
            var2.method383(arg0);
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()Lnu;")
    public final class313 method400() {
        return (class313) this.field1018.method2126((byte) 61);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()Lnu;")
    public final class313 method374() {
        return (class313) this.field1018.method2123(-27);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
    public final int method385() {
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Lnu;)V")
    public final synchronized void method482(class313 arg0) {
        arg0.method3149(85);
    }
}
