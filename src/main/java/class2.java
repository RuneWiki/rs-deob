import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 implements class231 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lf;")
    private class227 field15 = new class227(256);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lsb;")
    private class124 field11;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lsb;")
    private class124 field25;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[Lkb;")
    private class79[] field10;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lic;")
    public static class160 field12 = new class160(64);

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
    public static int[] field22 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lsb;")
    public static class124 field21;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[[[Lre;")
    public static class266[][][] field23;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(II)V")
    public static final void method5(int arg0, int arg1) {
        field16++;
        int var2 = class31.field527;
        int var3 = class150.field2457;
        int var4 = class148.field2434;
        int var5 = class212.field3400;
        int var6 = (int) class161.field2619;
        if (var6 < (class72.field1198 / 256)) {
            var6 = class72.field1198 / 256;
        }
        int var7 = class146.field2408;
        if (class269.field4319[4] && (class272.field4348[4] + 128) > var6) {
            var6 = class272.field4348[4] + 128;
        }
        int var8 = (int) class1.field1 + class180.field3001 & 0x7FF;
        class274.method1858(class260.field4134, -1, var6, var8, class29.field507, (var6 * 3) + 600, class218.method1450(class48.field878.field2887, class48.field878.field2849, true, class92.field1448) - 50, arg1);
        if (class31.field527 == var2 && class150.field2457 == var3 && class148.field2434 == var4 && class146.field2408 == var7 && class212.field3400 == var5) {
            class184.field3033 = 1;
            return;
        }
        class108.field1651 = 10;
        class23.field364 = 10;
        if (arg0 != 2) {
            return;
        }
        int var9 = class212.field3400 - var5;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        class260.field4131 = 10;
        if (var7 < class146.field2408) {
            var7 += (class146.field2408 - var7) * class108.field1651 / 1000 + class260.field4131;
            if (var7 < class146.field2408) {
                class146.field2408 = var7;
            }
        }
        if (var7 > class146.field2408) {
            int var10 = var7 - ((var7 - class146.field2408) * class108.field1651 / 1000 + class260.field4131);
            if (var10 > class146.field2408) {
                class146.field2408 = var10;
            }
        }
        class291.field4632 = 10;
        if (var9 > 0) {
            int var11 = class108.field1651 * var9 / 1000 + class260.field4131 + var5;
            var5 = var11 & 0x7FF;
        }
        if (var2 < class31.field527) {
            var2 += (class31.field527 - var2) * class23.field364 / 1000 + class291.field4632;
            if (class31.field527 > var2) {
                class31.field527 = var2;
            }
        }
        if (var9 < 0) {
            int var12 = var5 - (-var9 * class108.field1651 / 1000 + class260.field4131);
            var5 = var12 & 0x7FF;
        }
        if (var3 < class150.field2457) {
            var3 += (class150.field2457 - var3) * class23.field364 / 1000 + class291.field4632;
            if (var3 < class150.field2457) {
                class150.field2457 = var3;
            }
        }
        int var13 = class212.field3400 - var5;
        if (class148.field2434 > var4) {
            var4 += class291.field4632 + ((class148.field2434 - var4) * class23.field364 / 1000);
            if (var4 < class148.field2434) {
                class148.field2434 = var4;
            }
        }
        if (var4 > class148.field2434) {
            int var14 = var4 - ((var4 - class148.field2434) * class23.field364 / 1000 + class291.field4632);
            if (class148.field2434 < var14) {
                class148.field2434 = var14;
            }
        }
        if (var3 > class150.field2457) {
            int var15 = var3 - ((var3 - class150.field2457) * class23.field364 / 1000 + class291.field4632);
            if (var15 > class150.field2457) {
                class150.field2457 = var15;
            }
        }
        if (class31.field527 < var2) {
            int var16 = var2 - ((var2 - class31.field527) * class23.field364 / 1000 + class291.field4632);
            if (class31.field527 < var16) {
                class31.field527 = var16;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 >= 0 || var9 <= 0 || var13 > 0 && var9 < 0) {
            class212.field3400 = var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
    public static final int method6(byte arg0) {
        if (arg0 != 28) {
            method5(-84, -119);
        }
        field18++;
        return class232.field3678 && class13.field184[81] && class42.field776 > 2 ? class251.field3993[class42.field776 - 2] : class251.field3993[class42.field776 - 1];
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(II)Lkb;")
    public final class79 method7(int arg0, int arg1) {
        field14++;
        if (arg0 < 38) {
            field22 = null;
        }
        return this.field10[arg1];
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(II)Z")
    public final boolean method8(int arg0, int arg1) {
        field20++;
        class28 var3 = this.method11(-125, arg1);
        if (arg0 != -11006) {
            this.field11 = null;
        }
        return var3 != null && var3.method252(this.field25, (byte) 88, this);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method9(byte arg0) {
        field12 = null;
        field21 = null;
        if (arg0 <= 72) {
            field12 = null;
        }
        field22 = null;
        field23 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method10(int arg0) {
        class143.field2360.method608(1);
        field17++;
        int var1 = class143.field2360.method612(1, -124);
        if (var1 == 0) {
            return;
        }
        int var2 = class143.field2360.method612(2, -121);
        if (var2 == 0) {
            class200.field3251[class254.field4039++] = 2047;
        } else if (var2 == 1) {
            int var3 = class143.field2360.method612(3, -126);
            class48.field878.method1228(var3, false, 1);
            int var4 = class143.field2360.method612(1, -124);
            if (var4 == 1) {
                class200.field3251[class254.field4039++] = 2047;
            }
        } else if (var2 == 2) {
            if (class143.field2360.method612(1, -119) == 1) {
                int var5 = class143.field2360.method612(3, -119);
                class48.field878.method1228(var5, false, 2);
                int var6 = class143.field2360.method612(3, -124);
                class48.field878.method1228(var6, false, 2);
            } else {
                int var7 = class143.field2360.method612(3, -124);
                class48.field878.method1228(var7, false, 0);
            }
            int var8 = class143.field2360.method612(1, -123);
            if (var8 == 1) {
                class200.field3251[class254.field4039++] = 2047;
            }
        } else {
            if (arg0 >= -22) {
                method6((byte) -61);
            }
            if (var2 == 3) {
                class92.field1448 = class143.field2360.method612(2, -126);
                int var9 = class143.field2360.method612(1, -122);
                int var10 = class143.field2360.method612(1, -125);
                if (var10 == 1) {
                    class200.field3251[class254.field4039++] = 2047;
                }
                int var11 = class143.field2360.method612(7, -127);
                int var12 = class143.field2360.method612(7, -123);
                class48.field878.method1409(var12, (byte) -71, var9 == 1, var11);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(II)Lmf;")
    public class28 method11(int arg0, int arg1) {
        if (arg0 > -99) {
            this.field10 = null;
        }
        field13++;
        class112 var3 = this.field15.method1518((long) arg1, 109);
        if (var3 != null) {
            return (class28) var3;
        }
        byte[] var4 = this.field11.method897(false, arg1);
        if (var4 == null) {
            return null;
        } else {
            class28 var5 = new class28(new class136(var4));
            this.field15.method1514(false, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIZIF)[I")
    public final int[] method12(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        if (arg2 == 2048) {
            field19++;
            return this.method11(-114, arg0).method247(arg3, this.field25, -256, this.field10[arg0].field1315, arg1, arg4, (double) arg5, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lsb;Lsb;Lsb;)V")
    public class2(class124 arg0, class124 arg1, class124 arg2) {
        this.field11 = arg1;
        this.field25 = arg2;
        class136 var4 = new class136(arg0.method900(0, 0, false));
        int var5 = var4.method996(65280);
        this.field10 = new class79[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1012(4) == 1) {
                this.field10[var6] = new class79();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field10[var7] != null) {
                this.field10[var7].field1312 = var4.method1012(4) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field10[var8] != null) {
                this.field10[var8].field1318 = var4.method1012(4) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field10[var9] != null) {
                this.field10[var9].field1314 = var4.method1012(4) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field10[var10] != null) {
                var4.method1012(4);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field10[var11] != null) {
                var4.method981(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field10[var12] != null) {
                var4.method981(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field10[var13] != null) {
                var4.method981(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field10[var14] != null) {
                var4.method981(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field10[var15] != null) {
                this.field10[var15].field1311 = (short) var4.method996(65280);
            }
        }
        if (var4.field2263.length > var4.field2231) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field10[var16] != null) {
                    var4.method981(false);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field10[var17] != null) {
                    var4.method981(false);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field10[var18] != null) {
                    var4.method1012(4);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field10[var19] != null) {
                    this.field10[var19].field1315 = var4.method1012(4) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field10[var20] != null) {
                    var4.method981(false);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field10[var21] != null) {
                    var4.method1012(4);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field10[var22] != null) {
                    var4.method1012(4);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field10[var23] != null) {
                    var4.method1012(4);
                }
            }
        }
    }
}
