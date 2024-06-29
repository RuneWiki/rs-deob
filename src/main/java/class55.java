import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lsc;")
    public static class128 field1222 = class129.method1017(false, "<)4col>");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lrb;")
    public static class120 field1224 = new class120(64);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lsc;")
    public static class128 field1225 = class129.method1017(false, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "[I")
    public static int[] field1228 = new int[2048];

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lsc;")
    public static class128 field1227 = class129.method1017(false, " (X");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lsb;")
    public static class127 field1226 = new class127(4096);

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lsc;")
    public static class128 field1230 = class129.method1017(false, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[I")
    public static int[] field1231 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[[[I")
    public static int[][][] field1229 = new int[4][105][105];

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lsc;")
    public static class128 field1233 = class129.method1017(false, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
    public static final void method424(int arg0, int arg1, byte arg2) {
        field1221++;
        class121 var3 = class124.field2796[class29.field553][arg0][arg1];
        if (var3 == null) {
            class154.field3553.method142(class29.field553, arg0, arg1);
            return;
        }
        class1 var4 = (class1) var3.method920((byte) 95);
        int var5 = -99999999;
        class1 var6 = null;
        while (var4 != null) {
            class64 var11 = class27.method230((byte) -44, var4.field4);
            int var12 = var11.field1390;
            if (var11.field1381 == 1) {
                var12 = (var4.field9 + 1) * var12;
            }
            if (var12 > var5) {
                var5 = var12;
                var6 = var4;
            }
            var4 = (class1) var3.method932(-6);
        }
        if (var6 == null) {
            class154.field3553.method142(class29.field553, arg0, arg1);
            return;
        }
        if (arg2 < 121) {
            method424(85, 63, (byte) 108);
        }
        class1 var7 = null;
        var3.method927(var6, true);
        class1 var8 = (class1) var3.method920((byte) -108);
        int var9 = (arg1 << 7) + arg0 + 1610612736;
        class1 var10 = null;
        while (var8 != null) {
            if (var6.field4 != var8.field4) {
                if (var7 == null) {
                    var7 = var8;
                }
                if (var7.field4 != var8.field4 && var10 == null) {
                    var10 = var8;
                }
            }
            var8 = (class1) var3.method932(-6);
        }
        class154.field3553.method99(class29.field553, arg0, arg1, class97.method755(arg1 * 128 + 64, class29.field553, arg0 * 128 + 64, 256), var6, var9, var7, var10);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[Lb;")
    public static final class8[] method425(int arg0) {
        field1218++;
        class8[] var1 = new class8[class43.field809];
        int var2 = 0;
        if (arg0 > -68) {
            return null;
        }
        while (var2 < class43.field809) {
            class8 var3 = var1[var2] = new class8();
            var3.field122 = class121.field2747;
            var3.field126 = class62.field1336;
            var3.field123 = class122.field2777[var2];
            var3.field125 = class36.field698[var2];
            var3.field121 = class150.field3443[var2];
            var3.field124 = class19.field361[var2];
            byte[] var4 = class37.field721[var2];
            int var5 = var3.field124 * var3.field121;
            var3.field127 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field127[var6] = class21.field412[class25.method224(var4[var6], 255)];
            }
            var2++;
        }
        class29.method239(-84);
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method426(int arg0, int arg1) {
        field1220++;
        if (arg0 == -1 || !class64.field1393[arg0]) {
            return;
        }
        class153.field3521.method1045(-93, arg0);
        if (class123.field2791[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class123.field2791[arg0].length; var3++) {
            if (class123.field2791[arg0][var3] != null) {
                if (class123.field2791[arg0][var3].field1137 == 2) {
                    var2 = false;
                } else {
                    class123.field2791[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class123.field2791[arg0] = null;
        }
        class64.field1393[arg0] = false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method427(byte arg0) {
        if (arg0 > -113) {
            method426(7, -124);
        }
        field1231 = null;
        field1230 = null;
        field1229 = null;
        field1225 = null;
        field1233 = null;
        field1224 = null;
        field1222 = null;
        field1227 = null;
        field1228 = null;
        field1226 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILsf;)V")
    public static final void method428(int arg0, class131 arg1) {
        if (arg0 >= -82) {
            method425(15);
        }
        class25.field498 = arg1;
        field1219++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
    public static final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1223++;
        class77.field1674 = 0;
        if (arg4 < 97) {
            return;
        }
        for (int var5 = -1; var5 < class41.field767 + class134.field3151; var5++) {
            class50 var21;
            if (var5 == -1) {
                var21 = class151.field3473;
            } else if (class134.field3151 > var5) {
                var21 = class106.field2421[class65.field1441[var5]];
            } else {
                var21 = class92.field2104[class68.field1528[var5 - class134.field3151]];
            }
            if (var21 != null && var21.method391(-30036)) {
                if (var21 instanceof class51) {
                    class60 var22 = ((class51) var21).field1028;
                    if (var22.field1270 != null) {
                        var22 = var22.method452(-121);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class134.field3151) {
                    class60 var25 = ((class51) var21).field1028;
                    if (var25.field1270 != null) {
                        var25 = var25.method452(-126);
                    }
                    if (var25.field1303 >= 0 && class115.field2585.length > var25.field1303) {
                        class65.method491(var21, var21.field956 + 15, 26720);
                        if (class18.field316 > -1) {
                            class115.field2585[var25.field1303].method64(class18.field316 + arg1 - 12, arg3 + -30 - -class127.field2884);
                        }
                    }
                    if (class36.field685 == 1 && class68.field1528[var5 - class134.field3151] == class159.field3657 && class29.field554 % 20 < 10) {
                        class65.method491(var21, var21.field956 + 15, 26720);
                        if (class18.field316 > -1) {
                            class104.field2374[0].method64(class18.field316 + arg1 - 12, class127.field2884 + -28 + arg3);
                        }
                    }
                } else {
                    int var23 = 30;
                    class53 var24 = (class53) var21;
                    if (var24.field1041 != -1 || var24.field1068 != -1) {
                        class65.method491(var21, var21.field956 + 15, 26720);
                        if (class18.field316 > -1) {
                            if (var24.field1041 != -1) {
                                class58.field1246[var24.field1041].method64(class18.field316 + arg1 - 12, class127.field2884 + arg3 + -var23);
                                var23 += 25;
                            }
                            if (var24.field1068 != -1) {
                                class115.field2585[var24.field1068].method64(arg1 + class18.field316 - 12, -var23 + arg3 - -class127.field2884);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class36.field685 == 10 && class65.field1441[var5] == class97.field2254) {
                        class65.method491(var21, var21.field956 + 15, 26720);
                        if (class18.field316 > -1) {
                            class104.field2374[1].method64(class18.field316 + arg1 - 12, class127.field2884 + arg3 + -var23);
                        }
                    }
                }
                if (var21.field1001 != null && (var5 >= class134.field3151 || class19.field349 == 0 || class19.field349 == 3 || class19.field349 == 1 && class75.method559(119, ((class53) var21).field1050))) {
                    class65.method491(var21, var21.field956, 26720);
                    if (class18.field316 > -1 && class77.field1674 < class103.field2346) {
                        class103.field2352[class77.field1674] = class97.field2255.method1079(var21.field1001) / 2;
                        class103.field2345[class77.field1674] = class97.field2255.field3138;
                        class103.field2341[class77.field1674] = class18.field316;
                        class103.field2344[class77.field1674] = class127.field2884;
                        class103.field2350[class77.field1674] = var21.field1002;
                        class103.field2351[class77.field1674] = var21.field990;
                        class103.field2340[class77.field1674] = var21.field1003;
                        class103.field2342[class77.field1674] = var21.field1001;
                        class77.field1674++;
                    }
                }
                if (var21.field979 > class29.field554) {
                    class65.method491(var21, var21.field956 + 15, 26720);
                    if (class18.field316 > -1) {
                        int var26 = var21.field952 * 30 / var21.field993;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class138.method1136(class18.field316 + arg1 - 15, arg3 + -3 + class127.field2884, var26, 5, 65280);
                        class138.method1136(arg1 + class18.field316 + var26 - 15, class127.field2884 + arg3 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field959[var27] > class29.field554) {
                        class65.method491(var21, var21.field956 / 2, 26720);
                        if (class18.field316 > -1) {
                            if (var27 == 1) {
                                class127.field2884 -= 20;
                            }
                            if (var27 == 2) {
                                class18.field316 -= 15;
                                class127.field2884 -= 10;
                            }
                            if (var27 == 3) {
                                class18.field316 += 15;
                                class127.field2884 -= 10;
                            }
                            client.field427[var21.field976[var27]].method64(arg1 + class18.field316 - 12, class127.field2884 - 12 + arg3);
                            class124.field2815.method1070(class111.method857(var21.field954[var27], (byte) -118), arg1 + class18.field316 - 1, arg3 - -class127.field2884 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class77.field1674; var6++) {
            int var7 = class103.field2341[var6];
            int var8 = class103.field2352[var6];
            int var9 = class103.field2344[var6];
            int var10 = class103.field2345[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class103.field2344[var20] - class103.field2345[var20] < var9 + 2 && class103.field2344[var20] + 2 > -var10 + var9 && var7 - var8 < class103.field2352[var20] + class103.field2341[var20] && class103.field2341[var20] - class103.field2352[var20] < var7 + var8 && var9 > class103.field2344[var20] - class103.field2345[var20]) {
                        var11 = true;
                        var9 = class103.field2344[var20] - class103.field2345[var20];
                    }
                }
            }
            class18.field316 = class103.field2341[var6];
            class127.field2884 = class103.field2344[var6] = var9;
            class128 var12 = class103.field2342[var6];
            if (class105.field2380 == 0) {
                int var13 = 16776960;
                if (class103.field2350[var6] < 6) {
                    var13 = class150.field3455[class103.field2350[var6]];
                }
                if (class103.field2350[var6] == 6) {
                    var13 = class58.field1251 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class103.field2350[var6] == 7) {
                    var13 = class58.field1251 % 20 < 10 ? 255 : 65535;
                }
                if (class103.field2350[var6] == 8) {
                    var13 = class58.field1251 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class103.field2350[var6] == 9) {
                    int var14 = 150 - class103.field2340[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class103.field2350[var6] == 10) {
                    int var15 = 150 - class103.field2340[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 33095935 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class103.field2350[var6] == 11) {
                    int var16 = 150 - class103.field2340[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class103.field2351[var6] == 0) {
                    class97.field2255.method1070(var12, arg1 + class18.field316, class127.field2884 + arg3, var13, 0);
                }
                if (class103.field2351[var6] == 1) {
                    class97.field2255.method1076(var12, arg1 + class18.field316, class127.field2884 + arg3, var13, 0, class58.field1251);
                }
                if (class103.field2351[var6] == 2) {
                    class97.field2255.method1071(var12, class18.field316 + arg1, arg3 - -class127.field2884, var13, 0, class58.field1251);
                }
                if (class103.field2351[var6] == 3) {
                    class97.field2255.method1060(var12, class18.field316 + arg1, class127.field2884 + arg3, var13, 0, class58.field1251, 150 - class103.field2340[var6]);
                }
                if (class103.field2351[var6] == 4) {
                    int var17 = (150 - class103.field2340[var6]) * (class97.field2255.method1079(var12) + 100) / 150;
                    class138.method1127(arg1 + class18.field316 - 50, arg3, class18.field316 + arg1 + 50, arg0 + arg3);
                    class97.field2255.method1078(var12, arg1 + class18.field316 + 50 - var17, class127.field2884 + arg3, var13, 0);
                    class138.method1125(arg1, arg3, arg1 + arg2, arg0 + arg3);
                }
                if (class103.field2351[var6] == 5) {
                    int var18 = 150 - class103.field2340[var6];
                    class138.method1127(arg1, arg3 + class127.field2884 - class97.field2255.field3138 - 1, arg1 + arg2, arg3 + class127.field2884 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class97.field2255.method1070(var12, class18.field316 + arg1, class127.field2884 + arg3 + var19, var13, 0);
                    class138.method1125(arg1, arg3, arg1 + arg2, arg3 - -arg0);
                }
            } else {
                class97.field2255.method1070(var12, class18.field316 + arg1, arg3 - -class127.field2884, 16776960, 0);
            }
        }
    }
}
