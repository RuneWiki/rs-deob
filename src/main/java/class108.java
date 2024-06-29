import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class108 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1879 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Ldc;")
    public static class37 field1882 = class185.method1233((byte) 86, "b12_full");

    @OriginalMember(owner = "client!k", name = "j", descriptor = "S")
    public static short field1887 = 256;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1886 = -1;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Ldc;")
    private static class37 field1883 = class185.method1233((byte) 86, "shake:");

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Ldc;")
    public static class37 field1880 = field1883;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ldc;")
    public static class37 field1881 = field1883;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V")
    public static final void method706(byte arg0, boolean arg1) {
        if (arg0 <= 27) {
            field1879 = -87;
        }
        field1885++;
        byte var2 = 4;
        byte[][] var3 = class118.field2117;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class142.field2745[var5] >> 8) * 64 - class99.field1735;
            int var12 = (class142.field2745[var5] & 0xFF) * 64 - class124.field2212;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                method707((byte) -59);
                class62.method463(class11.field143, var13, (class136.field2648 - 6) * 8, var12, -125, arg1, (class151.field2859 - 6) * 8, var11);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class142.field2745[var6] >> 8) * 64 - class99.field1735;
            int var8 = (class142.field2745[var6] & 0xFF) * 64 - class124.field2212;
            byte[] var9 = var3[var6];
            if (var9 == null && class136.field2648 < 800) {
                method707((byte) 121);
                for (int var10 = 0; var10 < var2; var10++) {
                    class82.method561(-1, 64, var10, 64, var7, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method707(byte arg0) {
        field1878++;
        if (class218.field4075 != null) {
            class218.field4075.method110((byte) -39);
        }
        int var1 = -77 % ((-arg0 - 8) / 42);
        if (class68.field1250 != null) {
            class68.field1250.method110((byte) -39);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public static void method708(byte arg0) {
        if (arg0 != 74) {
            field1884 = 38;
        }
        field1880 = null;
        field1882 = null;
        field1883 = null;
        field1881 = null;
    }
}
