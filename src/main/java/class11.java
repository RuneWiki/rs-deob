import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 extends class185 {

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Ls;")
    private class190 field216 = new class190();

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Ls;")
    private class190 field217 = new class190();

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    private int field219 = -1;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field218 = 0;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public final synchronized void method99(int arg0) {
        do {
            if (this.field219 < 0) {
                this.method108(arg0);
                return;
            }
            if (this.field218 + arg0 < this.field219) {
                this.field218 += arg0;
                this.method108(arg0);
                return;
            }
            int var2 = this.field219 - this.field218;
            this.method108(var2);
            arg0 -= var2;
            this.field218 += var2;
            this.method106();
            class144 var3 = (class144) this.field217.method1189(0);
            synchronized (var3) {
                int var5 = var3.method950(this);
                if (var5 < 0) {
                    var3.field2551 = 0;
                    this.method101(var3);
                } else {
                    var3.field2551 = var5;
                    this.method103(var3.field3195, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([III)V")
    public final synchronized void method100(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field219 < 0) {
                this.method102(arg0, arg1, arg2);
                return;
            }
            if (this.field218 + arg2 < this.field219) {
                this.field218 += arg2;
                this.method102(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field219 - this.field218;
            this.method102(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field218 += var4;
            this.method106();
            class144 var5 = (class144) this.field217.method1189(0);
            synchronized (var5) {
                int var7 = var5.method950(this);
                if (var7 < 0) {
                    var5.field2551 = 0;
                    this.method101(var5);
                } else {
                    var5.field2551 = var7;
                    this.method103(var5.field3195, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lnc;)V")
    private final void method101(class144 arg0) {
        arg0.method1148(-13215);
        arg0.method951();
        class183 var2 = this.field217.field3279.field3195;
        if (this.field217.field3279 == var2) {
            this.field219 = -1;
        } else {
            this.field219 = ((class144) var2).field2551;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "([III)V")
    private final void method102(int[] arg0, int arg1, int arg2) {
        for (class185 var4 = (class185) this.field216.method1189(0); var4 != null; var4 = (class185) this.field216.method1192((byte) -82)) {
            var4.method1156(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lrb;Lnc;)V")
    private final void method103(class183 arg0, class144 arg1) {
        while (this.field217.field3279 != arg0 && ((class144) arg0).field2551 <= arg1.field2551) {
            arg0 = arg0.field3195;
        }
        this.field217.method1197(arg1, (byte) 70, arg0);
        this.field219 = ((class144) this.field217.field3279.field3195).field2551;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lrd;)V")
    public final synchronized void method104(class185 arg0) {
        this.field216.method1186(arg0, 125);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()Lrd;")
    public final class185 method105() {
        return (class185) this.field216.method1189(0);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
    private final void method106() {
        if (this.field218 <= 0) {
            return;
        }
        for (class144 var1 = (class144) this.field217.method1189(0); var1 != null; var1 = (class144) this.field217.method1192((byte) -78)) {
            var1.field2551 -= this.field218;
        }
        this.field219 -= this.field218;
        this.field218 = 0;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()Lrd;")
    public final class185 method107() {
        return (class185) this.field216.method1192((byte) -107);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    private final void method108(int arg0) {
        for (class185 var2 = (class185) this.field216.method1189(0); var2 != null; var2 = (class185) this.field216.method1192((byte) -104)) {
            var2.method99(arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lrd;)V")
    public final synchronized void method109(class185 arg0) {
        arg0.method1148(-13215);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
    public final int method110() {
        return 0;
    }
}
