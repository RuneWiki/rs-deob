import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class638 implements Runnable {

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lqea;")
    private class392[] field8818 = new class392[8];

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
    private int[] field8814 = new int[3];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    private volatile boolean field8819 = true;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
    private volatile boolean field8813 = true;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Z")
    private volatile boolean field8815 = false;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field8812;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lr;")
    private class562 field8817;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "J")
    private long field8811;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lsf;")
    private class602 field8816;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V", line = 3)
    public final void method3530() {
        this.field8819 = false;
        this.field8813 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()V", line = 10)
    private final void method3531() {
        this.field8817.method1081(this.field8812);
        while (!this.field8819 && this.field8813) {
            if (this.field8816 == null || this.field8816.method3355((byte) -35)) {
                this.field8815 = false;
                this.field8811 = class419.field5505.method43(-127);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field8815 = true;
                class631 var1 = this.field8816.method3351(true);
                if (var1 instanceof class27) {
                    class27 var2 = (class27) var1;
                    if (var2.field389) {
                        var2.method177(class377.field4985, true);
                    } else {
                        class45.method243(var2, this.field8818);
                        if (class17.field222 != null) {
                            class17.field222.method2316(var2.field390, -256, var2.field384, this.field8816.field8415, -16777216, 0);
                        }
                    }
                } else {
                    int var3 = ((class151) var1).field2072;
                    if (var3 >= 1 && var3 <= 4) {
                        class270 var4 = class246.field3214[var3 - 1];
                        for (int var5 = 0; var5 < class312.field4204 + class312.field4204; var5++) {
                            for (int var6 = 0; var6 < class312.field4204 + class312.field4204; var6++) {
                                if (class591.field8150[var3 - 1][var5][var6]) {
                                    int var7 = class501.field6888 + var5 - class312.field4204;
                                    int var8 = class377.field4997 + var6 - class312.field4204;
                                    if (var7 >= 0 && var7 < var4.field3524 && var8 >= 0 && var8 < var4.field3525) {
                                        class377.field4985.method1118(var7 << class62.field762, var4.method1611(var7, true, var8), var8 << class62.field762, this.field8814);
                                        if (class306.method1795(this.field8814[0]) == this.field8812 - 1) {
                                            var4.method1364(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field8817.method1082(this.field8812);
        while (this.field8819 && this.field8813) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()J", line = 107)
    public final long method3532() {
        return this.field8811;
    }

    @OriginalMember(owner = "client!ui", name = "run", descriptor = "()V", line = 110)
    public final void run() {
        while (this.field8813) {
            this.method3531();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lsf;)V", line = 121)
    public final void method3533(class602 arg0) {
        if (this.field8816 != null) {
            this.field8816.method3354((byte) -42, null);
        }
        this.field8816 = arg0;
        if (this.field8816 != null) {
            this.field8816.method3354((byte) -42, this);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()V", line = 130)
    public final void method3534() {
        this.field8819 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "()Z", line = 143)
    public final boolean method3535() {
        return this.field8816 == null || !this.field8815 && this.field8816.method3355((byte) -35);
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "()V", line = 148)
    public final void method3536() {
        this.field8819 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(ILr;)V", line = 168)
    public class638(int arg0, class562 arg1) {
        this.field8812 = arg0;
        this.field8817 = arg1;
    }
}
