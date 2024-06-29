import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class87 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1225 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Le;")
    public static class159 field1217 = new class159(5000);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1228 = 3;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 4)
    public static final void method568(int arg0, int arg1) {
        class59.field900.method1617(arg0, 50);
        field1221++;
        if (arg1 < -94) {
            class191.field3015.method1617(arg0, 50);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Ldc;", line = 17)
    public final class109 method569(int arg0) {
        field1220++;
        int var2 = 10 % ((-arg0 - 27) / 39);
        class109 var3 = (class109) class205.field3320.method1620(true, (long) this.field1222);
        if (var3 != null) {
            return var3;
        }
        class109 var4 = class216.method1448(class155.field2472, (byte) -128, this.field1222, 0);
        if (var4 != null) {
            class205.field3320.method1614(var4, (long) this.field1222, (byte) 78);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z", line = 37)
    public static final boolean method570(int arg0) throws IOException {
        field1223++;
        if (class265.field4477 == null) {
            return false;
        }
        int var1 = class265.field4477.method1238(1);
        if (var1 == 0) {
            return false;
        }
        if (class294.field5034 == -1) {
            var1--;
            class265.field4477.method1240(class73.field1058.field4950, 0, 1, -87);
            class73.field1058.field4946 = 0;
            class294.field5034 = class73.field1058.method1076((byte) -24);
            class288.field4882 = class243.field4021[class294.field5034];
        }
        if (class288.field4882 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class265.field4477.method1240(class73.field1058.field4950, 0, 1, 115);
            class288.field4882 = class73.field1058.field4950[0] & 0xFF;
        }
        if (class288.field4882 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class265.field4477.method1240(class73.field1058.field4950, 0, 2, 120);
            class73.field1058.field4946 = 0;
            class288.field4882 = class73.field1058.method2021((byte) 74);
        }
        if (var1 < class288.field4882) {
            return false;
        }
        class73.field1058.field4946 = 0;
        class265.field4477.method1240(class73.field1058.field4950, 0, class288.field4882, -89);
        class147.field2248 = 0;
        if (arg0 <= 63) {
            field1225 = 48;
        }
        class291.field4968 = class59.field902;
        class59.field902 = class101.field1465;
        class101.field1465 = class294.field5034;
        if (class294.field5034 == 255) {
            int var373 = class73.field1058.method2011(-100);
            if (class73.field1058.method2011(-77) == 0) {
                class308.field5287[var373] = new class276();
            } else {
                class73.field1058.field4946--;
                class308.field5287[var373] = new class276(class73.field1058);
            }
            class294.field5034 = -1;
            class131.field1990 = class86.field1212;
            return true;
        } else if (class294.field5034 == 217) {
            long var2 = class73.field1058.method1968(50);
            long var4 = (long) class73.field1058.method2021((byte) 74);
            long var6 = (long) class73.field1058.method2009((byte) 64);
            long var8 = (var4 << 32) + var6;
            boolean var10 = false;
            int var11 = class73.field1058.method2011(-94);
            int var12 = 0;
            label1225: while (true) {
                if (var12 < 100) {
                    if (class242.field3955[var12] != var8) {
                        var12++;
                        continue;
                    }
                    var10 = true;
                    break;
                }
                if (var11 <= 1) {
                    if ((!class252.field4348 || class277.field4735) && !class205.field3346) {
                        for (int var13 = 0; var13 < class299.field5190; var13++) {
                            if (class11.field133[var13] == var2) {
                                var10 = true;
                                break label1225;
                            }
                        }
                    } else {
                        var10 = true;
                    }
                }
                break;
            }
            if (!var10 && class276.field4729 == 0) {
                class242.field3955[class206.field3378] = var8;
                class206.field3378 = (class206.field3378 + 1) % 100;
                class152 var14 = class171.method1142(class80.method533(23178, class73.field1058).method989((byte) 94));
                if (var11 == 2 || var11 == 3) {
                    class245.method1687(class195.method1307(new class152[] { class236.field3871, class160.method1077(-109, var2).method1022(-117) }, (byte) 29), 7, var14, -1);
                } else if (var11 == 1) {
                    class245.method1687(class195.method1307(new class152[] { class150.field2342, class160.method1077(-105, var2).method1022(-117) }, (byte) 29), 7, var14, -1);
                } else {
                    class245.method1687(class160.method1077(-117, var2).method1022(-117), 3, var14, -1);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 54) {
            int var15 = class73.field1058.method2008(-24427);
            int var16 = class73.field1058.method1984(-32768);
            int var17 = class73.field1058.method1957(810960104);
            int var18 = class73.field1058.method2007((byte) 101);
            if (client.method1755(false, var17)) {
                class64.method411(false, var15, var18, var16);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 231) {
            class137.method865(true);
            int var19 = class73.field1058.method1974((byte) 101);
            int var20 = class73.field1058.method1969((byte) -16);
            int var21 = class73.field1058.method2011(-121);
            class260.field4448[var21] = var20;
            class280.field4793[var21] = var19;
            class117.field1652[var21] = 1;
            for (int var22 = 0; var22 < 98; var22++) {
                if (class12.field169[var22] <= var20) {
                    class117.field1652[var21] = var22 + 2;
                }
            }
            class231.field3780[class34.method251(class272.field4653++, 31)] = var21;
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 222) {
            class34.method256(class34.field572, class288.field4882, 3037, class73.field1058);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 66) {
            int var367 = class73.field1058.method2021((byte) 74);
            int var368 = class73.field1058.method2011(-69);
            int var369 = class73.field1058.method2011(-17);
            int var370 = class73.field1058.method2021((byte) 74);
            int var371 = class73.field1058.method2011(-84);
            int var372 = class73.field1058.method2011(-83);
            if (client.method1755(false, var367)) {
                class155.method1037(var369, var370, var372, var371, var368, false, true);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 38) {
            int var23 = class73.field1058.method1979(0);
            class152 var24 = class73.field1058.method2017(true);
            int var25 = class73.field1058.method1957(810960104);
            if (client.method1755(false, var23)) {
                class316.method2208(84, var24, var25);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 18) {
            for (int var26 = 0; var26 < class249.field4227.length; var26++) {
                if (class249.field4227[var26] != class155.field2464[var26]) {
                    class249.field4227[var26] = class155.field2464[var26];
                    class127.method815(-2, var26);
                    class194.field3100[class34.method251(class266.field4489++, 31)] = var26;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 34) {
            int var364 = class73.field1058.method1979(0);
            int var365 = class73.field1058.method1957(810960104);
            int var366 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var365)) {
                class193.field3060 = var366;
                class272.field4645 = var364;
                if (class28.field485 == 2) {
                    class94.field1346 = class272.field4645;
                    class223.field3634 = class193.field3060;
                }
                class298.method2083(false);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 7 || class294.field5034 == 175 || class294.field5034 == 10 || class294.field5034 == 171 || class294.field5034 == 71 || class294.field5034 == 13 || class294.field5034 == 53 || class294.field5034 == 28 || class294.field5034 == 134 || class294.field5034 == 251 || class294.field5034 == 148 || class294.field5034 == 80 || class294.field5034 == 147) {
            class215.method1446((byte) 118);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 98) {
            int var361 = class73.field1058.method1995(-42);
            class127 var362 = class11.method54(false, var361);
            for (int var363 = 0; var363 < var362.field1833.length; var363++) {
                var362.field1833[var363] = -1;
                var362.field1833[var363] = 0;
            }
            class272.method1868(22889, var362);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 86) {
            long var346 = class73.field1058.method1968(37);
            class73.field1058.method1962(false);
            long var348 = class73.field1058.method1968(50);
            boolean var350 = false;
            long var351 = (long) class73.field1058.method2021((byte) 74);
            long var353 = (long) class73.field1058.method2009((byte) 64);
            int var355 = class73.field1058.method2011(-67);
            long var356 = (var351 << 32) + var353;
            int var358 = 0;
            label1639: while (true) {
                if (var358 >= 100) {
                    if (var355 <= 1) {
                        if ((!class252.field4348 || class277.field4735) && !class205.field3346) {
                            for (int var359 = 0; var359 < class299.field5190; var359++) {
                                if (class11.field133[var359] == var346) {
                                    var350 = true;
                                    break label1639;
                                }
                            }
                        } else {
                            var350 = true;
                        }
                    }
                    break;
                }
                if (class242.field3955[var358] == var356) {
                    var350 = true;
                    break;
                }
                var358++;
            }
            if (!var350 && class276.field4729 == 0) {
                class242.field3955[class206.field3378] = var356;
                class206.field3378 = (class206.field3378 + 1) % 100;
                class152 var360 = class171.method1142(class80.method533(23178, class73.field1058).method989((byte) 47));
                if (var355 == 2 || var355 == 3) {
                    class54.method365(class160.method1077(-104, var348).method1022(-117), class195.method1307(new class152[] { class236.field3871, class160.method1077(53, var346).method1022(-117) }, (byte) 29), (byte) -97, 9, var360);
                } else if (var355 == 1) {
                    class54.method365(class160.method1077(60, var348).method1022(-117), class195.method1307(new class152[] { class150.field2342, class160.method1077(-98, var346).method1022(-117) }, (byte) 29), (byte) -97, 9, var360);
                } else {
                    class54.method365(class160.method1077(-100, var348).method1022(-117), class160.method1077(98, var346).method1022(-117), (byte) -97, 9, var360);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 190) {
            int var341 = class73.field1058.method2021((byte) 74);
            class152 var342 = class73.field1058.method2017(true);
            Object[] var343 = new Object[var342.method1000(0) + 1];
            for (int var344 = var342.method1000(0) - 1; var344 >= 0; var344--) {
                if (var342.method1002(-12637, var344) == 115) {
                    var343[var344 + 1] = class73.field1058.method2017(true);
                } else {
                    var343[var344 + 1] = Integer.valueOf(class73.field1058.method1969((byte) -16));
                }
            }
            var343[0] = Integer.valueOf(class73.field1058.method1969((byte) -16));
            if (client.method1755(false, var341)) {
                class320 var345 = new class320();
                var345.field5581 = var343;
                class64.method412(var345, (byte) -119);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 213) {
            class222.method1534((byte) 55);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 210) {
            long var322 = class73.field1058.method1968(36);
            int var324 = class73.field1058.method2021((byte) 74);
            boolean var325 = true;
            if (var322 < 0L) {
                var322 &= Long.MAX_VALUE;
                var325 = false;
            }
            int var326 = class73.field1058.method2011(-73);
            class152 var327 = class201.field3252;
            if (var324 > 0) {
                var327 = class73.field1058.method2017(true);
            }
            class152 var328 = class160.method1077(-107, var322).method1022(-117);
            for (int var329 = 0; var329 < class199.field3206; var329++) {
                if (class317.field5504[var329] == var322) {
                    if (class179.field2863[var329] != var324) {
                        class179.field2863[var329] = var324;
                        if (var324 > 0) {
                            class245.method1687(class201.field3252, 5, class195.method1307(new class152[] { var328, class4.field74 }, (byte) 29), -1);
                        }
                        if (var324 == 0) {
                            class245.method1687(class201.field3252, 5, class195.method1307(new class152[] { var328, class210.field3409 }, (byte) 29), -1);
                        }
                    }
                    var328 = null;
                    class8.field110[var329] = var327;
                    class49.field762[var329] = var326;
                    class304.field5234[var329] = var325;
                    break;
                }
            }
            boolean var330 = false;
            if (var328 != null && class199.field3206 < 200) {
                class317.field5504[class199.field3206] = var322;
                class176.field2838[class199.field3206] = var328;
                class179.field2863[class199.field3206] = var324;
                class8.field110[class199.field3206] = var327;
                class49.field762[class199.field3206] = var326;
                class304.field5234[class199.field3206] = var325;
                class199.field3206++;
            }
            int var331 = class199.field3206;
            class276.field4730 = class86.field1212;
            while (var331 > 0) {
                var331--;
                boolean var332 = true;
                for (int var333 = 0; var333 < var331; var333++) {
                    if (class179.field2863[var333] != class314.field5443 && class179.field2863[var333 + 1] == class314.field5443 || class179.field2863[var333] == 0 && class179.field2863[var333 + 1] != 0) {
                        int var334 = class179.field2863[var333];
                        class179.field2863[var333] = class179.field2863[var333 + 1];
                        var332 = false;
                        class179.field2863[var333 + 1] = var334;
                        class152 var335 = class8.field110[var333];
                        class8.field110[var333] = class8.field110[var333 + 1];
                        class8.field110[var333 + 1] = var335;
                        class152 var336 = class176.field2838[var333];
                        class176.field2838[var333] = class176.field2838[var333 + 1];
                        class176.field2838[var333 + 1] = var336;
                        long var337 = class317.field5504[var333];
                        class317.field5504[var333] = class317.field5504[var333 + 1];
                        class317.field5504[var333 + 1] = var337;
                        int var339 = class49.field762[var333];
                        class49.field762[var333] = class49.field762[var333 + 1];
                        class49.field762[var333 + 1] = var339;
                        boolean var340 = class304.field5234[var333];
                        class304.field5234[var333] = class304.field5234[var333 + 1];
                        class304.field5234[var333 + 1] = var340;
                    }
                }
                if (var332) {
                    break;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 55) {
            int var27 = class73.field1058.method1957(810960104);
            class152 var28 = class73.field1058.method2017(true);
            int var29 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var27)) {
                class316.method2208(127, var28, var29);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 96) {
            int var30 = class73.field1058.method1957(810960104);
            int var31 = class73.field1058.method2008(-24427);
            int var32 = class73.field1058.method1995(125);
            if (client.method1755(false, var30)) {
                class122 var33 = (class122) class107.field1519.method1586((long) var31, -82);
                class122 var34 = (class122) class107.field1519.method1586((long) var32, -95);
                if (var34 != null) {
                    class23.method197(var34, false, var33 == null || var33.field1724 != var34.field1724);
                }
                if (var33 != null) {
                    var33.method1880(-25368);
                    class107.field1519.method1593((long) var32, var33, 27497);
                }
                class127 var35 = class11.method54(false, var31);
                if (var35 != null) {
                    class272.method1868(22889, var35);
                }
                class127 var36 = class11.method54(false, var32);
                if (var36 != null) {
                    class272.method1868(22889, var36);
                    class193.method1288(120, true, var36);
                }
                if (class253.field4387 != -1) {
                    class157.method1058(1, 106, class253.field4387);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 44) {
            int var319 = class73.field1058.method1976((byte) 86);
            int var320 = class73.field1058.method1957(810960104);
            int var321 = class73.field1058.method1995(-111);
            if (client.method1755(false, var319)) {
                class294.method2031((byte) -119, var321, var320);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 127) {
            int var37 = class73.field1058.method2008(-24427);
            int var38 = class73.field1058.method1957(810960104);
            int var39 = class73.field1058.method1979(0);
            if (client.method1755(false, var39)) {
                class296.method2043(var38, (byte) -74, var37);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 249) {
            int var40 = class73.field1058.method1957(810960104);
            int var41 = class73.field1058.method2021((byte) 74);
            int var42 = class73.field1058.method1997(22720);
            class4 var43 = class40.field649[var41];
            if (var43 != null) {
                class12.method62(var40, (byte) 90, var43, var42);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 109) {
            int var308 = class73.field1058.method2008(-24427);
            int var309 = (var308 & 0x3161D6FE) >> 28;
            int var310 = (var308 & 0xFFFF2B8) >> 14;
            int var311 = var308 & 0x3FFF;
            int var312 = class73.field1058.method2011(-20);
            int var313 = var312 >> 2;
            int var314 = class69.field1008[var313];
            int var315 = class73.field1058.method1957(810960104);
            if (var315 == 65535) {
                var315 = -1;
            }
            int var316 = var312 & 0x3;
            int var317 = var310 - class272.field4670;
            int var318 = var311 - class199.field3226;
            class57.method376(var314, var313, 3491, var318, var316, var317, var315, var309);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 48) {
            int var304 = class73.field1058.method1957(810960104);
            int var305 = class73.field1058.method2012(-33);
            int var306 = class73.field1058.method1976((byte) 86);
            int var307 = class73.field1058.method1957(810960104);
            if (client.method1755(false, var306)) {
                class15.method98(var305, (var304 << 16) + var307, true);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 209) {
            class104.method701(8080, class73.field1058.method2017(true));
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 143) {
            int var44 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var44)) {
                class222.method1538(-19);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 194) {
            int var45 = class73.field1058.method1990((byte) 120);
            int var46 = class73.field1058.method1979(0);
            class152 var47 = class73.field1058.method2017(true);
            if (var46 == 65535) {
                var46 = -1;
            }
            int var48 = class73.field1058.method1997(22720);
            if (var48 >= 1 && var48 <= 8) {
                if (var47.method995(-74, class163.field2573)) {
                    var47 = null;
                }
                class79.field1104[var48 - 1] = var47;
                class266.field4491[var48 - 1] = var46;
                class226.field3665[var48 - 1] = var45 == 0;
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 90) {
            long var288 = class73.field1058.method1968(47);
            class73.field1058.method1962(false);
            long var290 = class73.field1058.method1968(119);
            long var292 = (long) class73.field1058.method2021((byte) 74);
            long var294 = (long) class73.field1058.method2009((byte) 64);
            int var296 = class73.field1058.method2011(-128);
            long var297 = (var292 << 32) + var294;
            boolean var299 = false;
            int var300 = class73.field1058.method2021((byte) 74);
            int var301 = 0;
            label1573: while (true) {
                if (var301 < 100) {
                    if (class242.field3955[var301] != var297) {
                        var301++;
                        continue;
                    }
                    var299 = true;
                    break;
                }
                if (var296 <= 1) {
                    for (int var302 = 0; var302 < class299.field5190; var302++) {
                        if (class11.field133[var302] == var288) {
                            var299 = true;
                            break label1573;
                        }
                    }
                }
                break;
            }
            if (!var299 && class276.field4729 == 0) {
                class242.field3955[class206.field3378] = var297;
                class206.field3378 = (class206.field3378 + 1) % 100;
                class152 var303 = class22.method177(1, var300).method1056(class73.field1058, 0);
                if (var296 == 2 || var296 == 3) {
                    class251.method1731(var300, 20, (byte) 92, var303, class160.method1077(-103, var290).method1022(-117), class195.method1307(new class152[] { class236.field3871, class160.method1077(111, var288).method1022(-117) }, (byte) 29));
                } else if (var296 == 1) {
                    class251.method1731(var300, 20, (byte) 102, var303, class160.method1077(75, var290).method1022(-117), class195.method1307(new class152[] { class150.field2342, class160.method1077(13, var288).method1022(-117) }, (byte) 29));
                } else {
                    class251.method1731(var300, 20, (byte) 103, var303, class160.method1077(76, var290).method1022(-117), class160.method1077(-113, var288).method1022(-117));
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 63) {
            int var282 = class73.field1058.method2021((byte) 74);
            int var283 = class73.field1058.method2011(-43);
            int var284 = class73.field1058.method2011(-87);
            int var285 = class73.field1058.method2021((byte) 74);
            int var286 = class73.field1058.method2011(-50);
            int var287 = class73.field1058.method2011(-35);
            if (client.method1755(false, var282)) {
                class324.method2280(var284, var287, -384, var285, var283, var286);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 17) {
            long var279 = class73.field1058.method1968(104);
            class152 var281 = class171.method1142(class80.method533(23178, class73.field1058).method989((byte) 102));
            class245.method1687(class160.method1077(-117, var279).method1022(-117), 6, var281, -1);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 108) {
            class84.method551(24, class73.field1058);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 142) {
            int var49 = class73.field1058.method2021((byte) 74);
            if (var49 == 65535) {
                var49 = -1;
            }
            class146.method920((byte) -89, var49);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 133) {
            int var50 = class73.field1058.method1992(-2);
            int var51 = class73.field1058.method1979(0);
            if (var51 == 65535) {
                var51 = -1;
            }
            class316.method2210(var51, var50, (byte) 83);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 100) {
            class70.field1019 = class73.field1058.method1974((byte) 111);
            class325.field5672 = class73.field1058.method2011(-27);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 45) {
            int var52 = class73.field1058.method1979(0);
            int var53 = class73.field1058.method2012(-47);
            int var54 = class73.field1058.method1976((byte) 86);
            int var55 = class73.field1058.method1979(0);
            if (var53 >> 30 != 0) {
                int var66 = var53 >> 28 & 0x3;
                int var67 = ((var53 & 0xFFFFDDE) >> 14) - class272.field4670;
                int var68 = (var53 & 0x3FFF) - class199.field3226;
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    int var69 = var68 * 128 + 64;
                    int var70 = var67 * 128 + 64;
                    class289 var71 = new class289(var52, var66, var70, var69, class154.method1031(93, var70, var66, var69) - var55, var54, class142.field2187);
                    class146.field2234.method1214(false, new class314(var71));
                }
            } else if (var53 >> 29 != 0) {
                int var61 = var53 & 0xFFFF;
                class4 var62 = class40.field649[var61];
                if (var62 != null) {
                    if (var52 == 65535) {
                        var52 = -1;
                    }
                    boolean var63 = true;
                    if (var52 != -1 && var62.field4182 != -1 && class133.method851(class189.method1255(var52, (byte) 39).field5170, 0).field2152 < class133.method851(class189.method1255(var62.field4182, (byte) 22).field5170, -31).field2152) {
                        var63 = false;
                    }
                    if (var63) {
                        var62.field4205 = var55;
                        var62.field4233 = 0;
                        var62.field4164 = class142.field2187 + var54;
                        var62.field4242 = 1;
                        if (class142.field2187 < var62.field4164) {
                            var62.field4233 = -1;
                        }
                        var62.field4196 = 0;
                        var62.field4182 = var52;
                        if (var62.field4182 != -1 && class142.field2187 == var62.field4164) {
                            int var64 = class189.method1255(var62.field4182, (byte) 92).field5170;
                            if (var64 != -1) {
                                class141 var65 = class133.method851(var64, 118);
                                if (var65 != null && var65.field2177 != null) {
                                    class18.method114(var62.field4162, 0, var62.field4231, var65, false, 28972);
                                }
                            }
                        }
                    }
                }
            } else if ((var53 >> 28) != 0) {
                int var56 = var53 & 0xFFFF;
                class12 var57;
                if (class27.field466 == var56) {
                    var57 = class85.field1176;
                } else {
                    var57 = class22.field380[var56];
                }
                if (var57 != null) {
                    if (var52 == 65535) {
                        var52 = -1;
                    }
                    boolean var58 = true;
                    if (var52 != -1 && var57.field4182 != -1 && class133.method851(class189.method1255(var52, (byte) -127).field5170, 121).field2152 < class133.method851(class189.method1255(var57.field4182, (byte) 111).field5170, 122).field2152) {
                        var58 = false;
                    }
                    if (var58) {
                        var57.field4164 = class142.field2187 + var54;
                        var57.field4182 = var52;
                        var57.field4242 = 1;
                        var57.field4205 = var55;
                        if (var57.field4182 == 65535) {
                            var57.field4182 = -1;
                        }
                        var57.field4196 = 0;
                        var57.field4233 = 0;
                        if (var57.field4164 > class142.field2187) {
                            var57.field4233 = -1;
                        }
                        if (var57.field4182 != -1 && class142.field2187 == var57.field4164) {
                            int var59 = class189.method1255(var57.field4182, (byte) 43).field5170;
                            if (var59 != -1) {
                                class141 var60 = class133.method851(var59, -50);
                                if (var60 != null && var60.field2177 != null) {
                                    class18.method114(var57.field4162, 0, var57.field4231, var60, class85.field1176 == var57, 28972);
                                }
                            }
                        }
                    }
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 196) {
            class252.method1746((byte) 77, true);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 135) {
            class170.field2674 = class73.field1058.method2011(-82);
            class276.field4730 = class86.field1212;
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 4) {
            class270.field4622 = class73.field1058.method2021((byte) 74) * 30;
            class294.field5034 = -1;
            class65.field980 = class86.field1212;
            return true;
        } else if (class294.field5034 == 92) {
            class70.field1019 = class73.field1058.method1997(22720);
            class325.field5672 = class73.field1058.method2011(-69);
            while (class73.field1058.field4946 < class288.field4882) {
                class294.field5034 = class73.field1058.method2011(-113);
                class215.method1446((byte) 118);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 23) {
            class152 var276 = class73.field1058.method2017(true);
            int var277 = class73.field1058.method1957(810960104);
            int var278 = class73.field1058.method2008(-24427);
            if (client.method1755(false, var277)) {
                class295.method2036(var278, var276, false);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 224) {
            long var262 = class73.field1058.method1968(36);
            long var264 = (long) class73.field1058.method2021((byte) 74);
            long var266 = (long) class73.field1058.method2009((byte) 64);
            long var268 = (var264 << 32) + var266;
            boolean var270 = false;
            int var271 = class73.field1058.method2011(-16);
            int var272 = class73.field1058.method2021((byte) 74);
            int var273 = 0;
            label1535: while (true) {
                if (var273 >= 100) {
                    if (var271 <= 1) {
                        for (int var274 = 0; var274 < class299.field5190; var274++) {
                            if (class11.field133[var274] == var262) {
                                var270 = true;
                                break label1535;
                            }
                        }
                    }
                    break;
                }
                if (class242.field3955[var273] == var268) {
                    var270 = true;
                    break;
                }
                var273++;
            }
            if (!var270 && class276.field4729 == 0) {
                class242.field3955[class206.field3378] = var268;
                class206.field3378 = (class206.field3378 + 1) % 100;
                class152 var275 = class22.method177(1, var272).method1056(class73.field1058, 0);
                if (var271 == 2) {
                    class251.method1731(var272, 18, (byte) 66, var275, (class152) null, class195.method1307(new class152[] { class236.field3871, class160.method1077(-91, var262).method1022(-117) }, (byte) 29));
                } else if (var271 == 1) {
                    class251.method1731(var272, 18, (byte) 114, var275, (class152) null, class195.method1307(new class152[] { class150.field2342, class160.method1077(-128, var262).method1022(-117) }, (byte) 29));
                } else {
                    class251.method1731(var272, 18, (byte) 110, var275, (class152) null, class160.method1077(35, var262).method1022(-117));
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 176) {
            class8.field111 = class73.field1058.method2011(-63);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 47) {
            int var72 = class73.field1058.method1979(0);
            int var73 = class73.field1058.method2021((byte) 74);
            int var74 = class73.field1058.method1957(810960104);
            int var75 = class73.field1058.method2021((byte) 74);
            int var76 = class73.field1058.method1995(-46);
            if (client.method1755(false, var73)) {
                class299.method2092(var72 << 16 | var74, var76, 98, var75, 7);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 220) {
            int var77 = class73.field1058.method2021((byte) 74);
            int var78 = class73.field1058.method1969((byte) -16);
            if (client.method1755(false, var77)) {
                class122 var79 = (class122) class107.field1519.method1586((long) var78, -102);
                if (var79 != null) {
                    class23.method197(var79, false, true);
                }
                if (class127.field1858 != null) {
                    class272.method1868(22889, class127.field1858);
                    class127.field1858 = null;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 197) {
            int var258 = class73.field1058.method2021((byte) 74);
            int var259 = class73.field1058.method1990((byte) 97);
            int var260 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var260)) {
                if (var259 == 2) {
                    class238.method1633(false);
                }
                class253.field4387 = var258;
                class298.method2087(var258, -1);
                class198.method1321(false, false);
                class159.method1071(class253.field4387, 1416);
                for (int var261 = 0; var261 < 100; var261++) {
                    class249.field4170[var261] = true;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 69) {
            int var255 = class73.field1058.method2021((byte) 74);
            int var256 = class73.field1058.method2011(-63);
            int var257 = class73.field1058.method2021((byte) 74);
            if (var255 == 65535) {
                var255 = -1;
            }
            class125.method795(-30990, var256, var257, var255);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 138) {
            if (class23.field397 != null) {
                class179.method1178(true, -1, false, class167.field2632, -1);
            }
            byte[] var253 = new byte[class288.field4882];
            class73.field1058.method1074(0, class288.field4882, -27992, var253);
            class152 var254 = class117.method775(var253, class288.field4882, (byte) 112, 0);
            if (class85.field1201 == null && class151.field2361 == 3 || !class151.field2350.startsWith("win") || class211.field3431) {
                class108.method720(true, var254, 111);
            } else {
                class100.field1462 = true;
                class241.field3942 = var254;
                class314.field5438 = class34.field572.method967(0, new String(var254.method1018(-108), "ISO-8859-1"));
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 68) {
            if (class253.field4387 != -1) {
                class157.method1058(0, 72, class253.field4387);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 36) {
            class211.method1418(2130);
            class294.field5034 = -1;
            return false;
        } else if (class294.field5034 == 84) {
            int var80 = class73.field1058.method1995(-118);
            int var81 = class73.field1058.method2021((byte) 74);
            int var82 = class73.field1058.method1979(0);
            if (var81 == 65535) {
                var81 = -1;
            }
            if (client.method1755(false, var82)) {
                class299.method2092(var81, var80, 95, -1, 1);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 225) {
            class45.field718 = class86.field1212;
            long var83 = class73.field1058.method1968(94);
            if (var83 == 0L) {
                class294.field5034 = -1;
                class225.field3656 = null;
                class296.field5070 = null;
                class233.field3818 = null;
                class167.field2631 = 0;
                return true;
            }
            long var85 = class73.field1058.method1968(51);
            class296.field5070 = class160.method1077(99, var85);
            class233.field3818 = class160.method1077(-99, var83);
            class284.field4828 = class73.field1058.method1962(false);
            int var87 = class73.field1058.method2011(-128);
            if (var87 == 255) {
                class294.field5034 = -1;
                return true;
            }
            class167.field2631 = var87;
            class266[] var88 = new class266[100];
            for (int var89 = 0; var89 < class167.field2631; var89++) {
                var88[var89] = new class266();
                var88[var89].field4689 = class73.field1058.method1968(98);
                var88[var89].field4487 = class160.method1077(69, var88[var89].field4689);
                var88[var89].field4483 = class73.field1058.method2021((byte) 74);
                var88[var89].field4486 = class73.field1058.method1962(false);
                var88[var89].field4488 = class73.field1058.method2017(true);
                if (class321.field5605 == var88[var89].field4689) {
                    class121.field1711 = var88[var89].field4486;
                }
            }
            boolean var90 = false;
            int var91 = class167.field2631;
            while (var91 > 0) {
                var91--;
                boolean var92 = true;
                for (int var93 = 0; var93 < var91; var93++) {
                    if (var88[var93].field4487.method1007(var88[var93 + 1].field4487, (byte) -13) > 0) {
                        var92 = false;
                        class266 var94 = var88[var93];
                        var88[var93] = var88[var93 + 1];
                        var88[var93 + 1] = var94;
                    }
                }
                if (var92) {
                    break;
                }
            }
            class225.field3656 = var88;
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 211) {
            int var95 = class73.field1058.method2012(-111);
            int var96 = class73.field1058.method2021((byte) 74);
            int var97 = class73.field1058.method2000((byte) 36);
            if (client.method1755(false, var96)) {
                class3.method11(5, var97, var95);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 238) {
            int var98 = class73.field1058.method2011(-119);
            int var99 = var98 >> 6;
            class268 var100 = new class268();
            var100.field4508 = var98 & 0x3F;
            var100.field4511 = class73.field1058.method2011(-41);
            if (var100.field4511 >= 0 && var100.field4511 < class66.field996.length) {
                if (var100.field4508 == 1 || var100.field4508 == 10) {
                    var100.field4513 = class73.field1058.method2021((byte) 74);
                    class73.field1058.field4946 += 3;
                } else if (var100.field4508 >= 2 && var100.field4508 <= 6) {
                    if (var100.field4508 == 2) {
                        var100.field4517 = 64;
                        var100.field4515 = 64;
                    }
                    if (var100.field4508 == 3) {
                        var100.field4517 = 0;
                        var100.field4515 = 64;
                    }
                    if (var100.field4508 == 4) {
                        var100.field4517 = 128;
                        var100.field4515 = 64;
                    }
                    if (var100.field4508 == 5) {
                        var100.field4517 = 64;
                        var100.field4515 = 0;
                    }
                    if (var100.field4508 == 6) {
                        var100.field4517 = 64;
                        var100.field4515 = 128;
                    }
                    var100.field4508 = 2;
                    var100.field4510 = class73.field1058.method2021((byte) 74);
                    var100.field4506 = class73.field1058.method2021((byte) 74);
                    var100.field4525 = class73.field1058.method2011(-86);
                }
                var100.field4507 = class73.field1058.method2021((byte) 74);
                if (var100.field4507 == 65535) {
                    var100.field4507 = -1;
                }
                class194.field3094[var99] = var100;
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 141) {
            class84.field1166 = 0;
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 181) {
            class152 var101 = class73.field1058.method2017(true);
            if (var101.method1026(class260.field4454, 114130118)) {
                class152 var137 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                long var138 = var137.method1013(-18674);
                boolean var140 = false;
                for (int var141 = 0; var141 < class299.field5190; var141++) {
                    if (class11.field133[var141] == var138) {
                        var140 = true;
                        break;
                    }
                }
                if (!var140 && class276.field4729 == 0) {
                    class245.method1687(var137, 4, class61.field915, -1);
                }
            } else if (var101.method1026(class273.field4694, 114130118)) {
                class152 var131 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                boolean var132 = false;
                long var133 = var131.method1013(-18674);
                for (int var135 = 0; var135 < class299.field5190; var135++) {
                    if (class11.field133[var135] == var133) {
                        var132 = true;
                        break;
                    }
                }
                if (!var132 && class276.field4729 == 0) {
                    class152 var136 = var101.method1015(var101.method988(class202.field3261, 0) + 1, 19197, var101.method1000(0) - 9);
                    class245.method1687(var131, 8, var136, -1);
                }
            } else if (var101.method1026(class81.field1135, 114130118)) {
                class152 var102 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                long var103 = var102.method1013(-18674);
                boolean var105 = false;
                for (int var106 = 0; var106 < class299.field5190; var106++) {
                    if (class11.field133[var106] == var103) {
                        var105 = true;
                        break;
                    }
                }
                if (!var105 && class276.field4729 == 0) {
                    class245.method1687(var102, 10, class201.field3252, -1);
                }
            } else if (var101.method1026(class297.field5137, 114130118)) {
                class152 var107 = var101.method1015(0, 19197, var101.method988(class297.field5137, 0));
                class245.method1687(class201.field3252, 11, var107, -1);
            } else if (var101.method1026(class291.field4955, 114130118)) {
                class152 var108 = var101.method1015(0, 19197, var101.method988(class291.field4955, 0));
                if (class276.field4729 == 0) {
                    class245.method1687(class201.field3252, 12, var108, -1);
                }
            } else if (var101.method1026(class237.field3876, 114130118)) {
                class152 var130 = var101.method1015(0, 19197, var101.method988(class237.field3876, 0));
                if (class276.field4729 == 0) {
                    class245.method1687(class201.field3252, 13, var130, -1);
                }
            } else if (var101.method1026(class59.field901, 114130118)) {
                class152 var109 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                long var110 = var109.method1013(-18674);
                boolean var112 = false;
                for (int var113 = 0; var113 < class299.field5190; var113++) {
                    if (class11.field133[var113] == var110) {
                        var112 = true;
                        break;
                    }
                }
                if (!var112 && class276.field4729 == 0) {
                    class245.method1687(var109, 14, class201.field3252, -1);
                }
            } else if (var101.method1026(class297.field5117, 114130118)) {
                boolean var125 = false;
                class152 var126 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                long var127 = var126.method1013(-18674);
                for (int var129 = 0; var129 < class299.field5190; var129++) {
                    if (class11.field133[var129] == var127) {
                        var125 = true;
                        break;
                    }
                }
                if (!var125 && class276.field4729 == 0) {
                    class245.method1687(var126, 15, class201.field3252, -1);
                }
            } else if (var101.method1026(class256.field4416, 114130118)) {
                class152 var114 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                long var115 = var114.method1013(-18674);
                boolean var117 = false;
                for (int var118 = 0; var118 < class299.field5190; var118++) {
                    if (class11.field133[var118] == var115) {
                        var117 = true;
                        break;
                    }
                }
                if (!var117 && class276.field4729 == 0) {
                    class245.method1687(var114, 16, class201.field3252, -1);
                }
            } else if (var101.method1026(class289.field4905, 114130118)) {
                class152 var119 = var101.method1015(0, 19197, var101.method988(class202.field3261, 0));
                boolean var120 = false;
                long var121 = var119.method1013(-18674);
                for (int var123 = 0; var123 < class299.field5190; var123++) {
                    if (class11.field133[var123] == var121) {
                        var120 = true;
                        break;
                    }
                }
                if (!var120 && class276.field4729 == 0) {
                    class152 var124 = var101.method1015(var101.method988(class202.field3261, 0) + 1, 19197, var101.method1000(0) - 9);
                    class245.method1687(var119, 21, var124, -1);
                }
            } else {
                class245.method1687(class201.field3252, 0, var101, -1);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 8) {
            class137.method865(true);
            class265.field4475 = class73.field1058.method1986(true);
            class294.field5034 = -1;
            class65.field980 = class86.field1212;
            return true;
        } else if (class294.field5034 == 88) {
            long var142 = class73.field1058.method1968(122);
            int var144 = class73.field1058.method2021((byte) 74);
            boolean var145 = false;
            byte var146 = class73.field1058.method1962(false);
            if ((var142 & Long.MIN_VALUE) != 0L) {
                var145 = true;
            }
            if (var145) {
                if (class167.field2631 == 0) {
                    class294.field5034 = -1;
                    return true;
                }
                long var152 = var142 & Long.MAX_VALUE;
                boolean var154 = false;
                int var155;
                for (var155 = 0; var155 < class167.field2631 && (class225.field3656[var155].field4689 != var152 || class225.field3656[var155].field4483 != var144); var155++) {
                }
                if (class167.field2631 > var155) {
                    while (class167.field2631 - 1 > var155) {
                        class225.field3656[var155] = class225.field3656[var155 + 1];
                        var155++;
                    }
                    class167.field2631--;
                    class225.field3656[class167.field2631] = null;
                }
            } else {
                class152 var147 = class73.field1058.method2017(true);
                class266 var148 = new class266();
                var148.field4689 = var142;
                var148.field4487 = class160.method1077(-97, var148.field4689);
                var148.field4483 = var144;
                var148.field4488 = var147;
                var148.field4486 = var146;
                int var149;
                for (var149 = class167.field2631 - 1; var149 >= 0; var149--) {
                    int var150 = class225.field3656[var149].field4487.method1007(var148.field4487, (byte) -13);
                    if (var150 == 0) {
                        class225.field3656[var149].field4483 = var144;
                        class225.field3656[var149].field4486 = var146;
                        class225.field3656[var149].field4488 = var147;
                        if (class321.field5605 == var142) {
                            class121.field1711 = var146;
                        }
                        class294.field5034 = -1;
                        class45.field718 = class86.field1212;
                        return true;
                    }
                    if (var150 < 0) {
                        break;
                    }
                }
                if (class167.field2631 >= class225.field3656.length) {
                    class294.field5034 = -1;
                    return true;
                }
                for (int var151 = class167.field2631 - 1; var151 > var149; var151--) {
                    class225.field3656[var151 + 1] = class225.field3656[var151];
                }
                if (class167.field2631 == 0) {
                    class225.field3656 = new class266[100];
                }
                class225.field3656[var149 + 1] = var148;
                class167.field2631++;
                if (class321.field5605 == var142) {
                    class121.field1711 = var146;
                }
            }
            class294.field5034 = -1;
            class45.field718 = class86.field1212;
            return true;
        } else if (class294.field5034 == 160) {
            int var156 = class73.field1058.method1969((byte) -16);
            int var157 = class73.field1058.method1969((byte) -16);
            int var158 = class73.field1058.method1979(0);
            int var159 = class73.field1058.method1957(810960104);
            if (var159 == 65535) {
                var159 = -1;
            }
            if (client.method1755(false, var158)) {
                class127 var160 = class11.method54(false, var156);
                if (var160.field1794) {
                    class98.method664(var156, var157, var159, 26);
                    class312 var161 = class189.method1253((byte) 49, var159);
                    class192.method1280(var161.field5408, var161.field5376, var161.field5369, var156, false);
                    class131.method830((byte) 83, var156, var161.field5410, var161.field5389, var161.field5405);
                } else if (var159 == -1) {
                    class294.field5034 = -1;
                    var160.field1899 = 0;
                    return true;
                } else {
                    class312 var162 = class189.method1253((byte) 59, var159);
                    var160.field1820 = var162.field5369;
                    var160.field1861 = var162.field5376 * 100 / var157;
                    var160.field1899 = 4;
                    var160.field1900 = var159;
                    var160.field1813 = var162.field5408;
                    class272.method1868(22889, var160);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 37) {
            int var250 = class73.field1058.method1979(0);
            int var251 = class73.field1058.method2012(-114);
            int var252 = class73.field1058.method1979(0);
            if (var252 == 65535) {
                var252 = -1;
            }
            if (client.method1755(false, var250)) {
                class299.method2092(var252, var251, 70, -1, 2);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 49) {
            class325.field5672 = class73.field1058.method1974((byte) 63);
            class70.field1019 = class73.field1058.method1990((byte) 125);
            for (int var163 = class70.field1019; var163 < (class70.field1019 + 8); var163++) {
                for (int var164 = class325.field5672; var164 < (class325.field5672 + 8); var164++) {
                    if (class205.field3353[class23.field400][var163][var164] != null) {
                        class205.field3353[class23.field400][var163][var164] = null;
                        class268.method1833(var163, var164, (byte) -77);
                    }
                }
            }
            for (class85 var165 = (class85) class134.field2063.method1221((byte) 70); var165 != null; var165 = (class85) class134.field2063.method1223(78)) {
                if (class70.field1019 <= var165.field1181 && var165.field1181 < (class70.field1019 + 8) && class325.field5672 <= var165.field1189 && (class325.field5672 + 8) > var165.field1189 && class23.field400 == var165.field1177) {
                    var165.field1192 = 0;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 27) {
            class33.method246(-443);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 40) {
            int var248 = class73.field1058.method1979(0);
            int var249 = class73.field1058.method2008(-24427);
            class199.method1329(var248, var249, -30091);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 67) {
            int var240 = class73.field1058.method1969((byte) -16);
            int var241 = class73.field1058.method2021((byte) 74);
            class127 var242;
            if (var240 >= 0) {
                var242 = class11.method54(false, var240);
            } else {
                var242 = null;
            }
            if (var240 < -70000) {
                var241 += 32768;
            }
            if (var242 != null) {
                for (int var243 = 0; var243 < var242.field1833.length; var243++) {
                    var242.field1833[var243] = 0;
                    var242.field1837[var243] = 0;
                }
            }
            class142.method897(var241, (byte) -56);
            int var244 = class73.field1058.method2021((byte) 74);
            for (int var245 = 0; var245 < var244; var245++) {
                int var246 = class73.field1058.method1997(22720);
                if (var246 == 255) {
                    var246 = class73.field1058.method2008(-24427);
                }
                int var247 = class73.field1058.method1976((byte) 86);
                if (var242 != null && var245 < var242.field1833.length) {
                    var242.field1833[var245] = var247;
                    var242.field1837[var245] = var246;
                }
                class18.method118(var245, -127, var246, var241, var247 - 1);
            }
            if (var242 != null) {
                class272.method1868(22889, var242);
            }
            class137.method865(true);
            class223.field3629[class34.method251(class267.field4495++, 31)] = class34.method251(32767, var241);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 223) {
            int var166 = class73.field1058.method1997(22720);
            int var167 = class73.field1058.method1997(22720);
            int var168 = class73.field1058.method2011(-31);
            class23.field400 = var166 >> 1;
            class85.field1176.method60(3, var167, var168, (var166 & 0x1) == 1);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 52) {
            class62.field938 = class73.field1058.method2011(-62);
            class157.field2512 = class73.field1058.method2011(-78);
            class28.field487 = class73.field1058.method2011(-125);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 192) {
            int var230 = class73.field1058.method1957(810960104);
            if (var230 == 65535) {
                var230 = -1;
            }
            int var231 = class73.field1058.method1995(-12);
            int var232 = class73.field1058.method1957(810960104);
            int var233 = class73.field1058.method1979(0);
            if (var233 == 65535) {
                var233 = -1;
            }
            int var234 = class73.field1058.method1969((byte) -16);
            if (client.method1755(false, var232)) {
                for (int var235 = var233; var235 <= var230; var235++) {
                    long var236 = ((long) var231 << 32) + (long) var235;
                    class84 var238 = (class84) class27.field456.method1586(var236, -53);
                    class84 var239;
                    if (var238 != null) {
                        var239 = new class84(var234, var238.field1170);
                        var238.method1880(-25368);
                    } else if (var235 == -1) {
                        var239 = new class84(var234, class11.method54(false, var231).field1805.field1170);
                    } else {
                        var239 = new class84(var234, -1);
                    }
                    class27.field456.method1593(var236, var239, 27497);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 99) {
            int var169 = class73.field1058.method2021((byte) 74);
            int var170 = class73.field1058.method2011(-25);
            int var171 = class73.field1058.method2011(-34);
            int var172 = class73.field1058.method2011(-102);
            int var173 = class73.field1058.method2011(-17);
            int var174 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var169)) {
                class179.field2858[var170] = true;
                class212.field3434[var170] = var171;
                class215.field3495[var170] = var172;
                class40.field644[var170] = var173;
                class97.field1389[var170] = var174;
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 252) {
            int var175 = class73.field1058.method1995(-89);
            int var176 = class73.field1058.method1957(810960104);
            if (client.method1755(false, var176)) {
                int var177 = 0;
                if (class85.field1176.field177 != null) {
                    var177 = class85.field1176.field177.method1563(4);
                }
                class299.method2092(var177, var175, -112, -1, 3);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 94) {
            int var178 = class73.field1058.method1969((byte) -16);
            int var179 = class73.field1058.method2021((byte) 74);
            if (var178 < -70000) {
                var179 += 32768;
            }
            class127 var180;
            if (var178 < 0) {
                var180 = null;
            } else {
                var180 = class11.method54(false, var178);
            }
            while (class73.field1058.field4946 < class288.field4882) {
                int var181 = 0;
                int var182 = class73.field1058.method2013((byte) -20);
                int var183 = class73.field1058.method2021((byte) 74);
                if (var183 != 0) {
                    var181 = class73.field1058.method2011(-113);
                    if (var181 == 255) {
                        var181 = class73.field1058.method1969((byte) -16);
                    }
                }
                if (var180 != null && var182 >= 0 && var182 < var180.field1833.length) {
                    var180.field1833[var182] = var183;
                    var180.field1837[var182] = var181;
                }
                class18.method118(var182, -35, var181, var179, var183 - 1);
            }
            if (var180 != null) {
                class272.method1868(22889, var180);
            }
            class137.method865(true);
            class223.field3629[class34.method251(class267.field4495++, 31)] = class34.method251(32767, var179);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 214) {
            int var227 = class73.field1058.method1974((byte) 67);
            int var228 = class73.field1058.method1969((byte) -16);
            int var229 = class73.field1058.method1957(810960104);
            if (client.method1755(false, var229)) {
                class321.method2259(var228, -45, var227);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 187) {
            class299.field5190 = class288.field4882 / 8;
            for (int var184 = 0; var184 < class299.field5190; var184++) {
                class11.field133[var184] = class73.field1058.method1968(91);
                class123.field1733[var184] = class160.method1077(108, class11.field133[var184]);
            }
            class276.field4730 = class86.field1212;
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 226) {
            class137.method865(true);
            class94.field1338 = class73.field1058.method2011(-125);
            class294.field5034 = -1;
            class65.field980 = class86.field1212;
            return true;
        } else if (class294.field5034 == 76) {
            int var185 = class73.field1058.method1979(0);
            int var186 = class73.field1058.method1974((byte) 87);
            class97.method658(var186, var185, -1);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 170) {
            int var187 = class73.field1058.method1979(0);
            class313.method2181(true, var187);
            class223.field3629[class34.method251(31, class267.field4495++)] = class34.method251(32767, var187);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 61) {
            byte var225 = class73.field1058.method1962(false);
            int var226 = class73.field1058.method1979(0);
            class199.method1329(var226, var225, -30091);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 208) {
            class252.method1746((byte) 79, false);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 145) {
            int var222 = class73.field1058.method2021((byte) 74);
            int var223 = class73.field1058.method1976((byte) 86);
            int var224 = class73.field1058.method2011(-46);
            if (client.method1755(false, var222)) {
                class294.method2031((byte) -124, var224, var223);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 128) {
            int var221 = class73.field1058.method1995(-7);
            class20.field265 = class34.field572.method964(3, var221);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 188) {
            int var188 = class73.field1058.method2012(-95);
            int var189 = class73.field1058.method1976((byte) 86);
            int var190 = class73.field1058.method2021((byte) 74);
            if (client.method1755(false, var190)) {
                class243.method1664(var188, 65, var189);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 185) {
            int var219 = class73.field1058.method1976((byte) 86);
            int var220 = class73.field1058.method2011(-23);
            if (client.method1755(false, var219)) {
                class121.field1712 = var220;
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 87) {
            int var191 = class73.field1058.method2021((byte) 74);
            int var192 = class73.field1058.method2012(-121);
            class97.method658(var192, var191, -1);
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 64) {
            class235.method1611(0);
            class137.method865(true);
            class294.field5034 = -1;
            class266.field4489 += 32;
            return true;
        } else if (class294.field5034 == 221) {
            int var193 = class73.field1058.method1976((byte) 86);
            int var194 = class73.field1058.method2008(-24427);
            int var195 = class73.field1058.method1979(0);
            int var196 = class73.field1058.method1957(810960104);
            int var197 = class73.field1058.method2021((byte) 74);
            if (var197 == 65535) {
                var197 = -1;
            }
            if (var196 == 65535) {
                var196 = -1;
            }
            if (client.method1755(false, var195)) {
                for (int var198 = var196; var198 <= var197; var198++) {
                    long var199 = ((long) var194 << 32) + (long) var198;
                    class84 var201 = (class84) class27.field456.method1586(var199, -116);
                    class84 var202;
                    if (var201 != null) {
                        var202 = new class84(var201.field1171, var193);
                        var201.method1880(-25368);
                    } else if (var198 == -1) {
                        var202 = new class84(class11.method54(false, var194).field1805.field1171, var193);
                    } else {
                        var202 = new class84(0, var193);
                    }
                    class27.field456.method1593(var199, var202, 27497);
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 241) {
            long var215 = class73.field1058.method1968(82);
            int var217 = class73.field1058.method2021((byte) 74);
            class152 var218 = class22.method177(1, var217).method1056(class73.field1058, 0);
            class251.method1731(var217, 19, (byte) 71, var218, (class152) null, class160.method1077(-110, var215).method1022(-117));
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 50) {
            if (class288.field4882 == 0) {
                class219.field3564 = class249.field4263;
            } else {
                class219.field3564 = class73.field1058.method2017(true);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 131) {
            for (int var213 = 0; var213 < class22.field380.length; var213++) {
                if (class22.field380[var213] != null) {
                    class22.field380[var213].field4240 = -1;
                }
            }
            for (int var214 = 0; var214 < class40.field649.length; var214++) {
                if (class40.field649[var214] != null) {
                    class40.field649[var214].field4240 = -1;
                }
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 136) {
            int var208 = class73.field1058.method1957(810960104);
            int var209 = class73.field1058.method1976((byte) 86);
            int var210 = class73.field1058.method1979(0);
            int var211 = class73.field1058.method1979(0);
            int var212 = class73.field1058.method1969((byte) -16);
            if (client.method1755(false, var209)) {
                class192.method1280(var208, var211, var210, var212, false);
            }
            class294.field5034 = -1;
            return true;
        } else if (class294.field5034 == 114) {
            int var203 = class73.field1058.method1969((byte) -16);
            int var204 = class73.field1058.method1997(22720);
            int var205 = class73.field1058.method2021((byte) 74);
            int var206 = class73.field1058.method1957(810960104);
            if (client.method1755(false, var206)) {
                class122 var207 = (class122) class107.field1519.method1586((long) var203, -72);
                if (var207 != null) {
                    class23.method197(var207, false, var207.field1724 != var205);
                }
                class98.method666(var204, 127, var205, var203);
            }
            class294.field5034 = -1;
            return true;
        } else {
            class169.method1109((Throwable) null, (byte) -120, "T1 - " + class294.field5034 + "," + class59.field902 + "," + class291.field4968 + " - " + class288.field4882);
            class211.method1418(2130);
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILhi;)V", line = 2811)
    public final void method571(int arg0, int arg1, class291 arg2) {
        while (true) {
            int var4 = arg2.method2011(-91);
            if (var4 == 0) {
                field1226++;
                if (arg1 != 0) {
                    field1228 = -43;
                }
                return;
            }
            this.method575(120, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)[Lmj;", line = 2841)
    public static final class229[] method572(boolean arg0) {
        class229[] var1 = new class229[class52.field807];
        int var2 = 0;
        if (arg0) {
            field1217 = (class159) null;
        }
        while (class52.field807 > var2) {
            if (class217.field3516) {
                var1[var2] = new class309(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], class23.field403[var2], class134.field2070);
            } else {
                var1[var2] = new class300(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], class23.field403[var2], class134.field2070);
            }
            var2++;
        }
        class132.method841((byte) -118);
        field1224++;
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)Z", line = 2868)
    public static final boolean method573(byte arg0, int arg1, int arg2) {
        field1219++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        if (arg0 == -53) {
            class270 var3 = class242.method1656(arg2, true);
            return var3.method1854(arg1, (byte) 112);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V", line = 2888)
    public static void method574(boolean arg0) {
        field1217 = null;
        if (arg0) {
            field1225 = 74;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILhi;II)V", line = 2906)
    private final void method575(int arg0, class291 arg1, int arg2, int arg3) {
        int var5 = 103 % ((arg0 - 61) / 49);
        field1227++;
        if (arg2 == 1) {
            this.field1222 = arg1.method2021((byte) 74);
        } else if (arg2 == 2) {
            this.field1216 = arg1.method2011(-79);
            this.field1218 = arg1.method2011(-56);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)I", line = 2928)
    public static final int method576(boolean arg0) {
        if (arg0) {
            field1215++;
            return class241.field3947.method1618(-102);
        } else {
            return 19;
        }
    }
}
