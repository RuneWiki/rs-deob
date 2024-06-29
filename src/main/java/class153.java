import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lv;")
    public static class146 field3520 = class159.method1226((byte) -37, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lla;")
    public static class77 field3518;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1150(int arg0) {
        field3520 = null;
        if (arg0 == 0) {
            field3518 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method1151(byte arg0) {
        field3525++;
        class115.field2681 = new int[104];
        class157.field3612 = 99;
        class34.field725 = new int[4][105][105];
        class147.field3411 = new int[104];
        class37.field835 = new byte[4][104][104];
        class37.field839 = new byte[4][104][104];
        class154.field3527 = new byte[4][104][104];
        class100.field2423 = new byte[4][105][105];
        class148.field3435 = new int[105][105];
        class59.field1349 = new int[104];
        class79.field1938 = new int[104];
        class146.field3376 = new int[104];
        class29.field611 = new byte[4][104][104];
        if (arg0 != -33) {
            method1152((byte) -73);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static final void method1152(byte arg0) {
        if (arg0 <= 26) {
            method1154((byte) -54, 121);
        }
        try {
            if (class95.field2272 == null) {
                class95.field2272 = new class33(class145.field3293, class71.method509(new class146[] { class138.field3135, class158.field3629, class115.field2686 }, (byte) -124).method1116(-85));
            } else {
                byte[] var1 = class95.field2272.method220(23);
                if (var1 != null) {
                    class95 var2 = new class95(var1);
                    class20.field312 = var2.method795(1);
                    class97.field2337 = new class122[class20.field312];
                    for (int var3 = 0; var3 < class20.field312; var3++) {
                        class122 var4 = class97.field2337[var3] = new class122();
                        int var5 = var2.method795(1);
                        var4.field2829 = (var5 & 0x8000) != 0;
                        var4.field2827 = var5 & 0x7FFF;
                        var4.field2821 = var2.method772(-126);
                        var4.field2847 = var2.method765(65280);
                        var4.field2842 = var3;
                        var4.field2845 = class91.method730(var4.field2821, 4);
                    }
                    class117.method897(class29.field604, class97.field2337, class97.field2337.length - 1, class72.field1689, 0, -1);
                    class123.field2859 = true;
                    class95.field2272 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class95.field2272 = null;
        }
        field3524++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3519++;
        class101 var10 = null;
        for (class101 var11 = (class101) class12.field183.method1138(25852); var11 != null; var11 = (class101) class12.field183.method1142(arg0 - 4)) {
            if (var11.field2446 == arg2 && var11.field2447 == arg8 && var11.field2453 == arg4 && var11.field2456 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class101();
            var10.field2446 = arg2;
            var10.field2453 = arg4;
            var10.field2447 = arg8;
            var10.field2456 = arg3;
            class66.method475(arg0 ^ 0xFFFFBC6E, var10);
            class12.field183.method1136(var10, false);
        }
        var10.field2466 = arg1;
        var10.field2464 = arg6;
        if (arg0 != 5) {
            method1150(-29);
        }
        var10.field2444 = arg7;
        var10.field2441 = arg5;
        var10.field2458 = arg9;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lia;")
    public static final class57 method1154(byte arg0, int arg1) {
        field3523++;
        class57 var2 = (class57) class38.field862.method1045((long) arg1, -108);
        if (arg0 <= 28) {
            field3522 = 49;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1292.method585(5, 95, arg1);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method395(new class95(var3), (byte) 49);
        }
        class38.field862.method1047(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static final void method1155(byte arg0) {
        field3526++;
        try {
            if (class34.field723 == 0) {
                if (class58.field1298 != null) {
                    class58.field1298.method1071((byte) 90);
                    class58.field1298 = null;
                }
                class29.field602 = null;
                class29.field600 = false;
                class34.field723 = 1;
                class25.field396 = 0;
            }
            if (class34.field723 == 1) {
                if (class29.field602 == null) {
                    class29.field602 = class145.field3293.method124(arg0 - 30, class124.field2870, class6.field146);
                }
                if (class29.field602.field866 == 2) {
                    throw new IOException();
                }
                if (class29.field602.field866 == 1) {
                    class58.field1298 = new class145((Socket) class29.field602.field870, class145.field3293);
                    class34.field723 = 2;
                    class29.field602 = null;
                }
            }
            if (class34.field723 == 2) {
                long var1 = class6.field133 = class134.field3057.method1101(124);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class82.field1990.field2304 = 0;
                class82.field1990.method791(false, 14);
                class82.field1990.method791(false, var3);
                class58.field1298.method1078(0, 1, 2, class82.field1990.field2320);
                class29.field597.field2304 = 0;
                class34.field723 = 3;
            }
            if (class34.field723 == 3) {
                if (class15.field249 != null) {
                    class15.field249.method14((byte) -103);
                }
                if (class89.field2113 != null) {
                    class89.field2113.method14((byte) 122);
                }
                int var4 = class58.field1298.method1077(arg0 ^ 0xF);
                if (class15.field249 != null) {
                    class15.field249.method14((byte) -115);
                }
                if (class89.field2113 != null) {
                    class89.field2113.method14((byte) 102);
                }
                if (var4 != 0) {
                    class67.method480(-10, var4);
                    return;
                }
                class29.field597.field2304 = 0;
                class34.field723 = 4;
            }
            if (class34.field723 == 4) {
                if (class29.field597.field2304 < 8) {
                    int var5 = class58.field1298.method1073(0);
                    if (8 - class29.field597.field2304 < var5) {
                        var5 = 8 - class29.field597.field2304;
                    }
                    if (var5 > 0) {
                        class58.field1298.method1072(class29.field597.field2304, class29.field597.field2320, var5, (byte) -52);
                        class29.field597.field2304 += var5;
                    }
                }
                if (class29.field597.field2304 == 8) {
                    class29.field597.field2304 = 0;
                    class57.field1277 = class29.field597.method796((byte) -107);
                    class34.field723 = 5;
                }
            }
            if (class34.field723 == 5) {
                class82.field1990.field2304 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class57.field1277 >> 32), (int) class57.field1277 };
                class82.field1990.method791(false, 10);
                class82.field1990.method788(var6[0], arg0 - 730641295);
                class82.field1990.method788(var6[1], arg0 - 730641295);
                class82.field1990.method788(var6[2], -730641264);
                class82.field1990.method788(var6[3], -730641264);
                class82.field1990.method746(class134.field3057.method1101(arg0 - 158), 1101310632);
                class82.field1990.method762(class134.field3056, (byte) -128);
                class82.field1990.method760(class75.field1782, 6896, class6.field140);
                class134.field3054.field2304 = 0;
                if (class47.field1071 == 40) {
                    class134.field3054.method791(false, 18);
                } else {
                    class134.field3054.method791(false, 16);
                }
                class134.field3054.method791(false, class82.field1990.field2304 + 93);
                class134.field3054.method788(469, -730641264);
                class134.field3054.method791(false, class91.field2196 ? 1 : 0);
                class54.method368(false, class134.field3054);
                class134.field3054.method788(class158.field3635.field1834, arg0 ^ 0xD4734C8F);
                class134.field3054.method788(class40.field878.field1834, -730641264);
                class134.field3054.method788(class28.field587.field1834, -730641264);
                class134.field3054.method788(class82.field1989.field1834, -730641264);
                class134.field3054.method788(class15.field251.field1834, -730641264);
                class134.field3054.method788(class8.field163.field1834, -730641264);
                class134.field3054.method788(class60.field1377.field1834, -730641264);
                class134.field3054.method788(class155.field3546.field1834, arg0 - 730641295);
                class134.field3054.method788(class3.field89.field1834, -730641264);
                class134.field3054.method788(class68.field1557.field1834, arg0 ^ 0xD4734C8F);
                class134.field3054.method788(class22.field363.field1834, -730641264);
                class134.field3054.method788(class115.field2689.field1834, -730641264);
                class134.field3054.method788(class76.field1815.field1834, arg0 ^ 0xD4734C8F);
                class134.field3054.method788(class79.field1943.field1834, -730641264);
                class134.field3054.method788(class54.field1241.field1834, -730641264);
                class134.field3054.method788(class24.field389.field1834, -730641264);
                class134.field3054.method792(class82.field1990.field2320, 0, -113, class82.field1990.field2304);
                class58.field1298.method1078(0, 1, class134.field3054.field2304, class134.field3054.field2320);
                class82.field1990.method264((byte) 85, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class29.field597.method264((byte) 85, var6);
                class34.field723 = 6;
            }
            if (class34.field723 == 6 && class58.field1298.method1073(arg0 ^ 0x1F) > 0) {
                int var8 = class58.field1298.method1077(arg0 ^ 0x41);
                if (var8 == 21 && class47.field1071 == 20) {
                    class34.field723 = 7;
                } else if (var8 == 2) {
                    class34.field723 = 9;
                } else if (var8 == 15 && class47.field1071 == 40) {
                    client.method129(45);
                    return;
                } else if (var8 == 23 && class9.field174 < 1) {
                    class9.field174++;
                    class34.field723 = 0;
                } else {
                    class67.method480(arg0 ^ 0xFFFFFFE9, var8);
                    return;
                }
            }
            if (class34.field723 == 7 && class58.field1298.method1073(0) > 0) {
                class48.field1111 = class58.field1298.method1077(93) * 60 + 180;
                class34.field723 = 8;
            }
            if (class34.field723 == 8) {
                class25.field396 = 0;
                class20.method111(class71.method509(new class146[] { class75.method564(false, class48.field1111 / 60), class13.field206 }, (byte) -74), class105.field2531, arg0 - 153, class17.field268);
                if (--class48.field1111 <= 0) {
                    class34.field723 = 0;
                }
            } else {
                if (class34.field723 == 9 && class58.field1298.method1073(0) >= 8) {
                    class154.field3529 = class58.field1298.method1077(arg0 ^ 0xFFFFFF9B);
                    class33.field691 = class58.field1298.method1077(-109) == 1;
                    class49.field1135 = class58.field1298.method1077(-126);
                    class49.field1135 <<= 0x8;
                    class49.field1135 += class58.field1298.method1077(66);
                    class76.field1819 = class58.field1298.method1077(-126);
                    class58.field1298.method1072(0, class29.field597.field2320, 1, (byte) -52);
                    class29.field597.field2304 = 0;
                    class58.field1301 = class29.field597.method268((byte) -24);
                    class58.field1298.method1072(0, class29.field597.field2320, 2, (byte) -52);
                    class29.field597.field2304 = 0;
                    class35.field815 = class29.field597.method795(arg0 - 30);
                    class34.field723 = 10;
                }
                if (class34.field723 != 10) {
                    if (arg0 != 31) {
                        field3521 = 8;
                    }
                    class25.field396++;
                    if (class25.field396 > 2000) {
                        if (class9.field174 < 1) {
                            if (class6.field146 == class46.field1069) {
                                class6.field146 = class41.field939;
                            } else {
                                class6.field146 = class46.field1069;
                            }
                            class34.field723 = 0;
                            class9.field174++;
                        } else {
                            class67.method480(arg0 - 41, -3);
                        }
                    }
                } else if (class58.field1298.method1073(0) >= class35.field815) {
                    class29.field597.field2304 = 0;
                    class58.field1298.method1072(0, class29.field597.field2320, class35.field815, (byte) -52);
                    class135.method1008((byte) 118);
                    class87.field2055 = -1;
                    class28.method195(false, 15942);
                    class58.field1301 = -1;
                }
            }
        } catch (IOException var9) {
            if (class9.field174 < 1) {
                class34.field723 = 0;
                class9.field174++;
                if (class6.field146 == class46.field1069) {
                    class6.field146 = class41.field939;
                } else {
                    class6.field146 = class46.field1069;
                }
            } else {
                class67.method480(arg0 - 41, -2);
            }
        }
    }
}
