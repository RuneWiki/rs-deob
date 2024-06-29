import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class521 extends class79 {

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lwl;")
    private class280 field7704 = new class280();

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lwl;")
    private class280 field7705 = new class280();

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    private int field7707 = 0;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field7706 = -1;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lnj;)V", line = 3)
    private final void method3066(class161 arg0) {
        arg0.method300(false);
        arg0.method1089();
        class42 var2 = this.field7705.field3684.field619;
        if (this.field7705.field3684 == var2) {
            this.field7706 = -1;
        } else {
            this.field7706 = ((class161) var2).field2362;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()I", line = 18)
    public final synchronized int method3067() {
        return this.field7704.method1669(32291);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V", line = 27)
    private final void method3068(int arg0) {
        for (class79 var2 = (class79) this.field7704.method1672((byte) -110); var2 != null; var2 = (class79) this.field7704.method1668(-1)) {
            var2.method71(arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 40)
    public final synchronized void method71(int arg0) {
        do {
            if (this.field7706 < 0) {
                this.method3068(arg0);
                return;
            }
            if (this.field7707 + arg0 < this.field7706) {
                this.field7707 += arg0;
                this.method3068(arg0);
                return;
            }
            int var2 = this.field7706 - this.field7707;
            this.method3068(var2);
            arg0 -= var2;
            this.field7707 += var2;
            this.method3071();
            class161 var3 = (class161) this.field7705.method1672((byte) -116);
            synchronized (var3) {
                int var5 = var3.method1090(this);
                if (var5 < 0) {
                    var3.field2362 = 0;
                    this.method3066(var3);
                } else {
                    var3.field2362 = var5;
                    this.method3072(var3.field619, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()Lgm;", line = 89)
    public final class79 method92() {
        return (class79) this.field7704.method1668(-1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lgm;)V", line = 95)
    public final synchronized void method3069(class79 arg0) {
        this.field7704.method1659((byte) 47, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lgm;)V", line = 99)
    public final synchronized void method3070(class79 arg0) {
        arg0.method300(false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I", line = 103)
    public final int method83() {
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "()V", line = 107)
    private final void method3071() {
        if (this.field7707 <= 0) {
            return;
        }
        for (class161 var1 = (class161) this.field7705.method1672((byte) -108); var1 != null; var1 = (class161) this.field7705.method1668(-1)) {
            var1.field2362 -= this.field7707;
        }
        this.field7706 -= this.field7707;
        this.field7707 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lda;Lnj;)V", line = 124)
    private final void method3072(class42 arg0, class161 arg1) {
        while (this.field7705.field3684 != arg0 && ((class161) arg0).field2362 <= arg1.field2362) {
            arg0 = arg0.field619;
        }
        class462.method2633(arg0, arg1, true);
        this.field7706 = ((class161) this.field7705.field3684.field619).field2362;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "([III)V", line = 134)
    private final void method3073(int[] arg0, int arg1, int arg2) {
        for (class79 var4 = (class79) this.field7704.method1672((byte) -108); var4 != null; var4 = (class79) this.field7704.method1668(-1)) {
            var4.method494(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V", line = 147)
    public final synchronized void method80(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field7706 < 0) {
                this.method3073(arg0, arg1, arg2);
                return;
            }
            if (this.field7707 + arg2 < this.field7706) {
                this.field7707 += arg2;
                this.method3073(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field7706 - this.field7707;
            this.method3073(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field7707 += var4;
            this.method3071();
            class161 var5 = (class161) this.field7705.method1672((byte) -107);
            synchronized (var5) {
                int var7 = var5.method1090(this);
                if (var7 < 0) {
                    var5.field2362 = 0;
                    this.method3066(var5);
                } else {
                    var5.field2362 = var7;
                    this.method3072(var5.field619, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()Lgm;", line = 194)
    public final class79 method89() {
        return (class79) this.field7704.method1672((byte) -110);
    }
}
