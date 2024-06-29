import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class157 extends class203 {

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lng;")
    private class76 field2814 = new class76();

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lng;")
    private class76 field2815 = new class76();

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    private int field2816 = 0;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    private int field2817 = -1;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([III)V")
    public final synchronized void method159(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2817 < 0) {
                this.method1075(arg0, arg1, arg2);
                return;
            }
            if (this.field2816 + arg2 < this.field2817) {
                this.field2816 += arg2;
                this.method1075(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2817 - this.field2816;
            this.method1075(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2816 += var4;
            this.method1079();
            class10 var5 = (class10) this.field2815.method529(10);
            synchronized (var5) {
                int var7 = var5.method68(this);
                if (var7 < 0) {
                    var5.field83 = 0;
                    this.method1078(var5);
                } else {
                    var5.field83 = var7;
                    this.method1074(var5.field2184, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lhk;Lmf;)V")
    private final void method1074(class125 arg0, class10 arg1) {
        while (this.field2815.field1335 != arg0 && ((class10) arg0).field83 <= arg1.field83) {
            arg0 = arg0.field2184;
        }
        class252.method1633(arg1, true, arg0);
        this.field2817 = ((class10) this.field2815.field1335.field2184).field83;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "([III)V")
    private final void method1075(int[] arg0, int arg1, int arg2) {
        for (class203 var4 = (class203) this.field2814.method529(10); var4 != null; var4 = (class203) this.field2814.method533(61)) {
            var4.method1370(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
    public final int method144() {
        return 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lel;)V")
    public final synchronized void method1076(class203 arg0) {
        arg0.method828((byte) -104);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    private final void method1077(int arg0) {
        for (class203 var2 = (class203) this.field2814.method529(10); var2 != null; var2 = (class203) this.field2814.method533(-77)) {
            var2.method177(arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lmf;)V")
    private final void method1078(class10 arg0) {
        arg0.method828((byte) -111);
        arg0.method69();
        class125 var2 = this.field2815.field1335.field2184;
        if (this.field2815.field1335 == var2) {
            this.field2817 = -1;
        } else {
            this.field2817 = ((class10) var2).field83;
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
    private final void method1079() {
        if (this.field2816 <= 0) {
            return;
        }
        for (class10 var1 = (class10) this.field2815.method529(10); var1 != null; var1 = (class10) this.field2815.method533(84)) {
            var1.field83 -= this.field2816;
        }
        this.field2817 -= this.field2816;
        this.field2816 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lel;)V")
    public final synchronized void method1080(class203 arg0) {
        this.field2814.method527(arg0, 10);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lel;")
    public final class203 method140() {
        return (class203) this.field2814.method533(99);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()Lel;")
    public final class203 method154() {
        return (class203) this.field2814.method529(10);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public final synchronized void method177(int arg0) {
        do {
            if (this.field2817 < 0) {
                this.method1077(arg0);
                return;
            }
            if (this.field2816 + arg0 < this.field2817) {
                this.field2816 += arg0;
                this.method1077(arg0);
                return;
            }
            int var2 = this.field2817 - this.field2816;
            this.method1077(var2);
            arg0 -= var2;
            this.field2816 += var2;
            this.method1079();
            class10 var3 = (class10) this.field2815.method529(10);
            synchronized (var3) {
                int var5 = var3.method68(this);
                if (var5 < 0) {
                    var3.field83 = 0;
                    this.method1078(var3);
                } else {
                    var3.field83 = var5;
                    this.method1074(var3.field2184, var3);
                }
            }
        } while (arg0 != 0);
    }
}
