import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class203 extends class207 {

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lke;")
    private class106 field3467 = new class106();

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lke;")
    private class106 field3468 = new class106();

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    private int field3470 = -1;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "([III)V", line = 6)
    private final void method1417(int[] arg0, int arg1, int arg2) {
        for (class207 var4 = (class207) this.field3467.method778(0); var4 != null; var4 = (class207) this.field3467.method775(26517)) {
            var4.method1440(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()I", line = 15)
    public final int method482() {
        return 0;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()V", line = 23)
    private final void method1418() {
        if (this.field3469 <= 0) {
            return;
        }
        for (class16 var1 = (class16) this.field3468.method778(0); var1 != null; var1 = (class16) this.field3468.method775(26517)) {
            var1.field327 -= this.field3469;
        }
        this.field3470 -= this.field3469;
        this.field3469 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwj;)V", line = 40)
    public final synchronized void method1419(class207 arg0) {
        arg0.method232(128);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()Lwj;", line = 44)
    public final class207 method480() {
        return (class207) this.field3467.method775(26517);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lwj;)V", line = 49)
    public final synchronized void method1420(class207 arg0) {
        this.field3467.method782(arg0, 22774);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 58)
    private final void method1421(int arg0) {
        for (class207 var2 = (class207) this.field3467.method778(0); var2 != null; var2 = (class207) this.field3467.method775(26517)) {
            var2.method478(arg0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 70)
    public final synchronized void method478(int arg0) {
        do {
            if (this.field3470 < 0) {
                this.method1421(arg0);
                return;
            }
            if (this.field3469 + arg0 < this.field3470) {
                this.field3469 += arg0;
                this.method1421(arg0);
                return;
            }
            int var2 = this.field3470 - this.field3469;
            this.method1421(var2);
            arg0 -= var2;
            this.field3469 += var2;
            this.method1418();
            class16 var3 = (class16) this.field3468.method778(0);
            synchronized (var3) {
                int var5 = var3.method172(this);
                if (var5 < 0) {
                    var3.field327 = 0;
                    this.method1422(var3);
                } else {
                    var3.field327 = var5;
                    this.method1423(var3.field415, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([III)V", line = 119)
    public final synchronized void method479(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3470 < 0) {
                this.method1417(arg0, arg1, arg2);
                return;
            }
            if (this.field3469 + arg2 < this.field3470) {
                this.field3469 += arg2;
                this.method1417(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3470 - this.field3469;
            this.method1417(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3469 += var4;
            this.method1418();
            class16 var5 = (class16) this.field3468.method778(0);
            synchronized (var5) {
                int var7 = var5.method172(this);
                if (var7 < 0) {
                    var5.field327 = 0;
                    this.method1422(var5);
                } else {
                    var5.field327 = var7;
                    this.method1423(var5.field415, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lwj;", line = 163)
    public final class207 method477() {
        return (class207) this.field3467.method778(0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lql;)V", line = 166)
    private final void method1422(class16 arg0) {
        arg0.method232(128);
        arg0.method171();
        class25 var2 = this.field3468.field1963.field415;
        if (this.field3468.field1963 == var2) {
            this.field3470 = -1;
        } else {
            this.field3470 = ((class16) var2).field327;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lna;Lql;)V", line = 187)
    private final void method1423(class25 arg0, class16 arg1) {
        while (this.field3468.field1963 != arg0 && ((class16) arg0).field327 <= arg1.field327) {
            arg0 = arg0.field415;
        }
        class93.method710(arg1, true, arg0);
        this.field3470 = ((class16) this.field3468.field1963.field415).field327;
    }
}
