import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class154 extends class425 {

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Ljm;")
    private class162 field2199 = new class162();

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Ljm;")
    private class162 field2200 = new class162();

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    private int field2201 = -1;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    private int field2202 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([III)V")
    public final synchronized void method106(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2201 < 0) {
                this.method1129(arg0, arg1, arg2);
                return;
            }
            if (this.field2202 + arg2 < this.field2201) {
                this.field2202 += arg2;
                this.method1129(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2201 - this.field2202;
            this.method1129(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2202 += var4;
            this.method1125();
            class99 var5 = (class99) this.field2200.method1173(0);
            synchronized (var5) {
                int var7 = var5.method770(this);
                if (var7 < 0) {
                    var5.field1386 = 0;
                    this.method1124(var5);
                } else {
                    var5.field1386 = var7;
                    this.method1130(var5.field4223, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
    public final int method103() {
        return 0;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final synchronized void method97(int arg0) {
        do {
            if (this.field2201 < 0) {
                this.method1126(arg0);
                return;
            }
            if (this.field2202 + arg0 < this.field2201) {
                this.field2202 += arg0;
                this.method1126(arg0);
                return;
            }
            int var2 = this.field2201 - this.field2202;
            this.method1126(var2);
            arg0 -= var2;
            this.field2202 += var2;
            this.method1125();
            class99 var3 = (class99) this.field2200.method1173(0);
            synchronized (var3) {
                int var5 = var3.method770(this);
                if (var5 < 0) {
                    var3.field1386 = 0;
                    this.method1124(var3);
                } else {
                    var3.field1386 = var5;
                    this.method1130(var3.field4223, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()Lrb;")
    public final class425 method105() {
        return (class425) this.field2199.method1165(true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ltl;)V")
    private final void method1124(class99 arg0) {
        arg0.method1884(false);
        arg0.method769();
        class311 var2 = this.field2200.field2296.field4223;
        if (this.field2200.field2296 == var2) {
            this.field2201 = -1;
        } else {
            this.field2201 = ((class99) var2).field1386;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
    private final void method1125() {
        if (this.field2202 <= 0) {
            return;
        }
        for (class99 var1 = (class99) this.field2200.method1173(0); var1 != null; var1 = (class99) this.field2200.method1165(true)) {
            var1.field1386 -= this.field2202;
        }
        this.field2201 -= this.field2202;
        this.field2202 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    private final void method1126(int arg0) {
        for (class425 var2 = (class425) this.field2199.method1173(0); var2 != null; var2 = (class425) this.field2199.method1165(true)) {
            var2.method97(arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lrb;)V")
    public final synchronized void method1127(class425 arg0) {
        this.field2199.method1169(arg0, false);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lrb;)V")
    public final synchronized void method1128(class425 arg0) {
        arg0.method1884(false);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "([III)V")
    private final void method1129(int[] arg0, int arg1, int arg2) {
        for (class425 var4 = (class425) this.field2199.method1173(0); var4 != null; var4 = (class425) this.field2199.method1165(true)) {
            var4.method2625(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()Lrb;")
    public final class425 method100() {
        return (class425) this.field2199.method1173(0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lvi;Ltl;)V")
    private final void method1130(class311 arg0, class99 arg1) {
        while (this.field2200.field2296 != arg0 && ((class99) arg0).field1386 <= arg1.field1386) {
            arg0 = arg0.field4223;
        }
        class35.method318(arg0, arg1, true);
        this.field2201 = ((class99) this.field2200.field2296.field4223).field1386;
    }
}
