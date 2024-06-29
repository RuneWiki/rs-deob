import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class750 implements Runnable {

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "[Llaa;")
    private class123[] field10475 = new class123[8];

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Z")
    private volatile boolean field10476 = true;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "[I")
    private int[] field10474 = new int[3];

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "Z")
    private volatile boolean field10477 = true;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "Z")
    private volatile boolean field10481 = false;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
    private int field10479;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "Lha;")
    private class60 field10480;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "J")
    private long field10478;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "Ljia;")
    private class619 field10482;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljia;)V")
    public final void method4172(class619 arg0) {
        if (this.field10482 != null) {
            this.field10482.method3456((byte) 7, null);
        }
        this.field10482 = arg0;
        if (this.field10482 != null) {
            this.field10482.method3456((byte) 9, this);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "()V")
    public final void method4173() {
        this.field10476 = false;
        this.field10477 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "()J")
    public final long method4174() {
        return this.field10478;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "()V")
    public final void method4175() {
        this.field10476 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "()V")
    private final void method4176() {
        this.field10480.method506(this.field10479);
        while (!this.field10476 && this.field10477) {
            if (this.field10482 == null || this.field10482.method3455((byte) -75)) {
                this.field10481 = false;
                this.field10478 = class161.field2219.method1327(-128);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field10481 = true;
                class681 var1 = this.field10482.method3453(true);
                if (var1 instanceof class435) {
                    class435 var2 = (class435) var1;
                    if (var2.field5799) {
                        var2.method744(class681.field9504, 0);
                    } else {
                        class299.method1792(var2, this.field10475);
                        if (class678.field9469 != null) {
                            class678.field9469.method555(-256, this.field10482.field8535, 0, -16777216, var2.field5803, var2.field5790);
                        }
                    }
                } else {
                    int var3 = ((class26) var1).field471;
                    if (var3 >= 1 && var3 <= 4) {
                        class282 var4 = class195.field2669[var3 - 1];
                        for (int var5 = 0; var5 < class593.field8294 + class593.field8294; var5++) {
                            for (int var6 = 0; var6 < class593.field8294 + class593.field8294; var6++) {
                                if (class499.field7027[var3 - 1][var5][var6]) {
                                    int var7 = class428.field5737 + var5 - class593.field8294;
                                    int var8 = class216.field2924 + var6 - class593.field8294;
                                    if (var7 >= 0 && var7 < var4.field3561 && var8 >= 0 && var8 < var4.field3555) {
                                        class681.field9504.method553(var7 << class480.field6531, var4.method1677(var8, (byte) 67, var7), var8 << class480.field6531, this.field10474);
                                        if (class269.method1601(this.field10474[0]) == this.field10479 - 1) {
                                            var4.method1678(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field10480.method433(this.field10479);
        while (this.field10476 && this.field10477) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "()Z")
    public final boolean method4177() {
        return this.field10482 == null || !this.field10481 && this.field10482.method3455((byte) -111);
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(ILha;)V")
    public class750(int arg0, class60 arg1) {
        this.field10479 = arg0;
        this.field10480 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field10477) {
            this.method4176();
        }
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "()V")
    public final void method4178() {
        this.field10476 = true;
        synchronized (this) {
            this.notify();
        }
    }
}
