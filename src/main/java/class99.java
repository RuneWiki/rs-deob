import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class99 extends class648 {

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lqia;")
    private class547 field1226 = new class547();

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lqia;")
    private class547 field1227 = new class547();

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    private int field1229 = -1;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 6)
    public final synchronized void method661(int arg0) {
        do {
            if (this.field1229 < 0) {
                this.method667(arg0);
                return;
            }
            if (this.field1228 + arg0 < this.field1229) {
                this.field1228 += arg0;
                this.method667(arg0);
                return;
            }
            int var2 = this.field1229 - this.field1228;
            this.method667(var2);
            arg0 -= var2;
            this.field1228 += var2;
            this.method668();
            class191 var3 = (class191) this.field1227.method3111(111);
            synchronized (var3) {
                int var5 = var3.method1206(this);
                if (var5 < 0) {
                    var3.field2502 = 0;
                    this.method672(var3);
                } else {
                    var3.field2502 = var5;
                    this.method669(var3.field8744, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()Lrn;", line = 52)
    public final class648 method662() {
        return (class648) this.field1226.method3111(68);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrn;)V", line = 60)
    public final synchronized void method663(class648 arg0) {
        this.field1226.method3109(arg0, 120);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Lrn;)V", line = 63)
    public final synchronized void method664(class648 arg0) {
        arg0.method3426((byte) -30);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "()I", line = 69)
    public final synchronized int method665() {
        return this.field1226.method3122(667);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "([III)V", line = 74)
    private final void method666(int[] arg0, int arg1, int arg2) {
        for (class648 var4 = (class648) this.field1226.method3111(51); var4 != null; var4 = (class648) this.field1226.method3116(-126)) {
            var4.method3506(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 86)
    private final void method667(int arg0) {
        for (class648 var2 = (class648) this.field1226.method3111(89); var2 != null; var2 = (class648) this.field1226.method3116(-113)) {
            var2.method661(arg0);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "()V", line = 96)
    private final void method668() {
        if (this.field1228 <= 0) {
            return;
        }
        for (class191 var1 = (class191) this.field1227.method3111(125); var1 != null; var1 = (class191) this.field1227.method3116(-53)) {
            var1.field2502 -= this.field1228;
        }
        this.field1229 -= this.field1228;
        this.field1228 = 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lns;Lb;)V", line = 113)
    private final void method669(class627 arg0, class191 arg1) {
        while (this.field1227.field7718 != arg0 && ((class191) arg0).field2502 <= arg1.field2502) {
            arg0 = arg0.field8744;
        }
        class58.method455(false, arg1, arg0);
        this.field1229 = ((class191) this.field1227.field7718.field8744).field2502;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "([III)V", line = 128)
    public final synchronized void method670(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1229 < 0) {
                this.method666(arg0, arg1, arg2);
                return;
            }
            if (this.field1228 + arg2 < this.field1229) {
                this.field1228 += arg2;
                this.method666(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1229 - this.field1228;
            this.method666(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1228 += var4;
            this.method668();
            class191 var5 = (class191) this.field1227.method3111(52);
            synchronized (var5) {
                int var7 = var5.method1206(this);
                if (var7 < 0) {
                    var5.field2502 = 0;
                    this.method672(var5);
                } else {
                    var5.field2502 = var7;
                    this.method669(var5.field8744, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()I", line = 172)
    public final int method671() {
        return 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lb;)V", line = 175)
    private final void method672(class191 arg0) {
        arg0.method3426((byte) -50);
        arg0.method1205();
        class627 var2 = this.field1227.field7718.field8744;
        if (this.field1227.field7718 == var2) {
            this.field1229 = -1;
        } else {
            this.field1229 = ((class191) var2).field2502;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()Lrn;", line = 194)
    public final class648 method673() {
        return (class648) this.field1226.method3116(-111);
    }
}
