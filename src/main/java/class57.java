import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class83 {

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lrc;")
    private class121 field1242 = new class121();

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Lrc;")
    private class121 field1243 = new class121();

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field1245 = -1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final synchronized void method360(int arg0) {
        do {
            if (this.field1245 < 0) {
                this.method436(arg0);
                return;
            }
            if (this.field1244 + arg0 < this.field1245) {
                this.field1244 += arg0;
                this.method436(arg0);
                return;
            }
            int var2 = this.field1245 - this.field1244;
            this.method436(var2);
            arg0 -= var2;
            this.field1244 += var2;
            this.method439();
            class24 var3 = (class24) this.field1243.method920((byte) 111);
            synchronized (var3) {
                int var5 = var3.method217(this);
                if (var5 < 0) {
                    var3.field487 = 0;
                    this.method435(var3);
                } else {
                    var3.field487 = var5;
                    this.method440(var3.field368, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V")
    public final synchronized void method372(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1245 < 0) {
                this.method437(arg0, arg1, arg2);
                return;
            }
            if (this.field1244 + arg2 < this.field1245) {
                this.field1244 += arg2;
                this.method437(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1245 - this.field1244;
            this.method437(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1244 += var4;
            this.method439();
            class24 var5 = (class24) this.field1243.method920((byte) -71);
            synchronized (var5) {
                int var7 = var5.method217(this);
                if (var7 < 0) {
                    var5.field487 = 0;
                    this.method435(var5);
                } else {
                    var5.field487 = var7;
                    this.method440(var5.field368, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
    public final int method357() {
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lm;)V")
    public final synchronized void method434(class83 arg0) {
        arg0.method172(-2658);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ldb;)V")
    private final void method435(class24 arg0) {
        arg0.method172(-2658);
        arg0.method216();
        class20 var2 = this.field1243.field2762.field368;
        if (this.field1243.field2762 == var2) {
            this.field1245 = -1;
        } else {
            this.field1245 = ((class24) var2).field487;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    private final void method436(int arg0) {
        for (class83 var2 = (class83) this.field1242.method920((byte) -123); var2 != null; var2 = (class83) this.field1242.method932(-6)) {
            var2.method360(arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()Lm;")
    public final class83 method377() {
        return (class83) this.field1242.method932(-6);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "([III)V")
    private final void method437(int[] arg0, int arg1, int arg2) {
        for (class83 var4 = (class83) this.field1242.method920((byte) -104); var4 != null; var4 = (class83) this.field1242.method932(-6)) {
            var4.method608(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lm;")
    public final class83 method353() {
        return (class83) this.field1242.method920((byte) 23);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lm;)V")
    public final synchronized void method438(class83 arg0) {
        this.field1242.method927(arg0, true);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
    private final void method439() {
        if (this.field1244 <= 0) {
            return;
        }
        for (class24 var1 = (class24) this.field1243.method920((byte) -103); var1 != null; var1 = (class24) this.field1243.method932(-6)) {
            var1.field487 -= this.field1244;
        }
        this.field1245 -= this.field1244;
        this.field1244 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lce;Ldb;)V")
    private final void method440(class20 arg0, class24 arg1) {
        while (this.field1243.field2762 != arg0 && ((class24) arg0).field487 <= arg1.field487) {
            arg0 = arg0.field368;
        }
        this.field1243.method931(arg0, 98, arg1);
        this.field1245 = ((class24) this.field1243.field2762.field368).field487;
    }
}
