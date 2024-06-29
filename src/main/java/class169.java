import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class169 extends class321 {

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Lwq;")
    private class92 field2347 = new class92();

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lwq;")
    private class92 field2348 = new class92();

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private int field2349 = 0;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field2350 = -1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "([III)V")
    public final synchronized void method1076(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2350 < 0) {
                this.method1138(arg0, arg1, arg2);
                return;
            }
            if (this.field2349 + arg2 < this.field2350) {
                this.field2349 += arg2;
                this.method1138(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2350 - this.field2349;
            this.method1138(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2349 += var4;
            this.method1136();
            class256 var5 = (class256) this.field2348.method506((byte) -128);
            synchronized (var5) {
                int var7 = var5.method1726(this);
                if (var7 < 0) {
                    var5.field3682 = 0;
                    this.method1141(var5);
                } else {
                    var5.field3682 = var7;
                    this.method1140(var5.field5862, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final synchronized void method1056(int arg0) {
        do {
            if (this.field2350 < 0) {
                this.method1142(arg0);
                return;
            }
            if (this.field2349 + arg0 < this.field2350) {
                this.field2349 += arg0;
                this.method1142(arg0);
                return;
            }
            int var2 = this.field2350 - this.field2349;
            this.method1142(var2);
            arg0 -= var2;
            this.field2349 += var2;
            this.method1136();
            class256 var3 = (class256) this.field2348.method506((byte) -128);
            synchronized (var3) {
                int var5 = var3.method1726(this);
                if (var5 < 0) {
                    var3.field3682 = 0;
                    this.method1141(var3);
                } else {
                    var3.field3682 = var5;
                    this.method1140(var3.field5862, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
    private final void method1136() {
        if (this.field2349 <= 0) {
            return;
        }
        for (class256 var1 = (class256) this.field2348.method506((byte) -128); var1 != null; var1 = (class256) this.field2348.method514(true)) {
            var1.field3682 -= this.field2349;
        }
        this.field2350 -= this.field2349;
        this.field2349 = 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
    public final int method1079() {
        return 0;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()Lj;")
    public final class321 method1060() {
        return (class321) this.field2347.method514(true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lj;)V")
    public final synchronized void method1137(class321 arg0) {
        arg0.method2594((byte) -22);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "([III)V")
    private final void method1138(int[] arg0, int arg1, int arg2) {
        for (class321 var4 = (class321) this.field2347.method506((byte) -128); var4 != null; var4 = (class321) this.field2347.method514(true)) {
            var4.method2097(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lj;)V")
    public final synchronized void method1139(class321 arg0) {
        this.field2347.method511(arg0, (byte) -121);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lqf;Los;)V")
    private final void method1140(class406 arg0, class256 arg1) {
        while (this.field2348.field1104 != arg0 && ((class256) arg0).field3682 <= arg1.field3682) {
            arg0 = arg0.field5862;
        }
        class151.method919(arg1, arg0, -108);
        this.field2350 = ((class256) this.field2348.field1104.field5862).field3682;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Los;)V")
    private final void method1141(class256 arg0) {
        arg0.method2594((byte) -22);
        arg0.method1725();
        class406 var2 = this.field2348.field1104.field5862;
        if (this.field2348.field1104 == var2) {
            this.field2350 = -1;
        } else {
            this.field2350 = ((class256) var2).field3682;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()Lj;")
    public final class321 method1078() {
        return (class321) this.field2347.method506((byte) -128);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    private final void method1142(int arg0) {
        for (class321 var2 = (class321) this.field2347.method506((byte) -128); var2 != null; var2 = (class321) this.field2347.method514(true)) {
            var2.method1056(arg0);
        }
    }
}
