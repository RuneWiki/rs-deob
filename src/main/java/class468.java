import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class468 extends class9 {

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Ldm;")
    private class46 field6586 = new class46();

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Ldm;")
    private class46 field6587 = new class46();

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field6588 = 0;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    private int field6589 = -1;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([III)V")
    public final synchronized void method55(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6589 < 0) {
                this.method2734(arg0, arg1, arg2);
                return;
            }
            if (this.field6588 + arg2 < this.field6589) {
                this.field6588 += arg2;
                this.method2734(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6589 - this.field6588;
            this.method2734(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6588 += var4;
            this.method2736();
            class357 var5 = (class357) this.field6587.method456((byte) -85);
            synchronized (var5) {
                int var7 = var5.method2140(this);
                if (var7 < 0) {
                    var5.field4812 = 0;
                    this.method2732(var5);
                } else {
                    var5.field4812 = var7;
                    this.method2729(var5.field2516, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()Lff;")
    public final class9 method53() {
        return (class9) this.field6586.method456((byte) -110);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lik;Lij;)V")
    private final void method2729(class176 arg0, class357 arg1) {
        while (this.field6587.field892 != arg0 && ((class357) arg0).field4812 <= arg1.field4812) {
            arg0 = arg0.field2516;
        }
        class68.method566(arg0, -88, arg1);
        this.field6589 = ((class357) this.field6587.field892.field2516).field4812;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    private final void method2730(int arg0) {
        for (class9 var2 = (class9) this.field6586.method456((byte) -45); var2 != null; var2 = (class9) this.field6586.method460((byte) 105)) {
            var2.method54(arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lff;)V")
    public final synchronized void method2731(class9 arg0) {
        arg0.method1117(0);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()Lff;")
    public final class9 method52() {
        return (class9) this.field6586.method460((byte) 82);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lij;)V")
    private final void method2732(class357 arg0) {
        arg0.method1117(0);
        arg0.method2141();
        class176 var2 = this.field6587.field892.field2516;
        if (this.field6587.field892 == var2) {
            this.field6589 = -1;
        } else {
            this.field6589 = ((class357) var2).field4812;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
    public final int method51() {
        return 0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Lff;)V")
    public final synchronized void method2733(class9 arg0) {
        this.field6586.method462((byte) 59, arg0);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "([III)V")
    private final void method2734(int[] arg0, int arg1, int arg2) {
        for (class9 var4 = (class9) this.field6586.method456((byte) -41); var4 != null; var4 = (class9) this.field6586.method460((byte) -85)) {
            var4.method56(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public final synchronized void method54(int arg0) {
        do {
            if (this.field6589 < 0) {
                this.method2730(arg0);
                return;
            }
            if (this.field6588 + arg0 < this.field6589) {
                this.field6588 += arg0;
                this.method2730(arg0);
                return;
            }
            int var2 = this.field6589 - this.field6588;
            this.method2730(var2);
            arg0 -= var2;
            this.field6588 += var2;
            this.method2736();
            class357 var3 = (class357) this.field6587.method456((byte) -123);
            synchronized (var3) {
                int var5 = var3.method2140(this);
                if (var5 < 0) {
                    var3.field4812 = 0;
                    this.method2732(var3);
                } else {
                    var3.field4812 = var5;
                    this.method2729(var3.field2516, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()I")
    public final synchronized int method2735() {
        return this.field6586.method464(false);
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()V")
    private final void method2736() {
        if (this.field6588 <= 0) {
            return;
        }
        for (class357 var1 = (class357) this.field6587.method456((byte) -61); var1 != null; var1 = (class357) this.field6587.method460((byte) -112)) {
            var1.field4812 -= this.field6588;
        }
        this.field6589 -= this.field6588;
        this.field6588 = 0;
    }
}
