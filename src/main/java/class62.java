import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 {

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public int field1531 = 0;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public int field1523 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lfc;")
    public static class39 field1512 = class90.method774("Fehler bei der Verbindung zum Server)3", -90);

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field1528 = 0;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lfc;")
    public static class39 field1529 = class90.method774("Die Verbindung konnte", -80);

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1527 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lqb;")
    public class113 field1514;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lue;")
    public static class141 field1519;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Loc;IZLoc;I)Lid;", line = 7)
    public static final class60 method610(class100 arg0, int arg1, boolean arg2, class100 arg3, int arg4) {
        boolean var5 = true;
        field1520++;
        int[] var6 = arg0.method844((byte) 112, arg4);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method840(var6[var7], arg4, false);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method840(var9, 0, false);
                } else {
                    var10 = arg3.method840(0, var9, false);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg1 != 1442206280) {
            method615((byte) 62);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class60(arg0, arg3, arg4, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBIILqe;)V", line = 61)
    public static final void method611(int arg0, byte arg1, int arg2, int arg3, class116 arg4) {
        field1510++;
        if (class145.field3615 >= 50 || class24.field669 == 0 || (arg4.field3052 == null || arg0 >= arg4.field3052.length || arg1 > -39)) {
            return;
        }
        int var5 = arg4.field3052[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class90.field2136[class145.field3615] = var6;
        int var7 = var5 >> 4 & 0x7;
        class145.field3629[class145.field3615] = var7;
        class1.field11[class145.field3615] = 0;
        class25.field735[class145.field3615] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        int var10 = var5 & 0xF;
        class50.field1264[class145.field3615] = (var8 << 16) + (var9 << 8) + var10;
        class145.field3615++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 105)
    public static final void method612(int arg0) {
        class121.method1036((byte) 61);
        field1515++;
        int var1 = -65 % ((arg0 + 69) / 40);
        class147.field3655 = true;
        class6.method90((byte) -47);
        if (class37.field1018 != -1) {
            boolean var2 = class28.method354(class37.field1018, 261, 0, 1, (byte) 92, 0, 190);
            if (!var2) {
                class104.field2638 = true;
            }
        } else if (class25.field740[class104.field2633] != -1) {
            boolean var3 = class28.method354(class25.field740[class104.field2633], 261, 0, 1, (byte) -92, 0, 190);
            if (!var3) {
                class104.field2638 = true;
            }
        }
        if (class94.field2206 && class50.field1258 == 1) {
            if (class38.field1037 == 1) {
                class126.method1048(-1);
            } else {
                class30.method366(16776960);
            }
        }
        class80.method687(14366);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ldc;Lfc;I)I", line = 161)
    public static final int method613(class25 arg0, class39 arg1, int arg2) {
        int var3 = arg0.field710;
        arg0.method314((byte) 113, arg1.field1046);
        field1511++;
        int var4 = 38 % ((arg2 + 43) / 46);
        arg0.field710 += class153.field3768.method1115(0, -68, arg1.field1067, arg1.field1046, arg0.field710, arg0.field711);
        return arg0.field710 - var3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 199)
    public static void method614(int arg0) {
        field1529 = null;
        field1519 = null;
        field1512 = null;
        if (arg0 != 255) {
            method615((byte) 3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 215)
    public static final void method615(byte arg0) {
        field1509++;
        if (arg0 > -93 || class100.field2504 == null) {
            return;
        }
        class99 var1 = class100.field2504;
        class99 var2 = class127.method1057(var1, 100);
        if (var2 == null) {
            class100.field2504 = null;
            return;
        }
        class110.field2809++;
        int var3 = class12.field314;
        int var4 = class131.field3322;
        if (class37.field1016 == 0) {
            var4 -= 4;
            var3 -= 4;
        }
        if (class37.field1016 == 1) {
            var4 -= 205;
            var3 -= 553;
        }
        if (class37.field1016 == 2) {
            var4 -= 357;
            var3 -= 17;
        }
        int var5 = var4 - class100.field2479;
        int var6 = var3 - class75.field1727;
        int[] var7 = class2.method21(var2, (byte) -78);
        if (var7[0] > var6) {
            var6 = var7[0];
        }
        if (var7[0] + var2.field2357 < var1.field2357 + var6) {
            var6 = var7[0] + var2.field2357 - var1.field2357;
        }
        if (var7[1] > var5) {
            var5 = var7[1];
        }
        class99 var8 = class65.field1571[var1.field2406 >> 16][var1.field2348 & 0xFFFF];
        if (var7[1] + var2.field2381 < var1.field2381 + var5) {
            var5 = var7[1] + var2.field2381 - var1.field2381;
        }
        int var9 = var5 + var2.field2447 - var7[1];
        int var10 = var6 + var2.field2429 - var7[0];
        int[] var11 = class2.method21(var8, (byte) -78);
        int var12 = var8.field2429 + var6 - var11[0];
        int var13 = var12 - var1.field2450;
        int var14 = var5 + var8.field2447 - var11[1];
        int var15 = var14 - var1.field2368;
        int var10000;
        if (var1.field2391 >= var13 && -var1.field2391 <= var13 && var1.field2391 >= var15 && -var1.field2391 <= var15 && !class30.field849) {
            var10000 = var14 - var15;
            var9 -= var15;
            var10000 = var12 - var13;
            boolean var18 = false;
            var10 -= var13;
            boolean var19 = false;
        } else if (var1.field2353 < class110.field2809 || class30.field849) {
            class30.field849 = true;
        } else {
            var10000 = var14 - var15;
            var10 -= var13;
            int var25 = var12 - var13;
            boolean var22 = false;
            var9 -= var15;
            boolean var23 = false;
        }
        if (class100.field2504.field2432 != null && class30.field849) {
            class30.method365(4, var1, var1.field2432, null, var10, var9, 0);
        }
        if (class50.field1275 != 0) {
            return;
        }
        if (class30.field849) {
            class99 var24 = client.method228(0, class100.field2479 + var9 - var2.field2447, -var2.field2429 + var10 + class75.field1727, var2, var1);
            if (class100.field2504.field2401 != null) {
                class30.method365(4, var1, var1.field2401, var24, var10, var9, 0);
            }
            if (var24 != null && class39.method463(var1, -54) != null) {
                class60.field1463++;
                class79.field1794.method393((byte) -14, 57);
                class79.field1794.method281(-1084673848, var1.field2412);
                class79.field1794.method285(var24.field2406, (byte) 122);
                class79.field1794.method283(true, var1.field2406);
                class79.field1794.method297(var24.field2412, (byte) 117);
            }
        } else {
            if (class100.field2504.field2392 != null) {
                class30.method365(4, var1, var1.field2392, null, var10, var9, 0);
            }
            if ((class90.field2137 == 1 || class101.method862(class126.field3207 - 1, 8192)) && class126.field3207 > 2) {
                class70.method653(true);
            } else if (class126.field3207 > 0) {
                class90.method777(class126.field3207 - 1, -125);
            }
        }
        class100.field2504 = null;
        return;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I", line = 380)
    public static final int method616(int arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field1513++;
        int var4 = 72 / ((arg0 - 57) / 39);
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        return arg2;
    }
}
