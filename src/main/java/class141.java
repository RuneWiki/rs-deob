import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class141 extends class206 {

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lmh;")
    public class62 field2261;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Lmh;")
    private static class62 field2259 = class201.method1405(true, ")3fr");

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Lmh;")
    private static class62 field2262 = class201.method1405(true, "de");

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lmh;")
    private static class62 field2264 = class201.method1405(true, ")3en");

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Lmh;")
    private static class62 field2266 = class201.method1405(true, "en");

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Lmh;")
    private static class62 field2263 = class201.method1405(true, ")3de");

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Lmh;")
    private static class62 field2265 = class201.method1405(true, "fr");

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[Lmh;")
    private static class62[] field2260 = new class62[] { field2264, field2263, field2259 };

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[Lmh;")
    public static class62[] field2258 = new class62[] { field2266, field2262, field2265 };

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "[I")
    public static int[] field2268 = new int[256];

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Lsg;")
    public static class191 field2270;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lmh;")
    public static class62 field2273;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field2271;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2268[var0] = var1;
        }
        field2269 = 0;
        field2272 = 0;
        field2270 = null;
        field2273 = class201.method1405(true, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V", line = 38)
    public static void method1050(byte arg0) {
        field2268 = null;
        field2260 = null;
        field2270 = null;
        if (arg0 != -40) {
            field2271 = -24;
        }
        field2273 = null;
        field2265 = null;
        field2266 = null;
        field2264 = null;
        field2263 = null;
        field2262 = null;
        field2258 = null;
        field2259 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 65)
    public class141() {
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lmh;I)V", line = 68)
    public class141(class62 arg0, int arg1) {
        this.field2261 = arg0;
    }
}
