import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class241 extends class129 {

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Ldb;")
    private class36 field4362 = new class36();

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Ldb;")
    private class36 field4363 = new class36();

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field4364 = 0;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field4365 = -1;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lli;")
    public final class129 method344() {
        return (class129) this.field4362.method314((byte) -26);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    private final void method1526(int arg0) {
        for (class129 var2 = (class129) this.field4362.method314((byte) -26); var2 != null; var2 = (class129) this.field4362.method320(0)) {
            var2.method347(arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
    public final synchronized void method341(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4365 < 0) {
                this.method1527(arg0, arg1, arg2);
                return;
            }
            if (this.field4364 + arg2 < this.field4365) {
                this.field4364 += arg2;
                this.method1527(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4365 - this.field4364;
            this.method1527(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4364 += var4;
            this.method1531();
            class87 var5 = (class87) this.field4363.method314((byte) -26);
            synchronized (var5) {
                int var7 = var5.method602(this);
                if (var7 < 0) {
                    var5.field1634 = 0;
                    this.method1529(var5);
                } else {
                    var5.field1634 = var7;
                    this.method1530(var5.field382, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "([III)V")
    private final void method1527(int[] arg0, int arg1, int arg2) {
        for (class129 var4 = (class129) this.field4362.method314((byte) -26); var4 != null; var4 = (class129) this.field4362.method320(0)) {
            var4.method880(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lli;")
    public final class129 method345() {
        return (class129) this.field4362.method320(0);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
    public final int method348() {
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lli;)V")
    public final synchronized void method1528(class129 arg0) {
        arg0.method123((byte) -126);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lhj;)V")
    private final void method1529(class87 arg0) {
        arg0.method123((byte) -126);
        arg0.method603();
        class12 var2 = this.field4363.field834.field382;
        if (this.field4363.field834 == var2) {
            this.field4365 = -1;
        } else {
            this.field4365 = ((class87) var2).field1634;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final synchronized void method347(int arg0) {
        do {
            if (this.field4365 < 0) {
                this.method1526(arg0);
                return;
            }
            if (this.field4364 + arg0 < this.field4365) {
                this.field4364 += arg0;
                this.method1526(arg0);
                return;
            }
            int var2 = this.field4365 - this.field4364;
            this.method1526(var2);
            arg0 -= var2;
            this.field4364 += var2;
            this.method1531();
            class87 var3 = (class87) this.field4363.method314((byte) -26);
            synchronized (var3) {
                int var5 = var3.method602(this);
                if (var5 < 0) {
                    var3.field1634 = 0;
                    this.method1529(var3);
                } else {
                    var3.field1634 = var5;
                    this.method1530(var3.field382, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lb;Lhj;)V")
    private final void method1530(class12 arg0, class87 arg1) {
        while (this.field4363.field834 != arg0 && ((class87) arg0).field1634 <= arg1.field1634) {
            arg0 = arg0.field382;
        }
        this.field4363.method315(arg1, arg0, false);
        this.field4365 = ((class87) this.field4363.field834.field382).field1634;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
    private final void method1531() {
        if (this.field4364 <= 0) {
            return;
        }
        for (class87 var1 = (class87) this.field4363.method314((byte) -26); var1 != null; var1 = (class87) this.field4363.method320(0)) {
            var1.field1634 -= this.field4364;
        }
        this.field4365 -= this.field4364;
        this.field4364 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lli;)V")
    public final synchronized void method1532(class129 arg0) {
        this.field4362.method323(-99, arg0);
    }
}
