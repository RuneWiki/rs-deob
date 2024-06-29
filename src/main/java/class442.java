import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class442 implements Runnable {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "[I")
    private int[] field6303 = new int[3];

    @OriginalMember(owner = "client!un", name = "e", descriptor = "[Ljw;")
    private class578[] field6305 = new class578[8];

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Z")
    private volatile boolean field6306 = true;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
    private volatile boolean field6301 = true;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
    private volatile boolean field6308 = false;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lha;")
    private class66 field6304;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "J")
    private long field6307;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Ltt;")
    private class100 field6302;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
    public final void method2664() {
        this.field6306 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
    public final void method2665() {
        this.field6306 = false;
        this.field6301 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()V")
    public final void method2666() {
        this.field6306 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
    private final void method2667() {
        this.field6304.method441(this.field6309);
        while (!this.field6306 && this.field6301) {
            if (this.field6302 == null || this.field6302.method697(2)) {
                this.field6308 = false;
                this.field6307 = class458.field6568.method274((byte) 80);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field6308 = true;
                class76 var1 = this.field6302.method705((byte) -69);
                if (var1 instanceof class547) {
                    class547 var2 = (class547) var1;
                    if (var2.field7720) {
                        var2.method257(class711.field10005, 124);
                    } else {
                        class547.method3183(var2, this.field6305);
                        if (class220.field3134 != null) {
                            class220.field3134.method529(var2.field7717, this.field6302.field1262, (byte) -45, var2.field7712, -16777216, -256);
                        }
                    }
                } else {
                    int var3 = ((class313) var1).field4648;
                    if (var3 >= 1 && var3 <= 4) {
                        class292 var4 = class622.field8777[var3 - 1];
                        for (int var5 = 0; var5 < class76.field1016 + class76.field1016; var5++) {
                            for (int var6 = 0; var6 < class76.field1016 + class76.field1016; var6++) {
                                if (class377.field5419[var3 - 1][var5][var6]) {
                                    int var7 = class282.field4335 + var5 - class76.field1016;
                                    int var8 = class301.field4521 + var6 - class76.field1016;
                                    if (var7 >= 0 && var7 < var4.field4420 && var8 >= 0 && var8 < var4.field4425) {
                                        class711.field10005.method407(var7 << class310.field4616, var4.method1976(var7, -1, var8), var8 << class310.field4616, this.field6303);
                                        if (class498.method2905(this.field6303[0]) == this.field6309 - 1) {
                                            var4.method1237(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field6304.method398(this.field6309);
        while (this.field6306 && this.field6301) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "()Z")
    public final boolean method2668() {
        return this.field6302 == null || !this.field6308 && this.field6302.method697(2);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ltt;)V")
    public final void method2669(class100 arg0) {
        if (this.field6302 != null) {
            this.field6302.method699(null, true);
        }
        this.field6302 = arg0;
        if (this.field6302 != null) {
            this.field6302.method699(this, true);
        }
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "()J")
    public final long method2670() {
        return this.field6307;
    }

    @OriginalMember(owner = "client!un", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6301) {
            this.method2667();
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(ILha;)V")
    public class442(int arg0, class66 arg1) {
        this.field6309 = arg0;
        this.field6304 = arg1;
    }
}
