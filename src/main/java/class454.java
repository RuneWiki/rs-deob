import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class454 extends class417 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lkba;")
    private class108 field6311 = new class108();

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lkba;")
    private class108 field6312 = new class108();

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    private int field6314 = -1;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field6313 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lmha;)V")
    public final synchronized void method2539(class417 arg0) {
        this.field6311.method729(-2, arg0);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([III)V")
    public final synchronized void method1985(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6314 < 0) {
                this.method2544(arg0, arg1, arg2);
                return;
            }
            if (this.field6313 + arg2 < this.field6314) {
                this.field6313 += arg2;
                this.method2544(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6314 - this.field6313;
            this.method2544(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6313 += var4;
            this.method2543();
            class448 var5 = (class448) this.field6312.method724(32);
            synchronized (var5) {
                int var7 = var5.method2515(this);
                if (var7 < 0) {
                    var5.field6247 = 0;
                    this.method2546(var5);
                } else {
                    var5.field6247 = var7;
                    this.method2540(var5.field564, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lgda;Lpr;)V")
    private final void method2540(class55 arg0, class448 arg1) {
        while (this.field6312.field1438 != arg0 && ((class448) arg0).field6247 <= arg1.field6247) {
            arg0 = arg0.field564;
        }
        class242.method1453(arg0, arg1, (byte) 24);
        this.field6314 = ((class448) this.field6312.field1438.field564).field6247;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    private final void method2541(int arg0) {
        for (class417 var2 = (class417) this.field6311.method724(32); var2 != null; var2 = (class417) this.field6311.method723(114)) {
            var2.method1974(arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final synchronized void method1974(int arg0) {
        do {
            if (this.field6314 < 0) {
                this.method2541(arg0);
                return;
            }
            if (this.field6313 + arg0 < this.field6314) {
                this.field6313 += arg0;
                this.method2541(arg0);
                return;
            }
            int var2 = this.field6314 - this.field6313;
            this.method2541(var2);
            arg0 -= var2;
            this.field6313 += var2;
            this.method2543();
            class448 var3 = (class448) this.field6312.method724(32);
            synchronized (var3) {
                int var5 = var3.method2515(this);
                if (var5 < 0) {
                    var3.field6247 = 0;
                    this.method2546(var3);
                } else {
                    var3.field6247 = var5;
                    this.method2540(var3.field564, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Lmha;)V")
    public final synchronized void method2542(class417 arg0) {
        arg0.method315(44);
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()V")
    private final void method2543() {
        if (this.field6313 <= 0) {
            return;
        }
        for (class448 var1 = (class448) this.field6312.method724(32); var1 != null; var1 = (class448) this.field6312.method723(104)) {
            var1.field6247 -= this.field6313;
        }
        this.field6314 -= this.field6313;
        this.field6313 = 0;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()Lmha;")
    public final class417 method1991() {
        return (class417) this.field6311.method723(106);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
    public final int method1979() {
        return 0;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "([III)V")
    private final void method2544(int[] arg0, int arg1, int arg2) {
        for (class417 var4 = (class417) this.field6311.method724(32); var4 != null; var4 = (class417) this.field6311.method723(113)) {
            var4.method2398(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "()I")
    public final synchronized int method2545() {
        return this.field6311.method730(0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()Lmha;")
    public final class417 method1989() {
        return (class417) this.field6311.method724(32);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lpr;)V")
    private final void method2546(class448 arg0) {
        arg0.method315(65);
        arg0.method2514();
        class55 var2 = this.field6312.field1438.field564;
        if (this.field6312.field1438 == var2) {
            this.field6314 = -1;
        } else {
            this.field6314 = ((class448) var2).field6247;
        }
    }
}
