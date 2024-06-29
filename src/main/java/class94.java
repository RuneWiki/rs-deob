import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class94 implements Runnable {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    private int[] field1294 = new int[3];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Z")
    private volatile boolean field1296 = true;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[Ltj;")
    private class687[] field1295 = new class687[8];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    private volatile boolean field1297 = true;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
    private volatile boolean field1292 = false;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lha;")
    private class548 field1290;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "J")
    private long field1291;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Loi;")
    private class699 field1298;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method631() {
        this.field1296 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1297) {
            this.method635();
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()Z")
    public final boolean method632() {
        return this.field1298 == null || !this.field1292 && this.field1298.method3953(0);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()V")
    public final void method633() {
        this.field1296 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()J")
    public final long method634() {
        return this.field1291;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "()V")
    private final void method635() {
        this.field1290.method1540(this.field1293);
        while (!this.field1296 && this.field1297) {
            if (this.field1298 == null || this.field1298.method3953(0)) {
                this.field1292 = false;
                this.field1291 = class720.field10021.method2129(true);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field1292 = true;
                class498 var1 = this.field1298.method3951(0);
                if (var1 instanceof class318) {
                    class318 var2 = (class318) var1;
                    if (var2.field4414) {
                        var2.method659(false, class441.field6132);
                    } else {
                        class214.method1265(var2, this.field1295);
                        if (class320.field4451 != null) {
                            class320.field4451.method2505(var2.field4417, -122, -16777216, this.field1298.field9763, -256, var2.field4415);
                        }
                    }
                } else {
                    int var3 = ((class488) var1).field6819;
                    if (var3 >= 1 && var3 <= 4) {
                        class341 var4 = class433.field6043[var3 - 1];
                        for (int var5 = 0; var5 < class218.field2854 + class218.field2854; var5++) {
                            for (int var6 = 0; var6 < class218.field2854 + class218.field2854; var6++) {
                                if (class172.field2387[var3 - 1][var5][var6]) {
                                    int var7 = class103.field1410 + var5 - class218.field2854;
                                    int var8 = class307.field4314 + var6 - class218.field2854;
                                    if (var7 >= 0 && var7 < var4.field4814 && var8 >= 0 && var8 < var4.field4817) {
                                        class441.field6132.method1424(var7 << class371.field5241, var4.method2171(var8, var7, 31), var8 << class371.field5241, this.field1294);
                                        if (class573.method3357(this.field1294[0]) == this.field1293 - 1) {
                                            var4.method1026(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field1290.method1492(this.field1293);
        while (this.field1296 && this.field1297) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Loi;)V")
    public final void method636(class699 arg0) {
        if (this.field1298 != null) {
            this.field1298.method3957(null, (byte) -120);
        }
        this.field1298 = arg0;
        if (this.field1298 != null) {
            this.field1298.method3957(this, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "()V")
    public final void method637() {
        this.field1296 = false;
        this.field1297 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(ILha;)V")
    public class94(int arg0, class548 arg1) {
        this.field1293 = arg0;
        this.field1290 = arg1;
    }
}
