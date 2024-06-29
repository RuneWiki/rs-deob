import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class75 extends class1 {

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lub;")
    private class88 field1426 = new class88();

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lub;")
    private class88 field1427 = new class88();

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    private int field1428 = 0;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    private int field1429 = -1;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llk;Lkd;)V")
    private final void method581(class81 arg0, class198 arg1) {
        while (this.field1427.field1619 != arg0 && ((class198) arg0).field3434 <= arg1.field3434) {
            arg0 = arg0.field1527;
        }
        class208.method1395(arg1, arg0, (byte) 89);
        this.field1429 = ((class198) this.field1427.field1619.field1527).field3434;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "([III)V")
    private final void method582(int[] arg0, int arg1, int arg2) {
        for (class1 var4 = (class1) this.field1426.method673(false); var4 != null; var4 = (class1) this.field1426.method680(105)) {
            var4.method4(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lwf;)V")
    public final synchronized void method583(class1 arg0) {
        arg0.method629(0);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()Lwf;")
    public final class1 method3() {
        return (class1) this.field1426.method673(false);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    private final void method584(int arg0) {
        for (class1 var2 = (class1) this.field1426.method673(false); var2 != null; var2 = (class1) this.field1426.method680(63)) {
            var2.method6(arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()I")
    public final int method2() {
        return 0;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        do {
            if (this.field1429 < 0) {
                this.method584(arg0);
                return;
            }
            if (this.field1428 + arg0 < this.field1429) {
                this.field1428 += arg0;
                this.method584(arg0);
                return;
            }
            int var2 = this.field1429 - this.field1428;
            this.method584(var2);
            arg0 -= var2;
            this.field1428 += var2;
            this.method585();
            class198 var3 = (class198) this.field1427.method673(false);
            synchronized (var3) {
                int var5 = var3.method1356(this);
                if (var5 < 0) {
                    var3.field3434 = 0;
                    this.method587(var3);
                } else {
                    var3.field3434 = var5;
                    this.method581(var3.field1527, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()Lwf;")
    public final class1 method5() {
        return (class1) this.field1426.method680(48);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "()V")
    private final void method585() {
        if (this.field1428 <= 0) {
            return;
        }
        for (class198 var1 = (class198) this.field1427.method673(false); var1 != null; var1 = (class198) this.field1427.method680(91)) {
            var1.field3434 -= this.field1428;
        }
        this.field1429 -= this.field1428;
        this.field1428 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lwf;)V")
    public final synchronized void method586(class1 arg0) {
        this.field1426.method679(24549, arg0);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([III)V")
    public final synchronized void method7(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1429 < 0) {
                this.method582(arg0, arg1, arg2);
                return;
            }
            if (this.field1428 + arg2 < this.field1429) {
                this.field1428 += arg2;
                this.method582(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1429 - this.field1428;
            this.method582(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1428 += var4;
            this.method585();
            class198 var5 = (class198) this.field1427.method673(false);
            synchronized (var5) {
                int var7 = var5.method1356(this);
                if (var7 < 0) {
                    var5.field3434 = 0;
                    this.method587(var5);
                } else {
                    var5.field3434 = var7;
                    this.method581(var5.field1527, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lkd;)V")
    private final void method587(class198 arg0) {
        arg0.method629(0);
        arg0.method1355();
        class81 var2 = this.field1427.field1619.field1527;
        if (this.field1427.field1619 == var2) {
            this.field1429 = -1;
        } else {
            this.field1429 = ((class198) var2).field3434;
        }
    }
}
