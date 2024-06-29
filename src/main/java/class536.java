import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class536 implements Runnable {

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "[Lul;")
    private class530[] field7807 = new class530[8];

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Z")
    private volatile boolean field7805 = true;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "[I")
    private int[] field7811 = new int[3];

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Z")
    private volatile boolean field7806 = true;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Z")
    private volatile boolean field7812 = false;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    private int field7813;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Lr;")
    private class165 field7809;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "J")
    private long field7810;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Lgp;")
    private class45 field7808;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lgp;)V")
    public final void method3148(class45 arg0) {
        if (this.field7808 != null) {
            this.field7808.method536(null, false);
        }
        this.field7808 = arg0;
        if (this.field7808 != null) {
            this.field7808.method536(this, false);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
    private final void method3149() {
        this.field7809.method222(this.field7813);
        while (!this.field7805 && this.field7806) {
            if (this.field7808 == null || this.field7808.method531(120)) {
                this.field7812 = false;
                this.field7810 = class604.field8711.method796(false);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field7812 = true;
                class426 var1 = this.field7808.method537(115);
                if (var1 instanceof class20) {
                    class20 var2 = (class20) var1;
                    if (var2.field538) {
                        var2.method162(class298.field4017, false);
                    } else {
                        class558.method3261(var2, this.field7807);
                        if (class68.field1052 != null) {
                            class68.field1052.method2515(-16777216, 0, -256, this.field7808.field809, var2.field537, var2.field534);
                        }
                    }
                } else {
                    int var3 = ((class503) var1).field7018;
                    if (var3 >= 1 && var3 <= 4) {
                        class37 var4 = class155.field1899[var3 - 1];
                        for (int var5 = 0; var5 < class119.field1526 + class119.field1526; var5++) {
                            for (int var6 = 0; var6 < class119.field1526 + class119.field1526; var6++) {
                                if (class504.field7036[var3 - 1][var5][var6]) {
                                    int var7 = class591.field8564 + var5 - class119.field1526;
                                    int var8 = class33.field663 + var6 - class119.field1526;
                                    if (var7 >= 0 && var7 < var4.field702 && var8 >= 0 && var8 < var4.field706) {
                                        class298.field4017.method322(var7 << class295.field3981, var4.method437(116, var8, var7), var8 << class295.field3981, this.field7811);
                                        if (class474.method2786(this.field7811[0]) == this.field7813 - 1) {
                                            var4.method424(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field7809.method307(this.field7813);
        while (this.field7805 && this.field7806) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "()V")
    public final void method3150() {
        this.field7805 = false;
        this.field7806 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "()V")
    public final void method3151() {
        this.field7805 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "()V")
    public final void method3152() {
        this.field7805 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "()J")
    public final long method3153() {
        return this.field7810;
    }

    @OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field7806) {
            this.method3149();
        }
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "()Z")
    public final boolean method3154() {
        return this.field7808 == null || !this.field7812 && this.field7808.method531(-75);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILr;)V")
    public class536(int arg0, class165 arg1) {
        this.field7813 = arg0;
        this.field7809 = arg1;
    }
}
