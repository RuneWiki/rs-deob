import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class310 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    private int field4677;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljg;")
    public static class215 field4673 = new class215();

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lbg;")
    public static class310 field4674 = new class310(7, 7);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1855(int arg0) {
        if (arg0 != 3) {
            field4674 = null;
        }
        field4673 = null;
        field4674 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
    public final int method1856(int arg0) {
        field4670++;
        if (arg0 != 7) {
            method1858(null, null);
        }
        return this.field4677;
    }

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4671++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static final void method1857(int arg0) {
        field4672++;
        if (class490.field7451 == 0 || class490.field7451 == 5) {
            return;
        }
        try {
            if ((++class480.field7323) > 2000) {
                if (class163.field2534 != null) {
                    class163.field2534.method1795((byte) 123);
                    class163.field2534 = null;
                }
                if (class447.field6873 >= 1) {
                    class490.field7451 = 0;
                    class211.field3282 = -5;
                    return;
                }
                class447.field6873++;
                if (class291.field4435 == class220.field3399) {
                    class220.field3399 = class121.field2010;
                } else {
                    class220.field3399 = class291.field4435;
                }
                class480.field7323 = 0;
                class490.field7451 = 1;
            }
            if (class490.field7451 == 1) {
                class103.field1831 = class7.field86.method1583(class376.field5480, class220.field3399, (byte) 35);
                class490.field7451 = 2;
            }
            if (arg0 <= 86) {
                field4674 = null;
            }
            if (class490.field7451 == 2) {
                if (class103.field1831.field2802 == 2) {
                    throw new IOException();
                }
                if (class103.field1831.field2802 != 1) {
                    return;
                }
                class163.field2534 = new class295((Socket) class103.field1831.field2803, class7.field86);
                class103.field1831 = null;
                long var1 = class70.field1230 = class212.method1305(false, class358.field5303);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class230.field3508.field585 = 0;
                class230.field3508.method221(-1, class247.field3773.field3849);
                class230.field3508.method221(-1, var3);
                class163.field2534.method1787(class230.field3508.field536, 0, 4900, 2);
                class111.method797(0);
                int var4 = class163.field2534.method1792(0);
                class111.method797(0);
                if (var4 != 0) {
                    class211.field3282 = var4;
                    class490.field7451 = 0;
                    class163.field2534.method1795((byte) 122);
                    class163.field2534 = null;
                    return;
                }
                class490.field7451 = 3;
            }
            if (class490.field7451 == 3) {
                if (class163.field2534.method1789(27683) < 8) {
                    return;
                }
                class163.field2534.method1788(-13205, 0, class491.field7457.field536, 8);
                class491.field7457.field585 = 0;
                class178.field2792 = class491.field7457.method265((byte) 108);
                class40 var5 = new class40(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class178.field2792 >> 32), (int) class178.field2792 };
                var5.method221(-1, 10);
                var5.method253(-73, var6[0]);
                var5.method253(-125, var6[1]);
                var5.method253(-75, var6[2]);
                var5.method253(-107, var6[3]);
                var5.method261((byte) 13, class212.method1305(false, class358.field5303));
                var5.method240(class305.field4633, 124);
                var5.method233(class295.field4486, (byte) 82, class378.field5534);
                class230.field3508.field585 = 0;
                if (client.field2992 == 40) {
                    class230.field3508.method221(-1, class247.field3791.field3849);
                } else {
                    class230.field3508.method221(-1, class247.field3789.field3849);
                }
                class230.field3508.method246((byte) -52, 0);
                int var7 = class230.field3508.field585;
                class230.field3508.method253(-124, 581);
                class230.field3508.method221(-1, class243.field3656);
                class230.field3508.method221(-1, class331.method2058(-5576));
                class230.field3508.method246((byte) -60, class482.field7368);
                class230.field3508.method246((byte) -63, class147.field2384);
                class230.field3508.method221(-1, class463.field7116.field2970);
                class137.method921(class230.field3508, (byte) 18);
                class230.field3508.method240(class138.field2274, 123);
                class230.field3508.method253(-91, class90.field1620);
                class40 var8 = class463.field7116.method83(0);
                class230.field3508.method221(-1, var8.field585);
                class230.field3508.method281(var8.field585, var8.field536, 0, 126);
                class388.field5623 = true;
                class230.field3508.method246((byte) -85, class379.field5542);
                class230.field3508.method253(-125, class469.field7195.method2741((byte) -113));
                class230.field3508.method253(-99, class376.field5487.method2741((byte) -118));
                class230.field3508.method253(-107, class207.field3242.method2741((byte) -117));
                class230.field3508.method253(-96, class85.field1435.method2741((byte) -125));
                class230.field3508.method253(-95, class131.field2087.method2741((byte) -128));
                class230.field3508.method253(-112, class73.field1310.method2741((byte) -122));
                class230.field3508.method253(-88, class471.field7207.method2741((byte) -115));
                class230.field3508.method253(-124, class274.field4160.method2741((byte) -115));
                class230.field3508.method253(-68, class472.field7225.method2741((byte) -116));
                class230.field3508.method253(-99, class383.field5572.method2741((byte) -114));
                class230.field3508.method253(-79, class119.field1975.method2741((byte) -126));
                class230.field3508.method253(-114, class395.field5765.method2741((byte) -118));
                class230.field3508.method253(-70, class375.field5474.method2741((byte) -112));
                class230.field3508.method253(-93, class123.field2027.method2741((byte) -119));
                class230.field3508.method253(-76, class226.field3466.method2741((byte) -127));
                class230.field3508.method253(-107, class173.field2694.method2741((byte) -128));
                class230.field3508.method253(-84, class504.field7613.method2741((byte) -113));
                class230.field3508.method253(-93, class237.field3590.method2741((byte) -127));
                class230.field3508.method253(-123, class409.field5934.method2741((byte) -124));
                class230.field3508.method253(-111, class478.field7307.method2741((byte) -115));
                class230.field3508.method253(-92, class315.field4751.method2741((byte) -126));
                class230.field3508.method253(-127, class245.field3680.method2741((byte) -122));
                class230.field3508.method253(-84, class60.field1021.method2741((byte) -128));
                class230.field3508.method253(-77, class232.field3524.method2741((byte) -127));
                class230.field3508.method253(-88, class161.field2531.method2741((byte) -112));
                class230.field3508.method253(-123, class406.field5894.method2741((byte) -125));
                class230.field3508.method253(-95, class436.field6425.method2741((byte) -116));
                class230.field3508.method253(-127, class483.field7377.method2741((byte) -121));
                class230.field3508.method253(-109, class183.field2914.method2741((byte) -126));
                class230.field3508.method253(-83, class296.field4496.method2741((byte) -117));
                class230.field3508.method281(var5.field585, var5.field536, 0, 106);
                class230.field3508.method226(class230.field3508.field585 - var7, (byte) -123);
                class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                class230.field3508.method2374(var6, (byte) -104);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class491.field7457.method2374(var6, (byte) -123);
                class490.field7451 = 4;
            }
            if (class490.field7451 == 4) {
                if (class163.field2534.method1789(27683) < 1) {
                    return;
                }
                int var10 = class163.field2534.method1792(0);
                if (var10 == 21) {
                    class490.field7451 = 7;
                } else if (var10 == 29) {
                    class490.field7451 = 11;
                } else if (var10 == 1) {
                    class211.field3282 = var10;
                    class490.field7451 = 5;
                    return;
                } else if (var10 == 2) {
                    class490.field7451 = 8;
                } else if (var10 == 15) {
                    class60.field1014 = -2;
                    class490.field7451 = 12;
                } else if (var10 == 23 && class447.field6873 < 1) {
                    class480.field7323 = 0;
                    class447.field6873++;
                    class490.field7451 = 1;
                    class163.field2534.method1795((byte) 125);
                    class163.field2534 = null;
                    return;
                } else {
                    class211.field3282 = var10;
                    class490.field7451 = 0;
                    class163.field2534.method1795((byte) 122);
                    class163.field2534 = null;
                    return;
                }
            }
            if (class490.field7451 == 6) {
                class230.field3508.field585 = 0;
                class230.field3508.method2365(class247.field3790.field3849, (byte) 92);
                class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                class490.field7451 = 4;
            } else if (class490.field7451 == 7) {
                if (class163.field2534.method1789(27683) >= 1) {
                    class32.field417 = class163.field2534.method1792(0) * 60 + 180;
                    class211.field3282 = 21;
                    class490.field7451 = 0;
                    class163.field2534.method1795((byte) 127);
                    class163.field2534 = null;
                }
            } else if (class490.field7451 != 11) {
                if (class490.field7451 == 8) {
                    if (class163.field2534.method1789(27683) < 13) {
                        return;
                    }
                    class163.field2534.method1788(-13205, 0, class491.field7457.field536, 13);
                    class491.field7457.field585 = 0;
                    class193.field3052 = class491.field7457.method257((byte) 106);
                    class177.field2775 = class491.field7457.method257((byte) 23);
                    class396.field5784 = class491.field7457.method257((byte) 108) == 1;
                    class32.field419 = class491.field7457.method257((byte) 65) == 1;
                    class218.field3350 = class491.field7457.method257((byte) 71) == 1;
                    class75.field1352 = class491.field7457.method257((byte) 54) == 1;
                    class507.field7667 = class491.field7457.method254((byte) -88);
                    class137.field2256 = class491.field7457.method257((byte) 99) == 1;
                    class73.field1313 = class491.field7457.method257((byte) 125) == 1;
                    class128.field2070.method909(class73.field1313, 0);
                    class288.field4362.method3032(class73.field1313, (byte) -120);
                    class433.field6358.method2694(-26, class73.field1313);
                    if ((!class396.field5784 || class218.field3350) && !class137.field2256) {
                        try {
                            class209.method1278(5633, class7.field86.field3929, "unzap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class209.method1278(5633, class7.field86.field3929, "zap");
                        } catch (Throwable var16) {
                            if (class22.field282) {
                                try {
                                    class7.field86.field3929.getAppletContext().showDocument(new URL(class7.field86.field3929.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var15) {
                                }
                            }
                        }
                    }
                    if (class77.field1378 == class230.field3507) {
                        try {
                            class209.method1278(5633, class7.field86.field3929, "loggedin");
                        } catch (Throwable var13) {
                        }
                    }
                    class490.field7451 = 10;
                }
                if (class490.field7451 == 10) {
                    if (class491.field7457.method2369((byte) -103)) {
                        if (class163.field2534.method1789(27683) < 1) {
                            return;
                        }
                        class163.field2534.method1788(-13205, class491.field7457.field585 + 2, class491.field7457.field536, 1);
                    }
                    class374.field5459 = class114.method812((byte) 115)[class491.field7457.method2363(-109)];
                    class60.field1014 = class491.field7457.method254((byte) -96);
                    class490.field7451 = 9;
                }
                if (class490.field7451 == 9) {
                    if (class163.field2534.method1789(27683) >= class60.field1014) {
                        class163.field2534.method1788(-13205, 0, class491.field7457.field536, class60.field1014);
                        class491.field7457.field585 = 0;
                        int var11 = class60.field1014;
                        class490.field7451 = 0;
                        class211.field3282 = 2;
                        class300.method1809(0);
                        class226.method1365(-1205683698, class491.field7457);
                        class178.field2783 = -1;
                        class297.method1800(-5540);
                        if (class491.field7457.field585 != var11) {
                            throw new RuntimeException("lswp pos:" + class491.field7457.field585 + " psize:" + var11);
                        }
                        class374.field5459 = null;
                    }
                } else if (class490.field7451 == 12) {
                    if (class60.field1014 == -2) {
                        if (class163.field2534.method1789(27683) < 2) {
                            return;
                        }
                        class163.field2534.method1788(-13205, 0, class491.field7457.field536, 2);
                        class491.field7457.field585 = 0;
                        class60.field1014 = class491.field7457.method254((byte) -100);
                    }
                    if (class163.field2534.method1789(27683) >= class60.field1014) {
                        class163.field2534.method1788(-13205, 0, class491.field7457.field536, class60.field1014);
                        class491.field7457.field585 = 0;
                        class211.field3282 = 15;
                        class490.field7451 = 0;
                        int var12 = class60.field1014;
                        class507.method3033(-1);
                        class226.method1365(-1205683698, class491.field7457);
                        if (class491.field7457.field585 != var12) {
                            throw new RuntimeException("lswpr pos:" + class491.field7457.field585 + " psize:" + var12);
                        }
                        class374.field5459 = null;
                    }
                }
            } else if (class163.field2534.method1789(27683) >= 1) {
                class120.field2000 = class163.field2534.method1792(0);
                class211.field3282 = 29;
                class490.field7451 = 0;
                class163.field2534.method1795((byte) 123);
                class163.field2534 = null;
            }
        } catch (IOException var17) {
            if (class163.field2534 != null) {
                class163.field2534.method1795((byte) 124);
                class163.field2534 = null;
            }
            if (class447.field6873 < 1) {
                class490.field7451 = 1;
                if (class291.field4435 == class220.field3399) {
                    class220.field3399 = class121.field2010;
                } else {
                    class220.field3399 = class291.field4435;
                }
                class480.field7323 = 0;
                class447.field6873++;
            } else {
                class211.field3282 = -4;
                class490.field7451 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwi;")
    public static final class311 method1858(Throwable arg0, String arg1) {
        field4675++;
        class311 var2;
        if (arg0 instanceof class311) {
            var2 = (class311) arg0;
            var2.field4680 = var2.field4680 + ' ' + arg1;
        } else {
            var2 = new class311(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V")
    public class310(int arg0, int arg1) {
        this.field4677 = arg0;
    }

    static {
        new class423("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
