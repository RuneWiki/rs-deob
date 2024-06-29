import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class364 extends class16 {

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field5168;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "Lus;")
    public static class328 field5170 = new class328(56, -1);

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "[J")
    public static long[] field5171 = new long[256];

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5167;

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class364(Object arg0, int arg1) {
        super(arg1);
        this.field5168 = arg0;
    }

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "(I)Z")
    public final boolean method203(int arg0) {
        field5172++;
        int var2 = -50 % ((51 - arg0) / 62);
        return false;
    }

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "(I)V")
    public static void method2247(int arg0) {
        field5167 = null;
        field5170 = null;
        field5171 = null;
        if (arg0 != 1) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lgaa;I)Lgaa;")
    public static final class460 method2248(class460 arg0, int arg1) {
        if (arg1 != 1) {
            field5167 = null;
        }
        field5169++;
        class460 var2 = client.method710(arg0);
        if (var2 == null) {
            var2 = arg0.field6493;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method202(int arg0) {
        int var2 = 98 / ((-arg0 - 7) / 41);
        field5166++;
        return this.field5168;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5171[var0] = var1;
        }
    }
}
