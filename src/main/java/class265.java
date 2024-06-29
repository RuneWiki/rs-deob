import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class265 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lud;")
    public static class279 field4771 = class130.method1024("blinken1:", 255);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lhc;")
    public static class171 field4774 = new class171(30);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4778 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lud;")
    public static class279 field4780 = class130.method1024("l", 255);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4779 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
    public static int[] field4777 = new int[256];

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lud;")
    private static class279 field4781;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lud;")
    public static class279 field4782;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lok;")
    public static class149 field4775;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lud;")
    public class279 field4768;

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
            field4777[var0] = var1;
        }
        field4781 = class130.method1024("Allocating memory", 255);
        field4782 = field4781;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 39)
    public static void method1901(byte arg0) {
        field4774 = null;
        field4777 = null;
        field4782 = null;
        field4771 = null;
        field4780 = null;
        field4775 = null;
        if (arg0 > 19) {
            field4781 = null;
        }
    }
}
