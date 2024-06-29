import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 extends class50 {

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lag;")
    private class97 field597 = new class97();

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lag;")
    private class97 field598 = new class97();

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    private int field599 = -1;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "([III)V")
    private final void method274(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field597.method656(98); var4 != null; var4 = (class50) this.field597.method650(126)) {
            var4.method340(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lfb;)V")
    public final synchronized void method275(class50 arg0) {
        this.field597.method657(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()Lfb;")
    public final class50 method276() {
        return (class50) this.field597.method656(99);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field599 < 0) {
                this.method274(arg0, arg1, arg2);
                return;
            }
            if (this.field600 + arg2 < this.field599) {
                this.field600 += arg2;
                this.method274(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field599 - this.field600;
            this.method274(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field600 += var4;
            this.method280();
            class157 var5 = (class157) this.field598.method656(104);
            synchronized (var5) {
                int var7 = var5.method1055(this);
                if (var7 < 0) {
                    var5.field2283 = 0;
                    this.method282(var5);
                } else {
                    var5.field2283 = var7;
                    this.method285(var5.field3859, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
    public final int method278() {
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lfb;)V")
    public final synchronized void method279(class50 arg0) {
        arg0.method1706(-78);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()V")
    private final void method280() {
        if (this.field600 <= 0) {
            return;
        }
        for (class157 var1 = (class157) this.field598.method656(111); var1 != null; var1 = (class157) this.field598.method650(125)) {
            var1.field2283 -= this.field600;
        }
        this.field599 -= this.field600;
        this.field600 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public final synchronized void method281(int arg0) {
        do {
            if (this.field599 < 0) {
                this.method284(arg0);
                return;
            }
            if (this.field600 + arg0 < this.field599) {
                this.field600 += arg0;
                this.method284(arg0);
                return;
            }
            int var2 = this.field599 - this.field600;
            this.method284(var2);
            arg0 -= var2;
            this.field600 += var2;
            this.method280();
            class157 var3 = (class157) this.field598.method656(95);
            synchronized (var3) {
                int var5 = var3.method1055(this);
                if (var5 < 0) {
                    var3.field2283 = 0;
                    this.method282(var3);
                } else {
                    var3.field2283 = var5;
                    this.method285(var3.field3859, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ltj;)V")
    private final void method282(class157 arg0) {
        arg0.method1706(-87);
        arg0.method1056();
        class254 var2 = this.field598.field1467.field3859;
        if (this.field598.field1467 == var2) {
            this.field599 = -1;
        } else {
            this.field599 = ((class157) var2).field2283;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()Lfb;")
    public final class50 method283() {
        return (class50) this.field597.method650(126);
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    private final void method284(int arg0) {
        for (class50 var2 = (class50) this.field597.method656(101); var2 != null; var2 = (class50) this.field597.method650(125)) {
            var2.method281(arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwg;Ltj;)V")
    private final void method285(class254 arg0, class157 arg1) {
        while (this.field598.field1467 != arg0 && ((class157) arg0).field2283 <= arg1.field2283) {
            arg0 = arg0.field3859;
        }
        class183.method1182((byte) -53, arg1, arg0);
        this.field599 = ((class157) this.field598.field1467.field3859).field2283;
    }
}
