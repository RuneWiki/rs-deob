import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class278 extends class195 {

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Lor;")
    private class594 field4487 = new class594();

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "Lor;")
    private class594 field4488 = new class594();

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    private int field4489 = -1;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    private int field4490 = 0;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "()Leq;")
    public final class195 method220() {
        return (class195) this.field4487.method3469(0);
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "()V")
    private final void method1983() {
        if (this.field4490 <= 0) {
            return;
        }
        for (class512 var1 = (class512) this.field4488.method3465((byte) 117); var1 != null; var1 = (class512) this.field4488.method3469(0)) {
            var1.field7461 -= this.field4490;
        }
        this.field4489 -= this.field4490;
        this.field4490 = 0;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "([III)V")
    private final void method1984(int[] arg0, int arg1, int arg2) {
        for (class195 var4 = (class195) this.field4487.method3465((byte) -45); var4 != null; var4 = (class195) this.field4487.method3469(0)) {
            var4.method1539(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public final synchronized void method235(int arg0) {
        do {
            if (this.field4489 < 0) {
                this.method1986(arg0);
                return;
            }
            if (this.field4490 + arg0 < this.field4489) {
                this.field4490 += arg0;
                this.method1986(arg0);
                return;
            }
            int var2 = this.field4489 - this.field4490;
            this.method1986(var2);
            arg0 -= var2;
            this.field4490 += var2;
            this.method1983();
            class512 var3 = (class512) this.field4488.method3465((byte) 127);
            synchronized (var3) {
                int var5 = var3.method3103(this);
                if (var5 < 0) {
                    var3.field7461 = 0;
                    this.method1988(var3);
                } else {
                    var3.field7461 = var5;
                    this.method1989(var3.field848, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "([III)V")
    public final synchronized void method240(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4489 < 0) {
                this.method1984(arg0, arg1, arg2);
                return;
            }
            if (this.field4490 + arg2 < this.field4489) {
                this.field4490 += arg2;
                this.method1984(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4489 - this.field4490;
            this.method1984(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4490 += var4;
            this.method1983();
            class512 var5 = (class512) this.field4488.method3465((byte) 118);
            synchronized (var5) {
                int var7 = var5.method3103(this);
                if (var7 < 0) {
                    var5.field7461 = 0;
                    this.method1988(var5);
                } else {
                    var5.field7461 = var7;
                    this.method1989(var5.field848, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Leq;)V")
    public final synchronized void method1985(class195 arg0) {
        arg0.method707((byte) -115);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    private final void method1986(int arg0) {
        for (class195 var2 = (class195) this.field4487.method3465((byte) 121); var2 != null; var2 = (class195) this.field4487.method3469(0)) {
            var2.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "()I")
    public final synchronized int method1987() {
        return this.field4487.method3468(0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lnl;)V")
    private final void method1988(class512 arg0) {
        arg0.method707((byte) -13);
        arg0.method3102();
        class66 var2 = this.field4488.field8428.field848;
        if (this.field4488.field8428 == var2) {
            this.field4489 = -1;
        } else {
            this.field4489 = ((class512) var2).field7461;
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "()Leq;")
    public final class195 method219() {
        return (class195) this.field4487.method3465((byte) -125);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "()I")
    public final int method215() {
        return 0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lu;Lnl;)V")
    private final void method1989(class66 arg0, class512 arg1) {
        while (this.field4488.field8428 != arg0 && ((class512) arg0).field7461 <= arg1.field7461) {
            arg0 = arg0.field848;
        }
        class37.method474(arg1, false, arg0);
        this.field4489 = ((class512) this.field4488.field8428.field848).field7461;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Leq;)V")
    public final synchronized void method1990(class195 arg0) {
        this.field4487.method3466(arg0, (byte) -23);
    }
}
