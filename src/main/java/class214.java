import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class214 implements Runnable {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[Lwd;")
    public volatile class260[] field3050 = new class260[2];

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
    public volatile boolean field3055 = false;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Z")
    public volatile boolean field3054 = false;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lmt;")
    public static class517 field3053 = new class517(32);

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lkr;")
    public static class262 field3057 = new class262("stellardawn", 1);

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Lec;")
    public class109 field3056;

    @OriginalMember(owner = "client!co", name = "run", descriptor = "()V")
    public final void run() {
        this.field3054 = true;
        field3051++;
        try {
            while (!this.field3055) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class260 var2 = this.field3050[var1];
                    if (var2 != null) {
                        var2.method1634((byte) 104);
                    }
                }
                class389.method2332(39, 10L);
                class502.method2976(null, 1, this.field3056);
            }
        } catch (Exception var9) {
            class488.method2913(0, var9, null);
        } finally {
            Object var6 = null;
            this.field3054 = false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method1372(boolean arg0) {
        if (arg0) {
            field3053 = null;
        }
        field3057 = null;
        field3053 = null;
    }
}
