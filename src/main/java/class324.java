import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class324 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field4964 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4962 = 0;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
    public static int[] field4974 = new int[16384];

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    public static int[] field4966 = new int[16384];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    public static boolean field4977;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "F")
    public static float field4963;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field4976;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4966[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4974[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4977 = false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 19)
    public static void method2098(byte arg0) {
        field4974 = null;
        if (arg0 < 0) {
            field4977 = false;
        }
        field4966 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method2099(boolean arg0) {
        field4973++;
        class80.field1322 = new class372(8);
        if (arg0) {
            method2099(true);
        }
        class318.field4550 = 0;
        for (class234 var1 = (class234) class359.field5434.method1639(-1); var1 != null; var1 = (class234) class359.field5434.method1642((byte) -1)) {
            var1.method1526();
        }
    }
}
