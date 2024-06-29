import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class163 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lql;")
    public static class346 field2182 = new class346();

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[J")
    public static long[] field2187 = new long[32];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2186 = "green:";

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    public static int[] field2185 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lva;")
    public static class55[] field2183;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)B", line = 9)
    public static final byte method1010(byte arg0, int arg1, int arg2) {
        field2184++;
        if (arg1 == 9) {
            int var3 = -61 % ((42 - arg0) / 56);
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 40)
    public static final void method1011(int arg0, String arg1, int arg2) {
        if (arg2 != 7) {
            method1012(45);
        }
        field2188++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class65.field861; var4++) {
            class25 var5 = class206.field2777[class229.field3071[var4]];
            if (var5 != null && var5.field340 != null && var5.field340.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class185.field2507.method5(arg2 ^ 0xFFFFE6D4, 27);
                    class192.field2564++;
                    class185.field2507.method1346(0, 32767);
                    class185.field2507.method1324(class229.field3071[var4], (byte) 112);
                } else if (arg0 == 4) {
                    class41.field568++;
                    class185.field2507.method5(arg2 ^ 0xFFFFE6D4, 53);
                    class185.field2507.method1324(class229.field3071[var4], (byte) 85);
                    class185.field2507.method1346(0, arg2 + 32760);
                } else if (arg0 == 5) {
                    class185.field2507.method5(-6445, 61);
                    class276.field4001++;
                    class185.field2507.method1326(class229.field3071[var4], arg2 - 108);
                    class185.field2507.method1377(0, (byte) 94);
                } else if (arg0 == 6) {
                    class185.field2507.method5(-6445, 196);
                    class321.field4712++;
                    class185.field2507.method1326(class229.field3071[var4], arg2 ^ 0x62);
                    class185.field2507.method1346(0, 32767);
                } else if (arg0 == 7) {
                    class185.field2507.method5(-6445, 172);
                    class68.field879++;
                    class185.field2507.method1377(0, (byte) 83);
                    class185.field2507.method1339(class229.field3071[var4], -16777216);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class197.method1175(0, class17.field259 + arg1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 118)
    public static void method1012(int arg0) {
        field2186 = null;
        field2183 = null;
        field2187 = null;
        field2185 = null;
        int var1 = -116 % ((-arg0 - 64) / 42);
        field2182 = null;
    }
}
