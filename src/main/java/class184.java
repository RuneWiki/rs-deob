import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class184 extends class38 {

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Lhi;")
    private class282 field2966 = new class282();

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Lhi;")
    private class282 field2967 = new class282();

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    private int field2968 = 0;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    private int field2969 = -1;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "([III)V", line = 8)
    public final synchronized void method319(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2969 < 0) {
                this.method1330(arg0, arg1, arg2);
                return;
            }
            if (this.field2968 + arg2 < this.field2969) {
                this.field2968 += arg2;
                this.method1330(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2969 - this.field2968;
            this.method1330(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2968 += var4;
            this.method1332();
            class190 var5 = (class190) this.field2967.method1971(100);
            synchronized (var5) {
                int var7 = var5.method1369(this);
                if (var7 < 0) {
                    var5.field3082 = 0;
                    this.method1335(var5);
                } else {
                    var5.field3082 = var7;
                    this.method1333(var5.field5143, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "([III)V", line = 56)
    private final void method1330(int[] arg0, int arg1, int arg2) {
        for (class38 var4 = (class38) this.field2966.method1971(100); var4 != null; var4 = (class38) this.field2966.method1967(100)) {
            var4.method315(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lcg;)V", line = 70)
    public final synchronized void method1331(class38 arg0) {
        this.field2966.method1973(arg0, (byte) -36);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()Lcg;", line = 76)
    public final class38 method320() {
        return (class38) this.field2966.method1967(100);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()I", line = 82)
    public final int method321() {
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()V", line = 88)
    private final void method1332() {
        if (this.field2968 <= 0) {
            return;
        }
        for (class190 var1 = (class190) this.field2967.method1971(100); var1 != null; var1 = (class190) this.field2967.method1967(100)) {
            var1.field3082 -= this.field2968;
        }
        this.field2969 -= this.field2968;
        this.field2968 = 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lcj;Lfa;)V", line = 105)
    private final void method1333(class307 arg0, class190 arg1) {
        while (this.field2967.field4750 != arg0 && ((class190) arg0).field3082 <= arg1.field3082) {
            arg0 = arg0.field5143;
        }
        class31.method285(arg1, arg0, (byte) -39);
        this.field2969 = ((class190) this.field2967.field4750.field5143).field3082;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V", line = 114)
    private final void method1334(int arg0) {
        for (class38 var2 = (class38) this.field2966.method1971(100); var2 != null; var2 = (class38) this.field2966.method1967(100)) {
            var2.method316(arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lfa;)V", line = 130)
    private final void method1335(class190 arg0) {
        arg0.method2095(0);
        arg0.method1370();
        class307 var2 = this.field2967.field4750.field5143;
        if (this.field2967.field4750 == var2) {
            this.field2969 = -1;
        } else {
            this.field2969 = ((class190) var2).field3082;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Lcg;)V", line = 143)
    public final synchronized void method1336(class38 arg0) {
        arg0.method2095(0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()Lcg;", line = 146)
    public final class38 method317() {
        return (class38) this.field2966.method1971(100);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V", line = 165)
    public final synchronized void method316(int arg0) {
        do {
            if (this.field2969 < 0) {
                this.method1334(arg0);
                return;
            }
            if (this.field2968 + arg0 < this.field2969) {
                this.field2968 += arg0;
                this.method1334(arg0);
                return;
            }
            int var2 = this.field2969 - this.field2968;
            this.method1334(var2);
            arg0 -= var2;
            this.field2968 += var2;
            this.method1332();
            class190 var3 = (class190) this.field2967.method1971(100);
            synchronized (var3) {
                int var5 = var3.method1369(this);
                if (var5 < 0) {
                    var3.field3082 = 0;
                    this.method1335(var3);
                } else {
                    var3.field3082 = var5;
                    this.method1333(var3.field5143, var3);
                }
            }
        } while (arg0 != 0);
    }
}
