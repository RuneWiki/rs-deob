import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class432 implements Runnable {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Z")
    private volatile boolean field5881 = true;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
    private volatile boolean field5882 = true;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
    private int[] field5878 = new int[3];

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Z")
    private volatile boolean field5886 = false;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lbq;")
    private class307[] field5883 = new class307[8];

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    private int field5884;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lha;")
    private class66 field5879;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
    private long field5880;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Llha;")
    private class652 field5885;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 8)
    public final void method2529() {
        this.field5881 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()J", line = 16)
    public final long method2530() {
        return this.field5880;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(ILha;)V", line = 159)
    public class432(int arg0, class66 arg1) {
        this.field5884 = arg0;
        this.field5879 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 28)
    public final void method2531() {
        this.field5881 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()V", line = 35)
    private final void method2532() {
        this.field5879.method545(this.field5884);
        while (!this.field5881 && this.field5882) {
            if (this.field5885 == null || this.field5885.method3664((byte) -97)) {
                this.field5886 = false;
                this.field5880 = class47.field731.method1495((byte) 99);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field5886 = true;
                class90 var1 = this.field5885.method3662((byte) 41);
                if (var1 instanceof class543) {
                    class543 var2 = (class543) var1;
                    if (var2.field7401) {
                        var2.method901((byte) 115, class112.field2107);
                    } else {
                        class8.method56(var2, this.field5883);
                        if (class82.field1137 != null) {
                            class82.field1137.method598(var2.field7394, -256, -16777216, this.field5885.field9026, var2.field7392, (byte) -19);
                        }
                    }
                } else {
                    int var3 = ((class567) var1).field8016;
                    if (var3 >= 1 && var3 <= 4) {
                        class296 var4 = class745.field10286[var3 - 1];
                        for (int var5 = 0; var5 < class389.field5342 + class389.field5342; var5++) {
                            for (int var6 = 0; var6 < class389.field5342 + class389.field5342; var6++) {
                                if (class580.field8201[var3 - 1][var5][var6]) {
                                    int var7 = class434.field5912 + var5 - class389.field5342;
                                    int var8 = class111.field1920 + var6 - class389.field5342;
                                    if (var7 >= 0 && var7 < var4.field4037 && var8 >= 0 && var8 < var4.field4034) {
                                        class112.field2107.method490(var7 << class654.field9055, var4.method1897((byte) -34, var8, var7), var8 << class654.field9055, this.field5878);
                                        if (class262.method1715(this.field5878[0]) == this.field5884 - 1) {
                                            var4.method1903(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field5879.method500(this.field5884);
        while (this.field5881 && this.field5882) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "()V", line = 138)
    public final void method2533() {
        this.field5881 = false;
        this.field5882 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "()Z", line = 145)
    public final boolean method2534() {
        return this.field5885 == null || !this.field5886 && this.field5885.method3664((byte) -97);
    }

    @OriginalMember(owner = "client!wl", name = "run", descriptor = "()V", line = 151)
    public final void run() {
        while (this.field5882) {
            this.method2532();
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Llha;)V", line = 164)
    public final void method2535(class652 arg0) {
        if (this.field5885 != null) {
            this.field5885.method3659(0, null);
        }
        this.field5885 = arg0;
        if (this.field5885 != null) {
            this.field5885.method3659(0, this);
        }
    }
}
