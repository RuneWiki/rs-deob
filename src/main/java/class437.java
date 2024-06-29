import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class437 implements Runnable {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Z")
    private volatile boolean field6058 = true;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Z")
    private volatile boolean field6061 = true;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "[Lsca;")
    private class251[] field6063 = new class251[8];

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
    private int[] field6065 = new int[3];

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "Z")
    private volatile boolean field6066 = false;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    private int field6064;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "Lha;")
    private class473 field6062;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "J")
    private long field6060;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Lbka;")
    private class560 field6059;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
    public final void method2624() {
        this.field6058 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "()Z")
    public final boolean method2625() {
        return this.field6059 == null || !this.field6066 && this.field6059.method3304((byte) -128);
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "()J")
    public final long method2626() {
        return this.field6060;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lbka;)V")
    public final void method2627(class560 arg0) {
        if (this.field6059 != null) {
            this.field6059.method3300(true, null);
        }
        this.field6059 = arg0;
        if (this.field6059 != null) {
            this.field6059.method3300(true, this);
        }
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "()V")
    public final void method2628() {
        this.field6058 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "()V")
    private final void method2629() {
        this.field6062.method170(this.field6064);
        while (!this.field6058 && this.field6061) {
            if (this.field6059 == null || this.field6059.method3304((byte) -127)) {
                this.field6066 = false;
                this.field6060 = class416.field5805.method1803((byte) -74);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field6066 = true;
                class461 var1 = this.field6059.method3305(48);
                if (var1 instanceof class230) {
                    class230 var2 = (class230) var1;
                    if (var2.field3459) {
                        var2.method76(class139.field1781, -89);
                    } else {
                        class695.method3930(var2, this.field6063);
                        if (class221.field3032 != null) {
                            class221.field3032.method2653(var2.field3453, 120, -256, -16777216, var2.field3465, this.field6059.field7885);
                        }
                    }
                } else {
                    int var3 = ((class129) var1).field1673;
                    if (var3 >= 1 && var3 <= 4) {
                        class418 var4 = class661.field9303[var3 - 1];
                        for (int var5 = 0; var5 < class270.field3904 + class270.field3904; var5++) {
                            for (int var6 = 0; var6 < class270.field3904 + class270.field3904; var6++) {
                                if (class158.field2049[var3 - 1][var5][var6]) {
                                    int var7 = class591.field8336 + var5 - class270.field3904;
                                    int var8 = class112.field1363 + var6 - class270.field3904;
                                    if (var7 >= 0 && var7 < var4.field5827 && var8 >= 0 && var8 < var4.field5826) {
                                        class139.field1781.method196(var7 << class732.field10110, var4.method2525(var7, var8, (byte) 114), var8 << class732.field10110, this.field6065);
                                        if (class546.method3230(this.field6065[0]) == this.field6064 - 1) {
                                            var4.method1368(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field6062.method237(this.field6064);
        while (this.field6058 && this.field6061) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6061) {
            this.method2629();
        }
    }

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "()V")
    public final void method2630() {
        this.field6058 = false;
        this.field6061 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(ILha;)V")
    public class437(int arg0, class473 arg1) {
        this.field6064 = arg0;
        this.field6062 = arg1;
    }
}
