import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 extends class129 {

    @OriginalMember(owner = "client!p", name = "db", descriptor = "[Lvb;")
    public static class124[] field2315 = new class124[1000];

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "Lv;")
    public static class122 field2302 = class55.method425(-99, " @whi@(X");

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "Lv;")
    public static class122 field2312 = class55.method425(-71, "(Udns");

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "Lv;")
    public static class122 field2323 = class55.method425(-79, "Benutzername: ");

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Ljava/lang/Object;")
    public static Object field2310 = new Object();

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "Z")
    public static boolean field2324 = false;

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "Z")
    public static boolean field2325 = false;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "La;")
    public static class1 field2306;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IJ)V", line = 6)
    public static final void method712(int arg0, long arg1) {
        field2305++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 26 % ((arg0 - 31) / 55);
        for (int var4 = 0; var4 < class30.field764; var4++) {
            if (class59.field1537[var4] == arg1) {
                class30.field764--;
                class62.field1588 = true;
                for (int var5 = var4; var5 < class30.field764; var5++) {
                    class75.field2020[var5] = class75.field2020[var5 + 1];
                    class69.field1824[var5] = class69.field1824[var5 + 1];
                    class59.field1537[var5] = class59.field1537[var5 + 1];
                }
                class74.field1935.method996((byte) 72, 123);
                class74.field1935.method480(arg1, 299629920);
                class82.field2131++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 48)
    public static final void method713(int arg0, Component arg1) {
        arg1.removeMouseListener(class125.field3039);
        arg1.removeMouseMotionListener(class125.field3039);
        if (arg0 <= 60) {
            field2310 = null;
        }
        field2311++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lv;ILv;Lmb;)[Lvb;", line = 89)
    private static final class124[] method714(class122 arg0, int arg1, class122 arg2, class74 arg3) {
        field2307++;
        int var4 = arg3.method628(arg0, true);
        int var5 = arg3.method605(arg2, var4, arg1 + 1036);
        if (arg1 != 0) {
            method716(null, -99, 37, -39, 82, 68, -8, -101, -7);
        }
        return class74.method625((byte) 44, var4, var5, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lkd;II)V", line = 105)
    private final void method715(class64 arg0, int arg1, int arg2) {
        if (arg1 != 9684) {
            method718(-90, null, -110, 82, 90, -123, null, (byte) 77, 67, -10, null);
        }
        if (arg2 == 1) {
            this.field2317 = arg0.method506((byte) -90);
            this.field2313 = arg0.method520(-128);
            this.field2303 = arg0.method520(arg1 ^ 0xFFFFDA5F);
        }
        field2304++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lfe;IIIIIIII)V", line = 125)
    public static final void method716(class36 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 < 53) {
            return;
        }
        if (class5.field138) {
            class80.field2099 = 32;
        } else {
            class80.field2099 = 0;
        }
        field2318++;
        class5.field138 = false;
        if (arg1 >= arg3 && arg3 + 16 > arg1 && arg5 >= arg6 && arg5 < arg6 + 16) {
            arg0.field879 -= class94.field2429 * 4;
            if (arg4 == 1) {
                class62.field1588 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class103.field2558 = true;
            }
        } else if (arg1 >= arg3 && arg3 + 16 > arg1 && arg6 + arg8 - 16 <= arg5 && arg5 < arg6 + arg8) {
            arg0.field879 += class94.field2429 * 4;
            if (arg4 == 1) {
                class62.field1588 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class103.field2558 = true;
            }
        } else if (arg3 - class80.field2099 <= arg1 && arg3 + class80.field2099 + 16 > arg1 && arg5 >= arg6 + 16 && arg6 + arg8 - 16 > arg5 && class94.field2429 > 0) {
            if (arg4 == 1) {
                class62.field1588 = true;
            }
            class5.field138 = true;
            if (arg4 == 2 || arg4 == 3) {
                class103.field2558 = true;
            }
            int var9 = (arg8 - 32) * arg8 / arg7;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg8 - var9 - 32;
            int var11 = arg5 - var9 / 2 - arg6 - 16;
            arg0.field879 = (arg7 - arg8) * var11 / var10;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 196)
    public static final void method717(byte arg0) {
        field2322++;
        if (arg0 != 120) {
            method714(null, 92, null, null);
        }
        class61.method465(0, false, null, (byte) 64);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILa;IIII[Lcc;BII[B)V", line = 210)
    public static final void method718(int arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, class16[] arg6, byte arg7, int arg8, int arg9, byte[] arg10) {
        class64 var11 = new class64(arg10);
        field2309++;
        if (arg7 >= -92) {
            field2315 = null;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method486(104);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method486(125);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var11.method520(-119);
                int var19 = var18 & 0x3;
                int var20 = var14 >> 12;
                int var21 = var18 >> 2;
                if (arg5 == var20 && var16 >= arg2 && var16 < arg2 + 8 && var17 >= arg4 && arg4 + 8 > var17) {
                    class42 var22 = class14.method124((byte) 52, var12);
                    int var23 = class107.method832(arg0, var17 & 0x7, (byte) -122, var19, var22.field1090, var22.field1080, var16 & 0x7) + arg9;
                    int var24 = class36.method322(4882, var22.field1090, var22.field1080, var16 & 0x7, var19, var17 & 0x7, arg0) + arg3;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg8;
                        if ((class54.field1408[1][var23][var24] & 0x2) == 2) {
                            var25 = arg8 - 1;
                        }
                        class16 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg6[var25];
                        }
                        class37.method327(var19 + arg0 & 0x3, (byte) 12, var24, arg8, var26, var12, var23, arg1, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V", line = 297)
    public static void method719(byte arg0) {
        field2323 = null;
        field2306 = null;
        field2310 = null;
        field2312 = null;
        field2302 = null;
        field2315 = null;
        if (arg0 != 27) {
            method714(null, 34, null, null);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B[Lv;)[Lv;", line = 318)
    public static final class122[] method720(byte arg0, class122[] arg1) {
        field2316++;
        class122[] var2 = new class122[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class59.method454(new class122[] { class119.method914(var3, 10), class120.field2907 }, 5176);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class59.method454(new class122[] { var2[var3], arg1[var3] }, 5176);
            }
        }
        if (arg0 < 101) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V", line = 354)
    public static final void method721(int arg0) {
        field2308++;
        if (class22.field596 == 0) {
            field2306 = new class1(4, 104, 104, class93.field2372);
            for (int var1 = 0; var1 < 4; var1++) {
                class41.field1048[var1] = new class16(104, 104);
            }
            class119.field2886 = new class124(512, 512);
            class22.field596 = 20;
            class88.field2262 = class73.field1912;
            class113.field2755 = 5;
        } else if (class22.field596 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class77.field2049[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class1.method43(var2, 500, 800, 512, 334);
            class22.field596 = 30;
            class113.field2755 = 10;
            class88.field2262 = class34.field863;
        } else if (class22.field596 == 30) {
            class22.field599 = class66.method534(true, -126, false, 0, true);
            class108.field2673 = class66.method534(true, -120, false, 1, true);
            class54.field1396 = class66.method534(false, -122, true, 2, true);
            class63.field1605 = class66.method534(true, 116, false, 3, true);
            class24.field662 = class66.method534(true, -127, false, 4, true);
            class59.field1531 = class66.method534(true, 95, true, 5, true);
            class93.field2396 = class66.method534(true, -115, true, 6, false);
            class28.field715 = class66.method534(true, -118, false, 7, true);
            class16.field397 = class66.method534(true, 91, false, 8, true);
            client.field453 = class66.method534(true, arg0 ^ 0x72, false, 9, true);
            class70.field1845 = class66.method534(true, 44, false, 10, true);
            class34.field868 = class66.method534(true, arg0 ^ 0xFFFFFF81, false, 11, true);
            class88.field2262 = class73.field1898;
            class22.field596 = 40;
            class113.field2755 = 20;
        } else if (class22.field596 == 40) {
            byte var7 = 0;
            int var8 = var7 + class22.field599.method819((byte) 50) * 5 / 100;
            int var9 = var8 + class108.field2673.method819((byte) 50) * 5 / 100;
            int var10 = var9 + class54.field1396.method819((byte) 50) * 5 / 100;
            int var11 = var10 + class63.field1605.method819((byte) 50) * 5 / 100;
            int var12 = var11 + class24.field662.method819((byte) 50) * 5 / 100;
            int var13 = var12 + class59.field1531.method819((byte) 50) * 5 / 100;
            int var14 = var13 + class93.field2396.method819((byte) 50) * 5 / 100;
            int var15 = var14 + class28.field715.method819((byte) 50) * 45 / 100;
            int var16 = var15 + class16.field397.method819((byte) 50) * 5 / 100;
            int var17 = var16 + client.field453.method819((byte) 50) * 5 / 100;
            int var18 = var17 + class70.field1845.method819((byte) 50) * 5 / 100;
            int var19 = var18 + class34.field868.method819((byte) 50) * 5 / 100;
            if (var19 == 100) {
                class88.field2262 = class88.field2249;
                class22.field596 = 45;
                class113.field2755 = 30;
            } else {
                if (var19 != 0) {
                    class88.field2262 = class59.method454(new class122[] { class19.field500, class119.method914(var19, 10), class45.field1172 }, 5176);
                }
                class113.field2755 = 30;
            }
        } else if (class22.field596 == 45) {
            class51.method407(!class109.field2703, (byte) -120, 0, class2.field70);
            class63.field1604 = class7.method77(class2.field70, class54.field1411, (byte) -39);
            class125.field3032 = new class18(22050, client.field447);
            class88.field2262 = class18.field438;
            class113.field2755 = 35;
            class22.field596 = 50;
        } else if (class22.field596 == 50) {
            int var20 = 0;
            if (class83.field2169 == null) {
                class83.field2169 = class40.method345(arg0 ^ 0x3, class38.field994, class51.field1287, class16.field397);
            } else {
                var20++;
            }
            if (class60.field1553 == null) {
                class60.field1553 = class40.method345(0, class25.field677, class51.field1287, class16.field397);
            } else {
                var20++;
            }
            if (class103.field2545 == null) {
                class103.field2545 = class40.method345(0, class41.field1045, class51.field1287, class16.field397);
            } else {
                var20++;
            }
            if (class32.field791 == null) {
                class32.field791 = class40.method345(0, class18.field425, class51.field1287, class16.field397);
            } else {
                var20++;
            }
            if (var20 < 4) {
                class88.field2262 = class59.method454(new class122[] { class119.field2893, class119.method914(var20 * 100 / 4, 10), class45.field1172 }, 5176);
                class113.field2755 = 40;
            } else {
                class113.field2755 = 40;
                class120.field2911 = new class105[] { class83.field2169, class60.field1553, class103.field2545, class32.field791 };
                class22.field596 = 60;
                class88.field2262 = class100.field2463;
            }
        } else if (class22.field596 == 60) {
            int var21 = client.method182(class16.field397, class70.field1845, 0);
            int var22 = class23.method245((byte) 50);
            if (var21 < var22) {
                class88.field2262 = class59.method454(new class122[] { class51.field1331, class119.method914(var21 * 100 / var22, 10), class45.field1172 }, arg0 ^ 0x143B);
                class113.field2755 = 50;
            } else {
                class113.field2755 = 50;
                class88.field2262 = class34.field862;
                class76.method641(5, true);
                class22.field596 = 70;
            }
        } else if (class22.field596 == 70) {
            if (class54.field1396.method610(-1)) {
                class45.method376(-3, class54.field1396);
                class74.method607((byte) -123, class54.field1396);
                class42.method366(class54.field1396, class28.field715, 3);
                class81.method665(class54.field1396, true, class28.field715, class109.field2703);
                class47.method388(class54.field1396, 122, class28.field715);
                class118.method905(class70.field1838, class54.field1396, 10, class28.field715);
                class114.method877(class22.field599, class54.field1396, (byte) 121, class108.field2673);
                class114.method879(class28.field715, false, class54.field1396);
                class127.method1004(class54.field1396, (byte) -3);
                class25.method258(123, class54.field1396);
                class24.method256((byte) 109, class28.field715, class63.field1605, class16.field397);
                class22.field596 = 80;
                class88.field2262 = class74.field1984;
                class113.field2755 = 60;
            } else {
                class88.field2262 = class59.method454(new class122[] { class38.field993, class119.method914(class54.field1396.method825(102), 10), class45.field1172 }, 5176);
                class113.field2755 = 60;
            }
        } else if (class22.field596 == 80) {
            int var23 = 0;
            if (class67.field1731 == null) {
                class67.field1731 = class64.method517(0, class51.field1287, class16.field397, class29.field742);
            } else {
                var23++;
            }
            if (class125.field3029 == null) {
                class125.field3029 = class64.method517(0, class51.field1287, class16.field397, class62.field1585);
            } else {
                var23++;
            }
            if (class119.field2901 == null) {
                class119.field2901 = class72.method592(class24.field660, class51.field1287, class16.field397, 2);
            } else {
                var23++;
            }
            if (class72.field1880 == null) {
                class72.field1880 = method714(class131.field3185, 0, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class61.field1572 == null) {
                class61.field1572 = method714(class81.field2113, 0, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class24.field666 == null) {
                class24.field666 = method714(class30.field756, 0, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class49.field1248 == null) {
                class49.field1248 = method714(class74.field1996, 0, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class59.field1528 == null) {
                class59.field1528 = method714(class2.field86, arg0 ^ 0x3, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class69.field1810 == null) {
                class69.field1810 = class64.method517(0, class51.field1287, class16.field397, class59.field1535);
            } else {
                var23++;
            }
            if (class62.field1583 == null) {
                class62.field1583 = method714(class93.field2390, arg0 ^ 0x3, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class45.field1176 == null) {
                class45.field1176 = method714(class127.field3102, arg0 ^ 0x3, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class34.field835 == null) {
                class34.field835 = method714(class83.field2165, 0, class51.field1287, class16.field397);
            } else {
                var23++;
            }
            if (class94.field2416 == null) {
                class94.field2416 = class72.method592(class100.field2464, class51.field1287, class16.field397, 2);
            } else {
                var23++;
            }
            if (class81.field2123 == null) {
                class81.field2123 = class72.method592(class11.field328, class51.field1287, class16.field397, 2);
            } else {
                var23++;
            }
            if (var23 < 14) {
                class88.field2262 = class59.method454(new class122[] { class25.field688, class119.method914(var23 * 100 / 14, 10), class45.field1172 }, arg0 + 5173);
                class113.field2755 = 70;
            } else {
                int var24 = (int) (Math.random() * 21.0D) - 10;
                class125.field3029.method981();
                int var25 = (int) (Math.random() * 41.0D) - 20;
                int var26 = (int) (Math.random() * 21.0D) - 10;
                int var27 = (int) (Math.random() * 21.0D) - 10;
                for (int var28 = 0; var28 < class72.field1880.length; var28++) {
                    class72.field1880[var28].method975(var24 + var25, var25 + var27, var25 + var26);
                }
                class119.field2901[0].method58(var24 + var25, var25 + var27, var25 + var26);
                class22.field596 = 85;
                class88.field2262 = class125.field3050;
                class113.field2755 = 70;
            }
        } else if (class22.field596 == 85) {
            int var29 = class22.method237((byte) 30, class16.field397);
            int var30 = class44.method375(-99);
            if (var30 > var29) {
                class88.field2262 = class59.method454(new class122[] { class73.field1893, class119.method914(var29 * 100 / var30, 10), class45.field1172 }, 5176);
                class113.field2755 = 80;
            } else {
                class88.field2262 = class7.field161;
                class113.field2755 = 80;
                class22.field596 = 90;
            }
        } else if (class22.field596 == 90) {
            if (client.field453.method610(-1)) {
                class23 var31 = new class23(client.field453, class16.field397, 20, 0.8D, class109.field2703 ? 64 : 128);
                class77.method656(var31);
                class77.method653(0.8D);
                class22.field596 = 110;
                class88.field2262 = class11.field309;
                class113.field2755 = 90;
            } else {
                class88.field2262 = class59.method454(new class122[] { class43.field1136, class119.method914(client.field453.method825(arg0 ^ 0x6F), 10), class45.field1172 }, 5176);
                class113.field2755 = 90;
            }
        } else if (class22.field596 == 110) {
            class106.field2636 = new class59();
            class2.field70.method442(10, class106.field2636, false);
            class113.field2755 = 94;
            class22.field596 = 120;
            class88.field2262 = class28.field711;
        } else if (arg0 == 3) {
            if (class22.field596 == 120) {
                if (class70.field1845.method624(class51.field1287, -1, class18.field426)) {
                    class47 var32 = new class47(class70.field1845.method613(class51.field1287, class18.field426, 8746));
                    class107.method834(~arg0, var32);
                    class113.field2755 = 96;
                    class88.field2262 = class80.field2098;
                    class22.field596 = 130;
                } else {
                    class88.field2262 = class59.method454(new class122[] { class119.field2888, class63.field1602 }, arg0 + 5173);
                    class113.field2755 = 96;
                }
            } else if (class22.field596 == 130) {
                if (class63.field1605.method610(arg0 ^ 0xFFFFFFFC)) {
                    class88.field2262 = class51.field1330;
                    class22.field596 = 140;
                    class113.field2755 = 100;
                } else {
                    class88.field2262 = class59.method454(new class122[] { class10.field258, class119.method914(class63.field1605.method825(96), arg0 + 7), class45.field1172 }, arg0 ^ 0x143B);
                    class113.field2755 = 100;
                }
            } else if (class22.field596 == 140) {
                class76.method641(10, true);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILkd;)V", line = 759)
    public final void method722(int arg0, class64 arg1) {
        if (arg0 != 0) {
            field2323 = null;
        }
        field2314++;
        while (true) {
            int var3 = arg1.method520(-112);
            if (var3 == 0) {
                return;
            }
            this.method715(arg1, 9684, var3);
        }
    }
}
