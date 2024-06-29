import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class79 extends class204 {

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lvc;")
    private class129 field1287 = new class129();

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lvc;")
    private class129 field1288 = new class129();

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    private int field1289 = 0;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    private int field1290 = -1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmi;)V", line = 5)
    public final synchronized void method562(class204 arg0) {
        arg0.method499((byte) 64);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "([III)V", line = 10)
    private final void method563(int[] arg0, int arg1, int arg2) {
        for (class204 var4 = (class204) this.field1287.method898((byte) -91); var4 != null; var4 = (class204) this.field1287.method893((byte) -86)) {
            var4.method1434(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([III)V", line = 24)
    public final synchronized void method564(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1290 < 0) {
                this.method563(arg0, arg1, arg2);
                return;
            }
            if (this.field1289 + arg2 < this.field1290) {
                this.field1289 += arg2;
                this.method563(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1290 - this.field1289;
            this.method563(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1289 += var4;
            this.method572();
            class61 var5 = (class61) this.field1288.method898((byte) -95);
            synchronized (var5) {
                int var7 = var5.method413(this);
                if (var7 < 0) {
                    var5.field970 = 0;
                    this.method567(var5);
                } else {
                    var5.field970 = var7;
                    this.method570(var5.field1129, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 73)
    private final void method565(int arg0) {
        for (class204 var2 = (class204) this.field1287.method898((byte) -68); var2 != null; var2 = (class204) this.field1287.method893((byte) -105)) {
            var2.method568(arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lmi;)V", line = 84)
    public final synchronized void method566(class204 arg0) {
        this.field1287.method897(0, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvf;)V", line = 87)
    private final void method567(class61 arg0) {
        arg0.method499((byte) 64);
        arg0.method414();
        class68 var2 = this.field1288.field2209.field1129;
        if (this.field1288.field2209 == var2) {
            this.field1290 = -1;
        } else {
            this.field1290 = ((class61) var2).field970;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 105)
    public final synchronized void method568(int arg0) {
        do {
            if (this.field1290 < 0) {
                this.method565(arg0);
                return;
            }
            if (this.field1289 + arg0 < this.field1290) {
                this.field1289 += arg0;
                this.method565(arg0);
                return;
            }
            int var2 = this.field1290 - this.field1289;
            this.method565(var2);
            arg0 -= var2;
            this.field1289 += var2;
            this.method572();
            class61 var3 = (class61) this.field1288.method898((byte) -128);
            synchronized (var3) {
                int var5 = var3.method413(this);
                if (var5 < 0) {
                    var3.field970 = 0;
                    this.method567(var3);
                } else {
                    var3.field970 = var5;
                    this.method570(var3.field1129, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()Lmi;", line = 151)
    public final class204 method569() {
        return (class204) this.field1287.method893((byte) -89);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lei;Lvf;)V", line = 154)
    private final void method570(class68 arg0, class61 arg1) {
        while (this.field1288.field2209 != arg0 && ((class61) arg0).field970 <= arg1.field970) {
            arg0 = arg0.field1129;
        }
        class93.method640(arg1, -1, arg0);
        this.field1290 = ((class61) this.field1288.field2209.field1129).field970;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()Lmi;", line = 164)
    public final class204 method571() {
        return (class204) this.field1287.method898((byte) -99);
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "()V", line = 170)
    private final void method572() {
        if (this.field1289 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1288.method898((byte) -105); var1 != null; var1 = (class61) this.field1288.method893((byte) -69)) {
            var1.field970 -= this.field1289;
        }
        this.field1290 -= this.field1289;
        this.field1289 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()I", line = 187)
    public final int method573() {
        return 0;
    }
}
