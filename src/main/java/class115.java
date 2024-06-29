import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class115 extends class228 {

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "S")
    public static short field2042 = 256;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "Ltg;")
    public static class182 field2044;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "Loh;")
    public static class275 field2038;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public static final void method775(int arg0) {
        class146.field2584++;
        field2045++;
        class131.field2277.method966((byte) 49, 21);
        class131.field2277.method1691(class143.method972(-3), (byte) 53);
        class131.field2277.method1745(class199.field3458, (byte) 5);
        class131.field2277.method1745(class24.field373, (byte) 5);
        class131.field2277.method1691(class65.field1102, (byte) 53);
        if (arg0 != 32435) {
            field2040 = -5;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= -109) {
            field2038 = null;
        }
        field2035++;
        if (class22.method134(arg5, (byte) 107)) {
            class287.field5020 = null;
            class158.method1082(arg4, arg3, arg2, arg8, -1, arg6, class125.field2188[arg5], arg0, arg7, -1338);
            if (class287.field5020 != null) {
                class158.method1082(arg4, arg3, class270.field4761, arg8, -1412584499, class268.field4720, class287.field5020, arg0, arg7, -1338);
                class287.field5020 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class173.field3057[var9] = true;
            }
        } else {
            class173.field3057[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)I")
    public static final int method777(int arg0, int arg1, int arg2, int arg3) {
        field2036++;
        if (class189.field3337 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = arg2;
        if (arg2 < 3 && (class230.field3973[1][var4][var5] & 0x2) == 2) {
            var8 = arg2 + 1;
        }
        int var9 = (128 - var6) * class189.field3337[var8][var4][var5] + class189.field3337[var8][var4 - arg0][var5] * var6 >> 7;
        int var10 = (128 - var6) * class189.field3337[var8][var4][var5 + 1] + (class189.field3337[var8][var4 + 1][var5 + 1] * var6) >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        field2037++;
        if (arg1 != -3) {
            field2044 = null;
        }
        return class281.field4923;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field2044 = null;
        field2038 = null;
        if (arg0 >= -79) {
            field2040 = 126;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2041++;
        if (arg4 == arg6) {
            class240.method1566(arg1, arg2, arg4, arg5, arg7, (byte) -116, arg3);
            return;
        }
        if (class197.field3437 <= (arg2 - arg4) && class79.field1395 >= arg2 + arg4 && class178.field3101 <= arg5 - arg6 && class137.field2414 >= arg5 + arg6) {
            class80.method555(arg3, arg4, arg1, arg6, -1, arg5, arg2, arg7);
        } else {
            class197.method1327(arg3, arg6, arg2, arg4, arg5, false, arg1, arg7);
        }
        int var8 = -29 % ((arg0 - 20) / 37);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZIII)V")
    public static final void method780(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2039++;
        if (class22.method134(arg0, (byte) 114) && arg3 == -1412584499) {
            class243.method1577(-1, class125.field2188[arg0], arg3 + 1412580058, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= arg5; var6++) {
            class175.method1174(class124.field2177[var6], arg2, -7, arg3, arg1);
        }
        if (arg4 != 18582) {
            method778((byte) 74);
        }
        field2043++;
    }
}
