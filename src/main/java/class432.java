import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class432 extends class117 {

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lkr;")
    private class486 field6045 = new class486();

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lkr;")
    private class486 field6046 = new class486();

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    private int field6048 = 0;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    private int field6047 = -1;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lah;Ljp;)V")
    private final void method2555(class238 arg0, class217 arg1) {
        while (this.field6046.field6838 != arg0 && ((class217) arg0).field3254 <= arg1.field3254) {
            arg0 = arg0.field3575;
        }
        class386.method2325(arg1, arg0, 111105159);
        this.field6047 = ((class217) this.field6046.field6838.field3575).field3254;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "()V")
    private final void method2556() {
        if (this.field6048 <= 0) {
            return;
        }
        for (class217 var1 = (class217) this.field6046.method2843(1123227612); var1 != null; var1 = (class217) this.field6046.method2842(1673506446)) {
            var1.field3254 -= this.field6048;
        }
        this.field6047 -= this.field6048;
        this.field6048 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljp;)V")
    private final void method2557(class217 arg0) {
        arg0.method1510((byte) -13);
        arg0.method1391();
        class238 var2 = this.field6046.field6838.field3575;
        if (this.field6046.field6838 == var2) {
            this.field6047 = -1;
        } else {
            this.field6047 = ((class217) var2).field3254;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final synchronized void method67(int arg0) {
        do {
            if (this.field6047 < 0) {
                this.method2558(arg0);
                return;
            }
            if (this.field6048 + arg0 < this.field6047) {
                this.field6048 += arg0;
                this.method2558(arg0);
                return;
            }
            int var2 = this.field6047 - this.field6048;
            this.method2558(var2);
            arg0 -= var2;
            this.field6048 += var2;
            this.method2556();
            class217 var3 = (class217) this.field6046.method2843(1123227612);
            synchronized (var3) {
                int var5 = var3.method1392(this);
                if (var5 < 0) {
                    var3.field3254 = 0;
                    this.method2557(var3);
                } else {
                    var3.field3254 = var5;
                    this.method2555(var3.field3575, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    private final void method2558(int arg0) {
        for (class117 var2 = (class117) this.field6045.method2843(1123227612); var2 != null; var2 = (class117) this.field6045.method2842(1673506446)) {
            var2.method67(arg0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()I")
    public final int method73() {
        return 0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([III)V")
    public final synchronized void method52(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6047 < 0) {
                this.method2560(arg0, arg1, arg2);
                return;
            }
            if (this.field6048 + arg2 < this.field6047) {
                this.field6048 += arg2;
                this.method2560(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6047 - this.field6048;
            this.method2560(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6048 += var4;
            this.method2556();
            class217 var5 = (class217) this.field6046.method2843(1123227612);
            synchronized (var5) {
                int var7 = var5.method1392(this);
                if (var7 < 0) {
                    var5.field3254 = 0;
                    this.method2557(var5);
                } else {
                    var5.field3254 = var7;
                    this.method2555(var5.field3575, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()Lme;")
    public final class117 method72() {
        return (class117) this.field6045.method2843(1123227612);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lme;)V")
    public final synchronized void method2559(class117 arg0) {
        this.field6045.method2846(arg0, 2048);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "([III)V")
    private final void method2560(int[] arg0, int arg1, int arg2) {
        for (class117 var4 = (class117) this.field6045.method2843(1123227612); var4 != null; var4 = (class117) this.field6045.method2842(1673506446)) {
            var4.method732(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()Lme;")
    public final class117 method48() {
        return (class117) this.field6045.method2842(1673506446);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lme;)V")
    public final synchronized void method2561(class117 arg0) {
        arg0.method1510((byte) -13);
    }
}
