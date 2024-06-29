import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class106 extends class75 {

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "La;")
    private class1 field2636 = new class1();

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "La;")
    private class1 field2637 = new class1();

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    private int field2639 = -1;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()Lkf;")
    public final class75 method402() {
        return (class75) this.field2636.method3(false);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    private final void method876(int arg0) {
        for (class75 var2 = (class75) this.field2636.method3(false); var2 != null; var2 = (class75) this.field2636.method14(127)) {
            var2.method418(arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lkf;)V")
    public final synchronized void method877(class75 arg0) {
        this.field2636.method4(arg0, false);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "([III)V")
    private final void method878(int[] arg0, int arg1, int arg2) {
        for (class75 var4 = (class75) this.field2636.method3(false); var4 != null; var4 = (class75) this.field2636.method14(127)) {
            var4.method707(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()Lkf;")
    public final class75 method436() {
        return (class75) this.field2636.method14(127);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lkd;Lvb;)V")
    private final void method879(class73 arg0, class139 arg1) {
        while (this.field2637.field5 != arg0 && ((class139) arg0).field3329 <= arg1.field3329) {
            arg0 = arg0.field2038;
        }
        this.field2637.method2(arg1, 1, arg0);
        this.field2639 = ((class139) this.field2637.field5.field2038).field3329;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
    public final int method394() {
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lvb;)V")
    private final void method880(class139 arg0) {
        arg0.method691(0);
        arg0.method1123();
        class73 var2 = this.field2637.field5.field2038;
        if (this.field2637.field5 == var2) {
            this.field2639 = -1;
        } else {
            this.field2639 = ((class139) var2).field3329;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lkf;)V")
    public final synchronized void method881(class75 arg0) {
        arg0.method691(0);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "([III)V")
    public final synchronized void method404(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2639 < 0) {
                this.method878(arg0, arg1, arg2);
                return;
            }
            if (this.field2638 + arg2 < this.field2639) {
                this.field2638 += arg2;
                this.method878(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2639 - this.field2638;
            this.method878(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2638 += var4;
            this.method882();
            class139 var5 = (class139) this.field2637.method3(false);
            synchronized (var5) {
                int var7 = var5.method1122(this);
                if (var7 < 0) {
                    var5.field3329 = 0;
                    this.method880(var5);
                } else {
                    var5.field3329 = var7;
                    this.method879(var5.field2038, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public final synchronized void method418(int arg0) {
        do {
            if (this.field2639 < 0) {
                this.method876(arg0);
                return;
            }
            if (this.field2638 + arg0 < this.field2639) {
                this.field2638 += arg0;
                this.method876(arg0);
                return;
            }
            int var2 = this.field2639 - this.field2638;
            this.method876(var2);
            arg0 -= var2;
            this.field2638 += var2;
            this.method882();
            class139 var3 = (class139) this.field2637.method3(false);
            synchronized (var3) {
                int var5 = var3.method1122(this);
                if (var5 < 0) {
                    var3.field3329 = 0;
                    this.method880(var3);
                } else {
                    var3.field3329 = var5;
                    this.method879(var3.field2038, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
    private final void method882() {
        if (this.field2638 <= 0) {
            return;
        }
        for (class139 var1 = (class139) this.field2637.method3(false); var1 != null; var1 = (class139) this.field2637.method14(127)) {
            var1.field3329 -= this.field2638;
        }
        this.field2639 -= this.field2638;
        this.field2638 = 0;
    }
}
