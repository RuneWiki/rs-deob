import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class567 extends class232 {

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Lrh;")
    private class59 field7847 = new class59();

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Lrh;")
    private class59 field7848 = new class59();

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    private int field7850 = -1;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    private int field7849 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lsf;Lnw;)V", line = 5)
    private final void method3200(class28 arg0, class478 arg1) {
        while (this.field7848.field825 != arg0 && ((class478) arg0).field6454 <= arg1.field6454) {
            arg0 = arg0.field276;
        }
        class412.method2416(arg1, arg0, -1);
        this.field7850 = ((class478) this.field7848.field825.field276).field6454;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lnw;)V", line = 13)
    private final void method3201(class478 arg0) {
        arg0.method175(30604);
        arg0.method2677();
        class28 var2 = this.field7848.field825.field276;
        if (this.field7848.field825 == var2) {
            this.field7850 = -1;
        } else {
            this.field7850 = ((class478) var2).field6454;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 29)
    public final synchronized void method305(int arg0) {
        do {
            if (this.field7850 < 0) {
                this.method3205(arg0);
                return;
            }
            if (this.field7849 + arg0 < this.field7850) {
                this.field7849 += arg0;
                this.method3205(arg0);
                return;
            }
            int var2 = this.field7850 - this.field7849;
            this.method3205(var2);
            arg0 -= var2;
            this.field7849 += var2;
            this.method3202();
            class478 var3 = (class478) this.field7848.method374((byte) 110);
            synchronized (var3) {
                int var5 = var3.method2676(this);
                if (var5 < 0) {
                    var3.field6454 = 0;
                    this.method3201(var3);
                } else {
                    var3.field6454 = var5;
                    this.method3200(var3.field276, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "()V", line = 78)
    private final void method3202() {
        if (this.field7849 <= 0) {
            return;
        }
        for (class478 var1 = (class478) this.field7848.method374((byte) 95); var1 != null; var1 = (class478) this.field7848.method372(-20740)) {
            var1.field6454 -= this.field7849;
        }
        this.field7850 -= this.field7849;
        this.field7849 = 0;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "([III)V", line = 99)
    public final synchronized void method312(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field7850 < 0) {
                this.method3207(arg0, arg1, arg2);
                return;
            }
            if (this.field7849 + arg2 < this.field7850) {
                this.field7849 += arg2;
                this.method3207(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field7850 - this.field7849;
            this.method3207(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field7849 += var4;
            this.method3202();
            class478 var5 = (class478) this.field7848.method374((byte) 49);
            synchronized (var5) {
                int var7 = var5.method2676(this);
                if (var7 < 0) {
                    var5.field6454 = 0;
                    this.method3201(var5);
                } else {
                    var5.field6454 = var7;
                    this.method3200(var5.field276, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lwi;)V", line = 146)
    public final synchronized void method3203(class232 arg0) {
        arg0.method175(30604);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Lwi;)V", line = 153)
    public final synchronized void method3204(class232 arg0) {
        this.field7847.method376(true, arg0);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 160)
    private final void method3205(int arg0) {
        for (class232 var2 = (class232) this.field7847.method374((byte) 122); var2 != null; var2 = (class232) this.field7847.method372(-20740)) {
            var2.method305(arg0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "()I", line = 169)
    public final int method332() {
        return 0;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "()I", line = 173)
    public final synchronized int method3206() {
        return this.field7847.method369(-19133);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "()Lwi;", line = 179)
    public final class232 method304() {
        return (class232) this.field7847.method374((byte) 86);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()Lwi;", line = 182)
    public final class232 method322() {
        return (class232) this.field7847.method372(-20740);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "([III)V", line = 192)
    private final void method3207(int[] arg0, int arg1, int arg2) {
        for (class232 var4 = (class232) this.field7847.method374((byte) 89); var4 != null; var4 = (class232) this.field7847.method372(-20740)) {
            var4.method1428(arg0, arg1, arg2);
        }
    }
}
