import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class198 extends class79 {

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lcb;")
    private class22 field3883 = new class22();

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lcb;")
    private class22 field3884 = new class22();

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    private int field3885 = -1;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field3886 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V")
    public final synchronized void method482(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3885 < 0) {
                this.method1297(arg0, arg1, arg2);
                return;
            }
            if (this.field3886 + arg2 < this.field3885) {
                this.field3886 += arg2;
                this.method1297(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3885 - this.field3886;
            this.method1297(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3886 += var4;
            this.method1301();
            class168 var5 = (class168) this.field3884.method145(0);
            synchronized (var5) {
                int var7 = var5.method1101(this);
                if (var7 < 0) {
                    var5.field3243 = 0;
                    this.method1298(var5);
                } else {
                    var5.field3243 = var7;
                    this.method1300(var5.field3553, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lig;)V")
    public final synchronized void method1296(class79 arg0) {
        this.field3883.method148(arg0, true);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "([III)V")
    private final void method1297(int[] arg0, int arg1, int arg2) {
        for (class79 var4 = (class79) this.field3883.method145(0); var4 != null; var4 = (class79) this.field3883.method152((byte) -126)) {
            var4.method484(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lsf;)V")
    private final void method1298(class168 arg0) {
        arg0.method1213(9104);
        arg0.method1100();
        class182 var2 = this.field3884.field474.field3553;
        if (this.field3884.field474 == var2) {
            this.field3885 = -1;
        } else {
            this.field3885 = ((class168) var2).field3243;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    private final void method1299(int arg0) {
        for (class79 var2 = (class79) this.field3883.method145(0); var2 != null; var2 = (class79) this.field3883.method152((byte) -128)) {
            var2.method485(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lub;Lsf;)V")
    private final void method1300(class182 arg0, class168 arg1) {
        while (this.field3884.field474 != arg0 && ((class168) arg0).field3243 <= arg1.field3243) {
            arg0 = arg0.field3553;
        }
        this.field3884.method151(arg0, arg1, 127);
        this.field3885 = ((class168) this.field3884.field474.field3553).field3243;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()I")
    public final int method486() {
        return 0;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Lig;")
    public final class79 method481() {
        return (class79) this.field3883.method152((byte) -126);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Lig;")
    public final class79 method480() {
        return (class79) this.field3883.method145(0);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public final synchronized void method485(int arg0) {
        do {
            if (this.field3885 < 0) {
                this.method1299(arg0);
                return;
            }
            if (this.field3886 + arg0 < this.field3885) {
                this.field3886 += arg0;
                this.method1299(arg0);
                return;
            }
            int var2 = this.field3885 - this.field3886;
            this.method1299(var2);
            arg0 -= var2;
            this.field3886 += var2;
            this.method1301();
            class168 var3 = (class168) this.field3884.method145(0);
            synchronized (var3) {
                int var5 = var3.method1101(this);
                if (var5 < 0) {
                    var3.field3243 = 0;
                    this.method1298(var3);
                } else {
                    var3.field3243 = var5;
                    this.method1300(var3.field3553, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
    private final void method1301() {
        if (this.field3886 <= 0) {
            return;
        }
        for (class168 var1 = (class168) this.field3884.method145(0); var1 != null; var1 = (class168) this.field3884.method152((byte) -126)) {
            var1.field3243 -= this.field3886;
        }
        this.field3885 -= this.field3886;
        this.field3886 = 0;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Lig;)V")
    public final synchronized void method1302(class79 arg0) {
        arg0.method1213(9104);
    }
}
