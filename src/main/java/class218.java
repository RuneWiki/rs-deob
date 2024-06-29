import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class218 extends class115 {

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lek;")
    private class183 field3553 = new class183();

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Lek;")
    private class183 field3554 = new class183();

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    private int field3555 = -1;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    private int field3556 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbh;Ldg;)V", line = 3)
    private final void method1490(class273 arg0, class318 arg1) {
        while (this.field3554.field2900 != arg0 && ((class318) arg0).field5507 <= arg1.field5507) {
            arg0 = arg0.field4687;
        }
        class296.method2042(117, arg1, arg0);
        this.field3555 = ((class318) this.field3554.field2900.field4687).field5507;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "([III)V", line = 14)
    public final synchronized void method445(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3555 < 0) {
                this.method1496(arg0, arg1, arg2);
                return;
            }
            if (this.field3556 + arg2 < this.field3555) {
                this.field3556 += arg2;
                this.method1496(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3555 - this.field3556;
            this.method1496(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3556 += var4;
            this.method1494();
            class318 var5 = (class318) this.field3554.method1221((byte) 73);
            synchronized (var5) {
                int var7 = var5.method2219(this);
                if (var7 < 0) {
                    var5.field5507 = 0;
                    this.method1493(var5);
                } else {
                    var5.field5507 = var7;
                    this.method1490(var5.field4687, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()Lnh;", line = 64)
    public final class115 method461() {
        return (class115) this.field3553.method1223(121);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()I", line = 68)
    public final int method452() {
        return 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnh;)V", line = 75)
    public final synchronized void method1491(class115 arg0) {
        this.field3553.method1213(arg0, -4087);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 81)
    private final void method1492(int arg0) {
        for (class115 var2 = (class115) this.field3553.method1221((byte) 75); var2 != null; var2 = (class115) this.field3553.method1223(112)) {
            var2.method446(arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 97)
    public final synchronized void method446(int arg0) {
        do {
            if (this.field3555 < 0) {
                this.method1492(arg0);
                return;
            }
            if (this.field3556 + arg0 < this.field3555) {
                this.field3556 += arg0;
                this.method1492(arg0);
                return;
            }
            int var2 = this.field3555 - this.field3556;
            this.method1492(var2);
            arg0 -= var2;
            this.field3556 += var2;
            this.method1494();
            class318 var3 = (class318) this.field3554.method1221((byte) 47);
            synchronized (var3) {
                int var5 = var3.method2219(this);
                if (var5 < 0) {
                    var3.field5507 = 0;
                    this.method1493(var3);
                } else {
                    var3.field5507 = var5;
                    this.method1490(var3.field4687, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()Lnh;", line = 144)
    public final class115 method482() {
        return (class115) this.field3553.method1221((byte) 67);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ldg;)V", line = 149)
    private final void method1493(class318 arg0) {
        arg0.method1880(-25368);
        arg0.method2220();
        class273 var2 = this.field3554.field2900.field4687;
        if (this.field3554.field2900 == var2) {
            this.field3555 = -1;
        } else {
            this.field3555 = ((class318) var2).field5507;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V", line = 162)
    private final void method1494() {
        if (this.field3556 <= 0) {
            return;
        }
        for (class318 var1 = (class318) this.field3554.method1221((byte) 84); var1 != null; var1 = (class318) this.field3554.method1223(62)) {
            var1.field5507 -= this.field3556;
        }
        this.field3555 -= this.field3556;
        this.field3556 = 0;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lnh;)V", line = 179)
    public final synchronized void method1495(class115 arg0) {
        arg0.method1880(-25368);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "([III)V", line = 184)
    private final void method1496(int[] arg0, int arg1, int arg2) {
        for (class115 var4 = (class115) this.field3553.method1221((byte) 36); var4 != null; var4 = (class115) this.field3553.method1223(116)) {
            var4.method763(arg0, arg1, arg2);
        }
    }
}
