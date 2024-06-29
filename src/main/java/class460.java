import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class460 implements class417 {

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "Lcp;")
    private class470 field6446 = new class470(128);

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "[I")
    public int[] field6450 = new int[class229.field3460.field1094];

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "[I")
    private int[] field6445 = new int[class229.field3460.field1094];

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "Z")
    public static boolean field6452 = false;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Lef;")
    public static class311 field6442 = new class311(0, 4);

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field6457 = -1;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Ldk;")
    public static class326 field6459 = new class326("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Lbc;")
    public static class225 field6451;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "Lii;")
    public static class358 field6458;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method2690(byte arg0) {
        field6451 = null;
        field6459 = null;
        int var1 = 9 % ((arg0 + 64) / 45);
        field6442 = null;
        field6458 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZII)V")
    public final void method2691(boolean arg0, int arg1, int arg2) {
        field6438++;
        class459 var4 = class467.field6582.method1103(arg1, 0);
        int var5 = var4.field6427;
        if (arg0) {
            method2700((class452) null, true);
        }
        int var6 = var4.field6430;
        int var7 = var4.field6429;
        int var8 = class236.field3555[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2698(~var9 & this.field6445[var5] | var9 & arg2 << var6, (byte) 115, var5);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2692(int arg0, String arg1, int arg2) {
        class44.field639++;
        class15.method110(class478.field6709, arg2 ^ 0x76);
        field6443++;
        class225.field3415.method1753(true, class89.method501(arg1, true) + 1);
        class225.field3415.method1753(true, arg0);
        if (arg2 != -12) {
            field6442 = null;
        }
        class225.field3415.method1730(-11508, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lvr;BIILnp;Lqo;ILii;)V")
    public static final void method2693(class80 arg0, byte arg1, int arg2, int arg3, class313 arg4, class19 arg5, int arg6, class358 arg7) {
        field6454++;
        int var8 = 40 % ((10 - arg1) / 35);
        int var9 = arg0.field981 - (arg2 / 2) - 5;
        int var10 = arg6 + 2;
        if (arg5.field230 != 0) {
            arg4.method1941(arg7.method2223() * arg3 + arg6 + 1 - var10, var10, 1, arg2 + 10, var9, arg5.field230);
        }
        if (arg5.field249 != 0) {
            arg4.method1933(arg6 + arg7.method2223() * arg3 + 1 - var10, arg5.field249, arg2 + 10, var10, (byte) -91, var9);
        }
        int var11 = arg5.field251;
        if (arg0.field982 && arg5.field254 != -1) {
            var11 = arg5.field254;
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            String var13 = class107.field1342[var12];
            if (var12 < (arg3 - 1)) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg7.method2226(arg4, var13, arg0.field981, arg6, var11, true);
            arg6 += arg7.method2223();
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
    public final void method2694(int arg0, byte arg1, int arg2) {
        field6444++;
        if (arg1 <= 75) {
            return;
        }
        class459 var4 = class467.field6582.method1103(arg0, 0);
        int var5 = var4.field6427;
        int var6 = var4.field6430;
        int var7 = var4.field6429;
        int var8 = class236.field3555[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2699(var5, arg2 << var6 & var9 | this.field6450[var5] & ~var9, -29988);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)I")
    public final int method2695(boolean arg0, boolean arg1) {
        field6449++;
        long var3 = class433.method2562(-2039);
        for (class115 var5 = arg0 ? (class115) this.field6446.method2769((byte) 69) : (class115) this.field6446.method2768((byte) -88); var5 != null; var5 = (class115) this.field6446.method2768((byte) -88)) {
            if ((var5.field1468 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1468 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3568;
                    this.field6450[var6] = this.field6445[var6];
                    var5.method1510((byte) -13);
                    return var6;
                }
                var5.method1510((byte) -13);
            }
        }
        if (arg1) {
            return -1;
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)I")
    public final int method2452(boolean arg0, int arg1) {
        field6456++;
        class459 var3 = class467.field6582.method1103(arg1, 0);
        if (!arg0) {
            field6457 = 66;
        }
        int var4 = var3.field6427;
        int var5 = var3.field6430;
        int var6 = var3.field6429;
        int var7 = class236.field3555[var6 - var5];
        return this.field6450[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
    public final void method2696(byte arg0) {
        int var2 = 0;
        int var3 = -7 / ((arg0 + 30) / 45);
        while (class229.field3460.field1094 > var2) {
            class401 var4 = class229.field3460.method497(-127, var2);
            if (var4 != null && var4.field5671 == 0) {
                this.field6445[var2] = 0;
                this.field6450[var2] = 0;
            }
            var2++;
        }
        field6439++;
        this.field6446 = new class470(128);
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
    public static final void method2697(byte arg0) {
        field6447++;
        if (class278.field4092 == 0 || class278.field4092 == 5) {
            return;
        }
        try {
            if (++class99.field1275 > 2000) {
                if (class58.field761 != null) {
                    class58.field761.method2118(1);
                    class58.field761 = null;
                }
                if (class367.field5271 >= 1) {
                    class22.field287 = -5;
                    class278.field4092 = 0;
                    return;
                }
                class367.field5271++;
                if (class89.field1102 == class2.field24) {
                    class89.field1102 = class202.field2979;
                } else {
                    class89.field1102 = class2.field24;
                }
                class99.field1275 = 0;
                class278.field4092 = 1;
            }
            if (class278.field4092 == 1) {
                class178.field2553 = class252.field3718.method2527(class262.field3840, (byte) -126, class89.field1102);
                class278.field4092 = 2;
            }
            if (class278.field4092 == 2) {
                if (class178.field2553.field5253 == 2) {
                    throw new IOException();
                }
                if (class178.field2553.field5253 != 1) {
                    return;
                }
                class58.field761 = new class337((Socket) class178.field2553.field5255, class252.field3718);
                class178.field2553 = null;
                long var1 = class276.field4055 = class240.method1523(class298.field4289, (byte) 125);
                class225.field3415.field4021 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class225.field3415.method1753(true, class93.field1186.field1886);
                class225.field3415.method1753(true, var3);
                class58.field761.method2125(2, class225.field3415.field4064, (byte) -36, 0);
                if (class28.field381 != null) {
                    class28.field381.method2477(-80);
                }
                if (class116.field1481 != null) {
                    class116.field1481.method2477(-100);
                }
                int var4 = class58.field761.method2119(true);
                if (class28.field381 != null) {
                    class28.field381.method2477(-106);
                }
                if (class116.field1481 != null) {
                    class116.field1481.method2477(arg0 - 68);
                }
                if (var4 != 0) {
                    class22.field287 = var4;
                    class278.field4092 = 0;
                    class58.field761.method2118(1);
                    class58.field761 = null;
                    return;
                }
                class278.field4092 = 3;
            }
            if (class278.field4092 == 3) {
                if (class58.field761.method2121(true) < 8) {
                    return;
                }
                class58.field761.method2123(arg0 ^ 0xFFFFFFA0, 0, class345.field5016.field4064, 8);
                class345.field5016.field4021 = 0;
                class145.field1980 = class345.field5016.method1703(-124);
                class276 var5 = new class276(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class145.field1980 >> 32), (int) class145.field1980 };
                var5.method1753(true, 10);
                var5.method1744(var6[0], true);
                var5.method1744(var6[1], true);
                var5.method1744(var6[2], true);
                var5.method1744(var6[3], true);
                var5.method1722(class240.method1523(class298.field4289, (byte) 126), true);
                var5.method1730(-11508, class201.field2965);
                var5.method1731(-18016, class427.field5977, class171.field2490);
                class225.field3415.field4021 = 0;
                if (class363.field5227 == 40) {
                    class225.field3415.method1753(true, class93.field1190.field1886);
                } else {
                    class225.field3415.method1753(true, class93.field1188.field1886);
                }
                class225.field3415.method1711(false, 0);
                int var7 = class225.field3415.field4021;
                class225.field3415.method1744(577, true);
                class225.field3415.method1753(true, class240.field3595);
                class225.field3415.method1753(true, class262.method1624(16822));
                class225.field3415.method1711(false, class144.field1900);
                class225.field3415.method1711(false, class244.field3634);
                class225.field3415.method1753(true, class314.field4438.field5778);
                class36.method240(class225.field3415, true);
                class225.field3415.method1730(arg0 ^ 0x2CE3, class347.field5028);
                class225.field3415.method1744(class36.field466, true);
                class276 var8 = class314.field4438.method1173(1);
                class225.field3415.method1753(true, var8.field4021);
                class225.field3415.method1704((byte) -48, var8.field4064, 0, var8.field4021);
                class160.field2370 = true;
                class225.field3415.method1711(false, class224.field3391);
                class225.field3415.method1744(class414.field5821.method1244(65), true);
                class225.field3415.method1744(class8.field81.method1244(91), true);
                class225.field3415.method1744(class66.field842.method1244(71), true);
                class225.field3415.method1744(class268.field3921.method1244(60), true);
                class225.field3415.method1744(class258.field3769.method1244(80), true);
                class225.field3415.method1744(class303.field4311.method1244(122), true);
                class225.field3415.method1744(class360.field5189.method1244(96), true);
                class225.field3415.method1744(class65.field840.method1244(119), true);
                class225.field3415.method1744(class407.field5716.method1244(arg0 + 121), true);
                class225.field3415.method1744(class355.field5139.method1244(arg0 + 75), true);
                class225.field3415.method1744(class323.field4668.method1244(97), true);
                class225.field3415.method1744(class157.field2337.method1244(84), true);
                class225.field3415.method1744(class480.field6733.method1244(arg0 ^ 0xFFFFFF85), true);
                class225.field3415.method1744(class347.field5025.method1244(78), true);
                class225.field3415.method1744(class479.field6720.method1244(82), true);
                class225.field3415.method1744(class135.field1800.method1244(80), true);
                class225.field3415.method1744(class360.field5187.method1244(arg0 ^ 0xFFFFFF82), true);
                class225.field3415.method1744(class306.field4359.method1244(arg0 ^ 0xFFFFFF84), true);
                class225.field3415.method1744(class227.field3434.method1244(66), true);
                class225.field3415.method1744(class359.field5162.method1244(arg0 + 125), true);
                class225.field3415.method1744(class184.field2717.method1244(arg0 ^ 0xFFFFFFB5), true);
                class225.field3415.method1744(class410.field5758.method1244(arg0 + 101), true);
                class225.field3415.method1744(class66.field848.method1244(60), true);
                class225.field3415.method1744(class120.field1512.method1244(arg0 + 103), true);
                class225.field3415.method1744(class318.field4615.method1244(74), true);
                class225.field3415.method1744(class15.field182.method1244(arg0 ^ 0xFFFFFFA1), true);
                class225.field3415.method1744(class481.field6781.method1244(77), true);
                class225.field3415.method1744(class328.field4750.method1244(74), true);
                class225.field3415.method1744(class99.field1264.method1244(79), true);
                class225.field3415.method1704((byte) -48, var5.field4064, 0, var5.field4021);
                class225.field3415.method1745(119, class225.field3415.field4021 - var7);
                class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                class225.field3415.method2456(var6, (byte) 72);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class345.field5016.method2456(var6, (byte) 72);
                class278.field4092 = 4;
            }
            if (class278.field4092 == 4) {
                if (class58.field761.method2121(true) < 1) {
                    return;
                }
                int var10 = class58.field761.method2119(true);
                if (var10 == 21) {
                    class278.field4092 = 7;
                } else if (var10 == 29) {
                    class278.field4092 = 11;
                } else if (var10 == 1) {
                    class278.field4092 = 5;
                    class22.field287 = var10;
                    return;
                } else if (var10 == 2) {
                    class278.field4092 = 8;
                } else if (var10 == 15) {
                    class382.field5447 = -2;
                    class278.field4092 = 12;
                } else if (var10 == 23 && class367.field5271 < 1) {
                    class367.field5271++;
                    class99.field1275 = 0;
                    class278.field4092 = 1;
                    class58.field761.method2118(1);
                    class58.field761 = null;
                    return;
                } else {
                    class22.field287 = var10;
                    class278.field4092 = 0;
                    class58.field761.method2118(1);
                    class58.field761 = null;
                    return;
                }
            }
            if (arg0 != -17) {
                method2690((byte) 104);
            }
            if (class278.field4092 == 6) {
                class225.field3415.field4021 = 0;
                class225.field3415.method2461((byte) 39, class93.field1189.field1886);
                class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                class278.field4092 = 4;
            } else if (class278.field4092 == 7) {
                if (class58.field761.method2121(true) >= 1) {
                    class346.field5022 = (class58.field761.method2119(true) + 3) * 60;
                    class278.field4092 = 0;
                    class22.field287 = 21;
                    class58.field761.method2118(1);
                    class58.field761 = null;
                }
            } else if (class278.field4092 != 11) {
                if (class278.field4092 == 8) {
                    if (class58.field761.method2121(true) < 13) {
                        return;
                    }
                    class58.field761.method2123(76, 0, class345.field5016.field4064, 13);
                    class345.field5016.field4021 = 0;
                    class362.field5213 = class345.field5016.method1701(-23121);
                    class220.field3284 = class345.field5016.method1701(-23121);
                    class479.field6717 = class345.field5016.method1701(-23121) == 1;
                    class23.field308 = class345.field5016.method1701(-23121) == 1;
                    class325.field4690 = class345.field5016.method1701(-23121) == 1;
                    class363.field5221 = class345.field5016.method1701(-23121) == 1;
                    class295.field4273 = class345.field5016.method1729(65280);
                    class241.field3612 = class345.field5016.method1701(arg0 ^ 0x5A40) == 1;
                    class39.field514 = class345.field5016.method1701(-23121) == 1;
                    class156.field2325.method799(class39.field514, 110);
                    class64.field834.method2131((byte) -104, class39.field514);
                    class265.field3859.method2806(arg0 ^ 0x5D7F, class39.field514);
                    if ((!class479.field6717 || class325.field4690) && !class241.field3612) {
                        try {
                            class429.method2520(class252.field3718.field6021, (byte) 91, "unzap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class429.method2520(class252.field3718.field6021, (byte) 103, "zap");
                        } catch (Throwable var16) {
                            if (class310.field4387) {
                                try {
                                    class252.field3718.field6021.getAppletContext().showDocument(new URL(class252.field3718.field6021.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var15) {
                                }
                            }
                        }
                    }
                    if (class394.field5599 == class356.field5143) {
                        try {
                            class429.method2520(class252.field3718.field6021, (byte) 118, "loggedin");
                        } catch (Throwable var13) {
                        }
                    }
                    class278.field4092 = 10;
                }
                if (class278.field4092 == 10) {
                    if (class345.field5016.method2458(-128)) {
                        if (class58.field761.method2121(true) < 1) {
                            return;
                        }
                        class58.field761.method2123(76, class345.field5016.field4021 + 2, class345.field5016.field4064, 1);
                    }
                    class393.field5568 = class34.method230(true)[class345.field5016.method2460(255)];
                    class382.field5447 = class345.field5016.method1729(arg0 + 65297);
                    class278.field4092 = 9;
                }
                if (class278.field4092 == 9) {
                    if (class58.field761.method2121(true) >= class382.field5447) {
                        class58.field761.method2123(68, 0, class345.field5016.field4064, class382.field5447);
                        class345.field5016.field4021 = 0;
                        class22.field287 = 2;
                        int var11 = class382.field5447;
                        class278.field4092 = 0;
                        class264.method1630(arg0 + 17);
                        class293.method1825(class345.field5016, arg0 ^ 0xD22B3A07);
                        class310.field4388 = -1;
                        class148.method935(arg0 + 67, false);
                        if (class345.field5016.field4021 != var11) {
                            throw new RuntimeException("lswp pos:" + class345.field5016.field4021 + " psize:" + var11);
                        }
                        class393.field5568 = null;
                    }
                } else if (class278.field4092 == 12) {
                    if (class382.field5447 == -2) {
                        if (class58.field761.method2121(true) < 2) {
                            return;
                        }
                        class58.field761.method2123(76, 0, class345.field5016.field4064, 2);
                        class345.field5016.field4021 = 0;
                        class382.field5447 = class345.field5016.method1729(65280);
                    }
                    if (class58.field761.method2121(true) >= class382.field5447) {
                        class58.field761.method2123(119, 0, class345.field5016.field4064, class382.field5447);
                        class345.field5016.field4021 = 0;
                        class278.field4092 = 0;
                        int var12 = class382.field5447;
                        class22.field287 = 15;
                        class347.method2170(false);
                        class293.method1825(class345.field5016, arg0 + 768919033);
                        if (class345.field5016.field4021 != var12) {
                            throw new RuntimeException("lswpr pos:" + class345.field5016.field4021 + " psize:" + var12);
                        }
                        class393.field5568 = null;
                    }
                }
            } else if (class58.field761.method2121(true) >= 1) {
                class267.field3909 = class58.field761.method2119(true);
                class22.field287 = 29;
                class278.field4092 = 0;
                class58.field761.method2118(1);
                class58.field761 = null;
            }
        } catch (IOException var17) {
            if (class58.field761 != null) {
                class58.field761.method2118(1);
                class58.field761 = null;
            }
            if (class367.field5271 >= 1) {
                class22.field287 = -4;
                class278.field4092 = 0;
            } else {
                class367.field5271++;
                class99.field1275 = 0;
                class278.field4092 = 1;
                if (class89.field1102 == class2.field24) {
                    class89.field1102 = class202.field2979;
                } else {
                    class89.field1102 = class2.field24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)I")
    public final int method2453(int arg0, byte arg1) {
        field6440++;
        int var3 = -51 % ((-arg1 - 63) / 49);
        return this.field6450[arg0];
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IBI)V")
    public final void method2698(int arg0, byte arg1, int arg2) {
        field6448++;
        if (arg1 != 115) {
            field6451 = null;
        }
        this.field6445[arg2] = arg0;
        class115 var4 = (class115) this.field6446.method2761((long) arg2, (byte) -112);
        if (var4 == null) {
            class115 var5 = new class115(4611686018427387905L);
            this.field6446.method2767(arg1 - 116, (long) arg2, var5);
        } else if (var4.field1468 != 4611686018427387905L) {
            var4.field1468 = class433.method2562(-2039) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public final void method2699(int arg0, int arg1, int arg2) {
        if (arg2 != -29988) {
            method2700((class452) null, false);
        }
        field6453++;
        this.field6450[arg0] = arg1;
        class115 var4 = (class115) this.field6446.method2761((long) arg0, (byte) -112);
        if (var4 == null) {
            class115 var5 = new class115(class433.method2562(-2039) + 500L);
            this.field6446.method2767(arg2 + 29987, (long) arg0, var5);
        } else {
            var4.field1468 = class433.method2562(-2039) + 500L;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Loa;Z)V")
    public static final void method2700(class452 arg0, boolean arg1) {
        field6455++;
        if (arg1) {
            method2690((byte) -84);
        }
        class342 var2 = (class342) class389.field5521.method2761((long) arg0.field2154, (byte) -112);
        if (var2 == null) {
            class401.method2392(arg0.field2159[0], 0, arg0, arg0.field4319, (class216) null, (byte) 8, arg0.field2163[0], (class453) null);
        } else {
            var2.method2155(0);
        }
    }
}
