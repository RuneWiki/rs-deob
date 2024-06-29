import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class770 implements Runnable {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Z")
    private volatile boolean field10576 = true;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
    private volatile boolean field10573 = true;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
    private volatile boolean field10574 = false;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[I")
    private int[] field10581 = new int[3];

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[Lqm;")
    private class154[] field10580 = new class154[8];

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    private int field10578;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lha;")
    private class65 field10579;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "J")
    private long field10577;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lgs;")
    private class49 field10575;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 3)
    public final void method4243() {
        this.field10576 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!fl", name = "run", descriptor = "()V", line = 9)
    public final void run() {
        while (this.field10573) {
            this.method4248();
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()J", line = 20)
    public final long method4244() {
        return this.field10577;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lgs;)V", line = 23)
    public final void method4245(class49 arg0) {
        if (this.field10575 != null) {
            this.field10575.method351(0, null);
        }
        this.field10575 = arg0;
        if (this.field10575 != null) {
            this.field10575.method351(0, this);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class770(int arg0, class65 arg1) {
        this.field10578 = arg0;
        this.field10579 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()V", line = 41)
    public final void method4246() {
        this.field10576 = false;
        this.field10573 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "()V", line = 48)
    public final void method4247() {
        this.field10576 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "()V", line = 54)
    private final void method4248() {
        this.field10579.method519(this.field10578);
        while (!this.field10576 && this.field10573) {
            if (this.field10575 == null || this.field10575.method348(61)) {
                this.field10574 = false;
                this.field10577 = class94.field1071.method1512(108);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field10574 = true;
                class571 var1 = this.field10575.method345(true);
                if (var1 instanceof class421) {
                    class421 var2 = (class421) var1;
                    if (var2.field5751) {
                        var2.method912(78, class228.field3494);
                    } else {
                        class489.method2918(var2, this.field10580);
                        if (class679.field9437 != null) {
                            class679.field9437.method563(this.field10575.field618, (byte) 100, -256, -16777216, var2.field5745, var2.field5757);
                        }
                    }
                } else {
                    int var3 = ((class109) var1).field1609;
                    if (var3 >= 1 && var3 <= 4) {
                        class294 var4 = class208.field3219[var3 - 1];
                        for (int var5 = 0; var5 < class259.field3820 + class259.field3820; var5++) {
                            for (int var6 = 0; var6 < class259.field3820 + class259.field3820; var6++) {
                                if (class631.field8875[var3 - 1][var5][var6]) {
                                    int var7 = class276.field4007 + var5 - class259.field3820;
                                    int var8 = class296.field4301 + var6 - class259.field3820;
                                    if (var7 >= 0 && var7 < var4.field4289 && var8 >= 0 && var8 < var4.field4290) {
                                        class228.field3494.method474(var7 << class645.field9018, var4.method1904(var8, (byte) 56, var7), var8 << class645.field9018, this.field10581);
                                        if (class765.method4235(this.field10581[0]) == this.field10578 - 1) {
                                            var4.method1917(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field10579.method471(this.field10578);
        while (this.field10576 && this.field10573) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "()Z", line = 151)
    public final boolean method4249() {
        return this.field10575 == null || !this.field10574 && this.field10575.method348(116);
    }
}
