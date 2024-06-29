import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class60 extends class135 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lsj;")
    private class48 field820 = new class48();

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lsj;")
    private class48 field821 = new class48();

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    private int field822 = -1;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field823 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    private final void method450(int arg0) {
        for (class135 var2 = (class135) this.field820.method365(3); var2 != null; var2 = (class135) this.field820.method372((byte) 7)) {
            var2.method265(arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
    public final int method263() {
        return 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "([III)V")
    public final synchronized void method284(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field822 < 0) {
                this.method452(arg0, arg1, arg2);
                return;
            }
            if (this.field823 + arg2 < this.field822) {
                this.field823 += arg2;
                this.method452(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field822 - this.field823;
            this.method452(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field823 += var4;
            this.method455();
            class123 var5 = (class123) this.field821.method365(3);
            synchronized (var5) {
                int var7 = var5.method861(this);
                if (var7 < 0) {
                    var5.field2062 = 0;
                    this.method456(var5);
                } else {
                    var5.field2062 = var7;
                    this.method453(var5.field960, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lok;)V")
    public final synchronized void method451(class135 arg0) {
        this.field820.method368(arg0, 76);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final synchronized void method265(int arg0) {
        do {
            if (this.field822 < 0) {
                this.method450(arg0);
                return;
            }
            if (this.field823 + arg0 < this.field822) {
                this.field823 += arg0;
                this.method450(arg0);
                return;
            }
            int var2 = this.field822 - this.field823;
            this.method450(var2);
            arg0 -= var2;
            this.field823 += var2;
            this.method455();
            class123 var3 = (class123) this.field821.method365(3);
            synchronized (var3) {
                int var5 = var3.method861(this);
                if (var5 < 0) {
                    var3.field2062 = 0;
                    this.method456(var3);
                } else {
                    var3.field2062 = var5;
                    this.method453(var3.field960, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "([III)V")
    private final void method452(int[] arg0, int arg1, int arg2) {
        for (class135 var4 = (class135) this.field820.method365(3); var4 != null; var4 = (class135) this.field820.method372((byte) 7)) {
            var4.method949(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwd;Lrh;)V")
    private final void method453(class69 arg0, class123 arg1) {
        while (this.field821.field592 != arg0 && ((class123) arg0).field2062 <= arg1.field2062) {
            arg0 = arg0.field960;
        }
        class194.method1310(255, arg0, arg1);
        this.field822 = ((class123) this.field821.field592.field960).field2062;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lok;)V")
    public final synchronized void method454(class135 arg0) {
        arg0.method544(119);
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
    private final void method455() {
        if (this.field823 <= 0) {
            return;
        }
        for (class123 var1 = (class123) this.field821.method365(3); var1 != null; var1 = (class123) this.field821.method372((byte) 7)) {
            var1.field2062 -= this.field823;
        }
        this.field822 -= this.field823;
        this.field823 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrh;)V")
    private final void method456(class123 arg0) {
        arg0.method544(80);
        arg0.method860();
        class69 var2 = this.field821.field592.field960;
        if (this.field821.field592 == var2) {
            this.field822 = -1;
        } else {
            this.field822 = ((class123) var2).field2062;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()Lok;")
    public final class135 method245() {
        return (class135) this.field820.method372((byte) 7);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()Lok;")
    public final class135 method262() {
        return (class135) this.field820.method365(3);
    }
}
