import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class322 extends class555 {

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lhga;")
    private class158 field4713 = new class158();

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lhga;")
    private class158 field4714 = new class158();

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    private int field4715 = -1;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    private int field4716 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    private final void method2066(int arg0) {
        for (class555 var2 = (class555) this.field4713.method1224(-2); var2 != null; var2 = (class555) this.field4713.method1232(-2)) {
            var2.method204(arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([III)V")
    public final synchronized void method224(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4715 < 0) {
                this.method2068(arg0, arg1, arg2);
                return;
            }
            if (this.field4716 + arg2 < this.field4715) {
                this.field4716 += arg2;
                this.method2068(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4715 - this.field4716;
            this.method2068(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4716 += var4;
            this.method2071();
            class690 var5 = (class690) this.field4714.method1224(-2);
            synchronized (var5) {
                int var7 = var5.method3868(this);
                if (var7 < 0) {
                    var5.field9752 = 0;
                    this.method2070(var5);
                } else {
                    var5.field9752 = var7;
                    this.method2072(var5.field6134, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Loea;)V")
    public final synchronized void method2067(class555 arg0) {
        this.field4713.method1228(arg0, (byte) 59);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "([III)V")
    private final void method2068(int[] arg0, int arg1, int arg2) {
        for (class555 var4 = (class555) this.field4713.method1224(-2); var4 != null; var4 = (class555) this.field4713.method1232(-2)) {
            var4.method3168(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final synchronized void method204(int arg0) {
        do {
            if (this.field4715 < 0) {
                this.method2066(arg0);
                return;
            }
            if (this.field4716 + arg0 < this.field4715) {
                this.field4716 += arg0;
                this.method2066(arg0);
                return;
            }
            int var2 = this.field4715 - this.field4716;
            this.method2066(var2);
            arg0 -= var2;
            this.field4716 += var2;
            this.method2071();
            class690 var3 = (class690) this.field4714.method1224(-2);
            synchronized (var3) {
                int var5 = var3.method3868(this);
                if (var5 < 0) {
                    var3.field9752 = 0;
                    this.method2070(var3);
                } else {
                    var3.field9752 = var5;
                    this.method2072(var3.field6134, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "()I")
    public final synchronized int method2069() {
        return this.field4713.method1225(-2);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "()Loea;")
    public final class555 method227() {
        return (class555) this.field4713.method1232(-2);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqc;)V")
    private final void method2070(class690 arg0) {
        arg0.method2588(300);
        arg0.method3867();
        class425 var2 = this.field4714.field2700.field6134;
        if (this.field4714.field2700 == var2) {
            this.field4715 = -1;
        } else {
            this.field4715 = ((class690) var2).field9752;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
    public final int method193() {
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "()V")
    private final void method2071() {
        if (this.field4716 <= 0) {
            return;
        }
        for (class690 var1 = (class690) this.field4714.method1224(-2); var1 != null; var1 = (class690) this.field4714.method1232(-2)) {
            var1.field9752 -= this.field4716;
        }
        this.field4715 -= this.field4716;
        this.field4716 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()Loea;")
    public final class555 method233() {
        return (class555) this.field4713.method1224(-2);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Liga;Lqc;)V")
    private final void method2072(class425 arg0, class690 arg1) {
        while (this.field4714.field2700 != arg0 && ((class690) arg0).field9752 <= arg1.field9752) {
            arg0 = arg0.field6134;
        }
        class184.method1345(false, arg1, arg0);
        this.field4715 = ((class690) this.field4714.field2700.field6134).field9752;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Loea;)V")
    public final synchronized void method2073(class555 arg0) {
        arg0.method2588(300);
    }
}
