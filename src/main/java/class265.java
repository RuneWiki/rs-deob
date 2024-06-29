import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class265 extends class629 {

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lbg;")
    private class464 field3800 = new class464();

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lbg;")
    private class464 field3801 = new class464();

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    private int field3802 = -1;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    private int field3803 = 0;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "()I")
    public final synchronized int method1727() {
        return this.field3800.method2764(64);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpda;)V")
    public final synchronized void method1728(class629 arg0) {
        this.field3800.method2769(arg0, -80);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()Lpda;")
    public final class629 method1361() {
        return (class629) this.field3800.method2765(-12261);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lm;Lqk;)V")
    private final void method1729(class189 arg0, class16 arg1) {
        while (this.field3801.field6565 != arg0 && ((class16) arg0).field270 <= arg1.field270) {
            arg0 = arg0.field2543;
        }
        class162.method1066((byte) -102, arg0, arg1);
        this.field3802 = ((class16) this.field3801.field6565.field2543).field270;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lqk;)V")
    private final void method1730(class16 arg0) {
        arg0.method1185(-76);
        arg0.method100();
        class189 var2 = this.field3801.field6565.field2543;
        if (this.field3801.field6565 == var2) {
            this.field3802 = -1;
        } else {
            this.field3802 = ((class16) var2).field270;
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "()V")
    private final void method1731() {
        if (this.field3803 <= 0) {
            return;
        }
        for (class16 var1 = (class16) this.field3801.method2765(-12261); var1 != null; var1 = (class16) this.field3801.method2759(-15361)) {
            var1.field270 -= this.field3803;
        }
        this.field3802 -= this.field3803;
        this.field3803 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()Lpda;")
    public final class629 method1400() {
        return (class629) this.field3800.method2759(-15361);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    private final void method1732(int arg0) {
        for (class629 var2 = (class629) this.field3800.method2765(-12261); var2 != null; var2 = (class629) this.field3800.method2759(-15361)) {
            var2.method1401(arg0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final synchronized void method1401(int arg0) {
        do {
            if (this.field3802 < 0) {
                this.method1732(arg0);
                return;
            }
            if (this.field3803 + arg0 < this.field3802) {
                this.field3803 += arg0;
                this.method1732(arg0);
                return;
            }
            int var2 = this.field3802 - this.field3803;
            this.method1732(var2);
            arg0 -= var2;
            this.field3803 += var2;
            this.method1731();
            class16 var3 = (class16) this.field3801.method2765(-12261);
            synchronized (var3) {
                int var5 = var3.method101(this);
                if (var5 < 0) {
                    var3.field270 = 0;
                    this.method1730(var3);
                } else {
                    var3.field270 = var5;
                    this.method1729(var3.field2543, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lpda;)V")
    public final synchronized void method1733(class629 arg0) {
        arg0.method1185(-92);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "([III)V")
    private final void method1734(int[] arg0, int arg1, int arg2) {
        for (class629 var4 = (class629) this.field3800.method2765(-12261); var4 != null; var4 = (class629) this.field3800.method2759(-15361)) {
            var4.method3517(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([III)V")
    public final synchronized void method1378(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3802 < 0) {
                this.method1734(arg0, arg1, arg2);
                return;
            }
            if (this.field3803 + arg2 < this.field3802) {
                this.field3803 += arg2;
                this.method1734(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3802 - this.field3803;
            this.method1734(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3803 += var4;
            this.method1731();
            class16 var5 = (class16) this.field3801.method2765(-12261);
            synchronized (var5) {
                int var7 = var5.method101(this);
                if (var7 < 0) {
                    var5.field270 = 0;
                    this.method1730(var5);
                } else {
                    var5.field270 = var7;
                    this.method1729(var5.field2543, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
    public final int method1382() {
        return 0;
    }
}
