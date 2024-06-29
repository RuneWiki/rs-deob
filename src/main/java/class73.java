import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class73 implements Runnable {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[I")
    private int[] field966 = new int[3];

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Lwi;")
    private class465[] field968 = new class465[8];

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Z")
    private volatile boolean field970 = true;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    private volatile boolean field965 = true;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    private volatile boolean field969 = false;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lha;")
    private class58 field972;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "J")
    private long field971;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ltc;")
    private class351 field967;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V", line = 3)
    public final void method594() {
        this.field970 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()V", line = 9)
    public final void method595() {
        this.field970 = false;
        this.field965 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()V", line = 18)
    private final void method596() {
        this.field972.method443(this.field973);
        while (!this.field970 && this.field965) {
            if (this.field967 == null || this.field967.method2267(121)) {
                this.field969 = false;
                this.field971 = class415.field5856.method2001(false);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field969 = true;
                class670 var1 = this.field967.method2263(true);
                if (var1 instanceof class105) {
                    class105 var2 = (class105) var1;
                    if (var2.field1262) {
                        var2.method753((byte) -74, class362.field5135);
                    } else {
                        class210.method1292(var2, this.field968);
                        if (class658.field9020 != null) {
                            class658.field9020.method498(var2.field1253, 173, -256, var2.field1267, this.field967.field4962, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class403) var1).field5709;
                    if (var3 >= 1 && var3 <= 4) {
                        class278 var4 = class459.field6474[var3 - 1];
                        for (int var5 = 0; var5 < class453.field6405 + class453.field6405; var5++) {
                            for (int var6 = 0; var6 < class453.field6405 + class453.field6405; var6++) {
                                if (class373.field5239[var3 - 1][var5][var6]) {
                                    int var7 = class136.field1982 + var5 - class453.field6405;
                                    int var8 = class481.field6801 + var6 - class453.field6405;
                                    if (var7 >= 0 && var7 < var4.field3935 && var8 >= 0 && var8 < var4.field3930) {
                                        class362.field5135.method446(var7 << class660.field9038, var4.method1816((byte) -85, var8, var7), var8 << class660.field9038, this.field966);
                                        if (class505.method2990(this.field966[0]) == this.field973 - 1) {
                                            var4.method1812(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field972.method416(this.field973);
        while (this.field970 && this.field965) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V", line = 115)
    public final void run() {
        while (this.field965) {
            this.method596();
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()J", line = 124)
    public final long method597() {
        return this.field971;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ltc;)V", line = 129)
    public final void method598(class351 arg0) {
        if (this.field967 != null) {
            this.field967.method2268(null, false);
        }
        this.field967 = arg0;
        if (this.field967 != null) {
            this.field967.method2268(this, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class73(int arg0, class58 arg1) {
        this.field973 = arg0;
        this.field972 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "()Z", line = 157)
    public final boolean method599() {
        return this.field967 == null || !this.field969 && this.field967.method2267(126);
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "()V", line = 163)
    public final void method600() {
        this.field970 = false;
        synchronized (this) {
            this.notify();
        }
    }
}
