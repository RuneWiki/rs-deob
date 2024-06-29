import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class181 implements Runnable {

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Z")
    private volatile boolean field2860 = true;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Z")
    private volatile boolean field2855 = true;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
    private volatile boolean field2862 = false;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
    private int[] field2856 = new int[3];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[Lam;")
    private class289[] field2857 = new class289[8];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lr;")
    private class98 field2861;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "J")
    private long field2863;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Llr;")
    private class312 field2859;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 3)
    public final void method1303() {
        this.field2860 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V", line = 12)
    private final void method1304() {
        this.field2861.method807(this.field2858);
        while (!this.field2860 && this.field2855) {
            if (this.field2859 == null || this.field2859.method1889((byte) -81)) {
                this.field2862 = false;
                this.field2863 = class233.field3451.method610(13221);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field2862 = true;
                class600 var1 = this.field2859.method1883(111);
                if (var1 instanceof class204) {
                    class204 var2 = (class204) var1;
                    if (var2.field3159) {
                        var2.method625(71, class490.field7029);
                    } else {
                        class564.method3304(var2, this.field2857);
                        if (class662.field9307 != null) {
                            class662.field9307.method2394((byte) 121, var2.field3157, this.field2859.field4333, -16777216, -256, var2.field3162);
                        }
                    }
                } else {
                    int var3 = ((class367) var1).field5090;
                    if (var3 >= 1 && var3 <= 4) {
                        class682 var4 = class687.field9745[var3 - 1];
                        for (int var5 = 0; var5 < class668.field9389 + class668.field9389; var5++) {
                            for (int var6 = 0; var6 < class668.field9389 + class668.field9389; var6++) {
                                if (class128.field2095[var3 - 1][var5][var6]) {
                                    int var7 = class371.field5135 + var5 - class668.field9389;
                                    int var8 = class22.field303 + var6 - class668.field9389;
                                    if (var7 >= 0 && var7 < var4.field9706 && var8 >= 0 && var8 < var4.field9703) {
                                        class490.field7029.method787(var7 << class49.field637, var4.method3858(var8, var7, (byte) 115), var8 << class49.field637, this.field2856);
                                        if (class152.method1156(this.field2856[0]) == this.field2858 - 1) {
                                            var4.method1374(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field2861.method774(this.field2858);
        while (this.field2860 && this.field2855) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "()V", line = 109)
    public final void method1305() {
        this.field2860 = false;
        this.field2855 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!km", name = "run", descriptor = "()V", line = 116)
    public final void run() {
        while (this.field2855) {
            this.method1304();
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "()Z", line = 125)
    public final boolean method1306() {
        return this.field2859 == null || !this.field2862 && this.field2859.method1889((byte) -96);
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "()V", line = 129)
    public final void method1307() {
        this.field2860 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "()J", line = 137)
    public final long method1308() {
        return this.field2863;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Llr;)V", line = 142)
    public final void method1309(class312 arg0) {
        if (this.field2859 != null) {
            this.field2859.method1884(null, false);
        }
        this.field2859 = arg0;
        if (this.field2859 != null) {
            this.field2859.method1884(this, false);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILr;)V", line = 168)
    public class181(int arg0, class98 arg1) {
        this.field2858 = arg0;
        this.field2861 = arg1;
    }
}
