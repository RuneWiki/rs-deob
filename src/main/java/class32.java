import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class32 extends class417 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lm;")
    private class242 field516 = new class242();

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lm;")
    private class242 field517 = new class242();

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    private int field519 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    private int field518 = -1;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "([III)V", line = 5)
    private final void method246(int[] arg0, int arg1, int arg2) {
        for (class417 var4 = (class417) this.field516.method1575(0); var4 != null; var4 = (class417) this.field516.method1573((byte) -128)) {
            var4.method2630(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lob;Lr;)V", line = 15)
    private final void method247(class418 arg0, class284 arg1) {
        while (this.field517.field3397 != arg0 && ((class284) arg0).field4290 <= arg1.field4290) {
            arg0 = arg0.field6094;
        }
        class329.method2158(true, arg0, arg1);
        this.field518 = ((class284) this.field517.field3397.field6094).field4290;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmq;)V", line = 26)
    public final synchronized void method248(class417 arg0) {
        this.field516.method1576(false, arg0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lmq;)V", line = 30)
    public final synchronized void method249(class417 arg0) {
        arg0.method2632(true);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V", line = 37)
    public final synchronized void method165(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field518 < 0) {
                this.method246(arg0, arg1, arg2);
                return;
            }
            if (this.field519 + arg2 < this.field518) {
                this.field519 += arg2;
                this.method246(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field518 - this.field519;
            this.method246(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field519 += var4;
            this.method250();
            class284 var5 = (class284) this.field517.method1575(0);
            synchronized (var5) {
                int var7 = var5.method1943(this);
                if (var7 < 0) {
                    var5.field4290 = 0;
                    this.method251(var5);
                } else {
                    var5.field4290 = var7;
                    this.method247(var5.field6094, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 81)
    private final void method250() {
        if (this.field519 <= 0) {
            return;
        }
        for (class284 var1 = (class284) this.field517.method1575(0); var1 != null; var1 = (class284) this.field517.method1573((byte) -128)) {
            var1.field4290 -= this.field519;
        }
        this.field518 -= this.field519;
        this.field519 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lr;)V", line = 98)
    private final void method251(class284 arg0) {
        arg0.method2632(true);
        arg0.method1942();
        class418 var2 = this.field517.field3397.field6094;
        if (this.field517.field3397 == var2) {
            this.field518 = -1;
        } else {
            this.field518 = ((class284) var2).field4290;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 117)
    private final void method252(int arg0) {
        for (class417 var2 = (class417) this.field516.method1575(0); var2 != null; var2 = (class417) this.field516.method1573((byte) -128)) {
            var2.method187(arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()I", line = 127)
    public final int method152() {
        return 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Lmq;", line = 130)
    public final class417 method156() {
        return (class417) this.field516.method1573((byte) -128);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()Lmq;", line = 139)
    public final class417 method189() {
        return (class417) this.field516.method1575(0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 146)
    public final synchronized void method187(int arg0) {
        do {
            if (this.field518 < 0) {
                this.method252(arg0);
                return;
            }
            if (this.field519 + arg0 < this.field518) {
                this.field519 += arg0;
                this.method252(arg0);
                return;
            }
            int var2 = this.field518 - this.field519;
            this.method252(var2);
            arg0 -= var2;
            this.field519 += var2;
            this.method250();
            class284 var3 = (class284) this.field517.method1575(0);
            synchronized (var3) {
                int var5 = var3.method1943(this);
                if (var5 < 0) {
                    var3.field4290 = 0;
                    this.method251(var3);
                } else {
                    var3.field4290 = var5;
                    this.method247(var3.field6094, var3);
                }
            }
        } while (arg0 != 0);
    }
}
