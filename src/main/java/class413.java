import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class413 implements Runnable {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
    private int[] field5829 = new int[3];

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
    private volatile boolean field5835 = true;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[Lpk;")
    private class621[] field5830 = new class621[8];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
    private volatile boolean field5828 = true;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Z")
    private volatile boolean field5832 = false;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    private int field5834;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lha;")
    private class454 field5833;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "J")
    private long field5827;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Ldc;")
    private class323 field5831;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 3)
    public final void method2446() {
        this.field5835 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()Z", line = 11)
    public final boolean method2447() {
        return this.field5831 == null || !this.field5832 && this.field5831.method1905(false);
    }

    @OriginalMember(owner = "client!ol", name = "run", descriptor = "()V", line = 16)
    public final void run() {
        while (this.field5828) {
            this.method2451();
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()J", line = 26)
    public final long method2448() {
        return this.field5827;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class413(int arg0, class454 arg1) {
        this.field5834 = arg0;
        this.field5833 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "()V", line = 34)
    public final void method2449() {
        this.field5835 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "()V", line = 41)
    public final void method2450() {
        this.field5835 = false;
        this.field5828 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "()V", line = 54)
    private final void method2451() {
        this.field5833.method112(this.field5834);
        while (!this.field5835 && this.field5828) {
            if (this.field5831 == null || this.field5831.method1905(false)) {
                this.field5832 = false;
                this.field5827 = class424.field6044.method557(-1);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field5832 = true;
                class696 var1 = this.field5831.method1908((byte) -6);
                if (var1 instanceof class410) {
                    class410 var2 = (class410) var1;
                    if (var2.field5788) {
                        var2.method522(false, class618.field8660);
                    } else {
                        class275.method1649(var2, this.field5830);
                        if (class738.field10331 != null) {
                            class738.field10331.method2505(-256, -16777216, this.field5831.field4124, var2.field5781, var2.field5782, 255);
                        }
                    }
                } else {
                    int var3 = ((class560) var1).field7822;
                    if (var3 >= 1 && var3 <= 4) {
                        class402 var4 = class517.field7282[var3 - 1];
                        for (int var5 = 0; var5 < class267.field3381 + class267.field3381; var5++) {
                            for (int var6 = 0; var6 < class267.field3381 + class267.field3381; var6++) {
                                if (class228.field2986[var3 - 1][var5][var6]) {
                                    int var7 = class337.field4349 + var5 - class267.field3381;
                                    int var8 = class561.field7852 + var6 - class267.field3381;
                                    if (var7 >= 0 && var7 < var4.field5569 && var8 >= 0 && var8 < var4.field5562) {
                                        class618.field8660.method162(var7 << class455.field6383, var4.method2381(-94, var7, var8), var8 << class455.field6383, this.field5829);
                                        if (class87.method606(this.field5829[0]) == this.field5834 - 1) {
                                            var4.method549(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field5833.method82(this.field5834);
        while (this.field5835 && this.field5828) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ldc;)V", line = 160)
    public final void method2452(class323 arg0) {
        if (this.field5831 != null) {
            this.field5831.method1910(null, (byte) -102);
        }
        this.field5831 = arg0;
        if (this.field5831 != null) {
            this.field5831.method1910(this, (byte) -62);
        }
    }
}
