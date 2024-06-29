import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class207 extends class409 {

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lfi;")
    private class166 field2884 = new class166();

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Lfi;")
    private class166 field2885 = new class166();

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    private int field2886 = -1;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    private int field2887 = 0;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lmi;)V")
    public final synchronized void method1428(class409 arg0) {
        this.field2884.method1244(true, arg0);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
    public final synchronized void method683(int arg0) {
        do {
            if (this.field2886 < 0) {
                this.method1433(arg0);
                return;
            }
            if (this.field2887 + arg0 < this.field2886) {
                this.field2887 += arg0;
                this.method1433(arg0);
                return;
            }
            int var2 = this.field2886 - this.field2887;
            this.method1433(var2);
            arg0 -= var2;
            this.field2887 += var2;
            this.method1430();
            class168 var3 = (class168) this.field2885.method1240((byte) -67);
            synchronized (var3) {
                int var5 = var3.method1264(this);
                if (var5 < 0) {
                    var3.field2489 = 0;
                    this.method1434(var3);
                } else {
                    var3.field2489 = var5;
                    this.method1432(var3.field5346, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "([III)V")
    private final void method1429(int[] arg0, int arg1, int arg2) {
        for (class409 var4 = (class409) this.field2884.method1240((byte) -113); var4 != null; var4 = (class409) this.field2884.method1245(1)) {
            var4.method2531(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()Lmi;")
    public final class409 method690() {
        return (class409) this.field2884.method1245(1);
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "()V")
    private final void method1430() {
        if (this.field2887 <= 0) {
            return;
        }
        for (class168 var1 = (class168) this.field2885.method1240((byte) -69); var1 != null; var1 = (class168) this.field2885.method1245(1)) {
            var1.field2489 -= this.field2887;
        }
        this.field2886 -= this.field2887;
        this.field2887 = 0;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "()I")
    public final int method687() {
        return 0;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "([III)V")
    public final synchronized void method713(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2886 < 0) {
                this.method1429(arg0, arg1, arg2);
                return;
            }
            if (this.field2887 + arg2 < this.field2886) {
                this.field2887 += arg2;
                this.method1429(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2886 - this.field2887;
            this.method1429(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2887 += var4;
            this.method1430();
            class168 var5 = (class168) this.field2885.method1240((byte) -122);
            synchronized (var5) {
                int var7 = var5.method1264(this);
                if (var7 < 0) {
                    var5.field2489 = 0;
                    this.method1434(var5);
                } else {
                    var5.field2489 = var7;
                    this.method1432(var5.field5346, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "()Lmi;")
    public final class409 method708() {
        return (class409) this.field2884.method1240((byte) -120);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Lmi;)V")
    public final synchronized void method1431(class409 arg0) {
        arg0.method2367(5);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ls;Lrm;)V")
    private final void method1432(class381 arg0, class168 arg1) {
        while (this.field2885.field2454 != arg0 && ((class168) arg0).field2489 <= arg1.field2489) {
            arg0 = arg0.field5346;
        }
        class125.method974(-120, arg1, arg0);
        this.field2886 = ((class168) this.field2885.field2454.field5346).field2489;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    private final void method1433(int arg0) {
        for (class409 var2 = (class409) this.field2884.method1240((byte) -107); var2 != null; var2 = (class409) this.field2884.method1245(1)) {
            var2.method683(arg0);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lrm;)V")
    private final void method1434(class168 arg0) {
        arg0.method2367(5);
        arg0.method1263();
        class381 var2 = this.field2885.field2454.field5346;
        if (this.field2885.field2454 == var2) {
            this.field2886 = -1;
        } else {
            this.field2886 = ((class168) var2).field2489;
        }
    }
}
