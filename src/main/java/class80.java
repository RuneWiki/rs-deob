import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class80 extends class148 {

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lmi;")
    private class128 field1509 = new class128();

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lmi;")
    private class128 field1510 = new class128();

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    private int field1511 = 0;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    private int field1512 = -1;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
    public final synchronized void method218(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1512 < 0) {
                this.method596(arg0, arg1, arg2);
                return;
            }
            if (this.field1511 + arg2 < this.field1512) {
                this.field1511 += arg2;
                this.method596(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1512 - this.field1511;
            this.method596(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1511 += var4;
            this.method600();
            class173 var5 = (class173) this.field1510.method1017(98);
            synchronized (var5) {
                int var7 = var5.method1286(this);
                if (var7 < 0) {
                    var5.field3161 = 0;
                    this.method599(var5);
                } else {
                    var5.field3161 = var7;
                    this.method597(var5.field2645, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()I")
    public final int method208() {
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lge;)V")
    public final synchronized void method594(class148 arg0) {
        arg0.method1063(95);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lge;)V")
    public final synchronized void method595(class148 arg0) {
        this.field1509.method1014(false, arg0);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "([III)V")
    private final void method596(int[] arg0, int arg1, int arg2) {
        for (class148 var4 = (class148) this.field1509.method1017(92); var4 != null; var4 = (class148) this.field1509.method1016((byte) -31)) {
            var4.method1108(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public final synchronized void method202(int arg0) {
        do {
            if (this.field1512 < 0) {
                this.method598(arg0);
                return;
            }
            if (this.field1511 + arg0 < this.field1512) {
                this.field1511 += arg0;
                this.method598(arg0);
                return;
            }
            int var2 = this.field1512 - this.field1511;
            this.method598(var2);
            arg0 -= var2;
            this.field1511 += var2;
            this.method600();
            class173 var3 = (class173) this.field1510.method1017(118);
            synchronized (var3) {
                int var5 = var3.method1286(this);
                if (var5 < 0) {
                    var3.field3161 = 0;
                    this.method599(var3);
                } else {
                    var3.field3161 = var5;
                    this.method597(var3.field2645, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lsa;Lda;)V")
    private final void method597(class137 arg0, class173 arg1) {
        while (this.field1510.field2483 != arg0 && ((class173) arg0).field3161 <= arg1.field3161) {
            arg0 = arg0.field2645;
        }
        class228.method1592(arg0, arg1, (byte) 125);
        this.field1512 = ((class173) this.field1510.field2483.field2645).field3161;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    private final void method598(int arg0) {
        for (class148 var2 = (class148) this.field1509.method1017(119); var2 != null; var2 = (class148) this.field1509.method1016((byte) -31)) {
            var2.method202(arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()Lge;")
    public final class148 method212() {
        return (class148) this.field1509.method1017(65);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lda;)V")
    private final void method599(class173 arg0) {
        arg0.method1063(122);
        arg0.method1285();
        class137 var2 = this.field1510.field2483.field2645;
        if (this.field1510.field2483 == var2) {
            this.field1512 = -1;
        } else {
            this.field1512 = ((class173) var2).field3161;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "()V")
    private final void method600() {
        if (this.field1511 <= 0) {
            return;
        }
        for (class173 var1 = (class173) this.field1510.method1017(64); var1 != null; var1 = (class173) this.field1510.method1016((byte) -31)) {
            var1.field3161 -= this.field1511;
        }
        this.field1512 -= this.field1511;
        this.field1511 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lge;")
    public final class148 method229() {
        return (class148) this.field1509.method1016((byte) -31);
    }
}
