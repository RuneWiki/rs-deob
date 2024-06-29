import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class117 extends class100 {

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lcf;")
    private class28 field2225 = new class28();

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lcf;")
    private class28 field2226 = new class28();

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    private int field2227 = -1;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    private int field2228 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "([III)V")
    private final void method749(int[] arg0, int arg1, int arg2) {
        for (class100 var4 = (class100) this.field2225.method236(0); var4 != null; var4 = (class100) this.field2225.method237(true)) {
            var4.method621(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V")
    public final synchronized void method567(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2227 < 0) {
                this.method749(arg0, arg1, arg2);
                return;
            }
            if (this.field2228 + arg2 < this.field2227) {
                this.field2228 += arg2;
                this.method749(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2227 - this.field2228;
            this.method749(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2228 += var4;
            this.method752();
            class85 var5 = (class85) this.field2226.method236(0);
            synchronized (var5) {
                int var7 = var5.method552(this);
                if (var7 < 0) {
                    var5.field1618 = 0;
                    this.method750(var5);
                } else {
                    var5.field1618 = var7;
                    this.method755(var5.field2554, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()Ljc;")
    public final class100 method572() {
        return (class100) this.field2225.method236(0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lhi;)V")
    private final void method750(class85 arg0) {
        arg0.method826(-22101);
        arg0.method551();
        class132 var2 = this.field2226.field626.field2554;
        if (this.field2226.field626 == var2) {
            this.field2227 = -1;
        } else {
            this.field2227 = ((class85) var2).field1618;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljc;)V")
    public final synchronized void method751(class100 arg0) {
        this.field2225.method240(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public final synchronized void method570(int arg0) {
        do {
            if (this.field2227 < 0) {
                this.method753(arg0);
                return;
            }
            if (this.field2228 + arg0 < this.field2227) {
                this.field2228 += arg0;
                this.method753(arg0);
                return;
            }
            int var2 = this.field2227 - this.field2228;
            this.method753(var2);
            arg0 -= var2;
            this.field2228 += var2;
            this.method752();
            class85 var3 = (class85) this.field2226.method236(0);
            synchronized (var3) {
                int var5 = var3.method552(this);
                if (var5 < 0) {
                    var3.field1618 = 0;
                    this.method750(var3);
                } else {
                    var3.field1618 = var5;
                    this.method755(var3.field2554, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V")
    private final void method752() {
        if (this.field2228 <= 0) {
            return;
        }
        for (class85 var1 = (class85) this.field2226.method236(0); var1 != null; var1 = (class85) this.field2226.method237(true)) {
            var1.field1618 -= this.field2228;
        }
        this.field2227 -= this.field2228;
        this.field2228 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()Ljc;")
    public final class100 method568() {
        return (class100) this.field2225.method237(true);
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    private final void method753(int arg0) {
        for (class100 var2 = (class100) this.field2225.method236(0); var2 != null; var2 = (class100) this.field2225.method237(true)) {
            var2.method570(arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
    public final int method564() {
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Ljc;)V")
    public final synchronized void method754(class100 arg0) {
        arg0.method826(-22101);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lmd;Lhi;)V")
    private final void method755(class132 arg0, class85 arg1) {
        while (this.field2226.field626 != arg0 && ((class85) arg0).field1618 <= arg1.field1618) {
            arg0 = arg0.field2554;
        }
        this.field2226.method247(arg0, -18395, arg1);
        this.field2227 = ((class85) this.field2226.field626.field2554).field1618;
    }
}
