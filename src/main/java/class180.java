import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class180 extends class400 {

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Luh;")
    private class168 field2743 = new class168();

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Luh;")
    private class168 field2744 = new class168();

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    private int field2745 = -1;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    private int field2746 = 0;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljba;)V", line = 4)
    public final synchronized void method1321(class400 arg0) {
        arg0.method2314((byte) 94);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 11)
    public final synchronized void method89(int arg0) {
        do {
            if (this.field2745 < 0) {
                this.method1325(arg0);
                return;
            }
            if (this.field2746 + arg0 < this.field2745) {
                this.field2746 += arg0;
                this.method1325(arg0);
                return;
            }
            int var2 = this.field2745 - this.field2746;
            this.method1325(var2);
            arg0 -= var2;
            this.field2746 += var2;
            this.method1326();
            class374 var3 = (class374) this.field2744.method1269(4);
            synchronized (var3) {
                int var5 = var3.method2369(this);
                if (var5 < 0) {
                    var3.field5306 = 0;
                    this.method1323(var3);
                } else {
                    var3.field5306 = var5;
                    this.method1322(var3.field5207, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()Ljba;", line = 59)
    public final class400 method103() {
        return (class400) this.field2743.method1269(4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Leh;Lom;)V", line = 63)
    private final void method1322(class362 arg0, class374 arg1) {
        while (this.field2744.field2642 != arg0 && ((class374) arg0).field5306 <= arg1.field5306) {
            arg0 = arg0.field5207;
        }
        class68.method679(-106, arg1, arg0);
        this.field2745 = ((class374) this.field2744.field2642.field5207).field5306;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lom;)V", line = 75)
    private final void method1323(class374 arg0) {
        arg0.method2314((byte) 105);
        arg0.method2370();
        class362 var2 = this.field2744.field2642.field5207;
        if (this.field2744.field2642 == var2) {
            this.field2745 = -1;
        } else {
            this.field2745 = ((class374) var2).field5306;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Ljba;)V", line = 90)
    public final synchronized void method1324(class400 arg0) {
        this.field2743.method1275(arg0, -109);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 95)
    private final void method1325(int arg0) {
        for (class400 var2 = (class400) this.field2743.method1269(4); var2 != null; var2 = (class400) this.field2743.method1264((byte) 104)) {
            var2.method89(arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "()V", line = 104)
    private final void method1326() {
        if (this.field2746 <= 0) {
            return;
        }
        for (class374 var1 = (class374) this.field2744.method1269(4); var1 != null; var1 = (class374) this.field2744.method1264((byte) 115)) {
            var1.field5306 -= this.field2746;
        }
        this.field2745 -= this.field2746;
        this.field2746 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "([III)V", line = 124)
    private final void method1327(int[] arg0, int arg1, int arg2) {
        for (class400 var4 = (class400) this.field2743.method1269(4); var4 != null; var4 = (class400) this.field2743.method1264((byte) 41)) {
            var4.method2501(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "()I", line = 136)
    public final synchronized int method1328() {
        return this.field2743.method1272(0);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "()Ljba;", line = 139)
    public final class400 method69() {
        return (class400) this.field2743.method1264((byte) 95);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "()I", line = 143)
    public final int method111() {
        return 0;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "([III)V", line = 150)
    public final synchronized void method92(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2745 < 0) {
                this.method1327(arg0, arg1, arg2);
                return;
            }
            if (this.field2746 + arg2 < this.field2745) {
                this.field2746 += arg2;
                this.method1327(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2745 - this.field2746;
            this.method1327(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2746 += var4;
            this.method1326();
            class374 var5 = (class374) this.field2744.method1269(4);
            synchronized (var5) {
                int var7 = var5.method2369(this);
                if (var7 < 0) {
                    var5.field5306 = 0;
                    this.method1323(var5);
                } else {
                    var5.field5306 = var7;
                    this.method1322(var5.field5207, var5);
                }
            }
        } while (arg2 != 0);
    }
}
