import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class115 extends class83 {

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Lmd;")
    private class84 field2689 = new class84();

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lmd;")
    private class84 field2690 = new class84();

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    private int field2692 = -1;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lc;)V")
    private final void method890(class15 arg0) {
        arg0.method540(-26669);
        arg0.method118();
        class67 var2 = this.field2690.field1863.field1441;
        if (this.field2690.field1863 == var2) {
            this.field2692 = -1;
        } else {
            this.field2692 = ((class15) var2).field315;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
    public final synchronized void method37(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2692 < 0) {
                this.method892(arg0, arg1, arg2);
                return;
            }
            if (this.field2691 + arg2 < this.field2692) {
                this.field2691 += arg2;
                this.method892(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2692 - this.field2691;
            this.method892(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2691 += var4;
            this.method893();
            class15 var5 = (class15) this.field2690.method654((byte) 86);
            synchronized (var5) {
                int var7 = var5.method119(this);
                if (var7 < 0) {
                    var5.field315 = 0;
                    this.method890(var5);
                } else {
                    var5.field315 = var7;
                    this.method896(var5.field1441, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    private final void method891(int arg0) {
        for (class83 var2 = (class83) this.field2689.method654((byte) 106); var2 != null; var2 = (class83) this.field2689.method644((byte) -68)) {
            var2.method27(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public final synchronized void method27(int arg0) {
        do {
            if (this.field2692 < 0) {
                this.method891(arg0);
                return;
            }
            if (this.field2691 + arg0 < this.field2692) {
                this.field2691 += arg0;
                this.method891(arg0);
                return;
            }
            int var2 = this.field2692 - this.field2691;
            this.method891(var2);
            arg0 -= var2;
            this.field2691 += var2;
            this.method893();
            class15 var3 = (class15) this.field2690.method654((byte) 120);
            synchronized (var3) {
                int var5 = var3.method119(this);
                if (var5 < 0) {
                    var3.field315 = 0;
                    this.method890(var3);
                } else {
                    var3.field315 = var5;
                    this.method896(var3.field1441, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "([III)V")
    private final void method892(int[] arg0, int arg1, int arg2) {
        for (class83 var4 = (class83) this.field2689.method654((byte) 31); var4 != null; var4 = (class83) this.field2689.method644((byte) -68)) {
            var4.method642(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Lmc;")
    public final class83 method42() {
        return (class83) this.field2689.method654((byte) 116);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "()V")
    private final void method893() {
        if (this.field2691 <= 0) {
            return;
        }
        for (class15 var1 = (class15) this.field2690.method654((byte) 29); var1 != null; var1 = (class15) this.field2690.method644((byte) -68)) {
            var1.field315 -= this.field2691;
        }
        this.field2692 -= this.field2691;
        this.field2691 = 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lmc;)V")
    public final synchronized void method894(class83 arg0) {
        arg0.method540(-26669);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
    public final int method21() {
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lmc;)V")
    public final synchronized void method895(class83 arg0) {
        this.field2689.method647(0, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lje;Lc;)V")
    private final void method896(class67 arg0, class15 arg1) {
        while (this.field2690.field1863 != arg0 && ((class15) arg0).field315 <= arg1.field315) {
            arg0 = arg0.field1441;
        }
        this.field2690.method655((byte) 125, arg0, arg1);
        this.field2692 = ((class15) this.field2690.field1863.field1441).field315;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()Lmc;")
    public final class83 method32() {
        return (class83) this.field2689.method644((byte) -68);
    }
}
