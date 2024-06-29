import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
    public boolean field3616 = true;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lec;")
    public static class32 field3625 = class73.method594("Unerwartete Antwort vom Anmelde)2Server)3", true);

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[Lh;")
    public static class49[] field3626 = new class49[1000];

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lec;")
    public static class32 field3627 = class73.method594("blinken2:", true);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[Lec;")
    private static class32[] field3628 = new class32[1000];

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lf;")
    public static class36 field3631 = null;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static volatile int field3615 = 0;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3629 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    public static volatile boolean field3621 = false;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    public static int[] field3622 = new int[500];

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lec;")
    private static class32 field3624 = class73.method594("wave2:", true);

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Lec;")
    public static class32 field3630 = field3624;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lec;")
    private static class32 field3620 = field3624;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lge;")
    public static class47 field3614 = new class47(5000);

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "Lec;")
    public static class32 field3643 = class73.method594("weiss:", true);

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lec;")
    private static class32 field3641 = class73.method594("RuneScape is loading )2 please wait)3)3)3", true);

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Lec;")
    public static class32 field3644 = field3641;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Lec;")
    public static class32 field3642 = class73.method594("(Z", true);

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3640 = 255;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Lea;")
    public static class30 field3636;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "Lea;")
    public static class30 field3637;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static final void method1223(boolean arg0) {
        field3612++;
        if (!arg0) {
            field3615 = -51;
        }
        try {
            if (class98.field2265 == 1) {
                int var1 = class83.field1967.method112(15);
                if (var1 > 0 && class83.field1967.method90(-12)) {
                    int var2 = var1 - class73.field1725;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class83.field1967.method89(-19402, var2);
                } else {
                    class83.field1967.method115(21828);
                    class83.field1967.method91((byte) 115);
                    class159.field3646 = null;
                    if (class34.field719 == null) {
                        class98.field2265 = 0;
                    } else {
                        class98.field2265 = 2;
                    }
                    class129.field2979 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class83.field1967.method115(21828);
            class159.field3646 = null;
            class98.field2265 = 0;
            class129.field2979 = null;
            class34.field719 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbd;B)V")
    public static final void method1224(class12 arg0, byte arg1) {
        field3634++;
        Object[] var2 = arg0.field208;
        int var3 = (Integer) var2[0];
        class143 var4 = class32.method276(true, var3);
        if (var4 == null) {
            return;
        }
        class140.field3235 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = var4.field3267;
        int[] var8 = var4.field3272;
        if (arg1 > -65) {
            return;
        }
        byte var9 = -1;
        int var10 = -1;
        try {
            class39.field929 = new class32[var4.field3266];
            int var11 = 0;
            class3.field47 = new int[var4.field3261];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var15 = (Integer) var2[var13];
                    if (var15 == -2147483647) {
                        var15 = arg0.field204;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field210;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field209 == null ? -1 : arg0.field209.field744;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field205;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field209 == null ? -1 : arg0.field209.field829;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field202 == null ? -1 : arg0.field202.field744;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field202 == null ? -1 : arg0.field202.field829;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field199;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field207;
                    }
                    class3.field47[var11++] = var15;
                } else if (var2[var13] instanceof class32) {
                    class32 var14 = (class32) var2[var13];
                    if (var14.method272(true, class103.field2408)) {
                        var14 = arg0.field203;
                    }
                    class39.field929[var12++] = var14;
                }
            }
            int var16 = 0;
            label1972: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var271 = var7[var10];
                if (var271 < 100) {
                    if (var271 == 0) {
                        class38.field917[var6++] = var8[var10];
                        continue;
                    }
                    if (var271 == 1) {
                        int var17 = var8[var10];
                        class38.field917[var6++] = class27.field504[var17];
                        continue;
                    }
                    if (var271 == 2) {
                        int var18 = var8[var10];
                        var6--;
                        class27.field504[var18] = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 3) {
                        class56.field1306[var5++] = var4.field3270[var10];
                        continue;
                    }
                    if (var271 == 6) {
                        var10 += var8[var10];
                        continue;
                    }
                    if (var271 == 7) {
                        var6 -= 2;
                        if (class38.field917[var6 + 1] != class38.field917[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 8) {
                        var6 -= 2;
                        if (class38.field917[var6 + 1] == class38.field917[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 9) {
                        var6 -= 2;
                        if (class38.field917[var6 + 1] > class38.field917[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 10) {
                        var6 -= 2;
                        if (class38.field917[var6] > class38.field917[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 21) {
                        if (class140.field3235 == 0) {
                            return;
                        }
                        class126 var19 = class56.field1303[--class140.field3235];
                        class39.field929 = var19.field2918;
                        var10 = var19.field2922;
                        var4 = var19.field2923;
                        var7 = var4.field3267;
                        class3.field47 = var19.field2919;
                        var8 = var4.field3272;
                        continue;
                    }
                    if (var271 == 25) {
                        int var20 = var8[var10];
                        class38.field917[var6++] = class70.method578((byte) -98, var20);
                        continue;
                    }
                    if (var271 == 27) {
                        int var21 = var8[var10];
                        var6--;
                        class159.method1229(class38.field917[var6], (byte) -75, var21);
                        continue;
                    }
                    if (var271 == 31) {
                        var6 -= 2;
                        if (class38.field917[var6] <= class38.field917[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 32) {
                        var6 -= 2;
                        if (class38.field917[var6 + 1] <= class38.field917[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var271 == 33) {
                        class38.field917[var6++] = class3.field47[var8[var10]];
                        continue;
                    }
                    int var10001;
                    if (var271 == 34) {
                        var10001 = var8[var10];
                        var6--;
                        class3.field47[var10001] = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 35) {
                        class56.field1306[var5++] = class39.field929[var8[var10]];
                        continue;
                    }
                    if (var271 == 36) {
                        var10001 = var8[var10];
                        var5--;
                        class39.field929[var10001] = class56.field1306[var5];
                        continue;
                    }
                    if (var271 == 37) {
                        int var22 = var8[var10];
                        var5 -= var22;
                        class32 var23 = class84.method656(class56.field1306, var22, var5, (byte) -128);
                        class56.field1306[var5++] = var23;
                        continue;
                    }
                    if (var271 == 38) {
                        var6--;
                        continue;
                    }
                    if (var271 == 39) {
                        var5--;
                        continue;
                    }
                    if (var271 == 40) {
                        int var24 = var8[var10];
                        class143 var25 = class32.method276(true, var24);
                        int[] var26 = new int[var25.field3261];
                        class32[] var27 = new class32[var25.field3266];
                        for (int var28 = 0; var28 < var25.field3269; var28++) {
                            var26[var28] = class38.field917[var6 + var28 - var25.field3269];
                        }
                        for (int var29 = 0; var29 < var25.field3265; var29++) {
                            var27[var29] = class56.field1306[var5 + var29 - var25.field3265];
                        }
                        var5 -= var25.field3265;
                        var6 -= var25.field3269;
                        class126 var30 = new class126();
                        var30.field2922 = var10;
                        var30.field2923 = var4;
                        var10 = -1;
                        var30.field2918 = class39.field929;
                        var4 = var25;
                        var30.field2919 = class3.field47;
                        class56.field1303[class140.field3235++] = var30;
                        class3.field47 = var26;
                        var7 = var25.field3267;
                        class39.field929 = var27;
                        var8 = var25.field3272;
                        continue;
                    }
                    if (var271 == 42) {
                        class38.field917[var6++] = class79.field1832[var8[var10]];
                        continue;
                    }
                    if (var271 == 43) {
                        var10001 = var8[var10];
                        var6--;
                        class79.field1832[var10001] = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 44) {
                        int var31 = var8[var10] >> 16;
                        int var32 = var8[var10] & 0xFFFF;
                        var6--;
                        int var33 = class38.field917[var6];
                        if (var33 >= 0 && var33 <= 5000) {
                            class110.field2583[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label1972;
                                }
                                class91.field2081[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 45) {
                        int var36 = var8[var10];
                        var6--;
                        int var37 = class38.field917[var6];
                        if (var37 >= 0 && var37 < class110.field2583[var36]) {
                            class38.field917[var6++] = class91.field2081[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 46) {
                        int var38 = var8[var10];
                        var6 -= 2;
                        int var39 = class38.field917[var6];
                        if (var39 >= 0 && class110.field2583[var38] > var39) {
                            class91.field2081[var38][var39] = class38.field917[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 47) {
                        class32 var40 = field3628[var8[var10]];
                        if (var40 == null) {
                            var40 = class84.field1971;
                        }
                        class56.field1306[var5++] = var40;
                        continue;
                    }
                    if (var271 == 48) {
                        var10001 = var8[var10];
                        var5--;
                        field3628[var10001] = class56.field1306[var5];
                        continue;
                    }
                }
                boolean var41;
                if (var8[var10] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var271 < 1000) {
                    if (var271 == 100) {
                        var6 -= 3;
                        int var42 = class38.field917[var6];
                        int var43 = class38.field917[var6 + 1];
                        int var44 = class38.field917[var6 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class36 var45 = class128.method993(var42, -104);
                        if (var45.field755 == null) {
                            var45.field755 = new class36[var44 + 1];
                        }
                        if (var44 >= var45.field755.length) {
                            class36[] var46 = new class36[var44 + 1];
                            for (int var47 = 0; var47 < var45.field755.length; var47++) {
                                var46[var47] = var45.field755[var47];
                            }
                            var45.field755 = var46;
                        }
                        if (var44 > 0 && var45.field755[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class36 var48 = new class36();
                        var48.field756 = var43;
                        var48.field849 = true;
                        var48.field829 = var44;
                        var48.field865 = var48.field744 = var45.field744;
                        var45.field755[var44] = var48;
                        if (var41) {
                            class63.field1448 = var48;
                        } else {
                            class157.field3606 = var48;
                        }
                        class132.method1010(var45, (byte) -127);
                        continue;
                    }
                    if (var271 == 101) {
                        class36 var49 = var41 ? class63.field1448 : class157.field3606;
                        class36 var50 = class128.method993(var49.field744, 67);
                        var50.field755[var49.field829] = null;
                        class132.method1010(var50, (byte) -121);
                        continue;
                    }
                    if (var271 == 102) {
                        var6--;
                        class36 var51 = class128.method993(class38.field917[var6], -111);
                        var51.field755 = null;
                        class132.method1010(var51, (byte) -109);
                        continue;
                    }
                    if (var271 == 200) {
                        var6 -= 2;
                        int var52 = class38.field917[var6 + 1];
                        int var53 = class38.field917[var6];
                        class36 var54 = class130.method1002(var52, var53, (byte) -29);
                        if (var54 != null && var52 != -1) {
                            class38.field917[var6++] = 1;
                            if (var41) {
                                class63.field1448 = var54;
                            } else {
                                class157.field3606 = var54;
                            }
                            continue;
                        }
                        class38.field917[var6++] = 0;
                        continue;
                    }
                } else if (var271 >= 1000 && var271 < 1100 || var271 >= 2000 && var271 < 2100) {
                    class36 var264;
                    if (var271 < 2000) {
                        var264 = var41 ? class63.field1448 : class157.field3606;
                    } else {
                        var271 -= 1000;
                        var6--;
                        var264 = class128.method993(class38.field917[var6], -102);
                    }
                    if (var271 == 1000) {
                        var6 -= 2;
                        var264.field830 = class38.field917[var6];
                        var264.field856 = class38.field917[var6 + 1];
                        class132.method1010(var264, (byte) -121);
                        continue;
                    }
                    if (var271 == 1001) {
                        var6 -= 2;
                        var264.field811 = class38.field917[var6];
                        var264.field774 = class38.field917[var6 + 1];
                        class132.method1010(var264, (byte) -103);
                        continue;
                    }
                    if (var271 == 1003) {
                        var6--;
                        boolean var265 = class38.field917[var6] == 1;
                        if (var264.field741 != var265) {
                            var264.field741 = var265;
                            class132.method1010(var264, (byte) -112);
                        }
                        continue;
                    }
                } else if (var271 >= 1100 && var271 < 1200 || !(var271 < 2100 || var271 >= 2200)) {
                    class36 var55;
                    if (var271 >= 2000) {
                        var271 -= 1000;
                        var6--;
                        var55 = class128.method993(class38.field917[var6], -126);
                    } else {
                        var55 = var41 ? class63.field1448 : class157.field3606;
                    }
                    if (var271 == 1100) {
                        var6 -= 2;
                        var55.field844 = class38.field917[var6];
                        if (var55.field861 - var55.field811 < var55.field844) {
                            var55.field844 = var55.field861 - var55.field811;
                        }
                        if (var55.field844 < 0) {
                            var55.field844 = 0;
                        }
                        var55.field873 = class38.field917[var6 + 1];
                        if (var55.field873 > var55.field821 - var55.field774) {
                            var55.field873 = var55.field821 - var55.field774;
                        }
                        if (var55.field873 < 0) {
                            var55.field873 = 0;
                        }
                        class132.method1010(var55, (byte) -111);
                        continue;
                    }
                    if (var271 == 1101) {
                        var6--;
                        var55.field777 = class38.field917[var6];
                        class132.method1010(var55, (byte) -123);
                        continue;
                    }
                    if (var271 == 1102) {
                        var6--;
                        var55.field804 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -125);
                        continue;
                    }
                    if (var271 == 1103) {
                        var6--;
                        var55.field862 = class38.field917[var6];
                        class132.method1010(var55, (byte) -107);
                        continue;
                    }
                    if (var271 == 1104) {
                        var6--;
                        var55.field789 = class38.field917[var6];
                        class132.method1010(var55, (byte) -116);
                        continue;
                    }
                    if (var271 == 1105) {
                        var6--;
                        var55.field820 = class38.field917[var6];
                        class132.method1010(var55, (byte) -120);
                        continue;
                    }
                    if (var271 == 1106) {
                        var6--;
                        var55.field778 = class38.field917[var6];
                        class132.method1010(var55, (byte) -107);
                        continue;
                    }
                    if (var271 == 1107) {
                        var6--;
                        var55.field749 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -127);
                        continue;
                    }
                    if (var271 == 1108) {
                        var55.field771 = 1;
                        var6--;
                        var55.field850 = class38.field917[var6];
                        class132.method1010(var55, (byte) -100);
                        continue;
                    }
                    if (var271 == 1109) {
                        var6 -= 6;
                        var55.field817 = class38.field917[var6];
                        var55.field852 = class38.field917[var6 + 1];
                        var55.field813 = class38.field917[var6 + 2];
                        var55.field875 = class38.field917[var6 + 3];
                        var55.field751 = class38.field917[var6 + 4];
                        var55.field809 = class38.field917[var6 + 5];
                        class132.method1010(var55, (byte) -126);
                        continue;
                    }
                    if (var271 == 1110) {
                        var6--;
                        int var56 = class38.field917[var6];
                        if (var55.field766 != var56) {
                            var55.field840 = 0;
                            var55.field763 = 0;
                            var55.field766 = var56;
                            class132.method1010(var55, (byte) -120);
                        }
                        continue;
                    }
                    if (var271 == 1111) {
                        var6--;
                        var55.field854 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -101);
                        continue;
                    }
                    if (var271 == 1112) {
                        var5--;
                        class32 var57 = class56.field1306[var5];
                        if (!var57.method272(true, var55.field764)) {
                            var55.field764 = var57;
                            class132.method1010(var55, (byte) -128);
                        }
                        continue;
                    }
                    if (var271 == 1113) {
                        var6--;
                        var55.field808 = class38.field917[var6];
                        class132.method1010(var55, (byte) -109);
                        continue;
                    }
                    if (var271 == 1114) {
                        var6 -= 3;
                        var55.field842 = class38.field917[var6];
                        var55.field800 = class38.field917[var6 + 1];
                        var55.field839 = class38.field917[var6 + 2];
                        class132.method1010(var55, (byte) -104);
                        continue;
                    }
                    if (var271 == 1115) {
                        var6--;
                        var55.field857 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -107);
                        continue;
                    }
                    if (var271 == 1116) {
                        var6--;
                        var55.field797 = class38.field917[var6];
                        class132.method1010(var55, (byte) -111);
                        continue;
                    }
                    if (var271 == 1117) {
                        var6--;
                        var55.field818 = class38.field917[var6];
                        class132.method1010(var55, (byte) -123);
                        continue;
                    }
                    if (var271 == 1118) {
                        var6--;
                        var55.field815 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -127);
                        continue;
                    }
                    if (var271 == 1119) {
                        var6--;
                        var55.field773 = class38.field917[var6] == 1;
                        class132.method1010(var55, (byte) -118);
                        continue;
                    }
                    if (var271 == 1120) {
                        var6 -= 2;
                        var55.field861 = class38.field917[var6];
                        var55.field821 = class38.field917[var6 + 1];
                        class132.method1010(var55, (byte) -119);
                        continue;
                    }
                } else if (var271 >= 1200 && var271 < 1300 || !(var271 < 2200 || var271 >= 2300)) {
                    class36 var58;
                    if (var271 < 2000) {
                        var58 = var41 ? class63.field1448 : class157.field3606;
                    } else {
                        var271 -= 1000;
                        var6--;
                        var58 = class128.method993(class38.field917[var6], -127);
                    }
                    class132.method1010(var58, (byte) -109);
                    if (var271 == 1200) {
                        var6 -= 2;
                        int var59 = class38.field917[var6];
                        int var60 = class38.field917[var6 + 1];
                        var58.field787 = var60;
                        var58.field805 = var59;
                        class62 var61 = class146.method1094(var59, 28);
                        var58.field875 = var61.field1417;
                        var58.field813 = var61.field1427;
                        var58.field809 = var61.field1392;
                        var58.field852 = var61.field1377;
                        var58.field751 = var61.field1375;
                        if (var58.field811 > 0) {
                            var58.field809 = var58.field809 * 32 / var58.field811;
                        }
                        var58.field817 = var61.field1385;
                        continue;
                    }
                    if (var271 == 1201) {
                        var58.field771 = 2;
                        var6--;
                        var58.field850 = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 1202) {
                        var58.field771 = 3;
                        var58.field850 = class20.field373.field1632.method234(-127);
                        continue;
                    }
                } else if (var271 >= 1300 && var271 < 1400 || var271 >= 2300 && var271 < 2400) {
                    class36 var260;
                    if (var271 >= 2000) {
                        var6--;
                        var260 = class128.method993(class38.field917[var6], 87);
                        var271 -= 1000;
                    } else {
                        var260 = var41 ? class63.field1448 : class157.field3606;
                    }
                    if (var271 == 1300) {
                        var6--;
                        int var261 = class38.field917[var6] - 1;
                        if (var261 >= 0 && var261 <= 9) {
                            var5--;
                            var260.method302(class56.field1306[var5], true, var261);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var271 == 1301) {
                        var6 -= 2;
                        int var262 = class38.field917[var6 + 1];
                        int var263 = class38.field917[var6];
                        var260.field825 = class130.method1002(var262, var263, (byte) -29);
                        continue;
                    }
                    if (var271 == 1302) {
                        var6--;
                        var260.field863 = class38.field917[var6] == 1;
                        continue;
                    }
                    if (var271 == 1303) {
                        var6--;
                        var260.field761 = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 1304) {
                        var6--;
                        var260.field747 = class38.field917[var6];
                        continue;
                    }
                    if (var271 == 1305) {
                        var5--;
                        var260.field814 = class56.field1306[var5];
                        continue;
                    }
                    if (var271 == 1306) {
                        var5--;
                        var260.field826 = class56.field1306[var5];
                        continue;
                    }
                    if (var271 == 1307) {
                        var260.field739 = null;
                        continue;
                    }
                } else {
                    if (var271 >= 1400 && var271 < 1500 || var271 >= 2400 && var271 < 2500) {
                        class36 var62;
                        if (var271 < 2000) {
                            var62 = var41 ? class63.field1448 : class157.field3606;
                        } else {
                            var6--;
                            var62 = class128.method993(class38.field917[var6], -112);
                            var271 -= 1000;
                        }
                        var5--;
                        class32 var63 = class56.field1306[var5];
                        int[] var64 = null;
                        if (var63.method240((byte) 83) > 0 && var63.method260(-127, var63.method240((byte) 67) - 1) == 89) {
                            var6--;
                            int var65 = class38.field917[var6];
                            if (var65 > 0) {
                                var64 = new int[var65];
                                while (var65-- > 0) {
                                    var6--;
                                    var64[var65] = class38.field917[var6];
                                }
                            }
                            var63 = var63.method241((byte) 16, 0, var63.method240((byte) 79) - 1);
                        }
                        Object[] var66 = new Object[var63.method240((byte) 71) + 1];
                        for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                            if (var63.method260(8, var67 - 1) == 115) {
                                var5--;
                                var66[var67] = class56.field1306[var5];
                            } else {
                                var6--;
                                var66[var67] = Integer.valueOf(class38.field917[var6]);
                            }
                        }
                        var6--;
                        int var68 = class38.field917[var6];
                        if (var68 == -1) {
                            var66 = null;
                        } else {
                            var66[0] = Integer.valueOf(var68);
                        }
                        if (var271 == 1405) {
                            var62.field853 = var66;
                        }
                        if (var271 == 1412) {
                            var62.field837 = var66;
                        }
                        if (var271 == 1400) {
                            var62.field866 = var66;
                        }
                        if (var271 == 1406) {
                            var62.field803 = var66;
                        }
                        if (var271 == 1404) {
                            var62.field776 = var66;
                        }
                        if (var271 == 1415) {
                            var62.field772 = var66;
                            var62.field876 = var64;
                        }
                        if (var271 == 1421) {
                            var62.field794 = var66;
                        }
                        if (var271 == 1418) {
                            var62.field783 = var66;
                        }
                        if (var271 == 1402) {
                            var62.field836 = var66;
                        }
                        if (var271 == 1401) {
                            var62.field780 = var66;
                        }
                        if (var271 == 1424) {
                            var62.field796 = var66;
                        }
                        if (var271 == 1414) {
                            var62.field748 = var64;
                            var62.field752 = var66;
                        }
                        var62.field848 = true;
                        if (var271 == 1409) {
                            var62.field795 = var66;
                        }
                        if (var271 == 1420) {
                            var62.field781 = var66;
                        }
                        if (var271 == 1407) {
                            var62.field822 = var64;
                            var62.field801 = var66;
                        }
                        if (var271 == 1422) {
                            var62.field823 = var66;
                        }
                        if (var271 == 1419) {
                            var62.field742 = var66;
                        }
                        if (var271 == 1416) {
                            var62.field838 = var66;
                        }
                        if (var271 == 1423) {
                            var62.field759 = var66;
                        }
                        if (var271 == 1417) {
                            var62.field867 = var66;
                        }
                        if (var271 == 1403) {
                            var62.field851 = var66;
                        }
                        if (var271 == 1411) {
                            var62.field847 = var66;
                        }
                        if (var271 == 1410) {
                            var62.field872 = var66;
                        }
                        if (var271 == 1408) {
                            var62.field767 = var66;
                        }
                        continue;
                    }
                    if (var271 < 1600) {
                        class36 var259 = var41 ? class63.field1448 : class157.field3606;
                        if (var271 == 1500) {
                            class38.field917[var6++] = var259.field830;
                            continue;
                        }
                        if (var271 == 1501) {
                            class38.field917[var6++] = var259.field856;
                            continue;
                        }
                        if (var271 == 1502) {
                            class38.field917[var6++] = var259.field811;
                            continue;
                        }
                        if (var271 == 1503) {
                            class38.field917[var6++] = var259.field774;
                            continue;
                        }
                        if (var271 == 1504) {
                            class38.field917[var6++] = var259.field741 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 1505) {
                            class38.field917[var6++] = var259.field865;
                            continue;
                        }
                    } else if (var271 < 1700) {
                        class36 var69 = var41 ? class63.field1448 : class157.field3606;
                        if (var271 == 1600) {
                            class38.field917[var6++] = var69.field844;
                            continue;
                        }
                        if (var271 == 1601) {
                            class38.field917[var6++] = var69.field873;
                            continue;
                        }
                        if (var271 == 1602) {
                            class56.field1306[var5++] = var69.field764;
                            continue;
                        }
                        if (var271 == 1603) {
                            class38.field917[var6++] = var69.field861;
                            continue;
                        }
                        if (var271 == 1604) {
                            class38.field917[var6++] = var69.field821;
                            continue;
                        }
                        if (var271 == 1605) {
                            class38.field917[var6++] = var69.field809;
                            continue;
                        }
                        if (var271 == 1606) {
                            class38.field917[var6++] = var69.field813;
                            continue;
                        }
                        if (var271 == 1607) {
                            class38.field917[var6++] = var69.field751;
                            continue;
                        }
                        if (var271 == 1608) {
                            class38.field917[var6++] = var69.field875;
                            continue;
                        }
                    } else if (var271 < 1800) {
                        class36 var70 = var41 ? class63.field1448 : class157.field3606;
                        if (var271 == 1700) {
                            class38.field917[var6++] = var70.field805;
                            continue;
                        }
                        if (var271 == 1701) {
                            if (var70.field805 == -1) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = var70.field787;
                            }
                            continue;
                        }
                        if (var271 == 1702) {
                            class38.field917[var6++] = var70.field829;
                            continue;
                        }
                    } else if (var271 < 1900) {
                        class36 var257 = var41 ? class63.field1448 : class157.field3606;
                        if (var271 == 1800) {
                            class38.field917[var6++] = class98.method770(true, class147.method1102(-108, var257));
                            continue;
                        }
                        if (var271 == 1801) {
                            var6--;
                            int var258 = class38.field917[var6];
                            int var273 = var258 - 1;
                            if (var257.field739 != null && var257.field739.length > var273 && var257.field739[var273] != null) {
                                class56.field1306[var5++] = var257.field739[var273];
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 1802) {
                            if (var257.field814 == null) {
                                class56.field1306[var5++] = class159.field3654;
                            } else {
                                class56.field1306[var5++] = var257.field814;
                            }
                            continue;
                        }
                    } else if (var271 < 2600) {
                        var6--;
                        class36 var71 = class128.method993(class38.field917[var6], 31);
                        if (var271 == 2500) {
                            class38.field917[var6++] = var71.field830;
                            continue;
                        }
                        if (var271 == 2501) {
                            class38.field917[var6++] = var71.field856;
                            continue;
                        }
                        if (var271 == 2502) {
                            class38.field917[var6++] = var71.field811;
                            continue;
                        }
                        if (var271 == 2503) {
                            class38.field917[var6++] = var71.field774;
                            continue;
                        }
                        if (var271 == 2504) {
                            class38.field917[var6++] = var71.field741 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 2505) {
                            class38.field917[var6++] = var71.field865;
                            continue;
                        }
                    } else if (var271 < 2700) {
                        var6--;
                        class36 var256 = class128.method993(class38.field917[var6], 40);
                        if (var271 == 2600) {
                            class38.field917[var6++] = var256.field844;
                            continue;
                        }
                        if (var271 == 2601) {
                            class38.field917[var6++] = var256.field873;
                            continue;
                        }
                        if (var271 == 2602) {
                            class56.field1306[var5++] = var256.field764;
                            continue;
                        }
                        if (var271 == 2603) {
                            class38.field917[var6++] = var256.field861;
                            continue;
                        }
                        if (var271 == 2604) {
                            class38.field917[var6++] = var256.field821;
                            continue;
                        }
                        if (var271 == 2605) {
                            class38.field917[var6++] = var256.field809;
                            continue;
                        }
                        if (var271 == 2606) {
                            class38.field917[var6++] = var256.field813;
                            continue;
                        }
                        if (var271 == 2607) {
                            class38.field917[var6++] = var256.field751;
                            continue;
                        }
                        if (var271 == 2608) {
                            class38.field917[var6++] = var256.field875;
                            continue;
                        }
                    } else if (var271 < 2800) {
                        if (var271 == 2700) {
                            var6--;
                            class36 var72 = class128.method993(class38.field917[var6], 33);
                            class38.field917[var6++] = var72.field805;
                            continue;
                        }
                        if (var271 == 2701) {
                            var6--;
                            class36 var73 = class128.method993(class38.field917[var6], 103);
                            if (var73.field805 == -1) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = var73.field787;
                            }
                            continue;
                        }
                        if (var271 == 2702) {
                            var6--;
                            int var74 = class38.field917[var6];
                            class144 var75 = (class144) class109.field2573.method1198((long) var74, (byte) -106);
                            if (var75 == null) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = 1;
                            }
                            continue;
                        }
                    } else if (var271 < 2900) {
                        var6--;
                        class36 var76 = class128.method993(class38.field917[var6], 47);
                        if (var271 == 2800) {
                            class38.field917[var6++] = class98.method770(true, class147.method1102(-113, var76));
                            continue;
                        }
                        if (var271 == 2801) {
                            var6--;
                            int var77 = class38.field917[var6];
                            int var272 = var77 - 1;
                            if (var76.field739 != null && var76.field739.length > var272 && var76.field739[var272] != null) {
                                class56.field1306[var5++] = var76.field739[var272];
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 2802) {
                            if (var76.field814 == null) {
                                class56.field1306[var5++] = class159.field3654;
                            } else {
                                class56.field1306[var5++] = var76.field814;
                            }
                            continue;
                        }
                    } else if (var271 < 3200) {
                        if (var271 == 3100) {
                            var5--;
                            class32 var242 = class56.field1306[var5];
                            class79.method629((byte) 98, var242, 0, class159.field3654);
                            continue;
                        }
                        if (var271 == 3101) {
                            var6 -= 2;
                            class134.method1025((byte) 124, class38.field917[var6 + 1], class20.field373, class38.field917[var6]);
                            continue;
                        }
                        if (var271 == 3103) {
                            class110.method873(-4);
                            continue;
                        }
                        if (var271 == 3104) {
                            class12.field197++;
                            var5--;
                            class32 var243 = class56.field1306[var5];
                            int var244 = 0;
                            if (var243.method274((byte) -36)) {
                                var244 = var243.method261(19);
                            }
                            class44.field1027.method357(216, -96);
                            class44.field1027.method531(false, var244);
                            continue;
                        }
                        if (var271 == 3105) {
                            client.field381++;
                            var5--;
                            class32 var245 = class56.field1306[var5];
                            class44.field1027.method357(36, -112);
                            class44.field1027.method542(var245.method259(0), (byte) 56);
                            continue;
                        }
                        if (var271 == 3106) {
                            class2.field19++;
                            var5--;
                            class32 var246 = class56.field1306[var5];
                            class44.field1027.method357(86, -98);
                            class44.field1027.method515((byte) 95, var246.method240((byte) 16) + 1);
                            class44.field1027.method522(var246, (byte) 124);
                            continue;
                        }
                        if (var271 == 3107) {
                            var6--;
                            int var247 = class38.field917[var6];
                            var5--;
                            class32 var248 = class56.field1306[var5];
                            class149.method1110(var247, 81, var248);
                            continue;
                        }
                        if (var271 == 3108) {
                            var6 -= 3;
                            int var249 = class38.field917[var6];
                            int var250 = class38.field917[var6 + 1];
                            int var251 = class38.field917[var6 + 2];
                            class36 var252 = class128.method993(var251, -104);
                            class17.method127((byte) 37, var252, var250, var249);
                            continue;
                        }
                        if (var271 == 3109) {
                            var6 -= 2;
                            int var253 = class38.field917[var6];
                            int var254 = class38.field917[var6 + 1];
                            class36 var255 = var41 ? class63.field1448 : class157.field3606;
                            class17.method127((byte) 118, var255, var254, var253);
                            continue;
                        }
                    } else if (var271 < 3300) {
                        if (var271 == 3200) {
                            var6 -= 3;
                            class4.method17(class38.field917[var6], (byte) -112, class38.field917[var6 + 2], class38.field917[var6 + 1]);
                            continue;
                        }
                        if (var271 == 3201) {
                            var6--;
                            class102.method827(class38.field917[var6], -10897);
                            continue;
                        }
                        if (var271 == 3202) {
                            var6 -= 2;
                            class38.method316(-127, class38.field917[var6], class38.field917[var6 + 1]);
                            continue;
                        }
                    } else if (var271 < 3400) {
                        if (var271 == 3300) {
                            class38.field917[var6++] = class140.field3219;
                            continue;
                        }
                        if (var271 == 3301) {
                            var6 -= 2;
                            int var78 = class38.field917[var6];
                            int var79 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class73.method598(0, var79, var78);
                            continue;
                        }
                        if (var271 == 3302) {
                            var6 -= 2;
                            int var80 = class38.field917[var6];
                            int var81 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class52.method407(-52, var80, var81);
                            continue;
                        }
                        if (var271 == 3303) {
                            var6 -= 2;
                            int var82 = class38.field917[var6 + 1];
                            int var83 = class38.field917[var6];
                            class38.field917[var6++] = class29.method196(var83, var82, true);
                            continue;
                        }
                        if (var271 == 3304) {
                            var6--;
                            int var84 = class38.field917[var6];
                            class38.field917[var6++] = class91.method726(var84, 17093).field3209;
                            continue;
                        }
                        if (var271 == 3305) {
                            var6--;
                            int var85 = class38.field917[var6];
                            class38.field917[var6++] = class137.field3175[var85];
                            continue;
                        }
                        if (var271 == 3306) {
                            var6--;
                            int var86 = class38.field917[var6];
                            class38.field917[var6++] = class50.field1160[var86];
                            continue;
                        }
                        if (var271 == 3307) {
                            var6--;
                            int var87 = class38.field917[var6];
                            class38.field917[var6++] = class17.field343[var87];
                            continue;
                        }
                        if (var271 == 3308) {
                            int var88 = class43.field990;
                            int var89 = (class20.field373.field2749 >> 7) + class72.field1701;
                            int var90 = (class20.field373.field2700 >> 7) + class118.field2838;
                            class38.field917[var6++] = (var88 << 28) + (var89 << 14) + var90;
                            continue;
                        }
                        if (var271 == 3309) {
                            var6--;
                            int var91 = class38.field917[var6];
                            class38.field917[var6++] = class41.method326(16383, var91 >> 14);
                            continue;
                        }
                        if (var271 == 3310) {
                            var6--;
                            int var92 = class38.field917[var6];
                            class38.field917[var6++] = var92 >> 28;
                            continue;
                        }
                        if (var271 == 3311) {
                            var6--;
                            int var93 = class38.field917[var6];
                            class38.field917[var6++] = class41.method326(16383, var93);
                            continue;
                        }
                        if (var271 == 3312) {
                            class38.field917[var6++] = class146.field3317 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 3313) {
                            var6 -= 2;
                            int var94 = class38.field917[var6] + 32768;
                            int var95 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class73.method598(0, var95, var94);
                            continue;
                        }
                        if (var271 == 3314) {
                            var6 -= 2;
                            int var96 = class38.field917[var6] + 32768;
                            int var97 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class52.method407(-23, var96, var97);
                            continue;
                        }
                        if (var271 == 3315) {
                            var6 -= 2;
                            int var98 = class38.field917[var6] + 32768;
                            int var99 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class29.method196(var98, var99, true);
                            continue;
                        }
                        if (var271 == 3316) {
                            if (class145.field3303 >= 2) {
                                class38.field917[var6++] = class145.field3303;
                            } else {
                                class38.field917[var6++] = 0;
                            }
                            continue;
                        }
                        if (var271 == 3317) {
                            class38.field917[var6++] = class56.field1295;
                            continue;
                        }
                        if (var271 == 3318) {
                            class38.field917[var6++] = class86.field2015;
                            continue;
                        }
                        if (var271 == 3321) {
                            class38.field917[var6++] = class136.field3155;
                            continue;
                        }
                        if (var271 == 3322) {
                            class38.field917[var6++] = class3.field49;
                            continue;
                        }
                        if (var271 == 3323) {
                            if (class145.field3303 == 1) {
                                class38.field917[var6++] = 1;
                            } else {
                                class38.field917[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var271 < 3500) {
                        if (var271 == 3400) {
                            var6 -= 2;
                            int var100 = class38.field917[var6];
                            int var101 = class38.field917[var6 + 1];
                            class130 var102 = class119.method940(var100, (byte) -90);
                            for (int var103 = 0; var103 < var102.field2993; var103++) {
                                if (var102.field2987[var103] == var101) {
                                    class56.field1306[var5++] = var102.field2991[var103];
                                    var102 = null;
                                    break;
                                }
                            }
                            if (var102 != null) {
                                class56.field1306[var5++] = var102.field2986;
                            }
                            continue;
                        }
                        if (var271 == 3408) {
                            var6 -= 4;
                            int var104 = class38.field917[var6 + 1];
                            int var105 = class38.field917[var6];
                            int var106 = class38.field917[var6 + 2];
                            int var107 = class38.field917[var6 + 3];
                            class130 var108 = class119.method940(var106, (byte) -108);
                            if (var108.field3007 == var105 && var108.field3004 == var104) {
                                for (int var109 = 0; var109 < var108.field2993; var109++) {
                                    if (var108.field2987[var109] == var107) {
                                        if (var104 == 115) {
                                            class56.field1306[var5++] = var108.field2991[var109];
                                        } else {
                                            class38.field917[var6++] = var108.field2990[var109];
                                        }
                                        var108 = null;
                                        break;
                                    }
                                }
                                if (var108 != null) {
                                    if (var104 == 115) {
                                        class56.field1306[var5++] = var108.field2986;
                                    } else {
                                        class38.field917[var6++] = var108.field2998;
                                    }
                                }
                                continue;
                            }
                            if (var104 == 115) {
                                class56.field1306[var5++] = class84.field1971;
                            } else {
                                class38.field917[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var271 < 3700) {
                        if (var271 == 3600) {
                            if (class61.field1357 == 0) {
                                class38.field917[var6++] = -2;
                            } else if (class61.field1357 == 1) {
                                class38.field917[var6++] = -1;
                            } else {
                                class38.field917[var6++] = class2.field20;
                            }
                            continue;
                        }
                        if (var271 == 3601) {
                            var6--;
                            int var224 = class38.field917[var6];
                            if (class61.field1357 == 2 && class2.field20 > var224) {
                                class56.field1306[var5++] = class14.field239[var224];
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 3602) {
                            var6--;
                            int var225 = class38.field917[var6];
                            if (class61.field1357 == 2 && class2.field20 > var225) {
                                class38.field917[var6++] = class91.field2096[var225];
                                continue;
                            }
                            class38.field917[var6++] = 0;
                            continue;
                        }
                        if (var271 == 3603) {
                            var6--;
                            int var226 = class38.field917[var6];
                            if (class61.field1357 == 2 && class2.field20 > var226) {
                                class38.field917[var6++] = class5.field103[var226];
                                continue;
                            }
                            class38.field917[var6++] = 0;
                            continue;
                        }
                        if (var271 == 3604) {
                            var5--;
                            class32 var227 = class56.field1306[var5];
                            var6--;
                            int var228 = class38.field917[var6];
                            class94.method746(var228, var227, (byte) 87);
                            continue;
                        }
                        if (var271 == 3605) {
                            var5--;
                            class32 var229 = class56.field1306[var5];
                            class91.method721(119, var229.method259(0));
                            continue;
                        }
                        if (var271 == 3606) {
                            var5--;
                            class32 var230 = class56.field1306[var5];
                            class36.method306(var230.method259(0), 1);
                            continue;
                        }
                        if (var271 == 3607) {
                            var5--;
                            class32 var231 = class56.field1306[var5];
                            class23.method164(31, var231.method259(0));
                            continue;
                        }
                        if (var271 == 3608) {
                            var5--;
                            class32 var232 = class56.field1306[var5];
                            class27.method189(121, var232.method259(0));
                            continue;
                        }
                        if (var271 == 3609) {
                            var5--;
                            class32 var233 = class56.field1306[var5];
                            if (var233.method262(class50.field1153, true) || var233.method262(class75.field1769, true)) {
                                var233 = var233.method268((byte) -50, 7);
                            }
                            class38.field917[var6++] = class117.method924(-116, var233) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 3611) {
                            if (class131.field3012 == null) {
                                class56.field1306[var5++] = class159.field3654;
                            } else {
                                class56.field1306[var5++] = class131.field3012.method264((byte) 52);
                            }
                            continue;
                        }
                        if (var271 == 3612) {
                            if (class131.field3012 == null) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = field3638;
                            }
                            continue;
                        }
                        if (var271 == 3613) {
                            var6--;
                            int var234 = class38.field917[var6];
                            if (class131.field3012 != null && var234 < field3638) {
                                class56.field1306[var5++] = class111.field2611[var234].field886.method264((byte) 52);
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 3614) {
                            var6--;
                            int var235 = class38.field917[var6];
                            if (class131.field3012 != null && var235 < field3638) {
                                class38.field917[var6++] = class111.field2611[var235].field888;
                                continue;
                            }
                            class38.field917[var6++] = 0;
                            continue;
                        }
                        if (var271 == 3615) {
                            var6--;
                            int var236 = class38.field917[var6];
                            if (class131.field3012 != null && var236 < field3638) {
                                class38.field917[var6++] = class111.field2611[var236].field881;
                                continue;
                            }
                            class38.field917[var6++] = 0;
                            continue;
                        }
                        if (var271 == 3616) {
                            class38.field917[var6++] = class102.field2391;
                            continue;
                        }
                        if (var271 == 3617) {
                            var5--;
                            class32 var237 = class56.field1306[var5];
                            class91.method727(var237, (byte) -123);
                            continue;
                        }
                        if (var271 == 3618) {
                            class38.field917[var6++] = class149.field3385;
                            continue;
                        }
                        if (var271 == 3619) {
                            var5--;
                            class32 var238 = class56.field1306[var5];
                            class149.method1114(var238.method259(0), -7645);
                            continue;
                        }
                        if (var271 == 3620) {
                            class115.method905(0);
                            continue;
                        }
                        if (var271 == 3621) {
                            if (class61.field1357 == 0) {
                                class38.field917[var6++] = -1;
                            } else {
                                class38.field917[var6++] = class106.field2506;
                            }
                            continue;
                        }
                        if (var271 == 3622) {
                            var6--;
                            int var239 = class38.field917[var6];
                            if (class61.field1357 != 0 && var239 < class106.field2506) {
                                class56.field1306[var5++] = class9.method59(class103.field2409[var239], 1).method264((byte) 52);
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 3623) {
                            var5--;
                            class32 var240 = class56.field1306[var5];
                            if (var240.method262(class50.field1153, true) || var240.method262(class75.field1769, true)) {
                                var240 = var240.method268((byte) -111, 7);
                            }
                            class38.field917[var6++] = class111.method878((byte) -108, var240) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 3624) {
                            var6--;
                            int var241 = class38.field917[var6];
                            if (class111.field2611 != null && field3638 > var241 && class111.field2611[var241].field886.method271((byte) 102, class20.field373.field1660)) {
                                class38.field917[var6++] = 1;
                                continue;
                            }
                            class38.field917[var6++] = 0;
                            continue;
                        }
                        if (var271 == 3625) {
                            if (class126.field2926 == null) {
                                class56.field1306[var5++] = class159.field3654;
                            } else {
                                class56.field1306[var5++] = class126.field2926.method264((byte) 52);
                            }
                            continue;
                        }
                    } else if (var271 < 4100) {
                        if (var271 == 4000) {
                            var6 -= 2;
                            int var110 = class38.field917[var6 + 1];
                            int var111 = class38.field917[var6];
                            class38.field917[var6++] = var111 + var110;
                            continue;
                        }
                        if (var271 == 4001) {
                            var6 -= 2;
                            int var112 = class38.field917[var6];
                            int var113 = class38.field917[var6 + 1];
                            class38.field917[var6++] = var112 - var113;
                            continue;
                        }
                        if (var271 == 4002) {
                            var6 -= 2;
                            int var114 = class38.field917[var6 + 1];
                            int var115 = class38.field917[var6];
                            class38.field917[var6++] = var114 * var115;
                            continue;
                        }
                        if (var271 == 4003) {
                            var6 -= 2;
                            int var116 = class38.field917[var6];
                            int var117 = class38.field917[var6 + 1];
                            class38.field917[var6++] = var116 / var117;
                            continue;
                        }
                        if (var271 == 4004) {
                            var6--;
                            int var118 = class38.field917[var6];
                            class38.field917[var6++] = (int) (Math.random() * (double) var118);
                            continue;
                        }
                        if (var271 == 4005) {
                            var6--;
                            int var119 = class38.field917[var6];
                            class38.field917[var6++] = (int) ((double) (var119 + 1) * Math.random());
                            continue;
                        }
                        if (var271 == 4006) {
                            var6 -= 5;
                            int var120 = class38.field917[var6];
                            int var121 = class38.field917[var6 + 1];
                            int var122 = class38.field917[var6 + 2];
                            int var123 = class38.field917[var6 + 4];
                            int var124 = class38.field917[var6 + 3];
                            class38.field917[var6++] = (var121 - var120) * (-var122 + var123) / (var124 - var122) + var120;
                            continue;
                        }
                        if (var271 == 4007) {
                            var6 -= 2;
                            int var125 = class38.field917[var6];
                            int var126 = class38.field917[var6 + 1];
                            class38.field917[var6++] = var125 * var126 / 100 + var125;
                            continue;
                        }
                        if (var271 == 4008) {
                            var6 -= 2;
                            int var127 = class38.field917[var6];
                            int var128 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class107.method864(0x1 << var128, var127);
                            continue;
                        }
                        if (var271 == 4009) {
                            var6 -= 2;
                            int var129 = class38.field917[var6];
                            int var130 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class41.method326(var129, -(0x1 << var130) - 1);
                            continue;
                        }
                        if (var271 == 4010) {
                            var6 -= 2;
                            int var131 = class38.field917[var6 + 1];
                            int var132 = class38.field917[var6];
                            class38.field917[var6++] = class41.method326(0x1 << var131, var132) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var271 == 4011) {
                            var6 -= 2;
                            int var133 = class38.field917[var6];
                            int var134 = class38.field917[var6 + 1];
                            class38.field917[var6++] = var133 % var134;
                            continue;
                        }
                        if (var271 == 4012) {
                            var6 -= 2;
                            int var135 = class38.field917[var6];
                            int var136 = class38.field917[var6 + 1];
                            if (var135 == 0) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = (int) Math.pow((double) var135, (double) var136);
                            }
                            continue;
                        }
                        if (var271 == 4013) {
                            var6 -= 2;
                            int var137 = class38.field917[var6 + 1];
                            int var138 = class38.field917[var6];
                            if (var138 == 0) {
                                class38.field917[var6++] = 0;
                            } else if (var137 == 0) {
                                class38.field917[var6++] = Integer.MAX_VALUE;
                            } else {
                                class38.field917[var6++] = (int) Math.pow((double) var138, 1.0D / (double) var137);
                            }
                            continue;
                        }
                        if (var271 == 4014) {
                            var6 -= 2;
                            int var139 = class38.field917[var6 + 1];
                            int var140 = class38.field917[var6];
                            class38.field917[var6++] = class41.method326(var139, var140);
                            continue;
                        }
                        if (var271 == 4015) {
                            var6 -= 2;
                            int var141 = class38.field917[var6];
                            int var142 = class38.field917[var6 + 1];
                            class38.field917[var6++] = class107.method864(var142, var141);
                            continue;
                        }
                    } else if (var271 < 4200) {
                        if (var271 == 4100) {
                            var5--;
                            class32 var143 = class56.field1306[var5];
                            var6--;
                            int var144 = class38.field917[var6];
                            class56.field1306[var5++] = class52.method403(new class32[] { var143, class159.method1230(var144, 0) }, (byte) -20);
                            continue;
                        }
                        if (var271 == 4101) {
                            var5 -= 2;
                            class32 var145 = class56.field1306[var5];
                            class32 var146 = class56.field1306[var5 + 1];
                            class56.field1306[var5++] = class52.method403(new class32[] { var145, var146 }, (byte) -20);
                            continue;
                        }
                        if (var271 == 4102) {
                            var5--;
                            class32 var147 = class56.field1306[var5];
                            var6--;
                            int var148 = class38.field917[var6];
                            class56.field1306[var5++] = class52.method403(new class32[] { var147, class145.method1092(var148, true, (byte) -90) }, (byte) -20);
                            continue;
                        }
                        if (var271 == 4103) {
                            var5--;
                            class32 var149 = class56.field1306[var5];
                            class56.field1306[var5++] = var149.method270(false);
                            continue;
                        }
                        if (var271 == 4104) {
                            var6--;
                            int var150 = class38.field917[var6];
                            long var151 = (long) var150 * 86400000L + 1014768000000L;
                            class146.field3313.setTime(new Date(var151));
                            int var153 = class146.field3313.get(5);
                            int var154 = class146.field3313.get(2);
                            int var155 = class146.field3313.get(1);
                            class56.field1306[var5++] = class52.method403(new class32[] { class159.method1230(var153, 0), class85.field1985, class147.field3335[var154], class85.field1985, class159.method1230(var155, 0) }, (byte) -20);
                            continue;
                        }
                        if (var271 == 4105) {
                            var5 -= 2;
                            class32 var156 = class56.field1306[var5 + 1];
                            class32 var157 = class56.field1306[var5];
                            if (class20.field373.field1632 != null && class20.field373.field1632.field606) {
                                class56.field1306[var5++] = var156;
                                continue;
                            }
                            class56.field1306[var5++] = var157;
                            continue;
                        }
                        if (var271 == 4106) {
                            var6--;
                            int var158 = class38.field917[var6];
                            class56.field1306[var5++] = class159.method1230(var158, 0);
                            continue;
                        }
                        if (var271 == 4107) {
                            var5 -= 2;
                            class38.field917[var6++] = class56.field1306[var5].method245(1, class56.field1306[var5 + 1]);
                            continue;
                        }
                        if (var271 == 4108) {
                            var6 -= 2;
                            var5--;
                            class32 var159 = class56.field1306[var5];
                            int var160 = class38.field917[var6];
                            int var161 = class38.field917[var6 + 1];
                            byte[] var162 = class157.field3598.method206(var161, 0, -117);
                            class96 var163 = new class96(var162);
                            class38.field917[var6++] = var163.method777(var159, var160);
                            continue;
                        }
                        if (var271 == 4109) {
                            var6 -= 2;
                            int var164 = class38.field917[var6 + 1];
                            var5--;
                            class32 var165 = class56.field1306[var5];
                            int var166 = class38.field917[var6];
                            byte[] var167 = class157.field3598.method206(var164, 0, -73);
                            class96 var168 = new class96(var167);
                            class38.field917[var6++] = var168.method791(var165, var166);
                            continue;
                        }
                        if (var271 == 4110) {
                            var5 -= 2;
                            class32 var169 = class56.field1306[var5];
                            class32 var170 = class56.field1306[var5 + 1];
                            var6--;
                            if (class38.field917[var6] == 1) {
                                class56.field1306[var5++] = var169;
                            } else {
                                class56.field1306[var5++] = var170;
                            }
                            continue;
                        }
                        if (var271 == 4111) {
                            var5--;
                            class32 var171 = class56.field1306[var5];
                            class56.field1306[var5++] = class99.method773(var171);
                            continue;
                        }
                        if (var271 == 4112) {
                            var6--;
                            int var172 = class38.field917[var6];
                            var5--;
                            class32 var173 = class56.field1306[var5];
                            class56.field1306[var5++] = var173.method277(255, var172);
                            continue;
                        }
                        if (var271 == 4113) {
                            var6--;
                            int var174 = class38.field917[var6];
                            class38.field917[var6++] = class23.method166((byte) 107, var174) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4114) {
                            var6--;
                            int var175 = class38.field917[var6];
                            class38.field917[var6++] = class157.method1214(var175, -1) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4115) {
                            var6--;
                            int var176 = class38.field917[var6];
                            class38.field917[var6++] = class79.method627(var176, (byte) 19) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4116) {
                            var6--;
                            int var177 = class38.field917[var6];
                            class38.field917[var6++] = class154.method1195(119, var177) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4117) {
                            var5--;
                            class32 var178 = class56.field1306[var5];
                            if (var178 == null) {
                                class38.field917[var6++] = 0;
                            } else {
                                class38.field917[var6++] = var178.method240((byte) 83);
                            }
                            continue;
                        }
                        if (var271 == 4118) {
                            var6 -= 2;
                            var5--;
                            class32 var179 = class56.field1306[var5];
                            int var180 = class38.field917[var6];
                            int var181 = class38.field917[var6 + 1];
                            class56.field1306[var5++] = var179.method241((byte) -112, var180, var181);
                            continue;
                        }
                        if (var271 == 4119) {
                            var5--;
                            class32 var182 = class56.field1306[var5];
                            class32 var183 = class64.method492(true, var182.method240((byte) 111));
                            boolean var184 = false;
                            for (int var185 = 0; var185 < var182.method240((byte) 47); var185++) {
                                int var186 = var182.method260(74, var185);
                                if (var186 == 60) {
                                    var184 = true;
                                } else if (var186 == 62) {
                                    var184 = false;
                                } else if (!var184) {
                                    var183.method273(var186, -5);
                                }
                            }
                            var183.method269(-8087);
                            class56.field1306[var5++] = var183;
                            continue;
                        }
                        if (var271 == 4120) {
                            var5--;
                            class32 var187 = class56.field1306[var5];
                            var6--;
                            int var188 = class38.field917[var6];
                            class38.field917[var6++] = var187.method263(var188, (byte) -91);
                            continue;
                        }
                    } else if (var271 < 4300) {
                        if (var271 == 4200) {
                            var6--;
                            int var210 = class38.field917[var6];
                            class56.field1306[var5++] = class146.method1094(var210, 23).field1430;
                            continue;
                        }
                        if (var271 == 4201) {
                            var6 -= 2;
                            int var211 = class38.field917[var6];
                            int var212 = class38.field917[var6 + 1];
                            class62 var213 = class146.method1094(var211, 26);
                            if (var212 >= 1 && var212 <= 5 && var213.field1411[var212 - 1] != null) {
                                class56.field1306[var5++] = var213.field1411[var212 - 1];
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 4202) {
                            var6 -= 2;
                            int var214 = class38.field917[var6];
                            int var215 = class38.field917[var6 + 1];
                            class62 var216 = class146.method1094(var214, 31);
                            if (var215 >= 1 && var215 <= 5 && var216.field1429[var215 - 1] != null) {
                                class56.field1306[var5++] = var216.field1429[var215 - 1];
                                continue;
                            }
                            class56.field1306[var5++] = class159.field3654;
                            continue;
                        }
                        if (var271 == 4203) {
                            var6--;
                            int var217 = class38.field917[var6];
                            class38.field917[var6++] = class146.method1094(var217, 106).field1376;
                            continue;
                        }
                        if (var271 == 4204) {
                            var6--;
                            int var218 = class38.field917[var6];
                            class38.field917[var6++] = class146.method1094(var218, 69).field1410 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4205) {
                            var6--;
                            int var219 = class38.field917[var6];
                            class62 var220 = class146.method1094(var219, 56);
                            if (var220.field1389 == -1 && var220.field1412 >= 0) {
                                class38.field917[var6++] = var220.field1412;
                                continue;
                            }
                            class38.field917[var6++] = var219;
                            continue;
                        }
                        if (var271 == 4206) {
                            var6--;
                            int var221 = class38.field917[var6];
                            class62 var222 = class146.method1094(var221, 70);
                            if (var222.field1389 >= 0 && var222.field1412 >= 0) {
                                class38.field917[var6++] = var222.field1412;
                                continue;
                            }
                            class38.field917[var6++] = var221;
                            continue;
                        }
                        if (var271 == 4207) {
                            var6--;
                            int var223 = class38.field917[var6];
                            class38.field917[var6++] = class146.method1094(var223, 53).field1393 ? 1 : 0;
                            continue;
                        }
                    } else if (var271 < 5100) {
                        if (var271 == 5000) {
                            class38.field917[var6++] = class2.field21;
                            continue;
                        }
                        if (var271 == 5001) {
                            class89.field2055++;
                            var6 -= 3;
                            class2.field21 = class38.field917[var6];
                            class2.field23 = class38.field917[var6 + 1];
                            class43.field991 = class38.field917[var6 + 2];
                            class44.field1027.method357(69, -118);
                            class44.field1027.method515((byte) 113, class2.field21);
                            class44.field1027.method515((byte) 80, class2.field23);
                            class44.field1027.method515((byte) 71, class43.field991);
                            continue;
                        }
                        if (var271 == 5002) {
                            var5--;
                            class32 var189 = class56.field1306[var5];
                            class121.field2871++;
                            var6 -= 2;
                            int var190 = class38.field917[var6 + 1];
                            int var191 = class38.field917[var6];
                            class44.field1027.method357(192, -99);
                            class44.field1027.method542(var189.method259(0), (byte) 56);
                            class44.field1027.method515((byte) 59, var191 - 1);
                            class44.field1027.method515((byte) 124, var190);
                            continue;
                        }
                        if (var271 == 5003) {
                            var6--;
                            int var192 = class38.field917[var6];
                            class32 var193 = null;
                            if (var192 < 100) {
                                var193 = class36.field833[var192];
                            }
                            if (var193 == null) {
                                var193 = class159.field3654;
                            }
                            class56.field1306[var5++] = var193;
                            continue;
                        }
                        if (var271 == 5004) {
                            var6--;
                            int var194 = class38.field917[var6];
                            int var195 = -1;
                            if (var194 < 100 && class36.field833[var194] != null) {
                                var195 = class17.field347[var194];
                            }
                            class38.field917[var6++] = var195;
                            continue;
                        }
                        if (var271 == 5005) {
                            class38.field917[var6++] = class2.field23;
                            continue;
                        }
                        if (var271 == 5008) {
                            var5--;
                            class32 var196 = class56.field1306[var5];
                            if (var196.method262(class134.field3112, true)) {
                                class152.method1188(var196, -103);
                            } else {
                                class48.field1120++;
                                class32 var197 = var196.method270(false);
                                byte var198 = 0;
                                byte var199 = 0;
                                if (var197.method262(class128.field2949, true)) {
                                    var199 = 0;
                                    var196 = var196.method268((byte) -118, class128.field2949.method240((byte) 75));
                                } else if (var197.method262(class94.field2179, true)) {
                                    var199 = 1;
                                    var196 = var196.method268((byte) -42, class94.field2179.method240((byte) 91));
                                } else if (var197.method262(class38.field907, true)) {
                                    var196 = var196.method268((byte) -80, class38.field907.method240((byte) 121));
                                    var199 = 2;
                                } else if (var197.method262(class151.field3465, true)) {
                                    var199 = 3;
                                    var196 = var196.method268((byte) -107, class151.field3465.method240((byte) 23));
                                } else if (var197.method262(class130.field3002, true)) {
                                    var199 = 4;
                                    var196 = var196.method268((byte) -72, class130.field3002.method240((byte) 26));
                                } else if (var197.method262(class5.field107, true)) {
                                    var196 = var196.method268((byte) -29, class5.field107.method240((byte) 119));
                                    var199 = 5;
                                } else if (var197.method262(class27.field488, true)) {
                                    var199 = 6;
                                    var196 = var196.method268((byte) -48, class27.field488.method240((byte) 109));
                                } else if (var197.method262(class39.field932, true)) {
                                    var199 = 7;
                                    var196 = var196.method268((byte) -35, class39.field932.method240((byte) 107));
                                } else if (var197.method262(class5.field84, true)) {
                                    var196 = var196.method268((byte) -120, class5.field84.method240((byte) 58));
                                    var199 = 8;
                                } else if (var197.method262(class45.field1074, true)) {
                                    var199 = 9;
                                    var196 = var196.method268((byte) -78, class45.field1074.method240((byte) 120));
                                } else if (var197.method262(class137.field3190, true)) {
                                    var199 = 10;
                                    var196 = var196.method268((byte) -103, class137.field3190.method240((byte) 97));
                                } else if (var197.method262(class118.field2826, true)) {
                                    var199 = 11;
                                    var196 = var196.method268((byte) -56, class118.field2826.method240((byte) 35));
                                } else if (class20.field371 != 0) {
                                    if (var197.method262(class128.field2964, true)) {
                                        var199 = 0;
                                        var196 = var196.method268((byte) -29, class128.field2964.method240((byte) 12));
                                    } else if (var197.method262(class94.field2165, true)) {
                                        var196 = var196.method268((byte) -123, class94.field2165.method240((byte) 91));
                                        var199 = 1;
                                    } else if (var197.method262(class38.field919, true)) {
                                        var199 = 2;
                                        var196 = var196.method268((byte) -85, class38.field919.method240((byte) 122));
                                    } else if (var197.method262(class151.field3472, true)) {
                                        var199 = 3;
                                        var196 = var196.method268((byte) -117, class151.field3472.method240((byte) 102));
                                    } else if (var197.method262(class130.field2996, true)) {
                                        var199 = 4;
                                        var196 = var196.method268((byte) -49, class130.field2996.method240((byte) 25));
                                    } else if (var197.method262(class5.field109, true)) {
                                        var199 = 5;
                                        var196 = var196.method268((byte) -116, class5.field109.method240((byte) 12));
                                    } else if (var197.method262(class27.field489, true)) {
                                        var196 = var196.method268((byte) -8, class27.field489.method240((byte) 56));
                                        var199 = 6;
                                    } else if (var197.method262(class39.field943, true)) {
                                        var196 = var196.method268((byte) -65, class39.field943.method240((byte) 32));
                                        var199 = 7;
                                    } else if (var197.method262(class5.field83, true)) {
                                        var196 = var196.method268((byte) -23, class5.field83.method240((byte) 51));
                                        var199 = 8;
                                    } else if (var197.method262(class45.field1075, true)) {
                                        var199 = 9;
                                        var196 = var196.method268((byte) -90, class45.field1075.method240((byte) 48));
                                    } else if (var197.method262(class137.field3194, true)) {
                                        var196 = var196.method268((byte) -63, class137.field3194.method240((byte) 80));
                                        var199 = 10;
                                    } else if (var197.method262(class118.field2820, true)) {
                                        var199 = 11;
                                        var196 = var196.method268((byte) -117, class118.field2820.method240((byte) 83));
                                    }
                                }
                                class32 var200 = var196.method270(false);
                                if (var200.method262(class62.field1440, true)) {
                                    var196 = var196.method268((byte) -40, class62.field1440.method240((byte) 49));
                                    var198 = 1;
                                } else if (var200.method262(field3620, true)) {
                                    var198 = 2;
                                    var196 = var196.method268((byte) -14, field3620.method240((byte) 40));
                                } else if (var200.method262(class106.field2526, true)) {
                                    var196 = var196.method268((byte) -38, class106.field2526.method240((byte) 72));
                                    var198 = 3;
                                } else if (var200.method262(class124.field2886, true)) {
                                    var198 = 4;
                                    var196 = var196.method268((byte) -66, class124.field2886.method240((byte) 97));
                                } else if (var200.method262(class106.field2525, true)) {
                                    var196 = var196.method268((byte) -113, class106.field2525.method240((byte) 80));
                                    var198 = 5;
                                } else if (class20.field371 != 0) {
                                    if (var200.method262(class62.field1434, true)) {
                                        var198 = 1;
                                        var196 = var196.method268((byte) -119, class62.field1434.method240((byte) 115));
                                    } else if (var200.method262(field3630, true)) {
                                        var198 = 2;
                                        var196 = var196.method268((byte) -6, field3630.method240((byte) 63));
                                    } else if (var200.method262(class106.field2533, true)) {
                                        var196 = var196.method268((byte) -17, class106.field2533.method240((byte) 36));
                                        var198 = 3;
                                    } else if (var200.method262(class124.field2893, true)) {
                                        var198 = 4;
                                        var196 = var196.method268((byte) -40, class124.field2893.method240((byte) 36));
                                    } else if (var200.method262(class106.field2529, true)) {
                                        var196 = var196.method268((byte) -113, class106.field2529.method240((byte) 50));
                                        var198 = 5;
                                    }
                                }
                                class44.field1027.method357(27, -88);
                                class44.field1027.method515((byte) 106, 0);
                                int var201 = class44.field1027.field1569;
                                class44.field1027.method515((byte) 82, var199);
                                class44.field1027.method515((byte) 76, var198);
                                class154.method1196(var196, (byte) -48, class44.field1027);
                                class44.field1027.method516(class44.field1027.field1569 - var201, false);
                            }
                            continue;
                        }
                        if (var271 == 5009) {
                            class47.field1110++;
                            var5 -= 2;
                            class32 var202 = class56.field1306[var5];
                            class32 var203 = class56.field1306[var5 + 1];
                            class44.field1027.method357(164, -106);
                            class44.field1027.method515((byte) 57, 0);
                            int var204 = class44.field1027.field1569;
                            class44.field1027.method542(var202.method259(0), (byte) 56);
                            class154.method1196(var203, (byte) -48, class44.field1027);
                            class44.field1027.method516(class44.field1027.field1569 - var204, false);
                            continue;
                        }
                        if (var271 == 5010) {
                            var6--;
                            int var205 = class38.field917[var6];
                            class32 var206 = null;
                            if (var205 < 100) {
                                var206 = class14.field245[var205];
                            }
                            if (var206 == null) {
                                var206 = class159.field3654;
                            }
                            class56.field1306[var5++] = var206;
                            continue;
                        }
                        if (var271 == 5011) {
                            var6--;
                            int var207 = class38.field917[var6];
                            class32 var208 = null;
                            if (var207 < 100) {
                                var208 = class111.field2612[var207];
                            }
                            if (var208 == null) {
                                var208 = class159.field3654;
                            }
                            class56.field1306[var5++] = var208;
                            continue;
                        }
                        if (var271 == 5015) {
                            class32 var209;
                            if (class20.field373 == null || class20.field373.field1660 == null) {
                                var209 = class74.field1752;
                            } else {
                                var209 = class20.field373.field1660;
                            }
                            class56.field1306[var5++] = var209;
                            continue;
                        }
                        if (var271 == 5016) {
                            class38.field917[var6++] = class43.field991;
                            continue;
                        }
                        if (var271 == 5017) {
                            class38.field917[var6++] = class23.field423;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var270) {
            if (var4.field3263 == null) {
                if (class70.field1647 != 0) {
                    class79.method629((byte) 98, class117.field2810, 0, class159.field3654);
                }
                class110.method872(var270, "CS2 - scr:" + var4.field3326 + " op:" + var9, 95);
            } else {
                class32 var267 = class64.method492(true, 30);
                var267.method243(class34.field715, (byte) 6).method243(var4.field3263, (byte) -53);
                for (int var268 = class140.field3235 - 1; var268 >= 0; var268--) {
                    var267.method243(class83.field1925, (byte) 104).method243(class56.field1303[var268].field2923.field3263, (byte) -83);
                }
                if (var9 == 40) {
                    int var269 = var8[var10];
                    var267.method243(class33.field696, (byte) -126).method243(class159.method1230(var269, 0), (byte) -91);
                }
                if (class70.field1647 != 0) {
                    class79.method629((byte) 98, class52.method403(new class32[] { class71.field1676, var4.field3263 }, (byte) -20), 0, class159.field3654);
                }
                class110.method872(var270, "CS2 - scr:" + var4.field3326 + " op:" + var9 + new String(var267.method255(122)), 95);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field3643 = null;
        field3627 = null;
        field3624 = null;
        field3644 = null;
        field3626 = null;
        field3637 = null;
        field3622 = null;
        field3636 = null;
        field3630 = null;
        field3620 = null;
        field3614 = null;
        if (arg0 != 0) {
            method1225(-67);
        }
        field3625 = null;
        field3641 = null;
        field3642 = null;
        field3628 = null;
        field3631 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BIIIILvd;I[Lqf;I)V")
    public static final void method1226(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class150 arg7, int arg8, class117[] arg9, int arg10) {
        if (arg0 != 1) {
            method1224(null, (byte) -122);
        }
        field3613++;
        class66 var11 = new class66(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method506(true);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method506(true);
                if (var15 == 0) {
                    break;
                }
                int var16 = var11.method533(arg0 ^ 0xFE);
                var14 += var15 - 1;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 & 0x3F;
                int var19 = var16 & 0x3;
                int var20 = var14 >> 12;
                int var21 = var16 >> 2;
                if (arg3 == var20 && arg10 <= var17 && var17 < arg10 + 8 && arg4 <= var18 && var18 < arg4 + 8) {
                    class53 var22 = class5.method22(arg0 + 99, var12);
                    int var23 = arg6 + class143.method1081(var18 & 0x7, var22.field1234, var19, var22.field1223, var17 & 0x7, (byte) -62, arg8);
                    int var24 = class71.method583(var19, var18 & 0x7, arg8, 0, var22.field1234, var22.field1223, var17 & 0x7) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg1;
                        if ((class3.field50[1][var23][var24] & 0x2) == 2) {
                            var25 = arg1 - 1;
                        }
                        class117 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg9[var25];
                        }
                        class109.method870(arg7, var24, var21, var12, arg8 + var19 & 0x3, var26, arg1, var23, (byte) -76);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3635 = arg5;
        this.field3632 = arg0;
        this.field3633 = arg4;
        this.field3611 = arg1;
        this.field3623 = arg2;
        this.field3617 = arg3;
        this.field3616 = arg6;
    }
}
