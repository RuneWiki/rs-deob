import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class198 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[[Lci;")
    public static class176[][] field3165 = new class176[13][13];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[I")
    public static int[] field3169 = new int[32];

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Z")
    public static boolean field3168 = true;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lck;")
    public static class119 field3170;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lml;")
    public static class134 field3167;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[Lmd;")
    public static class88[] field3172;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3169[var1] = var0 - 1;
            var0 += var0;
        }
        field3170 = class298.method1987((byte) 35, "Freie Welt");
        field3171 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z", line = 45)
    public static final boolean method1267(byte arg0) {
        field3164++;
        class57 var1 = class242.field3888;
        synchronized (class242.field3888) {
            if (class158.field2512 == class111.field1703) {
                return false;
            }
            class298.field5027 = class108.field1644[class111.field1703];
            int var2 = -112 / ((-arg0 - 64) / 54);
            class156.field2491 = class179.field2858[class111.field1703];
            class111.field1703 = class111.field1703 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 64)
    public static void method1268(int arg0) {
        field3169 = null;
        if (arg0 != 2) {
            field3167 = (class134) null;
        }
        field3165 = (class176[][]) null;
        field3167 = null;
        field3172 = null;
        field3170 = null;
    }
}
