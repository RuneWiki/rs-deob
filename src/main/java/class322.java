import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class322 extends class219 {

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lij;")
    private class175 field5498 = new class175();

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lij;")
    private class175 field5499 = new class175();

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field5500 = 0;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    private int field5501 = -1;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 4)
    private final void method2233() {
        if (this.field5500 <= 0) {
            return;
        }
        for (class69 var1 = (class69) this.field5499.method1270((byte) -121); var1 != null; var1 = (class69) this.field5499.method1277(1)) {
            var1.field1275 -= this.field5500;
        }
        this.field5501 -= this.field5500;
        this.field5500 = 0;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()I", line = 21)
    public final int method915() {
        return 0;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "([III)V", line = 30)
    private final void method2234(int[] arg0, int arg1, int arg2) {
        for (class219 var4 = (class219) this.field5498.method1270((byte) -121); var4 != null; var4 = (class219) this.field5498.method1277(1)) {
            var4.method1518(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III)V", line = 44)
    public final synchronized void method941(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5501 < 0) {
                this.method2234(arg0, arg1, arg2);
                return;
            }
            if (this.field5500 + arg2 < this.field5501) {
                this.field5500 += arg2;
                this.method2234(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5501 - this.field5500;
            this.method2234(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5500 += var4;
            this.method2233();
            class69 var5 = (class69) this.field5499.method1270((byte) -121);
            synchronized (var5) {
                int var7 = var5.method529(this);
                if (var7 < 0) {
                    var5.field1275 = 0;
                    this.method2239(var5);
                } else {
                    var5.field1275 = var7;
                    this.method2238(var5.field2893, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfd;)V", line = 90)
    public final synchronized void method2235(class219 arg0) {
        this.field5498.method1273(19402, arg0);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Lfd;", line = 94)
    public final class219 method913() {
        return (class219) this.field5498.method1270((byte) -121);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V", line = 101)
    private final void method2236(int arg0) {
        for (class219 var2 = (class219) this.field5498.method1270((byte) -121); var2 != null; var2 = (class219) this.field5498.method1277(1)) {
            var2.method912(arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V", line = 114)
    public final synchronized void method912(int arg0) {
        do {
            if (this.field5501 < 0) {
                this.method2236(arg0);
                return;
            }
            if (this.field5500 + arg0 < this.field5501) {
                this.field5500 += arg0;
                this.method2236(arg0);
                return;
            }
            int var2 = this.field5501 - this.field5500;
            this.method2236(var2);
            arg0 -= var2;
            this.field5500 += var2;
            this.method2233();
            class69 var3 = (class69) this.field5499.method1270((byte) -121);
            synchronized (var3) {
                int var5 = var3.method529(this);
                if (var5 < 0) {
                    var3.field1275 = 0;
                    this.method2239(var3);
                } else {
                    var3.field1275 = var5;
                    this.method2238(var3.field2893, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lfd;)V", line = 158)
    public final synchronized void method2237(class219 arg0) {
        arg0.method1199(21966);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsg;Lr;)V", line = 162)
    private final void method2238(class163 arg0, class69 arg1) {
        while (this.field5499.field3107 != arg0 && ((class69) arg0).field1275 <= arg1.field1275) {
            arg0 = arg0.field2893;
        }
        class300.method2099(arg1, arg0, false);
        this.field5501 = ((class69) this.field5499.field3107.field2893).field1275;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Lfd;", line = 173)
    public final class219 method934() {
        return (class219) this.field5498.method1277(1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lr;)V", line = 196)
    private final void method2239(class69 arg0) {
        arg0.method1199(21966);
        arg0.method530();
        class163 var2 = this.field5499.field3107.field2893;
        if (this.field5499.field3107 == var2) {
            this.field5501 = -1;
        } else {
            this.field5501 = ((class69) var2).field1275;
        }
    }
}
