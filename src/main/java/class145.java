import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class145 extends class136 {

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lwe;")
    private class15 field2482 = new class15();

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lwe;")
    private class15 field2483 = new class15();

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    private int field2484 = 0;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    private int field2485 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "([III)V")
    public final synchronized void method775(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2485 < 0) {
                this.method955(arg0, arg1, arg2);
                return;
            }
            if (this.field2484 + arg2 < this.field2485) {
                this.field2484 += arg2;
                this.method955(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2485 - this.field2484;
            this.method955(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2484 += var4;
            this.method956();
            class243 var5 = (class243) this.field2483.method110(64);
            synchronized (var5) {
                int var7 = var5.method1645(this);
                if (var7 < 0) {
                    var5.field4163 = 0;
                    this.method953(var5);
                } else {
                    var5.field4163 = var7;
                    this.method952(var5.field4370, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    private final void method950(int arg0) {
        for (class136 var2 = (class136) this.field2482.method110(64); var2 != null; var2 = (class136) this.field2482.method117((byte) 46)) {
            var2.method795(arg0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ldg;)V")
    public final synchronized void method951(class136 arg0) {
        this.field2482.method108(arg0, 6266);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()I")
    public final int method764() {
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lof;Lii;)V")
    private final void method952(class253 arg0, class243 arg1) {
        while (this.field2483.field209 != arg0 && ((class243) arg0).field4163 <= arg1.field4163) {
            arg0 = arg0.field4370;
        }
        class189.method1301(-206, arg1, arg0);
        this.field2485 = ((class243) this.field2483.field209.field4370).field4163;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lii;)V")
    private final void method953(class243 arg0) {
        arg0.method1753(137);
        arg0.method1644();
        class253 var2 = this.field2483.field209.field4370;
        if (this.field2483.field209 == var2) {
            this.field2485 = -1;
        } else {
            this.field2485 = ((class243) var2).field4163;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public final synchronized void method795(int arg0) {
        do {
            if (this.field2485 < 0) {
                this.method950(arg0);
                return;
            }
            if (this.field2484 + arg0 < this.field2485) {
                this.field2484 += arg0;
                this.method950(arg0);
                return;
            }
            int var2 = this.field2485 - this.field2484;
            this.method950(var2);
            arg0 -= var2;
            this.field2484 += var2;
            this.method956();
            class243 var3 = (class243) this.field2483.method110(64);
            synchronized (var3) {
                int var5 = var3.method1645(this);
                if (var5 < 0) {
                    var3.field4163 = 0;
                    this.method953(var3);
                } else {
                    var3.field4163 = var5;
                    this.method952(var3.field4370, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()Ldg;")
    public final class136 method780() {
        return (class136) this.field2482.method117((byte) 54);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()Ldg;")
    public final class136 method791() {
        return (class136) this.field2482.method110(64);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Ldg;)V")
    public final synchronized void method954(class136 arg0) {
        arg0.method1753(137);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "([III)V")
    private final void method955(int[] arg0, int arg1, int arg2) {
        for (class136 var4 = (class136) this.field2482.method110(64); var4 != null; var4 = (class136) this.field2482.method117((byte) 47)) {
            var4.method904(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()V")
    private final void method956() {
        if (this.field2484 <= 0) {
            return;
        }
        for (class243 var1 = (class243) this.field2483.method110(64); var1 != null; var1 = (class243) this.field2483.method117((byte) 57)) {
            var1.field4163 -= this.field2484;
        }
        this.field2485 -= this.field2484;
        this.field2484 = 0;
    }
}
