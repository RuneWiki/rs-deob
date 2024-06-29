import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class402 implements Runnable {

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
    private volatile boolean field5820 = true;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Z")
    private volatile boolean field5819 = true;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "[I")
    private int[] field5822 = new int[3];

    @OriginalMember(owner = "client!st", name = "d", descriptor = "Z")
    private volatile boolean field5821 = false;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "[Lff;")
    private class9[] field5826 = new class9[8];

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    private int field5823;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lr;")
    private class167 field5825;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "J")
    private long field5824;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ldq;")
    private class650 field5818;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "()J")
    public final long method2455() {
        return this.field5824;
    }

    @OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field5819) {
            this.method2460();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ldq;)V")
    public final void method2456(class650 arg0) {
        if (this.field5818 != null) {
            this.field5818.method3710(null, -126);
        }
        this.field5818 = arg0;
        if (this.field5818 != null) {
            this.field5818.method3710(this, 12);
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "()Z")
    public final boolean method2457() {
        return this.field5818 == null || !this.field5821 && this.field5818.method3713(-127);
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "()V")
    public final void method2458() {
        this.field5820 = false;
        this.field5819 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "()V")
    public final void method2459() {
        this.field5820 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "()V")
    private final void method2460() {
        this.field5825.method134(this.field5823);
        while (!this.field5820 && this.field5819) {
            if (this.field5818 == null || this.field5818.method3713(-127)) {
                this.field5821 = false;
                this.field5824 = class436.field6300.method517((byte) 107);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field5821 = true;
                class177 var1 = this.field5818.method3716(-25560);
                if (var1 instanceof class697) {
                    class697 var2 = (class697) var1;
                    if (var2.field9810) {
                        var2.method463(false, class521.field7381);
                    } else {
                        class242.method1609(var2, this.field5826);
                        if (class330.field4825 != null) {
                            class330.field4825.method2558(this.field5818.field9376, var2.field9805, -256, var2.field9811, (byte) -127, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class632) var1).field9089;
                    if (var3 >= 1 && var3 <= 4) {
                        class37 var4 = class485.field6947[var3 - 1];
                        for (int var5 = 0; var5 < class643.field9239 + class643.field9239; var5++) {
                            for (int var6 = 0; var6 < class643.field9239 + class643.field9239; var6++) {
                                if (class309.field4555[var3 - 1][var5][var6]) {
                                    int var7 = class547.field7768 + var5 - class643.field9239;
                                    int var8 = class318.field4685 + var6 - class643.field9239;
                                    if (var7 >= 0 && var7 < var4.field1041 && var8 >= 0 && var8 < var4.field1043) {
                                        class521.field7381.method178(var7 << class30.field940, var4.method551(var7, var8, (byte) -101), var8 << class30.field940, this.field5822);
                                        if (class441.method2660(this.field5822[0]) == this.field5823 - 1) {
                                            var4.method545(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field5825.method64(this.field5823);
        while (this.field5820 && this.field5819) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "f", descriptor = "()V")
    public final void method2461() {
        this.field5820 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILr;)V")
    public class402(int arg0, class167 arg1) {
        this.field5823 = arg0;
        this.field5825 = arg1;
    }
}
