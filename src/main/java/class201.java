import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class201 extends class7 {

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lbg;")
    private class19 field3703 = new class19();

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lbg;")
    private class19 field3704 = new class19();

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    private int field3705 = -1;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    private int field3706 = 0;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "([III)V")
    private final void method1266(int[] arg0, int arg1, int arg2) {
        for (class7 var4 = (class7) this.field3703.method119(true); var4 != null; var4 = (class7) this.field3703.method125((byte) -78)) {
            var4.method28(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "([III)V")
    public final synchronized void method30(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3705 < 0) {
                this.method1266(arg0, arg1, arg2);
                return;
            }
            if (this.field3706 + arg2 < this.field3705) {
                this.field3706 += arg2;
                this.method1266(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3705 - this.field3706;
            this.method1266(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3706 += var4;
            this.method1272();
            class204 var5 = (class204) this.field3704.method119(true);
            synchronized (var5) {
                int var7 = var5.method1285(this);
                if (var7 < 0) {
                    var5.field3746 = 0;
                    this.method1271(var5);
                } else {
                    var5.field3746 = var7;
                    this.method1270(var5.field2759, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Laf;)V")
    public final synchronized void method1267(class7 arg0) {
        this.field3703.method122(arg0, 3);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Laf;)V")
    public final synchronized void method1268(class7 arg0) {
        arg0.method995((byte) -35);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()I")
    public final int method26() {
        return 0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()Laf;")
    public final class7 method25() {
        return (class7) this.field3703.method119(true);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public final synchronized void method27(int arg0) {
        do {
            if (this.field3705 < 0) {
                this.method1269(arg0);
                return;
            }
            if (this.field3706 + arg0 < this.field3705) {
                this.field3706 += arg0;
                this.method1269(arg0);
                return;
            }
            int var2 = this.field3705 - this.field3706;
            this.method1269(var2);
            arg0 -= var2;
            this.field3706 += var2;
            this.method1272();
            class204 var3 = (class204) this.field3704.method119(true);
            synchronized (var3) {
                int var5 = var3.method1285(this);
                if (var5 < 0) {
                    var3.field3746 = 0;
                    this.method1271(var3);
                } else {
                    var3.field3746 = var5;
                    this.method1270(var3.field2759, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    private final void method1269(int arg0) {
        for (class7 var2 = (class7) this.field3703.method119(true); var2 != null; var2 = (class7) this.field3703.method125((byte) -95)) {
            var2.method27(arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lnj;Lt;)V")
    private final void method1270(class151 arg0, class204 arg1) {
        while (this.field3704.field269 != arg0 && ((class204) arg0).field3746 <= arg1.field3746) {
            arg0 = arg0.field2759;
        }
        this.field3704.method121(arg0, arg1, (byte) 111);
        this.field3705 = ((class204) this.field3704.field269.field2759).field3746;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lt;)V")
    private final void method1271(class204 arg0) {
        arg0.method995((byte) 124);
        arg0.method1284();
        class151 var2 = this.field3704.field269.field2759;
        if (this.field3704.field269 == var2) {
            this.field3705 = -1;
        } else {
            this.field3705 = ((class204) var2).field3746;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "()V")
    private final void method1272() {
        if (this.field3706 <= 0) {
            return;
        }
        for (class204 var1 = (class204) this.field3704.method119(true); var1 != null; var1 = (class204) this.field3704.method125((byte) -125)) {
            var1.field3746 -= this.field3706;
        }
        this.field3705 -= this.field3706;
        this.field3706 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()Laf;")
    public final class7 method24() {
        return (class7) this.field3703.method125((byte) -69);
    }
}
