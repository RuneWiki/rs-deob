import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class268 extends class252 {

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Lc;")
    private class331 field4295 = new class331();

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Lc;")
    private class331 field4296 = new class331();

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    private int field4298 = -1;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    private int field4297 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "()Lmj;", line = 3)
    public final class252 method54() {
        return (class252) this.field4295.method2297(14204);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "()V", line = 7)
    private final void method1838() {
        if (this.field4297 <= 0) {
            return;
        }
        for (class186 var1 = (class186) this.field4296.method2297(14204); var1 != null; var1 = (class186) this.field4296.method2291(-112)) {
            var1.field3146 -= this.field4297;
        }
        this.field4298 -= this.field4297;
        this.field4297 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lmj;)V", line = 25)
    public final synchronized void method1839(class252 arg0) {
        arg0.method2195(-1);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lmj;)V", line = 38)
    public final synchronized void method1840(class252 arg0) {
        this.field4295.method2295(arg0, (byte) -107);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V", line = 43)
    private final void method1841(int arg0) {
        for (class252 var2 = (class252) this.field4295.method2297(14204); var2 != null; var2 = (class252) this.field4295.method2291(107)) {
            var2.method53(arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 62)
    public final synchronized void method53(int arg0) {
        do {
            if (this.field4298 < 0) {
                this.method1841(arg0);
                return;
            }
            if (this.field4297 + arg0 < this.field4298) {
                this.field4297 += arg0;
                this.method1841(arg0);
                return;
            }
            int var2 = this.field4298 - this.field4297;
            this.method1841(var2);
            arg0 -= var2;
            this.field4297 += var2;
            this.method1838();
            class186 var3 = (class186) this.field4296.method2297(14204);
            synchronized (var3) {
                int var5 = var3.method1428(this);
                if (var5 < 0) {
                    var3.field3146 = 0;
                    this.method1842(var3);
                } else {
                    var3.field3146 = var5;
                    this.method1844(var3.field5068, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([III)V", line = 110)
    public final synchronized void method49(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4298 < 0) {
                this.method1843(arg0, arg1, arg2);
                return;
            }
            if (this.field4297 + arg2 < this.field4298) {
                this.field4297 += arg2;
                this.method1843(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4298 - this.field4297;
            this.method1843(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4297 += var4;
            this.method1838();
            class186 var5 = (class186) this.field4296.method2297(14204);
            synchronized (var5) {
                int var7 = var5.method1428(this);
                if (var7 < 0) {
                    var5.field3146 = 0;
                    this.method1842(var5);
                } else {
                    var5.field3146 = var7;
                    this.method1844(var5.field5068, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ldh;)V", line = 154)
    private final void method1842(class186 arg0) {
        arg0.method2195(-1);
        arg0.method1429();
        class320 var2 = this.field4296.field5269.field5068;
        if (this.field4296.field5269 == var2) {
            this.field4298 = -1;
        } else {
            this.field4298 = ((class186) var2).field3146;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "()Lmj;", line = 168)
    public final class252 method52() {
        return (class252) this.field4295.method2291(-115);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "([III)V", line = 173)
    private final void method1843(int[] arg0, int arg1, int arg2) {
        for (class252 var4 = (class252) this.field4295.method2297(14204); var4 != null; var4 = (class252) this.field4295.method2291(-105)) {
            var4.method1758(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()I", line = 182)
    public final int method50() {
        return 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lte;Ldh;)V", line = 187)
    private final void method1844(class320 arg0, class186 arg1) {
        while (this.field4296.field5269 != arg0 && ((class186) arg0).field3146 <= arg1.field3146) {
            arg0 = arg0.field5068;
        }
        class209.method1556(arg0, -113, arg1);
        this.field4298 = ((class186) this.field4296.field5269.field5068).field3146;
    }
}
