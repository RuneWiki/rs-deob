import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class85 {

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lmb;")
    private static class96 field1441 = class243.method1708("glow3:", (byte) 118);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lmb;")
    public static class96 field1430 = field1441;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lmb;")
    public static class96 field1445 = field1441;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lki;")
    public static class267 field1433;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lff;")
    public static class3 field1436;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lff;")
    public static class3 field1443;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Luk;")
    public static class95 field1442;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[Lag;")
    public static class258[] field1432;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lff;Z)V")
    public static final void method614(class3 arg0, boolean arg1) {
        field1434++;
        if (class266.field4644) {
            return;
        }
        if (arg1) {
            field1440 = -124;
        }
        class84.method591();
        class96.field1610 = class162.method1179(class141.field2524, arg0, -84);
        int var2 = class168.field2954;
        int var3 = var2 * 956 / 503;
        class96.field1610.method1246((class232.field3979 - var3) / 2, 0, var3, var2);
        class192.field3321 = class6.method62(class19.field312, arg0, (byte) 127);
        class192.field3321.method197(class232.field3979 / 2 - (class192.field3321.field1464 / 2), 18);
        class266.field4644 = true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lmb;IIIZ)V")
    public static final void method615(class96 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1437++;
        class107 var5 = class1.method7(arg2, arg3, -117);
        if (var5 == null) {
            return;
        }
        if (var5.field1824 != null) {
            class116 var6 = new class116();
            var6.field2154 = arg0;
            var6.field2155 = var5.field1824;
            var6.field2164 = arg1;
            var6.field2158 = var5;
            class141.method1044(var6, (byte) 76);
        }
        if (!arg4) {
            return;
        }
        boolean var7 = true;
        if (var5.field1869 > 0) {
            var7 = class52.method398(0, var5);
        }
        if (!var7 || !class58.method423(arg1 - 1, client.method817(var5), (byte) 96)) {
            return;
        }
        if (arg1 == 1) {
            class11.field203++;
            class140.field2505.method1012((byte) -126, 162);
            class140.field2505.method1625((byte) -110, arg2);
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 2) {
            class196.field3398++;
            class140.field2505.method1012((byte) -125, 140);
            class140.field2505.method1625((byte) 81, arg2);
            class140.field2505.method1632(arg4, arg3);
        }
        if (arg1 == 3) {
            class244.field4218++;
            class140.field2505.method1012((byte) 45, 34);
            class140.field2505.method1625((byte) -108, arg2);
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 4) {
            class140.field2505.method1012((byte) -120, 144);
            class39.field676++;
            class140.field2505.method1625((byte) 98, arg2);
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 5) {
            class140.field2505.method1012((byte) -14, 225);
            class103.field1740++;
            class140.field2505.method1625((byte) 62, arg2);
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 6) {
            class140.field2505.method1012((byte) 88, 178);
            class140.field2505.method1625((byte) 79, arg2);
            class141.field2530++;
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 7) {
            class140.field2505.method1012((byte) 3, 58);
            class98.field1675++;
            class140.field2505.method1625((byte) -115, arg2);
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 8) {
            class140.field2505.method1012((byte) -123, 102);
            class140.field2505.method1625((byte) -112, arg2);
            class39.field680++;
            class140.field2505.method1632(true, arg3);
        }
        if (arg1 == 9) {
            class140.field2505.method1012((byte) 96, 127);
            class140.field2505.method1625((byte) -123, arg2);
            class245.field4247++;
            class140.field2505.method1632(arg4, arg3);
        }
        if (arg1 == 10) {
            class159.field2797++;
            class140.field2505.method1012((byte) 112, 221);
            class140.field2505.method1625((byte) 121, arg2);
            class140.field2505.method1632(arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method616(int arg0) {
        if (arg0 != -16594) {
            method620(47);
        }
        field1444++;
        for (int var1 = 0; var1 < class58.field1012; var1++) {
            int var10002 = class138.field2479[var1]--;
            if (class138.field2479[var1] >= -10) {
                class113 var3 = class154.field2711[var1];
                if (var3 == null) {
                    var3 = class113.method886(class178.field3077, class134.field2402[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class138.field2479[var1] += var3.method885();
                    class154.field2711[var1] = var3;
                }
                if (class138.field2479[var1] < 0) {
                    int var10;
                    if (class250.field4331[var1] == 0) {
                        var10 = class233.field3999;
                    } else {
                        int var4 = (class250.field4331[var1] & 0xFF) * 128;
                        int var5 = class250.field4331[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class236.field4047.field4511;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class250.field4331[var1] & 0xFFAE) >> 8;
                        int var8 = var7 * 128 + 64 - class236.field4047.field4533;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class138.field2479[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class5.field100 / var4;
                    }
                    if (var10 > 0) {
                        class131 var11 = var3.method887().method988(class44.field750);
                        class72 var12 = class72.method496(var11, 100, var10);
                        var12.method527(class43.field741[var1] - 1);
                        class120.field2228.method1554(var12);
                    }
                    class138.field2479[var1] = -100;
                }
            } else {
                class58.field1012--;
                for (int var2 = var1; var2 < class58.field1012; var2++) {
                    class134.field2402[var2] = class134.field2402[var2 + 1];
                    class154.field2711[var2] = class154.field2711[var2 + 1];
                    class43.field741[var2] = class43.field741[var2 + 1];
                    class138.field2479[var2] = class138.field2479[var2 + 1];
                    class250.field4331[var2] = class250.field4331[var2 + 1];
                }
                var1--;
            }
        }
        if (class119.field2213 && !class181.method1279(arg0 ^ 0xFFFFBF76)) {
            if (class92.field1525 != 0 && class163.field2897 != -1) {
                class68.method476(class163.field2897, class92.field1525, class181.field3155, false, 0, 116);
            }
            class119.field2213 = false;
        } else if (class92.field1525 != 0 && class163.field2897 != -1 && !class181.method1279(85)) {
            class140.field2505.method1012((byte) -128, 200);
            class140.field2505.method1625((byte) 41, class163.field2897);
            class127.field2324++;
            class163.field2897 = -1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JIII)Z")
    public static final boolean method617(long arg0, int arg1, int arg2, int arg3) {
        int var5 = ((int) arg0 & 0x7E7BF) >> 14;
        int var6 = ((int) arg0 & 0x3C15EF) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class196 var8 = class132.method995(var7, arg3 - 8324);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3388;
                var10 = var8.field3415;
            } else {
                var9 = var8.field3415;
                var10 = var8.field3388;
            }
            int var11 = var8.field3369;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class2.method12(var9, class236.field4047.field4566[0], arg2, (byte) -73, 0, true, 2, class236.field4047.field4528[0], var11, 0, var10, arg1);
        } else {
            class2.method12(0, class236.field4047.field4566[0], arg2, (byte) -73, var5 + 1, true, 2, class236.field4047.field4528[0], 0, var6, 0, arg1);
        }
        class186.field3255 = class167.field2950;
        if (arg3 != 8324) {
            field1440 = 59;
        }
        field1435++;
        class60.field1031 = 0;
        class215.field3704 = class272.field4722;
        class170.field2980 = 2;
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZIIIIB)V")
    public static final void method618(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1431++;
        class256.field4458 = arg4;
        if (arg6 < 89) {
            method621((byte) 76, 34);
        }
        class110.field2030 = arg0;
        class225.field3830 = arg5;
        class42.field712 = arg3;
        class93.field1541 = arg2;
        if (arg1 && class225.field3830 >= 100) {
            class22.field389 = class110.field2030 * 128 + 64;
            class178.field3078 = class42.field712 * 128 + 64;
            class105.field1767 = class137.method1025(class216.field3712, class22.field389, class178.field3078, (byte) -94) - class93.field1541;
        }
        class179.field3095 = 2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
    public static final boolean method619(int arg0, int arg1) {
        if (arg1 <= 55) {
            return false;
        }
        field1438++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1430 = null;
        field1445 = null;
        field1433 = null;
        field1441 = null;
        field1436 = null;
        field1443 = null;
        field1442 = null;
        if (arg0 != -4) {
            method619(-98, 34);
        }
        field1432 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)Lig;")
    public static final class86 method621(byte arg0, int arg1) {
        class86 var2 = (class86) class15.field233.method84(-122, (long) arg1);
        field1439++;
        if (var2 != null) {
            return var2;
        }
        int var3 = -58 / ((-arg0 - 31) / 33);
        byte[] var4 = class52.field900.method23(arg1, 103, 16);
        class86 var5 = new class86();
        if (var4 != null) {
            var5.method625(0, new class239(var4));
        }
        class15.field233.method88(var5, 16518, (long) arg1);
        return var5;
    }
}
