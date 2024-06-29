import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 implements Runnable {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "[Luaa;")
    private class127[] field961 = new class127[8];

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
    private volatile boolean field962 = true;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Z")
    private volatile boolean field965 = true;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
    private volatile boolean field966 = false;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
    private int[] field967 = new int[3];

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lha;")
    private class66 field960;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "J")
    private long field964;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Lpj;")
    private class157 field963;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
    public final void method582() {
        this.field962 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
    public final void method583() {
        this.field962 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()V")
    private final void method584() {
        this.field960.method505(this.field968);
        while (!this.field962 && this.field965) {
            if (this.field963 == null || this.field963.method1092(32767)) {
                this.field966 = false;
                this.field964 = class56.field683.method108(-2);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field966 = true;
                class589 var1 = this.field963.method1089(32767);
                if (var1 instanceof class214) {
                    class214 var2 = (class214) var1;
                    if (var2.field2804) {
                        var2.method131(class34.field372, (byte) 53);
                    } else {
                        class758.method4164(var2, this.field961);
                        if (class157.field2118 != null) {
                            class157.field2118.method568(-256, var2.field2816, var2.field2803, this.field963.field2104, -16777216, true);
                        }
                    }
                } else {
                    int var3 = ((class463) var1).field6578;
                    if (var3 >= 1 && var3 <= 4) {
                        class295 var4 = class645.field8694[var3 - 1];
                        for (int var5 = 0; var5 < class278.field4025 + class278.field4025; var5++) {
                            for (int var6 = 0; var6 < class278.field4025 + class278.field4025; var6++) {
                                if (class767.field10529[var3 - 1][var5][var6]) {
                                    int var7 = class130.field1787 + var5 - class278.field4025;
                                    int var8 = class468.field6610 + var6 - class278.field4025;
                                    if (var7 >= 0 && var7 < var4.field4174 && var8 >= 0 && var8 < var4.field4173) {
                                        class34.field372.method552(var7 << class478.field6717, var4.method1898(var8, var7, (byte) -15), var8 << class478.field6717, this.field967);
                                        if (class174.method1200(this.field967[0]) == this.field968 - 1) {
                                            var4.method195(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field960.method537(this.field968);
        while (this.field962 && this.field965) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lpj;)V")
    public final void method585(class157 arg0) {
        if (this.field963 != null) {
            this.field963.method1093((byte) -35, null);
        }
        this.field963 = arg0;
        if (this.field963 != null) {
            this.field963.method1093((byte) 126, this);
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()Z")
    public final boolean method586() {
        return this.field963 == null || !this.field966 && this.field963.method1092(32767);
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "()V")
    public final void method587() {
        this.field962 = false;
        this.field965 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field965) {
            this.method584();
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "()J")
    public final long method588() {
        return this.field964;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILha;)V")
    public class71(int arg0, class66 arg1) {
        this.field968 = arg0;
        this.field960 = arg1;
    }
}
