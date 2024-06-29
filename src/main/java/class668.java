import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class668 extends class306 {

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "Lada;")
    private class164 field9351 = new class164();

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "Lada;")
    private class164 field9352 = new class164();

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
    private int field9353 = 0;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
    private int field9354 = -1;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lefa;Lsw;)V", line = 3)
    private final void method3828(class184 arg0, class757 arg1) {
        while (this.field9352.field2590 != arg0 && ((class757) arg0).field10590 <= arg1.field10590) {
            arg0 = arg0.field2812;
        }
        class314.method1989((byte) 100, arg0, arg1);
        this.field9354 = ((class757) this.field9352.field2590.field2812).field10590;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "([III)V", line = 12)
    private final void method3829(int[] arg0, int arg1, int arg2) {
        for (class306 var4 = (class306) this.field9351.method1195(0); var4 != null; var4 = (class306) this.field9351.method1201(2)) {
            var4.method1932(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "()Lca;", line = 21)
    public final class306 method1488() {
        return (class306) this.field9351.method1201(2);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "()Lca;", line = 25)
    public final class306 method1485() {
        return (class306) this.field9351.method1195(0);
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "()I", line = 33)
    public final int method1497() {
        return 0;
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "()V", line = 37)
    private final void method3830() {
        if (this.field9353 <= 0) {
            return;
        }
        for (class757 var1 = (class757) this.field9352.method1195(0); var1 != null; var1 = (class757) this.field9352.method1201(2)) {
            var1.field10590 -= this.field9353;
        }
        this.field9354 -= this.field9353;
        this.field9353 = 0;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lsw;)V", line = 57)
    private final void method3831(class757 arg0) {
        arg0.method1304((byte) 7);
        arg0.method4223();
        class184 var2 = this.field9352.field2590.field2812;
        if (this.field9352.field2590 == var2) {
            this.field9354 = -1;
        } else {
            this.field9354 = ((class757) var2).field10590;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 80)
    private final void method3832(int arg0) {
        for (class306 var2 = (class306) this.field9351.method1195(0); var2 != null; var2 = (class306) this.field9351.method1201(2)) {
            var2.method1482(arg0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "([III)V", line = 94)
    public final synchronized void method1491(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field9354 < 0) {
                this.method3829(arg0, arg1, arg2);
                return;
            }
            if (this.field9353 + arg2 < this.field9354) {
                this.field9353 += arg2;
                this.method3829(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field9354 - this.field9353;
            this.method3829(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field9353 += var4;
            this.method3830();
            class757 var5 = (class757) this.field9352.method1195(0);
            synchronized (var5) {
                int var7 = var5.method4224(this);
                if (var7 < 0) {
                    var5.field10590 = 0;
                    this.method3831(var5);
                } else {
                    var5.field10590 = var7;
                    this.method3828(var5.field2812, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "()I", line = 143)
    public final synchronized int method3833() {
        return this.field9351.method1196(-2);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 149)
    public final synchronized void method1482(int arg0) {
        do {
            if (this.field9354 < 0) {
                this.method3832(arg0);
                return;
            }
            if (this.field9353 + arg0 < this.field9354) {
                this.field9353 += arg0;
                this.method3832(arg0);
                return;
            }
            int var2 = this.field9354 - this.field9353;
            this.method3832(var2);
            arg0 -= var2;
            this.field9353 += var2;
            this.method3830();
            class757 var3 = (class757) this.field9352.method1195(0);
            synchronized (var3) {
                int var5 = var3.method4224(this);
                if (var5 < 0) {
                    var3.field10590 = 0;
                    this.method3831(var3);
                } else {
                    var3.field10590 = var5;
                    this.method3828(var3.field2812, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lca;)V", line = 193)
    public final synchronized void method3834(class306 arg0) {
        arg0.method1304((byte) 7);
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lca;)V", line = 199)
    public final synchronized void method3835(class306 arg0) {
        this.field9351.method1192(arg0, (byte) -119);
    }
}
