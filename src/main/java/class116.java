import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class40 {

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lwd;")
    private class157 field2775 = new class157();

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lwd;")
    private class157 field2776 = new class157();

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field2777 = -1;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lfd;)V")
    public final synchronized void method909(class40 arg0) {
        arg0.method1093(0);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
    public final synchronized void method116(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2777 < 0) {
                this.method910(arg0, arg1, arg2);
                return;
            }
            if (this.field2778 + arg2 < this.field2777) {
                this.field2778 += arg2;
                this.method910(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2777 - this.field2778;
            this.method910(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2778 += var4;
            this.method913();
            class153 var5 = (class153) this.field2776.method1213(91);
            synchronized (var5) {
                int var7 = var5.method1190(this);
                if (var7 < 0) {
                    var5.field3511 = 0;
                    this.method915(var5);
                } else {
                    var5.field3511 = var7;
                    this.method911(var5.field3322, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "([III)V")
    private final void method910(int[] arg0, int arg1, int arg2) {
        for (class40 var4 = (class40) this.field2775.method1213(81); var4 != null; var4 = (class40) this.field2775.method1211(-3)) {
            var4.method321(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lv;Lw;)V")
    private final void method911(class146 arg0, class153 arg1) {
        while (this.field2776.field3583 != arg0 && ((class153) arg0).field3511 <= arg1.field3511) {
            arg0 = arg0.field3322;
        }
        this.field2776.method1218(arg1, arg0, 119);
        this.field2777 = ((class153) this.field2776.field3583.field3322).field3511;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final synchronized void method104(int arg0) {
        do {
            if (this.field2777 < 0) {
                this.method912(arg0);
                return;
            }
            if (this.field2778 + arg0 < this.field2777) {
                this.field2778 += arg0;
                this.method912(arg0);
                return;
            }
            int var2 = this.field2777 - this.field2778;
            this.method912(var2);
            arg0 -= var2;
            this.field2778 += var2;
            this.method913();
            class153 var3 = (class153) this.field2776.method1213(103);
            synchronized (var3) {
                int var5 = var3.method1190(this);
                if (var5 < 0) {
                    var3.field3511 = 0;
                    this.method915(var3);
                } else {
                    var3.field3511 = var5;
                    this.method911(var3.field3322, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lfd;")
    public final class40 method106() {
        return (class40) this.field2775.method1213(99);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    private final void method912(int arg0) {
        for (class40 var2 = (class40) this.field2775.method1213(85); var2 != null; var2 = (class40) this.field2775.method1211(-3)) {
            var2.method104(arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lfd;")
    public final class40 method113() {
        return (class40) this.field2775.method1211(-3);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    private final void method913() {
        if (this.field2778 <= 0) {
            return;
        }
        for (class153 var1 = (class153) this.field2776.method1213(110); var1 != null; var1 = (class153) this.field2776.method1211(-3)) {
            var1.field3511 -= this.field2778;
        }
        this.field2777 -= this.field2778;
        this.field2778 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lfd;)V")
    public final synchronized void method914(class40 arg0) {
        this.field2775.method1209(-46, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lw;)V")
    private final void method915(class153 arg0) {
        arg0.method1093(0);
        arg0.method1191();
        class146 var2 = this.field2776.field3583.field3322;
        if (this.field2776.field3583 == var2) {
            this.field2777 = -1;
        } else {
            this.field2777 = ((class153) var2).field3511;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
    public final int method87() {
        return 0;
    }
}
