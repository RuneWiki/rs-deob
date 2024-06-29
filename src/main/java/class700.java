import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class700 implements Runnable {

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[Lsr;")
    public volatile class234[] field9852 = new class234[2];

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
    public volatile boolean field9853 = false;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Z")
    public volatile boolean field9848 = false;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lta;")
    public static class200 field9851;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lbi;")
    public static class449 field9849;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lii;")
    public class519 field9854;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method3874(byte arg0) {
        field9849 = null;
        if (arg0 <= 97) {
            method3874((byte) -88);
        }
        field9851 = null;
    }

    @OriginalMember(owner = "client!mo", name = "run", descriptor = "()V")
    public final void run() {
        field9850++;
        this.field9848 = true;
        try {
            while (!this.field9853) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class234 var2 = this.field9852[var1];
                    if (var2 != null) {
                        var2.method1463(216930648);
                    }
                }
                class486.method2722(0, 10L);
                class119.method928(null, (byte) -60, this.field9854);
            }
        } catch (Exception var9) {
            class259.method1586(var9, null, (byte) 8);
        } finally {
            Object var6 = null;
            this.field9848 = false;
        }
    }
}
