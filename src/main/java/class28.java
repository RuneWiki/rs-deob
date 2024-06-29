import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class28 extends class176 {

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lnk;")
    private class2 field355 = new class2();

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lnk;")
    private class2 field356 = new class2();

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    private int field358 = -1;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lsn;Lbf;)V", line = 6)
    private final void method210(class187 arg0, class189 arg1) {
        while (this.field356.field11 != arg0 && ((class189) arg0).field2874 <= arg1.field2874) {
            arg0 = arg0.field2846;
        }
        class305.method2077(arg0, arg1, true);
        this.field358 = ((class189) this.field356.field11.field2846).field2874;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 18)
    public final synchronized void method211(int arg0) {
        do {
            if (this.field358 < 0) {
                this.method215(arg0);
                return;
            }
            if (this.field357 + arg0 < this.field358) {
                this.field357 += arg0;
                this.method215(arg0);
                return;
            }
            int var2 = this.field358 - this.field357;
            this.method215(var2);
            arg0 -= var2;
            this.field357 += var2;
            this.method218();
            class189 var3 = (class189) this.field356.method10((byte) 81);
            synchronized (var3) {
                int var5 = var3.method1300(this);
                if (var5 < 0) {
                    var3.field2874 = 0;
                    this.method219(var3);
                } else {
                    var3.field2874 = var5;
                    this.method210(var3.field2846, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "([III)V", line = 65)
    private final void method212(int[] arg0, int arg1, int arg2) {
        for (class176 var4 = (class176) this.field355.method10((byte) 45); var4 != null; var4 = (class176) this.field355.method13((byte) -32)) {
            var4.method1190(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()Lic;", line = 75)
    public final class176 method213() {
        return (class176) this.field355.method13((byte) -32);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lic;)V", line = 80)
    public final synchronized void method214(class176 arg0) {
        this.field355.method14(arg0, 75);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 86)
    private final void method215(int arg0) {
        for (class176 var2 = (class176) this.field355.method10((byte) 120); var2 != null; var2 = (class176) this.field355.method13((byte) -32)) {
            var2.method211(arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()I", line = 95)
    public final int method216() {
        return 0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([III)V", line = 106)
    public final synchronized void method217(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field358 < 0) {
                this.method212(arg0, arg1, arg2);
                return;
            }
            if (this.field357 + arg2 < this.field358) {
                this.field357 += arg2;
                this.method212(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field358 - this.field357;
            this.method212(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field357 += var4;
            this.method218();
            class189 var5 = (class189) this.field356.method10((byte) 71);
            synchronized (var5) {
                int var7 = var5.method1300(this);
                if (var7 < 0) {
                    var5.field2874 = 0;
                    this.method219(var5);
                } else {
                    var5.field2874 = var7;
                    this.method210(var5.field2846, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "()V", line = 150)
    private final void method218() {
        if (this.field357 <= 0) {
            return;
        }
        for (class189 var1 = (class189) this.field356.method10((byte) 109); var1 != null; var1 = (class189) this.field356.method13((byte) -32)) {
            var1.field2874 -= this.field357;
        }
        this.field358 -= this.field357;
        this.field357 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbf;)V", line = 169)
    private final void method219(class189 arg0) {
        arg0.method1284(0);
        arg0.method1301();
        class187 var2 = this.field356.field11.field2846;
        if (this.field356.field11 == var2) {
            this.field358 = -1;
        } else {
            this.field358 = ((class189) var2).field2874;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()Lic;", line = 184)
    public final class176 method220() {
        return (class176) this.field355.method10((byte) 42);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lic;)V", line = 193)
    public final synchronized void method221(class176 arg0) {
        arg0.method1284(0);
    }
}
