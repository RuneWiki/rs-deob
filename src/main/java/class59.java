import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 extends class128 {

    @OriginalMember(owner = "client!je", name = "Jb", descriptor = "La;")
    private static class1 field1484 = class113.method934(-11538, "Could not complete login)3");

    @OriginalMember(owner = "client!je", name = "Lb", descriptor = "[I")
    public static int[] field1486 = new int[25];

    @OriginalMember(owner = "client!je", name = "Pb", descriptor = "La;")
    public static class1 field1490 = class113.method934(-11538, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!je", name = "Qb", descriptor = "[Z")
    public static boolean[] field1491 = new boolean[112];

    @OriginalMember(owner = "client!je", name = "Ob", descriptor = "La;")
    private static class1 field1489 = class113.method934(-11538, "Members object");

    @OriginalMember(owner = "client!je", name = "Tb", descriptor = "La;")
    private static class1 field1494 = class113.method934(-11538, "Too many connections from your address)3");

    @OriginalMember(owner = "client!je", name = "Ub", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "client!je", name = "Kb", descriptor = "La;")
    public static class1 field1485 = field1494;

    @OriginalMember(owner = "client!je", name = "Zb", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!je", name = "Wb", descriptor = "La;")
    public static class1 field1497 = class113.method934(-11538, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!je", name = "cc", descriptor = "La;")
    public static class1 field1503 = class113.method934(-11538, " )2> @whi@");

    @OriginalMember(owner = "client!je", name = "ac", descriptor = "La;")
    public static class1 field1501 = field1484;

    @OriginalMember(owner = "client!je", name = "dc", descriptor = "La;")
    public static class1 field1504 = field1489;

    @OriginalMember(owner = "client!je", name = "fc", descriptor = "La;")
    public static class1 field1506 = class113.method934(-11538, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!je", name = "Nb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!je", name = "Rb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!je", name = "Sb", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!je", name = "Vb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!je", name = "Xb", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!je", name = "Yb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!je", name = "bc", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!je", name = "ec", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method567(boolean arg0) {
        field1499++;
        int var1 = class98.field2412 + class104.field2624.field1966;
        if (arg0) {
            method570(true, null);
        }
        int var2 = class8.field297 + class104.field2624.field1975;
        if (class46.field1196 - var2 < -500 || class46.field1196 - var2 > 500 || class74.field1842 - var1 < -500 || class74.field1842 - var1 > 500) {
            class74.field1842 = var1;
            class46.field1196 = var2;
        }
        if (class46.field1196 != var2) {
            class46.field1196 += (var2 - class46.field1196) / 16;
        }
        if (class74.field1842 != var1) {
            class74.field1842 += (var1 - class74.field1842) / 16;
        }
        if (field1491[96]) {
            class17.field545 += (-class17.field545 - 24) / 2;
        } else if (field1491[97]) {
            class17.field545 += (24 - class17.field545) / 2;
        } else {
            class17.field545 /= 2;
        }
        if (field1491[98]) {
            class118.field2950 += (12 - class118.field2950) / 2;
        } else if (field1491[99]) {
            class118.field2950 += (-class118.field2950 - 12) / 2;
        } else {
            class118.field2950 /= 2;
        }
        int var3 = class74.field1842 >> 7;
        class113.field2800 = class17.field545 / 2 + class113.field2800 & 0x7FF;
        int var4 = class46.field1196 >> 7;
        class131.field3207 += class118.field2950 / 2;
        int var5 = 0;
        if (class131.field3207 < 128) {
            class131.field3207 = 128;
        }
        if (class131.field3207 > 383) {
            class131.field3207 = 383;
        }
        int var6 = class78.method715((byte) -124, class2.field76, class46.field1196, class74.field1842);
        if (var4 > 3 && var3 > 3 && var4 < 100 && var3 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class2.field76;
                    if (var9 < 3 && (class34.field899[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class57.field1454[var9][var7][var8];
                    if (var10 > var5) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class57.field1462 < var11) {
            class57.field1462 += (var11 - class57.field1462) / 24;
        } else if (class57.field1462 > var11) {
            class57.field1462 += (var11 - class57.field1462) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Lpa;", line = 119)
    public final class91 method42(int arg0) {
        field1487++;
        int var2 = 58 % ((41 - arg0) / 47);
        return class89.method763(this.field1502, 10).method957(true, this.field1493, 26910);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 135)
    public static final void method568(byte arg0) {
        field1488++;
        if (arg0 > -79) {
            method571(null, false, null, null);
        }
        if (class63.field1590 != 0 || class122.field3053 != 1) {
            return;
        }
        int var1 = class112.field2765 - 575;
        int var2 = class1.field14 - 4 - 5;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var2 -= 75;
        var1 -= 73;
        int var3 = class86.field2161 + class113.field2800 & 0x7FF;
        int var4 = class27.field776[var3];
        int var5 = class27.field779[var3];
        int var6 = (class103.field2592 + 256) * var5 >> 8;
        int var7 = (class103.field2592 + 256) * var4 >> 8;
        int var8 = var2 * var7 + var1 * var6 >> 11;
        int var9 = var2 * var6 - var1 * var7 >> 11;
        int var10 = class104.field2624.field1975 + var8 >> 7;
        int var11 = class104.field2624.field1966 - var9 >> 7;
        boolean var12 = class60.method579(0, 0, class104.field2624.field1965[0], var10, (byte) 125, 0, true, 0, 0, class104.field2624.field2012[0], var11, 1);
        if (!var12) {
            return;
        }
        class70.field1729.method142(var1, (byte) -128);
        class70.field1729.method142(var2, (byte) -128);
        class70.field1729.method151(class113.field2800, -126);
        class70.field1729.method142(57, (byte) -128);
        class70.field1729.method142(class86.field2161, (byte) -128);
        class70.field1729.method142(class103.field2592, (byte) -128);
        class70.field1729.method142(89, (byte) -128);
        class70.field1729.method151(class104.field2624.field1975, 120);
        class70.field1729.method151(class104.field2624.field1966, -125);
        class70.field1729.method142(class114.field2812, (byte) -128);
        class70.field1729.method142(63, (byte) -128);
        return;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)La;", line = 214)
    public static final class1 method569(int arg0, int arg1) {
        field1505++;
        class1 var2 = new class1();
        var2.field38 = new byte[arg1];
        if (arg0 != -18596) {
            field1500 = 36;
        }
        var2.field26 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLwa;)V", line = 237)
    public static final void method570(boolean arg0, class132 arg1) {
        class95.field2360 = arg1;
        field1498++;
        if (!arg0) {
            method567(true);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;ZLbd;Lbd;)V", line = 257)
    public static final void method571(Component arg0, boolean arg1, class11 arg2, class11 arg3) {
        field1492++;
        if (class39.field1063) {
            return;
        }
        class14.field473 = class104.method878(265, 128, arg0, -4875);
        class111.method923();
        class54.field1438 = class104.method878(265, 128, arg0, -4875);
        class111.method923();
        class81.field2047 = class104.method878(171, 509, arg0, -4875);
        class111.method923();
        class103.field2611 = class104.method878(132, 360, arg0, -4875);
        class111.method923();
        class79.field1938 = class104.method878(200, 360, arg0, -4875);
        class111.method923();
        class31.field845 = class104.method878(238, 202, arg0, -4875);
        class111.method923();
        class107.field2704 = class104.method878(238, 203, arg0, -4875);
        class111.method923();
        class49.field1309 = class104.method878(94, 74, arg0, -4875);
        class111.method923();
        class134.field3301 = class104.method878(94, 75, arg0, -4875);
        class111.method923();
        byte[] var4 = arg2.method216(class123.field3070, class70.field1754, 1);
        class58 var5 = new class58(var4, arg0);
        class14.field473.method1057((byte) 90);
        var5.method560(0, 0);
        class54.field1438.method1057((byte) 90);
        var5.method560(-637, 0);
        class81.field2047.method1057((byte) 90);
        var5.method560(-128, 0);
        class103.field2611.method1057((byte) 90);
        var5.method560(-202, -371);
        class79.field1938.method1057((byte) 90);
        var5.method560(-202, -171);
        class31.field845.method1057((byte) 90);
        var5.method560(0, -265);
        class107.field2704.method1057((byte) 90);
        var5.method560(-562, -265);
        class49.field1309.method1057((byte) 90);
        var5.method560(-128, -171);
        class134.field3301.method1057((byte) 90);
        var5.method560(-562, -171);
        int[] var6 = new int[var5.field1479];
        for (int var7 = 0; var7 < var5.field1478; var7++) {
            for (int var23 = 0; var23 < var5.field1479; var23++) {
                var6[var23] = var5.field1483[var5.field1479 * var7 + var5.field1479 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field1479; var24++) {
                var5.field1483[var5.field1479 * var7 + var24] = var6[var24];
            }
        }
        class14.field473.method1057((byte) 90);
        var5.method560(382, 0);
        class54.field1438.method1057((byte) 90);
        var5.method560(-255, 0);
        class81.field2047.method1057((byte) 90);
        var5.method560(254, 0);
        class103.field2611.method1057((byte) 90);
        var5.method560(180, -371);
        class79.field1938.method1057((byte) 90);
        var5.method560(180, -171);
        class31.field845.method1057((byte) 90);
        var5.method560(382, -265);
        class107.field2704.method1057((byte) 90);
        var5.method560(-180, -265);
        class49.field1309.method1057((byte) 90);
        var5.method560(254, -171);
        class134.field3301.method1057((byte) 90);
        var5.method560(-180, -171);
        class58 var8 = class132.method1041(arg3, client.field584, (byte) 21, class123.field3070);
        class81.field2047.method1057((byte) 90);
        var8.method554(382 - var8.field1479 / 2 - 128, 18);
        class114.field2809 = class63.method608(class47.field1247, class123.field3070, arg3, (byte) -64);
        class117.field2922 = class63.method608(class39.field1057, class123.field3070, arg3, (byte) -64);
        class45.field1179 = class28.method373(arg3, (byte) -114, class14.field474, class123.field3070);
        class81.field2058 = new class58(128, 265);
        class32.field852 = new class58(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class81.field2058.field1483[var9] = class14.field473.field3291[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class32.field852.field1483[var10] = class54.field1438.field3291[var10];
        }
        class103.field2603 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class103.field2603[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class103.field2603[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class103.field2603[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class103.field2603[var14 + 192] = 16777215;
        }
        class128.field3142 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class128.field3142[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class128.field3142[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class128.field3142[var17 + 128] = var17 * 262144 + 65535;
        }
        if (!arg1) {
            method571(null, false, null, null);
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class128.field3142[var18 + 192] = 16777215;
        }
        class116.field2907 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class116.field2907[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class116.field2907[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class116.field2907[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class116.field2907[var22 + 192] = 16777215;
        }
        class85.field2154 = new int[256];
        class121.field3028 = new int[32768];
        class102.field2573 = new int[32768];
        class127.method1013(-4487, null);
        class116.field2914 = new int[32768];
        class123.field3058 = class123.field3070;
        class123.field3074 = class123.field3070;
        class6.field230 = new int[32768];
        class53.field1398 = 0;
        if (class62.field1557 == 0 || class93.field2335) {
            class72.method675(16969, 10);
        } else {
            class72.method682(false, class108.field2705, 0, (byte) 66, class67.field1694, 10, class123.field3070, class62.field1557);
        }
        class64.method620(false, 24041);
        class97.field2405 = true;
        class39.field1063 = true;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V", line = 478)
    public static void method572(int arg0) {
        if (arg0 != 24399) {
            method571(null, false, null, null);
        }
        field1491 = null;
        field1489 = null;
        field1485 = null;
        field1494 = null;
        field1504 = null;
        field1497 = null;
        field1501 = null;
        field1503 = null;
        field1486 = null;
        field1490 = null;
        field1484 = null;
        field1506 = null;
    }
}
