import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 implements Runnable {

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
    public boolean field1269 = true;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1265 = new Object();

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    public int[] field1272 = new int[500];

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public int field1275 = 0;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[I")
    public int[] field1274 = new int[500];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lad;")
    public static class5 field1259 = class88.method674("Lade Benutzeroberfl-=che )2 ", -90);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lad;")
    private static class5 field1267 = class88.method674("Could not complete login)3", -80);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lad;")
    private static class5 field1268 = class88.method674("From", 57);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lad;")
    public static class5 field1261 = field1267;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[[I")
    public static int[][] field1273 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lad;")
    public static class5 field1270 = field1268;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lbb;")
    public static class9 field1258 = new class9(64);

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lad;")
    public static class5 field1277 = class88.method674("Entfernen", 119);

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Lad;")
    public static class5 field1278 = class88.method674("null", 29);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lad;")
    public static class5 field1276 = class88.method674("(U4", 61);

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
    public static int[] field1279 = new int[1000];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lvd;")
    public static class130 field1263;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 8)
    public static final void method424(int arg0, int arg1) {
        field1262++;
        class14.field403 = class69.field1636;
        class38.method292(arg0 ^ 0x70);
        int var2 = class94.method722(arg1, 16).field1907;
        if (var2 == 0) {
            return;
        }
        int var3 = class128.field3058[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class114.method905(0.9D);
                ((class65) class114.field2838).method513(0.9D, -1);
            }
            if (var3 == 2) {
                class114.method905(0.8D);
                ((class65) class114.field2838).method513(0.8D, -1);
            }
            if (var3 == 3) {
                class114.method905(0.7D);
                ((class65) class114.field2838).method513(0.7D, arg0 - 4);
            }
            if (var3 == 4) {
                class114.method905(0.6D);
                ((class65) class114.field2838).method513(0.6D, -1);
            }
            class1.method2(71);
            class120.field2979 = true;
        }
        if (arg0 == var2) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class103.field2517 != var4) {
                if (class103.field2517 == 0 && class120.field2987 != -1) {
                    class78.method606(class120.field2987, var4, false, 0, class108.field2713, false, 0);
                    class98.field2376 = 0;
                } else if (var4 == 0) {
                    class78.method604(63);
                    class98.field2376 = 0;
                } else {
                    class106.method871((byte) -121, var4);
                }
                class103.field2517 = var4;
            }
        }
        if (var2 == 9) {
            class110.field2771 = var3;
        }
        if (var2 == 6) {
            class112.field2816 = var3;
        }
        if (var2 == 8) {
            class99.field2384 = true;
            class134.field3239 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class106.field2681 = 127;
            }
            if (var3 == 1) {
                class106.field2681 = 96;
            }
            if (var3 == 2) {
                class106.field2681 = 64;
            }
            if (var3 == 3) {
                class106.field2681 = 32;
            }
            if (var3 == 4) {
                class106.field2681 = 0;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class54.field1352 = 127;
            }
            if (var3 == 1) {
                class54.field1352 = 96;
            }
            if (var3 == 2) {
                class54.field1352 = 64;
            }
            if (var3 == 3) {
                class54.field1352 = 32;
            }
            if (var3 == 4) {
                class54.field1352 = 0;
            }
        }
        if (var2 == 5) {
            class34.field858 = var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILsd;II)V", line = 160)
    public static final void method425(int arg0, class112 arg1, int arg2, int arg3) {
        if (arg3 > -21) {
            method425(-75, null, 115, 12);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field103 = class36.field907.method343((byte) -6);
            int var4 = class36.field907.method316((byte) -55);
            if (arg1.field103 == 65535) {
                arg1.field103 = -1;
            }
            arg1.field110 = (var4 & 0xFFFF) + class69.field1636;
            arg1.field108 = 0;
            if (class69.field1636 < arg1.field110) {
                arg1.field108 = -1;
            }
            arg1.field72 = 0;
            arg1.field88 = var4 >> 16;
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field55 = class36.field907.method301(-1);
            if (arg1.field55.method55(0, 255) == 126) {
                arg1.field55 = arg1.field55.method52(1, (byte) -111);
                class21.method168(arg1.field55, arg1.field2801, false, 2);
            } else if (class82.field1932 == arg1) {
                class21.method168(arg1.field55, arg1.field2801, false, 2);
            }
            arg1.field52 = 0;
            arg1.field111 = 0;
            arg1.field98 = 150;
        }
        field1256++;
        if ((arg2 & 0x1) != 0) {
            int var5 = class36.field907.method343((byte) -6);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class36.field907.method330(-30864);
            if (arg1.field85 == var5 && var5 != -1) {
                int var7 = class78.method605(var5, (byte) 20).field1737;
                if (var7 == 1) {
                    arg1.field109 = 0;
                    arg1.field82 = var6;
                    arg1.field57 = 0;
                    arg1.field43 = 0;
                }
                if (var7 == 2) {
                    arg1.field43 = 0;
                }
            } else if (var5 == -1 || arg1.field85 == -1 || class78.method605(var5, (byte) 20).field1726 >= class78.method605(arg1.field85, (byte) 20).field1726) {
                arg1.field82 = var6;
                arg1.field85 = var5;
                arg1.field57 = 0;
                arg1.field43 = 0;
                arg1.field109 = 0;
                arg1.field78 = arg1.field80;
            }
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field45 = class36.field907.method336(241465648);
            if (arg1.field45 == 65535) {
                arg1.field45 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field67 = class36.field907.method333((byte) -18);
            arg1.field106 = class36.field907.method335((byte) -16);
            arg1.field62 = class36.field907.method333((byte) -18);
            arg1.field74 = class36.field907.method305((byte) -92);
            arg1.field102 = class36.field907.method298(108) + class69.field1636;
            arg1.field65 = class36.field907.method323(-14837) + class69.field1636;
            arg1.field79 = class36.field907.method335((byte) -16);
            arg1.method20(-1);
        }
        if ((arg2 & 0x80) != 0) {
            int var8 = class36.field907.method335((byte) -16);
            int var9 = class36.field907.method333((byte) -18);
            arg1.method18(126, class69.field1636, var9, var8);
            arg1.field95 = class69.field1636 + 300;
            arg1.field116 = class36.field907.method305((byte) -92);
            arg1.field50 = class36.field907.method330(-30864);
        }
        if ((arg2 & 0x2) != 0) {
            int var10 = class36.field907.method330(-30864);
            byte[] var11 = new byte[var10];
            class39 var12 = new class39(var11);
            class36.field907.method302(var10, 24661, 0, var11);
            class87.field2051[arg0] = var12;
            arg1.method894(var12, 18722);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field64 = class36.field907.method298(121);
            arg1.field117 = class36.field907.method343((byte) -6);
        }
        if ((arg2 & 0x10) != 0) {
            int var13 = class36.field907.method336(241465648);
            int var14 = class36.field907.method330(-30864);
            int var15 = class36.field907.method305((byte) -92);
            int var16 = class36.field907.field957;
            if (arg1.field2801 != null && arg1.field2786 != null) {
                long var17 = arg1.field2801.method64((byte) 100);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < class32.field769; var20++) {
                        if (class14.field400[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && class65.field1568 == 0) {
                    class89.field2105.field957 = 0;
                    class36.field907.method302(var15, 24661, 0, class89.field2105.field974);
                    class89.field2105.field957 = 0;
                    class5 var21 = class103.method831((byte) 109, class89.field2105).method72((byte) 24);
                    arg1.field55 = var21.method39((byte) 127);
                    arg1.field98 = 150;
                    arg1.field111 = var13 >> 8;
                    arg1.field52 = var13 & 0xFF;
                    if (var14 == 2 || var14 == 3) {
                        class21.method168(var21, class69.method546(true, new class5[] { class88.field2071, arg1.field2801 }), false, 1);
                    } else if (var14 == 1) {
                        class21.method168(var21, class69.method546(true, new class5[] { class106.field2660, arg1.field2801 }), false, 1);
                    } else {
                        class21.method168(var21, arg1.field2801, false, 2);
                    }
                }
            }
            class36.field907.field957 = var15 + var16;
        }
        if ((arg2 & 0x200) == 0) {
            return;
        }
        int var22 = class36.field907.method330(-30864);
        int var23 = class36.field907.method305((byte) -92);
        arg1.method18(124, class69.field1636, var23, var22);
        arg1.field95 = class69.field1636 + 300;
        arg1.field116 = class36.field907.method305((byte) -92);
        arg1.field50 = class36.field907.method335((byte) -16);
    }

    @OriginalMember(owner = "client!ia", name = "run", descriptor = "()V", line = 399)
    public final void run() {
        field1271++;
        while (this.field1269) {
            Object var1 = this.field1265;
            synchronized (this.field1265) {
                if (this.field1275 < 500) {
                    this.field1272[this.field1275] = class22.field564;
                    this.field1274[this.field1275] = class91.field2131;
                    this.field1275++;
                }
            }
            class121.method958(50L, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 428)
    public static void method426(byte arg0) {
        field1267 = null;
        field1268 = null;
        field1276 = null;
        field1277 = null;
        field1279 = null;
        field1258 = null;
        field1273 = null;
        field1270 = null;
        field1261 = null;
        if (arg0 >= -87) {
            field1261 = null;
        }
        field1278 = null;
        field1259 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 466)
    public static final void method427(int arg0) {
        field1257++;
        try {
            if (class60.field1459 == 0) {
                if (class59.field1455 != null) {
                    class59.field1455.method350(-5918);
                    class59.field1455 = null;
                }
                class60.field1459 = 1;
                class134.field3230 = 0;
                class34.field868 = null;
                class12.field370 = false;
            }
            if (class60.field1459 == 1) {
                if (class34.field868 == null) {
                    class34.field868 = class25.field631.method16(true, class25.field625);
                }
                if (class34.field868.field1513 == 2) {
                    throw new IOException();
                }
                if (class34.field868.field1513 == 1) {
                    class59.field1455 = new class40((Socket) class34.field868.field1516, class25.field631);
                    class34.field868 = null;
                    class60.field1459 = 2;
                }
            }
            if (class60.field1459 == 2) {
                long var1 = class35.field896 = class109.field2753.method64((byte) 100);
                class5.field163.field957 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class5.field163.method307(-388270616, 14);
                class5.field163.method307(-388270616, var3);
                class59.field1455.method349(0, -1, 2, class5.field163.field974);
                class60.field1459 = 3;
                class36.field907.field957 = 0;
            }
            if (~class60.field1459 == arg0) {
                int var4 = class59.field1455.method346(0);
                if (var4 != 0) {
                    class43.method364((byte) 119, var4);
                    return;
                }
                class36.field907.field957 = 0;
                class60.field1459 = 4;
            }
            if (class60.field1459 == 4) {
                if (class36.field907.field957 < 8) {
                    int var5 = class59.field1455.method348(0);
                    if (var5 > 8 - class36.field907.field957) {
                        var5 = 8 - class36.field907.field957;
                    }
                    if (var5 > 0) {
                        class59.field1455.method344(class36.field907.field957, var5, class36.field907.field974, -73);
                        class36.field907.field957 += var5;
                    }
                }
                if (class36.field907.field957 == 8) {
                    class36.field907.field957 = 0;
                    class7.field260 = class36.field907.method312(arg0 ^ 0xFFFFFFC7);
                    class60.field1459 = 5;
                }
            }
            if (class60.field1459 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class7.field260 >> 32), (int) class7.field260 };
                class5.field163.field957 = 0;
                class5.field163.method307(-388270616, 10);
                class5.field163.method308(var6[0], (byte) 77);
                class5.field163.method308(var6[1], (byte) 77);
                class5.field163.method308(var6[2], (byte) 77);
                class5.field163.method308(var6[3], (byte) 77);
                class5.field163.method308(class25.field631.field23, (byte) 77);
                class5.field163.method340(class109.field2753.method64((byte) 100), arg0 ^ 0xA89442C);
                class5.field163.method337(true, class109.field2736);
                class5.field163.method304(class78.field1826, (byte) -74, class32.field766);
                class61.field1496.field957 = 0;
                if (class20.field524 == 40) {
                    class61.field1496.method307(-388270616, 18);
                } else {
                    class61.field1496.method307(-388270616, 16);
                }
                class61.field1496.method307(-388270616, class5.field163.field957 + 57);
                class61.field1496.method308(433, (byte) 77);
                class61.field1496.method307(-388270616, class40.field1048 ? 1 : 0);
                class61.field1496.method308(class39.field1009.field2667, (byte) 77);
                class61.field1496.method308(class46.field1217.field2667, (byte) 77);
                class61.field1496.method308(class52.field1305.field2667, (byte) 77);
                class61.field1496.method308(class87.field2050.field2667, (byte) 77);
                class61.field1496.method308(class110.field2778.field2667, (byte) 77);
                class61.field1496.method308(class20.field527.field2667, (byte) 77);
                class61.field1496.method308(class108.field2713.field2667, (byte) 77);
                class61.field1496.method308(class78.field1854.field2667, (byte) 77);
                class61.field1496.method308(class35.field872.field2667, (byte) 77);
                class61.field1496.method308(class87.field2049.field2667, (byte) 77);
                class61.field1496.method308(class78.field1827.field2667, (byte) 77);
                class61.field1496.method308(class132.field3192.field2667, (byte) 77);
                class61.field1496.method308(class110.field2758.field2667, (byte) 77);
                class61.field1496.method311(class5.field163.field957, 0, class5.field163.field974, (byte) 111);
                class59.field1455.method349(0, -1, class61.field1496.field957, class61.field1496.field974);
                class5.field163.method208(var6, (byte) 33);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class36.field907.method208(var6, (byte) 31);
                class60.field1459 = 6;
            }
            if (class60.field1459 == 6 && class59.field1455.method348(0) > 0) {
                int var8 = class59.field1455.method346(arg0 + 4);
                if (var8 == 21 && class20.field524 == 20) {
                    class60.field1459 = 7;
                } else if (var8 == 2) {
                    class60.field1459 = 9;
                } else if (var8 == 15 && class20.field524 == 40) {
                    class108.method877((byte) -126);
                    return;
                } else if (var8 == 23 && class16.field437 < 1) {
                    class16.field437++;
                    class60.field1459 = 0;
                } else {
                    class43.method364((byte) 119, var8);
                    return;
                }
            }
            if (class60.field1459 == 7 && class59.field1455.method348(0) > 0) {
                class79.field1860 = (class59.field1455.method346(arg0 ^ 0xFFFFFFFC) + 3) * 60;
                class60.field1459 = 8;
            }
            if (class60.field1459 == 8) {
                class134.field3230 = 0;
                class120.method953(class83.field1952, (byte) 107, class69.method546(true, new class5[] { class106.method864(18413, class79.field1860 / 60), class70.field1710 }), class70.field1684);
                if (--class79.field1860 <= 0) {
                    class60.field1459 = 0;
                }
            } else {
                if (class60.field1459 == 9 && class59.field1455.method348(0) >= 8) {
                    class78.field1848 = class59.field1455.method346(0);
                    class12.field378 = class59.field1455.method346(0) == 1;
                    class132.field3199 = class59.field1455.method346(0);
                    class132.field3199 <<= 0x8;
                    class132.field3199 += class59.field1455.method346(0);
                    class56.field1398 = class59.field1455.method346(0);
                    class59.field1455.method344(0, 1, class36.field907.field974, 109);
                    class36.field907.field957 = 0;
                    class4.field139 = class36.field907.method215(true);
                    class59.field1455.method344(0, 2, class36.field907.field974, 93);
                    class36.field907.field957 = 0;
                    class75.field1804 = class36.field907.method343((byte) -6);
                    class60.field1459 = 10;
                }
                if (class60.field1459 != 10) {
                    class134.field3230++;
                    if (class134.field3230 > 2000) {
                        if (class16.field437 < 1) {
                            class60.field1459 = 0;
                            class16.field437++;
                            if (class88.field2056 == class25.field625) {
                                class25.field625 = class88.field2076;
                            } else {
                                class25.field625 = class88.field2056;
                            }
                        } else {
                            class43.method364((byte) 119, -3);
                        }
                    }
                } else if (class59.field1455.method348(0) >= class75.field1804) {
                    class36.field907.field957 = 0;
                    class59.field1455.method344(0, class75.field1804, class36.field907.field974, 105);
                    class6.method84((byte) 70);
                    class105.field2595 = -1;
                    class128.method992(false, (byte) 92);
                    class4.field139 = -1;
                }
            }
        } catch (IOException var9) {
            if (class16.field437 < 1) {
                class60.field1459 = 0;
                class16.field437++;
                if (class88.field2056 == class25.field625) {
                    class25.field625 = class88.field2076;
                } else {
                    class25.field625 = class88.field2056;
                }
            } else {
                class43.method364((byte) 119, -2);
            }
        }
    }
}
