import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class217 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
    public short[] field3716;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    public int[] field3715;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[S")
    public short[] field3734;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[B")
    public byte[] field3719;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[Lsc;")
    public class181[] field3732;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lvb;")
    public static class247 field3724 = new class247();

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public static int[] field3727 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field3729 = 0;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Lsc;")
    public static class181 field3735 = class149.method967(255, "; Expires=");

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lak;")
    public static class152 field3736 = new class152(128);

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljb;")
    public static class11 field3731;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "[[[B")
    public static byte[][][] field3737;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lvf;I)V")
    public static final void method1435(class230 arg0, int arg1) {
        if (arg1 != 25764) {
            return;
        }
        if (class190.field3353 != null) {
            try {
                class190.field3353.method1456(false, 0L);
                class190.field3353.method1448(24, arg0.field3977, (byte) 108, arg0.field3933);
            } catch (Exception var2) {
            }
        }
        field3726++;
        arg0.field3933 += 24;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILsc;)Lsc;")
    public static final class181 method1436(int arg0, class181 arg1) {
        int var2 = class16.method139((byte) -90, arg1);
        field3725++;
        return ~var2 == arg0 ? class109.field1785 : class242.field4214.field3732[var2];
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZII)V")
    public static final void method1437(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class94.field1505++;
        if (!arg3) {
            class241.method1640(true, arg0);
            class224.method1478(arg0 + 104, true);
            class241.method1640(false, 0);
        }
        class224.method1478(arg0 ^ 0x68, false);
        field3718++;
        if (!arg3) {
            class97.method644((byte) -119);
        }
        class151.method974(-28506);
        if (class110.field1792 == 1) {
            int var6 = class113.field1845;
            int var7 = class234.field4069 + class214.field3682 & 0x7FF;
            if (var6 < (class90.field1423 / 256)) {
                var6 = class90.field1423 / 256;
            }
            if (class18.field327[4] && (class221.field3824[4] + 128) > var6) {
                var6 = class221.field3824[4] + 128;
            }
            class73.method511(2047, var6, class243.field4220, arg2, class232.method1606(class38.field581, (byte) -36, class258.field4507.field2681, class258.field4507.field2654) - 50, class16.field297, var6 * 3 + 600, var7);
        }
        int var8 = class127.field2100;
        int var9 = class86.field1370;
        int var10 = class228.field3916;
        int var11 = class208.field3559;
        int var12 = class47.field734;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class18.field327[var13]) {
                int var21 = (int) (Math.random() * (double) (class207.field3556[var13] * 2 + 1) + Math.sin((double) class8.field153[var13] / 100.0D * (double) class257.field4502[var13]) * (double) class221.field3824[var13] - (double) class207.field3556[var13]);
                if (var13 == 4) {
                    class208.field3559 += var21;
                    if (class208.field3559 < 128) {
                        class208.field3559 = 128;
                    }
                    if (class208.field3559 > 383) {
                        class208.field3559 = 383;
                    }
                }
                if (var13 == 2) {
                    class86.field1370 += var21;
                }
                if (var13 == 1) {
                    class228.field3916 += var21;
                }
                if (var13 == 0) {
                    class127.field2100 += var21;
                }
                if (var13 == 3) {
                    class47.field734 = class47.field734 + var21 & 0x7FF;
                }
            }
        }
        class27.method227((byte) 69);
        class17.method157(arg1, arg4, arg1 + arg5, arg4 - -arg2);
        class72.method504();
        int var14 = class58.field878;
        int var15 = class26.field458;
        if (arg1 <= var14 && arg1 + arg5 > var14 && var15 >= arg4 && var15 < arg2 + arg4) {
            class19.field341 = 0;
            int var16 = class46.field729;
            class1.field36 = true;
            int var17 = class200.field3457;
            class44.field684 = (var14 - arg1) * (var17 - var16) / arg5 + var16;
            int var18 = class215.field3697;
            int var19 = class106.field1724;
            class162.field2769 = (var15 - arg4) * (var19 - var18) / arg2 + var18;
        } else {
            class19.field341 = 0;
            class1.field36 = false;
        }
        class4.method36((byte) 18);
        byte var20 = class25.method213(13315) == 2 ? (byte) class94.field1505 : 1;
        class17.method156(arg1, arg4, arg5, arg2, arg0);
        class232.method1601(class127.field2100, class228.field3916, class86.field1370, class208.field3559, class47.field734, class174.field2919, class69.field1108, class143.field2325, class60.field907, class38.field577, class85.field1344, class38.field581 + 1, var20, class258.field4507.field2654 >> 7, class258.field4507.field2681 >> 7);
        class4.method36((byte) 18);
        class164.method1095();
        class219.method1461(arg5, arg0 ^ 0x19B7, 256, arg4, arg2, arg1, 256);
        class265.method1791(arg4, arg1, arg2, arg5, 256, (byte) -43, 256);
        ((class145) class72.field1157).method941((byte) 16, class258.field4504);
        class74.method518(arg2, arg4, arg1, arg5, (byte) 126);
        class208.field3559 = var11;
        class86.field1370 = var9;
        class127.field2100 = var8;
        class47.field734 = var12;
        class228.field3916 = var10;
        if (class138.field2260 && class102.method691(0, true, false) == 0) {
            class138.field2260 = false;
        }
        if (class138.field2260) {
            class17.method156(arg1, arg4, arg5, arg2, 0);
            class121.method795(false, -94, class32.field518);
        }
        if (!arg3 && !class138.field2260 && !class33.field534 && arg1 <= class58.field878 && class58.field878 < arg1 + arg5 && arg4 <= class26.field458 && class26.field458 < (arg4 + arg2)) {
            class208.method1384(arg2, arg4, class58.field878, class26.field458, arg1, (byte) -127, arg5);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3724 = null;
        field3735 = null;
        field3736 = null;
        field3737 = null;
        field3727 = null;
        if (arg0 != 23) {
            method1444(-113, -13);
        }
        field3731 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lpe;Lo;IIIZILpe;)V")
    public static final void method1439(class245 arg0, class175 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class245 arg7) {
        class4.field83 = arg4;
        class2.field50 = arg6;
        class196.field3422 = arg3;
        class191.field3367 = arg2;
        field3721++;
        class66.field1073 = arg1;
        if (class177.field3100 != null) {
            return;
        }
        class140.field2270 = arg5;
        if (class70.field1130 == null) {
            class70.field1130 = class13.method127(0, 0, class247.field4321, class254.field4453);
        }
        if (class174.field2920 == null) {
            class174.field2920 = class122.method797(0, -7449, class125.field2071, class254.field4453);
        }
        if (class63.field984 == null) {
            class63.field984 = class122.method797(0, -7449, class243.field4226, class254.field4453);
        }
        if (class87.field1385 == null) {
            class87.field1385 = class122.method797(0, -7449, class55.field856, class254.field4453);
        }
        int var8 = class196.field3422 / 5;
        int var9 = class196.field3422 / 5 * 4;
        class17.method164(class4.field83, class191.field3367, class196.field3422, class2.field50, 0, 168);
        class17.method146(class4.field83, class191.field3367, var8, 23, 12425273, 9135624);
        class17.method146(class4.field83 + var8, class191.field3367, var9, 23, 5197647, 2697513);
        arg0.method1655(class70.field1124, class4.field83 + (var8 / 2), class191.field3367 + 15, 0, -1);
        if (class87.field1385 != null) {
            class87.field1385[1].method482(class4.field83 + var8 + 2, class191.field3367 + 1);
            arg7.method1659(class12.field248, class4.field83 + var8 + 12, class191.field3367 + 10, 16777215, -1);
            class87.field1385[0].method482(var8 + class4.field83 + 2, class191.field3367 + 12);
            arg7.method1659(class71.field1138, class4.field83 + var8 + 12, class191.field3367 + 21, 16777215, -1);
        }
        if (class63.field984 != null) {
            int var10 = var8 + class4.field83 + 140;
            if (class64.field1031[0] == 0 && class33.field539[0] == 0) {
                class63.field984[2].method482(var10, class191.field3367 + 4);
            } else {
                class63.field984[0].method482(var10, class191.field3367 + 4);
            }
            if (class64.field1031[0] == 0 && class33.field539[0] == 1) {
                class63.field984[3].method482(var10 + 15, class191.field3367 + 4);
            } else {
                class63.field984[1].method482(var10 + 15, class191.field3367 + 4);
            }
            arg0.method1659(class67.field1085, var10 + 32, class191.field3367 + 17, 16777215, -1);
            int var11 = class4.field83 + var8 + 250;
            if (class64.field1031[0] == 1 && class33.field539[0] == 0) {
                class63.field984[2].method482(var11, class191.field3367 + 4);
            } else {
                class63.field984[0].method482(var11, class191.field3367 + 4);
            }
            if (class64.field1031[0] == 1 && class33.field539[0] == 1) {
                class63.field984[3].method482(var11 + 15, class191.field3367 + 4);
            } else {
                class63.field984[1].method482(var11 + 15, class191.field3367 + 4);
            }
            arg0.method1659(class7.field124, var11 + 32, class191.field3367 - -17, 16777215, -1);
            int var12 = class4.field83 + var8 + 360;
            if (class64.field1031[0] == 2 && class33.field539[0] == 0) {
                class63.field984[2].method482(var12, class191.field3367 + 4);
            } else {
                class63.field984[0].method482(var12, class191.field3367 + 4);
            }
            if (class64.field1031[0] == 2 && class33.field539[0] == 1) {
                class63.field984[3].method482(var12 + 15, class191.field3367 - -4);
            } else {
                class63.field984[1].method482(var12 + 15, class191.field3367 - -4);
            }
            arg0.method1659(class114.field1856, var12 + 32, class191.field3367 + 17, 16777215, -1);
            int var13 = class4.field83 + var8 + 470;
            if (class64.field1031[0] == 3 && class33.field539[0] == 0) {
                class63.field984[2].method482(var13, class191.field3367 + 4);
            } else {
                class63.field984[0].method482(var13, class191.field3367 + 4);
            }
            if (class64.field1031[0] == 3 && class33.field539[0] == 1) {
                class63.field984[3].method482(var13 + 15, class191.field3367 + 4);
            } else {
                class63.field984[1].method482(var13 + 15, class191.field3367 - -4);
            }
            arg0.method1659(class76.field1233, var13 + 32, class191.field3367 - -17, 16777215, -1);
        }
        class17.method156(class196.field3422 - 58 - 10, class191.field3367 + 4, 58, 16, 0);
        class110.field1810 = -1;
        if (class70.field1130 == null) {
            return;
        }
        byte var14 = 88;
        byte var15 = 19;
        int var16 = class196.field3422 / (var14 + 1);
        int var17 = (class2.field50 - 23) / (var15 + 1);
        int var18;
        int var19;
        do {
            var18 = var16;
            if ((var16 - 1) * var17 >= class148.field2474) {
                var16--;
            }
            var19 = var17;
            if (((var17 - 1) * var16) >= class148.field2474) {
                var17--;
            }
            if (class148.field2474 <= (var17 - 1) * var16) {
                var17--;
            }
        } while (var17 != var19 || var16 != var18);
        int var20 = (class196.field3422 - (var14 * var16)) / (var16 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class196.field3422 - var14 * var16 - ((var16 + -1) * var20)) / 2;
        int var22 = var21;
        int var23 = 0;
        int var24 = (class2.field50 - (var15 * var17) - 23) / (var17 + 1);
        if (var24 > 5) {
            var24 = 5;
        }
        int var25 = (class2.field50 - ((var17 - 1) * var24) - (var15 * var17) - 23) / 2;
        int var26 = var25 + 23;
        for (int var27 = 0; var27 < class148.field2474; var27++) {
            class192 var28 = class131.field2167[var27];
            class181 var29 = class169.method1119((byte) 58, var28.field3371);
            boolean var30 = true;
            if (var28.field3371 == -1) {
                var30 = false;
                var29 = class123.field2019;
            } else if (var28.field3371 > 1980) {
                var30 = false;
                var29 = class41.field611;
            }
            if (class79.field1279 >= var22 && class183.field3215 >= var26 && class79.field1279 < var22 + var14 && (var15 + var26) > class183.field3215 && var30) {
                class110.field1810 = var27;
                class70.field1130[var28.field3368 ? 1 : 0].method339(class4.field83 + var22, class191.field3367 + var26, 128, 16777215);
            } else {
                class70.field1130[var28.field3368 ? 1 : 0].method322(class4.field83 + var22, class191.field3367 + var26);
            }
            if (class174.field2920 != null) {
                class174.field2920[(var28.field3368 ? class174.field2920.length / 2 : 0) + var28.field3372].method482(class4.field83 + var22 + 29, class191.field3367 + var26);
            }
            arg0.method1655(class169.method1119((byte) -113, var28.field3380), class4.field83 + var22 + 15, var15 / 2 + class191.field3367 - (-var26 + -5), 0, -1);
            arg7.method1655(var29, class4.field83 + var22 + 60, class191.field3367 + 5 - (-var26 - var15 / 2), 268435455, -1);
            var26 += var15 + var24;
            var23++;
            if (var23 >= var17) {
                var26 = var25 + 23;
                var22 += var14 + var20;
                var23 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method1440(byte arg0) {
        field3723++;
        if (arg0 > -55) {
            return;
        }
        for (int var1 = 0; var1 < class137.field2237; var1++) {
            int var2 = class263.field4581[var1];
            class178 var3 = class129.field2140[var2];
            if (var3 != null) {
                class148.method965(var3, -32342, var3.field3117.field995);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        field3722++;
        boolean var1 = true;
        class1.method14(false, (byte) -119);
        class188.field3328 = 0;
        for (int var2 = 0; var2 < class184.field3266.length; var2++) {
            if (class120.field1955[var2] != -1 && class184.field3266[var2] == null) {
                class184.field3266[var2] = class90.field1435.method89(0, class120.field1955[var2], 122);
                if (class184.field3266[var2] == null) {
                    class188.field3328++;
                    var1 = false;
                }
            }
            if (class129.field2128[var2] != -1 && class121.field1989[var2] == null) {
                class121.field1989[var2] = class90.field1435.method90(class162.field2767[var2], -5111, 0, class129.field2128[var2]);
                if (class121.field1989[var2] == null) {
                    var1 = false;
                    class188.field3328++;
                }
            }
            if (class47.field735 != null && class264.field4585[var2] == null && class47.field735[var2] != -1) {
                class264.field4585[var2] = class90.field1435.method90(class162.field2767[var2], -5111, 0, class47.field735[var2]);
                if (class264.field4585[var2] == null) {
                    var1 = false;
                    class188.field3328++;
                }
            }
        }
        if (class145.field2354 == null || !class37.field571.method117(class175.method1164(new class181[] { class145.field2354.field1969, class2.field58 }, (byte) 125), 48)) {
            class123.field2023 = null;
        } else if (class37.field571.method87((byte) -115, class175.method1164(new class181[] { class145.field2354.field1969, class2.field58 }, (byte) 126))) {
            class123.field2023 = class166.method1111(class37.field571, 11975, class175.method1164(new class181[] { class145.field2354.field1969, class2.field58 }, (byte) 124));
        } else {
            var1 = false;
            class188.field3328++;
        }
        if (!var1) {
            class190.field3351 = 1;
            return;
        }
        class229.field3922 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class184.field3266.length; var4++) {
            byte[] var19 = class121.field1989[var4];
            if (var19 != null) {
                int var20 = (class78.field1264[var4] >> 8) * 64 - class253.field4420;
                int var21 = (class78.field1264[var4] & 0xFF) * 64 - class222.field3844;
                if (class183.field3214) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class131.method847(103, var21, var20, var19);
            }
        }
        if (!var3) {
            class190.field3351 = 2;
            return;
        }
        if (class190.field3351 != 0) {
            class121.method795(true, 98, class175.method1164(new class181[] { class32.field518, class221.field3818 }, (byte) 123));
        }
        class4.method36((byte) 18);
        class206.method1374((byte) 76);
        class256.method1747();
        for (int var5 = 0; var5 < 4; var5++) {
            class109.field1784[var5].method71(arg0 - 24260);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class70.field1129[var6][var17][var18] = 0;
                }
            }
        }
        class86.method583((byte) 63, false);
        class4.method36((byte) 18);
        System.gc();
        class1.method14(true, (byte) -110);
        class141.method904(false, -68);
        if (!class183.field3214) {
            class160.method1073(true, false);
            class1.method14(true, (byte) -106);
            class83.method564(false, arg0 ^ 0xFFFFD276);
            if (class264.field4585 != null) {
                class160.method1077(-93);
            }
        }
        if (class183.field3214) {
            class169.method1118(false, 1476442030);
            class1.method14(true, (byte) -127);
            class253.method1723(false, false);
        }
        class206.method1374((byte) 79);
        class1.method14(true, (byte) -120);
        class19.method181(false, 0, class109.field1784);
        class1.method14(true, (byte) -121);
        int var7 = class107.field1754;
        if (class38.field581 < var7) {
            var7 = class38.field581;
        }
        if (var7 < (class38.field581 - 1)) {
            int var8 = class38.field581 - 1;
        }
        if (class219.method1460(51885665)) {
            class193.method1322(0);
        } else {
            class193.method1322(class107.field1754);
        }
        class189.method1307(arg0 - 1036774080);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class78.method550(var9, true, var16);
            }
        }
        class78.method540(0);
        class4.method36((byte) 18);
        class170.method1127(arg0 ^ arg0);
        class206.method1374((byte) 127);
        if (class43.field677 != null && class216.field3713 != null && class5.field106 == 25) {
            class141.field2275.method541(180, 127);
            class141.field2275.method1544(1057001181, -3165);
            class79.field1278++;
        }
        if (!class183.field3214) {
            int var10 = (class144.field2342 - 6) / 8;
            int var11 = (class144.field2342 + 6) / 8;
            int var12 = (class79.field1285 + 6) / 8;
            int var13 = (class79.field1285 - 6) / 8;
            for (int var14 = var10 - 1; var14 <= (var11 + 1); var14++) {
                for (int var15 = var13 - 1; var15 <= (var12 + 1); var15++) {
                    if (var14 < var10 || var11 < var14 || var13 > var15 || var15 > var12) {
                        class90.field1435.method103(26152, class175.method1164(new class181[] { client.field2694, class169.method1119((byte) -125, var14), class77.field1253, class169.method1119((byte) -120, var15) }, (byte) 125));
                        class90.field1435.method103(arg0 + 1788, class175.method1164(new class181[] { class248.field4326, class169.method1119((byte) 84, var14), class77.field1253, class169.method1119((byte) 26, var15) }, (byte) 126));
                    }
                }
            }
        }
        if (class5.field106 == 28) {
            class92.method612(10, 255);
        } else {
            class92.method612(30, 255);
            if (class216.field3713 != null) {
                class141.field2275.method541(157, -106);
            }
        }
        class4.method36((byte) 18);
        class86.method582(arg0 ^ 0xFFFFF172);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z")
    public final boolean method1442(byte arg0, int arg1) {
        field3733++;
        if (arg0 != -23) {
            this.method1443(-53, (byte) -106);
        }
        return (this.field3719[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)I")
    public final int method1443(int arg0, byte arg1) {
        if (arg1 <= 28) {
            method1436(-35, (class181) null);
        }
        field3720++;
        return this.field3719[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Llc;")
    public static final class87 method1444(int arg0, int arg1) {
        field3730++;
        if (arg1 != 22718) {
            field3731 = null;
        }
        class87 var2 = (class87) field3736.method990((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class229.field3921.method89(0, arg0, 118);
        if (var3 == null) {
            return null;
        }
        class87 var4 = new class87();
        class230 var5 = new class230(var3);
        var5.field3933 = var5.field3977.length - 2;
        int var6 = var5.method1535(2);
        int var7 = var5.field3977.length - var6 - 14;
        var5.field3933 = var7;
        int var8 = var5.method1529(-32494);
        var4.field1386 = var5.method1535(arg1 ^ 0x58BC);
        var4.field1379 = var5.method1535(2);
        var4.field1377 = var5.method1535(2);
        var4.field1388 = var5.method1535(2);
        int var9 = var5.method1516((byte) 82);
        if (var9 > 0) {
            var4.field1381 = new class214[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1535(2);
                class214 var12 = new class214(class264.method1789(-116, var11));
                var4.field1381[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1529(-32494);
                    int var14 = var5.method1529(-32494);
                    var12.method1422((long) var13, new class124(var14), -1);
                }
            }
        }
        var5.field3933 = 0;
        int var15 = 0;
        var4.field1380 = var5.method1546(0);
        var4.field1382 = new int[var8];
        var4.field1390 = new class181[var8];
        var4.field1375 = new int[var8];
        while (var7 > var5.field3933) {
            int var16 = var5.method1535(2);
            if (var16 == 3) {
                var4.field1390[var15] = var5.method1549(62);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1382[var15] = var5.method1516((byte) 82);
            } else {
                var4.field1382[var15] = var5.method1529(-32494);
            }
            var4.field1375[var15++] = var16;
        }
        field3736.method982(var4, (byte) 60, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
    public class217(int arg0) {
        this.field3717 = arg0;
        this.field3716 = new short[this.field3717];
        this.field3715 = new int[this.field3717];
        this.field3734 = new short[this.field3717];
        this.field3719 = new byte[this.field3717];
        this.field3732 = new class181[this.field3717];
    }
}
