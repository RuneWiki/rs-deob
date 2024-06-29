import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lva;")
    public static class121 field1940 = class107.method797("(X", -10983);

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lva;")
    public static class121 field1943 = class107.method797("b12_full", -10983);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lva;")
    public static class121 field1942 = class107.method797(" (X", -10983);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lva;")
    public static class121 field1948 = class107.method797("@gr1@", -10983);

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[I")
    public static int[] field1946 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field1947 = 2;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lva;")
    public static class121 field1938 = class107.method797("runes", -10983);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lva;")
    public static class121 field1939 = class107.method797("mapdots", -10983);

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Z")
    public static boolean field1952 = false;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lva;")
    public static class121 field1953 = class107.method797("mapedge", -10983);

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method589(int arg0) {
        field1941++;
        long var1 = System.currentTimeMillis();
        int var3 = (int) (var1 - class33.field815);
        class33.field815 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class28.field707 += var3;
        if (class48.field1142 == 0 && class124.field2831 == 0 && client.field428 == 0 && class99.field2214 == 0) {
            return true;
        } else if (class96.field2146 == null) {
            return false;
        } else {
            try {
                if (class28.field707 > 30000) {
                    throw new IOException();
                }
                while (class124.field2831 < 20 && class99.field2214 > 0) {
                    class58 var4 = (class58) class21.field555.method653((byte) 51);
                    class113 var5 = new class113(4);
                    var5.method836(0, 1);
                    var5.method869((int) var4.field577, (byte) -77);
                    class96.field2146.method296(var5.field2512, 4, 0, true);
                    class58.field1341.method654((byte) -87, var4, var4.field577);
                    class124.field2831++;
                    class99.field2214--;
                }
                while (class48.field1142 < 20 && client.field428 > 0) {
                    class58 var6 = (class58) class114.field2573.method519(0);
                    class113 var7 = new class113(4);
                    var7.method836(0, 0);
                    var7.method869((int) var6.field577, (byte) -97);
                    class96.field2146.method296(var7.field2512, 4, 0, true);
                    var6.method926(true);
                    class12.field213.method654((byte) -106, var6, var6.field577);
                    client.field428--;
                    class48.field1142++;
                }
                if (arg0 < 63) {
                    method593(-41, 119);
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class96.field2146.method291(false);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    if (class26.field670 == null) {
                        var10 = 8;
                    } else if (class19.field451 == 0) {
                        var10 = 1;
                    }
                    class28.field707 = 0;
                    if (var10 > 0) {
                        int var11 = var10 - class23.field614.field2507;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class96.field2146.method292((byte) 32, var11, class23.field614.field2512, class23.field614.field2507);
                        if (class28.field714 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class23.field614.field2512[class23.field614.field2507 + var12] = (byte) class38.method261(class23.field614.field2512[class23.field614.field2507 + var12], class28.field714);
                            }
                        }
                        class23.field614.field2507 += var11;
                        if (class23.field614.field2507 < var10) {
                            break;
                        }
                        if (class26.field670 == null) {
                            class23.field614.field2507 = 0;
                            int var13 = class23.field614.method821(true);
                            int var14 = class23.field614.method870(-1);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class23.field614.method821(true);
                            int var18 = class23.field614.method822(-708753192);
                            class58 var19 = (class58) class58.field1341.method652(var15, 31);
                            class28.field715 = true;
                            if (var19 == null) {
                                var19 = (class58) class12.field213.method652(var15, -123);
                                class28.field715 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class26.field670 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class79.field1847 = new class113(var18 + var20 + class26.field670.field1340);
                            class79.field1847.method836(0, var17);
                            class79.field1847.method867((byte) -66, var18);
                            class19.field451 = 8;
                            class23.field614.field2507 = 0;
                        } else if (class19.field451 == 0) {
                            if (class23.field614.field2512[0] == -1) {
                                class23.field614.field2507 = 0;
                                class19.field451 = 1;
                            } else {
                                class26.field670 = null;
                            }
                        }
                    } else {
                        int var21 = class79.field1847.field2512.length - class26.field670.field1340;
                        int var22 = 512 - class19.field451;
                        if (var21 - class79.field1847.field2507 < var22) {
                            var22 = var21 - class79.field1847.field2507;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class96.field2146.method292((byte) 32, var22, class79.field1847.field2512, class79.field1847.field2507);
                        if (class28.field714 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class79.field1847.field2512[class79.field1847.field2507 + var23] = (byte) class38.method261(class79.field1847.field2512[class79.field1847.field2507 + var23], class28.field714);
                            }
                        }
                        class19.field451 += var22;
                        class79.field1847.field2507 += var22;
                        if (class79.field1847.field2507 == var21) {
                            if (class26.field670.field577 == 16711935L) {
                                class59.field1392 = class79.field1847;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class12 var25 = class5.field85[var24];
                                    if (var25 != null) {
                                        class59.field1392.field2507 = var24 * 4 + 5;
                                        int var26 = class59.field1392.method822(-708753192);
                                        var25.method98(255, var26);
                                    }
                                }
                            } else {
                                class77.field1781.reset();
                                class77.field1781.update(class79.field1847.field2512, 0, var21);
                                int var27 = (int) class77.field1781.getValue();
                                if (class26.field670.field1346 != var27) {
                                    try {
                                        class96.field2146.method293(-2);
                                    } catch (Exception var29) {
                                    }
                                    class28.field714 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class96.field2146 = null;
                                    class79.field1835++;
                                    return false;
                                }
                                class79.field1835 = 0;
                                class58.field1347 = 0;
                                class26.field670.field1337.method103(class79.field1847.field2512, (int) (class26.field670.field577 & 0xFFFFL), (class26.field670.field577 & 0xFF0000L) == 16711680L, class28.field715, -18);
                            }
                            class26.field670.method187((byte) 39);
                            class26.field670 = null;
                            class19.field451 = 0;
                            if (class28.field715) {
                                class124.field2831--;
                            } else {
                                class48.field1142--;
                            }
                            class79.field1847 = null;
                        } else {
                            if (class19.field451 != 512) {
                                break;
                            }
                            class19.field451 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class96.field2146.method293(-2);
                } catch (Exception var28) {
                }
                class96.field2146 = null;
                class58.field1347++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 296)
    public static final void method590(int arg0) {
        if (arg0 == 60) {
            class64.field1551.method347(true);
            field1949++;
            class37.field859.method347(true);
            class22.field585.method347(true);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 312)
    public static final void method591(int arg0) {
        for (class25 var1 = (class25) class67.field1607.method57((byte) 86); var1 != null; var1 = (class25) class67.field1607.method66(-29860)) {
            if (var1.field622 > 0) {
                var1.field622--;
            }
            if (var1.field622 != 0) {
                if (var1.field629 > 0) {
                    var1.field629--;
                }
                if (var1.field629 == 0 && var1.field627 >= 1 && var1.field633 >= 1 && var1.field627 <= 102 && var1.field633 <= 102 && (var1.field639 < 0 || class66.method466(var1.field639, var1.field646, true))) {
                    class26.method208(var1.field639, var1.field627, var1.field646, var1.field618, 25359, var1.field647, var1.field624, var1.field633);
                    var1.field629 = -1;
                    if (var1.field641 == var1.field639 && var1.field641 == -1) {
                        var1.method187((byte) 39);
                    } else if (var1.field641 == var1.field639 && var1.field647 == var1.field640 && var1.field646 == var1.field642) {
                        var1.method187((byte) 39);
                    }
                }
            } else if (var1.field641 < 0 || class66.method466(var1.field641, var1.field642, true)) {
                class26.method208(var1.field641, var1.field627, var1.field642, var1.field618, 25359, var1.field640, var1.field624, var1.field633);
                var1.method187((byte) 39);
            }
        }
        field1950++;
        if (arg0 >= -23) {
            method592(-85);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 379)
    public static final void method592(int arg0) {
        field1951++;
        class28.field708 = true;
        class113.method863(-128);
        if (class40.field902) {
            class60.field1426.method893(class18.field395, 239, 40, 0);
            class60.field1426.method893(class113.method866((byte) -111, new class121[] { class18.field402, class25.field625 }), 239, 60, 128);
        } else if (class1.field16 == 1) {
            class60.field1426.method893(class57.field1330, 239, 40, 0);
            class60.field1426.method893(class113.method866((byte) -39, new class121[] { class18.field370, class25.field625 }), 239, 60, 128);
        } else if (class1.field16 == 2) {
            class60.field1426.method893(class18.field362, 239, 40, 0);
            class60.field1426.method893(class113.method866((byte) -63, new class121[] { class18.field370, class25.field625 }), 239, 60, 128);
        } else if (class1.field16 == 3) {
            if (class18.field404 != class18.field370) {
                client.method162(0, class18.field370);
                class18.field404 = class18.field370;
            }
            class117 var1 = class119.field2757;
            class55.method400(0, 0, 463, 77);
            for (int var2 = 0; var2 < class67.field1620; var2++) {
                int var3 = var2 * 14 + 18 - class60.field1446;
                if (var3 > 0 && var3 < 110) {
                    var1.method893(class96.field2140[var2], 239, var3, 0);
                }
            }
            class55.method402();
            if (class67.field1620 > 5) {
                class61.method445(0, class67.field1620 * 14 + 7, 77, (byte) 119, class60.field1446, 463);
            }
            if (class18.field370.method942(arg0 + 17946) == 0) {
                class60.field1426.method893(class23.field609, 239, 40, 255);
            } else if (class67.field1620 == 0) {
                class60.field1426.method893(class45.field1042, 239, 40, 0);
            }
            var1.method893(class113.method866((byte) -66, new class121[] { class18.field370, class25.field625 }), 239, 90, 0);
            class55.method397(0, 77, 479, 0);
        } else if (class64.field1544 != null) {
            class60.field1426.method893(class64.field1544, 239, 40, 0);
            class60.field1426.method893(class90.field2046, 239, 60, 128);
        } else if (class90.field2038 != -1) {
            boolean var4 = class46.method310(0, 479, -1, 2, 0, class90.field2038, (byte) 99, 96, 0);
            if (!var4) {
                class9.field140 = true;
            }
        } else if (class118.field2676 == -1) {
            class117 var6 = class119.field2757;
            int var7 = 0;
            class55.method400(0, 0, 463, 77);
            for (int var8 = 0; var8 < 100; var8++) {
                if (class47.field1098[var8] != null) {
                    int var10 = class61.field1479[var8];
                    class121 var11 = class58.field1354[var8];
                    int var12 = class33.field811 + 70 - var7 * 14;
                    byte var13 = 0;
                    if (var11 != null && var11.method948(class126.field2866, 0)) {
                        var13 = 1;
                        var11 = var11.method965(63, 5);
                    }
                    if (var11 != null && var11.method948(class54.field1249, 0)) {
                        var13 = 2;
                        var11 = var11.method965(arg0 ^ 0xFFFFBA35, 5);
                    }
                    if (var10 == 0) {
                        if (var12 > 0 && var12 < 110) {
                            var6.method897(class47.field1098[var8], 4, var12, 0);
                        }
                        var7++;
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || class63.field1526 == 0 || class63.field1526 == 1 && class114.method876(arg0 ^ 0xFFFFBA27, var11))) {
                        if (var12 > 0 && var12 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                class28.field698[0].method502(var14, var12 - 12);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                class28.field698[1].method502(var14, var12 - 12);
                                var14 += 14;
                            }
                            var6.method897(class113.method866((byte) -62, new class121[] { var11, class29.field763 }), var14, var12, 0);
                            int var15 = var14 + var6.method898(var11) + 8;
                            var6.method897(class47.field1098[var8], var15, var12, 255);
                        }
                        var7++;
                    }
                    if ((var10 == 3 || var10 == 7) && class69.field1653 == 0 && (var10 == 7 || class19.field492 == 0 || class19.field492 == 1 && class114.method876(arg0 + 17999, var11))) {
                        var7++;
                        if (var12 > 0 && var12 < 110) {
                            byte var16 = 4;
                            var6.method897(class61.field1472, var16, var12, 0);
                            int var17 = var16 + var6.method898(class61.field1472);
                            int var18 = var17 + var6.method901(32);
                            if (var13 == 1) {
                                class28.field698[0].method502(var18, var12 - 12);
                                var18 += 14;
                            }
                            if (var13 == 2) {
                                class28.field698[1].method502(var18, var12 - 12);
                                var18 += 14;
                            }
                            var6.method897(class113.method866((byte) -86, new class121[] { var11, class29.field763 }), var18, var12, 0);
                            int var19 = var18 + var6.method898(var11) + 8;
                            var6.method897(class47.field1098[var8], var19, var12, 8388608);
                        }
                    }
                    if (var10 == 4 && (class4.field69 == 0 || class4.field69 == 1 && class114.method876(82, var11))) {
                        var7++;
                        if (var12 > 0 && var12 < 110) {
                            var6.method897(class113.method866((byte) -42, new class121[] { var11, class27.field687, class47.field1098[var8] }), 4, var12, 8388736);
                        }
                    }
                    if (var10 == 5 && class69.field1653 == 0 && class19.field492 < 2) {
                        if (var12 > 0 && var12 < 110) {
                            var6.method897(class47.field1098[var8], 4, var12, 8388608);
                        }
                        var7++;
                    }
                    if (var10 == 6 && class69.field1653 == 0 && class19.field492 < 2) {
                        var7++;
                        if (var12 > 0 && var12 < 110) {
                            var6.method897(class113.method866((byte) -102, new class121[] { class113.field2562, class27.field687, var11, class29.field763 }), 4, var12, 0);
                            var6.method897(class47.field1098[var8], var6.method898(class113.method866((byte) -62, new class121[] { class113.field2562, class27.field687, var11 })) + 12, var12, 8388608);
                        }
                    }
                    if (var10 == 8 && (class4.field69 == 0 || class4.field69 == 1 && class114.method876(arg0 ^ 0xFFFFBA6A, var11))) {
                        if (var12 > 0 && var12 < 110) {
                            var6.method897(class113.method866((byte) -51, new class121[] { var11, class27.field687, class47.field1098[var8] }), 4, var12, 8270336);
                        }
                        var7++;
                    }
                }
            }
            class55.method402();
            class50.field1187 = var7 * 14 + 7;
            if (class50.field1187 < 78) {
                class50.field1187 = 78;
            }
            class61.method445(0, class50.field1187, 77, (byte) 55, class50.field1187 - class33.field811 - 77, 463);
            class121 var9;
            if (class62.field1494 == null || class62.field1494.field1766 == null) {
                var9 = class18.field365;
            } else {
                var9 = class62.field1494.field1766;
            }
            var6.method897(class113.method866((byte) -102, new class121[] { var9, class29.field763 }), 4, 90, 0);
            var6.method897(class113.method866((byte) -128, new class121[] { class18.field411, class25.field625 }), var6.method898(class113.method866((byte) -110, new class121[] { var9, class96.field2154 })) + 6, 90, 255);
            class55.method397(0, 77, 479, 0);
        } else {
            boolean var5 = class46.method310(0, 479, -1, 3, 0, class118.field2676, (byte) 99, 96, 0);
            if (!var5) {
                class9.field140 = true;
            }
        }
        if (class100.field2245 && class13.field240 == 2) {
            class100.method677((byte) 119);
        }
        if (arg0 != -17910) {
            field1940 = null;
        }
        class45.method302(-79);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I", line = 724)
    public static final int method593(int arg0, int arg1) {
        field1944++;
        if (arg0 != 9) {
            field1948 = null;
        }
        class79 var2 = class48.method348((byte) -107, arg1);
        int var3 = var2.field1852;
        int var4 = var2.field1850;
        int var5 = var2.field1843;
        int var6 = class127.field2932[var4 - var3];
        return var6 & class90.field2045[var5] >> var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 748)
    public static void method594(boolean arg0) {
        field1939 = null;
        field1953 = null;
        field1940 = null;
        field1948 = null;
        field1943 = null;
        field1942 = null;
        if (arg0) {
            field1938 = null;
            field1946 = null;
        }
    }
}
