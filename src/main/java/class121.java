import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class121 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    public static int[] field2130 = new int[5];

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lke;")
    public static class256 field2132 = class316.method2202(")1", 27626);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lrb;")
    public static class144 field2124;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Leb;")
    public static class270 field2127;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lke;I)Z", line = 14)
    public static final boolean method811(class256 arg0, int arg1) {
        field2125++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class311.field5358; var2++) {
            if (arg0.method1769(class124.field2203[var2], (byte) 96)) {
                return true;
            }
        }
        int var3 = 73 / ((3 - arg1) / 32);
        if (arg0.method1769(field2124.field2532, (byte) 41)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILvb;Z)V", line = 43)
    public static final void method812(int arg0, int arg1, int arg2, class74 arg3, boolean arg4) {
        field2126++;
        if (class17.field244 >= 400) {
            return;
        }
        if (arg3.field1381 != null) {
            arg3 = arg3.method553(4175);
        }
        if (arg3 == null || !arg3.field1419) {
            return;
        }
        class256 var5 = arg3.field1422;
        if (arg3.field1396 != 0) {
            class256 var6 = class206.field3735 == 1 ? class64.field1124 : class181.field3201;
            var5 = class30.method214(new class256[] { var5, class195.method1414(field2124.field2549, arg3.field1396, (byte) -103), class28.field382, var6, class305.method2125((byte) 50, arg3.field1396), class310.field5339 }, 29784);
        }
        if (arg4) {
            method811((class256) null, -72);
        }
        if (class21.field273 == 1) {
            class287.field4974++;
            class144.method1057(class30.method214(new class256[] { class99.field1765, class102.field1845, var5 }, 29784), arg2, (short) 59, -116, arg0, class251.field4260, class76.field1450, (long) arg1);
        } else if (!class320.field5489) {
            class49.field887++;
            class256[] var7 = arg3.field1415;
            if (class101.field1803) {
                var7 = class39.method298(var7, (byte) 61);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class206.field3735 != 0 || !var7[var8].method1769(class38.field696, (byte) 32))) {
                        class56.field1020++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (arg3.field1397 == var8) {
                            var10 = arg3.field1391;
                        }
                        if (var8 == 0) {
                            var9 = 10;
                        }
                        if (var8 == 1) {
                            var9 = 37;
                        }
                        if (var8 == 2) {
                            var9 = 49;
                        }
                        if (arg3.field1420 == var8) {
                            var10 = arg3.field1349;
                        }
                        if (var8 == 3) {
                            var9 = 26;
                        }
                        if (var8 == 4) {
                            var9 = 46;
                        }
                        class144.method1057(class30.method214(new class256[] { class298.field5161, var5 }, 29784), arg2, var9, 123, arg0, var7[var8], var10, (long) arg1);
                    }
                }
            }
            if (class206.field3735 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1769(class38.field696, (byte) 83)) {
                        class183.field3242++;
                        short var12 = 0;
                        if (var11 == 0) {
                            var12 = 10;
                        }
                        short var13 = 0;
                        if (arg3.field1396 > field2124.field2549) {
                            var13 = 2000;
                        }
                        if (var11 == 1) {
                            var12 = 37;
                        }
                        if (var11 == 2) {
                            var12 = 49;
                        }
                        if (var11 == 3) {
                            var12 = 26;
                        }
                        if (var11 == 4) {
                            var12 = 46;
                        }
                        if (var12 != 0) {
                            var12 += var13;
                        }
                        class144.method1057(class30.method214(new class256[] { class298.field5161, var5 }, 29784), arg2, var12, 114, arg0, var7[var11], arg3.field1402, (long) arg1);
                    }
                }
            }
            class144.method1057(class30.method214(new class256[] { class298.field5161, var5 }, 29784), arg2, (short) 1003, 97, arg0, class88.field1575, class241.field4106, (long) arg1);
        } else if ((class173.field3079 & 0x2) == 2) {
            class250.field4250++;
            class144.method1057(class30.method214(new class256[] { class24.field319, class102.field1845, var5 }, 29784), arg2, (short) 41, 109, arg0, class261.field4511, -1, (long) arg1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 203)
    public static void method813(byte arg0) {
        if (arg0 < 29) {
            method811((class256) null, 39);
        }
        field2127 = null;
        field2132 = null;
        field2130 = null;
        field2124 = null;
    }
}
