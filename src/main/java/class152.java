import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class152 extends class221 {

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lc;")
    private class125 field2715 = new class125();

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lc;")
    private class125 field2716 = new class125();

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    private int field2717 = -1;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    private int field2718 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
    public final int method285() {
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Lwd;")
    public final class221 method278() {
        return (class221) this.field2715.method873((byte) 76);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lqg;)V")
    private final void method1029(class185 arg0) {
        arg0.method560(-17554);
        arg0.method1230();
        class80 var2 = this.field2716.field2358.field1571;
        if (this.field2716.field2358 == var2) {
            this.field2717 = -1;
        } else {
            this.field2717 = ((class185) var2).field3228;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    private final void method1030(int arg0) {
        for (class221 var2 = (class221) this.field2715.method873((byte) 76); var2 != null; var2 = (class221) this.field2715.method870((byte) -110)) {
            var2.method302(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lwd;)V")
    public final synchronized void method1031(class221 arg0) {
        arg0.method560(-17554);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lli;Lqg;)V")
    private final void method1032(class80 arg0, class185 arg1) {
        while (this.field2716.field2358 != arg0 && ((class185) arg0).field3228 <= arg1.field3228) {
            arg0 = arg0.field1571;
        }
        class81.method561(86, arg0, arg1);
        this.field2717 = ((class185) this.field2716.field2358.field1571).field3228;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lwd;)V")
    public final synchronized void method1033(class221 arg0) {
        this.field2715.method871((byte) 107, arg0);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2717 < 0) {
                this.method1035(arg0, arg1, arg2);
                return;
            }
            if (this.field2718 + arg2 < this.field2717) {
                this.field2718 += arg2;
                this.method1035(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2717 - this.field2718;
            this.method1035(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2718 += var4;
            this.method1034();
            class185 var5 = (class185) this.field2716.method873((byte) 76);
            synchronized (var5) {
                int var7 = var5.method1229(this);
                if (var7 < 0) {
                    var5.field3228 = 0;
                    this.method1029(var5);
                } else {
                    var5.field3228 = var7;
                    this.method1032(var5.field1571, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        do {
            if (this.field2717 < 0) {
                this.method1030(arg0);
                return;
            }
            if (this.field2718 + arg0 < this.field2717) {
                this.field2718 += arg0;
                this.method1030(arg0);
                return;
            }
            int var2 = this.field2717 - this.field2718;
            this.method1030(var2);
            arg0 -= var2;
            this.field2718 += var2;
            this.method1034();
            class185 var3 = (class185) this.field2716.method873((byte) 76);
            synchronized (var3) {
                int var5 = var3.method1229(this);
                if (var5 < 0) {
                    var3.field3228 = 0;
                    this.method1029(var3);
                } else {
                    var3.field3228 = var5;
                    this.method1032(var3.field1571, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "()V")
    private final void method1034() {
        if (this.field2718 <= 0) {
            return;
        }
        for (class185 var1 = (class185) this.field2716.method873((byte) 76); var1 != null; var1 = (class185) this.field2716.method870((byte) -127)) {
            var1.field3228 -= this.field2718;
        }
        this.field2717 -= this.field2718;
        this.field2718 = 0;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()Lwd;")
    public final class221 method308() {
        return (class221) this.field2715.method870((byte) -110);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "([III)V")
    private final void method1035(int[] arg0, int arg1, int arg2) {
        for (class221 var4 = (class221) this.field2715.method873((byte) 76); var4 != null; var4 = (class221) this.field2715.method870((byte) -116)) {
            var4.method1411(arg0, arg1, arg2);
        }
    }
}
