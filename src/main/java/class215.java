import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class215 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2926 = 0;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "[I")
    public static int[] field2931 = new int[25];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1403(int arg0) {
        field2931 = null;
        if (arg0 != -33) {
            method1405((byte) 82, -58);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
    public static final void method1404(int arg0, boolean arg1) {
        field2927++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var3 = 1;
            var2 = class37.field382;
        } else {
            var2 = class349.field5097;
            var3 = 4;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class71.field805[var5] >> 8;
            int var14 = class71.field805[var5] & 0xFF;
            int var15 = var13 * 64 - class40.field427;
            int var16 = var14 * 64 - class217.field2975;
            if (var12 != null) {
                class58.method365(-26586);
                var11 = class37.method219(var3, var12, arg1, 2013797635, var16, class40.field427, class218.field2991, class54.field613, class217.field2975, var15);
            }
            if (!arg1 && class426.field6175 / 8 == var13 && class367.field5357 / 8 == var14) {
                if (var11 == null) {
                    class434.field6366 = null;
                } else {
                    class434.field6366 = class359.method2287(var11[2], 0, var11[1], var11[3], var11[0]);
                    class50.field582 = var11[4];
                }
            }
        }
        if (arg0 != 177) {
            method1407(25, -85, (byte) -80);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class71.field805[var6] >> 8) * 64 - class40.field427;
            int var8 = (class71.field805[var6] & 0xFF) * 64 - class217.field2975;
            byte[] var9 = var2[var6];
            if (var9 == null && class367.field5357 < 800) {
                class58.method365(arg0 ^ 0xFFFF9897);
                for (int var10 = 0; var10 < var3; var10++) {
                    class169.method1114(64, var10, var7, 64, var8, (byte) -93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V")
    public static final void method1405(byte arg0, int arg1) {
        int var2 = 77 % ((-arg0 - 62) / 34);
        field2929++;
        class348 var3 = class385.method2464(3, 1302, arg1);
        var3.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1406(String arg0, byte arg1) {
        field2928++;
        if (arg0 == null) {
            return;
        }
        if (!(class100.field1124 < 100 || class63.field727) || class100.field1124 >= 200) {
            class413.method2589(class233.field3144, 0);
            return;
        }
        String var2 = class407.method2567(arg0, -13);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class100.field1124; var3++) {
            String var7 = class407.method2567(class302.field4300[var3], -13);
            if (var7 != null && var7.equals(var2)) {
                class413.method2589(arg0 + class73.field821, 0);
                return;
            }
            if (class96.field1076[var3] != null) {
                String var8 = class407.method2567(class96.field1076[var3], -13);
                if (var8 != null && var8.equals(var2)) {
                    class413.method2589(arg0 + class73.field821, 0);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class166.field2326; var4++) {
            String var5 = class407.method2567(class100.field1129[var4], -13);
            if (var5 != null && var5.equals(var2)) {
                class413.method2589(class10.field114 + arg0 + class422.field6059, 0);
                return;
            }
            if (class301.field4298[var4] != null) {
                String var6 = class407.method2567(class301.field4298[var4], -13);
                if (var6 != null && var6.equals(var2)) {
                    class413.method2589(class10.field114 + arg0 + class422.field6059, 0);
                    return;
                }
            }
        }
        if (arg1 > -120) {
            return;
        }
        if (class407.method2567(class390.field5715.field1847, -13).equals(var2)) {
            class413.method2589(class323.field4556, 0);
        } else {
            class146.field2047++;
            class169.field2360.method809(177, -28022);
            class169.field2360.method1396(21375, class233.method1488(-19285, arg0));
            class169.field2360.method1359((byte) 0, arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)V")
    public static final void method1407(int arg0, int arg1, byte arg2) {
        if (class218.field2979 != arg0) {
            class43.field530 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class43.field530[var3] = (var3 << 12) / arg0;
            }
            class196.field2673 = arg0 * 32;
            class218.field2979 = arg0;
            class92.field1013 = arg0 - 1;
        }
        if (arg2 <= 18) {
            method1407(49, -120, (byte) 13);
        }
        field2932++;
        if (class392.field5738 == arg1) {
            return;
        }
        if (class218.field2979 == arg1) {
            class193.field2634 = class43.field530;
        } else {
            class193.field2634 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class193.field2634[var4] = (var4 << 12) / arg1;
            }
        }
        class392.field5738 = arg1;
        class315.field4488 = arg1 - 1;
    }
}
