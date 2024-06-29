import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class74 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
    public static boolean field1378 = false;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Ltg;")
    private static class184 field1380 = class135.method812("Loading interfaces )2 ", 3);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ltg;")
    public static class184 field1377 = class135.method812("Verbindung konnte nicht hergestellt werden)3", 3);

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ltg;")
    public static class184 field1387 = field1380;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1386 = 2301979;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static volatile int field1383 = 0;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
    public static boolean field1384 = false;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[Lsc;")
    public static class171[] field1382;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method432(int arg0, int arg1, int arg2, long arg3) {
        class90 var5 = class190.field3704[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1693 != null && var5.field1693.field923 == arg3) {
            return true;
        } else if (var5.field1684 != null && var5.field1684.field2435 == arg3) {
            return true;
        } else if (var5.field1690 != null && var5.field1690.field1652 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1680; var6++) {
                if (var5.field1686[var6].field2934 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public static final void method433(int arg0, int arg1, int arg2) {
        if (arg1 <= 97) {
            field1378 = true;
        }
        if (class136.field2480 != 0 && arg2 != -1) {
            class196.method1245(0, -109, false, arg2, class14.field279, class136.field2480);
            class159.field2856 = true;
        }
        field1376++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method434(int arg0, int arg1, byte[] arg2, int arg3) {
        field1389++;
        boolean var4 = true;
        class97 var5 = new class97(arg2);
        if (arg0 != 0) {
            return false;
        }
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method565(-86);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var12;
                class58 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method582(-14590);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method588((byte) -116);
                                    }
                                    int var10 = var5.method582(-14590);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 >> 6 & 0x3F;
                                    var12 = var5.method588((byte) -85) >> 2;
                                    int var13 = var9 & 0x3F;
                                    var14 = arg3 + var11;
                                    var15 = var13 + arg1;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class14.method88(-87, var6);
                } while (var12 == 22 && class55.field970 && var16.field1053 == 0 && var16.field1060 != 1 && !var16.field1088);
                if (!var16.method309((byte) -50)) {
                    var4 = false;
                    class122.field2224++;
                }
                var8 = true;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method435(int arg0) {
        field1382 = null;
        field1377 = null;
        field1380 = null;
        field1387 = null;
        int var1 = 61 % ((-arg0 - 26) / 39);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        field1390++;
        if (!class113.field2038) {
            return;
        }
        class189.field3653 = null;
        class209.field4010 = null;
        class81.field1449 = null;
        class15.field287 = null;
        class141.field2564 = null;
        class65.field1238 = null;
        class158.field2824 = null;
        class185.field3576 = null;
        if (arg0 != -11) {
            field1384 = false;
        }
        class133.field2418 = null;
        class131.field2385 = null;
        class158.field2829 = null;
        class43.field820 = null;
        class9.field174 = null;
        class172.field3259 = null;
        class40.field750 = null;
        class6.field117 = null;
        field1382 = null;
        class84.field1526 = null;
        class35.field652 = null;
        class5.field86 = null;
        class32.field563 = null;
        class188.field3628 = null;
        class120.method724((byte) 125, 2);
        class168.method1046(true, (byte) -52);
        class113.field2038 = false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[B)V")
    public static final void method437(int arg0, byte[] arg1) {
        field1388++;
        class97 var2 = new class97(arg1);
        var2.field1834 = arg1.length - 2;
        class46.field880 = var2.method611(false);
        class83.field1479 = new int[class46.field880];
        class184.field3535 = new int[class46.field880];
        class177.field3387 = new int[class46.field880];
        class26.field472 = new int[class46.field880];
        class202.field3902 = new byte[class46.field880][];
        var2.field1834 = arg1.length - class46.field880 * 8 - 7;
        class110.field1980 = var2.method611(false);
        class24.field436 = var2.method611(false);
        int var3 = arg0 + (var2.method588((byte) -116) & 0xFF);
        for (int var4 = 0; var4 < class46.field880; var4++) {
            class177.field3387[var4] = var2.method611(false);
        }
        for (int var5 = 0; var5 < class46.field880; var5++) {
            class26.field472[var5] = var2.method611(false);
        }
        for (int var6 = 0; var6 < class46.field880; var6++) {
            class83.field1479[var6] = var2.method611(false);
        }
        for (int var7 = 0; var7 < class46.field880; var7++) {
            class184.field3535[var7] = var2.method611(false);
        }
        var2.field1834 = arg1.length - class46.field880 * 8 - (var3 + -1) * 3 - 7;
        class83.field1481 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class83.field1481[var8] = var2.method568((byte) -125);
            if (class83.field1481[var8] == 0) {
                class83.field1481[var8] = 1;
            }
        }
        var2.field1834 = 0;
        for (int var9 = 0; var9 < class46.field880; var9++) {
            int var10 = class83.field1479[var9];
            int var11 = class184.field3535[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class202.field3902[var9] = var13;
            int var14 = var2.method588((byte) -107);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method591(65280);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method591(class51.method283(arg0, 65281));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Lfg;")
    public static final class57 method438(byte arg0, int arg1) {
        field1385++;
        class57 var2 = (class57) class149.field2675.method773((long) arg1, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field397.method1249((byte) -89, arg1, 13);
        class57 var4 = new class57();
        if (arg0 <= 78) {
            field1380 = null;
        }
        var4.field1019 = arg1;
        if (var3 != null) {
            var4.method308(new class97(var3), true);
        }
        class149.field2675.method776(var4, (long) arg1, (byte) 74);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1379++;
        for (int var5 = 0; var5 < class11.field199; var5++) {
            if (class55.field984[var5] + class198.field3859[var5] > arg4 && class198.field3859[var5] < arg3 + arg4 && class194.field3767[var5] + class133.field2411[var5] > arg2 && class194.field3767[var5] < arg1 + arg2) {
                class99.field1849[var5] = true;
            }
        }
        if (arg0 != 31094) {
            method435(121);
        }
    }
}
