import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class47 extends class299 {

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "Lbv;")
    private class568 field649 = new class568();

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "Lbv;")
    private class568 field650 = new class568();

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    private int field651 = -1;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
    private int field652 = 0;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "()I")
    public final synchronized int method248() {
        return this.field649.method3176(false);
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "()Lgv;")
    public final class299 method249() {
        return (class299) this.field649.method3182((byte) -80);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lgv;)V")
    public final synchronized void method250(class299 arg0) {
        arg0.method589(-8880);
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "()V")
    private final void method251() {
        if (this.field652 <= 0) {
            return;
        }
        for (class306 var1 = (class306) this.field650.method3188((byte) -100); var1 != null; var1 = (class306) this.field650.method3182((byte) -105)) {
            var1.field3933 -= this.field652;
        }
        this.field651 -= this.field652;
        this.field652 = 0;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "([III)V")
    public final synchronized void method252(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field651 < 0) {
                this.method256(arg0, arg1, arg2);
                return;
            }
            if (this.field652 + arg2 < this.field651) {
                this.field652 += arg2;
                this.method256(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field651 - this.field652;
            this.method256(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field652 += var4;
            this.method251();
            class306 var5 = (class306) this.field650.method3188((byte) -100);
            synchronized (var5) {
                int var7 = var5.method1844(this);
                if (var7 < 0) {
                    var5.field3933 = 0;
                    this.method253(var5);
                } else {
                    var5.field3933 = var7;
                    this.method260(var5.field1403, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lga;)V")
    private final void method253(class306 arg0) {
        arg0.method589(-8880);
        arg0.method1843();
        class108 var2 = this.field650.field7933.field1403;
        if (this.field650.field7933 == var2) {
            this.field651 = -1;
        } else {
            this.field651 = ((class306) var2).field3933;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public final synchronized void method254(int arg0) {
        do {
            if (this.field651 < 0) {
                this.method255(arg0);
                return;
            }
            if (this.field652 + arg0 < this.field651) {
                this.field652 += arg0;
                this.method255(arg0);
                return;
            }
            int var2 = this.field651 - this.field652;
            this.method255(var2);
            arg0 -= var2;
            this.field652 += var2;
            this.method251();
            class306 var3 = (class306) this.field650.method3188((byte) -100);
            synchronized (var3) {
                int var5 = var3.method1844(this);
                if (var5 < 0) {
                    var3.field3933 = 0;
                    this.method253(var3);
                } else {
                    var3.field3933 = var5;
                    this.method260(var3.field1403, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
    private final void method255(int arg0) {
        for (class299 var2 = (class299) this.field649.method3188((byte) -100); var2 != null; var2 = (class299) this.field649.method3182((byte) -72)) {
            var2.method254(arg0);
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "([III)V")
    private final void method256(int[] arg0, int arg1, int arg2) {
        for (class299 var4 = (class299) this.field649.method3188((byte) -100); var4 != null; var4 = (class299) this.field649.method3182((byte) -35)) {
            var4.method1835(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lgv;)V")
    public final synchronized void method257(class299 arg0) {
        this.field649.method3187(arg0, (byte) -124);
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "()I")
    public final int method258() {
        return 0;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "()Lgv;")
    public final class299 method259() {
        return (class299) this.field649.method3188((byte) -100);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lum;Lga;)V")
    private final void method260(class108 arg0, class306 arg1) {
        while (this.field650.field7933 != arg0 && ((class306) arg0).field3933 <= arg1.field3933) {
            arg0 = arg0.field1403;
        }
        class502.method2802(arg0, arg1, (byte) -128);
        this.field651 = ((class306) this.field650.field7933.field1403).field3933;
    }
}
