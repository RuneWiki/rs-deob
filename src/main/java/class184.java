import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class184 extends class41 {

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Ldc;")
    private class36 field3384 = new class36();

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Ldc;")
    private class36 field3385 = new class36();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    private int field3386 = 0;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    private int field3387 = -1;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    private final void method1194() {
        if (this.field3386 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field3385.method242(16711680); var1 != null; var1 = (class57) this.field3385.method237(10)) {
            var1.field1244 -= this.field3386;
        }
        this.field3387 -= this.field3386;
        this.field3386 = 0;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Ldh;")
    public final class41 method274() {
        return (class41) this.field3384.method237(10);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldh;)V")
    public final synchronized void method1195(class41 arg0) {
        this.field3384.method233(arg0, false);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    private final void method1196(int arg0) {
        for (class41 var2 = (class41) this.field3384.method242(16711680); var2 != null; var2 = (class41) this.field3384.method237(10)) {
            var2.method277(arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfb;)V")
    private final void method1197(class57 arg0) {
        arg0.method592((byte) -128);
        arg0.method393();
        class89 var2 = this.field3385.field792.field1687;
        if (this.field3385.field792 == var2) {
            this.field3387 = -1;
        } else {
            this.field3387 = ((class57) var2).field1244;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Ldh;")
    public final class41 method272() {
        return (class41) this.field3384.method242(16711680);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lib;Lfb;)V")
    private final void method1198(class89 arg0, class57 arg1) {
        while (this.field3385.field792 != arg0 && ((class57) arg0).field1244 <= arg1.field1244) {
            arg0 = arg0.field1687;
        }
        this.field3385.method240(arg1, arg0, 10);
        this.field3387 = ((class57) this.field3385.field792.field1687).field1244;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ldh;)V")
    public final synchronized void method1199(class41 arg0) {
        arg0.method592((byte) -128);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()I")
    public final int method276() {
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "([III)V")
    private final void method1200(int[] arg0, int arg1, int arg2) {
        for (class41 var4 = (class41) this.field3384.method242(16711680); var4 != null; var4 = (class41) this.field3384.method237(10)) {
            var4.method278(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V")
    public final synchronized void method275(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3387 < 0) {
                this.method1200(arg0, arg1, arg2);
                return;
            }
            if (this.field3386 + arg2 < this.field3387) {
                this.field3386 += arg2;
                this.method1200(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3387 - this.field3386;
            this.method1200(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3386 += var4;
            this.method1194();
            class57 var5 = (class57) this.field3385.method242(16711680);
            synchronized (var5) {
                int var7 = var5.method392(this);
                if (var7 < 0) {
                    var5.field1244 = 0;
                    this.method1197(var5);
                } else {
                    var5.field1244 = var7;
                    this.method1198(var5.field1687, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public final synchronized void method277(int arg0) {
        do {
            if (this.field3387 < 0) {
                this.method1196(arg0);
                return;
            }
            if (this.field3386 + arg0 < this.field3387) {
                this.field3386 += arg0;
                this.method1196(arg0);
                return;
            }
            int var2 = this.field3387 - this.field3386;
            this.method1196(var2);
            arg0 -= var2;
            this.field3386 += var2;
            this.method1194();
            class57 var3 = (class57) this.field3385.method242(16711680);
            synchronized (var3) {
                int var5 = var3.method392(this);
                if (var5 < 0) {
                    var3.field1244 = 0;
                    this.method1197(var3);
                } else {
                    var3.field1244 = var5;
                    this.method1198(var3.field1687, var3);
                }
            }
        } while (arg0 != 0);
    }
}
