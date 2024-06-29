import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class38 extends class40 {

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Lci;")
    private class60 field571 = new class60();

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Lci;")
    private class60 field572 = new class60();

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    private int field573 = -1;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    private int field574 = 0;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
    private final void method249() {
        if (this.field574 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field572.method379(6347); var1 != null; var1 = (class120) this.field572.method378(-125)) {
            var1.field2118 -= this.field574;
        }
        this.field573 -= this.field574;
        this.field574 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    private final void method250(int arg0) {
        for (class40 var2 = (class40) this.field571.method379(6347); var2 != null; var2 = (class40) this.field571.method378(106)) {
            var2.method253(arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()Lok;")
    public final class40 method251() {
        return (class40) this.field571.method379(6347);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Lok;")
    public final class40 method252() {
        return (class40) this.field571.method378(113);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final synchronized void method253(int arg0) {
        do {
            if (this.field573 < 0) {
                this.method250(arg0);
                return;
            }
            if (this.field574 + arg0 < this.field573) {
                this.field574 += arg0;
                this.method250(arg0);
                return;
            }
            int var2 = this.field573 - this.field574;
            this.method250(var2);
            arg0 -= var2;
            this.field574 += var2;
            this.method249();
            class120 var3 = (class120) this.field572.method379(6347);
            synchronized (var3) {
                int var5 = var3.method820(this);
                if (var5 < 0) {
                    var3.field2118 = 0;
                    this.method260(var3);
                } else {
                    var3.field2118 = var5;
                    this.method258(var3.field1506, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lok;)V")
    public final synchronized void method254(class40 arg0) {
        this.field571.method380(arg0, 121);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "([III)V")
    private final void method255(int[] arg0, int arg1, int arg2) {
        for (class40 var4 = (class40) this.field571.method379(6347); var4 != null; var4 = (class40) this.field571.method378(-71)) {
            var4.method269(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public final int method256() {
        return 0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
    public final synchronized void method257(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field573 < 0) {
                this.method255(arg0, arg1, arg2);
                return;
            }
            if (this.field574 + arg2 < this.field573) {
                this.field574 += arg2;
                this.method255(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field573 - this.field574;
            this.method255(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field574 += var4;
            this.method249();
            class120 var5 = (class120) this.field572.method379(6347);
            synchronized (var5) {
                int var7 = var5.method820(this);
                if (var7 < 0) {
                    var5.field2118 = 0;
                    this.method260(var5);
                } else {
                    var5.field2118 = var7;
                    this.method258(var5.field1506, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lia;Lhd;)V")
    private final void method258(class83 arg0, class120 arg1) {
        while (this.field572.field1035 != arg0 && ((class120) arg0).field2118 <= arg1.field2118) {
            arg0 = arg0.field1506;
        }
        class199.method1319(arg0, arg1, (byte) 68);
        this.field573 = ((class120) this.field572.field1035.field1506).field2118;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lok;)V")
    public final synchronized void method259(class40 arg0) {
        arg0.method547(10026);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhd;)V")
    private final void method260(class120 arg0) {
        arg0.method547(10026);
        arg0.method821();
        class83 var2 = this.field572.field1035.field1506;
        if (this.field572.field1035 == var2) {
            this.field573 = -1;
        } else {
            this.field573 = ((class120) var2).field2118;
        }
    }
}
