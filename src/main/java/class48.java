import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class48 extends class240 {

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field681;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "Lcr;")
    public static class189 field674 = new class189(32);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field677 = 0;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lqs;")
    public static class438 field679;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 4)
    public static final boolean method344(byte arg0, String arg1) {
        field675++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class318.field4649; var2++) {
            if (arg1.equalsIgnoreCase(class295.field4233[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class281.field4094[var2])) {
                return true;
            }
        }
        if (arg0 > -64) {
            method348(66, -73, (byte) -68, -93, false, -127);
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lkb;Ljava/lang/Object;)V", line = 37)
    public class48(class80 arg0, Object arg1) {
        super(arg0);
        this.field681 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Z", line = 45)
    public static final boolean method345(int arg0) throws IOException {
        field678++;
        if (class191.field2558 == null) {
            return false;
        }
        int var1 = class191.field2558.method1394(true);
        if (var1 == 0) {
            return false;
        }
        if (class145.field1988 == -1) {
            class191.field2558.method1397(false, 0, class156.field2120.field3040, 1);
            class156.field2120.field3029 = 0;
            class145.field1988 = class156.field2120.method6((byte) -25);
            class300.field4398 = class192.field2571[class145.field1988];
            var1--;
        }
        if (class300.field4398 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class191.field2558.method1397(false, 0, class156.field2120.field3040, 1);
            class300.field4398 = class156.field2120.field3040[0] & 0xFF;
            var1--;
        }
        if (class300.field4398 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class191.field2558.method1397(false, 0, class156.field2120.field3040, 2);
            class156.field2120.field3029 = 0;
            class300.field4398 = class156.field2120.method1343(arg0 ^ 0xFFFFCA1C);
            var1 -= 2;
        }
        if (class300.field4398 > var1) {
            return false;
        }
        class156.field2120.field3029 = 0;
        class191.field2558.method1397(false, 0, class156.field2120.field3040, class300.field4398);
        class92.field1296 = 0;
        class100.field1411 = class26.field378;
        class26.field378 = class240.field3212;
        class240.field3212 = class145.field1988;
        if (class145.field1988 == 11) {
            class142.method904(false);
            int var2 = class156.field2120.method1371(-71);
            int var3 = class156.field2120.method1367(-1892819960);
            int var4 = class156.field2120.method1355(arg0 ^ 0xFFFFB98D);
            class138.field1906[var4] = var3;
            class75.field1074[var4] = var2;
            class16.field219[var4] = 1;
            int var5 = class315.field4610[var4] - 1;
            for (int var6 = 0; var6 < var5; var6++) {
                if (class416.field6103[var6] <= var3) {
                    class16.field219[var4] = var6 + 2;
                }
            }
            class125.field1763[class183.method1117(31, class241.field3230++)] = var4;
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 242) {
            int var7 = class156.field2120.method1363(255);
            int var8 = class156.field2120.method1344((byte) 100);
            int var9 = class156.field2120.method1356((byte) -94);
            if (class156.method967(-99, var9)) {
                class169 var10 = (class169) class99.field1377.method384((long) var8, true);
                class169 var11 = (class169) class99.field1377.method384((long) var7, true);
                if (var11 != null) {
                    class271.method1864(true, false, var10 == null || var10.field2275 != var11.field2275, var11);
                }
                if (var10 != null) {
                    var10.method322(11);
                    class99.field1377.method381(true, var10, (long) var7);
                }
                class394 var12 = class196.method1168((byte) -103, var8);
                if (var12 != null) {
                    class407.method2621(var12, 15);
                }
                class394 var13 = class196.method1168((byte) -120, var7);
                if (var13 != null) {
                    class407.method2621(var13, arg0 ^ 0xFFFFCAEC);
                    class235.method1409(var13, true, (byte) -110);
                }
                if (class329.field4790 != -1) {
                    class362.method2367(1, class329.field4790, 14336);
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 216) {
            int var14 = class156.field2120.method1361(-9711);
            int var15 = class156.field2120.method1340(-128);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class156.field2120.method1328(8);
            int var17 = class156.field2120.method1363(arg0 ^ 0xFFFFCA1C);
            int var18 = class156.field2120.method1356((byte) -96);
            if (var18 == 65535) {
                var18 = -1;
            }
            if (class156.method967(-118, var14)) {
                for (int var19 = var15; var19 <= var18; var19++) {
                    long var20 = ((long) var16 << 32) + (long) var19;
                    class304 var22 = (class304) class34.field474.method384(var20, true);
                    class304 var23;
                    if (var22 != null) {
                        var23 = new class304(var17, var22.field4474);
                        var22.method322(11);
                    } else if (var19 == -1) {
                        var23 = new class304(var17, class196.method1168((byte) -123, var16).field5805.field4474);
                    } else {
                        var23 = new class304(var17, -1);
                    }
                    class34.field474.method381(true, var23, var20);
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 236) {
            int var24 = class156.field2120.method1343(255);
            byte var25 = class156.field2120.method1336(0);
            class366.method2389(var25, 32094, var24);
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 42) {
            int var26 = class156.field2120.method1363(255);
            int var27 = (var26 & 0x388071C7) >> 28;
            int var28 = (var26 & 0xFFFE0E7) >> 14;
            int var29 = var26 & 0x3FFF;
            int var30 = class156.field2120.method1355(29550);
            int var31 = var30 >> 2;
            int var32 = var30 & 0x3;
            int var33 = class215.field2859[var31];
            int var34 = class156.field2120.method1361(-9711);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = var28 - class7.field138;
            int var36 = var29 - class200.field2660;
            class242.method1454(var33, var27, var34, var31, var32, -17444, var36, var35);
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 143) {
            int var37 = class156.field2120.method1343(255);
            int var38 = class156.field2120.method1348(arg0 ^ 0x3547);
            int var39 = class156.field2120.method1348(-123);
            int var40 = class156.field2120.method1348(-102);
            int var41 = class156.field2120.method1348(-119);
            int var42 = class156.field2120.method1343(arg0 + 13852);
            if (class156.method967(-94, var37)) {
                class119.field1671[var38] = true;
                class365.field5291[var38] = var39;
                class406.field6031[var38] = var40;
                class189.field2539[var38] = var41;
                class173.field2307[var38] = var42;
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 4) {
            int var43 = class156.field2120.method1363(255);
            int var44 = class156.field2120.method1340(-128);
            class366.method2389(var43, arg0 ^ 0xFFFFB7BD, var44);
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 23) {
            int var45 = class156.field2120.method1340(-128);
            int var46 = class156.field2120.method1356((byte) -30);
            int var47 = class156.field2120.method1361(arg0 + 3886);
            if (class156.method967(-126, var46)) {
                class35.method236(true, var47, 0, var45);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 6) {
            int var48 = class156.field2120.method1343(255);
            if (class156.method967(-109, var48)) {
                class192.method1158(6122);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 117) {
            boolean var49 = class156.field2120.method1348(arg0 + 13508) == 1;
            String var50 = class156.field2120.method1329(991328496);
            String var51 = var50;
            if (var49) {
                var51 = class156.field2120.method1329(991328496);
            }
            long var52 = class156.field2120.method1332(arg0 + 1466313341);
            long var54 = (long) class156.field2120.method1343(255);
            long var56 = (long) class156.field2120.method1333((byte) -84);
            int var58 = class156.field2120.method1348(-100);
            long var59 = (var54 << 32) + var56;
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 100) {
                    if (var58 <= 1) {
                        if (!(!class375.field5459 || class69.field898) || class234.field3122) {
                            var61 = true;
                        } else if (method344((byte) -68, var51)) {
                            var61 = true;
                        }
                    }
                    break;
                }
                if (class373.field5424[var62] == var59) {
                    var61 = true;
                    break;
                }
                var62++;
            }
            if (!var61 && class307.field4523 == 0) {
                class373.field5424[class88.field1239] = var59;
                class88.field1239 = (class88.field1239 + 1) % 100;
                String var63 = class430.method2725(class368.method2393(true, class250.method1517(class156.field2120, (byte) 109)), (byte) -105);
                if (var58 == 2 || var58 == 3) {
                    class366.method2387(class198.method1177(3, var52), 9, 0, var63, -1, 0, "<img=1>" + var51, "<img=1>" + var50);
                } else if (var58 == 1) {
                    class366.method2387(class198.method1177(arg0 + 13600, var52), 9, 0, var63, -1, 0, "<img=0>" + var51, "<img=0>" + var50);
                } else {
                    class366.method2387(class198.method1177(arg0 + 13600, var52), 9, 0, var63, -1, 0, var51, var50);
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 252) {
            int var64 = class156.field2120.method1343(255);
            if (class156.method967(-84, var64)) {
                class272.method1873(true);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 48) {
            int var65 = class156.field2120.method1343(255);
            int var66 = class156.field2120.method1361(-9711);
            int var67 = class156.field2120.method1328(arg0 ^ 0xFFFFCAEB);
            if (class156.method967(-80, var66)) {
                class218.method1276(var65, var67, false);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 240) {
            for (int var68 = 0; var68 < class191.field2561.length; var68++) {
                if (class4.field41[var68] != class191.field2561[var68]) {
                    class191.field2561[var68] = class4.field41[var68];
                    class264.method1815(3930, var68);
                    class42.field581[class183.method1117(class159.field2151++, 31)] = var68;
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 254) {
            int var69 = class156.field2120.method1361(-9711);
            int var70 = class156.field2120.method1328(arg0 ^ 0xFFFFCAEB);
            int var71 = class156.field2120.method1328(arg0 ^ 0xFFFFCAEB);
            int var72 = class156.field2120.method1340(-128);
            if (class156.method967(-81, var69)) {
                class419.method2682(var71, var72, -1, var70, 5);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 14) {
            class368.field5317 = class207.field2788;
            if (class300.field4398 == 0) {
                class193.field2588 = null;
                class207.field2785 = 0;
                class195.field2617 = null;
                class145.field1988 = -1;
                class399.field5959 = null;
                return true;
            }
            class399.field5959 = class156.field2120.method1329(991328496);
            boolean var73 = class156.field2120.method1348(arg0 + 13489) == 1;
            if (var73) {
                class156.field2120.method1329(991328496);
            }
            long var74 = class156.field2120.method1332(1466299744);
            class193.field2588 = class51.method358(var74, (byte) 37);
            class363.field5236 = class156.field2120.method1349(3);
            int var76 = class156.field2120.method1348(-107);
            if (var76 == 255) {
                class145.field1988 = -1;
                return true;
            }
            class207.field2785 = var76;
            class422[] var77 = new class422[100];
            for (int var78 = 0; var78 < class207.field2785; var78++) {
                var77[var78] = new class422();
                var77[var78].field6222 = class156.field2120.method1329(991328496);
                boolean var84 = class156.field2120.method1348(-101) == 1;
                if (var84) {
                    var77[var78].field6219 = class156.field2120.method1329(arg0 ^ 0xC4E9B213);
                } else {
                    var77[var78].field6219 = var77[var78].field6222;
                }
                var77[var78].field6224 = class156.field2120.method1343(255);
                var77[var78].field6228 = class156.field2120.method1349(3);
                var77[var78].field6229 = class156.field2120.method1329(991328496);
                if (var77[var78].field6219.equals(class227.field2988.field340)) {
                    class110.field1558 = var77[var78].field6228;
                }
            }
            boolean var79 = false;
            int var80 = class207.field2785;
            while (var80 > 0) {
                boolean var81 = true;
                var80--;
                for (int var82 = 0; var82 < var80; var82++) {
                    if (var77[var82].field6222.compareTo(var77[var82 + 1].field6222) > 0) {
                        class422 var83 = var77[var82];
                        var77[var82] = var77[var82 + 1];
                        var81 = false;
                        var77[var82 + 1] = var83;
                    }
                }
                if (var81) {
                    break;
                }
            }
            class145.field1988 = -1;
            class195.field2617 = var77;
            return true;
        } else if (class145.field1988 == 165) {
            for (int var85 = 0; var85 < class206.field2777.length; var85++) {
                if (class206.field2777[var85] != null) {
                    class206.field2777[var85].field4290 = -1;
                }
            }
            for (int var86 = 0; var86 < class306.field4496.length; var86++) {
                if (class306.field4496[var86] != null) {
                    class306.field4496[var86].field4290 = -1;
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 63) {
            String var87 = class156.field2120.method1329(991328496);
            boolean var88 = class156.field2120.method1348(-99) == 1;
            String var89;
            if (var88) {
                var89 = class156.field2120.method1329(991328496);
            } else {
                var89 = var87;
            }
            int var90 = class156.field2120.method1343(255);
            byte var91 = class156.field2120.method1349(3);
            boolean var92 = false;
            if (var91 == -128) {
                var92 = true;
            }
            if (var92) {
                if (class207.field2785 == 0) {
                    class145.field1988 = -1;
                    return true;
                }
                boolean var93 = false;
                int var94;
                for (var94 = 0; class207.field2785 > var94 && (!class195.field2617[var94].field6219.equals(var89) || class195.field2617[var94].field6224 != var90); var94++) {
                }
                if (var94 < class207.field2785) {
                    while (var94 < class207.field2785 - 1) {
                        class195.field2617[var94] = class195.field2617[var94 + 1];
                        var94++;
                    }
                    class207.field2785--;
                    class195.field2617[class207.field2785] = null;
                }
            } else {
                String var95 = class156.field2120.method1329(991328496);
                class422 var96 = new class422();
                var96.field6229 = var95;
                var96.field6224 = var90;
                var96.field6219 = var89;
                var96.field6222 = var87;
                var96.field6228 = var91;
                int var97;
                for (var97 = class207.field2785 - 1; var97 >= 0; var97--) {
                    int var98 = class195.field2617[var97].field6219.compareTo(var96.field6219);
                    if (var98 == 0) {
                        class195.field2617[var97].field6224 = var90;
                        class195.field2617[var97].field6228 = var91;
                        class195.field2617[var97].field6229 = var95;
                        if (var89.equals(class227.field2988.field340)) {
                            class110.field1558 = var91;
                        }
                        class145.field1988 = -1;
                        class368.field5317 = class207.field2788;
                        return true;
                    }
                    if (var98 < 0) {
                        break;
                    }
                }
                if (class207.field2785 >= class195.field2617.length) {
                    class145.field1988 = -1;
                    return true;
                }
                for (int var99 = class207.field2785 - 1; var99 > var97; var99--) {
                    class195.field2617[var99 + 1] = class195.field2617[var99];
                }
                if (class207.field2785 == 0) {
                    class195.field2617 = new class422[100];
                }
                class195.field2617[var97 + 1] = var96;
                class207.field2785++;
                if (var89.equals(class227.field2988.field340)) {
                    class110.field1558 = var91;
                }
            }
            class145.field1988 = -1;
            class368.field5317 = class207.field2788;
            return true;
        } else if (class145.field1988 == 71) {
            boolean var100 = class156.field2120.method1348(-107) == 1;
            String var101 = class156.field2120.method1329(991328496);
            String var102 = class156.field2120.method1329(991328496);
            int var103 = class156.field2120.method1343(255);
            int var104 = class156.field2120.method1348(arg0 + 13496);
            String var105 = "";
            boolean var106 = false;
            if (var103 > 0) {
                var105 = class156.field2120.method1329(991328496);
                var106 = class156.field2120.method1348(-118) == 1;
            }
            for (int var107 = 0; var107 < class167.field2254; var107++) {
                if (var100) {
                    if (var102.equals(class272.field3943[var107])) {
                        class272.field3943[var107] = var101;
                        class148.field2037[var107] = var102;
                        var101 = null;
                        break;
                    }
                } else if (var101.equals(class272.field3943[var107])) {
                    if (class324.field4759[var107] != var103) {
                        class324.field4759[var107] = var103;
                        if (var103 > 0) {
                            class171.method1057(5, 0, "", var101 + class165.field2228, "", -100);
                        }
                        if (var103 == 0) {
                            class171.method1057(5, 0, "", var101 + class144.field1967, "", -30);
                        }
                    }
                    class148.field2037[var107] = var102;
                    class368.field5312[var107] = var105;
                    class356.field5156[var107] = var104;
                    var101 = null;
                    class110.field1551[var107] = var106;
                    break;
                }
            }
            if (var101 != null && class167.field2254 < 200) {
                class272.field3943[class167.field2254] = var101;
                class148.field2037[class167.field2254] = var102;
                class324.field4759[class167.field2254] = var103;
                class368.field5312[class167.field2254] = var105;
                class356.field5156[class167.field2254] = var104;
                class110.field1551[class167.field2254] = var106;
                class167.field2254++;
            }
            class416.field6111 = class207.field2788;
            boolean var108 = false;
            int var109 = class167.field2254;
            while (var109 > 0) {
                var109--;
                boolean var110 = true;
                for (int var111 = 0; var111 < var109; var111++) {
                    if (class324.field4759[var111] != class43.field616 && class324.field4759[var111 + 1] == class43.field616 || class324.field4759[var111] == 0 && class324.field4759[var111 + 1] != 0) {
                        int var112 = class324.field4759[var111];
                        class324.field4759[var111] = class324.field4759[var111 + 1];
                        class324.field4759[var111 + 1] = var112;
                        String var113 = class368.field5312[var111];
                        class368.field5312[var111] = class368.field5312[var111 + 1];
                        class368.field5312[var111 + 1] = var113;
                        String var114 = class272.field3943[var111];
                        class272.field3943[var111] = class272.field3943[var111 + 1];
                        class272.field3943[var111 + 1] = var114;
                        String var115 = class148.field2037[var111];
                        class148.field2037[var111] = class148.field2037[var111 + 1];
                        class148.field2037[var111 + 1] = var115;
                        int var116 = class356.field5156[var111];
                        class356.field5156[var111] = class356.field5156[var111 + 1];
                        class356.field5156[var111 + 1] = var116;
                        boolean var117 = class110.field1551[var111];
                        class110.field1551[var111] = class110.field1551[var111 + 1];
                        var110 = false;
                        class110.field1551[var111 + 1] = var117;
                    }
                }
                if (var110) {
                    break;
                }
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 170) {
            int var118 = class156.field2120.method1367(-1892819960);
            int var119 = class156.field2120.method1361(-9711);
            int var120 = class156.field2120.method1340(-128);
            int var121 = class156.field2120.method1340(-128);
            if (class156.method967(-88, var120)) {
                class234.method1404(var118, arg0 - 775624, (var119 << 16) + var121);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 251) {
            int var122 = class156.field2120.method1342(2082344352);
            int var123 = class156.field2120.method1343(arg0 ^ 0xFFFFCA1C);
            int var124 = class156.field2120.method1328(8);
            if (class156.method967(-114, var123)) {
                class354.method2326(-4747, var124, var122);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 196) {
            int var125 = class156.field2120.method1348(-88);
            if (class156.field2120.method1348(-120) == 0) {
                class282.field4101[var125] = new class199();
            } else {
                class156.field2120.field3029--;
                class282.field4101[var125] = new class199(class156.field2120);
            }
            class346.field4976 = class207.field2788;
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 94) {
            int var126 = class156.field2120.method1328(8);
            class307.field4514 = class76.field1085.method241(-79, var126);
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 175) {
            int var127 = class156.field2120.method1356((byte) -118);
            if (var127 == 65535) {
                var127 = -1;
            }
            int var128 = class156.field2120.method1343(255);
            int var129 = class156.field2120.method1367(arg0 ^ 0x70D216EB);
            if (class156.method967(-81, var128)) {
                class419.method2682(-1, var127, arg0 + 13596, var129, 1);
            }
            class145.field1988 = -1;
            return true;
        } else if (class145.field1988 == 92) {
            String var130 = class156.field2120.method1329(991328496);
            int var131 = class156.field2120.method1356((byte) -61);
            int var132 = class156.field2120.method1328(8);
            if (class156.method967(arg0 + 13501, var131)) {
                class302.method2064(var130, -1, var132);
            }
            class145.field1988 = -1;
            return true;
        } else {
            if (arg0 != -13597) {
                method348(52, -24, (byte) -22, -21, false, -16);
            }
            if (class145.field1988 == 208) {
                int var133 = class156.field2120.method1319((byte) -13);
                int var134 = class156.field2120.method1363(255);
                int var135 = class156.field2120.method1347((byte) -114);
                int var136 = class156.field2120.method1361(-9711);
                if (class156.method967(-114, var136)) {
                    class296.method2022(var135, var133, var134, 11);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 145) {
                String var137 = class156.field2120.method1329(991328496);
                String var138 = class430.method2725(class368.method2393(true, class250.method1517(class156.field2120, (byte) 51)), (byte) -49);
                class171.method1057(6, 0, var137, var138, var137, -57);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 67) {
                int var139 = class156.field2120.method1363(255);
                int var140 = class156.field2120.method1361(-9711);
                int var141 = class156.field2120.method1343(255);
                int var142 = class156.field2120.method1361(-9711);
                if ((var139 >> 30) != 0) {
                    int var167 = var139 >> 28 & 0x3;
                    int var168 = ((var139 & 0xFFFF31C) >> 14) - class7.field138;
                    int var169 = (var139 & 0x3FFF) - class200.field2660;
                    if (var168 >= 0 && var169 >= 0 && var168 < class192.field2574 && class364.field5262 > var169) {
                        int var170 = var168 * 128 + 64;
                        int var171 = var169 * 128 + 64;
                        class52 var172 = new class52(var141, 0, class28.field418, var167, var170, class52.method359((byte) -116, var171, var170, var167) - var140, var171, var168, var168, var169, var169);
                        class43.field609.method330(new class105(var172), -2130841184);
                    }
                } else if (var139 >> 29 != 0) {
                    int var155 = var139 & 0xFFFF;
                    class43 var156 = class306.field4496[var155];
                    if (var156 != null) {
                        if (var141 == 65535) {
                            var141 = -1;
                        }
                        boolean var157 = true;
                        if (var141 != -1 && var156.field4326 != -1) {
                            if (var156.field4326 == var141) {
                                class300 var162 = class426.method2706((byte) 11, var141);
                                if (var162.field4389 && var162.field4406 != -1) {
                                    class12 var163 = class33.method221((byte) 102, var162.field4406);
                                    int var164 = var163.field193;
                                    if (var164 == 0 || var164 == 2) {
                                        var157 = false;
                                    } else if (var164 == 1) {
                                        var157 = true;
                                    }
                                }
                            } else {
                                class300 var158 = class426.method2706((byte) 11, var141);
                                class300 var159 = class426.method2706((byte) 11, var156.field4326);
                                if (var158.field4406 != -1 && var159.field4406 != -1) {
                                    class12 var160 = class33.method221((byte) 102, var158.field4406);
                                    class12 var161 = class33.method221((byte) 102, var159.field4406);
                                    if (var161.field190 > var160.field190) {
                                        var157 = false;
                                    }
                                }
                            }
                        }
                        if (var157) {
                            var156.field4304 = 0;
                            var156.field4273 = 0;
                            var156.field4280 = 1;
                            var156.field4348 = class28.field418 + var142;
                            var156.field4326 = var141;
                            var156.field4341 = var140;
                            if (var156.field4348 > class28.field418) {
                                var156.field4304 = -1;
                            }
                            if (var156.field4326 != -1 && class28.field418 == var156.field4348) {
                                int var165 = class426.method2706((byte) 11, var156.field4326).field4406;
                                if (var165 != -1) {
                                    class12 var166 = class33.method221((byte) 102, var165);
                                    if (var166 != null && var166.field182 != null) {
                                        class298.method2049(var156.field734, false, var156.field740, arg0 ^ 0xFFFFECFE, 0, var166);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var139 >> 28) != 0) {
                    int var143 = var139 & 0xFFFF;
                    class25 var144;
                    if (class272.field3950 == var143) {
                        var144 = class227.field2988;
                    } else {
                        var144 = class206.field2777[var143];
                    }
                    if (var144 != null) {
                        if (var141 == 65535) {
                            var141 = -1;
                        }
                        boolean var145 = true;
                        if (var141 != -1 && var144.field4326 != -1) {
                            if (var144.field4326 == var141) {
                                class300 var150 = class426.method2706((byte) 11, var141);
                                if (var150.field4389 && var150.field4406 != -1) {
                                    class12 var151 = class33.method221((byte) 102, var150.field4406);
                                    int var152 = var151.field193;
                                    if (var152 == 0 || var152 == 2) {
                                        var145 = false;
                                    } else if (var152 == 1) {
                                        var145 = true;
                                    }
                                }
                            } else {
                                class300 var146 = class426.method2706((byte) 11, var141);
                                class300 var147 = class426.method2706((byte) 11, var144.field4326);
                                if (var146.field4406 != -1 && var147.field4406 != -1) {
                                    class12 var148 = class33.method221((byte) 102, var146.field4406);
                                    class12 var149 = class33.method221((byte) 102, var147.field4406);
                                    if (var148.field190 < var149.field190) {
                                        var145 = false;
                                    }
                                }
                            }
                        }
                        if (var145) {
                            var144.field4273 = 0;
                            var144.field4348 = class28.field418 + var142;
                            var144.field4326 = var141;
                            var144.field4304 = 0;
                            var144.field4280 = 1;
                            var144.field4341 = var140;
                            if (var144.field4326 == 65535) {
                                var144.field4326 = -1;
                            }
                            if (class28.field418 < var144.field4348) {
                                var144.field4304 = -1;
                            }
                            if (var144.field4326 != -1 && class28.field418 == var144.field4348) {
                                int var153 = class426.method2706((byte) 11, var144.field4326).field4406;
                                if (var153 != -1) {
                                    class12 var154 = class33.method221((byte) 102, var153);
                                    if (var154 != null && var154.field182 != null) {
                                        class298.method2049(var144.field734, class227.field2988 == var144, var144.field740, 9757, 0, var154);
                                    }
                                }
                            }
                        }
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 45) {
                int var173 = class156.field2120.method1327((byte) -64);
                int var174 = class156.field2120.method1344((byte) 85);
                int var175 = class156.field2120.method1348(-114);
                String var176 = "";
                String var177 = var176;
                if ((var175 & 0x1) != 0) {
                    var176 = class156.field2120.method1329(991328496);
                    if ((var175 & 0x2) == 0) {
                        var177 = var176;
                    } else {
                        var177 = class156.field2120.method1329(991328496);
                    }
                }
                String var178 = class156.field2120.method1329(991328496);
                if (var173 == 99) {
                    class386.method2484(var178, true);
                } else if (var177.equals("") || !method344((byte) -71, var177)) {
                    class171.method1057(var173, var174, var177, var178, var176, -34);
                } else {
                    class145.field1988 = -1;
                    return true;
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 18) {
                boolean var179 = class156.field2120.method1348(-128) == 1;
                String var180 = class156.field2120.method1329(991328496);
                String var181 = var180;
                if (var179) {
                    var181 = class156.field2120.method1329(991328496);
                }
                long var182 = class156.field2120.method1332(arg0 ^ 0xA89A3F83);
                long var184 = (long) class156.field2120.method1343(255);
                long var186 = (long) class156.field2120.method1333((byte) -105);
                int var188 = class156.field2120.method1348(arg0 ^ 0x3543);
                int var189 = class156.field2120.method1343(255);
                long var190 = (var184 << 32) + var186;
                boolean var192 = false;
                int var193 = 0;
                while (true) {
                    if (var193 >= 100) {
                        if (var188 <= 1 && method344((byte) -71, var181)) {
                            var192 = true;
                        }
                        break;
                    }
                    if (class373.field5424[var193] == var190) {
                        var192 = true;
                        break;
                    }
                    var193++;
                }
                if (!var192 && class307.field4523 == 0) {
                    class373.field5424[class88.field1239] = var190;
                    class88.field1239 = (class88.field1239 + 1) % 100;
                    String var194 = class418.method2678(var189, 14317).method2457(class156.field2120, (byte) -35);
                    if (var188 == 2) {
                        class366.method2387(class198.method1177(3, var182), 20, 0, var194, var189, 0, "<img=1>" + var181, "<img=1>" + var180);
                    } else if (var188 == 1) {
                        class366.method2387(class198.method1177(arg0 + 13600, var182), 20, 0, var194, var189, 0, "<img=0>" + var181, "<img=0>" + var180);
                    } else {
                        class366.method2387(class198.method1177(3, var182), 20, 0, var194, var189, 0, var181, var180);
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 211) {
                class318.field4649 = class156.field2120.method1348(arg0 ^ 0x3574);
                for (int var195 = 0; var195 < class318.field4649; var195++) {
                    class212.field2840[var195] = class156.field2120.method1329(991328496);
                    class295.field4233[var195] = class156.field2120.method1329(991328496);
                    if (class295.field4233[var195].equals("")) {
                        class295.field4233[var195] = class212.field2840[var195];
                    }
                    class307.field4520[var195] = class156.field2120.method1329(991328496);
                    class281.field4094[var195] = class156.field2120.method1329(arg0 + 991342093);
                    if (class281.field4094[var195].equals("")) {
                        class281.field4094[var195] = class307.field4520[var195];
                    }
                    class235.field3128[var195] = false;
                }
                class416.field6111 = class207.field2788;
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 188) {
                int var196 = class156.field2120.method1356((byte) -57);
                int var197 = class156.field2120.method1328(arg0 ^ 0xFFFFCAEB);
                if (class156.method967(-72, var196)) {
                    class419.method2682(-1, -1, arg0 ^ 0x351C, var197, 3);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 78) {
                if (class103.field1428 != null) {
                    class147.method933(class11.field171, false, -1, arg0 + 13598, -1);
                }
                byte[] var198 = new byte[class300.field4398];
                class156.field2120.method14(class300.field4398, 0, (byte) -115, var198);
                String var199 = class374.method2421(0, 0, class300.field4398, var198);
                class302.method2065(class76.field1085, class373.field5422 == 1, var199, true, (byte) -124);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 229) {
                int var200 = class156.field2120.method1361(-9711);
                int var201 = class156.field2120.method1363(arg0 + 13852);
                int var202 = class156.field2120.method1356((byte) -39);
                if (class156.method967(arg0 ^ 0x354E, var202)) {
                    class426.method2710(false, var200, var201);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 153) {
                class430.method2722((byte) -65);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 30) {
                class142.method904(false);
                class131.field1808 = class156.field2120.method1348(arg0 + 13472);
                class145.field1988 = -1;
                class367.field5298 = class207.field2788;
                return true;
            } else if (class145.field1988 == 35) {
                class363.field5237 = class156.field2120.method1356((byte) -95) * 30;
                class367.field5298 = class207.field2788;
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 154) {
                int var203 = class156.field2120.method1348(-92);
                int var204 = class156.field2120.method1348(-89);
                if (var203 == 255) {
                    var203 = -1;
                    var204 = -1;
                }
                class126.method801(arg0 ^ 0xFFFFCA97, var203, var204);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 101) {
                int var205 = class156.field2120.method1343(255);
                if (var205 == 65535) {
                    var205 = -1;
                }
                int var206 = class156.field2120.method1348(arg0 ^ 0x356A);
                int var207 = class156.field2120.method1343(255);
                int var208 = class156.field2120.method1348(-87);
                class403.method2603((byte) -96, var207, var205, var206, var208);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 233) {
                int var209 = class156.field2120.method1328(8);
                int var210 = class156.field2120.method1343(255);
                if (var210 == 65535) {
                    var210 = -1;
                }
                int var211 = class156.field2120.method1361(arg0 + 3886);
                int var212 = class156.field2120.method1356((byte) -69);
                if (var212 == 65535) {
                    var212 = -1;
                }
                int var213 = class156.field2120.method1361(-9711);
                if (class156.method967(-100, var211)) {
                    for (int var214 = var210; var214 <= var212; var214++) {
                        long var215 = ((long) var209 << 32) + (long) var214;
                        class304 var217 = (class304) class34.field474.method384(var215, true);
                        class304 var218;
                        if (var217 != null) {
                            var218 = new class304(var217.field4475, var213);
                            var217.method322(11);
                        } else if (var214 == -1) {
                            var218 = new class304(class196.method1168((byte) -91, var209).field5805.field4475, var213);
                        } else {
                            var218 = new class304(0, var213);
                        }
                        class34.field474.method381(true, var218, var215);
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 121) {
                class91.method637(-111);
                class145.field1988 = -1;
                return false;
            } else if (class145.field1988 == 33) {
                int var219 = class156.field2120.method1361(-9711);
                String var220 = class156.field2120.method1329(991328496);
                int var221 = class156.field2120.method1340(-128);
                if (class156.method967(-68, var219)) {
                    class354.method2328(var220, var221, (byte) -95);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 96) {
                int var222 = class156.field2120.method1361(-9711);
                int var223 = class156.field2120.method1356((byte) -111);
                int var224 = class156.field2120.method1328(8);
                int var225 = class156.field2120.method1361(-9711);
                int var226 = class156.field2120.method1343(255);
                if (class156.method967(-79, var225)) {
                    class237.method1420((byte) 94, var223, var226, var222, var224);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 157) {
                int var227 = class156.field2120.method1343(255);
                int var228 = class156.field2120.method1343(255);
                int var229 = class156.field2120.method1343(255);
                int var230 = class156.field2120.method1343(arg0 ^ 0xFFFFCA1C);
                if (class156.method967(-126, var227) && class365.field5292[var228] != null) {
                    for (int var231 = var229; var231 < var230; var231++) {
                        int var232 = class156.field2120.method1333((byte) -128);
                        if (var231 < class365.field5292[var228].length && class365.field5292[var228][var231] != null) {
                            class365.field5292[var228][var231].field5634 = var232;
                        }
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 99) {
                int var233 = class156.field2120.method1344((byte) 87);
                int var234 = class156.field2120.method1343(255);
                if (var233 < -70000) {
                    var234 += 32768;
                }
                class394 var235;
                if (var233 >= 0) {
                    var235 = class196.method1168((byte) -110, var233);
                } else {
                    var235 = null;
                }
                while (class300.field4398 > class156.field2120.field3029) {
                    int var236 = class156.field2120.method1327((byte) -64);
                    int var237 = class156.field2120.method1343(255);
                    int var238 = 0;
                    if (var237 != 0) {
                        var238 = class156.field2120.method1348(-99);
                        if (var238 == 255) {
                            var238 = class156.field2120.method1344((byte) 125);
                        }
                    }
                    if (var235 != null && var236 >= 0 && var236 < var235.field5777.length) {
                        var235.field5777[var236] = var237;
                        var235.field5776[var236] = var238;
                    }
                    class84.method603(var238, var236, var237 - 1, var234, -8127);
                }
                if (var235 != null) {
                    class407.method2621(var235, 15);
                }
                class142.method904(false);
                class61.field808[class183.method1117(class346.field4983++, 31)] = class183.method1117(32767, var234);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 205) {
                int var239 = class156.field2120.method1361(-9711);
                if (var239 == 65535) {
                    var239 = -1;
                }
                int var240 = class156.field2120.method1328(8);
                int var241 = class156.field2120.method1356((byte) -39);
                if (class156.method967(-70, var241)) {
                    class419.method2682(-1, var239, -1, var240, 2);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 50) {
                class35.method235(class76.field1085, class156.field2120, false, class300.field4398);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 128) {
                class277.method1905(124, false);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 127) {
                int var242 = class156.field2120.method1361(arg0 + 3886);
                int var243 = class156.field2120.method1340(-128);
                int var244 = class156.field2120.method1328(arg0 ^ 0xFFFFCAEB);
                int var245 = class156.field2120.method1340(-128);
                int var246 = class156.field2120.method1340(arg0 + 13469);
                if (class156.method967(-98, var245)) {
                    class419.method2682(var246, var242 | var243 << 16, -1, var244, 7);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 81) {
                int var247 = class156.field2120.method1367(-1892819960);
                int var248 = class156.field2120.method1356((byte) -119);
                int var249 = class156.field2120.method1348(-109);
                if (class156.method967(-68, var248)) {
                    class9.method71(var247, (byte) 106, var249);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 40) {
                boolean var250 = class156.field2120.method1348(arg0 + 13476) == 1;
                String var251 = class156.field2120.method1329(991328496);
                String var252 = var251;
                if (var250) {
                    var252 = class156.field2120.method1329(991328496);
                }
                long var253 = (long) class156.field2120.method1343(255);
                long var255 = (long) class156.field2120.method1333((byte) -125);
                int var257 = class156.field2120.method1348(-87);
                int var258 = class156.field2120.method1343(255);
                long var259 = (var253 << 32) + var255;
                boolean var261 = false;
                int var262 = 0;
                while (true) {
                    if (var262 >= 100) {
                        if (var257 <= 1 && method344((byte) -66, var252)) {
                            var261 = true;
                        }
                        break;
                    }
                    if (class373.field5424[var262] == var259) {
                        var261 = true;
                        break;
                    }
                    var262++;
                }
                if (!var261 && class307.field4523 == 0) {
                    class373.field5424[class88.field1239] = var259;
                    class88.field1239 = (class88.field1239 + 1) % 100;
                    String var263 = class418.method2678(var258, 14317).method2457(class156.field2120, (byte) -47);
                    if (var257 == 2) {
                        class366.method2387((String) null, 18, arg0 ^ 0xFFFFCAE3, var263, var258, 0, "<img=1>" + var252, "<img=1>" + var251);
                    } else if (var257 == 1) {
                        class366.method2387((String) null, 18, 0, var263, var258, 0, "<img=0>" + var252, "<img=0>" + var251);
                    } else {
                        class366.method2387((String) null, 18, 0, var263, var258, 0, var252, var251);
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 93) {
                int var264 = class156.field2120.method1343(255);
                int var265 = class156.field2120.method1348(-122);
                int var266 = class156.field2120.method1348(-97);
                int var267 = class156.field2120.method1343(255);
                int var268 = class156.field2120.method1348(-119);
                int var269 = class156.field2120.method1348(-112);
                if (class156.method967(-100, var264)) {
                    class430.method2724(var268, true, var266, var269, (byte) 94, var267, var265);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 105) {
                class237.field3182 = class156.field2120.method1348(-121);
                class416.field6111 = class207.field2788;
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 245) {
                String var270 = class156.field2120.method1329(991328496);
                int var271 = class156.field2120.method1343(255);
                String var272 = class418.method2678(var271, 14317).method2457(class156.field2120, (byte) -90);
                class366.method2387((String) null, 19, 0, var272, var271, 0, var270, var270);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 163) {
                class16.field225 = class156.field2120.method1348(-92);
                class316.field4617 = class156.field2120.method1371(arg0 + 13501);
                while (class300.field4398 > class156.field2120.field3029) {
                    class145.field1988 = class156.field2120.method1348(-117);
                    class407.method2623((byte) 102);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 228) {
                class277.method1905(arg0 + 13724, true);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 178) {
                int var273 = class156.field2120.method1348(-98);
                int var274 = var273 >> 5;
                int var275 = var273 & 0x1F;
                if (var275 == 0) {
                    class219.field2903[var274] = null;
                    class145.field1988 = -1;
                    return true;
                }
                class194 var276 = new class194();
                var276.field2596 = var275;
                var276.field2592 = class156.field2120.method1348(arg0 + 13489);
                if (var276.field2592 >= 0 && var276.field2592 < class304.field4459.length) {
                    if (var276.field2596 == 1 || var276.field2596 == 10) {
                        var276.field2601 = class156.field2120.method1343(255);
                        class156.field2120.field3029 += 5;
                    } else if (var276.field2596 >= 2 && var276.field2596 <= 6) {
                        if (var276.field2596 == 2) {
                            var276.field2590 = 64;
                            var276.field2593 = 64;
                        }
                        if (var276.field2596 == 3) {
                            var276.field2593 = 0;
                            var276.field2590 = 64;
                        }
                        if (var276.field2596 == 4) {
                            var276.field2590 = 64;
                            var276.field2593 = 128;
                        }
                        if (var276.field2596 == 5) {
                            var276.field2590 = 0;
                            var276.field2593 = 64;
                        }
                        if (var276.field2596 == 6) {
                            var276.field2590 = 128;
                            var276.field2593 = 64;
                        }
                        var276.field2596 = 2;
                        var276.field2597 = class156.field2120.method1343(255);
                        var276.field2603 = class156.field2120.method1343(255);
                        var276.field2594 = class156.field2120.method1348(-117);
                        var276.field2600 = class156.field2120.method1343(255);
                    }
                    var276.field2591 = class156.field2120.method1343(255);
                    if (var276.field2591 == 65535) {
                        var276.field2591 = -1;
                    }
                    class219.field2903[var274] = var276;
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 113) {
                int var277 = class156.field2120.method1344((byte) 103);
                int var278 = class156.field2120.method1343(arg0 ^ 0xFFFFCA1C);
                if (var277 < -70000) {
                    var278 += 32768;
                }
                class394 var279;
                if (var277 >= 0) {
                    var279 = class196.method1168((byte) -124, var277);
                } else {
                    var279 = null;
                }
                if (var279 != null) {
                    for (int var280 = 0; var280 < var279.field5777.length; var280++) {
                        var279.field5777[var280] = 0;
                        var279.field5776[var280] = 0;
                    }
                }
                class79.method571(var278, arg0 ^ 0xFFFFCAFB);
                int var281 = class156.field2120.method1343(255);
                for (int var282 = 0; var282 < var281; var282++) {
                    int var283 = class156.field2120.method1374(0);
                    if (var283 == 255) {
                        var283 = class156.field2120.method1344((byte) 92);
                    }
                    int var284 = class156.field2120.method1361(-9711);
                    if (var279 != null && var282 < var279.field5777.length) {
                        var279.field5777[var282] = var284;
                        var279.field5776[var282] = var283;
                    }
                    class84.method603(var283, var282, var284 - 1, var278, -8127);
                }
                if (var279 != null) {
                    class407.method2621(var279, 15);
                }
                class142.method904(false);
                class61.field808[class183.method1117(class346.field4983++, 31)] = class183.method1117(var278, 32767);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 24) {
                int var285 = class156.field2120.method1356((byte) -119);
                int var286 = class156.field2120.method1361(-9711);
                int var287 = class156.field2120.method1344((byte) 93);
                if (class156.method967(-120, var285)) {
                    class35.method238(var287, arg0 ^ 0xFFFFCA86, var286);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 19) {
                class16.field225 = class156.field2120.method1355(29550);
                class316.field4617 = class156.field2120.method1348(-95);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 238) {
                int var288 = class156.field2120.method1361(-9711);
                int var289 = class156.field2120.method1374(0);
                int var290 = class156.field2120.method1367(-1892819960);
                int var291 = class156.field2120.method1361(-9711);
                if (class156.method967(-91, var288)) {
                    class169 var292 = (class169) class99.field1377.method384((long) var290, true);
                    if (var292 != null) {
                        class271.method1864(true, false, var292.field2275 != var291, var292);
                    }
                    class124.method791(var289, var291, false, false, var290);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 147 || class145.field1988 == 255 || class145.field1988 == 159 || class145.field1988 == 207 || class145.field1988 == 80 || class145.field1988 == 191 || class145.field1988 == 87 || class145.field1988 == 90 || class145.field1988 == 187 || class145.field1988 == 69 || class145.field1988 == 144 || class145.field1988 == 75 || class145.field1988 == 47 || class145.field1988 == 132 || class145.field1988 == 184) {
                class407.method2623((byte) 120);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 77) {
                int var293 = class156.field2120.method1361(-9711);
                if (var293 == 65535) {
                    var293 = -1;
                }
                int var294 = class156.field2120.method1355(29550);
                class312.method2112(var294, (byte) -21, var293);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 66) {
                int var295 = class156.field2120.method1375(-117);
                int var296 = class156.field2120.method1340(-128);
                if (var296 == 65535) {
                    var296 = -1;
                }
                int var297 = class156.field2120.method1374(arg0 ^ 0xFFFFCAE3);
                class254.method1553(var297, var295, false, var296);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 179) {
                class112.field1577 = class156.field2120.method1348(-90);
                class41.field575 = class156.field2120.method1348(-126);
                class130.field1797 = class156.field2120.method1348(-109);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 98) {
                class16.field225 = class156.field2120.method1348(-122);
                class316.field4617 = class156.field2120.method1374(0);
                for (class38 var298 = (class38) class200.field2656.method389(0); var298 != null; var298 = (class38) class200.field2656.method388(arg0 ^ 0xFFFFCAE3)) {
                    int var300 = (int) (var298.field640 & 0x3FFFL);
                    int var301 = (int) (var298.field640 >> 14 & 0x3FFFL);
                    int var302 = (int) (var298.field640 >> 28 & 0x3L);
                    if (class227.field2981 == var302 && class16.field225 <= var300 && (class16.field225 + 8) > var300 && class316.field4617 <= var301 && var301 < (class316.field4617 + 8)) {
                        var298.method322(11);
                        class73.method538(var301, var300, (byte) -36, class227.field2981);
                    }
                }
                for (class306 var299 = (class306) class198.field2639.method332(-2130841184); var299 != null; var299 = (class306) class198.field2639.method343((byte) -100)) {
                    if (class16.field225 <= var299.field4492 && (class16.field225 + 8) > var299.field4492 && class316.field4617 <= var299.field4503 && (class316.field4617 + 8) > var299.field4503 && class227.field2981 == var299.field4493) {
                        var299.field4509 = 0;
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 223) {
                boolean var303 = class156.field2120.method1348(-125) == 1;
                String var304 = class156.field2120.method1329(arg0 ^ 0xC4E9B213);
                String var305 = var304;
                if (var303) {
                    var305 = class156.field2120.method1329(arg0 + 991342093);
                }
                long var306 = (long) class156.field2120.method1343(255);
                long var308 = (long) class156.field2120.method1333((byte) -99);
                int var310 = class156.field2120.method1348(-96);
                long var311 = (var306 << 32) + var308;
                boolean var313 = false;
                int var314 = 0;
                while (true) {
                    if (var314 >= 100) {
                        if (var310 <= 1) {
                            if (!(!class375.field5459 || class69.field898) || class234.field3122) {
                                var313 = true;
                            } else if (method344((byte) -121, var305)) {
                                var313 = true;
                            }
                        }
                        break;
                    }
                    if (class373.field5424[var314] == var311) {
                        var313 = true;
                        break;
                    }
                    var314++;
                }
                if (!var313 && class307.field4523 == 0) {
                    class373.field5424[class88.field1239] = var311;
                    class88.field1239 = (class88.field1239 + 1) % 100;
                    String var315 = class430.method2725(class368.method2393(true, class250.method1517(class156.field2120, (byte) 60)), (byte) -56);
                    if (var310 == 2) {
                        class366.method2387((String) null, 7, arg0 + 13597, var315, -1, 0, "<img=1>" + var305, "<img=1>" + var304);
                    } else if (var310 == 1) {
                        class366.method2387((String) null, 7, 0, var315, -1, 0, "<img=0>" + var305, "<img=0>" + var304);
                    } else {
                        class366.method2387((String) null, 3, 0, var315, -1, 0, var305, var304);
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 201) {
                int var316 = class156.field2120.method1374(arg0 + 13597);
                int var317 = class156.field2120.method1343(255);
                class89.method627(var317, false, var316);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 138) {
                int var318 = class156.field2120.method1343(255);
                int var319 = class156.field2120.method1371(arg0 ^ 0x3552);
                if (class156.method967(-74, var318)) {
                    class31.field450 = var319;
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 232) {
                int var320 = class156.field2120.method1371(-83);
                int var321 = class156.field2120.method1340(-128);
                int var322 = class156.field2120.method1356((byte) -126);
                class43 var323 = class306.field4496[var321];
                if (var323 != null) {
                    class185.method1127(var323, var320, var322, true);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 225) {
                int var324 = class156.field2120.method1348(arg0 ^ 0x3567);
                int var325 = class156.field2120.method1356((byte) -95);
                int var326 = class156.field2120.method1340(-128);
                if (class156.method967(arg0 ^ 0x3550, var325)) {
                    if (var324 == 2) {
                        class145.method924(1024);
                    }
                    class329.field4790 = var326;
                    class270.method1853(arg0 ^ 0xFFFFCAE2, var326);
                    class110.method720((byte) 125, false);
                    class123.method784(class329.field4790);
                    for (int var327 = 0; var327 < 100; var327++) {
                        class270.field3927[var327] = true;
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 114) {
                class142.method904(false);
                class115.field1610 = class156.field2120.method1319((byte) -13);
                class145.field1988 = -1;
                class367.field5298 = class207.field2788;
                return true;
            } else if (class145.field1988 == 177) {
                int var328 = class156.field2120.method1361(-9711);
                class177.method1082(var328, (byte) -118);
                class61.field808[class183.method1117(class346.field4983++, 31)] = class183.method1117(32767, var328);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 59) {
                int var329 = class156.field2120.method1340(-128);
                if (var329 == 65535) {
                    var329 = -1;
                }
                int var330 = class156.field2120.method1328(8);
                int var331 = class156.field2120.method1367(-1892819960);
                int var332 = class156.field2120.method1356((byte) -65);
                if (class156.method967(-88, var332)) {
                    class394 var333 = class196.method1168((byte) -109, var331);
                    if (var333.field5790) {
                        class189.method1146(var329, false, var331, var330);
                        class83 var335 = class9.method74(var329, (byte) 64);
                        class237.method1420((byte) 114, var335.field1170, var335.field1155, var335.field1125, var331);
                        class157.method972(var335.field1146, var335.field1131, var331, var335.field1198, arg0 + 13607);
                    } else if (var329 == -1) {
                        var333.field5749 = 0;
                        class145.field1988 = -1;
                        return true;
                    } else {
                        class83 var334 = class9.method74(var329, (byte) -88);
                        var333.field5756 = var329;
                        var333.field5659 = var334.field1170 * 100 / var330;
                        var333.field5749 = 4;
                        var333.field5795 = var334.field1125;
                        var333.field5666 = var334.field1155;
                        class407.method2621(var333, arg0 + 13612);
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 195) {
                int var336 = class156.field2120.method1371(arg0 + 13524);
                int var337 = class156.field2120.method1355(29550);
                int var338 = class156.field2120.method1355(arg0 ^ 0xFFFFB98D);
                class227.field2981 = var336 >> 1;
                class227.field2988.method165(var337, class227.field2981, (var336 & 0x1) == 1, var338, false);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 197) {
                int var339 = class156.field2120.method1344((byte) 114);
                class394 var340 = class196.method1168((byte) -73, var339);
                for (int var341 = 0; var341 < var340.field5777.length; var341++) {
                    var340.field5777[var341] = -1;
                    var340.field5777[var341] = 0;
                }
                class407.method2621(var340, 15);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 199) {
                byte var342 = class156.field2120.method1336(0);
                int var343 = class156.field2120.method1340(-128);
                int var344 = class156.field2120.method1343(255);
                if (class156.method967(arg0 ^ 0x357E, var344)) {
                    class218.method1276(var343, var342, false);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 185) {
                int var345 = class156.field2120.method1340(-128);
                int var346 = class156.field2120.method1367(-1892819960);
                int var347 = class156.field2120.method1340(-128);
                if (class156.method967(-125, var345)) {
                    class56.method380((byte) 118, var347, var346);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 150) {
                class10.method76((byte) -121);
                class142.method904(false);
                class145.field1988 = -1;
                class159.field2151 += 32;
                return true;
            } else if (class145.field1988 == 230) {
                int var348 = class156.field2120.method1343(arg0 ^ 0xFFFFCA1C);
                String var349 = class156.field2120.method1329(991328496);
                Object[] var350 = new Object[var349.length() + 1];
                for (int var351 = var349.length() - 1; var351 >= 0; var351--) {
                    if (var349.charAt(var351) == 's') {
                        var350[var351 + 1] = class156.field2120.method1329(991328496);
                    } else {
                        var350[var351 + 1] = Integer.valueOf(class156.field2120.method1344((byte) 62));
                    }
                }
                var350[0] = Integer.valueOf(class156.field2120.method1344((byte) 51));
                if (class156.method967(-104, var348)) {
                    class192 var352 = new class192();
                    var352.field2578 = var350;
                    class123.method783(var352);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 123) {
                int var353 = class156.field2120.method1343(255);
                int var354 = class156.field2120.method1348(-101);
                int var355 = class156.field2120.method1348(-107);
                int var356 = class156.field2120.method1343(255);
                int var357 = class156.field2120.method1348(arg0 ^ 0x3542);
                int var358 = class156.field2120.method1348(-98);
                if (class156.method967(-70, var353)) {
                    class180.method1101(var356, var357, var354, 1024, var355, var358);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 218) {
                class182.method1107((byte) 77, class156.field2120.method1329(991328496));
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 206) {
                class28.method198((byte) 40);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 36) {
                class156.field2120.field3029 += 28;
                if (class156.field2120.method1370((byte) 127)) {
                    class110.method722(class156.field2120.field3029 - 28, -117, class156.field2120);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 43) {
                int var359 = class156.field2120.method1343(255);
                String var360 = class156.field2120.method1329(arg0 + 991342093);
                int var361 = class156.field2120.method1343(255);
                if (class156.method967(-124, var361)) {
                    class354.method2328(var360, var359, (byte) -95);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 164) {
                int var362 = class156.field2120.method1340(-128);
                int var363 = class156.field2120.method1363(arg0 + 13852);
                if (class156.method967(-87, var362)) {
                    class419.method2682(0, 2047, arg0 + 13596, var363, 5);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 89) {
                int var364 = class156.field2120.method1348(-126);
                boolean var365 = (var364 & 0x1) == 1;
                String var366 = class156.field2120.method1329(arg0 ^ 0xC4E9B213);
                String var367 = class156.field2120.method1329(991328496);
                String var368 = class156.field2120.method1329(991328496);
                String var369 = class156.field2120.method1329(991328496);
                if (var365) {
                    for (int var370 = 0; var370 < class318.field4649; var370++) {
                        if (class295.field4233[var370].equals(var369)) {
                            class212.field2840[var370] = var366;
                            if (var367.equals("")) {
                                class295.field4233[var370] = var366;
                            } else {
                                class295.field4233[var370] = var367;
                            }
                            class307.field4520[var370] = var368;
                            if (var369.equals("")) {
                                class281.field4094[var370] = var368;
                            } else {
                                class281.field4094[var370] = var369;
                            }
                            break;
                        }
                    }
                } else {
                    class212.field2840[class318.field4649] = var366;
                    if (var367.equals("")) {
                        class295.field4233[class318.field4649] = var366;
                    } else {
                        class295.field4233[class318.field4649] = var367;
                    }
                    class307.field4520[class318.field4649] = var368;
                    if (var369.equals("")) {
                        class281.field4094[class318.field4649] = var368;
                    } else {
                        class281.field4094[class318.field4649] = var369;
                    }
                    class235.field3128[class318.field4649] = class183.method1117(2, var364) == 2;
                    class318.field4649++;
                }
                class416.field6111 = class207.field2788;
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 15) {
                if (class329.field4790 != -1) {
                    class362.method2367(0, class329.field4790, arg0 ^ 0xFFFFF2E3);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 234) {
                int var371 = class156.field2120.method1343(255);
                int var372 = class156.field2120.method1344((byte) 125);
                if (class156.method967(-75, var371)) {
                    class169 var373 = (class169) class99.field1377.method384((long) var372, true);
                    if (var373 != null) {
                        class271.method1864(true, false, true, var373);
                    }
                    if (class211.field2807 != null) {
                        class407.method2621(class211.field2807, 15);
                        class211.field2807 = null;
                    }
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 148) {
                if (class300.field4398 == 0) {
                    class319.field4669 = class225.field2960;
                } else {
                    class319.field4669 = class156.field2120.method1329(991328496);
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 142) {
                int var374 = class156.field2120.method1356((byte) -22);
                int var375 = class156.field2120.method1367(-1892819960);
                class89.method627(var374, false, var375);
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 160) {
                int var376 = class156.field2120.method1374(arg0 ^ 0xFFFFCAE3);
                int var377 = class156.field2120.method1356((byte) -115);
                if (var377 == 65535) {
                    var377 = -1;
                }
                int var378 = class156.field2120.method1374(0);
                String var379 = class156.field2120.method1329(arg0 + 991342093);
                if (var378 >= 1 && var378 <= 8) {
                    if (var379.equalsIgnoreCase("null")) {
                        var379 = null;
                    }
                    class286.field4142[var378 - 1] = var379;
                    class310.field4564[var378 - 1] = var377;
                    class418.field6191[var378 - 1] = var376 == 0;
                }
                class145.field1988 = -1;
                return true;
            } else if (class145.field1988 == 20) {
                class351.field5090 = class156.field2120.method1348(arg0 ^ 0x3571);
                class145.field1988 = -1;
                return true;
            } else {
                class248.method1494("T1 - " + class145.field1988 + "," + class26.field378 + "," + class100.field1411 + " - " + class300.field4398, -51, (Throwable) null);
                class91.method637(-110);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V", line = 2907)
    public static void method346(int arg0) {
        field674 = null;
        field679 = null;
        if (arg0 <= 72) {
            method346(-75);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 2919)
    public final Object method347(int arg0) {
        if (arg0 == -27089) {
            field680++;
            return this.field681;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIZI)V", line = 2935)
    public static final void method348(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        field672++;
        if (class213.field2852 == null) {
            class61.field807.method2610(arg1, -16777216, true, arg0, arg3, arg5);
            return;
        }
        class236.field3139++;
        if (class227.field2988 != null && class227.field2988.field740 - (class227.field2988.method168(-115) - 1) * 64 >> 7 == class59.field792 && class227.field2988.field734 - ((class227.field2988.method168(-121) - 1) * 64) >> 7 == class376.field5470) {
            class59.field792 = -1;
            class376.field5470 = -1;
            class313.method2124(0);
        }
        class235.method1407(1);
        if (!arg4) {
            class162.method1007((byte) -38);
        }
        class164.method1013((byte) -105);
        class365.method2384(arg0, (byte) -99, true, arg5, arg1, arg3);
        int var6 = class281.field4098;
        int var7 = class102.field1417;
        int var8 = class72.field1037;
        int var9 = class199.field2653;
        if (class346.field4979 == 1) {
            int var12 = (int) class317.field4647;
            if ((field677 >> 8) > var12) {
                var12 = field677 >> 8;
            }
            if (class119.field1671[4] && (class406.field6031[4] + 128) > var12) {
                var12 = class406.field6031[4] + 128;
            }
            int var13 = (int) class396.field5847 + class105.field1523 & 0x3FFF;
            class271.method1863(var12, (var12 >> 3) * 3 + 600, var6, var13, class52.method359((byte) -116, class227.field2988.field734, class227.field2988.field740, class227.field2981) - 50, 100, class144.field1962, class153.field2071);
        } else if (class346.field4979 == 4) {
            int var10 = (int) class317.field4647;
            if ((field677 >> 8) > var10) {
                var10 = field677 >> 8;
            }
            if (class119.field1671[4] && var10 < class406.field6031[4] + 128) {
                var10 = class406.field6031[4] + 128;
            }
            int var11 = (int) class396.field5847 & 0x3FFF;
            class271.method1863(var10, (var10 >> 3) * 3 + 600, var6, var11, class52.method359((byte) -116, class122.field1687, class363.field5238, class227.field2981) - 50, 100, class144.field1962, class153.field2071);
        } else if (class346.field4979 == 5) {
            class125.method798(-119, var6);
        }
        int var14 = class400.field5971;
        int var15 = class201.field2667;
        int var16 = class179.field2371;
        int var17 = class415.field6101;
        int var18 = class5.field66;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class119.field1671[var19]) {
                int var22 = (int) ((double) (-class365.field5291[var19]) + Math.random() * (double) (class365.field5291[var19] * 2 + 1) + Math.sin((double) class189.field2539[var19] / 100.0D * (double) class173.field2307[var19]) * (double) class406.field6031[var19]);
                if (var19 == 3) {
                    class5.field66 = class5.field66 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class201.field2667 += var22;
                }
                if (var19 == 4) {
                    class415.field6101 += var22;
                    if (class415.field6101 < 1024) {
                        class415.field6101 = 1024;
                    } else if (class415.field6101 > 3072) {
                        class415.field6101 = 3072;
                    }
                }
                if (var19 == 2) {
                    class179.field2371 += var22;
                }
                if (var19 == 0) {
                    class400.field5971 += var22;
                }
            }
        }
        if (class400.field5971 < 0) {
            class400.field5971 = 0;
        }
        if ((class104.field1436 << 7) - 1 < class400.field5971) {
            class400.field5971 = (class104.field1436 << 7) - 1;
        }
        if (class179.field2371 < 0) {
            class179.field2371 = 0;
        }
        if (((class214.field2858 << 7) - 1) < class179.field2371) {
            class179.field2371 = (class214.field2858 << 7) - 1;
        }
        if (arg2 < 107) {
            return;
        }
        class169.method1043(-403272665);
        class321.method2166(-1);
        class61.field807.method1767(var7, var9, var7 + var8, var6 + var9);
        class61.field807.method1697();
        int var20 = class104.field1487;
        if (class247.field3331 == null) {
            class61.field807.method1686(var20);
        } else {
            class247.field3331.method2764(class165.field2226 << 3, (byte) -99, class5.field66, var20, var8, class61.field807, class415.field6101, var6, var9, var7);
        }
        class281.method1935(118);
        class199.field2644.method983(class400.field5971, class201.field2667, class179.field2371, -class415.field6101 & 0x3FFF, -class5.field66 & 0x3FFF, -class404.field6005 & 0x3FFF);
        class61.field807.method1648(class199.field2644);
        class61.field807.method1723(var7 + (var8 / 2), var6 / 2 + var9, class270.field3932 << 1, class270.field3932 << 1);
        class200.method1187(class270.field3932 << 1, var6 / 2 + var9, class270.field3932 << 1, (byte) -119, var8 / 2 + var7);
        class300.method2059(-class404.field6005 & 0x3FFF, class201.field2667, class179.field2371, -class5.field66 & 0x3FFF, class400.field5971, -class415.field6101 & 0x3FFF, 15171);
        byte var21 = class312.method2113(21410) == 2 ? (byte) class236.field3139 : 1;
        class260.method1796(class61.field807, class28.field418, class352.field5096, class199.field2644, class400.field5971, class201.field2667, class179.field2371, class12.field184, class11.field169, class205.field2772, class363.field5235, class17.field246, class156.field2118, class227.field2981 + 1, var21, class227.field2988.field740 >> 7, class227.field2988.field734 >> 7, !class166.field2240);
        class281.method1935(97);
        if (class70.field932 == 30) {
            class22.method147(var6, 64, var8, 256, 256, var9, var7);
            class86.method614(var6, var9, var8, (byte) -113, 256, 256, var7);
            class299.method2050(var8, var9, var7, var6, 256, 256, (byte) 29);
            class306.method2088(32768, var9, var6, var7, var8);
        }
        class237.method1435();
        class201.field2667 = var15;
        class179.field2371 = var16;
        class400.field5971 = var14;
        class5.field66 = var18;
        class415.field6101 = var17;
        if (class415.field6094 && class182.field2480.method2801(false) == 0) {
            class415.field6094 = false;
        }
        if (class415.field6094) {
            class61.field807.method2610(var6, -16777216, true, var8, var7, var9);
            class89.method629(0, false, class372.field5413, class393.field5626);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)Z", line = 3129)
    public final boolean method349(byte arg0) {
        if (arg0 == 29) {
            field673++;
            return false;
        } else {
            return true;
        }
    }
}
