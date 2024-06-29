import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class699 implements Runnable {

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[I")
    private int[] field9822 = new int[3];

    @OriginalMember(owner = "client!no", name = "i", descriptor = "[Lbh;")
    private class36[] field9826 = new class36[8];

    @OriginalMember(owner = "client!no", name = "h", descriptor = "Z")
    private volatile boolean field9825 = true;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Z")
    private volatile boolean field9820 = true;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Z")
    private volatile boolean field9821 = false;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    private int field9818;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lha;")
    private class58 field9824;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "J")
    private long field9823;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Lfb;")
    private class671 field9819;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()J", line = 3)
    public final long method3925() {
        return this.field9823;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V", line = 8)
    public final void method3926() {
        this.field9825 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "()V", line = 18)
    public final void method3927() {
        this.field9825 = false;
        this.field9820 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class699(int arg0, class58 arg1) {
        this.field9818 = arg0;
        this.field9824 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfb;)V", line = 29)
    public final void method3928(class671 arg0) {
        if (this.field9819 != null) {
            this.field9819.method3790(null, (byte) 119);
        }
        this.field9819 = arg0;
        if (this.field9819 != null) {
            this.field9819.method3790(this, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "()Z", line = 38)
    public final boolean method3929() {
        return this.field9819 == null || !this.field9821 && this.field9819.method3792(116);
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "()V", line = 41)
    public final void method3930() {
        this.field9825 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!no", name = "run", descriptor = "()V", line = 47)
    public final void run() {
        while (this.field9820) {
            this.method3931();
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "()V", line = 63)
    private final void method3931() {
        this.field9824.method527(this.field9818);
        while (!this.field9825 && this.field9820) {
            if (this.field9819 == null || this.field9819.method3792(114)) {
                this.field9821 = false;
                this.field9823 = class105.field1752.method1796(-26211);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field9821 = true;
                class105 var1 = this.field9819.method3787((byte) -116);
                if (var1 instanceof class43) {
                    class43 var2 = (class43) var1;
                    if (var2.field656) {
                        var2.method401((byte) -39, class497.field7089);
                    } else {
                        class67.method707(var2, this.field9826);
                        if (class21.field268 != null) {
                            class21.field268.method665(var2.field652, this.field9819.field9404, -16777216, var2.field655, -16777216, -256);
                        }
                    }
                } else {
                    int var3 = ((class266) var1).field3862;
                    if (var3 >= 1 && var3 <= 4) {
                        class278 var4 = class138.field2153[var3 - 1];
                        for (int var5 = 0; var5 < class235.field3337 + class235.field3337; var5++) {
                            for (int var6 = 0; var6 < class235.field3337 + class235.field3337; var6++) {
                                if (class705.field9867[var3 - 1][var5][var6]) {
                                    int var7 = class155.field2331 + var5 - class235.field3337;
                                    int var8 = class214.field3065 + var6 - class235.field3337;
                                    if (var7 >= 0 && var7 < var4.field3924 && var8 >= 0 && var8 < var4.field3914) {
                                        class497.field7089.method592(var7 << class440.field6142, var4.method1825(var8, -128, var7), var8 << class440.field6142, this.field9822);
                                        if (class63.method678(this.field9822[0]) == this.field9818 - 1) {
                                            var4.method1077(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field9824.method570(this.field9818);
        while (this.field9825 && this.field9820) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }
}
