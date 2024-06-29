import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class448 extends class55 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Laq;")
    private class90 field6279 = new class90();

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Laq;")
    private class90 field6280 = new class90();

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field6282 = -1;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field6281 = 0;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "()V", line = 7)
    private final void method2787() {
        if (this.field6281 <= 0) {
            return;
        }
        for (class37 var1 = (class37) this.field6280.method646(48); var1 != null; var1 = (class37) this.field6280.method641(false)) {
            var1.field546 -= this.field6281;
        }
        this.field6282 -= this.field6281;
        this.field6281 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I", line = 26)
    public final int method451() {
        return 0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ler;)V", line = 36)
    public final synchronized void method2788(class55 arg0) {
        arg0.method2467((byte) -80);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()Ler;", line = 40)
    public final class55 method454() {
        return (class55) this.field6279.method646(48);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()Ler;", line = 44)
    public final class55 method453() {
        return (class55) this.field6279.method641(false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lpl;Lda;)V", line = 48)
    private final void method2789(class390 arg0, class37 arg1) {
        while (this.field6280.field1267 != arg0 && ((class37) arg0).field546 <= arg1.field546) {
            arg0 = arg0.field5597;
        }
        class214.method1400(arg0, arg1, -85);
        this.field6282 = ((class37) this.field6280.field1267.field5597).field546;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 58)
    public final synchronized void method455(int arg0) {
        do {
            if (this.field6282 < 0) {
                this.method2793(arg0);
                return;
            }
            if (this.field6281 + arg0 < this.field6282) {
                this.field6281 += arg0;
                this.method2793(arg0);
                return;
            }
            int var2 = this.field6282 - this.field6281;
            this.method2793(var2);
            arg0 -= var2;
            this.field6281 += var2;
            this.method2787();
            class37 var3 = (class37) this.field6280.method646(48);
            synchronized (var3) {
                int var5 = var3.method351(this);
                if (var5 < 0) {
                    var3.field546 = 0;
                    this.method2790(var3);
                } else {
                    var3.field546 = var5;
                    this.method2789(var3.field5597, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lda;)V", line = 102)
    private final void method2790(class37 arg0) {
        arg0.method2467((byte) 84);
        arg0.method350();
        class390 var2 = this.field6280.field1267.field5597;
        if (this.field6280.field1267 == var2) {
            this.field6282 = -1;
        } else {
            this.field6282 = ((class37) var2).field546;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "([III)V", line = 117)
    private final void method2791(int[] arg0, int arg1, int arg2) {
        for (class55 var4 = (class55) this.field6279.method646(48); var4 != null; var4 = (class55) this.field6279.method641(false)) {
            var4.method450(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ler;)V", line = 128)
    public final synchronized void method2792(class55 arg0) {
        this.field6279.method639(arg0, true);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V", line = 136)
    public final synchronized void method452(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6282 < 0) {
                this.method2791(arg0, arg1, arg2);
                return;
            }
            if (this.field6281 + arg2 < this.field6282) {
                this.field6281 += arg2;
                this.method2791(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6282 - this.field6281;
            this.method2791(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6281 += var4;
            this.method2787();
            class37 var5 = (class37) this.field6280.method646(48);
            synchronized (var5) {
                int var7 = var5.method351(this);
                if (var7 < 0) {
                    var5.field546 = 0;
                    this.method2790(var5);
                } else {
                    var5.field546 = var7;
                    this.method2789(var5.field5597, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 183)
    private final void method2793(int arg0) {
        for (class55 var2 = (class55) this.field6279.method646(48); var2 != null; var2 = (class55) this.field6279.method641(false)) {
            var2.method455(arg0);
        }
    }
}
