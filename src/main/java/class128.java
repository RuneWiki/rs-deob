import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class128 extends class444 {

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Ltc;")
    private class196 field1793 = new class196();

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Ltc;")
    private class196 field1794 = new class196();

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    private int field1795 = 0;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    private int field1796 = -1;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([III)V")
    public final synchronized void method196(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1796 < 0) {
                this.method854(arg0, arg1, arg2);
                return;
            }
            if (this.field1795 + arg2 < this.field1796) {
                this.field1795 += arg2;
                this.method854(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1796 - this.field1795;
            this.method854(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1795 += var4;
            this.method853();
            class443 var5 = (class443) this.field1794.method1312((byte) 25);
            synchronized (var5) {
                int var7 = var5.method2774(this);
                if (var7 < 0) {
                    var5.field6413 = 0;
                    this.method856(var5);
                } else {
                    var5.field6413 = var7;
                    this.method858(var5.field5365, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public final synchronized void method198(int arg0) {
        do {
            if (this.field1796 < 0) {
                this.method855(arg0);
                return;
            }
            if (this.field1795 + arg0 < this.field1796) {
                this.field1795 += arg0;
                this.method855(arg0);
                return;
            }
            int var2 = this.field1796 - this.field1795;
            this.method855(var2);
            arg0 -= var2;
            this.field1795 += var2;
            this.method853();
            class443 var3 = (class443) this.field1794.method1312((byte) 25);
            synchronized (var3) {
                int var5 = var3.method2774(this);
                if (var5 < 0) {
                    var3.field6413 = 0;
                    this.method856(var3);
                } else {
                    var3.field6413 = var5;
                    this.method858(var3.field5365, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lpn;)V")
    public final synchronized void method852(class444 arg0) {
        arg0.method2459(198);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
    private final void method853() {
        if (this.field1795 <= 0) {
            return;
        }
        for (class443 var1 = (class443) this.field1794.method1312((byte) 25); var1 != null; var1 = (class443) this.field1794.method1304(122)) {
            var1.field6413 -= this.field1795;
        }
        this.field1796 -= this.field1795;
        this.field1795 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "([III)V")
    private final void method854(int[] arg0, int arg1, int arg2) {
        for (class444 var4 = (class444) this.field1793.method1312((byte) 25); var4 != null; var4 = (class444) this.field1793.method1304(86)) {
            var4.method2776(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    private final void method855(int arg0) {
        for (class444 var2 = (class444) this.field1793.method1312((byte) 25); var2 != null; var2 = (class444) this.field1793.method1304(-117)) {
            var2.method198(arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()Lpn;")
    public final class444 method180() {
        return (class444) this.field1793.method1312((byte) 25);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lwo;)V")
    private final void method856(class443 arg0) {
        arg0.method2459(198);
        arg0.method2775();
        class376 var2 = this.field1794.field2720.field5365;
        if (this.field1794.field2720 == var2) {
            this.field1796 = -1;
        } else {
            this.field1796 = ((class443) var2).field6413;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lpn;)V")
    public final synchronized void method857(class444 arg0) {
        this.field1793.method1307(arg0, -4);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()I")
    public final int method208() {
        return 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lmh;Lwo;)V")
    private final void method858(class376 arg0, class443 arg1) {
        while (this.field1794.field2720 != arg0 && ((class443) arg0).field6413 <= arg1.field6413) {
            arg0 = arg0.field5365;
        }
        class248.method1545(arg0, (byte) -127, arg1);
        this.field1796 = ((class443) this.field1794.field2720.field5365).field6413;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lpn;")
    public final class444 method179() {
        return (class444) this.field1793.method1304(-60);
    }
}
