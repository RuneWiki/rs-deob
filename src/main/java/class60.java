import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class60 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field1231 = new int[25];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lsd;")
    public static class166 field1234 = class135.method935("sl_back", 0);

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lsd;")
    public static class166 field1240 = class135.method935("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lff;")
    public static class53 field1237;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILpb;I)V")
    public static final void method507(int arg0, class137 arg1, int arg2) {
        field1232++;
        Object[] var3 = arg1.field2668;
        int var4 = (Integer) var3[0];
        class27 var5 = class29.method220(39, var4);
        if (var5 == null) {
            return;
        }
        class77.field1600 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field473;
        int[] var10 = var5.field469;
        byte var11 = -1;
        try {
            int var12 = 0;
            class112.field2178 = new class166[var5.field479];
            class107.field2083 = new int[var5.field474];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2666;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2667;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2673 == null ? -1 : arg1.field2673.field3715;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2665;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2673 == null ? -1 : arg1.field2673.field3716;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2662 == null ? -1 : arg1.field2662.field3715;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2662 == null ? -1 : arg1.field2662.field3716;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2661;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2672;
                    }
                    class107.field2083[var13++] = var15;
                } else if (var3[var14] instanceof class166) {
                    class166 var16 = (class166) var3[var14];
                    if (var16.method1138(class16.field277, (byte) 101)) {
                        var16 = arg1.field2664;
                    }
                    class112.field2178[var12++] = var16;
                }
            }
            if (arg0 > -52) {
                method509(false, 114, 64, 17, 46);
            }
            int var17 = 0;
            label2176: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var309 = var9[var8];
                if (var309 < 100) {
                    if (var309 == 0) {
                        class90.field1779[var6++] = var10[var8];
                        continue;
                    }
                    if (var309 == 1) {
                        int var18 = var10[var8];
                        class90.field1779[var6++] = class91.field1785[var18];
                        continue;
                    }
                    if (var309 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class91.field1785[var19] = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 3) {
                        class174.field3307[var7++] = var5.field477[var8];
                        continue;
                    }
                    if (var309 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var309 == 7) {
                        var6 -= 2;
                        if (class90.field1779[var6 + 1] != class90.field1779[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 8) {
                        var6 -= 2;
                        if (class90.field1779[var6 + 1] == class90.field1779[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 9) {
                        var6 -= 2;
                        if (class90.field1779[var6 + 1] > class90.field1779[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 10) {
                        var6 -= 2;
                        if (class90.field1779[var6 + 1] < class90.field1779[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 21) {
                        if (class77.field1600 == 0) {
                            return;
                        }
                        class98 var20 = class166.field3190[--class77.field1600];
                        class107.field2083 = var20.field1876;
                        var5 = var20.field1869;
                        var8 = var20.field1871;
                        class112.field2178 = var20.field1874;
                        var9 = var5.field473;
                        var10 = var5.field469;
                        continue;
                    }
                    if (var309 == 25) {
                        int var21 = var10[var8];
                        class90.field1779[var6++] = class88.method698(0, var21);
                        continue;
                    }
                    if (var309 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class4.method28(0, class90.field1779[var6], var22);
                        continue;
                    }
                    if (var309 == 31) {
                        var6 -= 2;
                        if (class90.field1779[var6] <= class90.field1779[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 32) {
                        var6 -= 2;
                        if (class90.field1779[var6 + 1] <= class90.field1779[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var309 == 33) {
                        class90.field1779[var6++] = class107.field2083[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var309 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class107.field2083[var10001] = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 35) {
                        class174.field3307[var7++] = class112.field2178[var10[var8]];
                        continue;
                    }
                    if (var309 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class112.field2178[var10001] = class174.field3307[var7];
                        continue;
                    }
                    if (var309 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class166 var24 = class69.method560(class174.field3307, -121, var7, var23);
                        class174.field3307[var7++] = var24;
                        continue;
                    }
                    if (var309 == 38) {
                        var6--;
                        continue;
                    }
                    if (var309 == 39) {
                        var7--;
                        continue;
                    }
                    if (var309 == 40) {
                        int var25 = var10[var8];
                        class27 var26 = class29.method220(39, var25);
                        class166[] var27 = new class166[var26.field479];
                        int[] var28 = new int[var26.field474];
                        for (int var29 = 0; var29 < var26.field471; var29++) {
                            var28[var29] = class90.field1779[var6 + var29 - var26.field471];
                        }
                        for (int var30 = 0; var30 < var26.field466; var30++) {
                            var27[var30] = class174.field3307[var30 + var7 - var26.field466];
                        }
                        var6 -= var26.field471;
                        var7 -= var26.field466;
                        class98 var31 = new class98();
                        var31.field1874 = class112.field2178;
                        var31.field1869 = var5;
                        var5 = var26;
                        var31.field1876 = class107.field2083;
                        var31.field1871 = var8;
                        var8 = -1;
                        class166.field3190[class77.field1600++] = var31;
                        class107.field2083 = var28;
                        class112.field2178 = var27;
                        var10 = var26.field469;
                        var9 = var26.field473;
                        continue;
                    }
                    if (var309 == 42) {
                        class90.field1779[var6++] = class69.field1399[var10[var8]];
                        continue;
                    }
                    if (var309 == 43) {
                        var10001 = var10[var8];
                        var6--;
                        class69.field1399[var10001] = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 44) {
                        int var32 = var10[var8] & 0xFFFF;
                        int var33 = var10[var8] >> 16;
                        var6--;
                        int var34 = class90.field1779[var6];
                        if (var34 >= 0 && var34 <= 5000) {
                            class154.field2969[var33] = var34;
                            byte var35 = -1;
                            if (var32 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var34) {
                                    continue label2176;
                                }
                                class67.field1355[var33][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var309 == 45) {
                        int var37 = var10[var8];
                        var6--;
                        int var38 = class90.field1779[var6];
                        if (var38 >= 0 && var38 < class154.field2969[var37]) {
                            class90.field1779[var6++] = class67.field1355[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var309 == 46) {
                        int var39 = var10[var8];
                        var6 -= 2;
                        int var40 = class90.field1779[var6];
                        if (var40 >= 0 && class154.field2969[var39] > var40) {
                            class67.field1355[var39][var40] = class90.field1779[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var309 == 47) {
                        class166 var41 = class184.field3523[var10[var8]];
                        if (var41 == null) {
                            var41 = class157.field3003;
                        }
                        class174.field3307[var7++] = var41;
                        continue;
                    }
                    if (var309 == 48) {
                        var10001 = var10[var8];
                        var7--;
                        class184.field3523[var10001] = class174.field3307[var7];
                        continue;
                    }
                }
                boolean var42;
                if (var10[var8] == 1) {
                    var42 = true;
                } else {
                    var42 = false;
                }
                if (var309 < 1000) {
                    if (var309 == 100) {
                        var6 -= 3;
                        int var43 = class90.field1779[var6];
                        int var44 = class90.field1779[var6 + 2];
                        int var45 = class90.field1779[var6 + 1];
                        if (var45 == 0) {
                            throw new RuntimeException();
                        }
                        class193 var46 = class90.method701(-31355, var43);
                        if (var46.field3829 == null) {
                            var46.field3829 = new class193[var44 + 1];
                        }
                        if (var46.field3829.length <= var44) {
                            class193[] var47 = new class193[var44 + 1];
                            for (int var48 = 0; var48 < var46.field3829.length; var48++) {
                                var47[var48] = var46.field3829[var48];
                            }
                            var46.field3829 = var47;
                        }
                        if (var44 > 0 && var46.field3829[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class193 var49 = new class193();
                        var49.field3762 = var49.field3715 = var46.field3715;
                        var49.field3716 = var44;
                        var49.field3797 = var45;
                        var49.field3841 = true;
                        var46.field3829[var44] = var49;
                        if (var42) {
                            class95.field1846 = var49;
                        } else {
                            class43.field764 = var49;
                        }
                        class68.method550(var46, 15);
                        continue;
                    }
                    if (var309 == 101) {
                        class193 var50 = var42 ? class95.field1846 : class43.field764;
                        if (var50.field3716 == -1) {
                            if (var42) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class193 var51 = class90.method701(-31355, var50.field3715);
                        var51.field3829[var50.field3716] = null;
                        class68.method550(var51, 15);
                        continue;
                    }
                    if (var309 == 102) {
                        var6--;
                        class193 var52 = class90.method701(-31355, class90.field1779[var6]);
                        var52.field3829 = null;
                        class68.method550(var52, 15);
                        continue;
                    }
                    if (var309 == 200) {
                        var6 -= 2;
                        int var53 = class90.field1779[var6];
                        int var54 = class90.field1779[var6 + 1];
                        class193 var55 = class121.method875(var54, var53, 111);
                        if (var55 != null && var54 != -1) {
                            class90.field1779[var6++] = 1;
                            if (var42) {
                                class95.field1846 = var55;
                            } else {
                                class43.field764 = var55;
                            }
                            continue;
                        }
                        class90.field1779[var6++] = 0;
                        continue;
                    }
                    if (var309 == 201) {
                        var6--;
                        int var56 = class90.field1779[var6];
                        class193 var57 = class90.method701(-31355, var56);
                        if (var57 == null) {
                            class90.field1779[var6++] = 0;
                        } else {
                            class90.field1779[var6++] = 1;
                            if (var42) {
                                class95.field1846 = var57;
                            } else {
                                class43.field764 = var57;
                            }
                        }
                        continue;
                    }
                } else if (var309 >= 1000 && var309 < 1100 || !(var309 < 2000 || var309 >= 2100)) {
                    class193 var302;
                    if (var309 >= 2000) {
                        var6--;
                        var302 = class90.method701(-31355, class90.field1779[var6]);
                        var309 -= 1000;
                    } else {
                        var302 = var42 ? class95.field1846 : class43.field764;
                    }
                    if (var309 == 1000) {
                        var6 -= 2;
                        var302.field3695 = class90.field1779[var6];
                        var302.field3767 = class90.field1779[var6 + 1];
                        class68.method550(var302, 15);
                        continue;
                    }
                    if (var309 == 1001) {
                        var6 -= 2;
                        var302.field3705 = class90.field1779[var6];
                        var302.field3768 = class90.field1779[var6 + 1];
                        class68.method550(var302, 15);
                        continue;
                    }
                    if (var309 == 1003) {
                        var6--;
                        boolean var303 = class90.field1779[var6] == 1;
                        if (var302.field3750 != var303) {
                            var302.field3750 = var303;
                            class68.method550(var302, 15);
                        }
                        continue;
                    }
                } else if (var309 >= 1100 && var309 < 1200 || var309 >= 2100 && var309 < 2200) {
                    class193 var58;
                    if (var309 < 2000) {
                        var58 = var42 ? class95.field1846 : class43.field764;
                    } else {
                        var6--;
                        var58 = class90.method701(-31355, class90.field1779[var6]);
                        var309 -= 1000;
                    }
                    if (var309 == 1100) {
                        var6 -= 2;
                        var58.field3808 = class90.field1779[var6];
                        if (var58.field3794 - var58.field3705 < var58.field3808) {
                            var58.field3808 = var58.field3794 - var58.field3705;
                        }
                        if (var58.field3808 < 0) {
                            var58.field3808 = 0;
                        }
                        var58.field3739 = class90.field1779[var6 + 1];
                        if (var58.field3741 - var58.field3768 < var58.field3739) {
                            var58.field3739 = var58.field3741 - var58.field3768;
                        }
                        if (var58.field3739 < 0) {
                            var58.field3739 = 0;
                        }
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1101) {
                        var6--;
                        var58.field3775 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1102) {
                        var6--;
                        var58.field3749 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1103) {
                        var6--;
                        var58.field3785 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1104) {
                        var6--;
                        var58.field3766 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1105) {
                        var6--;
                        var58.field3754 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1106) {
                        var6--;
                        var58.field3778 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1107) {
                        var6--;
                        var58.field3825 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1108) {
                        var58.field3822 = 1;
                        var6--;
                        var58.field3717 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1109) {
                        var6 -= 6;
                        var58.field3747 = class90.field1779[var6];
                        var58.field3730 = class90.field1779[var6 + 1];
                        var58.field3709 = class90.field1779[var6 + 2];
                        var58.field3764 = class90.field1779[var6 + 3];
                        var58.field3718 = class90.field1779[var6 + 4];
                        var58.field3831 = class90.field1779[var6 + 5];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1110) {
                        var6--;
                        int var59 = class90.field1779[var6];
                        if (var58.field3802 != var59) {
                            var58.field3802 = var59;
                            var58.field3745 = 0;
                            var58.field3732 = 0;
                            class68.method550(var58, 15);
                        }
                        continue;
                    }
                    if (var309 == 1111) {
                        var6--;
                        var58.field3832 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1112) {
                        var7--;
                        class166 var60 = class174.field3307[var7];
                        if (!var60.method1138(var58.field3759, (byte) 61)) {
                            var58.field3759 = var60;
                            class68.method550(var58, 15);
                        }
                        continue;
                    }
                    if (var309 == 1113) {
                        var6--;
                        var58.field3828 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1114) {
                        var6 -= 3;
                        var58.field3724 = class90.field1779[var6];
                        var58.field3798 = class90.field1779[var6 + 1];
                        var58.field3835 = class90.field1779[var6 + 2];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1115) {
                        var6--;
                        var58.field3787 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1116) {
                        var6--;
                        var58.field3771 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1117) {
                        var6--;
                        var58.field3756 = class90.field1779[var6];
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1118) {
                        var6--;
                        var58.field3708 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1119) {
                        var6--;
                        var58.field3810 = class90.field1779[var6] == 1;
                        class68.method550(var58, 15);
                        continue;
                    }
                    if (var309 == 1120) {
                        var6 -= 2;
                        var58.field3794 = class90.field1779[var6];
                        var58.field3741 = class90.field1779[var6 + 1];
                        class68.method550(var58, 15);
                        continue;
                    }
                } else if (var309 >= 1200 && var309 < 1300 || !(var309 < 2200 || var309 >= 2300)) {
                    class193 var298;
                    if (var309 < 2000) {
                        var298 = var42 ? class95.field1846 : class43.field764;
                    } else {
                        var6--;
                        var298 = class90.method701(-31355, class90.field1779[var6]);
                        var309 -= 1000;
                    }
                    class68.method550(var298, 15);
                    if (var309 == 1200) {
                        var6 -= 2;
                        int var299 = class90.field1779[var6 + 1];
                        int var300 = class90.field1779[var6];
                        var298.field3726 = var300;
                        var298.field3819 = var299;
                        class57 var301 = class3.method19(var300, true);
                        var298.field3718 = var301.field1117;
                        var298.field3730 = var301.field1139;
                        var298.field3709 = var301.field1156;
                        var298.field3764 = var301.field1140;
                        var298.field3747 = var301.field1159;
                        var298.field3831 = var301.field1175;
                        if (var298.field3705 > 0) {
                            var298.field3831 = var298.field3831 * 32 / var298.field3705;
                        }
                        continue;
                    }
                    if (var309 == 1201) {
                        var298.field3822 = 2;
                        var6--;
                        var298.field3717 = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 1202) {
                        var298.field3822 = 3;
                        var298.field3717 = class41.field728.field2424.method811((byte) 24);
                        continue;
                    }
                    if (var309 == 1203) {
                        var298.field3822 = 6;
                        var6--;
                        var298.field3717 = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 1204) {
                        var298.field3822 = 5;
                        var6--;
                        var298.field3717 = class90.field1779[var6];
                        continue;
                    }
                } else if (var309 >= 1300 && var309 < 1400 || var309 >= 2300 && var309 < 2400) {
                    class193 var61;
                    if (var309 >= 2000) {
                        var6--;
                        var61 = class90.method701(-31355, class90.field1779[var6]);
                        var309 -= 1000;
                    } else {
                        var61 = var42 ? class95.field1846 : class43.field764;
                    }
                    if (var309 == 1300) {
                        var6--;
                        int var62 = class90.field1779[var6] - 1;
                        if (var62 >= 0 && var62 <= 9) {
                            var7--;
                            var61.method1287(65535, var62, class174.field3307[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var309 == 1301) {
                        var6 -= 2;
                        int var63 = class90.field1779[var6];
                        int var64 = class90.field1779[var6 + 1];
                        var61.field3773 = class121.method875(var64, var63, 118);
                        continue;
                    }
                    if (var309 == 1302) {
                        var6--;
                        var61.field3834 = class90.field1779[var6] == 1;
                        continue;
                    }
                    if (var309 == 1303) {
                        var6--;
                        var61.field3826 = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 1304) {
                        var6--;
                        var61.field3702 = class90.field1779[var6];
                        continue;
                    }
                    if (var309 == 1305) {
                        var7--;
                        var61.field3720 = class174.field3307[var7];
                        continue;
                    }
                    if (var309 == 1306) {
                        var7--;
                        var61.field3701 = class174.field3307[var7];
                        continue;
                    }
                    if (var309 == 1307) {
                        var61.field3696 = null;
                        continue;
                    }
                } else {
                    if (var309 >= 1400 && var309 < 1500 || var309 >= 2400 && var309 < 2500) {
                        class193 var65;
                        if (var309 < 2000) {
                            var65 = var42 ? class95.field1846 : class43.field764;
                        } else {
                            var6--;
                            var65 = class90.method701(-31355, class90.field1779[var6]);
                            var309 -= 1000;
                        }
                        int[] var66 = null;
                        var7--;
                        class166 var67 = class174.field3307[var7];
                        if (var67.method1143(true) > 0 && var67.method1152(-94, var67.method1143(true) - 1) == 89) {
                            var6--;
                            int var68 = class90.field1779[var6];
                            if (var68 > 0) {
                                var66 = new int[var68];
                                while (var68-- > 0) {
                                    var6--;
                                    var66[var68] = class90.field1779[var6];
                                }
                            }
                            var67 = var67.method1121(10876, var67.method1143(true) - 1, 0);
                        }
                        Object[] var69 = new Object[var67.method1143(true) + 1];
                        for (int var70 = var69.length - 1; var70 >= 1; var70--) {
                            if (var67.method1152(-91, var70 - 1) == 115) {
                                var7--;
                                var69[var70] = class174.field3307[var7];
                            } else {
                                var6--;
                                var69[var70] = Integer.valueOf(class90.field1779[var6]);
                            }
                        }
                        var6--;
                        int var71 = class90.field1779[var6];
                        if (var71 == -1) {
                            var69 = null;
                        } else {
                            var69[0] = Integer.valueOf(var71);
                        }
                        if (var309 == 1410) {
                            var65.field3789 = var69;
                        }
                        if (var309 == 1412) {
                            var65.field3769 = var69;
                        }
                        var65.field3770 = true;
                        if (var309 == 1404) {
                            var65.field3786 = var69;
                        }
                        if (var309 == 1409) {
                            var65.field3707 = var69;
                        }
                        if (var309 == 1415) {
                            var65.field3733 = var66;
                            var65.field3836 = var69;
                        }
                        if (var309 == 1408) {
                            var65.field3748 = var69;
                        }
                        if (var309 == 1425) {
                            var65.field3804 = var69;
                        }
                        if (var309 == 1414) {
                            var65.field3743 = var69;
                            var65.field3781 = var66;
                        }
                        if (var309 == 1402) {
                            var65.field3815 = var69;
                        }
                        if (var309 == 1417) {
                            var65.field3801 = var69;
                        }
                        if (var309 == 1419) {
                            var65.field3737 = var69;
                        }
                        if (var309 == 1420) {
                            var65.field3704 = var69;
                        }
                        if (var309 == 1407) {
                            var65.field3818 = var66;
                            var65.field3721 = var69;
                        }
                        if (var309 == 1403) {
                            var65.field3742 = var69;
                        }
                        if (var309 == 1411) {
                            var65.field3735 = var69;
                        }
                        if (var309 == 1418) {
                            var65.field3697 = var69;
                        }
                        if (var309 == 1401) {
                            var65.field3799 = var69;
                        }
                        if (var309 == 1423) {
                            var65.field3698 = var69;
                        }
                        if (var309 == 1416) {
                            var65.field3725 = var69;
                        }
                        if (var309 == 1405) {
                            var65.field3736 = var69;
                        }
                        if (var309 == 1422) {
                            var65.field3703 = var69;
                        }
                        if (var309 == 1424) {
                            var65.field3796 = var69;
                        }
                        if (var309 == 1406) {
                            var65.field3838 = var69;
                        }
                        if (var309 == 1421) {
                            var65.field3719 = var69;
                        }
                        if (var309 == 1400) {
                            var65.field3840 = var69;
                        }
                        continue;
                    }
                    if (var309 < 1600) {
                        class193 var297 = var42 ? class95.field1846 : class43.field764;
                        if (var309 == 1500) {
                            class90.field1779[var6++] = var297.field3695;
                            continue;
                        }
                        if (var309 == 1501) {
                            class90.field1779[var6++] = var297.field3767;
                            continue;
                        }
                        if (var309 == 1502) {
                            class90.field1779[var6++] = var297.field3705;
                            continue;
                        }
                        if (var309 == 1503) {
                            class90.field1779[var6++] = var297.field3768;
                            continue;
                        }
                        if (var309 == 1504) {
                            class90.field1779[var6++] = var297.field3750 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 1505) {
                            class90.field1779[var6++] = var297.field3762;
                            continue;
                        }
                    } else if (var309 < 1700) {
                        class193 var296 = var42 ? class95.field1846 : class43.field764;
                        if (var309 == 1600) {
                            class90.field1779[var6++] = var296.field3808;
                            continue;
                        }
                        if (var309 == 1601) {
                            class90.field1779[var6++] = var296.field3739;
                            continue;
                        }
                        if (var309 == 1602) {
                            class174.field3307[var7++] = var296.field3759;
                            continue;
                        }
                        if (var309 == 1603) {
                            class90.field1779[var6++] = var296.field3794;
                            continue;
                        }
                        if (var309 == 1604) {
                            class90.field1779[var6++] = var296.field3741;
                            continue;
                        }
                        if (var309 == 1605) {
                            class90.field1779[var6++] = var296.field3831;
                            continue;
                        }
                        if (var309 == 1606) {
                            class90.field1779[var6++] = var296.field3709;
                            continue;
                        }
                        if (var309 == 1607) {
                            class90.field1779[var6++] = var296.field3718;
                            continue;
                        }
                        if (var309 == 1608) {
                            class90.field1779[var6++] = var296.field3764;
                            continue;
                        }
                        if (var309 == 1609) {
                            class90.field1779[var6++] = var296.field3785;
                            continue;
                        }
                    } else if (var309 < 1800) {
                        class193 var72 = var42 ? class95.field1846 : class43.field764;
                        if (var309 == 1700) {
                            class90.field1779[var6++] = var72.field3726;
                            continue;
                        }
                        if (var309 == 1701) {
                            if (var72.field3726 == -1) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = var72.field3819;
                            }
                            continue;
                        }
                        if (var309 == 1702) {
                            class90.field1779[var6++] = var72.field3716;
                            continue;
                        }
                    } else if (var309 < 1900) {
                        class193 var73 = var42 ? class95.field1846 : class43.field764;
                        if (var309 == 1800) {
                            class90.field1779[var6++] = class195.method1301(class140.method955(-118, var73), -2);
                            continue;
                        }
                        if (var309 == 1801) {
                            var6--;
                            int var74 = class90.field1779[var6];
                            int var310 = var74 - 1;
                            if (var73.field3696 != null && var73.field3696.length > var310 && var73.field3696[var310] != null) {
                                class174.field3307[var7++] = var73.field3696[var310];
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 1802) {
                            if (var73.field3720 == null) {
                                class174.field3307[var7++] = class69.field1402;
                            } else {
                                class174.field3307[var7++] = var73.field3720;
                            }
                            continue;
                        }
                    } else if (var309 < 2600) {
                        var6--;
                        class193 var295 = class90.method701(-31355, class90.field1779[var6]);
                        if (var309 == 2500) {
                            class90.field1779[var6++] = var295.field3695;
                            continue;
                        }
                        if (var309 == 2501) {
                            class90.field1779[var6++] = var295.field3767;
                            continue;
                        }
                        if (var309 == 2502) {
                            class90.field1779[var6++] = var295.field3705;
                            continue;
                        }
                        if (var309 == 2503) {
                            class90.field1779[var6++] = var295.field3768;
                            continue;
                        }
                        if (var309 == 2504) {
                            class90.field1779[var6++] = var295.field3750 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 2505) {
                            class90.field1779[var6++] = var295.field3762;
                            continue;
                        }
                    } else if (var309 < 2700) {
                        var6--;
                        class193 var75 = class90.method701(-31355, class90.field1779[var6]);
                        if (var309 == 2600) {
                            class90.field1779[var6++] = var75.field3808;
                            continue;
                        }
                        if (var309 == 2601) {
                            class90.field1779[var6++] = var75.field3739;
                            continue;
                        }
                        if (var309 == 2602) {
                            class174.field3307[var7++] = var75.field3759;
                            continue;
                        }
                        if (var309 == 2603) {
                            class90.field1779[var6++] = var75.field3794;
                            continue;
                        }
                        if (var309 == 2604) {
                            class90.field1779[var6++] = var75.field3741;
                            continue;
                        }
                        if (var309 == 2605) {
                            class90.field1779[var6++] = var75.field3831;
                            continue;
                        }
                        if (var309 == 2606) {
                            class90.field1779[var6++] = var75.field3709;
                            continue;
                        }
                        if (var309 == 2607) {
                            class90.field1779[var6++] = var75.field3718;
                            continue;
                        }
                        if (var309 == 2608) {
                            class90.field1779[var6++] = var75.field3764;
                            continue;
                        }
                        if (var309 == 2609) {
                            class90.field1779[var6++] = var75.field3785;
                            continue;
                        }
                    } else if (var309 < 2800) {
                        if (var309 == 2700) {
                            var6--;
                            class193 var285 = class90.method701(-31355, class90.field1779[var6]);
                            class90.field1779[var6++] = var285.field3726;
                            continue;
                        }
                        if (var309 == 2701) {
                            var6--;
                            class193 var286 = class90.method701(-31355, class90.field1779[var6]);
                            if (var286.field3726 == -1) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = var286.field3819;
                            }
                            continue;
                        }
                        if (var309 == 2702) {
                            var6--;
                            int var287 = class90.field1779[var6];
                            class54 var288 = (class54) class103.field2017.method224(-1, (long) var287);
                            if (var288 == null) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = 1;
                            }
                            continue;
                        }
                        if (var309 == 2703) {
                            var6--;
                            class193 var289 = class90.method701(-31355, class90.field1779[var6]);
                            if (var289.field3829 == null) {
                                class90.field1779[var6++] = 0;
                                continue;
                            }
                            int var290 = var289.field3829.length;
                            for (int var291 = 0; var291 < var289.field3829.length; var291++) {
                                if (var289.field3829[var291] == null) {
                                    var290 = var291;
                                    break;
                                }
                            }
                            class90.field1779[var6++] = var290;
                            continue;
                        }
                        if (var309 == 2704 || var309 == 2705) {
                            var6 -= 2;
                            int var292 = class90.field1779[var6];
                            int var293 = class90.field1779[var6 + 1];
                            class54 var294 = (class54) class103.field2017.method224(-1, (long) var292);
                            if (var294 != null && var294.field1023 == var293) {
                                class90.field1779[var6++] = 1;
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                    } else if (var309 < 2900) {
                        var6--;
                        class193 var76 = class90.method701(-31355, class90.field1779[var6]);
                        if (var309 == 2800) {
                            class90.field1779[var6++] = class195.method1301(class140.method955(-38, var76), -2);
                            continue;
                        }
                        if (var309 == 2801) {
                            var6--;
                            int var77 = class90.field1779[var6];
                            int var311 = var77 - 1;
                            if (var76.field3696 != null && var311 < var76.field3696.length && var76.field3696[var311] != null) {
                                class174.field3307[var7++] = var76.field3696[var311];
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 2802) {
                            if (var76.field3720 == null) {
                                class174.field3307[var7++] = class69.field1402;
                            } else {
                                class174.field3307[var7++] = var76.field3720;
                            }
                            continue;
                        }
                    } else if (var309 < 3200) {
                        if (var309 == 3100) {
                            var7--;
                            class166 var78 = class174.field3307[var7];
                            class150.method1023((byte) 116, 0, var78, class69.field1402);
                            continue;
                        }
                        if (var309 == 3101) {
                            var6 -= 2;
                            class122.method879((byte) 21, class90.field1779[var6 + 1], class41.field728, class90.field1779[var6]);
                            continue;
                        }
                        if (var309 == 3103) {
                            class82.method667((byte) 91);
                            continue;
                        }
                        if (var309 == 3104) {
                            int var79 = 0;
                            var7--;
                            class166 var80 = class174.field3307[var7];
                            class34.field636++;
                            if (var80.method1125(-28893)) {
                                var79 = var80.method1139((byte) 12);
                            }
                            class156.field2989.method705(82, (byte) 9);
                            class156.field2989.method438(423055928, var79);
                            continue;
                        }
                        if (var309 == 3105) {
                            class169.field3234++;
                            var7--;
                            class166 var81 = class174.field3307[var7];
                            class156.field2989.method705(88, (byte) 9);
                            class156.field2989.method428(var81.method1133((byte) 30), (byte) 73);
                            continue;
                        }
                        if (var309 == 3106) {
                            var7--;
                            class166 var82 = class174.field3307[var7];
                            class156.field2989.method705(184, (byte) 9);
                            class156.field2989.method429(var82.method1143(true) + 1, (byte) 101);
                            class156.field2989.method396(var82, false);
                            class193.field3816++;
                            continue;
                        }
                        if (var309 == 3107) {
                            var6--;
                            int var83 = class90.field1779[var6];
                            var7--;
                            class166 var84 = class174.field3307[var7];
                            class74.method626(-26131, var83, var84);
                            continue;
                        }
                        if (var309 == 3108) {
                            var6 -= 3;
                            int var85 = class90.field1779[var6];
                            int var86 = class90.field1779[var6 + 1];
                            int var87 = class90.field1779[var6 + 2];
                            class193 var88 = class90.method701(-31355, var87);
                            class45.method343(-128, var86, var85, var88);
                            continue;
                        }
                        if (var309 == 3109) {
                            var6 -= 2;
                            int var89 = class90.field1779[var6 + 1];
                            class193 var90 = var42 ? class95.field1846 : class43.field764;
                            int var91 = class90.field1779[var6];
                            class45.method343(-127, var89, var91, var90);
                            continue;
                        }
                        if (var309 == 3110) {
                            var6--;
                            int var92 = class90.field1779[var6];
                            class27.field472++;
                            class156.field2989.method705(182, (byte) 9);
                            class156.field2989.method407((byte) -119, var92);
                            continue;
                        }
                    } else if (var309 < 3300) {
                        if (var309 == 3200) {
                            var6 -= 3;
                            class100.method746(class90.field1779[var6 + 2], class90.field1779[var6], class90.field1779[var6 + 1], -51);
                            continue;
                        }
                        if (var309 == 3201) {
                            var6--;
                            class123.method880((byte) 78, class90.field1779[var6]);
                            continue;
                        }
                        if (var309 == 3202) {
                            var6 -= 2;
                            class139.method952(class90.field1779[var6], class90.field1779[var6 + 1], 125);
                            continue;
                        }
                    } else if (var309 < 3400) {
                        if (var309 == 3300) {
                            class90.field1779[var6++] = class49.field910;
                            continue;
                        }
                        if (var309 == 3301) {
                            var6 -= 2;
                            int var93 = class90.field1779[var6];
                            int var94 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class180.method1218(var93, 14, var94);
                            continue;
                        }
                        if (var309 == 3302) {
                            var6 -= 2;
                            int var95 = class90.field1779[var6];
                            int var96 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class111.method801(var95, var96, 0);
                            continue;
                        }
                        if (var309 == 3303) {
                            var6 -= 2;
                            int var97 = class90.field1779[var6];
                            int var98 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class153.method1033(var97, 0, var98);
                            continue;
                        }
                        if (var309 == 3304) {
                            var6--;
                            int var99 = class90.field1779[var6];
                            class90.field1779[var6++] = class121.method877((byte) 109, var99).field3287;
                            continue;
                        }
                        if (var309 == 3305) {
                            var6--;
                            int var100 = class90.field1779[var6];
                            class90.field1779[var6++] = class135.field2609[var100];
                            continue;
                        }
                        if (var309 == 3306) {
                            var6--;
                            int var101 = class90.field1779[var6];
                            class90.field1779[var6++] = field1231[var101];
                            continue;
                        }
                        if (var309 == 3307) {
                            var6--;
                            int var102 = class90.field1779[var6];
                            class90.field1779[var6++] = class12.field238[var102];
                            continue;
                        }
                        if (var309 == 3308) {
                            int var103 = (class41.field728.field3526 >> 7) + class170.field3279;
                            int var104 = class165.field3130;
                            int var105 = (class41.field728.field3513 >> 7) + class147.field2901;
                            class90.field1779[var6++] = (var104 << 28) + (var103 << 14) + var105;
                            continue;
                        }
                        if (var309 == 3309) {
                            var6--;
                            int var106 = class90.field1779[var6];
                            class90.field1779[var6++] = class22.method151(16383, var106 >> 14);
                            continue;
                        }
                        if (var309 == 3310) {
                            var6--;
                            int var107 = class90.field1779[var6];
                            class90.field1779[var6++] = var107 >> 28;
                            continue;
                        }
                        if (var309 == 3311) {
                            var6--;
                            int var108 = class90.field1779[var6];
                            class90.field1779[var6++] = class22.method151(var108, 16383);
                            continue;
                        }
                        if (var309 == 3312) {
                            class90.field1779[var6++] = class121.field2369 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 3313) {
                            var6 -= 2;
                            int var109 = class90.field1779[var6 + 1];
                            int var110 = class90.field1779[var6] + 32768;
                            class90.field1779[var6++] = class180.method1218(var110, 14, var109);
                            continue;
                        }
                        if (var309 == 3314) {
                            var6 -= 2;
                            int var111 = class90.field1779[var6] + 32768;
                            int var112 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class111.method801(var111, var112, 0);
                            continue;
                        }
                        if (var309 == 3315) {
                            var6 -= 2;
                            int var113 = class90.field1779[var6 + 1];
                            int var114 = class90.field1779[var6] + 32768;
                            class90.field1779[var6++] = class153.method1033(var114, 0, var113);
                            continue;
                        }
                        if (var309 == 3316) {
                            if (class103.field2022 >= 2) {
                                class90.field1779[var6++] = class103.field2022;
                            } else {
                                class90.field1779[var6++] = 0;
                            }
                            continue;
                        }
                        if (var309 == 3317) {
                            class90.field1779[var6++] = class106.field2074;
                            continue;
                        }
                        if (var309 == 3318) {
                            class90.field1779[var6++] = class106.field2071;
                            continue;
                        }
                        if (var309 == 3321) {
                            class90.field1779[var6++] = class10.field194;
                            continue;
                        }
                        if (var309 == 3322) {
                            class90.field1779[var6++] = class42.field744;
                            continue;
                        }
                        if (var309 == 3323) {
                            if (class103.field2022 == 1) {
                                class90.field1779[var6++] = 1;
                            } else {
                                class90.field1779[var6++] = 0;
                            }
                            continue;
                        }
                        if (var309 == 3324) {
                            if (class38.field686 >= 5 && class38.field686 <= 9) {
                                class90.field1779[var6++] = class38.field686;
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3325) {
                            if (class12.field227 > 0) {
                                class90.field1779[var6++] = 1;
                            } else {
                                class90.field1779[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var309 < 3500) {
                        if (var309 == 3400) {
                            var6 -= 2;
                            int var275 = class90.field1779[var6];
                            int var276 = class90.field1779[var6 + 1];
                            class25 var277 = class14.method79((byte) 46, var275);
                            for (int var278 = 0; var278 < var277.field460; var278++) {
                                if (var277.field461[var278] == var276) {
                                    class174.field3307[var7++] = var277.field459[var278];
                                    var277 = null;
                                    break;
                                }
                            }
                            if (var277 != null) {
                                class174.field3307[var7++] = var277.field442;
                            }
                            continue;
                        }
                        if (var309 == 3408) {
                            var6 -= 4;
                            int var279 = class90.field1779[var6 + 1];
                            int var280 = class90.field1779[var6];
                            int var281 = class90.field1779[var6 + 2];
                            int var282 = class90.field1779[var6 + 3];
                            class25 var283 = class14.method79((byte) 118, var281);
                            if (var283.field456 == var280 && var283.field454 == var279) {
                                for (int var284 = 0; var284 < var283.field460; var284++) {
                                    if (var283.field461[var284] == var282) {
                                        if (var279 == 115) {
                                            class174.field3307[var7++] = var283.field459[var284];
                                        } else {
                                            class90.field1779[var6++] = var283.field449[var284];
                                        }
                                        var283 = null;
                                        break;
                                    }
                                }
                                if (var283 != null) {
                                    if (var279 == 115) {
                                        class174.field3307[var7++] = var283.field442;
                                    } else {
                                        class90.field1779[var6++] = var283.field445;
                                    }
                                }
                                continue;
                            }
                            if (var279 == 115) {
                                class174.field3307[var7++] = class157.field3003;
                            } else {
                                class90.field1779[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var309 < 3700) {
                        if (var309 == 3600) {
                            if (class169.field3240 == 0) {
                                class90.field1779[var6++] = -2;
                            } else if (class169.field3240 == 1) {
                                class90.field1779[var6++] = -1;
                            } else {
                                class90.field1779[var6++] = class189.field3609;
                            }
                            continue;
                        }
                        if (var309 == 3601) {
                            var6--;
                            int var257 = class90.field1779[var6];
                            if (class169.field3240 == 2 && var257 < class189.field3609) {
                                class174.field3307[var7++] = class127.field2500[var257];
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 3602) {
                            var6--;
                            int var258 = class90.field1779[var6];
                            if (class169.field3240 == 2 && class189.field3609 > var258) {
                                class90.field1779[var6++] = class121.field2374[var258];
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3603) {
                            var6--;
                            int var259 = class90.field1779[var6];
                            if (class169.field3240 == 2 && class189.field3609 > var259) {
                                class90.field1779[var6++] = class97.field1857[var259];
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3604) {
                            var7--;
                            class166 var260 = class174.field3307[var7];
                            var6--;
                            int var261 = class90.field1779[var6];
                            class16.method86(var261, var260, 26805);
                            continue;
                        }
                        if (var309 == 3605) {
                            var7--;
                            class166 var262 = class174.field3307[var7];
                            class150.method1017((byte) 40, var262.method1133((byte) 30));
                            continue;
                        }
                        if (var309 == 3606) {
                            var7--;
                            class166 var263 = class174.field3307[var7];
                            class192.method1279(var263.method1133((byte) 30), 915);
                            continue;
                        }
                        if (var309 == 3607) {
                            var7--;
                            class166 var264 = class174.field3307[var7];
                            client.method209(4257, var264.method1133((byte) 30));
                            continue;
                        }
                        if (var309 == 3608) {
                            var7--;
                            class166 var265 = class174.field3307[var7];
                            class70.method564(var265.method1133((byte) 30), (byte) -123);
                            continue;
                        }
                        if (var309 == 3609) {
                            var7--;
                            class166 var266 = class174.field3307[var7];
                            if (var266.method1142(27575, class47.field846) || var266.method1142(27575, class123.field2406)) {
                                var266 = var266.method1155(7, (byte) -72);
                            }
                            class90.field1779[var6++] = class86.method687(var266, -127) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 3611) {
                            if (class14.field254 == null) {
                                class174.field3307[var7++] = class69.field1402;
                            } else {
                                class174.field3307[var7++] = class14.field254.method1159(-41);
                            }
                            continue;
                        }
                        if (var309 == 3612) {
                            if (class14.field254 == null) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = class58.field1194;
                            }
                            continue;
                        }
                        if (var309 == 3613) {
                            var6--;
                            int var267 = class90.field1779[var6];
                            if (class14.field254 != null && class58.field1194 > var267) {
                                class174.field3307[var7++] = class156.field2995[var267].field582.method1159(-120);
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 3614) {
                            var6--;
                            int var268 = class90.field1779[var6];
                            if (class14.field254 != null && class58.field1194 > var268) {
                                class90.field1779[var6++] = class156.field2995[var268].field574;
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3615) {
                            var6--;
                            int var269 = class90.field1779[var6];
                            if (class14.field254 != null && class58.field1194 > var269) {
                                class90.field1779[var6++] = class156.field2995[var269].field583;
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3616) {
                            class90.field1779[var6++] = class157.field3004;
                            continue;
                        }
                        if (var309 == 3617) {
                            var7--;
                            class166 var270 = class174.field3307[var7];
                            class143.method976(var270, false);
                            continue;
                        }
                        if (var309 == 3618) {
                            class90.field1779[var6++] = class100.field1899;
                            continue;
                        }
                        if (var309 == 3619) {
                            var7--;
                            class166 var271 = class174.field3307[var7];
                            class104.method778(var271.method1133((byte) 30), true);
                            continue;
                        }
                        if (var309 == 3620) {
                            class146.method1007(-31953);
                            continue;
                        }
                        if (var309 == 3621) {
                            if (class169.field3240 == 0) {
                                class90.field1779[var6++] = -1;
                            } else {
                                class90.field1779[var6++] = class119.field2344;
                            }
                            continue;
                        }
                        if (var309 == 3622) {
                            var6--;
                            int var272 = class90.field1779[var6];
                            if (class169.field3240 != 0 && var272 < class119.field2344) {
                                class174.field3307[var7++] = class191.method1278(37, class72.field1430[var272]).method1159(-39);
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 3623) {
                            var7--;
                            class166 var273 = class174.field3307[var7];
                            if (var273.method1142(27575, class47.field846) || var273.method1142(27575, class123.field2406)) {
                                var273 = var273.method1155(7, (byte) -72);
                            }
                            class90.field1779[var6++] = class161.method1091(1237, var273) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 3624) {
                            var6--;
                            int var274 = class90.field1779[var6];
                            if (class156.field2995 != null && var274 < class58.field1194 && class156.field2995[var274].field582.method1146((byte) -99, class41.field728.field2412)) {
                                class90.field1779[var6++] = 1;
                                continue;
                            }
                            class90.field1779[var6++] = 0;
                            continue;
                        }
                        if (var309 == 3625) {
                            if (class11.field198 == null) {
                                class174.field3307[var7++] = class69.field1402;
                            } else {
                                class174.field3307[var7++] = class11.field198.method1159(-94);
                            }
                            continue;
                        }
                    } else if (var309 < 4000) {
                        if (var309 == 3903) {
                            var6--;
                            int var115 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var115].method989(5);
                            continue;
                        }
                        if (var309 == 3904) {
                            var6--;
                            int var116 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var116].field2801;
                            continue;
                        }
                        if (var309 == 3905) {
                            var6--;
                            int var117 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var117].field2807;
                            continue;
                        }
                        if (var309 == 3906) {
                            var6--;
                            int var118 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var118].field2788;
                            continue;
                        }
                        if (var309 == 3907) {
                            var6--;
                            int var119 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var119].field2789;
                            continue;
                        }
                        if (var309 == 3908) {
                            var6--;
                            int var120 = class90.field1779[var6];
                            class90.field1779[var6++] = class192.field3642[var120].field2797;
                            continue;
                        }
                        if (var309 == 3910) {
                            var6--;
                            int var121 = class90.field1779[var6];
                            int var122 = class192.field3642[var121].method983(240);
                            class90.field1779[var6++] = var122 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 3911) {
                            var6--;
                            int var123 = class90.field1779[var6];
                            int var124 = class192.field3642[var123].method983(240);
                            class90.field1779[var6++] = var124 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 3912) {
                            var6--;
                            int var125 = class90.field1779[var6];
                            int var126 = class192.field3642[var125].method983(240);
                            class90.field1779[var6++] = var126 == 5 ? 1 : 0;
                            continue;
                        }
                    } else if (var309 < 4100) {
                        if (var309 == 4000) {
                            var6 -= 2;
                            int var127 = class90.field1779[var6];
                            int var128 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var127 + var128;
                            continue;
                        }
                        if (var309 == 4001) {
                            var6 -= 2;
                            int var129 = class90.field1779[var6];
                            int var130 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var129 - var130;
                            continue;
                        }
                        if (var309 == 4002) {
                            var6 -= 2;
                            int var131 = class90.field1779[var6 + 1];
                            int var132 = class90.field1779[var6];
                            class90.field1779[var6++] = var131 * var132;
                            continue;
                        }
                        if (var309 == 4003) {
                            var6 -= 2;
                            int var133 = class90.field1779[var6];
                            int var134 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var133 / var134;
                            continue;
                        }
                        if (var309 == 4004) {
                            var6--;
                            int var135 = class90.field1779[var6];
                            class90.field1779[var6++] = (int) (Math.random() * (double) var135);
                            continue;
                        }
                        if (var309 == 4005) {
                            var6--;
                            int var136 = class90.field1779[var6];
                            class90.field1779[var6++] = (int) (Math.random() * (double) (var136 + 1));
                            continue;
                        }
                        if (var309 == 4006) {
                            var6 -= 5;
                            int var137 = class90.field1779[var6];
                            int var138 = class90.field1779[var6 + 2];
                            int var139 = class90.field1779[var6 + 3];
                            int var140 = class90.field1779[var6 + 1];
                            int var141 = class90.field1779[var6 + 4];
                            class90.field1779[var6++] = (var140 - var137) * (-var138 + var141) / (var139 - var138) + var137;
                            continue;
                        }
                        if (var309 == 4007) {
                            var6 -= 2;
                            int var142 = class90.field1779[var6];
                            int var143 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var142 + var142 * var143 / 100;
                            continue;
                        }
                        if (var309 == 4008) {
                            var6 -= 2;
                            int var144 = class90.field1779[var6];
                            int var145 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class6.method42(var144, 0x1 << var145);
                            continue;
                        }
                        if (var309 == 4009) {
                            var6 -= 2;
                            int var146 = class90.field1779[var6];
                            int var147 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class22.method151(-(0x1 << var147) - 1, var146);
                            continue;
                        }
                        if (var309 == 4010) {
                            var6 -= 2;
                            int var148 = class90.field1779[var6];
                            int var149 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class22.method151(0x1 << var149, var148) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var309 == 4011) {
                            var6 -= 2;
                            int var150 = class90.field1779[var6];
                            int var151 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var150 % var151;
                            continue;
                        }
                        if (var309 == 4012) {
                            var6 -= 2;
                            int var152 = class90.field1779[var6 + 1];
                            int var153 = class90.field1779[var6];
                            if (var153 == 0) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = (int) Math.pow((double) var153, (double) var152);
                            }
                            continue;
                        }
                        if (var309 == 4013) {
                            var6 -= 2;
                            int var154 = class90.field1779[var6];
                            int var155 = class90.field1779[var6 + 1];
                            if (var154 == 0) {
                                class90.field1779[var6++] = 0;
                            } else if (var155 == 0) {
                                class90.field1779[var6++] = Integer.MAX_VALUE;
                            } else {
                                class90.field1779[var6++] = (int) Math.pow((double) var154, 1.0D / (double) var155);
                            }
                            continue;
                        }
                        if (var309 == 4014) {
                            var6 -= 2;
                            int var156 = class90.field1779[var6 + 1];
                            int var157 = class90.field1779[var6];
                            class90.field1779[var6++] = class22.method151(var157, var156);
                            continue;
                        }
                        if (var309 == 4015) {
                            var6 -= 2;
                            int var158 = class90.field1779[var6];
                            int var159 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = class6.method42(var158, var159);
                            continue;
                        }
                        if (var309 == 4016) {
                            var6 -= 2;
                            int var160 = class90.field1779[var6];
                            int var161 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var161 <= var160 ? var161 : var160;
                            continue;
                        }
                        if (var309 == 4017) {
                            var6 -= 2;
                            int var162 = class90.field1779[var6];
                            int var163 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var163 >= var162 ? var163 : var162;
                            continue;
                        }
                        if (var309 == 4018) {
                            var6 -= 3;
                            long var164 = (long) class90.field1779[var6];
                            long var166 = (long) class90.field1779[var6 + 1];
                            long var168 = (long) class90.field1779[var6 + 2];
                            class90.field1779[var6++] = (int) (var164 * var168 / var166);
                            continue;
                        }
                    } else if (var309 < 4200) {
                        if (var309 == 4100) {
                            var7--;
                            class166 var207 = class174.field3307[var7];
                            var6--;
                            int var208 = class90.field1779[var6];
                            class174.field3307[var7++] = class22.method148(new class166[] { var207, class174.method1192(false, var208) }, 0);
                            continue;
                        }
                        if (var309 == 4101) {
                            var7 -= 2;
                            class166 var209 = class174.field3307[var7];
                            class166 var210 = class174.field3307[var7 + 1];
                            class174.field3307[var7++] = class22.method148(new class166[] { var209, var210 }, 0);
                            continue;
                        }
                        if (var309 == 4102) {
                            var7--;
                            class166 var211 = class174.field3307[var7];
                            var6--;
                            int var212 = class90.field1779[var6];
                            class174.field3307[var7++] = class22.method148(new class166[] { var211, class166.method1129(false, true, var212) }, 0);
                            continue;
                        }
                        if (var309 == 4103) {
                            var7--;
                            class166 var213 = class174.field3307[var7];
                            class174.field3307[var7++] = var213.method1127((byte) 123);
                            continue;
                        }
                        if (var309 == 4104) {
                            var6--;
                            int var214 = class90.field1779[var6];
                            long var215 = (long) var214 * 86400000L + 1014768000000L;
                            class5.field104.setTime(new Date(var215));
                            int var217 = class5.field104.get(5);
                            int var218 = class5.field104.get(2);
                            int var219 = class5.field104.get(1);
                            class174.field3307[var7++] = class22.method148(new class166[] { class174.method1192(false, var217), class37.field683, client.field525[var218], class37.field683, class174.method1192(false, var219) }, 0);
                            continue;
                        }
                        if (var309 == 4105) {
                            var7 -= 2;
                            class166 var220 = class174.field3307[var7 + 1];
                            class166 var221 = class174.field3307[var7];
                            if (class41.field728.field2424 != null && class41.field728.field2424.field2159) {
                                class174.field3307[var7++] = var220;
                                continue;
                            }
                            class174.field3307[var7++] = var221;
                            continue;
                        }
                        if (var309 == 4106) {
                            var6--;
                            int var222 = class90.field1779[var6];
                            class174.field3307[var7++] = class174.method1192(false, var222);
                            continue;
                        }
                        if (var309 == 4107) {
                            var7 -= 2;
                            class90.field1779[var6++] = class174.field3307[var7].method1132(1, class174.field3307[var7 + 1]);
                            continue;
                        }
                        if (var309 == 4108) {
                            var6 -= 2;
                            int var223 = class90.field1779[var6];
                            int var224 = class90.field1779[var6 + 1];
                            var7--;
                            class166 var225 = class174.field3307[var7];
                            byte[] var226 = class203.field4004.method353(var224, 0, -53);
                            class66 var227 = new class66(var226);
                            class90.field1779[var6++] = var227.method161(var225, var223);
                            continue;
                        }
                        if (var309 == 4109) {
                            var7--;
                            class166 var228 = class174.field3307[var7];
                            var6 -= 2;
                            int var229 = class90.field1779[var6];
                            int var230 = class90.field1779[var6 + 1];
                            byte[] var231 = class203.field4004.method353(var230, 0, -87);
                            class66 var232 = new class66(var231);
                            class90.field1779[var6++] = var232.method186(var228, var229);
                            continue;
                        }
                        if (var309 == 4110) {
                            var7 -= 2;
                            class166 var233 = class174.field3307[var7];
                            class166 var234 = class174.field3307[var7 + 1];
                            var6--;
                            if (class90.field1779[var6] == 1) {
                                class174.field3307[var7++] = var233;
                            } else {
                                class174.field3307[var7++] = var234;
                            }
                            continue;
                        }
                        if (var309 == 4111) {
                            var7--;
                            class166 var235 = class174.field3307[var7];
                            class174.field3307[var7++] = class24.method164(var235);
                            continue;
                        }
                        if (var309 == 4112) {
                            var7--;
                            class166 var236 = class174.field3307[var7];
                            var6--;
                            int var237 = class90.field1779[var6];
                            class174.field3307[var7++] = var236.method1140(var237, (byte) 95);
                            continue;
                        }
                        if (var309 == 4113) {
                            var6--;
                            int var238 = class90.field1779[var6];
                            class90.field1779[var6++] = class156.method1043(var238, 70) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4114) {
                            var6--;
                            int var239 = class90.field1779[var6];
                            class90.field1779[var6++] = class124.method888((byte) 108, var239) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4115) {
                            var6--;
                            int var240 = class90.field1779[var6];
                            class90.field1779[var6++] = class180.method1214(var240, (byte) 78) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4116) {
                            var6--;
                            int var241 = class90.field1779[var6];
                            class90.field1779[var6++] = class76.method633(var241, (byte) 127) ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4117) {
                            var7--;
                            class166 var242 = class174.field3307[var7];
                            if (var242 == null) {
                                class90.field1779[var6++] = 0;
                            } else {
                                class90.field1779[var6++] = var242.method1143(true);
                            }
                            continue;
                        }
                        if (var309 == 4118) {
                            var6 -= 2;
                            var7--;
                            class166 var243 = class174.field3307[var7];
                            int var244 = class90.field1779[var6 + 1];
                            int var245 = class90.field1779[var6];
                            class174.field3307[var7++] = var243.method1121(10876, var244, var245);
                            continue;
                        }
                        if (var309 == 4119) {
                            var7--;
                            class166 var246 = class174.field3307[var7];
                            class166 var247 = class128.method910(true, var246.method1143(true));
                            boolean var248 = false;
                            for (int var249 = 0; var246.method1143(true) > var249; var249++) {
                                int var250 = var246.method1152(-108, var249);
                                if (var250 == 60) {
                                    var248 = true;
                                } else if (var250 == 62) {
                                    var248 = false;
                                } else if (!var248) {
                                    var247.method1128((byte) 108, var250);
                                }
                            }
                            var247.method1117(-74);
                            class174.field3307[var7++] = var247;
                            continue;
                        }
                        if (var309 == 4120) {
                            var7--;
                            class166 var251 = class174.field3307[var7];
                            var6 -= 2;
                            int var252 = class90.field1779[var6];
                            int var253 = class90.field1779[var6 + 1];
                            class90.field1779[var6++] = var251.method1123(var253, -1, var252);
                            continue;
                        }
                        if (var309 == 4121) {
                            var7 -= 2;
                            var6--;
                            int var254 = class90.field1779[var6];
                            class166 var255 = class174.field3307[var7 + 1];
                            class166 var256 = class174.field3307[var7];
                            class90.field1779[var6++] = var256.method1118(17306, var254, var255);
                            continue;
                        }
                    } else if (var309 < 4300) {
                        if (var309 == 4200) {
                            var6--;
                            int var191 = class90.field1779[var6];
                            class174.field3307[var7++] = class3.method19(var191, true).field1122;
                            continue;
                        }
                        if (var309 == 4201) {
                            var6 -= 2;
                            int var192 = class90.field1779[var6];
                            int var193 = class90.field1779[var6 + 1];
                            class57 var194 = class3.method19(var192, true);
                            if (var193 >= 1 && var193 <= 5 && var194.field1123[var193 - 1] != null) {
                                class174.field3307[var7++] = var194.field1123[var193 - 1];
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 4202) {
                            var6 -= 2;
                            int var195 = class90.field1779[var6];
                            int var196 = class90.field1779[var6 + 1];
                            class57 var197 = class3.method19(var195, true);
                            if (var196 >= 1 && var196 <= 5 && var197.field1131[var196 - 1] != null) {
                                class174.field3307[var7++] = var197.field1131[var196 - 1];
                                continue;
                            }
                            class174.field3307[var7++] = class69.field1402;
                            continue;
                        }
                        if (var309 == 4203) {
                            var6--;
                            int var198 = class90.field1779[var6];
                            class90.field1779[var6++] = class3.method19(var198, true).field1127;
                            continue;
                        }
                        if (var309 == 4204) {
                            var6--;
                            int var199 = class90.field1779[var6];
                            class90.field1779[var6++] = class3.method19(var199, true).field1137 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4205) {
                            var6--;
                            int var200 = class90.field1779[var6];
                            class57 var201 = class3.method19(var200, true);
                            if (var201.field1121 == -1 && var201.field1147 >= 0) {
                                class90.field1779[var6++] = var201.field1147;
                                continue;
                            }
                            class90.field1779[var6++] = var200;
                            continue;
                        }
                        if (var309 == 4206) {
                            var6--;
                            int var202 = class90.field1779[var6];
                            class57 var203 = class3.method19(var202, true);
                            if (var203.field1121 >= 0 && var203.field1147 >= 0) {
                                class90.field1779[var6++] = var203.field1147;
                                continue;
                            }
                            class90.field1779[var6++] = var202;
                            continue;
                        }
                        if (var309 == 4207) {
                            var6--;
                            int var204 = class90.field1779[var6];
                            class90.field1779[var6++] = class3.method19(var204, true).field1118 ? 1 : 0;
                            continue;
                        }
                        if (var309 == 4210) {
                            var7--;
                            class166 var205 = class174.field3307[var7];
                            var6--;
                            int var206 = class90.field1779[var6];
                            class112.method815((byte) -92, var205, var206 == 1);
                            class90.field1779[var6++] = class56.field1079;
                            continue;
                        }
                        if (var309 == 4211) {
                            if (class199.field3958 != null && class56.field1079 > class116.field2251) {
                                class90.field1779[var6++] = class22.method151(65535, class199.field3958[class116.field2251++]);
                                continue;
                            }
                            class90.field1779[var6++] = -1;
                            continue;
                        }
                        if (var309 == 4212) {
                            class116.field2251 = 0;
                            continue;
                        }
                    } else if (var309 < 5100) {
                        if (var309 == 5000) {
                            class90.field1779[var6++] = class31.field573;
                            continue;
                        }
                        if (var309 == 5001) {
                            class115.field2237++;
                            var6 -= 3;
                            class31.field573 = class90.field1779[var6];
                            class128.field2513 = class90.field1779[var6 + 1];
                            class115.field2240 = class90.field1779[var6 + 2];
                            class156.field2989.method705(127, (byte) 9);
                            class156.field2989.method429(class31.field573, (byte) 109);
                            class156.field2989.method429(class128.field2513, (byte) 110);
                            class156.field2989.method429(class115.field2240, (byte) 99);
                            continue;
                        }
                        if (var309 == 5002) {
                            class77.field1557++;
                            var7--;
                            class166 var170 = class174.field3307[var7];
                            var6 -= 2;
                            int var171 = class90.field1779[var6];
                            int var172 = class90.field1779[var6 + 1];
                            class156.field2989.method705(66, (byte) 9);
                            class156.field2989.method428(var170.method1133((byte) 30), (byte) 126);
                            class156.field2989.method429(var171 - 1, (byte) 103);
                            class156.field2989.method429(var172, (byte) 98);
                            continue;
                        }
                        if (var309 == 5003) {
                            class166 var173 = null;
                            var6--;
                            int var174 = class90.field1779[var6];
                            if (var174 < 100) {
                                var173 = class114.field2216[var174];
                            }
                            if (var173 == null) {
                                var173 = class69.field1402;
                            }
                            class174.field3307[var7++] = var173;
                            continue;
                        }
                        if (var309 == 5004) {
                            int var175 = -1;
                            var6--;
                            int var176 = class90.field1779[var6];
                            if (var176 < 100 && class114.field2216[var176] != null) {
                                var175 = class128.field2516[var176];
                            }
                            class90.field1779[var6++] = var175;
                            continue;
                        }
                        if (var309 == 5005) {
                            class90.field1779[var6++] = class128.field2513;
                            continue;
                        }
                        if (var309 == 5008) {
                            var7--;
                            class166 var177 = class174.field3307[var7];
                            if (var177.method1142(27575, class35.field667)) {
                                class47.method364(4, var177);
                            } else {
                                class58.field1184++;
                                class166 var178 = var177.method1127((byte) 107);
                                byte var179 = 0;
                                if (var178.method1142(27575, class19.field344)) {
                                    var177 = var177.method1155(class19.field344.method1143(true), (byte) -72);
                                    var179 = 0;
                                } else if (var178.method1142(27575, class18.field314)) {
                                    var179 = 1;
                                    var177 = var177.method1155(class18.field314.method1143(true), (byte) -72);
                                } else if (var178.method1142(27575, class185.field3556)) {
                                    var179 = 2;
                                    var177 = var177.method1155(class185.field3556.method1143(true), (byte) -72);
                                } else if (var178.method1142(27575, class6.field136)) {
                                    var177 = var177.method1155(class6.field136.method1143(true), (byte) -72);
                                    var179 = 3;
                                } else if (var178.method1142(27575, class34.field643)) {
                                    var179 = 4;
                                    var177 = var177.method1155(class34.field643.method1143(true), (byte) -72);
                                } else if (var178.method1142(27575, class12.field230)) {
                                    var177 = var177.method1155(class12.field230.method1143(true), (byte) -72);
                                    var179 = 5;
                                } else if (var178.method1142(27575, class67.field1371)) {
                                    var177 = var177.method1155(class67.field1371.method1143(true), (byte) -72);
                                    var179 = 6;
                                } else if (var178.method1142(27575, class130.field2549)) {
                                    var177 = var177.method1155(class130.field2549.method1143(true), (byte) -72);
                                    var179 = 7;
                                } else if (var178.method1142(27575, class61.field1257)) {
                                    var177 = var177.method1155(class61.field1257.method1143(true), (byte) -72);
                                    var179 = 8;
                                } else if (var178.method1142(27575, class117.field2278)) {
                                    var179 = 9;
                                    var177 = var177.method1155(class117.field2278.method1143(true), (byte) -72);
                                } else if (var178.method1142(27575, class51.field935)) {
                                    var177 = var177.method1155(class51.field935.method1143(true), (byte) -72);
                                    var179 = 10;
                                } else if (var178.method1142(27575, class76.field1553)) {
                                    var177 = var177.method1155(class76.field1553.method1143(true), (byte) -72);
                                    var179 = 11;
                                } else if (class116.field2246 != 0) {
                                    if (var178.method1142(27575, class19.field343)) {
                                        var179 = 0;
                                        var177 = var177.method1155(class19.field343.method1143(true), (byte) -72);
                                    } else if (var178.method1142(27575, class18.field316)) {
                                        var179 = 1;
                                        var177 = var177.method1155(class18.field316.method1143(true), (byte) -72);
                                    } else if (var178.method1142(27575, class185.field3565)) {
                                        var177 = var177.method1155(class185.field3565.method1143(true), (byte) -72);
                                        var179 = 2;
                                    } else if (var178.method1142(27575, class6.field135)) {
                                        var177 = var177.method1155(class6.field135.method1143(true), (byte) -72);
                                        var179 = 3;
                                    } else if (var178.method1142(27575, class34.field653)) {
                                        var177 = var177.method1155(class34.field653.method1143(true), (byte) -72);
                                        var179 = 4;
                                    } else if (var178.method1142(27575, class12.field219)) {
                                        var179 = 5;
                                        var177 = var177.method1155(class12.field219.method1143(true), (byte) -72);
                                    } else if (var178.method1142(27575, class67.field1370)) {
                                        var179 = 6;
                                        var177 = var177.method1155(class67.field1370.method1143(true), (byte) -72);
                                    } else if (var178.method1142(27575, class130.field2542)) {
                                        var179 = 7;
                                        var177 = var177.method1155(class130.field2542.method1143(true), (byte) -72);
                                    } else if (var178.method1142(27575, class61.field1249)) {
                                        var177 = var177.method1155(class61.field1249.method1143(true), (byte) -72);
                                        var179 = 8;
                                    } else if (var178.method1142(27575, class117.field2261)) {
                                        var177 = var177.method1155(class117.field2261.method1143(true), (byte) -72);
                                        var179 = 9;
                                    } else if (var178.method1142(27575, class51.field928)) {
                                        var177 = var177.method1155(class51.field928.method1143(true), (byte) -72);
                                        var179 = 10;
                                    } else if (var178.method1142(27575, class76.field1552)) {
                                        var179 = 11;
                                        var177 = var177.method1155(class76.field1552.method1143(true), (byte) -72);
                                    }
                                }
                                byte var180 = 0;
                                class166 var181 = var177.method1127((byte) 104);
                                if (var181.method1142(27575, class125.field2458)) {
                                    var180 = 1;
                                    var177 = var177.method1155(class125.field2458.method1143(true), (byte) -72);
                                } else if (var181.method1142(27575, class199.field3940)) {
                                    var180 = 2;
                                    var177 = var177.method1155(class199.field3940.method1143(true), (byte) -72);
                                } else if (var181.method1142(27575, class75.field1543)) {
                                    var177 = var177.method1155(class75.field1543.method1143(true), (byte) -72);
                                    var180 = 3;
                                } else if (var181.method1142(27575, class108.field2110)) {
                                    var177 = var177.method1155(class108.field2110.method1143(true), (byte) -72);
                                    var180 = 4;
                                } else if (var181.method1142(27575, class192.field3636)) {
                                    var177 = var177.method1155(class192.field3636.method1143(true), (byte) -72);
                                    var180 = 5;
                                } else if (class116.field2246 != 0) {
                                    if (var181.method1142(27575, class125.field2465)) {
                                        var180 = 1;
                                        var177 = var177.method1155(class125.field2465.method1143(true), (byte) -72);
                                    } else if (var181.method1142(27575, class199.field3953)) {
                                        var180 = 2;
                                        var177 = var177.method1155(class199.field3953.method1143(true), (byte) -72);
                                    } else if (var181.method1142(27575, class75.field1545)) {
                                        var177 = var177.method1155(class75.field1545.method1143(true), (byte) -72);
                                        var180 = 3;
                                    } else if (var181.method1142(27575, class108.field2111)) {
                                        var180 = 4;
                                        var177 = var177.method1155(class108.field2111.method1143(true), (byte) -72);
                                    } else if (var181.method1142(27575, class192.field3647)) {
                                        var180 = 5;
                                        var177 = var177.method1155(class192.field3647.method1143(true), (byte) -72);
                                    }
                                }
                                class156.field2989.method705(91, (byte) 9);
                                class156.field2989.method429(0, (byte) 122);
                                int var182 = class156.field2989.field1000;
                                class156.field2989.method429(var179, (byte) 107);
                                class156.field2989.method429(var180, (byte) 109);
                                class49.method375(var177, 4, class156.field2989);
                                class156.field2989.method408(class156.field2989.field1000 - var182, -1);
                            }
                            continue;
                        }
                        if (var309 == 5009) {
                            class47.field869++;
                            var7 -= 2;
                            class166 var183 = class174.field3307[var7];
                            class166 var184 = class174.field3307[var7 + 1];
                            class156.field2989.method705(238, (byte) 9);
                            class156.field2989.method429(0, (byte) 114);
                            int var185 = class156.field2989.field1000;
                            class156.field2989.method428(var183.method1133((byte) 30), (byte) 92);
                            class49.method375(var184, 4, class156.field2989);
                            class156.field2989.method408(class156.field2989.field1000 - var185, -1);
                            continue;
                        }
                        if (var309 == 5010) {
                            class166 var186 = null;
                            var6--;
                            int var187 = class90.field1779[var6];
                            if (var187 < 100) {
                                var186 = class138.field2694[var187];
                            }
                            if (var186 == null) {
                                var186 = class69.field1402;
                            }
                            class174.field3307[var7++] = var186;
                            continue;
                        }
                        if (var309 == 5011) {
                            var6--;
                            int var188 = class90.field1779[var6];
                            class166 var189 = null;
                            if (var188 < 100) {
                                var189 = class169.field3253[var188];
                            }
                            if (var189 == null) {
                                var189 = class69.field1402;
                            }
                            class174.field3307[var7++] = var189;
                            continue;
                        }
                        if (var309 == 5015) {
                            class166 var190;
                            if (class41.field728 == null || class41.field728.field2412 == null) {
                                var190 = class12.field235;
                            } else {
                                var190 = class41.field728.field2412;
                            }
                            class174.field3307[var7++] = var190;
                            continue;
                        }
                        if (var309 == 5016) {
                            class90.field1779[var6++] = class115.field2240;
                            continue;
                        }
                        if (var309 == 5017) {
                            class90.field1779[var6++] = class56.field1043;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var308) {
            if (var5.field475 == null) {
                if (class102.field2015 != 0) {
                    class150.method1023((byte) -24, 0, class104.field2044, class69.field1402);
                }
                class32.method238((byte) -65, var308, "CS2 - scr:" + var5.field2541 + " op:" + var11);
            } else {
                class166 var305 = class128.method910(true, 30);
                var305.method1151(80, class144.field2806).method1151(-92, var5.field475);
                for (int var306 = class77.field1600 - 1; var306 >= 0; var306--) {
                    var305.method1151(126, class34.field648).method1151(127, class166.field3190[var306].field1869.field475);
                }
                if (var11 == 40) {
                    int var307 = var10[var8];
                    var305.method1151(-70, class82.field1659).method1151(-72, class174.method1192(false, var307));
                }
                if (class102.field2015 != 0) {
                    class150.method1023((byte) 125, 0, class22.method148(new class166[] { class11.field208, var5.field475 }, 0), class69.field1402);
                }
                class32.method238((byte) -65, var308, "CS2 - scr:" + var5.field2541 + " op:" + var11 + new String(var305.method1124(75)));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lcb;BI)V")
    public static final void method508(class22 arg0, byte arg1, int arg2) {
        field1235++;
        if (class2.field2 != null) {
            class2.field2.field1000 = arg2 * 8 + 5;
            int var3 = class2.field2.method419(-4);
            int var4 = class2.field2.method419(-4);
            arg0.method152(255, var4, var3);
            return;
        }
        class139.method951(255, true, true, 0, (byte) 0, null, 255);
        class182.field3453[arg2] = arg0;
        if (arg1 != 57) {
            field1233 = 24;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIII)V")
    public static final void method509(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1236++;
        if (!arg0) {
            return;
        }
        for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
            for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class74.field1538[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class74.field1511[0][var6][var5] = class74.field1511[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class74.field1511[0][var6][var5] = class74.field1511[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class74.field1511[0][var6][var5] = class74.field1511[0][var6][var5 - 1];
                    }
                    if (arg2 + arg3 == var5 && var5 < 103) {
                        class74.field1511[0][var6][var5] = class74.field1511[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method510(int arg0) {
        field1240 = null;
        field1234 = null;
        field1231 = null;
        field1237 = null;
        if (arg0 > -62) {
            method507(104, null, 72);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lf;ILf;)I")
    public static final int method511(class47 arg0, int arg1, class47 arg2) {
        int var3 = 0;
        field1239++;
        if (arg0.method368((byte) 38, class12.field225, class12.field218)) {
            var3++;
        }
        if (arg1 != -5011) {
            field1234 = null;
        }
        if (arg2.method368((byte) -124, class12.field225, class132.field2570)) {
            var3++;
        }
        if (arg2.method368((byte) -125, class12.field225, class178.field3374)) {
            var3++;
        }
        if (arg2.method368((byte) 47, class12.field225, class162.field3090)) {
            var3++;
        }
        if (arg2.method368((byte) -121, class12.field225, class89.field1754)) {
            var3++;
        }
        if (arg2.method368((byte) -2, class12.field225, class19.field336)) {
            var3++;
        }
        arg2.method368((byte) -123, class12.field225, field1234);
        arg2.method368((byte) -125, class12.field225, class63.field1306);
        arg2.method368((byte) -125, class12.field225, class29.field535);
        arg2.method368((byte) -126, class12.field225, class164.field3126);
        arg2.method368((byte) 31, class12.field225, class102.field1971);
        return var3;
    }
}
