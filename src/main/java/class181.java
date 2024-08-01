import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tf")
public class class181 {

    @OriginalMember(owner = "tf", name = "n", descriptor = "Lhb;")
    public class71 field3417 = new class71();

    @OriginalMember(owner = "tf", name = "b", descriptor = "Llf;")
    public static class109 field3405 = class35.method275("und Ihr Passwort ein)3", 2);

    @OriginalMember(owner = "tf", name = "f", descriptor = "Llf;")
    public static class109 field3409 = class35.method275("Okay", 2);

    @OriginalMember(owner = "tf", name = "r", descriptor = "Llf;")
    public static class109 field3421 = class35.method275("Verbindung konnte nicht hergestellt werden)3", 2);

    @OriginalMember(owner = "tf", name = "q", descriptor = "Z")
    public static boolean field3420 = false;

    @OriginalMember(owner = "tf", name = "d", descriptor = "Z")
    public static boolean field3407 = false;

    @OriginalMember(owner = "tf", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "tf", name = "c", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "tf", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "tf", name = "g", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "tf", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "tf", name = "i", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "tf", name = "j", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "tf", name = "k", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "tf", name = "l", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "tf", name = "m", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "tf", name = "o", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "tf", name = "p", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "tf", name = "s", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "tf", name = "u", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "tf", name = "t", descriptor = "Lhb;")
    private class71 field3423;

    @OriginalMember(owner = "tf", name = "a", descriptor = "(I)Lhb;")
    public final class71 method1226(int arg0) {
        field3404++;
        class71 var2 = this.field3417.field1382;
        if (this.field3417 == var2) {
            this.field3423 = null;
            return null;
        }
        this.field3423 = var2.field1382;
        if (arg0 <= 116) {
            this.method1227(null, (byte) 99);
        }
        return var2;
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(Lhb;B)V")
    public final void method1227(class71 arg0, byte arg1) {
        field3406++;
        if (arg0.field1382 != null) {
            arg0.method452(true);
        }
        arg0.field1382 = this.field3417;
        arg0.field1385 = this.field3417.field1385;
        arg0.field1382.field1385 = arg0;
        if (arg1 != -69) {
            field3405 = null;
        }
        arg0.field1385.field1382 = arg0;
    }

    @OriginalMember(owner = "tf", name = "b", descriptor = "(I)Z")
    public static final boolean method1228(int arg0) {
        field3413++;
        if (class55.field1114 == null) {
            return false;
        }
        try {
            int var1 = class55.field1114.method907(arg0 ^ 0x41);
            if (var1 == 0) {
                return false;
            }
            if (class136.field2628 == -1) {
                var1--;
                class55.field1114.method906(-120, 1, class95.field1934.field1808, 0);
                class95.field1934.field1773 = 0;
                class136.field2628 = class95.field1934.method1334(30882);
                class204.field4006 = class173.field3230[class136.field2628];
            }
            if (class204.field4006 == arg0) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class55.field1114.method906(125, 1, class95.field1934.field1808, 0);
                class204.field4006 = class95.field1934.field1808[0] & 0xFF;
            }
            if (class204.field4006 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class55.field1114.method906(116, 2, class95.field1934.field1808, 0);
                var1 -= 2;
                class95.field1934.field1773 = 0;
                class204.field4006 = class95.field1934.method569(true);
            }
            if (var1 < class204.field4006) {
                return false;
            }
            class95.field1934.field1773 = 0;
            class55.field1114.method906(123, class204.field4006, class95.field1934.field1808, 0);
            class115.field2283 = 0;
            class82.field1622 = class194.field3719;
            class194.field3719 = class15.field289;
            class15.field289 = class136.field2628;
            if (class136.field2628 == 56) {
                int var2 = class95.field1934.method580(true);
                int var3 = class95.field1934.method569(true);
                int var4 = var3 >> 5 & 0x1F;
                int var5 = var3 & 0x1F;
                int var6 = var3 >> 10 & 0x1F;
                int var7 = (var4 << 11) + ((var6 << 19) + (var5 << 3));
                class200 var8 = class158.method1078(var2, (byte) 126);
                if (var8.field3843 != var7) {
                    var8.field3843 = var7;
                    class115.method851(var8, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 61) {
                class30.field655 = class95.field1934.method569(true) * 30;
                class136.field2628 = -1;
                class98.field1977 = class75.field1442;
                return true;
            }
            if (class136.field2628 == 207) {
                int var9 = class95.field1934.method575(1440014816);
                class4.field57 = var9;
                class204.method1345((byte) 58, var9);
                class14.method92(2000000, class4.field57);
                for (int var10 = 0; var10 < 100; var10++) {
                    class194.field3721[var10] = true;
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 223) {
                class76.field1455 = class95.field1934.method598((byte) 76);
                if (class76.field1455 == 1) {
                    class24.field546 = class95.field1934.method569(true);
                }
                if (class76.field1455 >= 2 && class76.field1455 <= 6) {
                    if (class76.field1455 == 2) {
                        class78.field1503 = 64;
                        class8.field116 = 64;
                    }
                    if (class76.field1455 == 3) {
                        class78.field1503 = 64;
                        class8.field116 = 0;
                    }
                    if (class76.field1455 == 4) {
                        class8.field116 = 128;
                        class78.field1503 = 64;
                    }
                    if (class76.field1455 == 5) {
                        class78.field1503 = 0;
                        class8.field116 = 64;
                    }
                    if (class76.field1455 == 6) {
                        class78.field1503 = 128;
                        class8.field116 = 64;
                    }
                    class76.field1455 = 2;
                    class140.field2728 = class95.field1934.method569(true);
                    class194.field3713 = class95.field1934.method569(true);
                    class199.field3793 = class95.field1934.method598((byte) 93);
                }
                if (class76.field1455 == 10) {
                    class105.field2094 = class95.field1934.method569(true);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 252) {
                long var11 = class95.field1934.method572(arg0 - 1495411551);
                class109 var13 = class17.method127(class57.method377(class95.field1934, (byte) 78).method808((byte) -68));
                class98.method690(class136.method981((byte) 117, var11).method810(true), false, var13, 6);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 31) {
                class93.method674(false, (byte) 104);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 17) {
                class162.field3030 = class75.field1442;
                long var14 = class95.field1934.method572(-1495411552);
                if (var14 == 0L) {
                    class192.field3668 = null;
                    class136.field2628 = -1;
                    class19.field420 = null;
                    class44.field922 = null;
                    class121.field2341 = 0;
                    return true;
                }
                long var16 = class95.field1934.method572(arg0 - 1495411551);
                class19.field420 = class136.method981((byte) -106, var16);
                class44.field922 = class136.method981((byte) 108, var14);
                class136.field2634 = class95.field1934.method584(3);
                int var18 = class95.field1934.method598((byte) 88);
                if (var18 == 255) {
                    class136.field2628 = -1;
                    return true;
                }
                class121.field2341 = var18;
                class88[] var19 = new class88[100];
                for (int var20 = 0; var20 < class121.field2341; var20++) {
                    var19[var20] = new class88();
                    var19[var20].field1381 = class95.field1934.method572(-1495411552);
                    var19[var20].field1826 = class136.method981((byte) -86, var19[var20].field1381);
                    var19[var20].field1832 = class95.field1934.method569(true);
                    var19[var20].field1829 = class95.field1934.method584(3);
                    if (class203.field3998 == var19[var20].field1381) {
                        class65.field1249 = var19[var20].field1829;
                    }
                }
                boolean var21 = false;
                int var22 = class121.field2341;
                while (var22 > 0) {
                    boolean var23 = true;
                    var22--;
                    for (int var24 = 0; var24 < var22; var24++) {
                        if (var19[var24].field1826.method773(var19[var24 + 1].field1826, -10166) > 0) {
                            var23 = false;
                            class88 var25 = var19[var24];
                            var19[var24] = var19[var24 + 1];
                            var19[var24 + 1] = var25;
                        }
                    }
                    if (var23) {
                        break;
                    }
                }
                class192.field3668 = var19;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 28) {
                int var26 = class95.field1934.method582(15);
                int var27 = class95.field1934.method569(true);
                class200 var28;
                if (var26 < 0) {
                    var28 = null;
                } else {
                    var28 = class158.method1078(var26, (byte) 120);
                }
                if (var26 < -70000) {
                    var27 += 32768;
                }
                while (class204.field4006 > class95.field1934.field1773) {
                    int var29 = class95.field1934.method560(0);
                    int var30 = class95.field1934.method569(true);
                    int var31 = 0;
                    if (var30 != 0) {
                        var31 = class95.field1934.method598((byte) 91);
                        if (var31 == 255) {
                            var31 = class95.field1934.method582(15);
                        }
                    }
                    if (var28 != null && var29 >= 0 && var29 < var28.field3925.length) {
                        var28.field3925[var29] = var30;
                        var28.field3913[var29] = var31;
                    }
                    class123.method886(var29, var31, var30 - 1, var27, 4);
                }
                if (var28 != null) {
                    class115.method851(var28, -23101);
                }
                class9.method57(arg0 ^ 0x7A);
                class77.field1492[class170.method1140(31, class139.field2698++)] = class170.method1140(32767, var27);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 75) {
                int var32 = class95.field1934.method580(true);
                int var33 = class95.field1934.method553(255);
                if (var33 == 65535) {
                    var33 = -1;
                }
                class200 var34 = class158.method1078(var32, (byte) 116);
                if (var34.field3897 != 1 || var34.field3931 != var33) {
                    var34.field3931 = var33;
                    var34.field3897 = 1;
                    class115.method851(var34, arg0 ^ 0x5A3C);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 141) {
                int var35 = class95.field1934.method579((byte) 48);
                int var36 = class95.field1934.method553(255);
                class200 var37 = class158.method1078(var35, (byte) 118);
                if (var37 != null && var37.field3875 == 0) {
                    if (var37.field3847 - var37.field3901 < var36) {
                        var36 = var37.field3847 - var37.field3901;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var37.field3945 != var36) {
                        var37.field3945 = var36;
                        class115.method851(var37, -23101);
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 208) {
                class19.field426 = class204.field4006 / 8;
                for (int var38 = 0; var38 < class19.field426; var38++) {
                    class82.field1607[var38] = class95.field1934.method572(-1495411552);
                    class31.field741[var38] = class136.method981((byte) 93, class82.field1607[var38]);
                }
                class107.field2127 = class75.field1442;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 151) {
                if (class4.field57 != -1) {
                    class26.method218(0, 59, class4.field57);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 25) {
                class27.method226(class49.field1009, class95.field1934, ~arg0, class204.field4006);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 192) {
                for (int var39 = 0; var39 < class202.field3975.length; var39++) {
                    if (class202.field3975[var39] != null) {
                        class202.field3975[var39].field3597 = -1;
                    }
                }
                for (int var40 = 0; var40 < class183.field3444.length; var40++) {
                    if (class183.field3444[var40] != null) {
                        class183.field3444[var40].field3597 = -1;
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 204) {
                class163.field3052 = class95.field1934.method573(24263);
                class30.field656 = class95.field1934.method590(arg0 + 28748);
                while (class95.field1934.field1773 < class204.field4006) {
                    class136.field2628 = class95.field1934.method598((byte) 107);
                    class194.method1303(382);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 87) {
                int var41 = class95.field1934.method594(255);
                int var42 = class95.field1934.method575(arg0 + 1440014817);
                int var43 = class95.field1934.method569(true);
                int var44 = class95.field1934.method561((byte) 88);
                class200 var45 = class158.method1078(var44, (byte) 112);
                if (var45.field3873 != var43 || var45.field3893 != var42 || var45.field3912 != var41) {
                    var45.field3893 = var42;
                    var45.field3873 = var43;
                    var45.field3912 = var41;
                    class115.method851(var45, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 59) {
                int var46 = class204.field4006 + class95.field1934.field1773;
                int var47 = class95.field1934.method569(true);
                int var48 = class95.field1934.method569(true);
                if (class4.field57 != var47) {
                    class4.field57 = var47;
                    class204.method1345((byte) 58, class4.field57);
                    class14.method92(2000000, class4.field57);
                    for (int var49 = 0; var49 < 100; var49++) {
                        class194.field3721[var49] = true;
                    }
                }
                while (var48-- > 0) {
                    int var50 = class95.field1934.method582(15);
                    int var51 = class95.field1934.method569(true);
                    int var52 = class95.field1934.method598((byte) 125);
                    class60 var53 = (class60) class113.field2236.method337((long) var50, (byte) -107);
                    if (var53 != null && var53.field1174 != var51) {
                        class157.method1071(true, (byte) 119, var53);
                        var53 = null;
                    }
                    if (var53 == null) {
                        var53 = class55.method357(var52, var50, true, var51);
                    }
                    var53.field1180 = true;
                }
                for (class60 var54 = (class60) class113.field2236.method338((byte) 104); var54 != null; var54 = (class60) class113.field2236.method335(1)) {
                    if (var54.field1180) {
                        var54.field1180 = false;
                    } else {
                        class157.method1071(true, (byte) 126, var54);
                    }
                }
                class194.field3715 = new class49(512);
                while (var46 > class95.field1934.field1773) {
                    int var55 = class95.field1934.method582(15);
                    int var56 = class95.field1934.method569(true);
                    int var57 = class95.field1934.method569(true);
                    int var58 = class95.field1934.method582(15);
                    for (int var59 = var56; var59 <= var57; var59++) {
                        long var60 = ((long) var55 << 32) + (long) var59;
                        class194.field3715.method339(var60, false, new class117(var58));
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 148) {
                int var62 = class95.field1934.method582(15);
                int var63 = class95.field1934.method569(true);
                if (var62 < -70000) {
                    var63 += 32768;
                }
                class200 var64;
                if (var62 < 0) {
                    var64 = null;
                } else {
                    var64 = class158.method1078(var62, (byte) 113);
                }
                if (var64 != null) {
                    for (int var65 = 0; var65 < var64.field3925.length; var65++) {
                        var64.field3925[var65] = 0;
                        var64.field3913[var65] = 0;
                    }
                }
                class146.method1024(true, var63);
                int var66 = class95.field1934.method569(true);
                for (int var67 = 0; var67 < var66; var67++) {
                    int var68 = class95.field1934.method573(24263);
                    if (var68 == 255) {
                        var68 = class95.field1934.method582(arg0 ^ 0xFFFFFFF0);
                    }
                    int var69 = class95.field1934.method553(255);
                    if (var64 != null && var67 < var64.field3925.length) {
                        var64.field3925[var67] = var69;
                        var64.field3913[var67] = var68;
                    }
                    class123.method886(var67, var68, var69 - 1, var63, arg0 + 5);
                }
                if (var64 != null) {
                    class115.method851(var64, -23101);
                }
                class9.method57(-127);
                class77.field1492[class170.method1140(31, class139.field2698++)] = class170.method1140(32767, var63);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 80) {
                int var70 = class95.field1934.method569(true);
                byte var71 = class95.field1934.method558(10786);
                class173.field3238[var70] = var71;
                if (class187.field3564[var70] != var71) {
                    class187.field3564[var70] = var71;
                    class186.method1264(99, var70);
                }
                class171.field3216[class170.method1140(31, class62.field1201++)] = var70;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 110) {
                int var72 = class95.field1934.method599((byte) -76);
                int var73 = class95.field1934.method580(true);
                class200 var74 = class158.method1078(var73, (byte) 121);
                if (var74.field3896 != var72 || var72 == -1) {
                    var74.field3822 = 0;
                    var74.field3896 = var72;
                    var74.field3939 = 0;
                    class115.method851(var74, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 173) {
                class173.method1161(127);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 127) {
                int var75 = class95.field1934.method569(true);
                if (var75 == 65535) {
                    var75 = -1;
                }
                class183.method1241(arg0 - 97, var75);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 181) {
                int var76 = class95.field1934.method569(true);
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = class95.field1934.method566(-1);
                class153.method1048(arg0 + 1, var77, var76);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 35) {
                int var78 = class95.field1934.method579((byte) -96);
                class109 var79 = class95.field1934.method562((byte) 87);
                class200 var80 = class158.method1078(var78, (byte) 113);
                if (!var79.method809(var80.field3950, arg0)) {
                    var80.field3950 = var79;
                    class115.method851(var80, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 152) {
                class109 var81 = class95.field1934.method562((byte) 87);
                Object[] var82 = new Object[var81.method786(-30593) + 1];
                for (int var83 = var81.method786(-30593) - 1; var83 >= 0; var83--) {
                    if (var81.method779(109, var83) == 115) {
                        var82[var83 + 1] = class95.field1934.method562((byte) 87);
                    } else {
                        var82[var83 + 1] = Integer.valueOf(class95.field1934.method582(15));
                    }
                }
                var82[0] = Integer.valueOf(class95.field1934.method582(15));
                class82 var84 = new class82();
                var84.field1613 = var82;
                class42.method305(arg0 + 24088, var84);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 22) {
                int var85 = class95.field1934.method593(111);
                int var86 = class95.field1934.method593(62);
                int var87 = class95.field1934.method593(arg0 ^ 0xFFFFFF94);
                class72.field1405 = var85 >> 1;
                class157.field2955.method1268(true, var87, (var85 & 0x1) == 1, var86);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 240) {
                int var88 = class95.field1934.method553(arg0 ^ 0xFFFFFF00);
                int var89 = class95.field1934.method579((byte) -126);
                int var90 = class95.field1934.method569(true);
                class200 var91 = class158.method1078(var89, (byte) 114);
                class136.field2628 = -1;
                var91.field3919 = (var88 << 16) + var90;
                return true;
            }
            if (class136.field2628 == 92 || class136.field2628 == 95 || class136.field2628 == 197 || class136.field2628 == 55 || class136.field2628 == 123 || class136.field2628 == 143 || class136.field2628 == 11 || class136.field2628 == 232 || class136.field2628 == 126 || class136.field2628 == 161 || class136.field2628 == 171) {
                class194.method1303(382);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 220) {
                class173.method1156(57);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 160) {
                class93.method674(true, (byte) -111);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 108) {
                int var92 = class95.field1934.method575(1440014816);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = class95.field1934.method580(true);
                class200 var94 = class158.method1078(var93, (byte) 126);
                if (var94.field3897 != 2 || var94.field3931 != var92) {
                    var94.field3931 = var92;
                    var94.field3897 = 2;
                    class115.method851(var94, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 166) {
                class30.field656 = class95.field1934.method573(24263);
                class163.field3052 = class95.field1934.method573(24263);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 136) {
                int var95 = class95.field1934.method561((byte) 101);
                int var96 = class95.field1934.method579((byte) 47);
                int var97 = class95.field1934.method594(255);
                class200 var98 = class158.method1078(var96, (byte) 113);
                if (var97 == 65535) {
                    var97 = -1;
                }
                if (var98.field3946) {
                    var98.field3816 = var95;
                    var98.field3824 = var97;
                    class83 var99 = class128.method926(var97, -4);
                    var98.field3907 = var99.field1671;
                    var98.field3893 = var99.field1684;
                    var98.field3856 = var99.field1673;
                    var98.field3877 = var99.field1654;
                    var98.field3912 = var99.field1662;
                    var98.field3873 = var99.field1636;
                    if (var98.field3881 > 0) {
                        var98.field3912 = var98.field3912 * 32 / var98.field3881;
                    }
                    class115.method851(var98, -23101);
                } else if (var97 == -1) {
                    class136.field2628 = -1;
                    var98.field3897 = 0;
                    return true;
                } else {
                    class83 var100 = class128.method926(var97, -4);
                    var98.field3931 = var97;
                    var98.field3873 = var100.field1636;
                    var98.field3893 = var100.field1684;
                    var98.field3912 = var100.field1662 * 100 / var95;
                    var98.field3897 = 4;
                    class115.method851(var98, arg0 - 23100);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 186) {
                int var101 = class95.field1934.method598((byte) 102);
                if (class95.field1934.method598((byte) 95) == 0) {
                    class18.field384[var101] = new class132();
                } else {
                    class95.field1934.field1773--;
                    class18.field384[var101] = new class132(class95.field1934);
                }
                class147.field2838 = class75.field1442;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 27) {
                class109 var102 = class95.field1934.method562((byte) 87);
                if (var102.method801(class172.field3227, arg0 + 1)) {
                    class109 var103 = var102.method794(var102.method799(class157.field2950, arg0 + 52), 0, arg0 ^ 0xFFFFFF94);
                    long var104 = var103.method784(false);
                    boolean var106 = false;
                    for (int var107 = 0; var107 < class19.field426; var107++) {
                        if (class82.field1607[var107] == var104) {
                            var106 = true;
                            break;
                        }
                    }
                    if (!var106 && class35.field784 == 0) {
                        class98.method690(var103, false, class53.field1082, 4);
                    }
                } else if (var102.method801(class170.field3195, 0)) {
                    class109 var108 = var102.method794(var102.method799(class157.field2950, arg0 + 107), 0, 95);
                    boolean var109 = false;
                    long var110 = var108.method784(false);
                    for (int var112 = 0; var112 < class19.field426; var112++) {
                        if (class82.field1607[var112] == var110) {
                            var109 = true;
                            break;
                        }
                    }
                    if (!var109 && class35.field784 == 0) {
                        class109 var113 = var102.method794(var102.method786(-30593) - 9, var102.method799(class157.field2950, 46) + 1, 124);
                        class98.method690(var108, false, var113, 8);
                    }
                } else if (var102.method801(class191.field3657, arg0 + 1)) {
                    class109 var114 = var102.method794(var102.method799(class157.field2950, 42), 0, 103);
                    boolean var115 = false;
                    long var116 = var114.method784(false);
                    for (int var118 = 0; var118 < class19.field426; var118++) {
                        if (class82.field1607[var118] == var116) {
                            var115 = true;
                            break;
                        }
                    }
                    if (!var115 && class35.field784 == 0) {
                        class98.method690(var114, false, class174.field3306, 10);
                    }
                } else if (var102.method801(class178.field3373, 0)) {
                    class109 var136 = var102.method794(var102.method799(class178.field3373, 94), 0, 55);
                    class98.method690(class174.field3306, false, var136, 11);
                } else if (var102.method801(class96.field1956, 0)) {
                    class109 var135 = var102.method794(var102.method799(class96.field1956, 52), 0, arg0 + 77);
                    if (class35.field784 == 0) {
                        class98.method690(class174.field3306, false, var135, 12);
                    }
                } else if (var102.method801(class125.field2422, ~arg0)) {
                    class109 var119 = var102.method794(var102.method799(class125.field2422, 79), 0, arg0 ^ 0xFFFFFFB4);
                    if (class35.field784 == 0) {
                        class98.method690(class174.field3306, false, var119, 13);
                    }
                } else if (var102.method801(class3.field16, 0)) {
                    class109 var120 = var102.method794(var102.method799(class157.field2950, 127), 0, 93);
                    long var121 = var120.method784(false);
                    boolean var123 = false;
                    for (int var124 = 0; var124 < class19.field426; var124++) {
                        if (class82.field1607[var124] == var121) {
                            var123 = true;
                            break;
                        }
                    }
                    if (!var123 && class35.field784 == 0) {
                        class98.method690(var120, false, class174.field3306, 14);
                    }
                } else if (var102.method801(class55.field1101, ~arg0)) {
                    boolean var125 = false;
                    class109 var126 = var102.method794(var102.method799(class157.field2950, arg0 ^ 0xFFFFFFDC), 0, 97);
                    long var127 = var126.method784(false);
                    for (int var129 = 0; var129 < class19.field426; var129++) {
                        if (class82.field1607[var129] == var127) {
                            var125 = true;
                            break;
                        }
                    }
                    if (!var125 && class35.field784 == 0) {
                        class98.method690(var126, false, class174.field3306, 15);
                    }
                } else if (var102.method801(class60.field1178, 0)) {
                    class109 var130 = var102.method794(var102.method799(class157.field2950, arg0 ^ 0xFFFFFFDA), 0, 73);
                    boolean var131 = false;
                    long var132 = var130.method784(false);
                    for (int var134 = 0; var134 < class19.field426; var134++) {
                        if (class82.field1607[var134] == var132) {
                            var131 = true;
                            break;
                        }
                    }
                    if (!var131 && class35.field784 == 0) {
                        class98.method690(var130, false, class174.field3306, 16);
                    }
                } else {
                    class98.method690(class174.field3306, false, var102, 0);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 174) {
                long var137 = class95.field1934.method572(-1495411552);
                class95.field1934.method584(arg0 + 4);
                boolean var139 = false;
                long var140 = class95.field1934.method572(-1495411552);
                long var142 = (long) class95.field1934.method569(true);
                long var144 = (long) class95.field1934.method578((byte) 59);
                int var146 = class95.field1934.method598((byte) 111);
                long var147 = (var142 << 32) + var144;
                for (int var149 = 0; var149 < 100; var149++) {
                    if (class183.field3441[var149] == var147) {
                        var139 = true;
                        break;
                    }
                }
                if (var146 <= 1) {
                    for (int var150 = 0; var150 < class19.field426; var150++) {
                        if (class82.field1607[var150] == var137) {
                            var139 = true;
                            break;
                        }
                    }
                }
                if (!var139 && class35.field784 == 0) {
                    class183.field3441[class102.field2024] = var147;
                    class102.field2024 = (class102.field2024 + 1) % 100;
                    class109 var151 = class17.method127(class57.method377(class95.field1934, (byte) 127).method808((byte) -68));
                    if (var146 == 2 || var146 == 3) {
                        class115.method848(class36.method279(new class109[] { class10.field167, class136.method981((byte) 118, var137).method810(true) }, 125), class136.method981((byte) -87, var140).method810(true), 9, var151, arg0 + 98);
                    } else if (var146 == 1) {
                        class115.method848(class36.method279(new class109[] { class69.field1347, class136.method981((byte) 114, var137).method810(true) }, arg0 ^ 0xFFFFFF84), class136.method981((byte) 126, var140).method810(true), 9, var151, arg0 ^ 0xFFFFFF8A);
                    } else {
                        class115.method848(class136.method981((byte) -52, var137).method810(true), class136.method981((byte) 116, var140).method810(true), 9, var151, 116);
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 228) {
                int var152 = class95.field1934.method599((byte) -75);
                int var153 = class95.field1934.method579((byte) -64);
                int var154 = class95.field1934.method559(-2);
                class200 var155 = class158.method1078(var153, (byte) 113);
                int var156 = var155.field3826 + var154;
                int var157 = var155.field3880 + var152;
                if (var155.field3825 != var156 || var155.field3936 != var157) {
                    var155.field3825 = var156;
                    var155.field3936 = var157;
                    class115.method851(var155, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 23) {
                class9.method57(71);
                class177.field3344 = class95.field1934.method598((byte) 83);
                class136.field2628 = -1;
                class98.field1977 = class75.field1442;
                return true;
            }
            if (class136.field2628 == 175) {
                class40.field845 = class95.field1934.method598((byte) 101);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 0) {
                int var158 = class95.field1934.method594(255);
                int var159 = class95.field1934.method580(true);
                int var160 = class95.field1934.method573(24263);
                class60 var161 = (class60) class113.field2236.method337((long) var159, (byte) -106);
                if (var161 != null) {
                    class157.method1071(var161.field1174 != var158, (byte) 126, var161);
                }
                class55.method357(var160, var159, true, var158);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 105) {
                for (int var162 = 0; var162 < class79.field1563; var162++) {
                    class74 var163 = class177.method1207(-87, var162);
                    if (var163 != null && var163.field1425 == 0) {
                        class173.field3238[var162] = 0;
                        class187.field3564[var162] = 0;
                    }
                }
                class9.method57(arg0 - 122);
                class62.field1201 += 32;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 74) {
                long var164 = class95.field1934.method572(-1495411552);
                int var166 = class95.field1934.method569(true);
                int var167 = class95.field1934.method598((byte) 126);
                class109 var168 = class136.method981((byte) 80, var164).method810(true);
                for (int var169 = 0; var169 < class199.field3786; var169++) {
                    if (class109.field2160[var169] == var164) {
                        if (class93.field1923[var169] != var166) {
                            class93.field1923[var169] = var166;
                            if (var166 > 0) {
                                class98.method690(class174.field3306, false, class36.method279(new class109[] { var168, class194.field3707 }, arg0 + 120), 5);
                            }
                            if (var166 == 0) {
                                class98.method690(class174.field3306, false, class36.method279(new class109[] { var168, class144.field2786 }, 125), 5);
                            }
                        }
                        class142.field2744[var169] = var167;
                        var168 = null;
                        break;
                    }
                }
                if (var168 != null && class199.field3786 < 200) {
                    class109.field2160[class199.field3786] = var164;
                    class114.field2265[class199.field3786] = var168;
                    class93.field1923[class199.field3786] = var166;
                    class142.field2744[class199.field3786] = var167;
                    class199.field3786++;
                }
                class107.field2127 = class75.field1442;
                boolean var170 = false;
                int var171 = class199.field3786;
                while (var171 > 0) {
                    boolean var172 = true;
                    var171--;
                    for (int var173 = 0; var173 < var171; var173++) {
                        if (class93.field1923[var173] != class73.field1413 && class93.field1923[var173 + 1] == class73.field1413 || class93.field1923[var173] == 0 && class93.field1923[var173 + 1] != 0) {
                            var172 = false;
                            int var174 = class93.field1923[var173];
                            class93.field1923[var173] = class93.field1923[var173 + 1];
                            class93.field1923[var173 + 1] = var174;
                            class109 var175 = class114.field2265[var173];
                            class114.field2265[var173] = class114.field2265[var173 + 1];
                            class114.field2265[var173 + 1] = var175;
                            long var176 = class109.field2160[var173];
                            class109.field2160[var173] = class109.field2160[var173 + 1];
                            class109.field2160[var173 + 1] = var176;
                            int var178 = class142.field2744[var173];
                            class142.field2744[var173] = class142.field2744[var173 + 1];
                            class142.field2744[var173 + 1] = var178;
                        }
                    }
                    if (var172) {
                        break;
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 3) {
                long var179 = class95.field1934.method572(-1495411552);
                long var181 = (long) class95.field1934.method569(true);
                boolean var183 = false;
                long var184 = (long) class95.field1934.method578((byte) 59);
                int var186 = class95.field1934.method598((byte) 85);
                long var187 = (var181 << 32) + var184;
                for (int var189 = 0; var189 < 100; var189++) {
                    if (class183.field3441[var189] == var187) {
                        var183 = true;
                        break;
                    }
                }
                if (var186 <= 1) {
                    for (int var190 = 0; var190 < class19.field426; var190++) {
                        if (class82.field1607[var190] == var179) {
                            var183 = true;
                            break;
                        }
                    }
                }
                if (!var183 && class35.field784 == 0) {
                    class183.field3441[class102.field2024] = var187;
                    class102.field2024 = (class102.field2024 + 1) % 100;
                    class109 var191 = class17.method127(class57.method377(class95.field1934, (byte) 65).method808((byte) -68));
                    if (var186 == 2 || var186 == 3) {
                        class98.method690(class36.method279(new class109[] { class10.field167, class136.method981((byte) -100, var179).method810(true) }, 121), false, var191, 7);
                    } else if (var186 == 1) {
                        class98.method690(class36.method279(new class109[] { class69.field1347, class136.method981((byte) -118, var179).method810(true) }, arg0 ^ 0x1B), false, var191, 7);
                    } else {
                        class98.method690(class136.method981((byte) 114, var179).method810(true), false, var191, 3);
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 233) {
                long var192 = class95.field1934.method572(-1495411552);
                int var194 = class95.field1934.method569(true);
                byte var195 = class95.field1934.method584(3);
                boolean var196 = false;
                if ((var192 & Long.MIN_VALUE) != 0L) {
                    var196 = true;
                }
                if (var196) {
                    if (class121.field2341 == 0) {
                        class136.field2628 = -1;
                        return true;
                    }
                    long var197 = var192 & Long.MAX_VALUE;
                    boolean var199 = false;
                    int var200;
                    for (var200 = 0; var200 < class121.field2341 && (class192.field3668[var200].field1381 != var197 || class192.field3668[var200].field1832 != var194); var200++) {
                    }
                    if (class121.field2341 > var200) {
                        while (var200 < class121.field2341 - 1) {
                            class192.field3668[var200] = class192.field3668[var200 + 1];
                            var200++;
                        }
                        class121.field2341--;
                        class192.field3668[class121.field2341] = null;
                    }
                } else {
                    class88 var201 = new class88();
                    var201.field1381 = var192;
                    var201.field1826 = class136.method981((byte) 126, var201.field1381);
                    var201.field1832 = var194;
                    var201.field1829 = var195;
                    int var202;
                    for (var202 = class121.field2341 - 1; var202 >= 0; var202--) {
                        int var203 = class192.field3668[var202].field1826.method773(var201.field1826, -10166);
                        if (var203 == 0) {
                            class192.field3668[var202].field1832 = var194;
                            class192.field3668[var202].field1829 = var195;
                            class162.field3030 = class75.field1442;
                            if (class203.field3998 == var192) {
                                class65.field1249 = var195;
                            }
                            class136.field2628 = -1;
                            return true;
                        }
                        if (var203 < 0) {
                            break;
                        }
                    }
                    if (class192.field3668.length <= class121.field2341) {
                        class136.field2628 = -1;
                        return true;
                    }
                    for (int var204 = class121.field2341 - 1; var204 > var202; var204--) {
                        class192.field3668[var204 + 1] = class192.field3668[var204];
                    }
                    if (class121.field2341 == 0) {
                        class192.field3668 = new class88[100];
                    }
                    class192.field3668[var202 + 1] = var201;
                    class121.field2341++;
                    if (class203.field3998 == var192) {
                        class65.field1249 = var195;
                    }
                }
                class136.field2628 = -1;
                class162.field3030 = class75.field1442;
                return true;
            }
            if (class136.field2628 == 244) {
                class160.field3002 = class95.field1934.method598((byte) 71);
                class136.field2628 = -1;
                class107.field2127 = class75.field1442;
                return true;
            }
            if (class136.field2628 == 113) {
                int var205 = class95.field1934.method594(255);
                class121.method875(255, var205);
                class77.field1492[class170.method1140(class139.field2698++, 31)] = class170.method1140(32767, var205);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 250) {
                int var206 = class95.field1934.method579((byte) 85);
                class200 var207 = class158.method1078(var206, (byte) 115);
                for (int var208 = 0; var208 < var207.field3925.length; var208++) {
                    var207.field3925[var208] = -1;
                    var207.field3925[var208] = 0;
                }
                class115.method851(var207, -23101);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 72) {
                int var209 = class95.field1934.method561((byte) 91);
                class55.field1107 = class49.field1009.method703(7249, var209);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 10) {
                int var210 = class95.field1934.method582(15);
                int var211 = class95.field1934.method594(255);
                class173.field3238[var211] = var210;
                if (class187.field3564[var211] != var210) {
                    class187.field3564[var211] = var210;
                    class186.method1264(66, var211);
                }
                class171.field3216[class170.method1140(31, class62.field1201++)] = var211;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 53) {
                class46.method320(71, class95.field1934);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 135) {
                int var212 = class95.field1934.method569(true);
                if (var212 == 65535) {
                    var212 = -1;
                }
                int var213 = class95.field1934.method598((byte) 112);
                int var214 = class95.field1934.method569(true);
                class8.method36(var213, var212, 0, var214);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 140) {
                for (int var215 = 0; var215 < class187.field3564.length; var215++) {
                    if (class187.field3564[var215] != class173.field3238[var215]) {
                        class187.field3564[var215] = class173.field3238[var215];
                        class186.method1264(-89, var215);
                        class171.field3216[class170.method1140(class62.field1201++, 31)] = var215;
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 52) {
                class30.field656 = class95.field1934.method573(24263);
                class163.field3052 = class95.field1934.method590(28747);
                for (int var216 = class30.field656; var216 < class30.field656 + 8; var216++) {
                    for (int var217 = class163.field3052; var217 < class163.field3052 + 8; var217++) {
                        if (class201.field3965[class72.field1405][var216][var217] != null) {
                            class201.field3965[class72.field1405][var216][var217] = null;
                            class171.method1151(var216, -28592, var217);
                        }
                    }
                }
                for (class81 var218 = (class81) class47.field976.method1230(arg0 ^ 0xFFFFFFE4); var218 != null; var218 = (class81) class47.field976.method1234(-1)) {
                    if (var218.field1595 >= class30.field656 && var218.field1595 < class30.field656 + 8 && class163.field3052 <= var218.field1590 && class163.field3052 + 8 > var218.field1590 && class72.field1405 == var218.field1591) {
                        var218.field1600 = 0;
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 149) {
                boolean var219 = class95.field1934.method573(24263) == 1;
                int var220 = class95.field1934.method579((byte) -82);
                class200 var221 = class158.method1078(var220, (byte) 118);
                if (var221.field3842 != var219) {
                    var221.field3842 = var219;
                    class115.method851(var221, -23101);
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 218) {
                int var222 = class95.field1934.method561((byte) 83);
                class200 var223 = class158.method1078(var222, (byte) 113);
                var223.field3897 = 3;
                var223.field3931 = class157.field2955.field3486.method113((byte) -127);
                class115.method851(var223, -23101);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 84) {
                int var224 = class95.field1934.method573(24263);
                int var225 = class95.field1934.method590(28747);
                class109 var226 = class95.field1934.method562((byte) 87);
                if (var225 >= 1 && var225 <= 8) {
                    if (var226.method778((byte) -121, class34.field760)) {
                        var226 = null;
                    }
                    class206.field4049[var225 - 1] = var226;
                    class7.field108[var225 - 1] = var224 == 0;
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 101) {
                class109.field2148 = true;
                class13.field194 = class95.field1934.method598((byte) 110);
                class131.field2532 = class95.field1934.method598((byte) 119);
                class85.field1741 = class95.field1934.method569(true);
                class187.field3614 = class95.field1934.method598((byte) 79);
                class31.field739 = class95.field1934.method598((byte) 81);
                if (class31.field739 >= 100) {
                    class114.field2267 = class131.field2532 * 128 + 64;
                    class39.field836 = class13.field194 * 128 + 64;
                    class125.field2419 = class19.method180(class114.field2267, false, class72.field1405, class39.field836) - class85.field1741;
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 89) {
                class9.method57(arg0 + 70);
                int var227 = class95.field1934.method580(true);
                int var228 = class95.field1934.method593(39);
                int var229 = class95.field1934.method590(28747);
                class194.field3717[var229] = var227;
                class18.field379[var229] = var228;
                class185.field3529[var229] = 1;
                for (int var230 = 0; var230 < 98; var230++) {
                    if (class171.field3200[var230] <= var227) {
                        class185.field3529[var229] = var230 + 2;
                    }
                }
                class91.field1883[class170.method1140(class106.field2100++, 31)] = var229;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 133) {
                class109.field2148 = true;
                class121.field2349 = class95.field1934.method598((byte) 75);
                class164.field3077 = class95.field1934.method598((byte) 83);
                class21.field476 = class95.field1934.method569(true);
                class182.field3435 = class95.field1934.method598((byte) 85);
                class156.field2942 = class95.field1934.method598((byte) 118);
                if (class156.field2942 >= 100) {
                    int var231 = class121.field2349 * 128 + 64;
                    int var232 = class164.field3077 * 128 + 64;
                    int var233 = class19.method180(var232, false, class72.field1405, var231) - class21.field476;
                    int var234 = var232 - class114.field2267;
                    int var235 = var233 - class125.field2419;
                    int var236 = var231 - class39.field836;
                    int var237 = (int) Math.sqrt((double) (var234 * var234 + var236 * var236));
                    class72.field1397 = (int) (Math.atan2((double) var235, (double) var237) * 325.949D) & 0x7FF;
                    class143.field2748 = (int) (-325.949D * Math.atan2((double) var236, (double) var234)) & 0x7FF;
                    if (class72.field1397 < 128) {
                        class72.field1397 = 128;
                    }
                    if (class72.field1397 > 383) {
                        class72.field1397 = 383;
                    }
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 24) {
                class136.field2628 = -1;
                class41.field860 = 0;
                return true;
            }
            if (class136.field2628 == 237) {
                class121.method871(-1);
                class136.field2628 = -1;
                return false;
            }
            if (class136.field2628 == 57) {
                int var238 = class95.field1934.method582(15);
                class60 var239 = (class60) class113.field2236.method337((long) var238, (byte) -83);
                if (var239 != null) {
                    class157.method1071(true, (byte) 113, var239);
                }
                if (class159.field2980 != null) {
                    class115.method851(class159.field2980, arg0 ^ 0x5A3C);
                    class159.field2980 = null;
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 5) {
                class9.method57(-5);
                class185.field3527 = class95.field1934.method577(true);
                class98.field1977 = class75.field1442;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 86) {
                int var240 = class95.field1934.method598((byte) 88);
                int var241 = class95.field1934.method598((byte) 110);
                int var242 = class95.field1934.method598((byte) 112);
                int var243 = class95.field1934.method598((byte) 112);
                int var244 = class95.field1934.method569(true);
                class140.field2713[var240] = true;
                class107.field2117[var240] = var241;
                client.field667[var240] = var242;
                class182.field3425[var240] = var243;
                class68.field1311[var240] = var244;
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 203) {
                class82.field1627 = class95.field1934.method598((byte) 89);
                class144.field2783 = class95.field1934.method598((byte) 127);
                class12.field181 = class95.field1934.method598((byte) 102);
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 165) {
                int var245 = class95.field1934.method582(15);
                int var246 = class95.field1934.method553(255);
                if (var246 == 65535) {
                    var246 = -1;
                }
                int var247 = class95.field1934.method594(255);
                int var248 = class95.field1934.method579((byte) 50);
                if (var247 == 65535) {
                    var247 = -1;
                }
                for (int var249 = var247; var249 <= var246; var249++) {
                    long var250 = ((long) var248 << 32) + (long) var249;
                    class71 var252 = class194.field3715.method337(var250, (byte) -113);
                    if (var252 != null) {
                        var252.method452(true);
                    }
                    class194.field3715.method339(var250, false, new class117(var245));
                }
                class136.field2628 = -1;
                return true;
            }
            if (class136.field2628 == 189) {
                class109.field2148 = false;
                for (int var253 = 0; var253 < 5; var253++) {
                    class140.field2713[var253] = false;
                }
                class136.field2628 = -1;
                return true;
            }
            class9.method43("T1 - " + class136.field2628 + "," + class194.field3719 + "," + class82.field1622 + " - " + class204.field4006, -105, null);
            class121.method871(-1);
        } catch (IOException var257) {
            class52.method344((byte) -125);
        } catch (Exception var258) {
            String var255 = "T2 - " + class136.field2628 + "," + class194.field3719 + "," + class82.field1622 + " - " + class204.field4006 + "," + (class157.field2955.field3547[0] + class53.field1079) + "," + (class42.field880 + class157.field2955.field3567[0]) + " - ";
            for (int var256 = 0; var256 < class204.field4006 && var256 < 50; var256++) {
                var255 = var255 + class95.field1934.field1808[var256] + ",";
            }
            class9.method43(var255, -78, var258);
            class121.method871(-1);
        }
        return true;
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(B)Lhb;")
    public final class71 method1229(byte arg0) {
        field3410++;
        class71 var2 = this.field3417.field1385;
        if (this.field3417 == var2) {
            return null;
        } else {
            var2.method452(true);
            return arg0 < 46 ? null : var2;
        }
    }

    @OriginalMember(owner = "tf", name = "c", descriptor = "(I)Lhb;")
    public final class71 method1230(int arg0) {
        field3415++;
        if (arg0 < 23) {
            this.field3417 = null;
        }
        class71 var2 = this.field3417.field1385;
        if (this.field3417 == var2) {
            this.field3423 = null;
            return null;
        } else {
            this.field3423 = var2.field1385;
            return var2;
        }
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(Lhb;I)V")
    public final void method1231(class71 arg0, int arg1) {
        if (arg1 != 0) {
            this.field3417 = null;
        }
        field3414++;
        if (arg0.field1382 != null) {
            arg0.method452(true);
        }
        arg0.field1385 = this.field3417;
        arg0.field1382 = this.field3417.field1382;
        arg0.field1382.field1385 = arg0;
        arg0.field1385.field1382 = arg0;
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(Z)V")
    public static void method1232(boolean arg0) {
        field3421 = null;
        field3405 = null;
        field3409 = null;
        if (!arg0) {
            method1238(null, 67, null, null, (byte) 101, true, 37);
        }
    }

    @OriginalMember(owner = "tf", name = "b", descriptor = "(B)Lhb;")
    public final class71 method1233(byte arg0) {
        field3419++;
        class71 var2 = this.field3423;
        if (arg0 != -101) {
            return null;
        } else if (this.field3417 == var2) {
            this.field3423 = null;
            return null;
        } else {
            this.field3423 = var2.field1382;
            return var2;
        }
    }

    @OriginalMember(owner = "tf", name = "d", descriptor = "(I)Lhb;")
    public final class71 method1234(int arg0) {
        if (arg0 != -1) {
            field3421 = null;
        }
        field3416++;
        class71 var2 = this.field3423;
        if (this.field3417 == var2) {
            this.field3423 = null;
            return null;
        } else {
            this.field3423 = var2.field1385;
            return var2;
        }
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(Lvg;II)I")
    public static final int method1235(class200 arg0, int arg1, int arg2) {
        field3412++;
        if (arg0.field3833 == null || arg0.field3833.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3833[arg2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class18.field379[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class185.field3529[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class194.field3717[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class200 var12 = class158.method1078(var11, (byte) 117);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class128.method926(var13, -4).field1642 || class68.field1326)) {
                        for (int var14 = 0; var14 < var12.field3925.length; var14++) {
                            if (var13 + 1 == var12.field3925[var14]) {
                                var8 += var12.field3913[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class187.field3564[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class171.field3200[class185.field3529[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class187.field3564[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class157.field2955.field3475;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class200.field3957[var15]) {
                            var8 += class185.field3529[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class200 var18 = class158.method1078(var17, (byte) 117);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class128.method926(var19, -4).field1642 || class68.field1326)) {
                        for (int var20 = 0; var20 < var18.field3925.length; var20++) {
                            if (var19 + 1 == var18.field3925[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class177.field3344;
                }
                if (var7 == 12) {
                    var8 = class185.field3527;
                }
                if (var7 == 13) {
                    int var21 = class187.field3564[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class115.method849((byte) 119, var23);
                }
                if (var7 == 18) {
                    var8 = (class157.field2955.field3549 >> 7) + class53.field1079;
                }
                if (var7 == 19) {
                    var8 = (class157.field2955.field3609 >> 7) + class42.field880;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            if (arg1 != 10) {
                field3421 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(ILhb;Lhb;)V")
    public final void method1236(int arg0, class71 arg1, class71 arg2) {
        if (arg2.field1382 != null) {
            arg2.method452(true);
        }
        field3411++;
        arg2.field1385 = arg1;
        arg2.field1382 = arg1.field1382;
        arg2.field1382.field1385 = arg2;
        arg2.field1385.field1382 = arg2;
        if (arg0 != 0) {
            field3421 = null;
        }
    }

    @OriginalMember(owner = "tf", name = "e", descriptor = "(I)V")
    public final void method1237(int arg0) {
        if (arg0 != -15004) {
            this.method1231(null, 12);
        }
        field3424++;
        while (true) {
            class71 var2 = this.field3417.field1385;
            if (this.field3417 == var2) {
                return;
            }
            var2.method452(true);
        }
    }

    @OriginalMember(owner = "tf", name = "a", descriptor = "(Llf;ILbg;Llf;BZI)V")
    public static final void method1238(class109 arg0, int arg1, class18 arg2, class109 arg3, byte arg4, boolean arg5, int arg6) {
        field3422++;
        int var7 = arg2.method151((byte) 106, arg0);
        int var8 = 85 % ((arg4 - 22) / 50);
        int var9 = arg2.method154((byte) -95, arg3, var7);
        class138.method991(-24390, arg1, var7, var9, arg2, arg5, arg6);
    }

    @OriginalMember(owner = "tf", name = "<init>", descriptor = "()V")
    public class181() {
        this.field3417.field1382 = this.field3417;
        this.field3417.field1385 = this.field3417;
    }
}
