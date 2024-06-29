import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class146 extends class270 {

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "Lui;")
    private class193 field1753 = new class193();

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "Lui;")
    private class193 field1754 = new class193();

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
    private int field1756 = 0;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
    private int field1755 = -1;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lnc;)V")
    private final void method798(class23 arg0) {
        arg0.method3187(true);
        arg0.method140();
        class544 var2 = this.field1754.field2331.field7964;
        if (this.field1754.field2331 == var2) {
            this.field1755 = -1;
        } else {
            this.field1755 = ((class23) var2).field155;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "([III)V")
    public final synchronized void method799(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1755 < 0) {
                this.method808(arg0, arg1, arg2);
                return;
            }
            if (this.field1756 + arg2 < this.field1755) {
                this.field1756 += arg2;
                this.method808(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1755 - this.field1756;
            this.method808(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1756 += var4;
            this.method809();
            class23 var5 = (class23) this.field1754.method1050((byte) 73);
            synchronized (var5) {
                int var7 = var5.method141(this);
                if (var7 < 0) {
                    var5.field155 = 0;
                    this.method798(var5);
                } else {
                    var5.field155 = var7;
                    this.method802(var5.field7964, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "()I")
    public final int method800() {
        return 0;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "()Lvv;")
    public final class270 method801() {
        return (class270) this.field1753.method1047(-7962);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lwda;Lnc;)V")
    private final void method802(class544 arg0, class23 arg1) {
        while (this.field1754.field2331 != arg0 && ((class23) arg0).field155 <= arg1.field155) {
            arg0 = arg0.field7964;
        }
        class530.method3019(arg1, arg0, -311981535);
        this.field1755 = ((class23) this.field1754.field2331.field7964).field155;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lvv;)V")
    public final synchronized void method803(class270 arg0) {
        arg0.method3187(true);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final synchronized void method804(int arg0) {
        do {
            if (this.field1755 < 0) {
                this.method805(arg0);
                return;
            }
            if (this.field1756 + arg0 < this.field1755) {
                this.field1756 += arg0;
                this.method805(arg0);
                return;
            }
            int var2 = this.field1755 - this.field1756;
            this.method805(var2);
            arg0 -= var2;
            this.field1756 += var2;
            this.method809();
            class23 var3 = (class23) this.field1754.method1050((byte) 73);
            synchronized (var3) {
                int var5 = var3.method141(this);
                if (var5 < 0) {
                    var3.field155 = 0;
                    this.method798(var3);
                } else {
                    var3.field155 = var5;
                    this.method802(var3.field7964, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
    private final void method805(int arg0) {
        for (class270 var2 = (class270) this.field1753.method1050((byte) 73); var2 != null; var2 = (class270) this.field1753.method1047(-7962)) {
            var2.method804(arg0);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "()Lvv;")
    public final class270 method806() {
        return (class270) this.field1753.method1050((byte) 73);
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "()I")
    public final synchronized int method807() {
        return this.field1753.method1055(0);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "([III)V")
    private final void method808(int[] arg0, int arg1, int arg2) {
        for (class270 var4 = (class270) this.field1753.method1050((byte) 73); var4 != null; var4 = (class270) this.field1753.method1047(-7962)) {
            var4.method1508(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "()V")
    private final void method809() {
        if (this.field1756 <= 0) {
            return;
        }
        for (class23 var1 = (class23) this.field1754.method1050((byte) 73); var1 != null; var1 = (class23) this.field1754.method1047(-7962)) {
            var1.field155 -= this.field1756;
        }
        this.field1755 -= this.field1756;
        this.field1756 = 0;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(Lvv;)V")
    public final synchronized void method810(class270 arg0) {
        this.field1753.method1053(arg0, -1);
    }
}
