import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class274 extends class42 {

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lbb;")
    private class90 field4759 = new class90();

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lbb;")
    private class90 field4760 = new class90();

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field4761 = 0;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    private int field4762 = -1;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    private final void method1819() {
        if (this.field4761 <= 0) {
            return;
        }
        for (class71 var1 = (class71) this.field4760.method651(12916); var1 != null; var1 = (class71) this.field4760.method643(11066)) {
            var1.field1146 -= this.field4761;
        }
        this.field4762 -= this.field4761;
        this.field4761 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "([III)V")
    private final void method1820(int[] arg0, int arg1, int arg2) {
        for (class42 var4 = (class42) this.field4759.method651(12916); var4 != null; var4 = (class42) this.field4759.method643(11066)) {
            var4.method323(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lji;)V")
    public final synchronized void method1821(class42 arg0) {
        this.field4759.method645(25, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lil;Lhj;)V")
    private final void method1822(class161 arg0, class71 arg1) {
        while (this.field4760.field1470 != arg0 && ((class71) arg0).field1146 <= arg1.field1146) {
            arg0 = arg0.field2828;
        }
        class126.method872(arg1, arg0, 83);
        this.field4762 = ((class71) this.field4760.field1470.field2828).field1146;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lji;)V")
    public final synchronized void method1823(class42 arg0) {
        arg0.method1146(26159);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
    public final int method27() {
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lhj;)V")
    private final void method1824(class71 arg0) {
        arg0.method1146(26159);
        arg0.method510();
        class161 var2 = this.field4760.field1470.field2828;
        if (this.field4760.field1470 == var2) {
            this.field4762 = -1;
        } else {
            this.field4762 = ((class71) var2).field1146;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
    public final synchronized void method20(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4762 < 0) {
                this.method1820(arg0, arg1, arg2);
                return;
            }
            if (this.field4761 + arg2 < this.field4762) {
                this.field4761 += arg2;
                this.method1820(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4762 - this.field4761;
            this.method1820(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4761 += var4;
            this.method1819();
            class71 var5 = (class71) this.field4760.method651(12916);
            synchronized (var5) {
                int var7 = var5.method509(this);
                if (var7 < 0) {
                    var5.field1146 = 0;
                    this.method1824(var5);
                } else {
                    var5.field1146 = var7;
                    this.method1822(var5.field2828, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lji;")
    public final class42 method3() {
        return (class42) this.field4759.method643(11066);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final synchronized void method21(int arg0) {
        do {
            if (this.field4762 < 0) {
                this.method1825(arg0);
                return;
            }
            if (this.field4761 + arg0 < this.field4762) {
                this.field4761 += arg0;
                this.method1825(arg0);
                return;
            }
            int var2 = this.field4762 - this.field4761;
            this.method1825(var2);
            arg0 -= var2;
            this.field4761 += var2;
            this.method1819();
            class71 var3 = (class71) this.field4760.method651(12916);
            synchronized (var3) {
                int var5 = var3.method509(this);
                if (var5 < 0) {
                    var3.field1146 = 0;
                    this.method1824(var3);
                } else {
                    var3.field1146 = var5;
                    this.method1822(var3.field2828, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lji;")
    public final class42 method37() {
        return (class42) this.field4759.method651(12916);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    private final void method1825(int arg0) {
        for (class42 var2 = (class42) this.field4759.method651(12916); var2 != null; var2 = (class42) this.field4759.method643(11066)) {
            var2.method21(arg0);
        }
    }
}
