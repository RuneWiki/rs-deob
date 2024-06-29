import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class271 {

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static volatile int field3936 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
    public static final int method1862(int arg0, byte arg1) {
        field3934++;
        if (arg1 != -111) {
            field3936 = -100;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3938++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class219.field2904 - class143.field1956) * var8 / arg5 + class143.field1956;
        int var10 = arg1 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class117.field1644[var11] * -var10 >> 15;
            var15 = class117.field1636[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class117.field1644[var12] * var15 >> 15;
            var15 = class117.field1636[var12] * var15 >> 15;
        }
        class5.field66 = arg3;
        class415.field6101 = arg0;
        class179.field2371 = arg6 - var15;
        class201.field2667 = arg4 - var14;
        class400.field5971 = arg7 - var13;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZZLmj;)V")
    public static final void method1864(boolean arg0, boolean arg1, boolean arg2, class169 arg3) {
        if (!arg0) {
            method1864(true, true, false, (class169) null);
        }
        field3935++;
        int var4 = arg3.field2275;
        int var5 = (int) arg3.field640;
        arg3.method322(11);
        if (arg2) {
            class373.method2413(var4, 1);
        }
        class230.method1384(-24225, var4);
        class394 var6 = class196.method1168((byte) -127, var5);
        if (var6 != null) {
            class407.method2621(var6, 15);
        }
        class244.method1470(-125);
        if (!arg1 && class329.field4790 != -1) {
            class362.method2367(1, class329.field4790, 14336);
        }
        class362 var7 = new class362(class99.field1377);
        for (class169 var8 = (class169) var7.method2368(4096); var8 != null; var8 = (class169) var7.method2369(-1)) {
            if (!var8.method323((byte) 69)) {
                var8 = (class169) var7.method2368(4096);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2276 == 3) {
                int var9 = (int) var8.field640;
                if (var9 >>> 16 == var4) {
                    method1864(true, arg1, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method1865(int arg0) {
        field3937++;
        if (class363.field5237 > 1) {
            class363.field5237--;
            class367.field5298 = class207.field2788;
        }
        if (class262.field3797 > 0) {
            class262.field3797--;
        }
        if (class368.field5313) {
            class368.field5313 = false;
            class27.method193(108);
            return;
        }
        if (!class2.field26) {
            class71.method520(127);
        }
        for (int var1 = 0; var1 < 100 && class75.method563(0); var1++) {
        }
        if (class70.field932 != 30) {
            return;
        }
        class415.method2640(class185.field2507, 127, 16383);
        Object var2 = class27.field383.field1547;
        synchronized (class27.field383.field1547) {
            if (!class178.field2347) {
                class27.field383.field1561 = 0;
            } else if (class252.field3464 != 0 || class27.field383.field1561 >= 40) {
                class185.field2507.method5(-6445, 219);
                class181.field2394++;
                class185.field2507.method1346(0, 32767);
                int var3 = class185.field2507.field3029;
                int var4 = 0;
                for (int var5 = 0; var5 < class27.field383.field1561 && (class185.field2507.field3029 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class27.field383.field1560[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class27.field383.field1563[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class27.field383.field1560[var5] == -1 && class27.field383.field1563[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class339.field4890 != var7 || class447.field6557 != var6) {
                        int var9 = var7 - class339.field4890;
                        class339.field4890 = var7;
                        int var10 = var6 - class447.field6557;
                        class447.field6557 = var6;
                        if (class188.field2528 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class185.field2507.method1326((class188.field2528 << 12) + (var9 << 6) + var10, -82);
                            class188.field2528 = 0;
                        } else if (class188.field2528 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class185.field2507.method1346(class188.field2528 + 128, 32767);
                            var9 += 128;
                            class185.field2507.method1326((var9 << 8) + var10, -114);
                            class188.field2528 = 0;
                        } else if (class188.field2528 < 32) {
                            class185.field2507.method1346(class188.field2528 + 192, 32767);
                            if (var8) {
                                class185.field2507.method1330(Integer.MIN_VALUE, 56);
                            } else {
                                class185.field2507.method1330(var6 << 16 | var7, 79);
                            }
                            class188.field2528 = 0;
                        } else {
                            class185.field2507.method1326(class188.field2528 + 57344, -128);
                            if (var8) {
                                class185.field2507.method1330(Integer.MIN_VALUE, 58);
                            } else {
                                class185.field2507.method1330(var6 << 16 | var7, 33);
                            }
                            class188.field2528 = 0;
                        }
                    } else if (class188.field2528 < 2047) {
                        class188.field2528++;
                    }
                }
                class185.field2507.method1378(class185.field2507.field3029 - var3, -1378);
                if (class27.field383.field1561 > var4) {
                    class27.field383.field1561 -= var4;
                    for (int var11 = 0; var11 < class27.field383.field1561; var11++) {
                        class27.field383.field1563[var11] = class27.field383.field1563[var4 + var11];
                        class27.field383.field1560[var11] = class27.field383.field1560[var4 + var11];
                    }
                } else {
                    class27.field383.field1561 = 0;
                }
            }
        }
        if (class252.field3464 != 0) {
            long var12 = (class278.field4047 - class416.field6110) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class416.field6110 = class278.field4047;
            int var14 = class32.field453;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class319.field4668;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class252.field3464 == 2) {
                var16 = 1;
            }
            class185.field2507.method5(-6445, 152);
            class232.field3091++;
            int var17 = (int) var12;
            class185.field2507.method1326(var17 | var16 << 15, 63);
            class185.field2507.method1352(var14 << 16 | var15, -1845015792);
        }
        if (client.field3481 > 0) {
            client.field3481--;
        }
        if (class172.field2303 && client.field3481 <= 0) {
            class172.field2303 = false;
            class47.field662++;
            client.field3481 = 20;
            class185.field2507.method5(-6445, 226);
            class185.field2507.method1324((int) class396.field5847 >> 3, (byte) 123);
            class185.field2507.method1379(-125, (int) class317.field4647 >> 3);
        }
        if (class65.field865 && !class304.field4466) {
            class304.field4466 = true;
            class410.field6055++;
            class185.field2507.method5(-6445, 58);
            class185.field2507.method1346(1, 32767);
        }
        if (!class65.field865 && class304.field4466) {
            class410.field6055++;
            class304.field4466 = false;
            class185.field2507.method5(-6445, 58);
            class185.field2507.method1346(0, 32767);
        }
        if (!class68.field874) {
            class173.field2320++;
            class185.field2507.method5(-6445, 180);
            class185.field2507.method1352(class237.method1423(-10231), -1845015792);
            class68.field874 = true;
        }
        if (class213.field2852 != null) {
            if (class346.field4979 == 2) {
                class399.method2570(119);
            } else if (class346.field4979 == 3) {
                class368.method2392((byte) 117);
            }
        }
        if (class207.field2787) {
            class207.field2787 = false;
        } else {
            class191.field2559 /= 2.0F;
        }
        if (class83.field1200) {
            class83.field1200 = false;
        } else {
            class178.field2361 /= 2.0F;
        }
        class296.method2025((byte) 56);
        if (class70.field932 != 30) {
            return;
        }
        class70.method498(false);
        class434.method2741(false);
        int var18 = 28 % ((arg0 - 18) / 52);
        class351.method2310(127);
        class92.field1296++;
        if (class92.field1296 > 750) {
            class27.method193(125);
            return;
        }
        class426.method2705(-79);
        class307.method2092(-67);
        class264.method1816(27478);
        for (int var19 = class242.method1456(true, 0); var19 != -1; var19 = class242.method1456(false, 0)) {
            class264.method1815(3930, var19);
            class42.field581[class183.method1117(31, class159.field2151++)] = var19;
        }
        for (class263 var20 = class399.method2568(16383); var20 != null; var20 = class399.method2568(16383)) {
            int var21 = var20.method1809(0);
            int var22 = var20.method1808(99);
            if (var21 == 1) {
                class43.field594[var22] = var20.field3813;
                class257.field3768 |= class63.field842[var22];
                class62.field817[class183.method1117(31, class309.field4552++)] = var22;
            } else if (var21 == 2) {
                class283.field4125[var22] = var20.field3812;
                class201.field2703[class183.method1117(class247.field3334++, 31)] = var22;
            } else if (var21 == 3) {
                class394 var23 = class196.method1168((byte) -94, var22);
                if (!var20.field3812.equals(var23.field5775)) {
                    var23.field5775 = var20.field3812;
                    class407.method2621(var23, 15);
                }
            } else if (var21 == 4) {
                class394 var41 = class196.method1168((byte) -98, var22);
                int var42 = var20.field3813;
                int var43 = var20.field3820;
                int var44 = var20.field3809;
                if (var41.field5749 != var42 || var41.field5756 != var43 || var41.field5683 != var44) {
                    var41.field5756 = var43;
                    var41.field5749 = var42;
                    var41.field5683 = var44;
                    class407.method2621(var41, 15);
                }
            } else if (var21 == 5) {
                class394 var24 = class196.method1168((byte) -107, var22);
                if (var20.field3813 != var24.field5643 || var20.field3813 == -1) {
                    var24.field5727 = 0;
                    var24.field5643 = var20.field3813;
                    var24.field5703 = 1;
                    var24.field5645 = 0;
                    class407.method2621(var24, 15);
                }
            } else if (var21 == 6) {
                int var35 = var20.field3813;
                int var36 = (var35 & 0x7EA7) >> 10;
                int var37 = var35 >> 5 & 0x1F;
                int var38 = var35 & 0x1F;
                int var39 = (var36 << 19) + (var37 << 11) + (var38 << 3);
                class394 var40 = class196.method1168((byte) -99, var22);
                if (var40.field5699 != var39) {
                    var40.field5699 = var39;
                    class407.method2621(var40, 15);
                }
            } else if (var21 == 7) {
                class394 var33 = class196.method1168((byte) -92, var22);
                boolean var34 = var20.field3813 == 1;
                if (var34 != var33.field5798) {
                    var33.field5798 = var34;
                    class407.method2621(var33, 15);
                }
            } else if (var21 == 8) {
                class394 var32 = class196.method1168((byte) -85, var22);
                if (var20.field3813 != var32.field5666 || var20.field3820 != var32.field5795 || var20.field3809 != var32.field5659) {
                    var32.field5659 = var20.field3809;
                    var32.field5795 = var20.field3820;
                    var32.field5666 = var20.field3813;
                    if (var32.field5650 != -1) {
                        if (var32.field5644 > 0) {
                            var32.field5659 = var32.field5659 * 32 / var32.field5644;
                        } else if (var32.field5813 > 0) {
                            var32.field5659 = var32.field5659 * 32 / var32.field5813;
                        }
                    }
                    class407.method2621(var32, 15);
                }
            } else if (var21 == 9) {
                class394 var31 = class196.method1168((byte) -118, var22);
                if (var20.field3813 != var31.field5650 || var20.field3820 != var31.field5810) {
                    var31.field5810 = var20.field3820;
                    var31.field5650 = var20.field3813;
                    class407.method2621(var31, 15);
                }
            } else if (var21 == 10) {
                class394 var25 = class196.method1168((byte) -90, var22);
                if (var20.field3813 != var25.field5732 || var20.field3820 != var25.field5720 || var20.field3809 != var25.field5694) {
                    var25.field5720 = var20.field3820;
                    var25.field5732 = var20.field3813;
                    var25.field5694 = var20.field3809;
                    class407.method2621(var25, 15);
                }
            } else if (var21 == 11) {
                class394 var26 = class196.method1168((byte) -98, var22);
                var26.field5753 = 0;
                var26.field5821 = var26.field5712 = var20.field3813;
                var26.field5793 = 0;
                var26.field5779 = var26.field5696 = var20.field3820;
                class407.method2621(var26, 15);
            } else if (var21 == 12) {
                class394 var29 = class196.method1168((byte) -107, var22);
                int var30 = var20.field3813;
                if (var29 != null && var29.field5671 == 0) {
                    if (var30 > var29.field5771 - var29.field5672) {
                        var30 = var29.field5771 - var29.field5672;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field5764 != var30) {
                        var29.field5764 = var30;
                        class407.method2621(var29, 15);
                    }
                }
            } else if (var21 == 13) {
                class394 var27 = class196.method1168((byte) -118, var22);
                var27.field5675 = var20.field3813;
            } else if (var21 == 14) {
                class394 var28 = class196.method1168((byte) -112, var22);
                var28.field5693 = var20.field3813;
            } else if (var21 == 15) {
                class59.field792 = var20.field3813;
                class91.field1284 = true;
                class376.field5470 = var20.field3820;
            }
        }
        if (class384.field5563 != 0) {
            class117.field1652 += 20;
            if (class117.field1652 >= 400) {
                class384.field5563 = 0;
            }
        }
        class379.field5514++;
        if (class318.field4648 != null) {
            class17.field247++;
            if (class17.field247 >= 15) {
                class407.method2621(class318.field4648, 15);
                class318.field4648 = null;
            }
        }
        class394 var45 = class96.field1358;
        class394 var46 = class71.field1007;
        class96.field1358 = null;
        class254.field3526 = 0;
        class71.field1007 = null;
        class218.field2881 = false;
        class69.field887 = false;
        class244.field3258 = null;
        while (class157.method974(14648) && class254.field3526 < 128) {
            if (!class39.method278(-16884) || class331.field4810 != '`' && class331.field4810 != '§') {
                class192.field2575[class254.field3526] = class90.field1275;
                class369.field5332[class254.field3526] = class331.field4810;
                class254.field3526++;
            } else if (class423.method2700(2)) {
                class399.method2567(false);
            } else {
                class7.method53(-18954);
            }
        }
        if (class423.method2700(2)) {
            class419.method2684(114);
        }
        class259.field3785 = null;
        class97.method662((class394) null, -1, -1, 0);
        class300.method2057((class394) null, -1, -1, (byte) -51);
        if (class329.field4790 != -1) {
            class103.method691(256, 0, 0, 0, class329.field4790, class138.field1907, class92.field1294, 0);
        }
        class207.field2788++;
        if (class259.field3785 != null) {
            class171.method1058(85);
        }
        if (class230.field3076) {
            class185.field2507.method5(-6445, 169);
            class372.field5417++;
            class185.field2507.method1366(class2.field28 << 14 | class184.field2487 << 28 | class156.field2119, (byte) 123);
            class230.field3076 = false;
        }
        while (true) {
            class192 var47;
            class394 var48;
            class394 var49;
            do {
                var47 = (class192) class447.field6555.method340(false);
                if (var47 == null) {
                    while (true) {
                        class192 var50;
                        class394 var51;
                        class394 var52;
                        do {
                            var50 = (class192) class331.field4812.method340(false);
                            if (var50 == null) {
                                while (true) {
                                    class192 var53;
                                    class394 var54;
                                    class394 var55;
                                    do {
                                        var53 = (class192) class234.field3126.method340(false);
                                        if (var53 == null) {
                                            if (class259.field3785 == null) {
                                                class435.field6397 = 0;
                                            }
                                            if (class16.field224 != null) {
                                                class1.method2((byte) 125);
                                            }
                                            if (class185.field2510 > 0 && class30.field437[82] && class30.field437[81] && class349.field5060 != 0) {
                                                int var56 = class227.field2981 - class349.field5060;
                                                if (var56 < 0) {
                                                    var56 = 0;
                                                } else if (var56 > 3) {
                                                    var56 = 3;
                                                }
                                                class316.method2134(class7.field138 + class227.field2988.field4360[0], class227.field2988.field4362[0] + class200.field2660, var56, -106);
                                            }
                                            class413.method2637(-1288490189);
                                            if (class192.field2570 != null) {
                                                class407.method2621(class192.field2570, 15);
                                                class97.field1359++;
                                                if (class279.field4058 + 5 < class124.field1728 || class124.field1728 < class279.field4058 - 5 || (class298.field4288 + 5) < class323.field4747 || (class298.field4288 - 5) > class323.field4747) {
                                                    class110.field1564 = true;
                                                }
                                                if (class129.field1788 == 0) {
                                                    if (class110.field1564 && class97.field1359 >= 5) {
                                                        if (class192.field2570 == class146.field2002 && class43.field607 != class390.field5618) {
                                                            class394 var57 = class192.field2570;
                                                            byte var58 = 0;
                                                            if (class263.field3819 == 1 && var57.field5654 == 206) {
                                                                var58 = 1;
                                                            }
                                                            if (var57.field5777[class390.field5618] <= 0) {
                                                                var58 = 0;
                                                            }
                                                            if (var58 == 1) {
                                                                int var59 = class43.field607;
                                                                int var60 = class390.field5618;
                                                                while (var59 != var60) {
                                                                    if (var60 < var59) {
                                                                        var57.method2533(var59, var59 - 1, (byte) -125);
                                                                        var59--;
                                                                    } else if (var60 > var59) {
                                                                        var57.method2533(var59, var59 + 1, (byte) -96);
                                                                        var59++;
                                                                    }
                                                                }
                                                            } else {
                                                                var57.method2533(class43.field607, class390.field5618, (byte) -61);
                                                            }
                                                            class449.field6575++;
                                                            class185.field2507.method5(-6445, 236);
                                                            class185.field2507.method1330(class192.field2570.field5698, -89);
                                                            class185.field2507.method1346(var58, 32767);
                                                            class185.field2507.method1324(class43.field607, (byte) 125);
                                                            class185.field2507.method1324(class390.field5618, (byte) 119);
                                                        }
                                                    } else if ((class88.field1232 == 1 || class194.method1163(false)) && class212.field2844 > 2) {
                                                        method1867((byte) -117);
                                                    } else if (class308.method2095(-22199)) {
                                                        class1.method10(81);
                                                    }
                                                    class192.field2570 = null;
                                                    class252.field3464 = 0;
                                                    class17.field247 = 10;
                                                }
                                            }
                                            if (class96.field1358 != var45) {
                                                if (var45 != null) {
                                                    class407.method2621(var45, 15);
                                                }
                                                if (class96.field1358 != null) {
                                                    class407.method2621(class96.field1358, 15);
                                                }
                                            }
                                            if (class71.field1007 != var46 && class384.field5566 == class171.field2293) {
                                                if (var46 != null) {
                                                    class407.method2621(var46, 15);
                                                }
                                                if (class71.field1007 != null) {
                                                    class407.method2621(class71.field1007, 15);
                                                }
                                            }
                                            if (class71.field1007 == null) {
                                                if (class171.field2293 > 0) {
                                                    class171.field2293--;
                                                }
                                            } else if (class171.field2293 < class384.field5566) {
                                                class171.field2293++;
                                                if (class384.field5566 == class171.field2293) {
                                                    class407.method2621(class71.field1007, 15);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class173.field2307[var61]++;
                                            }
                                            int var62 = class411.method2634(-1);
                                            int var63 = class395.method2536(-3);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class262.field3797 = 250;
                                                class23.field305++;
                                                class300.method2054(14500, -129);
                                                class185.field2507.method5(-6445, 101);
                                            }
                                            if (class257.field3768 && (class114.method735(127) - 60000L) > class295.field4227) {
                                                class278.method1917(false);
                                            }
                                            class276.field3999++;
                                            if (class276.field3999 > 500) {
                                                class276.field3999 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class105.field1523 += class229.field3067;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class399.field5962 += class323.field4745;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class306.field4490 += class145.field1992;
                                                }
                                            }
                                            if (class306.field4490 < -50) {
                                                class145.field1992 = 2;
                                            }
                                            if (class306.field4490 > 50) {
                                                class145.field1992 = -2;
                                            }
                                            if (class399.field5962 < -55) {
                                                class323.field4745 = 2;
                                            }
                                            if (class105.field1523 < -40) {
                                                class229.field3067 = 1;
                                            }
                                            if (class399.field5962 > 55) {
                                                class323.field4745 = -2;
                                            }
                                            class197.field2628++;
                                            if (class105.field1523 > 40) {
                                                class229.field3067 = -1;
                                            }
                                            if (class197.field2628 > 500) {
                                                class197.field2628 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class399.field5948 += class10.field163;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class364.field5261 += class261.field3794;
                                                }
                                            }
                                            if (class399.field5948 < -60) {
                                                class10.field163 = 2;
                                            }
                                            if (class399.field5948 > 60) {
                                                class10.field163 = -2;
                                            }
                                            if (class364.field5261 < -20) {
                                                class261.field3794 = 1;
                                            }
                                            class51.field686++;
                                            if (class364.field5261 > 10) {
                                                class261.field3794 = -1;
                                            }
                                            if (class51.field686 > 50) {
                                                class185.field2507.method5(-6445, 133);
                                                class69.field883++;
                                            }
                                            if (class418.field6196) {
                                                class56.method378(0);
                                                class418.field6196 = false;
                                            }
                                            try {
                                                if (class191.field2558 != null && class185.field2507.field3029 > 0) {
                                                    class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                                                    class185.field2507.field3029 = 0;
                                                    class51.field686 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class27.method193(101);
                                                return;
                                            }
                                        }
                                        var54 = var53.field2566;
                                        if (var54.field5649 < 0) {
                                            break;
                                        }
                                        var55 = class196.method1168((byte) -73, var54.field5639);
                                    } while (var55 == null || var55.field5820 == null || var54.field5649 >= var55.field5820.length || var55.field5820[var54.field5649] != var54);
                                    class123.method783(var53);
                                }
                            }
                            var51 = var50.field2566;
                            if (var51.field5649 < 0) {
                                break;
                            }
                            var52 = class196.method1168((byte) -83, var51.field5639);
                        } while (var52 == null || var52.field5820 == null || var51.field5649 >= var52.field5820.length || var52.field5820[var51.field5649] != var51);
                        class123.method783(var50);
                    }
                }
                var48 = var47.field2566;
                if (var48.field5649 < 0) {
                    break;
                }
                var49 = class196.method1168((byte) -105, var48.field5639);
            } while (var49 == null || var49.field5820 == null || var48.field5649 >= var49.field5820.length || var49.field5820[var48.field5649] != var48);
            class123.method783(var47);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method1866(int arg0) {
        field3933++;
        class431.field6336.method1141(arg0 - 13997);
        class110.field1548.method1141(256);
        class278.field4052.method1141(256);
        class374.field5442.method1141(256);
        class219.field2901.method1141(arg0 - 13997);
        if (arg0 != 14253) {
            method1863(1, 27, 2, -101, 79, 20, 30, -8);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1867(byte arg0) {
        field3939++;
        int var1 = class191.field2562.method2127(255, class435.field6401);
        if (arg0 >= -116) {
            field3936 = -38;
        }
        for (class212 var2 = (class212) class321.field4726.method332(-2130841184); var2 != null; var2 = (class212) class321.field4726.method343((byte) -79)) {
            int var6 = class278.method1919(1, var2);
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class212.field2844 * 16 + 21;
        int var4 = class124.field1728 - var1 / 2;
        if (var1 + var4 > class138.field1907) {
            var4 = class138.field1907 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class323.field4747;
        if (class92.field1294 < (var5 + var3)) {
            var5 = class92.field1294 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class99.field1385 = var4;
        class2.field26 = true;
        class390.field5616 = var1;
        class435.field6395 = var5;
        class183.field2485 = (class282.field4109 ? 26 : 22) + class212.field2844 * 16;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILlm;)Lcl;")
    public static final class313 method1868(int arg0, int arg1, int arg2, class347 arg3) {
        field3940++;
        if (arg0 <= 23) {
            field3936 = -93;
        }
        byte[] var4 = arg3.method2261(arg2, arg1, 65);
        return var4 == null ? null : new class313(var4);
    }
}
