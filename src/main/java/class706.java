import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class706 implements Runnable {

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "[Ltg;")
    private class334[] field9991 = new class334[8];

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
    private volatile boolean field9992 = true;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "[I")
    private int[] field9989 = new int[3];

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Z")
    private volatile boolean field9995 = true;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
    private volatile boolean field9993 = false;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    private int field9988;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lr;")
    private class98 field9996;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "J")
    private long field9994;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lsu;")
    private class486 field9990;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()Z")
    public final boolean method3948() {
        return this.field9990 == null || !this.field9993 && this.field9990.method2778(true);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
    public final void method3949() {
        this.field9992 = false;
        this.field9995 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "()V")
    private final void method3950() {
        this.field9996.method665(this.field9988);
        while (!this.field9992 && this.field9995) {
            if (this.field9990 == null || this.field9990.method2778(true)) {
                this.field9993 = false;
                this.field9994 = class549.field8093.method1934((byte) -60);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field9993 = true;
                class50 var1 = this.field9990.method2779(2);
                if (var1 instanceof class538) {
                    class538 var2 = (class538) var1;
                    if (var2.field7898) {
                        var2.method259(class503.field7110, 11771);
                    } else {
                        class351.method2179(var2, this.field9991);
                        if (class125.field1832 != null) {
                            class125.field1832.method2447(var2.field7902, this.field9990.field6920, -256, 2, var2.field7906, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class638) var1).field9174;
                    if (var3 >= 1 && var3 <= 4) {
                        class682 var4 = class178.field2480[var3 - 1];
                        for (int var5 = 0; var5 < class176.field2466 + class176.field2466; var5++) {
                            for (int var6 = 0; var6 < class176.field2466 + class176.field2466; var6++) {
                                if (class60.field964[var3 - 1][var5][var6]) {
                                    int var7 = class361.field5293 + var5 - class176.field2466;
                                    int var8 = class545.field8045 + var6 - class176.field2466;
                                    if (var7 >= 0 && var7 < var4.field9628 && var8 >= 0 && var8 < var4.field9630) {
                                        class503.field7110.method620(var7 << class125.field1831, var4.method3822(var8, var7, 0), var8 << class125.field1831, this.field9989);
                                        if (class559.method3243(this.field9989[0]) == this.field9988 - 1) {
                                            var4.method2182(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field9996.method640(this.field9988);
        while (this.field9992 && this.field9995) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "()V")
    public final void method3951() {
        this.field9992 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "()J")
    public final long method3952() {
        return this.field9994;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "()V")
    public final void method3953() {
        this.field9992 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lsu;)V")
    public final void method3954(class486 arg0) {
        if (this.field9990 != null) {
            this.field9990.method2774(null, 99);
        }
        this.field9990 = arg0;
        if (this.field9990 != null) {
            this.field9990.method2774(this, 86);
        }
    }

    @OriginalMember(owner = "client!gq", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field9995) {
            this.method3950();
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILr;)V")
    public class706(int arg0, class98 arg1) {
        this.field9988 = arg0;
        this.field9996 = arg1;
    }
}
