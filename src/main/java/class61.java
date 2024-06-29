import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class61 extends class120 {

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field1562 = 0;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[I")
    public static int[] field1559 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field1557 = 0;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field1563 = -1;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Lv;")
    public static class122 field1561 = class55.method425(-83, "Ein");

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Z")
    public static boolean field1566 = false;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Lv;")
    public static class122 field1568 = null;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Z")
    public static boolean field1578 = true;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lv;")
    private static class122 field1577 = class55.method425(-121, " x ");

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Lmb;")
    public static class74 field1569;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "[Lvb;")
    public static class124[] field1572;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I", line = 7)
    private static final int method462(int arg0) {
        int var1 = class30.field769[arg0];
        int var2 = (class108.field2674 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJII)V", line = 28)
    public final void method463(int arg0, long arg1, int arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg0 * 5.0E-4D) * (double) arg3 + 0.5D);
        field1576++;
        if (class108.field2674 != var6) {
            class108.field2674 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method462(var7);
                this.method472(var7 + 176, 7, var8 >> 7, arg1);
                this.method472(var7 + 176, 39, var8 & 0x7F, arg1);
            }
        }
        if (arg2 != 245) {
            field1572 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 56)
    public static final void method464(int arg0) {
        field1574++;
        for (int var1 = 0; var1 < class107.field2661; var1++) {
            int var2 = class118.field2859[var1];
            class80 var3 = class94.field2423[var2];
            int var4 = class14.field372.method520(-109);
            if ((var4 & 0x4) != 0) {
                int var5 = class14.field372.method497((byte) 8);
                int var6 = class14.field372.method520(-111);
                var3.method110(var6, class16.field396, var5, (byte) -28);
                var3.field320 = class16.field396 + 300;
                var3.field290 = class14.field372.method497((byte) 8);
                var3.field277 = class14.field372.method520(-106);
            }
            if ((var4 & 0x1) != 0) {
                var3.field315 = class14.field372.method524((byte) 23);
                int var7 = class14.field372.method485((byte) -114);
                var3.field326 = 0;
                var3.field329 = 0;
                var3.field286 = var7 >> 16;
                if (var3.field315 == 65535) {
                    var3.field315 = -1;
                }
                var3.field276 = (var7 & 0xFFFF) + class16.field396;
                if (var3.field276 > class16.field396) {
                    var3.field326 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field321 = class14.field372.method506((byte) -90);
                var3.field327 = class14.field372.method508(arg0 ^ 0xFFFFDCFA);
            }
            if ((var4 & 0x40) != 0) {
                int var8 = class14.field372.method502((byte) 44);
                int var9 = class14.field372.method520(-122);
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var3.field324 == var8 && var8 != -1) {
                    int var10 = class51.method401(arg0 - 39367, var8).field2268;
                    if (var10 == 1) {
                        var3.field301 = 0;
                        var3.field292 = var9;
                        var3.field302 = 0;
                        var3.field304 = 0;
                    }
                    if (var10 == 2) {
                        var3.field304 = 0;
                    }
                } else if (var8 == -1 || var3.field324 == -1 || class51.method401(-30325, var8).field2273 >= class51.method401(arg0 ^ 0xFFFFAAD9, var3.field324).field2273) {
                    var3.field306 = var3.field285;
                    var3.field301 = 0;
                    var3.field324 = var8;
                    var3.field304 = 0;
                    var3.field292 = var9;
                    var3.field302 = 0;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field2089 = class109.method843(class14.field372.method502((byte) 44), (byte) -31);
                var3.field294 = var3.field2089.field569;
                var3.field297 = var3.field2089.field547;
                var3.field317 = var3.field2089.field540;
                var3.field279 = var3.field2089.field560;
                var3.field282 = var3.field2089.field529;
                var3.field296 = var3.field2089.field558;
                var3.field340 = var3.field2089.field564;
            }
            if ((var4 & 0x2) != 0) {
                int var11 = class14.field372.method520(-116);
                int var12 = class14.field372.method494(255);
                var3.method110(var12, class16.field396, var11, (byte) -28);
                var3.field320 = class16.field396 + 300;
                var3.field290 = class14.field372.method494(255);
                var3.field277 = class14.field372.method530((byte) 92);
            }
            if ((var4 & 0x10) != 0) {
                var3.field303 = class14.field372.method490(-77);
                var3.field281 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field323 = class14.field372.method524((byte) 101);
                if (var3.field323 == 65535) {
                    var3.field323 = -1;
                }
            }
        }
        if (arg0 != 9042) {
            field1569 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ[BB)V", line = 213)
    public static final void method465(int arg0, boolean arg1, byte[] arg2, byte arg3) {
        if (arg3 <= 56) {
            field1566 = false;
        }
        field1564++;
        if (class66.field1697 == null) {
            return;
        }
        if (class38.field992 >= 0) {
            class66.field1697.method759((byte) -37);
            class14.field359 = null;
            class38.field992 = -1;
            class80.field2090 = 0;
            class28.field723 = 20;
        }
        if (arg2 == null) {
            return;
        }
        if (class28.field723 > 0) {
            class66.field1697.method755(arg0, -113);
            class28.field723 = 0;
        }
        class38.field992 = arg0;
        class66.field1697.method757(arg1, arg0, arg2, -84);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIJ)V", line = 249)
    public final void method466(int arg0, int arg1, long arg2) {
        class108.field2674 = arg0;
        field1567++;
        for (int var5 = arg1; var5 < 16; var5++) {
            class30.field769[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method462(var6);
            this.method472(var6 + 176, 7, var7 >> 7, arg2);
            this.method472(var6 + 176, 39, var7 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V", line = 278)
    public final void method467(long arg0, byte arg1) {
        field1570++;
        for (int var4 = 0; var4 < 16; var4++) {
            this.method472(var4 + 176, 123, 0, arg0);
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method472(var5 + 176, 120, 0, arg0);
        }
        if (arg1 != 86) {
            this.method466(-6, 19, -16L);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method472(var6 + 176, 121, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method472(var7 + 176, 0, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method472(var8 + 176, 32, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method472(var9 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIJ)Z", line = 342)
    public final boolean method468(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method472(arg0, arg1, arg2, arg3);
                int var6 = arg0 & 0xF;
                class30.field769[var6] = 12800;
                int var7 = method462(var6);
                this.method472(arg0, 7, var7 >> 7, arg3);
                this.method472(arg0, 39, var7 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var8 = arg0 & 0xF;
                if (arg1 == 7) {
                    class30.field769[var8] = (arg2 << 7) + (class30.field769[var8] & 0x7F);
                } else {
                    class30.field769[var8] = (class30.field769[var8] & 0x3F80) + arg2;
                }
                int var9 = method462(var8);
                this.method472(arg0, 7, var9 >> 7, arg3);
                this.method472(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V", line = 378)
    public static final void method469(int arg0) {
        class45.field1169 = null;
        class118.field2847 = null;
        field1558++;
        class60.field1542 = null;
        class89.field2271 = null;
        class82.field2142 = null;
        if (arg0 < 42) {
            method465(123, false, null, (byte) -89);
        }
        class118.field2838 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V", line = 405)
    public static void method470(byte arg0) {
        field1572 = null;
        field1569 = null;
        field1577 = null;
        field1561 = null;
        if (arg0 > 79) {
            field1568 = null;
            field1559 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V", line = 425)
    public static final void method471(int arg0, int arg1) {
        field1573++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class88.field2255[arg1];
        int var3 = class56.field1483[arg1];
        int var4 = class34.field837[arg1];
        int var5 = class60.field1550[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (class83.field2166 != 0 && var3 != 1001) {
            class103.field2558 = true;
            class83.field2166 = 0;
        }
        if (var3 == 55) {
            class102.field2536++;
            boolean var6 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var6) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class56.field1480 = class34.field865;
            class47.field1215 = 0;
            class42.field1061 = class125.field3049;
            client.field459 = 2;
            class74.field1935.method996((byte) 119, 207);
            class74.field1935.method519((byte) 104, var4);
            class74.field1935.method521(class51.field1286 + var5, 1198495528);
            class74.field1935.method519((byte) 113, class2.field77 + var2);
        }
        if (var3 == 16) {
            class55 var8 = class125.field3043[var4];
            if (var8 != null) {
                class88.field2247++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var8.field287[0], 1, 127, var8.field307[0], class70.field1828.field307[0], 2);
                class47.field1215 = 0;
                class42.field1061 = class125.field3049;
                class56.field1480 = class34.field865;
                client.field459 = 2;
                class74.field1935.method996((byte) 124, 220);
                class74.field1935.method521(class129.field3128, 1198495528);
                class74.field1935.method521(var4, 1198495528);
                class74.field1935.method509((byte) -35, class11.field334);
                class74.field1935.method519((byte) 91, class49.field1246);
            }
        }
        if (var3 == 14) {
            class6.field151++;
            boolean var9 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var9) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            client.field459 = 2;
            class47.field1215 = 0;
            class42.field1061 = class125.field3049;
            class56.field1480 = class34.field865;
            class74.field1935.method996((byte) 125, 35);
            class74.field1935.method521(var4, 1198495528);
            class74.field1935.method521(class51.field1286 + var5, 1198495528);
            class74.field1935.method525(var2 + class2.field77, true);
        }
        if (var3 == 11 && !class24.field664) {
            class74.field1935.method996((byte) 96, 31);
            class24.field664 = true;
            class58.field1514++;
        }
        if (var3 == 20) {
            class55 var11 = class125.field3043[var4];
            if (var11 != null) {
                class118.field2856++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var11.field287[0], 1, 127, var11.field307[0], class70.field1828.field307[0], 2);
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                client.field459 = 2;
                class47.field1215 = 0;
                class74.field1935.method996((byte) 101, 245);
                class74.field1935.method525(var4, true);
            }
        }
        if (var3 == 8 || var3 == 21 || var3 == 36 || var3 == 6) {
            class122 var12 = class23.field617[arg1];
            int var13 = var12.method955(24669, class89.field2270);
            if (var13 != -1) {
                long var14 = var12.method960(var13 + 5, 125).method957(-66).method959(-1);
                if (var3 == 8) {
                    class106.method826(var14, -26610);
                }
                if (var3 == 21) {
                    class119.method913(231, var14);
                }
                if (var3 == 36) {
                    class90.method712(-55, var14);
                }
                if (var3 == 6) {
                    class114.method880(107, var14);
                }
            }
        }
        if (var3 == 19) {
            class80 var16 = class94.field2423[var4];
            if (var16 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var16.field287[0], 1, 127, var16.field307[0], class70.field1828.field307[0], 2);
                class21.field575++;
                client.field459 = 2;
                class47.field1215 = 0;
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                class74.field1935.method996((byte) 92, 109);
                class74.field1935.method521(var4, 1198495528);
            }
        }
        if (var3 == 42 || var3 == 52) {
            class122 var17 = class23.field617[arg1];
            int var18 = var17.method955(24669, class89.field2270);
            if (var18 != -1) {
                class122 var19 = var17.method960(var18 + 5, 126).method957(-66);
                class122 var20 = var19.method950((byte) -3).method939(15365);
                boolean var21 = false;
                for (int var22 = 0; var22 < class108.field2671; var22++) {
                    class55 var23 = class125.field3043[class7.field175[var22]];
                    if (var23 != null && var23.field1448 != null && var23.field1448.method938(-8186, var20)) {
                        class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var23.field287[0], 1, 127, var23.field307[0], class70.field1828.field307[0], 2);
                        var21 = true;
                        if (var3 == 42) {
                            class100.field2489++;
                            class74.field1935.method996((byte) 100, 175);
                            class74.field1935.method525(class7.field175[var22], true);
                        }
                        if (var3 == 52) {
                            class74.field1935.method996((byte) 79, 157);
                            class74.field1935.method479(1436108328, class7.field175[var22]);
                            class106.field2625++;
                        }
                        break;
                    }
                }
                if (!var21) {
                    class55.method429(class51.field1287, 0, (byte) 48, class59.method454(new class122[] { class24.field665, var20 }, 5176));
                }
            }
        }
        if (var3 == 35) {
            class21.field570++;
            class26.method264(var5, var2, 0, var4);
            class74.field1935.method996((byte) 54, 249);
            class74.field1935.method521(class51.field1286 + var5, 1198495528);
            class74.field1935.method479(1436108328, class2.field77 + var2);
            class74.field1935.method521(var4 >> 14 & 0x7FFF, 1198495528);
        }
        if (var3 == 27) {
            class95.field2442++;
            class74.field1935.method996((byte) 65, 192);
            class74.field1935.method479(1436108328, var2);
            class74.field1935.method521(var4, 1198495528);
            class74.field1935.method518(false, var5);
            class73.field1903 = var2;
            class47.field1218 = 2;
            class28.field731 = 0;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
            class32.field784 = var5;
        }
        if (var3 == 38) {
            class2.field75++;
            class74.field1935.method996((byte) 84, 22);
            class74.field1935.method518(false, var5);
            class74.field1935.method519((byte) 92, var2);
            class74.field1935.method525(var4, true);
            class32.field784 = var5;
            class28.field731 = 0;
            class73.field1903 = var2;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 26) {
            class16.method160(0, class51.field1323);
            class103.field2558 = true;
            class51.field1323 = -1;
        }
        if (var3 == 12) {
            class55 var24 = class125.field3043[var4];
            if (var24 != null) {
                class29.field747++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var24.field287[0], 1, 127, var24.field307[0], class70.field1828.field307[0], 2);
                client.field459 = 2;
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                class47.field1215 = 0;
                class74.field1935.method996((byte) 111, 146);
                class74.field1935.method525(var4, true);
                class74.field1935.method504((byte) -123, class30.field750);
            }
        }
        if (var3 == 1003) {
            client.field459 = 2;
            class69.field1818++;
            class56.field1480 = class34.field865;
            class47.field1215 = 0;
            class42.field1061 = class125.field3049;
            class74.field1935.method996((byte) 80, 91);
            class74.field1935.method479(1436108328, var4 >> 14 & 0x7FFF);
        }
        if (var3 == 37) {
            class122 var25 = class23.field617[arg1];
            int var26 = var25.method955(24669, class89.field2270);
            if (var26 != -1) {
                int var27 = -1;
                long var28 = var25.method960(var26 + 5, 127).method957(-66).method959(-1);
                for (int var30 = 0; var30 < class30.field764; var30++) {
                    if (class59.field1537[var30] == var28) {
                        var27 = var30;
                        break;
                    }
                }
                if (var27 != -1 && class69.field1824[var27] > 0) {
                    class51.field1318 = true;
                    class103.field2558 = true;
                    class88.field2263 = 3;
                    class83.field2166 = 0;
                    class51.field1294 = class51.field1287;
                    class94.field2428 = class59.field1537[var27];
                    class51.field1319 = class59.method454(new class122[] { class55.field1442, class75.field2020[var27] }, 5176);
                }
            }
        }
        if (var3 == 54) {
            class74.field1935.method996((byte) 54, 135);
            class74.field1935.method499(var5, (byte) 122);
            class131.field3174++;
            class74.field1935.method519((byte) 108, var4);
            class74.field1935.method519((byte) 89, var2);
            class28.field731 = 0;
            class73.field1903 = var2;
            class32.field784 = var5;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 10) {
            class55 var31 = class125.field3043[var4];
            if (var31 != null) {
                class58.field1513++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var31.field287[0], 1, 127, var31.field307[0], class70.field1828.field307[0], 2);
                class42.field1061 = class125.field3049;
                class47.field1215 = 0;
                client.field459 = 2;
                class56.field1480 = class34.field865;
                class74.field1935.method996((byte) 93, 208);
                class74.field1935.method521(var4, 1198495528);
            }
        }
        if (var3 == 1004) {
            class10.field235++;
            class26.method264(var5, var2, 0, var4);
            class74.field1935.method996((byte) 108, 212);
            class74.field1935.method519((byte) 115, class2.field77 + var2);
            class74.field1935.method525(var4 >> 14 & 0x7FFF, true);
            class74.field1935.method519((byte) 71, class51.field1286 + var5);
        }
        if (var3 == 18) {
            class74.field1935.method996((byte) 120, 110);
            class94.field2405++;
            class74.field1935.method509((byte) -37, var5);
            class36 var32 = class4.method65(var5, false);
            if (var32.field902 != null && var32.field902[0][0] == 5) {
                int var33 = var32.field902[0][1];
                if (class73.field1896[var33] != var32.field925[0]) {
                    class73.field1896[var33] = var32.field925[0];
                    class33.method293(var33, (byte) 122);
                    class62.field1588 = true;
                }
            }
        }
        if (var3 == 56) {
            class74.field1935.method996((byte) 107, 186);
            class74.field1935.method504((byte) -87, var5);
            class66.field1693++;
            class74.field1935.method521(var2, 1198495528);
            class74.field1935.method525(var4, true);
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            class28.field731 = 0;
            class32.field784 = var5;
            class73.field1903 = var2;
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 31) {
            class36 var34 = class4.method65(var5, false);
            boolean var35 = true;
            if (var34.field932 > 0) {
                var35 = class8.method87(var34, true);
            }
            if (var35) {
                class94.field2405++;
                class74.field1935.method996((byte) 125, 110);
                class74.field1935.method509((byte) -7, var5);
            }
        }
        if (var3 == 39) {
            class80 var36 = class94.field2423[var4];
            if (var36 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var36.field287[0], 1, 127, var36.field307[0], class70.field1828.field307[0], 2);
                class42.field1061 = class125.field3049;
                class47.field1215 = 0;
                class56.field1480 = class34.field865;
                client.field459 = 2;
                class73.field1920++;
                class74.field1935.method996((byte) 87, 178);
                class74.field1935.method521(var4, 1198495528);
            }
        }
        if (var3 == 23) {
            class122 var37 = class23.field617[arg1];
            int var38 = var37.method955(24669, class89.field2270);
            if (var38 != -1) {
                if (class47.field1210 == -1) {
                    class129.method1013(-29565);
                    if (class72.field1851 != -1) {
                        class51.field1288 = var37.method960(var38 + 5, 127).method957(-66);
                        class95.field2432 = class47.field1210 = class72.field1851;
                        field1566 = false;
                    }
                } else {
                    class55.method429(class51.field1287, 0, (byte) 48, class74.field1990);
                }
            }
        }
        if (var3 == 46) {
            class108.field2663++;
            boolean var39 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var39) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class42.field1061 = class125.field3049;
            class47.field1215 = 0;
            client.field459 = 2;
            class56.field1480 = class34.field865;
            class74.field1935.method996((byte) 61, 167);
            class74.field1935.method525(class51.field1286 + var5, true);
            class74.field1935.method519((byte) 107, var4);
            class74.field1935.method479(1436108328, class49.field1246);
            class74.field1935.method525(class2.field77 + var2, true);
            class74.field1935.method519((byte) 125, class129.field3128);
            class74.field1935.method509((byte) -124, class11.field334);
        }
        if (var3 == 15 && class26.method264(var5, var2, 0, var4)) {
            class46.field1187++;
            class74.field1935.method996((byte) 116, 134);
            class74.field1935.method521(class2.field77 + var2, 1198495528);
            class74.field1935.method518(false, class11.field334);
            class74.field1935.method519((byte) 74, var4 >> 14 & 0x7FFF);
            class74.field1935.method525(class129.field3128, true);
            class74.field1935.method519((byte) 98, var5 + class51.field1286);
            class74.field1935.method479(1436108328, class49.field1246);
        }
        if (var3 == 17) {
            class11.field334 = var5;
            class49.field1246 = var2;
            class122.field2990 = 1;
            class129.field3128 = var4;
            field1568 = class59.method454(new class122[] { class28.field729, class5.method69(var4, false).field222, class89.field2270 }, 5176);
            class91.field2334 = 0;
            class62.field1588 = true;
            if (field1568 == null) {
                field1568 = class37.field986;
            }
            return;
        }
        if (var3 == 49) {
            class74.field1935.method996((byte) 94, 213);
            class113.field2760++;
            class74.field1935.method519((byte) 66, var4);
            class74.field1935.method499(var5, (byte) 125);
            class74.field1935.method519((byte) 126, var2);
            class73.field1903 = var2;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            class32.field784 = var5;
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
            class28.field731 = 0;
        }
        if (var3 == 29) {
            class74.field1935.method996((byte) 104, 58);
            class102.field2530++;
            class74.field1935.method519((byte) 112, var4);
            class74.field1935.method499(class11.field334, (byte) -46);
            class74.field1935.method499(var5, (byte) 124);
            class74.field1935.method519((byte) 90, class49.field1246);
            class74.field1935.method479(1436108328, var2);
            class74.field1935.method519((byte) 125, class129.field3128);
            class73.field1903 = var2;
            class32.field784 = var5;
            class28.field731 = 0;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 47) {
            class47.field1212++;
            class26.method264(var5, var2, 0, var4);
            class74.field1935.method996((byte) 66, 53);
            class74.field1935.method519((byte) 110, class2.field77 + var2);
            class74.field1935.method479(1436108328, class51.field1286 + var5);
            class74.field1935.method479(1436108328, var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1006) {
            class36 var41 = class4.method65(var5, false);
            if (var41 == null || var41.field942[var2] < 100000) {
                class74.field1935.method996((byte) 120, 214);
                class114.field2772++;
                class74.field1935.method519((byte) 77, var4);
            } else {
                class55.method429(class51.field1287, 0, (byte) 48, class59.method454(new class122[] { class119.method914(var41.field942[var2], 10), field1577, class5.method69(var4, false).field222 }, 5176));
            }
            class32.field784 = var5;
            class47.field1218 = 2;
            class28.field731 = 0;
            class73.field1903 = var2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 28) {
            if (class50.field1261) {
                class90.field2306.method23(var2 - 4, var5 + -4);
            } else {
                class90.field2306.method23(class125.field3049 - 4, class34.field865 + -4);
            }
        }
        if (var3 == 40) {
            class70.field1839++;
            boolean var42 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var42) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class56.field1480 = class34.field865;
            class42.field1061 = class125.field3049;
            class47.field1215 = 0;
            client.field459 = 2;
            class74.field1935.method996((byte) 98, 20);
            class74.field1935.method479(1436108328, var4);
            class74.field1935.method519((byte) 109, var2 + class2.field77);
            class74.field1935.method479(1436108328, class51.field1286 + var5);
        }
        if (var3 == 25) {
            class14.field360++;
            class26.method264(var5, var2, 0, var4);
            class74.field1935.method996((byte) 122, 43);
            class74.field1935.method519((byte) 64, class51.field1286 + var5);
            class74.field1935.method519((byte) 95, var4 >> 14 & 0x7FFF);
            class74.field1935.method519((byte) 124, class2.field77 + var2);
        }
        if (var3 == 53) {
            class129.method1013(-29565);
        }
        if (var3 == 3) {
            class80 var44 = class94.field2423[var4];
            if (var44 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var44.field287[0], 1, 127, var44.field307[0], class70.field1828.field307[0], 2);
                class94.field2411++;
                class42.field1061 = class125.field3049;
                class56.field1480 = class34.field865;
                class47.field1215 = 0;
                client.field459 = 2;
                class74.field1935.method996((byte) 58, 191);
                class74.field1935.method519((byte) 98, var4);
            }
        }
        if (var3 == 13) {
            class80 var45 = class94.field2423[var4];
            if (var45 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var45.field287[0], 1, 127, var45.field307[0], class70.field1828.field307[0], 2);
                client.field459 = 2;
                class5.field119++;
                class47.field1215 = 0;
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                class74.field1935.method996((byte) 84, 2);
                class74.field1935.method509((byte) -60, class11.field334);
                class74.field1935.method521(var4, 1198495528);
                class74.field1935.method479(1436108328, class49.field1246);
                class74.field1935.method479(1436108328, class129.field3128);
            }
        }
        if (var3 == 48) {
            class80 var46 = class94.field2423[var4];
            if (var46 != null) {
                class24.field641++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var46.field287[0], 1, 127, var46.field307[0], class70.field1828.field307[0], 2);
                client.field459 = 2;
                class47.field1215 = 0;
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                class74.field1935.method996((byte) 112, 187);
                class74.field1935.method479(1436108328, var4);
            }
        }
        if (var3 == 43) {
            class36 var47 = class4.method65(var5, false);
            class32.field778 = var47.field903;
            class30.field750 = var5;
            class62.field1588 = true;
            class122.field2990 = 0;
            class21.field557 = var47.field957;
            class91.field2334 = 1;
            class70.field1825 = class59.method454(new class122[] { class75.field2010, var47.field953, class89.field2270 }, 5176);
            if (class32.field778 == 16) {
                class62.field1588 = true;
                class43.field1146 = 3;
                class114.field2796 = true;
            }
            return;
        }
        if (var3 == 32) {
            class55 var48 = class125.field3043[var4];
            if (var48 != null) {
                class83.field2161++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var48.field287[0], 1, 127, var48.field307[0], class70.field1828.field307[0], 2);
                class56.field1480 = class34.field865;
                client.field459 = 2;
                class42.field1061 = class125.field3049;
                class47.field1215 = 0;
                class74.field1935.method996((byte) 89, 211);
                class74.field1935.method525(var4, true);
            }
        }
        if (var3 == 51) {
            class74.field1935.method996((byte) 126, 137);
            field1571++;
            class74.field1935.method525(var2, true);
            class74.field1935.method509((byte) -60, var5);
            class74.field1935.method519((byte) 115, var4);
            class47.field1218 = 2;
            class28.field731 = 0;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            class73.field1903 = var2;
            class32.field784 = var5;
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 1 && class26.method264(var5, var2, 0, var4)) {
            class42.field1078++;
            class74.field1935.method996((byte) 89, 97);
            class74.field1935.method525(var5 + class51.field1286, true);
            class74.field1935.method521(var2 + class2.field77, 1198495528);
            class74.field1935.method479(1436108328, var4 >> 14 & 0x7FFF);
            class74.field1935.method509((byte) -118, class30.field750);
        }
        if (var3 == 33) {
            class74.field1935.method996((byte) 102, 110);
            class74.field1935.method509((byte) -25, var5);
            class36 var49 = class4.method65(var5, false);
            if (var49.field902 != null && var49.field902[0][0] == 5) {
                int var50 = var49.field902[0][1];
                class73.field1896[var50] = 1 - class73.field1896[var50];
                class33.method293(var50, (byte) 90);
                class62.field1588 = true;
            }
            class94.field2405++;
        }
        if (var3 == 45) {
            boolean var51 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            class129.field3130++;
            if (!var51) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class47.field1215 = 0;
            class56.field1480 = class34.field865;
            class42.field1061 = class125.field3049;
            client.field459 = 2;
            class74.field1935.method996((byte) 95, 226);
            class74.field1935.method479(1436108328, var4);
            class74.field1935.method525(class2.field77 + var2, true);
            class74.field1935.method479(1436108328, class51.field1286 + var5);
        }
        if (var3 == 9) {
            class2.field72++;
            boolean var53 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var53) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class56.field1480 = class34.field865;
            class42.field1061 = class125.field3049;
            client.field459 = 2;
            class47.field1215 = 0;
            class74.field1935.method996((byte) 94, 92);
            class74.field1935.method499(class30.field750, (byte) 125);
            class74.field1935.method519((byte) 74, class51.field1286 + var5);
            class74.field1935.method519((byte) 65, var2 + class2.field77);
            class74.field1935.method519((byte) 80, var4);
        }
        if (var3 == 24) {
            class74.field1935.method996((byte) 61, 93);
            class74.field1935.method525(var4, true);
            field1565++;
            class74.field1935.method518(false, var5);
            class74.field1935.method479(1436108328, var2);
            class73.field1903 = var2;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            class28.field731 = 0;
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
            class32.field784 = var5;
        }
        if (var3 == 30) {
            class46.field1186++;
            boolean var55 = class95.method751(0, false, 0, 0, class70.field1828.field287[0], 0, var2, 0, 127, var5, class70.field1828.field307[0], 2);
            if (!var55) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var2, 1, 127, var5, class70.field1828.field307[0], 2);
            }
            class56.field1480 = class34.field865;
            class47.field1215 = 0;
            client.field459 = 2;
            class42.field1061 = class125.field3049;
            class74.field1935.method996((byte) 109, 9);
            class74.field1935.method525(class2.field77 + var2, true);
            class74.field1935.method479(1436108328, var4);
            class74.field1935.method521(class51.field1286 + var5, 1198495528);
        }
        if (var3 == 22) {
            class55 var57 = class125.field3043[var4];
            if (var57 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var57.field287[0], 1, 127, var57.field307[0], class70.field1828.field307[0], 2);
                class47.field1215 = 0;
                class56.field1480 = class34.field865;
                class42.field1061 = class125.field3049;
                client.field459 = 2;
                class74.field1935.method996((byte) 116, 157);
                class74.field1935.method479(1436108328, var4);
                class106.field2625++;
            }
        }
        if (var3 == 7) {
            class74.field1935.method996((byte) 56, 243);
            class129.field3134++;
            class74.field1935.method509((byte) -13, var5);
            class74.field1935.method525(var2, true);
            class74.field1935.method499(class30.field750, (byte) 126);
            class74.field1935.method479(1436108328, var4);
            class73.field1903 = var2;
            class28.field731 = 0;
            class47.field1218 = 2;
            class32.field784 = var5;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 2) {
            class62.field1584++;
            class74.field1935.method996((byte) 123, 196);
            class74.field1935.method521(var4, 1198495528);
            class74.field1935.method509((byte) -21, var5);
            class74.field1935.method479(1436108328, var2);
            class32.field784 = var5;
            class28.field731 = 0;
            class73.field1903 = var2;
            class47.field1218 = 2;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 1002) {
            class47.field1215 = 0;
            class114.field2772++;
            class56.field1480 = class34.field865;
            class42.field1061 = class125.field3049;
            client.field459 = 2;
            class74.field1935.method996((byte) 65, 214);
            class74.field1935.method519((byte) 91, var4);
        }
        if (var3 == 34) {
            class55 var58 = class125.field3043[var4];
            if (var58 != null) {
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var58.field287[0], 1, 127, var58.field307[0], class70.field1828.field307[0], 2);
                class47.field1215 = 0;
                class100.field2489++;
                class42.field1061 = class125.field3049;
                client.field459 = 2;
                class56.field1480 = class34.field865;
                class74.field1935.method996((byte) 112, 175);
                class74.field1935.method525(var4, true);
            }
        }
        if (var3 == 50) {
            class109.field2685++;
            class74.field1935.method996((byte) 55, 253);
            class74.field1935.method479(1436108328, var4);
            class74.field1935.method519((byte) 108, var2);
            class74.field1935.method518(false, var5);
            class32.field784 = var5;
            class73.field1903 = var2;
            class47.field1218 = 2;
            class28.field731 = 0;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 5) {
            class80 var59 = class94.field2423[var4];
            if (var59 != null) {
                class127.field3099++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var59.field287[0], 1, 127, var59.field307[0], class70.field1828.field307[0], 2);
                client.field459 = 2;
                class47.field1215 = 0;
                class42.field1061 = class125.field3049;
                class56.field1480 = class34.field865;
                class74.field1935.method996((byte) 76, 209);
                class74.field1935.method479(1436108328, var4);
            }
        }
        if (var3 == 41) {
            class26.method264(var5, var2, 0, var4);
            class2.field80++;
            class74.field1935.method996((byte) 115, 5);
            class74.field1935.method519((byte) 91, class51.field1286 + var5);
            class74.field1935.method525(var4 >> 14 & 0x7FFF, true);
            class74.field1935.method479(1436108328, var2 + class2.field77);
        }
        if (arg0 > -77) {
            method464(-16);
        }
        if (var3 == 1005) {
            class47.field1215 = 0;
            class56.field1480 = class34.field865;
            client.field459 = 2;
            class42.field1061 = class125.field3049;
            class80 var60 = class94.field2423[var4];
            if (var60 != null) {
                class21 var61 = var60.field2089;
                if (var61.field554 != null) {
                    var61 = var61.method227((byte) -110);
                }
                if (var61 != null) {
                    class74.field1935.method996((byte) 99, 23);
                    class74.field1935.method519((byte) 77, var61.field562);
                    class36.field951++;
                }
            }
        }
        if (var3 == 4) {
            class74.field1935.method996((byte) 71, 85);
            class74.field1935.method499(var5, (byte) -100);
            class74.field1935.method519((byte) 90, var2);
            class74.field1935.method525(var4, true);
            class28.field731 = 0;
            class73.field1903 = var2;
            class47.field1218 = 2;
            class32.field784 = var5;
            if (var5 >> 16 == class47.field1210) {
                class47.field1218 = 1;
            }
            class74.field1961++;
            if (var5 >> 16 == class6.field155) {
                class47.field1218 = 3;
            }
        }
        if (var3 == 44) {
            class80 var62 = class94.field2423[var4];
            if (var62 != null) {
                class14.field361++;
                class95.method751(0, false, 0, 1, class70.field1828.field287[0], 0, var62.field287[0], 1, 127, var62.field307[0], class70.field1828.field307[0], 2);
                class42.field1061 = class125.field3049;
                client.field459 = 2;
                class56.field1480 = class34.field865;
                class47.field1215 = 0;
                class74.field1935.method996((byte) 54, 153);
                class74.field1935.method519((byte) 97, var4);
                class74.field1935.method504((byte) -126, class30.field750);
            }
        }
        if (class122.field2990 != 0) {
            class122.field2990 = 0;
            class62.field1588 = true;
        }
        if (class91.field2334 != 0) {
            class62.field1588 = true;
            class91.field2334 = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIJ)V")
    public abstract void method472(int arg0, int arg1, int arg2, long arg3);
}
