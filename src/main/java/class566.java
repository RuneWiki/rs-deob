import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class566 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lvt;")
    private class759[] field8017 = new class759[8];

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
    private int[] field8020 = new int[3];

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
    private volatile boolean field8025 = true;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
    private volatile boolean field8024 = true;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Z")
    private volatile boolean field8022 = false;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    private int field8019;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lha;")
    private class544 field8021;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "J")
    private long field8018;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Ljg;")
    private class243 field8023;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljg;)V")
    public final void method3285(class243 arg0) {
        if (this.field8023 != null) {
            this.field8023.method1689(null, (byte) 116);
        }
        this.field8023 = arg0;
        if (this.field8023 != null) {
            this.field8023.method1689(this, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
    private final void method3286() {
        this.field8021.method229(this.field8019);
        while (!this.field8025 && this.field8024) {
            if (this.field8023 == null || this.field8023.method1688(-34)) {
                this.field8022 = false;
                this.field8018 = class289.field4442.method815(false);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field8022 = true;
                class638 var1 = this.field8023.method1685(-2);
                if (var1 instanceof class668) {
                    class668 var2 = (class668) var1;
                    if (var2.field9471) {
                        var2.method97(class478.field6933, -1);
                    } else {
                        class145.method1118(var2, this.field8017);
                        if (class35.field332 != null) {
                            class35.field332.method2483(-256, var2.field9481, this.field8023.field3917, var2.field9479, -83, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class32) var1).field300;
                    if (var3 >= 1 && var3 <= 4) {
                        class339 var4 = class211.field3511[var3 - 1];
                        for (int var5 = 0; var5 < class155.field2405 + class155.field2405; var5++) {
                            for (int var6 = 0; var6 < class155.field2405 + class155.field2405; var6++) {
                                if (class314.field4726[var3 - 1][var5][var6]) {
                                    int var7 = class336.field4923 + var5 - class155.field2405;
                                    int var8 = class63.field996 + var6 - class155.field2405;
                                    if (var7 >= 0 && var7 < var4.field4956 && var8 >= 0 && var8 < var4.field4960) {
                                        class478.field6933.method337(var7 << class662.field9425, var4.method2160(-128, var8, var7), var8 << class662.field9425, this.field8020);
                                        if (class76.method691(this.field8020[0]) == this.field8019 - 1) {
                                            var4.method622(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field8021.method423(this.field8019);
        while (this.field8025 && this.field8024) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
    public final void method3287() {
        this.field8025 = false;
        this.field8024 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "()J")
    public final long method3288() {
        return this.field8018;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field8024) {
            this.method3286();
        }
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "()V")
    public final void method3289() {
        this.field8025 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "()Z")
    public final boolean method3290() {
        return this.field8023 == null || !this.field8022 && this.field8023.method1688(-34);
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "()V")
    public final void method3291() {
        this.field8025 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILha;)V")
    public class566(int arg0, class544 arg1) {
        this.field8019 = arg0;
        this.field8021 = arg1;
    }
}
