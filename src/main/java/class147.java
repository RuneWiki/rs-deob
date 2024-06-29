import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class147 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field2355 = -1;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2354 = -1;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2356 = "Please remove ";

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[I")
    public static int[] field2365 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2360 = 0;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field2370 = -1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Llc;")
    public static class270 field2361;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Llc;")
    public static class270 field2374;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([BII)I")
    public static final int method1089(byte[] arg0, int arg1, int arg2) {
        field2368++;
        if (arg2 != 0) {
            field2356 = null;
        }
        return class193.method1373((byte) -124, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(CI)Z")
    public static final boolean method1090(char arg0, int arg1) {
        field2372++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg1 != -8213) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        if (arg0 != 8263) {
            method1090('d', -78);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class223.field3274[var1] = false;
        }
        class119.field1931 = 5;
        field2369++;
        class182.field2732 = -1;
        class268.field4304 = -1;
        class139.field2263 = 0;
        class234.field3421 = 0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I")
    public static final int method1092(byte arg0, int arg1) {
        field2358++;
        int var2 = 78 % ((arg0 - 16) / 42);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method1093(byte arg0) {
        field2356 = null;
        field2361 = null;
        int var1 = -113 / ((-arg0 - 28) / 47);
        field2365 = null;
        field2374 = null;
    }
}
