import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[Lih;")
    public volatile class295[] field3154 = new class295[2];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
    public volatile boolean field3155 = false;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
    public volatile boolean field3157 = false;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lca;")
    public class122 field3159;

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        this.field3157 = true;
        try {
            while (!this.field3155) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class295 var2 = this.field3154[var1];
                    if (var2 != null) {
                        var2.method2009(73);
                    }
                }
                class155.method1130(1, 10L);
                class219.method1528((byte) 101, this.field3159, (Object) null);
            }
        } catch (Exception var9) {
            class5.method27(-38, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field3157 = false;
        }
        field3158++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        class66.method494();
        if (arg0 != -5) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class235.field3431[var1].method1591(13610);
        }
        System.gc();
        field3156++;
    }
}
