import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class258 extends class33 {

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "Lpu;")
    private class411 field4337 = new class411();

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "Lpu;")
    private class411 field4338 = new class411();

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    private int field4340 = 0;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    private int field4339 = -1;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Loa;)V")
    public final synchronized void method1734(class33 arg0) {
        arg0.method1821((byte) 32);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljp;Lfj;)V")
    private final void method1735(class276 arg0, class58 arg1) {
        while (this.field4338.field6207 != arg0 && ((class58) arg0).field902 <= arg1.field902) {
            arg0 = arg0.field4535;
        }
        class304.method1944(arg0, 81, arg1);
        this.field4339 = ((class58) this.field4338.field6207.field4535).field902;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "()Loa;")
    public final class33 method256() {
        return (class33) this.field4337.method2538(-3);
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "()I")
    public final synchronized int method1736() {
        return this.field4337.method2542(-105);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([III)V")
    public final synchronized void method252(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4339 < 0) {
                this.method1741(arg0, arg1, arg2);
                return;
            }
            if (this.field4340 + arg2 < this.field4339) {
                this.field4340 += arg2;
                this.method1741(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4339 - this.field4340;
            this.method1741(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4340 += var4;
            this.method1737();
            class58 var5 = (class58) this.field4338.method2538(-3);
            synchronized (var5) {
                int var7 = var5.method393(this);
                if (var7 < 0) {
                    var5.field902 = 0;
                    this.method1738(var5);
                } else {
                    var5.field902 = var7;
                    this.method1735(var5.field4535, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "()V")
    private final void method1737() {
        if (this.field4340 <= 0) {
            return;
        }
        for (class58 var1 = (class58) this.field4338.method2538(-3); var1 != null; var1 = (class58) this.field4338.method2535((byte) -59)) {
            var1.field902 -= this.field4340;
        }
        this.field4339 -= this.field4340;
        this.field4340 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "()I")
    public final int method257() {
        return 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lfj;)V")
    private final void method1738(class58 arg0) {
        arg0.method1821((byte) -96);
        arg0.method394();
        class276 var2 = this.field4338.field6207.field4535;
        if (this.field4338.field6207 == var2) {
            this.field4339 = -1;
        } else {
            this.field4339 = ((class58) var2).field902;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
    private final void method1739(int arg0) {
        for (class33 var2 = (class33) this.field4337.method2538(-3); var2 != null; var2 = (class33) this.field4337.method2535((byte) -104)) {
            var2.method251(arg0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Loa;)V")
    public final synchronized void method1740(class33 arg0) {
        this.field4337.method2545(arg0, 4009);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public final synchronized void method251(int arg0) {
        do {
            if (this.field4339 < 0) {
                this.method1739(arg0);
                return;
            }
            if (this.field4340 + arg0 < this.field4339) {
                this.field4340 += arg0;
                this.method1739(arg0);
                return;
            }
            int var2 = this.field4339 - this.field4340;
            this.method1739(var2);
            arg0 -= var2;
            this.field4340 += var2;
            this.method1737();
            class58 var3 = (class58) this.field4338.method2538(-3);
            synchronized (var3) {
                int var5 = var3.method393(this);
                if (var5 < 0) {
                    var3.field902 = 0;
                    this.method1738(var3);
                } else {
                    var3.field902 = var5;
                    this.method1735(var3.field4535, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "([III)V")
    private final void method1741(int[] arg0, int arg1, int arg2) {
        for (class33 var4 = (class33) this.field4337.method2538(-3); var4 != null; var4 = (class33) this.field4337.method2535((byte) -79)) {
            var4.method253(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "()Loa;")
    public final class33 method254() {
        return (class33) this.field4337.method2535((byte) -119);
    }
}
