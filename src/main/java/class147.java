import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lsc;")
    public static class128 field3401 = class129.method1017(false, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3402 = 1;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lsc;")
    private static class128 field3399 = class129.method1017(false, "flash2:");

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lsc;")
    public static class128 field3409 = field3399;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lsc;")
    public static class128 field3406 = class129.method1017(false, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[Z")
    public static boolean[] field3407 = new boolean[112];

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lsc;")
    public static class128 field3404 = field3399;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lsc;")
    public static class128 field3408 = class129.method1017(false, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3413 = -1;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lsc;")
    public static class128 field3405 = class129.method1017(false, ":trade:");

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lsa;")
    public static class126 field3403;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lua;")
    public static class140 field3396;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lae;")
    public static class6 field3397;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field3406 = null;
        field3409 = null;
        field3408 = null;
        int var1 = -108 / ((arg0 - 55) / 63);
        field3405 = null;
        field3407 = null;
        field3404 = null;
        field3401 = null;
        field3397 = null;
        field3396 = null;
        field3403 = null;
        field3399 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLhe;I)I")
    public static final int method1183(boolean arg0, class54 arg1, int arg2) {
        if (!arg0) {
            field3408 = null;
        }
        field3414++;
        if (arg1.field1208 == null || arg2 >= arg1.field1208.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1208[arg2];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var3[var6++];
                if (var9 == 0) {
                    return var4;
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 1) {
                    var7 = class6.field75[var3[var6++]];
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 2) {
                    var7 = class64.field1372[var3[var6++]];
                }
                if (var9 == 3) {
                    var7 = class152.field3509[var3[var6++]];
                }
                if (var9 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class54 var12 = class46.method338(var11, -108);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class27.method230((byte) -44, var13).field1375 || class40.field740)) {
                        for (int var14 = 0; var14 < var12.field1144.length; var14++) {
                            if (var13 + 1 == var12.field1144[var14]) {
                                var7 += var12.field1203[var14];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var7 = class126.field2849[var3[var6++]];
                }
                if (var9 == 6) {
                    var7 = class149.field3434[class64.field1372[var3[var6++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class126.field2849[var3[var6++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class151.field3473.field1064;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class43.field805[var15]) {
                            var7 += class64.field1372[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class54 var18 = class46.method338(var17, -101);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class27.method230((byte) -44, var19).field1375 || class40.field740)) {
                        for (int var20 = 0; var20 < var18.field1144.length; var20++) {
                            if (var19 + 1 == var18.field1144[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class1.field13;
                }
                if (var9 == 12) {
                    var7 = class152.field3506;
                }
                if (var9 == 13) {
                    int var21 = class126.field2849[var3[var6++]];
                    int var22 = var3[var6++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var3[var6++];
                    var7 = class66.method494(var23, 104);
                }
                if (var9 == 18) {
                    var7 = (class151.field3473.field975 >> 7) + class62.field1325;
                }
                if (var9 == 19) {
                    var7 = (class151.field3473.field987 >> 7) + class66.field1482;
                }
                if (var9 == 20) {
                    var7 = var3[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var4 += var7;
                    }
                    if (var5 == 1) {
                        var4 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var5 == 3) {
                        var4 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lqa;")
    public static final class112 method1184(int arg0, int arg1) {
        field3412++;
        class112 var2 = (class112) class103.field2347.method917((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field2129.method1023(arg0, arg1, (byte) -35);
        class112 var4 = new class112();
        var4.field2510 = arg0;
        if (var3 != null) {
            var4.method859(-27751, new class86(var3));
        }
        class103.field2347.method913((long) arg0, var4, (byte) -49);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lnd;")
    public static final class94 method1185(int arg0, int arg1) {
        field3411++;
        class94 var2 = (class94) client.field430.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class27.field532.method1023(arg1, 6, (byte) -35);
        class94 var4 = new class94();
        var4.field2169 = arg1;
        if (var3 != null) {
            var4.method738(new class86(var3), 0);
        }
        var4.method742(-107);
        if (arg0 != -2) {
            return null;
        }
        if (var4.field2194) {
            var4.field2191 = false;
            var4.field2196 = 0;
        }
        client.field430.method913((long) arg1, var4, (byte) -121);
        return var4;
    }
}
