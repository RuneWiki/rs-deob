import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[Lic;")
    public volatile class104[] field2383 = new class104[2];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
    public volatile boolean field2393 = false;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
    public volatile boolean field2387 = false;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field2389 = new int[4096];

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2390 = 2;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2391 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lcb;")
    public class255 field2386;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method1009(int arg0) {
        if (arg0 == -100001) {
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        this.field2387 = true;
        try {
            while (!this.field2393) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class104 var2 = this.field2383[var1];
                    if (var2 != null) {
                        var2.method743(5034);
                    }
                }
                class208.method1408(115, 10L);
                class161.method1104((Object) null, this.field2386, (byte) 45);
            }
        } catch (Exception var9) {
            class272.method1837((String) null, 1, var9);
        } finally {
            Object var6 = null;
            this.field2387 = false;
        }
        field2388++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1010(int arg0, int arg1) {
        field2392++;
        if (arg0 != -28720) {
            return null;
        } else if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class289.field4620 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class75.field1035 + "</col>";
        }
    }
}
