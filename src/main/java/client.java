import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class407 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lpm;")
    public static class349 field2331 = new class349(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lpm;")
    public static class349 field2340 = new class349("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field2341;

    static {
        new class349("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 5)
    private final void method1167(int arg0) {
        field2334++;
        if (class187.field2661.field1111 > class436.field6220) {
            class296.field4283 = (class187.field2661.field1111 - 1) * 250;
            if (class30.field371 == class291.field4234) {
                class291.field4234 = class150.field2246;
            } else {
                class291.field4234 = class30.field371;
            }
            if (class296.field4283 > 3000) {
                class296.field4283 = 3000;
            }
            if (class187.field2661.field1111 >= 2 && class187.field2661.field1110 == 6) {
                this.method2557("js5connect_outofdate", true);
                class423.field6041 = 1000;
                return;
            }
            if (class187.field2661.field1111 >= 4 && class187.field2661.field1110 == -1) {
                this.method2557("js5crc", true);
                class423.field6041 = 1000;
                return;
            }
            if (class187.field2661.field1111 >= 4 && (class423.field6041 == 0 || class423.field6041 == 5)) {
                if (class187.field2661.field1110 == 7 || class187.field2661.field1110 == 9) {
                    this.method2557("js5connect_full", true);
                } else if (class187.field2661.field1110 > 0) {
                    this.method2557("js5connect", true);
                } else {
                    this.method2557("js5io", true);
                }
                class423.field6041 = 1000;
                return;
            }
        }
        class436.field6220 = class187.field2661.field1111;
        if (class296.field4283 > 0) {
            class296.field4283--;
            return;
        }
        try {
            if (arg0 <= 1) {
                field2340 = null;
            }
            if (class246.field3679 == 0) {
                class329.field4770 = class401.field5628.method1536(class291.field4234, class220.field3162, 2099);
                class246.field3679++;
            }
            if (class246.field3679 == 1) {
                if (class329.field4770.field2298 == 2) {
                    this.method1170(0, 1000);
                    return;
                }
                if (class329.field4770.field2298 == 1) {
                    class246.field3679++;
                }
            }
            if (class246.field3679 == 2) {
                class261.field3856 = new class148((Socket) class329.field4770.field2295, class401.field5628);
                class130 var2 = new class130(5);
                var2.method831(15, (byte) 120);
                var2.method849(566, (byte) -67);
                class261.field3856.method1091(false, var2.field1851, 5, 0);
                class246.field3679++;
                class440.field6299 = class18.method107(-16145);
            }
            if (class246.field3679 == 3) {
                if (class423.field6041 == 0 || class423.field6041 == 5 || class261.field3856.method1089((byte) -25) > 0) {
                    int var3 = class261.field3856.method1098((byte) 22);
                    if (var3 != 0) {
                        this.method1170(0, var3);
                        return;
                    }
                    class246.field3679++;
                } else if ((class18.method107(-16145) - class440.field6299) > 30000L) {
                    this.method1170(0, 1001);
                    return;
                }
            }
            if (class246.field3679 == 4) {
                boolean var4 = class423.field6041 == 5 || class423.field6041 == 10 || class423.field6041 == 28;
                class187.field2661.method499(!var4, class261.field3856, 18339);
                class329.field4770 = null;
                class246.field3679 = 0;
                class261.field3856 = null;
            }
        } catch (IOException var5) {
            this.method1170(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbr;)Ld;", line = 152)
    public static final class83 method1168(class223 arg0) {
        class83 var1 = (class83) class166.field2374.method1373(((long) arg0.field3227 << 32) + (long) arg0.field3344, 119);
        return var1 == null ? arg0.field3214 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 157)
    public static final void method1169() {
        int var0 = class403.field5650 ? class334.field4847 : class334.field4847 + class229.field3396;
        for (int var1 = -1; var1 < var0; var1++) {
            class311 var2;
            if (var1 < 0) {
                var2 = class181.field2555;
            } else if (var1 < class334.field4847) {
                var2 = class243.field3596[class26.field323[var1]];
            } else {
                var2 = class442.field6317[class431.field6169[var1 - class334.field4847]];
            }
            var2.field4526 = 0;
            if (var2.field4530 < 0) {
                var2.field4529 = false;
            } else {
                int var3 = var2.method773((byte) 73);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field4463 & 0x7F) != 0 || (var2.field4466 & 0x7F) != 0) {
                        var2.field4529 = false;
                        continue;
                    }
                } else if ((var2.field4463 & 0x7F) != 64 || (var2.field4466 & 0x7F) != 64) {
                    var2.field4529 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field4463 >> 7;
                    int var5 = var2.field4466 >> 7;
                    if (class377.field5364[var4][var5] != var2.field4530) {
                        var2.field4529 = true;
                        continue;
                    }
                    if (class425.field6079[var4][var5] > 1) {
                        var10002 = class425.field6079[var4][var5]--;
                        var2.field4529 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field4463 - var6 >> 7;
                    int var8 = var2.field4466 - var6 >> 7;
                    int var9 = var2.field4463 + var6 >> 7;
                    int var10 = var2.field4466 + var6 >> 7;
                    if (!class361.method2350((byte) 24, var7, var2.field4530, var8, var10, var9)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class377.field5364[var11][var12] == var2.field4530) {
                                    var10002 = class425.field6079[var11][var12]--;
                                }
                            }
                        }
                        var2.field4529 = true;
                        continue;
                    }
                }
                if (var2 instanceof class128 && var2.field4600 != null && class34.field434 >= var2.field4602 && class34.field434 < var2.field4598) {
                    ((class128) var2).field1769 = false;
                }
                var2.field4529 = false;
                var2.field4457 = class452.method2820(class158.field2302, var2.field4466, false, var2.field4463);
                class196.method1395(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 273)
    private final void method1170(int arg0, int arg1) {
        field2325++;
        class187.field2661.field1110 = arg1;
        class246.field3679 = arg0;
        class329.field4770 = null;
        class187.field2661.field1111++;
        class261.field3856 = null;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 285)
    private static final void method1171(int arg0) {
        field2326++;
        if (class213.field3016 != null) {
            return;
        }
        Container var1;
        if (class369.field5255 == null) {
            var1 = class401.field5628.field3154;
        } else {
            var1 = class369.field5255;
        }
        if (arg0 <= 21) {
            return;
        }
        class261.field3865 = var1.getSize().width;
        class338.field4901 = var1.getSize().height;
        if (class369.field5255 == var1) {
            Insets var2 = class369.field5255.getInsets();
            class338.field4901 -= var2.top + var2.bottom;
            class261.field3865 -= var2.right + var2.left;
        }
        if (class436.method2717(false) == 1) {
            class24.field307 = 765;
            class238.field3520 = (class261.field3865 - 765) / 2;
            class19.field251 = 0;
            class316.field4643 = 503;
        } else if (class306.field4461 < 96 && class110.field1418 == 0) {
            int var3 = class261.field3865 <= 1024 ? class261.field3865 : 1024;
            class24.field307 = var3;
            class238.field3520 = (class261.field3865 - var3) / 2;
            int var4 = class338.field4901 <= 768 ? class338.field4901 : 768;
            class19.field251 = 0;
            class316.field4643 = var4;
        } else {
            class24.field307 = class261.field3865;
            class316.field4643 = class338.field4901;
            class19.field251 = 0;
            class238.field3520 = 0;
        }
        if (class214.field3022 != 0) {
            boolean var10000;
            if (class24.field307 < 1024 && class316.field4643 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class117.field1588.setSize(class24.field307, class316.field4643);
        if (class59.field786 != null) {
            class59.field786.method950();
        }
        if (class369.field5255 == var1) {
            Insets var5 = class369.field5255.getInsets();
            class117.field1588.setLocation(class238.field3520 + var5.left, class19.field251 + var5.top);
        } else {
            class117.field1588.setLocation(class238.field3520, class19.field251);
        }
        if (class265.field3898 != -1) {
            class378.method2411((byte) 91, true);
        }
        class158.method1151(-72);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 379)
    public final void method1172(int arg0) {
        field2323++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        method1171(arg0 + 106);
        class231.field3414 = new class284(class401.field5628);
        class187.field2661 = new class85();
        if (class31.field387 != 0) {
            class440.field6292 = new byte[50][];
        }
        class51.method335(0, class401.field5628);
        if (class214.field3022 == 0) {
            class396.field5571 = this.getCodeBase().getHost();
            class165.field2364 = 43594;
            class118.field1608 = 443;
        } else if (class214.field3022 == 1) {
            class396.field5571 = this.getCodeBase().getHost();
            class165.field2364 = class170.field2401 + 40000;
            class118.field1608 = class170.field2401 + 50000;
        } else if (class214.field3022 == 2) {
            class118.field1608 = class170.field2401 + 50000;
            class396.field5571 = "127.0.0.1";
            class165.field2364 = class170.field2401 + 40000;
        }
        class299.field4344 = class165.field2364;
        if (arg0 != 2) {
            return;
        }
        class220.field3162 = class396.field5571;
        class150.field2246 = class118.field1608;
        class30.field371 = class165.field2364;
        class291.field4234 = class299.field4344;
        class255.field3779 = class28.field351 = class379.field5388 = class377.field5368 = new short[256];
        if (class219.field3149 == 3) {
            class426.field6087 = class170.field2401;
        }
        if (class317.field4656 == 1) {
            class24.field303 = 0;
            class191.field2778 = class415.field5945;
            class56.field746 = true;
            class423.field6040 = class317.field4646;
            class262.field3870 = 16777215;
            class199.field2848 = class108.field1410;
            class358.field5175 = class396.field5568;
        } else {
            class423.field6040 = class356.field5157;
            class191.field2778 = class110.field1421;
            class199.field2848 = class334.field4846;
            class358.field5175 = class403.field5653;
        }
        class16.field247 = class240.method1640(false, class117.field1588);
        class270.field3949 = class305.method2063(class117.field1588, (byte) -127, true);
        class207.field2976 = class347.method2280(-121);
        if (class207.field2976 != null) {
            class207.field2976.method50((byte) 123, class117.field1588);
        }
        class69.field924 = class219.field3149;
        try {
            if (class401.field5628.field3140 != null) {
                class105.field1349 = new class150(class401.field5628.field3140, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class43.field585[var3] = new class150(class401.field5628.field3145[var3], 6000, 0);
                }
                class93.field1189 = new class150(class401.field5628.field3148, 6000, 0);
                class243.field3587 = new class233(255, class105.field1349, class93.field1189, 500000);
                class204.field2886 = new class150(class401.field5628.field3152, 24, 0);
                class401.field5628.field3145 = null;
                class401.field5628.field3152 = null;
                class401.field5628.field3148 = null;
                class401.field5628.field3140 = null;
            }
        } catch (IOException var4) {
            class243.field3587 = null;
            class105.field1349 = null;
            class204.field2886 = null;
            class93.field1189 = null;
        }
        if (class214.field3022 != 0) {
            class59.field791 = true;
        }
        if (class317.field4656 == 0) {
            class113.field1470 = class145.field2172.method2284((byte) 112, class309.field4497);
        } else if (class317.field4656 == 1) {
            class113.field1470 = class410.field5884.method2284((byte) -53, class309.field4497);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;ILtj;)Lna;", line = 500)
    public static final class30 method1173(boolean arg0, String arg1, int arg2, class108 arg3) {
        field2339++;
        if (arg2 <= 7) {
            method1168((class223) null);
        }
        int var4 = arg3.method662(5899, arg1);
        if (var4 == -1) {
            return new class30(0);
        }
        int[] var5 = arg3.method634(var4, (byte) -117);
        class30 var6 = new class30(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field369) {
                class130 var9 = new class130(arg3.method643(var4, var5[var8++], true));
                int var10 = var9.method815(true);
                int var11 = var9.method798(false);
                int var12 = var9.method837(true);
                if (!arg0 && var12 == 1) {
                    var6.field369--;
                } else {
                    var6.field366[var7] = var10;
                    var6.field370[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 548)
    public final void method1174(int arg0) {
        method1179(-17742);
        field2322++;
        class426.method2663(false);
        class276.method1871((byte) 112);
        class349.method2290(113);
        class127.method771(57);
        class252.method1754(-78);
        class91.method534(1);
        class366.method2362(-1);
        class425.method2659((byte) 83);
        class191.method1385(-1);
        class407.method2556(false);
        class154.method1132(108);
        class269.method1840(-643);
        class136.method1045(68);
        class130.method836(29869);
        class442.method2751((byte) -120);
        class9.method48(10);
        class148.method1090(false);
        class85.method496(7850);
        class284.method1950(0);
        class436.method2718((byte) -128);
        class178.method1275(11792);
        class108.method657(arg0 ^ 0x4);
        class150.method1112(-120);
        class233.method1612(65280);
        class15.method94(70);
        class446.method2779(-13327);
        class173.method1235((byte) 25);
        class331.method2171(arg0 ^ arg0);
        class145.method1077(false);
        class223.method1563((byte) -108);
        class321.method2131(-30016);
        class128.method785(-3);
        class296.method2001((byte) 39);
        class206.method1453(false);
        class190.method1360((byte) -120);
        class370.method2373(18829);
        class301.method2025((byte) -128);
        class311.method2084(false);
        class335.method2208((byte) 81);
        class102.method595(16383);
        class122.method740(2);
        class253.method1761(arg0 + 31);
        class83.method489((byte) -127);
        class226.method1581(115);
        class205.method1433(true);
        class182.method1305((byte) 6);
        class305.method2055(-8193);
        class92.method548((byte) 87);
        class235.method1618(137);
        class402.method2517((byte) 113);
        class1.method1(126);
        class141.method1064(117);
        class134.method1033(arg0 + 124);
        class334.method2188(arg0 + 29);
        class385.method2445(true);
        class142.method1068((byte) 104);
        class43.method293(72);
        class93.method551(arg0 ^ 0x609F);
        class363.method2354((byte) -96);
        class75.method452(0);
        class435.method2714(0);
        class417.method2631(false);
        class282.method1940(-114);
        class221.method1556((byte) -38);
        class129.method794(arg0 - 4);
        class384.method2441(-110);
        class266.method1820((byte) -17);
        class409.method2579(arg0 - 4);
        class125.method753((byte) 93);
        class248.method1730((byte) -54);
        class242.method1655(false);
        class275.method1868(82);
        class310.method2078(0);
        class186.method1332(-1);
        class153.method1129(arg0 ^ 0x7);
        class418.method2634(6);
        class180.method1292((byte) -87);
        class175.method1237((byte) 121);
        class423.method2650((byte) 53);
        class270.method1849(false);
        class222.method1559((byte) 49);
        class415.method2613((byte) -85);
        class50.method321();
        class118.method726(17209);
        class452.method2814((byte) 111);
        class70.method430(arg0 - 128);
        class73.method442(arg0 ^ 0x7B);
        class408.method2573(732);
        class200.method1414(arg0 ^ 0xFFFFFF9F);
        class424.method2658();
        class176.method1253();
        class324.method2142((byte) -96);
        class194.method1388(-1);
        class400.method2507();
        class189.method1357((byte) 113);
        class297.method2011(19);
        class444.method2769(true);
        class207.method1473(-4440);
        class291.method1977((byte) 66);
        class287.method1961((byte) -100);
        class338.method2229(-89);
        class105.method618((byte) 126);
        class319.method2124(-2);
        class247.method1721(23552);
        class229.method1594(true);
        class386.method2451(118);
        class394.method2478((byte) 110);
        class354.method2316((byte) 110);
        class259.method1791(-17947);
        class397.method2493(-24);
        class3.method9(false);
        class135.method1038(-20914);
        class361.method2346((byte) -56);
        class419.method2637(-43);
        class379.method2415((byte) -12);
        class294.method1991((byte) -63);
        class59.method388(9824);
        class209.method1479(8694);
        class187.method1345(false);
        class87.method519((byte) -98);
        class215.method1504(80);
        class197.method1399(arg0 - 4);
        class166.method1200(31963);
        class320.method2127(0);
        class106.method624(4);
        class318.method2116(arg0 - 93);
        class295.method1998(false);
        class28.method151((byte) -57);
        class433.method2704(-124);
        class398.method2499((byte) -110);
        class288.method1964(arg0 ^ 0x5EF3);
        class344.method2258();
        class110.method673((byte) -73);
        class341.method2237((byte) -12);
        class54.method345((byte) 86);
        class198.method1405(0);
        class328.method2158();
        class377.method2409(-747);
        class371.method2382(true);
        class16.method105(-10163);
        class147.method1087((byte) 120);
        class120.method737((byte) 51);
        class441.method2747(2);
        class353.method2310(arg0 ^ 0xFFFFFFCF);
        class390.method2461(false);
        class21.method116(25453);
        class168.method1205(false);
        class267.method1825(32621);
        class204.method1427(true);
        class115.method690(37);
        class432.method2697(true);
        class199.method1409(200);
        class312.method2100(arg0 ^ 0x7F);
        class13.method72(arg0 - 4);
        class126.method761(1);
        class26.method140(12288);
        class451.method2809((byte) -121);
        class72.method436(-99);
        class254.method1765(1);
        class184.method1324();
        class230.method1596(80);
        class2.method4((byte) 3);
        class117.method716(0);
        class431.method2694((byte) 99);
        class216.method1515((byte) 121);
        class264.method1817((byte) 118);
        class53.method344(-82);
        class413.method2609(108);
        class137.method1047(8);
        class5.method18(true);
        class224.method1573((byte) -4);
        class245.method1704(true);
        class405.method2538((byte) 29);
        class342.method2244(arg0 + 52);
        class347.method2279(-2133843993);
        class65.method415(true);
        class23.method124(16);
        class124.method744();
        class88.method525(-86);
        class430.method2677(arg0 - 31678);
        class410.method2599(true);
        class352.method2298(0);
        class450.method2805(arg0 - 99);
        class411.method2604(true);
        class325.method2145((byte) 101);
        class448.method2794((byte) 120);
        class19.method110(arg0 ^ 0x4);
        class429.method2672((byte) -120);
        class261.method1802(arg0 ^ 0xFFFFA0EB);
        class119.method729(1);
        class343.method2253();
        class63.method405(arg0 ^ 0x65);
        class355.method2321(true);
        class84.method493((byte) 78);
        class94.method555(arg0 - 29);
        class356.method2325(108);
        class243.method1659(-119);
        class274.method1864();
        class195.method1392();
        class299.method2015((byte) -100);
        class309.method2076((byte) 124);
        class24.method129((byte) -30);
        class138.method1052(100);
        class140.method1062((byte) -114);
        class323.method2137(3);
        class11.method62();
        class303.method2039();
        class169.method1208(-123);
        class427.method2666(24512);
        class27.method142();
        class314.method2103(true);
        class40.method265(2);
        class358.method2333(24419);
        class434.method2710((byte) -123);
        class308.method2071(49);
        class34.method189((byte) 123);
        class232.method1605(arg0 + 16711676);
        class68.method423(4080);
        class47.method308(127);
        class32.method180(-403932980);
        class401.method2512(arg0 - 4);
        class238.method1626(arg0 ^ 0x14);
        class241.method1646(-2716);
        class278.method1918((byte) -112);
        class302.method2031((byte) 118);
        class220.method1553(-119);
        class258.method1784(22802);
        class396.method2488(false);
        class213.method1491(arg0 ^ 0x69FBDC08);
        class113.method681(arg0 - 5);
        class332.method2175((byte) -120);
        class103.method597(true);
        class255.method1768(42);
        class56.method369((byte) 111);
        class214.method1499(100);
        class69.method427((byte) -127);
        class228.method1589((byte) -35);
        class131.method859((byte) 89);
        class445.method2774(-113);
        class449.method2796(18);
        class25.method133(1298474736);
        class421.method2644(true);
        class369.method2369(arg0 - 2);
        class333.method2182(16594);
        class240.method1638(105);
        class440.method2742(-128);
        class285.method1958(arg0 - 4100);
        class46.method299((byte) 32);
        class373.method2393(true);
        class246.method1718((byte) 110);
        class439.method2735(-118);
        class262.method1806((byte) 69);
        class317.method2114(-117);
        class44.method295(false);
        class392.method2471((byte) 118);
        class376.method2400(0);
        class162.method1163(arg0 ^ 0x6);
        class58.method377((byte) 117);
        class10.method54(arg0 - 3);
        class8.method45(1);
        class374.method2394(false);
        class20.method111(false);
        class393.method2474((byte) -107);
        class185.method1326((byte) -124);
        class340.method2234(0);
        class212.method1490((byte) -102);
        class265.method1818((byte) 61);
        class181.method1298(9020);
        class116.method703();
        class389.method2459();
        class447.method2789(arg0 ^ 0xFFFFBFFB);
        class96.method567(123);
        class438.method2733(arg0 ^ 0x71);
        class97.method576(27778);
        class336.method2210(0);
        class293.method1982(16);
        class381.method2427(124);
        class403.method2522(-21175);
        class329.method2164((byte) -11);
        class365.method2359(arg0 + 50);
        class231.method1602((byte) 113);
        class359.method2336(false);
        class86.method517((byte) 4);
        class109.method669(23355);
        class378.method2410(arg0 - 8);
        class170.method1214(7043);
        class327.method2147((byte) -51);
        class100.method585((byte) -35);
        class114.method685((byte) 112);
        class249.method1732(27337);
        class382.method2435(arg0 ^ 0x2);
        class399.method2501(false);
        class80.method472(-7563);
        class196.method1397(-53);
        class357.method2330(-5854);
        class428.method2670((byte) 108);
        class64.method411(arg0 + 25499);
        class289.method1969(18574);
        class31.method171(arg0 ^ 0x22627748);
        class33.method182((byte) -82);
        class171.method1219(-1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lbr;IIIIIIIII)V", line = 859)
    public static final void method1175(class223[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class223 var11 = arg0[var10];
            if (var11 != null && var11.field3212 == arg1) {
                int var12 = var11.field3187 + arg6;
                int var13 = var11.field3191 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3208 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3250 + var12;
                    int var19 = var11.field3282 + var13;
                    if (var11.field3208 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field3208 == 0 || var11.field3322 || method1168(var11).field1055 != 0 || class363.field5212 == var11 || var11.field3281 == 1338) {
                    if (!method1182(var11)) {
                        if (class327.field4749 == var11) {
                            class51.field666 = true;
                            class74.field955 = var12;
                            class442.field6323 = var13;
                        }
                        if (var11.field3205 || var14 < var16 && var15 < var17) {
                            if (var11.field3208 == 0 && var11.field3194 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class79 var20 = (class79) class23.field292.method2752(-77); var20 != null; var20 = (class79) class23.field292.method2754(-1)) {
                                    if (var20.field1020) {
                                        var20.method2660((byte) 118);
                                        var20.field1018.field3243 = false;
                                    }
                                }
                                if (class13.field186 == 0) {
                                    class327.field4749 = null;
                                    class363.field5212 = null;
                                }
                                class73.field948 = 0;
                                class33.field421 = false;
                                class108.field1409 = false;
                                if (!class359.field5185) {
                                    class329.method2163(0);
                                }
                            }
                            boolean var21;
                            if (class270.field3949.method536(0) >= var14 && class270.field3949.method543(7) >= var15 && class270.field3949.method536(0) < var16 && class270.field3949.method543(7) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class359.field5185 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class436.method2728(arg8 - var12, arg9 - var13, (byte) 127, var11);
                            }
                            boolean var22 = false;
                            if (class270.field3949.method537(42) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class252.field3744 != null && class252.field3744.method474((byte) 18) == 0 && class252.field3744.method476(-2) >= var14 && class252.field3744.method471((byte) 117) >= var15 && class252.field3744.method476(120) < var16 && class252.field3744.method471((byte) -35) < var17) {
                                var23 = true;
                            }
                            if (var11.field3300 != null) {
                                for (int var24 = 0; var24 < var11.field3300.length; var24++) {
                                    if (class16.field247.method1758(-501, var11.field3300[var24])) {
                                        if (var11.field3221 == null || class34.field434 >= var11.field3221[var24]) {
                                            byte var25 = var11.field3326[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class16.field247.method1758(-501, 86) && !class16.field247.method1758(-501, 82) && !class16.field247.method1758(-501, 81)) && ((var25 & 0x2) == 0 || class16.field247.method1758(-501, 86)) && ((var25 & 0x1) == 0 || class16.field247.method1758(-501, 82)) && ((var25 & 0x4) == 0 || class16.field247.method1758(-501, 81))) {
                                                class382.method2432((byte) 49, -1, var24 + 1, "", var11.field3227);
                                                int var26 = var11.field3295[var24];
                                                if (var11.field3221 == null) {
                                                    var11.field3221 = new int[var11.field3300.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field3221[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field3221[var24] = class34.field434 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field3221 != null) {
                                        var11.field3221[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class316.method2111(class252.field3744.method476(125) - var12, false, class252.field3744.method471((byte) -30) - var13, var11);
                            }
                            if (class327.field4749 != null && class327.field4749 != var11 && var21 && method1168(var11).method484((byte) 97)) {
                                class247.field3690 = var11;
                            }
                            if (class363.field5212 == var11) {
                                class346.field5032 = true;
                                class260.field3843 = var12;
                                class79.field1019 = var13;
                            }
                            if (var11.field3322 || var11.field3281 != 0) {
                                if (var21 && class6.field90 != 0 && var11.field3301 != null) {
                                    class79 var27 = new class79();
                                    var27.field1020 = true;
                                    var27.field1018 = var11;
                                    var27.field1024 = class6.field90;
                                    var27.field1028 = var11.field3301;
                                    class23.field292.method2756(-56, var27);
                                }
                                if (class327.field4749 != null || class359.field5185 || var11.field3281 != 1400 && class73.field948 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field3281 != 0) {
                                    if (var11.field3281 == 1337 || var11.field3281 == 1403) {
                                        class232.field3433 = var11;
                                        if (class429.field6097 != null) {
                                            class429.field6097.method2166(var11.field3282, class59.field786, false);
                                        }
                                        if (var11.field3281 == 1337) {
                                            if (!class359.field5185 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class126.method760(arg9, class59.field786, arg8, (byte) 75);
                                                for (class117 var28 = (class117) class288.field4198.method1082(109); var28 != null; var28 = (class117) class288.field4198.method1078(false)) {
                                                    if (arg8 >= var28.field1589 && arg8 < var28.field1590 && arg9 >= var28.field1586 && arg9 < var28.field1584) {
                                                        class329.method2163(0);
                                                        class308.method2069((byte) 65, var28.field1587);
                                                    }
                                                }
                                            }
                                            class369.method2367(var11, var13, var12, (byte) 121);
                                            continue;
                                        }
                                    }
                                    if (var11.field3281 == 1338) {
                                        if (var11.method1567((byte) 122, class59.field786) == null || class259.field3833 != 0 && class259.field3833 != 3 || class359.field5185 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field3256[var30];
                                        if (var29 < var31 || var29 > var11.field3211[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field3250 / 2;
                                        int var33 = var30 - var11.field3282 / 2;
                                        int var34;
                                        if (class336.field4878 == 4) {
                                            var34 = (int) class358.field5176 & 0x3FFF;
                                        } else {
                                            var34 = (int) class358.field5176 + class63.field842 & 0x3FFF;
                                        }
                                        int var35 = class447.field6381[var34];
                                        int var36 = class447.field6390[var34];
                                        if (class336.field4878 != 4) {
                                            var35 = (class261.field3863 + 256) * var35 >> 8;
                                            var36 = (class261.field3863 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class336.field4878 == 4) {
                                            var39 = (class302.field4402 >> 7) + (var37 >> 2);
                                            var40 = (class165.field2348 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class181.field2555.method773((byte) 79) - 1) * 64;
                                            var39 = (class181.field2555.field4463 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class181.field2555.field4466 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class269.field3935 && (class432.field6182 & 0x40) != 0) {
                                            class223 var42 = class299.method2016(class261.field3855, class128.field1814, (byte) 124);
                                            if (var42 == null) {
                                                class63.method402(18002);
                                            } else {
                                                class252.method1755(1L, " ->", 48, class442.field6319, (byte) 113, class285.field4153, var39, var40);
                                            }
                                            continue;
                                        }
                                        if (class317.field4656 == 1) {
                                            class252.method1755(1L, "", 45, -1, (byte) 60, class1.field3.method2284((byte) -71, class309.field4497), var39, var40);
                                        }
                                        class252.method1755(1L, "", 57, -1, (byte) -96, class26.field318, var39, var40);
                                        continue;
                                    }
                                    if (var11.field3281 == 1400) {
                                        class447.field6383 = var11;
                                        if (var21) {
                                            class33.field421 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class252.field3744.method476(-86) - var12 - var11.field3250 / 2) * 2.0D / (double) class176.field2468);
                                            int var44 = (int) (-((double) (class252.field3744.method471((byte) 92) - var13 - var11.field3282 / 2) * 2.0D / (double) class176.field2468));
                                            int var45 = class170.field2407 + var43 + class176.field2486;
                                            int var46 = class175.field2459 + var44 + class176.field2493;
                                            class173 var47 = class130.method797(0);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1230(var45, var48, var46, (byte) 81);
                                            if (var48 != null) {
                                                if (class16.field247.method1758(-501, 82) && class316.field4628 > 0) {
                                                    class97.method575(-13945, var48[1], var48[2], var48[0]);
                                                    continue;
                                                }
                                                class108.field1409 = true;
                                                class402.field5645 = var48[0];
                                                class9.field117 = var48[1];
                                                class241.field3565 = var48[2];
                                            }
                                            class73.field948 = 1;
                                            class228.field3390 = false;
                                            class129.field1817 = class270.field3949.method536(0);
                                            class447.field6384 = class270.field3949.method543(7);
                                            continue;
                                        }
                                        if (var22 && class73.field948 > 0) {
                                            if (class73.field948 == 1 && (class129.field1817 != class270.field3949.method536(0) || class447.field6384 != class270.field3949.method543(7))) {
                                                class238.field3521 = class170.field2407;
                                                class357.field5165 = class175.field2459;
                                                class73.field948 = 2;
                                            }
                                            if (class73.field948 == 2) {
                                                class228.field3390 = true;
                                                class158.method1154(1, class238.field3521 + (int) ((double) (class129.field1817 - class270.field3949.method536(0)) * 2.0D / (double) class176.field2471));
                                                class341.method2240(-1, class357.field5165 - (int) ((double) (class447.field6384 - class270.field3949.method543(7)) * 2.0D / (double) class176.field2471));
                                            }
                                            continue;
                                        }
                                        if (class73.field948 > 0 && !class228.field3390) {
                                            if ((class335.field4856 == 1 || class311.method2096(2)) && class381.field5412 > 2) {
                                                class397.method2491(class129.field1817, class447.field6384, (byte) -115, 2);
                                            } else if (class415.method2614(0)) {
                                                class397.method2491(class129.field1817, class447.field6384, (byte) -69, 0);
                                            }
                                        }
                                        class73.field948 = 0;
                                        continue;
                                    }
                                    if (var11.field3281 == 1401) {
                                        if (var22) {
                                            class451.method2810(var11.field3282, class270.field3949.method536(0) - var12, -15694, class270.field3949.method543(7) - var13, var11.field3250);
                                        }
                                        continue;
                                    }
                                    if (var11.field3281 == 1406) {
                                        class267.method1826((byte) -72, var11, var13, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field3342 && var23) {
                                    var11.field3342 = true;
                                    if (var11.field3188 != null) {
                                        class79 var49 = new class79();
                                        var49.field1020 = true;
                                        var49.field1018 = var11;
                                        var49.field1011 = class252.field3744.method476(121) - var12;
                                        var49.field1024 = class252.field3744.method471((byte) -69) - var13;
                                        var49.field1028 = var11.field3188;
                                        class23.field292.method2756(-109, var49);
                                    }
                                }
                                if (var11.field3342 && var22 && var11.field3307 != null) {
                                    class79 var50 = new class79();
                                    var50.field1020 = true;
                                    var50.field1018 = var11;
                                    var50.field1011 = class270.field3949.method536(0) - var12;
                                    var50.field1024 = class270.field3949.method543(7) - var13;
                                    var50.field1028 = var11.field3307;
                                    class23.field292.method2756(-67, var50);
                                }
                                if (var11.field3342 && !var22) {
                                    var11.field3342 = false;
                                    if (var11.field3298 != null) {
                                        class79 var51 = new class79();
                                        var51.field1020 = true;
                                        var51.field1018 = var11;
                                        var51.field1011 = class270.field3949.method536(0) - var12;
                                        var51.field1024 = class270.field3949.method543(7) - var13;
                                        var51.field1028 = var11.field3298;
                                        class196.field2811.method2756(39, var51);
                                    }
                                }
                                if (var22 && var11.field3336 != null) {
                                    class79 var52 = new class79();
                                    var52.field1020 = true;
                                    var52.field1018 = var11;
                                    var52.field1011 = class270.field3949.method536(0) - var12;
                                    var52.field1024 = class270.field3949.method543(7) - var13;
                                    var52.field1028 = var11.field3336;
                                    class23.field292.method2756(118, var52);
                                }
                                if (!var11.field3243 && var21) {
                                    var11.field3243 = true;
                                    if (var11.field3328 != null) {
                                        class79 var53 = new class79();
                                        var53.field1020 = true;
                                        var53.field1018 = var11;
                                        var53.field1011 = class270.field3949.method536(0) - var12;
                                        var53.field1024 = class270.field3949.method543(7) - var13;
                                        var53.field1028 = var11.field3328;
                                        class23.field292.method2756(83, var53);
                                    }
                                }
                                if (var11.field3243 && var21 && var11.field3318 != null) {
                                    class79 var54 = new class79();
                                    var54.field1020 = true;
                                    var54.field1018 = var11;
                                    var54.field1011 = class270.field3949.method536(0) - var12;
                                    var54.field1024 = class270.field3949.method543(7) - var13;
                                    var54.field1028 = var11.field3318;
                                    class23.field292.method2756(81, var54);
                                }
                                if (var11.field3243 && !var21) {
                                    var11.field3243 = false;
                                    if (var11.field3285 != null) {
                                        class79 var55 = new class79();
                                        var55.field1020 = true;
                                        var55.field1018 = var11;
                                        var55.field1011 = class270.field3949.method536(0) - var12;
                                        var55.field1024 = class270.field3949.method543(7) - var13;
                                        var55.field1028 = var11.field3285;
                                        class196.field2811.method2756(-99, var55);
                                    }
                                }
                                if (var11.field3193 != null) {
                                    class79 var56 = new class79();
                                    var56.field1018 = var11;
                                    var56.field1028 = var11.field3193;
                                    class5.field78.method2756(94, var56);
                                }
                                if (var11.field3217 != null && class40.field557 > var11.field3230) {
                                    if (var11.field3257 == null || class40.field557 - var11.field3230 > 32) {
                                        class79 var61 = new class79();
                                        var61.field1018 = var11;
                                        var61.field1028 = var11.field3217;
                                        class23.field292.method2756(72, var61);
                                    } else {
                                        label670: for (int var57 = var11.field3230; var57 < class40.field557; var57++) {
                                            int var58 = class441.field6315[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field3257.length; var59++) {
                                                if (var11.field3257[var59] == var58) {
                                                    class79 var60 = new class79();
                                                    var60.field1018 = var11;
                                                    var60.field1028 = var11.field3217;
                                                    class23.field292.method2756(39, var60);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3230 = class40.field557;
                                }
                                if (var11.field3220 != null && class363.field5211 > var11.field3327) {
                                    if (var11.field3286 == null || class363.field5211 - var11.field3327 > 32) {
                                        class79 var66 = new class79();
                                        var66.field1018 = var11;
                                        var66.field1028 = var11.field3220;
                                        class23.field292.method2756(-78, var66);
                                    } else {
                                        label646: for (int var62 = var11.field3327; var62 < class363.field5211; var62++) {
                                            int var63 = class347.field5058[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field3286.length; var64++) {
                                                if (var11.field3286[var64] == var63) {
                                                    class79 var65 = new class79();
                                                    var65.field1018 = var11;
                                                    var65.field1028 = var11.field3220;
                                                    class23.field292.method2756(-87, var65);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3327 = class363.field5211;
                                }
                                if (var11.field3209 != null && class320.field4690 > var11.field3312) {
                                    if (var11.field3270 == null || class320.field4690 - var11.field3312 > 32) {
                                        class79 var71 = new class79();
                                        var71.field1018 = var11;
                                        var71.field1028 = var11.field3209;
                                        class23.field292.method2756(60, var71);
                                    } else {
                                        label622: for (int var67 = var11.field3312; var67 < class320.field4690; var67++) {
                                            int var68 = class197.field2825[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field3270.length; var69++) {
                                                if (var11.field3270[var69] == var68) {
                                                    class79 var70 = new class79();
                                                    var70.field1018 = var11;
                                                    var70.field1028 = var11.field3209;
                                                    class23.field292.method2756(54, var70);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3312 = class320.field4690;
                                }
                                if (var11.field3213 != null && class1.field5 > var11.field3308) {
                                    if (var11.field3313 == null || class1.field5 - var11.field3308 > 32) {
                                        class79 var76 = new class79();
                                        var76.field1018 = var11;
                                        var76.field1028 = var11.field3213;
                                        class23.field292.method2756(118, var76);
                                    } else {
                                        label598: for (int var72 = var11.field3308; var72 < class1.field5; var72++) {
                                            int var73 = class435.field6213[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field3313.length; var74++) {
                                                if (var11.field3313[var74] == var73) {
                                                    class79 var75 = new class79();
                                                    var75.field1018 = var11;
                                                    var75.field1028 = var11.field3213;
                                                    class23.field292.method2756(81, var75);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3308 = class1.field5;
                                }
                                if (var11.field3231 != null && class355.field5140 > var11.field3190) {
                                    if (var11.field3247 == null || class355.field5140 - var11.field3190 > 32) {
                                        class79 var81 = new class79();
                                        var81.field1018 = var11;
                                        var81.field1028 = var11.field3231;
                                        class23.field292.method2756(59, var81);
                                    } else {
                                        label574: for (int var77 = var11.field3190; var77 < class355.field5140; var77++) {
                                            int var78 = class297.field4329[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field3247.length; var79++) {
                                                if (var11.field3247[var79] == var78) {
                                                    class79 var80 = new class79();
                                                    var80.field1018 = var11;
                                                    var80.field1028 = var11.field3231;
                                                    class23.field292.method2756(-66, var80);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3190 = class355.field5140;
                                }
                                if (class125.field1670 > var11.field3299 && var11.field3261 != null) {
                                    class79 var82 = new class79();
                                    var82.field1018 = var11;
                                    var82.field1028 = var11.field3261;
                                    class23.field292.method2756(-93, var82);
                                }
                                if (class444.field6344 > var11.field3299 && var11.field3197 != null) {
                                    class79 var83 = new class79();
                                    var83.field1018 = var11;
                                    var83.field1028 = var11.field3197;
                                    class23.field292.method2756(-87, var83);
                                }
                                if (class401.field5626 > var11.field3299 && var11.field3280 != null) {
                                    class79 var84 = new class79();
                                    var84.field1018 = var11;
                                    var84.field1028 = var11.field3280;
                                    class23.field292.method2756(-69, var84);
                                }
                                if (class213.field3009 > var11.field3299 && var11.field3262 != null) {
                                    class79 var85 = new class79();
                                    var85.field1018 = var11;
                                    var85.field1028 = var11.field3262;
                                    class23.field292.method2756(-56, var85);
                                }
                                if (class105.field1348 > var11.field3299 && var11.field3320 != null) {
                                    class79 var86 = new class79();
                                    var86.field1018 = var11;
                                    var86.field1028 = var11.field3320;
                                    class23.field292.method2756(-76, var86);
                                }
                                var11.field3299 = class428.field6095;
                                if (var11.field3249 != null) {
                                    for (int var87 = 0; var87 < class379.field5387; var87++) {
                                        class79 var88 = new class79();
                                        var88.field1018 = var11;
                                        var88.field1026 = class332.field4830[var87].method668(3);
                                        var88.field1025 = class332.field4830[var87].method665(100);
                                        var88.field1028 = var11.field3249;
                                        class23.field292.method2756(-97, var88);
                                    }
                                }
                                if (class441.field6310 && var11.field3242 != null) {
                                    class79 var89 = new class79();
                                    var89.field1018 = var11;
                                    var89.field1028 = var11.field3242;
                                    class23.field292.method2756(-120, var89);
                                }
                            }
                            if (var11.field3208 == 5 && var11.field3226 != -1) {
                                var11.method1566(-440410896).method2166(var11.field3282, class59.field786, false);
                            }
                            class122.method741(var11, 3);
                            if (var11.field3208 == 0) {
                                method1175(arg0, var11.field3227, var14, var15, var16, var17, var12 - var11.field3341, var13 - var11.field3240, arg8, arg9);
                                if (var11.field3246 != null) {
                                    method1175(var11.field3246, var11.field3227, var14, var15, var16, var17, var12 - var11.field3341, var13 - var11.field3240, arg8, arg9);
                                }
                                class253 var90 = (class253) class318.field4662.method1373((long) var11.field3227, 123);
                                if (var90 != null) {
                                    if (var90.field3748 == 0 && !class359.field5185 && var21 && !class450.field6455) {
                                        class329.method2163(0);
                                    }
                                    class3.method6(var15, -10776, var16, arg9, var13, var14, arg8, var90.field3746, var17, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class122.method741(var11, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lbr;)Lbr;", line = 1744)
    public static final class223 method1176(class223 arg0) {
        int var1 = method1168(arg0).method487((byte) -64);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class438.method2732(arg0.field3212, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I", line = 1767)
    public static final int method1177(int arg0) {
        field2328++;
        if (arg0 == 18) {
            class15 var1 = class332.field4822;
            synchronized (class332.field4822) {
                return class332.field4822.method92(arg0 ^ 0x12);
            }
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1781)
    private final void method1178(byte arg0) {
        class239.field3529++;
        field2338++;
        class369.method2367((class223) null, -1, -1, (byte) 2);
        class267.method1826((byte) -72, (class223) null, -1, -1);
        class153.method1130((byte) 122);
        class428.field6095++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class446 var12 = class442.field6317[var2];
            if (var12 != null) {
                byte var13 = var12.field6375.field5042;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method773((byte) 91);
                    if ((var13 & 0x2) != 0 && var12.field4599 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field4595[0] + var15;
                            int var18 = var12.field4601[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class80.field1034 - var14 - 1 < var17) {
                                var17 = class80.field1034 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class381.field5414 - var14 - 1)) {
                                var18 = class381.field5414 - var14 - 1;
                            }
                            int var19 = class384.method2443(class333.field4840, var18, -1, 0, true, 0, 0, var12.field4601[0], class186.field2660, var14, var17, class85.field1090[var12.field4464], var14, var14, var12.field4595[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field4595[var20] = class333.field4840[var19 - var20 - 1];
                                    var12.field4601[var20] = class186.field2660[var19 - (var20 + 1)];
                                    var12.field4606[var20] = 1;
                                }
                                var12.field4599 = var19;
                            }
                        }
                    }
                    class435.method2715(var12, (byte) 19, true);
                    int var21 = class177.method1266((byte) 14, var12);
                    class232.method1608(var12, class73.field946, class21.field274, var21, 104);
                    class240.method1632(var12, 0);
                }
            }
        }
        if (class215.field3080 == 0 && class415.field5926 == 0) {
            if (class336.field4878 == 2) {
                class331.method2168(-3073);
            } else {
                class266.method1823(true);
            }
            if (class386.field5469 >> 7 < 14 || (class80.field1034 - 14) <= (class386.field5469 >> 7) || class417.field5999 >> 7 < 14 || (class417.field5999 >> 7) >= (class381.field5414 - 14)) {
                class137.method1048(true);
            }
        }
        if (arg0 != -47) {
            return;
        }
        while (true) {
            class79 var3;
            class223 var4;
            class223 var5;
            do {
                var3 = (class79) class5.field78.method2748(arg0 - 66);
                if (var3 == null) {
                    while (true) {
                        class79 var6;
                        class223 var7;
                        class223 var8;
                        do {
                            var6 = (class79) class196.field2811.method2748(-123);
                            if (var6 == null) {
                                while (true) {
                                    class79 var9;
                                    class223 var10;
                                    class223 var11;
                                    do {
                                        var9 = (class79) class23.field292.method2748(-110);
                                        if (var9 == null) {
                                            if (class327.field4749 != null) {
                                                class240.method1639(-80);
                                            }
                                            if ((class34.field434 % 1500) == 0) {
                                                class150.method1111((byte) -38);
                                            }
                                            class23.method123(-20339);
                                            if (class242.field3580 && class18.method107(arg0 - 16098) - 60000L > class380.field5398) {
                                                class365.method2358(-18);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1018;
                                        if (var10.field3344 < 0) {
                                            break;
                                        }
                                        var11 = class438.method2732(var10.field3212, 0);
                                    } while (var11 == null || var11.field3246 == null || var10.field3344 >= var11.field3246.length || var11.field3246[var10.field3344] != var10);
                                    class424.method2655(var9);
                                }
                            }
                            var7 = var6.field1018;
                            if (var7.field3344 < 0) {
                                break;
                            }
                            var8 = class438.method2732(var7.field3212, 0);
                        } while (var8 == null || var8.field3246 == null || var8.field3246.length <= var7.field3344 || var8.field3246[var7.field3344] != var7);
                        class424.method2655(var6);
                    }
                }
                var4 = var3.field1018;
                if (var4.field3344 < 0) {
                    break;
                }
                var5 = class438.method2732(var4.field3212, 0);
            } while (var5 == null || var5.field3246 == null || var4.field3344 >= var5.field3246.length || var5.field3246[var4.field3344] != var4);
            class424.method2655(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 1983)
    public static void method1179(int arg0) {
        field2331 = null;
        if (arg0 != -17742) {
            field2340 = null;
        }
        field2340 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 1996)
    private final void method1180(byte[] arg0, int arg1) {
        field2337++;
        if (arg1 != -6) {
            return;
        }
        class130 var3 = new class130(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method837(true);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class325.field4724 = new int[6];
                        var9[0] = var3.method798(false);
                        var9[1] = var3.method798(false);
                        var9[2] = var3.method798(false);
                        var9[3] = var3.method798(false);
                        var9[4] = var3.method798(false);
                        var9[5] = var3.method798(false);
                    } else if (var4 == 4) {
                        int var5 = var3.method837(true);
                        class58.field773 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class58.field773[var6] = var3.method798(false);
                            if (class58.field773[var6] == 65535) {
                                class58.field773[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method837(true);
                        class429.field6101 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class429.field6101[var8] = var3.method798(false);
                            if (class429.field6101[var8] == 65535) {
                                class429.field6101[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2073)
    public static final void method1181() {
        for (int var0 = 0; var0 < class80.field1034; var0++) {
            int[] var1 = class377.field5364[var0];
            for (int var2 = 0; var2 < class381.field5414; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2091)
    public final void init() {
        field2324++;
        if (!this.method2559(18)) {
            return;
        }
        class170.field2401 = Integer.parseInt(this.getParameter("worldid"));
        class214.field3022 = Integer.parseInt(this.getParameter("modewhere"));
        if (class214.field3022 < 0 || class214.field3022 > 1) {
            class214.field3022 = 0;
        }
        class31.field387 = Integer.parseInt(this.getParameter("modewhat"));
        if (class31.field387 < 0 || class31.field387 > 2) {
            class31.field387 = 0;
        }
        try {
            class309.field4497 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class309.field4497 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class118.field1607 = true;
        } else {
            class118.field1607 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class264.field3879 = true;
        } else {
            class264.field3879 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class317.field4656 = 1;
        } else {
            class317.field4656 = 0;
        }
        try {
            class363.field5213 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class363.field5213 = 0;
        }
        class282.field4049 = this.getParameter("quiturl");
        class324.field4720 = this.getParameter("settings");
        if (class324.field4720 == null) {
            class324.field4720 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class376.field5354 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class376.field5354 = 0;
            }
        }
        class356.field5155 = Integer.parseInt(this.getParameter("colourid"));
        if (class356.field5155 < 0 || class356.field5155 >= class294.field4243.length) {
            class356.field5155 = 0;
        }
        class296.field4282 = this;
        this.method2571(503, class31.field387 + 32, 566, 765, false);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lbr;)Z", line = 2165)
    public static final boolean method1182(class223 arg0) {
        if (class450.field6455) {
            if (method1168(arg0).field1055 != 0) {
                return false;
            }
            if (arg0.field3208 == 0) {
                return false;
            }
        }
        return arg0.field3316;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2180)
    public static final void method1183() {
        for (int var0 = -1; var0 < class334.field4847 + class229.field3396; var0++) {
            class311 var1;
            if (var0 < 0) {
                var1 = class181.field2555;
            } else if (var0 < class334.field4847) {
                var1 = class243.field3596[class26.field323[var0]];
            } else {
                var1 = class442.field6317[class431.field6169[var0 - class334.field4847]];
            }
            if (var1.field4530 >= 0) {
                int var2 = var1.method773((byte) 100);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field4463 & 0x7F) != 0 || (var1.field4466 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field4463 & 0x7F) != 64 || (var1.field4466 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field4463 >> 7;
                    int var4 = var1.field4466 >> 7;
                    if (var1.field4530 > class377.field5364[var3][var4]) {
                        class377.field5364[var3][var4] = var1.field4530;
                        class425.field6079[var3][var4] = 1;
                    } else if (class377.field5364[var3][var4] == var1.field4530) {
                        var10002 = class425.field6079[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field4463 - var5 >> 7;
                    int var7 = var1.field4466 - var5 >> 7;
                    int var8 = var1.field4463 + var5 >> 7;
                    int var9 = var1.field4466 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field4530 > class377.field5364[var10][var11]) {
                                class377.field5364[var10][var11] = var1.field4530;
                                class425.field6079[var10][var11] = 1;
                            } else if (class377.field5364[var10][var11] == var1.field4530) {
                                var10002 = class425.field6079[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2273)
    private final void method1184(boolean arg0) {
        if (arg0) {
            method1176((class223) null);
        }
        field2330++;
        if (!class338.field4903) {
            for (int var2 = 0; var2 < class379.field5387; var2++) {
                if (class332.field4830[var2].method665(100) == 's' || class332.field4830[var2].method665(100) == 'S') {
                    class338.field4903 = true;
                    break;
                }
            }
        }
        if (class447.field6391 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class18.method107(-16145);
            if (class56.field750 == 0L) {
                class56.field750 = var5;
            }
            if (var4 > 16384 && var5 - class56.field750 < 5000L) {
                if ((var5 - class70.field936) > 1000L) {
                    System.gc();
                    class70.field936 = var5;
                }
                class413.field5905 = class439.field6286.method2284((byte) 97, class309.field4497);
                class285.field4142 = 5;
            } else {
                class413.field5905 = class108.field1381.method2284((byte) 90, class309.field4497);
                class285.field4142 = 5;
                class447.field6391 = 10;
            }
        } else if (class447.field6391 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class85.field1090[var7] = class178.method1271(13801, class381.field5414, class80.field1034);
            }
            class413.field5905 = class356.field5152.method2284((byte) -73, class309.field4497);
            class285.field4142 = 10;
            class447.field6391 = 20;
        } else if (class447.field6391 == 20) {
            if (class293.field4240 == null) {
                class293.field4240 = new class436(class187.field2661, class231.field3414);
            }
            if (class293.field4240.method2727(127)) {
                class105.field1350 = class452.method2817(1000000, 0, false, true, 1);
                class222.field3179 = class452.method2817(1000000, 1, false, true, 1);
                class365.field5227 = class452.method2817(1000000, 2, false, true, 1);
                class213.field3010 = class452.method2817(1000000, 3, false, true, 1);
                class119.field1609 = class452.method2817(1000000, 4, false, true, 1);
                class226.field3370 = class452.method2817(1000000, 5, true, true, 1);
                class72.field942 = class452.method2817(1000000, 6, true, false, 1);
                class287.field4167 = class452.method2817(1000000, 7, false, true, 1);
                class15.field216 = class452.method2817(1000000, 8, false, true, 1);
                class264.field3888 = class452.method2817(1000000, 9, false, true, 1);
                class170.field2406 = class452.method2817(1000000, 10, false, true, 1);
                class173.field2448 = class452.method2817(1000000, 11, false, true, 1);
                class311.field4563 = class452.method2817(1000000, 12, false, true, 1);
                class327.field4745 = class452.method2817(1000000, 13, false, true, 1);
                class413.field5910 = class452.method2817(1000000, 14, false, false, 1);
                class229.field3395 = class452.method2817(1000000, 15, false, true, 1);
                class245.field3662 = class452.method2817(1000000, 16, false, true, 1);
                class47.field625 = class452.method2817(1000000, 17, false, true, 1);
                class224.field3357 = class452.method2817(1000000, 18, false, true, 1);
                class449.field6414 = class452.method2817(1000000, 19, false, true, 1);
                class418.field6002 = class452.method2817(1000000, 20, false, true, 1);
                class196.field2813 = class452.method2817(1000000, 21, false, true, 1);
                class122.field1636 = class452.method2817(1000000, 22, false, true, 1);
                class284.field4140 = class452.method2817(1000000, 23, true, true, 1);
                class83.field1064 = class452.method2817(1000000, 24, false, true, 1);
                class247.field3702 = class452.method2817(1000000, 25, false, true, 1);
                class278.field4004 = class452.method2817(1000000, 26, true, true, 1);
                class331.field4795 = class452.method2817(1000000, 27, false, true, 1);
                class331.field4794 = class452.method2817(1000000, 28, true, true, 1);
                class413.field5905 = class379.field5386.method2284((byte) 120, class309.field4497);
                class447.field6391 = 30;
                class285.field4142 = 15;
            } else {
                class413.field5905 = class445.field6356.method2284((byte) -47, class309.field4497);
                class285.field4142 = 12;
            }
        } else if (class447.field6391 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class258.field3825[var9].method1274(28706) * class137.field2113[var9] / 100;
            }
            if (var8 == 100) {
                class413.field5905 = class180.field2545.method2284((byte) -104, class309.field4497);
                class285.field4142 = 20;
                class270.method1845(class15.field216, false);
                class64.method409(class15.field216, true);
                class447.field6391 = 40;
            } else {
                if (var8 != 0) {
                    class413.field5905 = class284.field4123.method2284((byte) 127, class309.field4497) + var8 + "%";
                }
                class285.field4142 = 20;
            }
        } else if (class447.field6391 == 40) {
            if (class331.field4794.method656(127)) {
                this.method1180(class331.field4794.method645((byte) 80, 1), -6);
                class413.field5905 = class141.field2143.method2284((byte) 127, class309.field4497);
                class447.field6391 = 50;
                class285.field4142 = 25;
            } else {
                class413.field5905 = class321.field4700.method2284((byte) -111, class309.field4497) + class331.field4794.method652(-1) + "%";
                class285.field4142 = 25;
            }
        } else if (class447.field6391 == 50) {
            class270.method1846(class358.field5172, 2, -118, 22050);
            class242.field3575 = new class206();
            class242.field3575.method1466(9, 128, 114);
            class153.field2271 = class215.method1509(false, 22050, class401.field5628, 0, class117.field1588);
            class153.field2271.method1359(class242.field3575, (byte) 118);
            class380.method2422(class413.field5910, class229.field3395, 2744, class119.field1609, class242.field3575);
            class439.field6276 = class215.method1509(false, 2048, class401.field5628, 1, class117.field1588);
            class378.field5380 = new class351();
            class439.field6276.method1359(class378.field5380, (byte) 68);
            class168.field2381 = new class370(22050, class246.field3671);
            class15.field233 = class72.field942.method662(5899, "scape main");
            class413.field5905 = class216.field3120.method2284((byte) 102, class309.field4497);
            class447.field6391 = 60;
            class285.field4142 = 30;
        } else if (class447.field6391 == 60) {
            int var10 = class311.method2089(class15.field216, class327.field4745, 19174);
            int var11 = class433.method2706((byte) 88);
            if (var10 < var11) {
                class413.field5905 = class425.field6077.method2284((byte) 88, class309.field4497) + var10 * 100 / var11 + "%";
                class285.field4142 = 35;
            } else {
                class413.field5905 = class288.field4195.method2284((byte) -96, class309.field4497);
                class285.field4142 = 35;
                class447.field6391 = 70;
            }
        } else if (class447.field6391 == 70) {
            int var12 = class312.method2099((byte) 55, class15.field216);
            int var13 = class318.method2117(20497);
            if (var12 < var13) {
                class413.field5905 = class295.field4272.method2284((byte) -90, class309.field4497) + var12 * 100 / var13 + "%";
                class285.field4142 = 40;
            } else {
                class413.field5905 = class238.field3496.method2284((byte) -57, class309.field4497);
                class285.field4142 = 40;
                class447.field6391 = 80;
            }
        } else if (class447.field6391 == 80) {
            if (class278.field4004.method656(127)) {
                class321.field4701 = new class207(class278.field4004, class264.field3888, class15.field216);
                class413.field5905 = class83.field1062.method2284((byte) 112, class309.field4497);
                class285.field4142 = 45;
                class447.field6391 = 90;
            } else {
                class413.field5905 = class33.field416.method2284((byte) 123, class309.field4497) + class278.field4004.method652(-1) + "%";
                class285.field4142 = 45;
            }
        } else if (class447.field6391 == 90) {
            class413.field5905 = class431.field6172.method2284((byte) 118, class309.field4497);
            class447.field6391 = 95;
            class285.field4142 = 50;
        } else if (class447.field6391 == 95) {
            if (class338.field4903) {
                class374.field5319 = 0;
                class233.field3451 = 0;
                class26.field339 = 0;
                class220.field3168 = 1;
                class68.field910 = 0;
            }
            class338.field4903 = true;
            class415.method2612(class401.field5628, 117);
            class436.method2720(!arg0);
            class284.method1955(false, class374.field5319, -126);
            class413.field5905 = class140.field2131.method2284((byte) 93, class309.field4497);
            class285.field4142 = 55;
            class447.field6391 = 100;
        } else if (class447.field6391 == 100) {
            class341.method2238(class15.field216, 0, class327.field4745, class59.field786);
            class413.field5905 = class118.field1604.method2284((byte) -104, class309.field4497);
            class285.field4142 = 60;
            class390.method2463(5, true);
            class447.field6391 = 110;
        } else if (class447.field6391 == 110) {
            byte var14 = 0;
            class365.field5227.method656(127);
            int var15 = var14 + class365.field5227.method652(-1);
            class245.field3662.method656(127);
            int var16 = var15 + class245.field3662.method652(-1);
            class47.field625.method656(127);
            int var17 = var16 + class47.field625.method652(-1);
            class224.field3357.method656(127);
            int var18 = var17 + class224.field3357.method652(-1);
            class449.field6414.method656(127);
            int var19 = var18 + class449.field6414.method652(-1);
            class418.field6002.method656(127);
            int var20 = var19 + class418.field6002.method652(-1);
            class196.field2813.method656(127);
            int var21 = var20 + class196.field2813.method652(-1);
            class122.field1636.method656(127);
            int var22 = var21 + class122.field1636.method652(-1);
            class83.field1064.method656(127);
            int var23 = var22 + class83.field1064.method652(-1);
            class247.field3702.method656(127);
            int var24 = var23 + class247.field3702.method652(-1);
            class331.field4795.method656(127);
            int var25 = var24 + class331.field4795.method652(-1);
            if (var25 < 1100) {
                class413.field5905 = class178.field2524.method2284((byte) 105, class309.field4497) + var25 / 11 + "%";
                class285.field4142 = 65;
            } else {
                class381.method2429((byte) 35, class365.field5227);
                class148.method1097(class365.field5227, true);
                class374.method2396(class365.field5227, 0);
                class232.method1606(class365.field5227, class287.field4167, -1);
                class200.method1417(class287.field4167, (byte) 66, class245.field3662, true, class309.field4497);
                class233.method1609(-588098040, class287.field4167, class309.field4497, true, class224.field3357);
                class126.method763(class309.field4497, class449.field6414, true, 0, class287.field4167);
                class65.method413(class365.field5227, true);
                class366.method2364(class418.field6002, arg0, class105.field1350, class222.field3179);
                class170.method1213((byte) -63, class365.field5227);
                class261.method1800(65408, class287.field4167, class196.field2813);
                class218.method1517((byte) -120, class122.field1636);
                class452.method2822(16, class365.field5227);
                class451.method2812(class327.field4745, class287.field4167, -7397, class15.field216, class213.field3010);
                class145.method1074(class365.field5227, -1898332859);
                class73.method440(class47.field625, -4450);
                class451.method2808(new class209(), class83.field1064, (byte) -102, class247.field3702);
                class431.method2689(32027, class83.field1064, class247.field3702);
                class356.method2327((byte) -21, class365.field5227);
                class91.method538(class365.field5227, 1);
                class140.method1061(-28303, class365.field5227);
                class403.method2520(class15.field216, class365.field5227, false);
                class444.method2768(34, class15.field216, class365.field5227);
                class145.method1080(-12919, class365.field5227);
                class119.method731(21896, class365.field5227, class15.field216);
                class204.method1431(arg0, class365.field5227);
                class399.method2504(125, class365.field5227);
                class413.field5905 = class8.field114.method2284((byte) 89, class309.field4497);
                class285.field4142 = 65;
                class311.method2091((byte) 114);
                class447.field6391 = 120;
            }
        } else if (class447.field6391 == 120) {
            int var26 = class128.method783(class15.field216, 93);
            int var27 = class79.method465((byte) -123);
            if (var27 > var26) {
                class413.field5905 = class47.field623.method2284((byte) 88, class309.field4497) + var26 * 100 / var27 + "%";
                class285.field4142 = 70;
            } else {
                class197.method1402(class59.field786, class15.field216, 98);
                class349.method2285(class120.field1622, (byte) 104);
                class413.field5905 = class194.field2796.method2284((byte) 123, class309.field4497);
                class285.field4142 = 70;
                class447.field6391 = 130;
            }
        } else if (class447.field6391 == 130) {
            class413.field5905 = class8.field112.method2284((byte) 124, class309.field4497);
            class285.field4142 = 75;
            class447.field6391 = 140;
        } else if (class447.field6391 == 140) {
            if (class170.field2406.method654("huffman", (byte) 125, "")) {
                class28 var28 = new class28(class170.field2406.method630((byte) -127, "huffman", ""));
                class80.method478((byte) -125, var28);
                class413.field5905 = class69.field919.method2284((byte) -44, class309.field4497);
                class285.field4142 = 80;
                class447.field6391 = 150;
            } else {
                class413.field5905 = class110.field1428.method2284((byte) -69, class309.field4497) + "0%";
                class285.field4142 = 80;
            }
        } else if (class447.field6391 == 150) {
            if (!class213.field3010.method656(127)) {
                class413.field5905 = class366.field5238.method2284((byte) 120, class309.field4497) + class213.field3010.method652(-1) * 3 / 4 + "%";
                class285.field4142 = 85;
            } else if (!class311.field4563.method656(127)) {
                class413.field5905 = class366.field5238.method2284((byte) 91, class309.field4497) + (class311.field4563.method652(-1) / 10 + 75) + "%";
                class285.field4142 = 85;
            } else if (!class327.field4745.method656(127)) {
                class413.field5905 = class366.field5238.method2284((byte) 98, class309.field4497) + (class327.field4745.method652(-1) / 20 + 85) + "%";
                class285.field4142 = 85;
            } else if (class284.field4140.method636("details", (byte) 124)) {
                class176.method1262(class284.field4140);
                class310.method2077(-15835, class331.field4795);
                class282.method1933(class287.field4167, class321.field4701, (byte) 58);
                class413.field5905 = class240.field3533.method2284((byte) 100, class309.field4497);
                class447.field6391 = 160;
                class285.field4142 = 85;
            } else {
                class413.field5905 = class366.field5238.method2284((byte) -118, class309.field4497) + (class284.field4140.method640("details", (byte) 104) / 10 + 90) + "%";
                class285.field4142 = 85;
            }
        } else if (class447.field6391 == 160) {
            int var29 = class185.method1329((byte) 124);
            if (var29 == -1) {
                class413.field5905 = class16.field243.method2284((byte) 89, class309.field4497);
                class285.field4142 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method2557("worldlistfull", true);
                class390.method2463(1000, true);
            } else if (class320.field4689) {
                class413.field5905 = class235.field3462.method2284((byte) 108, class309.field4497);
                class285.field4142 = 90;
                class447.field6391 = 170;
            } else {
                this.method2557("worldlistio_" + var29, !arg0);
                class390.method2463(1000, true);
            }
        } else if (class447.field6391 == 170) {
            class253.field3750 = new String[class198.field2837];
            class442.field6334 = new boolean[class327.field4738];
            class114.field1471 = new int[class327.field4738];
            for (int var30 = 0; var30 < class327.field4738; var30++) {
                if (class394.method2481(var30, 19).field1356 == 0) {
                    class442.field6334[var30] = true;
                    class19.field258++;
                }
                class114.field1471[var30] = -1;
            }
            class175.method1240(1);
            class126.field1704 = class213.field3010.method662(5899, "loginscreen");
            class226.field3370.method648((byte) -16, true, false);
            class72.field942.method648((byte) -16, true, true);
            class15.field216.method648((byte) -16, true, true);
            class327.field4745.method648((byte) -16, true, true);
            class170.field2406.method648((byte) -16, true, true);
            class213.field3010.method648((byte) -16, true, true);
            class365.field5227.field1405 = 2;
            class417.field5998 = true;
            class47.field625.field1405 = 2;
            class245.field3662.field1405 = 2;
            class224.field3357.field1405 = 2;
            class449.field6414.field1405 = 2;
            class418.field6002.field1405 = 2;
            class196.field2813.field1405 = 2;
            class240.method1641(-1, class220.field3168, false, -1, -4);
            class413.field5905 = class371.field5291.method2284((byte) 118, class309.field4497);
            class447.field6391 = 180;
            class285.field4142 = 95;
        } else if (class447.field6391 == 180) {
            class9.method49((byte) -83, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2808)
    public final void method1185(int arg0) {
        field2329++;
        if (class423.field6041 == 1000 || arg0 != 50000) {
            return;
        }
        long var2 = class431.method2695(arg0 ^ 0xFFFF3CAF) / 1000000L - class142.field2156;
        class142.field2156 = class431.method2695(-1) / 1000000L;
        boolean var4 = class285.method1959(false);
        if (var4 && class96.field1223 && class153.field2271 != null) {
            class153.field2271.method1371(true);
        }
        if (class423.field6041 == 30 || class423.field6041 == 10) {
            if (class199.field2842 != 0L && class199.field2842 < class18.method107(arg0 - 66145)) {
                class240.method1641(class145.field2183, class436.method2717(false), false, class291.field4225, -4);
            } else if (class59.field786.method960() && class34.field422) {
                class406.method2543(arg0 - 49881);
            }
        }
        if (class213.field3016 == null) {
            Container var5;
            if (class369.field5255 == null) {
                var5 = class401.field5628.field3154;
            } else {
                var5 = class369.field5255;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class369.field5255 == var5) {
                Insets var8 = class369.field5255.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class261.field3865 != var6 || class338.field4901 != var7) {
                if (class59.field786 == null || class59.field786.method976()) {
                    method1171(arg0 - 49899);
                } else {
                    class261.field3865 = var6;
                    class338.field4901 = var7;
                }
                class199.field2842 = class18.method107(arg0 - 66145) + 500L;
            }
        }
        if (class213.field3016 != null && !class111.field1437 && (class423.field6041 == 30 || class423.field6041 == 10)) {
            class240.method1641(-1, class220.field3168, false, -1, arg0 - 50004);
        }
        boolean var9 = false;
        if (class240.field3543) {
            class240.field3543 = false;
            var9 = true;
        }
        if (var9) {
            class158.method1151(123);
        }
        if (class59.field786 != null && class59.field786.method920() || class436.method2717(false) != 1) {
            class158.method1152(arg0 - 50125);
        }
        if (class423.field6041 == 0) {
            class377.method2406(class294.field4243[class356.field5155], class413.field5905, var9, class105.field1346[class356.field5155], 1, class285.field4142, class374.field5331[class356.field5155]);
        } else if (class423.field6041 == 5) {
            class291.method1978(class59.field786, (byte) -115, class374.field5331[class356.field5155].getRGB(), class294.field4243[class356.field5155].getRGB(), class59.field786.method920() | var9, class105.field1346[class356.field5155].getRGB(), class154.field2285);
        } else if (class423.field6041 == 10) {
            class86.method515(arg0 - 50000);
        } else if (class423.field6041 == 25 || class423.field6041 == 28) {
            if (class382.field5419 == 1) {
                if (class130.field1882 < class255.field3774) {
                    class130.field1882 = class255.field3774;
                }
                int var10 = (class130.field1882 - class255.field3774) * 50 / class130.field1882;
                class135.method1044(true, 30585, class169.field2394.method2284((byte) 114, class309.field4497) + "<br>(" + var10 + "%)", class402.field5648);
            } else if (class382.field5419 == 2) {
                if (class185.field2648 < class275.field3968) {
                    class185.field2648 = class275.field3968;
                }
                int var11 = ((class185.field2648 - class275.field3968) * 50 / class185.field2648) + 50;
                class135.method1044(true, 30585, class169.field2394.method2284((byte) 97, class309.field4497) + "<br>(" + var11 + "%)", class402.field5648);
            } else {
                class135.method1044(true, 30585, class169.field2394.method2284((byte) 99, class309.field4497), class402.field5648);
            }
        } else if (class423.field6041 == 30) {
            class173.method1233(-127, var2);
        } else if (class423.field6041 == 40) {
            class135.method1044(true, 30585, class433.field6192.method2284((byte) -86, class309.field4497) + "<br>" + class336.field4879.method2284((byte) -25, class309.field4497), class402.field5648);
        }
        if (class223.field3303 == 3) {
            for (int var12 = 0; var12 < class10.field129; var12++) {
                Rectangle var13 = class85.field1086[var12];
                if (class396.field5576[var12]) {
                    class59.field786.method1832(var13.x, -1996553985, var13.width, 1, var13.y, var13.height);
                } else if (class336.field4875[var12]) {
                    class59.field786.method1832(var13.x, -1996554240, var13.width, arg0 ^ 0xC351, var13.y, var13.height);
                }
            }
        }
        if (class439.method2739(545382988)) {
            class356.method2326(class59.field786, 27994);
        }
        if ((class423.field6041 == 30 || class423.field6041 == 10) && class223.field3303 == 0 && class436.method2717(false) == 1 && !var9 && class219.field3144.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class10.field129; var15++) {
                if (class336.field4875[var15]) {
                    class336.field4875[var15] = false;
                    class392.field5512[var14++] = class85.field1086[var15];
                }
            }
            class59.field786.method1025(class392.field5512, var14);
        } else if (class423.field6041 != 0) {
            class59.field786.method882();
            for (int var16 = 0; var16 < class10.field129; var16++) {
                class336.field4875[var16] = false;
            }
        }
        if (class70.field930 == 0) {
            class259.method1790((byte) -81, 15L);
        } else if (class70.field930 == 1) {
            class259.method1790((byte) -71, 10L);
        } else if (class70.field930 == 2) {
            class259.method1790((byte) -81, 5L);
        } else if (class70.field930 == 3) {
            class259.method1790((byte) -83, 2L);
        }
        if (class417.field5998) {
            class69.method428((byte) -103);
        }
        if (class338.field4903 && class423.field6041 == 10 && class265.field3898 != -1) {
            class338.field4903 = false;
            class415.method2612(class401.field5628, 113);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 3040)
    public final void method1186(byte arg0) {
        field2332++;
        if (class423.field6041 == 1000) {
            return;
        }
        class34.field434++;
        if (class34.field434 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class278.field4000 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class127.field1765.setSeed((long) class278.field4000);
        }
        this.method1191(-54);
        if (class293.field4240 != null) {
            class293.field4240.method2725((byte) 90);
        }
        class309.method2074(2);
        class127.method769(0);
        class16.field247.method1753(-501);
        class270.field3949.method535(-28461);
        if (class207.field2976 != null) {
            int var3 = class207.field2976.method51(false);
            class6.field90 = var3;
        }
        if (class59.field786 != null) {
            class59.field786.method1007((int) class18.method107(-16145));
        }
        class128.method774(true);
        class379.field5387 = 0;
        class109 var4 = class16.field247.method1757(-1);
        if (arg0 <= 4) {
            method1181();
        }
        while (var4 != null && class379.field5387 < 128) {
            if (var4.method664(15996) != 1) {
                char var5 = var4.method665(100);
                if (!class411.method2605((byte) 99) || var5 != '`' && var5 != '§') {
                    class332.field4830[class379.field5387] = var4;
                    class379.field5387++;
                } else if (class439.method2739(545382988)) {
                    class282.method1937(true);
                } else {
                    class32.method179((byte) 80);
                }
            }
            var4 = class16.field247.method1757(-1);
        }
        class252.field3744 = null;
        for (class378 var6 = class270.field3949.method539(-6346); var6 != null; var6 = class270.field3949.method539(-6346)) {
            int var7 = var6.method474((byte) -100);
            if (var7 == -1) {
                class168.field2380.method2756(54, var6);
            } else if (class418.method2635(var7, (byte) 92)) {
                class252.field3744 = var6;
            }
        }
        if (class439.method2739(545382988)) {
            class204.method1425(0);
        }
        if (class423.field6041 == 0) {
            this.method1184(false);
            class380.method2424(9356);
        } else if (class423.field6041 == 5) {
            this.method1184(false);
            class380.method2424(9356);
        } else if (class423.field6041 == 25 || class423.field6041 == 28) {
            class44.method297(-125);
        }
        if (class423.field6041 == 10) {
            this.method1178((byte) -47);
            class215.method1508(6165);
            class57.method371(44);
            class73.method439(true);
        } else if (class423.field6041 == 30) {
            class319.method2121((byte) -70);
        } else if (class423.field6041 == 40) {
            class73.method439(true);
            if (class384.field5440 != -3) {
                if (class384.field5440 == 15) {
                    class299.method2019(39);
                } else if (class384.field5440 != 2) {
                    class185.method1327((byte) 64);
                }
            }
        }
        class162.method1164(class59.field786, false);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3183)
    public final void method1187(int arg0) {
        if (class242.field3580) {
            class365.method2358(-32);
        }
        field2336++;
        if (class59.field786 != null) {
            class59.field786.method1831((byte) 68);
        }
        if (class213.field3016 != null) {
            class314.method2102(class213.field3016, class401.field5628, arg0 ^ 0xFFFFFFBB);
            class213.field3016 = null;
        }
        if (class199.field2847 != null) {
            class199.field2847.method1093(false);
            class199.field2847 = null;
        }
        if (class207.field2976 != null) {
            class207.field2976.method53(class117.field1588, -81);
        }
        class207.field2976 = null;
        if (class153.field2271 != null) {
            class153.field2271.method1372((byte) 102);
        }
        if (class439.field6276 != null) {
            class439.field6276.method1372((byte) 102);
        }
        class187.field2661.method508(true);
        class231.field3414.method1956(89);
        if (arg0 != 7) {
            field2331 = null;
        }
        if (class119.field1615 != null) {
            class119.field1615.method1850(arg0 ^ 0xA7);
            class119.field1615 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3238)
    public static final void method1188() {
        boolean var0 = class145.field2182 == 1 && class334.field4847 > 200 || class145.field2182 == 0 && class334.field4847 > 50;
        for (int var1 = 0; var1 < class334.field4847; var1++) {
            class128 var10 = class243.field3596[class26.field323[var1]];
            if (var10.method782(150)) {
                var10.method2064((byte) -18);
                if (var10.field4465 >= 0 && var10.field4462 >= 0 && var10.field4460 < class80.field1034 && var10.field4471 < class381.field5414) {
                    var10.field1769 = var10.field4513 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field4529) {
                        var11++;
                    }
                    if (var10.field4579 > class34.field434) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method773((byte) 89) << 2);
                    if (class20.field264 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field4530 = var12 + 1;
                } else {
                    var10.field4530 = -1;
                }
            } else {
                var10.field4530 = -1;
            }
        }
        for (int var2 = 0; var2 < class229.field3396; var2++) {
            class446 var7 = class442.field6317[class431.field6169[var2]];
            if (var7.method2782(150) && var7.field6375.method2268((byte) 79)) {
                var7.method2064((byte) -18);
                if (var7.field4465 >= 0 && var7.field4462 >= 0 && var7.field4460 < class80.field1034 && var7.field4471 < class381.field5414) {
                    int var8 = 0;
                    if (!var7.field4529) {
                        var8++;
                    }
                    if (var7.field4579 > class34.field434) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method773((byte) 68) << 2);
                    if (class20.field264 == 0) {
                        if (var7.field6375.field4998) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class20.field264 == 1) {
                        if (var7.field6375.field4998) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field6375.field5045) {
                        var9 += 512;
                    } else if (!var7.field6375.field5015) {
                        var9 += 256;
                    }
                    var7.field4530 = var9 + 1;
                } else {
                    var7.field4530 = -1;
                }
            } else {
                var7.field4530 = -1;
            }
        }
        for (int var3 = 0; var3 < class209.field2990.length; var3++) {
            class136 var4 = class209.field2990[var3];
            if (var4 != null) {
                if (var4.field2097 == 1) {
                    class446 var5 = class442.field6317[var4.field2101];
                    if (var5 != null && var5.field4530 >= 0) {
                        var5.field4530 += 1024;
                    }
                } else if (var4.field2097 == 10) {
                    class128 var6 = class243.field3596[var4.field2101];
                    if (var6 != null && var6.field4530 >= 0) {
                        var6.field4530 += 1024;
                    }
                }
            }
        }
        class181.field2555.field4530 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3374)
    public static final void method1189() {
        class452.field6489 = 0;
        for (int var0 = 0; var0 < class229.field3396; var0++) {
            class446 var1 = class442.field6317[class431.field6169[var0]];
            if (var1.field4529 && var1.method778((byte) 118) != -1) {
                int var2 = (var1.method773((byte) 118) - 1) * 64 + 60;
                int var3 = var1.field4463 - var2 >> 7;
                int var4 = var1.field4466 - var2 >> 7;
                class311 var5 = class452.method2818(class158.field2302, var3, var4, -805450585);
                if (var5 != null) {
                    int var6 = var5.field4514;
                    if (var5 instanceof class446) {
                        var6 += 2048;
                    }
                    if (var5.field4526 == 0 && var5.method778((byte) 109) != -1) {
                        class342.field4958[class452.field6489] = var6;
                        class136.field2108[class452.field6489] = var6;
                        class452.field6489++;
                        var5.field4526++;
                    }
                    class342.field4958[class452.field6489] = var6;
                    class136.field2108[class452.field6489] = var1.field4514 + 2048;
                    class452.field6489++;
                    var5.field4526++;
                }
            }
        }
        class240.method1636(class136.field2108, 15232, class342.field4958, 0, class452.field6489 - 1);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3423)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class196.method1396("argument count", (byte) 76);
            }
            class170.field2401 = Integer.parseInt(arg0[0]);
            class214.field3022 = 2;
            if (arg0[1].equals("live")) {
                class31.field387 = 0;
            } else if (arg0[1].equals("rc")) {
                class31.field387 = 1;
            } else if (arg0[1].equals("wip")) {
                class31.field387 = 2;
            } else {
                class196.method1396("modewhat", (byte) 76);
            }
            class309.field4497 = class233.method1615(arg0[2], -20821);
            if (class309.field4497 == -1) {
                if (arg0[2].equals("english")) {
                    class309.field4497 = 0;
                } else if (arg0[2].equals("german")) {
                    class309.field4497 = 1;
                } else {
                    class196.method1396("language", (byte) 76);
                }
            }
            class118.field1607 = false;
            class264.field3879 = false;
            if (arg0[3].equals("game0")) {
                class317.field4656 = 0;
            } else if (arg0[3].equals("game1")) {
                class317.field4656 = 1;
            } else {
                class196.method1396("game", (byte) 76);
            }
            class324.field4720 = "";
            class356.field5155 = class317.field4656;
            class363.field5213 = 0;
            class376.field5354 = 0;
            client var1 = new client();
            class296.field4282 = var1;
            var1.method2565(class317.field4656 == 1 ? "stellardawn" : "runescape", false, 566, class31.field387 + 32, 768, 29, true, 1024);
            class369.field5255.setLocation(40, 40);
        } catch (Exception var3) {
            class334.method2191(true, (String) null, var3);
        }
        field2333++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3489)
    public static final void method1190() {
        int var0 = class403.field5650 ? class334.field4847 : class334.field4847 + class229.field3396;
        for (int var1 = -1; var1 < var0; var1++) {
            class311 var2;
            if (var1 < 0) {
                var2 = class181.field2555;
            } else if (var1 < class334.field4847) {
                var2 = class243.field3596[class26.field323[var1]];
            } else {
                var2 = class442.field6317[class431.field6169[var1 - class334.field4847]];
            }
            if (var2.field4530 >= 0) {
                int var3 = var2.method773((byte) 112);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field4463 & 0x7F) == 0 && (var2.field4466 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field4463 & 0x7F) == 64 && (var2.field4466 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class128 && var2.field4600 != null && class34.field434 >= var2.field4602 && class34.field434 < var2.field4598) {
                    ((class128) var2).field1769 = false;
                }
                var2.field4457 = class452.method2820(class158.field2302, var2.field4466, false, var2.field4463);
                class196.method1395(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3535)
    private final void method1191(int arg0) {
        if (arg0 >= -18) {
            method1177(-75);
        }
        field2327++;
        boolean var2 = class187.field2661.method506(1336376240);
        if (!var2) {
            this.method1167(72);
        }
    }
}
