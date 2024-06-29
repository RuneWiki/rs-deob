import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class328 extends class319 {

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lom;")
    private class156 field4923 = new class156();

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lom;")
    private class156 field4924 = new class156();

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    private int field4925 = 0;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field4926 = -1;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 6)
    public final synchronized void method1532(int arg0) {
        do {
            if (this.field4926 < 0) {
                this.method2231(arg0);
                return;
            }
            if (this.field4925 + arg0 < this.field4926) {
                this.field4925 += arg0;
                this.method2231(arg0);
                return;
            }
            int var2 = this.field4926 - this.field4925;
            this.method2231(var2);
            arg0 -= var2;
            this.field4925 += var2;
            this.method2232();
            class199 var3 = (class199) this.field4924.method1109(44);
            synchronized (var3) {
                int var5 = var3.method1364(this);
                if (var5 < 0) {
                    var3.field2980 = 0;
                    this.method2236(var3);
                } else {
                    var3.field2980 = var5;
                    this.method2235(var3.field1595, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lcm;)V", line = 53)
    public final synchronized void method2230(class319 arg0) {
        arg0.method714(122);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 59)
    private final void method2231(int arg0) {
        for (class319 var2 = (class319) this.field4923.method1109(-111); var2 != null; var2 = (class319) this.field4923.method1115((byte) 92)) {
            var2.method1532(arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "()V", line = 73)
    private final void method2232() {
        if (this.field4925 <= 0) {
            return;
        }
        for (class199 var1 = (class199) this.field4924.method1109(-117); var1 != null; var1 = (class199) this.field4924.method1115((byte) 118)) {
            var1.field2980 -= this.field4925;
        }
        this.field4926 -= this.field4925;
        this.field4925 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "([III)V", line = 94)
    private final void method2233(int[] arg0, int arg1, int arg2) {
        for (class319 var4 = (class319) this.field4923.method1109(28); var4 != null; var4 = (class319) this.field4923.method1115((byte) 99)) {
            var4.method2188(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([III)V", line = 109)
    public final synchronized void method1502(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4926 < 0) {
                this.method2233(arg0, arg1, arg2);
                return;
            }
            if (this.field4925 + arg2 < this.field4926) {
                this.field4925 += arg2;
                this.method2233(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4926 - this.field4925;
            this.method2233(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4925 += var4;
            this.method2232();
            class199 var5 = (class199) this.field4924.method1109(-128);
            synchronized (var5) {
                int var7 = var5.method1364(this);
                if (var7 < 0) {
                    var5.field2980 = 0;
                    this.method2236(var5);
                } else {
                    var5.field2980 = var7;
                    this.method2235(var5.field1595, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lcm;)V", line = 156)
    public final synchronized void method2234(class319 arg0) {
        this.field4923.method1111(arg0, -8);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqa;Lqe;)V", line = 159)
    private final void method2235(class101 arg0, class199 arg1) {
        while (this.field4924.field2345 != arg0 && ((class199) arg0).field2980 <= arg1.field2980) {
            arg0 = arg0.field1595;
        }
        class131.method970(arg0, -122, arg1);
        this.field4926 = ((class199) this.field4924.field2345.field1595).field2980;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()Lcm;", line = 167)
    public final class319 method1543() {
        return (class319) this.field4923.method1115((byte) 70);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()Lcm;", line = 170)
    public final class319 method1521() {
        return (class319) this.field4923.method1109(63);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqe;)V", line = 174)
    private final void method2236(class199 arg0) {
        arg0.method714(111);
        arg0.method1365();
        class101 var2 = this.field4924.field2345.field1595;
        if (this.field4924.field2345 == var2) {
            this.field4926 = -1;
        } else {
            this.field4926 = ((class199) var2).field2980;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I", line = 192)
    public final int method1540() {
        return 0;
    }
}
