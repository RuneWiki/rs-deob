import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 extends class149 {

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Lvf;")
    private class296 field1119 = new class296();

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lvf;")
    private class296 field1120 = new class296();

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    private int field1122 = -1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()Lej;", line = 5)
    public final class149 method387() {
        return (class149) this.field1119.method2024(0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 14)
    public final synchronized void method388(int arg0) {
        do {
            if (this.field1122 < 0) {
                this.method394(arg0);
                return;
            }
            if (this.field1121 + arg0 < this.field1122) {
                this.field1121 += arg0;
                this.method394(arg0);
                return;
            }
            int var2 = this.field1122 - this.field1121;
            this.method394(var2);
            arg0 -= var2;
            this.field1121 += var2;
            this.method395();
            class160 var3 = (class160) this.field1120.method2024(0);
            synchronized (var3) {
                int var5 = var3.method1061(this);
                if (var5 < 0) {
                    var3.field2736 = 0;
                    this.method390(var3);
                } else {
                    var3.field2736 = var5;
                    this.method396(var3.field4902, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lej;)V", line = 61)
    public final synchronized void method389(class149 arg0) {
        this.field1119.method2022(33, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lgb;)V", line = 66)
    private final void method390(class160 arg0) {
        arg0.method1978((byte) 98);
        arg0.method1060();
        class287 var2 = this.field1120.field5060.field4902;
        if (this.field1120.field5060 == var2) {
            this.field1122 = -1;
        } else {
            this.field1122 = ((class160) var2).field2736;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "([III)V", line = 81)
    private final void method391(int[] arg0, int arg1, int arg2) {
        for (class149 var4 = (class149) this.field1119.method2024(0); var4 != null; var4 = (class149) this.field1119.method2027(1211754408)) {
            var4.method1000(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "([III)V", line = 95)
    public final synchronized void method392(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1122 < 0) {
                this.method391(arg0, arg1, arg2);
                return;
            }
            if (this.field1121 + arg2 < this.field1122) {
                this.field1121 += arg2;
                this.method391(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1122 - this.field1121;
            this.method391(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1121 += var4;
            this.method395();
            class160 var5 = (class160) this.field1120.method2024(0);
            synchronized (var5) {
                int var7 = var5.method1061(this);
                if (var7 < 0) {
                    var5.field2736 = 0;
                    this.method390(var5);
                } else {
                    var5.field2736 = var7;
                    this.method396(var5.field4902, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Lej;)V", line = 141)
    public final synchronized void method393(class149 arg0) {
        arg0.method1978((byte) 83);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 149)
    private final void method394(int arg0) {
        for (class149 var2 = (class149) this.field1119.method2024(0); var2 != null; var2 = (class149) this.field1119.method2027(1211754408)) {
            var2.method388(arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V", line = 158)
    private final void method395() {
        if (this.field1121 <= 0) {
            return;
        }
        for (class160 var1 = (class160) this.field1120.method2024(0); var1 != null; var1 = (class160) this.field1120.method2027(1211754408)) {
            var1.field2736 -= this.field1121;
        }
        this.field1122 -= this.field1121;
        this.field1121 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqh;Lgb;)V", line = 177)
    private final void method396(class287 arg0, class160 arg1) {
        while (this.field1120.field5060 != arg0 && ((class160) arg0).field2736 <= arg1.field2736) {
            arg0 = arg0.field4902;
        }
        class273.method1916(arg1, 109, arg0);
        this.field1122 = ((class160) this.field1120.field5060.field4902).field2736;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()Lej;", line = 184)
    public final class149 method397() {
        return (class149) this.field1119.method2027(1211754408);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()I", line = 187)
    public final int method398() {
        return 0;
    }
}
