import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class710 implements Runnable {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    private volatile boolean field9378 = true;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Z")
    private volatile boolean field9385 = true;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "[Lgu;")
    private class757[] field9386 = new class757[8];

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Z")
    private volatile boolean field9379 = false;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "[I")
    private int[] field9382 = new int[3];

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    private int field9380;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "Lha;")
    private class570 field9384;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "J")
    private long field9381;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Lqia;")
    private class322 field9383;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
    private final void method3832() {
        this.field9384.method995(this.field9380);
        while (!this.field9378 && this.field9385) {
            if (this.field9383 == null || this.field9383.method1871(0)) {
                this.field9379 = false;
                this.field9381 = class506.field6473.method1568(127);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field9379 = true;
                class618 var1 = this.field9383.method1868(0);
                if (var1 instanceof class210) {
                    class210 var2 = (class210) var1;
                    if (var2.field2899) {
                        var2.method182(class398.field5275, -116);
                    } else {
                        class444.method2551(var2, this.field9386);
                        if (class28.field243 != null) {
                            class28.field243.method2419(var2.field2888, -256, this.field9383.field3991, -17, var2.field2898, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class273) var1).field3581;
                    if (var3 >= 1 && var3 <= 4) {
                        class358 var4 = class116.field1542[var3 - 1];
                        for (int var5 = 0; var5 < class76.field1069 + class76.field1069; var5++) {
                            for (int var6 = 0; var6 < class76.field1069 + class76.field1069; var6++) {
                                if (class301.field3804[var3 - 1][var5][var6]) {
                                    int var7 = class454.field5914 + var5 - class76.field1069;
                                    int var8 = class309.field3875 + var6 - class76.field1069;
                                    if (var7 >= 0 && var7 < var4.field4366 && var8 >= 0 && var8 < var4.field4371) {
                                        class398.field5275.method901(var7 << class88.field1221, var4.method2060(var8, -107, var7), var8 << class88.field1221, this.field9382);
                                        if (class343.method1994(this.field9382[0]) == this.field9380 - 1) {
                                            var4.method2062(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field9384.method982(this.field9380);
        while (this.field9378 && this.field9385) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public final void method3833() {
        this.field9378 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
    public final void method3834() {
        this.field9378 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "()J")
    public final long method3835() {
        return this.field9381;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lqia;)V")
    public final void method3836(class322 arg0) {
        if (this.field9383 != null) {
            this.field9383.method1869(null, 12843);
        }
        this.field9383 = arg0;
        if (this.field9383 != null) {
            this.field9383.method1869(this, 12843);
        }
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "()V")
    public final void method3837() {
        this.field9378 = false;
        this.field9385 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "()Z")
    public final boolean method3838() {
        return this.field9383 == null || !this.field9379 && this.field9383.method1871(0);
    }

    @OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field9385) {
            this.method3832();
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILha;)V")
    public class710(int arg0, class570 arg1) {
        this.field9380 = arg0;
        this.field9384 = arg1;
    }
}
