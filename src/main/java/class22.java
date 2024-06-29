import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class22 extends class203 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lh;")
    private class69 field410 = new class69();

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lh;")
    private class69 field411 = new class69();

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private int field412 = 0;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private int field413 = -1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final synchronized void method134(int arg0) {
        do {
            if (this.field413 < 0) {
                this.method135(arg0);
                return;
            }
            if (this.field412 + arg0 < this.field413) {
                this.field412 += arg0;
                this.method135(arg0);
                return;
            }
            int var2 = this.field413 - this.field412;
            this.method135(var2);
            arg0 -= var2;
            this.field412 += var2;
            this.method144();
            class77 var3 = (class77) this.field411.method404(false);
            synchronized (var3) {
                int var5 = var3.method444(this);
                if (var5 < 0) {
                    var3.field1405 = 0;
                    this.method143(var3);
                } else {
                    var3.field1405 = var5;
                    this.method139(var3.field2397, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    private final void method135(int arg0) {
        for (class203 var2 = (class203) this.field410.method404(false); var2 != null; var2 = (class203) this.field410.method414(-119)) {
            var2.method134(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public final int method136() {
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()Lvh;")
    public final class203 method137() {
        return (class203) this.field410.method404(false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([III)V")
    public final synchronized void method138(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field413 < 0) {
                this.method140(arg0, arg1, arg2);
                return;
            }
            if (this.field412 + arg2 < this.field413) {
                this.field412 += arg2;
                this.method140(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field413 - this.field412;
            this.method140(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field412 += var4;
            this.method144();
            class77 var5 = (class77) this.field411.method404(false);
            synchronized (var5) {
                int var7 = var5.method444(this);
                if (var7 < 0) {
                    var5.field1405 = 0;
                    this.method143(var5);
                } else {
                    var5.field1405 = var7;
                    this.method139(var5.field2397, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lo;Lhh;)V")
    private final void method139(class132 arg0, class77 arg1) {
        while (this.field411.field1318 != arg0 && ((class77) arg0).field1405 <= arg1.field1405) {
            arg0 = arg0.field2397;
        }
        this.field411.method406(arg1, arg0, 0);
        this.field413 = ((class77) this.field411.field1318.field2397).field1405;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "([III)V")
    private final void method140(int[] arg0, int arg1, int arg2) {
        for (class203 var4 = (class203) this.field410.method404(false); var4 != null; var4 = (class203) this.field410.method414(-127)) {
            var4.method1296(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lvh;)V")
    public final synchronized void method141(class203 arg0) {
        arg0.method797((byte) -110);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lvh;)V")
    public final synchronized void method142(class203 arg0) {
        this.field410.method403(true, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhh;)V")
    private final void method143(class77 arg0) {
        arg0.method797((byte) -123);
        arg0.method445();
        class132 var2 = this.field411.field1318.field2397;
        if (this.field411.field1318 == var2) {
            this.field413 = -1;
        } else {
            this.field413 = ((class77) var2).field1405;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
    private final void method144() {
        if (this.field412 <= 0) {
            return;
        }
        for (class77 var1 = (class77) this.field411.method404(false); var1 != null; var1 = (class77) this.field411.method414(-122)) {
            var1.field1405 -= this.field412;
        }
        this.field413 -= this.field412;
        this.field412 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lvh;")
    public final class203 method145() {
        return (class203) this.field410.method414(-126);
    }
}
