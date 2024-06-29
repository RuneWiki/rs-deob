import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class82 extends class126 {

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Luh;")
    private class198 field1420 = new class198();

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Luh;")
    private class198 field1421 = new class198();

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field1422 = 0;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private int field1423 = -1;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Lib;")
    public final class126 method475() {
        return (class126) this.field1420.method1277(93);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    private final void method476(int arg0) {
        for (class126 var2 = (class126) this.field1420.method1277(126); var2 != null; var2 = (class126) this.field1420.method1271(250)) {
            var2.method478(arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Lib;")
    public final class126 method477() {
        return (class126) this.field1420.method1271(250);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final synchronized void method478(int arg0) {
        do {
            if (this.field1423 < 0) {
                this.method476(arg0);
                return;
            }
            if (this.field1422 + arg0 < this.field1423) {
                this.field1422 += arg0;
                this.method476(arg0);
                return;
            }
            int var2 = this.field1423 - this.field1422;
            this.method476(var2);
            arg0 -= var2;
            this.field1422 += var2;
            this.method482();
            class224 var3 = (class224) this.field1421.method1277(122);
            synchronized (var3) {
                int var5 = var3.method1414(this);
                if (var5 < 0) {
                    var3.field3794 = 0;
                    this.method484(var3);
                } else {
                    var3.field3794 = var5;
                    this.method483(var3.field1110, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lib;)V")
    public final synchronized void method479(class126 arg0) {
        arg0.method369(-107);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lib;)V")
    public final synchronized void method480(class126 arg0) {
        this.field1420.method1275(-18157, arg0);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "([III)V")
    private final void method481(int[] arg0, int arg1, int arg2) {
        for (class126 var4 = (class126) this.field1420.method1277(98); var4 != null; var4 = (class126) this.field1420.method1271(250)) {
            var4.method778(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
    private final void method482() {
        if (this.field1422 <= 0) {
            return;
        }
        for (class224 var1 = (class224) this.field1421.method1277(122); var1 != null; var1 = (class224) this.field1421.method1271(250)) {
            var1.field3794 -= this.field1422;
        }
        this.field1423 -= this.field1422;
        this.field1422 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsf;Llb;)V")
    private final void method483(class60 arg0, class224 arg1) {
        while (this.field1421.field3388 != arg0 && ((class224) arg0).field3794 <= arg1.field3794) {
            arg0 = arg0.field1110;
        }
        this.field1421.method1280(arg1, false, arg0);
        this.field1423 = ((class224) this.field1421.field3388.field1110).field3794;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Llb;)V")
    private final void method484(class224 arg0) {
        arg0.method369(125);
        arg0.method1413();
        class60 var2 = this.field1421.field3388.field1110;
        if (this.field1421.field3388 == var2) {
            this.field1423 = -1;
        } else {
            this.field1423 = ((class224) var2).field3794;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
    public final synchronized void method485(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1423 < 0) {
                this.method481(arg0, arg1, arg2);
                return;
            }
            if (this.field1422 + arg2 < this.field1423) {
                this.field1422 += arg2;
                this.method481(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1423 - this.field1422;
            this.method481(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1422 += var4;
            this.method482();
            class224 var5 = (class224) this.field1421.method1277(117);
            synchronized (var5) {
                int var7 = var5.method1414(this);
                if (var7 < 0) {
                    var5.field3794 = 0;
                    this.method484(var5);
                } else {
                    var5.field3794 = var7;
                    this.method483(var5.field1110, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public final int method486() {
        return 0;
    }
}
