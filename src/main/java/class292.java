import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class292 extends class452 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lbb;")
    private class270 field3852 = new class270();

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lbb;")
    private class270 field3853 = new class270();

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field3854 = -1;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field3855 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final synchronized void method108(int arg0) {
        do {
            if (this.field3854 < 0) {
                this.method1867(arg0);
                return;
            }
            if (this.field3855 + arg0 < this.field3854) {
                this.field3855 += arg0;
                this.method1867(arg0);
                return;
            }
            int var2 = this.field3854 - this.field3855;
            this.method1867(var2);
            arg0 -= var2;
            this.field3855 += var2;
            this.method1864();
            class154 var3 = (class154) this.field3853.method1690((byte) -112);
            synchronized (var3) {
                int var5 = var3.method990(this);
                if (var5 < 0) {
                    var3.field1796 = 0;
                    this.method1868(var3);
                } else {
                    var3.field1796 = var5;
                    this.method1865(var3.field508, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
    private final void method1864() {
        if (this.field3855 <= 0) {
            return;
        }
        for (class154 var1 = (class154) this.field3853.method1690((byte) -123); var1 != null; var1 = (class154) this.field3853.method1699((byte) 3)) {
            var1.field1796 -= this.field3855;
        }
        this.field3854 -= this.field3855;
        this.field3855 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public final int method107() {
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lpn;Ldi;)V")
    private final void method1865(class43 arg0, class154 arg1) {
        while (this.field3853.field3483 != arg0 && ((class154) arg0).field1796 <= arg1.field1796) {
            arg0 = arg0.field508;
        }
        class62.method356(arg0, arg1, true);
        this.field3854 = ((class154) this.field3853.field3483.field508).field1796;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()Ltf;")
    public final class452 method114() {
        return (class452) this.field3852.method1690((byte) -107);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ltf;)V")
    public final synchronized void method1866(class452 arg0) {
        arg0.method263(false);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    private final void method1867(int arg0) {
        for (class452 var2 = (class452) this.field3852.method1690((byte) -122); var2 != null; var2 = (class452) this.field3852.method1699((byte) 49)) {
            var2.method108(arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ldi;)V")
    private final void method1868(class154 arg0) {
        arg0.method263(false);
        arg0.method991();
        class43 var2 = this.field3853.field3483.field508;
        if (this.field3853.field3483 == var2) {
            this.field3854 = -1;
        } else {
            this.field3854 = ((class154) var2).field1796;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Ltf;)V")
    public final synchronized void method1869(class452 arg0) {
        this.field3852.method1691(-8567, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
    public final synchronized void method112(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3854 < 0) {
                this.method1870(arg0, arg1, arg2);
                return;
            }
            if (this.field3855 + arg2 < this.field3854) {
                this.field3855 += arg2;
                this.method1870(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3854 - this.field3855;
            this.method1870(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3855 += var4;
            this.method1864();
            class154 var5 = (class154) this.field3853.method1690((byte) -127);
            synchronized (var5) {
                int var7 = var5.method990(this);
                if (var7 < 0) {
                    var5.field1796 = 0;
                    this.method1868(var5);
                } else {
                    var5.field1796 = var7;
                    this.method1865(var5.field508, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "([III)V")
    private final void method1870(int[] arg0, int arg1, int arg2) {
        for (class452 var4 = (class452) this.field3852.method1690((byte) -120); var4 != null; var4 = (class452) this.field3852.method1699((byte) 7)) {
            var4.method2799(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Ltf;")
    public final class452 method109() {
        return (class452) this.field3852.method1699((byte) 45);
    }
}
