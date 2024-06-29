import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class199 extends class186 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lpi;")
    private class158 field3773 = new class158();

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lpi;")
    private class158 field3774 = new class158();

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    private int field3775 = 0;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    private int field3776 = -1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lsg;)V")
    public final synchronized void method1327(class186 arg0) {
        arg0.method1392(128);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public final synchronized void method468(int arg0) {
        do {
            if (this.field3776 < 0) {
                this.method1329(arg0);
                return;
            }
            if (this.field3775 + arg0 < this.field3776) {
                this.field3775 += arg0;
                this.method1329(arg0);
                return;
            }
            int var2 = this.field3776 - this.field3775;
            this.method1329(var2);
            arg0 -= var2;
            this.field3775 += var2;
            this.method1330();
            class71 var3 = (class71) this.field3774.method1103((byte) -9);
            synchronized (var3) {
                int var5 = var3.method497(this);
                if (var5 < 0) {
                    var3.field1436 = 0;
                    this.method1332(var3);
                } else {
                    var3.field1436 = var5;
                    this.method1328(var3.field4072, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public final int method485() {
        return 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lvd;Lha;)V")
    private final void method1328(class213 arg0, class71 arg1) {
        while (this.field3774.field3056 != arg0 && ((class71) arg0).field1436 <= arg1.field1436) {
            arg0 = arg0.field4072;
        }
        this.field3774.method1101(false, arg0, arg1);
        this.field3776 = ((class71) this.field3774.field3056.field4072).field1436;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    private final void method1329(int arg0) {
        for (class186 var2 = (class186) this.field3773.method1103((byte) -9); var2 != null; var2 = (class186) this.field3773.method1106((byte) -116)) {
            var2.method468(arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "()V")
    private final void method1330() {
        if (this.field3775 <= 0) {
            return;
        }
        for (class71 var1 = (class71) this.field3774.method1103((byte) -9); var1 != null; var1 = (class71) this.field3774.method1106((byte) 111)) {
            var1.field1436 -= this.field3775;
        }
        this.field3776 -= this.field3775;
        this.field3775 = 0;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()Lsg;")
    public final class186 method476() {
        return (class186) this.field3773.method1103((byte) -9);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()Lsg;")
    public final class186 method492() {
        return (class186) this.field3773.method1106((byte) -92);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "([III)V")
    private final void method1331(int[] arg0, int arg1, int arg2) {
        for (class186 var4 = (class186) this.field3773.method1103((byte) -9); var4 != null; var4 = (class186) this.field3773.method1106((byte) -50)) {
            var4.method1241(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V")
    public final synchronized void method474(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3776 < 0) {
                this.method1331(arg0, arg1, arg2);
                return;
            }
            if (this.field3775 + arg2 < this.field3776) {
                this.field3775 += arg2;
                this.method1331(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3776 - this.field3775;
            this.method1331(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3775 += var4;
            this.method1330();
            class71 var5 = (class71) this.field3774.method1103((byte) -9);
            synchronized (var5) {
                int var7 = var5.method497(this);
                if (var7 < 0) {
                    var5.field1436 = 0;
                    this.method1332(var5);
                } else {
                    var5.field1436 = var7;
                    this.method1328(var5.field4072, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lha;)V")
    private final void method1332(class71 arg0) {
        arg0.method1392(128);
        arg0.method496();
        class213 var2 = this.field3774.field3056.field4072;
        if (this.field3774.field3056 == var2) {
            this.field3776 = -1;
        } else {
            this.field3776 = ((class71) var2).field1436;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lsg;)V")
    public final synchronized void method1333(class186 arg0) {
        this.field3773.method1100(arg0, true);
    }
}
