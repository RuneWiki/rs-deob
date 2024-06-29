import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 extends class88 {

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lgk;")
    private class159 field886 = new class159();

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Lgk;")
    private class159 field887 = new class159();

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    private int field888 = 0;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    private int field889 = -1;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lgl;)V")
    private final void method372(class216 arg0) {
        arg0.method538(72);
        arg0.method1385();
        class82 var2 = this.field887.field2438.field1318;
        if (this.field887.field2438 == var2) {
            this.field889 = -1;
        } else {
            this.field889 = ((class216) var2).field3249;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V")
    public final synchronized void method265(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field889 < 0) {
                this.method375(arg0, arg1, arg2);
                return;
            }
            if (this.field888 + arg2 < this.field889) {
                this.field888 += arg2;
                this.method375(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field889 - this.field888;
            this.method375(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field888 += var4;
            this.method374();
            class216 var5 = (class216) this.field887.method983(7);
            synchronized (var5) {
                int var7 = var5.method1384(this);
                if (var7 < 0) {
                    var5.field3249 = 0;
                    this.method372(var5);
                } else {
                    var5.field3249 = var7;
                    this.method377(var5.field1318, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lai;)V")
    public final synchronized void method373(class88 arg0) {
        this.field886.method982((byte) 69, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lai;")
    public final class88 method257() {
        return (class88) this.field886.method983(7);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "()V")
    private final void method374() {
        if (this.field888 <= 0) {
            return;
        }
        for (class216 var1 = (class216) this.field887.method983(7); var1 != null; var1 = (class216) this.field887.method985((byte) -116)) {
            var1.field3249 -= this.field888;
        }
        this.field889 -= this.field888;
        this.field888 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "([III)V")
    private final void method375(int[] arg0, int arg1, int arg2) {
        for (class88 var4 = (class88) this.field886.method983(7); var4 != null; var4 = (class88) this.field886.method985((byte) -43)) {
            var4.method571(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    private final void method376(int arg0) {
        for (class88 var2 = (class88) this.field886.method983(7); var2 != null; var2 = (class88) this.field886.method985((byte) 99)) {
            var2.method249(arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public final synchronized void method249(int arg0) {
        do {
            if (this.field889 < 0) {
                this.method376(arg0);
                return;
            }
            if (this.field888 + arg0 < this.field889) {
                this.field888 += arg0;
                this.method376(arg0);
                return;
            }
            int var2 = this.field889 - this.field888;
            this.method376(var2);
            arg0 -= var2;
            this.field888 += var2;
            this.method374();
            class216 var3 = (class216) this.field887.method983(7);
            synchronized (var3) {
                int var5 = var3.method1384(this);
                if (var5 < 0) {
                    var3.field3249 = 0;
                    this.method372(var3);
                } else {
                    var3.field3249 = var5;
                    this.method377(var3.field1318, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()Lai;")
    public final class88 method270() {
        return (class88) this.field886.method985((byte) -35);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loi;Lgl;)V")
    private final void method377(class82 arg0, class216 arg1) {
        while (this.field887.field2438 != arg0 && ((class216) arg0).field3249 <= arg1.field3249) {
            arg0 = arg0.field1318;
        }
        class137.method834(arg0, arg1, (byte) 51);
        this.field889 = ((class216) this.field887.field2438.field1318).field3249;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()I")
    public final int method273() {
        return 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lai;)V")
    public final synchronized void method378(class88 arg0) {
        arg0.method538(80);
    }
}
