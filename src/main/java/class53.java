import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Loc;")
    public static class99 field1258 = class48.method402((byte) -104, "null");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Loc;")
    public static class99 field1269 = class48.method402((byte) -104, "l");

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Loc;")
    public static class99 field1270 = class48.method402((byte) -104, "p12_full");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1271 = 7759444;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Loc;")
    private static class99 field1276 = class48.method402((byte) -104, "Remove");

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Loc;")
    public static class99 field1273 = field1276;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public static int[] field1262 = new int[50];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Loc;")
    private static class99 field1266 = class48.method402((byte) -104, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Loc;")
    public static class99 field1275 = field1266;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public static int[] field1257;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Loc;ZBLoc;)V")
    public static final void method437(class99 arg0, boolean arg1, byte arg2, class99 arg3) {
        field1264++;
        if (arg2 < 59) {
            field1273 = null;
        }
        if (class80.field1971) {
            class111.method949(18645);
            class80.field1971 = false;
            class99.method839(0);
            class4.method26(-69);
            class93.method773(-63);
            class100.method860(550);
            class27.method252(class113.field2826, (byte) -128, class84.field2096, client.field529, class55.field1414);
            class82.method710(1619, class57.field1473, -1, class27.field679 == -1, class134.field3301);
            class86.field2154 = true;
            class110.field2745 = true;
            class121.field2945 = true;
        }
        class5.method28(86);
        short var4 = 151;
        int var6 = var4 - 3;
        client.field529.method988(arg0, 257, var6, 0);
        client.field529.method988(arg0, 256, var6 - 1, 16777215);
        if (arg3 != null) {
            var6 += 15;
            if (arg1) {
                int var5 = client.field529.method974(arg3) + 4;
                class96.method794(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            client.field529.method988(arg3, 257, var6, 0);
            client.field529.method988(arg3, 256, var6 - 1, 16777215);
        }
        class89.method747(0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V")
    public static final void method438(boolean arg0, int arg1) {
        if (arg0) {
            method437(null, false, (byte) 125, null);
        }
        field1268++;
        if (arg1 == -3) {
            class91.method754(class34.field855, -45, class58.field1533, class93.field2272);
        } else if (arg1 == -2) {
            class91.method754(class34.field868, -53, class105.field2606, class34.field844);
        } else if (arg1 == -1) {
            class91.method754(class34.field841, -113, class58.field1525, class39.field975);
        } else if (arg1 == 3) {
            class91.method754(class34.field854, -128, class91.field2242, class34.field863);
        } else if (arg1 == 4) {
            class91.method754(class34.field843, -114, class95.field2322, class140.field3463);
        } else if (arg1 == 5) {
            class91.method754(class34.field864, -68, class42.field1032, class101.field2465);
        } else if (arg1 == 6) {
            class91.method754(class34.field834, -86, class32.field764, class36.field927);
        } else if (arg1 == 7) {
            class91.method754(class34.field856, -105, class15.field367, class126.field3056);
        } else if (arg1 == 8) {
            class91.method754(class34.field850, -66, class3.field64, class52.field1256);
        } else if (arg1 == 9) {
            class91.method754(class34.field858, -125, class23.field554, class55.field1428);
        } else if (arg1 == 10) {
            class91.method754(class34.field836, -55, class88.field2183, class52.field1255);
        } else if (arg1 == 11) {
            class91.method754(class34.field846, -107, class63.field1671, class127.field3116);
        } else if (arg1 == 12) {
            class91.method754(class34.field847, -62, class20.field493, class25.field586);
        } else if (arg1 == 13) {
            class91.method754(class34.field867, -128, class58.field1542, class16.field420);
        } else if (arg1 == 14) {
            class91.method754(class34.field840, -46, class136.field3392, class3.field67);
        } else if (arg1 == 16) {
            class91.method754(class34.field865, -84, class32.field776, class58.field1517);
        } else if (arg1 == 17) {
            class91.method754(class34.field848, -64, class2.field27, class141.field3492);
        } else if (arg1 == 18) {
            class91.method754(class34.field860, -65, class143.field3560, class80.field1974);
        } else if (arg1 == 19) {
            class91.method754(class15.field365, -65, class59.field1544, class101.field2455);
        } else if (arg1 == 20) {
            class91.method754(class34.field869, -62, class58.field1534, class12.field277);
        } else if (arg1 == 22) {
            class91.method754(class34.field871, -113, class17.field455, class105.field2580);
        } else if (arg1 == 23) {
            class91.method754(class34.field852, -76, class136.field3396, class68.field1760);
        } else if (arg1 == 24) {
            class91.method754(class34.field837, -82, class126.field3047, class145.field3628);
        } else if (arg1 == 25) {
            class91.method754(class34.field866, -67, class58.field1539, class94.field2287);
        } else if (arg1 == 26) {
            class91.method754(class34.field839, -122, class81.field2001, class105.field2600);
        } else if (arg1 == 27) {
            class91.method754(class34.field842, -45, class104.field2520, class34.field849);
        } else {
            class91.method754(class34.field832, -115, class58.field1528, class35.field892);
        }
        class73.method663(10, (byte) 52);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method439(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != -10723) {
            field1261 = -27;
        }
        field1259++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class49.field1202) {
            try {
                class11 var3 = (class11) Class.forName("kf").getDeclaredConstructor().newInstance();
                var3.method124(arg2, (byte) -9);
                return var3;
            } catch (Throwable var4) {
                class49.field1202 = true;
            }
        }
        return arg1 ? class39.method325((byte) -72, arg2) : arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method440(boolean arg0) {
        field1266 = null;
        field1270 = null;
        if (!arg0) {
            field1269 = null;
        }
        field1275 = null;
        field1273 = null;
        field1262 = null;
        field1258 = null;
        field1276 = null;
        field1257 = null;
        field1269 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Z")
    public static final boolean method441(int arg0, byte arg1) {
        field1272++;
        if (arg1 >= -11) {
            field1262 = null;
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpc;ZLjava/awt/Component;)V")
    public static final void method442(class105 arg0, boolean arg1, Component arg2) {
        field1260++;
        if (class70.field1792) {
            return;
        }
        class32.field773 = class91.method756(class137.field3405, (byte) -43, class99.field2402, arg0);
        class4.field80 = class91.method756(class137.field3405, (byte) -43, class110.field2744, arg0);
        class80.field1987 = class91.method756(class137.field3405, (byte) -43, class104.field2529, arg0);
        class114.field2845 = class91.method756(class137.field3405, (byte) -43, class93.field2270, arg0);
        class105.field2607 = class91.method756(class137.field3405, (byte) -43, class20.field489, arg0);
        class108.field2654 = class91.method756(class137.field3405, (byte) -43, class94.field2293, arg0);
        class91.field2220 = class59.method531(96, arg1, 479, arg2);
        class4.field80.method216(0, 0);
        class59.field1591 = class59.method531(156, false, 172, arg2);
        class96.method787();
        class80.field1987.method216(0, 0);
        class59.field1578 = class59.method531(261, arg1, 190, arg2);
        class32.field773.method216(0, 0);
        class17.field453 = class59.method531(334, false, 512, arg2);
        class96.method787();
        class20.field484 = class59.method531(50, false, 496, arg2);
        class9.field236 = class59.method531(37, false, 269, arg2);
        class57.field1493 = class59.method531(45, arg1, 249, arg2);
        class64 var3 = class94.method774(class37.field938, class137.field3405, -111, arg0);
        class102.field2484 = class59.method531(var3.field1681, false, var3.field1687, arg2);
        var3.method573(0, 0);
        class64 var4 = class94.method774(class148.field3658, class137.field3405, -120, arg0);
        class81.field2019 = class59.method531(var4.field1681, false, var4.field1687, arg2);
        var4.method573(0, 0);
        class64 var5 = class94.method774(class121.field2952, class137.field3405, -128, arg0);
        class77.field1918 = class59.method531(var5.field1681, false, var5.field1687, arg2);
        var5.method573(0, 0);
        class64 var6 = class94.method774(class126.field3048, class137.field3405, -97, arg0);
        class61.field1647 = class59.method531(var6.field1681, arg1, var6.field1687, arg2);
        var6.method573(0, 0);
        class64 var7 = class94.method774(class46.field1133, class137.field3405, -107, arg0);
        class87.field2170 = class59.method531(var7.field1681, false, var7.field1687, arg2);
        var7.method573(0, 0);
        class64 var8 = class94.method774(class79.field1950, class137.field3405, -108, arg0);
        class128.field3139 = class59.method531(var8.field1681, arg1, var8.field1687, arg2);
        var8.method573(0, 0);
        class64 var9 = class94.method774(class109.field2694, class137.field3405, -113, arg0);
        class104.field2534 = class59.method531(var9.field1681, false, var9.field1687, arg2);
        var9.method573(0, 0);
        class64 var10 = class94.method774(class105.field2552, class137.field3405, -95, arg0);
        class36.field926 = class59.method531(var10.field1681, arg1, var10.field1687, arg2);
        var10.method573(0, 0);
        class64 var11 = class94.method774(class27.field681, class137.field3405, -99, arg0);
        class130.field3200 = class59.method531(var11.field1681, false, var11.field1687, arg2);
        var11.method573(0, 0);
        class111.field2787 = class91.method756(class137.field3405, (byte) -43, class73.field1856, arg0);
        class118.field2909 = class91.method756(class137.field3405, (byte) -43, class1.field12, arg0);
        class145.field3617 = class91.method756(class137.field3405, (byte) -43, class119.field2917, arg0);
        class95.field2314 = class111.field2787.method219();
        class95.field2314.method218();
        class128.field3138 = class118.field2909.method219();
        class128.field3138.method218();
        class111.field2757 = class111.field2787.method219();
        class111.field2757.method215();
        class2.field33 = class118.field2909.method219();
        class2.field33.method215();
        class114.field2850 = class145.field3617.method219();
        class114.field2850.method215();
        class60.field1607 = class111.field2787.method219();
        class60.field1607.method218();
        class60.field1607.method215();
        class5.field121 = class118.field2909.method219();
        class5.field121.method218();
        class5.field121.method215();
        class126.field3055 = class72.method660(class137.field3405, class55.field1429, (byte) -128, arg0);
        class36.field924 = new int[151];
        class27.field676 = new int[151];
        class110.field2738 = new int[33];
        class39.field974 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class80.field1987.field566[class80.field1987.field569 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class39.field974[var12] = var17;
            class110.field2738[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 0;
            int var15 = 999;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class80.field1987.field566[class80.field1987.field569 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var15 == 999) {
                        var15 = var16;
                    }
                } else if (var15 != 999) {
                    var14 = var16;
                    break;
                }
            }
            class36.field924[var13 - 5] = var15 - 25;
            class27.field676[var13 - 5] = var14 - var15;
        }
        class70.field1792 = true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public static final int method443(int arg0, int arg1) {
        field1263++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != 0) {
            method439(-49, true, null);
        }
        return var6 & 0xFF;
    }
}
