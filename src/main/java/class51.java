import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class51 extends class24 {

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lkl;")
    private class64 field776 = new class64();

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lkl;")
    private class64 field777 = new class64();

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field779 = 0;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    private int field778 = -1;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 8)
    public final synchronized void method154(int arg0) {
        do {
            if (this.field778 < 0) {
                this.method368(arg0);
                return;
            }
            if (this.field779 + arg0 < this.field778) {
                this.field779 += arg0;
                this.method368(arg0);
                return;
            }
            int var2 = this.field778 - this.field779;
            this.method368(var2);
            arg0 -= var2;
            this.field779 += var2;
            this.method364();
            class261 var3 = (class261) this.field777.method536(2);
            synchronized (var3) {
                int var5 = var3.method1806(this);
                if (var5 < 0) {
                    var3.field4349 = 0;
                    this.method366(var3);
                } else {
                    var3.field4349 = var5;
                    this.method367(var3.field4939, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()I", line = 53)
    public final int method159() {
        return 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "([III)V", line = 59)
    private final void method363(int[] arg0, int arg1, int arg2) {
        for (class24 var4 = (class24) this.field776.method536(2); var4 != null; var4 = (class24) this.field776.method533(24)) {
            var4.method155(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([III)V", line = 74)
    public final synchronized void method157(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field778 < 0) {
                this.method363(arg0, arg1, arg2);
                return;
            }
            if (this.field779 + arg2 < this.field778) {
                this.field779 += arg2;
                this.method363(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field778 - this.field779;
            this.method363(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field779 += var4;
            this.method364();
            class261 var5 = (class261) this.field777.method536(2);
            synchronized (var5) {
                int var7 = var5.method1806(this);
                if (var7 < 0) {
                    var5.field4349 = 0;
                    this.method366(var5);
                } else {
                    var5.field4349 = var7;
                    this.method367(var5.field4939, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lu;", line = 120)
    public final class24 method158() {
        return (class24) this.field776.method533(24);
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "()V", line = 123)
    private final void method364() {
        if (this.field779 <= 0) {
            return;
        }
        for (class261 var1 = (class261) this.field777.method536(2); var1 != null; var1 = (class261) this.field777.method533(24)) {
            var1.field4349 -= this.field779;
        }
        this.field778 -= this.field779;
        this.field779 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lu;)V", line = 143)
    public final synchronized void method365(class24 arg0) {
        this.field776.method534(arg0, false);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lua;)V", line = 146)
    private final void method366(class261 arg0) {
        arg0.method2000(-49);
        arg0.method1805();
        class287 var2 = this.field777.field979.field4939;
        if (this.field777.field979 == var2) {
            this.field778 = -1;
        } else {
            this.field778 = ((class261) var2).field4349;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lhf;Lua;)V", line = 159)
    private final void method367(class287 arg0, class261 arg1) {
        while (this.field777.field979 != arg0 && ((class261) arg0).field4349 <= arg1.field4349) {
            arg0 = arg0.field4939;
        }
        class145.method1056((byte) -109, arg1, arg0);
        this.field778 = ((class261) this.field777.field979.field4939).field4349;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lu;", line = 168)
    public final class24 method156() {
        return (class24) this.field776.method536(2);
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 174)
    private final void method368(int arg0) {
        for (class24 var2 = (class24) this.field776.method536(2); var2 != null; var2 = (class24) this.field776.method533(24)) {
            var2.method154(arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lu;)V", line = 184)
    public final synchronized void method369(class24 arg0) {
        arg0.method2000(28);
    }
}
