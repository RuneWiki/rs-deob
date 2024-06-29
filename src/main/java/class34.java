import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class34 extends class172 {

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[I")
    public static int[] field531 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
    public int[] field518;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "[I")
    public int[] field522;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
    public int[] field527;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "[Luh;")
    public class95[] field516;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "[Luh;")
    public class95[] field530;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[[[B")
    public byte[][][] field520;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method352(boolean arg0) throws IOException {
        field519++;
        if (class188.field2950 == null) {
            return false;
        }
        int var1 = class188.field2950.method2424((byte) 21);
        if (var1 == 0) {
            return false;
        }
        if (class123.field1966 == -1) {
            var1--;
            class188.field2950.method2428(1, class244.field3803.field448, (byte) 73, 0);
            class244.field3803.field397 = 0;
            class123.field1966 = class244.field3803.method1625((byte) 62);
            class122.field1945 = class320.field4935[class123.field1966];
        }
        if (class122.field1945 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class188.field2950.method2428(1, class244.field3803.field448, (byte) 87, 0);
            class122.field1945 = class244.field3803.field448[0] & 0xFF;
        }
        if (class122.field1945 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class188.field2950.method2428(2, class244.field3803.field448, (byte) 102, 0);
            var1 -= 2;
            class244.field3803.field397 = 0;
            class122.field1945 = class244.field3803.method314((byte) 75);
        }
        if (var1 < class122.field1945) {
            return false;
        }
        class244.field3803.field397 = 0;
        class188.field2950.method2428(class122.field1945, class244.field3803.field448, (byte) 48, 0);
        class203.field3150 = class353.field5642;
        class353.field5642 = class279.field4302;
        class174.field2764 = 0;
        class279.field4302 = class123.field1966;
        if (class123.field1966 == 8) {
            String var2 = class244.field3803.method297((byte) -82);
            boolean var3 = class244.field3803.method281(-128) == 1;
            String var4;
            if (var3) {
                var4 = class244.field3803.method297((byte) -94);
            } else {
                var4 = var2;
            }
            int var5 = class244.field3803.method314((byte) 120);
            boolean var6 = false;
            byte var7 = class244.field3803.method286((byte) 105);
            if (var7 == -128) {
                var6 = true;
            }
            if (var6) {
                if (class167.field2647 == 0) {
                    class123.field1966 = -1;
                    return true;
                }
                boolean var13 = false;
                int var14;
                for (var14 = 0; class167.field2647 > var14 && (!class13.field191[var14].field581.equals(var4) || class13.field191[var14].field577 != var5); var14++) {
                }
                if (class167.field2647 > var14) {
                    while (var14 < (class167.field2647 - 1)) {
                        class13.field191[var14] = class13.field191[var14 + 1];
                        var14++;
                    }
                    class167.field2647--;
                    class13.field191[class167.field2647] = null;
                }
            } else {
                String var8 = class244.field3803.method297((byte) -44);
                class38 var9 = new class38();
                var9.field579 = var2;
                var9.field577 = var5;
                var9.field576 = var7;
                var9.field583 = var8;
                var9.field581 = var4;
                int var10;
                for (var10 = class167.field2647 - 1; var10 >= 0; var10--) {
                    int var11 = class13.field191[var10].field581.compareTo(var9.field581);
                    if (var11 == 0) {
                        class13.field191[var10].field577 = var5;
                        class13.field191[var10].field576 = var7;
                        class13.field191[var10].field583 = var8;
                        if (var4.equals(class173.field2746.field2706)) {
                            class49.field777 = var7;
                        }
                        class123.field1966 = -1;
                        class287.field4456 = class327.field5030;
                        return true;
                    }
                    if (var11 < 0) {
                        break;
                    }
                }
                if (class13.field191.length <= class167.field2647) {
                    class123.field1966 = -1;
                    return true;
                }
                for (int var12 = class167.field2647 - 1; var12 > var10; var12--) {
                    class13.field191[var12 + 1] = class13.field191[var12];
                }
                if (class167.field2647 == 0) {
                    class13.field191 = new class38[100];
                }
                class13.field191[var10 + 1] = var9;
                class167.field2647++;
                if (var4.equals(class173.field2746.field2706)) {
                    class49.field777 = var7;
                }
            }
            class123.field1966 = -1;
            class287.field4456 = class327.field5030;
            return true;
        } else if (class123.field1966 == 64) {
            class294.method2125(10250);
            int var369 = class244.field3803.method287(128);
            int var370 = class244.field3803.method262((byte) 70);
            int var371 = class244.field3803.method287(128);
            class260.field3982[var369] = var370;
            class176.field2778[var369] = var371;
            class100.field1497[var369] = 1;
            for (int var372 = 0; var372 < 98; var372++) {
                if (class109.field1631[var372] <= var370) {
                    class100.field1497[var369] = var372 + 2;
                }
            }
            class329.field5071[class301.method2169(31, class90.field1279++)] = var369;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 13) {
            int var366 = class244.field3803.method281(103);
            int var367 = class244.field3803.method281(-125);
            byte var368 = class244.field3803.method286((byte) 85);
            if (class252.field3888 != var368) {
                class123.field1966 = -1;
                return true;
            }
            class123.field1966 = -1;
            if (var366 == 255) {
                class29.field472 = false;
                class278.field4291 = 0;
                class266.field4126 = 0;
            } else {
                class266.field4126 = var366;
                class278.field4291 = var367;
                class29.field472 = true;
            }
            return true;
        } else if (class123.field1966 == 108) {
            class143.field2347 = class244.field3803.method281(124);
            for (int var365 = 0; var365 < class143.field2347; var365++) {
                class168.field2669[var365] = class244.field3803.method297((byte) -95);
                class238.field3692[var365] = class244.field3803.method297((byte) -109);
                if (class238.field3692[var365].equals("")) {
                    class238.field3692[var365] = class168.field2669[var365];
                }
                class253.field3905[var365] = class244.field3803.method297((byte) -121);
                class231.field3608[var365] = class244.field3803.method297((byte) -56);
                if (class231.field3608[var365].equals("")) {
                    class231.field3608[var365] = class253.field3905[var365];
                }
                class159.field2535[var365] = false;
            }
            class66.field1013 = class327.field5030;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 106) {
            int var15 = class244.field3803.method274((byte) -11);
            int var16 = class244.field3803.method275(2);
            int var17 = class244.field3803.method307((byte) -108);
            if (class326.method2300(var15, 94)) {
                if (var17 == 2) {
                    class274.method2016(21560);
                }
                class164.field2604 = var16;
                class290.method2106(0, var16);
                class108.method942(true, false);
                class49.method472(class164.field2604, (byte) -35);
                for (int var18 = 0; var18 < 100; var18++) {
                    class227.field3540[var18] = true;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 9) {
            String var363 = class244.field3803.method297((byte) -85);
            String var364 = class145.method1207(class72.method685(class66.method648((byte) 120, class244.field3803), (byte) -103));
            class72.method683(var363, var363, (byte) -124, var364, 0, 6);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 114) {
            if (class212.field3321 != null) {
                class207.method1543(-1, 38, false, -1, class123.field1968);
            }
            byte[] var361 = new byte[class122.field1945];
            class244.field3803.method1624((byte) -54, class122.field1945, 0, var361);
            String var362 = class206.method1532(var361, class122.field1945, false, 0);
            if (class67.field1028 == null && class323.field4971 == 3 || !class323.field4961.startsWith("win") || class181.field2833) {
                class33.method343(var362, 0, true);
            } else {
                class62.field954 = true;
                class58.field912 = var362;
                class74.field1097 = class340.field5234.method2284((byte) -126, var362);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 76) {
            class303.field4722 = class244.field3803.method281(-126);
            class66.field1013 = class327.field5030;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 112) {
            boolean var19 = class244.field3803.method281(-126) == 1;
            String var20 = class244.field3803.method297((byte) -42);
            String var21 = class244.field3803.method297((byte) -121);
            int var22 = class244.field3803.method314((byte) 83);
            int var23 = class244.field3803.method281(113);
            String var24 = "";
            boolean var25 = false;
            if (var22 > 0) {
                var24 = class244.field3803.method297((byte) -117);
                var25 = class244.field3803.method281(40) == 1;
            }
            for (int var26 = 0; var26 < class131.field2215; var26++) {
                if (var19) {
                    if (var21.equals(class83.field1197[var26])) {
                        class83.field1197[var26] = var20;
                        class173.field2751[var26] = var21;
                        var20 = null;
                        break;
                    }
                } else if (var20.equals(class83.field1197[var26])) {
                    if (class55.field807[var26] != var22) {
                        class55.field807[var26] = var22;
                        if (var22 > 0) {
                            class72.method683("", "", (byte) -123, var20 + class108.field1625, 0, 5);
                        }
                        if (var22 == 0) {
                            class72.method683("", "", (byte) -111, var20 + class178.field2802, 0, 5);
                        }
                    }
                    class173.field2751[var26] = var21;
                    class201.field3107[var26] = var24;
                    var20 = null;
                    class36.field537[var26] = var23;
                    class13.field182[var26] = var25;
                    break;
                }
            }
            boolean var27 = false;
            if (var20 != null && class131.field2215 < 200) {
                class83.field1197[class131.field2215] = var20;
                class173.field2751[class131.field2215] = var21;
                class55.field807[class131.field2215] = var22;
                class201.field3107[class131.field2215] = var24;
                class36.field537[class131.field2215] = var23;
                class13.field182[class131.field2215] = var25;
                class131.field2215++;
            }
            class66.field1013 = class327.field5030;
            int var28 = class131.field2215;
            while (var28 > 0) {
                boolean var29 = true;
                var28--;
                for (int var30 = 0; var30 < var28; var30++) {
                    if (class55.field807[var30] != class207.field3196 && class55.field807[var30 + 1] == class207.field3196 || class55.field807[var30] == 0 && class55.field807[var30 + 1] != 0) {
                        var29 = false;
                        int var31 = class55.field807[var30];
                        class55.field807[var30] = class55.field807[var30 + 1];
                        class55.field807[var30 + 1] = var31;
                        String var32 = class201.field3107[var30];
                        class201.field3107[var30] = class201.field3107[var30 + 1];
                        class201.field3107[var30 + 1] = var32;
                        String var33 = class83.field1197[var30];
                        class83.field1197[var30] = class83.field1197[var30 + 1];
                        class83.field1197[var30 + 1] = var33;
                        String var34 = class173.field2751[var30];
                        class173.field2751[var30] = class173.field2751[var30 + 1];
                        class173.field2751[var30 + 1] = var34;
                        int var35 = class36.field537[var30];
                        class36.field537[var30] = class36.field537[var30 + 1];
                        class36.field537[var30 + 1] = var35;
                        boolean var36 = class13.field182[var30];
                        class13.field182[var30] = class13.field182[var30 + 1];
                        class13.field182[var30 + 1] = var36;
                    }
                }
                if (var29) {
                    break;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 97) {
            class346.method2442((byte) -103, class244.field3803.method297((byte) -39));
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 49 || class123.field1966 == 67 || class123.field1966 == 113 || class123.field1966 == 179 || class123.field1966 == 200 || class123.field1966 == 173 || class123.field1966 == 134 || class123.field1966 == 50 || class123.field1966 == 146 || class123.field1966 == 130 || class123.field1966 == 21 || class123.field1966 == 81 || class123.field1966 == 90 || class123.field1966 == 17) {
            class151.method1253((byte) 75);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 14) {
            class244.field3803.field397 += 28;
            if (class244.field3803.method254(102)) {
                class228.method1710(-22293, class244.field3803, class244.field3803.field397 - 28);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 38) {
            class287.field4456 = class327.field5030;
            if (class122.field1945 == 0) {
                class301.field4672 = null;
                class284.field4405 = null;
                class123.field1966 = -1;
                class167.field2647 = 0;
                class13.field191 = null;
                return true;
            }
            class284.field4405 = class244.field3803.method297((byte) -40);
            boolean var349 = class244.field3803.method281(104) == 1;
            if (var349) {
                class244.field3803.method297((byte) -55);
            }
            long var350 = class244.field3803.method266(47);
            class301.field4672 = class233.method1744(var350, (byte) -98);
            class43.field687 = class244.field3803.method286((byte) 99);
            int var352 = class244.field3803.method281(59);
            if (var352 == 255) {
                class123.field1966 = -1;
                return true;
            }
            class167.field2647 = var352;
            class38[] var353 = new class38[100];
            for (int var354 = 0; var354 < class167.field2647; var354++) {
                var353[var354] = new class38();
                var353[var354].field579 = class244.field3803.method297((byte) -65);
                boolean var355 = class244.field3803.method281(58) == 1;
                if (var355) {
                    var353[var354].field581 = class244.field3803.method297((byte) -74);
                } else {
                    var353[var354].field581 = var353[var354].field579;
                }
                var353[var354].field577 = class244.field3803.method314((byte) 91);
                var353[var354].field576 = class244.field3803.method286((byte) 102);
                var353[var354].field583 = class244.field3803.method297((byte) -90);
                if (var353[var354].field581.equals(class173.field2746.field2706)) {
                    class49.field777 = var353[var354].field576;
                }
            }
            boolean var356 = false;
            int var357 = class167.field2647;
            while (var357 > 0) {
                boolean var358 = true;
                var357--;
                for (int var359 = 0; var359 < var357; var359++) {
                    if (var353[var359].field579.compareTo(var353[var359 + 1].field579) > 0) {
                        var358 = false;
                        class38 var360 = var353[var359];
                        var353[var359] = var353[var359 + 1];
                        var353[var359 + 1] = var360;
                    }
                }
                if (var358) {
                    break;
                }
            }
            class13.field191 = var353;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 31) {
            int var346 = class244.field3803.method298(1);
            int var347 = class244.field3803.method274((byte) -11);
            int var348 = class244.field3803.method291(2);
            if (class326.method2300(var347, 87)) {
                class308.method2199(var348, var346, (byte) 127);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 137) {
            int var345 = class244.field3803.method314((byte) 40);
            if (class326.method2300(var345, 118)) {
                class82.method741((byte) -124);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 175) {
            int var342 = class244.field3803.method314((byte) 60);
            int var343 = class244.field3803.method257((byte) -118);
            int var344 = class244.field3803.method261((byte) -111);
            if (class326.method2300(var344, 40)) {
                class355.method2495(0, var342, var343);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 204) {
            int var341 = class244.field3803.method281(-126);
            if (class244.field3803.method281(-126) == 0) {
                class230.field3598[var341] = new class266();
            } else {
                class244.field3803.field397--;
                class230.field3598[var341] = new class266(class244.field3803);
            }
            class123.field1966 = -1;
            class129.field2144 = class327.field5030;
            return true;
        } else if (class123.field1966 == 51) {
            int var37 = class244.field3803.method256(-3);
            int var38 = class244.field3803.method281(-125);
            int var39 = class244.field3803.method274((byte) -11);
            if (class326.method2300(var39, 37)) {
                class321.method2270(false, var38, var37);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 69) {
            int var338 = class244.field3803.method275(2);
            String var339 = class244.field3803.method297((byte) -110);
            int var340 = class244.field3803.method275(2);
            if (class326.method2300(var338, 92)) {
                class295.method2131(var339, var340, -1);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 65) {
            int var40 = class244.field3803.method298(1);
            int var41 = var40 >> 28 & 0x3;
            int var42 = var40 & 0x3FFF;
            int var43 = var40 >> 14 & 0x3FFF;
            int var44 = class244.field3803.method314((byte) 110);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class244.field3803.method281(-125);
            int var46 = var42 - class49.field755;
            int var47 = var45 >> 2;
            int var48 = var45 & 0x3;
            int var49 = class113.field1742[var47];
            int var50 = var43 - class358.field5696;
            class303.method2188(var44, var48, var47, var50, 3, var41, var46, var49);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 123) {
            class197.method1493(90);
            class123.field1966 = -1;
            return false;
        } else if (class123.field1966 == 145) {
            class294.method2125(10250);
            class194.field3052 = class244.field3803.method296(-117);
            class305.field4738 = class327.field5030;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 233) {
            class168.field2673 = class244.field3803.method287(128);
            class300.field4647 = class244.field3803.method287(128);
            while (class244.field3803.field397 < class122.field1945) {
                class123.field1966 = class244.field3803.method281(110);
                class151.method1253((byte) -85);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 224) {
            int var331 = class244.field3803.method281(28);
            String var332 = class244.field3803.method297((byte) -78);
            String var333 = class244.field3803.method297((byte) -81);
            String var334 = class244.field3803.method297((byte) -62);
            boolean var335 = (var331 & 0x1) == 1;
            String var336 = class244.field3803.method297((byte) -33);
            if (var335) {
                for (int var337 = 0; var337 < class143.field2347; var337++) {
                    if (class238.field3692[var337].equals(var336)) {
                        class168.field2669[var337] = var332;
                        if (var333.equals("")) {
                            class238.field3692[var337] = var332;
                        } else {
                            class238.field3692[var337] = var333;
                        }
                        class253.field3905[var337] = var334;
                        if (var336.equals("")) {
                            class231.field3608[var337] = var334;
                        } else {
                            class231.field3608[var337] = var336;
                        }
                        break;
                    }
                }
            } else {
                class168.field2669[class143.field2347] = var332;
                if (var333.equals("")) {
                    class238.field3692[class143.field2347] = var332;
                } else {
                    class238.field3692[class143.field2347] = var333;
                }
                class253.field3905[class143.field2347] = var334;
                if (var336.equals("")) {
                    class231.field3608[class143.field2347] = var334;
                } else {
                    class231.field3608[class143.field2347] = var336;
                }
                class159.field2535[class143.field2347] = class301.method2169(var331, 2) == 2;
                class143.field2347++;
            }
            class66.field1013 = class327.field5030;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 121) {
            int var330 = class244.field3803.method256(-3);
            class239.field3717 = class340.field5234.method2294((byte) -127, var330);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 1) {
            int var327 = class244.field3803.method274((byte) -11);
            String var328 = class244.field3803.method297((byte) -49);
            int var329 = class244.field3803.method262((byte) 18);
            if (class326.method2300(var327, 101)) {
                class158.method1284(10, var328, var329);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 217) {
            class42.method435(false, 1);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 218) {
            int var51 = class244.field3803.method261((byte) -88);
            int var52 = class244.field3803.method261((byte) -123);
            int var53 = class244.field3803.method274((byte) -11);
            int var54 = class244.field3803.method261((byte) -95);
            int var55 = class244.field3803.method257((byte) -100);
            if (class326.method2300(var51, 74)) {
                class181.method1404(7, var55, var52 << 16 | var53, var54, (byte) 99);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 180) {
            int var56 = class244.field3803.method275(2);
            int var57 = class244.field3803.method256(-3);
            class222.method1669(-112, var56, var57);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 151) {
            int var58 = class244.field3803.method275(2);
            int var59 = class244.field3803.method291(2);
            int var60 = class244.field3803.method296(-101);
            int var61 = class244.field3803.method262((byte) 119);
            if (class326.method2300(var58, 118)) {
                class83.method745(78, var60, var59, var61);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 86) {
            int var62 = class244.field3803.method275(2);
            int var63 = class244.field3803.method261((byte) -122);
            int var64 = class244.field3803.method314((byte) 58);
            if (class326.method2300(var63, 50)) {
                class105.method912((byte) -35, var62, var64);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 78) {
            int var65 = class244.field3803.method314((byte) 120);
            int var66 = class244.field3803.method281(-124);
            int var67 = class244.field3803.method281(111);
            int var68 = class244.field3803.method314((byte) 121);
            int var69 = class244.field3803.method281(-125);
            int var70 = class244.field3803.method281(44);
            if (class326.method2300(var65, 75)) {
                class128.method1112(var66, -384, var67, var69, var70, var68);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 79) {
            int var71 = class244.field3803.method261((byte) -120);
            int var72 = class244.field3803.method287(128);
            if (var71 == 65535) {
                var71 = -1;
            }
            class172.method1359(121, var71, var72);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 94) {
            int var324 = class244.field3803.method287(128);
            int var325 = class244.field3803.method282((byte) 125);
            int var326 = class244.field3803.method314((byte) 45);
            if (var326 == 65535) {
                var326 = -1;
            }
            class85.method770(var325, var326, var324, (byte) 91);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 147) {
            int var317 = class244.field3803.method262((byte) 111);
            int var318 = class244.field3803.method274((byte) -11);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var319 = class244.field3803.method256(-3);
            int var320 = class244.field3803.method261((byte) 109);
            if (class326.method2300(var320, 62)) {
                class342 var321 = class355.method2497(0, var317);
                if (var321.field5340) {
                    class356.method2501(var317, var318, var319, true);
                    class263 var322 = class48.method469(10, var318);
                    class49.method477(-1, var322.field4061, var322.field4089, var322.field4032, var317);
                    class342.method2405(var322.field4068, var322.field4025, var322.field4028, var317, (byte) -82);
                } else if (var318 == -1) {
                    var321.field5311 = 0;
                    class123.field1966 = -1;
                    return true;
                } else {
                    class263 var323 = class48.method469(10, var318);
                    var321.field5288 = var323.field4032 * 100 / var319;
                    var321.field5435 = var323.field4089;
                    var321.field5311 = 4;
                    var321.field5441 = var318;
                    var321.field5299 = var323.field4061;
                    class339.method2380(var321, 105);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 80) {
            int var73 = class244.field3803.method314((byte) 97);
            int var74 = class244.field3803.method281(60);
            int var75 = class244.field3803.method281(48);
            int var76 = class244.field3803.method281(-128);
            int var77 = class244.field3803.method281(92);
            int var78 = class244.field3803.method314((byte) 98);
            if (class326.method2300(var73, 80)) {
                class32.field495[var74] = true;
                class79.field1153[var74] = var75;
                class284.field4389[var74] = var76;
                class309.field4773[var74] = var77;
                class239.field3718[var74] = var78;
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 193) {
            int var316 = class244.field3803.method314((byte) 74);
            if (class326.method2300(var316, 82)) {
                class72.method682(-1);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 136) {
            String var313 = class244.field3803.method297((byte) -110);
            int var314 = class244.field3803.method261((byte) -98);
            int var315 = class244.field3803.method275(2);
            if (class326.method2300(var315, 61)) {
                class295.method2131(var313, var314, -1);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 255) {
            int var307 = class244.field3803.method262((byte) 112);
            int var308 = class244.field3803.method314((byte) 54);
            class342 var309;
            if (var307 >= 0) {
                var309 = class355.method2497(0, var307);
            } else {
                var309 = null;
            }
            if (var307 < -70000) {
                var308 += 32768;
            }
            while (class244.field3803.field397 < class122.field1945) {
                int var310 = class244.field3803.method270(arg0);
                int var311 = class244.field3803.method314((byte) 72);
                int var312 = 0;
                if (var311 != 0) {
                    var312 = class244.field3803.method281(-126);
                    if (var312 == 255) {
                        var312 = class244.field3803.method262((byte) 115);
                    }
                }
                if (var309 != null && var310 >= 0 && var310 < var309.field5280.length) {
                    var309.field5280[var310] = var311;
                    var309.field5344[var310] = var312;
                }
                class271.method1987(var311 - 1, -8775, var308, var312, var310);
            }
            if (var309 != null) {
                class339.method2380(var309, 109);
            }
            class294.method2125(10250);
            class353.field5640[class301.method2169(class33.field504++, 31)] = class301.method2169(var308, 32767);
            class123.field1966 = -1;
            return true;
        } else if (arg0) {
            return false;
        } else if (class123.field1966 == 70) {
            int var304 = class244.field3803.method298(1);
            int var305 = class244.field3803.method314((byte) 99);
            int var306 = class244.field3803.method275(2);
            if (class326.method2300(var305, 60)) {
                class120.method1047(var306, var304, 2253);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 167) {
            for (int var79 = 0; var79 < class177.field2795.length; var79++) {
                if (class177.field2795[var79] != null) {
                    class177.field2795[var79].field1343 = -1;
                }
            }
            for (int var80 = 0; var80 < class110.field1683.length; var80++) {
                if (class110.field1683[var80] != null) {
                    class110.field1683[var80].field1343 = -1;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 210) {
            class332.method2340(class122.field1945, class340.field5234, class244.field3803, (byte) -104);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 225) {
            int var302 = class244.field3803.method281(-126);
            int var303 = class244.field3803.method314((byte) 103);
            if (class326.method2300(var303, 38)) {
                class31.field489 = var302;
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 162) {
            byte var299 = class244.field3803.method253(76);
            int var300 = class244.field3803.method275(2);
            int var301 = class244.field3803.method314((byte) 98);
            if (class326.method2300(var300, 95)) {
                class355.method2495(0, var301, var299);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 28) {
            int var296 = class244.field3803.method314((byte) 42);
            int var297 = class244.field3803.method314((byte) 91);
            int var298 = class244.field3803.method298(1);
            if (class326.method2300(var297, 97)) {
                class165.method1309(true, var296, var298);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 84) {
            int var81 = class244.field3803.method262((byte) 81);
            int var82 = class244.field3803.method314((byte) 126);
            class342 var83;
            if (var81 >= 0) {
                var83 = class355.method2497(0, var81);
            } else {
                var83 = null;
            }
            if (var81 < -70000) {
                var82 += 32768;
            }
            if (var83 != null) {
                for (int var84 = 0; var84 < var83.field5280.length; var84++) {
                    var83.field5280[var84] = 0;
                    var83.field5344[var84] = 0;
                }
            }
            class89.method798((byte) 19, var82);
            int var85 = class244.field3803.method314((byte) 84);
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = class244.field3803.method305(-32769);
                if (var87 == 255) {
                    var87 = class244.field3803.method262((byte) 104);
                }
                int var88 = class244.field3803.method275(2);
                if (var83 != null && var86 < var83.field5280.length) {
                    var83.field5280[var86] = var88;
                    var83.field5344[var86] = var87;
                }
                class271.method1987(var88 - 1, -8775, var82, var87, var86);
            }
            if (var83 != null) {
                class339.method2380(var83, 110);
            }
            class294.method2125(10250);
            class353.field5640[class301.method2169(class33.field504++, 31)] = class301.method2169(32767, var82);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 254) {
            int var292 = class244.field3803.method314((byte) 81);
            if (var292 == 65535) {
                var292 = -1;
            }
            int var293 = class244.field3803.method281(73);
            int var294 = class244.field3803.method314((byte) 29);
            int var295 = class244.field3803.method281(97);
            class62.method621(var293, 0, var292, var295, var294);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 244) {
            class294.method2125(10250);
            class61.field940 = class244.field3803.method281(17);
            class123.field1966 = -1;
            class305.field4738 = class327.field5030;
            return true;
        } else if (class123.field1966 == 30) {
            int var89 = class244.field3803.method281(44);
            int var90 = var89 >> 5;
            int var91 = var89 & 0x1F;
            if (var91 == 0) {
                class301.field4677[var90] = null;
                class123.field1966 = -1;
                return true;
            }
            class68 var92 = new class68();
            var92.field1036 = var91;
            var92.field1044 = class244.field3803.method281(113);
            if (var92.field1044 >= 0 && class221.field3434.length > var92.field1044) {
                if (var92.field1036 == 1 || var92.field1036 == 10) {
                    var92.field1035 = class244.field3803.method314((byte) 104);
                    class244.field3803.field397 += 5;
                } else if (var92.field1036 >= 2 && var92.field1036 <= 6) {
                    if (var92.field1036 == 2) {
                        var92.field1040 = 64;
                        var92.field1034 = 64;
                    }
                    if (var92.field1036 == 3) {
                        var92.field1034 = 64;
                        var92.field1040 = 0;
                    }
                    if (var92.field1036 == 4) {
                        var92.field1040 = 128;
                        var92.field1034 = 64;
                    }
                    if (var92.field1036 == 5) {
                        var92.field1040 = 64;
                        var92.field1034 = 0;
                    }
                    if (var92.field1036 == 6) {
                        var92.field1034 = 128;
                        var92.field1040 = 64;
                    }
                    var92.field1036 = 2;
                    var92.field1051 = class244.field3803.method314((byte) 101);
                    var92.field1041 = class244.field3803.method314((byte) 124);
                    var92.field1042 = class244.field3803.method281(80);
                    var92.field1043 = class244.field3803.method314((byte) 52);
                }
                var92.field1037 = class244.field3803.method314((byte) 63);
                if (var92.field1037 == 65535) {
                    var92.field1037 = -1;
                }
                class301.field4677[var90] = var92;
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 127) {
            class345.method2438(true);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 88) {
            int var290 = class244.field3803.method262((byte) 20);
            int var291 = class244.field3803.method314((byte) 83);
            if (class326.method2300(var291, 74)) {
                class181.method1404(5, var290, 2047, 0, (byte) -85);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 222) {
            class270.field4150 = class244.field3803.method281(125);
            class81.field1184 = class244.field3803.method281(-124);
            class243.field3787 = class244.field3803.method281(-126);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 249) {
            if (class122.field1945 == 0) {
                class204.field3157 = class209.field3219;
            } else {
                class204.field3157 = class244.field3803.method297((byte) -93);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 227) {
            boolean var277 = class244.field3803.method281(-124) == 1;
            String var278 = class244.field3803.method297((byte) -64);
            String var279 = var278;
            if (var277) {
                var279 = class244.field3803.method297((byte) -32);
            }
            long var280 = (long) class244.field3803.method314((byte) 52);
            long var282 = (long) class244.field3803.method265(true);
            boolean var284 = false;
            int var285 = class244.field3803.method281(62);
            long var286 = (var280 << 32) + var282;
            int var288 = 0;
            while (true) {
                if (var288 >= 100) {
                    if (var285 <= 1) {
                        if (!(!class175.field2772 || class285.field4421) || class256.field3935) {
                            var284 = true;
                        } else if (class178.method1393((byte) 82, var279)) {
                            var284 = true;
                        }
                    }
                    break;
                }
                if (class308.field4766[var288] == var286) {
                    var284 = true;
                    break;
                }
                var288++;
            }
            if (!var284 && class305.field4743 == 0) {
                class308.field4766[class252.field3882] = var286;
                class252.field3882 = (class252.field3882 + 1) % 100;
                String var289 = class145.method1207(class72.method685(class66.method648((byte) 120, class244.field3803), (byte) -103));
                if (var285 == 2) {
                    class139.method1158("<img=1>" + var279, (byte) -120, var289, "<img=1>" + var278, 0, (String) null, 7, -1);
                } else if (var285 == 1) {
                    class139.method1158("<img=0>" + var279, (byte) -117, var289, "<img=0>" + var278, 0, (String) null, 7, -1);
                } else {
                    class139.method1158(var279, (byte) -112, var289, var278, 0, (String) null, 3, -1);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 72) {
            int var267 = class244.field3803.method274((byte) -11);
            if (var267 == 65535) {
                var267 = -1;
            }
            int var268 = class244.field3803.method256(-3);
            int var269 = class244.field3803.method261((byte) -112);
            int var270 = class244.field3803.method314((byte) 49);
            if (var270 == 65535) {
                var270 = -1;
            }
            int var271 = class244.field3803.method275(2);
            if (class326.method2300(var269, 127)) {
                for (int var272 = var270; var272 <= var267; var272++) {
                    long var273 = ((long) var268 << 32) + (long) var272;
                    class227 var275 = (class227) class149.field2435.method370((byte) -120, var273);
                    class227 var276;
                    if (var275 != null) {
                        var276 = new class227(var275.field3544, var271);
                        var275.method1357(947647010);
                    } else if (var272 == -1) {
                        var276 = new class227(class355.method2497(0, var268).field5386.field3544, var271);
                    } else {
                        var276 = new class227(0, var271);
                    }
                    class149.field2435.method375(var276, var273, -115);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 25) {
            String var93 = class244.field3803.method297((byte) -91);
            int var94 = class244.field3803.method314((byte) 115);
            String var95 = class359.method2520(var94, (byte) 64).method1017(class244.field3803, (byte) 47);
            class139.method1158(var93, (byte) -109, var95, var93, 0, (String) null, 19, var94);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 92) {
            for (int var266 = 0; var266 < class160.field2538.length; var266++) {
                if (class329.field5058[var266] != class160.field2538[var266]) {
                    class160.field2538[var266] = class329.field5058[var266];
                    class286.method2069(103, var266);
                    class104.field1574[class301.method2169(31, class238.field3695++)] = var266;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 119) {
            class151.field2462 = class244.field3803.method281(-125);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 47) {
            class168.field2673 = class244.field3803.method305(-32769);
            class300.field4647 = class244.field3803.method305(-32769);
            for (int var263 = class300.field4647; var263 < (class300.field4647 + 8); var263++) {
                for (int var264 = class168.field2673; var264 < (class168.field2673 + 8); var264++) {
                    if (class349.field5540[class119.field1826][var263][var264] != null) {
                        class349.field5540[class119.field1826][var263][var264] = null;
                        class18.method207(var264, var263, !arg0);
                    }
                }
            }
            for (class285 var265 = (class285) class363.field5747.method2244((byte) -127); var265 != null; var265 = (class285) class363.field5747.method2241(-1)) {
                if (class300.field4647 <= var265.field4416 && class300.field4647 + 8 > var265.field4416 && class168.field2673 <= var265.field4427 && class168.field2673 + 8 > var265.field4427 && class119.field1826 == var265.field4430) {
                    var265.field4417 = 0;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 126) {
            int var96 = class244.field3803.method274((byte) -11);
            int var97 = class244.field3803.method275(2);
            int var98 = class244.field3803.method261((byte) -118);
            int var99 = class244.field3803.method274((byte) -11);
            int var100 = class244.field3803.method256(-3);
            if (class326.method2300(var96, 110)) {
                class49.method477(-1, var99, var97, var98, var100);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 241) {
            int var101 = class244.field3803.method298(1);
            int var102 = class244.field3803.method256(-3);
            int var103 = class244.field3803.method261((byte) -112);
            int var104 = class244.field3803.method275(2);
            if (class326.method2300(var104, 45)) {
                class181.method1404(5, var102, var103, var101, (byte) 116);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 107) {
            int var105 = class244.field3803.method275(2);
            int var106 = class244.field3803.method275(2);
            if (var106 == 65535) {
                var106 = -1;
            }
            int var107 = class244.field3803.method257((byte) -90);
            if (class326.method2300(var105, 119)) {
                class181.method1404(2, var107, var106, -1, (byte) -82);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 182) {
            class206.field3175 = class244.field3803.method275(2) * 30;
            class305.field4738 = class327.field5030;
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 6) {
            int var260 = class244.field3803.method314((byte) 112);
            int var261 = class244.field3803.method257((byte) -104);
            if (class326.method2300(var260, 85)) {
                int var262 = 0;
                if (class173.field2746.field2730 != null) {
                    var262 = class173.field2746.field2730.method1538(19);
                }
                class181.method1404(3, var261, var262, -1, (byte) -107);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 215) {
            int var257 = class244.field3803.method305(-32769);
            int var258 = class244.field3803.method307((byte) -110);
            int var259 = class244.field3803.method307((byte) -64);
            class119.field1826 = var259 >> 1;
            class173.field2746.method1350(var257, var258, (byte) 119, (var259 & 0x1) == 1);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 168) {
            int var252 = class244.field3803.method261((byte) -117);
            int var253 = class244.field3803.method281(99);
            int var254 = class244.field3803.method314((byte) 68);
            int var255 = class244.field3803.method257((byte) -123);
            if (class326.method2300(var252, 71)) {
                class36 var256 = (class36) class135.field2251.method370((byte) -120, (long) var255);
                if (var256 != null) {
                    class81.method732(22, var256.field540 != var254, var256);
                }
                class261.method1922(var255, var253, var254, -13860);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 36) {
            int var247 = class244.field3803.method314((byte) 119);
            String var248 = class244.field3803.method297((byte) -84);
            Object[] var249 = new Object[var248.length() + 1];
            for (int var250 = var248.length() - 1; var250 >= 0; var250--) {
                if (var248.charAt(var250) == 's') {
                    var249[var250 + 1] = class244.field3803.method297((byte) -56);
                } else {
                    var249[var250 + 1] = Integer.valueOf(class244.field3803.method262((byte) 94));
                }
            }
            var249[0] = Integer.valueOf(class244.field3803.method262((byte) 41));
            if (class326.method2300(var247, 84)) {
                class112 var251 = new class112();
                var251.field1711 = var249;
                class160.method1288((byte) -45, var251);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 75) {
            int var245 = class244.field3803.method262((byte) 87);
            int var246 = class244.field3803.method314((byte) 112);
            class363.method2549(var245, !arg0, var246);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 141) {
            int var243 = class244.field3803.method275(2);
            int var244 = class244.field3803.method281(-124);
            class222.method1669(-108, var243, var244);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 211) {
            class42.method435(true, 1);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 135) {
            class223.method1677(-10890);
            class294.method2125(10250);
            class123.field1966 = -1;
            class238.field3695 += 32;
            return true;
        } else if (class123.field1966 == 192) {
            int var108 = class244.field3803.method274((byte) -11);
            int var109 = class244.field3803.method305(-32769);
            int var110 = class244.field3803.method261((byte) 88);
            class244 var111 = class110.field1683[var108];
            if (var111 != null) {
                class67.method660(var109, var111, 2948, var110);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 170) {
            int var112 = class244.field3803.method314((byte) 51);
            int var113 = class244.field3803.method262((byte) 108);
            if (class326.method2300(var112, 54)) {
                class36 var114 = (class36) class135.field2251.method370((byte) -120, (long) var113);
                if (var114 != null) {
                    class81.method732(22, true, var114);
                }
                if (class356.field5672 != null) {
                    class339.method2380(class356.field5672, 111);
                    class356.field5672 = null;
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 57) {
            class300.field4647 = class244.field3803.method287(128);
            class168.field2673 = class244.field3803.method287(128);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 15) {
            int var115 = class244.field3803.method314((byte) 96);
            int var116 = class244.field3803.method281(-125);
            int var117 = class244.field3803.method281(30);
            int var118 = class244.field3803.method314((byte) 111);
            int var119 = class244.field3803.method281(43);
            int var120 = class244.field3803.method281(-128);
            if (class326.method2300(var115, 59)) {
                class362.method2548(false, var117, var116, true, var118, var120, var119);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 206) {
            class212.method1582(-1);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 203) {
            if (class164.field2604 != -1) {
                class238.method1768((byte) 28, 0, class164.field2604);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 91) {
            int var239 = class244.field3803.method261((byte) -90);
            int var240 = class244.field3803.method275(2);
            int var241 = class244.field3803.method314((byte) 32);
            int var242 = class244.field3803.method257((byte) -100);
            if (class326.method2300(var239, 120)) {
                class119.method1016(-115, var242, (var240 << 16) + var241);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 52) {
            int var229 = class244.field3803.method274((byte) -11);
            int var230 = class244.field3803.method314((byte) 49);
            if (var230 == 65535) {
                var230 = -1;
            }
            int var231 = class244.field3803.method256(-3);
            int var232 = class244.field3803.method256(-3);
            int var233 = class244.field3803.method261((byte) -96);
            if (var233 == 65535) {
                var233 = -1;
            }
            if (class326.method2300(var229, 78)) {
                for (int var234 = var230; var234 <= var233; var234++) {
                    long var235 = ((long) var232 << 32) + (long) var234;
                    class227 var237 = (class227) class149.field2435.method370((byte) -120, var235);
                    class227 var238;
                    if (var237 != null) {
                        var238 = new class227(var231, var237.field3546);
                        var237.method1357(947647010);
                    } else if (var234 == -1) {
                        var238 = new class227(var231, class355.method2497(0, var232).field5386.field3546);
                    } else {
                        var238 = new class227(var231, -1);
                    }
                    class149.field2435.method375(var238, var235, 48);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 122) {
            int var226 = class244.field3803.method275(2);
            int var227 = class244.field3803.method314((byte) 43);
            int var228 = class244.field3803.method257((byte) -127);
            if (var227 == 65535) {
                var227 = -1;
            }
            if (class326.method2300(var226, 116)) {
                class181.method1404(1, var228, var227, -1, (byte) -101);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 45) {
            int var219 = class244.field3803.method256(-3);
            int var220 = class244.field3803.method256(-3);
            int var221 = class244.field3803.method261((byte) 93);
            if (class326.method2300(var221, 67)) {
                class36 var222 = (class36) class135.field2251.method370((byte) -120, (long) var219);
                class36 var223 = (class36) class135.field2251.method370((byte) -120, (long) var220);
                if (var223 != null) {
                    class81.method732(22, var222 == null || var222.field540 != var223.field540, var223);
                }
                if (var222 != null) {
                    var222.method1357(947647010);
                    class135.field2251.method375(var222, (long) var220, -82);
                }
                class342 var224 = class355.method2497(0, var219);
                if (var224 != null) {
                    class339.method2380(var224, 108);
                }
                class342 var225 = class355.method2497(0, var220);
                if (var225 != null) {
                    class339.method2380(var225, 122);
                    class205.method1530(var225, true, 0);
                }
                if (class164.field2604 != -1) {
                    class238.method1768((byte) 28, 1, class164.field2604);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 132) {
            int var121 = class244.field3803.method262((byte) 11);
            int var122 = class244.field3803.method275(2);
            int var123 = class244.field3803.method275(2);
            int var124 = class244.field3803.method274((byte) -11);
            if (var121 >> 30 != 0) {
                int var149 = (var121 >> 14 & 0x3FFF) - class358.field5696;
                int var150 = var121 >> 28 & 0x3;
                int var151 = (var121 & 0x3FFF) - class49.field755;
                if (var149 >= 0 && var151 >= 0 && var149 < 104 && var151 < 104) {
                    int var152 = var151 * 128 + 64;
                    int var153 = var149 * 128 + 64;
                    class3 var154 = new class3(var122, var150, var153, var152, class193.method1469(var152, var153, (byte) -47, var150) - var124, var123, class360.field5718);
                    class356.field5668.method2245(new class76(var154), 123);
                }
            } else if ((var121 >> 29) != 0) {
                int var137 = var121 & 0xFFFF;
                class244 var138 = class110.field1683[var137];
                if (var138 != null) {
                    if (var122 == 65535) {
                        var122 = -1;
                    }
                    boolean var139 = true;
                    if (var122 != -1 && var138.field1297 != -1) {
                        if (var138.field1297 == var122) {
                            class281 var144 = class292.method2110(var122, (byte) 30);
                            if (var144.field4351 && var144.field4343 != -1) {
                                class93 var145 = class126.method1091((byte) 86, var144.field4343);
                                int var146 = var145.field1405;
                                if (var146 == 1) {
                                    var138.field1326 = 0;
                                    var138.field1355 = 1;
                                    var138.field1338 = 0;
                                    var138.field1330 = class360.field5718 + var123;
                                    var138.field1392 = 0;
                                    var139 = false;
                                    class335.method2358(var138.field1359, var138.field1326, var145, false, var138.field1286, true);
                                } else if (var146 == 2) {
                                    var139 = false;
                                    var138.field1332 = 0;
                                }
                            }
                        } else {
                            class281 var140 = class292.method2110(var122, (byte) 105);
                            class281 var141 = class292.method2110(var138.field1297, (byte) 27);
                            if (var140.field4343 != -1 && var141.field4343 != -1) {
                                class93 var142 = class126.method1091((byte) 98, var140.field4343);
                                class93 var143 = class126.method1091((byte) 47, var141.field4343);
                                if (var142.field1423 < var143.field1423) {
                                    var139 = false;
                                }
                            }
                        }
                    }
                    if (var139) {
                        var138.field1355 = 1;
                        var138.field1308 = var124;
                        var138.field1330 = class360.field5718 + var123;
                        var138.field1326 = 0;
                        var138.field1297 = var122;
                        var138.field1392 = 0;
                        if (class360.field5718 < var138.field1330) {
                            var138.field1326 = -1;
                        }
                        if (var138.field1297 != -1 && class360.field5718 == var138.field1330) {
                            int var147 = class292.method2110(var138.field1297, (byte) 93).field4343;
                            if (var147 != -1) {
                                class93 var148 = class126.method1091((byte) 74, var147);
                                if (var148 != null && var148.field1428 != null) {
                                    class335.method2358(var138.field1359, 0, var148, false, var138.field1286, true);
                                }
                            }
                        }
                    }
                }
            } else if (var121 >> 28 != 0) {
                int var125 = var121 & 0xFFFF;
                class171 var126;
                if (class118.field1813 == var125) {
                    var126 = class173.field2746;
                } else {
                    var126 = class177.field2795[var125];
                }
                if (var126 != null) {
                    if (var122 == 65535) {
                        var122 = -1;
                    }
                    boolean var127 = true;
                    if (var122 != -1 && var126.field1297 != -1) {
                        if (var126.field1297 == var122) {
                            class281 var128 = class292.method2110(var122, (byte) 57);
                            if (var128.field4351 && var128.field4343 != -1) {
                                class93 var129 = class126.method1091((byte) 118, var128.field4343);
                                int var130 = var129.field1405;
                                if (var130 == 1) {
                                    var126.field1338 = 0;
                                    var127 = false;
                                    var126.field1355 = 1;
                                    var126.field1392 = 0;
                                    var126.field1330 = class360.field5718 + var123;
                                    var126.field1326 = 0;
                                    class335.method2358(var126.field1359, var126.field1326, var129, false, var126.field1286, true);
                                } else if (var130 == 2) {
                                    var126.field1332 = 0;
                                    var127 = false;
                                }
                            }
                        } else {
                            class281 var131 = class292.method2110(var122, (byte) 25);
                            class281 var132 = class292.method2110(var126.field1297, (byte) 89);
                            if (var131.field4343 != -1 && var132.field4343 != -1) {
                                class93 var133 = class126.method1091((byte) 83, var131.field4343);
                                class93 var134 = class126.method1091((byte) 34, var132.field4343);
                                if (var133.field1423 < var134.field1423) {
                                    var127 = false;
                                }
                            }
                        }
                    }
                    if (var127) {
                        var126.field1330 = class360.field5718 + var123;
                        var126.field1297 = var122;
                        var126.field1355 = 1;
                        var126.field1308 = var124;
                        if (var126.field1297 == 65535) {
                            var126.field1297 = -1;
                        }
                        var126.field1392 = 0;
                        var126.field1326 = 0;
                        if (var126.field1330 > class360.field5718) {
                            var126.field1326 = -1;
                        }
                        if (var126.field1297 != -1 && class360.field5718 == var126.field1330) {
                            int var135 = class292.method2110(var126.field1297, (byte) 6).field4343;
                            if (var135 != -1) {
                                class93 var136 = class126.method1091((byte) 91, var135);
                                if (var136 != null && var136.field1428 != null) {
                                    class335.method2358(var126.field1359, 0, var136, class173.field2746 == var126, var126.field1286, true);
                                }
                            }
                        }
                    }
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 61) {
            int var217 = class244.field3803.method275(2);
            byte var218 = class244.field3803.method286((byte) 111);
            class363.method2549(var218, true, var217);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 20) {
            int var211 = class244.field3803.method270(false);
            int var212 = class244.field3803.method262((byte) 73);
            int var213 = class244.field3803.method281(2);
            String var214 = "";
            String var215 = var214;
            if ((var213 & 0x1) != 0) {
                var214 = class244.field3803.method297((byte) -103);
                if ((var213 & 0x2) == 0) {
                    var215 = var214;
                } else {
                    var215 = class244.field3803.method297((byte) -128);
                }
            }
            String var216 = class244.field3803.method297((byte) -34);
            if (!var215.equals("") && class178.method1393((byte) 68, var215)) {
                class123.field1966 = -1;
                return true;
            } else {
                class72.method683(var215, var214, (byte) -127, var216, var212, var211);
                class123.field1966 = -1;
                return true;
            }
        } else if (class123.field1966 == 99) {
            int var208 = class244.field3803.method262((byte) 11);
            class342 var209 = class355.method2497(0, var208);
            for (int var210 = 0; var210 < var209.field5280.length; var210++) {
                var209.field5280[var210] = -1;
                var209.field5280[var210] = 0;
            }
            class339.method2380(var209, 113);
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 110) {
            boolean var194 = class244.field3803.method281(74) == 1;
            String var195 = class244.field3803.method297((byte) -53);
            String var196 = var195;
            if (var194) {
                var196 = class244.field3803.method297((byte) -83);
            }
            long var197 = (long) class244.field3803.method314((byte) 96);
            long var199 = (long) class244.field3803.method265(!arg0);
            long var201 = (var197 << 32) + var199;
            boolean var203 = false;
            int var204 = class244.field3803.method281(-127);
            int var205 = class244.field3803.method314((byte) 108);
            int var206 = 0;
            while (true) {
                if (var206 >= 100) {
                    if (var204 <= 1 && class178.method1393((byte) 103, var196)) {
                        var203 = true;
                    }
                    break;
                }
                if (class308.field4766[var206] == var201) {
                    var203 = true;
                    break;
                }
                var206++;
            }
            if (!var203 && class305.field4743 == 0) {
                class308.field4766[class252.field3882] = var201;
                class252.field3882 = (class252.field3882 + 1) % 100;
                String var207 = class359.method2520(var205, (byte) -100).method1017(class244.field3803, (byte) 94);
                if (var204 == 2) {
                    class139.method1158("<img=1>" + var196, (byte) -113, var207, "<img=1>" + var195, 0, (String) null, 18, var205);
                } else if (var204 == 1) {
                    class139.method1158("<img=0>" + var196, (byte) -110, var207, "<img=0>" + var195, 0, (String) null, 18, var205);
                } else {
                    class139.method1158(var196, (byte) -128, var207, var195, 0, (String) null, 18, var205);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 188) {
            int var191 = class244.field3803.method274((byte) -11);
            int var192 = class244.field3803.method314((byte) 33);
            int var193 = class244.field3803.method256(-3);
            if (class326.method2300(var192, 90)) {
                class202.method1507(var193, var191, (byte) 75);
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 103) {
            boolean var176 = class244.field3803.method281(115) == 1;
            String var177 = class244.field3803.method297((byte) -82);
            String var178 = var177;
            if (var176) {
                var178 = class244.field3803.method297((byte) -80);
            }
            long var179 = class244.field3803.method266(109);
            long var181 = (long) class244.field3803.method314((byte) 67);
            long var183 = (long) class244.field3803.method265(true);
            long var185 = (var181 << 32) + var183;
            boolean var187 = false;
            int var188 = class244.field3803.method281(-124);
            int var189 = 0;
            while (true) {
                if (var189 < 100) {
                    if (class308.field4766[var189] != var185) {
                        var189++;
                        continue;
                    }
                    var187 = true;
                    break;
                }
                if (var188 <= 1) {
                    if (!(!class175.field2772 || class285.field4421) || class256.field3935) {
                        var187 = true;
                    } else if (class178.method1393((byte) 77, var178)) {
                        var187 = true;
                    }
                }
                break;
            }
            if (!var187 && class305.field4743 == 0) {
                class308.field4766[class252.field3882] = var185;
                class252.field3882 = (class252.field3882 + 1) % 100;
                String var190 = class145.method1207(class72.method685(class66.method648((byte) 120, class244.field3803), (byte) -103));
                if (var188 == 2 || var188 == 3) {
                    class139.method1158("<img=1>" + var178, (byte) -111, var190, "<img=1>" + var177, 0, class244.method1839(var179, 111), 9, -1);
                } else if (var188 == 1) {
                    class139.method1158("<img=0>" + var178, (byte) -111, var190, "<img=0>" + var177, 0, class244.method1839(var179, 97), 9, -1);
                } else {
                    class139.method1158(var178, (byte) -115, var190, var177, 0, class244.method1839(var179, 123), 9, -1);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 116) {
            boolean var160 = class244.field3803.method281(15) == 1;
            String var161 = class244.field3803.method297((byte) -35);
            String var162 = var161;
            if (var160) {
                var162 = class244.field3803.method297((byte) -35);
            }
            long var163 = class244.field3803.method266(28);
            long var165 = (long) class244.field3803.method314((byte) 102);
            long var167 = (long) class244.field3803.method265(true);
            long var169 = (var165 << 32) + var167;
            int var171 = class244.field3803.method281(107);
            int var172 = class244.field3803.method314((byte) 68);
            boolean var173 = false;
            int var174 = 0;
            while (true) {
                if (var174 < 100) {
                    if (class308.field4766[var174] != var169) {
                        var174++;
                        continue;
                    }
                    var173 = true;
                    break;
                }
                if (var171 <= 1 && class178.method1393((byte) 97, var162)) {
                    var173 = true;
                }
                break;
            }
            if (!var173 && class305.field4743 == 0) {
                class308.field4766[class252.field3882] = var169;
                class252.field3882 = (class252.field3882 + 1) % 100;
                String var175 = class359.method2520(var172, (byte) -119).method1017(class244.field3803, (byte) 92);
                if (var171 == 2) {
                    class139.method1158("<img=1>" + var162, (byte) -113, var175, "<img=1>" + var161, 0, class244.method1839(var163, 96), 20, var172);
                } else if (var171 == 1) {
                    class139.method1158("<img=0>" + var162, (byte) -110, var175, "<img=0>" + var161, 0, class244.method1839(var163, 105), 20, var172);
                } else {
                    class139.method1158(var162, (byte) -126, var175, var161, 0, class244.method1839(var163, 122), 20, var172);
                }
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 42) {
            int var155 = class244.field3803.method287(128);
            int var156 = class244.field3803.method281(60);
            String var157 = class244.field3803.method297((byte) -84);
            int var158 = class244.field3803.method261((byte) 79);
            if (var158 == 65535) {
                var158 = -1;
            }
            if (var156 >= 1 && var156 <= 8) {
                if (var157.equalsIgnoreCase("null")) {
                    var157 = null;
                }
                class67.field1029[var156 - 1] = var157;
                class23.field364[var156 - 1] = var158;
                class25.field431[var156 - 1] = var155 == 0;
            }
            class123.field1966 = -1;
            return true;
        } else if (class123.field1966 == 230) {
            int var159 = class244.field3803.method261((byte) 57);
            class168.method1336(var159, 3);
            class353.field5640[class301.method2169(class33.field504++, 31)] = class301.method2169(var159, 32767);
            class123.field1966 = -1;
            return true;
        } else {
            client.method1023((byte) -103, "T1 - " + class123.field1966 + "," + class353.field5642 + "," + class203.field3150 + " - " + class122.field1945, (Throwable) null);
            class197.method1493(117);
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 2870)
    public static void method353(byte arg0) {
        field531 = null;
        if (arg0 != -22) {
            field531 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 2883)
    public static final int method354(String arg0, byte arg1) {
        field526++;
        return arg1 == 51 ? arg0.length() + 1 : 124;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BII)I", line = 2895)
    public static final int method355(byte[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field523++;
            return class18.method208(-14621, arg0, arg1, 0);
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V", line = 2916)
    public static final void method356(int arg0, boolean arg1) {
        field521++;
        if (arg1 == class162.field2573) {
            return;
        }
        class162.field2573 = arg1;
        if (arg0 <= 103) {
            field531 = (int[]) null;
        }
        class143.method1183(31);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lrn;I)V", line = 2936)
    public static final void method357(class18 arg0, int arg1) {
        field529++;
        class115.field1766 = arg0;
        if (arg1 != 0) {
            method355((byte[]) null, -30, 108);
        }
    }
}
