import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class73 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "J")
    public long field1278 = 0L;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lbb;")
    public static class49 field1267 = new class49();

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1281 = -1;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Z")
    public static boolean field1282 = false;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lda;")
    public class312 field1262;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
    public static int[] field1283;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)I")
    public static final int method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1277++;
        int var7 = arg4 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg6;
            arg6 = var8;
        }
        if (~var7 == arg2) {
            return arg1;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg3;
        } else if (var7 == 2) {
            return -arg6 - (-(7 - arg1) - 1);
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)[Lmd;")
    public static final class273[] method514(int arg0) {
        field1285++;
        class273[] var1 = new class273[class206.field3317];
        int var2 = -37 % ((48 - arg0) / 33);
        for (int var3 = 0; var3 < class206.field3317; var3++) {
            int var4 = class43.field656[var3] * class297.field4859[var3];
            byte[] var5 = class289.field4758[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class185.field2952[class15.method84(255, var5[var7])];
            }
            var1[var3] = new class92(class134.field2214, class253.field4293, class49.field842[var3], field1283[var3], class297.field4859[var3], class43.field656[var3], var6);
        }
        class155.method1175(-113);
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
    public static final void method515(int arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class111.field1832;
        int var4 = var3.length;
        field1274++;
        int var5 = 0;
        if (arg0 != -18757) {
            method515(-71, false);
        }
        while (var5 < var4) {
            byte[] var11 = var3[var5];
            int var12 = class184.field2947[var5] & 0xFF;
            int[] var13 = null;
            int var14 = class184.field2947[var5] >> 8;
            int var15 = var14 * 64 - class26.field462;
            int var16 = var12 * 64 - class78.field1313;
            if (var11 != null) {
                class159.method1187(-659813974);
                var13 = class110.method828(var15, arg1, class225.field3790, class78.field1313, (byte) 63, class26.field462, var16, var11);
            }
            if (!arg1 && class263.field4395 / 8 == var14 && (class260.field4363 / 8) == var12) {
                if (var13 == null) {
                    class183.field2927 = -1;
                } else {
                    class261.field4379 = var13[3];
                    class259.field4356 = var13[2];
                    class183.field2927 = var13[0];
                    class146.field2412 = var13[1];
                    class116.field1980 = var13[4];
                }
            }
            var5++;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class184.field2947[var6] >> 8) * 64 - class26.field462;
            int var8 = (class184.field2947[var6] & 0xFF) * 64 - class78.field1313;
            byte[] var9 = var3[var6];
            if (var9 == null && class260.field4363 < 800) {
                class159.method1187(arg0 ^ 0x2753BF11);
                for (int var10 = 0; var10 < var2; var10++) {
                    class299.method2048(arg0 ^ 0xFFFFB6FF, var7, var10, 64, 64, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method516(boolean arg0) {
        field1283 = null;
        if (!arg0) {
            field1286 = -10;
        }
        field1267 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method517(int arg0, String arg1) {
        if (arg0 == -1) {
            field1263++;
            return arg1.length() + 1;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IZ)V")
    public static final void method518(int arg0, boolean arg1) {
        if (!arg1) {
            class238.field4007.method98(1, arg0);
            class32.field525.method98(1, arg0);
            field1279++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILuf;)V")
    public static final void method519(int arg0, class46 arg1) {
        field1264++;
        if (class275.field4598 == arg1.field708 || arg1.field761 == -1 || arg1.field791 != 0 || arg1.field784 + 1 > class34.method211(arg1.field761, 3).field2638[arg1.field719]) {
            int var2 = arg1.field708 - arg1.field765;
            int var3 = class275.field4598 - arg1.field765;
            int var4 = arg1.field778 * 128 + arg1.method294((byte) -123) * 64;
            int var5 = arg1.field734 * 128 + (arg1.method294((byte) -109) * 64);
            int var6 = arg1.field750 * 128 + (arg1.method294((byte) -128) * 64);
            int var7 = arg1.field796 * 128 + arg1.method294((byte) -115) * 64;
            arg1.field715 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field771 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field812 == 0) {
            arg1.field776 = 1024;
        }
        if (arg1.field812 == 1) {
            arg1.field776 = 1536;
        }
        if (arg1.field812 == 2) {
            arg1.field776 = 0;
        }
        if (arg1.field812 == 3) {
            arg1.field776 = 512;
        }
        arg1.field725 = arg0;
        arg1.field753 = arg1.field776;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static final void method520(byte arg0) {
        field1275++;
        int var1 = class58.field1020;
        int var2 = class213.field3596;
        int var3 = class275.field4604;
        int var4 = class263.field4398;
        int var5 = 6116423;
        int var6 = 117 / ((-arg0 - 69) / 54);
        class211.method1483(var2, var1, var3, var4, var5);
        class211.method1483(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class211.method1477(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class183.field2930.method1234(class90.field1497, var2 + 3, var1 - -14, var5, -1);
        int var7 = class96.field1558;
        int var8 = class87.field1448;
        for (int var9 = 0; var9 < class287.field4747; var9++) {
            int var10 = var1 + ((class287.field4747 - var9 - 1) * 15) + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var3 && var8 > var10 - 13 && var10 + 3 > var8) {
                var11 = 16776960;
            }
            class183.field2930.method1234(class123.method933(var9, true), var2 + 3, var10, var11, 0);
        }
        class158.method1183(class213.field3596, -62, class263.field4398, class58.field1020, class275.field4604);
    }
}
