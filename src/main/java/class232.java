import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class232 extends class404 {

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lgca;")
    private class227 field3210 = new class227();

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lgca;")
    private class227 field3211 = new class227();

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    private int field3212 = 0;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field3213 = -1;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Ljc;")
    public final class404 method1457() {
        return (class404) this.field3210.method1436(28964);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lrp;Lfi;)V")
    private final void method1458(class401 arg0, class517 arg1) {
        while (this.field3211.field3151 != arg0 && ((class517) arg0).field7050 <= arg1.field7050) {
            arg0 = arg0.field5625;
        }
        class140.method983(arg0, arg1, 30653);
        this.field3213 = ((class517) this.field3211.field3151.field5625).field7050;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfi;)V")
    private final void method1459(class517 arg0) {
        arg0.method2340(89);
        arg0.method2950();
        class401 var2 = this.field3211.field3151.field5625;
        if (this.field3211.field3151 == var2) {
            this.field3213 = -1;
        } else {
            this.field3213 = ((class517) var2).field7050;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final synchronized void method1460(int arg0) {
        do {
            if (this.field3213 < 0) {
                this.method1467(arg0);
                return;
            }
            if (this.field3212 + arg0 < this.field3213) {
                this.field3212 += arg0;
                this.method1467(arg0);
                return;
            }
            int var2 = this.field3213 - this.field3212;
            this.method1467(var2);
            arg0 -= var2;
            this.field3212 += var2;
            this.method1463();
            class517 var3 = (class517) this.field3211.method1436(28964);
            synchronized (var3) {
                int var5 = var3.method2949(this);
                if (var5 < 0) {
                    var3.field7050 = 0;
                    this.method1459(var3);
                } else {
                    var3.field7050 = var5;
                    this.method1458(var3.field5625, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()I")
    public final synchronized int method1461() {
        return this.field3210.method1434((byte) -95);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljc;)V")
    public final synchronized void method1462(class404 arg0) {
        this.field3210.method1438(arg0, -32762);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "()V")
    private final void method1463() {
        if (this.field3212 <= 0) {
            return;
        }
        for (class517 var1 = (class517) this.field3211.method1436(28964); var1 != null; var1 = (class517) this.field3211.method1443((byte) 6)) {
            var1.field7050 -= this.field3212;
        }
        this.field3213 -= this.field3212;
        this.field3212 = 0;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Ljc;)V")
    public final synchronized void method1464(class404 arg0) {
        arg0.method2340(99);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
    public final int method1465() {
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()Ljc;")
    public final class404 method1466() {
        return (class404) this.field3210.method1443((byte) 6);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    private final void method1467(int arg0) {
        for (class404 var2 = (class404) this.field3210.method1436(28964); var2 != null; var2 = (class404) this.field3210.method1443((byte) 6)) {
            var2.method1460(arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
    private final void method1468(int[] arg0, int arg1, int arg2) {
        for (class404 var4 = (class404) this.field3210.method1436(28964); var4 != null; var4 = (class404) this.field3210.method1443((byte) 6)) {
            var4.method2358(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
    public final synchronized void method1469(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3213 < 0) {
                this.method1468(arg0, arg1, arg2);
                return;
            }
            if (this.field3212 + arg2 < this.field3213) {
                this.field3212 += arg2;
                this.method1468(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3213 - this.field3212;
            this.method1468(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3212 += var4;
            this.method1463();
            class517 var5 = (class517) this.field3211.method1436(28964);
            synchronized (var5) {
                int var7 = var5.method2949(this);
                if (var7 < 0) {
                    var5.field7050 = 0;
                    this.method1459(var5);
                } else {
                    var5.field7050 = var7;
                    this.method1458(var5.field5625, var5);
                }
            }
        } while (arg2 != 0);
    }
}
