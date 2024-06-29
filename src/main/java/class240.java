import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class240 extends class398 {

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lgw;")
    private class118 field3608 = new class118();

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lgw;")
    private class118 field3609 = new class118();

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    private int field3610 = 0;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private int field3611 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final synchronized void method697(int arg0) {
        do {
            if (this.field3611 < 0) {
                this.method1583(arg0);
                return;
            }
            if (this.field3610 + arg0 < this.field3611) {
                this.field3610 += arg0;
                this.method1583(arg0);
                return;
            }
            int var2 = this.field3611 - this.field3610;
            this.method1583(var2);
            arg0 -= var2;
            this.field3610 += var2;
            this.method1588();
            class103 var3 = (class103) this.field3609.method863(-1);
            synchronized (var3) {
                int var5 = var3.method753(this);
                if (var5 < 0) {
                    var3.field1586 = 0;
                    this.method1585(var3);
                } else {
                    var3.field1586 = var5;
                    this.method1590(var3.field857, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    private final void method1583(int arg0) {
        for (class398 var2 = (class398) this.field3608.method863(-1); var2 != null; var2 = (class398) this.field3608.method865(-1)) {
            var2.method697(arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lpo;")
    public final class398 method700() {
        return (class398) this.field3608.method865(-1);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "([III)V")
    private final void method1584(int[] arg0, int arg1, int arg2) {
        for (class398 var4 = (class398) this.field3608.method863(-1); var4 != null; var4 = (class398) this.field3608.method865(-1)) {
            var4.method2392(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmg;)V")
    private final void method1585(class103 arg0) {
        arg0.method421(22071);
        arg0.method752();
        class42 var2 = this.field3609.field1835.field857;
        if (this.field3609.field1835 == var2) {
            this.field3611 = -1;
        } else {
            this.field3611 = ((class103) var2).field1586;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpo;)V")
    public final synchronized void method1586(class398 arg0) {
        this.field3608.method853(-12691, arg0);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Lpo;)V")
    public final synchronized void method1587(class398 arg0) {
        arg0.method421(22071);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method692() {
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
    private final void method1588() {
        if (this.field3610 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field3609.method863(-1); var1 != null; var1 = (class103) this.field3609.method865(-1)) {
            var1.field1586 -= this.field3610;
        }
        this.field3611 -= this.field3610;
        this.field3610 = 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V")
    public final synchronized void method717(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3611 < 0) {
                this.method1584(arg0, arg1, arg2);
                return;
            }
            if (this.field3610 + arg2 < this.field3611) {
                this.field3610 += arg2;
                this.method1584(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3611 - this.field3610;
            this.method1584(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3610 += var4;
            this.method1588();
            class103 var5 = (class103) this.field3609.method863(-1);
            synchronized (var5) {
                int var7 = var5.method753(this);
                if (var7 < 0) {
                    var5.field1586 = 0;
                    this.method1585(var5);
                } else {
                    var5.field1586 = var7;
                    this.method1590(var5.field857, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()I")
    public final synchronized int method1589() {
        return this.field3608.method852(true);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()Lpo;")
    public final class398 method693() {
        return (class398) this.field3608.method863(-1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lha;Lmg;)V")
    private final void method1590(class42 arg0, class103 arg1) {
        while (this.field3609.field1835 != arg0 && ((class103) arg0).field1586 <= arg1.field1586) {
            arg0 = arg0.field857;
        }
        class94.method724(arg1, (byte) -95, arg0);
        this.field3611 = ((class103) this.field3609.field1835.field857).field1586;
    }
}
