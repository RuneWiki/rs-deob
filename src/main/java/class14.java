import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class240 {

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Lgj;")
    private class593 field233 = new class593();

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lgj;")
    private class593 field234 = new class593();

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    private int field236 = -1;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lqu;)V", line = 3)
    private final void method153(class86 arg0) {
        arg0.method2797(-111);
        arg0.method695();
        class504 var2 = this.field234.field7850.field6722;
        if (this.field234.field7850 == var2) {
            this.field236 = -1;
        } else {
            this.field236 = ((class86) var2).field1304;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 18)
    private final void method154(int arg0) {
        for (class240 var2 = (class240) this.field233.method3257(-33); var2 != null; var2 = (class240) this.field233.method3263((byte) -114)) {
            var2.method162(arg0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "([III)V", line = 29)
    private final void method155(int[] arg0, int arg1, int arg2) {
        for (class240 var4 = (class240) this.field233.method3257(-27); var4 != null; var4 = (class240) this.field233.method3263((byte) -125)) {
            var4.method1483(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()Lsda;", line = 44)
    public final class240 method156() {
        return (class240) this.field233.method3263((byte) -113);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lrc;Lqu;)V", line = 50)
    private final void method157(class504 arg0, class86 arg1) {
        while (this.field234.field7850 != arg0 && ((class86) arg0).field1304 <= arg1.field1304) {
            arg0 = arg0.field6722;
        }
        class95.method745((byte) -76, arg0, arg1);
        this.field236 = ((class86) this.field234.field7850.field6722).field1304;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "()I", line = 58)
    public final synchronized int method158() {
        return this.field233.method3261((byte) -67);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lsda;)V", line = 65)
    public final synchronized void method159(class240 arg0) {
        this.field233.method3258(arg0, 0);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([III)V", line = 73)
    public final synchronized void method160(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field236 < 0) {
                this.method155(arg0, arg1, arg2);
                return;
            }
            if (this.field235 + arg2 < this.field236) {
                this.field235 += arg2;
                this.method155(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field236 - this.field235;
            this.method155(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field235 += var4;
            this.method161();
            class86 var5 = (class86) this.field234.method3257(-83);
            synchronized (var5) {
                int var7 = var5.method696(this);
                if (var7 < 0) {
                    var5.field1304 = 0;
                    this.method153(var5);
                } else {
                    var5.field1304 = var7;
                    this.method157(var5.field6722, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "()V", line = 118)
    private final void method161() {
        if (this.field235 <= 0) {
            return;
        }
        for (class86 var1 = (class86) this.field234.method3257(-104); var1 != null; var1 = (class86) this.field234.method3263((byte) -103)) {
            var1.field1304 -= this.field235;
        }
        this.field236 -= this.field235;
        this.field235 = 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 139)
    public final synchronized void method162(int arg0) {
        do {
            if (this.field236 < 0) {
                this.method154(arg0);
                return;
            }
            if (this.field235 + arg0 < this.field236) {
                this.field235 += arg0;
                this.method154(arg0);
                return;
            }
            int var2 = this.field236 - this.field235;
            this.method154(var2);
            arg0 -= var2;
            this.field235 += var2;
            this.method161();
            class86 var3 = (class86) this.field234.method3257(-58);
            synchronized (var3) {
                int var5 = var3.method696(this);
                if (var5 < 0) {
                    var3.field1304 = 0;
                    this.method153(var3);
                } else {
                    var3.field1304 = var5;
                    this.method157(var3.field6722, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "()I", line = 184)
    public final int method163() {
        return 0;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Lsda;)V", line = 187)
    public final synchronized void method164(class240 arg0) {
        arg0.method2797(74);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "()Lsda;", line = 195)
    public final class240 method165() {
        return (class240) this.field233.method3257(-42);
    }
}
