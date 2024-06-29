import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class64 extends class101 {

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Lok;")
    private class266 field769 = new class266();

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "Lok;")
    private class266 field770 = new class266();

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    private int field771 = -1;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    private int field772 = 0;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Llq;Lfd;)V")
    private final void method423(class577 arg0, class552 arg1) {
        while (this.field770.field3876 != arg0 && ((class552) arg0).field7921 <= arg1.field7921) {
            arg0 = arg0.field8131;
        }
        class788.method4316(-80, arg1, arg0);
        this.field771 = ((class552) this.field770.field3876.field8131).field7921;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "()Lsd;")
    public final class101 method191() {
        return (class101) this.field769.method1731((byte) -125);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lsd;)V")
    public final synchronized void method424(class101 arg0) {
        this.field769.method1728(-126, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final synchronized void method182(int arg0) {
        do {
            if (this.field771 < 0) {
                this.method428(arg0);
                return;
            }
            if (this.field772 + arg0 < this.field771) {
                this.field772 += arg0;
                this.method428(arg0);
                return;
            }
            int var2 = this.field771 - this.field772;
            this.method428(var2);
            arg0 -= var2;
            this.field772 += var2;
            this.method429();
            class552 var3 = (class552) this.field770.method1731((byte) -112);
            synchronized (var3) {
                int var5 = var3.method3291(this);
                if (var5 < 0) {
                    var3.field7921 = 0;
                    this.method430(var3);
                } else {
                    var3.field7921 = var5;
                    this.method423(var3.field8131, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "()I")
    public final synchronized int method425() {
        return this.field769.method1735(-121);
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "()Lsd;")
    public final class101 method176() {
        return (class101) this.field769.method1724(0);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Lsd;)V")
    public final synchronized void method426(class101 arg0) {
        arg0.method3387((byte) -107);
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "([III)V")
    private final void method427(int[] arg0, int arg1, int arg2) {
        for (class101 var4 = (class101) this.field769.method1731((byte) -124); var4 != null; var4 = (class101) this.field769.method1724(0)) {
            var4.method724(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    private final void method428(int arg0) {
        for (class101 var2 = (class101) this.field769.method1731((byte) -118); var2 != null; var2 = (class101) this.field769.method1724(0)) {
            var2.method182(arg0);
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "()V")
    private final void method429() {
        if (this.field772 <= 0) {
            return;
        }
        for (class552 var1 = (class552) this.field770.method1731((byte) -120); var1 != null; var1 = (class552) this.field770.method1724(0)) {
            var1.field7921 -= this.field772;
        }
        this.field771 -= this.field772;
        this.field772 = 0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()I")
    public final int method210() {
        return 0;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "([III)V")
    public final synchronized void method203(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field771 < 0) {
                this.method427(arg0, arg1, arg2);
                return;
            }
            if (this.field772 + arg2 < this.field771) {
                this.field772 += arg2;
                this.method427(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field771 - this.field772;
            this.method427(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field772 += var4;
            this.method429();
            class552 var5 = (class552) this.field770.method1731((byte) -109);
            synchronized (var5) {
                int var7 = var5.method3291(this);
                if (var7 < 0) {
                    var5.field7921 = 0;
                    this.method430(var5);
                } else {
                    var5.field7921 = var7;
                    this.method423(var5.field8131, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lfd;)V")
    private final void method430(class552 arg0) {
        arg0.method3387((byte) -85);
        arg0.method3290();
        class577 var2 = this.field770.field3876.field8131;
        if (this.field770.field3876 == var2) {
            this.field771 = -1;
        } else {
            this.field771 = ((class552) var2).field7921;
        }
    }
}
