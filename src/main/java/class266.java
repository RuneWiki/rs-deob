import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class266 extends class581 {

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "Lro;")
    private class2 field3701 = new class2();

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Lro;")
    private class2 field3702 = new class2();

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    private int field3703 = 0;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    private int field3704 = -1;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lhq;)V")
    private final void method1606(class160 arg0) {
        arg0.method3564(true);
        arg0.method1147();
        class656 var2 = this.field3702.field24.field8677;
        if (this.field3702.field24 == var2) {
            this.field3704 = -1;
        } else {
            this.field3704 = ((class160) var2).field2400;
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "()Lgu;")
    public final class581 method33() {
        return (class581) this.field3701.method21(2);
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "([III)V")
    private final void method1607(int[] arg0, int arg1, int arg2) {
        for (class581 var4 = (class581) this.field3701.method21(2); var4 != null; var4 = (class581) this.field3701.method9(-127)) {
            var4.method3182(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lgu;)V")
    public final synchronized void method1608(class581 arg0) {
        this.field3701.method13(arg0, 593);
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "()I")
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "()I")
    public final synchronized int method1609() {
        return this.field3701.method14(0);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "([III)V")
    public final synchronized void method26(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3704 < 0) {
                this.method1607(arg0, arg1, arg2);
                return;
            }
            if (this.field3703 + arg2 < this.field3704) {
                this.field3703 += arg2;
                this.method1607(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3704 - this.field3703;
            this.method1607(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3703 += var4;
            this.method1613();
            class160 var5 = (class160) this.field3702.method21(2);
            synchronized (var5) {
                int var7 = var5.method1146(this);
                if (var7 < 0) {
                    var5.field2400 = 0;
                    this.method1606(var5);
                } else {
                    var5.field2400 = var7;
                    this.method1611(var5.field8677, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
    private final void method1610(int arg0) {
        for (class581 var2 = (class581) this.field3701.method21(2); var2 != null; var2 = (class581) this.field3701.method9(-127)) {
            var2.method60(arg0);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lpb;Lhq;)V")
    private final void method1611(class656 arg0, class160 arg1) {
        while (this.field3702.field24 != arg0 && ((class160) arg0).field2400 <= arg1.field2400) {
            arg0 = arg0.field8677;
        }
        class499.method2814(arg0, (byte) 83, arg1);
        this.field3704 = ((class160) this.field3702.field24.field8677).field2400;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public final synchronized void method60(int arg0) {
        do {
            if (this.field3704 < 0) {
                this.method1610(arg0);
                return;
            }
            if (this.field3703 + arg0 < this.field3704) {
                this.field3703 += arg0;
                this.method1610(arg0);
                return;
            }
            int var2 = this.field3704 - this.field3703;
            this.method1610(var2);
            arg0 -= var2;
            this.field3703 += var2;
            this.method1613();
            class160 var3 = (class160) this.field3702.method21(2);
            synchronized (var3) {
                int var5 = var3.method1146(this);
                if (var5 < 0) {
                    var3.field2400 = 0;
                    this.method1606(var3);
                } else {
                    var3.field2400 = var5;
                    this.method1611(var3.field8677, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Lgu;)V")
    public final synchronized void method1612(class581 arg0) {
        arg0.method3564(true);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "()Lgu;")
    public final class581 method53() {
        return (class581) this.field3701.method9(-128);
    }

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "()V")
    private final void method1613() {
        if (this.field3703 <= 0) {
            return;
        }
        for (class160 var1 = (class160) this.field3702.method21(2); var1 != null; var1 = (class160) this.field3702.method9(-128)) {
            var1.field2400 -= this.field3703;
        }
        this.field3704 -= this.field3703;
        this.field3703 = 0;
    }
}
