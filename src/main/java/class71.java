import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class71 extends class205 {

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field1385 = -1;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "[I")
    public static int[] field1386 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lcf;")
    public static class28 field1387 = new class28();

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "[[[B")
    public static byte[][][] field1379;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIB)I")
    public static final int method482(int arg0, int arg1, int arg2, byte arg3) {
        field1383++;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (arg3 <= 117) {
            return -112;
        } else if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
            int var6 = arg2;
            if (arg2 < 3 && (class161.field3074[1][var4][var5] & 0x2) == 2) {
                var6 = arg2 + 1;
            }
            int var7 = arg0 & 0x7F;
            int var8 = arg1 & 0x7F;
            int var9 = (128 - var8) * class176.field3295[var6][var4][var5] + class176.field3295[var6][var4 + 1][var5] * var8 >> 7;
            int var10 = (128 - var8) * class176.field3295[var6][var4][var5 + 1] + class176.field3295[var6][var4 + 1][var5 + 1] * var8 >> 7;
            return (128 - var7) * var9 + var7 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BII)I")
    public static final int method483(byte arg0, int arg1, int arg2) {
        field1380++;
        if (arg0 != -35) {
            method486(23, (byte) 19, null);
        }
        class208 var3 = (class208) class78.field1505.method1520((long) arg2, 66);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field3868.length) {
            return var3.field3868[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
    public static void method484(boolean arg0) {
        field1387 = null;
        field1386 = null;
        if (arg0) {
            field1388 = 38;
        }
        field1379 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method485(int arg0, int arg1) {
        field1377++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class131.field2535[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        int var3 = class209.field3891[arg1];
        int var4 = class130.field2525[arg1];
        int var5 = (int) class156.field2978[arg1];
        long var6 = class156.field2978[arg1];
        if (var2 == 43) {
            class193 var8 = class202.field3696[var5];
            if (var8 != null) {
                class210.field3908++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var8.field1358[0], var8.field1333[0], arg0 ^ 0xFFFFFF80);
                class106.field1958 = 2;
                class57.field1070 = class153.field2938;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -89, 77);
                class42.field895.method702(arg0 + 441048198, class16.field423);
                class42.field895.method660(arg0 ^ 0x2, var5);
                class42.field895.method671((byte) 101, class125.field2389);
            }
        }
        if (var2 == 58 && class115.method744(var6, -121, var3, var4)) {
            class156.field2975++;
            class42.field895.method1347((byte) -40, 215);
            class42.field895.method672(arg0 - 279704378, var4 - -class110.field2064);
            class42.field895.method660(0, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class42.field895.method660(0, class151.field2931 + var3);
            class42.field895.method702(441048200, class173.field3252);
            class42.field895.method672(-279704376, class166.field3175);
            class42.field895.method671((byte) 106, class54.field1022);
        }
        if (var2 == 38) {
            class42.field895.method1347((byte) -117, 217);
            class160.field3048++;
            class42.field895.method684(var3, 106);
            class13 var9 = class10.method92(923, var3);
            if (var9.field336 != null && var9.field336[0][0] == 5) {
                int var10 = var9.field336[0][1];
                if (class93.field1751[var10] != var9.field282[0]) {
                    class93.field1751[var10] = var9.field282[0];
                    class208.method1336(var10, -135);
                }
            }
        }
        if (var2 == 1003) {
            class119.field2256 = 0;
            class106.field1958 = 2;
            class138.field2669 = class64.field1168;
            class57.field1070 = class153.field2938;
            class80.field1532++;
            class42.field895.method1347((byte) -109, 131);
            class42.field895.method671((byte) 119, var5);
        }
        if (var2 == 10) {
            class60.field1119++;
            class42.field895.method1347((byte) -101, 195);
            class42.field895.method660(arg0 - 2, class125.field2389);
            class42.field895.method667(class16.field423, false);
            class42.field895.method672(-279704376, var4);
            class42.field895.method672(-279704376, var5);
            class42.field895.method678(var3, true);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 1002) {
            class119.field2256 = 0;
            class57.field1070 = class153.field2938;
            class106.field1958 = 2;
            class138.field2669 = class64.field1168;
            class42.field895.method1347((byte) -40, 51);
            class87.field1648++;
            class42.field895.method663(arg0 ^ 0xFFFFFFB1, var5);
        }
        if (var2 == 46 || var2 == 1007) {
            class29.method249((byte) -60, var5, var4, class72.field1434[arg1], var3);
        }
        if (var2 == 1001) {
            class13 var11 = class10.method92(923, var3);
            if (var11 == null || var11.field226[var4] < 100000) {
                class87.field1648++;
                class42.field895.method1347((byte) -53, 51);
                class42.field895.method663(arg0 - 88, var5);
            } else {
                class160.method1007(false, class234.method1531(new class222[] { class56.method414(-94, var11.field226[var4]), class105.field1948, class112.method728(var5, (byte) -122).field3777 }, -10949), class29.field646, 0);
            }
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 26) {
            class135.field2602++;
            class42.field895.method1347((byte) -71, 144);
            class42.field895.method678(var3, true);
            class42.field895.method660(0, var4);
            class42.field895.method672(-279704376, var5);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 57) {
            class38 var12 = class54.field1024[var5];
            if (var12 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var12.field1358[0], var12.field1333[0], -124);
                class57.field1070 = class153.field2938;
                class155.field2951++;
                class119.field2256 = 0;
                class138.field2669 = class64.field1168;
                class106.field1958 = 2;
                class42.field895.method1347((byte) -102, 0);
                class42.field895.method660(0, var5);
                class42.field895.method702(arg0 ^ 0x1A49DC8A, class16.field423);
                class42.field895.method663(-112, class125.field2389);
            }
        }
        if (var2 == 48) {
            class193 var13 = class202.field3696[var5];
            if (var13 != null) {
                class197.field3587++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var13.field1358[0], var13.field1333[0], arg0 - 100);
                class106.field1958 = 2;
                class57.field1070 = class153.field2938;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -78, 37);
                class42.field895.method684(class173.field3252, 89);
                class42.field895.method671((byte) 126, class166.field3175);
                class42.field895.method671((byte) 109, class54.field1022);
                class42.field895.method672(arg0 ^ 0xEF540CCA, var5);
            }
        }
        if (var2 == 1) {
            boolean var14 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -128);
            class192.field3536++;
            if (!var14) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -122);
            }
            class138.field2669 = class64.field1168;
            class57.field1070 = class153.field2938;
            class106.field1958 = 2;
            class119.field2256 = 0;
            class42.field895.method1347((byte) -128, 22);
            class42.field895.method660(0, var5);
            class42.field895.method672(-279704376, class151.field2931 + var3);
            class42.field895.method660(arg0 - 2, var4 - -class110.field2064);
        }
        if (var2 == 41) {
            class38 var16 = class54.field1024[var5];
            if (var16 != null) {
                class14.field404++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var16.field1358[0], var16.field1333[0], -112);
                class106.field1958 = 2;
                class57.field1070 = class153.field2938;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -58, 120);
                class42.field895.method671((byte) 96, var5);
            }
        }
        if (var2 == 9) {
            class115.method744(var6, -127, var3, var4);
            class42.field895.method1347((byte) -94, 6);
            class42.field895.method672(-279704376, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class229.field4303++;
            class42.field895.method671((byte) 122, var4 + class110.field2064);
            class42.field895.method672(-279704376, class151.field2931 + var3);
        }
        if (var2 == 25) {
            class193 var17 = class202.field3696[var5];
            if (var17 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var17.field1358[0], var17.field1333[0], -101);
                class119.field2256 = 0;
                class106.field1958 = 2;
                class67.field1260++;
                class57.field1070 = class153.field2938;
                class138.field2669 = class64.field1168;
                class42.field895.method1347((byte) -55, 111);
                class42.field895.method663(-53, var5);
            }
        }
        if (var2 == 7) {
            class193 var18 = class202.field3696[var5];
            if (var18 != null) {
                class112.field2108++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var18.field1358[0], var18.field1333[0], -97);
                class138.field2669 = class64.field1168;
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -61, 107);
                class42.field895.method663(-56, var5);
            }
        }
        if (var2 == 45) {
            class38 var19 = class54.field1024[var5];
            if (var19 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var19.field1358[0], var19.field1333[0], -117);
                class138.field2669 = class64.field1168;
                class106.field1958 = 2;
                class119.field2256 = 0;
                class157.field2994++;
                class57.field1070 = class153.field2938;
                class42.field895.method1347((byte) -64, 222);
                class42.field895.method660(0, var5);
            }
        }
        if (var2 == 12) {
            class92.method590((byte) -122);
        }
        if (var2 == 1006) {
            class106.field1958 = 2;
            class57.field1070 = class153.field2938;
            class138.field2669 = class64.field1168;
            class119.field2256 = 0;
            class193 var20 = class202.field3696[var5];
            if (var20 != null) {
                class114 var21 = var20.field3558;
                if (var21.field2156 != null) {
                    var21 = var21.method742((byte) 89);
                }
                if (var21 != null) {
                    class42.field895.method1347((byte) -111, 220);
                    class111.field2087++;
                    class42.field895.method663(-59, var21.field2174);
                }
            }
        }
        if (var2 == 23) {
            class13 var22 = class197.method1215(var3, var4, -102);
            if (var22 != null) {
                class223.method1461((byte) 77);
                class95.method606(class153.method981(true, class221.method1405(var22, (byte) -126)), var4, var3, -32077);
                class214.field3979 = 0;
                class55.field1038 = class40.method316(var22, 17438);
                if (class55.field1038 == null) {
                    class55.field1038 = class83.field1585;
                }
                if (var22.field323) {
                    class17.field429 = class234.method1531(new class222[] { var22.field360, class98.field1846 }, -10949);
                    return;
                }
                class17.field429 = class234.method1531(new class222[] { class35.field766, var22.field294, class98.field1846 }, -10949);
            }
            return;
        }
        if (var2 == 6) {
            class38 var23 = class54.field1024[var5];
            if (var23 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var23.field1358[0], var23.field1333[0], arg0 - 125);
                class106.field1958 = 2;
                class57.field1070 = class153.field2938;
                class32.field677++;
                class119.field2256 = 0;
                class138.field2669 = class64.field1168;
                class42.field895.method1347((byte) -61, 158);
                class42.field895.method672(-279704376, var5);
            }
        }
        if (var2 == 3) {
            class42.field895.method1347((byte) -85, 145);
            class160.field3055++;
            class42.field895.method671((byte) 119, var5);
            class42.field895.method663(-75, var4);
            class42.field895.method678(var3, true);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 18) {
            class38 var24 = class54.field1024[var5];
            if (var24 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var24.field1358[0], var24.field1333[0], -105);
                class138.field2669 = class64.field1168;
                class57.field1070 = class153.field2938;
                class46.field944++;
                class119.field2256 = 0;
                class106.field1958 = 2;
                class42.field895.method1347((byte) -44, 35);
                class42.field895.method672(-279704376, var5);
            }
        }
        if (var2 == 37) {
            class183.field3399++;
            boolean var25 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -108);
            if (!var25) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -98);
            }
            class138.field2669 = class64.field1168;
            class57.field1070 = class153.field2938;
            class106.field1958 = 2;
            class119.field2256 = 0;
            class42.field895.method1347((byte) -71, 196);
            class42.field895.method660(0, var3 + class151.field2931);
            class42.field895.method663(arg0 ^ 0xFFFFFF81, class125.field2389);
            class42.field895.method660(0, var5);
            class42.field895.method660(0, var4 + class110.field2064);
            class42.field895.method678(class16.field423, true);
        }
        if (var2 == 21) {
            class193 var27 = class202.field3696[var5];
            if (var27 != null) {
                class62.field1147++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var27.field1358[0], var27.field1333[0], -115);
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class119.field2256 = 0;
                class138.field2669 = class64.field1168;
                class42.field895.method1347((byte) -73, 168);
                class42.field895.method660(arg0 - 2, var5);
            }
        }
        if (var2 == 39) {
            class38 var28 = class54.field1024[var5];
            if (var28 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var28.field1358[0], var28.field1333[0], arg0 - 102);
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class138.field2669 = class64.field1168;
                class129.field2517++;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -46, 85);
                class42.field895.method663(-98, var5);
            }
        }
        if (var2 == 29) {
            class38 var29 = class54.field1024[var5];
            if (var29 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var29.field1358[0], var29.field1333[0], -98);
                class223.field4189++;
                class106.field1958 = 2;
                class57.field1070 = class153.field2938;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -55, 122);
                class42.field895.method660(0, var5);
            }
        }
        if (var2 == 20) {
            class22.field527++;
            boolean var30 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, arg0 ^ 0xFFFFFF83);
            if (!var30) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, arg0 - 97);
            }
            class119.field2256 = 0;
            class57.field1070 = class153.field2938;
            class106.field1958 = 2;
            class138.field2669 = class64.field1168;
            class42.field895.method1347((byte) -99, 178);
            class42.field895.method660(0, class166.field3175);
            class42.field895.method672(-279704376, class54.field1022);
            class42.field895.method671((byte) 121, class110.field2064 + var4);
            class42.field895.method660(0, class151.field2931 + var3);
            class42.field895.method684(class173.field3252, arg0 ^ 0xFFFFFFB0);
            class42.field895.method663(-128, var5);
        }
        if (arg0 != 2) {
            field1385 = -105;
        }
        if (var2 == 8 && class91.field1713 == null) {
            class232.method1521(var3, 45, var4);
            class91.field1713 = class197.method1215(var3, var4, arg0 - 106);
            class80.method527(class91.field1713, 31702);
        }
        if (var2 == 36) {
            class213.field3955++;
            class42.field895.method1347((byte) -70, 186);
            class42.field895.method702(441048200, class173.field3252);
            class42.field895.method671((byte) 115, class54.field1022);
            class42.field895.method678(var3, true);
            class42.field895.method672(arg0 ^ 0xEF540CCA, var5);
            class42.field895.method671((byte) 89, class166.field3175);
            class42.field895.method660(0, var4);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 17 && class115.method744(var6, -122, var3, var4)) {
            class175.field3285++;
            class42.field895.method1347((byte) -109, 208);
            class42.field895.method671((byte) 81, class110.field2064 + var4);
            class42.field895.method671((byte) 104, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class42.field895.method678(class16.field423, true);
            class42.field895.method663(-82, class151.field2931 + var3);
            class42.field895.method671((byte) 86, class125.field2389);
        }
        if (var2 == 2) {
            class209.field3882++;
            class42.field895.method1347((byte) -54, 167);
            class42.field895.method672(-279704376, var5);
            class42.field895.method663(arg0 ^ 0xFFFFFF96, var4);
            class42.field895.method684(var3, arg0 ^ 0xFFFFFFB1);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 40) {
            class42.field895.method1347((byte) -41, 7);
            class209.field3887++;
            class42.field895.method672(-279704376, var5);
            class42.field895.method684(var3, arg0 - 38);
            class42.field895.method663(-125, var4);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 51) {
            class115.method744(var6, arg0 - 127, var3, var4);
            class86.field1620++;
            class42.field895.method1347((byte) -94, 36);
            class42.field895.method672(-279704376, class151.field2931 + var3);
            class42.field895.method660(0, class110.field2064 + var4);
            class42.field895.method672(-279704376, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var2 == 14) {
            class42.field895.method1347((byte) -74, 54);
            class42.field895.method663(-58, var5);
            class42.field895.method671((byte) 98, var4);
            class42.field895.method684(var3, arg0 ^ 0x73);
            class140.field2692 = 0;
            class35.field768++;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 28) {
            class174.field3272++;
            boolean var32 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -119);
            if (!var32) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, arg0 - 129);
            }
            class106.field1958 = 2;
            class57.field1070 = class153.field2938;
            class138.field2669 = class64.field1168;
            class119.field2256 = 0;
            class42.field895.method1347((byte) -101, 52);
            class42.field895.method663(-115, class151.field2931 + var3);
            class42.field895.method663(arg0 - 124, class110.field2064 + var4);
            class42.field895.method671((byte) 82, var5);
        }
        if (var2 == 15) {
            class209.field3878++;
            class42.field895.method1347((byte) -78, 181);
            class42.field895.method667(var3, false);
            class42.field895.method663(arg0 ^ 0xFFFFFF95, var4);
            class42.field895.method672(-279704376, var5);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(arg0 ^ 0x399, var3);
            class132.field2564 = var4;
        }
        if (var2 == 44) {
            class38 var34 = class54.field1024[var5];
            if (var34 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var34.field1358[0], var34.field1333[0], arg0 - 111);
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -102, 137);
                class42.field895.method660(arg0 ^ 0x2, var5);
                class197.field3580++;
            }
        }
        if (var2 == 49) {
            class223.method1461((byte) -127);
            class13 var35 = class10.method92(923, var3);
            class214.field3979 = 1;
            class173.field3252 = var3;
            class54.field1022 = var4;
            class166.field3175 = var5;
            class80.method527(var35, 31702);
            class211.field3931 = class234.method1531(new class222[] { class108.field1992, class112.method728(var5, (byte) 117).field3777, class98.field1846 }, -10949);
            if (class211.field3931 == null) {
                class211.field3931 = class218.field4049;
            }
            return;
        }
        if (var2 == 47) {
            class193 var36 = class202.field3696[var5];
            if (var36 != null) {
                class213.field3951++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var36.field1358[0], var36.field1333[0], arg0 - 127);
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class138.field2669 = class64.field1168;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -42, 172);
                class42.field895.method663(-56, var5);
            }
        }
        if (var2 == 42) {
            class42.field895.method1347((byte) -104, 29);
            class197.field3595++;
            class42.field895.method663(-94, var4);
            class42.field895.method667(var3, false);
            class42.field895.method671((byte) 82, var5);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(arg0 ^ 0x399, var3);
            class132.field2564 = var4;
        }
        if (var2 == 24) {
            boolean var37 = true;
            class13 var38 = class10.method92(923, var3);
            if (var38.field348 > 0) {
                var37 = class69.method469(arg0 ^ 0xF8, var38);
            }
            if (var37) {
                class160.field3048++;
                class42.field895.method1347((byte) -91, 217);
                class42.field895.method684(var3, 73);
            }
        }
        if (var2 == 1005) {
            class115.method744(var6, arg0 - 128, var3, var4);
            class104.field1927++;
            class42.field895.method1347((byte) -77, 204);
            class42.field895.method663(-65, class110.field2064 + var4);
            class42.field895.method671((byte) 81, var3 + class151.field2931);
            class42.field895.method671((byte) 87, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var2 == 31) {
            class113.field2119++;
            class42.field895.method1347((byte) -99, 60);
            class42.field895.method667(var3, false);
            class42.field895.method663(-82, var5);
            class42.field895.method671((byte) 91, var4);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(923, var3);
            class132.field2564 = var4;
        }
        if (var2 == 5) {
            class38 var39 = class54.field1024[var5];
            if (var39 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var39.field1358[0], var39.field1333[0], -103);
                class106.field1958 = 2;
                class9.field171++;
                class138.field2669 = class64.field1168;
                class57.field1070 = class153.field2938;
                class119.field2256 = 0;
                class42.field895.method1347((byte) -128, 247);
                class42.field895.method678(class173.field3252, true);
                class42.field895.method672(-279704376, class166.field3175);
                class42.field895.method672(arg0 ^ 0xEF540CCA, var5);
                class42.field895.method671((byte) 127, class54.field1022);
            }
        }
        if (var2 == 32) {
            class221.field4103++;
            boolean var40 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -115);
            if (!var40) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -116);
            }
            class57.field1070 = class153.field2938;
            class138.field2669 = class64.field1168;
            class106.field1958 = 2;
            class119.field2256 = 0;
            class42.field895.method1347((byte) -62, 71);
            class42.field895.method663(-74, var3 + class151.field2931);
            class42.field895.method660(0, var4 + class110.field2064);
            class42.field895.method663(arg0 ^ 0xFFFFFFA4, var5);
        }
        if (var2 == 22) {
            class42.field895.method1347((byte) -46, 101);
            class40.field887++;
            class42.field895.method660(arg0 - 2, var5);
            class42.field895.method672(arg0 - 279704378, var4);
            class42.field895.method667(var3, false);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(arg0 ^ 0x399, var3);
            class132.field2564 = var4;
        }
        if (var2 == 16) {
            class79.field1527++;
            class115.method744(var6, -119, var3, var4);
            class42.field895.method1347((byte) -116, 104);
            class42.field895.method672(-279704376, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class42.field895.method671((byte) 119, var4 + class110.field2064);
            class42.field895.method672(-279704376, class151.field2931 + var3);
        }
        if (var2 == 11) {
            class231.field4339++;
            class115.method744(var6, -125, var3, var4);
            class42.field895.method1347((byte) -67, 124);
            class42.field895.method671((byte) 106, var3 + class151.field2931);
            class42.field895.method671((byte) 110, var4 + class110.field2064);
            class42.field895.method663(-78, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var2 == 34) {
            boolean var42 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -124);
            if (!var42) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -122);
            }
            class119.field2256 = 0;
            class88.field1666++;
            class106.field1958 = 2;
            class138.field2669 = class64.field1168;
            class57.field1070 = class153.field2938;
            class42.field895.method1347((byte) -92, 248);
            class42.field895.method672(arg0 ^ 0xEF540CCA, var4 + class110.field2064);
            class42.field895.method671((byte) 83, var5);
            class42.field895.method671((byte) 94, var3 + class151.field2931);
        }
        if (var2 == 19) {
            class28.field627++;
            boolean var44 = class62.method431(false, 2, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -116);
            if (!var44) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var3, var4, -91);
            }
            class138.field2669 = class64.field1168;
            class57.field1070 = class153.field2938;
            class119.field2256 = 0;
            class106.field1958 = 2;
            class42.field895.method1347((byte) -55, 70);
            class42.field895.method671((byte) 87, class110.field2064 + var4);
            class42.field895.method663(arg0 - 102, class151.field2931 + var3);
            class42.field895.method672(-279704376, var5);
        }
        if (var2 == 35) {
            class160.field3048++;
            class42.field895.method1347((byte) -102, 217);
            class42.field895.method684(var3, 123);
            class13 var46 = class10.method92(923, var3);
            if (var46.field336 != null && var46.field336[0][0] == 5) {
                int var47 = var46.field336[0][1];
                class93.field1751[var47] = 1 - class93.field1751[var47];
                class208.method1336(var47, -135);
            }
        }
        if (var2 == 4) {
            class185.method1161(class217.field4036, var4, var3);
        }
        if (var2 == 13) {
            class42.field895.method1347((byte) -109, 147);
            class58.field1088++;
            class42.field895.method671((byte) 81, var5);
            class42.field895.method702(arg0 + 441048198, var3);
            class42.field895.method671((byte) 82, var4);
            class140.field2692 = 0;
            class204.field3796 = class10.method92(arg0 + 921, var3);
            class132.field2564 = var4;
        }
        if (var2 == 30) {
            class62.field1145++;
            class42.field895.method1347((byte) -90, 32);
            class42.field895.method660(0, var4);
            class42.field895.method684(class16.field423, 76);
            class42.field895.method702(441048200, var3);
            class42.field895.method663(-96, class125.field2389);
        }
        if (var2 == 33) {
            class38 var48 = class54.field1024[var5];
            if (var48 != null) {
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var48.field1358[0], var48.field1333[0], arg0 - 98);
                class138.field2669 = class64.field1168;
                class161.field3066++;
                class57.field1070 = class153.field2938;
                class119.field2256 = 0;
                class106.field1958 = 2;
                class42.field895.method1347((byte) -101, 152);
                class42.field895.method663(-77, var5);
            }
        }
        if (var2 == 50) {
            class193 var49 = class202.field3696[var5];
            if (var49 != null) {
                class159.field3033++;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var49.field1358[0], var49.field1333[0], -102);
                class57.field1070 = class153.field2938;
                class106.field1958 = 2;
                class119.field2256 = 0;
                class138.field2669 = class64.field1168;
                class42.field895.method1347((byte) -107, 227);
                class42.field895.method672(-279704376, var5);
            }
        }
        if (class214.field3979 != 0) {
            class214.field3979 = 0;
            class80.method527(class10.method92(arg0 ^ 0x399, class173.field3252), 31702);
        }
        if (class79.field1522) {
            class223.method1461((byte) -75);
        }
        if (class204.field3796 != null && class140.field2692 == 0) {
            class80.method527(class204.field3796, 31702);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            method482(64, -111, -77, (byte) -24);
        }
        field1382++;
        return class230.field4319;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLba;)Lvd;")
    public static final class222 method486(int arg0, byte arg1, class13 arg2) {
        field1384++;
        int var3 = -55 % ((arg1 - 11) / 43);
        if (!class16.method142(arg0, class221.method1405(arg2, (byte) -112), (byte) 18) && arg2.field366 == null) {
            return null;
        } else if (arg2.field258 == null || arg2.field258.length <= arg0 || arg2.field258[arg0] == null || arg2.field258[arg0].method1407((byte) -122).method1444(-62) == 0) {
            return class168.field3211 ? class234.method1531(new class222[] { class225.field4205, class56.method414(-108, arg0) }, -10949) : null;
        } else {
            return arg2.field258[arg0];
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, true);
    }
}
