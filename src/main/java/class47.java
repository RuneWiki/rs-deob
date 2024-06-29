import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class49 {

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Laa;")
    private class2 field1241 = new class2();

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Laa;")
    private class2 field1242 = new class2();

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    private int field1243 = 0;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    private int field1244 = -1;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 7)
    public final synchronized void method163(int arg0) {
        do {
            if (this.field1244 < 0) {
                this.method537(arg0);
                return;
            }
            if (this.field1243 + arg0 < this.field1244) {
                this.field1243 += arg0;
                this.method537(arg0);
                return;
            }
            int var2 = this.field1244 - this.field1243;
            this.method537(var2);
            arg0 -= var2;
            this.field1243 += var2;
            this.method540();
            class135 var3 = (class135) this.field1242.method8(-1);
            synchronized (var3) {
                int var5 = var3.method1097(this);
                if (var5 < 0) {
                    var3.field3391 = 0;
                    this.method538(var3);
                } else {
                    var3.field3391 = var5;
                    this.method539(var3.field3631, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "([III)V", line = 55)
    private final void method534(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field1241.method8(-1); var4 != null; var4 = (class49) this.field1241.method9(1)) {
            var4.method548(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lh;)V", line = 65)
    public final synchronized void method535(class49 arg0) {
        arg0.method1170(55);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lh;)V", line = 71)
    public final synchronized void method536(class49 arg0) {
        this.field1241.method12((byte) 87, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 76)
    private final void method537(int arg0) {
        for (class49 var2 = (class49) this.field1241.method8(-1); var2 != null; var2 = (class49) this.field1241.method9(1)) {
            var2.method163(arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lte;)V", line = 89)
    private final void method538(class135 arg0) {
        arg0.method1170(102);
        arg0.method1096();
        class145 var2 = this.field1242.field54.field3631;
        if (this.field1242.field54 == var2) {
            this.field1244 = -1;
        } else {
            this.field1244 = ((class135) var2).field3391;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Lh;", line = 102)
    public final class49 method159() {
        return (class49) this.field1241.method8(-1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lvc;Lte;)V", line = 105)
    private final void method539(class145 arg0, class135 arg1) {
        while (this.field1242.field54 != arg0 && ((class135) arg0).field3391 <= arg1.field3391) {
            arg0 = arg0.field3631;
        }
        this.field1242.method7(arg1, arg0, (byte) -127);
        this.field1244 = ((class135) this.field1242.field54.field3631).field3391;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()V", line = 112)
    private final void method540() {
        if (this.field1243 <= 0) {
            return;
        }
        for (class135 var1 = (class135) this.field1242.method8(-1); var1 != null; var1 = (class135) this.field1242.method9(1)) {
            var1.field3391 -= this.field1243;
        }
        this.field1244 -= this.field1243;
        this.field1243 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V", line = 136)
    public final synchronized void method193(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1244 < 0) {
                this.method534(arg0, arg1, arg2);
                return;
            }
            if (this.field1243 + arg2 < this.field1244) {
                this.field1243 += arg2;
                this.method534(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1244 - this.field1243;
            this.method534(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1243 += var4;
            this.method540();
            class135 var5 = (class135) this.field1242.method8(-1);
            synchronized (var5) {
                int var7 = var5.method1097(this);
                if (var7 < 0) {
                    var5.field3391 = 0;
                    this.method538(var5);
                } else {
                    var5.field3391 = var7;
                    this.method539(var5.field3631, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lh;", line = 180)
    public final class49 method171() {
        return (class49) this.field1241.method9(1);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I", line = 190)
    public final int method164() {
        return 0;
    }
}
