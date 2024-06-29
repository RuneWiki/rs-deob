import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class217 extends class151 {

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lsg;")
    private class162 field3905 = new class162();

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Lsg;")
    private class162 field3906 = new class162();

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    private int field3907 = 0;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    private int field3908 = -1;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()I")
    public final int method163() {
        return 0;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()Lmh;")
    public final class151 method148() {
        return (class151) this.field3905.method1120(62);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "([III)V")
    public final synchronized void method153(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3908 < 0) {
                this.method1520(arg0, arg1, arg2);
                return;
            }
            if (this.field3907 + arg2 < this.field3908) {
                this.field3907 += arg2;
                this.method1520(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3908 - this.field3907;
            this.method1520(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3907 += var4;
            this.method1521();
            class123 var5 = (class123) this.field3906.method1119(20896);
            synchronized (var5) {
                int var7 = var5.method899(this);
                if (var7 < 0) {
                    var5.field2414 = 0;
                    this.method1524(var5);
                } else {
                    var5.field2414 = var7;
                    this.method1523(var5.field595, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public final synchronized void method133(int arg0) {
        do {
            if (this.field3908 < 0) {
                this.method1518(arg0);
                return;
            }
            if (this.field3907 + arg0 < this.field3908) {
                this.field3907 += arg0;
                this.method1518(arg0);
                return;
            }
            int var2 = this.field3908 - this.field3907;
            this.method1518(var2);
            arg0 -= var2;
            this.field3907 += var2;
            this.method1521();
            class123 var3 = (class123) this.field3906.method1119(20896);
            synchronized (var3) {
                int var5 = var3.method899(this);
                if (var5 < 0) {
                    var3.field2414 = 0;
                    this.method1524(var3);
                } else {
                    var3.field2414 = var5;
                    this.method1523(var3.field595, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    private final void method1518(int arg0) {
        for (class151 var2 = (class151) this.field3905.method1119(20896); var2 != null; var2 = (class151) this.field3905.method1120(98)) {
            var2.method133(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()Lmh;")
    public final class151 method137() {
        return (class151) this.field3905.method1119(20896);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lmh;)V")
    public final synchronized void method1519(class151 arg0) {
        arg0.method269(-214950896);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "([III)V")
    private final void method1520(int[] arg0, int arg1, int arg2) {
        for (class151 var4 = (class151) this.field3905.method1119(20896); var4 != null; var4 = (class151) this.field3905.method1120(124)) {
            var4.method1045(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
    private final void method1521() {
        if (this.field3907 <= 0) {
            return;
        }
        for (class123 var1 = (class123) this.field3906.method1119(20896); var1 != null; var1 = (class123) this.field3906.method1120(95)) {
            var1.field2414 -= this.field3907;
        }
        this.field3908 -= this.field3907;
        this.field3907 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lmh;)V")
    public final synchronized void method1522(class151 arg0) {
        this.field3905.method1125(-17837, arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lva;Lgf;)V")
    private final void method1523(class34 arg0, class123 arg1) {
        while (this.field3906.field2931 != arg0 && ((class123) arg0).field2414 <= arg1.field2414) {
            arg0 = arg0.field595;
        }
        class273.method1863(arg1, 102, arg0);
        this.field3908 = ((class123) this.field3906.field2931.field595).field2414;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lgf;)V")
    private final void method1524(class123 arg0) {
        arg0.method269(-214950896);
        arg0.method900();
        class34 var2 = this.field3906.field2931.field595;
        if (this.field3906.field2931 == var2) {
            this.field3908 = -1;
        } else {
            this.field3908 = ((class123) var2).field2414;
        }
    }
}
