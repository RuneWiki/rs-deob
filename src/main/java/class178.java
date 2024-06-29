import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class178 extends class23 {

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lam;")
    private class180 field2776 = new class180();

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lam;")
    private class180 field2777 = new class180();

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    private int field2778 = -1;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private int field2779 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwd;)V")
    public final synchronized void method1203(class23 arg0) {
        this.field2776.method1222(74, arg0);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()Lwd;")
    public final class23 method45() {
        return (class23) this.field2776.method1227(-10626);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()Lwd;")
    public final class23 method33() {
        return (class23) this.field2776.method1221(120);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lrd;)V")
    private final void method1204(class273 arg0) {
        arg0.method1123(0);
        arg0.method1841();
        class166 var2 = this.field2777.field2801.field2608;
        if (this.field2777.field2801 == var2) {
            this.field2778 = -1;
        } else {
            this.field2778 = ((class273) var2).field4368;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final synchronized void method32(int arg0) {
        do {
            if (this.field2778 < 0) {
                this.method1207(arg0);
                return;
            }
            if (this.field2779 + arg0 < this.field2778) {
                this.field2779 += arg0;
                this.method1207(arg0);
                return;
            }
            int var2 = this.field2778 - this.field2779;
            this.method1207(var2);
            arg0 -= var2;
            this.field2779 += var2;
            this.method1206();
            class273 var3 = (class273) this.field2777.method1221(122);
            synchronized (var3) {
                int var5 = var3.method1840(this);
                if (var5 < 0) {
                    var3.field4368 = 0;
                    this.method1204(var3);
                } else {
                    var3.field4368 = var5;
                    this.method1208(var3.field2608, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lwd;)V")
    public final synchronized void method1205(class23 arg0) {
        arg0.method1123(0);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
    private final void method1206() {
        if (this.field2779 <= 0) {
            return;
        }
        for (class273 var1 = (class273) this.field2777.method1221(116); var1 != null; var1 = (class273) this.field2777.method1227(-10626)) {
            var1.field4368 -= this.field2779;
        }
        this.field2778 -= this.field2779;
        this.field2779 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
    public final int method22() {
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    private final void method1207(int arg0) {
        for (class23 var2 = (class23) this.field2776.method1221(126); var2 != null; var2 = (class23) this.field2776.method1227(-10626)) {
            var2.method32(arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([III)V")
    public final synchronized void method26(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2778 < 0) {
                this.method1209(arg0, arg1, arg2);
                return;
            }
            if (this.field2779 + arg2 < this.field2778) {
                this.field2779 += arg2;
                this.method1209(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2778 - this.field2779;
            this.method1209(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2779 += var4;
            this.method1206();
            class273 var5 = (class273) this.field2777.method1221(125);
            synchronized (var5) {
                int var7 = var5.method1840(this);
                if (var7 < 0) {
                    var5.field4368 = 0;
                    this.method1204(var5);
                } else {
                    var5.field4368 = var7;
                    this.method1208(var5.field2608, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lek;Lrd;)V")
    private final void method1208(class166 arg0, class273 arg1) {
        while (this.field2777.field2801 != arg0 && ((class273) arg0).field4368 <= arg1.field4368) {
            arg0 = arg0.field2608;
        }
        class209.method1407(arg1, arg0, 34);
        this.field2778 = ((class273) this.field2777.field2801.field2608).field4368;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "([III)V")
    private final void method1209(int[] arg0, int arg1, int arg2) {
        for (class23 var4 = (class23) this.field2776.method1221(126); var4 != null; var4 = (class23) this.field2776.method1227(-10626)) {
            var4.method201(arg0, arg1, arg2);
        }
    }
}
