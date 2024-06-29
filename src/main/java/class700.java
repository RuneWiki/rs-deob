import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class700 implements Runnable {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Lnr;")
    public volatile class161[] field9272 = new class161[2];

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public volatile boolean field9275 = false;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
    public volatile boolean field9273 = false;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Loq;")
    public class775 field9278;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBILaia;)J")
    public static final long method3799(int arg0, byte arg1, int arg2, class274 arg3) {
        field9279++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class773 var8 = class390.field4983.method4292(arg3.method1010(-6546), (byte) -126);
        long var9 = (long) (arg3.method1007(true) << 14 | arg0 | arg2 << 7 | arg3.method1013((byte) -57) << 20 | 0x40000000);
        if (var8.field10488 == 0) {
            var9 |= var6;
        }
        if (var8.field10520 == 1) {
            var9 |= var4;
        }
        long var11 = var9 | (long) arg3.method1010(-6546) << 32;
        return arg1 < 99 ? -85L : var11;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)I")
    public static final int method3800(int arg0, long arg1) {
        int var3 = -6 % ((19 - arg0) / 37);
        field9274++;
        return (int) (arg1 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
    public final void run() {
        this.field9273 = true;
        field9277++;
        try {
            while (!this.field9275) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class161 var2 = this.field9272[var1];
                    if (var2 != null) {
                        var2.method1027(-115);
                    }
                }
                class591.method3181(10L, 0);
                class705.method3815(false, null, this.field9278);
            }
        } catch (Exception var9) {
            class416.method2401(1, var9, null);
        } finally {
            Object var6 = null;
            this.field9273 = false;
        }
    }
}
