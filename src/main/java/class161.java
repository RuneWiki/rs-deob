import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class161 implements Runnable {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    private int[] field2324 = new int[3];

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[Ltw;")
    private class186[] field2327 = new class186[8];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Z")
    private volatile boolean field2323 = true;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Z")
    private volatile boolean field2325 = true;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
    private volatile boolean field2322 = false;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lr;")
    private class166 field2330;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "J")
    private long field2329;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lkea;")
    private class216 field2328;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lkea;)V", line = 3)
    public final void method1133(class216 arg0) {
        if (this.field2328 != null) {
            this.field2328.method1390(0, null);
        }
        this.field2328 = arg0;
        if (this.field2328 != null) {
            this.field2328.method1390(0, this);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 12)
    public final void method1134() {
        this.field2323 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V", line = 22)
    private final void method1135() {
        this.field2330.method173(this.field2326);
        while (!this.field2323 && this.field2325) {
            if (this.field2328 == null || this.field2328.method1387(-75)) {
                this.field2322 = false;
                this.field2329 = class10.field95.method1292(-87);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field2322 = true;
                class546 var1 = this.field2328.method1389(107);
                if (var1 instanceof class295) {
                    class295 var2 = (class295) var1;
                    if (var2.field4048) {
                        var2.method220(class401.field5619, true);
                    } else {
                        class527.method3002(var2, this.field2327);
                        if (class469.field6441 != null) {
                            class469.field6441.method2423(this.field2328.field3048, var2.field4039, false, -256, var2.field4055, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class118) var1).field1596;
                    if (var3 >= 1 && var3 <= 4) {
                        class37 var4 = class409.field5812[var3 - 1];
                        for (int var5 = 0; var5 < class36.field428 + class36.field428; var5++) {
                            for (int var6 = 0; var6 < class36.field428 + class36.field428; var6++) {
                                if (class598.field8354[var3 - 1][var5][var6]) {
                                    int var7 = class167.field2435 + var5 - class36.field428;
                                    int var8 = class353.field4699 + var6 - class36.field428;
                                    if (var7 >= 0 && var7 < var4.field446 && var8 >= 0 && var8 < var4.field438) {
                                        class401.field5619.method154(var7 << class588.field8259, var4.method332(var8, 1, var7), var8 << class588.field8259, this.field2324);
                                        if (class409.method2385(this.field2324[0]) == this.field2326 - 1) {
                                            var4.method321(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field2330.method159(this.field2326);
        while (this.field2323 && this.field2325) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILr;)V", line = 168)
    public class161(int arg0, class166 arg1) {
        this.field2326 = arg0;
        this.field2330 = arg1;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V", line = 122)
    public final void method1136() {
        this.field2323 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()J", line = 132)
    public final long method1137() {
        return this.field2329;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()Z", line = 135)
    public final boolean method1138() {
        return this.field2328 == null || !this.field2322 && this.field2328.method1387(55);
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()V", line = 141)
    public final void method1139() {
        this.field2323 = false;
        this.field2325 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ei", name = "run", descriptor = "()V", line = 148)
    public final void run() {
        while (this.field2325) {
            this.method1135();
        }
    }
}
