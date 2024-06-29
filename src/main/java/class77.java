import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class77 extends class194 {

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Lhj;")
    public static class596 field1046 = new class596(27, 6);

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field1048 = 1;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "F")
    public static float field1047;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lpda;")
    public static class657[] field1049;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method708(int arg0, int arg1, int arg2) {
        if (arg1 != -184949524) {
            method711(null, true, null);
        }
        field1050++;
        if (arg0 >= 0 && arg2 >= 0 && arg0 < class124.field1585[1].length && arg2 < class124.field1585[1][arg0].length) {
            return (class124.field1585[1][arg0][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BILha;)V", line = 22)
    public static final void method709(byte arg0, int arg1, class66 arg2) {
        field1051++;
        if (arg0 < 58) {
            return;
        }
        if (!class775.field10694 || !class722.field10132) {
            class222.field2583 = 0;
            return;
        }
        if (class237.field2792) {
            class790.field10883 = class642.field8763.method679((byte) -117);
        }
        class454.field6398 = 0;
        class727.field10185 = 0;
        class435.field5744 = 0;
        int[] var3 = arg2.method569();
        class71.field984 = (int) ((float) var3[3] / 3.0F);
        class454.field6397 = (int) ((float) var3[2] / 3.0F);
        arg2.method648(class316.field3888);
        if (((int) ((float) class316.field3888[0] / 3.0F)) != class594.field8079 || ((int) ((float) class316.field3888[1] / 3.0F)) != class274.field3211) {
            class594.field8079 = (int) ((float) class316.field3888[0] / 3.0F);
            class274.field3211 = (int) ((float) class316.field3888[1] / 3.0F);
            class288.field3474 = new int[class594.field8079 * class274.field3211];
            class304.field3623 = class594.field8079 >> 1;
            class495.field6888 = class274.field3211 >> 1;
        }
        class720.field10112 = arg2.method574();
        class222.field2583 = 0;
        for (int var4 = 0; var4 < class680.field9312; var4++) {
            class254.method1511(class382.field4860[var4], 78, arg1, arg2);
        }
        for (int var5 = 0; var5 < class168.field2027; var5++) {
            class254.method1511(class141.field1767[var5], 115, arg1, arg2);
        }
        for (int var6 = 0; var6 < class513.field7243; var6++) {
            class254.method1511(class345.field4315[var6], 62, arg1, arg2);
        }
        class107.field1353 = 0;
        if (class222.field2583 > 0) {
            int var7 = class288.field3474.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
                class288.field3474[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class288.field3474[var9++] = Integer.MAX_VALUE;
            }
            class480.field6714 = 1;
            for (int var10 = 0; var10 < class222.field2583; var10++) {
                class557 var11 = class379.field4807[var10];
                class571.method3314(var11.field7735[1], var11.field7747[0], var11.field7747[1], var11.field7739[0], var11.field7739[3], var11.field7735[0], var11.field7739[1], var11.field7735[3], var11.field7747[3], -17851);
                class571.method3314(var11.field7735[2], var11.field7747[1], var11.field7747[2], var11.field7739[1], var11.field7739[3], var11.field7735[1], var11.field7739[2], var11.field7735[3], var11.field7747[3], -17851);
            }
            class480.field6714 = 2;
        }
        if (class237.field2792) {
            class786.field10855 = class642.field8763.method679((byte) -104) - class790.field10883;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 132)
    public static void method710(int arg0) {
        if (arg0 <= -94) {
            field1049 = null;
            field1046 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lfda;ZLes;)Lca;", line = 147)
    public static final class323 method711(class340 arg0, boolean arg1, class403 arg2) {
        field1052++;
        class323 var3 = new class323(arg0);
        int var4 = arg2.method2396((byte) -112);
        boolean var5 = (var4 & 0x1) != 0;
        boolean var6 = (var4 & 0x2) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        boolean var8 = (var4 & 0x8) != 0;
        if (var5) {
            var3.field4013[0] = arg2.method2390((byte) 13);
            var3.field4009[0] = arg2.method2390((byte) -125);
            if (arg0.field4276 != -1 || arg0.field4238 != -1) {
                var3.field4013[1] = arg2.method2390((byte) -111);
                var3.field4009[1] = arg2.method2390((byte) -127);
            }
            if (arg0.field4189 != -1 || arg0.field4267 != -1) {
                var3.field4013[2] = arg2.method2390((byte) 45);
                var3.field4009[2] = arg2.method2390((byte) -98);
            }
        }
        if (var6) {
            var3.field4008[0] = arg2.method2390((byte) 54);
            var3.field4017[0] = arg2.method2390((byte) 89);
            if (arg0.field4204 != -1 || arg0.field4258 != -1) {
                var3.field4008[1] = arg2.method2390((byte) -104);
                var3.field4017[1] = arg2.method2390((byte) -104);
            }
        }
        if (!arg1) {
            return null;
        }
        if (var7) {
            int var9 = arg2.method2390((byte) 15);
            int[] var10 = new int[] { class296.method1733(15, var9), class296.method1733(var9 >> 4, 15), class296.method1733(var9 >> 8, 15), class296.method1733(var9 >> 12, 15) };
            for (int var11 = 0; var11 < 4; var11++) {
                if (var10[var11] != 15) {
                    var3.field4010[var10[var11]] = (short) arg2.method2390((byte) 95);
                }
            }
        }
        if (var8) {
            int var12 = arg2.method2396((byte) -87);
            int[] var13 = new int[] { class296.method1733(var12, 15), class296.method1733(var12, 242) >> 4 };
            for (int var14 = 0; var14 < 2; var14++) {
                if (var13[var14] != 15) {
                    var3.field4012[var13[var14]] = (short) arg2.method2390((byte) 36);
                }
            }
        }
        return var3;
    }
}
