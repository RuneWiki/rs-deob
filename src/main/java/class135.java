import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class135 extends class130 {

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lca;")
    private class16 field3217 = new class16();

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lca;")
    private class16 field3218 = new class16();

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    private int field3219 = 0;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    private int field3220 = -1;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lcb;Ldc;)V")
    private final void method1076(class17 arg0, class25 arg1) {
        while (this.field3218.field341 != arg0 && ((class25) arg0).field582 <= arg1.field582) {
            arg0 = arg0.field369;
        }
        this.field3218.method95(arg0, 0, arg1);
        this.field3220 = ((class25) this.field3218.field341.field369).field582;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        do {
            if (this.field3220 < 0) {
                this.method1081(arg0);
                return;
            }
            if (this.field3219 + arg0 < this.field3220) {
                this.field3219 += arg0;
                this.method1081(arg0);
                return;
            }
            int var2 = this.field3220 - this.field3219;
            this.method1081(var2);
            arg0 -= var2;
            this.field3219 += var2;
            this.method1078();
            class25 var3 = (class25) this.field3218.method104((byte) 101);
            synchronized (var3) {
                int var5 = var3.method170(this);
                if (var5 < 0) {
                    var3.field582 = 0;
                    this.method1077(var3);
                } else {
                    var3.field582 = var5;
                    this.method1076(var3.field369, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
    public final int method306() {
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "([III)V")
    public final synchronized void method304(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3220 < 0) {
                this.method1079(arg0, arg1, arg2);
                return;
            }
            if (this.field3219 + arg2 < this.field3220) {
                this.field3219 += arg2;
                this.method1079(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3220 - this.field3219;
            this.method1079(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3219 += var4;
            this.method1078();
            class25 var5 = (class25) this.field3218.method104((byte) 101);
            synchronized (var5) {
                int var7 = var5.method170(this);
                if (var7 < 0) {
                    var5.field582 = 0;
                    this.method1077(var5);
                } else {
                    var5.field582 = var7;
                    this.method1076(var5.field369, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ldc;)V")
    private final void method1077(class25 arg0) {
        arg0.method121(false);
        arg0.method169();
        class17 var2 = this.field3218.field341.field369;
        if (this.field3218.field341 == var2) {
            this.field3220 = -1;
        } else {
            this.field3220 = ((class25) var2).field582;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()Lu;")
    public final class130 method300() {
        return (class130) this.field3217.method104((byte) 101);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
    private final void method1078() {
        if (this.field3219 <= 0) {
            return;
        }
        for (class25 var1 = (class25) this.field3218.method104((byte) 101); var1 != null; var1 = (class25) this.field3218.method107(-2)) {
            var1.field582 -= this.field3219;
        }
        this.field3220 -= this.field3219;
        this.field3219 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "([III)V")
    private final void method1079(int[] arg0, int arg1, int arg2) {
        for (class130 var4 = (class130) this.field3217.method104((byte) 101); var4 != null; var4 = (class130) this.field3217.method107(-2)) {
            var4.method1056(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lu;)V")
    public final synchronized void method1080(class130 arg0) {
        arg0.method121(false);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    private final void method1081(int arg0) {
        for (class130 var2 = (class130) this.field3217.method104((byte) 101); var2 != null; var2 = (class130) this.field3217.method107(-2)) {
            var2.method302(arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lu;)V")
    public final synchronized void method1082(class130 arg0) {
        this.field3217.method109((byte) 72, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lu;")
    public final class130 method307() {
        return (class130) this.field3217.method107(-2);
    }
}
