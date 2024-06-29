import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class340 extends class53 {

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lgj;")
    private class257 field5410 = new class257();

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lgj;")
    private class257 field5411 = new class257();

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    private int field5412 = -1;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    private int field5413 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lba;Lug;)V", line = 4)
    private final void method2333(class188 arg0, class338 arg1) {
        while (this.field5411.field4061 != arg0 && ((class338) arg0).field5402 <= arg1.field5402) {
            arg0 = arg0.field2835;
        }
        class14.method85(arg0, arg1, true);
        this.field5412 = ((class338) this.field5411.field4061.field2835).field5402;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 20)
    public final synchronized void method318(int arg0) {
        do {
            if (this.field5412 < 0) {
                this.method2337(arg0);
                return;
            }
            if (this.field5413 + arg0 < this.field5412) {
                this.field5413 += arg0;
                this.method2337(arg0);
                return;
            }
            int var2 = this.field5412 - this.field5413;
            this.method2337(var2);
            arg0 -= var2;
            this.field5413 += var2;
            this.method2334();
            class338 var3 = (class338) this.field5411.method1812(1);
            synchronized (var3) {
                int var5 = var3.method2331(this);
                if (var5 < 0) {
                    var3.field5402 = 0;
                    this.method2338(var3);
                } else {
                    var3.field5402 = var5;
                    this.method2333(var3.field2835, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()I", line = 66)
    public final int method322() {
        return 0;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V", line = 69)
    private final void method2334() {
        if (this.field5413 <= 0) {
            return;
        }
        for (class338 var1 = (class338) this.field5411.method1812(1); var1 != null; var1 = (class338) this.field5411.method1809(128)) {
            var1.field5402 -= this.field5413;
        }
        this.field5412 -= this.field5413;
        this.field5413 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "([III)V", line = 90)
    public final synchronized void method323(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5412 < 0) {
                this.method2336(arg0, arg1, arg2);
                return;
            }
            if (this.field5413 + arg2 < this.field5412) {
                this.field5413 += arg2;
                this.method2336(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5412 - this.field5413;
            this.method2336(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5413 += var4;
            this.method2334();
            class338 var5 = (class338) this.field5411.method1812(1);
            synchronized (var5) {
                int var7 = var5.method2331(this);
                if (var7 < 0) {
                    var5.field5402 = 0;
                    this.method2338(var5);
                } else {
                    var5.field5402 = var7;
                    this.method2333(var5.field2835, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()Lqd;", line = 134)
    public final class53 method321() {
        return (class53) this.field5410.method1809(128);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lqd;)V", line = 139)
    public final synchronized void method2335(class53 arg0) {
        this.field5410.method1810(0, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "([III)V", line = 147)
    private final void method2336(int[] arg0, int arg1, int arg2) {
        for (class53 var4 = (class53) this.field5410.method1812(1); var4 != null; var4 = (class53) this.field5410.method1809(128)) {
            var4.method319(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 161)
    private final void method2337(int arg0) {
        for (class53 var2 = (class53) this.field5410.method1812(1); var2 != null; var2 = (class53) this.field5410.method1809(128)) {
            var2.method318(arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lug;)V", line = 170)
    private final void method2338(class338 arg0) {
        arg0.method1290(-87);
        arg0.method2332();
        class188 var2 = this.field5411.field4061.field2835;
        if (this.field5411.field4061 == var2) {
            this.field5412 = -1;
        } else {
            this.field5412 = ((class338) var2).field5402;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()Lqd;", line = 188)
    public final class53 method317() {
        return (class53) this.field5410.method1812(1);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lqd;)V", line = 192)
    public final synchronized void method2339(class53 arg0) {
        arg0.method1290(5);
    }
}
