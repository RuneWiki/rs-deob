import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class24 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lvd;")
    public static class153 field282;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 14)
    public static void method179(byte arg0) {
        field282 = null;
        int var1 = -29 % ((arg0 + 42) / 53);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ICB)C", line = 29)
    public static final char method180(int arg0, char arg1, byte arg2) {
        field286++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 != 34) {
            return (char) 65456;
        } else if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIZZ)V", line = 125)
    public static final void method181(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class182.field2745++;
        class35.method235((byte) 10);
        field280++;
        if (!arg4) {
            return;
        }
        if (arg5) {
            class73.method454(0, false, false, (byte) 87);
        } else {
            class280.method2002(0, (byte) 123);
            class73.method454(0, false, true, (byte) 87);
            if (class148.field2358 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class73.method454(var7, false, false, (byte) 87);
                    class73.method454(var7, true, false, (byte) 87);
                    class280.method2002(var7, (byte) 109);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class280.method2002(var6, (byte) 99);
                    class73.method454(var6, false, false, (byte) 87);
                    class73.method454(var6, true, false, (byte) 87);
                }
            }
        }
        if (!arg5) {
            class194.method1346(31440);
        }
        class86.method547(-1);
        if (class272.field4317) {
            class180.method1246(arg2, arg0, 66, arg1, true, arg3);
            arg1 = class227.field3432;
            arg0 = class161.field2475;
            arg2 = class357.field5664;
            arg3 = class351.field5604;
        }
        class141.field2181 = arg2;
        class141.field2182 = arg3;
        if (class120.field1667 == 1) {
            int var8 = (int) class103.field1423;
            if (class283.field4507 / 256 > var8) {
                var8 = class283.field4507 / 256;
            }
            int var9 = (int) class190.field2855 + class64.field772 & 0x7FF;
            if (class231.field3497[4] && var8 < (class42.field466[4] + 128)) {
                var8 = class42.field466[4] + 128;
            }
            class250.method1777((var8 * 3) + 600, class14.method80(class11.field113.field3763, class219.field3290, class11.field113.field3767, (byte) -126) + -50, 0, var8, var9, class313.field4897, class347.field5497, arg0);
        } else if (class120.field1667 == 5) {
            class309.method2177(arg0, (byte) -85);
        }
        int var10 = class119.field1657;
        int var11 = class10.field96;
        int var12 = class280.field4415;
        int var13 = class283.field4508;
        int var14 = class257.field4067;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class231.field3497[var15]) {
                int var16 = (int) (Math.random() * (double) (class208.field3151[var15] * 2 + 1) + Math.sin((double) class280.field4409[var15] / 100.0D * (double) class110.field1510[var15]) * (double) class42.field466[var15] - (double) class208.field3151[var15]);
                if (var15 == 0) {
                    class10.field96 += var16;
                }
                if (var15 == 3) {
                    class257.field4067 = class257.field4067 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class280.field4415 += var16;
                }
                if (var15 == 1) {
                    class119.field1657 += var16;
                }
                if (var15 == 4) {
                    class283.field4508 += var16;
                    if (class283.field4508 < 128) {
                        class283.field4508 = 128;
                    }
                    if (class283.field4508 > 383) {
                        class283.field4508 = 383;
                    }
                }
            }
        }
        class17.method127(2552);
        if (class272.field4317) {
            class239.method1668(arg3, arg2, arg1 + arg3, arg0 + arg2);
            float var17 = (float) class283.field4508 * 0.17578125F;
            float var18 = (float) class257.field4067 * 0.17578125F;
            if (class120.field1667 == 3) {
                var18 = class257.field4071 * 360.0F / 6.2831855F;
                var17 = class147.field2343 * 360.0F / 6.2831855F;
            }
            boolean var19 = false;
            int var20;
            if (client.field4443 == 10) {
                var20 = class349.method2426(class164.field2522, -27796, class10.field96 >> 10, class266.field4193, class280.field4415 >> 10);
            } else {
                var20 = class349.method2426(class164.field2522, -27796, class11.field113.field3747[0] >> 3, class266.field4193, class11.field113.field3786[0] >> 3);
            }
            if (class325.field5214 >= 0) {
                class272.method1927();
                class3 var21 = class315.method2222(class325.field5214, class277.field4356, class256.field4045, false, class67.field843);
                var21.method24(class292.field4600, arg3, arg2, arg1, arg0, class283.field4508, class257.field4067, var20);
            } else {
                class272.method1962(var20);
            }
            class272.method1925(arg3, arg2, arg1, arg0, arg3 + (arg1 / 2), arg0 / 2 + arg2, var17, var18, class182.field2739, class182.field2739);
            class38.method242(127, false);
            class272.method1938();
            class272.method1934(true);
            class272.method1940(true);
        } else {
            class343.method2368(arg3, arg2, arg3 + arg1, arg0 + arg2);
            class104.method671();
            if (class325.field5214 >= 0) {
                class3 var22 = class315.method2222(class325.field5214, class277.field4356, class256.field4045, false, class67.field843);
                var22.method21(class292.field4600, arg3, arg2, arg1, arg0, class283.field4508, class257.field4067, 0);
            } else {
                class343.method2352(arg3, arg2, arg1, arg0, 0);
            }
        }
        if (class38.field437 || arg3 > class344.field5450 || class344.field5450 >= arg1 + arg3 || class190.field2851 < arg2 || class190.field2851 >= (arg0 + arg2)) {
            class49.field562 = 0;
            class86.field1141 = false;
        } else {
            class49.field562 = 0;
            class86.field1141 = true;
            int var23 = class212.field3212;
            int var24 = class73.field917;
            int var25 = class253.field4012;
            int var26 = class76.field1003;
            class205.field3101 = (var26 - var24) * (class190.field2851 - arg2) / arg0 + var24;
            class101.field1369 = (class344.field5450 - arg3) * (var25 - var23) / arg1 + var23;
        }
        class108.method698(-85);
        byte var27 = class192.method1308((byte) -39) == 2 ? (byte) class182.field2745 : 1;
        if (class272.field4317) {
            class195.method1365(class102.field1381, !class10.field104);
            class241.method1706(class119.field1657, class10.field96, 4194303, class283.field4508, class280.field4415, class257.field4067);
            class272.field4280 = class102.field1381;
            class242.method1717(class10.field96, class119.field1657, class280.field4415, class283.field4508, class257.field4067, class349.field5569, class274.field4338, class201.field3054, class187.field2828, class238.field3664, class131.field1894, class219.field3290 + 1, var27, class11.field113.field3767 >> 7, class11.field113.field3763 >> 7);
            class19.field232 = true;
            class195.method1356();
            class241.method1706(0, 0, 4194303, 0, 0, 0);
            class108.method698(-107);
            class36.method238(arg1, 3646, class182.field2739, arg3, arg0, arg2, class182.field2739);
            class351.method2432(class182.field2739, arg1, arg0, arg2, arg3, class182.field2739, -1335820511);
            class316.method2228();
        } else {
            class242.method1717(class10.field96, class119.field1657, class280.field4415, class283.field4508, class257.field4067, class349.field5569, class274.field4338, class201.field3054, class187.field2828, class238.field3664, class131.field1894, class219.field3290 + 1, var27, class11.field113.field3767 >> 7, class11.field113.field3763 >> 7);
            class108.method698(-116);
            class316.method2228();
            class36.method238(arg1, 3646, 256, arg3, arg0, arg2, 256);
            class351.method2432(256, arg1, arg0, arg2, arg3, 256, -1335820511);
        }
        ((class138) class104.field1438).method944((byte) -58, class266.field4193);
        class127.method870(arg2, arg0, arg1, arg3, (byte) 124);
        class283.field4508 = var13;
        class10.field96 = var11;
        class119.field1657 = var10;
        class280.field4415 = var12;
        class257.field4067 = var14;
        if (class58.field686 && class179.field2684.method513(false) == 0) {
            class58.field686 = false;
        }
        if (class58.field686) {
            if (class272.field4317) {
                class239.method1659(arg3, arg2, arg1, arg0, 0);
            } else {
                class343.method2352(arg3, arg2, arg1, arg0, 0);
            }
            class305.method2152(false, class174.field2628, -9223);
        }
        if (!arg5 && !class58.field686 && !class38.field437 && arg3 <= class344.field5450 && arg3 + arg1 > class344.field5450 && arg2 <= class190.field2851 && class190.field2851 < arg0 + arg2) {
            class305.method2148(arg0, arg1, true, class344.field5450, arg3, arg2, class190.field2851);
        }
    }
}
