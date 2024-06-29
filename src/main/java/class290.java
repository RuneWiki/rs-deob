import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class290 extends class43 {

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lab;")
    private class269 field4615 = new class269();

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lab;")
    private class269 field4616 = new class269();

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    private int field4617 = 0;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    private int field4618 = -1;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "()V")
    private final void method1948() {
        if (this.field4617 <= 0) {
            return;
        }
        for (class64 var1 = (class64) this.field4616.method1802(43); var1 != null; var1 = (class64) this.field4616.method1815(0)) {
            var1.field822 -= this.field4617;
        }
        this.field4618 -= this.field4617;
        this.field4617 = 0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "([III)V")
    private final void method1949(int[] arg0, int arg1, int arg2) {
        for (class43 var4 = (class43) this.field4615.method1802(43); var4 != null; var4 = (class43) this.field4615.method1815(0)) {
            var4.method241(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lc;)V")
    private final void method1950(class64 arg0) {
        arg0.method1673(14510);
        arg0.method368();
        class237 var2 = this.field4616.field4304.field3914;
        if (this.field4616.field4304 == var2) {
            this.field4618 = -1;
        } else {
            this.field4618 = ((class64) var2).field822;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lfg;)V")
    public final synchronized void method1951(class43 arg0) {
        arg0.method1673(14510);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public final synchronized void method236(int arg0) {
        do {
            if (this.field4618 < 0) {
                this.method1953(arg0);
                return;
            }
            if (this.field4617 + arg0 < this.field4618) {
                this.field4617 += arg0;
                this.method1953(arg0);
                return;
            }
            int var2 = this.field4618 - this.field4617;
            this.method1953(var2);
            arg0 -= var2;
            this.field4617 += var2;
            this.method1948();
            class64 var3 = (class64) this.field4616.method1802(43);
            synchronized (var3) {
                int var5 = var3.method367(this);
                if (var5 < 0) {
                    var3.field822 = 0;
                    this.method1950(var3);
                } else {
                    var3.field822 = var5;
                    this.method1952(var3.field3914, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()Lfg;")
    public final class43 method242() {
        return (class43) this.field4615.method1802(43);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
    public final synchronized void method237(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4618 < 0) {
                this.method1949(arg0, arg1, arg2);
                return;
            }
            if (this.field4617 + arg2 < this.field4618) {
                this.field4617 += arg2;
                this.method1949(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4618 - this.field4617;
            this.method1949(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4617 += var4;
            this.method1948();
            class64 var5 = (class64) this.field4616.method1802(43);
            synchronized (var5) {
                int var7 = var5.method367(this);
                if (var7 < 0) {
                    var5.field822 = 0;
                    this.method1950(var5);
                } else {
                    var5.field822 = var7;
                    this.method1952(var5.field3914, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lfg;")
    public final class43 method239() {
        return (class43) this.field4615.method1815(0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lgl;Lc;)V")
    private final void method1952(class237 arg0, class64 arg1) {
        while (this.field4616.field4304 != arg0 && ((class64) arg0).field822 <= arg1.field822) {
            arg0 = arg0.field3914;
        }
        class215.method1511(arg0, 125, arg1);
        this.field4618 = ((class64) this.field4616.field4304.field3914).field822;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
    private final void method1953(int arg0) {
        for (class43 var2 = (class43) this.field4615.method1802(43); var2 != null; var2 = (class43) this.field4615.method1815(0)) {
            var2.method236(arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lfg;)V")
    public final synchronized void method1954(class43 arg0) {
        this.field4615.method1810(arg0, (byte) -74);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
    public final int method238() {
        return 0;
    }
}
