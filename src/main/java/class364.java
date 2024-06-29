import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class364 implements Runnable {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "[Lkp;")
    private class515[] field4528 = new class515[8];

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Z")
    private volatile boolean field4529 = true;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Z")
    private volatile boolean field4533 = true;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "[I")
    private int[] field4535 = new int[3];

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Z")
    private volatile boolean field4532 = false;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Lha;")
    private class66 field4531;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "J")
    private long field4534;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "Lwu;")
    private class393 field4530;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "()V", line = 3)
    public final void method2123() {
        this.field4529 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "()V", line = 10)
    private final void method2124() {
        this.field4531.method605(this.field4536);
        while (!this.field4529 && this.field4533) {
            if (this.field4530 == null || this.field4530.method2301(true)) {
                this.field4532 = false;
                this.field4534 = class642.field8763.method679((byte) -100);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field4532 = true;
                class112 var1 = this.field4530.method2307((byte) -78);
                if (var1 instanceof class61) {
                    class61 var2 = (class61) var1;
                    if (var2.field807) {
                        var2.method500(class6.field80, -1);
                    } else {
                        class518.method3107(var2, this.field4528);
                        if (class301.field3607 != null) {
                            class301.field3607.method655(var2.field817, this.field4530.field5085, var2.field806, -256, -16777216, 62);
                        }
                    }
                } else {
                    int var3 = ((class291) var1).field3502;
                    if (var3 >= 1 && var3 <= 4) {
                        class296 var4 = class621.field8523[var3 - 1];
                        for (int var5 = 0; var5 < class573.field7852 + class573.field7852; var5++) {
                            for (int var6 = 0; var6 < class573.field7852 + class573.field7852; var6++) {
                                if (class617.field8308[var3 - 1][var5][var6]) {
                                    int var7 = class463.field6493 + var5 - class573.field7852;
                                    int var8 = class619.field8331 + var6 - class573.field7852;
                                    if (var7 >= 0 && var7 < var4.field3533 && var8 >= 0 && var8 < var4.field3524) {
                                        class6.field80.method570(var7 << class714.field10017, var4.method1728(var8, (byte) -61, var7), var8 << class714.field10017, this.field4535);
                                        if (class299.method1745(this.field4535[0]) == this.field4536 - 1) {
                                            var4.method1392(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field4531.method584(this.field4536);
        while (this.field4529 && this.field4533) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "()Z", line = 108)
    public final boolean method2125() {
        return this.field4530 == null || !this.field4532 && this.field4530.method2301(true);
    }

    @OriginalMember(owner = "client!afa", name = "run", descriptor = "()V", line = 111)
    public final void run() {
        while (this.field4533) {
            this.method2124();
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class364(int arg0, class66 arg1) {
        this.field4536 = arg0;
        this.field4531 = arg1;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lwu;)V", line = 125)
    public final void method2126(class393 arg0) {
        if (this.field4530 != null) {
            this.field4530.method2304(null, false);
        }
        this.field4530 = arg0;
        if (this.field4530 != null) {
            this.field4530.method2304(this, false);
        }
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "()V", line = 134)
    public final void method2127() {
        this.field4529 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "()V", line = 146)
    public final void method2128() {
        this.field4529 = false;
        this.field4533 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "()J", line = 163)
    public final long method2129() {
        return this.field4534;
    }
}
