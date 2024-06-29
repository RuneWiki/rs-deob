import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class106 extends class178 {

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lqg;")
    private class256 field1603 = new class256();

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lqg;")
    private class256 field1604 = new class256();

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    private int field1605 = -1;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    private int field1606 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "([III)V", line = 5)
    private final void method735(int[] arg0, int arg1, int arg2) {
        for (class178 var4 = (class178) this.field1603.method1807((byte) 66); var4 != null; var4 = (class178) this.field1603.method1808(18051)) {
            var4.method1238(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V", line = 15)
    private final void method736() {
        if (this.field1606 <= 0) {
            return;
        }
        for (class279 var1 = (class279) this.field1604.method1807((byte) 37); var1 != null; var1 = (class279) this.field1604.method1808(18051)) {
            var1.field4393 -= this.field1606;
        }
        this.field1605 -= this.field1606;
        this.field1606 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 35)
    private final void method737(int arg0) {
        for (class178 var2 = (class178) this.field1603.method1807((byte) 119); var2 != null; var2 = (class178) this.field1603.method1808(18051)) {
            var2.method288(arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljl;)V", line = 46)
    private final void method738(class279 arg0) {
        arg0.method465((byte) -122);
        arg0.method1975();
        class71 var2 = this.field1604.field4068.field921;
        if (this.field1604.field4068 == var2) {
            this.field1605 = -1;
        } else {
            this.field1605 = ((class279) var2).field4393;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lba;)V", line = 59)
    public final synchronized void method739(class178 arg0) {
        arg0.method465((byte) -122);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([III)V", line = 68)
    public final synchronized void method284(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1605 < 0) {
                this.method735(arg0, arg1, arg2);
                return;
            }
            if (this.field1606 + arg2 < this.field1605) {
                this.field1606 += arg2;
                this.method735(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1605 - this.field1606;
            this.method735(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1606 += var4;
            this.method736();
            class279 var5 = (class279) this.field1604.method1807((byte) 56);
            synchronized (var5) {
                int var7 = var5.method1974(this);
                if (var7 < 0) {
                    var5.field4393 = 0;
                    this.method738(var5);
                } else {
                    var5.field4393 = var7;
                    this.method740(var5.field921, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lhl;Ljl;)V", line = 113)
    private final void method740(class71 arg0, class279 arg1) {
        while (this.field1604.field4068 != arg0 && ((class279) arg0).field4393 <= arg1.field4393) {
            arg0 = arg0.field921;
        }
        class245.method1734(arg0, 48, arg1);
        this.field1605 = ((class279) this.field1604.field4068.field921).field4393;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lba;", line = 120)
    public final class178 method287() {
        return (class178) this.field1603.method1808(18051);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()Lba;", line = 124)
    public final class178 method281() {
        return (class178) this.field1603.method1807((byte) 32);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I", line = 128)
    public final int method282() {
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lba;)V", line = 133)
    public final synchronized void method741(class178 arg0) {
        this.field1603.method1809(arg0, (byte) -52);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 145)
    public final synchronized void method288(int arg0) {
        do {
            if (this.field1605 < 0) {
                this.method737(arg0);
                return;
            }
            if (this.field1606 + arg0 < this.field1605) {
                this.field1606 += arg0;
                this.method737(arg0);
                return;
            }
            int var2 = this.field1605 - this.field1606;
            this.method737(var2);
            arg0 -= var2;
            this.field1606 += var2;
            this.method736();
            class279 var3 = (class279) this.field1604.method1807((byte) 25);
            synchronized (var3) {
                int var5 = var3.method1974(this);
                if (var5 < 0) {
                    var3.field4393 = 0;
                    this.method738(var3);
                } else {
                    var3.field4393 = var5;
                    this.method740(var3.field921, var3);
                }
            }
        } while (arg0 != 0);
    }
}
