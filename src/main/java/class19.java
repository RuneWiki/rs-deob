import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 extends class244 {

    @OriginalMember(owner = "client!be", name = "x", descriptor = "La;")
    private class281 field215 = new class281();

    @OriginalMember(owner = "client!be", name = "y", descriptor = "La;")
    private class281 field216 = new class281();

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    private int field217 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V", line = 7)
    public final synchronized void method140(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field218 < 0) {
                this.method148(arg0, arg1, arg2);
                return;
            }
            if (this.field217 + arg2 < this.field218) {
                this.field217 += arg2;
                this.method148(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field218 - this.field217;
            this.method148(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field217 += var4;
            this.method141();
            class246 var5 = (class246) this.field216.method1954(-66);
            synchronized (var5) {
                int var7 = var5.method1688(this);
                if (var7 < 0) {
                    var5.field3718 = 0;
                    this.method150(var5);
                } else {
                    var5.field3718 = var7;
                    this.method151(var5.field81, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 53)
    private final void method141() {
        if (this.field217 <= 0) {
            return;
        }
        for (class246 var1 = (class246) this.field216.method1954(-66); var1 != null; var1 = (class246) this.field216.method1950((byte) 123)) {
            var1.field3718 -= this.field217;
        }
        this.field218 -= this.field217;
        this.field217 = 0;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()Lmd;", line = 70)
    public final class244 method142() {
        return (class244) this.field215.method1950((byte) 93);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 75)
    private final void method143(int arg0) {
        for (class244 var2 = (class244) this.field215.method1954(-66); var2 != null; var2 = (class244) this.field215.method1950((byte) 113)) {
            var2.method149(arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lmd;)V", line = 87)
    public final synchronized void method144(class244 arg0) {
        this.field215.method1949(arg0, (byte) 91);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()Lmd;", line = 91)
    public final class244 method145() {
        return (class244) this.field215.method1954(-66);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()I", line = 94)
    public final int method146() {
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Lmd;)V", line = 100)
    public final synchronized void method147(class244 arg0) {
        arg0.method39(10717);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "([III)V", line = 106)
    private final void method148(int[] arg0, int arg1, int arg2) {
        for (class244 var4 = (class244) this.field215.method1954(-66); var4 != null; var4 = (class244) this.field215.method1950((byte) 92)) {
            var4.method1682(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 121)
    public final synchronized void method149(int arg0) {
        do {
            if (this.field218 < 0) {
                this.method143(arg0);
                return;
            }
            if (this.field217 + arg0 < this.field218) {
                this.field217 += arg0;
                this.method143(arg0);
                return;
            }
            int var2 = this.field218 - this.field217;
            this.method143(var2);
            arg0 -= var2;
            this.field217 += var2;
            this.method141();
            class246 var3 = (class246) this.field216.method1954(-66);
            synchronized (var3) {
                int var5 = var3.method1688(this);
                if (var5 < 0) {
                    var3.field3718 = 0;
                    this.method150(var3);
                } else {
                    var3.field3718 = var5;
                    this.method151(var3.field81, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lea;)V", line = 166)
    private final void method150(class246 arg0) {
        arg0.method39(10717);
        arg0.method1689();
        class5 var2 = this.field216.field4370.field81;
        if (this.field216.field4370 == var2) {
            this.field218 = -1;
        } else {
            this.field218 = ((class246) var2).field3718;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lma;Lea;)V", line = 180)
    private final void method151(class5 arg0, class246 arg1) {
        while (this.field216.field4370 != arg0 && ((class246) arg0).field3718 <= arg1.field3718) {
            arg0 = arg0.field81;
        }
        class270.method1892(arg1, 20459, arg0);
        this.field218 = ((class246) this.field216.field4370.field81).field3718;
    }
}
