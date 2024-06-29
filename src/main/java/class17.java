import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class17 extends class50 {

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lo;")
    public static class84 field305 = class15.method124("Login", 255);

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lo;")
    public static class84 field312 = class15.method124("white:", 255);

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lo;")
    public static class84 field315 = class15.method124("button near the top of that page)3", 255);

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static volatile int field306 = 0;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lo;")
    public static class84 field310 = class15.method124("Connection timed out", 255);

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lo;")
    public static class84 field316 = class15.method124("Moderator option: Mute player for 48 hours: <ON>", 255);

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Z")
    public static boolean field309 = false;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lo;")
    public static class84 field317 = class15.method124("Loading sprites )2 ", 255);

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lo;")
    public static class84 field300 = class15.method124("Add friend @whi@", 255);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lqb;")
    public static class96 field297;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lqb;")
    public static class96 field298;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lqb;")
    public static class96 field311;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[I")
    public static int[] field299;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "[[[B")
    public static byte[][][] field319;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIJ)Z", line = 8)
    public final boolean method132(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method141(arg0, arg1, arg2, arg3);
                int var6 = arg0 & 0xF;
                class61.field1261[var6] = 12800;
                int var7 = method137(var6);
                this.method141(arg0, 7, var7 >> 7, arg3);
                this.method141(arg0, 39, var7 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var8 = arg0 & 0xF;
                if (arg1 == 7) {
                    class61.field1261[var8] = (arg2 << 7) + (class61.field1261[var8] & 0x7F);
                } else {
                    class61.field1261[var8] = (class61.field1261[var8] & 0x3F80) + arg2;
                }
                int var9 = method137(var8);
                this.method141(arg0, 7, var9 >> 7, arg3);
                this.method141(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BJ)V", line = 49)
    public static final void method133(byte arg0, long arg1) {
        field307++;
        if (arg1 == 0L) {
            return;
        }
        if (class118.field2629 >= 100) {
            class67.method514(0, class73.field1524, class71.field1506, true);
            return;
        }
        class84 var3 = class57.method463(arg1, (byte) 115).method637(true);
        for (int var4 = 0; var4 < class118.field2629; var4++) {
            if (class103.field2166[var4] == arg1) {
                class67.method514(0, class73.field1524, class97.method746(0, new class84[] { var3, class84.field1872 }), true);
                return;
            }
        }
        for (int var5 = 0; var5 < class27.field537; var5++) {
            if (class26.field442[var5] == arg1) {
                class67.method514(0, class73.field1524, class97.method746(0, new class84[] { class60.field1258, var3, class67.field1456 }), true);
                return;
            }
        }
        if (var3.method654(-10, class107.field2271.field1312)) {
            return;
        }
        class103.field2166[class118.field2629++] = arg1;
        if (arg0 == 45) {
            class60.field1242++;
            class39.field798 = true;
            class97.field2070.method979(1, 186);
            class97.field2070.method203(-24628, arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 107)
    public static final void method134(int arg0) {
        field295++;
        if (arg0 != 4) {
            method142(null, null, null, (byte) 96);
        }
        for (int var1 = 0; var1 < class62.field1290; var1++) {
            int var2 = class117.field2552[var1];
            class63 var3 = class119.field2643[var2];
            int var4 = class65.field1405.method231(arg0 + 251);
            if ((var4 & 0x4) != 0) {
                var4 += class65.field1405.method231(255) << 8;
            }
            class60.method481(var2, var3, var4, -31566);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIJI)V", line = 136)
    public final void method135(int arg0, int arg1, long arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg3 * 5.0E-4D) * (double) arg1 + 0.5D);
        if (arg0 != -65) {
            field299 = null;
        }
        field308++;
        if (class112.field2429 == var6) {
            return;
        }
        class112.field2429 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method137(var7);
            this.method141(var7 + 176, 7, var8 >> 7, arg2);
            this.method141(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)V", line = 166)
    public final void method136(long arg0, byte arg1) {
        field318++;
        if (arg1 != 69) {
            field298 = null;
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.method141(var4 + 176, 123, 0, arg0);
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method141(var5 + 176, 120, 0, arg0);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method141(var6 + 176, 121, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method141(var7 + 176, 0, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method141(var8 + 176, 32, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method141(var9 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)I", line = 228)
    private static final int method137(int arg0) {
        int var1 = class61.field1261[arg0];
        int var2 = (class112.field2429 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BJ)V", line = 238)
    public final void method138(byte arg0, long arg1) {
        field296++;
        class112.field2429 = 256;
        int var4 = -108 % ((-arg0 - 40) / 35);
        for (int var5 = 0; var5 < 16; var5++) {
            class61.field1261[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method141(var6 + 176, 7, 100, arg1);
            this.method141(var6 + 176, 39, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Lo;", line = 266)
    public static final class84 method139(int arg0, byte arg1, int arg2) {
        field303++;
        if (arg1 != 9) {
            field302 = -48;
        }
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class45.field971;
        } else if (var3 < -6) {
            return class25.field428;
        } else if (var3 < -3) {
            return class88.field1987;
        } else if (var3 < 0) {
            return class25.field429;
        } else if (var3 > 9) {
            return class119.field2638;
        } else if (var3 > 6) {
            return class120.field2668;
        } else if (var3 > 3) {
            return class26.field454;
        } else if (var3 > 0) {
            return class64.field1350;
        } else {
            return class37.field719;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIBI)I", line = 316)
    public static final int method140(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 <= 60) {
            field301 = -88;
        }
        if ((arg2 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        field304++;
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg1 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lud;Ljava/awt/Component;Lud;B)V", line = 373)
    public static final void method142(class118 arg0, Component arg1, class118 arg2, byte arg3) {
        field314++;
        if (class86.field1955) {
            return;
        }
        class73.field1545 = class101.method763(128, arg1, -8, 265);
        class32.method288();
        class117.field2567 = class101.method763(128, arg1, -8, 265);
        class32.method288();
        class73.field1527 = class101.method763(509, arg1, -8, 171);
        class32.method288();
        class41.field839 = class101.method763(360, arg1, -8, 132);
        class32.method288();
        class128.field2836 = class101.method763(360, arg1, -8, 200);
        class32.method288();
        class26.field450 = class101.method763(202, arg1, -8, 238);
        class32.method288();
        class97.field2068 = class101.method763(203, arg1, -8, 238);
        class32.method288();
        class79.field1676 = class101.method763(74, arg1, -8, 94);
        class32.method288();
        class3.field42 = class101.method763(75, arg1, -8, 94);
        class32.method288();
        byte[] var4 = arg2.method910(class75.field1572, (byte) 125, class105.field2231);
        class121 var5 = new class121(var4, arg1);
        class73.field1545.method707(-54);
        var5.method942(0, 0);
        class117.field2567.method707(-59);
        var5.method942(-637, 0);
        class73.field1527.method707(-106);
        var5.method942(-128, 0);
        class41.field839.method707(-62);
        var5.method942(-202, -371);
        class128.field2836.method707(-119);
        var5.method942(-202, -171);
        class26.field450.method707(-75);
        var5.method942(0, -265);
        class97.field2068.method707(-110);
        var5.method942(-562, -265);
        class79.field1676.method707(-81);
        var5.method942(-128, -171);
        class3.field42.method707(-79);
        var5.method942(-562, -171);
        int[] var6 = new int[var5.field2709];
        for (int var7 = 0; var7 < var5.field2704; var7++) {
            for (int var23 = 0; var23 < var5.field2709; var23++) {
                var6[var23] = var5.field2705[var5.field2709 * var7 + var5.field2709 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field2709; var24++) {
                var5.field2705[var5.field2709 * var7 + var24] = var6[var24];
            }
        }
        class73.field1545.method707(-65);
        var5.method942(382, 0);
        class117.field2567.method707(-86);
        var5.method942(-255, 0);
        class73.field1527.method707(-64);
        var5.method942(254, 0);
        class41.field839.method707(-89);
        var5.method942(180, -371);
        class128.field2836.method707(-89);
        var5.method942(180, -171);
        class26.field450.method707(-104);
        var5.method942(382, -265);
        class97.field2068.method707(-60);
        var5.method942(-180, -265);
        class79.field1676.method707(-53);
        var5.method942(254, -171);
        class3.field42.method707(-82);
        var5.method942(-180, -171);
        class121 var8 = class123.method958(class85.field1950, class105.field2231, -104, arg0);
        class73.field1527.method707(-76);
        var8.method947(382 - var8.field2709 / 2 - 128, 18);
        class116.field2534 = class118.method918(arg0, true, class105.field2231, class4.field61);
        class38.field751 = class118.method918(arg0, true, class105.field2231, class115.field2504);
        class58.field1199 = class5.method22(arg0, class100.field2117, (byte) -58, class105.field2231);
        class12.field243 = new class121(128, 265);
        class115.field2496 = new class121(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class12.field243.field2705[var9] = class73.field1545.field2015[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class115.field2496.field2705[var10] = class117.field2567.field2015[var10];
        }
        class44.field925 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class44.field925[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class44.field925[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class44.field925[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class44.field925[var14 + 192] = 16777215;
        }
        class82.field1768 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class82.field1768[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class82.field1768[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class82.field1768[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class82.field1768[var18 + 192] = 16777215;
        }
        class84.field1895 = new int[256];
        if (arg3 > -45) {
            return;
        }
        for (int var19 = 0; var19 < 64; var19++) {
            class84.field1895[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class84.field1895[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class84.field1895[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class84.field1895[var22 + 192] = 16777215;
        }
        field299 = new int[32768];
        class111.field2416 = new int[256];
        class5.field98 = new int[32768];
        class30.method265(true, null);
        class105.field2224 = class105.field2231;
        class105.field2210 = class105.field2231;
        class110.field2383 = 0;
        class1.field1 = new int[32768];
        class123.field2761 = new int[32768];
        if (class8.field155 == 0 || class1.field23) {
            class113.method869(10, -98);
        } else {
            class113.method875(class14.field254, class105.field2231, class104.field2197, 10, false, 0, class8.field155, 2);
        }
        class51.method441(false, -23689);
        class86.field1955 = true;
        class1.field5 = true;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V", line = 604)
    public static void method143(int arg0) {
        field305 = null;
        field319 = null;
        field297 = null;
        field316 = null;
        field298 = null;
        field317 = null;
        if (arg0 >= -98) {
            field312 = null;
        }
        field312 = null;
        field310 = null;
        field299 = null;
        field315 = null;
        field311 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIJ)V")
    public abstract void method141(int arg0, int arg1, int arg2, long arg3);
}
