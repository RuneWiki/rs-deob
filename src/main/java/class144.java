import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class144 extends class150 {

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lda;")
    private class23 field3504 = new class23();

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lda;")
    private class23 field3505 = new class23();

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field3506 = 0;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    private int field3507 = -1;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lwc;")
    public final class150 method732() {
        return (class150) this.field3504.method182((byte) 50);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lfe;Ldb;)V")
    private final void method1177(class41 arg0, class24 arg1) {
        while (this.field3505.field555 != arg0 && ((class24) arg0).field584 <= arg1.field584) {
            arg0 = arg0.field952;
        }
        this.field3505.method194(false, arg0, arg1);
        this.field3507 = ((class24) this.field3505.field555.field952).field584;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ldb;)V")
    private final void method1178(class24 arg0) {
        arg0.method302(4071);
        arg0.method198();
        class41 var2 = this.field3505.field555.field952;
        if (this.field3505.field555 == var2) {
            this.field3507 = -1;
        } else {
            this.field3507 = ((class24) var2).field584;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwc;)V")
    public final synchronized void method1179(class150 arg0) {
        this.field3504.method195(arg0, 26364);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    private final void method1180(int arg0) {
        for (class150 var2 = (class150) this.field3504.method182((byte) 50); var2 != null; var2 = (class150) this.field3504.method181((byte) 13)) {
            var2.method748(arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V")
    public final synchronized void method709(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3507 < 0) {
                this.method1181(arg0, arg1, arg2);
                return;
            }
            if (this.field3506 + arg2 < this.field3507) {
                this.field3506 += arg2;
                this.method1181(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3507 - this.field3506;
            this.method1181(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3506 += var4;
            this.method1183();
            class24 var5 = (class24) this.field3505.method182((byte) 50);
            synchronized (var5) {
                int var7 = var5.method199(this);
                if (var7 < 0) {
                    var5.field584 = 0;
                    this.method1178(var5);
                } else {
                    var5.field584 = var7;
                    this.method1177(var5.field952, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "([III)V")
    private final void method1181(int[] arg0, int arg1, int arg2) {
        for (class150 var4 = (class150) this.field3504.method182((byte) 50); var4 != null; var4 = (class150) this.field3504.method181((byte) 87)) {
            var4.method1217(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lwc;)V")
    public final synchronized void method1182(class150 arg0) {
        arg0.method302(4071);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()Lwc;")
    public final class150 method720() {
        return (class150) this.field3504.method181((byte) 98);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
    private final void method1183() {
        if (this.field3506 <= 0) {
            return;
        }
        for (class24 var1 = (class24) this.field3505.method182((byte) 50); var1 != null; var1 = (class24) this.field3505.method181((byte) 40)) {
            var1.field584 -= this.field3506;
        }
        this.field3507 -= this.field3506;
        this.field3506 = 0;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
    public final int method721() {
        return 0;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public final synchronized void method748(int arg0) {
        do {
            if (this.field3507 < 0) {
                this.method1180(arg0);
                return;
            }
            if (this.field3506 + arg0 < this.field3507) {
                this.field3506 += arg0;
                this.method1180(arg0);
                return;
            }
            int var2 = this.field3507 - this.field3506;
            this.method1180(var2);
            arg0 -= var2;
            this.field3506 += var2;
            this.method1183();
            class24 var3 = (class24) this.field3505.method182((byte) 50);
            synchronized (var3) {
                int var5 = var3.method199(this);
                if (var5 < 0) {
                    var3.field584 = 0;
                    this.method1178(var3);
                } else {
                    var3.field584 = var5;
                    this.method1177(var3.field952, var3);
                }
            }
        } while (arg0 != 0);
    }
}
