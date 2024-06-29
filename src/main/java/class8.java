import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 extends class59 {

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[J")
    private long[] field287 = new long[10];

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lad;")
    private static class5 field285 = class88.method674("Welcome to RuneScape", 54);

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Lad;")
    private static class5 field290 = class88.method674("Attack", -73);

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "Lad;")
    public static class5 field295 = field285;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "Lad;")
    public static class5 field292 = field290;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
    private long field280;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "J")
    public static long field293;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lsb;")
    public static class110 field289;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lib;")
    public static class50 field275;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V", line = 3)
    public static final void method89(byte arg0) {
        if (class12.field373 > 1) {
            class12.field373--;
        }
        if (class134.field3252 > 0) {
            class134.field3252--;
        }
        field291++;
        if (class12.field370) {
            class12.field370 = false;
            class134.method1033(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class60.method494(-1); var1++) {
        }
        if (class20.field524 != 30 && class20.field524 != 35) {
            return;
        }
        if (class116.field2882 && class20.field524 == 30) {
            class90.field2126 = 0;
            class54.field1346 = 0;
            while (class109.method884((byte) -80)) {
            }
            for (int var2 = 0; var2 < class43.field1109.length; var2++) {
                class43.field1109[var2] = false;
            }
        }
        class87.method659(true, 174, class5.field163);
        Object var3 = class32.field777.field1265;
        synchronized (class32.field777.field1265) {
            if (!class12.field378) {
                class32.field777.field1275 = 0;
            } else if (class90.field2126 != 0 || class32.field777.field1275 >= 40) {
                class73.field1755++;
                int var4 = 0;
                class5.field163.method209(236, 10);
                class5.field163.method307(-388270616, 0);
                int var5 = class5.field163.field957;
                for (int var6 = 0; var6 < class32.field777.field1275 && class5.field163.field957 - var5 < 240; var6++) {
                    int var7 = class32.field777.field1274[var6];
                    int var8 = class32.field777.field1272[var6];
                    var4++;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class32.field777.field1274[var6] == -1 && class32.field777.field1272[var6] == -1) {
                        var9 = 524287;
                        var7 = -1;
                        var8 = -1;
                    }
                    if (class6.field223 != var8 || class75.field1797 != var7) {
                        int var10 = var8 - class6.field223;
                        class6.field223 = var8;
                        int var11 = var7 - class75.field1797;
                        class75.field1797 = var7;
                        if (class35.field880 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class5.field163.method339((var10 << 6) + (class35.field880 << 12) + var11, true);
                            class35.field880 = 0;
                        } else if (class35.field880 < 8) {
                            class5.field163.method325(255, (class35.field880 << 19) + var9 + 8388608);
                            class35.field880 = 0;
                        } else {
                            class5.field163.method308((class35.field880 << 19) + var9 - 1073741824, (byte) 77);
                            class35.field880 = 0;
                        }
                    } else if (class35.field880 < 2047) {
                        class35.field880++;
                    }
                }
                class5.field163.method321(false, class5.field163.field957 - var5);
                if (var4 >= class32.field777.field1275) {
                    class32.field777.field1275 = 0;
                } else {
                    class32.field777.field1275 -= var4;
                    for (int var12 = 0; var12 < class32.field777.field1275; var12++) {
                        class32.field777.field1272[var12] = class32.field777.field1272[var4 + var12];
                        class32.field777.field1274[var12] = class32.field777.field1274[var4 + var12];
                    }
                }
            }
        }
        if (class90.field2126 != 0) {
            class19.field519++;
            int var13 = class104.field2524;
            int var14 = class4.field124;
            byte var15 = 0;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            if (class90.field2126 == 2) {
                var15 = 1;
            }
            long var16 = (class109.field2738 - class102.field2498) / 50L;
            if (var16 > 4095L) {
                var16 = 4095L;
            }
            int var18 = (int) var16;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 502) {
                var13 = 502;
            }
            int var19 = var13 * 765 + var14;
            class102.field2498 = class109.field2738;
            class5.field163.method209(62, 10);
            class5.field163.method317((var15 << 19) + (var18 << 20) + var19, 0);
        }
        if (class43.field1081 > 0) {
            class43.field1081--;
        }
        if (class43.field1109[96] || class43.field1109[97] || class43.field1109[98] || class43.field1109[99]) {
            class53.field1333 = true;
        }
        if (class53.field1333 && class43.field1081 <= 0) {
            class43.field1081 = 20;
            class47.field1226++;
            class53.field1333 = false;
            class5.field163.method209(118, 10);
            class5.field163.method339(class131.field3177, true);
            class5.field163.method309(579867304, class69.field1643);
        }
        if (class77.field1811 && !class112.field2803) {
            class89.field2091++;
            class112.field2803 = true;
            class5.field163.method209(4, 10);
            class5.field163.method307(-388270616, 1);
        }
        if (!class77.field1811 && class112.field2803) {
            class89.field2091++;
            class112.field2803 = false;
            class5.field163.method209(4, 10);
            class5.field163.method307(-388270616, 0);
        }
        class121.method954(12570);
        if (class20.field524 != 30 && class20.field524 != 35) {
            return;
        }
        class108.method878(125);
        class20.method161((byte) 124);
        class1.field3++;
        if (class1.field3 > 750) {
            class134.method1033(40);
            return;
        }
        class32.method259((byte) 72);
        class86.method656(-23957);
        class59.method484((byte) 54);
        class98.field2382++;
        if (class19.field520 != 0) {
            class69.field1638 += 20;
            if (class69.field1638 >= 400) {
                class19.field520 = 0;
            }
        }
        if (class22.field570 != 0) {
            class82.field1929++;
            if (class82.field1929 >= 15) {
                if (class22.field570 == 3) {
                    class99.field2384 = true;
                }
                if (class22.field570 == 2) {
                    class43.field1086 = true;
                }
                class22.field570 = 0;
            }
        }
        if (class13.field383 != 0) {
            class43.field1084++;
            if (class7.field266 + 5 < class22.field564 || class7.field266 - 5 > class22.field564 || class91.field2131 > class91.field2157 + 5 || class91.field2157 - 5 > class91.field2131) {
                class129.field3132 = true;
            }
            if (class54.field1346 == 0) {
                if (class13.field383 == 2) {
                    class43.field1086 = true;
                }
                if (class13.field383 == 3) {
                    class99.field2384 = true;
                }
                class13.field383 = 0;
                if (class129.field3132 && class43.field1084 >= 5) {
                    class69.field1600 = -1;
                    class79.method618(0);
                    if (class89.field2111 == class69.field1600 && class59.field1447 != class34.field866) {
                        class20.field532++;
                        byte var20 = 0;
                        class105 var21 = class52.method435(class89.field2111, false);
                        if (class110.field2771 == 1 && var21.field2558 == 206) {
                            var20 = 1;
                        }
                        if (var21.field2620[class34.field866] <= 0) {
                            var20 = 0;
                        }
                        if (var21.field2582) {
                            int var22 = class34.field866;
                            int var23 = class59.field1447;
                            var21.field2620[var22] = var21.field2620[var23];
                            var21.field2609[var22] = var21.field2609[var23];
                            var21.field2620[var23] = -1;
                            var21.field2609[var23] = 0;
                        } else if (var20 == 1) {
                            int var24 = class59.field1447;
                            int var25 = class34.field866;
                            while (var24 != var25) {
                                if (var24 > var25) {
                                    var21.method836(-80, var24 - 1, var24);
                                    var24--;
                                } else if (var25 > var24) {
                                    var21.method836(-58, var24 + 1, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var21.method836(-64, class34.field866, class59.field1447);
                        }
                        class5.field163.method209(152, 10);
                        class5.field163.method319(-22303, var20);
                        class5.field163.method334(99, class89.field2111);
                        class5.field163.method339(class59.field1447, true);
                        class5.field163.method341(class34.field866, 126);
                    }
                } else if ((class34.field858 == 1 || class75.method593(true, class4.field145 - 1)) && class4.field145 > 2) {
                    class19.method157((byte) 88);
                } else if (class4.field145 > 0) {
                    class69.method545(142, class4.field145 - 1);
                }
                class82.field1929 = 10;
                class90.field2126 = 0;
            }
        }
        if (class97.field2320 != -1) {
            int var26 = class97.field2309;
            int var27 = class97.field2320;
            boolean var28 = class129.method996((byte) 117, var26, 0, true, class82.field1932.field49[0], 0, 0, 0, var27, class82.field1932.field89[0], 0, 0);
            if (var28) {
                class69.field1638 = 0;
                class19.field520 = 1;
                class54.field1364 = class104.field2524;
                class61.field1511 = class4.field124;
            }
            class97.field2320 = -1;
        }
        byte var29 = 34;
        if (class90.field2126 == 1 && class33.field817 != null) {
            class99.field2384 = true;
            class33.field817 = null;
            class90.field2126 = 0;
        }
        class17.method134(124);
        if (class69.field1626 == -1) {
            class6.method81(124);
            class27.method228(false);
            class78.method602(false);
        }
        if (class54.field1346 == 1 || class90.field2126 == 1) {
            field281++;
        }
        if (class53.field1334 != -1) {
            class74.method590(class53.field1334, 5, 338, 4, var29, 516, 4);
        }
        if (class10.field333 != -1) {
            class74.method590(class10.field333, 125, 466, 553, var29, 743, 205);
        } else if (class14.field408[class81.field1913] != -1) {
            class74.method590(class14.field408[class81.field1913], -13, 466, 553, var29, 743, 205);
        }
        if (class6.field225 != -1) {
            class74.method590(class6.field225, 0, 453, 17, var29, 496, 357);
        } else if (class90.field2124 != -1) {
            class74.method590(class90.field2124, -104, 453, 17, var29, 496, 357);
        }
        if (class53.field1334 != -1) {
            class74.method590(class53.field1334, 124, 338, 4, ~var29, 516, 4);
        }
        if (class10.field333 != -1) {
            class74.method590(class10.field333, -85, 466, 553, ~var29, 743, 205);
        } else if (class14.field408[class81.field1913] != -1) {
            class74.method590(class14.field408[class81.field1913], 124, 466, 553, ~var29, 743, 205);
        }
        if (class6.field225 != -1) {
            class74.method590(class6.field225, -29, 453, 17, ~var29, 496, 357);
        } else if (class90.field2124 != -1) {
            class74.method590(class90.field2124, 127, 453, 17, ~var29, 496, 357);
        }
        if (class128.field3073 == -1 && class129.field3130 == -1 && class13.field379 == -1) {
            if (class95.field2277 > 0) {
                class95.field2277--;
            }
        } else if (class109.field2743 > class95.field2277) {
            class95.field2277++;
            if (class95.field2277 == class109.field2743) {
                if (class128.field3073 != -1) {
                    class99.field2384 = true;
                }
                if (class129.field3130 != -1) {
                    class43.field1086 = true;
                }
            }
        }
        class98.method791(113);
        if (class120.field2983) {
            class129.method994(false);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class69.field1625[var30]++;
        }
        class69.method540(163);
        int var31 = class101.method814(-105);
        int var32 = class86.method650(10849);
        if (var31 > 4500 && var32 > 4500) {
            class36.field909++;
            class134.field3252 = 250;
            class92.method701((byte) -109, 4000);
            class5.field163.method209(20, 10);
        }
        class46.field1204++;
        class92.field2205++;
        if (class92.field2205 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x4) == 4) {
                class75.field1794 += class98.field2372;
            }
            class92.field2205 = 0;
            if ((var33 & 0x1) == 1) {
                class19.field521 += class99.field2400;
            }
            if ((var33 & 0x2) == 2) {
                class18.field478 += class40.field1042;
            }
        }
        class47.field1236++;
        if (class18.field478 < -55) {
            class40.field1042 = 2;
        }
        if (class47.field1236 > 500) {
            class47.field1236 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class102.field2476 += class20.field540;
            }
            if ((var34 & 0x1) == 1) {
                class133.field3220 += class110.field2760;
            }
        }
        if (class19.field521 < -50) {
            class99.field2400 = 2;
        }
        if (class133.field3220 < -60) {
            class110.field2760 = 2;
        }
        if (class75.field1794 < -40) {
            class98.field2372 = 1;
        }
        if (class18.field478 > 55) {
            class40.field1042 = -2;
        }
        if (class133.field3220 > 60) {
            class110.field2760 = -2;
        }
        if (class19.field521 > 50) {
            class99.field2400 = -2;
        }
        if (class102.field2476 < -20) {
            class20.field540 = 1;
        }
        if (class75.field1794 > 40) {
            class98.field2372 = -1;
        }
        if (class102.field2476 > 10) {
            class20.field540 = -1;
        }
        if (class46.field1204 > 50) {
            class86.field1980++;
            class5.field163.method209(102, 10);
        }
        try {
            if (class59.field1455 != null && class5.field163.field957 > 0) {
                class59.field1455.method349(0, -1, class5.field163.field957, class5.field163.field974);
                class46.field1204 = 0;
                class5.field163.field957 = 0;
            }
            int var35 = -47 % ((5 - arg0) / 60);
        } catch (IOException var36) {
            class134.method1033(40);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 622)
    public final void method90(byte arg0) {
        field294++;
        int var2 = 0;
        int var3 = -43 / ((-arg0 - 7) / 49);
        while (var2 < 10) {
            this.field287[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 647)
    public final void method91(int arg0) {
        this.field278 = 0;
        field274++;
        this.field296 = 256;
        this.field282 = arg0;
        this.field280 = class95.method728(128);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field287[var2] = this.field280;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI)I", line = 670)
    public final int method92(int arg0, boolean arg1, int arg2) {
        field277++;
        if (arg1) {
            this.field297 = 81;
        }
        int var4 = this.field296;
        int var5 = this.field282;
        this.field296 = 300;
        this.field282 = 1;
        this.field280 = class95.method728(128);
        if (this.field287[this.field297] == 0L) {
            this.field282 = var5;
            this.field296 = var4;
        } else if (this.field280 > this.field287[this.field297]) {
            this.field296 = (int) ((long) (arg2 * 2560) / (this.field280 - this.field287[this.field297]));
        }
        if (this.field296 < 25) {
            this.field296 = 25;
        }
        if (this.field296 > 256) {
            this.field296 = 256;
            this.field282 = (int) ((long) arg2 - (this.field280 - this.field287[this.field297]) / 10L);
        }
        if (this.field282 > arg2) {
            this.field282 = arg2;
        }
        this.field287[this.field297] = this.field280;
        this.field297 = (this.field297 + 1) % 10;
        if (this.field282 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field287[var6] != 0L) {
                    this.field287[var6] += this.field282;
                }
            }
        }
        if (this.field282 < arg0) {
            this.field282 = arg0;
        }
        class121.method958((long) this.field282, (byte) 119);
        int var7 = 0;
        while (this.field278 < 256) {
            var7++;
            this.field278 += this.field296;
        }
        this.field278 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB[BIII[Ljd;I)V", line = 754)
    public static final void method93(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6, int arg7, class58[] arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg8[arg5].field1418[arg7 + var10][arg2 + var15] = class104.method832(arg8[arg5].field1418[arg7 + var10][arg2 + var15], -16777217);
                }
            }
        }
        class39 var11 = new class39(arg4);
        field283++;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && var13 >= arg9 && var13 < arg9 + 8 && arg0 <= var14 && var14 < arg0 + 8) {
                        class32.method257(0, arg5, (byte) -102, arg6, var11, class42.method354((byte) 110, var13 & 0x7, var14 & 0x7, arg6) + arg2, class36.method278(7, arg6, var14 & 0x7, var13 & 0x7) + arg7, 0);
                    } else {
                        class32.method257(0, 0, (byte) -44, 0, var11, -1, -1, 0);
                    }
                }
            }
        }
        if (arg3 > -72) {
            field288 = 20;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 838)
    public static void method94(int arg0) {
        field275 = null;
        field285 = null;
        field292 = null;
        int var1 = -14 / ((arg0 + 45) / 35);
        field290 = null;
        field295 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLaa;)Z", line = 855)
    public static final boolean method95(int arg0, boolean arg1, class2 arg2) {
        class9.field299 = arg0;
        field276++;
        try {
            field275 = (class50) Class.forName("sc").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            class57 var3 = arg2.method7(arg0 ^ 0x10);
            if (var3 != null) {
                field275 = new class37(arg2, var3);
                return true;
            } else if (arg1) {
                field275 = new class131(arg2);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)I", line = 888)
    public static final int method96(byte arg0) {
        int var1 = 3;
        if (arg0 < 102) {
            field293 = 112L;
        }
        if (class128.field3079 < 310) {
            int var2 = class135.field3255 >> 7;
            int var3 = class9.field308 >> 7;
            if ((class12.field371[class54.field1344][var2][var3] & 0x4) != 0) {
                var1 = class54.field1344;
            }
            int var4 = class82.field1932.field112 >> 7;
            int var5 = class82.field1932.field120 >> 7;
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            int var7;
            if (var3 < var5) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var7 >= var6) {
                int var8 = 32768;
                int var9 = var6 * 65536 / var7;
                while (var3 != var5) {
                    var8 += var9;
                    if (var5 > var3) {
                        var3++;
                    } else if (var5 < var3) {
                        var3--;
                    }
                    if ((class12.field371[class54.field1344][var2][var3] & 0x4) != 0) {
                        var1 = class54.field1344;
                    }
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class12.field371[class54.field1344][var2][var3] & 0x4) != 0) {
                            var1 = class54.field1344;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var4) {
                    var11 += var10;
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class12.field371[class54.field1344][var2][var3] & 0x4) != 0) {
                        var1 = class54.field1344;
                    }
                    if (var11 >= 65536) {
                        if (var5 > var3) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class12.field371[class54.field1344][var2][var3] & 0x4) != 0) {
                            var1 = class54.field1344;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        field284++;
        if ((class12.field371[class54.field1344][class82.field1932.field112 >> 7][class82.field1932.field120 >> 7] & 0x4) != 0) {
            var1 = class54.field1344;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 1033)
    public class8() {
        this.method91(1);
    }
}
