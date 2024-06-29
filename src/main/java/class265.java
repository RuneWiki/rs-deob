import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class265 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lll;")
    public static class54 field3845 = new class54();

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Leo;")
    public static class71 field3848;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public static final void method1821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class232 var7 = new class232();
        var7.field3322 = arg1 / 128;
        var7.field3313 = arg2 / 128;
        var7.field3331 = arg3 / 128;
        var7.field3325 = arg4 / 128;
        var7.field3321 = arg0;
        var7.field3317 = arg1;
        var7.field3332 = arg2;
        var7.field3315 = arg3;
        var7.field3335 = arg4;
        var7.field3327 = arg5;
        var7.field3337 = arg6;
        class260.field3773[class353.field5505++] = var7;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)I", line = 32)
    public static final int method1822(int arg0, int arg1, int arg2) {
        field3846++;
        class223 var3 = (class223) class240.field3489.method2279((long) arg2, 16);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= arg0 && var3.field3217.length > arg1) {
            return var3.field3217[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 50)
    public static void method1823(int arg0) {
        field3848 = null;
        field3845 = null;
        if (arg0 >= -22) {
            method1823(-120);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z", line = 63)
    public static final boolean method1824(int arg0) throws IOException {
        field3847++;
        if (field3848 == null) {
            return false;
        }
        int var1 = field3848.method524((byte) -47);
        if (var1 == 0) {
            return false;
        }
        if (class154.field2147 == -1) {
            field3848.method522(0, class240.field3490.field4350, 1, (byte) 60);
            class240.field3490.field4351 = 0;
            var1--;
            class154.field2147 = class240.field3490.method1305(false);
            class315.field4648 = class171.field2365[class154.field2147];
        }
        if (class315.field4648 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            field3848.method522(0, class240.field3490.field4350, 1, (byte) 114);
            class315.field4648 = class240.field3490.field4350[0] & 0xFF;
        }
        if (class315.field4648 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            field3848.method522(0, class240.field3490.field4350, 2, (byte) 66);
            class240.field3490.field4351 = 0;
            class315.field4648 = class240.field3490.method2083((byte) -28);
        }
        if (class315.field4648 > var1) {
            return false;
        }
        class240.field3490.field4351 = 0;
        field3848.method522(arg0, class240.field3490.field4350, class315.field4648, (byte) 21);
        class314.field4618 = class287.field4124;
        class287.field4124 = class9.field99;
        class276.field3953 = 0;
        class9.field99 = class154.field2147;
        if (class154.field2147 == 163) {
            for (int var396 = 0; var396 < class208.field2956.length; var396++) {
                if (class360.field5638[var396] != class208.field2956[var396]) {
                    class208.field2956[var396] = class360.field5638[var396];
                    class137.method1032((byte) -61, var396);
                    class276.field3961[class335.method2339(31, class78.field1004++)] = var396;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 34) {
            int var2 = class240.field3490.method2062(-25795);
            int var3 = class240.field3490.method2083((byte) -128);
            class333 var4;
            if (var2 >= 0) {
                var4 = class89.method644(123, var2);
            } else {
                var4 = null;
            }
            if (var2 < -70000) {
                var3 += 32768;
            }
            while (class240.field3490.field4351 < class315.field4648) {
                int var5 = 0;
                int var6 = class240.field3490.method2046((byte) 98);
                int var7 = class240.field3490.method2083((byte) -111);
                if (var7 != 0) {
                    var5 = class240.field3490.method2096((byte) -122);
                    if (var5 == 255) {
                        var5 = class240.field3490.method2062(arg0 ^ 0xFFFF9B3D);
                    }
                }
                if (var4 != null && var6 >= 0 && var4.field5088.length > var6) {
                    var4.field5088[var6] = var7;
                    var4.field5093[var6] = var5;
                }
                class307.method2146(arg0 + 14378, var3, var6, var7 - 1, var5);
            }
            if (var4 != null) {
                class142.method1097(arg0 - 125, var4);
            }
            class82.method611((byte) -91);
            class190.field2631[class335.method2339(31, class293.field4267++)] = class335.method2339(32767, var3);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 53) {
            class294.field4277 = class240.field3490.method2072(arg0 - 34);
            class245.field3565 = class240.field3490.method2090(arg0 ^ 0xFFFFFF80);
            while (class315.field4648 > class240.field3490.field4351) {
                class154.field2147 = class240.field3490.method2096((byte) -122);
                class80.method569((byte) 127);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 192) {
            class344.method2389(true);
            class154.field2147 = -1;
            return false;
        } else if (class154.field2147 == 176) {
            int var8 = class240.field3490.method2083((byte) -66);
            int var9 = class240.field3490.method2055(-66);
            byte var10 = class240.field3490.method2082(-103);
            if (class322.method2228((byte) -14, var8)) {
                class336.method2347(var9, var10, 60);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 4) {
            class183.field2493 = class240.field3490.method2096((byte) -122);
            class180.field2464 = class64.field801;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 35) {
            int var11 = class240.field3490.method2056(arg0 - 42);
            int var12 = class240.field3490.method2055(-66);
            int var13 = class240.field3490.method2087(true);
            int var14 = class240.field3490.method2102((byte) -110);
            if (class322.method2228((byte) -14, var12)) {
                class74 var15 = (class74) class272.field3900.method2279((long) var13, 116);
                if (var15 != null) {
                    class97.method700(var15.field982 != var14, var15, arg0 ^ 0x7E);
                }
                class101.method719(var14, var11, (byte) 117, var13);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 59) {
            String var16 = class240.field3490.method2060(-12482);
            if (var16.endsWith(":tradereq:")) {
                String var53 = var16.substring(0, var16.indexOf(":"));
                boolean var54 = false;
                long var55 = class201.method1476(-123, var53);
                for (int var57 = 0; var57 < class116.field1511; var57++) {
                    if (class234.field3356[var57] == var55) {
                        var54 = true;
                        break;
                    }
                }
                if (!var54 && class93.field1204 == 0) {
                    class88.method641(var53, 4, false, class180.field2469);
                }
            } else if (var16.endsWith(":chalreq:")) {
                String var47 = var16.substring(0, var16.indexOf(":"));
                boolean var48 = false;
                long var49 = class201.method1476(arg0 - 126, var47);
                for (int var51 = 0; var51 < class116.field1511; var51++) {
                    if (class234.field3356[var51] == var49) {
                        var48 = true;
                        break;
                    }
                }
                if (!var48 && class93.field1204 == 0) {
                    String var52 = var16.substring(var16.indexOf(":") + 1, var16.length() + -9);
                    class88.method641(var47, 8, false, var52);
                }
            } else if (var16.endsWith(":assistreq:")) {
                String var17 = var16.substring(0, var16.indexOf(":"));
                long var18 = class201.method1476(-127, var17);
                boolean var20 = false;
                for (int var21 = 0; var21 < class116.field1511; var21++) {
                    if (class234.field3356[var21] == var18) {
                        var20 = true;
                        break;
                    }
                }
                if (!var20 && class93.field1204 == 0) {
                    class88.method641(var17, 10, false, "");
                }
            } else if (var16.endsWith(":clan:")) {
                String var46 = var16.substring(0, var16.indexOf(":clan:"));
                class88.method641("", 11, false, var46);
            } else if (var16.endsWith(":trade:")) {
                String var45 = var16.substring(0, var16.indexOf(":trade:"));
                if (class93.field1204 == 0) {
                    class88.method641("", 12, false, var45);
                }
            } else if (var16.endsWith(":assist:")) {
                String var22 = var16.substring(0, var16.indexOf(":assist:"));
                if (class93.field1204 == 0) {
                    class88.method641("", 13, false, var22);
                }
            } else if (var16.endsWith(":duelstake:")) {
                String var40 = var16.substring(0, var16.indexOf(":"));
                long var41 = class201.method1476(arg0 - 123, var40);
                boolean var43 = false;
                for (int var44 = 0; var44 < class116.field1511; var44++) {
                    if (class234.field3356[var44] == var41) {
                        var43 = true;
                        break;
                    }
                }
                if (!var43 && class93.field1204 == 0) {
                    class88.method641(var40, 14, false, "");
                }
            } else if (var16.endsWith(":duelfriend:")) {
                String var35 = var16.substring(0, var16.indexOf(":"));
                boolean var36 = false;
                long var37 = class201.method1476(-120, var35);
                for (int var39 = 0; var39 < class116.field1511; var39++) {
                    if (class234.field3356[var39] == var37) {
                        var36 = true;
                        break;
                    }
                }
                if (!var36 && class93.field1204 == 0) {
                    class88.method641(var35, 15, false, "");
                }
            } else if (var16.endsWith(":clanreq:")) {
                String var30 = var16.substring(0, var16.indexOf(":"));
                long var31 = class201.method1476(-118, var30);
                boolean var33 = false;
                for (int var34 = 0; var34 < class116.field1511; var34++) {
                    if (class234.field3356[var34] == var31) {
                        var33 = true;
                        break;
                    }
                }
                if (!var33 && class93.field1204 == 0) {
                    class88.method641(var30, 16, false, "");
                }
            } else if (var16.endsWith(":allyreq:")) {
                String var23 = var16.substring(0, var16.indexOf(":"));
                long var24 = class201.method1476(arg0 ^ 0xFFFFFF88, var23);
                boolean var26 = false;
                for (int var27 = 0; var27 < class116.field1511; var27++) {
                    if (class234.field3356[var27] == var24) {
                        var26 = true;
                        break;
                    }
                }
                if (!var26 && class93.field1204 == 0) {
                    String var28 = var16.substring(var16.indexOf(":") + 1, var16.length() - 9);
                    class88.method641(var23, 21, false, var28);
                }
            } else if (var16.endsWith(":spam:")) {
                String var29 = var16.substring(0, var16.length() - 6);
                if (class93.field1204 == 0) {
                    class88.method641("", 22, false, var29);
                }
            } else {
                class88.method641("", 0, false, var16);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 162) {
            int var386 = class240.field3490.method2062(-25795);
            int var387 = class240.field3490.method2062(arg0 ^ 0xFFFF9B3D);
            int var388 = class240.field3490.method2083((byte) -105);
            int var389 = class240.field3490.method2055(-66);
            if (var388 == 65535) {
                var388 = -1;
            }
            if (var389 == 65535) {
                var389 = -1;
            }
            int var390 = class240.field3490.method2055(-66);
            if (class322.method2228((byte) -14, var390)) {
                for (int var391 = var389; var391 <= var388; var391++) {
                    long var392 = ((long) var387 << 32) + ((long) var391);
                    class142 var394 = (class142) class227.field3259.method2279(var392, 89);
                    class142 var395;
                    if (var394 != null) {
                        var395 = new class142(var386, var394.field1973);
                        var394.method179((byte) 51);
                    } else if (var391 == -1) {
                        var395 = new class142(var386, class89.method644(-104, var387).field5040.field1973);
                    } else {
                        var395 = new class142(var386, -1);
                    }
                    class227.field3259.method2275(var395, arg0 + 94, var392);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 1) {
            int var383 = class240.field3490.method2102((byte) 99);
            String var384 = class240.field3490.method2060(arg0 - 12482);
            int var385 = class240.field3490.method2050(121);
            if (class322.method2228((byte) -14, var383)) {
                class212.method1551(arg0 ^ 0x7E, var385, var384);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 11) {
            int var380 = class240.field3490.method2102((byte) 52);
            int var381 = class240.field3490.method2054(775571361);
            int var382 = class240.field3490.method2097((byte) 120);
            if (class322.method2228((byte) -14, var380)) {
                class251.method1761(var382, true, var381);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 148) {
            int var58 = class240.field3490.method2083((byte) -100);
            int var59 = class240.field3490.method2087(true);
            int var60 = class240.field3490.method2083((byte) -22);
            if (class322.method2228((byte) -14, var60)) {
                class336.method2347(var58, var59, 82);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 95) {
            class82.method611((byte) 38);
            class182.field2487 = class240.field3490.method2043(true);
            class323.field4739 = class64.field801;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 164) {
            class82.method611((byte) 40);
            int var376 = class240.field3490.method2096((byte) -122);
            int var377 = class240.field3490.method2050(101);
            int var378 = class240.field3490.method2096((byte) -122);
            class300.field4412[var378] = var377;
            class260.field3775[var378] = var376;
            class280.field3992[var378] = 1;
            for (int var379 = 0; var379 < 98; var379++) {
                if (var377 >= class165.field2318[var379]) {
                    class280.field3992[var378] = var379 + 2;
                }
            }
            class330.field4835[class335.method2339(31, class115.field1489++)] = var378;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 8) {
            class82.method611((byte) 76);
            class211.field2989 = class240.field3490.method2096((byte) -122);
            class323.field4739 = class64.field801;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 86) {
            class222.method1614(class240.field3490.method2060(-12482), arg0 + 12);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 87) {
            int var373 = class240.field3490.method2055(-66);
            int var374 = class240.field3490.method2083((byte) -38);
            if (var374 == 65535) {
                var374 = -1;
            }
            int var375 = class240.field3490.method2087(true);
            if (class322.method2228((byte) -14, var373)) {
                class115.method842(1, -1, var375, var374, (byte) 66);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 49) {
            class156.method1196(false, arg0 ^ 0xFFFFFFCD);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 138) {
            int var61 = class240.field3490.method2055(-66);
            int var62 = class240.field3490.method2054(775571361);
            class23.method151(1006, var62, var61);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 96) {
            if (class233.field3340 != -1) {
                class142.method1104(class233.field3340, 0, (byte) 104);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 97) {
            class294.field4277 = class240.field3490.method2072(-83);
            class245.field3565 = class240.field3490.method2090(-128);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 25) {
            class181.method1326(113);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 126) {
            String var369 = class240.field3490.method2060(-12482);
            int var370 = class240.field3490.method2056(59);
            int var371 = class240.field3490.method2102((byte) 21);
            int var372 = class240.field3490.method2072(-103);
            if (var371 == 65535) {
                var371 = -1;
            }
            if (var372 >= 1 && var372 <= 8) {
                if (var369.equalsIgnoreCase("null")) {
                    var369 = null;
                }
                class299.field4335[var372 - 1] = var369;
                class88.field1116[var372 - 1] = var371;
                class135.field1847[var372 - 1] = var370 == 0;
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 55) {
            class160.field2292 = class240.field3490.method2096((byte) -122);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 31) {
            int var63 = class240.field3490.method2062(arg0 ^ 0xFFFF9B3D);
            int var64 = class240.field3490.method2083((byte) -75);
            int var65 = class240.field3490.method2097((byte) 120);
            int var66 = class240.field3490.method2083((byte) -29);
            int var67 = class240.field3490.method2083((byte) -69);
            if (var66 == 65535) {
                var66 = -1;
            }
            if (var67 == 65535) {
                var67 = -1;
            }
            if (class322.method2228((byte) -14, var65)) {
                for (int var68 = var67; var68 <= var66; var68++) {
                    long var69 = ((long) var63 << 32) + (long) var68;
                    class142 var71 = (class142) class227.field3259.method2279(var69, -120);
                    class142 var72;
                    if (var71 != null) {
                        var72 = new class142(var71.field1981, var64);
                        var71.method179((byte) 51);
                    } else if (var68 == -1) {
                        var72 = new class142(class89.method644(61, var63).field5040.field1981, var64);
                    } else {
                        var72 = new class142(0, var64);
                    }
                    class227.field3259.method2275(var72, 91, var69);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 174) {
            long var355 = class240.field3490.method2089((byte) 114);
            int var357 = class240.field3490.method2083((byte) -117);
            boolean var358 = false;
            if ((Long.MIN_VALUE & var355) != 0L) {
                var358 = true;
            }
            byte var359 = class240.field3490.method2104(113);
            if (var358) {
                if (class255.field3740 == 0) {
                    class154.field2147 = -1;
                    return true;
                }
                boolean var365 = false;
                long var366 = var355 & Long.MAX_VALUE;
                int var368;
                for (var368 = 0; class255.field3740 > var368 && (class242.field3504[var368].field304 != var366 || class242.field3504[var368].field4028 != var357); var368++) {
                }
                if (var368 < class255.field3740) {
                    while (var368 < (class255.field3740 - 1)) {
                        class242.field3504[var368] = class242.field3504[var368 + 1];
                        var368++;
                    }
                    class255.field3740--;
                    class242.field3504[class255.field3740] = null;
                }
            } else {
                String var360 = class240.field3490.method2060(-12482);
                class283 var361 = new class283();
                var361.field304 = var355;
                var361.field4038 = class92.method667(arg0, var361.field304);
                var361.field4032 = var359;
                var361.field4028 = var357;
                var361.field4037 = var360;
                int var362;
                for (var362 = class255.field3740 - 1; var362 >= 0; var362--) {
                    int var363 = class242.field3504[var362].field4038.compareTo(var361.field4038);
                    if (var363 == 0) {
                        class242.field3504[var362].field4028 = var357;
                        class242.field3504[var362].field4032 = var359;
                        class242.field3504[var362].field4037 = var360;
                        class214.field3015 = class64.field801;
                        if (class336.field5242 == var355) {
                            class307.field4495 = var359;
                        }
                        class154.field2147 = -1;
                        return true;
                    }
                    if (var363 < 0) {
                        break;
                    }
                }
                if (class255.field3740 >= class242.field3504.length) {
                    class154.field2147 = -1;
                    return true;
                }
                for (int var364 = class255.field3740 - 1; var364 > var362; var364--) {
                    class242.field3504[var364 + 1] = class242.field3504[var364];
                }
                if (class255.field3740 == 0) {
                    class242.field3504 = new class283[100];
                }
                class242.field3504[var362 + 1] = var361;
                if (class336.field5242 == var355) {
                    class307.field4495 = var359;
                }
                class255.field3740++;
            }
            class214.field3015 = class64.field801;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 104) {
            long var73 = class240.field3490.method2089((byte) 114);
            String var75 = class281.method1905(class275.method1866(false, class1.method3(32767, class240.field3490)));
            class88.method641(class193.method1398(false, var73), 6, false, var75);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 253) {
            int var76 = class240.field3490.method2083((byte) -97);
            String var77 = class240.field3490.method2060(-12482);
            Object[] var78 = new Object[var77.length() + 1];
            for (int var79 = var77.length() - 1; var79 >= 0; var79--) {
                if (var77.charAt(var79) == 's') {
                    var78[var79 + 1] = class240.field3490.method2060(-12482);
                } else {
                    var78[var79 + 1] = Integer.valueOf(class240.field3490.method2062(class300.method2107(arg0, -25795)));
                }
            }
            var78[0] = Integer.valueOf(class240.field3490.method2062(-25795));
            if (class322.method2228((byte) -14, var76)) {
                class135 var80 = new class135();
                var80.field1836 = var78;
                class276.method1869(true, var80);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 63) {
            int var344 = class240.field3490.method2102((byte) 51);
            int var345 = class240.field3490.method2072(-108);
            if (var344 == 65535) {
                var344 = -1;
            }
            int var346 = var345 >> 2;
            int var347 = class8.field90[var346];
            int var348 = var345 & 0x3;
            int var349 = class240.field3490.method2062(-25795);
            int var350 = (var349 & 0x3BD1748B) >> 28;
            int var351 = (var349 & 0xFFFE0E8) >> 14;
            int var352 = var349 & 0x3FFF;
            int var353 = var352 - class355.field5556;
            int var354 = var351 - class331.field4867;
            class45.method322(var344, var354, (byte) -105, var350, var353, var347, var348, var346);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 30) {
            if (class117.field1519 != null) {
                class158.method1216(false, -101, class118.field1543, -1, -1);
            }
            byte[] var81 = new byte[class315.field4648];
            class240.field3490.method1306(1, var81, class315.field4648, 0);
            String var82 = class181.method1328(0, var81, false, class315.field4648);
            if (class288.field4173 == null && class69.field871 == 3 || !class69.field882.startsWith("win") || class179.field2455) {
                class232.method1654(arg0 ^ 0x72, var82, true);
            } else {
                class126.field1686 = var82;
                class55.field711 = true;
                class289.field4188 = class157.field2216.method504(var82, (byte) -88);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 147) {
            class245.field3565 = class240.field3490.method2096((byte) -122);
            class294.field4277 = class240.field3490.method2090(-128);
            for (int var341 = class245.field3565; var341 < class245.field3565 + 8; var341++) {
                for (int var342 = class294.field4277; var342 < (class294.field4277 + 8); var342++) {
                    if (class20.field221[class56.field724][var341][var342] != null) {
                        class20.field221[class56.field724][var341][var342] = null;
                        class273.method1855(var341, var342, -14327);
                    }
                }
            }
            for (class146 var343 = (class146) class263.field3822.method413(1253231568); var343 != null; var343 = (class146) class263.field3822.method419(arg0 ^ 0x15)) {
                if (class245.field3565 <= var343.field2045 && var343.field2045 < class245.field3565 + 8 && class294.field4277 <= var343.field2039 && class294.field4277 + 8 > var343.field2039 && class56.field724 == var343.field2036) {
                    var343.field2034 = 0;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 10) {
            int var83 = class240.field3490.method2050(arg0 ^ 0x4B);
            int var84 = class240.field3490.method2097((byte) 120);
            class254.method1770(var84, (byte) -68, var83);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 100) {
            int var85 = class240.field3490.method2083((byte) -109);
            if (var85 == 65535) {
                var85 = -1;
            }
            int var86 = class240.field3490.method2090(-128);
            class183.method1335((byte) 82, var86, var85);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 206) {
            int var87 = class240.field3490.method2096((byte) -122);
            int var88 = class240.field3490.method2055(arg0 - 66);
            if (var88 == 65535) {
                var88 = -1;
            }
            int var89 = class240.field3490.method2057((byte) -128);
            class351.method2445(-1, var87, var89, var88);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 54) {
            if (class315.field4648 == 0) {
                class169.field2346 = class90.field1135;
            } else {
                class169.field2346 = class240.field3490.method2060(arg0 - 12482);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 33) {
            int var338 = class240.field3490.method2096((byte) -122);
            int var339 = class240.field3490.method2096((byte) -122);
            byte var340 = class240.field3490.method2104(arg0 ^ 0x7D);
            if (client.field1632 != var340) {
                class154.field2147 = -1;
                return true;
            }
            class154.field2147 = -1;
            if (var338 == 255) {
                class133.field1818 = false;
                class116.field1499 = 0;
                class5.field53 = 0;
            } else {
                class133.field1818 = true;
                class5.field53 = var339;
                class116.field1499 = var338;
            }
            return true;
        } else if (class154.field2147 == 183) {
            int var331 = class240.field3490.method2062(-25795);
            int var332 = class240.field3490.method2055(arg0 ^ 0xFFFFFFBE);
            if (var332 == 65535) {
                var332 = -1;
            }
            int var333 = class240.field3490.method2097((byte) 120);
            int var334 = class240.field3490.method2062(-25795);
            if (class322.method2228((byte) -14, var333)) {
                class333 var335 = class89.method644(69, var331);
                if (var335.field5154) {
                    class30.method192(var334, var331, arg0 - 128, var332);
                    class362 var336 = class172.method1265(var332, (byte) 95);
                    class314.method2175(var336.field5708, var336.field5660, var336.field5691, var331, (byte) 92);
                    class225.method1629((byte) -48, var336.field5712, var336.field5667, var336.field5670, var331);
                } else if (var332 == -1) {
                    var335.field5144 = 0;
                    class154.field2147 = -1;
                    return true;
                } else {
                    class362 var337 = class172.method1265(var332, (byte) 116);
                    var335.field5210 = var337.field5708;
                    var335.field5144 = 4;
                    var335.field5070 = var332;
                    var335.field5160 = var337.field5691;
                    var335.field5116 = var337.field5660 * 100 / var334;
                    class142.method1097(17, var335);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 65) {
            int var327 = class240.field3490.method2054(775571361);
            int var328 = class240.field3490.method2055(arg0 - 66);
            int var329 = class240.field3490.method2093(arg0 ^ 0xFFFFFF91);
            int var330 = class240.field3490.method2052(true);
            if (class322.method2228((byte) -14, var328)) {
                class91.method660((byte) -96, var327, var329, var330);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 152) {
            int var323 = class240.field3490.method2055(arg0 ^ 0xFFFFFFBE);
            int var324 = class240.field3490.method2055(-66);
            int var325 = class240.field3490.method2097((byte) 120);
            int var326 = class240.field3490.method2087(true);
            if (class322.method2228((byte) -14, var323)) {
                class14.method103((var324 << 16) + var325, var326, (byte) -56);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 44) {
            boolean var90 = false;
            long var91 = class240.field3490.method2089((byte) 114);
            long var93 = (long) class240.field3490.method2083((byte) -76);
            long var95 = (long) class240.field3490.method2085((byte) 119);
            long var97 = (var93 << 32) + var95;
            int var99 = class240.field3490.method2096((byte) -122);
            int var100 = 0;
            label1394: while (true) {
                if (var100 >= 100) {
                    if (var99 <= 1) {
                        if ((!class78.field1006 || class94.field1231) && !class226.field3249) {
                            for (int var101 = 0; var101 < class116.field1511; var101++) {
                                if (class234.field3356[var101] == var91) {
                                    var90 = true;
                                    break label1394;
                                }
                            }
                        } else {
                            var90 = true;
                        }
                    }
                    break;
                }
                if (class297.field4311[var100] == var97) {
                    var90 = true;
                    break;
                }
                var100++;
            }
            if (!var90 && class93.field1204 == 0) {
                class297.field4311[class161.field2306] = var97;
                class161.field2306 = (class161.field2306 + 1) % 100;
                String var102 = class281.method1905(class275.method1866(false, class1.method3(arg0 + 32767, class240.field3490)));
                if (var99 == 2 || var99 == 3) {
                    class88.method641("<img=1>" + class193.method1398(false, var91), 7, false, var102);
                } else if (var99 == 1) {
                    class88.method641("<img=0>" + class193.method1398(false, var91), 7, false, var102);
                } else {
                    class88.method641(class193.method1398(false, var91), 3, false, var102);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 89) {
            int var103 = class240.field3490.method2102((byte) 46);
            int var104 = class240.field3490.method2062(-25795);
            int var105 = class240.field3490.method2087(true);
            if (class322.method2228((byte) -14, var103)) {
                class74 var106 = (class74) class272.field3900.method2279((long) var104, -124);
                class74 var107 = (class74) class272.field3900.method2279((long) var105, -128);
                if (var107 != null) {
                    class97.method700(var106 == null || var106.field982 != var107.field982, var107, 124);
                }
                if (var106 != null) {
                    var106.method179((byte) 51);
                    class272.field3900.method2275(var106, 96, (long) var105);
                }
                class333 var108 = class89.method644(49, var104);
                if (var108 != null) {
                    class142.method1097(38, var108);
                }
                class333 var109 = class89.method644(43, var105);
                if (var109 != null) {
                    class142.method1097(22, var109);
                    class45.method323(true, false, var109);
                }
                if (class233.field3340 != -1) {
                    class142.method1104(class233.field3340, 1, (byte) 104);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 246) {
            long var308 = class240.field3490.method2089((byte) 114);
            class240.field3490.method2104(112);
            long var310 = class240.field3490.method2089((byte) 114);
            long var312 = (long) class240.field3490.method2083((byte) -90);
            long var314 = (long) class240.field3490.method2085((byte) 92);
            long var316 = (var312 << 32) + var314;
            int var318 = class240.field3490.method2096((byte) -122);
            boolean var319 = false;
            int var320 = 0;
            label1645: while (true) {
                if (var320 < 100) {
                    if (class297.field4311[var320] != var316) {
                        var320++;
                        continue;
                    }
                    var319 = true;
                    break;
                }
                if (var318 <= 1) {
                    if ((!class78.field1006 || class94.field1231) && !class226.field3249) {
                        for (int var321 = 0; var321 < class116.field1511; var321++) {
                            if (class234.field3356[var321] == var308) {
                                var319 = true;
                                break label1645;
                            }
                        }
                    } else {
                        var319 = true;
                    }
                }
                break;
            }
            if (!var319 && class93.field1204 == 0) {
                class297.field4311[class161.field2306] = var316;
                class161.field2306 = (class161.field2306 + 1) % 100;
                String var322 = class281.method1905(class275.method1866(false, class1.method3(32767, class240.field3490)));
                if (var318 == 2 || var318 == 3) {
                    class119.method868(9, "<img=1>" + class193.method1398(false, var308), class193.method1398(false, var310), var322, -1);
                } else if (var318 == 1) {
                    class119.method868(9, "<img=0>" + class193.method1398(false, var308), class193.method1398(false, var310), var322, ~arg0);
                } else {
                    class119.method868(9, class193.method1398(false, var308), class193.method1398(false, var310), var322, arg0 - 1);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 90) {
            int var303 = class240.field3490.method2055(-66);
            int var304 = class240.field3490.method2097((byte) 120);
            int var305 = class240.field3490.method2097((byte) 120);
            int var306 = class240.field3490.method2102((byte) -109);
            int var307 = class240.field3490.method2087(true);
            if (class322.method2228((byte) -14, var305)) {
                class314.method2175(var304, var303, var306, var307, (byte) 92);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 130) {
            int var110 = class240.field3490.method2090(-128);
            int var111 = class240.field3490.method2056(71);
            int var112 = class240.field3490.method2096((byte) -122);
            class56.field724 = var112 >> 1;
            class359.field5616.method1700(var110, (var112 & 0x1) == 1, (byte) -42, var111);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 172) {
            int var113 = class240.field3490.method2087(true);
            int var114 = class240.field3490.method2043(true);
            int var115 = class240.field3490.method2055(arg0 ^ 0xFFFFFFBE);
            if (class322.method2228((byte) -14, var115)) {
                class121.method874(arg0 + 5, var113, var114);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 103) {
            int var302 = class240.field3490.method2062(arg0 ^ 0xFFFF9B3D);
            class345.field5355 = class157.field2216.method499((byte) -73, var302);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 242) {
            int var300 = class240.field3490.method2096((byte) -122);
            int var301 = class240.field3490.method2102((byte) 19);
            if (class322.method2228((byte) -14, var301)) {
                class48.field643 = var300;
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 2) {
            class214.field3015 = class64.field801;
            long var288 = class240.field3490.method2089((byte) 114);
            if (var288 == 0L) {
                class42.field530 = null;
                class255.field3740 = 0;
                class274.field3930 = null;
                class154.field2147 = -1;
                class242.field3504 = null;
                return true;
            }
            long var290 = class240.field3490.method2089((byte) 114);
            class42.field530 = class92.method667(0, var290);
            class274.field3930 = class92.method667(0, var288);
            class288.field4176 = class240.field3490.method2104(125);
            int var292 = class240.field3490.method2096((byte) -122);
            if (var292 == 255) {
                class154.field2147 = -1;
                return true;
            }
            class255.field3740 = var292;
            class283[] var293 = new class283[100];
            for (int var294 = 0; var294 < class255.field3740; var294++) {
                var293[var294] = new class283();
                var293[var294].field304 = class240.field3490.method2089((byte) 114);
                var293[var294].field4038 = class92.method667(arg0, var293[var294].field304);
                var293[var294].field4028 = class240.field3490.method2083((byte) -80);
                var293[var294].field4032 = class240.field3490.method2104(114);
                var293[var294].field4037 = class240.field3490.method2060(-12482);
                if (class336.field5242 == var293[var294].field304) {
                    class307.field4495 = var293[var294].field4032;
                }
            }
            boolean var295 = false;
            int var296 = class255.field3740;
            while (var296 > 0) {
                var296--;
                boolean var297 = true;
                for (int var298 = 0; var298 < var296; var298++) {
                    if (var293[var298].field4038.compareTo(var293[var298 + 1].field4038) > 0) {
                        class283 var299 = var293[var298];
                        var293[var298] = var293[var298 + 1];
                        var293[var298 + 1] = var299;
                        var297 = false;
                    }
                }
                if (var297) {
                    break;
                }
            }
            class154.field2147 = -1;
            class242.field3504 = var293;
            return true;
        } else if (class154.field2147 == 173) {
            class199.method1461(class157.field2216, class315.field4648, (byte) -120, class240.field3490);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 115 || class154.field2147 == 111 || class154.field2147 == 17 || class154.field2147 == 144 || class154.field2147 == 114 || class154.field2147 == 133 || class154.field2147 == 47 || class154.field2147 == 158 || class154.field2147 == 105 || class154.field2147 == 120 || class154.field2147 == 60 || class154.field2147 == 179 || class154.field2147 == 232 || class154.field2147 == 131) {
            class80.method569((byte) 93);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 113) {
            int var116 = class240.field3490.method2083((byte) -30);
            int var117 = class240.field3490.method2054(arg0 + 775571361);
            int var118 = class240.field3490.method2055(arg0 ^ 0xFFFFFFBE);
            int var119 = class240.field3490.method2055(-66);
            int var120 = class240.field3490.method2055(-66);
            if (class322.method2228((byte) -14, var119)) {
                class115.method842(7, var116, var117, var118 << 16 | var120, (byte) 66);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 182) {
            long var121 = class240.field3490.method2089((byte) 114);
            int var123 = class240.field3490.method2083((byte) -128);
            int var124 = class240.field3490.method2096((byte) -122);
            boolean var125 = true;
            if (var121 < 0L) {
                var125 = false;
                var121 &= Long.MAX_VALUE;
            }
            String var126 = "";
            if (var123 > 0) {
                var126 = class240.field3490.method2060(-12482);
            }
            String var127 = class193.method1398(false, var121);
            for (int var128 = 0; var128 < class45.field559; var128++) {
                if (class158.field2251[var128] == var121) {
                    if (class237.field3431[var128] != var123) {
                        class237.field3431[var128] = var123;
                        if (var123 > 0) {
                            class88.method641("", 5, false, var127 + class115.field1488);
                        }
                        if (var123 == 0) {
                            class88.method641("", 5, false, var127 + class72.field957);
                        }
                    }
                    class340.field5317[var128] = var126;
                    class167.field2333[var128] = var124;
                    class130.field1772[var128] = var125;
                    var127 = null;
                    break;
                }
            }
            if (var127 != null && class45.field559 < 200) {
                class158.field2251[class45.field559] = var121;
                class65.field814[class45.field559] = var127;
                class237.field3431[class45.field559] = var123;
                class340.field5317[class45.field559] = var126;
                class167.field2333[class45.field559] = var124;
                class130.field1772[class45.field559] = var125;
                class45.field559++;
            }
            boolean var129 = false;
            class180.field2464 = class64.field801;
            int var130 = class45.field559;
            while (var130 > 0) {
                boolean var131 = true;
                var130--;
                for (int var132 = 0; var132 < var130; var132++) {
                    if (class237.field3431[var132] != class84.field1085 && class237.field3431[var132 + 1] == class84.field1085 || class237.field3431[var132] == 0 && class237.field3431[var132 + 1] != 0) {
                        var131 = false;
                        int var133 = class237.field3431[var132];
                        class237.field3431[var132] = class237.field3431[var132 + 1];
                        class237.field3431[var132 + 1] = var133;
                        String var134 = class340.field5317[var132];
                        class340.field5317[var132] = class340.field5317[var132 + 1];
                        class340.field5317[var132 + 1] = var134;
                        String var135 = class65.field814[var132];
                        class65.field814[var132] = class65.field814[var132 + 1];
                        class65.field814[var132 + 1] = var135;
                        long var136 = class158.field2251[var132];
                        class158.field2251[var132] = class158.field2251[var132 + 1];
                        class158.field2251[var132 + 1] = var136;
                        int var138 = class167.field2333[var132];
                        class167.field2333[var132] = class167.field2333[var132 + 1];
                        class167.field2333[var132 + 1] = var138;
                        boolean var139 = class130.field1772[var132];
                        class130.field1772[var132] = class130.field1772[var132 + 1];
                        class130.field1772[var132 + 1] = var139;
                    }
                }
                if (var131) {
                    break;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 225) {
            int var284 = class240.field3490.method2083((byte) -52);
            int var285 = class240.field3490.method2055(-66);
            int var286 = class240.field3490.method2072(-30);
            if (class322.method2228((byte) -14, var285)) {
                if (var286 == 2) {
                    class221.method1608(-62);
                }
                class233.field3340 = var284;
                class59.method442(-5, var284);
                class313.method2169((byte) 83, false);
                class71.method525(true, class233.field3340);
                for (int var287 = 0; var287 < 100; var287++) {
                    class229.field3276[var287] = true;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 156) {
            int var283 = class240.field3490.method2083((byte) -82);
            if (class322.method2228((byte) -14, var283)) {
                class289.method1986(true);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 229) {
            for (int var281 = 0; var281 < class311.field4574.length; var281++) {
                if (class311.field4574[var281] != null) {
                    class311.field4574[var281].field4899 = -1;
                }
            }
            for (int var282 = 0; var282 < class251.field3688.length; var282++) {
                if (class251.field3688[var282] != null) {
                    class251.field3688[var282].field4899 = -1;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 78) {
            class293.method2005((byte) -5);
            class82.method611((byte) 46);
            class154.field2147 = -1;
            class78.field1004 += 32;
            return true;
        } else if (class154.field2147 == 177) {
            int var140 = class240.field3490.method2096((byte) -122);
            int var141 = var140 >> 5;
            int var142 = var140 & 0x1F;
            if (var142 == 0) {
                class102.field1326[var141] = null;
                class154.field2147 = -1;
                return true;
            }
            class234 var143 = new class234();
            var143.field3359 = var142;
            var143.field3355 = class240.field3490.method2096((byte) -122);
            if (var143.field3355 >= 0 && var143.field3355 < class291.field4233.length) {
                if (var143.field3359 == 1 || var143.field3359 == 10) {
                    var143.field3358 = class240.field3490.method2083((byte) -108);
                    class240.field3490.field4351 += 5;
                } else if (var143.field3359 >= 2 && var143.field3359 <= 6) {
                    if (var143.field3359 == 2) {
                        var143.field3362 = 64;
                        var143.field3366 = 64;
                    }
                    if (var143.field3359 == 3) {
                        var143.field3366 = 64;
                        var143.field3362 = 0;
                    }
                    if (var143.field3359 == 4) {
                        var143.field3362 = 128;
                        var143.field3366 = 64;
                    }
                    if (var143.field3359 == 5) {
                        var143.field3362 = 64;
                        var143.field3366 = 0;
                    }
                    if (var143.field3359 == 6) {
                        var143.field3366 = 128;
                        var143.field3362 = 64;
                    }
                    var143.field3359 = 2;
                    var143.field3354 = class240.field3490.method2083((byte) -66);
                    var143.field3363 = class240.field3490.method2083((byte) -76);
                    var143.field3365 = class240.field3490.method2096((byte) -122);
                    var143.field3360 = class240.field3490.method2083((byte) -17);
                }
                var143.field3361 = class240.field3490.method2083((byte) -100);
                if (var143.field3361 == 65535) {
                    var143.field3361 = -1;
                }
                class102.field1326[var141] = var143;
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 136) {
            class66.method479(-114);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 155) {
            class156.method1196(true, -51);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 75) {
            int var278 = class240.field3490.method2055(arg0 - 66);
            String var279 = class240.field3490.method2060(-12482);
            int var280 = class240.field3490.method2055(-66);
            if (class322.method2228((byte) -14, var278)) {
                class191.method1385(var279, var280, (byte) 108);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 137) {
            int var144 = class240.field3490.method2102((byte) 15);
            int var145 = class240.field3490.method2096((byte) -122);
            class23.method151(1006, var145, var144);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 72) {
            class275.field3943 = class240.field3490.method2102((byte) 64) * 30;
            class323.field4739 = class64.field801;
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 26) {
            int var275 = class240.field3490.method2050(36);
            class333 var276 = class89.method644(arg0 ^ 0xFFFFFF9B, var275);
            for (int var277 = 0; var277 < var276.field5088.length; var277++) {
                var276.field5088[var277] = -1;
                var276.field5088[var277] = 0;
            }
            class142.method1097(124, var276);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 99) {
            long var146 = class240.field3490.method2089((byte) 114);
            class240.field3490.method2104(124);
            long var148 = class240.field3490.method2089((byte) 114);
            long var150 = (long) class240.field3490.method2083((byte) -78);
            long var152 = (long) class240.field3490.method2085((byte) 81);
            long var154 = (var150 << 32) + var152;
            int var156 = class240.field3490.method2096((byte) -122);
            int var157 = class240.field3490.method2083((byte) -25);
            boolean var158 = false;
            int var159 = 0;
            label1472: while (true) {
                if (var159 < 100) {
                    if (class297.field4311[var159] != var154) {
                        var159++;
                        continue;
                    }
                    var158 = true;
                    break;
                }
                if (var156 <= 1) {
                    for (int var160 = 0; var160 < class116.field1511; var160++) {
                        if (class234.field3356[var160] == var146) {
                            var158 = true;
                            break label1472;
                        }
                    }
                }
                break;
            }
            if (!var158 && class93.field1204 == 0) {
                class297.field4311[class161.field2306] = var154;
                class161.field2306 = (class161.field2306 + 1) % 100;
                String var161 = class28.method183(var157, true).method860(-124, class240.field3490);
                if (var156 == 2 || var156 == 3) {
                    class65.method474("<img=1>" + class193.method1398(false, var146), var157, class193.method1398(false, var148), 20, var161, 0);
                } else if (var156 == 1) {
                    class65.method474("<img=0>" + class193.method1398(false, var146), var157, class193.method1398(false, var148), 20, var161, 0);
                } else {
                    class65.method474(class193.method1398(false, var146), var157, class193.method1398(false, var148), 20, var161, arg0 ^ 0x0);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 237) {
            int var162 = class240.field3490.method2102((byte) -125);
            int var163 = class240.field3490.method2097((byte) 120);
            int var164 = class240.field3490.method2102((byte) 115);
            int var165 = class240.field3490.method2050(arg0 + 109);
            if ((var165 >> 30) != 0) {
                int var166 = var165 >> 28 & 0x3;
                int var167 = (var165 >> 14 & 0x3FFF) - class331.field4867;
                int var168 = (var165 & 0x3FFF) - class355.field5556;
                if (var167 >= 0 && var168 >= 0 && var167 < 104 && var168 < 104) {
                    int var169 = var168 * 128 + 64;
                    int var170 = var167 * 128 + 64;
                    class347 var171 = new class347(var162, var166, var170, var169, class271.method1847(var169, true, var170, var166) - var164, var163, class313.field4603);
                    class95.field1233.method415((byte) -116, new class226(var171));
                }
            } else if (var165 >> 29 != 0) {
                int var184 = var165 & 0xFFFF;
                class169 var185 = class251.field3688[var184];
                if (var185 != null) {
                    if (var162 == 65535) {
                        var162 = -1;
                    }
                    boolean var186 = true;
                    if (var162 != -1 && var185.field4839 != -1) {
                        if (var185.field4839 == var162) {
                            class15 var187 = class234.method1664(-128, var162);
                            if (var187.field181 && var187.field169 != -1) {
                                class314 var188 = class207.method1516(var187.field169, arg0 ^ 0x7A);
                                int var189 = var188.field4626;
                                if (var189 == 1) {
                                    var186 = false;
                                    var185.field4868 = class313.field4603 + var163;
                                    var185.field4921 = 0;
                                    var185.field4857 = 1;
                                    var185.field4848 = 0;
                                    var185.field4874 = 0;
                                    class296.method2025(var188, var185.field4893, var185.field4855, var185.field4921, false, false);
                                } else if (var189 == 2) {
                                    var185.field4891 = 0;
                                    var186 = false;
                                }
                            }
                        } else {
                            class15 var190 = class234.method1664(arg0 - 128, var162);
                            class15 var191 = class234.method1664(-128, var185.field4839);
                            if (var190.field169 != -1 && var191.field169 != -1) {
                                class314 var192 = class207.method1516(var190.field169, arg0 ^ 0x7E);
                                class314 var193 = class207.method1516(var191.field169, 118);
                                if (var192.field4638 < var193.field4638) {
                                    var186 = false;
                                }
                            }
                        }
                    }
                    if (var186) {
                        var185.field4839 = var162;
                        var185.field4921 = 0;
                        var185.field4857 = 1;
                        var185.field4851 = var164;
                        var185.field4848 = 0;
                        var185.field4868 = class313.field4603 + var163;
                        if (var185.field4868 > class313.field4603) {
                            var185.field4921 = -1;
                        }
                        if (var185.field4839 != -1 && class313.field4603 == var185.field4868) {
                            int var194 = class234.method1664(-128, var185.field4839).field169;
                            if (var194 != -1) {
                                class314 var195 = class207.method1516(var194, 120);
                                if (var195 != null && var195.field4631 != null) {
                                    class296.method2025(var195, var185.field4893, var185.field4855, 0, false, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var165 >> 28) != 0) {
                int var172 = var165 & 0xFFFF;
                class239 var173;
                if (class103.field1333 == var172) {
                    var173 = class359.field5616;
                } else {
                    var173 = class311.field4574[var172];
                }
                if (var173 != null) {
                    if (var162 == 65535) {
                        var162 = -1;
                    }
                    boolean var174 = true;
                    if (var162 != -1 && var173.field4839 != -1) {
                        if (var173.field4839 == var162) {
                            class15 var179 = class234.method1664(-128, var162);
                            if (var179.field181 && var179.field169 != -1) {
                                class314 var180 = class207.method1516(var179.field169, 119);
                                int var181 = var180.field4626;
                                if (var181 == 1) {
                                    var173.field4921 = 0;
                                    var173.field4848 = 0;
                                    var173.field4857 = 1;
                                    var174 = false;
                                    var173.field4868 = class313.field4603 + var163;
                                    var173.field4874 = 0;
                                    class296.method2025(var180, var173.field4893, var173.field4855, var173.field4921, false, false);
                                } else if (var181 == 2) {
                                    var173.field4891 = 0;
                                    var174 = false;
                                }
                            }
                        } else {
                            class15 var175 = class234.method1664(arg0 ^ 0xFFFFFF80, var162);
                            class15 var176 = class234.method1664(-128, var173.field4839);
                            if (var175.field169 != -1 && var176.field169 != -1) {
                                class314 var177 = class207.method1516(var175.field169, 127);
                                class314 var178 = class207.method1516(var176.field169, 120);
                                if (var177.field4638 < var178.field4638) {
                                    var174 = false;
                                }
                            }
                        }
                    }
                    if (var174) {
                        var173.field4848 = 0;
                        var173.field4857 = 1;
                        var173.field4868 = class313.field4603 + var163;
                        var173.field4851 = var164;
                        var173.field4921 = 0;
                        var173.field4839 = var162;
                        if (var173.field4868 > class313.field4603) {
                            var173.field4921 = -1;
                        }
                        if (var173.field4839 == 65535) {
                            var173.field4839 = -1;
                        }
                        if (var173.field4839 != -1 && class313.field4603 == var173.field4868) {
                            int var182 = class234.method1664(-128, var173.field4839).field169;
                            if (var182 != -1) {
                                class314 var183 = class207.method1516(var182, 121);
                                if (var183 != null && var183.field4631 != null) {
                                    class296.method2025(var183, var173.field4893, var173.field4855, 0, class359.field5616 == var173, false);
                                }
                            }
                        }
                    }
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 151) {
            int var269 = class240.field3490.method2083((byte) -111);
            int var270 = class240.field3490.method2096((byte) -122);
            int var271 = class240.field3490.method2096((byte) -122);
            int var272 = class240.field3490.method2083((byte) -128);
            int var273 = class240.field3490.method2096((byte) -122);
            int var274 = class240.field3490.method2096((byte) -122);
            if (class322.method2228((byte) -14, var269)) {
                class317.method2189(var273, var270, var274, var272, true, 0, var271);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 116) {
            int var196 = class240.field3490.method2097((byte) 120);
            int var197 = class240.field3490.method2097((byte) 120);
            String var198 = class240.field3490.method2060(-12482);
            if (class322.method2228((byte) -14, var197)) {
                class191.method1385(var198, var196, (byte) 108);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 222) {
            long var199 = class240.field3490.method2089((byte) 114);
            long var201 = (long) class240.field3490.method2083((byte) -104);
            long var203 = (long) class240.field3490.method2085((byte) 84);
            int var205 = class240.field3490.method2096((byte) -122);
            int var206 = class240.field3490.method2083((byte) -40);
            boolean var207 = false;
            long var208 = (var201 << 32) + var203;
            int var210 = 0;
            label1488: while (true) {
                if (var210 < 100) {
                    if (class297.field4311[var210] != var208) {
                        var210++;
                        continue;
                    }
                    var207 = true;
                    break;
                }
                if (var205 <= 1) {
                    for (int var211 = 0; var211 < class116.field1511; var211++) {
                        if (class234.field3356[var211] == var199) {
                            var207 = true;
                            break label1488;
                        }
                    }
                }
                break;
            }
            if (!var207 && class93.field1204 == 0) {
                class297.field4311[class161.field2306] = var208;
                class161.field2306 = (class161.field2306 + 1) % 100;
                String var212 = class28.method183(var206, true).method860(-89, class240.field3490);
                if (var205 == 2) {
                    class65.method474("<img=1>" + class193.method1398(false, var199), var206, (String) null, 18, var212, 0);
                } else if (var205 == 1) {
                    class65.method474("<img=0>" + class193.method1398(false, var199), var206, (String) null, 18, var212, 0);
                } else {
                    class65.method474(class193.method1398(false, var199), var206, (String) null, 18, var212, arg0);
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 46) {
            int var213 = class240.field3490.method2083((byte) -27);
            int var214 = class240.field3490.method2096((byte) -122);
            int var215 = class240.field3490.method2096((byte) -122);
            int var216 = class240.field3490.method2096((byte) -122);
            int var217 = class240.field3490.method2096((byte) -122);
            int var218 = class240.field3490.method2083((byte) -90);
            if (class322.method2228((byte) -14, var213)) {
                class214.field3024[var214] = true;
                class225.field3235[var214] = var215;
                class355.field5562[var214] = var216;
                class345.field5365[var214] = var217;
                class345.field5368[var214] = var218;
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 153) {
            int var265 = class240.field3490.method2083((byte) -40);
            if (var265 == 65535) {
                var265 = -1;
            }
            int var266 = class240.field3490.method2096((byte) -122);
            int var267 = class240.field3490.method2083((byte) -42);
            int var268 = class240.field3490.method2096((byte) -122);
            class49.method389((byte) -100, var267, var265, var266, var268);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 135) {
            int var262 = class240.field3490.method2083((byte) -92);
            int var263 = class240.field3490.method2062(-25795);
            if (class322.method2228((byte) -14, var262)) {
                class74 var264 = (class74) class272.field3900.method2279((long) var263, arg0 - 25);
                if (var264 != null) {
                    class97.method700(true, var264, arg0 ^ 0x7A);
                }
                if (class215.field3038 != null) {
                    class142.method1097(-118, class215.field3038);
                    class215.field3038 = null;
                }
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 40) {
            int var259 = class240.field3490.method2087(true);
            int var260 = class240.field3490.method2102((byte) -107);
            int var261 = class240.field3490.method2096((byte) -122);
            if (class322.method2228((byte) -14, var260)) {
                class354.method2459(var259, var261, true);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 23) {
            class322.field4731 = class240.field3490.method2096((byte) -122);
            class270.field3879 = class240.field3490.method2096((byte) -122);
            class312.field4589 = class240.field3490.method2096((byte) -122);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 168) {
            int var258 = class240.field3490.method2083((byte) -124);
            class217.method1577(255, var258);
            class190.field2631[class335.method2339(31, class293.field4267++)] = class335.method2339(32767, var258);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 52) {
            int var257 = class240.field3490.method2083((byte) -62);
            if (class322.method2228((byte) -14, var257)) {
                class15.method108((byte) 107);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 38) {
            byte var255 = class240.field3490.method2104(120);
            int var256 = class240.field3490.method2102((byte) 82);
            class254.method1770(var256, (byte) -68, var255);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 194) {
            int var219 = class240.field3490.method2062(-25795);
            int var220 = class240.field3490.method2083((byte) -57);
            if (var219 < -70000) {
                var220 += 32768;
            }
            class333 var221;
            if (var219 < 0) {
                var221 = null;
            } else {
                var221 = class89.method644(arg0 - 104, var219);
            }
            if (var221 != null) {
                for (int var222 = 0; var222 < var221.field5088.length; var222++) {
                    var221.field5088[var222] = 0;
                    var221.field5093[var222] = 0;
                }
            }
            class277.method1875(114, var220);
            int var223 = class240.field3490.method2083((byte) -28);
            for (int var224 = 0; var224 < var223; var224++) {
                int var225 = class240.field3490.method2083((byte) -53);
                int var226 = class240.field3490.method2056(127);
                if (var226 == 255) {
                    var226 = class240.field3490.method2062(-25795);
                }
                if (var221 != null && var224 < var221.field5088.length) {
                    var221.field5088[var224] = var225;
                    var221.field5093[var224] = var226;
                }
                class307.method2146(14378, var220, var224, var225 - 1, var226);
            }
            if (var221 != null) {
                class142.method1097(68, var221);
            }
            class82.method611((byte) -116);
            class190.field2631[class335.method2339(31, class293.field4267++)] = class335.method2339(var220, 32767);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 150) {
            int var251 = class240.field3490.method2083((byte) -112);
            int var252 = class240.field3490.method2097((byte) 120);
            int var253 = class240.field3490.method2056(-71);
            class169 var254 = class251.field3688[var252];
            if (var254 != null) {
                class154.method1191(var251, var254, (byte) -118, var253);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 93) {
            int var245 = class240.field3490.method2083((byte) -102);
            int var246 = class240.field3490.method2096((byte) -122);
            int var247 = class240.field3490.method2096((byte) -122);
            int var248 = class240.field3490.method2083((byte) -99);
            int var249 = class240.field3490.method2096((byte) -122);
            int var250 = class240.field3490.method2096((byte) -122);
            if (class322.method2228((byte) -14, var245)) {
                class237.method1690(26379, var248, var249, var246, var247, var250);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 166) {
            class240.field3490.field4351 += 28;
            if (class240.field3490.method2068(3)) {
                class132.method1010(arg0 - 29026, class240.field3490.field4351 + -28, class240.field3490);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 42) {
            int var242 = class240.field3490.method2055(arg0 - 66);
            int var243 = class240.field3490.method2097((byte) 120);
            int var244 = class240.field3490.method2055(-66);
            if (class322.method2228((byte) -14, var242)) {
                class96.method695(var244, (byte) 125, var243);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 18) {
            int var239 = class240.field3490.method2102((byte) -108);
            if (var239 == 65535) {
                var239 = -1;
            }
            int var240 = class240.field3490.method2083((byte) -22);
            int var241 = class240.field3490.method2062(-25795);
            if (class322.method2228((byte) -14, var240)) {
                class115.method842(2, -1, var241, var239, (byte) 66);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 43) {
            class116.field1511 = class315.field4648 / 8;
            for (int var227 = 0; var227 < class116.field1511; var227++) {
                class234.field3356[var227] = class240.field3490.method2089((byte) 114);
                class109.field1422[var227] = class222.method1619(class300.method2107(arg0, 93), class234.field3356[var227]);
                class226.field3255[var227] = false;
            }
            class154.field2147 = -1;
            class180.field2464 = class64.field801;
            return true;
        } else if (class154.field2147 == 221) {
            long var235 = class240.field3490.method2089((byte) 114);
            int var237 = class240.field3490.method2083((byte) -62);
            String var238 = class28.method183(var237, true).method860(-120, class240.field3490);
            class65.method474(class193.method1398(false, var235), var237, (String) null, 19, var238, 0);
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 199) {
            int var232 = class240.field3490.method2050(48);
            int var233 = class240.field3490.method2083((byte) -23);
            if (class322.method2228((byte) -14, var233)) {
                int var234 = 0;
                if (class359.field5616.field3480 != null) {
                    var234 = class359.field5616.field3480.method930((byte) 99);
                }
                class115.method842(3, -1, var232, var234, (byte) 66);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 243) {
            int var229 = class240.field3490.method2083((byte) -120);
            int var230 = class240.field3490.method2050(arg0 ^ 0x4F);
            int var231 = class240.field3490.method2055(-66);
            if (class322.method2228((byte) -14, var231)) {
                class91.method656(var230, var229, 6703);
            }
            class154.field2147 = -1;
            return true;
        } else if (class154.field2147 == 19) {
            int var228 = class240.field3490.method2096((byte) -122);
            if (class240.field3490.method2096((byte) -122) == 0) {
                class132.field1799[var228] = new class64();
            } else {
                class240.field3490.field4351--;
                class132.field1799[var228] = new class64(class240.field3490);
            }
            class154.field2147 = -1;
            class156.field2158 = class64.field801;
            return true;
        } else {
            class347.method2409((Throwable) null, 3924, "T1 - " + class154.field2147 + "," + class287.field4124 + "," + class314.field4618 + " - " + class315.field4648);
            class344.method2389(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I")
    public abstract int method198(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)J")
    public abstract long method195(int arg0);
}
