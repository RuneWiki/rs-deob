import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class318 extends class172 {

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lo;")
    private class227 field5383 = new class227();

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lo;")
    private class227 field5384 = new class227();

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    private int field5385 = 0;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    private int field5386 = -1;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V", line = 7)
    public final synchronized void method474(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5386 < 0) {
                this.method2148(arg0, arg1, arg2);
                return;
            }
            if (this.field5385 + arg2 < this.field5386) {
                this.field5385 += arg2;
                this.method2148(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5386 - this.field5385;
            this.method2148(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5385 += var4;
            this.method2151();
            class128 var5 = (class128) this.field5384.method1580((byte) -39);
            synchronized (var5) {
                int var7 = var5.method931(this);
                if (var7 < 0) {
                    var5.field2110 = 0;
                    this.method2146(var5);
                } else {
                    var5.field2110 = var7;
                    this.method2147(var5.field1317, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Luc;)V", line = 53)
    private final void method2146(class128 arg0) {
        arg0.method598(13);
        arg0.method930();
        class80 var2 = this.field5384.field3719.field1317;
        if (this.field5384.field3719 == var2) {
            this.field5386 = -1;
        } else {
            this.field5386 = ((class128) var2).field2110;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()I", line = 71)
    public final int method451() {
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ll;Luc;)V", line = 78)
    private final void method2147(class80 arg0, class128 arg1) {
        while (this.field5384.field3719 != arg0 && ((class128) arg0).field2110 <= arg1.field2110) {
            arg0 = arg0.field1317;
        }
        class59.method395(-12564, arg0, arg1);
        this.field5386 = ((class128) this.field5384.field3719.field1317).field2110;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()La;", line = 85)
    public final class172 method463() {
        return (class172) this.field5383.method1580((byte) -39);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "([III)V", line = 90)
    private final void method2148(int[] arg0, int arg1, int arg2) {
        for (class172 var4 = (class172) this.field5383.method1580((byte) -39); var4 != null; var4 = (class172) this.field5383.method1579((byte) 28)) {
            var4.method1247(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V", line = 104)
    public final synchronized void method439(int arg0) {
        do {
            if (this.field5386 < 0) {
                this.method2149(arg0);
                return;
            }
            if (this.field5385 + arg0 < this.field5386) {
                this.field5385 += arg0;
                this.method2149(arg0);
                return;
            }
            int var2 = this.field5386 - this.field5385;
            this.method2149(var2);
            arg0 -= var2;
            this.field5385 += var2;
            this.method2151();
            class128 var3 = (class128) this.field5384.method1580((byte) -39);
            synchronized (var3) {
                int var5 = var3.method931(this);
                if (var5 < 0) {
                    var3.field2110 = 0;
                    this.method2146(var3);
                } else {
                    var3.field2110 = var5;
                    this.method2147(var3.field1317, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V", line = 150)
    private final void method2149(int arg0) {
        for (class172 var2 = (class172) this.field5383.method1580((byte) -39); var2 != null; var2 = (class172) this.field5383.method1579((byte) 28)) {
            var2.method439(arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()La;", line = 161)
    public final class172 method459() {
        return (class172) this.field5383.method1579((byte) 28);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(La;)V", line = 164)
    public final synchronized void method2150(class172 arg0) {
        arg0.method598(78);
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V", line = 167)
    private final void method2151() {
        if (this.field5385 <= 0) {
            return;
        }
        for (class128 var1 = (class128) this.field5384.method1580((byte) -39); var1 != null; var1 = (class128) this.field5384.method1579((byte) 28)) {
            var1.field2110 -= this.field5385;
        }
        this.field5386 -= this.field5385;
        this.field5385 = 0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(La;)V", line = 187)
    public final synchronized void method2152(class172 arg0) {
        this.field5383.method1578(0, arg0);
    }
}
