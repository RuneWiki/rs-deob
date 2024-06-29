import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[Lsh;")
    public volatile class288[] field861 = new class288[2];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
    public volatile boolean field856 = false;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
    public volatile boolean field857 = false;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Z")
    public static boolean field860 = false;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lo;")
    public static class208 field862 = new class208(2, 4, 4, 0);

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lvt;")
    public class768 field859;

    @OriginalMember(owner = "client!dl", name = "run", descriptor = "()V")
    public final void run() {
        this.field857 = true;
        field858++;
        try {
            while (!this.field856) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class288 var2 = this.field861[var1];
                    if (var2 != null) {
                        var2.method1906(105);
                    }
                }
                class730.method4066((byte) -45, 10L);
                class473.method2824(90, null, this.field859);
            }
        } catch (Exception var9) {
            class502.method2937(var9, (byte) -99, null);
        } finally {
            Object var6 = null;
            this.field857 = false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method562(int arg0) {
        if (arg0 != 10) {
            field860 = true;
        }
        field862 = null;
    }
}
