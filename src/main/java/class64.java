import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class64 extends class13 {

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lpg;")
    private class141 field1543 = new class141();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lpg;")
    private class141 field1544 = new class141();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    private int field1545 = -1;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private int field1546 = 0;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lbc;")
    public final class13 method77() {
        return (class13) this.field1543.method1020(0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbc;)V")
    public final synchronized void method450(class13 arg0) {
        this.field1543.method1015(9282, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
    public final int method71() {
        return 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltc;)V")
    private final void method451(class173 arg0) {
        arg0.method805(false);
        arg0.method1213();
        class97 var2 = this.field1544.field2946.field2168;
        if (this.field1544.field2946 == var2) {
            this.field1545 = -1;
        } else {
            this.field1545 = ((class173) var2).field3532;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "([III)V")
    private final void method452(int[] arg0, int arg1, int arg2) {
        for (class13 var4 = (class13) this.field1543.method1020(0); var4 != null; var4 = (class13) this.field1543.method1027((byte) 54)) {
            var4.method74(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public final synchronized void method75(int arg0) {
        do {
            if (this.field1545 < 0) {
                this.method456(arg0);
                return;
            }
            if (this.field1546 + arg0 < this.field1545) {
                this.field1546 += arg0;
                this.method456(arg0);
                return;
            }
            int var2 = this.field1545 - this.field1546;
            this.method456(var2);
            arg0 -= var2;
            this.field1546 += var2;
            this.method455();
            class173 var3 = (class173) this.field1544.method1020(0);
            synchronized (var3) {
                int var5 = var3.method1214(this);
                if (var5 < 0) {
                    var3.field3532 = 0;
                    this.method451(var3);
                } else {
                    var3.field3532 = var5;
                    this.method454(var3.field2168, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lbc;)V")
    public final synchronized void method453(class13 arg0) {
        arg0.method805(false);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lbc;")
    public final class13 method73() {
        return (class13) this.field1543.method1027((byte) 76);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkh;Ltc;)V")
    private final void method454(class97 arg0, class173 arg1) {
        while (this.field1544.field2946 != arg0 && ((class173) arg0).field3532 <= arg1.field3532) {
            arg0 = arg0.field2168;
        }
        this.field1544.method1017(arg1, arg0, (byte) 119);
        this.field1545 = ((class173) this.field1544.field2946.field2168).field3532;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
    public final synchronized void method72(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1545 < 0) {
                this.method452(arg0, arg1, arg2);
                return;
            }
            if (this.field1546 + arg2 < this.field1545) {
                this.field1546 += arg2;
                this.method452(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1545 - this.field1546;
            this.method452(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1546 += var4;
            this.method455();
            class173 var5 = (class173) this.field1544.method1020(0);
            synchronized (var5) {
                int var7 = var5.method1214(this);
                if (var7 < 0) {
                    var5.field3532 = 0;
                    this.method451(var5);
                } else {
                    var5.field3532 = var7;
                    this.method454(var5.field2168, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    private final void method455() {
        if (this.field1546 <= 0) {
            return;
        }
        for (class173 var1 = (class173) this.field1544.method1020(0); var1 != null; var1 = (class173) this.field1544.method1027((byte) 89)) {
            var1.field3532 -= this.field1546;
        }
        this.field1545 -= this.field1546;
        this.field1546 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    private final void method456(int arg0) {
        for (class13 var2 = (class13) this.field1543.method1020(0); var2 != null; var2 = (class13) this.field1543.method1027((byte) 67)) {
            var2.method75(arg0);
        }
    }
}
