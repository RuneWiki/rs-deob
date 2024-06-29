import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class253 extends class121 {

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Laa;")
    private class39 field4445 = new class39();

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Laa;")
    private class39 field4446 = new class39();

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    private int field4447 = -1;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    private int field4448 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lsh;)V")
    private final void method1706(class266 arg0) {
        arg0.method501(0);
        arg0.method1786();
        class69 var2 = this.field4446.field681.field1200;
        if (this.field4446.field681 == var2) {
            this.field4447 = -1;
        } else {
            this.field4447 = ((class266) var2).field4612;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public final synchronized void method652(int arg0) {
        do {
            if (this.field4447 < 0) {
                this.method1709(arg0);
                return;
            }
            if (this.field4448 + arg0 < this.field4447) {
                this.field4448 += arg0;
                this.method1709(arg0);
                return;
            }
            int var2 = this.field4447 - this.field4448;
            this.method1709(var2);
            arg0 -= var2;
            this.field4448 += var2;
            this.method1712();
            class266 var3 = (class266) this.field4446.method264(-126);
            synchronized (var3) {
                int var5 = var3.method1787(this);
                if (var5 < 0) {
                    var3.field4612 = 0;
                    this.method1706(var3);
                } else {
                    var3.field4612 = var5;
                    this.method1708(var3.field1200, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
    public final synchronized void method649(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4447 < 0) {
                this.method1707(arg0, arg1, arg2);
                return;
            }
            if (this.field4448 + arg2 < this.field4447) {
                this.field4448 += arg2;
                this.method1707(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4447 - this.field4448;
            this.method1707(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4448 += var4;
            this.method1712();
            class266 var5 = (class266) this.field4446.method264(-46);
            synchronized (var5) {
                int var7 = var5.method1787(this);
                if (var7 < 0) {
                    var5.field4612 = 0;
                    this.method1706(var5);
                } else {
                    var5.field4612 = var7;
                    this.method1708(var5.field1200, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()Lwj;")
    public final class121 method656() {
        return (class121) this.field4445.method269((byte) 7);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "([III)V")
    private final void method1707(int[] arg0, int arg1, int arg2) {
        for (class121 var4 = (class121) this.field4445.method264(-69); var4 != null; var4 = (class121) this.field4445.method269((byte) 7)) {
            var4.method959(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lcj;Lsh;)V")
    private final void method1708(class69 arg0, class266 arg1) {
        while (this.field4446.field681 != arg0 && ((class266) arg0).field4612 <= arg1.field4612) {
            arg0 = arg0.field1200;
        }
        class78.method625(true, arg0, arg1);
        this.field4447 = ((class266) this.field4446.field681.field1200).field4612;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    private final void method1709(int arg0) {
        for (class121 var2 = (class121) this.field4445.method264(-37); var2 != null; var2 = (class121) this.field4445.method269((byte) 7)) {
            var2.method652(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lwj;)V")
    public final synchronized void method1710(class121 arg0) {
        this.field4445.method268((byte) -68, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Lwj;)V")
    public final synchronized void method1711(class121 arg0) {
        arg0.method501(0);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()I")
    public final int method655() {
        return 0;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
    private final void method1712() {
        if (this.field4448 <= 0) {
            return;
        }
        for (class266 var1 = (class266) this.field4446.method264(-71); var1 != null; var1 = (class266) this.field4446.method269((byte) 7)) {
            var1.field4612 -= this.field4448;
        }
        this.field4447 -= this.field4448;
        this.field4448 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()Lwj;")
    public final class121 method651() {
        return (class121) this.field4445.method264(-112);
    }
}
