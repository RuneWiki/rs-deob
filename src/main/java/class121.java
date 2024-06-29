import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class121 {

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lrd;")
    public static class117 field2968 = class95.method812("@whi@", (byte) 8);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lrd;")
    public static class117 field2970 = class95.method812("Unerwartete Antwort vom Anmelde)2Server", (byte) 8);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lrd;")
    public static class117 field2973 = class95.method812("Sie haben gerade eine andere Welt verlassen)3", (byte) 8);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lrd;")
    public static class117 field2965 = class95.method812("null", (byte) 8);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lrd;")
    public static class117 field2971 = class95.method812("Privater Chat", (byte) 8);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2975 = 1;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2977 = -1;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[Ll;")
    public static class76[] field2976;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBII)V")
    public static final void method988(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2974++;
        class45 var5 = (class45) class84.field2191.method20((long) arg3, true);
        if (var5 == null) {
            var5 = new class45();
            class84.field2191.method18(var5, (long) arg3, -1);
        }
        if (arg2 != 17) {
            return;
        }
        if (arg1 >= var5.field1269.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1269.length; var8++) {
                var6[var8] = var5.field1269[var8];
                var7[var8] = var5.field1265[var8];
            }
            for (int var9 = var5.field1269.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1265 = var7;
            var5.field1269 = var6;
        }
        var5.field1269[arg1] = arg0;
        var5.field1265[arg1] = arg4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2968 = null;
        field2976 = null;
        field2973 = null;
        field2970 = null;
        if (arg0 != 32) {
            method990(-33, -66, 49);
        }
        field2965 = null;
        field2971 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public static final void method990(int arg0, int arg1, int arg2) {
        field2962++;
        long var3 = (long) ((arg1 << arg2) + arg0);
        class138 var5 = (class138) class2.field56.method20(var3, true);
        if (var5 != null) {
            class136.field3267.method899(var5, 6995);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method991(int arg0) {
        class49.method544((byte) 81);
        field2967++;
        class71.method686((byte) -75);
        if (class53.field1510 == 2 || class53.field1510 == 5) {
            byte[] var41 = class119.field2917.field2797;
            int var42 = var41.length;
            int[] var43 = class145.field3548;
            for (int var44 = 0; var44 < var42; var44++) {
                if (var41[var44] == 0) {
                    var43[var44] = 0;
                }
            }
            if (class53.field1510 < 3) {
                class116.field2829.method729(0, 0, 33, 33, 25, 25, class132.field3172, 256, class147.field3593, class2.field41);
            }
            class47.method512(1);
            return;
        }
        int var1 = class144.field3516.field717 / 32 + 48;
        int var2 = 464 - class144.field3516.field751 / 32;
        int var3 = class132.field3172 + class99.field2459 & 0x7FF;
        class147.field3588.method729(25, 5, 146, 151, var1, var2, var3, class14.field277 + 256, class72.field2002, class100.field2500);
        for (int var4 = 0; var4 < class140.field3342; var4++) {
            int var39 = class33.field997[var4] * 4 + 2 - class144.field3516.field751 / 32;
            int var40 = class84.field2190[var4] * 4 + 2 - class144.field3516.field717 / 32;
            class135.method1099(class111.field2775[var4], var40, (byte) 40, var39);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class1 var36 = class105.field2631[class120.field2940][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class144.field3516.field751 / 32;
                    int var38 = var5 * 4 + 2 - class144.field3516.field717 / 32;
                    class135.method1099(field2976[0], var38, (byte) 40, var37);
                }
            }
        }
        for (int var6 = 0; var6 < class24.field678; var6++) {
            class36 var31 = class93.field2334[class95.field2379[var6]];
            if (var31 != null && var31.method265(-42)) {
                class17 var32 = var31.field1061;
                if (var32 != null && var32.field427 != null) {
                    var32 = var32.method188((byte) 64);
                }
                if (var32 != null && var32.field399 && var32.field420) {
                    int var33 = var31.field751 / 32 - class144.field3516.field751 / 32;
                    int var34 = var31.field717 / 32 - class144.field3516.field717 / 32;
                    class135.method1099(field2976[1], var34, (byte) 40, var33);
                }
            }
        }
        int var7 = 0;
        if (arg0 != 1) {
            field2961 = -103;
        }
        while (var7 < class96.field2419) {
            class101 var23 = class93.field2340[class137.field3292[var7]];
            if (var23 != null && var23.method265(-52)) {
                int var24 = var23.field751 / 32 - class144.field3516.field751 / 32;
                int var25 = var23.field717 / 32 - class144.field3516.field717 / 32;
                long var26 = var23.field2528.method966(39);
                boolean var28 = false;
                for (int var29 = 0; var29 < class5.field119; var29++) {
                    if (class56.field1551[var29] == var26 && class35.field1037[var29] != 0) {
                        var28 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class144.field3516.field2521 != 0 && var23.field2521 != 0 && class144.field3516.field2521 == var23.field2521) {
                    var30 = true;
                }
                if (var28) {
                    class135.method1099(field2976[3], var25, (byte) 40, var24);
                } else if (var30) {
                    class135.method1099(field2976[4], var25, (byte) 40, var24);
                } else {
                    class135.method1099(field2976[2], var25, (byte) 40, var24);
                }
            }
            var7++;
        }
        if (class141.field3358 != 0 && class85.field2236 % 20 < 10) {
            if (class141.field3358 == 1 && class44.field1244 >= 0 && class44.field1244 < class93.field2334.length) {
                class36 var8 = class93.field2334[class44.field1244];
                if (var8 != null) {
                    int var9 = var8.field751 / 32 - class144.field3516.field751 / 32;
                    int var10 = var8.field717 / 32 - class144.field3516.field717 / 32;
                    class119.method983(-1, var9, class100.field2493[1], var10);
                }
            }
            if (class141.field3358 == 2) {
                int var11 = (class116.field2832 - class95.field2371) * 4 + 2 - class144.field3516.field717 / 32;
                int var12 = (class52.field1459 - class108.field2678) * 4 + 2 - class144.field3516.field751 / 32;
                class119.method983(arg0 ^ 0xFFFFFFFE, var12, class100.field2493[1], var11);
            }
            if (class141.field3358 == 10 && class2.field61 >= 0 && class93.field2340.length > class2.field61) {
                class101 var13 = class93.field2340[class2.field61];
                if (var13 != null) {
                    int var14 = var13.field751 / 32 - class144.field3516.field751 / 32;
                    int var15 = var13.field717 / 32 - class144.field3516.field717 / 32;
                    class119.method983(arg0 - 2, var14, class100.field2493[1], var15);
                }
            }
        }
        if (class40.field1164 != 0) {
            int var16 = class59.field1674 * 4 + 2 - class144.field3516.field751 / 32;
            int var17 = class40.field1164 * 4 + 2 - class144.field3516.field717 / 32;
            class135.method1099(class100.field2493[0], var17, (byte) 40, var16);
        }
        class145.method1165(97, 78, 3, 3, 16777215);
        if (class53.field1510 >= 3) {
            byte[] var18 = class119.field2917.field2797;
            int[] var19 = class145.field3548;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class119.field2917.field2800 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        } else {
            class116.field2829.method729(0, 0, 33, 33, 25, 25, class132.field3172, 256, class147.field3593, class2.field41);
        }
        class47.method512(1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ldc;Z)V")
    public static final void method992(class25 arg0, boolean arg1) {
        if (class85.field2236 == arg0.field730 || arg0.field703 == -1 || arg0.field712 != 0 || arg0.field684 + 1 > class33.method387(arg0.field703, 7455).field1282[arg0.field727]) {
            int var2 = arg0.field730 - arg0.field729;
            int var3 = class85.field2236 - arg0.field729;
            int var4 = arg0.field689 * 64 + arg0.field686 * 128;
            int var5 = arg0.field724 * 128 + arg0.field689 * 64;
            int var6 = arg0.field743 * 128 + arg0.field689 * 64;
            int var7 = arg0.field711 * 128 + arg0.field689 * 64;
            arg0.field751 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg0.field717 = ((var2 - var3) * var6 + var3 * var5) / var2;
        }
        field2964++;
        arg0.field698 = 0;
        if (arg0.field714 == 0) {
            arg0.field705 = 1024;
        }
        if (arg1) {
            method992(null, false);
        }
        if (arg0.field714 == 1) {
            arg0.field705 = 1536;
        }
        if (arg0.field714 == 2) {
            arg0.field705 = 0;
        }
        if (arg0.field714 == 3) {
            arg0.field705 = 512;
        }
        arg0.field697 = arg0.field705;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method993(int arg0, byte arg1) {
        field2959++;
        if (arg0 == 100 && class13.field264 > 0) {
            byte[] var2 = class53.field1519[--class13.field264];
            class53.field1519[class13.field264] = null;
            return var2;
        } else if (arg0 == 5000 && class16.field375 > 0) {
            byte[] var3 = class100.field2473[--class16.field375];
            class100.field2473[class16.field375] = null;
            return var3;
        } else {
            int var4 = 51 / ((-arg1 - 79) / 34);
            if (arg0 == 30000 && class97.field2442 > 0) {
                byte[] var5 = class32.field972[--class97.field2442];
                class32.field972[class97.field2442] = null;
                return var5;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lrd;Lrd;Lge;Z)Lcd;")
    public static final class19 method994(class117 arg0, class117 arg1, class47 arg2, boolean arg3) {
        field2972++;
        if (arg3) {
            int var4 = arg2.method509(arg0, 0);
            int var5 = arg2.method523(var4, arg1, -1);
            return class80.method745(var5, var4, false, arg2);
        } else {
            return null;
        }
    }
}
