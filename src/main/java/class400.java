import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class400 extends class11 {

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lcf;")
    private class92 field5484 = new class92();

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lcf;")
    private class92 field5485 = new class92();

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field5486 = 0;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private int field5487 = -1;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    private final void method2403(int arg0) {
        for (class11 var2 = (class11) this.field5484.method775(1); var2 != null; var2 = (class11) this.field5484.method763(0)) {
            var2.method58(arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lkm;)V")
    private final void method2404(class123 arg0) {
        arg0.method2714(-70);
        arg0.method940();
        class449 var2 = this.field5485.field1299.field6385;
        if (this.field5485.field1299 == var2) {
            this.field5487 = -1;
        } else {
            this.field5487 = ((class123) var2).field1674;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
    private final void method2405() {
        if (this.field5486 <= 0) {
            return;
        }
        for (class123 var1 = (class123) this.field5485.method775(1); var1 != null; var1 = (class123) this.field5485.method763(0)) {
            var1.field1674 -= this.field5486;
        }
        this.field5487 -= this.field5486;
        this.field5486 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loe;)V")
    public final synchronized void method2406(class11 arg0) {
        arg0.method2714(51);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public final synchronized void method58(int arg0) {
        do {
            if (this.field5487 < 0) {
                this.method2403(arg0);
                return;
            }
            if (this.field5486 + arg0 < this.field5487) {
                this.field5486 += arg0;
                this.method2403(arg0);
                return;
            }
            int var2 = this.field5487 - this.field5486;
            this.method2403(var2);
            arg0 -= var2;
            this.field5486 += var2;
            this.method2405();
            class123 var3 = (class123) this.field5485.method775(1);
            synchronized (var3) {
                int var5 = var3.method941(this);
                if (var5 < 0) {
                    var3.field1674 = 0;
                    this.method2404(var3);
                } else {
                    var3.field1674 = var5;
                    this.method2409(var3.field6385, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
    public final int method54() {
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()Loe;")
    public final class11 method55() {
        return (class11) this.field5484.method763(0);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()Loe;")
    public final class11 method53() {
        return (class11) this.field5484.method775(1);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Loe;)V")
    public final synchronized void method2407(class11 arg0) {
        this.field5484.method774(arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "([III)V")
    private final void method2408(int[] arg0, int arg1, int arg2) {
        for (class11 var4 = (class11) this.field5484.method775(1); var4 != null; var4 = (class11) this.field5484.method763(0)) {
            var4.method57(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lrs;Lkm;)V")
    private final void method2409(class449 arg0, class123 arg1) {
        while (this.field5485.field1299 != arg0 && ((class123) arg0).field1674 <= arg1.field1674) {
            arg0 = arg0.field6385;
        }
        class218.method1501(arg0, false, arg1);
        this.field5487 = ((class123) this.field5485.field1299.field6385).field1674;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V")
    public final synchronized void method56(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5487 < 0) {
                this.method2408(arg0, arg1, arg2);
                return;
            }
            if (this.field5486 + arg2 < this.field5487) {
                this.field5486 += arg2;
                this.method2408(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5487 - this.field5486;
            this.method2408(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5486 += var4;
            this.method2405();
            class123 var5 = (class123) this.field5485.method775(1);
            synchronized (var5) {
                int var7 = var5.method941(this);
                if (var7 < 0) {
                    var5.field1674 = 0;
                    this.method2404(var5);
                } else {
                    var5.field1674 = var7;
                    this.method2409(var5.field6385, var5);
                }
            }
        } while (arg2 != 0);
    }
}
