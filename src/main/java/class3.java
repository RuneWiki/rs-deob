import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class413 {

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lqw;")
    private class84 field24 = new class84();

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "Lqw;")
    private class84 field25 = new class84();

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    private int field27 = -1;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "()Lpp;")
    public final class413 method13() {
        return (class413) this.field24.method681(-15);
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "([III)V")
    private final void method14(int[] arg0, int arg1, int arg2) {
        for (class413 var4 = (class413) this.field24.method679((byte) -86); var4 != null; var4 = (class413) this.field24.method681(-108)) {
            var4.method2489(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "()Lpp;")
    public final class413 method15() {
        return (class413) this.field24.method679((byte) -86);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    private final void method16(int arg0) {
        for (class413 var2 = (class413) this.field24.method679((byte) -86); var2 != null; var2 = (class413) this.field24.method681(-97)) {
            var2.method17(arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final synchronized void method17(int arg0) {
        do {
            if (this.field27 < 0) {
                this.method16(arg0);
                return;
            }
            if (this.field26 + arg0 < this.field27) {
                this.field26 += arg0;
                this.method16(arg0);
                return;
            }
            int var2 = this.field27 - this.field26;
            this.method16(var2);
            arg0 -= var2;
            this.field26 += var2;
            this.method23();
            class301 var3 = (class301) this.field25.method679((byte) -86);
            synchronized (var3) {
                int var5 = var3.method1948(this);
                if (var5 < 0) {
                    var3.field4235 = 0;
                    this.method20(var3);
                } else {
                    var3.field4235 = var5;
                    this.method25(var3.field2139, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "([III)V")
    public final synchronized void method18(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field27 < 0) {
                this.method14(arg0, arg1, arg2);
                return;
            }
            if (this.field26 + arg2 < this.field27) {
                this.field26 += arg2;
                this.method14(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field27 - this.field26;
            this.method14(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field26 += var4;
            this.method23();
            class301 var5 = (class301) this.field25.method679((byte) -86);
            synchronized (var5) {
                int var7 = var5.method1948(this);
                if (var7 < 0) {
                    var5.field4235 = 0;
                    this.method20(var5);
                } else {
                    var5.field4235 = var7;
                    this.method25(var5.field2139, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "()I")
    public final synchronized int method19() {
        return this.field24.method684(-9);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lria;)V")
    private final void method20(class301 arg0) {
        arg0.method1102((byte) 120);
        arg0.method1949();
        class159 var2 = this.field25.field1194.field2139;
        if (this.field25.field1194 == var2) {
            this.field27 = -1;
        } else {
            this.field27 = ((class301) var2).field4235;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lpp;)V")
    public final synchronized void method21(class413 arg0) {
        this.field24.method686(-1, arg0);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Lpp;)V")
    public final synchronized void method22(class413 arg0) {
        arg0.method1102((byte) 103);
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "()V")
    private final void method23() {
        if (this.field26 <= 0) {
            return;
        }
        for (class301 var1 = (class301) this.field25.method679((byte) -86); var1 != null; var1 = (class301) this.field25.method681(-47)) {
            var1.field4235 -= this.field26;
        }
        this.field27 -= this.field26;
        this.field26 = 0;
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "()I")
    public final int method24() {
        return 0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lmg;Lria;)V")
    private final void method25(class159 arg0, class301 arg1) {
        while (this.field25.field1194 != arg0 && ((class301) arg0).field4235 <= arg1.field4235) {
            arg0 = arg0.field2139;
        }
        class503.method2940(111, arg1, arg0);
        this.field27 = ((class301) this.field25.field1194.field2139).field4235;
    }
}
