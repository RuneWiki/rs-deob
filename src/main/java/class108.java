import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class108 implements Runnable {

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[Lgq;")
    public volatile class453[] field1304 = new class453[2];

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
    public volatile boolean field1307 = false;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Z")
    public volatile boolean field1301 = false;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Lsd;")
    public static class74 field1300 = new class74(56, 1);

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lss;")
    public static class140 field1303 = new class140(12, 3);

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "[I")
    public static int[] field1305 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Lkd;")
    public class355 field1306;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method520(int arg0) {
        if (arg0 == 1) {
            field1303 = null;
            field1305 = null;
            field1300 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "run", descriptor = "()V")
    public final void run() {
        field1302++;
        this.field1301 = true;
        try {
            while (!this.field1307) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class453 var2 = this.field1304[var1];
                    if (var2 != null) {
                        var2.method2646((byte) -89);
                    }
                }
                class85.method433(10L, -62);
                class382.method2293(this.field1306, (byte) -119, (Object) null);
            }
        } catch (Exception var9) {
            class144.method678(var9, true, (String) null);
        } finally {
            Object var6 = null;
            this.field1301 = false;
        }
    }
}
