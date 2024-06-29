import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class107 extends class145 {

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lqd;")
    private class148 field2425 = new class148();

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Lqd;")
    private class148 field2426 = new class148();

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    private int field2427 = -1;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    private int field2428 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqa;)V")
    public final synchronized void method869(class145 arg0) {
        arg0.method1172(-35);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    private final void method870(int arg0) {
        for (class145 var2 = (class145) this.field2425.method1033(0); var2 != null; var2 = (class145) this.field2425.method1035(0)) {
            var2.method396(arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lke;)V")
    private final void method871(class95 arg0) {
        arg0.method1172(-21);
        arg0.method827();
        class176 var2 = this.field2426.field3112.field3611;
        if (this.field2426.field3112 == var2) {
            this.field2427 = -1;
        } else {
            this.field2427 = ((class95) var2).field2267;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "()I")
    public final int method404() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lte;Lke;)V")
    private final void method872(class176 arg0, class95 arg1) {
        while (this.field2426.field3112 != arg0 && ((class95) arg0).field2267 <= arg1.field2267) {
            arg0 = arg0.field3611;
        }
        this.field2426.method1039(arg0, -123, arg1);
        this.field2427 = ((class95) this.field2426.field3112.field3611).field2267;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final synchronized void method396(int arg0) {
        do {
            if (this.field2427 < 0) {
                this.method870(arg0);
                return;
            }
            if (this.field2428 + arg0 < this.field2427) {
                this.field2428 += arg0;
                this.method870(arg0);
                return;
            }
            int var2 = this.field2427 - this.field2428;
            this.method870(var2);
            arg0 -= var2;
            this.field2428 += var2;
            this.method874();
            class95 var3 = (class95) this.field2426.method1033(0);
            synchronized (var3) {
                int var5 = var3.method828(this);
                if (var5 < 0) {
                    var3.field2267 = 0;
                    this.method871(var3);
                } else {
                    var3.field2267 = var5;
                    this.method872(var3.field3611, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()Lqa;")
    public final class145 method373() {
        return (class145) this.field2425.method1035(0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([III)V")
    public final synchronized void method375(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2427 < 0) {
                this.method875(arg0, arg1, arg2);
                return;
            }
            if (this.field2428 + arg2 < this.field2427) {
                this.field2428 += arg2;
                this.method875(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2427 - this.field2428;
            this.method875(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2428 += var4;
            this.method874();
            class95 var5 = (class95) this.field2426.method1033(0);
            synchronized (var5) {
                int var7 = var5.method828(this);
                if (var7 < 0) {
                    var5.field2267 = 0;
                    this.method871(var5);
                } else {
                    var5.field2267 = var7;
                    this.method872(var5.field3611, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Lqa;)V")
    public final synchronized void method873(class145 arg0) {
        this.field2425.method1038(0, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "()V")
    private final void method874() {
        if (this.field2428 <= 0) {
            return;
        }
        for (class95 var1 = (class95) this.field2426.method1033(0); var1 != null; var1 = (class95) this.field2426.method1035(0)) {
            var1.field2267 -= this.field2428;
        }
        this.field2427 -= this.field2428;
        this.field2428 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()Lqa;")
    public final class145 method378() {
        return (class145) this.field2425.method1033(0);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "([III)V")
    private final void method875(int[] arg0, int arg1, int arg2) {
        for (class145 var4 = (class145) this.field2425.method1033(0); var4 != null; var4 = (class145) this.field2425.method1035(0)) {
            var4.method1027(arg0, arg1, arg2);
        }
    }
}
