import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class38 extends class148 {

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lel;")
    private class218 field593 = new class218();

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lel;")
    private class218 field594 = new class218();

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    private int field596 = -1;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    private int field595 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lql;Ldg;)V", line = 7)
    private final void method268(class297 arg0, class163 arg1) {
        while (this.field594.field3525 != arg0 && ((class163) arg0).field2475 <= arg1.field2475) {
            arg0 = arg0.field5005;
        }
        class73.method515((byte) -104, arg1, arg0);
        this.field596 = ((class163) this.field594.field3525.field5005).field2475;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "()V", line = 19)
    private final void method269() {
        if (this.field595 <= 0) {
            return;
        }
        for (class163 var1 = (class163) this.field594.method1475(14); var1 != null; var1 = (class163) this.field594.method1486(38)) {
            var1.field2475 -= this.field595;
        }
        this.field596 -= this.field595;
        this.field595 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()Loj;", line = 36)
    public final class148 method270() {
        return (class148) this.field593.method1486(38);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "([III)V", line = 46)
    public final synchronized void method271(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field596 < 0) {
                this.method278(arg0, arg1, arg2);
                return;
            }
            if (this.field595 + arg2 < this.field596) {
                this.field595 += arg2;
                this.method278(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field596 - this.field595;
            this.method278(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field595 += var4;
            this.method269();
            class163 var5 = (class163) this.field594.method1475(14);
            synchronized (var5) {
                int var7 = var5.method1081(this);
                if (var7 < 0) {
                    var5.field2475 = 0;
                    this.method276(var5);
                } else {
                    var5.field2475 = var7;
                    this.method268(var5.field5005, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I", line = 90)
    public final int method272() {
        return 0;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 96)
    private final void method273(int arg0) {
        for (class148 var2 = (class148) this.field593.method1475(14); var2 != null; var2 = (class148) this.field593.method1486(38)) {
            var2.method274(arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 108)
    public final synchronized void method274(int arg0) {
        do {
            if (this.field596 < 0) {
                this.method273(arg0);
                return;
            }
            if (this.field595 + arg0 < this.field596) {
                this.field595 += arg0;
                this.method273(arg0);
                return;
            }
            int var2 = this.field596 - this.field595;
            this.method273(var2);
            arg0 -= var2;
            this.field595 += var2;
            this.method269();
            class163 var3 = (class163) this.field594.method1475(14);
            synchronized (var3) {
                int var5 = var3.method1081(this);
                if (var5 < 0) {
                    var3.field2475 = 0;
                    this.method276(var3);
                } else {
                    var3.field2475 = var5;
                    this.method268(var3.field5005, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Loj;)V", line = 154)
    public final synchronized void method275(class148 arg0) {
        this.field593.method1477(false, arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ldg;)V", line = 161)
    private final void method276(class163 arg0) {
        arg0.method1997(-27381);
        arg0.method1082();
        class297 var2 = this.field594.field3525.field5005;
        if (this.field594.field3525 == var2) {
            this.field596 = -1;
        } else {
            this.field596 = ((class163) var2).field2475;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Loj;)V", line = 179)
    public final synchronized void method277(class148 arg0) {
        arg0.method1997(-27381);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "([III)V", line = 184)
    private final void method278(int[] arg0, int arg1, int arg2) {
        for (class148 var4 = (class148) this.field593.method1475(14); var4 != null; var4 = (class148) this.field593.method1486(38)) {
            var4.method936(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()Loj;", line = 193)
    public final class148 method279() {
        return (class148) this.field593.method1475(14);
    }
}
