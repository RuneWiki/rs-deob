import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class383 implements Runnable {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lmda;")
    public volatile class349[] field5539 = new class349[2];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public volatile boolean field5545 = false;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
    public volatile boolean field5544 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lufa;")
    public static class740 field5538 = new class740(3, 19);

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5542 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lhga;")
    public class300 field5543;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2364(int arg0) {
        if (arg0 != 2) {
            field5538 = null;
        }
        field5538 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
    public static final boolean method2365(int arg0, int arg1, int arg2) {
        field5540++;
        if (arg2 != -11647) {
            field5542 = -36;
        }
        return class699.method3926(arg1, -4, arg0) || class30.method150(arg1, 2, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        field5541++;
        this.field5544 = true;
        try {
            while (!this.field5545) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class349 var2 = this.field5539[var1];
                    if (var2 != null) {
                        var2.method2221(2000);
                    }
                }
                class363.method2283(10L, -24244);
                class402.method2443(75, this.field5543, null);
            }
        } catch (Exception var9) {
            class705.method3952(null, var9, -29913);
        } finally {
            Object var6 = null;
            this.field5544 = false;
        }
    }
}
