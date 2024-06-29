import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class311 extends class458 {

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lug;")
    private class392 field4729 = new class392();

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lug;")
    private class392 field4730 = new class392();

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private int field4731 = -1;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    private int field4732 = 0;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "()Lbl;", line = 7)
    public final class458 method2033() {
        return (class458) this.field4729.method2427(109);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()I", line = 10)
    public final int method2034() {
        return 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lbl;)V", line = 13)
    public final synchronized void method2035(class458 arg0) {
        arg0.method2090(-1);
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "()I", line = 17)
    public final synchronized int method2036() {
        return this.field4729.method2420(0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([III)V", line = 26)
    public final synchronized void method2037(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4731 < 0) {
                this.method2038(arg0, arg1, arg2);
                return;
            }
            if (this.field4732 + arg2 < this.field4731) {
                this.field4732 += arg2;
                this.method2038(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4731 - this.field4732;
            this.method2038(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4732 += var4;
            this.method2042();
            class249 var5 = (class249) this.field4730.method2427(116);
            synchronized (var5) {
                int var7 = var5.method1604(this);
                if (var7 < 0) {
                    var5.field3573 = 0;
                    this.method2043(var5);
                } else {
                    var5.field3573 = var7;
                    this.method2040(var5.field4901, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "([III)V", line = 72)
    private final void method2038(int[] arg0, int arg1, int arg2) {
        for (class458 var4 = (class458) this.field4729.method2427(106); var4 != null; var4 = (class458) this.field4729.method2422(-104)) {
            var4.method2730(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lbl;)V", line = 85)
    public final synchronized void method2039(class458 arg0) {
        this.field4729.method2428((byte) 123, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lqg;Lhe;)V", line = 88)
    private final void method2040(class320 arg0, class249 arg1) {
        while (this.field4730.field5929 != arg0 && ((class249) arg0).field3573 <= arg1.field3573) {
            arg0 = arg0.field4901;
        }
        class487.method2886(arg0, arg1, -532427220);
        this.field4731 = ((class249) this.field4730.field5929.field4901).field3573;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 99)
    public final synchronized void method2041(int arg0) {
        do {
            if (this.field4731 < 0) {
                this.method2045(arg0);
                return;
            }
            if (this.field4732 + arg0 < this.field4731) {
                this.field4732 += arg0;
                this.method2045(arg0);
                return;
            }
            int var2 = this.field4731 - this.field4732;
            this.method2045(var2);
            arg0 -= var2;
            this.field4732 += var2;
            this.method2042();
            class249 var3 = (class249) this.field4730.method2427(116);
            synchronized (var3) {
                int var5 = var3.method1604(this);
                if (var5 < 0) {
                    var3.field3573 = 0;
                    this.method2043(var3);
                } else {
                    var3.field3573 = var5;
                    this.method2040(var3.field4901, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "()V", line = 143)
    private final void method2042() {
        if (this.field4732 <= 0) {
            return;
        }
        for (class249 var1 = (class249) this.field4730.method2427(121); var1 != null; var1 = (class249) this.field4730.method2422(-107)) {
            var1.field3573 -= this.field4732;
        }
        this.field4731 -= this.field4732;
        this.field4732 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lhe;)V", line = 164)
    private final void method2043(class249 arg0) {
        arg0.method2090(-1);
        arg0.method1605();
        class320 var2 = this.field4730.field5929.field4901;
        if (this.field4730.field5929 == var2) {
            this.field4731 = -1;
        } else {
            this.field4731 = ((class249) var2).field3573;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()Lbl;", line = 177)
    public final class458 method2044() {
        return (class458) this.field4729.method2422(-91);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V", line = 196)
    private final void method2045(int arg0) {
        for (class458 var2 = (class458) this.field4729.method2427(123); var2 != null; var2 = (class458) this.field4729.method2422(-73)) {
            var2.method2041(arg0);
        }
    }
}
