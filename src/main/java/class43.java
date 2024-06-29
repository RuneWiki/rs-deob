import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class43 extends class31 {

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Lmg;")
    private class530 field627 = new class530();

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "Lmg;")
    private class530 field628 = new class530();

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    private int field629 = 0;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    private int field630 = -1;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()I", line = 3)
    public final int method225() {
        return 0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Luj;Lnj;)V", line = 6)
    private final void method291(class476 arg0, class406 arg1) {
        while (this.field628.field7789 != arg0 && ((class406) arg0).field5767 <= arg1.field5767) {
            arg0 = arg0.field6884;
        }
        class416.method2457(arg1, (byte) 70, arg0);
        this.field630 = ((class406) this.field628.field7789.field6884).field5767;
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "()I", line = 13)
    public final synchronized int method292() {
        return this.field627.method3146((byte) -10);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Loo;)V", line = 19)
    public final synchronized void method293(class31 arg0) {
        this.field627.method3141(66, arg0);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "([III)V", line = 28)
    private final void method294(int[] arg0, int arg1, int arg2) {
        for (class31 var4 = (class31) this.field627.method3137(0); var4 != null; var4 = (class31) this.field627.method3132(0)) {
            var4.method229(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 39)
    private final void method295(int arg0) {
        for (class31 var2 = (class31) this.field627.method3137(0); var2 != null; var2 = (class31) this.field627.method3132(0)) {
            var2.method230(arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "([III)V", line = 52)
    public final synchronized void method231(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field630 < 0) {
                this.method294(arg0, arg1, arg2);
                return;
            }
            if (this.field629 + arg2 < this.field630) {
                this.field629 += arg2;
                this.method294(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field630 - this.field629;
            this.method294(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field629 += var4;
            this.method297();
            class406 var5 = (class406) this.field628.method3137(0);
            synchronized (var5) {
                int var7 = var5.method2387(this);
                if (var7 < 0) {
                    var5.field5767 = 0;
                    this.method296(var5);
                } else {
                    var5.field5767 = var7;
                    this.method291(var5.field6884, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lnj;)V", line = 97)
    private final void method296(class406 arg0) {
        arg0.method2791((byte) 112);
        arg0.method2386();
        class476 var2 = this.field628.field7789.field6884;
        if (this.field628.field7789 == var2) {
            this.field630 = -1;
        } else {
            this.field630 = ((class406) var2).field5767;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "()Loo;", line = 111)
    public final class31 method228() {
        return (class31) this.field627.method3132(0);
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "()V", line = 118)
    private final void method297() {
        if (this.field629 <= 0) {
            return;
        }
        for (class406 var1 = (class406) this.field628.method3137(0); var1 != null; var1 = (class406) this.field628.method3132(0)) {
            var1.field5767 -= this.field629;
        }
        this.field630 -= this.field629;
        this.field629 = 0;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()Loo;", line = 140)
    public final class31 method226() {
        return (class31) this.field627.method3137(0);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Loo;)V", line = 143)
    public final synchronized void method298(class31 arg0) {
        arg0.method2791((byte) 112);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 149)
    public final synchronized void method230(int arg0) {
        do {
            if (this.field630 < 0) {
                this.method295(arg0);
                return;
            }
            if (this.field629 + arg0 < this.field630) {
                this.field629 += arg0;
                this.method295(arg0);
                return;
            }
            int var2 = this.field630 - this.field629;
            this.method295(var2);
            arg0 -= var2;
            this.field629 += var2;
            this.method297();
            class406 var3 = (class406) this.field628.method3137(0);
            synchronized (var3) {
                int var5 = var3.method2387(this);
                if (var5 < 0) {
                    var3.field5767 = 0;
                    this.method296(var3);
                } else {
                    var3.field5767 = var5;
                    this.method291(var3.field6884, var3);
                }
            }
        } while (arg0 != 0);
    }
}
