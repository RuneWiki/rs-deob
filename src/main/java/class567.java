import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class567 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "[I")
    private int[] field8052 = new int[3];

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
    private volatile boolean field8058 = true;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Z")
    private volatile boolean field8054 = true;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Z")
    private volatile boolean field8055 = false;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "[Lkb;")
    private class757[] field8059 = new class757[8];

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field8057;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Lha;")
    private class545 field8056;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "J")
    private long field8051;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lvca;")
    private class270 field8053;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
    public final void method3391() {
        this.field8058 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
    private final void method3392() {
        this.field8056.method2071(this.field8057);
        while (!this.field8058 && this.field8054) {
            if (this.field8053 == null || this.field8053.method1647(30)) {
                this.field8055 = false;
                this.field8051 = class137.field1831.method1445((byte) -7);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field8055 = true;
                class1 var1 = this.field8053.method1654(1);
                if (var1 instanceof class674) {
                    class674 var2 = (class674) var1;
                    if (var2.field9492) {
                        var2.method271(88, class646.field9160);
                    } else {
                        class425.method2591(var2, this.field8059);
                        if (class369.field4718 != null) {
                            class369.field4718.method2427(648, var2.field9487, this.field8053.field3650, var2.field9488, -256, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class488) var1).field6578;
                    if (var3 >= 1 && var3 <= 4) {
                        class339 var4 = class52.field741[var3 - 1];
                        for (int var5 = 0; var5 < class707.field9874 + class707.field9874; var5++) {
                            for (int var6 = 0; var6 < class707.field9874 + class707.field9874; var6++) {
                                if (class534.field7490[var3 - 1][var5][var6]) {
                                    int var7 = class126.field1717 + var5 - class707.field9874;
                                    int var8 = class157.field2139 + var6 - class707.field9874;
                                    if (var7 >= 0 && var7 < var4.field4344 && var8 >= 0 && var8 < var4.field4348) {
                                        class646.field9160.method2131(var7 << class509.field7106, var4.method1959(123, var8, var7), var8 << class509.field7106, this.field8052);
                                        if (class688.method3919(this.field8052[0]) == this.field8057 - 1) {
                                            var4.method511(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field8056.method2178(this.field8057);
        while (this.field8058 && this.field8054) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field8054) {
            this.method3392();
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "()J")
    public final long method3393() {
        return this.field8051;
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "()V")
    public final void method3394() {
        this.field8058 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "()V")
    public final void method3395() {
        this.field8058 = false;
        this.field8054 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lvca;)V")
    public final void method3396(class270 arg0) {
        if (this.field8053 != null) {
            this.field8053.method1655(null, -12038);
        }
        this.field8053 = arg0;
        if (this.field8053 != null) {
            this.field8053.method1655(this, -12038);
        }
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "()Z")
    public final boolean method3397() {
        return this.field8053 == null || !this.field8055 && this.field8053.method1647(119);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILha;)V")
    public class567(int arg0, class545 arg1) {
        this.field8057 = arg0;
        this.field8056 = arg1;
    }
}
