import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Z")
    private boolean field1460 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    private int field1444 = 0;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
    private boolean field1455 = false;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    private int field1457 = 0;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lve;")
    private class151 field1433;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field1440;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Ljava/io/InputStream;")
    private InputStream field1459;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1448;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lod;")
    private static class101 field1436 = class46.method335(93, "Loaded update list");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lod;")
    public static class101 field1437 = class46.method335(124, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lod;")
    private static class101 field1443 = class46.method335(116, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lod;")
    private static class101 field1452 = class46.method335(-84, " from your ignore list first");

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lod;")
    public static class101 field1435 = field1452;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Lod;")
    private static class101 field1451 = class46.method335(-57, " has logged in)3");

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Lod;")
    public static class101 field1456 = field1443;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lod;")
    private static class101 field1442 = class46.method335(70, "This world is full)3");

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Lod;")
    private static class101 field1461 = class46.method335(71, "flash2:");

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static volatile int field1467 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lod;")
    public static class101 field1441 = field1442;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Lod;")
    public static class101 field1465 = field1461;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Lod;")
    public static class101 field1466 = field1436;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lod;")
    public static class101 field1453 = field1461;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "Lod;")
    public static class101 field1464 = field1451;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lke;")
    private class74 field1458;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[B")
    private byte[] field1463;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Z")
    public static final boolean method436(boolean arg0) {
        field1439++;
        if (class90.field1958 == null) {
            return false;
        }
        try {
            if (arg0) {
                field1436 = null;
            }
            int var1 = class90.field1958.method443((byte) -62);
            if (var1 == 0) {
                return false;
            }
            if (class44.field1048 == -1) {
                class90.field1958.method440(1, (byte) 62, 0, class118.field2611.field3213);
                var1--;
                class118.field2611.field3175 = 0;
                class44.field1048 = class118.field2611.method424(8);
                class8.field121 = class93.field2004[class44.field1048];
            }
            if (class8.field121 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class90.field1958.method440(1, (byte) 59, 0, class118.field2611.field3213);
                class8.field121 = class118.field2611.field3213[0] & 0xFF;
            }
            if (class8.field121 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class90.field1958.method440(2, (byte) 104, 0, class118.field2611.field3213);
                class118.field2611.field3175 = 0;
                class8.field121 = class118.field2611.method1098(true);
            }
            if (class8.field121 > var1) {
                return false;
            }
            class118.field2611.field3175 = 0;
            class90.field1958.method440(class8.field121, (byte) 123, 0, class118.field2611.field3213);
            class29.field774 = class97.field2110;
            class97.field2110 = class31.field797;
            class120.field2638 = 0;
            class31.field797 = class44.field1048;
            if (class44.field1048 == 187) {
                class32.field842 = class118.field2611.method1055(122);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 252) {
                int var2 = class118.field2611.field3175 + class8.field121;
                int var3 = class118.field2611.method1098(true);
                int var4 = class118.field2611.method1098(true);
                if (class62.field1382 != var3) {
                    class62.field1382 = var3;
                    class119.method896(-128, class62.field1382);
                    class99.method687(class62.field1382, -123);
                    for (int var5 = 0; var5 < 100; var5++) {
                        class129.field2938[var5] = true;
                    }
                }
                while (var4-- > 0) {
                    int var6 = class118.field2611.method1062(1809568712);
                    int var7 = class118.field2611.method1098(!arg0);
                    int var8 = class118.field2611.method1055(113);
                    class133 var9 = (class133) class96.field2092.method1141((long) var6, -1);
                    if (var9 != null && var9.field3044 != var7) {
                        class54.method387(true, var9, (byte) 111);
                        var9 = null;
                    }
                    if (var9 == null) {
                        var9 = class28.method227(var6, (byte) -102, var7, var8);
                    }
                    var9.field3037 = true;
                }
                for (class133 var10 = (class133) class96.field2092.method1142((byte) -62); var10 != null; var10 = (class133) class96.field2092.method1136(-9485)) {
                    if (var10.field3037) {
                        var10.field3037 = false;
                    } else {
                        class54.method387(true, var10, (byte) -98);
                    }
                }
                class153.field3494 = new class143(512);
                while (class118.field2611.field3175 < var2) {
                    int var11 = class118.field2611.method1062(1809568712);
                    int var12 = class118.field2611.method1098(!arg0);
                    int var13 = class118.field2611.method1098(true);
                    int var14 = class118.field2611.method1062(1809568712);
                    for (int var15 = var12; var15 <= var13; var15++) {
                        long var16 = ((long) var11 << 32) + (long) var15;
                        class153.field3494.method1137((byte) -89, var16, new class42(var14));
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 150) {
                if (class62.field1382 != -1) {
                    class138.method1100(0, (byte) 121, class62.field1382);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 86) {
                int var18 = class118.field2611.method1062(1809568712);
                class133 var19 = (class133) class96.field2092.method1141((long) var18, -1);
                if (var19 != null) {
                    class54.method387(true, var19, (byte) 123);
                }
                if (class30.field776 != null) {
                    class40.method300(false, class30.field776);
                    class30.field776 = null;
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 13) {
                int var20 = class118.field2611.method1098(true);
                if (var20 == 65535) {
                    var20 = -1;
                }
                class132.method1016(var20, -127);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 119) {
                int var21 = class118.field2611.method1053((byte) 37);
                int var22 = class118.field2611.method1088(255);
                if (var21 == 65535) {
                    var21 = -1;
                }
                class130.method1002(var22, var21, 25095);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 107) {
                class148.method1160(-99);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 3) {
                int var23 = class118.field2611.method1064(16711680);
                int var24 = class118.field2611.method1084(-103);
                int var25 = class118.field2611.method1069(126);
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var26 = class118.field2611.method1098(!arg0);
                if (var26 == 65535) {
                    var26 = -1;
                }
                for (int var27 = var24; var27 <= var26; var27++) {
                    long var28 = ((long) var25 << 32) + (long) var27;
                    class125 var30 = class153.field3494.method1141(var28, -1);
                    if (var30 != null) {
                        var30.method959(11835);
                    }
                    class153.field3494.method1137((byte) -89, var28, new class42(var23));
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 110) {
                int var31 = class118.field2611.method1095(-2);
                int var32 = class118.field2611.method1051(-78);
                class102.field2243[var32] = var31;
                if (class63.field1388[var32] != var31) {
                    class63.field1388[var32] = var31;
                    class1.method5(0, var32);
                }
                class67.field1512[class41.method307(class112.field2392++, 31)] = var32;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 15) {
                class20.field435 = class118.field2611.method1084(-126) * 30;
                class23.field543 = class108.field2306;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 66) {
                int var33 = class118.field2611.method1064(16711680);
                int var34 = class118.field2611.method1060(-1);
                int var35 = class118.field2611.method1053((byte) 124);
                class133 var36 = (class133) class96.field2092.method1141((long) var33, -1);
                if (var36 != null) {
                    class54.method387(var36.field3044 != var35, var36, (byte) 104);
                }
                class28.method227(var33, (byte) -105, var35, var34);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 68) {
                class48.method358(false, false);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 221) {
                int var37 = class118.field2611.method1098(!arg0);
                class62.field1382 = var37;
                class119.method896(60, var37);
                class99.method687(class62.field1382, -61);
                for (int var38 = 0; var38 < 100; var38++) {
                    class129.field2938[var38] = true;
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 156) {
                class156.method1211((byte) -115);
                class133.field3050 = class118.field2611.method1056(32767);
                class44.field1048 = -1;
                class23.field543 = class108.field2306;
                return true;
            }
            if (class44.field1048 == 56) {
                class41.field991 = class118.field2611.method1060(-1);
                class6.field83 = class118.field2611.method1077(4);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 10) {
                int var39 = class118.field2611.method1062(1809568712);
                int var40 = class118.field2611.method1098(true);
                if (var39 < -70000) {
                    var40 += 32768;
                }
                class126 var41;
                if (var39 >= 0) {
                    var41 = class78.method532(0, var39);
                } else {
                    var41 = null;
                }
                while (class8.field121 > class118.field2611.field3175) {
                    int var42 = class118.field2611.method1052(-100);
                    int var43 = class118.field2611.method1098(true);
                    int var44 = 0;
                    if (var43 != 0) {
                        var44 = class118.field2611.method1055(126);
                        if (var44 == 255) {
                            var44 = class118.field2611.method1062(1809568712);
                        }
                    }
                    if (var41 != null && var42 >= 0 && var42 < var41.field2841.length) {
                        var41.field2841[var42] = var43;
                        var41.field2838[var42] = var44;
                    }
                    class36.method268(var44, var42, var40, 0, var43 - 1);
                }
                if (var41 != null) {
                    class40.method300(arg0, var41);
                }
                class156.method1211((byte) -115);
                class134.field3078[class41.method307(31, class126.field2850++)] = class41.method307(32767, var40);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 244) {
                int var45 = class118.field2611.method1095(-2);
                class126 var46 = class78.method532(0, var45);
                for (int var47 = 0; var47 < var46.field2841.length; var47++) {
                    var46.field2841[var47] = -1;
                    var46.field2841[var47] = 0;
                }
                class40.method300(false, var46);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 85) {
                class101 var48 = class118.field2611.method1058((byte) 61);
                int var49 = class118.field2611.method1080((byte) 119);
                int var50 = class118.field2611.method1077(4);
                if (var50 >= 1 && var50 <= 8) {
                    if (var48.method710(class34.field883, 6587)) {
                        var48 = null;
                    }
                    class97.field2106[var50 - 1] = var48;
                    class26.field659[var50 - 1] = var49 == 0;
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 71) {
                class31.field801 = class118.field2611.method1055(122);
                if (class31.field801 == 1) {
                    class7.field97 = class118.field2611.method1098(true);
                }
                if (class31.field801 >= 2 && class31.field801 <= 6) {
                    if (class31.field801 == 2) {
                        class126.field2870 = 64;
                        class54.field1245 = 64;
                    }
                    if (class31.field801 == 3) {
                        class126.field2870 = 64;
                        class54.field1245 = 0;
                    }
                    if (class31.field801 == 4) {
                        class54.field1245 = 128;
                        class126.field2870 = 64;
                    }
                    if (class31.field801 == 5) {
                        class54.field1245 = 64;
                        class126.field2870 = 0;
                    }
                    if (class31.field801 == 6) {
                        class54.field1245 = 64;
                        class126.field2870 = 128;
                    }
                    class31.field801 = 2;
                    class40.field961 = class118.field2611.method1098(true);
                    class97.field2101 = class118.field2611.method1098(true);
                    class130.field2965 = class118.field2611.method1055(126);
                }
                if (class31.field801 == 10) {
                    class142.field3272 = class118.field2611.method1098(true);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 79) {
                class84.field1823 = true;
                class135.field3102 = class118.field2611.method1055(110);
                class82.field1790 = class118.field2611.method1055(124);
                client.field472 = class118.field2611.method1098(true);
                class85.field1876 = class118.field2611.method1055(124);
                class3.field57 = class118.field2611.method1055(124);
                if (class3.field57 >= 100) {
                    int var51 = class82.field1790 * 128 + 64;
                    int var52 = class135.field3102 * 128 + 64;
                    int var53 = class65.method449(var51, var52, class95.field2040, true) - client.field472;
                    int var54 = var52 - class120.field2637;
                    int var55 = var53 - class26.field692;
                    int var56 = var51 - class133.field3048;
                    int var57 = (int) Math.sqrt((double) (var54 * var54 + var56 * var56));
                    class26.field677 = (int) (Math.atan2((double) var55, (double) var57) * 325.949D) & 0x7FF;
                    class132.field3033 = (int) (-325.949D * Math.atan2((double) var54, (double) var56)) & 0x7FF;
                    if (class26.field677 < 128) {
                        class26.field677 = 128;
                    }
                    if (class26.field677 > 383) {
                        class26.field677 = 383;
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 76) {
                int var58 = class118.field2611.method1080((byte) -79);
                int var59 = class118.field2611.method1080((byte) -108);
                int var60 = class118.field2611.method1060(-1);
                class95.field2040 = var59 >> 1;
                class82.field1778.method406((var59 & 0x1) == 1, var60, var58, 29682);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 192) {
                long var61 = class118.field2611.method1065(-104);
                class118.field2611.method1079((byte) 0);
                long var63 = class118.field2611.method1065(-104);
                long var65 = (long) class118.field2611.method1098(true);
                boolean var67 = false;
                long var68 = (long) class118.field2611.method1088(255);
                int var70 = class118.field2611.method1055(118);
                long var71 = (var65 << 32) + var68;
                for (int var73 = 0; var73 < 100; var73++) {
                    if (class106.field2288[var73] == var71) {
                        var67 = true;
                        break;
                    }
                }
                if (var70 <= 1) {
                    for (int var74 = 0; var74 < class73.field1579; var74++) {
                        if (class29.field768[var74] == var61) {
                            var67 = true;
                            break;
                        }
                    }
                }
                if (!var67 && class133.field3051 == 0) {
                    class106.field2288[class150.field3439] = var71;
                    class150.field3439 = (class150.field3439 + 1) % 100;
                    class101 var75 = class114.method848(class11.method84(class118.field2611, -107).method729((byte) 66));
                    if (var70 == 2 || var70 == 3) {
                        class2.method8(class67.method452(105, var63), class15.method101(-95, new class101[] { class127.field2878, class67.method452(106, var61).method714(-116) }), 126, 9, var75);
                    } else if (var70 == 1) {
                        class2.method8(class67.method452(91, var63), class15.method101(90, new class101[] { class8.field131, class67.method452(103, var61).method714(-120) }), -35, 9, var75);
                    } else {
                        class2.method8(class67.method452(124, var63), class67.method452(106, var61).method714(-117), -25, 9, var75);
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 102) {
                int var76 = class118.field2611.method1095(-2);
                class126 var77 = class78.method532(0, var76);
                var77.field2741 = 3;
                var77.field2735 = class82.field1778.field255.method595(121);
                class40.method300(false, var77);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 247) {
                for (int var78 = 0; var78 < class94.field2032.length; var78++) {
                    if (class94.field2032[var78] != null) {
                        class94.field2032[var78].field1300 = -1;
                    }
                }
                for (int var79 = 0; var79 < class18.field376.length; var79++) {
                    if (class18.field376[var79] != null) {
                        class18.field376[var79].field1300 = -1;
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 158) {
                class84.field1823 = false;
                for (int var80 = 0; var80 < 5; var80++) {
                    class65.field1473[var80] = false;
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 129 || class44.field1048 == 41 || class44.field1048 == 220 || class44.field1048 == 180 || class44.field1048 == 246 || class44.field1048 == 237 || class44.field1048 == 135 || class44.field1048 == 232 || class44.field1048 == 9 || class44.field1048 == 118 || class44.field1048 == 155) {
                class36.method271(false);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 255) {
                long var81 = class118.field2611.method1065(-99);
                int var83 = class118.field2611.method1098(true);
                int var84 = class118.field2611.method1055(114);
                class101 var85 = class67.method452(96, var81).method714(-127);
                for (int var86 = 0; var86 < class101.field2205; var86++) {
                    if (class39.field929[var86] == var81) {
                        if (class78.field1623[var86] != var83) {
                            class78.field1623[var86] = var83;
                            if (var83 > 0) {
                                class111.method818(5, class26.field672, 28960, class15.method101(-17, new class101[] { var85, field1464 }));
                            }
                            if (var83 == 0) {
                                class111.method818(5, class26.field672, 28960, class15.method101(-43, new class101[] { var85, class40.field973 }));
                            }
                        }
                        var85 = null;
                        class52.field1179[var86] = var84;
                        break;
                    }
                }
                if (var85 != null && class101.field2205 < 200) {
                    class39.field929[class101.field2205] = var81;
                    class35.field899[class101.field2205] = var85;
                    class78.field1623[class101.field2205] = var83;
                    class52.field1179[class101.field2205] = var84;
                    class101.field2205++;
                }
                class10.field148 = class108.field2306;
                int var87 = class101.field2205;
                boolean var88 = false;
                while (var87 > 0) {
                    boolean var89 = true;
                    var87--;
                    for (int var90 = 0; var90 < var87; var90++) {
                        if (class78.field1623[var90] != class47.field1130 && class78.field1623[var90 + 1] == class47.field1130 || class78.field1623[var90] == 0 && class78.field1623[var90 + 1] != 0) {
                            int var91 = class78.field1623[var90];
                            var89 = false;
                            class78.field1623[var90] = class78.field1623[var90 + 1];
                            class78.field1623[var90 + 1] = var91;
                            class101 var92 = class35.field899[var90];
                            class35.field899[var90] = class35.field899[var90 + 1];
                            class35.field899[var90 + 1] = var92;
                            long var93 = class39.field929[var90];
                            class39.field929[var90] = class39.field929[var90 + 1];
                            class39.field929[var90 + 1] = var93;
                            int var95 = class52.field1179[var90];
                            class52.field1179[var90] = class52.field1179[var90 + 1];
                            class52.field1179[var90 + 1] = var95;
                        }
                    }
                    if (var89) {
                        break;
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 52) {
                int var96 = class118.field2611.method1098(!arg0);
                int var97 = class118.field2611.method1069(120);
                int var98 = class118.field2611.method1051(-89);
                class126 var99 = class78.method532(0, var97);
                var99.field2853 = (var96 << 16) + var98;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 227) {
                class73.field1579 = class8.field121 / 8;
                for (int var100 = 0; var100 < class73.field1579; var100++) {
                    class29.field768[var100] = class118.field2611.method1065(-128);
                }
                class44.field1048 = -1;
                class10.field148 = class108.field2306;
                return true;
            }
            if (class44.field1048 == 228) {
                class48.method358(true, false);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 230) {
                int var101 = class118.field2611.method1053((byte) 127);
                int var102 = class118.field2611.method1064(16711680);
                if (var101 == 65535) {
                    var101 = -1;
                }
                int var103 = class118.field2611.method1062(1809568712);
                class126 var104 = class78.method532(0, var102);
                if (var104.field2788) {
                    var104.field2745 = var103;
                    var104.field2801 = var101;
                    class155 var105 = class137.method1045((byte) -65, var101);
                    var104.field2825 = var105.field3533;
                    var104.field2821 = var105.field3552;
                    var104.field2748 = var105.field3546;
                    if (var104.field2785 > 0) {
                        var104.field2825 = var104.field2825 * 32 / var104.field2785;
                    }
                    var104.field2845 = var105.field3556;
                    var104.field2809 = var105.field3538;
                    var104.field2778 = var105.field3577;
                    class40.method300(false, var104);
                } else if (var101 == -1) {
                    var104.field2741 = 0;
                    class44.field1048 = -1;
                    return true;
                } else {
                    class155 var106 = class137.method1045((byte) -127, var101);
                    var104.field2741 = 4;
                    var104.field2825 = var106.field3533 * 100 / var103;
                    var104.field2778 = var106.field3577;
                    var104.field2735 = var101;
                    var104.field2748 = var106.field3546;
                    class40.method300(false, var104);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 92) {
                class5.field74 = class143.field3305;
                long var107 = class118.field2611.method1065(-47);
                if (var107 == 0L) {
                    class156.field3587 = null;
                    class44.field1048 = -1;
                    class142.field3279 = 0;
                    class119.field2631 = null;
                    return true;
                }
                class156.field3587 = class67.method452(124, var107);
                class54.field1224 = class118.field2611.method1079((byte) 0);
                int var109 = class118.field2611.method1055(111);
                if (var109 == 255) {
                    class44.field1048 = -1;
                    return true;
                }
                class142.field3279 = var109;
                class27[] var110 = new class27[100];
                for (int var111 = 0; var111 < class142.field3279; var111++) {
                    var110[var111] = new class27();
                    var110[var111].field2723 = class118.field2611.method1065(-84);
                    var110[var111].field707 = class67.method452(100, var110[var111].field2723);
                    var110[var111].field704 = class118.field2611.method1098(true);
                    var110[var111].field711 = class118.field2611.method1079((byte) 0);
                    if (class24.field597 == var110[var111].field2723) {
                        class86.field1899 = var110[var111].field711;
                    }
                }
                boolean var112 = false;
                int var113 = class142.field3279;
                while (var113 > 0) {
                    var113--;
                    boolean var114 = true;
                    for (int var115 = 0; var115 < var113; var115++) {
                        if (var110[var115].field707.method701(var110[var115 + 1].field707, (byte) 56) > 0) {
                            class27 var116 = var110[var115];
                            var110[var115] = var110[var115 + 1];
                            var114 = false;
                            var110[var115 + 1] = var116;
                        }
                    }
                    if (var114) {
                        break;
                    }
                }
                class44.field1048 = -1;
                class119.field2631 = var110;
                return true;
            }
            if (class44.field1048 == 205) {
                class67.field1502 = class118.field2611.method1055(122);
                class44.field1048 = -1;
                class10.field148 = class108.field2306;
                return true;
            }
            if (class44.field1048 == 209) {
                class44.field1048 = -1;
                class130.field2973 = 0;
                return true;
            }
            if (class44.field1048 == 93) {
                class62.method429(!arg0, class118.field2611, class129.field2954, class8.field121);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 126) {
                int var117 = class118.field2611.method1064(16711680);
                int var118 = class118.field2611.method1084(-94);
                class126 var119 = class78.method532(0, var117);
                if (var119.field2741 != 1 || var119.field2735 != var118) {
                    var119.field2741 = 1;
                    var119.field2735 = var118;
                    class40.method300(false, var119);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 183) {
                for (int var120 = 0; var120 < class154.field3509; var120++) {
                    class35 var121 = class129.method999(20, var120);
                    if (var121 != null && var121.field888 == 0) {
                        class102.field2243[var120] = 0;
                        class63.field1388[var120] = 0;
                    }
                }
                class156.method1211((byte) -115);
                class44.field1048 = -1;
                class112.field2392 += 32;
                return true;
            }
            if (class44.field1048 == 27) {
                class79.field1660 = class118.field2611.method1055(123);
                class48.field1139 = class118.field2611.method1055(118);
                class7.field103 = class118.field2611.method1055(109);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 171) {
                int var122 = class118.field2611.method1051(-75);
                class97.method674((byte) -86, var122);
                class134.field3078[class41.method307(class126.field2850++, 31)] = class41.method307(var122, 32767);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 60) {
                int var123 = class118.field2611.method1098(true);
                byte var124 = class118.field2611.method1079((byte) 0);
                class102.field2243[var123] = var124;
                if (class63.field1388[var123] != var124) {
                    class63.field1388[var123] = var124;
                    class1.method5(0, var123);
                }
                class67.field1512[class41.method307(class112.field2392++, 31)] = var123;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 139) {
                class6.field83 = class118.field2611.method1055(123);
                class41.field991 = class118.field2611.method1080((byte) 127);
                for (int var125 = class6.field83; var125 < class6.field83 + 8; var125++) {
                    for (int var126 = class41.field991; var126 < class41.field991 + 8; var126++) {
                        if (class54.field1219[class95.field2040][var125][var126] != null) {
                            class54.field1219[class95.field2040][var125][var126] = null;
                            class57.method408(var126, var125, (byte) 25);
                        }
                    }
                }
                for (class156 var127 = (class156) class17.field345.method523(false); var127 != null; var127 = (class156) class17.field345.method527(true)) {
                    if (class6.field83 <= var127.field3582 && var127.field3582 < class6.field83 + 8 && class41.field991 <= var127.field3593 && class41.field991 + 8 > var127.field3593 && class95.field2040 == var127.field3590) {
                        var127.field3595 = 0;
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 253) {
                int var128 = class118.field2611.method1095(-2);
                class129.field2941 = class129.field2954.method1171(var128, 3);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 36) {
                class6.field83 = class118.field2611.method1080((byte) -23);
                class41.field991 = class118.field2611.method1080((byte) -30);
                while (class8.field121 > class118.field2611.field3175) {
                    class44.field1048 = class118.field2611.method1055(116);
                    class36.method271(false);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 14) {
                class84.method612(0);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 206) {
                int var129 = class118.field2611.method1062(1809568712);
                int var130 = class118.field2611.method1098(true);
                class126 var131;
                if (var129 >= 0) {
                    var131 = class78.method532(0, var129);
                } else {
                    var131 = null;
                }
                if (var129 < -70000) {
                    var130 += 32768;
                }
                if (var131 != null) {
                    for (int var132 = 0; var132 < var131.field2841.length; var132++) {
                        var131.field2841[var132] = 0;
                        var131.field2838[var132] = 0;
                    }
                }
                class133.method1028(8061, var130);
                int var133 = class118.field2611.method1098(true);
                for (int var134 = 0; var134 < var133; var134++) {
                    int var135 = class118.field2611.method1055(122);
                    if (var135 == 255) {
                        var135 = class118.field2611.method1064(16711680);
                    }
                    int var136 = class118.field2611.method1098(true);
                    if (var131 != null && var134 < var131.field2841.length) {
                        var131.field2841[var134] = var136;
                        var131.field2838[var134] = var135;
                    }
                    class36.method268(var135, var134, var130, 0, var136 - 1);
                }
                if (var131 != null) {
                    class40.method300(false, var131);
                }
                class156.method1211((byte) -115);
                class134.field3078[class41.method307(31, class126.field2850++)] = class41.method307(32767, var130);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 125) {
                int var137 = class118.field2611.method1055(123);
                int var138 = class118.field2611.method1055(120);
                int var139 = class118.field2611.method1055(122);
                int var140 = class118.field2611.method1055(126);
                class65.field1473[var137] = true;
                class56.field1263[var137] = var138;
                class27.field721[var137] = var139;
                class102.field2238[var137] = var140;
                class143.field3292[var137] = 0;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 17) {
                int var141 = class118.field2611.method1051(-83);
                int var142 = class118.field2611.method1062(1809568712);
                int var143 = class118.field2611.method1098(true);
                int var144 = class118.field2611.method1053((byte) 125);
                class126 var145 = class78.method532(0, var142);
                if (var145.field2778 != var141 || var145.field2748 != var144 || var145.field2825 != var143) {
                    var145.field2748 = var144;
                    var145.field2825 = var143;
                    var145.field2778 = var141;
                    class40.method300(false, var145);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 131) {
                for (int var146 = 0; var146 < class63.field1388.length; var146++) {
                    if (class63.field1388[var146] != class102.field2243[var146]) {
                        class63.field1388[var146] = class102.field2243[var146];
                        class1.method5(0, var146);
                        class67.field1512[class41.method307(class112.field2392++, 31)] = var146;
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 44) {
                class156.method1211((byte) -115);
                class28.field750 = class118.field2611.method1055(119);
                class44.field1048 = -1;
                class23.field543 = class108.field2306;
                return true;
            }
            if (class44.field1048 == 182) {
                int var147 = class118.field2611.method1064(16711680);
                int var148 = class118.field2611.method1098(!arg0);
                int var149 = var148 >> 5 & 0x1F;
                int var150 = var148 & 0x1F;
                int var151 = var148 >> 10 & 0x1F;
                class126 var152 = class78.method532(0, var147);
                int var153 = (var150 << 3) + (var149 << 11) + (var151 << 19);
                if (var152.field2779 != var153) {
                    var152.field2779 = var153;
                    class40.method300(false, var152);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 149) {
                int var154 = class118.field2611.method1062(1809568712);
                boolean var155 = class118.field2611.method1055(112) == 1;
                class126 var156 = class78.method532(0, var154);
                if (var155 != var156.field2754) {
                    var156.field2754 = var155;
                    class40.method300(false, var156);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 239) {
                class101 var157 = class118.field2611.method1058((byte) -119);
                if (var157.method735(arg0, class24.field625)) {
                    class101 var158 = var157.method725(0, -110, var157.method708((byte) 96, class145.field3336));
                    long var159 = var158.method717(-96);
                    boolean var161 = false;
                    for (int var162 = 0; var162 < class73.field1579; var162++) {
                        if (class29.field768[var162] == var159) {
                            var161 = true;
                            break;
                        }
                    }
                    if (!var161 && class133.field3051 == 0) {
                        class111.method818(4, var158, 28960, class89.field1932);
                    }
                } else if (var157.method735(false, class101.field2227)) {
                    class101 var163 = var157.method725(0, -122, var157.method708((byte) 81, class145.field3336));
                    long var164 = var163.method717(-96);
                    boolean var166 = false;
                    for (int var167 = 0; var167 < class73.field1579; var167++) {
                        if (class29.field768[var167] == var164) {
                            var166 = true;
                            break;
                        }
                    }
                    if (!var166 && class133.field3051 == 0) {
                        class111.method818(8, var163, 28960, class27.field708);
                    }
                } else if (var157.method735(arg0, class82.field1798)) {
                    class101 var176 = var157.method725(0, -114, var157.method708((byte) 84, class145.field3336));
                    long var177 = var176.method717(-96);
                    boolean var179 = false;
                    for (int var180 = 0; var180 < class73.field1579; var180++) {
                        if (class29.field768[var180] == var177) {
                            var179 = true;
                            break;
                        }
                    }
                    if (!var179 && class133.field3051 == 0) {
                        class101 var181 = var157.method725(var157.method708((byte) 65, class145.field3336) + 1, -118, var157.method737(0) - 9);
                        class111.method818(8, var176, 28960, var181);
                    }
                } else if (var157.method735(arg0, class78.field1640)) {
                    class101 var168 = var157.method725(0, -118, var157.method708((byte) 66, class145.field3336));
                    long var169 = var168.method717(-96);
                    boolean var171 = false;
                    for (int var172 = 0; var172 < class73.field1579; var172++) {
                        if (class29.field768[var172] == var169) {
                            var171 = true;
                            break;
                        }
                    }
                    if (!var171 && class133.field3051 == 0) {
                        class111.method818(10, var168, 28960, class26.field672);
                    }
                } else if (var157.method735(false, class157.field3604)) {
                    class101 var173 = var157.method725(0, -123, var157.method708((byte) 122, class145.field3336));
                    class111.method818(11, class26.field672, 28960, var173);
                } else if (var157.method735(arg0, class48.field1142)) {
                    class101 var175 = var157.method725(0, -125, var157.method708((byte) 70, class145.field3336));
                    if (class133.field3051 == 0) {
                        class111.method818(12, class26.field672, 28960, var175);
                    }
                } else if (var157.method735(false, class99.field2150)) {
                    class101 var174 = var157.method725(0, -104, var157.method708((byte) 80, class145.field3336));
                    if (class133.field3051 == 0) {
                        class111.method818(13, class26.field672, 28960, var174);
                    }
                } else {
                    class111.method818(0, class26.field672, 28960, var157);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 160) {
                int var182 = class118.field2611.method1105(-252);
                int var183 = class118.field2611.method1062(1809568712);
                int var184 = class118.field2611.method1067((byte) 113);
                class126 var185 = class78.method532(0, var183);
                int var186 = var185.field2772 + var184;
                int var187 = var185.field2831 + var182;
                if (var185.field2812 != var187 || var185.field2752 != var186) {
                    var185.field2752 = var186;
                    var185.field2812 = var187;
                    class40.method300(false, var185);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 72) {
                int var188 = class118.field2611.method1095(-2);
                int var189 = class118.field2611.method1098(true);
                class126 var190 = class78.method532(0, var188);
                if (var190 != null && var190.field2782 == 0) {
                    if (var189 > var190.field2791 - var190.field2871) {
                        var189 = var190.field2791 - var190.field2871;
                    }
                    if (var189 < 0) {
                        var189 = 0;
                    }
                    if (var190.field2867 != var189) {
                        var190.field2867 = var189;
                        class40.method300(arg0, var190);
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 200) {
                long var191 = class118.field2611.method1065(-118);
                class101 var193 = class114.method848(class11.method84(class118.field2611, 39).method729((byte) -114));
                class111.method818(6, class67.method452(127, var191).method714(-125), 28960, var193);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 50) {
                class101 var194 = class118.field2611.method1058((byte) 127);
                Object[] var195 = new Object[var194.method737(0) + 1];
                for (int var196 = var194.method737(0) - 1; var196 >= 0; var196--) {
                    if (var194.method730(-121, var196) == 115) {
                        var195[var196 + 1] = class118.field2611.method1058((byte) -74);
                    } else {
                        var195[var196 + 1] = Integer.valueOf(class118.field2611.method1062(1809568712));
                    }
                }
                var195[0] = Integer.valueOf(class118.field2611.method1062(1809568712));
                class141 var197 = new class141();
                var197.field3247 = var195;
                class31.method237((byte) -71, var197);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 109) {
                int var198 = class118.field2611.method1098(true);
                int var199 = class118.field2611.method1055(119);
                int var200 = class118.field2611.method1098(true);
                class135.method1043(var200, var199, var198, 112);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 225) {
                class84.field1823 = true;
                class54.field1247 = class118.field2611.method1055(121);
                class80.field1710 = class118.field2611.method1055(114);
                class8.field132 = class118.field2611.method1098(true);
                class143.field3298 = class118.field2611.method1055(114);
                class134.field3074 = class118.field2611.method1055(116);
                if (class134.field3074 >= 100) {
                    class120.field2637 = class54.field1247 * 128 + 64;
                    class133.field3048 = class80.field1710 * 128 + 64;
                    class26.field692 = class65.method449(class133.field3048, class120.field2637, class95.field2040, true) - class8.field132;
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 213) {
                class67.method453((byte) 105, class118.field2611);
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 0) {
                class149.method1165(26294);
                class44.field1048 = -1;
                return false;
            }
            if (class44.field1048 == 74) {
                long var201 = class118.field2611.method1065(-123);
                boolean var203 = false;
                int var204 = class118.field2611.method1098(true);
                if ((var201 & Long.MIN_VALUE) != 0L) {
                    var203 = true;
                }
                byte var205 = class118.field2611.method1079((byte) 0);
                if (var203) {
                    if (class142.field3279 == 0) {
                        class44.field1048 = -1;
                        return true;
                    }
                    long var206 = var201 & Long.MAX_VALUE;
                    boolean var208 = false;
                    int var209;
                    for (var209 = 0; var209 < class142.field3279 && (class119.field2631[var209].field2723 != var206 || class119.field2631[var209].field704 != var204); var209++) {
                    }
                    if (class142.field3279 > var209) {
                        while (class142.field3279 - 1 > var209) {
                            class119.field2631[var209] = class119.field2631[var209 + 1];
                            var209++;
                        }
                        class119.field2631[class142.field3279] = null;
                        class142.field3279--;
                    }
                } else {
                    class27 var210 = new class27();
                    var210.field2723 = var201;
                    var210.field707 = class67.method452(112, var210.field2723);
                    var210.field704 = var204;
                    var210.field711 = var205;
                    int var211;
                    for (var211 = class142.field3279 - 1; var211 >= 0; var211--) {
                        int var212 = class119.field2631[var211].field707.method701(var210.field707, (byte) 56);
                        if (var212 == 0) {
                            class119.field2631[var211].field704 = var204;
                            class119.field2631[var211].field711 = var205;
                            if (class24.field597 == var201) {
                                class86.field1899 = var205;
                            }
                            class5.field74 = class143.field3305;
                            class44.field1048 = -1;
                            return true;
                        }
                        if (var212 < 0) {
                            break;
                        }
                    }
                    if (class142.field3279 >= class119.field2631.length) {
                        class44.field1048 = -1;
                        return true;
                    }
                    for (int var213 = class142.field3279 - 1; var213 > var211; var213--) {
                        class119.field2631[var213 + 1] = class119.field2631[var213];
                    }
                    if (class142.field3279 == 0) {
                        class119.field2631 = new class27[100];
                    }
                    class119.field2631[var211 + 1] = var210;
                    class142.field3279++;
                    if (class24.field597 == var201) {
                        class86.field1899 = var205;
                    }
                }
                class44.field1048 = -1;
                class5.field74 = class143.field3305;
                return true;
            }
            if (class44.field1048 == 181) {
                class101 var214 = class118.field2611.method1058((byte) -60);
                int var215 = class118.field2611.method1095(-2);
                class126 var216 = class78.method532(0, var215);
                if (!var214.method703(0, var216.field2819)) {
                    var216.field2819 = var214;
                    class40.method300(arg0, var216);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 142) {
                class156.method1211((byte) -115);
                int var217 = class118.field2611.method1069(-13);
                int var218 = class118.field2611.method1077(4);
                int var219 = class118.field2611.method1055(113);
                class8.field134[var218] = var217;
                class121.field2666[var218] = var219;
                class46.field1092[var218] = 1;
                for (int var220 = 0; var220 < 98; var220++) {
                    if (class106.field2283[var220] <= var217) {
                        class46.field1092[var218] = var220 + 2;
                    }
                }
                class10.field151[class41.method307(31, class8.field133++)] = var218;
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 95) {
                int var221 = class118.field2611.method1053((byte) -41);
                int var222 = class118.field2611.method1064(16711680);
                class126 var223 = class78.method532(0, var222);
                if (var223.field2741 != 2 || var223.field2735 != var221) {
                    var223.field2741 = 2;
                    var223.field2735 = var221;
                    class40.method300(false, var223);
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 136) {
                long var224 = class118.field2611.method1065(-34);
                long var226 = (long) class118.field2611.method1098(true);
                long var228 = (long) class118.field2611.method1088(255);
                int var230 = class118.field2611.method1055(110);
                long var231 = (var226 << 32) + var228;
                boolean var233 = false;
                for (int var234 = 0; var234 < 100; var234++) {
                    if (class106.field2288[var234] == var231) {
                        var233 = true;
                        break;
                    }
                }
                if (var230 <= 1) {
                    for (int var235 = 0; var235 < class73.field1579; var235++) {
                        if (class29.field768[var235] == var224) {
                            var233 = true;
                            break;
                        }
                    }
                }
                if (!var233 && class133.field3051 == 0) {
                    class106.field2288[class150.field3439] = var231;
                    class150.field3439 = (class150.field3439 + 1) % 100;
                    class101 var236 = class114.method848(class11.method84(class118.field2611, 95).method729((byte) 90));
                    if (var230 == 2 || var230 == 3) {
                        class111.method818(7, class15.method101(-113, new class101[] { class127.field2878, class67.method452(104, var224).method714(-120) }), 28960, var236);
                    } else if (var230 == 1) {
                        class111.method818(7, class15.method101(-15, new class101[] { class8.field131, class67.method452(116, var224).method714(-128) }), 28960, var236);
                    } else {
                        class111.method818(3, class67.method452(126, var224).method714(-124), 28960, var236);
                    }
                }
                class44.field1048 = -1;
                return true;
            }
            if (class44.field1048 == 5) {
                int var237 = class118.field2611.method1067((byte) 113);
                int var238 = class118.field2611.method1069(-57);
                class126 var239 = class78.method532(0, var238);
                if (var239.field2776 != var237 || var237 == -1) {
                    var239.field2844 = 0;
                    var239.field2776 = var237;
                    var239.field2861 = 0;
                    class40.method300(false, var239);
                }
                class44.field1048 = -1;
                return true;
            }
            class142.method1130("T1 - " + class44.field1048 + "," + class97.field2110 + "," + class29.field774 + " - " + class8.field121, null, 7565);
            class149.method1165(26294);
        } catch (IOException var243) {
            class141.method1125(106);
        } catch (Exception var244) {
            String var241 = "T2 - " + class44.field1048 + "," + class97.field2110 + "," + class29.field774 + " - " + class8.field121 + "," + (class82.field1778.field1291[0] + class56.field1260) + "," + (class75.field1597 + class82.field1778.field1271[0]) + " - ";
            for (int var242 = 0; var242 < class8.field121 && var242 < 50; var242++) {
                var241 = var241 + class118.field2611.field3213[var242] + ",";
            }
            class142.method1130(var241, var244, 7565);
            class149.method1165(26294);
        }
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1447++;
        this.method444((byte) -88);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
    public final int method437(int arg0) throws IOException {
        field1450++;
        if (arg0 != 16466) {
            method439(-128);
        }
        return this.field1455 ? 0 : this.field1459.read();
    }

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
    public final void run() {
        field1449++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1457 == this.field1444) {
                        if (this.field1455) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1444 > this.field1457) {
                        var2 = 5000 - this.field1444;
                    } else {
                        var2 = this.field1457 - this.field1444;
                    }
                    var3 = this.field1444;
                }
                if (var2 > 0) {
                    try {
                        this.field1448.write(this.field1463, var3, var2);
                    } catch (IOException var9) {
                        this.field1460 = true;
                    }
                    this.field1444 = (this.field1444 + var2) % 5000;
                    try {
                        if (this.field1457 == this.field1444) {
                            this.field1448.flush();
                        }
                    } catch (IOException var8) {
                        this.field1460 = true;
                    }
                }
            }
            try {
                if (this.field1459 != null) {
                    this.field1459.close();
                }
                if (this.field1448 != null) {
                    this.field1448.close();
                }
                if (this.field1440 != null) {
                    this.field1440.close();
                }
            } catch (IOException var7) {
            }
            this.field1463 = null;
        } catch (Exception var12) {
            class142.method1130(null, var12, 7565);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method438(byte arg0) {
        field1465 = null;
        field1464 = null;
        field1453 = null;
        field1437 = null;
        field1442 = null;
        field1466 = null;
        field1452 = null;
        field1436 = null;
        field1435 = null;
        field1456 = null;
        if (arg0 != -24) {
            method438((byte) 26);
        }
        field1443 = null;
        field1451 = null;
        field1441 = null;
        field1461 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static final void method439(int arg0) {
        if (class8.field122 != null) {
            class153 var1 = class8.field122;
            synchronized (class8.field122) {
                class8.field122 = null;
            }
        }
        field1434++;
        if (arg0 != 0) {
            method441(102, 9, (byte) 112, 20, 26, 24, -126, -122);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI[B)V")
    public final void method440(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1431++;
        if (arg1 <= 49 || this.field1455) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1459.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method441(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1445++;
        if (arg7 >= 1 && arg1 >= 1 && arg7 <= 102 && arg1 <= 102) {
            if (class10.field152 && class95.field2040 != arg5) {
                return;
            }
            boolean var8 = true;
            int var9 = 0;
            boolean var10 = false;
            if (arg0 == 0) {
                var9 = class33.field857.method556(arg5, arg7, arg1);
            }
            boolean var11 = false;
            if (arg0 == 1) {
                var9 = class33.field857.method542(arg5, arg7, arg1);
            }
            if (arg0 == 2) {
                var9 = class33.field857.method565(arg5, arg7, arg1);
            }
            if (arg0 == 3) {
                var9 = class33.field857.method572(arg5, arg7, arg1);
            }
            if (var9 != 0) {
                int var12 = var9 >> 14 & 0x7FFF;
                int var13 = class33.field857.method554(arg5, arg7, arg1, var9);
                int var14 = var13 >> 6 & 0x3;
                int var15 = var13 & 0x1F;
                if (arg0 == 0) {
                    class33.field857.method578(arg5, arg7, arg1);
                    class24 var16 = class94.method652(var12, 0);
                    if (var16.field570 != 0) {
                        class57.field1331[arg5].method341(false, arg1, var14, var15, arg7, var16.field592);
                    }
                }
                if (arg0 == 1) {
                    class33.field857.method541(arg5, arg7, arg1);
                }
                if (arg0 == 2) {
                    class33.field857.method583(arg5, arg7, arg1);
                    class24 var17 = class94.method652(var12, 0);
                    if (var17.field613 + arg7 > 103 || var17.field613 + arg1 > 103 || var17.field599 + arg7 > 103 || var17.field599 + arg1 > 103) {
                        return;
                    }
                    if (var17.field570 != 0) {
                        class57.field1331[arg5].method344(arg1, var17.field599, var17.field613, arg7, var17.field592, false, var14);
                    }
                }
                if (arg0 == 3) {
                    class33.field857.method588(arg5, arg7, arg1);
                    class24 var18 = class94.method652(var12, 0);
                    if (var18.field570 == 1) {
                        class57.field1331[arg5].method339(10778, arg1, arg7);
                    }
                }
            }
            if (arg6 >= 0) {
                int var19 = arg5;
                if (arg5 < 3 && (class86.field1905[1][arg7][arg1] & 0x2) == 2) {
                    var19 = arg5 + 1;
                }
                class33.method251(class57.field1331[arg5], var19, arg1, arg2 - 93, arg7, arg3, class33.field857, arg6, arg4, arg5);
            }
        }
        if (arg2 != -1) {
            method441(-103, 45, (byte) -18, 50, 54, -32, -122, 112);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[B)V")
    public final void method442(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1438++;
        if (this.field1455) {
            return;
        }
        if (this.field1460) {
            this.field1460 = false;
            throw new IOException();
        }
        if (arg1 > -90) {
            field1456 = null;
        }
        if (this.field1463 == null) {
            this.field1463 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1463[this.field1457] = arg3[arg2 + var6];
                this.field1457 = (this.field1457 + 1) % 5000;
                if ((this.field1444 + 4900) % 5000 == this.field1457) {
                    throw new IOException();
                }
            }
            if (this.field1458 == null) {
                this.field1458 = this.field1433.method1170(3, 20919, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
    public final int method443(byte arg0) throws IOException {
        if (arg0 >= -57) {
            this.field1448 = null;
        }
        field1432++;
        return this.field1455 ? 0 : this.field1459.available();
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public final void method444(byte arg0) {
        field1446++;
        if (this.field1455) {
            return;
        }
        synchronized (this) {
            this.field1455 = true;
            this.notifyAll();
        }
        if (this.field1458 != null) {
            while (this.field1458.field1591 == 0) {
                class127.method981((byte) -86, 1L);
            }
            if (this.field1458.field1591 == 1) {
                try {
                    ((Thread) this.field1458.field1590).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1458 = null;
        int var3 = 8 % ((40 - arg0) / 59);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/net/Socket;Lve;)V")
    public class64(Socket arg0, class151 arg1) throws IOException {
        this.field1433 = arg1;
        this.field1440 = arg0;
        this.field1440.setSoTimeout(30000);
        this.field1440.setTcpNoDelay(true);
        this.field1459 = this.field1440.getInputStream();
        this.field1448 = this.field1440.getOutputStream();
    }
}
