import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class86 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lad;")
    private class5 field784 = new class5();

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Lad;")
    private class5 field785 = new class5();

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field786 = 0;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    private int field787 = -1;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lka;Lcb;)V")
    private final void method277(class70 arg0, class17 arg1) {
        while (this.field785.field91 != arg0 && ((class17) arg0).field264 <= arg1.field264) {
            arg0 = arg0.field1483;
        }
        this.field785.method24(arg1, arg0, -124);
        this.field787 = ((class17) this.field785.field91.field1483).field264;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
    public final synchronized void method81(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field787 < 0) {
                this.method282(arg0, arg1, arg2);
                return;
            }
            if (this.field786 + arg2 < this.field787) {
                this.field786 += arg2;
                this.method282(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field787 - this.field786;
            this.method282(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field786 += var4;
            this.method281();
            class17 var5 = (class17) this.field785.method27(18823);
            synchronized (var5) {
                int var7 = var5.method143(this);
                if (var7 < 0) {
                    var5.field264 = 0;
                    this.method280(var5);
                } else {
                    var5.field264 = var7;
                    this.method277(var5.field1483, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
    private final void method278(int arg0) {
        for (class86 var2 = (class86) this.field784.method27(18823); var2 != null; var2 = (class86) this.field784.method25((byte) -128)) {
            var2.method64(arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lmc;")
    public final class86 method86() {
        return (class86) this.field784.method25((byte) -126);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lmc;)V")
    public final synchronized void method279(class86 arg0) {
        arg0.method495(-105);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcb;)V")
    private final void method280(class17 arg0) {
        arg0.method495(-17);
        arg0.method144();
        class70 var2 = this.field785.field91.field1483;
        if (this.field785.field91 == var2) {
            this.field787 = -1;
        } else {
            this.field787 = ((class17) var2).field264;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()Lmc;")
    public final class86 method70() {
        return (class86) this.field784.method27(18823);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "()V")
    private final void method281() {
        if (this.field786 <= 0) {
            return;
        }
        for (class17 var1 = (class17) this.field785.method27(18823); var1 != null; var1 = (class17) this.field785.method25((byte) -126)) {
            var1.field264 -= this.field786;
        }
        this.field787 -= this.field786;
        this.field786 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "([III)V")
    private final void method282(int[] arg0, int arg1, int arg2) {
        for (class86 var4 = (class86) this.field784.method27(18823); var4 != null; var4 = (class86) this.field784.method25((byte) -128)) {
            var4.method684(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lmc;)V")
    public final synchronized void method283(class86 arg0) {
        this.field784.method20(arg0, 0);
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public final synchronized void method64(int arg0) {
        do {
            if (this.field787 < 0) {
                this.method278(arg0);
                return;
            }
            if (this.field786 + arg0 < this.field787) {
                this.field786 += arg0;
                this.method278(arg0);
                return;
            }
            int var2 = this.field787 - this.field786;
            this.method278(var2);
            arg0 -= var2;
            this.field786 += var2;
            this.method281();
            class17 var3 = (class17) this.field785.method27(18823);
            synchronized (var3) {
                int var5 = var3.method143(this);
                if (var5 < 0) {
                    var3.field264 = 0;
                    this.method280(var3);
                } else {
                    var3.field264 = var5;
                    this.method277(var3.field1483, var3);
                }
            }
        } while (arg0 != 0);
    }
}
