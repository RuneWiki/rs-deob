import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class167 extends class90 {

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lhe;")
    public static class4 field2936 = new class4();

    @OriginalMember(owner = "client!im", name = "n", descriptor = "S")
    public static short field2938 = 32767;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Lbd;")
    public static class162 field2943 = class17.method142(0, "<)4col>");

    @OriginalMember(owner = "client!im", name = "t", descriptor = "Lbd;")
    public static class162 field2944 = class17.method142(0, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!im", name = "q", descriptor = "Lbd;")
    public static class162 field2941 = class17.method142(0, "Stufe: ");

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "[I")
    public static int[] field2939 = new int[4096];

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method1303(int arg0, int arg1) {
        if (arg0 != -7175) {
            method1308((class225) null, false);
        }
        field2937++;
        return (arg1 & 0x2742B9) >> 21 != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2942++;
        if (arg3 != 3) {
            method1307(44);
        }
        for (class64 var5 = (class64) class149.field2678.method169(arg3 ^ 0x2B); var5 != null; var5 = (class64) class149.field2678.method165((byte) -101)) {
            class160.method1226(arg0, arg1, var5, arg4, -1, arg2);
        }
        for (class64 var6 = (class64) client.field1884.method169(97); var6 != null; var6 = (class64) client.field1884.method165((byte) -101)) {
            byte var7 = 1;
            if (var6.field995.field5068 == var6.field995.field5064) {
                var7 = 0;
            } else if (var6.field995.field5064 == var6.field995.field5021) {
                var7 = 2;
            }
            if (var6.field1001 != var7) {
                int var8 = class84.method649(false, var6.field995);
                if (var6.field992 != var8) {
                    if (var6.field1003 != null) {
                        class313.field5290.method449(var6.field1003);
                        var6.field1003 = null;
                    }
                    var6.field992 = var8;
                }
                var6.field1001 = var7;
            }
            var6.field1006 = var6.field995.field5013;
            var6.field1013 = var6.field995.field5013 + (var6.field995.method293((byte) 25) * 64);
            var6.field1021 = var6.field995.field5047;
            var6.field1023 = var6.field995.field5047 + var6.field995.method293((byte) 25) * 64;
            class160.method1226(arg0, arg1, var6, arg4, -1, arg2);
        }
        for (class64 var9 = (class64) class51.field811.method1666((byte) 81); var9 != null; var9 = (class64) class51.field811.method1673((byte) -125)) {
            byte var10 = 1;
            if (var9.field996.field5068 == var9.field996.field5064) {
                var10 = 0;
            } else if (var9.field996.field5064 == var9.field996.field5021) {
                var10 = 2;
            }
            if (var9.field1001 != var10) {
                int var11 = class119.method973(var9.field996, true);
                if (var9.field992 != var11) {
                    if (var9.field1003 != null) {
                        class313.field5290.method449(var9.field1003);
                        var9.field1003 = null;
                    }
                    var9.field992 = var11;
                }
                var9.field1001 = var10;
            }
            var9.field1006 = var9.field996.field5013;
            var9.field1013 = var9.field996.field5013 + (var9.field996.method293((byte) 25) * 64);
            var9.field1021 = var9.field996.field5047;
            var9.field1023 = var9.field996.field5047 + (var9.field996.method293((byte) 25) * 64);
            class160.method1226(arg0, arg1, var9, arg4, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lib;I)[Lhk;", line = 133)
    public static final class97[] method1305(class28 arg0, int arg1) {
        field2945++;
        if (!arg0.method240(0)) {
            return new class97[0];
        }
        class166 var2 = arg0.method228(-115);
        while (var2.field2934 == 0) {
            class177.method1342(10L, 1);
        }
        if (var2.field2934 == 2) {
            return new class97[0];
        }
        if (arg1 != 10) {
            method1308((class225) null, false);
        }
        int[] var3 = (int[]) ((int[]) var2.field2933);
        class97[] var4 = new class97[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class97 var6 = new class97();
            var4[var5] = var6;
            var6.field1770 = var3[var5 << 2];
            var6.field1765 = var3[(var5 << 2) + 1];
            var6.field1761 = var3[(var5 << 2) + 2];
            var6.field1772 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2939[var0] = class88.method674((byte) 120, var0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(JI)V", line = 204)
    public static final void method1306(long arg0, int arg1) {
        field2940++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class264.field4403 < 100 || class95.field1733) || class264.field4403 >= 200) {
            class82.method633(0, class81.field1416, class244.field4053, arg1 + 4135);
            return;
        }
        class162 var3 = class317.method2178(arg0, (byte) 79).method1265((byte) 46);
        for (int var4 = 0; var4 < class264.field4403; var4++) {
            if (class200.field3405[var4] == arg0) {
                class82.method633(0, class135.method1062(new class162[] { var3, class315.field5320 }, true), class244.field4053, arg1 ^ 0xF99);
                return;
            }
        }
        if (arg1 != -4034) {
            return;
        }
        for (int var5 = 0; var5 < class135.field2417; var5++) {
            if (class112.field2026[var5] == arg0) {
                class82.method633(0, class135.method1062(new class162[] { class307.field5167, var3, class223.field3732 }, true), class244.field4053, -56);
                return;
            }
        }
        if (var3.method1248(class122.field2215.field611, (byte) -93)) {
            class82.method633(0, class53.field843, class244.field4053, arg1 + 3976);
            return;
        }
        class20.field324++;
        class290.field4891[class264.field4403] = var3;
        class200.field3405[class264.field4403] = arg0;
        class214.field3586[class264.field4403] = 0;
        class35.field591[class264.field4403] = class244.field4053;
        class260.field4337[class264.field4403] = 0;
        class199.field3390[class264.field4403] = false;
        class264.field4403++;
        class149.field2681 = class284.field4808;
        class187.field3229.method338(230, (byte) 8);
        class187.field3229.method745(arg0, (byte) -124);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V", line = 279)
    public static void method1307(int arg0) {
        field2944 = null;
        field2943 = null;
        field2936 = null;
        field2939 = null;
        field2941 = null;
        if (arg0 <= 114) {
            field2938 = -78;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lnm;Z)V", line = 310)
    public static final void method1308(class225 arg0, boolean arg1) {
        class31.field512.method167(false, arg0);
        while (true) {
            class225 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class225[][] var7;
            class225 var78;
            do {
                class225 var77;
                do {
                    class225 var76;
                    do {
                        class225 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class225) class31.field512.method170(113);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3772);
                                            var3 = var2.field3759;
                                            var4 = var2.field3764;
                                            var5 = var2.field3773;
                                            var6 = var2.field3758;
                                            var7 = class288.field4856[var5];
                                            float var8 = 0.0F;
                                            if (class117.field2159) {
                                                if (class31.field517 == class206.field3473) {
                                                    int var9 = class17.field285[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class134.field2393 != var10) {
                                                        class134.field2393 = var10;
                                                        class200.method1500(-23479, var10);
                                                        class108.method873(class186.method1403((byte) -65));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class258.field4298 != var11) {
                                                        class258.field4298 = var11;
                                                        class242.method1719(var11, 118);
                                                    }
                                                    int var12 = class73.field1166[0][var3 + 1][var4] + class73.field1166[0][var3][var4] + class73.field1166[0][var3][var4 + 1] + class73.field1166[0][var3 + 1][var4 + 1] >> 2;
                                                    class116.method913(true, -var12, 3);
                                                    var8 = 201.5F;
                                                    class117.method969(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class117.method969(var8);
                                                }
                                            }
                                            if (!var2.field3760) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class225 var13 = class288.field4856[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3772) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class96.field1757 && var3 > class177.field3037) {
                                                    class225 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3772 && (var14.field3760 || (var2.field3769 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class96.field1757 && var3 < class157.field2770 - 1) {
                                                    class225 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3772 && (var15.field3760 || (var2.field3769 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class29.field496 && var4 > class196.field3348) {
                                                    class225 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3772 && (var16.field3760 || (var2.field3769 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class29.field496 && var4 < class135.field2405 - 1) {
                                                    class225 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3772 && (var17.field3760 || (var2.field3769 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3760 = false;
                                            if (var2.field3761 != null) {
                                                class225 var18 = var2.field3761;
                                                if (class117.field2159) {
                                                    class117.method969(201.5F - (float) (var18.field3758 + 1) * 50.0F);
                                                }
                                                if (var18.field3766 == null) {
                                                    if (var18.field3771 != null) {
                                                        if (class263.method1808(0, var3, var4)) {
                                                            class137.method1076(var18.field3771, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, true);
                                                        } else {
                                                            class137.method1076(var18.field3771, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class263.method1808(0, var3, var4)) {
                                                    class90.method681(var18.field3766, 0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, true);
                                                } else {
                                                    class90.method681(var18.field3766, 0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, false);
                                                }
                                                class273 var19 = var18.field3753;
                                                if (var19 != null) {
                                                    if (class117.field2159) {
                                                        if ((var19.field4528 & var2.field3770) == 0) {
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                        } else {
                                                            class221.method1605(var19.field4528, class201.field3418, class31.field523, class156.field2748, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field4527.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var19.field4535 - class201.field3418, var19.field4530 - class31.field523, var19.field4533 - class156.field2748, var19.field4526);
                                                }
                                                for (int var20 = 0; var20 < var18.field3756; var20++) {
                                                    class43 var21 = var18.field3765[var20];
                                                    if (var21 != null) {
                                                        if (class117.field2159) {
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                        }
                                                        var21.field712.method49(var21.field704, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var21.field700 - class201.field3418, var21.field716 - class31.field523, var21.field703 - class156.field2748, var21.field697);
                                                    }
                                                }
                                                if (class117.field2159) {
                                                    class117.method969(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3766 == null) {
                                                if (var2.field3771 != null) {
                                                    if (class263.method1808(var6, var3, var4)) {
                                                        class137.method1076(var2.field3771, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class137.method1076(var2.field3771, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, false);
                                                    }
                                                }
                                            } else if (class263.method1808(var6, var3, var4)) {
                                                class90.method681(var2.field3766, var6, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3766.field1397 != 12345678 || class302.field5073 && var5 <= class123.field2237) {
                                                    class90.method681(var2.field3766, var6, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class147 var23 = var2.field3763;
                                                if (var23 != null && (var23.field2656 & 0x80000000L) != 0L) {
                                                    if (class117.field2159 && var23.field2666) {
                                                        class117.method969(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    var23.field2659.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var23.field2665 - class201.field3418, var23.field2658 - class31.field523, var23.field2661 - class156.field2748, var23.field2656);
                                                    if (class117.field2159 && var23.field2666) {
                                                        class117.method969(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class273 var26 = var2.field3753;
                                            class138 var27 = var2.field3775;
                                            if (var26 != null || var27 != null) {
                                                if (class96.field1757 == var3) {
                                                    var24++;
                                                } else if (class96.field1757 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class29.field496 == var4) {
                                                    var24 += 3;
                                                } else if (class29.field496 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class6.field47[var24];
                                                var2.field3770 = class114.field2034[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field4528 & class137.field2441[var24]) == 0) {
                                                    var2.field3752 = 0;
                                                } else if (var26.field4528 == 16) {
                                                    var2.field3752 = 3;
                                                    var2.field3754 = class217.field3622[var24];
                                                    var2.field3767 = 3 - var2.field3754;
                                                } else if (var26.field4528 == 32) {
                                                    var2.field3752 = 6;
                                                    var2.field3754 = class139.field2479[var24];
                                                    var2.field3767 = 6 - var2.field3754;
                                                } else if (var26.field4528 == 64) {
                                                    var2.field3752 = 12;
                                                    var2.field3754 = class214.field3581[var24];
                                                    var2.field3767 = 12 - var2.field3754;
                                                } else {
                                                    var2.field3752 = 9;
                                                    var2.field3754 = class180.field3105[var24];
                                                    var2.field3767 = 9 - var2.field3754;
                                                }
                                                if ((var26.field4528 & var25) != 0 && !class180.method1372(var6, var3, var4, var26.field4528)) {
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    var26.field4527.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var26.field4535 - class201.field3418, var26.field4530 - class31.field523, var26.field4533 - class156.field2748, var26.field4526);
                                                }
                                                if ((var26.field4525 & var25) != 0 && !class180.method1372(var6, var3, var4, var26.field4525)) {
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    var26.field4534.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var26.field4535 - class201.field3418, var26.field4530 - class31.field523, var26.field4533 - class156.field2748, var26.field4526);
                                                }
                                            }
                                            if (var27 != null && !class78.method592(var6, var3, var4, var27.field2459.method46())) {
                                                if (class117.field2159) {
                                                    class117.method969(var8 - 0.5F);
                                                }
                                                if ((var27.field2458 & var25) != 0) {
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    var27.field2459.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var27.field2469 + var27.field2471 - class201.field3418, var27.field2462 - class31.field523, var27.field2464 + var27.field2472 - class156.field2748, var27.field2461);
                                                } else if (var27.field2458 == 256) {
                                                    int var28 = var27.field2469 - class201.field3418;
                                                    int var29 = var27.field2462 - class31.field523;
                                                    int var30 = var27.field2464 - class156.field2748;
                                                    int var31 = var27.field2470;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class117.field2159) {
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                        }
                                                        var27.field2459.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var27.field2471 + var28, var29, var27.field2472 + var30, var27.field2461);
                                                    } else if (var27.field2468 != null) {
                                                        if (class117.field2159) {
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                        }
                                                        var27.field2468.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var28, var29, var30, var27.field2461);
                                                    }
                                                }
                                                if (class117.field2159) {
                                                    class117.method969(var8);
                                                }
                                            }
                                            if (var22) {
                                                class147 var34 = var2.field3763;
                                                if (var34 != null && (var34.field2656 & 0x80000000L) == 0L) {
                                                    if (class117.field2159 && var34.field2666) {
                                                        class117.method969(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    var34.field2659.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var34.field2665 - class201.field3418, var34.field2658 - class31.field523, var34.field2661 - class156.field2748, var34.field2656);
                                                    if (class117.field2159 && var34.field2666) {
                                                        class117.method969(var8);
                                                    }
                                                }
                                                class184 var35 = var2.field3755;
                                                if (var35 != null && var35.field3171 == 0) {
                                                    if (class117.field2159) {
                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                    }
                                                    if (var35.field3173 != null) {
                                                        var35.field3173.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var35.field3175 - class201.field3418, var35.field3174 - class31.field523, var35.field3178 - class156.field2748, var35.field3172);
                                                    }
                                                    if (var35.field3170 != null) {
                                                        var35.field3170.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var35.field3175 - class201.field3418, var35.field3174 - class31.field523, var35.field3178 - class156.field2748, var35.field3172);
                                                    }
                                                    if (var35.field3176 != null) {
                                                        var35.field3176.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var35.field3175 - class201.field3418, var35.field3174 - class31.field523, var35.field3178 - class156.field2748, var35.field3172);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3769;
                                            if (var36 != 0) {
                                                if (var3 < class96.field1757 && (var36 & 0x4) != 0) {
                                                    class225 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3772) {
                                                        class31.field512.method167(false, var37);
                                                    }
                                                }
                                                if (var4 < class29.field496 && (var36 & 0x2) != 0) {
                                                    class225 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3772) {
                                                        class31.field512.method167(false, var38);
                                                    }
                                                }
                                                if (var3 > class96.field1757 && (var36 & 0x1) != 0) {
                                                    class225 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3772) {
                                                        class31.field512.method167(false, var39);
                                                    }
                                                }
                                                if (var4 > class29.field496 && (var36 & 0x8) != 0) {
                                                    class225 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3772) {
                                                        class31.field512.method167(false, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3752 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3756; var42++) {
                                                if (class142.field2519 != var2.field3765[var42].field696 && (var2.field3768[var42] & var2.field3752) == var2.field3754) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class273 var43 = var2.field3753;
                                                if (!class180.method1372(var6, var3, var4, var43.field4528)) {
                                                    if (class117.field2159) {
                                                        label882: {
                                                            if ((var43.field4526 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field4535 - class201.field3418;
                                                                int var45 = var43.field4533 - class156.field2748;
                                                                int var46 = (int) (var43.field4526 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class158.field2787 - 1) {
                                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class32.field524 - 1 && var4 < class158.field2787 - 1) {
                                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class32.field524 - 1 && var4 > 0) {
                                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field4527.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var43.field4535 - class201.field3418, var43.field4530 - class31.field523, var43.field4533 - class156.field2748, var43.field4526);
                                                }
                                                var2.field3752 = 0;
                                            }
                                        }
                                        if (!var2.field3762) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3756;
                                            var2.field3762 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class43 var50 = var2.field3765[var49];
                                                if (class142.field2519 != var50.field696) {
                                                    for (int var51 = var50.field711; var51 <= var50.field707; var51++) {
                                                        for (int var52 = var50.field699; var52 <= var50.field701; var52++) {
                                                            class225 var53 = var7[var51][var52];
                                                            if (var53.field3760) {
                                                                var2.field3762 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3752 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field711) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field707) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field699) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field701) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3752) == var2.field3767) {
                                                                    var2.field3762 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class23.field398[var48++] = var50;
                                                    int var55 = class96.field1757 - var50.field711;
                                                    int var56 = var50.field707 - class96.field1757;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class29.field496 - var50.field699;
                                                    int var58 = var50.field701 - class29.field496;
                                                    if (var58 > var57) {
                                                        var50.field713 = var55 + var58;
                                                    } else {
                                                        var50.field713 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class43 var62 = class23.field398[var61];
                                                    if (class142.field2519 != var62.field696) {
                                                        if (var62.field713 > var59) {
                                                            var59 = var62.field713;
                                                            var60 = var61;
                                                        } else if (var62.field713 == var59) {
                                                            int var63 = var62.field700 - class201.field3418;
                                                            int var64 = var62.field703 - class156.field2748;
                                                            int var65 = class23.field398[var60].field700 - class201.field3418;
                                                            int var66 = class23.field398[var60].field703 - class156.field2748;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class43 var67 = class23.field398[var60];
                                                var67.field696 = class142.field2519;
                                                if (!class162.method1241(var6, var67.field711, var67.field707, var67.field699, var67.field701, var67.field712.method46())) {
                                                    if (class117.field2159) {
                                                        if ((var67.field697 & 0xFC000L) == 147456L) {
                                                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                                                            int var68 = var67.field700 - class201.field3418;
                                                            int var69 = var67.field703 - class156.field2748;
                                                            int var70 = (int) (var67.field697 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class221.method1592(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class221.method1592(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class221.method1592(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class221.method1592(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class221.method1607(class201.field3418, class31.field523, class156.field2748, var5, var67.field711, var67.field699, var67.field707, var67.field701);
                                                        }
                                                    }
                                                    var67.field712.method49(var67.field704, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var67.field700 - class201.field3418, var67.field716 - class31.field523, var67.field703 - class156.field2748, var67.field697);
                                                }
                                                for (int var71 = var67.field711; var71 <= var67.field707; var71++) {
                                                    for (int var72 = var67.field699; var72 <= var67.field701; var72++) {
                                                        class225 var73 = var7[var71][var72];
                                                        if (var73.field3752 != 0) {
                                                            class31.field512.method167(false, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3772) {
                                                            class31.field512.method167(false, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3762) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3762 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3772);
                            } while (var2.field3752 != 0);
                            if (var3 > class96.field1757 || var3 <= class177.field3037) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3772);
                        if (var3 < class96.field1757 || var3 >= class157.field2770 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3772);
                    if (var4 > class29.field496 || var4 <= class196.field3348) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3772);
                if (var4 < class29.field496 || var4 >= class135.field2405 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3772);
            var2.field3772 = false;
            class119.field2165--;
            class184 var79 = var2.field3755;
            if (var79 != null && var79.field3171 != 0) {
                if (class117.field2159) {
                    class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                }
                if (var79.field3173 != null) {
                    var79.field3173.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var79.field3175 - class201.field3418, var79.field3174 - class31.field523 - var79.field3171, var79.field3178 - class156.field2748, var79.field3172);
                }
                if (var79.field3170 != null) {
                    var79.field3170.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var79.field3175 - class201.field3418, var79.field3174 - class31.field523 - var79.field3171, var79.field3178 - class156.field2748, var79.field3172);
                }
                if (var79.field3176 != null) {
                    var79.field3176.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var79.field3175 - class201.field3418, var79.field3174 - class31.field523 - var79.field3171, var79.field3178 - class156.field2748, var79.field3172);
                }
            }
            if (var2.field3770 != 0) {
                class138 var80 = var2.field3775;
                if (var80 != null && !class78.method592(var6, var3, var4, var80.field2459.method46())) {
                    if ((var80.field2458 & var2.field3770) != 0) {
                        if (class117.field2159) {
                            class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                        }
                        var80.field2459.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var80.field2469 + var80.field2471 - class201.field3418, var80.field2462 - class31.field523, var80.field2464 + var80.field2472 - class156.field2748, var80.field2461);
                    } else if (var80.field2458 == 256) {
                        int var81 = var80.field2469 - class201.field3418;
                        int var82 = var80.field2462 - class31.field523;
                        int var83 = var80.field2464 - class156.field2748;
                        int var84 = var80.field2470;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class117.field2159) {
                                class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                            }
                            var80.field2459.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var80.field2471 + var81, var82, var80.field2472 + var83, var80.field2461);
                        } else if (var80.field2468 != null) {
                            if (class117.field2159) {
                                class221.method1604(class201.field3418, class31.field523, class156.field2748, var5, var3, var4);
                            }
                            var80.field2468.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var81, var82, var83, var80.field2461);
                        }
                    }
                }
                class273 var87 = var2.field3753;
                if (var87 != null) {
                    if ((var87.field4525 & var2.field3770) != 0 && !class180.method1372(var6, var3, var4, var87.field4525)) {
                        if (class117.field2159) {
                            class221.method1605(var87.field4525, class201.field3418, class31.field523, class156.field2748, var6, var3, var4);
                        }
                        var87.field4534.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var87.field4535 - class201.field3418, var87.field4530 - class31.field523, var87.field4533 - class156.field2748, var87.field4526);
                    }
                    if ((var87.field4528 & var2.field3770) != 0 && !class180.method1372(var6, var3, var4, var87.field4528)) {
                        if (class117.field2159) {
                            class221.method1605(var87.field4528, class201.field3418, class31.field523, class156.field2748, var6, var3, var4);
                        }
                        var87.field4527.method49(0, class308.field5177, class251.field4195, class156.field2750, class223.field3734, var87.field4535 - class201.field3418, var87.field4530 - class31.field523, var87.field4533 - class156.field2748, var87.field4526);
                    }
                }
            }
            if (var5 < class53.field850 - 1) {
                class225 var88 = class288.field4856[var5 + 1][var3][var4];
                if (var88 != null && var88.field3772) {
                    class31.field512.method167(false, var88);
                }
            }
            if (var3 < class96.field1757) {
                class225 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3772) {
                    class31.field512.method167(false, var89);
                }
            }
            if (var4 < class29.field496) {
                class225 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3772) {
                    class31.field512.method167(false, var90);
                }
            }
            if (var3 > class96.field1757) {
                class225 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3772) {
                    class31.field512.method167(false, var91);
                }
            }
            if (var4 > class29.field496) {
                class225 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3772) {
                    class31.field512.method167(false, var92);
                }
            }
        }
    }
}
