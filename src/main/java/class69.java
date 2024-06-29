import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1477 = -1;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[Leb;")
    public static class27[] field1474 = new class27[2048];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lo;")
    public static class84 field1484 = class15.method124("(U", 255);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field1481 = new int[25];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1485 = 78;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lud;")
    public static class118 field1482;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 6)
    public static void method519(byte arg0) {
        field1482 = null;
        int var1 = 78 % ((arg0 - 31) / 62);
        field1474 = null;
        field1481 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I", line = 18)
    public static final int method520(boolean arg0) {
        if (arg0) {
            return 101;
        }
        field1478++;
        int var1 = 3;
        if (class41.field836 < 310) {
            int var2 = class57.field1176 >> 7;
            int var3 = class17.field313 >> 7;
            int var4 = class107.field2271.field1380 >> 7;
            if ((class73.field1544[class1.field11][var2][var3] & 0x4) != 0) {
                var1 = class1.field11;
            }
            int var5 = class107.field2271.field1391 >> 7;
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            int var7;
            if (var5 > var3) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        var3++;
                    } else if (var5 < var3) {
                        var3--;
                    }
                    if ((class73.field1544[class1.field11][var2][var3] & 0x4) != 0) {
                        var1 = class1.field11;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class73.field1544[class1.field11][var2][var3] & 0x4) != 0) {
                            var1 = class1.field11;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var2 != var4) {
                    var10 += var11;
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class73.field1544[class1.field11][var2][var3] & 0x4) != 0) {
                        var1 = class1.field11;
                    }
                    if (var10 >= 65536) {
                        if (var5 > var3) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class73.field1544[class1.field11][var2][var3] & 0x4) != 0) {
                            var1 = class1.field11;
                        }
                        var10 -= 65536;
                    }
                }
            }
        }
        if ((class73.field1544[class1.field11][class107.field2271.field1380 >> 7][class107.field2271.field1391 >> 7] & 0x4) != 0) {
            var1 = class1.field11;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 156)
    public static final void method521(byte arg0) {
        class123.field2748.method742(4);
        if (arg0 >= -117) {
            field1483 = 83;
        }
        field1475++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lud;ILjava/awt/Component;)V", line = 180)
    public static final void method522(class118 arg0, int arg1, Component arg2) {
        field1479++;
        if (class93.field2038) {
            return;
        }
        class17.field311 = class118.method918(arg0, true, client.field321, class36.field713);
        class62.field1287 = class118.method918(arg0, true, client.field321, class93.field2042);
        class19.field371 = class118.method918(arg0, true, client.field321, class31.field625);
        class60.field1250 = class118.method918(arg0, true, client.field321, class27.field521);
        class17.field298 = class118.method918(arg0, true, client.field321, class11.field221);
        class122.field2726 = class118.method918(arg0, true, client.field321, class36.field705);
        class73.field1536 = class101.method763(479, arg2, -8, 96);
        class62.field1287.method732(0, 0);
        class14.field259 = class101.method763(172, arg2, -8, 156);
        class32.method288();
        class19.field371.method732(0, 0);
        class8.field147 = class101.method763(190, arg2, arg1 - 23597, 261);
        class17.field311.method732(0, 0);
        class3.field38 = class101.method763(512, arg2, -8, 334);
        class32.method288();
        class5.field74 = class101.method763(496, arg2, -8, 50);
        class80.field1720 = class101.method763(269, arg2, -8, 37);
        class31.field621 = class101.method763(249, arg2, -8, 45);
        class121 var3 = class123.method958(class126.field2779, client.field321, arg1 ^ 0xFFFFA3EF, arg0);
        class48.field1007 = class101.method763(var3.field2709, arg2, -8, var3.field2704);
        var3.method942(0, 0);
        class121 var4 = class123.method958(class128.field2824, client.field321, -74, arg0);
        class36.field703 = class101.method763(var4.field2709, arg2, arg1 ^ 0xFFFFA3DD, var4.field2704);
        var4.method942(0, 0);
        class121 var5 = class123.method958(class55.field1153, client.field321, -107, arg0);
        class97.field2080 = class101.method763(var5.field2709, arg2, -8, var5.field2704);
        var5.method942(0, 0);
        class121 var6 = class123.method958(class5.field86, client.field321, -76, arg0);
        class35.field691 = class101.method763(var6.field2709, arg2, -8, var6.field2704);
        var6.method942(0, 0);
        class121 var7 = class123.method958(class49.field1043, client.field321, -115, arg0);
        class111.field2419 = class101.method763(var7.field2709, arg2, -8, var7.field2704);
        var7.method942(0, 0);
        class121 var8 = class123.method958(class113.field2455, client.field321, arg1 - 23648, arg0);
        class25.field436 = class101.method763(var8.field2709, arg2, -8, var8.field2704);
        var8.method942(0, 0);
        class121 var9 = class123.method958(class79.field1684, client.field321, -124, arg0);
        class1.field27 = class101.method763(var9.field2709, arg2, -8, var9.field2704);
        var9.method942(0, 0);
        class121 var10 = class123.method958(class44.field898, client.field321, -59, arg0);
        class51.field1094 = class101.method763(var10.field2709, arg2, -8, var10.field2704);
        var10.method942(0, 0);
        class121 var11 = class123.method958(class42.field853, client.field321, -113, arg0);
        class24.field400 = class101.method763(var11.field2709, arg2, -8, var11.field2704);
        var11.method942(0, 0);
        class3.field39 = class118.method918(arg0, true, client.field321, class1.field22);
        class17.field297 = class118.method918(arg0, true, client.field321, class128.field2827);
        class60.field1247 = class118.method918(arg0, true, client.field321, class26.field445);
        class101.field2153 = class3.field39.method731();
        class101.field2153.method730();
        class116.field2539 = class17.field297.method731();
        class116.field2539.method730();
        class38.field739 = class3.field39.method731();
        class38.field739.method734();
        class123.field2752 = class17.field297.method731();
        class123.field2752.method734();
        class62.field1280 = class60.field1247.method731();
        class62.field1280.method734();
        class39.field797 = class3.field39.method731();
        class39.field797.method730();
        class39.field797.method734();
        class4.field67 = class17.field297.method731();
        class4.field67.method730();
        class4.field67.method734();
        class99.field2105 = class5.method22(arg0, class14.field247, (byte) -58, client.field321);
        class3.field46 = new int[151];
        class85.field1936 = new int[151];
        class122.field2728 = new int[33];
        class54.field1125 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 0;
            int var18 = 999;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class19.field371.field2058[class19.field371.field2056 * var12 + var19] == 0) {
                    if (var18 == 999) {
                        var18 = var19;
                    }
                } else if (var18 != 999) {
                    var17 = var19;
                    break;
                }
            }
            class122.field2728[var12] = var18;
            class54.field1125[var12] = var17 - var18;
        }
        int var13 = 5;
        if (arg1 != 23589) {
            field1474 = null;
        }
        while (var13 < 156) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class19.field371.field2058[class19.field371.field2056 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class85.field1936[var13 - 5] = var14 - 25;
            class3.field46[var13 - 5] = var15 - var14;
            var13++;
        }
        class93.field2038 = true;
    }
}
