import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
    public static int[] field2520 = new int[100];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lwd;")
    public static class150 field2515 = class2.method9(true, "welle2:");

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lwd;")
    public static class150 field2521 = class2.method9(true, "@cr1@");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lwd;")
    private static class150 field2525 = class2.method9(true, "Attack");

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lwd;")
    private static class150 field2527 = class2.method9(true, "Offline");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lwd;")
    public static class150 field2514 = field2525;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lwd;")
    public static class150 field2526 = class2.method9(true, "null");

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "B")
    public static byte field2531 = 0;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lwd;")
    public static class150 field2529 = class2.method9(true, "Versteckt");

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lwd;")
    public static class150 field2528 = class2.method9(true, "mapback");

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lwd;")
    public static class150 field2534 = class2.method9(true, "Offline");

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lwd;")
    public static class150 field2517 = field2527;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lqd;")
    public static class114[] field2524;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method777(int arg0) {
        if (arg0 < 34) {
            return;
        }
        field2516++;
        if (client.field618 != 1) {
            return;
        }
        if (class14.field370 >= 6 && class14.field370 <= 106 && class131.field3098 >= 467 && class131.field3098 <= 499) {
            class135.field3183 = (class135.field3183 + 1) % 4;
            class118.field2727++;
            class16.field418 = true;
            class40.field1067 = true;
            class143.field3451.method965(true, 232);
            class143.field3451.method1126(31159, class135.field3183);
            class143.field3451.method1126(31159, class6.field151);
            class143.field3451.method1126(31159, class134.field3149);
        }
        if (class14.field370 >= 135 && class14.field370 <= 235 && class131.field3098 >= 467 && class131.field3098 <= 499) {
            class40.field1067 = true;
            class16.field418 = true;
            class118.field2727++;
            class6.field151 = (class6.field151 + 1) % 3;
            class143.field3451.method965(true, 232);
            class143.field3451.method1126(31159, class135.field3183);
            class143.field3451.method1126(31159, class6.field151);
            class143.field3451.method1126(31159, class134.field3149);
        }
        if (class14.field370 >= 273 && class14.field370 <= 373 && class131.field3098 >= 467 && class131.field3098 <= 499) {
            class134.field3149 = (class134.field3149 + 1) % 3;
            class40.field1067 = true;
            class118.field2727++;
            class16.field418 = true;
            class143.field3451.method965(true, 232);
            class143.field3451.method1126(31159, class135.field3183);
            class143.field3451.method1126(31159, class6.field151);
            class143.field3451.method1126(31159, class134.field3149);
        }
        if (class14.field370 < 412 || class14.field370 > 512 || class131.field3098 < 467 || class131.field3098 > 499) {
            return;
        }
        if (class107.field2436 == -1) {
            class70.method540((byte) 59);
            if (class134.field3156 != -1) {
                class20.field504 = false;
                class43.field1191 = class43.field1167;
                class133.field3126 = class107.field2436 = class134.field3156;
                return;
            }
            return;
        }
        class3.method16(99, 0, class147.field3564, class43.field1167);
        if (class116.field2665 != null) {
            class3.method16(99, 0, class116.field2665, class43.field1167);
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)[B")
    public static final byte[] method778(byte[] arg0, int arg1) {
        class148 var2 = new class148(arg0);
        field2522++;
        if (arg1 != 24483) {
            method779(-39, null);
        }
        int var3 = var2.method1137(arg1 - 24228);
        int var4 = var2.method1104(true);
        if (var4 < 0 || class66.field1691 != 0 && class66.field1691 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1103(var4, 97, var7, 0);
            return var7;
        } else {
            int var5 = var2.method1104(true);
            if (var5 < 0 || class66.field1691 != 0 && var5 > class66.field1691) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class67.method515(var6, var5, arg0, var4, 9);
            } else {
                class138.method1021(var6, var2, (byte) -81);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILqd;)V")
    public static final void method779(int arg0, class114 arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class74.field1855.length; var3++) {
            class74.field1855[var3] = 0;
        }
        field2518++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class74.field1855[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 128) {
            field2532 = 106;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class69.field1728[var15] = (class74.field1855[var15 + 1] + class74.field1855[var15 - 1] + class74.field1855[var15 - 128] + class74.field1855[var15 + 128]) / 4;
                }
            }
            int[] var13 = class74.field1855;
            class74.field1855 = class69.field1728;
            class69.field1728 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2647; var7++) {
            for (int var8 = 0; var8 < arg1.field2653; var8++) {
                if (arg1.field2649[var6++] != 0) {
                    int var9 = arg1.field2651 + var8 + 16;
                    int var10 = var7 + arg1.field2650 + 16;
                    int var11 = var9 + (var10 << 7);
                    class74.field1855[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method780(int arg0) {
        if (arg0 <= 86) {
            method780(-79);
        }
        field2530++;
        try {
            Graphics var1 = class142.field3439.getGraphics();
            class50.field1351.method287(var1, true, 205, 553);
        } catch (Exception var2) {
            class142.field3439.repaint();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIII)V")
    public static final void method781(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2519++;
        if (class142.field3441 == arg3 && class92.field2144 == arg5 && (class107.field2435 == arg0 || !class20.field517)) {
            return;
        }
        class107.field2435 = arg0;
        class92.field2144 = arg5;
        if (!class20.field517) {
            class107.field2435 = 0;
        }
        class142.field3441 = arg3;
        class11.method66(25, false);
        if (arg1 != -8) {
            method781(-49, (byte) 87, -31, 4, -11, -37);
        }
        class24.method195(false, class103.field2331, null, false);
        int var6 = class77.field1905;
        int var7 = class66.field1686;
        class77.field1905 = arg5 * 8 - 48;
        int var8 = class77.field1905 - var6;
        class66.field1686 = (arg3 - 6) * 8;
        int var9 = class66.field1686 - var7;
        int var10 = class66.field1686;
        int var11 = class77.field1905;
        for (int var12 = 0; var12 < 32768; var12++) {
            class18 var28 = class37.field1013[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2963[var29] -= var9;
                    var28.field2934[var29] -= var8;
                }
                var28.field2939 -= var8 * 128;
                var28.field3000 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class111 var26 = class137.field3217[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2963[var27] -= var9;
                    var26.field2934[var27] -= var8;
                }
                var26.field3000 -= var9 * 128;
                var26.field2939 -= var8 * 128;
            }
        }
        class17.field466 = arg0;
        class46.field1244.method957(arg4, 110, arg2, false);
        byte var14 = 104;
        byte var15 = 0;
        byte var16 = 1;
        if (var9 < 0) {
            var14 = -1;
            var16 = -1;
            var15 = 103;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var19 = -1;
            var18 = -1;
            var17 = 103;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var9 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class50.field1339[var25][var20][var22] = class50.field1339[var25][var23][var24];
                    } else {
                        class50.field1339[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class54 var21 = (class54) class107.field2432.method702((byte) -118); var21 != null; var21 = (class54) class107.field2432.method698(-1610612736)) {
            var21.field1414 -= var8;
            var21.field1429 -= var9;
            if (var21.field1429 < 0 || var21.field1414 < 0 || var21.field1429 >= 104 || var21.field1414 >= 104) {
                var21.method678((byte) -26);
            }
        }
        if (class142.field3442 != 0) {
            class142.field3442 -= var9;
            class2.field47 -= var8;
        }
        class17.field464 = 0;
        class113.field2600 = -1;
        class50.field1357 = false;
        class35.field961.method709(-15667);
        class111.field2570.method709(-15667);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method782(int arg0) {
        field2514 = null;
        field2526 = null;
        field2529 = null;
        field2524 = null;
        field2534 = null;
        field2525 = null;
        field2520 = null;
        field2527 = null;
        if (arg0 != 21) {
            method778(null, 51);
        }
        field2521 = null;
        field2528 = null;
        field2517 = null;
        field2515 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method783(int arg0, int arg1, int arg2) {
        field2523++;
        int var3 = 0;
        for (int var4 = arg2; var4 < 100; var4++) {
            if (class38.field1042[var4] != null) {
                int var5 = class99.field2253 + 74 - var3 * 14;
                int var6 = class133.field3121[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class150 var7 = class26.field790[var4];
                if (var7 != null && var7.method1203(true, field2521)) {
                    var7 = var7.method1196(5, arg2 ^ 0xFFFF8395);
                }
                if (var7 != null && var7.method1203(true, class4.field81)) {
                    var7 = var7.method1196(5, arg2 ^ 0xFFFF8395);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class135.field3183 == 0 || class135.field3183 == 1 && class133.method994(var7, false))) {
                    var3++;
                    if (var5 - 14 < arg0 && arg0 <= var5 && !var7.method1192(class46.field1244.field2555, 1)) {
                        if (class66.field1689 >= 1) {
                            class68.method521(0, 23, class135.field3174, false, 0, class111.method786((byte) 72, new class150[] { class3.field59, var7 }), 0);
                            class15.field406++;
                        }
                        class49.field1324++;
                        class68.method521(0, 3, class112.field2588, false, 0, class111.method786((byte) -114, new class150[] { class3.field59, var7 }), 0);
                        class28.field848++;
                        class68.method521(0, 21, class18.field481, false, 0, class111.method786((byte) 72, new class150[] { class3.field59, var7 }), 0);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class119.field2755 == 0 && (var6 == 7 || class6.field151 == 0 || class6.field151 == 1 && class133.method994(var7, false))) {
                    var3++;
                    if (var5 - 14 < arg0 && arg0 <= var5) {
                        class49.field1324++;
                        if (class66.field1689 >= 1) {
                            class15.field406++;
                            class68.method521(0, 23, class135.field3174, false, 0, class111.method786((byte) 28, new class150[] { class3.field59, var7 }), 0);
                        }
                        class68.method521(0, 3, class112.field2588, false, 0, class111.method786((byte) 127, new class150[] { class3.field59, var7 }), 0);
                        class68.method521(0, 21, class18.field481, false, 0, class111.method786((byte) -116, new class150[] { class3.field59, var7 }), 0);
                        class28.field848++;
                    }
                }
                if (var6 == 4 && (class134.field3149 == 0 || class134.field3149 == 1 && class133.method994(var7, false))) {
                    var3++;
                    if (var5 - 14 < arg0 && arg0 <= var5) {
                        class86.field2040++;
                        class68.method521(0, 18, class21.field551, false, 0, class111.method786((byte) -118, new class150[] { class3.field59, var7 }), 0);
                    }
                }
                if ((var6 == 5 || var6 == 6) && class119.field2755 == 0 && class6.field151 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class134.field3149 == 0 || class134.field3149 == 1 && class133.method994(var7, false))) {
                    if (var5 - 14 < arg0 && arg0 <= var5) {
                        class35.field970++;
                        class68.method521(0, 45, class95.field2207, false, 0, class111.method786((byte) 19, new class150[] { class3.field59, var7 }), 0);
                    }
                    var3++;
                }
            }
        }
    }
}
