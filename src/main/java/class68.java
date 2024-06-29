import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class68 extends class298 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lvq;")
    private class22 field1119 = new class22();

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lvq;")
    private class22 field1120 = new class22();

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field1121 = -1;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field1122 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 6)
    public final synchronized void method173(int arg0) {
        do {
            if (this.field1121 < 0) {
                this.method512(arg0);
                return;
            }
            if (this.field1122 + arg0 < this.field1121) {
                this.field1122 += arg0;
                this.method512(arg0);
                return;
            }
            int var2 = this.field1121 - this.field1122;
            this.method512(var2);
            arg0 -= var2;
            this.field1122 += var2;
            this.method508();
            class103 var3 = (class103) this.field1120.method157((byte) -125);
            synchronized (var3) {
                int var5 = var3.method851(this);
                if (var5 < 0) {
                    var3.field1593 = 0;
                    this.method514(var3);
                } else {
                    var3.field1593 = var5;
                    this.method509(var3.field498, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()V", line = 50)
    private final void method508() {
        if (this.field1122 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1120.method157((byte) -125); var1 != null; var1 = (class103) this.field1120.method145(111)) {
            var1.field1593 -= this.field1122;
        }
        this.field1121 -= this.field1122;
        this.field1122 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lon;Ltb;)V", line = 67)
    private final void method509(class35 arg0, class103 arg1) {
        while (this.field1120.field322 != arg0 && ((class103) arg0).field1593 <= arg1.field1593) {
            arg0 = arg0.field498;
        }
        class286.method2020(arg0, arg1, (byte) -119);
        this.field1121 = ((class103) this.field1120.field322.field498).field1593;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "([III)V", line = 77)
    private final void method510(int[] arg0, int arg1, int arg2) {
        for (class298 var4 = (class298) this.field1119.method157((byte) -125); var4 != null; var4 = (class298) this.field1119.method145(68)) {
            var4.method2068(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V", line = 92)
    public final synchronized void method187(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1121 < 0) {
                this.method510(arg0, arg1, arg2);
                return;
            }
            if (this.field1122 + arg2 < this.field1121) {
                this.field1122 += arg2;
                this.method510(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1121 - this.field1122;
            this.method510(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1122 += var4;
            this.method508();
            class103 var5 = (class103) this.field1120.method157((byte) -125);
            synchronized (var5) {
                int var7 = var5.method851(this);
                if (var7 < 0) {
                    var5.field1593 = 0;
                    this.method514(var5);
                } else {
                    var5.field1593 = var7;
                    this.method509(var5.field498, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lwm;)V", line = 137)
    public final synchronized void method511(class298 arg0) {
        arg0.method251(55);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 143)
    private final void method512(int arg0) {
        for (class298 var2 = (class298) this.field1119.method157((byte) -125); var2 != null; var2 = (class298) this.field1119.method145(67)) {
            var2.method173(arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lwm;)V", line = 156)
    public final synchronized void method513(class298 arg0) {
        this.field1119.method151(arg0, 2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()Lwm;", line = 160)
    public final class298 method206() {
        return (class298) this.field1119.method157((byte) -125);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()I", line = 163)
    public final int method185() {
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltb;)V", line = 172)
    private final void method514(class103 arg0) {
        arg0.method251(102);
        arg0.method852();
        class35 var2 = this.field1120.field322.field498;
        if (this.field1120.field322 == var2) {
            this.field1121 = -1;
        } else {
            this.field1121 = ((class103) var2).field1593;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lwm;", line = 189)
    public final class298 method183() {
        return (class298) this.field1119.method145(-12);
    }
}
