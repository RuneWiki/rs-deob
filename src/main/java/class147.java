import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class147 extends class37 {

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lwo;")
    private class522 field2086 = new class522();

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Lwo;")
    private class522 field2087 = new class522();

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    private int field2088 = 0;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    private int field2089 = -1;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ldm;)V")
    public final synchronized void method939(class37 arg0) {
        this.field2086.method3069(arg0, 2);
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "([III)V")
    private final void method940(int[] arg0, int arg1, int arg2) {
        for (class37 var4 = (class37) this.field2086.method3072((byte) 49); var4 != null; var4 = (class37) this.field2086.method3066(2)) {
            var4.method243(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "()I")
    public final synchronized int method941() {
        return this.field2086.method3064((byte) 124);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Ldm;)V")
    public final synchronized void method942(class37 arg0) {
        arg0.method2946(-128);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final synchronized void method239(int arg0) {
        do {
            if (this.field2089 < 0) {
                this.method944(arg0);
                return;
            }
            if (this.field2088 + arg0 < this.field2089) {
                this.field2088 += arg0;
                this.method944(arg0);
                return;
            }
            int var2 = this.field2089 - this.field2088;
            this.method944(var2);
            arg0 -= var2;
            this.field2088 += var2;
            this.method946();
            class265 var3 = (class265) this.field2087.method3072((byte) 115);
            synchronized (var3) {
                int var5 = var3.method1530(this);
                if (var5 < 0) {
                    var3.field3623 = 0;
                    this.method945(var3);
                } else {
                    var3.field3623 = var5;
                    this.method943(var3.field7336, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "()Ldm;")
    public final class37 method242() {
        return (class37) this.field2086.method3072((byte) 30);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lki;Lfu;)V")
    private final void method943(class499 arg0, class265 arg1) {
        while (this.field2087.field7697 != arg0 && ((class265) arg0).field3623 <= arg1.field3623) {
            arg0 = arg0.field7336;
        }
        class3.method14(arg0, arg1, -123);
        this.field2089 = ((class265) this.field2087.field7697.field7336).field3623;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "()Ldm;")
    public final class37 method244() {
        return (class37) this.field2086.method3066(2);
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
    private final void method944(int arg0) {
        for (class37 var2 = (class37) this.field2086.method3072((byte) 76); var2 != null; var2 = (class37) this.field2086.method3066(2)) {
            var2.method239(arg0);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lfu;)V")
    private final void method945(class265 arg0) {
        arg0.method2946(-111);
        arg0.method1531();
        class499 var2 = this.field2087.field7697.field7336;
        if (this.field2087.field7697 == var2) {
            this.field2089 = -1;
        } else {
            this.field2089 = ((class265) var2).field3623;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "()I")
    public final int method238() {
        return 0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([III)V")
    public final synchronized void method240(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2089 < 0) {
                this.method940(arg0, arg1, arg2);
                return;
            }
            if (this.field2088 + arg2 < this.field2089) {
                this.field2088 += arg2;
                this.method940(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2089 - this.field2088;
            this.method940(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2088 += var4;
            this.method946();
            class265 var5 = (class265) this.field2087.method3072((byte) 39);
            synchronized (var5) {
                int var7 = var5.method1530(this);
                if (var7 < 0) {
                    var5.field3623 = 0;
                    this.method945(var5);
                } else {
                    var5.field3623 = var7;
                    this.method943(var5.field7336, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "()V")
    private final void method946() {
        if (this.field2088 <= 0) {
            return;
        }
        for (class265 var1 = (class265) this.field2087.method3072((byte) 46); var1 != null; var1 = (class265) this.field2087.method3066(2)) {
            var1.field3623 -= this.field2088;
        }
        this.field2089 -= this.field2088;
        this.field2088 = 0;
    }
}
