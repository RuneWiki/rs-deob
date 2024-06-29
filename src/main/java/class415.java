import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class415 implements Runnable {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
    private volatile boolean field6577 = true;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "[Lih;")
    private class731[] field6578 = new class731[8];

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "[I")
    private int[] field6581 = new int[3];

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
    private volatile boolean field6582 = true;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Z")
    private volatile boolean field6580 = false;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    private int field6579;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Lha;")
    private class63 field6576;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "J")
    private long field6575;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Lpha;")
    private class172 field6583;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "()J")
    public final long method3308() {
        return this.field6575;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "()V")
    public final void method3309() {
        this.field6577 = false;
        this.field6582 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "()V")
    public final void method3310() {
        this.field6577 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "()V")
    public final void method3311() {
        this.field6577 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lpha;)V")
    public final void method3312(class172 arg0) {
        if (this.field6583 != null) {
            this.field6583.method1585(-14053, null);
        }
        this.field6583 = arg0;
        if (this.field6583 != null) {
            this.field6583.method1585(-14053, this);
        }
    }

    @OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6582) {
            this.method3314();
        }
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "()Z")
    public final boolean method3313() {
        return this.field6583 == null || !this.field6580 && this.field6583.method1590(3);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "()V")
    private final void method3314() {
        this.field6576.method234(this.field6579);
        while (!this.field6577 && this.field6582) {
            if (this.field6583 == null || this.field6583.method1590(3)) {
                this.field6580 = false;
                this.field6575 = class338.field5509.method1185(-92);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field6580 = true;
                class182 var1 = this.field6583.method1592(true);
                if (var1 instanceof class693) {
                    class693 var2 = (class693) var1;
                    if (var2.field9971) {
                        var2.method40((byte) -108, class120.field1734);
                    } else {
                        class299.method2577(var2, this.field6578);
                        if (class766.field11217 != null) {
                            class766.field11217.method679(0, var2.field9970, -16777216, -256, this.field6583.field2753, var2.field9984);
                        }
                    }
                } else {
                    int var3 = ((class581) var1).field8368;
                    if (var3 >= 1 && var3 <= 4) {
                        class293 var4 = class740.field10902[var3 - 1];
                        for (int var5 = 0; var5 < class297.field4835 + class297.field4835; var5++) {
                            for (int var6 = 0; var6 < class297.field4835 + class297.field4835; var6++) {
                                if (class245.field3795[var3 - 1][var5][var6]) {
                                    int var7 = class54.field689 + var5 - class297.field4835;
                                    int var8 = class316.field5137 + var6 - class297.field4835;
                                    if (var7 >= 0 && var7 < var4.field4704 && var8 >= 0 && var8 < var4.field4697) {
                                        class120.field1734.method229(var7 << class165.field2688, var4.method2495(var8, 1, var7), var8 << class165.field2688, this.field6581);
                                        if (class694.method5053(this.field6581[0]) == this.field6579 - 1) {
                                            var4.method700(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field6576.method268(this.field6579);
        while (this.field6577 && this.field6582) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILha;)V")
    public class415(int arg0, class63 arg1) {
        this.field6579 = arg0;
        this.field6576 = arg1;
    }
}
