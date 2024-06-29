import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class182 extends class19 {

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3125 = 0;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "[I")
    public static int[] field3127 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lcd;")
    private static class64 field3123 = class44.method335((byte) 71, "Connection lost)3");

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lcd;")
    public static class64 field3124 = class44.method335((byte) 71, " ");

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lcd;")
    public static class64 field3120 = field3123;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[Lnm;")
    public static class176[] field3129;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(JI)V", line = 12)
    public static final void method1288(long arg0, int arg1) {
        field3128++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class61.field1194; var3++) {
            if (class173.field2981[var3] == arg0) {
                class275.field4728++;
                class61.field1194--;
                for (int var4 = var3; var4 < class61.field1194; var4++) {
                    class173.field2981[var4] = class173.field2981[var4 + 1];
                    class267.field4607[var4] = class267.field4607[var4 + 1];
                }
                class47.field781 = class238.field4039;
                class17.field353.method1214(-115, 93);
                class17.field353.method161((byte) -71, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 53)
    public static void method1289(boolean arg0) {
        field3127 = null;
        field3129 = null;
        field3124 = null;
        if (!arg0) {
            field3123 = null;
            field3120 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLsa;I)V", line = 68)
    public static final void method1290(byte arg0, class103 arg1, int arg2) {
        field3126++;
        if (class29.field482 < arg1.field1888) {
            class133.method952(-113, arg1);
        } else if (arg1.field1877 >= class29.field482) {
            class262.method1845(true, arg1);
        } else {
            class206.method1436(arg1, 8);
        }
        if (arg1.field1859 < 128 || arg1.field1865 < 128 || arg1.field1859 >= 13184 || arg1.field1865 >= 13184) {
            arg1.field1877 = 0;
            arg1.field1888 = 0;
            arg1.field1902 = -1;
            arg1.field1903 = -1;
            arg1.field1859 = arg1.field1876[0] * 128 + arg1.method325(-12808) * 64;
            arg1.field1865 = arg1.field1898[0] * 128 + (arg1.method325(-12808) * 64);
            arg1.method759(0);
        }
        if (class139.field2472 == arg1 && (arg1.field1859 < 1536 || arg1.field1865 < 1536 || arg1.field1859 >= 11776 || arg1.field1865 >= 11776)) {
            arg1.field1888 = 0;
            arg1.field1902 = -1;
            arg1.field1903 = -1;
            arg1.field1877 = 0;
            arg1.field1859 = arg1.field1876[0] * 128 + arg1.method325(-12808) * 64;
            arg1.field1865 = arg1.field1898[0] * 128 + arg1.method325(-12808) * 64;
            arg1.method759(0);
        }
        class91.method689((byte) 57, arg1);
        int var3 = -35 / ((arg0 + 1) / 62);
        class88.method676((byte) -112, arg1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lcd;I)Lcd;", line = 117)
    public static final class64 method1291(class64 arg0, int arg1) {
        field3121++;
        int var2 = class230.method1660(true, arg0);
        return ~var2 == arg1 ? class267.field4599 : class143.field2516.field4887[var2].method523(field3124, 0, class188.field3212);
    }
}
