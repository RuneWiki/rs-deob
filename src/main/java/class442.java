import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class442 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[F")
    public static float[] field5718 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lnj;")
    public static class415 field5717 = new class415(33, -1);

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 6)
    public static final String method2507(String arg0, int arg1) {
        field5721++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 0;
        if (arg1 != -14) {
            method2508(-85, -78);
        }
        while (var6 < var2) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
            var6++;
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V", line = 59)
    public static final void method2508(int arg0, int arg1) {
        field5720++;
        if (class566.field7391 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class285.field3701 == null) {
                class700.method3832(class135.field1784, 69, class83.field1128, class222.field2906);
            } else {
                class512.method2762(class222.field2906, -1);
            }
        }
        if (arg1 != 1) {
            method2510(88);
        }
        if (arg0 != 13 && class535.field6958 != null) {
            class535.field6958.method281(0);
            class535.field6958 = null;
        }
        if (arg0 == 3) {
            class445.method2521(class658.field9177 != class196.field2562, 81);
        }
        if (arg0 == 7) {
            class50.method445(-9017, class196.field2562 != class196.field2551);
        }
        if (arg0 == 5) {
            if (class285.field3701 == null) {
                class196.method1297(class83.field1128, true, class135.field1784);
            } else {
                class615.method3358((byte) -11);
            }
        } else if (arg0 == 6) {
            if (class285.field3701 == null) {
                class700.method3832(class135.field1784, 90, class83.field1128, class222.field2906);
            } else {
                class512.method2762(class222.field2906, -1);
            }
        } else if (arg0 == 9) {
            if (class285.field3701 == null) {
                class700.method3832(class135.field1784, 111, class83.field1128, class222.field2906);
            } else {
                class512.method2762(class222.field2906, arg1 - 2);
            }
        } else if (arg0 == 12) {
            if (class285.field3701 == null) {
                class196.method1297(class83.field1128, true, class135.field1784);
            } else {
                class615.method3358((byte) -11);
            }
        }
        if (class232.method1474(class566.field7391, arg1 + 32141)) {
            class262.field3517.field8306 = 2;
            class187.field2382.field8306 = 2;
            class253.field3452.field8306 = 2;
            class129.field1647.field8306 = 2;
            class493.field6524.field8306 = 2;
            class278.field3647.field8306 = 2;
            class331.field4309.field8306 = 2;
        }
        if (class232.method1474(arg0, 32142)) {
            class438.field5668 = 0;
            class41.field577 = 0;
            class402.field5147 = 0;
            class172.field2127 = 1;
            class191.field2444 = 1;
            class495.method2697((byte) 120, true);
            class262.field3517.field8306 = 1;
            class187.field2382.field8306 = 1;
            class253.field3452.field8306 = 1;
            class129.field1647.field8306 = 1;
            class493.field6524.field8306 = 1;
            class278.field3647.field8306 = 1;
            class331.field4309.field8306 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class419.method2417(1);
        }
        boolean var2 = arg0 == 2 || class302.method1772((byte) -30, arg0) || class61.method517((byte) -69, arg0);
        boolean var3 = class566.field7391 == 2 || class302.method1772((byte) -30, class566.field7391) || class61.method517((byte) -64, class566.field7391);
        if (var2 != var3) {
            if (var2) {
                class166.field2085 = class413.field5317;
                if (class260.field3509.field1302 == 0) {
                    class385.method2195(2, 0);
                } else {
                    class459.method2582(class413.field5317, false, 0, 2, arg1 + 17820, class6.field53, class260.field3509.field1302);
                }
                class448.field5870.method3591(false, 117);
            } else {
                class385.method2195(2, arg1 - 1);
                class448.field5870.method3591(true, 116);
            }
        }
        if (class232.method1474(arg0, 32142) || arg0 == 13) {
            class520.field6799.method180();
        }
        class566.field7391 = arg0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 208)
    public static void method2509(int arg0) {
        field5718 = null;
        if (arg0 == 1) {
            field5717 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 228)
    public static final void method2510(int arg0) {
        field5722++;
        class492.field6520.method613(-80);
        for (int var1 = 0; var1 < 32; var1++) {
            class103.field1372[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class3.field22[var2] = 0L;
        }
        class259.field3498 = 0;
        if (arg0 != 32) {
            field5718 = null;
        }
    }
}
