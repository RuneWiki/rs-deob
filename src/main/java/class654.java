import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class654 implements Runnable {

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "[Luf;")
    private class471[] field9447 = new class471[8];

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
    private int[] field9448 = new int[3];

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
    private volatile boolean field9451 = true;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Z")
    private volatile boolean field9453 = true;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Z")
    private volatile boolean field9452 = false;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    private int field9454;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lha;")
    private class66 field9449;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "J")
    private long field9446;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Ldt;")
    private class253 field9450;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ldt;)V", line = 7)
    public final void method4794(class253 arg0) {
        if (this.field9450 != null) {
            this.field9450.method2144(null, (byte) 126);
        }
        this.field9450 = arg0;
        if (this.field9450 != null) {
            this.field9450.method2144(this, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()Z", line = 16)
    public final boolean method4795() {
        return this.field9450 == null || !this.field9452 && this.field9450.method2139((byte) -53);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class654(int arg0, class66 arg1) {
        this.field9454 = arg0;
        this.field9449 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()V", line = 24)
    public final void method4796() {
        this.field9451 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()V", line = 33)
    public final void method4797() {
        this.field9451 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "()V", line = 39)
    private final void method4798() {
        this.field9449.method510(this.field9454);
        while (!this.field9451 && this.field9453) {
            if (this.field9450 == null || this.field9450.method2139((byte) -53)) {
                this.field9452 = false;
                this.field9446 = class371.field5648.method165((byte) -48);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field9452 = true;
                class640 var1 = this.field9450.method2147(true);
                if (var1 instanceof class420) {
                    class420 var2 = (class420) var1;
                    if (var2.field6212) {
                        var2.method1081(0, class606.field8877);
                    } else {
                        class294.method2408(var2, this.field9447);
                        if (class210.field3216 != null) {
                            class210.field3216.method596(-16777216, 31, this.field9450.field3918, var2.field6206, -256, var2.field6201);
                        }
                    }
                } else {
                    int var3 = ((class232) var1).field3502;
                    if (var3 >= 1 && var3 <= 4) {
                        class294 var4 = class555.field8261[var3 - 1];
                        for (int var5 = 0; var5 < class396.field5921 + class396.field5921; var5++) {
                            for (int var6 = 0; var6 < class396.field5921 + class396.field5921; var6++) {
                                if (class549.field8190[var3 - 1][var5][var6]) {
                                    int var7 = class247.field3811 + var5 - class396.field5921;
                                    int var8 = class5.field52 + var6 - class396.field5921;
                                    if (var7 >= 0 && var7 < var4.field4337 && var8 >= 0 && var8 < var4.field4336) {
                                        class606.field8877.method524(var7 << class602.field8828, var4.method2407(var8, var7, 59), var8 << class602.field8828, this.field9448);
                                        if (class770.method5566(this.field9448[0]) == this.field9454 - 1) {
                                            var4.method1505(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field9449.method535(this.field9454);
        while (this.field9451 && this.field9453) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "()J", line = 141)
    public final long method4799() {
        return this.field9446;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "()V", line = 147)
    public final void method4800() {
        this.field9451 = false;
        this.field9453 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tq", name = "run", descriptor = "()V", line = 157)
    public final void run() {
        while (this.field9453) {
            this.method4798();
        }
    }
}
