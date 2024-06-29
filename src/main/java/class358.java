import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class358 extends class659 {

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Ldc;")
    private class302 field5282 = new class302();

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Ldc;")
    private class302 field5283 = new class302();

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    private int field5284 = 0;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    private int field5285 = -1;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    private final void method2204(int arg0) {
        for (class659 var2 = (class659) this.field5282.method1904(false); var2 != null; var2 = (class659) this.field5282.method1901(112)) {
            var2.method526(arg0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "()Lac;")
    public final class659 method534() {
        return (class659) this.field5282.method1901(108);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lac;)V")
    public final synchronized void method2205(class659 arg0) {
        arg0.method2360((byte) 66);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([III)V")
    public final synchronized void method549(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5285 < 0) {
                this.method2209(arg0, arg1, arg2);
                return;
            }
            if (this.field5284 + arg2 < this.field5285) {
                this.field5284 += arg2;
                this.method2209(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5285 - this.field5284;
            this.method2209(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5284 += var4;
            this.method2210();
            class535 var5 = (class535) this.field5283.method1904(false);
            synchronized (var5) {
                int var7 = var5.method3091(this);
                if (var7 < 0) {
                    var5.field7851 = 0;
                    this.method2208(var5);
                } else {
                    var5.field7851 = var7;
                    this.method2207(var5.field5737, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lac;)V")
    public final synchronized void method2206(class659 arg0) {
        this.field5282.method1908(0, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()Lac;")
    public final class659 method531() {
        return (class659) this.field5282.method1904(false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ldu;Lpu;)V")
    private final void method2207(class381 arg0, class535 arg1) {
        while (this.field5283.field4475 != arg0 && ((class535) arg0).field7851 <= arg1.field7851) {
            arg0 = arg0.field5737;
        }
        class657.method3709(5888, arg1, arg0);
        this.field5285 = ((class535) this.field5283.field4475.field5737).field7851;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lpu;)V")
    private final void method2208(class535 arg0) {
        arg0.method2360((byte) 66);
        arg0.method3090();
        class381 var2 = this.field5283.field4475.field5737;
        if (this.field5283.field4475 == var2) {
            this.field5285 = -1;
        } else {
            this.field5285 = ((class535) var2).field7851;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public final synchronized void method526(int arg0) {
        do {
            if (this.field5285 < 0) {
                this.method2204(arg0);
                return;
            }
            if (this.field5284 + arg0 < this.field5285) {
                this.field5284 += arg0;
                this.method2204(arg0);
                return;
            }
            int var2 = this.field5285 - this.field5284;
            this.method2204(var2);
            arg0 -= var2;
            this.field5284 += var2;
            this.method2210();
            class535 var3 = (class535) this.field5283.method1904(false);
            synchronized (var3) {
                int var5 = var3.method3091(this);
                if (var5 < 0) {
                    var3.field7851 = 0;
                    this.method2208(var3);
                } else {
                    var3.field7851 = var5;
                    this.method2207(var3.field5737, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "([III)V")
    private final void method2209(int[] arg0, int arg1, int arg2) {
        for (class659 var4 = (class659) this.field5282.method1904(false); var4 != null; var4 = (class659) this.field5282.method1901(96)) {
            var4.method3712(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "()V")
    private final void method2210() {
        if (this.field5284 <= 0) {
            return;
        }
        for (class535 var1 = (class535) this.field5283.method1904(false); var1 != null; var1 = (class535) this.field5283.method1901(122)) {
            var1.field7851 -= this.field5284;
        }
        this.field5285 -= this.field5284;
        this.field5284 = 0;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()I")
    public final int method545() {
        return 0;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "()I")
    public final synchronized int method2211() {
        return this.field5282.method1907((byte) 119);
    }
}
