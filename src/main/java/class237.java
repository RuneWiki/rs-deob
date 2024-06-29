import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class237 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
    public static int[] field3354 = new int[32];

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3358 = "purple:";

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3363 = "Loading interfaces - ";

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
    public static int[] field3364;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "[I")
    public static int[] field3367;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Lkm;")
    public static class133 field3369;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lrf;")
    public static class263 field3365;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3354[var1] = var0 - 1;
            var0 += var0;
        }
        field3364 = new int[5];
        field3367 = new int[25];
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 13)
    public static final void method1628(byte arg0) {
        class255.field3648 = new class17(32);
        field3356++;
        if (arg0 >= -1) {
            field3368 = -27;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 25)
    public static final void method1629(String arg0, int arg1, int arg2) {
        field3360++;
        if (arg1 == -9965) {
            class143 var3 = class163.method1176((byte) 93, arg2, 2);
            var3.method1032((byte) 121);
            var3.field1949 = arg0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V", line = 44)
    public static final void method1630(boolean arg0, int[] arg1, Object[] arg2) {
        field3362++;
        if (arg0) {
            field3367 = (int[]) null;
        }
        class163.method1175(0, arg1.length - 1, -120, arg1, arg2);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method1631(boolean arg0, int arg1) {
        field3353++;
        byte var2;
        byte[][] var3;
        if (class67.field908 && arg0) {
            var2 = 1;
            var3 = class71.field964;
        } else {
            var3 = class37.field425;
            var2 = 4;
        }
        int var4 = var3.length;
        if (arg1 != -76) {
            field3365 = (class263) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            int var7 = class256.field3702[var5] >> 8;
            int[] var8 = null;
            int var9 = class256.field3702[var5] & 0xFF;
            int var10 = var9 * 64 - class296.field4394;
            int var11 = var7 * 64 - class132.field1809;
            if (var6 != null) {
                class15.method98(-109);
                var8 = class112.method827(var6, var10, class312.field4714, class296.field4394, (byte) 106, class132.field1809, arg0, var11);
            }
            if (!arg0 && field3368 / 8 == var7 && (class320.field4877 / 8) == var9) {
                if (var8 == null) {
                    class266.field3879 = -1;
                } else {
                    class92.field1270 = var8[3];
                    class48.field592 = var8[4];
                    class71.field965 = var8[2];
                    class266.field3879 = var8[0];
                    class324.field4911 = var8[1];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class256.field3702[var12] >> 8) * 64 - class132.field1809;
            int var14 = (class256.field3702[var12] & 0xFF) * 64 - class296.field4394;
            byte[] var15 = var3[var12];
            if (var15 == null && class320.field4877 < 800) {
                class15.method98(-126);
                for (int var16 = 0; var16 < var2; var16++) {
                    class145.method1045(var16, 64, 64, var13, -124, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(SILjava/lang/String;IJILjava/lang/String;I)V", line = 156)
    public static final void method1632(short arg0, int arg1, String arg2, int arg3, long arg4, int arg5, String arg6, int arg7) {
        field3357++;
        int var9 = 43 % ((arg5 + 10) / 62);
        if (class100.field1380 || class204.field2938 >= 500) {
            return;
        }
        class111.field1487[class204.field2938] = arg2;
        class88.field1251[class204.field2938] = arg6;
        class135.field1868[class204.field2938] = arg1 == -1 ? class42.field485 : arg1;
        class54.field722[class204.field2938] = arg0;
        class230.field3264[class204.field2938] = arg4;
        class334.field5049[class204.field2938] = arg7;
        class20.field252[class204.field2938] = arg3;
        class204.field2938++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lco;)V", line = 183)
    public static final void method1633(class280 arg0) {
        for (int var1 = arg0.field4204; var1 <= arg0.field4205; var1++) {
            for (int var2 = arg0.field4200; var2 <= arg0.field4198; var2++) {
                class202 var3 = class142.field1940[arg0.field4208][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2875; var4++) {
                        if (var3.field2896[var4] == arg0) {
                            var3.field2875--;
                            for (int var5 = var4; var5 < var3.field2875; var5++) {
                                var3.field2896[var5] = var3.field2896[var5 + 1];
                                var3.field2878[var5] = var3.field2878[var5 + 1];
                            }
                            var3.field2896[var3.field2875] = null;
                            break;
                        }
                    }
                    var3.field2871 = 0;
                    for (int var6 = 0; var6 < var3.field2875; var6++) {
                        var3.field2871 |= var3.field2878[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 239)
    public static final String method1634(boolean arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field3369 = (class133) null;
        }
        field3355++;
        return arg0 && arg2 >= 0 ? class192.method1347(arg2, false, 10, arg0) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 279)
    public static void method1635(int arg0) {
        field3364 = null;
        if (arg0 != 8) {
            return;
        }
        field3369 = null;
        field3354 = null;
        field3365 = null;
        field3358 = null;
        field3363 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 297)
    public static final void method1636(byte arg0) {
        int var1 = class8.field79;
        field3366++;
        int var2 = class312.field4704;
        int var3 = class183.field2524;
        int var4 = class218.field3131;
        int var5 = 6116423;
        if (class67.field908) {
            class102.method738(var1, var2, var3, var4, var5);
            class102.method738(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class102.method750(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        } else {
            class38.method224(var1, var2, var3, var4, var5);
            class38.method224(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class38.method216(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        }
        class204.field2946.method1911(class291.field4342, var1 + 3, var2 - -14, var5, -1);
        int var6 = class206.field2962;
        int var7 = class282.field4220;
        if (arg0 != 84) {
            field3369 = (class133) null;
        }
        for (int var8 = 0; var8 < class204.field2938; var8++) {
            int var9 = (class204.field2938 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var3 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class204.field2946.method1911(class51.method353(arg0 + 40, var8), var1 + 3, var9, var10, 0);
        }
        class279.method1934(class312.field4704, arg0 - 212, class218.field3131, class8.field79, class183.field2524);
    }
}
