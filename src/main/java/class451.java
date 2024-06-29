import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class451 extends class345 {

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lvn;")
    private class169 field6579 = new class169();

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "Lvn;")
    private class169 field6580 = new class169();

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    private int field6582 = -1;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    private int field6581 = 0;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 5)
    private final void method2806(int arg0) {
        for (class345 var2 = (class345) this.field6579.method1124(-1); var2 != null; var2 = (class345) this.field6579.method1119(false)) {
            var2.method265(arg0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lnf;)V", line = 18)
    public final synchronized void method2807(class345 arg0) {
        arg0.method2290((byte) 98);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()I", line = 21)
    public final int method274() {
        return 0;
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "()V", line = 25)
    private final void method2808() {
        if (this.field6581 <= 0) {
            return;
        }
        for (class273 var1 = (class273) this.field6580.method1124(-1); var1 != null; var1 = (class273) this.field6580.method1119(false)) {
            var1.field3872 -= this.field6581;
        }
        this.field6582 -= this.field6581;
        this.field6581 = 0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lcq;)V", line = 43)
    private final void method2809(class273 arg0) {
        arg0.method2290((byte) 98);
        arg0.method1732();
        class359 var2 = this.field6580.field2358.field5243;
        if (this.field6580.field2358 == var2) {
            this.field6582 = -1;
        } else {
            this.field6582 = ((class273) var2).field3872;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()Lnf;", line = 57)
    public final class345 method268() {
        return (class345) this.field6579.method1119(false);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lnf;)V", line = 62)
    public final synchronized void method2810(class345 arg0) {
        this.field6579.method1123((byte) 126, arg0);
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "()Lnf;", line = 66)
    public final class345 method273() {
        return (class345) this.field6579.method1124(-1);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lqs;Lcq;)V", line = 73)
    private final void method2811(class359 arg0, class273 arg1) {
        while (this.field6580.field2358 != arg0 && ((class273) arg0).field3872 <= arg1.field3872) {
            arg0 = arg0.field5243;
        }
        class294.method1870(64, arg1, arg0);
        this.field6582 = ((class273) this.field6580.field2358.field5243).field3872;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "([III)V", line = 84)
    public final synchronized void method270(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6582 < 0) {
                this.method2812(arg0, arg1, arg2);
                return;
            }
            if (this.field6581 + arg2 < this.field6582) {
                this.field6581 += arg2;
                this.method2812(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6582 - this.field6581;
            this.method2812(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6581 += var4;
            this.method2808();
            class273 var5 = (class273) this.field6580.method1124(-1);
            synchronized (var5) {
                int var7 = var5.method1731(this);
                if (var7 < 0) {
                    var5.field3872 = 0;
                    this.method2809(var5);
                } else {
                    var5.field3872 = var7;
                    this.method2811(var5.field5243, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 131)
    public final synchronized void method265(int arg0) {
        do {
            if (this.field6582 < 0) {
                this.method2806(arg0);
                return;
            }
            if (this.field6581 + arg0 < this.field6582) {
                this.field6581 += arg0;
                this.method2806(arg0);
                return;
            }
            int var2 = this.field6582 - this.field6581;
            this.method2806(var2);
            arg0 -= var2;
            this.field6581 += var2;
            this.method2808();
            class273 var3 = (class273) this.field6580.method1124(-1);
            synchronized (var3) {
                int var5 = var3.method1731(this);
                if (var5 < 0) {
                    var3.field3872 = 0;
                    this.method2809(var3);
                } else {
                    var3.field3872 = var5;
                    this.method2811(var3.field5243, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "([III)V", line = 181)
    private final void method2812(int[] arg0, int arg1, int arg2) {
        for (class345 var4 = (class345) this.field6579.method1124(-1); var4 != null; var4 = (class345) this.field6579.method1119(false)) {
            var4.method2207(arg0, arg1, arg2);
        }
    }
}
