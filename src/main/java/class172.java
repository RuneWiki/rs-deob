import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class172 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Z")
    public boolean field2481 = true;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lth;")
    public static class57 field2478 = new class57(64);

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
    public static boolean field2487 = false;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[I")
    public static int[] field2489 = new int[500];

    @OriginalMember(owner = "client!df", name = "p", descriptor = "F")
    public static float field2490;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1206(int arg0) {
        if (arg0 != 28820) {
            field2487 = false;
        }
        if (class16.field270 == null || client.field646 == null) {
            class16.field270 = new int[256];
            client.field646 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class16.field270[var1] = (int) (Math.sin(var2) * 4096.0D);
                client.field646[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2484++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILh;IJIIII)Z", line = 38)
    public static final boolean method1207(int arg0, int arg1, int arg2, int arg3, class111 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class165.method1180(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 46)
    public static final void method1208(int arg0, int arg1) {
        field2488++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class286.field4313[arg1];
        int var3 = (int) class117.field1664[arg1];
        int var4 = class216.field3186[arg1];
        long var5 = class117.field1664[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = field2489[arg1];
        if (var4 == 1003) {
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class343.field5315 = 2;
            class116.field1648 = class227.field3425;
            class111.field1616++;
            class107.field1533.method1915(true, 197);
            class107.field1533.method1330((byte) -81, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class107.field1533.method1330((byte) -81, class272.field4123 + var2);
            class107.field1533.method1366(class202.field2968 + var7, (byte) -68);
            class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 33) {
            class228 var8 = class343.field5312[var3];
            if (var8 != null) {
                class145.field2095 = class180.field2592;
                class48.field719 = 0;
                class343.field5315 = 2;
                class344.field5323++;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 169);
                class107.field1533.method1366(var3, (byte) -59);
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class49.method416(var8.method1700(-109), var8.method1700(arg0 - 106), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 14) {
            if (var3 == 0) {
                class59.method471(class321.field4835, var2, var7);
            } else if (var3 == 1) {
                if (class111.field1619 > 0 && class236.field3549[82] && class236.field3549[81]) {
                    class248.method1828(class202.field2968 + var7, class321.field4835, class272.field4123 + var2, (byte) 103);
                } else {
                    class59.method473(20527, var2, 1, var7);
                    class107.field1533.method1355((byte) -128, class191.field2778);
                    class107.field1533.method1355((byte) -121, class128.field1864);
                    class107.field1533.method1361((int) class36.field535, (byte) 124);
                    class107.field1533.method1355((byte) -122, 57);
                    if (class86.field1208 == 4) {
                        class107.field1533.method1355((byte) -119, 0);
                        class107.field1533.method1355((byte) -110, 0);
                    } else {
                        class107.field1533.method1355((byte) -117, class298.field4460);
                        class107.field1533.method1355((byte) -121, class281.field4271);
                    }
                    class107.field1533.method1355((byte) -115, 89);
                    class107.field1533.method1361(class1.field55.field5137, (byte) 123);
                    class107.field1533.method1361(class1.field55.field5165, (byte) 124);
                    class107.field1533.method1355((byte) -128, class76.field1119);
                    class107.field1533.method1355((byte) -116, 63);
                    class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
                }
            }
        }
        if (var4 == 46) {
            class270.method1994(true);
        }
        if (var4 == 15) {
            class116.field1648 = class227.field3425;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class279.field4246++;
            class343.field5315 = 2;
            class107.field1533.method1915(true, 189);
            class107.field1533.method1361((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 126);
            class107.field1533.method1342(var2 + class272.field4123, 128);
            class107.field1533.method1355((byte) -119, class236.field3549[82] ? 1 : 0);
            class107.field1533.method1366(class202.field2968 + var7, (byte) -60);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 28) {
            class181 var9 = class300.field4495[var3];
            if (var9 != null) {
                class343.field5315 = 2;
                class48.field719 = 0;
                class123.field1789++;
                class145.field2095 = class180.field2592;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 219);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class107.field1533.method1366(var3, (byte) -125);
                class49.method416(var9.method1700(-101), var9.method1700(arg0 - 125), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 1010 || var4 == 1011 || var4 == 1005 || var4 == 1009 || var4 == 1012) {
            class278.method2030(var4, -111, var2, var3);
        }
        if (var4 == 18) {
            class228 var10 = class343.field5312[var3];
            if (var10 != null) {
                class145.field2095 = class180.field2592;
                class48.field719 = 0;
                class343.field5315 = 2;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 192);
                class150.field2182++;
                class107.field1533.method1361(var3, (byte) 127);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class49.method416(var10.method1700(-116), var10.method1700(arg0 - 125), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 37) {
            class359 var11 = class165.method1172(var2, arg0 - 11, var7);
            if (var11 != null) {
                class51.method429((byte) -74);
                class199 var12 = client.method347(var11);
                class119.method894(var2, var7, var11.field5582, var11.field5602, true, var12.method1442(true), var12.field2904);
                class239.field3562 = 0;
                class247.field3655 = class174.method1218(arg0 + 103, var11);
                if (var11.field5500) {
                    class31.field449 = var11.field5564 + "<col=ffffff>";
                } else {
                    class31.field449 = "<col=00ff00>" + var11.field5525 + "<col=ffffff>";
                }
                if (class247.field3655 == null) {
                    class247.field3655 = "Null";
                }
            }
            return;
        }
        if (var4 == 10) {
            class343.field5315 = 2;
            class334.field5201++;
            class116.field1648 = class227.field3425;
            class48.field719 = 0;
            class145.field2095 = class180.field2592;
            class107.field1533.method1915(true, 162);
            class107.field1533.method1342(var3, arg0 + 118);
            class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
            class107.field1533.method1361(class202.field2968 + var7, (byte) 123);
            class107.field1533.method1366(class272.field4123 + var2, (byte) -128);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 45) {
            class107.field1533.method1915(true, 220);
            class107.field1533.method1336((byte) 41, var7);
            class228.field3460++;
            class107.field1533.method1366(var2, (byte) -127);
            class107.field1533.method1330((byte) -81, var3);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 109);
            class232.field3499 = var2;
        }
        if (var4 == 22) {
            class220.field3286++;
            class107.field1533.method1915(true, 137);
            class107.field1533.method1366(var2, (byte) -117);
            class107.field1533.method1330((byte) -81, var3);
            class107.field1533.method1368(6029344, var7);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 78);
            class232.field3499 = var2;
        }
        if (var4 == 23) {
            class181 var13 = class300.field4495[var3];
            if (var13 != null) {
                class48.field719 = 0;
                class116.field1648 = class227.field3425;
                class173.field2501++;
                class145.field2095 = class180.field2592;
                class343.field5315 = 2;
                class107.field1533.method1915(true, 163);
                class107.field1533.method1330((byte) -81, class359.field5607);
                class107.field1533.method1342(class52.field776, 128);
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1354(class302.field4518, (byte) -105);
                class107.field1533.method1361(var3, (byte) 127);
                class49.method416(var13.method1700(arg0 ^ 0xFFFFFF8D), var13.method1700(-120), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 60) {
            class99.field1404++;
            class107.field1533.method1915(true, 94);
            class107.field1533.method1354(var7, (byte) 104);
            class359 var14 = class231.method1719(var7, arg0 ^ 0x5F);
            if (var14.field5590 != null && var14.field5590[0][0] == 5) {
                int var15 = var14.field5590[0][1];
                class227.field3423[var15] = 1 - class227.field3423[var15];
                class225.method1649(var15, 100);
            }
        }
        if (var4 == 6) {
            class228 var16 = class343.field5312[var3];
            if (var16 != null) {
                class343.field5315 = 2;
                class116.field1648 = class227.field3425;
                class48.field719 = 0;
                class191.field2791++;
                class145.field2095 = class180.field2592;
                class107.field1533.method1915(true, 208);
                class107.field1533.method1355((byte) -110, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1366(var3, (byte) -93);
                class49.method416(var16.method1700(-115), var16.method1700(arg0 ^ 0xFFFFFF88), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 1006) {
            class145.field2095 = class180.field2592;
            class193.field2810++;
            class343.field5315 = 2;
            class116.field1648 = class227.field3425;
            class48.field719 = 0;
            class107.field1533.method1915(true, 200);
            class107.field1533.method1366(var3, (byte) -72);
        }
        if (var4 == 20) {
            class107.field1533.method1915(true, 61);
            class248.field3672++;
            class107.field1533.method1321(var7, arg0 ^ 0xED2BD792);
            class107.field1533.method1330((byte) -81, var3);
            class107.field1533.method1342(var2, 128);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 101);
            class232.field3499 = var2;
        }
        if (var4 == 25) {
            class343.field5315 = 2;
            class353.field5435++;
            class116.field1648 = class227.field3425;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class107.field1533.method1915(true, 210);
            class107.field1533.method1342(class272.field4123 + var2, 128);
            class107.field1533.method1361(var3, (byte) 125);
            class107.field1533.method1342(class202.field2968 + var7, arg0 + 118);
            class107.field1533.method1355((byte) -119, class236.field3549[82] ? 1 : 0);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 40) {
            class228 var17 = class343.field5312[var3];
            if (var17 != null) {
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class191.field2782++;
                class116.field1648 = class227.field3425;
                class48.field719 = 0;
                class107.field1533.method1915(true, 177);
                class107.field1533.method1330((byte) -81, var3);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class49.method416(var17.method1700(-112), var17.method1700(-105), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 32) {
            class181 var18 = class300.field4495[var3];
            if (var18 != null) {
                class116.field1648 = class227.field3425;
                class316.field4693++;
                class145.field2095 = class180.field2592;
                class48.field719 = 0;
                class343.field5315 = 2;
                class107.field1533.method1915(true, 193);
                class107.field1533.method1366(var3, (byte) -108);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class49.method416(var18.method1700(-100), var18.method1700(-109), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 1001) {
            class145.field2095 = class180.field2592;
            class116.field1648 = class227.field3425;
            class343.field5315 = 2;
            class48.field719 = 0;
            class181 var19 = class300.field4495[var3];
            if (var19 != null) {
                class214 var20 = var19.field2609;
                if (var20.field3142 != null) {
                    var20 = var20.method1539(false);
                }
                if (var20 != null) {
                    class107.field1533.method1915(true, 216);
                    class73.field1069++;
                    class107.field1533.method1361(var20.field3121, (byte) 126);
                }
            }
        }
        if (var4 == 43) {
            class228 var21 = class343.field5312[var3];
            if (var21 != null) {
                class48.field719 = 0;
                class116.field1648 = class227.field3425;
                class145.field2095 = class180.field2592;
                class343.field5315 = 2;
                class107.field1533.method1915(true, 186);
                class158.field2275++;
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1366(var3, (byte) -99);
                class49.method416(var21.method1700(-99), var21.method1700(-106), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 7) {
            class107.field1533.method1915(true, 242);
            class343.field5305++;
            class107.field1533.method1368(arg0 + 6029334, var7);
            class107.field1533.method1330((byte) -81, class67.field976);
            class107.field1533.method1321(class88.field1234, arg0 - 315893874);
            class107.field1533.method1361(var2, (byte) 123);
            class107.field1533.method1366(var3, (byte) -111);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 68);
            class232.field3499 = var2;
        }
        if (var4 == 8) {
            class107.field1533.method1915(true, 128);
            class127.field1852++;
            class107.field1533.method1342(var2, 128);
            class107.field1533.method1342(class359.field5607, arg0 + 118);
            class107.field1533.method1366(var3, (byte) -91);
            class107.field1533.method1366(class52.field776, (byte) -71);
            class107.field1533.method1336((byte) 104, class302.field4518);
            class107.field1533.method1368(arg0 + 6029334, var7);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 79);
            class232.field3499 = var2;
        }
        if (var4 == 24) {
            class228 var22 = class343.field5312[var3];
            if (var22 != null) {
                class48.field719 = 0;
                class177.field2546++;
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 157);
                class107.field1533.method1366(var3, (byte) -85);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class49.method416(var22.method1700(-126), var22.method1700(arg0 - 136), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 5) {
            class343.field5315 = 2;
            class211.field3068++;
            class116.field1648 = class227.field3425;
            class48.field719 = 0;
            class145.field2095 = class180.field2592;
            class107.field1533.method1915(true, 206);
            class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
            class107.field1533.method1342(class202.field2968 + var7, 128);
            class107.field1533.method1342(class359.field5607, 128);
            class107.field1533.method1342(var3, arg0 ^ 0x8A);
            class107.field1533.method1366(class272.field4123 + var2, (byte) -74);
            class107.field1533.method1321(class302.field4518, -315893864);
            class107.field1533.method1366(class52.field776, (byte) -82);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 38) {
            class228 var23 = class343.field5312[var3];
            if (var23 != null) {
                class145.field2095 = class180.field2592;
                class308.field4602++;
                class116.field1648 = class227.field3425;
                class343.field5315 = 2;
                class48.field719 = 0;
                class107.field1533.method1915(true, 146);
                class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
                class107.field1533.method1366(var3, (byte) -107);
                class49.method416(var23.method1700(arg0 ^ 0xFFFFFF91), var23.method1700(arg0 - 131), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 49) {
            class228.field3435++;
            class107.field1533.method1915(true, 7);
            class107.field1533.method1336((byte) 93, class88.field1234);
            class107.field1533.method1368(6029344, var7);
            class107.field1533.method1330((byte) -81, var2);
            class107.field1533.method1361(class67.field976, (byte) 125);
        }
        if (var4 == 13) {
            if (var3 == 0) {
                class203.field2992 = 1;
                class59.method471(class321.field4835, var2, var7);
            } else if (class111.field1619 > 0 && class236.field3549[82] && class236.field3549[81]) {
                class248.method1828(class202.field2968 + var7, class321.field4835, class272.field4123 + var2, (byte) 97);
            } else {
                class132.field1929++;
                class107.field1533.method1915(true, 53);
                class107.field1533.method1330((byte) -81, class202.field2968 + var7);
                class107.field1533.method1330((byte) -81, class272.field4123 + var2);
            }
        }
        if (var4 == 11) {
            class181 var24 = class300.field4495[var3];
            if (var24 != null) {
                class48.field719 = 0;
                class85.field1205++;
                class116.field1648 = class227.field3425;
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class107.field1533.method1915(true, 65);
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1366(var3, (byte) -68);
                class49.method416(var24.method1700(-103), var24.method1700(-123), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 21) {
            class107.field1533.method1915(true, 129);
            class78.field1134++;
            class107.field1533.method1330((byte) -81, var2);
            class107.field1533.method1361(var3, (byte) 125);
            class107.field1533.method1354(var7, (byte) -35);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 46);
            class232.field3499 = var2;
        }
        if (var4 == 31) {
            class348.field5377++;
            class343.field5315 = 2;
            class116.field1648 = class227.field3425;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class107.field1533.method1915(true, 180);
            class107.field1533.method1355((byte) -123, class236.field3549[82] ? 1 : 0);
            class107.field1533.method1361(class202.field2968 + var7, (byte) 124);
            class107.field1533.method1342(class272.field4123 + var2, arg0 + 118);
            class107.field1533.method1330((byte) -81, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 17) {
            class5.field129++;
            class107.field1533.method1915(true, 241);
            class107.field1533.method1336((byte) 49, var7);
            class107.field1533.method1361(var2, (byte) 127);
            class107.field1533.method1366(var3, (byte) -81);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 53);
            class232.field3499 = var2;
        }
        if (var4 == 3) {
            class48.field719 = 0;
            class343.field5315 = 2;
            class145.field2095 = class180.field2592;
            class7.field145++;
            class116.field1648 = class227.field3425;
            class107.field1533.method1915(true, 135);
            class107.field1533.method1366((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -111);
            class107.field1533.method1330((byte) -81, var7 + class202.field2968);
            class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
            class107.field1533.method1342(class272.field4123 + var2, arg0 + 118);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 1007) {
            class116.field1648 = class227.field3425;
            class343.field5315 = 2;
            class95.field1323++;
            class48.field719 = 0;
            class145.field2095 = class180.field2592;
            class107.field1533.method1915(true, 179);
            class107.field1533.method1342(var3, 128);
        }
        if (var4 == 39) {
            class146.field2098++;
            class116.field1648 = class227.field3425;
            class343.field5315 = 2;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class107.field1533.method1915(true, 9);
            class107.field1533.method1355((byte) -128, class236.field3549[82] ? 1 : 0);
            class107.field1533.method1361(var2 + class272.field4123, (byte) 125);
            class107.field1533.method1342(var3, 128);
            class107.field1533.method1342(var7 + class202.field2968, 128);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 48) {
            class228 var25 = class343.field5312[var3];
            if (var25 != null) {
                class116.field1648 = class227.field3425;
                class48.field719 = 0;
                class180.field2583++;
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class107.field1533.method1915(true, 120);
                class107.field1533.method1361(var3, (byte) 126);
                class107.field1533.method1366(class67.field976, (byte) -94);
                class107.field1533.method1368(6029344, class88.field1234);
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class49.method416(var25.method1700(-128), var25.method1700(arg0 ^ 0xFFFFFF94), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 9) {
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class343.field5315 = 2;
            class315.field4679++;
            class116.field1648 = class227.field3425;
            class107.field1533.method1915(true, 8);
            class107.field1533.method1354(class88.field1234, (byte) 104);
            class107.field1533.method1334(-118, class236.field3549[82] ? 1 : 0);
            class107.field1533.method1366(class67.field976, (byte) -112);
            class107.field1533.method1342(class202.field2968 + var7, arg0 ^ 0x8A);
            class107.field1533.method1330((byte) -81, class272.field4123 + var2);
            class107.field1533.method1342(var3, 128);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 4) {
            class181 var26 = class300.field4495[var3];
            if (var26 != null) {
                class343.field5315 = 2;
                class48.field719 = 0;
                class145.field2095 = class180.field2592;
                class354.field5441++;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 12);
                class107.field1533.method1366(var3, (byte) -100);
                class107.field1533.method1334(-72, class236.field3549[82] ? 1 : 0);
                class49.method416(var26.method1700(arg0 ^ 0xFFFFFFAA), var26.method1700(-101), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 12) {
            if (var3 == 0) {
                class256.field3831 = 1;
                class59.method471(class321.field4835, var2, var7);
            } else if (var3 == 1) {
                class302.field4515++;
                class107.field1533.method1915(true, 149);
                class107.field1533.method1361(class67.field976, (byte) 126);
                class107.field1533.method1321(class88.field1234, -315893864);
                class107.field1533.method1342(class202.field2968 + var7, 128);
                class107.field1533.method1361(class272.field4123 + var2, (byte) 127);
            }
        }
        if (var4 == 59) {
            class48.field719 = 0;
            class145.field2095 = class180.field2592;
            class356.field5464++;
            class343.field5315 = 2;
            class116.field1648 = class227.field3425;
            class107.field1533.method1915(true, 165);
            class107.field1533.method1342(var3, arg0 + 118);
            class107.field1533.method1342(class202.field2968 + var7, 128);
            class107.field1533.method1330((byte) -81, class272.field4123 + var2);
            class107.field1533.method1334(-70, class236.field3549[82] ? 1 : 0);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 34) {
            class216.field3187++;
            class107.field1533.method1915(true, 28);
            class107.field1533.method1361(var3, (byte) 127);
            class107.field1533.method1342(var2, 128);
            class107.field1533.method1354(var7, (byte) 118);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 93);
            class232.field3499 = var2;
        }
        if (var4 == 1) {
            class359 var27 = class231.method1719(var7, 120);
            boolean var28 = true;
            if (var27.field5515 > 0) {
                var28 = class131.method951(var27, 26565);
            }
            if (var28) {
                class107.field1533.method1915(true, 94);
                class99.field1404++;
                class107.field1533.method1354(var7, (byte) -91);
            }
        }
        if (var4 == 29) {
            class116.field1648 = class227.field3425;
            class343.field5315 = 2;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class37.field549++;
            class107.field1533.method1915(true, 49);
            class107.field1533.method1354(class88.field1234, (byte) -55);
            class107.field1533.method1361(class202.field2968 + var7, (byte) 124);
            class107.field1533.method1361((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 127);
            class107.field1533.method1366(class67.field976, (byte) -93);
            class107.field1533.method1361(class272.field4123 + var2, (byte) 124);
            class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 16) {
            class343.field5315 = 2;
            class145.field2095 = class180.field2592;
            class116.field1648 = class227.field3425;
            class48.field719 = 0;
            class107.field1533.method1915(true, 10);
            class107.field1533.method1330((byte) -81, var7 + class202.field2968);
            class107.field1533.method1361(class272.field4123 + var2, (byte) 126);
            class85.field1198++;
            class107.field1533.method1361(var3, (byte) 125);
            class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
            class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
        }
        if (var4 == 58) {
            class107.field1533.method1915(true, 109);
            class107.field1533.method1342(var2, 128);
            class14.field212++;
            class107.field1533.method1361(var3, (byte) 127);
            class107.field1533.method1321(var7, -315893864);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 78);
            class232.field3499 = var2;
        }
        if (var4 == 50) {
            class51.method429((byte) -50);
            class359 var36 = class231.method1719(var7, 62);
            class52.field776 = var2;
            class302.field4518 = var7;
            class239.field3562 = 1;
            class359.field5607 = var3;
            class83.method676(var36, (byte) -80);
            class333.field5176 = "<col=ff9040>" + class175.method1228((byte) 54, var3).field1742 + "<col=ffffff>";
            if (class333.field5176 == null) {
                class333.field5176 = "null";
            }
            return;
        }
        if (arg0 != 10) {
            field2482 = -107;
        }
        if (var4 == 30) {
            class181 var29 = class300.field4495[var3];
            if (var29 != null) {
                class48.field719 = 0;
                class343.field5315 = 2;
                class17.field284++;
                class145.field2095 = class180.field2592;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 11);
                class107.field1533.method1355((byte) -116, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1366(var3, (byte) -72);
                class49.method416(var29.method1700(-118), var29.method1700(-101), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 47 && class289.field4380 == null) {
            class169.method1191(var7, arg0 + 201, var2);
            class289.field4380 = class165.method1172(var2, -1, var7);
            class83.method676(class289.field4380, (byte) -55);
        }
        if (var4 == 26) {
            class136.field1974++;
            class107.field1533.method1915(true, 70);
            class107.field1533.method1368(6029344, var7);
            class107.field1533.method1366(var3, (byte) -106);
            class107.field1533.method1330((byte) -81, var2);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, arg0 ^ 0x57);
            class232.field3499 = var2;
        }
        if (var4 == 44) {
            class181 var30 = class300.field4495[var3];
            if (var30 != null) {
                class258.field3857++;
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class116.field1648 = class227.field3425;
                class48.field719 = 0;
                class107.field1533.method1915(true, 148);
                class107.field1533.method1361(class67.field976, (byte) 125);
                class107.field1533.method1368(6029344, class88.field1234);
                class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
                class107.field1533.method1361(var3, (byte) 126);
                class49.method416(var30.method1700(-113), var30.method1700(arg0 - 126), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 36) {
            class228 var31 = class343.field5312[var3];
            if (var31 != null) {
                class343.field5315 = 2;
                class145.field2095 = class180.field2592;
                class48.field719 = 0;
                class116.field1648 = class227.field3425;
                class107.field1533.method1915(true, 117);
                class107.field1533.method1336((byte) 125, class302.field4518);
                class68.field995++;
                class107.field1533.method1330((byte) -81, var3);
                class107.field1533.method1342(class359.field5607, 128);
                class107.field1533.method1330((byte) -81, class52.field776);
                class107.field1533.method1355((byte) -113, class236.field3549[82] ? 1 : 0);
                class49.method416(var31.method1700(-121), var31.method1700(-115), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 51) {
            class72.field1047++;
            class343.field5315 = 2;
            class145.field2095 = class180.field2592;
            class48.field719 = 0;
            class116.field1648 = class227.field3425;
            class107.field1533.method1915(true, 51);
            class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
            class107.field1533.method1336((byte) 41, class302.field4518);
            class107.field1533.method1361(class52.field776, (byte) 126);
            class107.field1533.method1366(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -108);
            class107.field1533.method1342(class202.field2968 + var7, 128);
            class107.field1533.method1342(class272.field4123 + var2, 128);
            class107.field1533.method1330((byte) -81, class359.field5607);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 57) {
            class275.field4170++;
            class343.field5315 = 2;
            class48.field719 = 0;
            class116.field1648 = class227.field3425;
            class145.field2095 = class180.field2592;
            class107.field1533.method1915(true, 195);
            class107.field1533.method1361(class272.field4123 + var2, (byte) 124);
            class107.field1533.method1330((byte) -81, class202.field2968 + var7);
            class107.field1533.method1348(class236.field3549[82] ? 1 : 0, true);
            class107.field1533.method1330((byte) -81, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class108.method825(var5, var2, (byte) -66, var7);
        }
        if (var4 == 19 || var4 == 1004) {
            class89.method710(class281.field4267[arg1], var7, var3, var2, 8477);
        }
        if (var4 == 41) {
            class228 var32 = class343.field5312[var3];
            if (var32 != null) {
                class145.field2095 = class180.field2592;
                class148.field2123++;
                class343.field5315 = 2;
                class116.field1648 = class227.field3425;
                class48.field719 = 0;
                class107.field1533.method1915(true, 59);
                class107.field1533.method1361(var3, (byte) 124);
                class107.field1533.method1355((byte) -121, class236.field3549[82] ? 1 : 0);
                class49.method416(var32.method1700(-110), var32.method1700(-124), class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var2, var7, true);
            }
        }
        if (var4 == 1008) {
            class359 var33 = class231.method1719(var7, 85);
            if (var33 == null || var33.field5513[var2] < 100000) {
                class95.field1323++;
                class107.field1533.method1915(true, 179);
                class107.field1533.method1342(var3, arg0 ^ 0x8A);
            } else {
                class28.method177(var33.field5513[var2] + " x " + class175.method1228((byte) 54, var3).field1742, arg0 - 19430);
            }
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, arg0 ^ 0x3E);
            class232.field3499 = var2;
        }
        if (var4 == 42) {
            class99.field1404++;
            class107.field1533.method1915(true, 94);
            class107.field1533.method1354(var7, (byte) -36);
            class359 var34 = class231.method1719(var7, 72);
            if (var34.field5590 != null && var34.field5590[0][0] == 5) {
                int var35 = var34.field5590[0][1];
                if (class227.field3423[var35] != var34.field5556[0]) {
                    class227.field3423[var35] = var34.field5556[0];
                    class225.method1649(var35, 100);
                }
            }
        }
        if (var4 == 35) {
            class107.field1533.method1915(true, 138);
            class59.field865++;
            class107.field1533.method1368(arg0 ^ 0x5C002A, var7);
            class107.field1533.method1366(var2, (byte) -84);
            class107.field1533.method1342(var3, 128);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, 108);
            class232.field3499 = var2;
        }
        if (var4 == 2) {
            class107.field1533.method1915(true, 248);
            class169.field2447++;
            class107.field1533.method1361(var2, (byte) 127);
            class107.field1533.method1354(var7, (byte) -96);
            class107.field1533.method1342(var3, 128);
            class166.field2375 = 0;
            class259.field3861 = class231.method1719(var7, arg0 ^ 0x24);
            class232.field3499 = var2;
        }
        if (class239.field3562 != 0) {
            class239.field3562 = 0;
            class83.method676(class231.method1719(class302.field4518, 104), (byte) 86);
        }
        if (class273.field4150) {
            class51.method429((byte) -53);
        }
        if (class259.field3861 != null && class166.field2375 == 0) {
            class83.method676(class259.field3861, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z", line = 1123)
    public static final boolean method1209(byte arg0) {
        field2491++;
        int var1 = 75 % ((-arg0 - 51) / 38);
        return class131.field1889 == 0 ? class256.field3833.method2294(0) : true;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIZ)V", line = 1187)
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2485 = arg4;
        this.field2479 = arg3;
        this.field2483 = arg0;
        this.field2481 = arg6;
        this.field2486 = arg2;
        this.field2476 = arg1;
        this.field2480 = arg5;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 1141)
    public static final void method1210(int arg0) {
        field2475++;
        class28.field391.method462(24);
        class291.field4405.method462(24);
        if (arg0 < 20) {
            method1211(true, 58, 6);
        }
        class3.field105.method462(24);
        class125.field1820.method462(24);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZII)I", line = 1157)
    public static final int method1211(boolean arg0, int arg1, int arg2) {
        field2477++;
        class206 var3 = (class206) class135.field1968.method1405((long) arg2, arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field3008.length) {
            return var3.field3008[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 1175)
    public static void method1212(int arg0) {
        field2478 = null;
        if (arg0 == 0) {
            field2489 = null;
        }
    }
}
