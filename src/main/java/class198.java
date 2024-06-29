import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class198 extends class209 {

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Lj;")
    private class269 field3379 = new class269();

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Lj;")
    private class269 field3380 = new class269();

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    private int field3381 = 0;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    private int field3382 = -1;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I", line = 4)
    public final int method140() {
        return 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lma;)V", line = 9)
    private final void method1269(class271 arg0) {
        arg0.method557((byte) -89);
        arg0.method1825();
        class86 var2 = this.field3380.field4533.field1453;
        if (this.field3380.field4533 == var2) {
            this.field3382 = -1;
        } else {
            this.field3382 = ((class271) var2).field4565;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 26)
    public final synchronized void method148(int arg0) {
        do {
            if (this.field3382 < 0) {
                this.method1272(arg0);
                return;
            }
            if (this.field3381 + arg0 < this.field3382) {
                this.field3381 += arg0;
                this.method1272(arg0);
                return;
            }
            int var2 = this.field3382 - this.field3381;
            this.method1272(var2);
            arg0 -= var2;
            this.field3381 += var2;
            this.method1273();
            class271 var3 = (class271) this.field3380.method1812((byte) -124);
            synchronized (var3) {
                int var5 = var3.method1824(this);
                if (var5 < 0) {
                    var3.field4565 = 0;
                    this.method1269(var3);
                } else {
                    var3.field4565 = var5;
                    this.method1270(var3.field1453, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "([III)V", line = 76)
    public final synchronized void method161(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3382 < 0) {
                this.method1271(arg0, arg1, arg2);
                return;
            }
            if (this.field3381 + arg2 < this.field3382) {
                this.field3381 += arg2;
                this.method1271(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3382 - this.field3381;
            this.method1271(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3381 += var4;
            this.method1273();
            class271 var5 = (class271) this.field3380.method1812((byte) -16);
            synchronized (var5) {
                int var7 = var5.method1824(this);
                if (var7 < 0) {
                    var5.field4565 = 0;
                    this.method1269(var5);
                } else {
                    var5.field4565 = var7;
                    this.method1270(var5.field1453, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Luk;Lma;)V", line = 121)
    private final void method1270(class86 arg0, class271 arg1) {
        while (this.field3380.field4533 != arg0 && ((class271) arg0).field4565 <= arg1.field4565) {
            arg0 = arg0.field1453;
        }
        class34.method224((byte) 81, arg1, arg0);
        this.field3382 = ((class271) this.field3380.field4533.field1453).field4565;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "([III)V", line = 131)
    private final void method1271(int[] arg0, int arg1, int arg2) {
        for (class209 var4 = (class209) this.field3379.method1812((byte) 116); var4 != null; var4 = (class209) this.field3379.method1813((byte) 55)) {
            var4.method1383(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()Lrb;", line = 142)
    public final class209 method147() {
        return (class209) this.field3379.method1813((byte) 63);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()Lrb;", line = 146)
    public final class209 method158() {
        return (class209) this.field3379.method1812((byte) -6);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 151)
    private final void method1272(int arg0) {
        for (class209 var2 = (class209) this.field3379.method1812((byte) 36); var2 != null; var2 = (class209) this.field3379.method1813((byte) 121)) {
            var2.method148(arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "()V", line = 162)
    private final void method1273() {
        if (this.field3381 <= 0) {
            return;
        }
        for (class271 var1 = (class271) this.field3380.method1812((byte) -124); var1 != null; var1 = (class271) this.field3380.method1813((byte) 124)) {
            var1.field4565 -= this.field3381;
        }
        this.field3382 -= this.field3381;
        this.field3381 = 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lrb;)V", line = 181)
    public final synchronized void method1274(class209 arg0) {
        this.field3379.method1815(arg0, 0);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Lrb;)V", line = 185)
    public final synchronized void method1275(class209 arg0) {
        arg0.method557((byte) -89);
    }
}
