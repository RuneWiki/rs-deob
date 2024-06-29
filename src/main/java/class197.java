import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class197 extends class178 {

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Lvb;")
    private class192 field3717 = new class192();

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Lvb;")
    private class192 field3718 = new class192();

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    private int field3719 = 0;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    private int field3720 = -1;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbe;)V")
    private final void method1250(class16 arg0) {
        arg0.method848(false);
        arg0.method96();
        class119 var2 = this.field3718.field3638.field2287;
        if (this.field3718.field3638 == var2) {
            this.field3720 = -1;
        } else {
            this.field3720 = ((class16) var2).field254;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()I")
    public final int method334() {
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ltf;)V")
    public final synchronized void method1251(class178 arg0) {
        this.field3717.method1231((byte) -40, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "([III)V")
    public final synchronized void method320(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3720 < 0) {
                this.method1254(arg0, arg1, arg2);
                return;
            }
            if (this.field3719 + arg2 < this.field3720) {
                this.field3719 += arg2;
                this.method1254(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3720 - this.field3719;
            this.method1254(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3719 += var4;
            this.method1256();
            class16 var5 = (class16) this.field3718.method1223(true);
            synchronized (var5) {
                int var7 = var5.method95(this);
                if (var7 < 0) {
                    var5.field254 = 0;
                    this.method1250(var5);
                } else {
                    var5.field254 = var7;
                    this.method1255(var5.field2287, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    private final void method1252(int arg0) {
        for (class178 var2 = (class178) this.field3717.method1223(true); var2 != null; var2 = (class178) this.field3717.method1226((byte) -57)) {
            var2.method333(arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Ltf;)V")
    public final synchronized void method1253(class178 arg0) {
        arg0.method848(false);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()Ltf;")
    public final class178 method345() {
        return (class178) this.field3717.method1226((byte) -57);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "([III)V")
    private final void method1254(int[] arg0, int arg1, int arg2) {
        for (class178 var4 = (class178) this.field3717.method1223(true); var4 != null; var4 = (class178) this.field3717.method1226((byte) -57)) {
            var4.method1152(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lna;Lbe;)V")
    private final void method1255(class119 arg0, class16 arg1) {
        while (this.field3718.field3638 != arg0 && ((class16) arg0).field254 <= arg1.field254) {
            arg0 = arg0.field2287;
        }
        this.field3718.method1222((byte) 96, arg0, arg1);
        this.field3720 = ((class16) this.field3718.field3638.field2287).field254;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()Ltf;")
    public final class178 method310() {
        return (class178) this.field3717.method1223(true);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public final synchronized void method333(int arg0) {
        do {
            if (this.field3720 < 0) {
                this.method1252(arg0);
                return;
            }
            if (this.field3719 + arg0 < this.field3720) {
                this.field3719 += arg0;
                this.method1252(arg0);
                return;
            }
            int var2 = this.field3720 - this.field3719;
            this.method1252(var2);
            arg0 -= var2;
            this.field3719 += var2;
            this.method1256();
            class16 var3 = (class16) this.field3718.method1223(true);
            synchronized (var3) {
                int var5 = var3.method95(this);
                if (var5 < 0) {
                    var3.field254 = 0;
                    this.method1250(var3);
                } else {
                    var3.field254 = var5;
                    this.method1255(var3.field2287, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()V")
    private final void method1256() {
        if (this.field3719 <= 0) {
            return;
        }
        for (class16 var1 = (class16) this.field3718.method1223(true); var1 != null; var1 = (class16) this.field3718.method1226((byte) -57)) {
            var1.field254 -= this.field3719;
        }
        this.field3720 -= this.field3719;
        this.field3719 = 0;
    }
}
