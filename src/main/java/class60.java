import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class60 extends class529 {

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field920 = new String[100];

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[S")
    public static short[] field919 = new short[256];

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field918 = new String[100];

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Ljava/lang/String;")
    public static String field917 = null;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 7)
    public static final void method399(byte arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field923++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class313.field4936.field6368 : class313.field4936.field6367) + var6;
        if (arg0 >= -20) {
            method400(49);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class71 var11 = class313.field4936.method2586(var8, false);
            if (var11.field1228 && var11.method507((byte) 118).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class255.field4323 = null;
                    class71.field1233 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class255.field4323 = var4;
        class71.field1233 = var5;
        class142.field2342 = 0;
        String[] var9 = new String[class71.field1233];
        for (int var10 = 0; var10 < class71.field1233; var10++) {
            var9[var10] = class313.field4936.method2586(var4[var10], false).method507((byte) 98);
        }
        class503.method2970(357232963, class255.field4323, var9);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 85)
    public static final void method400(int arg0) {
        class101.method696((byte) -16, false);
        field924++;
        class509.field7393 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class162.field2567.length; var2++) {
            if (class101.field1671[var2] != -1 && class162.field2567[var2] == null) {
                class162.field2567[var2] = class388.field5971.method2926(0, -67, class101.field1671[var2]);
                if (class162.field2567[var2] == null) {
                    class509.field7393++;
                    var1 = false;
                }
            }
            if (class160.field2565[var2] != -1 && class53.field855[var2] == null) {
                class53.field855[var2] = class388.field5971.method2938(125, class52.field845[var2], 0, class160.field2565[var2]);
                if (class53.field855[var2] == null) {
                    class509.field7393++;
                    var1 = false;
                }
            }
            if (class397.field6073[var2] != -1 && class503.field7345[var2] == null) {
                class503.field7345[var2] = class388.field5971.method2926(0, -76, class397.field6073[var2]);
                if (class503.field7345[var2] == null) {
                    class509.field7393++;
                    var1 = false;
                }
            }
            if (class435.field6508[var2] != -1 && class197.field3092[var2] == null) {
                class197.field3092[var2] = class388.field5971.method2926(0, -115, class435.field6508[var2]);
                if (class197.field3092[var2] == null) {
                    class509.field7393++;
                    var1 = false;
                }
            }
            if (class505.field7360 != null && class496.field7243[var2] == null && class505.field7360[var2] != -1) {
                class496.field7243[var2] = class388.field5971.method2938(84, class52.field845[var2], 0, class505.field7360[var2]);
                if (class496.field7243[var2] == null) {
                    var1 = false;
                    class509.field7393++;
                }
            }
        }
        if (class15.field172 == null) {
            if (class246.field4203 == null || !class208.field3292.method2944(-86, class246.field4203.field5442 + "_staticelements")) {
                class15.field172 = new class73(0);
            } else if (class208.field3292.method2915(class246.field4203.field5442 + "_staticelements", -122)) {
                class15.field172 = class194.method1295(class246.field4203.field5442 + "_staticelements", (byte) -104, class208.field3292, class347.field5452);
            } else {
                var1 = false;
                class509.field7393++;
            }
        }
        if (arg0 >= -18) {
            return;
        }
        if (!var1) {
            class517.field7647 = 1;
            return;
        }
        boolean var3 = true;
        class485.field7117 = 0;
        for (int var4 = 0; var4 < class162.field2567.length; var4++) {
            byte[] var19 = class53.field855[var4];
            if (var19 != null) {
                int var20 = (class23.field328[var4] >> 8) * 64 - class16.field181;
                int var21 = (class23.field328[var4] & 0xFF) * 64 - class455.field6794;
                if (class194.field3037 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class455.method2729(var19, class277.field4548, var20, class217.field3775, var21, -1);
            }
            byte[] var22 = class197.field3092[var4];
            if (var22 != null) {
                int var23 = (class23.field328[var4] >> 8) * 64 - class16.field181;
                int var24 = (class23.field328[var4] & 0xFF) * 64 - class455.field6794;
                if (class194.field3037 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class455.method2729(var22, class277.field4548, var23, class217.field3775, var24, -1);
            }
        }
        if (!var3) {
            class517.field7647 = 2;
            return;
        }
        if (class517.field7647 != 0) {
            class499.method2954(true, class519.field7664.method1954(class300.field4813, -30366) + "<br>(100%)", 88, class531.field7796);
        }
        class529.method3131(114);
        class416.method2565((byte) -49);
        boolean var5 = false;
        if (class305.field4873.method881() && class510.field7403.field5111) {
            for (int var6 = 0; var6 < class162.field2567.length; var6++) {
                if (class197.field3092[var6] != null || class503.field7345[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class510.field7403.field5101) {
            var7 = class104.field1741[class386.field5952];
        } else {
            var7 = class315.field4960[class386.field5952];
        }
        if (class305.field4873.method896()) {
            var7++;
        }
        class333.method2099(7, 4, class217.field3775, class277.field4548, var7, var5, class305.field4873.method883() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class106.field1865[var8].method1706(125);
        }
        class293.method1883(0);
        class156.method1089((byte) -25, false);
        class123.method975(true);
        class162.field2571 = null;
        class529.method3131(-112);
        System.gc();
        class101.method696((byte) -16, true);
        class214.method1436((byte) 124);
        class177.field2810 = class510.field7403.method2041(-88, class511.field7485);
        class448.field6684 = class510.field7403.field5111;
        class396.field6054 = class101.field1668 >= 96;
        class71.field1234 = class510.field7403.method2045(4, class511.field7485);
        class446.field6674 = !class510.field7403.field5096;
        class431.field6462 = class510.field7403.method1188(class511.field7485, -124) ? -1 : class229.field3994;
        class1.field3 = class511.field7485 == 1 || class510.field7403.field5100;
        class527.field7767 = class510.field7403.field5125;
        class525.field7719 = new class83(4, class217.field3775, class277.field4548, false);
        if (class194.field3037 == 0) {
            class67.method433(9, class525.field7719, class162.field2567);
        } else {
            class389.method2435(false, class162.field2567, class525.field7719);
        }
        class519.method3067((byte) -99, class217.field3775 >> 4, class277.field4548 >> 4);
        class503.method2969((byte) 32);
        if (var5) {
            class475.method2808(true);
            class202.field3200 = new class83(1, class217.field3775, class277.field4548, true);
            if (class194.field3037 == 0) {
                class67.method433(9, class202.field3200, class503.field7345);
                class101.method696((byte) -16, true);
            } else {
                class389.method2435(false, class503.field7345, class202.field3200);
                class101.method696((byte) -16, true);
            }
            class202.field3200.method561(0, (byte) -7, class525.field7719.field1348[0]);
            class202.field3200.method555(null, class305.field4873, null, 128);
            class475.method2808(false);
        }
        class525.field7719.method555(class106.field1865, class305.field4873, var5 ? class202.field3200.field1348 : null, 128);
        if (class194.field3037 == 0) {
            class101.method696((byte) -16, true);
            class302.method1935(class525.field7719, class53.field855, false);
            if (class496.field7243 != null) {
                class366.method2328(9622);
            }
        } else {
            class101.method696((byte) -16, true);
            class139.method1040(8, class53.field855, class525.field7719);
        }
        class416.method2565((byte) -49);
        class101.method696((byte) -16, true);
        class525.field7719.method550(var5 ? class320.field5039[0] : null, class305.field4873, 28205, null);
        class525.field7719.method595(1727080551, class305.field4873);
        class101.method696((byte) -16, true);
        if (var5) {
            class475.method2808(true);
            class101.method696((byte) -16, true);
            if (class194.field3037 == 0) {
                class302.method1935(class202.field3200, class197.field3092, false);
            } else {
                class139.method1040(8, class197.field3092, class202.field3200);
            }
            class416.method2565((byte) -49);
            class101.method696((byte) -16, true);
            class202.field3200.method550(null, class305.field4873, 28205, class511.field7488[0]);
            class202.field3200.method595(1727080551, class305.field4873);
            class101.method696((byte) -16, true);
            class475.method2808(false);
        }
        class159.method1108(true);
        int var9 = class525.field7719.field1446;
        if (class93.field1556 < var9) {
            var9 = class93.field1556;
        }
        if ((class93.field1556 - 1) > var9) {
            var9 = class93.field1556 - 1;
        }
        if (class510.field7403.method1188(class511.field7485, -117)) {
            class197.method1311(0);
        } else {
            class197.method1311(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class217.field3775; var17++) {
                for (int var18 = 0; var18 < class277.field4548; var18++) {
                    class156.method1086(-122, var17, var18, var10);
                }
            }
        }
        class160.method1113(0);
        class529.method3131(-97);
        class37.method276((byte) 78);
        class416.method2565((byte) -49);
        class107.field1903 = false;
        class328.method2070(-257);
        if (class346.field5450 != null && class463.field6886 != null && class32.field515 == 10) {
            class187.field2916++;
            class265.method1775(-2, class166.field2666);
            class261.field4357.method152(1057001181, (byte) -38);
        }
        if (class194.field3037 == 0) {
            int var11 = (class419.field6341 - (class217.field3775 >> 4)) / 8;
            int var12 = ((class217.field3775 >> 4) + class419.field6341) / 8;
            int var13 = (class344.field5393 - (class277.field4548 >> 4)) / 8;
            int var14 = ((class277.field4548 >> 4) + class344.field5393) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var15 > var12 || var13 > var16 || var14 < var16) {
                        class388.field5971.method2931(false, "m" + var15 + "_" + var16);
                        class388.field5971.method2931(false, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class32.field515 == 3) {
            class75.method540(-7, 2);
        } else if (class32.field515 == 7) {
            class75.method540(-7, 6);
        } else {
            class75.method540(-7, 9);
            if (class463.field6886 != null) {
                class265.method1775(-2, class396.field6051);
            }
        }
        class366.method2330((byte) -89);
        class529.method3131(89);
        class309.method1967(-7188);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 570)
    public static void method401(int arg0) {
        field918 = null;
        field920 = null;
        field917 = null;
        field919 = null;
        if (arg0 > -105) {
            field919 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V", line = 588)
    public static final void method402(byte arg0, int arg1, int arg2) {
        if (arg0 != 116) {
            field922 = 119;
        }
        field921++;
        if (class271.field4501 == class131.field2246) {
            if (!class452.method2703(0, -2, arg1, arg2, 0, (byte) -119, false, 1, 1)) {
                class452.method2703(0, -3, arg1, arg2, 0, (byte) -115, false, 1, 1);
            }
        } else if (!class452.method2703(0, -3, arg1, arg2, 0, (byte) -124, false, 1, 1)) {
            class452.method2703(0, -2, arg1, arg2, 0, (byte) -115, false, 1, 1);
        }
    }
}
