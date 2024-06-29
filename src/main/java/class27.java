import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class27 extends class50 {

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Leb;")
    private class395 field385 = new class395();

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Leb;")
    private class395 field386 = new class395();

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    private int field387 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    private int field388 = -1;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lar;)V")
    public final synchronized void method276(class50 arg0) {
        this.field385.method2474(-11725, arg0);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field388 < 0) {
                this.method287(arg0, arg1, arg2);
                return;
            }
            if (this.field387 + arg2 < this.field388) {
                this.field387 += arg2;
                this.method287(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field388 - this.field387;
            this.method287(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field387 += var4;
            this.method280();
            class407 var5 = (class407) this.field386.method2478(1603);
            synchronized (var5) {
                int var7 = var5.method2533(this);
                if (var7 < 0) {
                    var5.field5867 = 0;
                    this.method282(var5);
                } else {
                    var5.field5867 = var7;
                    this.method285(var5.field3906, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lar;)V")
    public final synchronized void method278(class50 arg0) {
        arg0.method1820(-25246);
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    private final void method279(int arg0) {
        for (class50 var2 = (class50) this.field385.method2478(1603); var2 != null; var2 = (class50) this.field385.method2486((byte) -82)) {
            var2.method286(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()V")
    private final void method280() {
        if (this.field387 <= 0) {
            return;
        }
        for (class407 var1 = (class407) this.field386.method2478(1603); var1 != null; var1 = (class407) this.field386.method2486((byte) -82)) {
            var1.field5867 -= this.field387;
        }
        this.field388 -= this.field387;
        this.field387 = 0;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()Lar;")
    public final class50 method281() {
        return (class50) this.field385.method2486((byte) -82);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lps;)V")
    private final void method282(class407 arg0) {
        arg0.method1820(-25246);
        arg0.method2534();
        class264 var2 = this.field386.field5735.field3906;
        if (this.field386.field5735 == var2) {
            this.field388 = -1;
        } else {
            this.field388 = ((class407) var2).field5867;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Lar;")
    public final class50 method283() {
        return (class50) this.field385.method2478(1603);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
    public final int method284() {
        return 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lgk;Lps;)V")
    private final void method285(class264 arg0, class407 arg1) {
        while (this.field386.field5735 != arg0 && ((class407) arg0).field5867 <= arg1.field5867) {
            arg0 = arg0.field3906;
        }
        class432.method2652(arg1, arg0, 16139);
        this.field388 = ((class407) this.field386.field5735.field3906).field5867;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final synchronized void method286(int arg0) {
        do {
            if (this.field388 < 0) {
                this.method279(arg0);
                return;
            }
            if (this.field387 + arg0 < this.field388) {
                this.field387 += arg0;
                this.method279(arg0);
                return;
            }
            int var2 = this.field388 - this.field387;
            this.method279(var2);
            arg0 -= var2;
            this.field387 += var2;
            this.method280();
            class407 var3 = (class407) this.field386.method2478(1603);
            synchronized (var3) {
                int var5 = var3.method2533(this);
                if (var5 < 0) {
                    var3.field5867 = 0;
                    this.method282(var3);
                } else {
                    var3.field5867 = var5;
                    this.method285(var3.field3906, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "([III)V")
    private final void method287(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field385.method2478(1603); var4 != null; var4 = (class50) this.field385.method2486((byte) -82)) {
            var4.method390(arg0, arg1, arg2);
        }
    }
}
