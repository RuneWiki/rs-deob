import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class602 implements Runnable {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    private int[] field7905 = new int[3];

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Z")
    private volatile boolean field7908 = true;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
    private volatile boolean field7904 = true;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Z")
    private volatile boolean field7909 = false;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[Ltn;")
    private class87[] field7911 = new class87[8];

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    private int field7906;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lha;")
    private class59 field7903;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "J")
    private long field7910;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lut;")
    private class126 field7907;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 5)
    public final void method3270() {
        this.field7908 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lut;)V", line = 13)
    public final void method3271(class126 arg0) {
        if (this.field7907 != null) {
            this.field7907.method999(null, true);
        }
        this.field7907 = arg0;
        if (this.field7907 != null) {
            this.field7907.method999(this, true);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 23)
    private final void method3272() {
        this.field7903.method497(this.field7906);
        while (!this.field7908 && this.field7904) {
            if (this.field7907 == null || this.field7907.method994((byte) -63)) {
                this.field7909 = false;
                this.field7910 = class92.field1115.method783(24111);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field7909 = true;
                class499 var1 = this.field7907.method997(-91);
                if (var1 instanceof class256) {
                    class256 var2 = (class256) var1;
                    if (var2.field3511) {
                        var2.method792(class184.field2781, (byte) 127);
                    } else {
                        class401.method2362(var2, this.field7911);
                        if (class258.field3550 != null) {
                            class258.field3550.method527(true, var2.field3500, this.field7907.field2078, var2.field3507, -16777216, -256);
                        }
                    }
                } else {
                    int var3 = ((class759) var1).field10562;
                    if (var3 >= 1 && var3 <= 4) {
                        class282 var4 = class507.field6771[var3 - 1];
                        for (int var5 = 0; var5 < class183.field2779 + class183.field2779; var5++) {
                            for (int var6 = 0; var6 < class183.field2779 + class183.field2779; var6++) {
                                if (class204.field3053[var3 - 1][var5][var6]) {
                                    int var7 = class458.field6258 + var5 - class183.field2779;
                                    int var8 = class610.field8134 + var6 - class183.field2779;
                                    if (var7 >= 0 && var7 < var4.field3992 && var8 >= 0 && var8 < var4.field3996) {
                                        class184.field2781.method494(var7 << class140.field2224, var4.method1742(var7, 66, var8), var8 << class140.field2224, this.field7905);
                                        if (class722.method4064(this.field7905[0]) == this.field7906 - 1) {
                                            var4.method1747(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field7903.method441(this.field7906);
        while (this.field7908 && this.field7904) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()V", line = 120)
    public final void method3273() {
        this.field7908 = false;
        this.field7904 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V", line = 127)
    public final void run() {
        while (this.field7904) {
            this.method3272();
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()Z", line = 137)
    public final boolean method3274() {
        return this.field7907 == null || !this.field7909 && this.field7907.method994((byte) -84);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class602(int arg0, class59 arg1) {
        this.field7906 = arg0;
        this.field7903 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "()J", line = 150)
    public final long method3275() {
        return this.field7910;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "()V", line = 153)
    public final void method3276() {
        this.field7908 = false;
        synchronized (this) {
            this.notify();
        }
    }
}
