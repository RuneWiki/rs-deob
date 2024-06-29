import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class332 extends class514 {

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lrk;")
    private class419 field4912 = new class419();

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lrk;")
    private class419 field4913 = new class419();

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    private int field4914 = -1;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    private int field4915 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lft;)V")
    public final synchronized void method2083(class514 arg0) {
        this.field4912.method2489(true, arg0);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lft;")
    public final class514 method1437() {
        return (class514) this.field4912.method2496((byte) 35);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lov;)V")
    private final void method2084(class348 arg0) {
        arg0.method2997(1);
        arg0.method2135();
        class496 var2 = this.field4913.field6029.field7469;
        if (this.field4913.field6029 == var2) {
            this.field4914 = -1;
        } else {
            this.field4914 = ((class348) var2).field5058;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()Lft;")
    public final class514 method1397() {
        return (class514) this.field4912.method2494(33);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Lft;)V")
    public final synchronized void method2085(class514 arg0) {
        arg0.method2997(1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljd;Lov;)V")
    private final void method2086(class496 arg0, class348 arg1) {
        while (this.field4913.field6029 != arg0 && ((class348) arg0).field5058 <= arg1.field5058) {
            arg0 = arg0.field7469;
        }
        class561.method3279(arg0, arg1, (byte) -84);
        this.field4914 = ((class348) this.field4913.field6029.field7469).field5058;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()I")
    public final synchronized int method2087() {
        return this.field4912.method2491(-18626);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final synchronized void method1434(int arg0) {
        do {
            if (this.field4914 < 0) {
                this.method2088(arg0);
                return;
            }
            if (this.field4915 + arg0 < this.field4914) {
                this.field4915 += arg0;
                this.method2088(arg0);
                return;
            }
            int var2 = this.field4914 - this.field4915;
            this.method2088(var2);
            arg0 -= var2;
            this.field4915 += var2;
            this.method2090();
            class348 var3 = (class348) this.field4913.method2496((byte) -110);
            synchronized (var3) {
                int var5 = var3.method2136(this);
                if (var5 < 0) {
                    var3.field5058 = 0;
                    this.method2084(var3);
                } else {
                    var3.field5058 = var5;
                    this.method2086(var3.field7469, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
    public final synchronized void method1425(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4914 < 0) {
                this.method2089(arg0, arg1, arg2);
                return;
            }
            if (this.field4915 + arg2 < this.field4914) {
                this.field4915 += arg2;
                this.method2089(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4914 - this.field4915;
            this.method2089(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4915 += var4;
            this.method2090();
            class348 var5 = (class348) this.field4913.method2496((byte) -102);
            synchronized (var5) {
                int var7 = var5.method2136(this);
                if (var7 < 0) {
                    var5.field5058 = 0;
                    this.method2084(var5);
                } else {
                    var5.field5058 = var7;
                    this.method2086(var5.field7469, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
    public final int method1419() {
        return 0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    private final void method2088(int arg0) {
        for (class514 var2 = (class514) this.field4912.method2496((byte) 26); var2 != null; var2 = (class514) this.field4912.method2494(48)) {
            var2.method1434(arg0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "([III)V")
    private final void method2089(int[] arg0, int arg1, int arg2) {
        for (class514 var4 = (class514) this.field4912.method2496((byte) -99); var4 != null; var4 = (class514) this.field4912.method2494(40)) {
            var4.method3059(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()V")
    private final void method2090() {
        if (this.field4915 <= 0) {
            return;
        }
        for (class348 var1 = (class348) this.field4913.method2496((byte) 124); var1 != null; var1 = (class348) this.field4913.method2494(46)) {
            var1.field5058 -= this.field4915;
        }
        this.field4914 -= this.field4915;
        this.field4915 = 0;
    }
}
