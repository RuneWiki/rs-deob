import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class592 implements Runnable {

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[Lfa;")
    public volatile class243[] field8360 = new class243[2];

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Z")
    public volatile boolean field8362 = false;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Z")
    public volatile boolean field8361 = false;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field8357 = 0;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lkj;")
    public class590 field8359;

    @OriginalMember(owner = "client!cv", name = "run", descriptor = "()V")
    public final void run() {
        field8358++;
        this.field8361 = true;
        try {
            while (!this.field8362) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class243 var2 = this.field8360[var1];
                    if (var2 != null) {
                        var2.method1648((byte) 55);
                    }
                }
                class117.method820(false, 10L);
                class656.method3758(this.field8359, 1, null);
            }
        } catch (Exception var9) {
            class329.method2129(null, false, var9);
        } finally {
            Object var6 = null;
            this.field8361 = false;
        }
    }
}
