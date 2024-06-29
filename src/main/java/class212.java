import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class212 extends class206 {

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Lid;")
    private class226 field3673 = new class226();

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "Lid;")
    private class226 field3674 = new class226();

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    private int field3676 = 0;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    private int field3675 = -1;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lj;")
    public final class206 method395() {
        return (class206) this.field3673.method1570(3);
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "()V")
    private final void method1508() {
        if (this.field3676 <= 0) {
            return;
        }
        for (class155 var1 = (class155) this.field3674.method1566(-3); var1 != null; var1 = (class155) this.field3674.method1570(3)) {
            var1.field2601 -= this.field3676;
        }
        this.field3675 -= this.field3676;
        this.field3676 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lei;Loh;)V")
    private final void method1509(class62 arg0, class155 arg1) {
        while (this.field3674.field3881 != arg0 && ((class155) arg0).field2601 <= arg1.field2601) {
            arg0 = arg0.field1013;
        }
        class100.method649(-17487, arg1, arg0);
        this.field3675 = ((class155) this.field3674.field3881.field1013).field2601;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final synchronized void method394(int arg0) {
        do {
            if (this.field3675 < 0) {
                this.method1510(arg0);
                return;
            }
            if (this.field3676 + arg0 < this.field3675) {
                this.field3676 += arg0;
                this.method1510(arg0);
                return;
            }
            int var2 = this.field3675 - this.field3676;
            this.method1510(var2);
            arg0 -= var2;
            this.field3676 += var2;
            this.method1508();
            class155 var3 = (class155) this.field3674.method1566(-3);
            synchronized (var3) {
                int var5 = var3.method1059(this);
                if (var5 < 0) {
                    var3.field2601 = 0;
                    this.method1513(var3);
                } else {
                    var3.field2601 = var5;
                    this.method1509(var3.field1013, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()I")
    public final int method396() {
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    private final void method1510(int arg0) {
        for (class206 var2 = (class206) this.field3673.method1566(-3); var2 != null; var2 = (class206) this.field3673.method1570(3)) {
            var2.method394(arg0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)V")
    public final synchronized void method391(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3675 < 0) {
                this.method1511(arg0, arg1, arg2);
                return;
            }
            if (this.field3676 + arg2 < this.field3675) {
                this.field3676 += arg2;
                this.method1511(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3675 - this.field3676;
            this.method1511(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3676 += var4;
            this.method1508();
            class155 var5 = (class155) this.field3674.method1566(-3);
            synchronized (var5) {
                int var7 = var5.method1059(this);
                if (var7 < 0) {
                    var5.field2601 = 0;
                    this.method1513(var5);
                } else {
                    var5.field2601 = var7;
                    this.method1509(var5.field1013, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "([III)V")
    private final void method1511(int[] arg0, int arg1, int arg2) {
        for (class206 var4 = (class206) this.field3673.method1566(-3); var4 != null; var4 = (class206) this.field3673.method1570(3)) {
            var4.method1422(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lj;)V")
    public final synchronized void method1512(class206 arg0) {
        this.field3673.method1567(0, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Loh;)V")
    private final void method1513(class155 arg0) {
        arg0.method441(16773377);
        arg0.method1060();
        class62 var2 = this.field3674.field3881.field1013;
        if (this.field3674.field3881 == var2) {
            this.field3675 = -1;
        } else {
            this.field3675 = ((class155) var2).field2601;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()Lj;")
    public final class206 method411() {
        return (class206) this.field3673.method1566(-3);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lj;)V")
    public final synchronized void method1514(class206 arg0) {
        arg0.method441(16773377);
    }
}
