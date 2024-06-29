import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class588 implements Runnable {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lcba;")
    private class551[] field8214 = new class551[8];

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
    private int[] field8216 = new int[3];

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
    private volatile boolean field8218 = true;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    private volatile boolean field8217 = true;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Z")
    private volatile boolean field8221 = false;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field8222;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lha;")
    private class60 field8220;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "J")
    private long field8215;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lph;")
    private class643 field8219;

    @OriginalMember(owner = "client!lk", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (this.field8217) {
            this.method3276();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V", line = 16)
    public final void method3270() {
        this.field8218 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()J", line = 23)
    public final long method3271() {
        return this.field8215;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "()Z", line = 26)
    public final boolean method3272() {
        return this.field8219 == null || !this.field8221 && this.field8219.method3637(124);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lph;)V", line = 29)
    public final void method3273(class643 arg0) {
        if (this.field8219 != null) {
            this.field8219.method3635(null, false);
        }
        this.field8219 = arg0;
        if (this.field8219 != null) {
            this.field8219.method3635(this, false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "()V", line = 40)
    public final void method3274() {
        this.field8218 = false;
        this.field8217 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class588(int arg0, class60 arg1) {
        this.field8222 = arg0;
        this.field8220 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "()V", line = 52)
    public final void method3275() {
        this.field8218 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "()V", line = 64)
    private final void method3276() {
        this.field8220.method431(this.field8222);
        while (!this.field8218 && this.field8217) {
            if (this.field8219 == null || this.field8219.method3637(114)) {
                this.field8221 = false;
                this.field8215 = class169.field2110.method2060((byte) 69);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field8221 = true;
                class166 var1 = this.field8219.method3634(0);
                if (var1 instanceof class176) {
                    class176 var2 = (class176) var1;
                    if (var2.field2164) {
                        var2.method136(class22.field158, 116);
                    } else {
                        class652.method3679(var2, this.field8214);
                        if (class343.field4609 != null) {
                            class343.field4609.method475((byte) 53, var2.field2166, this.field8219.field8976, -256, -16777216, var2.field2172);
                        }
                    }
                } else {
                    int var3 = ((class468) var1).field6469;
                    if (var3 >= 1 && var3 <= 4) {
                        class281 var4 = class25.field188[var3 - 1];
                        for (int var5 = 0; var5 < class118.field1562 + class118.field1562; var5++) {
                            for (int var6 = 0; var6 < class118.field1562 + class118.field1562; var6++) {
                                if (class219.field2838[var3 - 1][var5][var6]) {
                                    int var7 = class610.field8512 + var5 - class118.field1562;
                                    int var8 = class39.field407 + var6 - class118.field1562;
                                    if (var7 >= 0 && var7 < var4.field3727 && var8 >= 0 && var8 < var4.field3728) {
                                        class22.field158.method451(var7 << class443.field6172, var4.method1685(var8, -12639, var7), var8 << class443.field6172, this.field8216);
                                        if (class545.method3093(this.field8216[0]) == this.field8222 - 1) {
                                            var4.method1543(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field8220.method384(this.field8222);
        while (this.field8218 && this.field8217) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }
}
