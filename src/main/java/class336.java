import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class336 extends class210 {

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Lwn;")
    private class30 field5201 = new class30();

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lwn;")
    private class30 field5202 = new class30();

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field5204 = 0;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    private int field5203 = -1;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "([III)V", line = 15)
    public final synchronized void method232(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5203 < 0) {
                this.method2341(arg0, arg1, arg2);
                return;
            }
            if (this.field5204 + arg2 < this.field5203) {
                this.field5204 += arg2;
                this.method2341(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5203 - this.field5204;
            this.method2341(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5204 += var4;
            this.method2343();
            class192 var5 = (class192) this.field5202.method268(-1);
            synchronized (var5) {
                int var7 = var5.method1378(this);
                if (var7 < 0) {
                    var5.field3005 = 0;
                    this.method2340(var5);
                } else {
                    var5.field3005 = var7;
                    this.method2346(var5.field891, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()I", line = 59)
    public final int method240() {
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()Lkn;", line = 62)
    public final class210 method239() {
        return (class210) this.field5201.method268(-1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lim;)V", line = 70)
    private final void method2340(class192 arg0) {
        arg0.method489(false);
        arg0.method1377();
        class60 var2 = this.field5202.field481.field891;
        if (this.field5202.field481 == var2) {
            this.field5203 = -1;
        } else {
            this.field5203 = ((class192) var2).field3005;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "([III)V", line = 85)
    private final void method2341(int[] arg0, int arg1, int arg2) {
        for (class210 var4 = (class210) this.field5201.method268(-1); var4 != null; var4 = (class210) this.field5201.method278(1)) {
            var4.method1537(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lkn;)V", line = 102)
    public final synchronized void method2342(class210 arg0) {
        this.field5201.method274(1, arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 109)
    public final synchronized void method235(int arg0) {
        do {
            if (this.field5203 < 0) {
                this.method2344(arg0);
                return;
            }
            if (this.field5204 + arg0 < this.field5203) {
                this.field5204 += arg0;
                this.method2344(arg0);
                return;
            }
            int var2 = this.field5203 - this.field5204;
            this.method2344(var2);
            arg0 -= var2;
            this.field5204 += var2;
            this.method2343();
            class192 var3 = (class192) this.field5202.method268(-1);
            synchronized (var3) {
                int var5 = var3.method1378(this);
                if (var5 < 0) {
                    var3.field3005 = 0;
                    this.method2340(var3);
                } else {
                    var3.field3005 = var5;
                    this.method2346(var3.field891, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()V", line = 153)
    private final void method2343() {
        if (this.field5204 <= 0) {
            return;
        }
        for (class192 var1 = (class192) this.field5202.method268(-1); var1 != null; var1 = (class192) this.field5202.method278(1)) {
            var1.field3005 -= this.field5204;
        }
        this.field5203 -= this.field5204;
        this.field5204 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 173)
    private final void method2344(int arg0) {
        for (class210 var2 = (class210) this.field5201.method268(-1); var2 != null; var2 = (class210) this.field5201.method278(1)) {
            var2.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Lkn;)V", line = 183)
    public final synchronized void method2345(class210 arg0) {
        arg0.method489(false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lvb;Lim;)V", line = 197)
    private final void method2346(class60 arg0, class192 arg1) {
        while (this.field5202.field481 != arg0 && ((class192) arg0).field3005 <= arg1.field3005) {
            arg0 = arg0.field891;
        }
        class79.method621(255, arg1, arg0);
        this.field5203 = ((class192) this.field5202.field481.field891).field3005;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()Lkn;", line = 206)
    public final class210 method233() {
        return (class210) this.field5201.method278(1);
    }
}
