import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class538 implements Runnable {

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Z")
    private volatile boolean field7532 = true;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Z")
    private volatile boolean field7533 = true;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "Z")
    private volatile boolean field7531 = false;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "[Lrc;")
    private class498[] field7534 = new class498[8];

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
    private int[] field7535 = new int[3];

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Lr;")
    private class166 field7536;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "J")
    private long field7530;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Liq;")
    private class562 field7528;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
    public final void method3053() {
        this.field7532 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "()V")
    public final void method3054() {
        this.field7532 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "()Z")
    public final boolean method3055() {
        return this.field7528 == null || !this.field7531 && this.field7528.method3211(109);
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "()J")
    public final long method3056() {
        return this.field7530;
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "()V")
    public final void method3057() {
        this.field7532 = false;
        this.field7533 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Liq;)V")
    public final void method3058(class562 arg0) {
        if (this.field7528 != null) {
            this.field7528.method3207(127, null);
        }
        this.field7528 = arg0;
        if (this.field7528 != null) {
            this.field7528.method3207(127, this);
        }
    }

    @OriginalMember(owner = "client!ht", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field7533) {
            this.method3059();
        }
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "()V")
    private final void method3059() {
        this.field7536.method135(this.field7529);
        while (!this.field7532 && this.field7533) {
            if (this.field7528 == null || this.field7528.method3211(106)) {
                this.field7531 = false;
                this.field7530 = class568.field7988.method426(false);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field7531 = true;
                class609 var1 = this.field7528.method3208(92);
                if (var1 instanceof class215) {
                    class215 var2 = (class215) var1;
                    if (var2.field3030) {
                        var2.method1177(0, class682.field9618);
                    } else {
                        class295.method1858(var2, this.field7534);
                        if (class248.field3861 != null) {
                            class248.field3861.method2492(-256, this.field7528.field7909, var2.field3027, -16777216, (byte) -107, var2.field3025);
                        }
                    }
                } else {
                    int var3 = ((class484) var1).field6875;
                    if (var3 >= 1 && var3 <= 4) {
                        class37 var4 = class296.field4340[var3 - 1];
                        for (int var5 = 0; var5 < class196.field2802 + class196.field2802; var5++) {
                            for (int var6 = 0; var6 < class196.field2802 + class196.field2802; var6++) {
                                if (class691.field9724[var3 - 1][var5][var6]) {
                                    int var7 = class435.field6354 + var5 - class196.field2802;
                                    int var8 = class612.field8575 + var6 - class196.field2802;
                                    if (var7 >= 0 && var7 < var4.field631 && var8 >= 0 && var8 < var4.field632) {
                                        class682.field9618.method214(var7 << class310.field4593, var4.method432(var7, false, var8), var8 << class310.field4593, this.field7535);
                                        if (class71.method690(this.field7535[0]) == this.field7529 - 1) {
                                            var4.method439(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field7536.method163(this.field7529);
        while (this.field7532 && this.field7533) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILr;)V")
    public class538(int arg0, class166 arg1) {
        this.field7529 = arg0;
        this.field7536 = arg1;
    }
}
