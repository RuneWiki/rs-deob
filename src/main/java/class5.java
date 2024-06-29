import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class69 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[I")
    public static int[] field68 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Lmc;")
    private static class75 field78 = class30.method234(true, "Unable to find ");

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Lmc;")
    private static class75 field82 = class30.method234(true, " ");

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lmc;")
    private static class75 field81 = class30.method234(true, "Loaded update list");

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Lmc;")
    public static class75 field83 = field81;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Lmc;")
    public static class75 field73 = class30.method234(true, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lmc;")
    public static class75 field71 = field82;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lmc;")
    public static class75 field64 = field78;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Lj;")
    public static class54 field77;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lmc;")
    public class75 field67;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lpb;")
    public static class92 field72;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method24(long arg0, int arg1) {
        field70++;
        if (arg0 == 0L) {
            return;
        }
        if (class12.field226 >= 100 && class31.field695 != 1 || class12.field226 >= 200) {
            class31.method242(class16.field309, 0, -1, class99.field2534);
            return;
        }
        class75 var3 = class78.method667(arg0, -110).method652(1);
        for (int var4 = 0; var4 < class12.field226; var4++) {
            if (class104.field2649[var4] == arg0) {
                class31.method242(class16.field309, 0, ~arg1, class69.method586(new class75[] { var3, class122.field3008 }, (byte) 77));
                return;
            }
        }
        for (int var5 = 0; var5 < class1.field2; var5++) {
            if (class44.field1040[var5] == arg0) {
                class31.method242(class16.field309, 0, -1, class69.method586(new class75[] { class98.field2460, var3, class7.field97 }, (byte) 59));
                return;
            }
        }
        if (var3.method635(class52.field1315.field3003, arg1 + 18573)) {
            return;
        }
        class52.field1291++;
        class12.field242[class12.field226] = var3;
        class104.field2649[class12.field226] = arg0;
        class131.field3186[class12.field226] = arg1;
        class108.field2743 = true;
        class12.field226++;
        class118.field2923.method707(-117, 165);
        class118.field2923.method501((byte) -91, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILba;IIIIILed;)V", line = 74)
    public static final void method25(byte arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class29 arg8) {
        field74++;
        if (class92.field2270 && (class74.field1836[0][arg4][arg3] & 0x2) == 0) {
            if ((class74.field1836[arg6][arg4][arg3] & 0x10) != 0) {
                return;
            }
            if (class40.method304(-32245, arg6, arg4, arg3) != class28.field591) {
                return;
            }
        }
        if (arg6 < class92.field2280) {
            class92.field2280 = arg6;
        }
        int var9 = class15.field280[arg6][arg4][arg3];
        int var10 = class15.field280[arg6][arg4 + 1][arg3 + 1];
        int var11 = class15.field280[arg6][arg4][arg3 + 1];
        int var12 = class15.field280[arg6][arg4 + 1][arg3];
        int var13 = var9 + var10 + var12 + var11 >> 2;
        class59 var14 = class50.method387(-26274, arg7);
        int var15 = (arg3 << 7) + (arg7 << 14) + arg4 + 1073741824;
        if (var14.field1521 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg5 << 6) + arg1;
        if (var14.field1488 == 1) {
            var16 += 256;
        }
        if (var14.method480(true)) {
            class65.method568(arg4, (byte) 65, arg6, arg5, var14, arg3);
        }
        if (arg1 == 22) {
            if (!class92.field2270 || var14.field1521 != 0 || var14.field1526) {
                class64 var17;
                if (var14.field1491 == -1 && var14.field1484 == null) {
                    var17 = var14.method476(var11, var12, 68, var10, var9, arg5, 22);
                } else {
                    var17 = new class127(arg7, 22, arg5, var9, var12, var10, var11, var14.field1491, true);
                }
                arg8.method229(arg6, arg4, arg3, var13, var17, var15, var16);
                if (var14.field1508 && var14.field1521 == 1 && arg2 != null) {
                    arg2.method43(2097152, arg3, arg4);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class64 var37;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var37 = var14.method476(var11, var12, 68, var10, var9, arg5, 10);
            } else {
                var37 = new class127(arg7, 10, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg5 == 1 || arg5 == 3) {
                    var38 = var14.field1525;
                    var39 = var14.field1530;
                } else {
                    var38 = var14.field1530;
                    var39 = var14.field1525;
                }
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                if (arg8.method205(arg6, arg4, arg3, var13, var38, var39, var37, var40, var15, var16) && var14.field1504) {
                    class93 var41;
                    if (var37 instanceof class93) {
                        var41 = (class93) var37;
                    } else {
                        var41 = var14.method476(var11, var12, 68, var10, var9, arg5, 10);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var38; var42++) {
                            for (int var43 = 0; var43 <= var39; var43++) {
                                int var44 = var41.method797() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class63.field1676[arg6][arg4 + var42][arg3 + var43]) {
                                    class63.field1676[arg6][arg4 + var42][arg3 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method38(arg3, arg4, var14.field1530, var14.field1486, arg5, 256, var14.field1525);
            }
        } else if (arg1 >= 12) {
            class64 var18;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var18 = var14.method476(var11, var12, 68, var10, var9, arg5, arg1);
            } else {
                var18 = new class127(arg7, arg1, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method205(arg6, arg4, arg3, var13, 1, 1, var18, 0, var15, var16);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg6 > 0) {
                class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 2340);
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method38(arg3, arg4, var14.field1530, var14.field1486, arg5, 256, var14.field1525);
            }
        } else if (arg1 == 0) {
            class64 var19;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var19 = var14.method476(var11, var12, 68, var10, var9, arg5, 0);
            } else {
                var19 = new class127(arg7, 0, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method230(arg6, arg4, arg3, var13, var19, null, field68[arg5], 0, var15, var16);
            if (arg5 == 0) {
                if (var14.field1504) {
                    class63.field1676[arg6][arg4][arg3] = 50;
                    class63.field1676[arg6][arg4][arg3 + 1] = 50;
                }
                if (var14.field1487) {
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 585);
                }
            } else if (arg5 == 1) {
                if (var14.field1504) {
                    class63.field1676[arg6][arg4][arg3 + 1] = 50;
                    class63.field1676[arg6][arg4 + 1][arg3 + 1] = 50;
                }
                if (var14.field1487) {
                    class63.field1675[arg6][arg4][arg3 + 1] = class34.method263(class63.field1675[arg6][arg4][arg3 + 1], 1170);
                }
            } else if (arg5 == 2) {
                if (var14.field1504) {
                    class63.field1676[arg6][arg4 + 1][arg3] = 50;
                    class63.field1676[arg6][arg4 + 1][arg3 + 1] = 50;
                }
                if (var14.field1487) {
                    class63.field1675[arg6][arg4 + 1][arg3] = class34.method263(class63.field1675[arg6][arg4 + 1][arg3], 585);
                }
            } else if (arg5 == 3) {
                if (var14.field1504) {
                    class63.field1676[arg6][arg4][arg3] = 50;
                    class63.field1676[arg6][arg4 + 1][arg3] = 50;
                }
                if (var14.field1487) {
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 1170);
                }
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method50(arg5, arg1, arg4, var14.field1486, arg3, 1);
            }
            if (var14.field1509 != 16) {
                arg8.method187(arg6, arg4, arg3, var14.field1509);
            }
        } else if (arg1 == 1) {
            class64 var20;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var20 = var14.method476(var11, var12, 68, var10, var9, arg5, 1);
            } else {
                var20 = new class127(arg7, 1, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method230(arg6, arg4, arg3, var13, var20, null, class35.field828[arg5], 0, var15, var16);
            if (var14.field1504) {
                if (arg5 == 0) {
                    class63.field1676[arg6][arg4][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    class63.field1676[arg6][arg4 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    class63.field1676[arg6][arg4 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    class63.field1676[arg6][arg4][arg3] = 50;
                }
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method50(arg5, arg1, arg4, var14.field1486, arg3, 1);
            }
        } else if (arg1 == 2) {
            int var21 = arg5 + 1 & 0x3;
            class64 var22;
            class64 var23;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var22 = var14.method476(var11, var12, 68, var10, var9, arg5 + 4, 2);
                var23 = var14.method476(var11, var12, 68, var10, var9, var21, 2);
            } else {
                var22 = new class127(arg7, 2, arg5 + 4, var9, var12, var10, var11, var14.field1491, true);
                var23 = new class127(arg7, 2, var21, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method230(arg6, arg4, arg3, var13, var22, var23, field68[arg5], field68[var21], var15, var16);
            if (var14.field1487) {
                if (arg5 == 0) {
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 585);
                    class63.field1675[arg6][arg4][arg3 + 1] = class34.method263(class63.field1675[arg6][arg4][arg3 + 1], 1170);
                } else if (arg5 == 1) {
                    class63.field1675[arg6][arg4][arg3 + 1] = class34.method263(class63.field1675[arg6][arg4][arg3 + 1], 1170);
                    class63.field1675[arg6][arg4 + 1][arg3] = class34.method263(class63.field1675[arg6][arg4 + 1][arg3], 585);
                } else if (arg5 == 2) {
                    class63.field1675[arg6][arg4 + 1][arg3] = class34.method263(class63.field1675[arg6][arg4 + 1][arg3], 585);
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 1170);
                } else if (arg5 == 3) {
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 1170);
                    class63.field1675[arg6][arg4][arg3] = class34.method263(class63.field1675[arg6][arg4][arg3], 585);
                }
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method50(arg5, arg1, arg4, var14.field1486, arg3, 1);
            }
            if (var14.field1509 != 16) {
                arg8.method187(arg6, arg4, arg3, var14.field1509);
            }
        } else if (arg1 == 3) {
            class64 var24;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var24 = var14.method476(var11, var12, 68, var10, var9, arg5, 3);
            } else {
                var24 = new class127(arg7, 3, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method230(arg6, arg4, arg3, var13, var24, null, class35.field828[arg5], 0, var15, var16);
            if (var14.field1504) {
                if (arg5 == 0) {
                    class63.field1676[arg6][arg4][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    class63.field1676[arg6][arg4 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    class63.field1676[arg6][arg4 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    class63.field1676[arg6][arg4][arg3] = 50;
                }
            }
            if (var14.field1508 && arg2 != null) {
                arg2.method50(arg5, arg1, arg4, var14.field1486, arg3, 1);
            }
        } else if (arg1 == 9) {
            class64 var25;
            if (var14.field1491 == -1 && var14.field1484 == null) {
                var25 = var14.method476(var11, var12, 68, var10, var9, arg5, arg1);
            } else {
                var25 = new class127(arg7, arg1, arg5, var9, var12, var10, var11, var14.field1491, true);
            }
            arg8.method205(arg6, arg4, arg3, var13, 1, 1, var25, 0, var15, var16);
            if (var14.field1508 && arg2 != null) {
                arg2.method38(arg3, arg4, var14.field1530, var14.field1486, arg5, 256, var14.field1525);
            }
        } else {
            if (var14.field1500) {
                if (arg5 == 1) {
                    int var26 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var9;
                    var9 = var26;
                } else if (arg5 == 2) {
                    int var27 = var11;
                    var11 = var12;
                    var12 = var27;
                    int var28 = var10;
                    var10 = var9;
                    var9 = var28;
                } else if (arg5 == 3) {
                    int var29 = var11;
                    var11 = var9;
                    var9 = var12;
                    var12 = var10;
                    var10 = var29;
                }
            }
            if (arg1 == 4) {
                class64 var30;
                if (var14.field1491 == -1 && var14.field1484 == null) {
                    var30 = var14.method476(var11, var12, 68, var10, var9, 0, 4);
                } else {
                    var30 = new class127(arg7, 4, 0, var9, var12, var10, var11, var14.field1491, true);
                }
                arg8.method215(arg6, arg4, arg3, var13, var30, field68[arg5], arg5 * 512, 0, 0, var15, var16);
            } else if (arg1 == 5) {
                int var31 = 16;
                int var32 = arg8.method207(arg6, arg4, arg3);
                if (var32 > 0) {
                    var31 = class50.method387(-26274, var32 >> 14 & 0x7FFF).field1509;
                }
                class64 var33;
                if (var14.field1491 == -1 && var14.field1484 == null) {
                    var33 = var14.method476(var11, var12, 68, var10, var9, 0, 4);
                } else {
                    var33 = new class127(arg7, 4, 0, var9, var12, var10, var11, var14.field1491, true);
                }
                arg8.method215(arg6, arg4, arg3, var13, var33, field68[arg5], arg5 * 512, class63.field1668[arg5] * var31, class117.field2894[arg5] * var31, var15, var16);
            } else if (arg0 <= -79) {
                if (arg1 == 6) {
                    class64 var34;
                    if (var14.field1491 == -1 && var14.field1484 == null) {
                        var34 = var14.method476(var11, var12, 68, var10, var9, 0, 4);
                    } else {
                        var34 = new class127(arg7, 4, 0, var9, var12, var10, var11, var14.field1491, true);
                    }
                    arg8.method215(arg6, arg4, arg3, var13, var34, 256, arg5, 0, 0, var15, var16);
                } else if (arg1 == 7) {
                    class64 var35;
                    if (var14.field1491 == -1 && var14.field1484 == null) {
                        var35 = var14.method476(var11, var12, 68, var10, var9, 0, 4);
                    } else {
                        var35 = new class127(arg7, 4, 0, var9, var12, var10, var11, var14.field1491, true);
                    }
                    arg8.method215(arg6, arg4, arg3, var13, var35, 512, arg5, 0, 0, var15, var16);
                } else if (arg1 == 8) {
                    class64 var36;
                    if (var14.field1491 == -1 && var14.field1484 == null) {
                        var36 = var14.method476(var11, var12, 68, var10, var9, 0, 4);
                    } else {
                        var36 = new class127(arg7, 4, 0, var9, var12, var10, var11, var14.field1491, true);
                    }
                    arg8.method215(arg6, arg4, arg3, var13, var36, 768, arg5, 0, 0, var15, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 584)
    public static final void method26(int arg0) {
        class31.method241(13256);
        field69++;
        if (class24.field467 == 1) {
            class50.field1275[class68.field1736 / 100].method14(class107.field2676 - 8 - 4, class125.field3063 - 4 + -8);
        }
        if (class24.field467 == 2) {
            class50.field1275[class68.field1736 / 100 + 4].method14(class107.field2676 - 8 - 4, class125.field3063 + -8 + -4);
        }
        if (class36.field876 != -1) {
            class58.method468(-69, class36.field876);
            class128.method1008(-1, class36.field876, 0, (byte) -81, 4, 0, 0, 334, 512);
        }
        if (~class130.field3155 != arg0) {
            class58.method468(-59, class130.field3155);
            class128.method1008(-1, class130.field3155, 0, (byte) -90, 0, 0, 0, 334, 512);
        }
        class110.method899(2000);
        if (!class15.field283) {
            class50.method396(~arg0);
            class76.method663(arg0 ^ 0x1E8);
        } else if (class90.field2218 == 0) {
            class117.method930(8580);
        }
        if (class72.field1824 == 1) {
            class64.field1698.method14(472, 296);
        }
        if (class3.field43) {
            short var1 = 507;
            byte var2 = 20;
            int var3 = 16776960;
            if (class61.field1593 < 30 && class92.field2270) {
                var3 = 16711680;
            }
            if (class61.field1593 < 20 && !class92.field2270) {
                var3 = 16711680;
            }
            class114.field2869.method428(class69.method586(new class75[] { class69.field1756, class45.method345(arg0 ^ 0x59C2, class61.field1593) }, (byte) 97), var1, var2, var3);
            Runtime var4 = Runtime.getRuntime();
            int var5 = 16776960;
            int var10 = var2 + 15;
            int var6 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var6 > 32768 && class92.field2270) {
                var5 = 16711680;
            }
            if (var6 > 65536 && !class92.field2270) {
                var5 = 16711680;
            }
            class114.field2869.method428(class69.method586(new class75[] { class27.field578, class45.method345(22978, var6), class16.field324 }, (byte) 21), var1, var10, var5);
            var10 += 15;
            if (class23.field455) {
                class114.field2869.method428(class26.field528, var1, var10, 16711680);
                class23.field455 = false;
                var10 += 15;
            }
            if (class82.field2043) {
                class114.field2869.method428(class25.field503, var1, var10, 16711680);
                class82.field2043 = false;
                var10 += 15;
            }
            if (class58.field1471) {
                class114.field2869.method428(class74.field1858, var1, var10, 16711680);
                var10 += 15;
                class58.field1471 = false;
            }
        }
        if (class32.field727 == 0) {
            return;
        }
        int var7 = class32.field727 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 >= 10) {
            class114.field2869.method423(class69.method586(new class75[] { class91.field2262, class45.method345(22978, var8), class64.field1701, class45.method345(22978, var9) }, (byte) 93), 4, 329, 16776960);
        } else {
            class114.field2869.method423(class69.method586(new class75[] { class91.field2262, class45.method345(22978, var8), class130.field3163, class45.method345(22978, var9) }, (byte) 116), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 707)
    public static void method27(boolean arg0) {
        field71 = null;
        field73 = null;
        field64 = null;
        field81 = null;
        field83 = null;
        field82 = null;
        if (arg0) {
            method26(15);
        }
        field78 = null;
        field68 = null;
        field72 = null;
        field77 = null;
    }
}
