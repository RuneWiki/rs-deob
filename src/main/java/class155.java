import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class155 {

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
    public static int[] field2383 = new int[100];

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljp;")
    public static class55 field2380 = new class55(104, 19);

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Z")
    public static boolean field2384 = false;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Laj;")
    public static class209 field2385;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[Lvb;")
    public static class231[] field2378;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
    public static final void method1127(int arg0, int arg1) {
        class370.method2378((byte) -57);
        field2382++;
        class208.method1448(-21);
        class472.method2863(-31876, arg0, true);
        class8.method37(class376.field5542, class510.field7431, false, class312.field4754);
        class156.method1133(class376.field5542, (byte) -116, class510.field7431);
        class452.method2769(-16501);
        class191.method1327(11913, class470.field6906);
        class80.method713(-14703);
        class499.method2979(32);
        int var2 = -65 / ((50 - arg1) / 44);
        if (class460.field6813 == 2) {
            class376.method2400(3, (byte) 107);
        } else if (class460.field6813 == 6) {
            class376.method2400(7, (byte) 107);
        } else if (class460.field6813 == 9) {
            class376.method2400(10, (byte) 107);
        } else if (class460.field6813 == 1) {
            class115.method879(2048, class376.field5542, class510.field7431);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z")
    public static final boolean method1128(int arg0, int arg1, int arg2) {
        field2381++;
        int var3 = -85 / ((91 - arg2) / 35);
        return (arg0 & 0x60000) != 0 | class541.method3179(arg0, (byte) -92, arg1) || class229.method1555(arg0, arg1, (byte) 121) || class103.method831(111, arg1, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z")
    public static final boolean method1129(int arg0, int arg1, int arg2) {
        int var3 = class317.field4835[arg0][arg1][arg2];
        if (-class532.field7772 == var3) {
            return false;
        } else if (class532.field7772 == var3) {
            return true;
        } else {
            int var4 = arg1 << class295.field4543;
            int var5 = arg2 << class295.field4543;
            if (class288.method1935(var4 + 1, class407.field6024[arg0].method56(arg1, arg2), var5 + 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1 + 1, arg2), var5 + 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1 + 1, arg2 + 1), class90.field1454 + var5 - 1) && class288.method1935(var4 + 1, class407.field6024[arg0].method56(arg1, arg2 + 1), class90.field1454 + var5 - 1) && class288.method1935(class74.field1258 + var4, class407.field6024[arg0].method56(arg1, arg2), var5 + 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1 + 1, arg2), class74.field1258 + var5) && class288.method1935(class74.field1258 + var4, class407.field6024[arg0].method56(arg1, arg2 + 1), class90.field1454 + var5 - 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1, arg2), class74.field1258 + var5) && class288.method1935(class74.field1258 + var4, class407.field6024[arg0].method56(arg1, arg2), class74.field1258 + var5)) {
                class317.field4835[arg0][arg1][arg2] = class532.field7772;
                return true;
            } else {
                class317.field4835[arg0][arg1][arg2] = -class532.field7772;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)Z")
    public static final boolean method1130(int arg0, int arg1, int arg2) {
        if (arg0 < 44) {
            method1129(-75, 70, 76);
        }
        field2377++;
        return class517.method3055((byte) -122, arg2, arg1) & class51.method339(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field2378 = null;
        field2380 = null;
        field2385 = null;
        if (arg0 != 1) {
            method1131(56);
        }
        field2383 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1132(boolean arg0, String arg1, byte arg2) {
        field2379++;
        if (arg1 == null) {
            return;
        }
        if (class324.field4920 >= 100) {
            class492.method2961(0, class428.field6363.method1265(class345.field5141, -98));
            return;
        }
        String var3 = class35.method215(arg1, -112);
        if (var3 == null) {
            return;
        }
        int var4 = -19 % ((arg2 - 24) / 45);
        for (int var5 = 0; var5 < class324.field4920; var5++) {
            String var9 = class35.method215(class8.field95[var5], -99);
            if (var9 != null && var9.equals(var3)) {
                class492.method2961(0, arg1 + class517.field7510.method1265(class345.field5141, -113));
                return;
            }
            if (class484.field7094[var5] != null) {
                String var10 = class35.method215(class484.field7094[var5], -93);
                if (var10 != null && var10.equals(var3)) {
                    class492.method2961(0, arg1 + class517.field7510.method1265(class345.field5141, -113));
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < class6.field80; var6++) {
            String var7 = class35.method215(class265.field4229[var6], -128);
            if (var7 != null && var7.equals(var3)) {
                class492.method2961(0, class536.field7861.method1265(class345.field5141, -95) + arg1 + class229.field3459.method1265(class345.field5141, -102));
                return;
            }
            if (class289.field4483[var6] != null) {
                String var8 = class35.method215(class289.field4483[var6], -108);
                if (var8 != null && var8.equals(var3)) {
                    class492.method2961(0, class536.field7861.method1265(class345.field5141, -118) + arg1 + class229.field3459.method1265(class345.field5141, -79));
                    return;
                }
            }
        }
        if (class35.method215(class116.field1781.field7437, -118).equals(var3)) {
            class492.method2961(0, class353.field5235.method1265(class345.field5141, -123));
            return;
        }
        class407.field6031++;
        class110.method857(4095, class346.field5152);
        class312.field4752.method1381(class447.method2755(arg1, (byte) -101) + 1, (byte) 125);
        class312.field4752.method1343(arg1, (byte) -14);
        class312.field4752.method1381(arg0 ? 1 : 0, (byte) 88);
    }

    static {
        new class179("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field2387 = 503;
        field2386 = 0;
    }
}
