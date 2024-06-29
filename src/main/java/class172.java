import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class172 extends class147 {

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lli;")
    private class277 field3133 = new class277();

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lli;")
    private class277 field3134 = new class277();

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    private int field3135 = 0;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    private int field3136 = -1;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lfj;Lcc;)V")
    private final void method1131(class241 arg0, class203 arg1) {
        while (this.field3134.field4838 != arg0 && ((class203) arg0).field3653 <= arg1.field3653) {
            arg0 = arg0.field4235;
        }
        class217.method1482(arg1, 91, arg0);
        this.field3136 = ((class203) this.field3134.field4838.field4235).field3653;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()Lv;")
    public final class147 method747() {
        return (class147) this.field3133.method1878(true);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()V")
    private final void method1132() {
        if (this.field3135 <= 0) {
            return;
        }
        for (class203 var1 = (class203) this.field3134.method1878(true); var1 != null; var1 = (class203) this.field3134.method1881(-107)) {
            var1.field3653 -= this.field3135;
        }
        this.field3136 -= this.field3135;
        this.field3135 = 0;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public final synchronized void method744(int arg0) {
        do {
            if (this.field3136 < 0) {
                this.method1135(arg0);
                return;
            }
            if (this.field3135 + arg0 < this.field3136) {
                this.field3135 += arg0;
                this.method1135(arg0);
                return;
            }
            int var2 = this.field3136 - this.field3135;
            this.method1135(var2);
            arg0 -= var2;
            this.field3135 += var2;
            this.method1132();
            class203 var3 = (class203) this.field3134.method1878(true);
            synchronized (var3) {
                int var5 = var3.method1404(this);
                if (var5 < 0) {
                    var3.field3653 = 0;
                    this.method1137(var3);
                } else {
                    var3.field3653 = var5;
                    this.method1131(var3.field4235, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "([III)V")
    private final void method1133(int[] arg0, int arg1, int arg2) {
        for (class147 var4 = (class147) this.field3133.method1878(true); var4 != null; var4 = (class147) this.field3133.method1881(-44)) {
            var4.method965(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lv;)V")
    public final synchronized void method1134(class147 arg0) {
        this.field3133.method1880((byte) -86, arg0);
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    private final void method1135(int arg0) {
        for (class147 var2 = (class147) this.field3133.method1878(true); var2 != null; var2 = (class147) this.field3133.method1881(-26)) {
            var2.method744(arg0);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([III)V")
    public final synchronized void method748(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3136 < 0) {
                this.method1133(arg0, arg1, arg2);
                return;
            }
            if (this.field3135 + arg2 < this.field3136) {
                this.field3135 += arg2;
                this.method1133(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3136 - this.field3135;
            this.method1133(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3135 += var4;
            this.method1132();
            class203 var5 = (class203) this.field3134.method1878(true);
            synchronized (var5) {
                int var7 = var5.method1404(this);
                if (var7 < 0) {
                    var5.field3653 = 0;
                    this.method1137(var5);
                } else {
                    var5.field3653 = var7;
                    this.method1131(var5.field4235, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Lv;)V")
    public final synchronized void method1136(class147 arg0) {
        arg0.method1614(-1204826926);
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()I")
    public final int method741() {
        return 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lcc;)V")
    private final void method1137(class203 arg0) {
        arg0.method1614(-1204826926);
        arg0.method1403();
        class241 var2 = this.field3134.field4838.field4235;
        if (this.field3134.field4838 == var2) {
            this.field3136 = -1;
        } else {
            this.field3136 = ((class203) var2).field3653;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()Lv;")
    public final class147 method742() {
        return (class147) this.field3133.method1881(90);
    }
}
