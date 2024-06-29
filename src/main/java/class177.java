import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class177 extends class218 {

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lvr;")
    private class306 field2523 = new class306();

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lvr;")
    private class306 field2524 = new class306();

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    private int field2525 = 0;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    private int field2526 = -1;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Les;)V")
    private final void method1271(class182 arg0) {
        arg0.method2785((byte) -120);
        arg0.method1300();
        class467 var2 = this.field2524.field4498.field6797;
        if (this.field2524.field4498 == var2) {
            this.field2526 = -1;
        } else {
            this.field2526 = ((class182) var2).field2584;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lho;)V")
    public final synchronized void method1272(class218 arg0) {
        this.field2523.method1961(arg0, 26413);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "([III)V")
    private final void method1273(int[] arg0, int arg1, int arg2) {
        for (class218 var4 = (class218) this.field2523.method1970(64); var4 != null; var4 = (class218) this.field2523.method1960(24)) {
            var4.method1477(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lho;)V")
    public final synchronized void method1274(class218 arg0) {
        arg0.method2785((byte) -120);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final synchronized void method1225(int arg0) {
        do {
            if (this.field2526 < 0) {
                this.method1275(arg0);
                return;
            }
            if (this.field2525 + arg0 < this.field2526) {
                this.field2525 += arg0;
                this.method1275(arg0);
                return;
            }
            int var2 = this.field2526 - this.field2525;
            this.method1275(var2);
            arg0 -= var2;
            this.field2525 += var2;
            this.method1277();
            class182 var3 = (class182) this.field2524.method1970(64);
            synchronized (var3) {
                int var5 = var3.method1301(this);
                if (var5 < 0) {
                    var3.field2584 = 0;
                    this.method1271(var3);
                } else {
                    var3.field2584 = var5;
                    this.method1276(var3.field6797, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    private final void method1275(int arg0) {
        for (class218 var2 = (class218) this.field2523.method1970(64); var2 != null; var2 = (class218) this.field2523.method1960(24)) {
            var2.method1225(arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lvg;Les;)V")
    private final void method1276(class467 arg0, class182 arg1) {
        while (this.field2524.field4498 != arg0 && ((class182) arg0).field2584 <= arg1.field2584) {
            arg0 = arg0.field6797;
        }
        class421.method2535(arg0, arg1, 30746);
        this.field2526 = ((class182) this.field2524.field4498.field6797).field2584;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()V")
    private final void method1277() {
        if (this.field2525 <= 0) {
            return;
        }
        for (class182 var1 = (class182) this.field2524.method1970(64); var1 != null; var1 = (class182) this.field2524.method1960(24)) {
            var1.field2584 -= this.field2525;
        }
        this.field2526 -= this.field2525;
        this.field2525 = 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lho;")
    public final class218 method1251() {
        return (class218) this.field2523.method1970(64);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()I")
    public final int method1237() {
        return 0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()Lho;")
    public final class218 method1260() {
        return (class218) this.field2523.method1960(24);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([III)V")
    public final synchronized void method1235(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2526 < 0) {
                this.method1273(arg0, arg1, arg2);
                return;
            }
            if (this.field2525 + arg2 < this.field2526) {
                this.field2525 += arg2;
                this.method1273(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2526 - this.field2525;
            this.method1273(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2525 += var4;
            this.method1277();
            class182 var5 = (class182) this.field2524.method1970(64);
            synchronized (var5) {
                int var7 = var5.method1301(this);
                if (var7 < 0) {
                    var5.field2584 = 0;
                    this.method1271(var5);
                } else {
                    var5.field2584 = var7;
                    this.method1276(var5.field6797, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()I")
    public final synchronized int method1278() {
        return this.field2523.method1967(119);
    }
}
