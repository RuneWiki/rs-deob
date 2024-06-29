import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class335 extends class582 {

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lwba;")
    private class46 field4955 = new class46();

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lwba;")
    private class46 field4956 = new class46();

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    private int field4957 = 0;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    private int field4958 = -1;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lpda;)V")
    public final synchronized void method2107(class582 arg0) {
        this.field4955.method479((byte) -127, arg0);
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "()V")
    private final void method2108() {
        if (this.field4957 <= 0) {
            return;
        }
        for (class567 var1 = (class567) this.field4956.method472((byte) -68); var1 != null; var1 = (class567) this.field4956.method482(115)) {
            var1.field7980 -= this.field4957;
        }
        this.field4958 -= this.field4957;
        this.field4957 = 0;
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "([III)V")
    private final void method2109(int[] arg0, int arg1, int arg2) {
        for (class582 var4 = (class582) this.field4955.method472((byte) -32); var4 != null; var4 = (class582) this.field4955.method482(127)) {
            var4.method3315(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "()Lpda;")
    public final class582 method397() {
        return (class582) this.field4955.method472((byte) -24);
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "()I")
    public final int method406() {
        return 0;
    }

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "()I")
    public final synchronized int method2110() {
        return this.field4955.method477(15650);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lwa;)V")
    private final void method2111(class567 arg0) {
        arg0.method3678(-1);
        arg0.method3227();
        class665 var2 = this.field4956.field716.field9382;
        if (this.field4956.field716 == var2) {
            this.field4958 = -1;
        } else {
            this.field4958 = ((class567) var2).field7980;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
    private final void method2112(int arg0) {
        for (class582 var2 = (class582) this.field4955.method472((byte) -62); var2 != null; var2 = (class582) this.field4955.method482(-124)) {
            var2.method386(arg0);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lpca;Lwa;)V")
    private final void method2113(class665 arg0, class567 arg1) {
        while (this.field4956.field716 != arg0 && ((class567) arg0).field7980 <= arg1.field7980) {
            arg0 = arg0.field9382;
        }
        class581.method3313(0, arg1, arg0);
        this.field4958 = ((class567) this.field4956.field716.field9382).field7980;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Lpda;)V")
    public final synchronized void method2114(class582 arg0) {
        arg0.method3678(-1);
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "()Lpda;")
    public final class582 method403() {
        return (class582) this.field4955.method482(119);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([III)V")
    public final synchronized void method373(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4958 < 0) {
                this.method2109(arg0, arg1, arg2);
                return;
            }
            if (this.field4957 + arg2 < this.field4958) {
                this.field4957 += arg2;
                this.method2109(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4958 - this.field4957;
            this.method2109(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4957 += var4;
            this.method2108();
            class567 var5 = (class567) this.field4956.method472((byte) -23);
            synchronized (var5) {
                int var7 = var5.method3228(this);
                if (var7 < 0) {
                    var5.field7980 = 0;
                    this.method2111(var5);
                } else {
                    var5.field7980 = var7;
                    this.method2113(var5.field9382, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public final synchronized void method386(int arg0) {
        do {
            if (this.field4958 < 0) {
                this.method2112(arg0);
                return;
            }
            if (this.field4957 + arg0 < this.field4958) {
                this.field4957 += arg0;
                this.method2112(arg0);
                return;
            }
            int var2 = this.field4958 - this.field4957;
            this.method2112(var2);
            arg0 -= var2;
            this.field4957 += var2;
            this.method2108();
            class567 var3 = (class567) this.field4956.method472((byte) -117);
            synchronized (var3) {
                int var5 = var3.method3228(this);
                if (var5 < 0) {
                    var3.field7980 = 0;
                    this.method2111(var3);
                } else {
                    var3.field7980 = var5;
                    this.method2113(var3.field9382, var3);
                }
            }
        } while (arg0 != 0);
    }
}
