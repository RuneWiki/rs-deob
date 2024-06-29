import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class132 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[Lln;")
    public volatile class257[] field1914 = new class257[2];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
    public volatile boolean field1912 = false;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Z")
    public volatile boolean field1915 = false;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Liv;")
    public static class65 field1913 = new class65(1);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
    public static int[] field1916 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Let;")
    public class419 field1911;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 6)
    public static void method1009(int arg0) {
        field1913 = null;
        field1916 = null;
        if (arg0 < 56) {
            method1010(null, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        field1917++;
        this.field1915 = true;
        try {
            while (!this.field1912) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class257 var2 = this.field1914[var1];
                    if (var2 != null) {
                        var2.method1652(0);
                    }
                }
                class213.method1462(10L, -5184);
                class293.method1854(this.field1911, 69, null);
            }
        } catch (Exception var9) {
            class194.method1362(var9, null, 77);
        } finally {
            Object var6 = null;
            this.field1915 = false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 60)
    public static final void method1010(String arg0, byte arg1) {
        if (arg1 >= -112) {
            return;
        }
        field1910++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class499.method2994(arg0, (byte) -81);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class91.field1257; var3++) {
            String var4 = class353.field4943[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class499.method2994(var4, (byte) -100);
            if (var5 != null && var5.equals(var2)) {
                class91.field1257--;
                for (int var6 = var3; var6 < class91.field1257; var6++) {
                    class353.field4943[var6] = class353.field4943[var6 + 1];
                    class326.field4578[var6] = class326.field4578[var6 + 1];
                    class45.field508[var6] = class45.field508[var6 + 1];
                    class198.field2895[var6] = class198.field2895[var6 + 1];
                    class348.field4831[var6] = class348.field4831[var6 + 1];
                    class305.field4336[var6] = class305.field4336[var6 + 1];
                }
                class73.field995++;
                class444.field6577 = class49.field548;
                class32.method258(-69, class441.field6556);
                class472.field6970.method638(255, class494.method2962(arg0, (byte) -120));
                class472.field6970.method605(95, arg0);
                return;
            }
        }
    }
}
