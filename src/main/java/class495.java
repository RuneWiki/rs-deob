import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class495 extends class283 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lmfa;")
    private class562 field7159 = new class562();

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lmfa;")
    private class562 field7160 = new class562();

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    private int field7161 = -1;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    private int field7162 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lcd;)V")
    public final synchronized void method2847(class283 arg0) {
        this.field7159.method3169(-124, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lmu;Lfd;)V")
    private final void method2848(class270 arg0, class481 arg1) {
        while (this.field7160.field7992 != arg0 && ((class481) arg0).field7046 <= arg1.field7046) {
            arg0 = arg0.field3394;
        }
        class243.method1410(arg1, arg0, 5000);
        this.field7161 = ((class481) this.field7160.field7992.field3394).field7046;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
    private final void method2849(int[] arg0, int arg1, int arg2) {
        for (class283 var4 = (class283) this.field7159.method3174((byte) 49); var4 != null; var4 = (class283) this.field7159.method3168(false)) {
            var4.method1614(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lfd;)V")
    private final void method2850(class481 arg0) {
        arg0.method1519((byte) 121);
        arg0.method2807();
        class270 var2 = this.field7160.field7992.field3394;
        if (this.field7160.field7992 == var2) {
            this.field7161 = -1;
        } else {
            this.field7161 = ((class481) var2).field7046;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    private final void method2851(int arg0) {
        for (class283 var2 = (class283) this.field7159.method3174((byte) 49); var2 != null; var2 = (class283) this.field7159.method3168(false)) {
            var2.method639(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()Lcd;")
    public final class283 method651() {
        return (class283) this.field7159.method3168(false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final synchronized void method639(int arg0) {
        do {
            if (this.field7161 < 0) {
                this.method2851(arg0);
                return;
            }
            if (this.field7162 + arg0 < this.field7161) {
                this.field7162 += arg0;
                this.method2851(arg0);
                return;
            }
            int var2 = this.field7161 - this.field7162;
            this.method2851(var2);
            arg0 -= var2;
            this.field7162 += var2;
            this.method2854();
            class481 var3 = (class481) this.field7160.method3174((byte) 49);
            synchronized (var3) {
                int var5 = var3.method2806(this);
                if (var5 < 0) {
                    var3.field7046 = 0;
                    this.method2850(var3);
                } else {
                    var3.field7046 = var5;
                    this.method2848(var3.field3394, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I")
    public final int method671() {
        return 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lcd;)V")
    public final synchronized void method2852(class283 arg0) {
        arg0.method1519((byte) 121);
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
    public final synchronized int method2853() {
        return this.field7159.method3165((byte) 92);
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
    private final void method2854() {
        if (this.field7162 <= 0) {
            return;
        }
        for (class481 var1 = (class481) this.field7160.method3174((byte) 49); var1 != null; var1 = (class481) this.field7160.method3168(false)) {
            var1.field7046 -= this.field7162;
        }
        this.field7161 -= this.field7162;
        this.field7162 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([III)V")
    public final synchronized void method657(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field7161 < 0) {
                this.method2849(arg0, arg1, arg2);
                return;
            }
            if (this.field7162 + arg2 < this.field7161) {
                this.field7162 += arg2;
                this.method2849(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field7161 - this.field7162;
            this.method2849(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field7162 += var4;
            this.method2854();
            class481 var5 = (class481) this.field7160.method3174((byte) 49);
            synchronized (var5) {
                int var7 = var5.method2806(this);
                if (var7 < 0) {
                    var5.field7046 = 0;
                    this.method2850(var5);
                } else {
                    var5.field7046 = var7;
                    this.method2848(var5.field3394, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()Lcd;")
    public final class283 method650() {
        return (class283) this.field7159.method3174((byte) 49);
    }
}
