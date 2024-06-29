import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lwa;")
    private static class75 field986 = class66.method560("wave:", false);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "S")
    public static short field991 = 32767;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lwa;")
    public static class75 field987 = field986;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lwa;")
    public static class75 field983 = field986;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
    public static int[] field993 = new int[32];

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lvf;")
    public static class292 field990 = new class292(0, 0);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Loh;")
    public static class15 field994;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Ldk;")
    public static class200 field992;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lcb;")
    public static class267 field995;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 6)
    public static final void method471(int arg0) {
        class279.field4841.method964((byte) 106);
        class139.field2413 = arg0;
        class127.field2212 = null;
        field989++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZIII)V", line = 20)
    public static final void method472(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class190.field3167++;
        field988++;
        if (!arg2) {
            class120.method915(true, true);
            class35.method236(true, -70);
            class120.method915(false, true);
        }
        class35.method236(false, -76);
        if (!arg2) {
            class266.method1890(23347);
        }
        class185.method1400(true);
        class93.method726(arg4, (byte) 48, arg3, arg1, arg0, true);
        int var6 = class157.field2689;
        int var7 = class104.field1760;
        int var8 = class161.field2735;
        int var9 = class157.field2699;
        if (class163.field2777 == 1) {
            int var10 = class290.field4981 + class155.field2656 & 0x7FF;
            int var11 = class95.field1547;
            if ((class73.field1226 / 256) > var11) {
                var11 = class73.field1226 / 256;
            }
            if (class169.field2841[4] && var11 < (class31.field453[4] + 128)) {
                var11 = class31.field453[4] + 128;
            }
            class186.method1408(var11, var11 * 3 + 600, (byte) 10, class190.field3163, var8, var10, class180.field3026, class32.method217(class279.field4831.field3259, class279.field4831.field3218, true, class67.field1174) - 50);
        }
        int var12 = class245.field4120;
        int var13 = class9.field121;
        int var14 = class87.field1433;
        int var15 = class232.field3931;
        int var16 = class228.field3825;
        for (int var17 = 0; var17 < 5; var17++) {
            if (class169.field2841[var17]) {
                int var18 = (int) (Math.random() * (double) (class180.field3028[var17] * 2 + 1) + Math.sin((double) class232.field3922[var17] / 100.0D * (double) class270.field4655[var17]) * (double) class31.field453[var17] - (double) class180.field3028[var17]);
                if (var17 == 3) {
                    class87.field1433 = class87.field1433 + var18 & 0x7FF;
                }
                if (var17 == 2) {
                    class9.field121 += var18;
                }
                if (var17 == 1) {
                    class228.field3825 += var18;
                }
                if (var17 == 4) {
                    class232.field3931 += var18;
                    if (class232.field3931 < 128) {
                        class232.field3931 = 128;
                    }
                    if (class232.field3931 > 383) {
                        class232.field3931 = 383;
                    }
                }
                if (var17 == 0) {
                    class245.field4120 += var18;
                }
            }
        }
        class255.method1819(-1);
        class222.method1638(var6, var9, var6 + var7, var9 - -var8);
        float var19 = (float) class232.field3931 * 0.17578125F;
        float var20 = (float) class87.field1433 * 0.17578125F;
        if (class163.field2777 == 3) {
            var19 = class10.field127 * 360.0F / 6.2831855F;
            var20 = class127.field2210 * 360.0F / 6.2831855F;
        }
        class47.method333(var6, var9, var7, var8, var7 / 2 + var6, var8 / 2 + var9, var19, var20, class302.field5163, class302.field5163);
        if (class153.field2625 || var6 > class152.field2623 || (var6 + var7) <= class152.field2623 || class217.field3708 < var9 || (var8 + var9) <= class217.field3708) {
            class82.field1372 = false;
            class120.field2023 = 0;
        } else {
            class82.field1372 = true;
            class120.field2023 = 0;
            int var21 = class297.field5083;
            int var22 = class253.field4250;
            class11.field155 = (class152.field2623 - var6) * (var21 - var22) / var7 + var22;
            int var23 = class2.field5;
            int var24 = class180.field3021;
            class161.field2740 = (class217.field3708 - var9) * (var23 - var24) / var8 + var24;
        }
        class54.method393((byte) 43);
        byte var25 = class120.method914((byte) 92) == 2 ? (byte) class190.field3167 : 1;
        class47.method334();
        boolean var26 = false;
        class47.method335(true);
        class47.method320(true);
        int var27;
        if (class118.field2003 == 10) {
            var27 = class16.method90(class253.field4256, class245.field4120 >> 10, class250.field4208, false, class9.field121 >> 10);
        } else {
            var27 = class16.method90(class253.field4256, class279.field4831.field3236[0] >> 3, class250.field4208, false, class279.field4831.field3205[0] >> 3);
        }
        class209.method1548(class143.field2463, !class125.field2088);
        class47.method327(var27);
        class13.method71(16711680, class228.field3825, class245.field4120, class232.field3931, class87.field1433, class9.field121);
        class47.field743 = class143.field2463;
        class294.method2046(class245.field4120, class228.field3825, class9.field121, class232.field3931, class87.field1433, class198.field3324, class198.field3316, class176.field2957, class145.field2500, class223.field3783, class5.field59, class67.field1174 + 1, var25, class279.field4831.field3259 >> 7, class279.field4831.field3218 >> 7);
        class214.field3640 = true;
        class209.method1554();
        class13.method71(16711680, 0, 0, 0, 0, 0);
        class54.method393((byte) 43);
        class34.method224();
        class196.method1464(18103, var7, class302.field5163, var6, class302.field5163, var8, var9);
        class283.method2004(-28, var8, var6, class302.field5163, var9, class302.field5163, var7);
        if (arg5 > -83) {
            return;
        }
        ((class139) class21.field279).method1077(-82, class250.field4208);
        class212.method1568(var6, var8, var7, var9, true);
        class228.field3825 = var16;
        class245.field4120 = var12;
        class9.field121 = var13;
        class232.field3931 = var15;
        class87.field1433 = var14;
        if (class175.field2934 && class242.field4072.method29(0) == 0) {
            class175.field2934 = false;
        }
        if (class175.field2934) {
            class222.method1632(var6, var9, var7, var8, 0);
            class145.method1110(class282.field4861, -1, false);
        }
        if (!arg2 && !class175.field2934 && !class153.field2625 && var6 <= class152.field2623 && class152.field2623 < (var6 + var7) && var9 <= class217.field3708 && class217.field3708 < (var8 + var9)) {
            class163.method1223(class152.field2623, var6, var7, var8, class217.field3708, -65, var9);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 215)
    public static void method473(int arg0) {
        field987 = null;
        field994 = null;
        field993 = null;
        field990 = null;
        field983 = null;
        field986 = null;
        field995 = null;
        if (arg0 >= -20) {
            field987 = (class75) null;
        }
        field992 = null;
    }
}
