import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
    private volatile boolean field2786 = true;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "[Luca;")
    private class540[] field2785 = new class540[8];

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "[I")
    private int[] field2789 = new int[3];

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "Z")
    private volatile boolean field2791 = true;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Z")
    private volatile boolean field2784 = false;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "Lha;")
    private class65 field2787;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "J")
    private long field2788;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "Liba;")
    private class556 field2790;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Liba;)V")
    public final void method1398(class556 arg0) {
        if (this.field2790 != null) {
            this.field2790.method3133(null, (byte) 80);
        }
        this.field2790 = arg0;
        if (this.field2790 != null) {
            this.field2790.method3133(this, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "()J")
    public final long method1399() {
        return this.field2788;
    }

    @OriginalMember(owner = "client!wfa", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2791) {
            this.method1404();
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "()V")
    public final void method1400() {
        this.field2786 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "()V")
    public final void method1401() {
        this.field2786 = false;
        this.field2791 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "()Z")
    public final boolean method1402() {
        return this.field2790 == null || !this.field2784 && this.field2790.method3137(-1);
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "()V")
    public final void method1403() {
        this.field2786 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "()V")
    private final void method1404() {
        this.field2787.method469(this.field2783);
        while (!this.field2786 && this.field2791) {
            if (this.field2790 == null || this.field2790.method3137(-1)) {
                this.field2784 = false;
                this.field2788 = class754.field10482.method1313((byte) 9);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field2784 = true;
                class503 var1 = this.field2790.method3134((byte) 98);
                if (var1 instanceof class167) {
                    class167 var2 = (class167) var1;
                    if (var2.field2243) {
                        var2.method32((byte) 84, class192.field2582);
                    } else {
                        class586.method3257(var2, this.field2785);
                        if (class644.field8947 != null) {
                            class644.field8947.method583((byte) 56, var2.field2251, -16777216, this.field2790.field7495, -256, var2.field2245);
                        }
                    }
                } else {
                    int var3 = ((class200) var1).field2659;
                    if (var3 >= 1 && var3 <= 4) {
                        class296 var4 = class528.field7227[var3 - 1];
                        for (int var5 = 0; var5 < class174.field2337 + class174.field2337; var5++) {
                            for (int var6 = 0; var6 < class174.field2337 + class174.field2337; var6++) {
                                if (class603.field8203[var3 - 1][var5][var6]) {
                                    int var7 = class331.field4776 + var5 - class174.field2337;
                                    int var8 = class76.field1102 + var6 - class174.field2337;
                                    if (var7 >= 0 && var7 < var4.field4301 && var8 >= 0 && var8 < var4.field4300) {
                                        class192.field2582.method551(var7 << class26.field388, var4.method1880(var7, false, var8), var8 << class26.field388, this.field2789);
                                        if (class566.method3164(this.field2789[0]) == this.field2783 - 1) {
                                            var4.method1140(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field2787.method493(this.field2783);
        while (this.field2786 && this.field2791) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(ILha;)V")
    public class211(int arg0, class65 arg1) {
        this.field2783 = arg0;
        this.field2787 = arg1;
    }
}
