import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class204 extends class613 {

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lfh;")
    private class653 field2721 = new class653();

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lfh;")
    private class653 field2722 = new class653();

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    private int field2723 = 0;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    private int field2724 = -1;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Llea;)V")
    public final synchronized void method1319(class613 arg0) {
        arg0.method1175(-2);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ldfa;Lwr;)V")
    private final void method1320(class168 arg0, class460 arg1) {
        while (this.field2722.field9083 != arg0 && ((class460) arg0).field6143 <= arg1.field6143) {
            arg0 = arg0.field2336;
        }
        class710.method3971(arg0, arg1, 0);
        this.field2724 = ((class460) this.field2722.field9083.field2336).field6143;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final synchronized void method335(int arg0) {
        do {
            if (this.field2724 < 0) {
                this.method1322(arg0);
                return;
            }
            if (this.field2723 + arg0 < this.field2724) {
                this.field2723 += arg0;
                this.method1322(arg0);
                return;
            }
            int var2 = this.field2724 - this.field2723;
            this.method1322(var2);
            arg0 -= var2;
            this.field2723 += var2;
            this.method1323();
            class460 var3 = (class460) this.field2722.method3672(-1);
            synchronized (var3) {
                int var5 = var3.method2562(this);
                if (var5 < 0) {
                    var3.field6143 = 0;
                    this.method1326(var3);
                } else {
                    var3.field6143 = var5;
                    this.method1320(var3.field2336, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Llea;)V")
    public final synchronized void method1321(class613 arg0) {
        this.field2721.method3659(false, arg0);
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "()I")
    public final int method349() {
        return 0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V")
    public final synchronized void method338(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2724 < 0) {
                this.method1325(arg0, arg1, arg2);
                return;
            }
            if (this.field2723 + arg2 < this.field2724) {
                this.field2723 += arg2;
                this.method1325(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2724 - this.field2723;
            this.method1325(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2723 += var4;
            this.method1323();
            class460 var5 = (class460) this.field2722.method3672(-1);
            synchronized (var5) {
                int var7 = var5.method2562(this);
                if (var7 < 0) {
                    var5.field6143 = 0;
                    this.method1326(var5);
                } else {
                    var5.field6143 = var7;
                    this.method1320(var5.field2336, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    private final void method1322(int arg0) {
        for (class613 var2 = (class613) this.field2721.method3672(-1); var2 != null; var2 = (class613) this.field2721.method3662(-1)) {
            var2.method335(arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()Llea;")
    public final class613 method317() {
        return (class613) this.field2721.method3672(-1);
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "()V")
    private final void method1323() {
        if (this.field2723 <= 0) {
            return;
        }
        for (class460 var1 = (class460) this.field2722.method3672(-1); var1 != null; var1 = (class460) this.field2722.method3662(-1)) {
            var1.field6143 -= this.field2723;
        }
        this.field2724 -= this.field2723;
        this.field2723 = 0;
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "()I")
    public final synchronized int method1324() {
        return this.field2721.method3666(0);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "([III)V")
    private final void method1325(int[] arg0, int arg1, int arg2) {
        for (class613 var4 = (class613) this.field2721.method3672(-1); var4 != null; var4 = (class613) this.field2721.method3662(-1)) {
            var4.method3434(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "()Llea;")
    public final class613 method327() {
        return (class613) this.field2721.method3662(-1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lwr;)V")
    private final void method1326(class460 arg0) {
        arg0.method1175(-2);
        arg0.method2563();
        class168 var2 = this.field2722.field9083.field2336;
        if (this.field2722.field9083 == var2) {
            this.field2724 = -1;
        } else {
            this.field2724 = ((class460) var2).field6143;
        }
    }
}
