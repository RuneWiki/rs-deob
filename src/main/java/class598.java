import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class598 extends class276 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lsu;")
    private class192 field8291 = new class192();

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lsu;")
    private class192 field8292 = new class192();

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    private int field8293 = 0;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    private int field8294 = -1;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()I")
    public final synchronized int method3306() {
        return this.field8291.method1276(69);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "([III)V")
    private final void method3307(int[] arg0, int arg1, int arg2) {
        for (class276 var4 = (class276) this.field8291.method1270((byte) -25); var4 != null; var4 = (class276) this.field8291.method1282(0)) {
            var4.method1675(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([III)V")
    public final synchronized void method1672(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field8294 < 0) {
                this.method3307(arg0, arg1, arg2);
                return;
            }
            if (this.field8293 + arg2 < this.field8294) {
                this.field8293 += arg2;
                this.method3307(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field8294 - this.field8293;
            this.method3307(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field8293 += var4;
            this.method3308();
            class214 var5 = (class214) this.field8292.method1270((byte) -25);
            synchronized (var5) {
                int var7 = var5.method1400(this);
                if (var7 < 0) {
                    var5.field3128 = 0;
                    this.method3313(var5);
                } else {
                    var5.field3128 = var7;
                    this.method3311(var5.field7315, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final synchronized void method1678(int arg0) {
        do {
            if (this.field8294 < 0) {
                this.method3312(arg0);
                return;
            }
            if (this.field8293 + arg0 < this.field8294) {
                this.field8293 += arg0;
                this.method3312(arg0);
                return;
            }
            int var2 = this.field8294 - this.field8293;
            this.method3312(var2);
            arg0 -= var2;
            this.field8293 += var2;
            this.method3308();
            class214 var3 = (class214) this.field8292.method1270((byte) -25);
            synchronized (var3) {
                int var5 = var3.method1400(this);
                if (var5 < 0) {
                    var3.field3128 = 0;
                    this.method3313(var3);
                } else {
                    var3.field3128 = var5;
                    this.method3311(var3.field7315, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()Lvw;")
    public final class276 method1673() {
        return (class276) this.field8291.method1270((byte) -25);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()V")
    private final void method3308() {
        if (this.field8293 <= 0) {
            return;
        }
        for (class214 var1 = (class214) this.field8292.method1270((byte) -25); var1 != null; var1 = (class214) this.field8292.method1282(0)) {
            var1.field3128 -= this.field8293;
        }
        this.field8294 -= this.field8293;
        this.field8293 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lvw;)V")
    public final synchronized void method3309(class276 arg0) {
        arg0.method2971(1);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lvw;)V")
    public final synchronized void method3310(class276 arg0) {
        this.field8291.method1280(arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()I")
    public final int method1674() {
        return 0;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()Lvw;")
    public final class276 method1676() {
        return (class276) this.field8291.method1282(0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lia;Lida;)V")
    private final void method3311(class539 arg0, class214 arg1) {
        while (this.field8292.field2826 != arg0 && ((class214) arg0).field3128 <= arg1.field3128) {
            arg0 = arg0.field7315;
        }
        class398.method2264(arg1, arg0, (byte) 118);
        this.field8294 = ((class214) this.field8292.field2826.field7315).field3128;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    private final void method3312(int arg0) {
        for (class276 var2 = (class276) this.field8291.method1270((byte) -25); var2 != null; var2 = (class276) this.field8291.method1282(0)) {
            var2.method1678(arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lida;)V")
    private final void method3313(class214 arg0) {
        arg0.method2971(1);
        arg0.method1399();
        class539 var2 = this.field8292.field2826.field7315;
        if (this.field8292.field2826 == var2) {
            this.field8294 = -1;
        } else {
            this.field8294 = ((class214) var2).field3128;
        }
    }
}
