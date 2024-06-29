import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class91 extends class206 {

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lwa;")
    private class281 field1394 = new class281();

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lwa;")
    private class281 field1395 = new class281();

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private int field1396 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    private int field1397 = -1;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lam;)V")
    private final void method586(class188 arg0) {
        arg0.method900(35);
        arg0.method1273();
        class134 var2 = this.field1395.field4646.field2104;
        if (this.field1395.field4646 == var2) {
            this.field1397 = -1;
        } else {
            this.field1397 = ((class188) var2).field2900;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()Lgg;")
    public final class206 method587() {
        return (class206) this.field1394.method1956(127);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lgg;)V")
    public final synchronized void method588(class206 arg0) {
        this.field1394.method1957(113, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
    public final int method589() {
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    private final void method590(int arg0) {
        for (class206 var2 = (class206) this.field1394.method1959(205); var2 != null; var2 = (class206) this.field1394.method1956(113)) {
            var2.method593(arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "()V")
    private final void method591() {
        if (this.field1396 <= 0) {
            return;
        }
        for (class188 var1 = (class188) this.field1395.method1959(205); var1 != null; var1 = (class188) this.field1395.method1956(124)) {
            var1.field2900 -= this.field1396;
        }
        this.field1397 -= this.field1396;
        this.field1396 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "([III)V")
    private final void method592(int[] arg0, int arg1, int arg2) {
        for (class206 var4 = (class206) this.field1394.method1959(205); var4 != null; var4 = (class206) this.field1394.method1956(87)) {
            var4.method1468(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public final synchronized void method593(int arg0) {
        do {
            if (this.field1397 < 0) {
                this.method590(arg0);
                return;
            }
            if (this.field1396 + arg0 < this.field1397) {
                this.field1396 += arg0;
                this.method590(arg0);
                return;
            }
            int var2 = this.field1397 - this.field1396;
            this.method590(var2);
            arg0 -= var2;
            this.field1396 += var2;
            this.method591();
            class188 var3 = (class188) this.field1395.method1959(205);
            synchronized (var3) {
                int var5 = var3.method1272(this);
                if (var5 < 0) {
                    var3.field2900 = 0;
                    this.method586(var3);
                } else {
                    var3.field2900 = var5;
                    this.method595(var3.field2104, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([III)V")
    public final synchronized void method594(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1397 < 0) {
                this.method592(arg0, arg1, arg2);
                return;
            }
            if (this.field1396 + arg2 < this.field1397) {
                this.field1396 += arg2;
                this.method592(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1397 - this.field1396;
            this.method592(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1396 += var4;
            this.method591();
            class188 var5 = (class188) this.field1395.method1959(205);
            synchronized (var5) {
                int var7 = var5.method1272(this);
                if (var7 < 0) {
                    var5.field2900 = 0;
                    this.method586(var5);
                } else {
                    var5.field2900 = var7;
                    this.method595(var5.field2104, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lq;Lam;)V")
    private final void method595(class134 arg0, class188 arg1) {
        while (this.field1395.field4646 != arg0 && ((class188) arg0).field2900 <= arg1.field2900) {
            arg0 = arg0.field2104;
        }
        class203.method1459(arg1, arg0, true);
        this.field1397 = ((class188) this.field1395.field4646.field2104).field2900;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()Lgg;")
    public final class206 method596() {
        return (class206) this.field1394.method1959(205);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lgg;)V")
    public final synchronized void method597(class206 arg0) {
        arg0.method900(90);
    }
}
