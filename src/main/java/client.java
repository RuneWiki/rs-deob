import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class255 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static volatile int field3669 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[[I")
    public static int[][] field3689 = new int[128][128];

    @OriginalMember(owner = "client!client", name = "E", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lwi;")
    public static class214 field3672;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lro;)Lro;")
    public static final class249 method1556(class249 arg0) {
        int var1 = method1572(arg0).method1148(-114);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class107.method746(arg0.field3623, -70);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lro;)Z")
    public static final boolean method1557(class249 arg0) {
        if (class381.field5720) {
            if (method1572(arg0).field2514 != 0) {
                return false;
            }
            if (arg0.field3637 == 0) {
                return false;
            }
        }
        return arg0.field3571;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public static void method1558(byte arg0) {
        if (arg0 == 0) {
            field3672 = null;
            field3689 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1559(int arg0) {
        field3675++;
        if (class204.field2946 < class97.field1331.field4904) {
            if (class87.field1219 == class167.field2197) {
                class167.field2197 = class228.field3222;
            } else {
                class167.field2197 = class87.field1219;
            }
            class227.field3204 = (class97.field1331.field4904 * 50 - 50) * 5;
            if (class227.field3204 > 3000) {
                class227.field3204 = 3000;
            }
            if (class97.field1331.field4904 >= 2 && class97.field1331.field4906 == 6) {
                this.method1608(1, "js5connect_outofdate");
                class137.field1815 = 1000;
                return;
            }
            if (class97.field1331.field4904 >= 4 && class97.field1331.field4906 == -1) {
                this.method1608(1, "js5crc");
                class137.field1815 = 1000;
                return;
            }
            if (class97.field1331.field4904 >= 4 && (class137.field1815 == 0 || class137.field1815 == 5)) {
                if (class97.field1331.field4906 == 7 || class97.field1331.field4906 == 9) {
                    this.method1608(1, "js5connect_full");
                } else if (class97.field1331.field4906 > 0) {
                    this.method1608(1, "js5connect");
                } else {
                    this.method1608(1, "js5io");
                }
                class137.field1815 = 1000;
                return;
            }
        }
        class204.field2946 = class97.field1331.field4904;
        if (class227.field3204 > 0) {
            class227.field3204--;
            return;
        }
        try {
            if (class343.field5031 == 0) {
                class37.field604 = class361.field5285.method14(class162.field2111, (byte) 125, class167.field2197);
                class343.field5031++;
            }
            int var2 = 19 % ((-arg0 - 48) / 44);
            if (class343.field5031 == 1) {
                if (class37.field604.field4259 == 2) {
                    this.method1565(-81, 1000);
                    return;
                }
                if (class37.field604.field4259 == 1) {
                    class343.field5031++;
                }
            }
            if (class343.field5031 == 2) {
                class345.field5095 = new class26((Socket) class37.field604.field4262, class361.field5285);
                class265 var3 = new class265(5);
                var3.method1707(65, 15);
                var3.method1704(562, (byte) 125);
                class345.field5095.method245(45, 5, 0, var3.field3879);
                class343.field5031++;
                class383.field5732 = class55.method375(-3913);
            }
            if (class343.field5031 == 3) {
                if (class137.field1815 == 0 || class137.field1815 == 5 || class345.field5095.method241((byte) 17) > 0) {
                    int var4 = class345.field5095.method235(-1707);
                    if (var4 != 0) {
                        this.method1565(-112, var4);
                        return;
                    }
                    class343.field5031++;
                } else if ((class55.method375(-3913) - class383.field5732) > 30000L) {
                    this.method1565(-108, 1001);
                    return;
                }
            }
            if (class343.field5031 == 4) {
                boolean var5 = class137.field1815 == 5 || class137.field1815 == 10 || class137.field1815 == 28;
                class97.field1331.method2204(0, class345.field5095, !var5);
                class343.field5031 = 0;
                class345.field5095 = null;
                class37.field604 = null;
            }
        } catch (IOException var6) {
            this.method1565(-119, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1560(boolean arg0) {
        if (!arg0) {
            field3687 = 22;
        }
        field3671++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class425.method2733((byte) -116);
        class368.field5472 = new class300(class361.field5285);
        class97.field1331 = new class332();
        if (class24.field427 != 0) {
            class313.field4482 = new byte[50][];
        }
        class340.method2250(2, class361.field5285);
        if (class59.field849 == 0) {
            class344.field5042 = this.getCodeBase().getHost();
            class161.field2106 = 443;
            class246.field3436 = 43594;
        } else if (class59.field849 == 1) {
            class344.field5042 = this.getCodeBase().getHost();
            class246.field3436 = class232.field3280 + 40000;
            class161.field2106 = class232.field3280 + 50000;
        } else if (class59.field849 == 2) {
            class161.field2106 = class232.field3280 + 50000;
            class246.field3436 = class232.field3280 + 40000;
            class344.field5042 = "127.0.0.1";
        }
        class228.field3222 = class161.field2106;
        class10.field111 = class246.field3436;
        class87.field1219 = class246.field3436;
        class162.field2111 = class344.field5042;
        class167.field2197 = class10.field111;
        if (class126.field1679 == 1) {
            class132.field1777 = class139.field1851;
            class53.field793 = 16777215;
            class124.field1656 = 0;
            class434.field6394 = class183.field2466;
            class34.field557 = class339.field4982;
            class312.field4467 = class88.field1230;
            class91.field1254 = true;
        } else {
            class132.field1777 = class27.field486;
            class312.field4467 = class1.field1;
            class434.field6394 = class261.field3803;
            class34.field557 = class252.field3659;
        }
        class335.field4953 = class326.field4686 = class295.field4252 = class127.field1691 = new short[256];
        if (class2.field22 == 3) {
            class163.field2123 = class232.field3280;
        }
        class197.method1234((byte) -91);
        class370.method2437(119, class319.field4561);
        class145.method969(-12951, class319.field4561);
        class371.field5514 = method1561(34);
        if (class371.field5514 != null) {
            class371.field5514.method2490((byte) -43, class319.field4561);
        }
        class275.field4039 = class2.field22;
        try {
            if (class361.field5285.field27 != null) {
                class108.field1487 = new class63(class361.field5285.field27, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class371.field5513[var3] = new class63(class361.field5285.field25[var3], 6000, 0);
                }
                class449.field6564 = new class63(class361.field5285.field18, 6000, 0);
                class226.field3183 = new class425(255, class108.field1487, class449.field6564, 500000);
                class228.field3220 = new class63(class361.field5285.field26, 24, 0);
                class361.field5285.field25 = null;
                class361.field5285.field27 = null;
                class361.field5285.field18 = null;
                class361.field5285.field26 = null;
            }
        } catch (IOException var4) {
            class226.field3183 = null;
            class228.field3220 = null;
            class449.field6564 = null;
            class108.field1487 = null;
        }
        if (class59.field849 != 0) {
            class423.field6298 = true;
        }
        if (class126.field1679 == 0) {
            class416.field6192 = class311.field4447;
        } else if (class126.field1679 == 1) {
            class416.field6192 = class138.field1847;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ldc;")
    private static final class376 method1561(int arg0) {
        field3680++;
        try {
            int var1 = 90 / ((-arg0 - 2) / 36);
            return (class376) Class.forName("ca").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1562() {
        for (int var0 = -1; var0 < class191.field2662 + class153.field2004; var0++) {
            class18 var1;
            if (var0 < 0) {
                var1 = class100.field1350;
            } else if (var0 < class153.field2004) {
                var1 = class125.field1664[class66.field943[var0]];
            } else {
                var1 = class23.field408[class416.field6202[var0 - class153.field2004]];
            }
            if (var1.field248 >= 0) {
                int var2 = var1.method130((byte) -96);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field5284 & 0x7F) != 0 || (var1.field5298 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field5284 & 0x7F) != 64 || (var1.field5298 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field5284 >> 7;
                    int var4 = var1.field5298 >> 7;
                    if (var1.field248 > class313.field4477[var3][var4]) {
                        class313.field4477[var3][var4] = var1.field248;
                        class395.field5941[var3][var4] = 1;
                    } else if (class313.field4477[var3][var4] == var1.field248) {
                        var10002 = class395.field5941[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field5284 - var5 >> 7;
                    int var7 = var1.field5298 - var5 >> 7;
                    int var8 = var1.field5284 + var5 >> 7;
                    int var9 = var1.field5298 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field248 > class313.field4477[var10][var11]) {
                                class313.field4477[var10][var11] = var1.field248;
                                class395.field5941[var10][var11] = 1;
                            } else if (class313.field4477[var10][var11] == var1.field248) {
                                var10002 = class395.field5941[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    private final void method1563(byte arg0) {
        class187.field2544 = 0;
        field3690++;
        while (class301.method1906(-71) && class187.field2544 < 128) {
            if (!class34.method281(14848) || class157.field2066 != '`' && class157.field2066 != '§') {
                class344.field5046[class187.field2544] = class122.field1633;
                class240.field3384[class187.field2544] = class157.field2066;
                class187.field2544++;
            } else if (class357.method2345(0)) {
                class88.method545(false);
            } else {
                class203.method1282(100);
            }
        }
        if (class357.method2345(0)) {
            class433.method2748(false);
        }
        class175.field2280++;
        class240.method1491(-1, (class249) null, -1, (byte) 117);
        class313.method1954((class249) null, true, -1, -1);
        class421.method2707(68);
        class381.field5717++;
        int var2 = -37 % ((64 - arg0) / 49);
        for (int var3 = 0; var3 < 32768; var3++) {
            class129 var13 = class23.field408[var3];
            if (var13 != null) {
                byte var14 = var13.field1714.field5598;
                if ((var14 & 0x1) != 0) {
                    int var15 = var13.method130((byte) -106);
                    if ((var14 & 0x2) != 0 && var13.field309 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var17 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var16 != 0 || var17 != 0) {
                            int var18 = var13.field303[0] + var16;
                            int var19 = var13.field306[0] + var17;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class324.field4652 - var15 - 1)) {
                                var18 = class324.field4652 - var15 - 1;
                            }
                            if (var19 < 0) {
                                var19 = 0;
                            } else if (var19 > (class336.field4964 - var15 - 1)) {
                                var19 = class336.field4964 - var15 - 1;
                            }
                            int var20 = class205.method1291(var13.field306[0], 0, var13.field303[0], 0, class49.field691, true, -12757, class231.field3266, var15, var15, var19, -1, var18, var15, class119.field1605[var13.field5291]);
                            if (var20 > 0) {
                                if (var20 > 9) {
                                    var20 = 9;
                                }
                                for (int var21 = 0; var21 < var20; var21++) {
                                    var13.field303[var21] = class49.field691[var20 - var21 - 1];
                                    var13.field306[var21] = class231.field3266[var20 - var21 - 1];
                                    var13.field297[var21] = 1;
                                }
                                var13.field309 = var20;
                            }
                        }
                    }
                    class161.method1011(false, var13, true);
                    int var22 = class6.method52(var13, 16383);
                    class138.method930(var13, var22, class369.field5487, (byte) -124, class73.field991);
                    class88.method543(var13, (byte) -96);
                }
            }
        }
        if (class88.field1227 == 0 && class239.field3379 == 0) {
            if (class5.field48 == 2) {
                class355.method2331(-2511);
            } else {
                class171.method1055((byte) 115);
            }
            if (class237.field3326 >> 7 < 14 || class237.field3326 >> 7 >= class324.field4652 - 14 || (class7.field71 >> 7) < 14 || (class336.field4964 - 14) <= (class7.field71 >> 7)) {
                class297.method1889(false);
            }
        }
        while (true) {
            class228 var4;
            class249 var5;
            class249 var6;
            do {
                var4 = (class228) class134.field1785.method2647((byte) 93);
                if (var4 == null) {
                    while (true) {
                        class228 var7;
                        class249 var8;
                        class249 var9;
                        do {
                            var7 = (class228) class231.field3260.method2647((byte) 93);
                            if (var7 == null) {
                                while (true) {
                                    class228 var10;
                                    class249 var11;
                                    class249 var12;
                                    do {
                                        var10 = (class228) class130.field1743.method2647((byte) 93);
                                        if (var10 == null) {
                                            if (class372.field5533 != null) {
                                                class437.method2765(99);
                                            }
                                            if ((class50.field698 % 1500) == 0) {
                                                class353.method2326(-119);
                                            }
                                            class335.method2226(64);
                                            if (class329.field4727 && class191.field2656 < (class55.method375(-3913) - 60000L)) {
                                                class153.method993(6);
                                                return;
                                            }
                                            return;
                                        }
                                        var11 = var10.field3210;
                                        if (var11.field3517 < 0) {
                                            break;
                                        }
                                        var12 = class107.method746(var11.field3623, -67);
                                    } while (var12 == null || var12.field3493 == null || var12.field3493.length <= var11.field3517 || var12.field3493[var11.field3517] != var11);
                                    class365.method2395(var10);
                                }
                            }
                            var8 = var7.field3210;
                            if (var8.field3517 < 0) {
                                break;
                            }
                            var9 = class107.method746(var8.field3623, -98);
                        } while (var9 == null || var9.field3493 == null || var8.field3517 >= var9.field3493.length || var9.field3493[var8.field3517] != var8);
                        class365.method2395(var7);
                    }
                }
                var5 = var4.field3210;
                if (var5.field3517 < 0) {
                    break;
                }
                var6 = class107.method746(var5.field3623, -122);
            } while (var6 == null || var6.field3493 == null || var6.field3493.length <= var5.field3517 || var6.field3493[var5.field3517] != var5);
            class365.method2395(var4);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1564(int arg0) {
        if (class329.field4727) {
            class153.method993(6);
        }
        field3670++;
        if (class35.field574 != null) {
            class35.field574.method2761(arg0 - 31588);
        }
        if (class106.field1428 != null) {
            class314.method1961(class361.field5285, class106.field1428, true);
            class106.field1428 = null;
        }
        if (class71.field973 != null) {
            class71.field973.field3195 = false;
        }
        class71.field973 = null;
        if (class159.field2079 != null) {
            class159.field2079.method243(arg0 - 3);
            class159.field2079 = null;
        }
        class372.method2446(class319.field4561, (byte) 2);
        class185.method1147(class319.field4561, arg0 ^ 0x3FD);
        if (class371.field5514 != null) {
            class371.field5514.method2493(255, class319.field4561);
        }
        class357.method2342(true);
        class370.method2438(-1);
        if (arg0 != 2) {
            this.method1582((byte) -34);
        }
        class371.field5514 = null;
        if (class188.field2556 != null) {
            class188.field2556.method1343(14682);
        }
        if (field3672 != null) {
            field3672.method1343(14682);
        }
        class97.field1331.method2208((byte) -86);
        class368.field5472.method1899(arg0 - 17568);
        if (class344.field5041 != null) {
            class344.field5041.method683(-11400);
            class344.field5041 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1565(int arg0, int arg1) {
        class37.field604 = null;
        field3685++;
        class345.field5095 = null;
        class97.field1331.field4904++;
        class343.field5031 = 0;
        class97.field1331.field4906 = arg1;
        if (arg0 > -80) {
            method1566((byte) -40, (class238) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLqj;)V")
    private static final void method1566(byte arg0, class238 arg1) {
        class94.field1293 = arg1;
        if (arg0 > 79) {
            field3681++;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1567(int arg0) {
        if (arg0 > 116) {
            class215.field3087.method952(-18);
            field3688++;
            class71.field974.method952(-121);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1568(byte arg0) {
        field3677++;
        if (class137.field1815 == 1000) {
            return;
        }
        class50.field698++;
        if (class50.field698 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class320.field4576 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class432.field6375.setSeed((long) class320.field4576);
        }
        this.method1569(-87);
        if (class82.field1150 != null) {
            class82.field1150.method1486(arg0 - 10);
        }
        class395.method2587(arg0 ^ 0xFFFFFFB2);
        class87.method540(-109);
        class360.method2362((byte) -75);
        if (arg0 != 77) {
            this.method1560(false);
        }
        class219.method1359(107);
        if (class35.field574 != null) {
            class35.field574.method2031((int) class55.method375(-3913));
        }
        if (class371.field5514 != null) {
            int var3 = class371.field5514.method2494(-128);
            class433.field6392 = var3;
        }
        class292.method1873(19560);
        if (class137.field1815 == 0) {
            this.method1581((byte) -84);
            class16.method112(-1);
        } else if (class137.field1815 == 5) {
            this.method1581((byte) -107);
            class16.method112(-1);
        } else if (class137.field1815 == 25 || class137.field1815 == 28) {
            class439.method2777(false);
        }
        if (class137.field1815 == 10) {
            this.method1563((byte) 113);
            class53.method367(-31581);
            class133.method902(true);
            class277.method1766((byte) 7);
        } else if (class137.field1815 == 30) {
            class81.method515(false);
        } else if (class137.field1815 == 40) {
            class277.method1766((byte) 7);
            if (class276.field4043 != -3) {
                if (class276.field4043 == 15) {
                    class322.method1993((byte) 53);
                } else if (class276.field4043 != 2) {
                    class322.method1992(2);
                }
            }
        }
        class276.method1762(class35.field574, -81);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1569(int arg0) {
        if (arg0 >= -36) {
            field3672 = null;
        }
        field3674++;
        boolean var2 = class97.field1331.method2194(-128);
        if (!var2) {
            this.method1559(-124);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILmb;)Ljava/lang/String;")
    public static final String method1570(int arg0, class259 arg1) {
        field3684++;
        if (arg0 > -29) {
            field3672 = null;
        }
        return arg1.field3780 == null || arg1.field3780.length() <= 0 ? arg1.field3775 : arg1.field3775 + class306.field4377 + arg1.field3780;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3667++;
        if (!this.method1609((byte) -61)) {
            return;
        }
        class232.field3280 = Integer.parseInt(this.getParameter("worldid"));
        class59.field849 = Integer.parseInt(this.getParameter("modewhere"));
        if (class59.field849 < 0 || class59.field849 > 1) {
            class59.field849 = 0;
        }
        class24.field427 = Integer.parseInt(this.getParameter("modewhat"));
        if (class24.field427 < 0 || class24.field427 > 2) {
            class24.field427 = 0;
        }
        try {
            class58.field833 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class58.field833 = 0;
        }
        class423.method2725(class58.field833, (byte) 53);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class333.field4921 = true;
        } else {
            class333.field4921 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class231.field3265 = true;
        } else {
            class231.field3265 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class126.field1679 = 1;
        } else {
            class126.field1679 = 0;
        }
        try {
            class196.field2804 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class196.field2804 = 0;
        }
        class127.field1687 = this.getParameter("quiturl");
        class309.field4426 = this.getParameter("settings");
        if (class309.field4426 == null) {
            class309.field4426 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class235.field3303 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class235.field3303 = 0;
            }
        }
        class69.field953 = Integer.parseInt(this.getParameter("colourid"));
        if (class69.field953 < 0 || class190.field2598.length <= class69.field953) {
            class69.field953 = 0;
        }
        class1.field9 = this;
        this.method1599(503, (byte) 76, class24.field427 + 32, 765, 562);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class272.method1742("argument count", false);
            }
            class232.field3280 = Integer.parseInt(arg0[0]);
            class59.field849 = 2;
            if (arg0[1].equals("live")) {
                class24.field427 = 0;
            } else if (arg0[1].equals("rc")) {
                class24.field427 = 1;
            } else if (arg0[1].equals("wip")) {
                class24.field427 = 2;
            } else {
                class272.method1742("modewhat", false);
            }
            class58.field833 = class5.method44(true, arg0[2]);
            if (class58.field833 == -1) {
                if (arg0[2].equals("english")) {
                    class58.field833 = 0;
                } else if (arg0[2].equals("german")) {
                    class58.field833 = 1;
                } else {
                    class272.method1742("language", false);
                }
            }
            class423.method2725(class58.field833, (byte) 53);
            class231.field3265 = false;
            class333.field4921 = false;
            if (arg0[3].equals("game0")) {
                class126.field1679 = 0;
            } else if (arg0[3].equals("game1")) {
                class126.field1679 = 1;
            } else {
                class272.method1742("game", false);
            }
            class235.field3303 = 0;
            class69.field953 = class126.field1679;
            class196.field2804 = 0;
            class309.field4426 = "";
            client var1 = new client();
            class1.field9 = var1;
            var1.method1603((byte) 39, 562, 29, class24.field427 + 32, 768, false, 1024, class126.field1679 == 1 ? "stellardawn" : "runescape");
            class238.field3346.setLocation(40, 40);
        } catch (Exception var3) {
            class226.method1406((String) null, var3, 0);
        }
        field3679++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1571() {
        int var0 = class409.field6126 ? class153.field2004 : class191.field2662 + class153.field2004;
        for (int var1 = -1; var1 < var0; var1++) {
            class18 var2;
            if (var1 < 0) {
                var2 = class100.field1350;
            } else if (var1 < class153.field2004) {
                var2 = class125.field1664[class66.field943[var1]];
            } else {
                var2 = class23.field408[class416.field6202[var1 - class153.field2004]];
            }
            var2.field238 = 0;
            if (var2.field248 < 0) {
                var2.field268 = false;
            } else {
                int var3 = var2.method130((byte) -98);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field5284 & 0x7F) != 0 || (var2.field5298 & 0x7F) != 0) {
                        var2.field268 = false;
                        continue;
                    }
                } else if ((var2.field5284 & 0x7F) != 64 || (var2.field5298 & 0x7F) != 64) {
                    var2.field268 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field5284 >> 7;
                    int var5 = var2.field5298 >> 7;
                    if (class313.field4477[var4][var5] != var2.field248) {
                        var2.field268 = true;
                        continue;
                    }
                    if (class395.field5941[var4][var5] > 1) {
                        var10002 = class395.field5941[var4][var5]--;
                        var2.field268 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field5284 - var6 >> 7;
                    int var8 = var2.field5298 - var6 >> 7;
                    int var9 = var2.field5284 + var6 >> 7;
                    int var10 = var2.field5298 + var6 >> 7;
                    if (!class50.method345(var9, var2.field248, var7, 100, var8, var10)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class313.field4477[var11][var12] == var2.field248) {
                                    var10002 = class395.field5941[var11][var12]--;
                                }
                            }
                        }
                        var2.field268 = true;
                        continue;
                    }
                }
                if (var2 instanceof class194 && var2.field308 != null && class50.field698 >= var2.field299 && class50.field698 < var2.field307) {
                    ((class194) var2).field2775 = false;
                }
                var2.field268 = false;
                var2.field5297 = class139.method935(var2.field5298, 119, var2.field5284, class193.field2688);
                class84.method524(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lro;)Lum;")
    public static final class185 method1572(class249 arg0) {
        class185 var1 = (class185) class134.field1786.method954(-82, ((long) arg0.field3622 << 32) + (long) arg0.field3517);
        return var1 == null ? arg0.field3565 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1573() {
        boolean var0 = class264.field3845 == 1 && class153.field2004 > 200 || class264.field3845 == 0 && class153.field2004 > 50;
        for (int var1 = 0; var1 < class153.field2004; var1++) {
            class194 var10 = class125.field1664[class66.field943[var1]];
            if (var10.method1216(false)) {
                var10.method134((byte) -70);
                if (var10.field5296 >= 0 && var10.field5288 >= 0 && var10.field5293 < class324.field4652 && var10.field5286 < class336.field4964) {
                    var10.field2775 = var10.field236 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field268) {
                        var11++;
                    }
                    if (var10.field247 > class50.field698) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method130((byte) -51) << 2);
                    if (class224.field3168 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field248 = var12 + 1;
                } else {
                    var10.field248 = -1;
                }
            } else {
                var10.field248 = -1;
            }
        }
        for (int var2 = 0; var2 < class191.field2662; var2++) {
            class129 var7 = class23.field408[class416.field6202[var2]];
            if (var7.method878(false) && var7.field1714.method2462((byte) -128)) {
                var7.method134((byte) -115);
                if (var7.field5296 >= 0 && var7.field5288 >= 0 && var7.field5293 < class324.field4652 && var7.field5286 < class336.field4964) {
                    int var8 = 0;
                    if (!var7.field268) {
                        var8++;
                    }
                    if (var7.field247 > class50.field698) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method130((byte) -49) << 2);
                    if (class224.field3168 == 0) {
                        if (var7.field1714.field5580) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class224.field3168 == 1) {
                        if (var7.field1714.field5580) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field1714.field5594) {
                        var9 += 512;
                    } else if (!var7.field1714.field5587) {
                        var9 += 256;
                    }
                    var7.field248 = var9 + 1;
                } else {
                    var7.field248 = -1;
                }
            } else {
                var7.field248 = -1;
            }
        }
        for (int var3 = 0; var3 < class314.field4503.length; var3++) {
            class130 var4 = class314.field4503[var3];
            if (var4 != null) {
                if (var4.field1740 == 1) {
                    class129 var5 = class23.field408[var4.field1731];
                    if (var5 != null && var5.field248 >= 0) {
                        var5.field248 += 1024;
                    }
                } else if (var4.field1740 == 10) {
                    class194 var6 = class125.field1664[var4.field1731];
                    if (var6 != null && var6.field248 >= 0) {
                        var6.field248 += 1024;
                    }
                }
            }
        }
        class100.field1350.field248 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Object;ILud;)V")
    public static final void method1574(Object arg0, int arg1, class2 arg2) {
        field3686++;
        if (arg2.field31 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field31.peekEvent() != null; var3++) {
            class404.method2628(-59, 1L);
        }
        int var4 = -80 / ((39 - arg1) / 62);
        if (arg0 != null) {
            arg2.field31.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1575() {
        class423.field6295 = 0;
        for (int var0 = 0; var0 < class191.field2662; var0++) {
            class129 var1 = class23.field408[class416.field6202[var0]];
            if (var1.field268 && var1.method142((byte) 115) != -1) {
                int var2 = (var1.method130((byte) -78) - 1) * 64 + 60;
                int var3 = var1.field5284 - var2 >> 7;
                int var4 = var1.field5298 - var2 >> 7;
                class18 var5 = class403.method2617(var3, class193.field2688, var4, (byte) 27);
                if (var5 != null) {
                    int var6 = var5.field249;
                    if (var5 instanceof class129) {
                        var6 += 2048;
                    }
                    if (var5.field238 == 0 && var5.method142((byte) 115) != -1) {
                        class328.field4708[class423.field6295] = var6;
                        class314.field4499[class423.field6295] = var6;
                        class423.field6295++;
                        var5.field238++;
                    }
                    class328.field4708[class423.field6295] = var6;
                    class314.field4499[class423.field6295] = var1.field249 + 2048;
                    class423.field6295++;
                    var5.field238++;
                }
            }
        }
        class368.method2427(0, (byte) 43, class328.field4708, class314.field4499, class423.field6295 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lro;IIIIIIIII)V")
    public static final void method1576(class249[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class249 var11 = arg0[var10];
            if (var11 != null && var11.field3623 == arg1) {
                int var12 = var11.field3609 + arg6;
                int var13 = var11.field3510 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3637 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3578 + var12;
                    int var19 = var11.field3604 + var13;
                    if (var11.field3637 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (!var11.field3522 || var11.field3637 == 0 || var11.field3520 || method1572(var11).field2514 != 0 || class194.field2785 == var11 || var11.field3608 == 1338) {
                    if (!var11.field3522 || !method1557(var11)) {
                        if (class372.field5533 == var11) {
                            class26.field465 = true;
                            class342.field5018 = var12;
                            class358.field5240 = var13;
                        }
                        if (!var11.field3522 || var11.field3568 || var14 < var16 && var15 < var17) {
                            if (var11.field3637 == 0) {
                                if (!var11.field3522 && method1557(var11) && class59.field853 != var11) {
                                    continue;
                                }
                                if (var11.field3596 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                    for (class228 var20 = (class228) class130.field1743.method2649(0); var20 != null; var20 = (class228) class130.field1743.method2656(0)) {
                                        if (var20.field3216) {
                                            var20.method2574((byte) 115);
                                            var20.field3210.field3580 = false;
                                        }
                                    }
                                    if (class116.field1579 == 0) {
                                        class372.field5533 = null;
                                        class194.field2785 = null;
                                    }
                                    class19.field329 = 0;
                                    class60.field867 = false;
                                    class327.field4699 = false;
                                    if (!class229.field3230) {
                                        class235.method1435((byte) 88);
                                    }
                                }
                            }
                            boolean var21;
                            if (class34.field555 >= var14 && class316.field4522 >= var15 && class34.field555 < var16 && class316.field4522 < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class229.field3230 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class65.method427(2, arg9 - var13, arg8 - var12, var11);
                            }
                            if (var11.field3522) {
                                boolean var22 = false;
                                if (class10.field100 == 1 && var21) {
                                    var22 = true;
                                }
                                boolean var23 = false;
                                if (class84.field1173 == 1 && class242.field3390 >= var14 && class420.field6256 >= var15 && class242.field3390 < var16 && class420.field6256 < var17) {
                                    var23 = true;
                                }
                                if (var11.field3484 != null) {
                                    for (int var24 = 0; var24 < var11.field3484.length; var24++) {
                                        if (class1.field5[var11.field3484[var24]]) {
                                            if (var11.field3546 == null || class50.field698 >= var11.field3546[var24]) {
                                                byte var25 = var11.field3584[var24];
                                                if (var25 == 0 || ((var25 & 0x8) == 0 || !class1.field5[86] && !class1.field5[82] && !class1.field5[81]) && ((var25 & 0x2) == 0 || class1.field5[86]) && ((var25 & 0x1) == 0 || class1.field5[82]) && ((var25 & 0x4) == 0 || class1.field5[81])) {
                                                    class434.method2755((byte) 31, "", var11.field3622, var24 + 1, -1);
                                                    int var26 = var11.field3616[var24];
                                                    if (var11.field3546 == null) {
                                                        var11.field3546 = new int[var11.field3484.length];
                                                    }
                                                    if (var26 == 0) {
                                                        var11.field3546[var24] = Integer.MAX_VALUE;
                                                    } else {
                                                        var11.field3546[var24] = class50.field698 + var26;
                                                    }
                                                }
                                            }
                                        } else if (var11.field3546 != null) {
                                            var11.field3546[var24] = 0;
                                        }
                                    }
                                }
                                if (var23) {
                                    class433.method2752(var11, class242.field3390 - var12, class420.field6256 - var13, -115);
                                }
                                if (class372.field5533 != null && class372.field5533 != var11 && var21 && method1572(var11).method1140(false)) {
                                    class26.field459 = var11;
                                }
                                if (class194.field2785 == var11) {
                                    class370.field5510 = true;
                                    class73.field992 = var12;
                                    class54.field803 = var13;
                                }
                                if (var11.field3520 || var11.field3608 != 0) {
                                    if (var21 && class433.field6392 != 0 && var11.field3518 != null) {
                                        class228 var27 = new class228();
                                        var27.field3216 = true;
                                        var27.field3210 = var11;
                                        var27.field3219 = class433.field6392;
                                        var27.field3215 = var11.field3518;
                                        class130.field1743.method2660((byte) -128, var27);
                                    }
                                    if (class372.field5533 != null || class229.field3246 != null || class229.field3230 || var11.field3608 != 1400 && class19.field329 > 0) {
                                        var23 = false;
                                        var22 = false;
                                        var21 = false;
                                    }
                                    if (var11.field3608 != 0) {
                                        if (var11.field3608 == 1337 || var11.field3608 == 1403) {
                                            class144.field1896 = var11;
                                            if (class94.field1305 != null) {
                                                class94.field1305.method561(var11.field3604, -18995, class35.field574);
                                            }
                                            if (var11.field3608 == 1337) {
                                                if (!class229.field3230 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                    class58.method392(class35.field574, arg9, arg8, 127);
                                                    for (class160 var28 = (class160) class374.field5634.method976((byte) 42); var28 != null; var28 = (class160) class374.field5634.method979(-87)) {
                                                        if (arg8 >= var28.field2100 && arg8 < var28.field2098 && arg9 >= var28.field2097 && arg9 < var28.field2094) {
                                                            class235.method1435((byte) 45);
                                                            class38.method297(1, var28.field2090);
                                                        }
                                                    }
                                                }
                                                class240.method1491(var12, var11, var13, (byte) 12);
                                                continue;
                                            }
                                        }
                                        if (var11.field3608 == 1338) {
                                            if (var11.method1536(0, class35.field574) == null || class169.field2214 != 0 && class169.field2214 != 3 || class229.field3230 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                                continue;
                                            }
                                            int var29 = arg8 - var12;
                                            int var30 = arg9 - var13;
                                            int var31 = var11.field3645[var30];
                                            if (var29 < var31 || var29 > var11.field3477[var30] + var31) {
                                                continue;
                                            }
                                            int var32 = var29 - var11.field3578 / 2;
                                            int var33 = var30 - var11.field3604 / 2;
                                            int var34;
                                            if (class5.field48 == 4) {
                                                var34 = (int) class170.field2244 & 0x3FFF;
                                            } else {
                                                var34 = (int) class170.field2244 + class66.field942 & 0x3FFF;
                                            }
                                            int var35 = class190.field2644[var34];
                                            int var36 = class190.field2635[var34];
                                            if (class5.field48 != 4) {
                                                var35 = (class59.field858 + 256) * var35 >> 8;
                                                var36 = (class59.field858 + 256) * var36 >> 8;
                                            }
                                            int var37 = var32 * var36 + var33 * var35 >> 15;
                                            int var38 = var33 * var36 - var32 * var35 >> 15;
                                            int var39;
                                            int var40;
                                            if (class5.field48 == 4) {
                                                var39 = (class309.field4409 >> 7) + (var37 >> 2);
                                                var40 = (class146.field1915 >> 7) - (var38 >> 2);
                                            } else {
                                                int var41 = (class100.field1350.method130((byte) -113) - 1) * 64;
                                                var39 = (class100.field1350.field5284 - var41 >> 7) + (var37 >> 2);
                                                var40 = (class100.field1350.field5298 - var41 >> 7) - (var38 >> 2);
                                            }
                                            if (class95.field1307 && (class168.field2212 & 0x40) != 0) {
                                                class249 var42 = class358.method2355(class94.field1304, class300.field4307, (byte) -120);
                                                if (var42 == null) {
                                                    class312.method1951(2878);
                                                } else {
                                                    class169.method1048(class369.field5488, 1L, class191.field2667, -1, var39, " ->", var40, 50);
                                                }
                                                continue;
                                            }
                                            if (class126.field1679 == 1) {
                                                class169.method1048(-1, 1L, class34.field560, -1, var39, "", var40, 17);
                                            }
                                            class169.method1048(-1, 1L, class205.field2968, -1, var39, "", var40, 57);
                                            continue;
                                        }
                                        if (var11.field3608 == 1400) {
                                            class204.field2952 = var11;
                                            if (var21) {
                                                class60.field867 = true;
                                            }
                                            if (var23) {
                                                int var43 = (int) ((double) (class242.field3390 - var12 - var11.field3578 / 2) * 2.0D / (double) class76.field1027);
                                                int var44 = (int) (-((double) (class420.field6256 - var13 - var11.field3604 / 2) * 2.0D / (double) class76.field1027));
                                                int var45 = class169.field2222 + var43 + class76.field1041;
                                                int var46 = class133.field1778 + var44 + class76.field1044;
                                                class177 var47 = class358.method2346(3);
                                                if (var47 == null) {
                                                    continue;
                                                }
                                                int[] var48 = new int[3];
                                                var47.method1085(var45, var48, var46, (byte) -121);
                                                if (var48 != null) {
                                                    if (class1.field5[82] && class227.field3206 > 0) {
                                                        class110.method767(var48[0], var48[2], var48[1], 63);
                                                        continue;
                                                    }
                                                    class327.field4699 = true;
                                                    class171.field2251 = var48[0];
                                                    class384.field5735 = var48[1];
                                                    class403.field5989 = var48[2];
                                                }
                                                class19.field329 = 1;
                                                class358.field5244 = false;
                                                class139.field1858 = class34.field555;
                                                class58.field837 = class316.field4522;
                                                continue;
                                            }
                                            if (var22 && class19.field329 > 0) {
                                                if (class19.field329 == 1 && (class34.field555 != class139.field1858 || class58.field837 != class316.field4522)) {
                                                    class398.field5960 = class169.field2222;
                                                    class328.field4706 = class133.field1778;
                                                    class19.field329 = 2;
                                                }
                                                if (class19.field329 == 2) {
                                                    class358.field5244 = true;
                                                    class336.method2233(-1, (int) ((double) (class139.field1858 - class34.field555) * 2.0D / (double) class76.field1026) + class398.field5960);
                                                    class40.method309((byte) 99, class328.field4706 - (int) ((double) (class58.field837 - class316.field4522) * 2.0D / (double) class76.field1026));
                                                }
                                                continue;
                                            }
                                            if (class19.field329 > 0 && !class358.field5244) {
                                                if ((class288.field4183 == 1 || class246.method1512(108)) && class10.field97 > 2) {
                                                    class15.method99(-123, 2);
                                                } else if (class94.method575(17762)) {
                                                    class15.method99(-125, 1);
                                                }
                                            }
                                            class19.field329 = 0;
                                            continue;
                                        }
                                        if (var11.field3608 == 1401) {
                                            if (var22) {
                                                class17.method121(var11.field3578, 23, var11.field3604, class34.field555 - var12, class316.field4522 - var13);
                                            }
                                            continue;
                                        }
                                        if (var11.field3608 == 1402) {
                                            class392.method2564(-90, var11);
                                            continue;
                                        }
                                        if (var11.field3608 == 1406) {
                                            class313.method1954(var11, true, var12, var13);
                                            continue;
                                        }
                                    }
                                    if (!var11.field3547 && var23) {
                                        var11.field3547 = true;
                                        if (var11.field3480 != null) {
                                            class228 var49 = new class228();
                                            var49.field3216 = true;
                                            var49.field3210 = var11;
                                            var49.field3213 = class242.field3390 - var12;
                                            var49.field3219 = class420.field6256 - var13;
                                            var49.field3215 = var11.field3480;
                                            class130.field1743.method2660((byte) -123, var49);
                                        }
                                    }
                                    if (var11.field3547 && var22 && var11.field3485 != null) {
                                        class228 var50 = new class228();
                                        var50.field3216 = true;
                                        var50.field3210 = var11;
                                        var50.field3213 = class34.field555 - var12;
                                        var50.field3219 = class316.field4522 - var13;
                                        var50.field3215 = var11.field3485;
                                        class130.field1743.method2660((byte) -122, var50);
                                    }
                                    if (var11.field3547 && !var22) {
                                        var11.field3547 = false;
                                        if (var11.field3495 != null) {
                                            class228 var51 = new class228();
                                            var51.field3216 = true;
                                            var51.field3210 = var11;
                                            var51.field3213 = class34.field555 - var12;
                                            var51.field3219 = class316.field4522 - var13;
                                            var51.field3215 = var11.field3495;
                                            class231.field3260.method2660((byte) -125, var51);
                                        }
                                    }
                                    if (var22 && var11.field3562 != null) {
                                        class228 var52 = new class228();
                                        var52.field3216 = true;
                                        var52.field3210 = var11;
                                        var52.field3213 = class34.field555 - var12;
                                        var52.field3219 = class316.field4522 - var13;
                                        var52.field3215 = var11.field3562;
                                        class130.field1743.method2660((byte) -125, var52);
                                    }
                                    if (!var11.field3580 && var21) {
                                        var11.field3580 = true;
                                        if (var11.field3629 != null) {
                                            class228 var53 = new class228();
                                            var53.field3216 = true;
                                            var53.field3210 = var11;
                                            var53.field3213 = class34.field555 - var12;
                                            var53.field3219 = class316.field4522 - var13;
                                            var53.field3215 = var11.field3629;
                                            class130.field1743.method2660((byte) -126, var53);
                                        }
                                    }
                                    if (var11.field3580 && var21 && var11.field3613 != null) {
                                        class228 var54 = new class228();
                                        var54.field3216 = true;
                                        var54.field3210 = var11;
                                        var54.field3213 = class34.field555 - var12;
                                        var54.field3219 = class316.field4522 - var13;
                                        var54.field3215 = var11.field3613;
                                        class130.field1743.method2660((byte) -126, var54);
                                    }
                                    if (var11.field3580 && !var21) {
                                        var11.field3580 = false;
                                        if (var11.field3569 != null) {
                                            class228 var55 = new class228();
                                            var55.field3216 = true;
                                            var55.field3210 = var11;
                                            var55.field3213 = class34.field555 - var12;
                                            var55.field3219 = class316.field4522 - var13;
                                            var55.field3215 = var11.field3569;
                                            class231.field3260.method2660((byte) -122, var55);
                                        }
                                    }
                                    if (var11.field3483 != null) {
                                        class228 var56 = new class228();
                                        var56.field3210 = var11;
                                        var56.field3215 = var11.field3483;
                                        class134.field1785.method2660((byte) -128, var56);
                                    }
                                    if (var11.field3469 != null && class168.field2211 > var11.field3602) {
                                        if (var11.field3555 == null || class168.field2211 - var11.field3602 > 32) {
                                            class228 var61 = new class228();
                                            var61.field3210 = var11;
                                            var61.field3215 = var11.field3469;
                                            class130.field1743.method2660((byte) -120, var61);
                                        } else {
                                            label709: for (int var57 = var11.field3602; var57 < class168.field2211; var57++) {
                                                int var58 = class58.field838[var57 & 0x1F];
                                                for (int var59 = 0; var59 < var11.field3555.length; var59++) {
                                                    if (var11.field3555[var59] == var58) {
                                                        class228 var60 = new class228();
                                                        var60.field3210 = var11;
                                                        var60.field3215 = var11.field3469;
                                                        class130.field1743.method2660((byte) -125, var60);
                                                        break label709;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field3602 = class168.field2211;
                                    }
                                    if (var11.field3463 != null && class229.field3232 > var11.field3500) {
                                        if (var11.field3466 == null || class229.field3232 - var11.field3500 > 32) {
                                            class228 var66 = new class228();
                                            var66.field3210 = var11;
                                            var66.field3215 = var11.field3463;
                                            class130.field1743.method2660((byte) -128, var66);
                                        } else {
                                            label689: for (int var62 = var11.field3500; var62 < class229.field3232; var62++) {
                                                int var63 = class53.field794[var62 & 0x1F];
                                                for (int var64 = 0; var64 < var11.field3466.length; var64++) {
                                                    if (var11.field3466[var64] == var63) {
                                                        class228 var65 = new class228();
                                                        var65.field3210 = var11;
                                                        var65.field3215 = var11.field3463;
                                                        class130.field1743.method2660((byte) -127, var65);
                                                        break label689;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field3500 = class229.field3232;
                                    }
                                    if (var11.field3606 != null && class407.field6102 > var11.field3556) {
                                        if (var11.field3619 == null || class407.field6102 - var11.field3556 > 32) {
                                            class228 var71 = new class228();
                                            var71.field3210 = var11;
                                            var71.field3215 = var11.field3606;
                                            class130.field1743.method2660((byte) -123, var71);
                                        } else {
                                            label669: for (int var67 = var11.field3556; var67 < class407.field6102; var67++) {
                                                int var68 = class335.field4954[var67 & 0x1F];
                                                for (int var69 = 0; var69 < var11.field3619.length; var69++) {
                                                    if (var11.field3619[var69] == var68) {
                                                        class228 var70 = new class228();
                                                        var70.field3210 = var11;
                                                        var70.field3215 = var11.field3606;
                                                        class130.field1743.method2660((byte) -123, var70);
                                                        break label669;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field3556 = class407.field6102;
                                    }
                                    if (var11.field3621 != null && class33.field547 > var11.field3563) {
                                        if (var11.field3639 == null || class33.field547 - var11.field3563 > 32) {
                                            class228 var76 = new class228();
                                            var76.field3210 = var11;
                                            var76.field3215 = var11.field3621;
                                            class130.field1743.method2660((byte) -124, var76);
                                        } else {
                                            label649: for (int var72 = var11.field3563; var72 < class33.field547; var72++) {
                                                int var73 = class107.field1461[var72 & 0x1F];
                                                for (int var74 = 0; var74 < var11.field3639.length; var74++) {
                                                    if (var11.field3639[var74] == var73) {
                                                        class228 var75 = new class228();
                                                        var75.field3210 = var11;
                                                        var75.field3215 = var11.field3621;
                                                        class130.field1743.method2660((byte) -120, var75);
                                                        break label649;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field3563 = class33.field547;
                                    }
                                    if (var11.field3577 != null && class220.field3142 > var11.field3514) {
                                        if (var11.field3527 == null || class220.field3142 - var11.field3514 > 32) {
                                            class228 var81 = new class228();
                                            var81.field3210 = var11;
                                            var81.field3215 = var11.field3577;
                                            class130.field1743.method2660((byte) -127, var81);
                                        } else {
                                            label629: for (int var77 = var11.field3514; var77 < class220.field3142; var77++) {
                                                int var78 = class424.field6306[var77 & 0x1F];
                                                for (int var79 = 0; var79 < var11.field3527.length; var79++) {
                                                    if (var11.field3527[var79] == var78) {
                                                        class228 var80 = new class228();
                                                        var80.field3210 = var11;
                                                        var80.field3215 = var11.field3577;
                                                        class130.field1743.method2660((byte) -120, var80);
                                                        break label629;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field3514 = class220.field3142;
                                    }
                                    if (class402.field5974 > var11.field3532 && var11.field3511 != null) {
                                        class228 var82 = new class228();
                                        var82.field3210 = var11;
                                        var82.field3215 = var11.field3511;
                                        class130.field1743.method2660((byte) -122, var82);
                                    }
                                    if (class188.field2555 > var11.field3532 && var11.field3631 != null) {
                                        class228 var83 = new class228();
                                        var83.field3210 = var11;
                                        var83.field3215 = var11.field3631;
                                        class130.field1743.method2660((byte) -122, var83);
                                    }
                                    if (class126.field1675 > var11.field3532 && var11.field3650 != null) {
                                        class228 var84 = new class228();
                                        var84.field3210 = var11;
                                        var84.field3215 = var11.field3650;
                                        class130.field1743.method2660((byte) -127, var84);
                                    }
                                    if (class246.field3424 > var11.field3532 && var11.field3566 != null) {
                                        class228 var85 = new class228();
                                        var85.field3210 = var11;
                                        var85.field3215 = var11.field3566;
                                        class130.field1743.method2660((byte) -120, var85);
                                    }
                                    if (class1.field4 > var11.field3532 && var11.field3503 != null) {
                                        class228 var86 = new class228();
                                        var86.field3210 = var11;
                                        var86.field3215 = var11.field3503;
                                        class130.field1743.method2660((byte) -123, var86);
                                    }
                                    var11.field3532 = class381.field5717;
                                    if (var11.field3614 != null) {
                                        for (int var87 = 0; var87 < class187.field2544; var87++) {
                                            class228 var88 = new class228();
                                            var88.field3210 = var11;
                                            var88.field3226 = class344.field5046[var87];
                                            var88.field3217 = class240.field3384[var87];
                                            var88.field3215 = var11.field3614;
                                            class130.field1743.method2660((byte) -124, var88);
                                        }
                                    }
                                    if (class28.field495 && var11.field3515 != null) {
                                        class228 var89 = new class228();
                                        var89.field3210 = var11;
                                        var89.field3215 = var11.field3515;
                                        class130.field1743.method2660((byte) -126, var89);
                                    }
                                }
                                if (var11.field3637 == 5 && var11.field3620 != -1) {
                                    var11.method1541((byte) 119).method561(var11.field3604, -18995, class35.field574);
                                }
                            }
                            if (!var11.field3522 && class372.field5533 == null && class229.field3246 == null && !class229.field3230) {
                                if ((var11.field3615 >= 0 || var11.field3618 != 0) && class34.field555 >= var14 && class316.field4522 >= var15 && class34.field555 < var16 && class316.field4522 < var17) {
                                    if (var11.field3615 >= 0) {
                                        class59.field853 = arg0[var11.field3615];
                                    } else {
                                        class59.field853 = var11;
                                    }
                                }
                                if (var11.field3637 == 8 && class34.field555 >= var14 && class316.field4522 >= var15 && class34.field555 < var16 && class316.field4522 < var17) {
                                    class374.field5639 = var11;
                                }
                                if (var11.field3646 > var11.field3604) {
                                    class240.method1489((byte) -92, var13, class34.field555, var11, var11.field3604, var11.field3578 + var12, var11.field3646, class316.field4522);
                                }
                            }
                            class155.method998(arg2, var12, arg5, arg4, true, var13, arg3, var11);
                            if (var11.field3637 == 0) {
                                method1576(arg0, var11.field3622, var14, var15, var16, var17, var12 - var11.field3594, var13 - var11.field3582, arg8, arg9);
                                if (var11.field3493 != null) {
                                    method1576(var11.field3493, var11.field3622, var14, var15, var16, var17, var12 - var11.field3594, var13 - var11.field3582, arg8, arg9);
                                }
                                class158 var90 = (class158) class269.field3933.method954(-101, (long) var11.field3622);
                                if (var90 != null) {
                                    if (var90.field2074 == 0 && !class229.field3230 && var21 && !class381.field5720) {
                                        class235.method1435((byte) 51);
                                    }
                                    class205.method1300(var15, -91, var13, var14, var12, var17, arg9, var16, arg8, var90.field2075);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class155.method998(arg2, var12, arg5, arg4, true, var13, arg3, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1577() {
        int var0 = class409.field6126 ? class153.field2004 : class191.field2662 + class153.field2004;
        for (int var1 = -1; var1 < var0; var1++) {
            class18 var2;
            if (var1 < 0) {
                var2 = class100.field1350;
            } else if (var1 < class153.field2004) {
                var2 = class125.field1664[class66.field943[var1]];
            } else {
                var2 = class23.field408[class416.field6202[var1 - class153.field2004]];
            }
            if (var2.field248 >= 0) {
                int var3 = var2.method130((byte) -62);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field5284 & 0x7F) == 0 && (var2.field5298 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field5284 & 0x7F) == 64 && (var2.field5298 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class194 && var2.field308 != null && class50.field698 >= var2.field299 && class50.field698 < var2.field307) {
                    ((class194) var2).field2775 = false;
                }
                var2.field5297 = class139.method935(var2.field5298, -86, var2.field5284, class193.field2688);
                class84.method524(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1578(int arg0) {
        field3668++;
        method1558((byte) 0);
        class8.method65(true);
        class34.method280((byte) -117);
        class16.method110(false);
        class116.method812((byte) 41);
        class437.method2764(-29885);
        class227.method1412(93);
        class130.method885(64);
        class26.method240((byte) 18);
        class332.method2206(0);
        class300.method1901((byte) -61);
        class239.method1485((byte) 0);
        class372.method2456(95);
        class238.method1458(false);
        class63.method409((byte) 120);
        class425.method2727(520);
        class24.method217((byte) 102);
        class129.method882(-14754);
        class108.method764(arg0 + 36639);
        class138.method925(-109);
        class177.method1084(-1);
        class396.method2591((byte) 113);
        class91.method568((byte) -48);
        class146.method971(0);
        class249.method1537(3);
        class432.method2743(arg0 ^ 0xFFFFEF91);
        class194.method1221(arg0 ^ 0x1026);
        class143.method962((byte) 87);
        class408.method2650(0);
        class376.method2492(-14600);
        class311.method1939(0);
        class398.method2593((byte) -127);
        class345.method2301((byte) 111);
        class214.method1345((byte) 107);
        class367.method2423(arg0 ^ 0xFFFF9321);
        class103.method705((byte) -89);
        class15.method97(false);
        class18.method129((byte) 117);
        class213.method1325((byte) -19);
        class10.method75(arg0 ^ 0xFFFFEFA4);
        class370.method2439(10);
        class6.method50((byte) -80);
        class158.method1003((byte) 115);
        class185.method1151(arg0 ^ 0x598FA635);
        class449.method2816(18391);
        class288.method1820((byte) -53);
        class165.method1030(arg0 + 4252);
        class180.method1122(77);
        class95.method612(false);
        class337.method2239(-8657);
        class125.method859(-110);
        class403.method2612(74);
        class269.method1732(-16033);
        class45.method333((byte) 77);
        class393.method2569((byte) 55);
        class199.method1247((byte) -32);
        class128.method870(false);
        class275.method1755(199);
        class335.method2223(119);
        class236.method1446(117);
        class445.method2801(14);
        class285.method1809(arg0 + 28256);
        class271.method1738(1);
        class139.method937((byte) -66);
        class115.method799((byte) -110);
        class75.method459(true);
        class302.method1911(0);
        class134.method905((byte) 95);
        class404.method2624(0);
        class42.method316(-115);
        class262.method1646(arg0 + 4312);
        class318.method1977(25106);
        class284.method1803((byte) -15);
        class373.method2465(arg0 ^ 0xFFFFEFA5);
        class193.method1209(-25276);
        class261.method1636(0);
        class411.method2674(false);
        class152.method992((byte) -63);
        class295.method1880(123);
        class106.method730((byte) -58);
        class244.method1505((byte) -118);
        class315.method1965(2);
        class126.method865((byte) -65);
        class161.method1012(-128);
        class374.method2478((byte) -128);
        class137.method912(-124);
        class226.method1402(671288225);
        class383.method2517(arg0 ^ 0x1002);
        class159.method1006((byte) 4);
        class171.method1056(81);
        class100.method681((byte) 127);
        class410.method2667((byte) 64);
        class420.method2701((byte) 85);
        class105.method715();
        class394.method2576(7);
        class17.method118((byte) -26);
        class407.method2645(arg0 - 22423);
        class52.method360(-1);
        class391.method2559(false);
        class187.method1168((byte) 39);
        class307.method1926(64);
        class365.method2392();
        class76.method467();
        class77.method489(false);
        class419.method2698(-11532);
        class378.method2506();
        class168.method1045(12141);
        class80.method510(0);
        class369.method2434(0);
        class276.method1764(-151);
        class353.method2323((byte) -65);
        class175.method1071((byte) 116);
        class313.method1958(true);
        class405.method2640((byte) 66);
        class85.method530((byte) -56);
        class235.method1436(true);
        class291.method1867(arg0 + 4178);
        class340.method2251((byte) 39);
        class200.method1260(arg0 ^ 0xFFFFEFA5);
        class246.method1518((byte) -126);
        class66.method432(48);
        class258.method1623(1);
        class183.method1128((byte) 124);
        class333.method2213(false);
        class395.method2582(false);
        class7.method53(-109);
        class248.method1528(126);
        class53.method363(false);
        class41.method312(arg0 ^ 0xFFFFEFAF);
        class179.method1106(32335);
        class312.method1944(false);
        class94.method576((byte) 127);
        class232.method1432(2048);
        class205.method1292(false);
        class184.method1133((byte) -48);
        class64.method421(-128);
        class79.method499((byte) -79);
        class101.method685(true);
        class88.method547((byte) 61);
        class357.method2344(false);
        class142.method948(arg0 ^ 0xFFFFEFA6);
        class186.method1153();
        class87.method542((byte) 115);
        class348.method2316((byte) 9);
        class228.method1413(false);
        class384.method2521(0);
        class361.method2371(arg0 ^ 0xFFFFEFA5);
        class387.method2529(-22215);
        class433.method2745((byte) 26);
        class264.method1653(30262);
        class279.method1784();
        class170.method1053(69);
        class306.method1922((byte) 56);
        class413.method2676(-21);
        class381.method2511(7893);
        class60.method402((byte) -110);
        class349.method2317((byte) 80);
        class164.method1017(10191);
        class39.method303(1);
        class120.method835(false);
        class93.method574((byte) 94);
        class51.method353(6044);
        class274.method1753(-1);
        class363.method2384(-11003);
        class73.method454((byte) 112);
        class71.method445(32);
        class371.method2442((byte) -102);
        class28.method249(arg0 ^ 0xFFFFF7FF);
        class256.method1616(false);
        class166.method1035(95);
        class190.method1179((byte) 23);
        class65.method424(32);
        class390.method2546(65459);
        class423.method2722(false);
        class153.method994((byte) 55);
        class385.method2522();
        class434.method2754(0);
        class127.method866(false);
        class160.method1008((byte) 47);
        class23.method191(88);
        class392.method2566((byte) 117);
        class237.method1450(42);
        class327.method2012((byte) 64);
        class281.method1798(true);
        class114.method798(-128);
        class155.method996(false);
        class107.method740(-110);
        class37.method294(false);
        class316.method1967(0);
        class157.method1000(1);
        class417.method2693((byte) -126);
        class402.method2610(arg0 + 4187);
        class109.method765();
        class145.method970(98);
        class355.method2328(arg0 ^ 0xFFFFEFF5);
        class339.method2240((byte) -30);
        class409.method2662((byte) 38);
        class240.method1490((byte) 119);
        class70.method443((byte) -125);
        class162.method1013((byte) -117);
        class277.method1772(arg0 ^ arg0);
        class133.method901(-44);
        class400.method2600();
        class323.method1996(14230);
        class263.method1649(732);
        class72.method450((byte) -87);
        class117.method824(arg0 - 3447);
        class329.method2021(123);
        class31.method262(85);
        class242.method1494((byte) -119);
        class397.method2592();
        class422.method2716();
        class59.method399(arg0 ^ 0x1032);
        class308.method1930(-23369);
        class328.method2015(18000);
        class442.method2790(0);
        class231.method1428((byte) -65);
        class436.method2756(0);
        class324.method2000((byte) 86);
        class174.method1062(-31742);
        class375.method2481();
        class9.method72();
        class247.method1520((byte) -100);
        class212.method1310(false);
        class21.method182();
        class38.method295((byte) -128);
        class220.method1370((byte) -125);
        class282.method1802(64);
        class154.method995(arg0 ^ 0x1075);
        class278.method1778((byte) -40);
        class280.method1797(arg0 ^ 0x1066);
        class224.method1400((byte) 65);
        class54.method373(arg0 ^ 0xFFFFEFCB);
        class360.method2366((byte) 112);
        class58.method394(32);
        class416.method2688(false);
        class32.method275(-78);
        class301.method1907(arg0 + 4083);
        class86.method534(false);
        class292.method1871(arg0 + 4313);
        class208.method1308(-102);
        class123.method849((byte) -116);
        class19.method162(4214);
        class347.method2309(arg0 ^ 0xFFFFEFA5);
        class273.method1751((byte) 37);
        class309.method1935(true);
        class97.method638((byte) 21);
        class50.method350((byte) -20);
        class188.method1172(106);
        class320.method1985(4080);
        class336.method2230((byte) 21);
        class310.method1936((byte) 54);
        class229.method1421(arg0 - 14480);
        class27.method247(true);
        class29.method254(-2399);
        class424.method2726(false);
        class344.method2268(113);
        class446.method2804(120);
        class207.method1305(-97);
        class1.method3(28835);
        class293.method1878(false);
        class74.method457(arg0 + 4198);
        class192.method1195((byte) -79);
        class319.method1981(arg0 ^ 0x1022);
        class22.method188((byte) -113);
        class119.method832(20480);
        class215.method1351(arg0 ^ 0xFFFFEFDA);
        class343.method2264(85);
        class122.method843(1);
        class196.method1226(false);
        class49.method341(arg0 + 4189);
        class252.method1554(arg0 ^ 0x1011);
        class167.method1038(arg0 + 4187);
        class198.method1239(-30260);
        class176.method1074(false);
        class447.method2812(8);
        class11.method83((byte) -78);
        class69.method439(false);
        class314.method1963((byte) -9);
        class364.method2389(true);
        class444.method2798(arg0 + 4076);
        class197.method1232(42);
        class81.method511(arg0 + 4267);
        class82.method518((byte) -127);
        class366.method2402();
        class298.method1891();
        class35.method291((byte) -79);
        class189.method1176((byte) -124);
        class326.method2010(-1);
        class151.method986((byte) 115);
        class451.method2823(21521);
        class156.method999((byte) 41);
        class144.method963(47);
        class40.method310(true);
        class204.method1290((byte) -75);
        class30.method259(32731);
        class124.method851(arg0 + 4285);
        class191.method1187((byte) 83);
        class358.method2350((byte) 41);
        class104.method709(1);
        class272.method1741((byte) 112);
        class84.method525((byte) 48);
        class368.method2432(320);
        class132.method894(120);
        class169.method1050(89);
        class33.method277(-121);
        class452.method2825((byte) -121);
        class163.method1014(arg0 + 4187);
        class78.method491(arg0 ^ 0xFFFFEFA5);
        class219.method1360(18161);
        class234.method1434(-63);
        if (class255.field3741) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method1579() {
        for (int var0 = 0; var0 < class324.field4652; var0++) {
            int[] var1 = class313.field4477[var0];
            for (int var2 = 0; var2 < class336.field4964; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1580(int arg0, byte[] arg1) {
        field3683++;
        if (arg0 != 16) {
            method1575();
        }
        class265 var3 = new class265(arg1);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method1697(86);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    int[] var7 = class65.field921 = new int[6];
                    var7[0] = var3.method1685(8104);
                    var7[1] = var3.method1685(8104);
                    var7[2] = var3.method1685(class347.method2311(arg0, 8120));
                    var7[3] = var3.method1685(8104);
                    var7[4] = var3.method1685(8104);
                    var7[5] = var3.method1685(8104);
                }
            } while (var4 != 4);
            int var5 = var3.method1697(74);
            class145.field1904 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class145.field1904[var6] = var3.method1685(8104);
                if (class145.field1904[var6] == 65535) {
                    class145.field1904[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    private final void method1581(byte arg0) {
        if (!class248.field3460) {
            label227: while (true) {
                do {
                    if (!class301.method1906(-77)) {
                        break label227;
                    }
                } while (class157.field2066 != 's' && class157.field2066 != 'S');
                class248.field3460 = true;
            }
        }
        field3682++;
        if (class72.field986 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class55.method375(-3913);
            if (class436.field6404 == 0L) {
                class436.field6404 = var4;
            }
            if (var3 > 16384 && (var4 - class436.field6404) < 5000L) {
                if ((var4 - class59.field848) > 1000L) {
                    System.gc();
                    class59.field848 = var4;
                }
                class370.field5501 = 5;
                class228.field3225 = class411.field6153;
            } else {
                class228.field3225 = class451.field6573;
                class370.field5501 = 5;
                class72.field986 = 10;
            }
        } else if (class72.field986 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class119.field1605[var6] = class139.method936(false, class324.field4652, class336.field4964);
            }
            class370.field5501 = 10;
            class72.field986 = 20;
            class228.field3225 = class436.field6401;
        } else if (class72.field986 == 20) {
            if (class82.field1150 == null) {
                class82.field1150 = new class239(class97.field1331, class368.field5472);
            }
            if (class82.field1150.method1488((byte) -90)) {
                class185.field2509 = class134.method904(-118, 0, 1, true, false);
                class411.field6150 = class134.method904(-105, 1, 1, true, false);
                class180.field2387 = class134.method904(-88, 2, 1, true, false);
                class159.field2078 = class134.method904(-89, 3, 1, true, false);
                class258.field3764 = class134.method904(-124, 4, 1, true, false);
                class285.field4163 = class134.method904(-124, 5, 1, true, true);
                class328.field4711 = class134.method904(-108, 6, 1, false, true);
                class7.field70 = class134.method904(-85, 7, 1, true, false);
                class247.field3446 = class134.method904(-124, 8, 1, true, false);
                class252.field3656 = class134.method904(-103, 9, 1, true, false);
                class10.field94 = class134.method904(-115, 10, 1, true, false);
                class39.field632 = class134.method904(-121, 11, 1, true, false);
                class127.field1692 = class134.method904(-102, 12, 1, true, false);
                class208.field2987 = class134.method904(-120, 13, 1, true, false);
                class371.field5519 = class134.method904(-87, 14, 1, false, false);
                class302.field4336 = class134.method904(-96, 15, 1, true, false);
                class78.field1075 = class134.method904(-127, 16, 1, true, false);
                class207.field2986 = class134.method904(-80, 17, 1, true, false);
                class235.field3300 = class134.method904(-103, 18, 1, true, false);
                class215.field3080 = class134.method904(-105, 19, 1, true, false);
                class340.field5003 = class134.method904(-88, 20, 1, true, false);
                class324.field4655 = class134.method904(-106, 21, 1, true, false);
                class129.field1721 = class134.method904(-98, 22, 1, true, false);
                class300.field4299 = class134.method904(-93, 23, 1, true, true);
                class50.field693 = class134.method904(-120, 24, 1, true, false);
                class355.field5212 = class134.method904(-112, 25, 1, true, false);
                class446.field6496 = class134.method904(-126, 26, 1, true, true);
                class327.field4704 = class134.method904(-90, 27, 1, true, false);
                class51.field758 = class134.method904(-103, 28, 1, true, true);
                class228.field3225 = class191.field2666;
                class72.field986 = 30;
                class370.field5501 = 15;
            } else {
                class370.field5501 = 12;
                class228.field3225 = class295.field4258;
            }
        } else if (class72.field986 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class417.field6209[var8].method2445(0) * class335.field4956[var8] / 100;
            }
            if (var7 == 100) {
                class370.field5501 = 20;
                class228.field3225 = class138.field1831;
                class308.method1929(1, class247.field3446);
                class224.method1396(-2141602260, class247.field3446);
                class72.field986 = 40;
            } else {
                if (var7 != 0) {
                    class228.field3225 = class126.field1682 + var7 + "%";
                }
                class370.field5501 = 20;
            }
        } else if (class72.field986 == 40) {
            if (class51.field758.method1459(true)) {
                this.method1580(16, class51.field758.method1466(1, 124));
                class72.field986 = 50;
                class228.field3225 = class278.field4086;
                class370.field5501 = 25;
            } else {
                class228.field3225 = class137.field1811 + class51.field758.method1463(112) + "%";
                class370.field5501 = 25;
            }
        } else if (class72.field986 == 50) {
            class224.method1401((byte) -122, 2, class101.field1366, 22050);
            class323.field4643 = new class345();
            class323.field4643.method2291(128, (byte) -48, 9);
            class188.field2556 = class123.method847(class319.field4561, class361.field5285, 22050, (byte) 91, 0);
            class188.field2556.method1349(class323.field4643, -26391);
            class319.method1982(class323.field4643, class302.field4336, class371.field5519, class258.field3764, -34);
            field3672 = class123.method847(class319.field4561, class361.field5285, 2048, (byte) 91, 1);
            class405.field6092 = new class20();
            field3672.method1349(class405.field6092, -26391);
            class142.field1871 = new class367(22050, class29.field505);
            class445.field6485 = class328.field4711.method1467(126, "scape main");
            class72.field986 = 60;
            class370.field5501 = 30;
            class228.field3225 = class119.field1586;
        } else if (class72.field986 == 60) {
            int var9 = class39.method305(class208.field2987, (byte) -127, class247.field3446);
            int var10 = class262.method1645((byte) 21);
            if (var9 < var10) {
                class370.field5501 = 35;
                class228.field3225 = class151.field1979 + var9 * 100 / var10 + "%";
            } else {
                class370.field5501 = 35;
                class228.field3225 = class256.field3755;
                class72.field986 = 70;
            }
        } else if (class72.field986 == 70) {
            int var11 = class393.method2572(0, class247.field3446);
            int var12 = class75.method464(-96);
            if (var11 < var12) {
                class228.field3225 = class29.field506 + var11 * 100 / var12 + "%";
                class370.field5501 = 40;
            } else {
                class72.field986 = 80;
                class228.field3225 = class273.field4004;
                class370.field5501 = 40;
            }
        } else if (class72.field986 == 80) {
            if (class446.field6496.method1459(true)) {
                class364.field5327 = new class276(class446.field6496, class252.field3656, class247.field3446);
                class370.field5501 = 45;
                class72.field986 = 90;
                class228.field3225 = class280.field4121;
            } else {
                class228.field3225 = class197.field2811 + class446.field6496.method1463(108) + "%";
                class370.field5501 = 45;
            }
        } else if (class72.field986 == 90) {
            class72.field986 = 95;
            class228.field3225 = class282.field4139;
            class370.field5501 = 50;
        } else if (class72.field986 == 95) {
            if (class248.field3460) {
                class292.field4222 = 0;
                class161.field2107 = 1;
                class369.field5483 = 0;
                class215.field3082 = 0;
                class445.field6478 = 0;
            }
            class248.field3460 = true;
            class423.method2724(class361.field5285, (byte) -7);
            class203.method1283(120);
            class277.method1771(class215.field3082, (byte) 32, false);
            class370.field5501 = 55;
            class72.field986 = 100;
            class228.field3225 = class16.field186;
        } else if (class72.field986 == 100) {
            class244.method1504(class247.field3446, -22073, class208.field2987, class35.field574);
            class370.field5501 = 60;
            class228.field3225 = class311.field4446;
            class199.method1251(5, (byte) 80);
            class72.field986 = 110;
        } else if (class72.field986 == 110) {
            byte var13 = 0;
            class180.field2387.method1459(true);
            int var14 = var13 + class180.field2387.method1463(116);
            class78.field1075.method1459(true);
            int var15 = var14 + class78.field1075.method1463(124);
            class207.field2986.method1459(true);
            int var16 = var15 + class207.field2986.method1463(112);
            class235.field3300.method1459(true);
            int var17 = var16 + class235.field3300.method1463(125);
            class215.field3080.method1459(true);
            int var18 = var17 + class215.field3080.method1463(125);
            class340.field5003.method1459(true);
            int var19 = var18 + class340.field5003.method1463(119);
            class324.field4655.method1459(true);
            int var20 = var19 + class324.field4655.method1463(118);
            class129.field1721.method1459(true);
            int var21 = var20 + class129.field1721.method1463(117);
            class50.field693.method1459(true);
            int var22 = var21 + class50.field693.method1463(117);
            class355.field5212.method1459(true);
            int var23 = var22 + class355.field5212.method1463(112);
            class327.field4704.method1459(true);
            int var24 = var23 + class327.field4704.method1463(116);
            if (var24 < 1100) {
                class228.field3225 = class434.field6393 + var24 / 11 + "%";
                class370.field5501 = 65;
            } else {
                class311.method1940(class180.field2387, true);
                class125.method857(21187, class180.field2387);
                class395.method2584(class180.field2387, 2);
                class390.method2549(class180.field2387, -83, class7.field70);
                class226.method1405(2, class7.field70, true, class78.field1075);
                class144.method966(class7.field70, class235.field3300, -2437, true);
                class75.method460(class215.field3080, class7.field70, (byte) -55, true);
                class329.method2024((byte) 8, class180.field2387);
                class228.method1416(true, class185.field2509, class411.field6150, class340.field5003);
                class417.method2692(true, class180.field2387);
                class190.method1183(class324.field4655, class7.field70, (byte) 113);
                class228.method1414(class129.field1721, -109);
                class327.method2013(class180.field2387, (byte) 124);
                class7.method54(class7.field70, class159.field2078, class208.field2987, class247.field3446, (byte) 120);
                class434.method2753(-98, class180.field2387);
                class387.method2526((byte) 87, class207.field2986);
                class336.method2229(class355.field5212, 1, class50.field693, new class41());
                class284.method1807(class50.field693, false, class355.field5212);
                method1566((byte) 84, class180.field2387);
                class447.method2813(true, class180.field2387);
                class87.method541(class180.field2387, false);
                class132.method896((byte) 122, class180.field2387, class247.field3446);
                class336.method2228(class180.field2387, -21443, class247.field3446);
                class220.method1374(class180.field2387, 6193);
                class192.method1192(36, class247.field3446, class180.field2387);
                class138.method919(class180.field2387, -18066);
                class38.method298(-93, class180.field2387);
                class228.field3225 = class376.field5682;
                class370.field5501 = 65;
                class26.method233(-117);
                class72.field986 = 120;
            }
        } else if (class72.field986 == 120) {
            int var25 = class242.method1493(3160, class247.field3446);
            int var26 = class100.method676((byte) -107);
            if (var26 > var25) {
                class228.field3225 = class93.field1279 + var25 * 100 / var26 + "%";
                class370.field5501 = 70;
            } else {
                class100.method675(class35.field574, -31889, class247.field3446);
                class124.method853((byte) -31, class152.field1983);
                class370.field5501 = 70;
                class228.field3225 = class167.field2191;
                class72.field986 = 130;
            }
        } else if (class72.field986 == 130) {
            class71.field973 = new class227();
            class361.field5285.method25((byte) 107, class71.field973, 10);
            class370.field5501 = 75;
            class72.field986 = 140;
            class228.field3225 = class6.field59;
        } else if (class72.field986 != 140) {
            if (arg0 > -39) {
                field3669 = 73;
            }
            if (class72.field986 == 150) {
                if (!class159.field2078.method1459(true)) {
                    class228.field3225 = class185.field2521 + class159.field2078.method1463(114) * 3 / 4 + "%";
                    class370.field5501 = 85;
                } else if (!class127.field1692.method1459(true)) {
                    class228.field3225 = class185.field2521 + (class127.field1692.method1463(122) / 10 + 75) + "%";
                    class370.field5501 = 85;
                } else if (!class208.field2987.method1459(true)) {
                    class228.field3225 = class185.field2521 + (class208.field2987.method1463(124) / 20 + 85) + "%";
                    class370.field5501 = 85;
                } else if (class300.field4299.method1453((byte) 58, "details")) {
                    class76.method472(class300.field4299);
                    class143.method960(class327.field4704, 0);
                    class19.method149(class7.field70, class364.field5327, (byte) 125);
                    class72.field986 = 160;
                    class228.field3225 = class154.field2020;
                    class370.field5501 = 85;
                } else {
                    class228.field3225 = class185.field2521 + (class300.field4299.method1470("details", 0) / 10 + 90) + "%";
                    class370.field5501 = 85;
                }
            } else if (class72.field986 == 160) {
                int var28 = class133.method900(61);
                if (var28 == -1) {
                    class370.field5501 = 90;
                    class228.field3225 = class51.field757;
                } else if (var28 == 7 || var28 == 9) {
                    this.method1608(1, "worldlistfull");
                    class199.method1251(1000, (byte) -124);
                } else if (class349.field5180) {
                    class228.field3225 = class329.field4728;
                    class72.field986 = 170;
                    class370.field5501 = 90;
                } else {
                    this.method1608(1, "worldlistio_" + var28);
                    class199.method1251(1000, (byte) -121);
                }
            } else if (class72.field986 == 170) {
                class174.field2269 = new String[class273.field4021];
                class320.field4575 = new int[class191.field2664];
                class87.field1215 = new boolean[class191.field2664];
                for (int var29 = 0; var29 < class191.field2664; var29++) {
                    if (class57.method385(var29, -39).field912 == 0) {
                        class87.field1215[var29] = true;
                        class7.field65++;
                    }
                    class320.field4575[var29] = -1;
                }
                class35.method289((byte) 126);
                class41.field650 = class159.field2078.method1467(127, "loginscreen");
                class285.field4163.method1456(-1, true, false);
                class328.field4711.method1456(-1, true, true);
                class247.field3446.method1456(-1, true, true);
                class208.field2987.method1456(-1, true, true);
                class10.field94.method1456(-1, true, true);
                class159.field2078.method1456(-1, true, true);
                class180.field2387.field3348 = 2;
                class383.field5731 = true;
                class207.field2986.field3348 = 2;
                class78.field1075.field3348 = 2;
                class235.field3300.field3348 = 2;
                class215.field3080.field3348 = 2;
                class340.field5003.field3348 = 2;
                class324.field4655.field3348 = 2;
                class66.method430(class161.field2107, -1, -1, false, true);
                class72.field986 = 180;
                class370.field5501 = 95;
                class228.field3225 = class134.field1790;
            } else if (class72.field986 == 180) {
                class398.method2596(true, (byte) 127);
            }
        } else if (class10.field94.method1471(-1, "", "huffman")) {
            class88 var27 = new class88(class10.field94.method1478("huffman", "", (byte) 108));
            class292.method1876(var27, true);
            class370.field5501 = 80;
            class72.field986 = 150;
            class228.field3225 = class281.field4129;
        } else {
            class228.field3225 = class86.field1200 + "0%";
            class370.field5501 = 80;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method1582(byte arg0) {
        field3673++;
        if (class137.field1815 == 1000) {
            return;
        }
        long var2 = class151.method989(-5) / 1000000L - class308.field4397;
        if (arg0 != -88) {
            method1574((Object) null, -45, (class2) null);
        }
        class308.field4397 = class151.method989(-5) / 1000000L;
        boolean var4 = class17.method120(-11354);
        if (var4 && class164.field2139 && class188.field2556 != null) {
            class188.field2556.method1340((byte) -117);
        }
        if (class137.field1815 == 30 || class137.field1815 == 10) {
            if (class154.field2021 != 0L && class55.method375(-3913) > class154.field2021) {
                class66.method430(class6.method51(-127), class401.field5968, class284.field4158, false, true);
            } else if (class35.field574.method2172() && class220.field3134) {
                class179.method1107((byte) -77);
            }
        }
        if (class106.field1428 == null) {
            Container var5;
            if (class238.field3346 == null) {
                var5 = class361.field5285.field29;
            } else {
                var5 = class238.field3346;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class238.field3346 == var5) {
                Insets var8 = class238.field3346.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class100.field1338 != var6 || class384.field5739 != var7) {
                if (class35.field574 == null || class35.field574.method2073()) {
                    class425.method2733((byte) -128);
                } else {
                    class384.field5739 = var7;
                    class100.field1338 = var6;
                }
                class154.field2021 = class55.method375(-3913) + 500L;
            }
        }
        if (class106.field1428 != null && !class123.field1648 && (class137.field1815 == 30 || class137.field1815 == 10)) {
            class66.method430(class161.field2107, -1, -1, false, true);
        }
        boolean var9 = false;
        if (class395.field5927) {
            class395.field5927 = false;
            var9 = true;
        }
        if (var9) {
            class220.method1364((byte) 106);
        }
        if (class35.field574 != null && class35.field574.method2183() || class6.method51(-47) != 1) {
            class176.method1075((byte) -125);
        }
        if (class137.field1815 == 0) {
            class404.method2631(class190.field2598[class69.field953], class242.field3397[class69.field953], class58.field846[class69.field953], class370.field5501, var9, class228.field3225, arg0 ^ 0xFFFFFFA8);
        } else if (class137.field1815 == 5) {
            class276.method1761(class58.field846[class69.field953].getRGB(), (byte) 127, class232.field3275, var9 | class35.field574.method2183(), class190.field2598[class69.field953].getRGB(), class35.field574, class242.field3397[class69.field953].getRGB());
        } else if (class137.field1815 == 10) {
            class391.method2556((byte) 127);
        } else if (class137.field1815 == 25 || class137.field1815 == 28) {
            if (class413.field6174 == 1) {
                if (class130.field1749 > class417.field6214) {
                    class417.field6214 = class130.field1749;
                }
                int var10 = (class417.field6214 - class130.field1749) * 50 / class417.field6214;
                class132.method898(true, -29854, class284.field4157 + "<br>(" + var10 + "%)", class311.field4456);
            } else if (class413.field6174 == 2) {
                if (class236.field3319 < class72.field987) {
                    class236.field3319 = class72.field987;
                }
                int var11 = (class236.field3319 - class72.field987) * 50 / class236.field3319 + 50;
                class132.method898(true, -29854, class284.field4157 + "<br>(" + var11 + "%)", class311.field4456);
            } else {
                class132.method898(true, -29854, class284.field4157, class311.field4456);
            }
        } else if (class137.field1815 == 30) {
            class22.method187(0, var2);
        } else if (class137.field1815 == 40) {
            class132.method898(true, -29854, class52.field760 + "<br>" + class391.field5860, class311.field4456);
        }
        if (class224.field3171 == 3) {
            for (int var12 = 0; var12 < class442.field6463; var12++) {
                Rectangle var13 = class94.field1303[var12];
                if (class234.field3286[var12]) {
                    class35.field574.method2766(var13.width, var13.height, var13.x, var13.y, -1996553985, 109);
                } else if (class159.field2084[var12]) {
                    class35.field574.method2766(var13.width, var13.height, var13.x, var13.y, -1996554240, arg0 - 26);
                }
            }
        }
        if (class357.method2345(arg0 ^ 0xFFFFFFA8)) {
            class179.method1101(class35.field574, arg0 ^ 0x4D34);
        }
        if ((class137.field1815 == 30 || class137.field1815 == 10) && class224.field3171 == 0 && class6.method51(-41) == 1 && !var9 && class2.field30.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class442.field6463; var15++) {
                if (class159.field2084[var15]) {
                    class159.field2084[var15] = false;
                    class278.field4088[var14++] = class94.field1303[var15];
                }
            }
            class35.field574.method2113(class278.field4088, var14);
        } else if (class137.field1815 != 0) {
            class35.field574.method2067();
            for (int var16 = 0; var16 < class442.field6463; var16++) {
                class159.field2084[var16] = false;
            }
        }
        if (class383.field5731) {
            class59.method397(74);
        }
        if (class248.field3460 && class137.field1815 == 10 && class404.field6020 != -1) {
            class248.field3460 = false;
            class423.method2724(class361.field5285, (byte) -7);
        }
    }
}
