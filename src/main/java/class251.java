import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "[Lgga;")
    private class332[] field3082 = new class332[8];

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "[I")
    private int[] field3083 = new int[3];

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Z")
    private volatile boolean field3084 = true;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "Z")
    private volatile boolean field3085 = true;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
    private volatile boolean field3078 = false;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Lr;")
    private class566 field3080;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "J")
    private long field3079;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Ldda;")
    private class652 field3086;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "()V")
    public final void method1469() {
        this.field3084 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ldda;)V")
    public final void method1470(class652 arg0) {
        if (this.field3086 != null) {
            this.field3086.method3661(-77, null);
        }
        this.field3086 = arg0;
        if (this.field3086 != null) {
            this.field3086.method3661(-97, this);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "()V")
    public final void method1471() {
        this.field3084 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "()Z")
    public final boolean method1472() {
        return this.field3086 == null || !this.field3078 && this.field3086.method3662(73);
    }

    @OriginalMember(owner = "client!wda", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3085) {
            this.method1473();
        }
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "()V")
    private final void method1473() {
        this.field3080.method1040(this.field3081);
        while (!this.field3084 && this.field3085) {
            if (this.field3086 == null || this.field3086.method3662(116)) {
                this.field3078 = false;
                this.field3079 = class46.field612.method784(false);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field3078 = true;
                class569 var1 = this.field3086.method3659(121);
                if (var1 instanceof class488) {
                    class488 var2 = (class488) var1;
                    if (var2.field6457) {
                        var2.method67(false, class590.field8291);
                    } else {
                        class347.method1923(var2, this.field3082);
                        if (class571.field7980 != null) {
                            class571.field7980.method2192(-256, true, var2.field6462, this.field3086.field9206, -16777216, var2.field6463);
                        }
                    }
                } else {
                    int var3 = ((class545) var1).field7265;
                    if (var3 >= 1 && var3 <= 4) {
                        class272 var4 = class491.field6485[var3 - 1];
                        for (int var5 = 0; var5 < class479.field6372 + class479.field6372; var5++) {
                            for (int var6 = 0; var6 < class479.field6372 + class479.field6372; var6++) {
                                if (class396.field4999[var3 - 1][var5][var6]) {
                                    int var7 = class516.field7041 + var5 - class479.field6372;
                                    int var8 = class204.field2599 + var6 - class479.field6372;
                                    if (var7 >= 0 && var7 < var4.field3441 && var8 >= 0 && var8 < var4.field3440) {
                                        class590.field8291.method991(var7 << class52.field775, var4.method1562(var8, (byte) 51, var7), var8 << class52.field775, this.field3083);
                                        if (class52.method334(this.field3083[0]) == this.field3081 - 1) {
                                            var4.method1282(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field3080.method973(this.field3081);
        while (this.field3084 && this.field3085) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "()J")
    public final long method1474() {
        return this.field3079;
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "()V")
    public final void method1475() {
        this.field3084 = false;
        this.field3085 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(ILr;)V")
    public class251(int arg0, class566 arg1) {
        this.field3081 = arg0;
        this.field3080 = arg1;
    }
}
