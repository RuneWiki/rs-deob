import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class313 extends class68 {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lad;")
    private class128 field4856 = new class128();

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lad;")
    private class128 field4857 = new class128();

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    private int field4858 = -1;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    private int field4859 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lri;)V", line = 8)
    public final synchronized void method2156(class68 arg0) {
        this.field4856.method984(arg0, (byte) 117);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()Lri;", line = 12)
    public final class68 method575() {
        return (class68) this.field4856.method986(false);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "()V", line = 15)
    private final void method2157() {
        if (this.field4859 <= 0) {
            return;
        }
        for (class169 var1 = (class169) this.field4857.method986(false); var1 != null; var1 = (class169) this.field4857.method982(14877)) {
            var1.field2531 -= this.field4859;
        }
        this.field4858 -= this.field4859;
        this.field4859 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()I", line = 32)
    public final int method573() {
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ldh;)V", line = 37)
    private final void method2158(class169 arg0) {
        arg0.method1554((byte) -25);
        arg0.method1246();
        class217 var2 = this.field4857.field2021.field3419;
        if (this.field4857.field2021 == var2) {
            this.field4858 = -1;
        } else {
            this.field4858 = ((class169) var2).field2531;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "([III)V", line = 56)
    public final synchronized void method576(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4858 < 0) {
                this.method2160(arg0, arg1, arg2);
                return;
            }
            if (this.field4859 + arg2 < this.field4858) {
                this.field4859 += arg2;
                this.method2160(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4858 - this.field4859;
            this.method2160(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4859 += var4;
            this.method2157();
            class169 var5 = (class169) this.field4857.method986(false);
            synchronized (var5) {
                int var7 = var5.method1247(this);
                if (var7 < 0) {
                    var5.field2531 = 0;
                    this.method2158(var5);
                } else {
                    var5.field2531 = var7;
                    this.method2161(var5.field3419, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 102)
    private final void method2159(int arg0) {
        for (class68 var2 = (class68) this.field4856.method986(false); var2 != null; var2 = (class68) this.field4856.method982(14877)) {
            var2.method571(arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 115)
    public final synchronized void method571(int arg0) {
        do {
            if (this.field4858 < 0) {
                this.method2159(arg0);
                return;
            }
            if (this.field4859 + arg0 < this.field4858) {
                this.field4859 += arg0;
                this.method2159(arg0);
                return;
            }
            int var2 = this.field4858 - this.field4859;
            this.method2159(var2);
            arg0 -= var2;
            this.field4859 += var2;
            this.method2157();
            class169 var3 = (class169) this.field4857.method986(false);
            synchronized (var3) {
                int var5 = var3.method1247(this);
                if (var5 < 0) {
                    var3.field2531 = 0;
                    this.method2158(var3);
                } else {
                    var3.field2531 = var5;
                    this.method2161(var3.field3419, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "([III)V", line = 164)
    private final void method2160(int[] arg0, int arg1, int arg2) {
        for (class68 var4 = (class68) this.field4856.method986(false); var4 != null; var4 = (class68) this.field4856.method982(14877)) {
            var4.method572(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lwj;Ldh;)V", line = 175)
    private final void method2161(class217 arg0, class169 arg1) {
        while (this.field4857.field2021 != arg0 && ((class169) arg0).field2531 <= arg1.field2531) {
            arg0 = arg0.field3419;
        }
        class188.method1359((byte) -53, arg0, arg1);
        this.field4858 = ((class169) this.field4857.field2021.field3419).field2531;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()Lri;", line = 187)
    public final class68 method570() {
        return (class68) this.field4856.method982(14877);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lri;)V", line = 197)
    public final synchronized void method2162(class68 arg0) {
        arg0.method1554((byte) -69);
    }
}
