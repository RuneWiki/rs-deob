import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class280 extends class194 {

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lol;")
    private class220 field4562 = new class220();

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lol;")
    private class220 field4563 = new class220();

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    private int field4564 = -1;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    private int field4565 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()Log;")
    public final class194 method988() {
        return (class194) this.field4562.method1548(0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Log;)V")
    public final synchronized void method1927(class194 arg0) {
        this.field4562.method1539(-1770092592, arg0);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    private final void method1928(int arg0) {
        for (class194 var2 = (class194) this.field4562.method1548(0); var2 != null; var2 = (class194) this.field4562.method1549(-73)) {
            var2.method952(arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lid;Lnk;)V")
    private final void method1929(class247 arg0, class12 arg1) {
        while (this.field4563.field3437 != arg0 && ((class12) arg0).field180 <= arg1.field180) {
            arg0 = arg0.field4013;
        }
        class313.method2100(arg1, arg0, 0);
        this.field4564 = ((class12) this.field4563.field3437.field4013).field180;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnk;)V")
    private final void method1930(class12 arg0) {
        arg0.method1764(64);
        arg0.method69();
        class247 var2 = this.field4563.field3437.field4013;
        if (this.field4563.field3437 == var2) {
            this.field4564 = -1;
        } else {
            this.field4564 = ((class12) var2).field180;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()I")
    public final int method948() {
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()Log;")
    public final class194 method947() {
        return (class194) this.field4562.method1549(122);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Log;)V")
    public final synchronized void method1931(class194 arg0) {
        arg0.method1764(64);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([III)V")
    public final synchronized void method969(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4564 < 0) {
                this.method1933(arg0, arg1, arg2);
                return;
            }
            if (this.field4565 + arg2 < this.field4564) {
                this.field4565 += arg2;
                this.method1933(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4564 - this.field4565;
            this.method1933(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4565 += var4;
            this.method1932();
            class12 var5 = (class12) this.field4563.method1548(0);
            synchronized (var5) {
                int var7 = var5.method70(this);
                if (var7 < 0) {
                    var5.field180 = 0;
                    this.method1930(var5);
                } else {
                    var5.field180 = var7;
                    this.method1929(var5.field4013, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()V")
    private final void method1932() {
        if (this.field4565 <= 0) {
            return;
        }
        for (class12 var1 = (class12) this.field4563.method1548(0); var1 != null; var1 = (class12) this.field4563.method1549(92)) {
            var1.field180 -= this.field4565;
        }
        this.field4564 -= this.field4565;
        this.field4565 = 0;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public final synchronized void method952(int arg0) {
        do {
            if (this.field4564 < 0) {
                this.method1928(arg0);
                return;
            }
            if (this.field4565 + arg0 < this.field4564) {
                this.field4565 += arg0;
                this.method1928(arg0);
                return;
            }
            int var2 = this.field4564 - this.field4565;
            this.method1928(var2);
            arg0 -= var2;
            this.field4565 += var2;
            this.method1932();
            class12 var3 = (class12) this.field4563.method1548(0);
            synchronized (var3) {
                int var5 = var3.method70(this);
                if (var5 < 0) {
                    var3.field180 = 0;
                    this.method1930(var3);
                } else {
                    var3.field180 = var5;
                    this.method1929(var3.field4013, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "([III)V")
    private final void method1933(int[] arg0, int arg1, int arg2) {
        for (class194 var4 = (class194) this.field4562.method1548(0); var4 != null; var4 = (class194) this.field4562.method1549(-101)) {
            var4.method1360(arg0, arg1, arg2);
        }
    }
}
