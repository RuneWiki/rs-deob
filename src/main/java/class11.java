import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class11 extends class169 {

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lfk;")
    private class317 field145 = new class317();

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lfk;")
    private class317 field146 = new class317();

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field147 = -1;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    private int field148 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([III)V", line = 9)
    public final synchronized void method47(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field147 < 0) {
                this.method108(arg0, arg1, arg2);
                return;
            }
            if (this.field148 + arg2 < this.field147) {
                this.field148 += arg2;
                this.method108(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field147 - this.field148;
            this.method108(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field148 += var4;
            this.method110();
            class220 var5 = (class220) this.field146.method2244((byte) -126);
            synchronized (var5) {
                int var7 = var5.method1654(this);
                if (var7 < 0) {
                    var5.field3429 = 0;
                    this.method111(var5);
                } else {
                    var5.field3429 = var7;
                    this.method113(var5.field2737, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lph;)V", line = 55)
    public final synchronized void method107(class169 arg0) {
        this.field145.method2237(true, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "([III)V", line = 60)
    private final void method108(int[] arg0, int arg1, int arg2) {
        for (class169 var4 = (class169) this.field145.method2244((byte) -127); var4 != null; var4 = (class169) this.field145.method2241(-1)) {
            var4.method1339(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()I", line = 69)
    public final int method88() {
        return 0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lph;)V", line = 73)
    public final synchronized void method109(class169 arg0) {
        arg0.method1357(947647010);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lph;", line = 77)
    public final class169 method81() {
        return (class169) this.field145.method2241(-1);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()Lph;", line = 80)
    public final class169 method61() {
        return (class169) this.field145.method2244((byte) -125);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()V", line = 84)
    private final void method110() {
        if (this.field148 <= 0) {
            return;
        }
        for (class220 var1 = (class220) this.field146.method2244((byte) -126); var1 != null; var1 = (class220) this.field146.method2241(-1)) {
            var1.field3429 -= this.field148;
        }
        this.field147 -= this.field148;
        this.field148 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 108)
    public final synchronized void method82(int arg0) {
        do {
            if (this.field147 < 0) {
                this.method112(arg0);
                return;
            }
            if (this.field148 + arg0 < this.field147) {
                this.field148 += arg0;
                this.method112(arg0);
                return;
            }
            int var2 = this.field147 - this.field148;
            this.method112(var2);
            arg0 -= var2;
            this.field148 += var2;
            this.method110();
            class220 var3 = (class220) this.field146.method2244((byte) -126);
            synchronized (var3) {
                int var5 = var3.method1654(this);
                if (var5 < 0) {
                    var3.field3429 = 0;
                    this.method111(var3);
                } else {
                    var3.field3429 = var5;
                    this.method113(var3.field2737, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Luj;)V", line = 152)
    private final void method111(class220 arg0) {
        arg0.method1357(947647010);
        arg0.method1653();
        class172 var2 = this.field146.field4897.field2737;
        if (this.field146.field4897 == var2) {
            this.field147 = -1;
        } else {
            this.field147 = ((class220) var2).field3429;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 169)
    private final void method112(int arg0) {
        for (class169 var2 = (class169) this.field145.method2244((byte) -126); var2 != null; var2 = (class169) this.field145.method2241(-1)) {
            var2.method82(arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lwk;Luj;)V", line = 178)
    private final void method113(class172 arg0, class220 arg1) {
        while (this.field146.field4897 != arg0 && ((class220) arg0).field3429 <= arg1.field3429) {
            arg0 = arg0.field2737;
        }
        class102.method887(arg0, arg1, -79);
        this.field147 = ((class220) this.field146.field4897.field2737).field3429;
    }
}
