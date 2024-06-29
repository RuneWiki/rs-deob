import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class274 extends class270 {

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lvp;")
    private class123 field3971 = new class123();

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lvp;")
    private class123 field3972 = new class123();

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private int field3974 = 0;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private int field3973 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lwb;)V")
    private final void method1789(class215 arg0) {
        arg0.method2049(-90);
        arg0.method1493();
        class337 var2 = this.field3972.field1879.field4737;
        if (this.field3972.field1879 == var2) {
            this.field3973 = -1;
        } else {
            this.field3973 = ((class215) var2).field3125;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
    private final void method1790() {
        if (this.field3974 <= 0) {
            return;
        }
        for (class215 var1 = (class215) this.field3972.method816(104); var1 != null; var1 = (class215) this.field3972.method812(110)) {
            var1.field3125 -= this.field3974;
        }
        this.field3973 -= this.field3974;
        this.field3974 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([III)V")
    public final synchronized void method583(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3973 < 0) {
                this.method1791(arg0, arg1, arg2);
                return;
            }
            if (this.field3974 + arg2 < this.field3973) {
                this.field3974 += arg2;
                this.method1791(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3973 - this.field3974;
            this.method1791(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3974 += var4;
            this.method1790();
            class215 var5 = (class215) this.field3972.method816(126);
            synchronized (var5) {
                int var7 = var5.method1492(this);
                if (var7 < 0) {
                    var5.field3125 = 0;
                    this.method1789(var5);
                } else {
                    var5.field3125 = var7;
                    this.method1796(var5.field4737, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "([III)V")
    private final void method1791(int[] arg0, int arg1, int arg2) {
        for (class270 var4 = (class270) this.field3971.method816(118); var4 != null; var4 = (class270) this.field3971.method812(101)) {
            var4.method1780(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhf;)V")
    public final synchronized void method1792(class270 arg0) {
        this.field3971.method819((byte) -97, arg0);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
    public final synchronized int method1793() {
        return this.field3971.method810(false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final synchronized void method566(int arg0) {
        do {
            if (this.field3973 < 0) {
                this.method1795(arg0);
                return;
            }
            if (this.field3974 + arg0 < this.field3973) {
                this.field3974 += arg0;
                this.method1795(arg0);
                return;
            }
            int var2 = this.field3973 - this.field3974;
            this.method1795(var2);
            arg0 -= var2;
            this.field3974 += var2;
            this.method1790();
            class215 var3 = (class215) this.field3972.method816(115);
            synchronized (var3) {
                int var5 = var3.method1492(this);
                if (var5 < 0) {
                    var3.field3125 = 0;
                    this.method1789(var3);
                } else {
                    var3.field3125 = var5;
                    this.method1796(var3.field4737, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lhf;)V")
    public final synchronized void method1794(class270 arg0) {
        arg0.method2049(-59);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()Lhf;")
    public final class270 method563() {
        return (class270) this.field3971.method816(116);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    private final void method1795(int arg0) {
        for (class270 var2 = (class270) this.field3971.method816(120); var2 != null; var2 = (class270) this.field3971.method812(80)) {
            var2.method566(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkp;Lwb;)V")
    private final void method1796(class337 arg0, class215 arg1) {
        while (this.field3972.field1879 != arg0 && ((class215) arg0).field3125 <= arg1.field3125) {
            arg0 = arg0.field4737;
        }
        class229.method1571(arg1, 49, arg0);
        this.field3973 = ((class215) this.field3972.field1879.field4737).field3125;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()Lhf;")
    public final class270 method585() {
        return (class270) this.field3971.method812(100);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
    public final int method576() {
        return 0;
    }
}
