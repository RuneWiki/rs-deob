import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class262 implements Runnable {

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[Ldc;")
    public volatile class304[] field3518 = new class304[2];

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Z")
    public volatile boolean field3520 = false;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Z")
    public volatile boolean field3519 = false;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "F")
    public static float field3515;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Lufa;")
    public class140 field3514;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lpe;")
    public static class615 field3517;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z", line = 5)
    public static final boolean method1625(boolean arg0) {
        field3516++;
        try {
            class331 var1 = new class331();
            byte[] var2 = var1.method1911(arg0, class114.field1480);
            class603.method3276(var2, (byte) 127);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        this.field3519 = true;
        field3521++;
        try {
            while (!this.field3520) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class304 var2 = this.field3518[var1];
                    if (var2 != null) {
                        var2.method1796((byte) 77);
                    }
                }
                class122.method905(10L, -6145);
                class371.method2138(this.field3514, 0, null);
            }
        } catch (Exception var9) {
            class698.method3809(null, (byte) 114, var9);
        } finally {
            Object var6 = null;
            this.field3519 = false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 78)
    public static void method1626(byte arg0) {
        if (arg0 < 48) {
            method1625(false);
        }
        field3517 = null;
    }
}
