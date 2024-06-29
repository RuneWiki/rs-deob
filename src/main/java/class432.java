import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class432 extends class86 {

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Lub;")
    private class18 field6126 = new class18();

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Lub;")
    private class18 field6127 = new class18();

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    private int field6128 = 0;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    private int field6129 = -1;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([III)V")
    public final synchronized void method693(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field6129 < 0) {
                this.method2527(arg0, arg1, arg2);
                return;
            }
            if (this.field6128 + arg2 < this.field6129) {
                this.field6128 += arg2;
                this.method2527(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field6129 - this.field6128;
            this.method2527(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field6128 += var4;
            this.method2534();
            class497 var5 = (class497) this.field6127.method153(0);
            synchronized (var5) {
                int var7 = var5.method3001(this);
                if (var7 < 0) {
                    var5.field7213 = 0;
                    this.method2529(var5);
                } else {
                    var5.field7213 = var7;
                    this.method2528(var5.field5042, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "([III)V")
    private final void method2527(int[] arg0, int arg1, int arg2) {
        for (class86 var4 = (class86) this.field6126.method153(0); var4 != null; var4 = (class86) this.field6126.method161(-32)) {
            var4.method694(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lnd;Lno;)V")
    private final void method2528(class383 arg0, class497 arg1) {
        while (this.field6127.field268 != arg0 && ((class497) arg0).field7213 <= arg1.field7213) {
            arg0 = arg0.field5042;
        }
        class102.method766(127, arg0, arg1);
        this.field6129 = ((class497) this.field6127.field268.field5042).field7213;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lno;)V")
    private final void method2529(class497 arg0) {
        arg0.method2165(16225);
        arg0.method3000();
        class383 var2 = this.field6127.field268.field5042;
        if (this.field6127.field268 == var2) {
            this.field6129 = -1;
        } else {
            this.field6129 = ((class497) var2).field7213;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lhu;)V")
    public final synchronized void method2530(class86 arg0) {
        this.field6126.method164(arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "()I")
    public final synchronized int method2531() {
        return this.field6126.method156(-128);
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "()I")
    public final int method691() {
        return 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public final synchronized void method688(int arg0) {
        do {
            if (this.field6129 < 0) {
                this.method2533(arg0);
                return;
            }
            if (this.field6128 + arg0 < this.field6129) {
                this.field6128 += arg0;
                this.method2533(arg0);
                return;
            }
            int var2 = this.field6129 - this.field6128;
            this.method2533(var2);
            arg0 -= var2;
            this.field6128 += var2;
            this.method2534();
            class497 var3 = (class497) this.field6127.method153(0);
            synchronized (var3) {
                int var5 = var3.method3001(this);
                if (var5 < 0) {
                    var3.field7213 = 0;
                    this.method2529(var3);
                } else {
                    var3.field7213 = var5;
                    this.method2528(var3.field5042, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "()Lhu;")
    public final class86 method692() {
        return (class86) this.field6126.method161(-121);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lhu;)V")
    public final synchronized void method2532(class86 arg0) {
        arg0.method2165(16225);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
    private final void method2533(int arg0) {
        for (class86 var2 = (class86) this.field6126.method153(0); var2 != null; var2 = (class86) this.field6126.method161(-18)) {
            var2.method688(arg0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "()V")
    private final void method2534() {
        if (this.field6128 <= 0) {
            return;
        }
        for (class497 var1 = (class497) this.field6127.method153(0); var1 != null; var1 = (class497) this.field6127.method161(-20)) {
            var1.field7213 -= this.field6128;
        }
        this.field6129 -= this.field6128;
        this.field6128 = 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()Lhu;")
    public final class86 method689() {
        return (class86) this.field6126.method153(0);
    }
}
