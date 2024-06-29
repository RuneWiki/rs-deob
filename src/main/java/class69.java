import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class69 extends class293 {

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Lar;")
    private class479 field932 = new class479();

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Lar;")
    private class479 field933 = new class479();

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    private int field934 = 0;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    private int field935 = -1;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
    public final synchronized void method523(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field935 < 0) {
                this.method580(arg0, arg1, arg2);
                return;
            }
            if (this.field934 + arg2 < this.field935) {
                this.field934 += arg2;
                this.method580(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field935 - this.field934;
            this.method580(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field934 += var4;
            this.method581();
            class262 var5 = (class262) this.field933.method2818((byte) 102);
            synchronized (var5) {
                int var7 = var5.method1573(this);
                if (var7 < 0) {
                    var5.field3632 = 0;
                    this.method579(var5);
                } else {
                    var5.field3632 = var7;
                    this.method578(var5.field3612, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "()I")
    public final synchronized int method577() {
        return this.field932.method2806((byte) 56);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "()Lad;")
    public final class293 method550() {
        return (class293) this.field932.method2818((byte) 123);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
    public final int method538() {
        return 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Luj;Lbp;)V")
    private final void method578(class260 arg0, class262 arg1) {
        while (this.field933.field6997 != arg0 && ((class262) arg0).field3632 <= arg1.field3632) {
            arg0 = arg0.field3612;
        }
        class158.method1051(arg0, arg1, -19039);
        this.field935 = ((class262) this.field933.field6997.field3612).field3632;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lbp;)V")
    private final void method579(class262 arg0) {
        arg0.method1565(0);
        arg0.method1574();
        class260 var2 = this.field933.field6997.field3612;
        if (this.field933.field6997 == var2) {
            this.field935 = -1;
        } else {
            this.field935 = ((class262) var2).field3632;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "([III)V")
    private final void method580(int[] arg0, int arg1, int arg2) {
        for (class293 var4 = (class293) this.field932.method2818((byte) 125); var4 != null; var4 = (class293) this.field932.method2820((byte) -58)) {
            var4.method1735(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "()Lad;")
    public final class293 method521() {
        return (class293) this.field932.method2820((byte) -58);
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "()V")
    private final void method581() {
        if (this.field934 <= 0) {
            return;
        }
        for (class262 var1 = (class262) this.field933.method2818((byte) 112); var1 != null; var1 = (class262) this.field933.method2820((byte) -58)) {
            var1.field3632 -= this.field934;
        }
        this.field935 -= this.field934;
        this.field934 = 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lad;)V")
    public final synchronized void method582(class293 arg0) {
        arg0.method1565(0);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public final synchronized void method546(int arg0) {
        do {
            if (this.field935 < 0) {
                this.method584(arg0);
                return;
            }
            if (this.field934 + arg0 < this.field935) {
                this.field934 += arg0;
                this.method584(arg0);
                return;
            }
            int var2 = this.field935 - this.field934;
            this.method584(var2);
            arg0 -= var2;
            this.field934 += var2;
            this.method581();
            class262 var3 = (class262) this.field933.method2818((byte) 104);
            synchronized (var3) {
                int var5 = var3.method1573(this);
                if (var5 < 0) {
                    var3.field3632 = 0;
                    this.method579(var3);
                } else {
                    var3.field3632 = var5;
                    this.method578(var3.field3612, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lad;)V")
    public final synchronized void method583(class293 arg0) {
        this.field932.method2817(arg0, true);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    private final void method584(int arg0) {
        for (class293 var2 = (class293) this.field932.method2818((byte) 111); var2 != null; var2 = (class293) this.field932.method2820((byte) -58)) {
            var2.method546(arg0);
        }
    }
}
