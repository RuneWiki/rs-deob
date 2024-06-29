import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class589 implements Runnable {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "[I")
    private int[] field8325 = new int[3];

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "[Leq;")
    private class670[] field8331 = new class670[8];

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Z")
    private volatile boolean field8333 = true;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Z")
    private volatile boolean field8326 = true;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
    private volatile boolean field8328 = false;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    private int field8327;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lr;")
    private class564 field8329;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "J")
    private long field8330;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Llda;")
    private class204 field8332;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "()V", line = 3)
    public final void method3318() {
        this.field8333 = false;
        this.field8326 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "()V", line = 10)
    private final void method3319() {
        this.field8329.method1018(this.field8327);
        while (!this.field8333 && this.field8326) {
            if (this.field8332 == null || this.field8332.method1215((byte) 97)) {
                this.field8328 = false;
                this.field8330 = class539.field7588.method320((byte) 56);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field8328 = true;
                class321 var1 = this.field8332.method1222(0);
                if (var1 instanceof class383) {
                    class383 var2 = (class383) var1;
                    if (var2.field5180) {
                        var2.method172(class568.field8078, false);
                    } else {
                        class193.method1173(var2, this.field8331);
                        if (class653.field9162 != null) {
                            class653.field9162.method2318(this.field8332.field2415, -16777216, var2.field5173, 0, -256, var2.field5174);
                        }
                    }
                } else {
                    int var3 = ((class105) var1).field1134;
                    if (var3 >= 1 && var3 <= 4) {
                        class274 var4 = class156.field1743[var3 - 1];
                        for (int var5 = 0; var5 < class460.field6544 + class460.field6544; var5++) {
                            for (int var6 = 0; var6 < class460.field6544 + class460.field6544; var6++) {
                                if (class560.field7992[var3 - 1][var5][var6]) {
                                    int var7 = class309.field3830 + var5 - class460.field6544;
                                    int var8 = class379.field5139 + var6 - class460.field6544;
                                    if (var7 >= 0 && var7 < var4.field3428 && var8 >= 0 && var8 < var4.field3426) {
                                        class568.field8078.method970(var7 << class559.field7984, var4.method1608(var8, 840, var7), var8 << class559.field7984, this.field8325);
                                        if (class70.method366(this.field8325[0]) == this.field8327 - 1) {
                                            var4.method383(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field8329.method942(this.field8327);
        while (this.field8333 && this.field8326) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "run", descriptor = "()V", line = 109)
    public final void run() {
        while (this.field8326) {
            this.method3319();
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "()V", line = 119)
    public final void method3320() {
        this.field8333 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "()V", line = 127)
    public final void method3321() {
        this.field8333 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Llda;)V", line = 137)
    public final void method3322(class204 arg0) {
        if (this.field8332 != null) {
            this.field8332.method1223(-1, null);
        }
        this.field8332 = arg0;
        if (this.field8332 != null) {
            this.field8332.method1223(-1, this);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILr;)V", line = 168)
    public class589(int arg0, class564 arg1) {
        this.field8327 = arg0;
        this.field8329 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "()Z", line = 149)
    public final boolean method3323() {
        return this.field8332 == null || !this.field8328 && this.field8332.method1215((byte) 107);
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "()J", line = 156)
    public final long method3324() {
        return this.field8330;
    }
}
