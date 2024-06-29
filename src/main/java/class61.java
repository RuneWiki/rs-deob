import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class61 extends class127 {

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lsf;")
    private class33 field1265 = new class33();

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lsf;")
    private class33 field1266 = new class33();

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    private int field1267 = -1;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    private int field1268 = 0;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "([III)V")
    private final void method456(int[] arg0, int arg1, int arg2) {
        for (class127 var4 = (class127) this.field1265.method288(26111); var4 != null; var4 = (class127) this.field1265.method277(1)) {
            var4.method882(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([III)V")
    public final synchronized void method12(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1267 < 0) {
                this.method456(arg0, arg1, arg2);
                return;
            }
            if (this.field1268 + arg2 < this.field1267) {
                this.field1268 += arg2;
                this.method456(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1267 - this.field1268;
            this.method456(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1268 += var4;
            this.method462();
            class247 var5 = (class247) this.field1266.method288(26111);
            synchronized (var5) {
                int var7 = var5.method1621(this);
                if (var7 < 0) {
                    var5.field4268 = 0;
                    this.method460(var5);
                } else {
                    var5.field4268 = var7;
                    this.method458(var5.field577, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()I")
    public final int method37() {
        return 0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Lr;")
    public final class127 method24() {
        return (class127) this.field1265.method277(1);
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    private final void method457(int arg0) {
        for (class127 var2 = (class127) this.field1265.method288(26111); var2 != null; var2 = (class127) this.field1265.method277(1)) {
            var2.method40(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public final synchronized void method40(int arg0) {
        do {
            if (this.field1267 < 0) {
                this.method457(arg0);
                return;
            }
            if (this.field1268 + arg0 < this.field1267) {
                this.field1268 += arg0;
                this.method457(arg0);
                return;
            }
            int var2 = this.field1267 - this.field1268;
            this.method457(var2);
            arg0 -= var2;
            this.field1268 += var2;
            this.method462();
            class247 var3 = (class247) this.field1266.method288(26111);
            synchronized (var3) {
                int var5 = var3.method1621(this);
                if (var5 < 0) {
                    var3.field4268 = 0;
                    this.method460(var3);
                } else {
                    var3.field4268 = var5;
                    this.method458(var3.field577, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ldh;Leg;)V")
    private final void method458(class30 arg0, class247 arg1) {
        while (this.field1266.field645 != arg0 && ((class247) arg0).field4268 <= arg1.field4268) {
            arg0 = arg0.field577;
        }
        this.field1266.method286(arg0, true, arg1);
        this.field1267 = ((class247) this.field1266.field645.field577).field4268;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lr;)V")
    public final synchronized void method459(class127 arg0) {
        arg0.method254(1);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()Lr;")
    public final class127 method27() {
        return (class127) this.field1265.method288(26111);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Leg;)V")
    private final void method460(class247 arg0) {
        arg0.method254(1);
        arg0.method1620();
        class30 var2 = this.field1266.field645.field577;
        if (this.field1266.field645 == var2) {
            this.field1267 = -1;
        } else {
            this.field1267 = ((class247) var2).field4268;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lr;)V")
    public final synchronized void method461(class127 arg0) {
        this.field1265.method284(arg0, 27886);
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()V")
    private final void method462() {
        if (this.field1268 <= 0) {
            return;
        }
        for (class247 var1 = (class247) this.field1266.method288(26111); var1 != null; var1 = (class247) this.field1266.method277(1)) {
            var1.field4268 -= this.field1268;
        }
        this.field1267 -= this.field1268;
        this.field1268 = 0;
    }
}
