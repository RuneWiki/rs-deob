import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class82 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lsg;")
    public static class169 field1502 = class165.method1060("Lade Benutzeroberfl-=che )2 ", 1536);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lsg;")
    private static class169 field1504 = class165.method1060("Loaded config", 1536);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lsg;")
    public static class169 field1503 = field1504;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lsg;")
    public static class169 field1509 = class165.method1060("VOLL", 1536);

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[J")
    public static long[] field1513 = new long[100];

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lsg;")
    public static class169 field1516 = class165.method1060(")2", 1536);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lsg;")
    public static class169 field1515 = class165.method1060("bevor Sie den Vorgang wiederholen)3", 1536);

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lsg;")
    public static class169 field1514 = class165.method1060("k", 1536);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lwh;")
    public static class206 field1512;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method495(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1504 = null;
        field1509 = null;
        field1502 = null;
        field1514 = null;
        field1513 = null;
        field1515 = null;
        field1503 = null;
        field1516 = null;
        field1512 = null;
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
    public final void run() {
        field1506++;
        try {
            while (true) {
                class22 var1 = class2.field28;
                class45 var2;
                synchronized (class2.field28) {
                    var2 = (class45) class2.field28.method145(0);
                }
                if (var2 == null) {
                    client.method203(100L, (byte) -106);
                    Object var6 = class56.field1033;
                    synchronized (class56.field1033) {
                        if (class203.field3974 <= 1) {
                            class203.field3974 = 0;
                            class56.field1033.notifyAll();
                            return;
                        }
                        class203.field3974--;
                    }
                } else {
                    if (var2.field835 == 0) {
                        var2.field836.method941((byte) 46, (int) var2.field3543, var2.field847, var2.field847.length);
                        class22 var4 = class2.field28;
                        synchronized (class2.field28) {
                            var2.method1213(9104);
                        }
                    } else if (var2.field835 == 1) {
                        var2.field847 = var2.field836.method942(false, (int) var2.field3543);
                        class22 var3 = class2.field28;
                        synchronized (class2.field28) {
                            class165.field3159.method149(0, var2);
                        }
                    }
                    Object var5 = class56.field1033;
                    synchronized (class56.field1033) {
                        if (class203.field3974 <= 1) {
                            class203.field3974 = 0;
                            class56.field1033.notifyAll();
                            return;
                        }
                        class203.field3974 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class21.method142(-102, null, var17);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method496(int arg0) {
        while (true) {
            if (class85.field1559.method1027(108, class27.field553) >= 27) {
                int var1 = class85.field1559.method1031(15, (byte) 53);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class54.field992[var1] == null) {
                        class54.field992[var1] = new class197();
                        var2 = true;
                    }
                    class197 var3 = class54.field992[var1];
                    class182.field3547[class164.field3149++] = var1;
                    var3.field3700 = class162.field3107;
                    var3.field3872 = class149.method974(class85.field1559.method1031(14, (byte) 80), 9);
                    int var4 = class122.field2252[class85.field1559.method1031(3, (byte) -84)];
                    if (var2) {
                        var3.field3681 = var3.field3719 = var4;
                    }
                    int var5 = class85.field1559.method1031(1, (byte) 102);
                    int var6 = class85.field1559.method1031(1, (byte) -116);
                    if (var6 == 1) {
                        class6.field120[class199.field3895++] = var1;
                    }
                    int var7 = class85.field1559.method1031(5, (byte) 69);
                    int var8 = class85.field1559.method1031(5, (byte) 127);
                    var3.field3715 = var3.field3872.field3422;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field3673 = var3.field3872.field3397;
                    var3.field3716 = var3.field3872.field3413;
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field3732 = var3.field3872.field3420;
                    var3.field3722 = var3.field3872.field3401;
                    var3.field3682 = var3.field3872.field3395;
                    var3.field3695 = var3.field3872.field3417;
                    var3.field3711 = var3.field3872.field3392;
                    if (var3.field3695 == 0) {
                        var3.field3719 = 0;
                    }
                    var3.field3708 = var3.field3872.field3390;
                    var3.method1246(class4.field79.field3734[0] + var7, (byte) 91, var5 == 1, class4.field79.field3729[0] + var8);
                    continue;
                }
            }
            field1507++;
            if (arg0 != 30932) {
                return;
            }
            class85.field1559.method1029(7);
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZII)Lbg;")
    public static final class18 method497(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1501++;
        long var6 = ((long) arg5 << 38) + ((long) arg2 << 16) + ((long) arg4 << 40) + (long) arg0;
        if (!arg3) {
            class18 var8 = (class18) class73.field1359.method1206(var6, -24742);
            if (var8 != null) {
                return var8;
            }
        }
        class73 var9 = class180.method1196(arg0, 0);
        if (arg2 > 1 && var9.field1375 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field1337[var11] && var9.field1337[var11] != 0) {
                    var10 = var9.field1375[var11];
                }
            }
            if (var10 != -1) {
                var9 = class180.method1196(var10, 0);
            }
        }
        int var12 = 25 / ((arg1 + 17) / 46);
        class30 var13 = var9.method453((byte) -61);
        if (var13 == null) {
            return null;
        }
        class18 var14 = null;
        if (var9.field1374 != -1) {
            var14 = method497(var9.field1341, -110, 10, true, 0, 1);
            if (var14 == null) {
                return null;
            }
        }
        int var15 = class130.field2424;
        int var16 = class130.field2427;
        int[] var17 = class130.field2426;
        int[] var18 = new int[4];
        class130.method845(var18);
        class18 var19 = new class18(36, 32);
        class130.method841(var19.field408, 36, 32);
        class130.method846();
        class12.method82();
        class12.method75(16, 16);
        class12.field282 = false;
        int var20 = var9.field1376;
        if (arg3) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg5 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class12.field279[var9.field1356] * var20 >> 16;
        int var22 = class12.field283[var9.field1356] * var20 >> 16;
        var13.method171();
        var13.method170(0, var9.field1348, var9.field1386, var9.field1356, var9.field1344, var21 + var9.field1338 - var13.field84 / 2, var9.field1338 + var22);
        if (arg5 >= 1) {
            var19.method130(1);
        }
        if (arg5 >= 2) {
            var19.method130(16777215);
        }
        if (arg4 != 0) {
            var19.method133(arg4);
        }
        class130.method841(var19.field408, 36, 32);
        if (var9.field1374 != -1) {
            var14.method123(0, 0);
        }
        if (!arg3 && (var9.field1364 == 1 || arg2 != 1) && arg2 != -1) {
            class131.field2430.method718(class69.method431(arg2, -24488), 0, 9, 16776960, 1);
        }
        if (!arg3) {
            class73.field1359.method1208(var6, -106, var19);
        }
        class130.method841(var17, var15, var16);
        class130.method847(var18);
        class12.method82();
        class12.field282 = true;
        return var19;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIILtd;I)V")
    public static final void method498(byte arg0, int arg1, int arg2, class175 arg3, int arg4) {
        field1505++;
        if (arg0 != -52 || class20.field436 >= 400) {
            return;
        }
        if (arg3.field3430 != null) {
            arg3 = arg3.method1173((byte) 110);
        }
        if (arg3 == null || !arg3.field3427) {
            return;
        }
        class169 var5 = arg3.field3403;
        if (arg3.field3428 != 0) {
            var5 = class165.method1058(0, new class169[] { var5, class129.method836(2, class4.field79.field3866, arg3.field3428), class112.field2051, class112.field2056, class2.method18((byte) -62, arg3.field3428), class139.field2583 });
        }
        if (class141.field2630 == 1) {
            class167.method1092(class165.method1058(0, new class169[] { class16.field341, class203.field3977, var5 }), arg2, arg1, class73.field1368, -1, 24, arg4);
            class69.field1296++;
        } else if (!class17.field380) {
            class69.field1305++;
            class169[] var6 = arg3.field3396;
            if (class89.field1623) {
                var6 = class136.method921(arg0 - 7832, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1110(class112.field2044, 70)) {
                        byte var8 = 0;
                        class138.field2574++;
                        if (var7 == 0) {
                            var8 = 33;
                        }
                        if (var7 == 1) {
                            var8 = 38;
                        }
                        if (var7 == 2) {
                            var8 = 31;
                        }
                        if (var7 == 3) {
                            var8 = 50;
                        }
                        if (var7 == 4) {
                            var8 = 7;
                        }
                        class167.method1092(class165.method1058(0, new class169[] { class116.field2145, var5 }), arg2, arg1, var6[var7], -1, var8, arg4);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1110(class112.field2044, arg0 ^ 0xFFFFFF8A)) {
                        class16.field338++;
                        short var10 = 0;
                        if (class4.field79.field3866 < arg3.field3428) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 33;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 38;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 31;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 50;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 7;
                        }
                        class167.method1092(class165.method1058(0, new class169[] { class116.field2145, var5 }), arg2, arg1, var6[var9], -1, var11, arg4);
                    }
                }
            }
            class167.method1092(class165.method1058(0, new class169[] { class116.field2145, var5 }), arg2, arg1, class151.field2920, -1, 1006, arg4);
            return;
        } else if ((class11.field269 & 0x2) == 2) {
            class191.field3774++;
            class167.method1092(class165.method1058(0, new class169[] { class21.field455, class203.field3977, var5 }), arg2, arg1, class137.field2551, -1, 5, arg4);
            return;
        }
    }
}
