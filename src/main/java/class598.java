import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class598 implements Runnable {

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Lnc;")
    private class26 field8145 = new class26();

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public int field8148 = 0;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
    private boolean field8149 = false;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field8147;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Luq;")
    public static class172 field8139;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3347(byte arg0) {
        field8142++;
        class535 var1 = class263.field3874;
        synchronized (class263.field3874) {
            class263.field3874.method3103(arg0 - 11278);
        }
        class535 var2 = class465.field6593;
        synchronized (class465.field6593) {
            class465.field6593.method3103(-11294);
        }
        if (arg0 != -16) {
            field8136 = 32;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V", line = 21)
    public final void method3348(byte arg0) {
        int var2 = 89 % (-arg0 / 42);
        this.field8149 = true;
        field8146++;
        class26 var3 = this.field8145;
        synchronized (this.field8145) {
            this.field8145.notifyAll();
        }
        try {
            this.field8147.join();
        } catch (InterruptedException var4) {
        }
        this.field8147 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lnaa;IZ)Lao;", line = 39)
    public final class303 method3349(class79 arg0, int arg1, boolean arg2) {
        field8138++;
        class303 var4 = new class303();
        var4.field4244 = 1;
        class26 var5 = this.field8145;
        synchronized (this.field8145) {
            class303 var6 = (class303) this.field8145.method152((byte) -13);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field8883 && var6.field4250 == arg0 && var6.field4244 == 2) {
                    var4.field4258 = var6.field4258;
                    var4.field295 = false;
                    return var4;
                }
                var6 = (class303) this.field8145.method146((byte) 97);
            }
        }
        var4.field4258 = arg0.method633((byte) 28, arg1);
        var4.field295 = false;
        var4.field298 = arg2;
        return var4;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z", line = 71)
    public static final boolean method3350(int arg0, int arg1, int arg2) {
        int var3 = 11 / ((arg1 - 5) / 54);
        field8137++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V", line = 81)
    public static void method3351(byte arg0) {
        field8139 = null;
        if (arg0 != -111) {
            method3347((byte) 103);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lnaa;II)Lao;", line = 93)
    public final class303 method3352(class79 arg0, int arg1, int arg2) {
        field8144++;
        class303 var4 = new class303();
        var4.field4250 = arg0;
        var4.field8883 = arg2;
        var4.field4244 = arg1;
        var4.field298 = false;
        this.method3354((byte) -34, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lnaa;[BIZ)Lao;", line = 110)
    public final class303 method3353(class79 arg0, byte[] arg1, int arg2, boolean arg3) {
        field8135++;
        class303 var5 = new class303();
        var5.field4250 = arg0;
        var5.field4258 = arg1;
        var5.field8883 = arg2;
        var5.field4244 = 2;
        var5.field298 = arg3;
        this.method3354((byte) -34, var5);
        return var5;
    }

    @OriginalMember(owner = "client!cr", name = "run", descriptor = "()V", line = 128)
    public final void run() {
        field8143++;
        while (!this.field8149) {
            class26 var1 = this.field8145;
            class303 var2;
            synchronized (this.field8145) {
                var2 = (class303) this.field8145.method155(113);
                if (var2 == null) {
                    try {
                        this.field8145.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field8148--;
            }
            try {
                if (var2.field4244 == 2) {
                    var2.field4250.method636(var2.field4258, (int) var2.field8883, var2.field4258.length, true);
                } else if (var2.field4244 == 3) {
                    var2.field4258 = var2.field4250.method633((byte) 28, (int) var2.field8883);
                }
            } catch (Exception var6) {
                class607.method3379(null, var6, true);
            }
            var2.field295 = false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLao;)V", line = 176)
    private final void method3354(byte arg0, class303 arg1) {
        field8140++;
        if (arg0 != -34) {
            this.field8147 = null;
        }
        class26 var3 = this.field8145;
        synchronized (this.field8145) {
            this.field8145.method150(0, arg1);
            this.field8148++;
            this.field8145.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lec;)V", line = 204)
    public class598(class248 arg0) {
        class621 var2 = arg0.method1538(this, (byte) -128, 5);
        while (var2.field8405 == 0) {
            class171.method1152(10L, false);
        }
        if (var2.field8405 == 2) {
            throw new RuntimeException();
        }
        this.field8147 = (Thread) var2.field8403;
    }
}
