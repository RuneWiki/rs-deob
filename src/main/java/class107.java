import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class107 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[[I")
    private static int[][] field1442 = new int[5][5000];

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lgp;")
    private static class269[] field1444 = new class269[50];

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    private static int[] field1440 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field1449 = new String[1000];

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[I")
    private static int[] field1445 = new int[5];

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    private static int field1451 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1437 = Calendar.getInstance();

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[Ljava/lang/String;")
    private static String[] field1458 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[I")
    private static int[] field1459 = new int[3];

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lbt;")
    public static class363 field1461 = new class363(4);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lbb;")
    private static class141 field1441;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lkg;")
    private static class223 field1439;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lkg;")
    private static class223 field1453;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "[I")
    private static int[] field1456;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field1438;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lhg;I)V", line = 5)
    private static final void method761(class299 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field4349;
        int[] var6 = arg0.field4356;
        byte var7 = -1;
        field1451 = 0;
        try {
            int var8 = 0;
            label4494: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var625 = var5[var4];
                if (var625 < 100) {
                    if (var625 == 0) {
                        field1440[var2++] = var6[var4];
                        continue;
                    }
                    if (var625 == 1) {
                        int var9 = var6[var4];
                        field1440[var2++] = class31.field426[var9];
                        continue;
                    }
                    if (var625 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class337.method2182(var10, 466, field1440[var2]);
                        continue;
                    }
                    if (var625 == 3) {
                        field1449[var3++] = arg0.field4357[var4];
                        continue;
                    }
                    if (var625 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var625 == 7) {
                        var2 -= 2;
                        if (field1440[var2 + 1] != field1440[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 8) {
                        var2 -= 2;
                        if (field1440[var2 + 1] == field1440[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 9) {
                        var2 -= 2;
                        if (field1440[var2] < field1440[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 10) {
                        var2 -= 2;
                        if (field1440[var2] > field1440[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 21) {
                        if (field1451 == 0) {
                            return;
                        }
                        class269 var11 = field1444[--field1451];
                        arg0 = var11.field3989;
                        var5 = arg0.field4349;
                        var6 = arg0.field4356;
                        var4 = var11.field3994;
                        field1456 = var11.field3990;
                        field1438 = var11.field3991;
                        continue;
                    }
                    if (var625 == 25) {
                        int var12 = var6[var4];
                        field1440[var2++] = class294.method1954(3, var12);
                        continue;
                    }
                    if (var625 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class231.method1581(field1440[var2], var13, -93);
                        continue;
                    }
                    if (var625 == 31) {
                        var2 -= 2;
                        if (field1440[var2] <= field1440[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 32) {
                        var2 -= 2;
                        if (field1440[var2] >= field1440[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 33) {
                        field1440[var2++] = field1456[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var625 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field1456[var10001] = field1440[var2];
                        continue;
                    }
                    if (var625 == 35) {
                        field1449[var3++] = field1438[var6[var4]];
                        continue;
                    }
                    if (var625 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field1438[var10001] = field1449[var3];
                        continue;
                    }
                    if (var625 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class18.method228(4080, field1449, var3, var14);
                        field1449[var3++] = var15;
                        continue;
                    }
                    if (var625 == 38) {
                        var2--;
                        continue;
                    }
                    if (var625 == 39) {
                        var3--;
                        continue;
                    }
                    if (var625 == 40) {
                        int var16 = var6[var4];
                        class299 var17 = class141.method933(var16, -20227);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field4346];
                        String[] var19 = new String[var17.field4354];
                        for (int var20 = 0; var20 < var17.field4353; var20++) {
                            var18[var20] = field1440[var2 + var20 - var17.field4353];
                        }
                        for (int var21 = 0; var21 < var17.field4358; var21++) {
                            var19[var21] = field1449[var3 + var21 - var17.field4358];
                        }
                        var2 -= var17.field4353;
                        var3 -= var17.field4358;
                        class269 var22 = new class269();
                        var22.field3989 = arg0;
                        var22.field3994 = var4;
                        var22.field3990 = field1456;
                        var22.field3991 = field1438;
                        if (field1451 >= field1444.length) {
                            throw new RuntimeException();
                        }
                        field1444[field1451++] = var22;
                        arg0 = var17;
                        var5 = var17.field4349;
                        var6 = var17.field4356;
                        var4 = -1;
                        field1456 = var18;
                        field1438 = var19;
                        continue;
                    }
                    if (var625 == 42) {
                        field1440[var2++] = class447.field6540[var6[var4]];
                        continue;
                    }
                    if (var625 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class447.field6540[var23] = field1440[var2];
                        class332.method2163(var23, 12119);
                        class270.field4008 |= class36.field512[var23];
                        continue;
                    }
                    if (var625 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field1440[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field1445[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4494;
                                }
                                field1442[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field1440[var2];
                        if (var30 >= 0 && var30 < field1445[var29]) {
                            field1440[var2++] = field1442[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field1440[var2];
                        if (var32 >= 0 && var32 < field1445[var31]) {
                            field1442[var31][var32] = field1440[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 47) {
                        String var33 = class110.field1488[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field1449[var3++] = var33;
                        continue;
                    }
                    if (var625 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class110.field1488[var34] = field1449[var3];
                        class223.method1528(var34, (byte) 115);
                        continue;
                    }
                    if (var625 == 51) {
                        class90 var35 = arg0.field4347[var6[var4]];
                        var2--;
                        class13 var36 = (class13) var35.method609((long) field1440[var2], 100);
                        if (var36 != null) {
                            var4 += var36.field214;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var625 < 300) {
                    if (var625 == 100) {
                        var2 -= 3;
                        int var38 = field1440[var2];
                        int var39 = field1440[var2 + 1];
                        int var40 = field1440[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class223 var41 = class432.method2655((byte) -106, var38);
                        if (var41.field3340 == null) {
                            var41.field3340 = new class223[var40 + 1];
                        }
                        if (var41.field3340.length <= var40) {
                            class223[] var42 = new class223[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3340.length; var43++) {
                                var42[var43] = var41.field3340[var43];
                            }
                            var41.field3340 = var42;
                        }
                        if (var40 > 0 && var41.field3340[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class223 var44 = new class223();
                        var44.field3216 = var39;
                        var44.field3319 = var44.field3223 = var41.field3223;
                        var44.field3270 = var40;
                        var41.field3340[var40] = var44;
                        if (var37) {
                            field1453 = var44;
                        } else {
                            field1439 = var44;
                        }
                        class15.method216((byte) 123, var41);
                        continue;
                    }
                    if (var625 == 101) {
                        class223 var45 = var37 ? field1453 : field1439;
                        if (var45.field3270 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class223 var46 = class432.method2655((byte) -98, var45.field3223);
                        var46.field3340[var45.field3270] = null;
                        class15.method216((byte) 126, var46);
                        continue;
                    }
                    if (var625 == 102) {
                        var2--;
                        class223 var47 = class432.method2655((byte) -74, field1440[var2]);
                        var47.field3340 = null;
                        class15.method216((byte) 122, var47);
                        continue;
                    }
                    if (var625 == 200) {
                        var2 -= 2;
                        int var48 = field1440[var2];
                        int var49 = field1440[var2 + 1];
                        class223 var50 = class99.method654(-1, var48, var49);
                        if (var50 != null && var49 != -1) {
                            field1440[var2++] = 1;
                            if (var37) {
                                field1453 = var50;
                            } else {
                                field1439 = var50;
                            }
                            continue;
                        }
                        field1440[var2++] = 0;
                        continue;
                    }
                    if (var625 == 201) {
                        var2--;
                        int var51 = field1440[var2];
                        class223 var52 = class432.method2655((byte) -114, var51);
                        if (var52 == null) {
                            field1440[var2++] = 0;
                        } else {
                            field1440[var2++] = 1;
                            if (var37) {
                                field1453 = var52;
                            } else {
                                field1439 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var625 < 500) {
                    if (var625 == 403) {
                        var2 -= 2;
                        int var53 = field1440[var2];
                        int var54 = field1440[var2 + 1];
                        for (int var55 = 0; var55 < class308.field4555.length; var55++) {
                            if (class308.field4555[var55] == var53) {
                                class187.field2619.field5556.method1783(var54, var55, (byte) -12);
                                continue label4494;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class311.field4586.length) {
                                continue label4494;
                            }
                            if (class311.field4586[var56] == var53) {
                                class187.field2619.field5556.method1783(var54, var56, (byte) -12);
                                continue label4494;
                            }
                            var56++;
                        }
                    }
                    if (var625 == 404) {
                        var2 -= 2;
                        int var57 = field1440[var2];
                        int var58 = field1440[var2 + 1];
                        class187.field2619.field5556.method1784(var58, var57, -1);
                        continue;
                    }
                    if (var625 == 410) {
                        var2--;
                        boolean var59 = field1440[var2] != 0;
                        class187.field2619.field5556.method1776((byte) -99, var59);
                        continue;
                    }
                } else if (!(var625 < 1000 || var625 >= 1100) || !(var625 < 2000 || var625 >= 2100)) {
                    class223 var60;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var60 = class432.method2655((byte) -125, field1440[var2]);
                    } else {
                        var60 = var37 ? field1453 : field1439;
                    }
                    if (var625 == 1000) {
                        var2 -= 4;
                        var60.field3220 = field1440[var2];
                        var60.field3301 = field1440[var2 + 1];
                        int var61 = field1440[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field1440[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3278 = (byte) var61;
                        var60.field3222 = (byte) var62;
                        class15.method216((byte) 123, var60);
                        class295.method1965(0, var60);
                        if (var60.field3270 == -1) {
                            class329.method2154(var60.field3223, 1);
                        }
                        continue;
                    }
                    if (var625 == 1001) {
                        var2 -= 4;
                        var60.field3358 = field1440[var2];
                        var60.field3251 = field1440[var2 + 1];
                        var60.field3326 = 0;
                        var60.field3291 = 0;
                        int var63 = field1440[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field1440[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3325 = (byte) var63;
                        var60.field3244 = (byte) var64;
                        class15.method216((byte) 126, var60);
                        class295.method1965(0, var60);
                        if (var60.field3216 == 0) {
                            class86.method581(false, -105, var60);
                        }
                        continue;
                    }
                    if (var625 == 1003) {
                        var2--;
                        boolean var65 = field1440[var2] == 1;
                        if (var60.field3315 != var65) {
                            var60.field3315 = var65;
                            class15.method216((byte) 124, var60);
                        }
                        if (var60.field3270 == -1) {
                            class130.method873((byte) 8, var60.field3223);
                        }
                        continue;
                    }
                    if (var625 == 1004) {
                        var2 -= 2;
                        var60.field3298 = field1440[var2];
                        var60.field3351 = field1440[var2 + 1];
                        class15.method216((byte) 126, var60);
                        class295.method1965(0, var60);
                        if (var60.field3216 == 0) {
                            class86.method581(false, -102, var60);
                        }
                        continue;
                    }
                    if (var625 == 1005) {
                        var2--;
                        var60.field3231 = field1440[var2] == 1;
                        continue;
                    }
                } else if (var625 >= 1100 && var625 < 1200 || var625 >= 2100 && var625 < 2200) {
                    class223 var66;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var66 = class432.method2655((byte) -119, field1440[var2]);
                    } else {
                        var66 = var37 ? field1453 : field1439;
                    }
                    if (var625 == 1100) {
                        var2 -= 2;
                        var66.field3214 = field1440[var2];
                        if (var66.field3214 > var66.field3218 - var66.field3233) {
                            var66.field3214 = var66.field3218 - var66.field3233;
                        }
                        if (var66.field3214 < 0) {
                            var66.field3214 = 0;
                        }
                        var66.field3307 = field1440[var2 + 1];
                        if (var66.field3307 > var66.field3318 - var66.field3352) {
                            var66.field3307 = var66.field3318 - var66.field3352;
                        }
                        if (var66.field3307 < 0) {
                            var66.field3307 = 0;
                        }
                        class15.method216((byte) 126, var66);
                        if (var66.field3270 == -1) {
                            class44.method368((byte) -10, var66.field3223);
                        }
                        continue;
                    }
                    if (var625 == 1101) {
                        var2--;
                        var66.field3300 = field1440[var2];
                        class15.method216((byte) 125, var66);
                        if (var66.field3270 == -1) {
                            class170.method1106(var66.field3223, 2501);
                        }
                        continue;
                    }
                    if (var625 == 1102) {
                        var2--;
                        var66.field3327 = field1440[var2] == 1;
                        class15.method216((byte) 123, var66);
                        continue;
                    }
                    if (var625 == 1103) {
                        var2--;
                        var66.field3225 = field1440[var2];
                        class15.method216((byte) 123, var66);
                        continue;
                    }
                    if (var625 == 1104) {
                        var2--;
                        var66.field3271 = field1440[var2];
                        class15.method216((byte) 122, var66);
                        continue;
                    }
                    if (var625 == 1105) {
                        var2--;
                        int var67 = field1440[var2];
                        if (var66.field3210 != var67) {
                            var66.field3210 = var67;
                            class15.method216((byte) 124, var66);
                        }
                        if (var66.field3270 == -1) {
                            class88.method591((byte) -73, var66.field3223);
                        }
                        continue;
                    }
                    if (var625 == 1106) {
                        var2--;
                        var66.field3282 = field1440[var2];
                        class15.method216((byte) 123, var66);
                        continue;
                    }
                    if (var625 == 1107) {
                        var2--;
                        var66.field3245 = field1440[var2] == 1;
                        class15.method216((byte) 126, var66);
                        continue;
                    }
                    if (var625 == 1108) {
                        var66.field3337 = 1;
                        var2--;
                        var66.field3343 = field1440[var2];
                        class15.method216((byte) 124, var66);
                        if (var66.field3270 == -1) {
                            class15.method218(var66.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1109) {
                        var2 -= 6;
                        var66.field3316 = field1440[var2];
                        var66.field3252 = field1440[var2 + 1];
                        var66.field3204 = field1440[var2 + 2];
                        var66.field3213 = field1440[var2 + 3];
                        var66.field3317 = field1440[var2 + 4];
                        var66.field3353 = field1440[var2 + 5];
                        class15.method216((byte) 123, var66);
                        if (var66.field3270 == -1) {
                            class326.method2129(true, var66.field3223);
                            class411.method2555(var66.field3223, (byte) 124);
                        }
                        continue;
                    }
                    if (var625 == 1110) {
                        var2--;
                        int var68 = field1440[var2];
                        if (var66.field3242 != var68) {
                            var66.field3242 = var68;
                            var66.field3289 = 0;
                            var66.field3344 = 1;
                            var66.field3287 = 0;
                            class15.method216((byte) 127, var66);
                        }
                        if (var66.field3270 == -1) {
                            class372.method2365(true, var66.field3223);
                        }
                        continue;
                    }
                    if (var625 == 1111) {
                        var2--;
                        var66.field3321 = field1440[var2] == 1;
                        class15.method216((byte) 126, var66);
                        continue;
                    }
                    if (var625 == 1112) {
                        var3--;
                        String var69 = field1449[var3];
                        if (!var69.equals(var66.field3354)) {
                            var66.field3354 = var69;
                            class15.method216((byte) 124, var66);
                        }
                        if (var66.field3270 == -1) {
                            class195.method1355(var66.field3223, -48);
                        }
                        continue;
                    }
                    if (var625 == 1113) {
                        var2--;
                        var66.field3226 = field1440[var2];
                        class15.method216((byte) 127, var66);
                        if (var66.field3270 == -1) {
                            class316.method2087(var66.field3223, false);
                        }
                        continue;
                    }
                    if (var625 == 1114) {
                        var2 -= 3;
                        var66.field3241 = field1440[var2];
                        var66.field3324 = field1440[var2 + 1];
                        var66.field3314 = field1440[var2 + 2];
                        class15.method216((byte) 125, var66);
                        continue;
                    }
                    if (var625 == 1115) {
                        var2--;
                        var66.field3322 = field1440[var2] == 1;
                        class15.method216((byte) 125, var66);
                        continue;
                    }
                    if (var625 == 1116) {
                        var2--;
                        var66.field3345 = field1440[var2];
                        class15.method216((byte) 125, var66);
                        continue;
                    }
                    if (var625 == 1117) {
                        var2--;
                        var66.field3228 = field1440[var2];
                        class15.method216((byte) 123, var66);
                        continue;
                    }
                    if (var625 == 1118) {
                        var2--;
                        var66.field3332 = field1440[var2] == 1;
                        class15.method216((byte) 122, var66);
                        continue;
                    }
                    if (var625 == 1119) {
                        var2--;
                        var66.field3346 = field1440[var2] == 1;
                        class15.method216((byte) 124, var66);
                        continue;
                    }
                    if (var625 == 1120) {
                        var2 -= 2;
                        var66.field3218 = field1440[var2];
                        var66.field3318 = field1440[var2 + 1];
                        class15.method216((byte) 124, var66);
                        if (var66.field3216 == 0) {
                            class86.method581(false, -101, var66);
                        }
                        continue;
                    }
                    if (var625 == 1121) {
                        var2 -= 2;
                        var66.field3208 = (short) field1440[var2];
                        var66.field3349 = (short) field1440[var2 + 1];
                        class15.method216((byte) 122, var66);
                        continue;
                    }
                    if (var625 == 1122) {
                        var2--;
                        var66.field3235 = field1440[var2] == 1;
                        class15.method216((byte) 123, var66);
                        continue;
                    }
                    if (var625 == 1123) {
                        var2--;
                        var66.field3353 = field1440[var2];
                        class15.method216((byte) 122, var66);
                        if (var66.field3270 == -1) {
                            class326.method2129(true, var66.field3223);
                        }
                        continue;
                    }
                    if (var625 == 1124) {
                        var2--;
                        int var70 = field1440[var2];
                        var66.field3338 = var70 == 1;
                        class15.method216((byte) 124, var66);
                        continue;
                    }
                    if (var625 == 1125) {
                        var2 -= 2;
                        var66.field3273 = field1440[var2];
                        var66.field3253 = field1440[var2 + 1];
                        class15.method216((byte) 127, var66);
                        continue;
                    }
                } else if (!(var625 < 1200 || var625 >= 1300) || !(var625 < 2200 || var625 >= 2300)) {
                    class223 var71;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var71 = class432.method2655((byte) -88, field1440[var2]);
                    } else {
                        var71 = var37 ? field1453 : field1439;
                    }
                    class15.method216((byte) 125, var71);
                    if (var625 == 1200 || var625 == 1205 || var625 == 1208 || var625 == 1209 || var625 == 1212 || var625 == 1213) {
                        var2 -= 2;
                        int var72 = field1440[var2];
                        int var73 = field1440[var2 + 1];
                        if (var71.field3270 == -1) {
                            class7.method54(var71.field3223, true);
                            class326.method2129(true, var71.field3223);
                            class411.method2555(var71.field3223, (byte) 124);
                        }
                        if (var72 == -1) {
                            var71.field3337 = 1;
                            var71.field3343 = -1;
                            var71.field3363 = -1;
                            continue;
                        }
                        var71.field3363 = var72;
                        var71.field3328 = var73;
                        if (var625 == 1208 || var625 == 1209) {
                            var71.field3360 = true;
                        } else {
                            var71.field3360 = false;
                        }
                        class427 var74 = class157.field2119.method176((byte) -50, var72);
                        var71.field3204 = var74.field6185;
                        var71.field3213 = var74.field6162;
                        var71.field3317 = var74.field6202;
                        var71.field3316 = var74.field6207;
                        var71.field3252 = var74.field6150;
                        var71.field3353 = var74.field6183;
                        if (var625 == 1205 || var625 == 1209) {
                            var71.field3250 = 0;
                        } else if (var625 == 1212 || var625 == 1213) {
                            var71.field3250 = 1;
                        } else {
                            var71.field3250 = 2;
                        }
                        if (var71.field3326 > 0) {
                            var71.field3353 = var71.field3353 * 32 / var71.field3326;
                        } else if (var71.field3358 > 0) {
                            var71.field3353 = var71.field3353 * 32 / var71.field3358;
                        }
                        continue;
                    }
                    if (var625 == 1201) {
                        var71.field3337 = 2;
                        var2--;
                        var71.field3343 = field1440[var2];
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1202) {
                        var71.field3337 = 3;
                        var71.field3343 = -1;
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1203) {
                        var71.field3337 = 6;
                        var2--;
                        var71.field3343 = field1440[var2];
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1204) {
                        var71.field3337 = 5;
                        var2--;
                        var71.field3343 = field1440[var2];
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1206) {
                        var2 -= 4;
                        var71.field3224 = field1440[var2];
                        var71.field3240 = field1440[var2 + 1];
                        var71.field3237 = field1440[var2 + 2];
                        var71.field3309 = field1440[var2 + 3];
                        class15.method216((byte) 126, var71);
                        continue;
                    }
                    if (var625 == 1207) {
                        var2 -= 2;
                        var71.field3286 = field1440[var2];
                        var71.field3334 = field1440[var2 + 1];
                        class15.method216((byte) 125, var71);
                        continue;
                    }
                    if (var625 == 1210) {
                        var2 -= 4;
                        var71.field3343 = field1440[var2];
                        var71.field3239 = field1440[var2 + 1];
                        if (field1440[var2 + 2] == 1) {
                            var71.field3337 = 9;
                        } else {
                            var71.field3337 = 8;
                        }
                        if (field1440[var2 + 3] == 1) {
                            var71.field3360 = true;
                        } else {
                            var71.field3360 = false;
                        }
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                    if (var625 == 1211) {
                        var71.field3337 = 5;
                        var71.field3343 = class420.field6085;
                        var71.field3239 = 0;
                        if (var71.field3270 == -1) {
                            class15.method218(var71.field3223, 35);
                        }
                        continue;
                    }
                } else if (var625 >= 1300 && var625 < 1400 || var625 >= 2300 && var625 < 2400) {
                    class223 var75;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var75 = class432.method2655((byte) -95, field1440[var2]);
                    } else {
                        var75 = var37 ? field1453 : field1439;
                    }
                    if (var625 == 1300) {
                        var2--;
                        int var76 = field1440[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1531(false, var76, field1449[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var625 == 1301) {
                        var2 -= 2;
                        int var77 = field1440[var2];
                        int var78 = field1440[var2 + 1];
                        var75.field3217 = class99.method654(-1, var77, var78);
                        continue;
                    }
                    if (var625 == 1302) {
                        var2--;
                        int var79 = field1440[var2];
                        if (class266.field3951 == var79 || class337.field4970 == var79 || class419.field6072 == var79) {
                            var75.field3259 = var79;
                        }
                        continue;
                    }
                    if (var625 == 1303) {
                        var2--;
                        var75.field3299 = field1440[var2];
                        continue;
                    }
                    if (var625 == 1304) {
                        var2--;
                        var75.field3234 = field1440[var2];
                        continue;
                    }
                    if (var625 == 1305) {
                        var3--;
                        var75.field3212 = field1449[var3];
                        continue;
                    }
                    if (var625 == 1306) {
                        var3--;
                        var75.field3323 = field1449[var3];
                        continue;
                    }
                    if (var625 == 1307) {
                        var75.field3267 = null;
                        continue;
                    }
                    if (var625 == 1308) {
                        var2--;
                        var75.field3335 = field1440[var2];
                        var2--;
                        var75.field3246 = field1440[var2];
                        continue;
                    }
                    if (var625 == 1309) {
                        var2--;
                        int var80 = field1440[var2];
                        var2--;
                        int var81 = field1440[var2];
                        if (var81 >= 1 && var81 <= 10) {
                            var75.method1536(var81 - 1, var80, (byte) -112);
                        }
                        continue;
                    }
                    if (var625 == 1310) {
                        var3--;
                        var75.field3266 = field1449[var3];
                        continue;
                    }
                    if (var625 == 1311) {
                        var2--;
                        var75.field3313 = field1440[var2];
                        continue;
                    }
                } else {
                    if (var625 >= 1400 && var625 < 1500 || var625 >= 2400 && var625 < 2500) {
                        class223 var82;
                        if (var625 >= 2000) {
                            var625 -= 1000;
                            var2--;
                            var82 = class432.method2655((byte) -85, field1440[var2]);
                        } else {
                            var82 = var37 ? field1453 : field1439;
                        }
                        var3--;
                        String var83 = field1449[var3];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var2--;
                            int var85 = field1440[var2];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var2--;
                                    var84[var85] = field1440[var2];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var3--;
                                var86[var87] = field1449[var3];
                            } else {
                                var2--;
                                var86[var87] = Integer.valueOf(field1440[var2]);
                            }
                        }
                        var2--;
                        int var88 = field1440[var2];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var625 == 1400) {
                            var82.field3297 = var86;
                        } else if (var625 == 1401) {
                            var82.field3255 = var86;
                        } else if (var625 == 1402) {
                            var82.field3281 = var86;
                        } else if (var625 == 1403) {
                            var82.field3230 = var86;
                        } else if (var625 == 1404) {
                            var82.field3261 = var86;
                        } else if (var625 == 1405) {
                            var82.field3229 = var86;
                        } else if (var625 == 1406) {
                            var82.field3265 = var86;
                        } else if (var625 == 1407) {
                            var82.field3238 = var86;
                            var82.field3305 = var84;
                        } else if (var625 == 1408) {
                            var82.field3257 = var86;
                        } else if (var625 == 1409) {
                            var82.field3219 = var86;
                        } else if (var625 == 1410) {
                            var82.field3206 = var86;
                        } else if (var625 == 1411) {
                            var82.field3290 = var86;
                        } else if (var625 == 1412) {
                            var82.field3254 = var86;
                        } else if (var625 == 1414) {
                            var82.field3285 = var86;
                            var82.field3366 = var84;
                        } else if (var625 == 1415) {
                            var82.field3279 = var86;
                            var82.field3269 = var84;
                        } else if (var625 == 1416) {
                            var82.field3256 = var86;
                        } else if (var625 == 1417) {
                            var82.field3355 = var86;
                        } else if (var625 == 1418) {
                            var82.field3248 = var86;
                        } else if (var625 == 1419) {
                            var82.field3227 = var86;
                        } else if (var625 == 1420) {
                            var82.field3236 = var86;
                        } else if (var625 == 1421) {
                            var82.field3215 = var86;
                        } else if (var625 == 1422) {
                            var82.field3302 = var86;
                        } else if (var625 == 1423) {
                            var82.field3207 = var86;
                        } else if (var625 == 1424) {
                            var82.field3276 = var86;
                        } else if (var625 == 1425) {
                            var82.field3205 = var86;
                        } else if (var625 == 1426) {
                            var82.field3348 = var86;
                        } else if (var625 == 1427) {
                            var82.field3274 = var86;
                        } else if (var625 == 1428) {
                            var82.field3312 = var86;
                            var82.field3292 = var84;
                        } else if (var625 == 1429) {
                            var82.field3329 = var86;
                            var82.field3347 = var84;
                        }
                        var82.field3311 = true;
                        continue;
                    }
                    if (var625 < 1600) {
                        class223 var89 = var37 ? field1453 : field1439;
                        if (var625 == 1500) {
                            field1440[var2++] = var89.field3288;
                            continue;
                        }
                        if (var625 == 1501) {
                            field1440[var2++] = var89.field3362;
                            continue;
                        }
                        if (var625 == 1502) {
                            field1440[var2++] = var89.field3233;
                            continue;
                        }
                        if (var625 == 1503) {
                            field1440[var2++] = var89.field3352;
                            continue;
                        }
                        if (var625 == 1504) {
                            field1440[var2++] = var89.field3315 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 1505) {
                            field1440[var2++] = var89.field3319;
                            continue;
                        }
                    } else if (var625 < 1700) {
                        class223 var90 = var37 ? field1453 : field1439;
                        if (var625 == 1600) {
                            field1440[var2++] = var90.field3214;
                            continue;
                        }
                        if (var625 == 1601) {
                            field1440[var2++] = var90.field3307;
                            continue;
                        }
                        if (var625 == 1602) {
                            field1449[var3++] = var90.field3354;
                            continue;
                        }
                        if (var625 == 1603) {
                            field1440[var2++] = var90.field3218;
                            continue;
                        }
                        if (var625 == 1604) {
                            field1440[var2++] = var90.field3318;
                            continue;
                        }
                        if (var625 == 1605) {
                            field1440[var2++] = var90.field3353;
                            continue;
                        }
                        if (var625 == 1606) {
                            field1440[var2++] = var90.field3204;
                            continue;
                        }
                        if (var625 == 1607) {
                            field1440[var2++] = var90.field3317;
                            continue;
                        }
                        if (var625 == 1608) {
                            field1440[var2++] = var90.field3213;
                            continue;
                        }
                        if (var625 == 1609) {
                            field1440[var2++] = var90.field3225;
                            continue;
                        }
                        if (var625 == 1610) {
                            field1440[var2++] = var90.field3316;
                            continue;
                        }
                        if (var625 == 1611) {
                            field1440[var2++] = var90.field3252;
                            continue;
                        }
                        if (var625 == 1612) {
                            field1440[var2++] = var90.field3210;
                            continue;
                        }
                    } else if (var625 < 1800) {
                        class223 var91 = var37 ? field1453 : field1439;
                        if (var625 == 1700) {
                            field1440[var2++] = var91.field3363;
                            continue;
                        }
                        if (var625 == 1701) {
                            if (var91.field3363 == -1) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var91.field3328;
                            }
                            continue;
                        }
                        if (var625 == 1702) {
                            field1440[var2++] = var91.field3270;
                            continue;
                        }
                    } else if (var625 < 1900) {
                        class223 var92 = var37 ? field1453 : field1439;
                        if (var625 == 1800) {
                            field1440[var2++] = client.method1811(var92).method2162(10);
                            continue;
                        }
                        if (var625 == 1801) {
                            var2--;
                            int var93 = field1440[var2];
                            int var626 = var93 - 1;
                            if (var92.field3267 != null && var626 < var92.field3267.length && var92.field3267[var626] != null) {
                                field1449[var3++] = var92.field3267[var626];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 1802) {
                            if (var92.field3212 == null) {
                                field1449[var3++] = "";
                            } else {
                                field1449[var3++] = var92.field3212;
                            }
                            continue;
                        }
                    } else if (var625 < 2600) {
                        var2--;
                        class223 var94 = class432.method2655((byte) -104, field1440[var2]);
                        if (var625 == 2500) {
                            field1440[var2++] = var94.field3288;
                            continue;
                        }
                        if (var625 == 2501) {
                            field1440[var2++] = var94.field3362;
                            continue;
                        }
                        if (var625 == 2502) {
                            field1440[var2++] = var94.field3233;
                            continue;
                        }
                        if (var625 == 2503) {
                            field1440[var2++] = var94.field3352;
                            continue;
                        }
                        if (var625 == 2504) {
                            field1440[var2++] = var94.field3315 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 2505) {
                            field1440[var2++] = var94.field3319;
                            continue;
                        }
                    } else if (var625 < 2700) {
                        var2--;
                        class223 var95 = class432.method2655((byte) -83, field1440[var2]);
                        if (var625 == 2600) {
                            field1440[var2++] = var95.field3214;
                            continue;
                        }
                        if (var625 == 2601) {
                            field1440[var2++] = var95.field3307;
                            continue;
                        }
                        if (var625 == 2602) {
                            field1449[var3++] = var95.field3354;
                            continue;
                        }
                        if (var625 == 2603) {
                            field1440[var2++] = var95.field3218;
                            continue;
                        }
                        if (var625 == 2604) {
                            field1440[var2++] = var95.field3318;
                            continue;
                        }
                        if (var625 == 2605) {
                            field1440[var2++] = var95.field3353;
                            continue;
                        }
                        if (var625 == 2606) {
                            field1440[var2++] = var95.field3204;
                            continue;
                        }
                        if (var625 == 2607) {
                            field1440[var2++] = var95.field3317;
                            continue;
                        }
                        if (var625 == 2608) {
                            field1440[var2++] = var95.field3213;
                            continue;
                        }
                        if (var625 == 2609) {
                            field1440[var2++] = var95.field3225;
                            continue;
                        }
                        if (var625 == 2610) {
                            field1440[var2++] = var95.field3316;
                            continue;
                        }
                        if (var625 == 2611) {
                            field1440[var2++] = var95.field3252;
                            continue;
                        }
                        if (var625 == 2612) {
                            field1440[var2++] = var95.field3210;
                            continue;
                        }
                    } else if (var625 < 2800) {
                        if (var625 == 2700) {
                            var2--;
                            class223 var96 = class432.method2655((byte) -123, field1440[var2]);
                            field1440[var2++] = var96.field3363;
                            continue;
                        }
                        if (var625 == 2701) {
                            var2--;
                            class223 var97 = class432.method2655((byte) -83, field1440[var2]);
                            if (var97.field3363 == -1) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var97.field3328;
                            }
                            continue;
                        }
                        if (var625 == 2702) {
                            var2--;
                            int var98 = field1440[var2];
                            class182 var99 = (class182) class252.field3703.method609((long) var98, 87);
                            if (var99 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = 1;
                            }
                            continue;
                        }
                        if (var625 == 2703) {
                            var2--;
                            class223 var100 = class432.method2655((byte) -94, field1440[var2]);
                            if (var100.field3340 == null) {
                                field1440[var2++] = 0;
                                continue;
                            }
                            int var101 = var100.field3340.length;
                            for (int var102 = 0; var102 < var100.field3340.length; var102++) {
                                if (var100.field3340[var102] == null) {
                                    var101 = var102;
                                    break;
                                }
                            }
                            field1440[var2++] = var101;
                            continue;
                        }
                        if (var625 == 2704 || var625 == 2705) {
                            var2 -= 2;
                            int var103 = field1440[var2];
                            int var104 = field1440[var2 + 1];
                            class182 var105 = (class182) class252.field3703.method609((long) var103, 85);
                            if (var105 != null && var105.field2564 == var104) {
                                field1440[var2++] = 1;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                    } else if (var625 < 2900) {
                        var2--;
                        class223 var106 = class432.method2655((byte) -125, field1440[var2]);
                        if (var625 == 2800) {
                            field1440[var2++] = client.method1811(var106).method2162(-105);
                            continue;
                        }
                        if (var625 == 2801) {
                            var2--;
                            int var107 = field1440[var2];
                            int var627 = var107 - 1;
                            if (var106.field3267 != null && var627 < var106.field3267.length && var106.field3267[var627] != null) {
                                field1449[var3++] = var106.field3267[var627];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 2802) {
                            if (var106.field3212 == null) {
                                field1449[var3++] = "";
                            } else {
                                field1449[var3++] = var106.field3212;
                            }
                            continue;
                        }
                    } else if (var625 < 3200) {
                        if (var625 == 3100) {
                            var3--;
                            String var108 = field1449[var3];
                            class328.method2147(128, var108);
                            continue;
                        }
                        if (var625 == 3101) {
                            var2 -= 2;
                            class195.method1359(0, field1440[var2], class187.field2619, field1440[var2 + 1]);
                            continue;
                        }
                        if (var625 == 3103) {
                            class265.method1825(64, true);
                            continue;
                        }
                        if (var625 == 3104) {
                            var3--;
                            String var109 = field1449[var3];
                            int var110 = 0;
                            if (class74.method526(var109, (byte) -92)) {
                                var110 = class92.method627(var109, (byte) -126);
                            }
                            field1460++;
                            class257.method1773((byte) -10, class150.field2030);
                            class159.field2132.method1721(25153, var110);
                            continue;
                        }
                        if (var625 == 3105) {
                            var3--;
                            String var111 = field1449[var3];
                            field1454++;
                            class257.method1773((byte) -10, class192.field2679);
                            class159.field2132.method1727(-128, var111.length() + 1);
                            class159.field2132.method1712(var111, -27);
                            continue;
                        }
                        if (var625 == 3106) {
                            var3--;
                            String var112 = field1449[var3];
                            field1455++;
                            class257.method1773((byte) -10, class432.field6294);
                            class159.field2132.method1727(-128, var112.length() + 1);
                            class159.field2132.method1712(var112, 107);
                            continue;
                        }
                        if (var625 == 3107) {
                            var2--;
                            int var113 = field1440[var2];
                            var3--;
                            String var114 = field1449[var3];
                            class418.method2588((byte) 127, var114, var113);
                            continue;
                        }
                        if (var625 == 3108) {
                            var2 -= 3;
                            int var115 = field1440[var2];
                            int var116 = field1440[var2 + 1];
                            int var117 = field1440[var2 + 2];
                            class223 var118 = class432.method2655((byte) -97, var117);
                            class465.method2871(0, var116, var115, var118);
                            continue;
                        }
                        if (var625 == 3109) {
                            var2 -= 2;
                            int var119 = field1440[var2];
                            int var120 = field1440[var2 + 1];
                            class223 var121 = var37 ? field1453 : field1439;
                            class465.method2871(0, var120, var119, var121);
                            continue;
                        }
                        if (var625 == 3110) {
                            var2--;
                            int var122 = field1440[var2];
                            field1450++;
                            class257.method1773((byte) -10, class46.field597);
                            class159.field2132.method1750((byte) 0, var122);
                            continue;
                        }
                        if (var625 == 3111) {
                            var2 -= 2;
                            int var123 = field1440[var2];
                            int var124 = field1440[var2 + 1];
                            class182 var125 = (class182) class252.field3703.method609((long) var123, 89);
                            if (var125 != null) {
                                class240.method1615(true, var125.field2564 != var124, (byte) 88, var125);
                            }
                            class147.method1016((byte) 94, true, var124, 3, var123);
                            continue;
                        }
                        if (var625 == 3112) {
                            var2--;
                            int var126 = field1440[var2];
                            class182 var127 = (class182) class252.field3703.method609((long) var126, 76);
                            if (var127 != null && var127.field2562 == 3) {
                                class240.method1615(true, true, (byte) 122, var127);
                            }
                            continue;
                        }
                    } else if (var625 < 3300) {
                        if (var625 == 3200) {
                            var2 -= 3;
                            class7.method57(field1440[var2 + 2], true, field1440[var2 + 1], field1440[var2], 255);
                            continue;
                        }
                        if (var625 == 3201) {
                            var2--;
                            class310.method2061(255, field1440[var2], 0);
                            continue;
                        }
                        if (var625 == 3202) {
                            var2 -= 2;
                            class260.method1788(field1440[var2], 255, field1440[var2 + 1], (byte) 55);
                            continue;
                        }
                    } else if (var625 < 3400) {
                        if (var625 == 3300) {
                            field1440[var2++] = class388.field5665;
                            continue;
                        }
                        if (var625 == 3301) {
                            var2 -= 2;
                            int var128 = field1440[var2];
                            int var129 = field1440[var2 + 1];
                            field1440[var2++] = class259.method1781(false, 14807, var129, var128);
                            continue;
                        }
                        if (var625 == 3302) {
                            var2 -= 2;
                            int var130 = field1440[var2];
                            int var131 = field1440[var2 + 1];
                            field1440[var2++] = class443.method2719(false, var130, var131, -102);
                            continue;
                        }
                        if (var625 == 3303) {
                            var2 -= 2;
                            int var132 = field1440[var2];
                            int var133 = field1440[var2 + 1];
                            field1440[var2++] = class186.method1273(false, var132, 0, var133);
                            continue;
                        }
                        if (var625 == 3304) {
                            var2--;
                            int var134 = field1440[var2];
                            field1440[var2++] = class281.method1897((byte) 101, var134).field1872;
                            continue;
                        }
                        if (var625 == 3305) {
                            var2--;
                            int var135 = field1440[var2];
                            field1440[var2++] = class143.field1947[var135];
                            continue;
                        }
                        if (var625 == 3306) {
                            var2--;
                            int var136 = field1440[var2];
                            field1440[var2++] = class369.field5331[var136];
                            continue;
                        }
                        if (var625 == 3307) {
                            var2--;
                            int var137 = field1440[var2];
                            field1440[var2++] = class47.field614[var137];
                            continue;
                        }
                        if (var625 == 3308) {
                            byte var138 = class187.field2619.field4960;
                            int var139 = (class187.field2619.field4954 >> 7) + class28.field399;
                            int var140 = (class187.field2619.field4951 >> 7) + class134.field1846;
                            field1440[var2++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var625 == 3309) {
                            var2--;
                            int var141 = field1440[var2];
                            field1440[var2++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3310) {
                            var2--;
                            int var142 = field1440[var2];
                            field1440[var2++] = var142 >> 28;
                            continue;
                        }
                        if (var625 == 3311) {
                            var2--;
                            int var143 = field1440[var2];
                            field1440[var2++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3312) {
                            field1440[var2++] = class33.field472 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3313) {
                            var2 -= 2;
                            int var144 = field1440[var2];
                            int var145 = field1440[var2 + 1];
                            field1440[var2++] = class259.method1781(true, 14807, var145, var144);
                            continue;
                        }
                        if (var625 == 3314) {
                            var2 -= 2;
                            int var146 = field1440[var2];
                            int var147 = field1440[var2 + 1];
                            field1440[var2++] = class443.method2719(true, var146, var147, -79);
                            continue;
                        }
                        if (var625 == 3315) {
                            var2 -= 2;
                            int var148 = field1440[var2];
                            int var149 = field1440[var2 + 1];
                            field1440[var2++] = class186.method1273(true, var148, 0, var149);
                            continue;
                        }
                        if (var625 == 3316) {
                            if (class42.field564 >= 2) {
                                field1440[var2++] = class42.field564;
                            } else {
                                field1440[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 3317) {
                            field1440[var2++] = class15.field246;
                            continue;
                        }
                        if (var625 == 3318) {
                            field1440[var2++] = class403.field5825;
                            continue;
                        }
                        if (var625 == 3321) {
                            field1440[var2++] = class154.field2080;
                            continue;
                        }
                        if (var625 == 3322) {
                            field1440[var2++] = class242.field3595;
                            continue;
                        }
                        if (var625 == 3323) {
                            if (class416.field6018 >= 5 && class416.field6018 <= 9) {
                                field1440[var2++] = 1;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3324) {
                            if (class416.field6018 >= 5 && class416.field6018 <= 9) {
                                field1440[var2++] = class416.field6018;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3325) {
                            field1440[var2++] = class408.field5877 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3326) {
                            field1440[var2++] = class187.field2619.field5553;
                            continue;
                        }
                        if (var625 == 3327) {
                            field1440[var2++] = class187.field2619.field5556.field3821 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3328) {
                            field1440[var2++] = class236.field3523 && !class395.field5747 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3329) {
                            field1440[var2++] = class74.field943 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3330) {
                            var2--;
                            int var150 = field1440[var2];
                            field1440[var2++] = class196.method1370(9403, false, var150);
                            continue;
                        }
                        if (var625 == 3331) {
                            var2 -= 2;
                            int var151 = field1440[var2];
                            int var152 = field1440[var2 + 1];
                            field1440[var2++] = class437.method2693(false, var151, var152, false, (byte) -9);
                            continue;
                        }
                        if (var625 == 3332) {
                            var2 -= 2;
                            int var153 = field1440[var2];
                            int var154 = field1440[var2 + 1];
                            field1440[var2++] = class437.method2693(true, var153, var154, false, (byte) -9);
                            continue;
                        }
                        if (var625 == 3333) {
                            field1440[var2++] = class338.field4981;
                            continue;
                        }
                        if (var625 == 3335) {
                            field1440[var2++] = class153.field2073;
                            continue;
                        }
                        if (var625 == 3336) {
                            var2 -= 4;
                            int var155 = field1440[var2];
                            int var156 = field1440[var2 + 1];
                            int var157 = field1440[var2 + 2];
                            int var158 = field1440[var2 + 3];
                            int var159 = (var156 << 14) + var155;
                            int var160 = (var157 << 28) + var159;
                            int var161 = var158 + var160;
                            field1440[var2++] = var161;
                            continue;
                        }
                        if (var625 == 3337) {
                            field1440[var2++] = class22.field320;
                            continue;
                        }
                        if (var625 == 3338) {
                            field1440[var2++] = class304.method2023((byte) -100);
                            continue;
                        }
                    } else if (var625 < 3500) {
                        if (var625 == 3400) {
                            var2 -= 2;
                            int var162 = field1440[var2];
                            int var163 = field1440[var2 + 1];
                            class214 var164 = class454.method2815(false, var162);
                            field1449[var3++] = var164.method1464(101, var163);
                            continue;
                        }
                        if (var625 == 3408) {
                            var2 -= 4;
                            int var165 = field1440[var2];
                            int var166 = field1440[var2 + 1];
                            int var167 = field1440[var2 + 2];
                            int var168 = field1440[var2 + 3];
                            class214 var169 = class454.method2815(false, var167);
                            if (var169.field3025 == var165 && var169.field3023 == var166) {
                                if (var166 == 115) {
                                    field1449[var3++] = var169.method1464(120, var168);
                                } else {
                                    field1440[var2++] = var169.method1465(0, var168);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var625 == 3409) {
                            var2 -= 3;
                            int var170 = field1440[var2];
                            int var171 = field1440[var2 + 1];
                            int var172 = field1440[var2 + 2];
                            if (var171 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class214 var173 = class454.method2815(false, var171);
                            if (var173.field3023 != var170) {
                                throw new RuntimeException("C3409-1");
                            }
                            field1440[var2++] = var173.method1472((byte) 23, var172) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3410) {
                            var2--;
                            int var174 = field1440[var2];
                            var3--;
                            String var175 = field1449[var3];
                            if (var174 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class214 var176 = class454.method2815(false, var174);
                            if (var176.field3023 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field1440[var2++] = var176.method1469(var175, true) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3411) {
                            var2--;
                            int var177 = field1440[var2];
                            class214 var178 = class454.method2815(false, var177);
                            field1440[var2++] = var178.field3018.method612(2);
                            continue;
                        }
                    } else if (var625 < 3700) {
                        if (var625 == 3600) {
                            if (class395.field5753 == 0) {
                                field1440[var2++] = -2;
                            } else if (class395.field5753 == 1) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = class373.field5450;
                            }
                            continue;
                        }
                        if (var625 == 3601) {
                            var2--;
                            int var179 = field1440[var2];
                            if (class395.field5753 == 2 && var179 < class373.field5450) {
                                field1449[var3++] = class271.field4015[var179];
                                if (class419.field6077[var179] == null) {
                                    field1449[var3++] = "";
                                } else {
                                    field1449[var3++] = class419.field6077[var179];
                                }
                                continue;
                            }
                            field1449[var3++] = "";
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3602) {
                            var2--;
                            int var180 = field1440[var2];
                            if (class395.field5753 == 2 && var180 < class373.field5450) {
                                field1440[var2++] = class57.field699[var180];
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3603) {
                            var2--;
                            int var181 = field1440[var2];
                            if (class395.field5753 == 2 && var181 < class373.field5450) {
                                field1440[var2++] = class454.field6705[var181];
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3604) {
                            var3--;
                            String var182 = field1449[var3];
                            var2--;
                            int var183 = field1440[var2];
                            class433.method2656(var182, var183, (byte) 28);
                            continue;
                        }
                        if (var625 == 3605) {
                            var3--;
                            String var184 = field1449[var3];
                            class316.method2088(var184, 1001);
                            continue;
                        }
                        if (var625 == 3606) {
                            var3--;
                            String var185 = field1449[var3];
                            class339.method2192(var185, 1);
                            continue;
                        }
                        if (var625 == 3607) {
                            var3--;
                            String var186 = field1449[var3];
                            class416.method2584(false, false, var186);
                            continue;
                        }
                        if (var625 == 3608) {
                            var3--;
                            String var187 = field1449[var3];
                            class160.method1074(var187, (byte) 5);
                            continue;
                        }
                        if (var625 == 3609) {
                            var3--;
                            String var188 = field1449[var3];
                            if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                                var188 = var188.substring(7);
                            }
                            field1440[var2++] = class353.method2260(true, var188) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3610) {
                            var2--;
                            int var189 = field1440[var2];
                            if (class395.field5753 == 2 && var189 < class373.field5450) {
                                field1449[var3++] = class455.field6733[var189];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3611) {
                            if (class142.field1937 == null) {
                                field1449[var3++] = "";
                            } else {
                                field1449[var3++] = class187.method1281(class142.field1937, 19990);
                            }
                            continue;
                        }
                        if (var625 == 3612) {
                            if (class142.field1937 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = class418.field6032;
                            }
                            continue;
                        }
                        if (var625 == 3613) {
                            var2--;
                            int var190 = field1440[var2];
                            if (class142.field1937 != null && var190 < class418.field6032) {
                                field1449[var3++] = class253.field3720[var190].field3871;
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3614) {
                            var2--;
                            int var191 = field1440[var2];
                            if (class142.field1937 != null && var191 < class418.field6032) {
                                field1440[var2++] = class253.field3720[var191].field3863;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3615) {
                            var2--;
                            int var192 = field1440[var2];
                            if (class142.field1937 != null && var192 < class418.field6032) {
                                field1440[var2++] = class253.field3720[var192].field3866;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3616) {
                            field1440[var2++] = class382.field5607;
                            continue;
                        }
                        if (var625 == 3617) {
                            var3--;
                            String var193 = field1449[var3];
                            class133.method892(true, var193);
                            continue;
                        }
                        if (var625 == 3618) {
                            field1440[var2++] = class96.field1180;
                            continue;
                        }
                        if (var625 == 3619) {
                            var3--;
                            String var194 = field1449[var3];
                            class119.method812((byte) -127, var194);
                            continue;
                        }
                        if (var625 == 3620) {
                            class365.method2324(-1);
                            continue;
                        }
                        if (var625 == 3621) {
                            if (class395.field5753 == 0) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = class238.field3533;
                            }
                            continue;
                        }
                        if (var625 == 3622) {
                            var2--;
                            int var195 = field1440[var2];
                            if (class395.field5753 != 0 && var195 < class238.field3533) {
                                field1449[var3++] = class163.field2161[var195];
                                if (class334.field4937[var195] == null) {
                                    field1449[var3++] = "";
                                } else {
                                    field1449[var3++] = class334.field4937[var195];
                                }
                                continue;
                            }
                            field1449[var3++] = "";
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3623) {
                            var3--;
                            String var196 = field1449[var3];
                            if (var196.startsWith("<img=0>") || var196.startsWith("<img=1>")) {
                                var196 = var196.substring(7);
                            }
                            field1440[var2++] = class256.method1722((byte) -120, var196) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3624) {
                            var2--;
                            int var197 = field1440[var2];
                            if (class253.field3720 != null && var197 < class418.field6032 && class253.field3720[var197].field3865.equalsIgnoreCase(class187.field2619.field5587)) {
                                field1440[var2++] = 1;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3625) {
                            if (class332.field4913 == null) {
                                field1449[var3++] = "";
                            } else {
                                field1449[var3++] = class332.field4913;
                            }
                            continue;
                        }
                        if (var625 == 3626) {
                            var2--;
                            int var198 = field1440[var2];
                            if (class142.field1937 != null && var198 < class418.field6032) {
                                field1449[var3++] = class253.field3720[var198].field3868;
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3627) {
                            var2--;
                            int var199 = field1440[var2];
                            if (class395.field5753 == 2 && var199 >= 0 && var199 < class373.field5450) {
                                field1440[var2++] = class53.field665[var199] ? 1 : 0;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3628) {
                            var3--;
                            String var200 = field1449[var3];
                            if (var200.startsWith("<img=0>") || var200.startsWith("<img=1>")) {
                                var200 = var200.substring(7);
                            }
                            field1440[var2++] = class163.method1084(var200, 19);
                            continue;
                        }
                        if (var625 == 3629) {
                            field1440[var2++] = class153.field2071;
                            continue;
                        }
                        if (var625 == 3630) {
                            var3--;
                            String var201 = field1449[var3];
                            class416.method2584(true, false, var201);
                            continue;
                        }
                        if (var625 == 3631) {
                            var2--;
                            int var202 = field1440[var2];
                            field1440[var2++] = class79.field996[var202] ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3632) {
                            var2--;
                            int var203 = field1440[var2];
                            if (class142.field1937 != null && var203 < class418.field6032) {
                                field1449[var3++] = class253.field3720[var203].field3865;
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 3633) {
                            var2--;
                            int var204 = field1440[var2];
                            if (class395.field5753 != 0 && var204 < class238.field3533) {
                                field1449[var3++] = class187.field2612[var204];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                    } else if (var625 < 4000) {
                        if (var625 == 3903) {
                            var2--;
                            int var205 = field1440[var2];
                            field1440[var2++] = class14.field228[var205].method2527(true);
                            continue;
                        }
                        if (var625 == 3904) {
                            var2--;
                            int var206 = field1440[var2];
                            field1440[var2++] = class14.field228[var206].field5835;
                            continue;
                        }
                        if (var625 == 3905) {
                            var2--;
                            int var207 = field1440[var2];
                            field1440[var2++] = class14.field228[var207].field5848;
                            continue;
                        }
                        if (var625 == 3906) {
                            var2--;
                            int var208 = field1440[var2];
                            field1440[var2++] = class14.field228[var208].field5844;
                            continue;
                        }
                        if (var625 == 3907) {
                            var2--;
                            int var209 = field1440[var2];
                            field1440[var2++] = class14.field228[var209].field5847;
                            continue;
                        }
                        if (var625 == 3908) {
                            var2--;
                            int var210 = field1440[var2];
                            field1440[var2++] = class14.field228[var210].field5845;
                            continue;
                        }
                        if (var625 == 3910) {
                            var2--;
                            int var211 = field1440[var2];
                            int var212 = class14.field228[var211].method2520(true);
                            field1440[var2++] = var212 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3911) {
                            var2--;
                            int var213 = field1440[var2];
                            int var214 = class14.field228[var213].method2520(true);
                            field1440[var2++] = var214 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3912) {
                            var2--;
                            int var215 = field1440[var2];
                            int var216 = class14.field228[var215].method2520(true);
                            field1440[var2++] = var216 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3913) {
                            var2--;
                            int var217 = field1440[var2];
                            int var218 = class14.field228[var217].method2520(true);
                            field1440[var2++] = var218 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 4100) {
                        if (var625 == 4000) {
                            var2 -= 2;
                            int var219 = field1440[var2];
                            int var220 = field1440[var2 + 1];
                            field1440[var2++] = var219 + var220;
                            continue;
                        }
                        if (var625 == 4001) {
                            var2 -= 2;
                            int var221 = field1440[var2];
                            int var222 = field1440[var2 + 1];
                            field1440[var2++] = var221 - var222;
                            continue;
                        }
                        if (var625 == 4002) {
                            var2 -= 2;
                            int var223 = field1440[var2];
                            int var224 = field1440[var2 + 1];
                            field1440[var2++] = var223 * var224;
                            continue;
                        }
                        if (var625 == 4003) {
                            var2 -= 2;
                            int var225 = field1440[var2];
                            int var226 = field1440[var2 + 1];
                            field1440[var2++] = var225 / var226;
                            continue;
                        }
                        if (var625 == 4004) {
                            var2--;
                            int var227 = field1440[var2];
                            field1440[var2++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var625 == 4005) {
                            var2--;
                            int var228 = field1440[var2];
                            field1440[var2++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var625 == 4006) {
                            var2 -= 5;
                            int var229 = field1440[var2];
                            int var230 = field1440[var2 + 1];
                            int var231 = field1440[var2 + 2];
                            int var232 = field1440[var2 + 3];
                            int var233 = field1440[var2 + 4];
                            field1440[var2++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var625 == 4007) {
                            var2 -= 2;
                            long var234 = (long) field1440[var2];
                            long var236 = (long) field1440[var2 + 1];
                            field1440[var2++] = (int) (var234 * var236 / 100L + var234);
                            continue;
                        }
                        if (var625 == 4008) {
                            var2 -= 2;
                            int var238 = field1440[var2];
                            int var239 = field1440[var2 + 1];
                            field1440[var2++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var625 == 4009) {
                            var2 -= 2;
                            int var240 = field1440[var2];
                            int var241 = field1440[var2 + 1];
                            field1440[var2++] = var240 & -(0x1 << var241) - 1;
                            continue;
                        }
                        if (var625 == 4010) {
                            var2 -= 2;
                            int var242 = field1440[var2];
                            int var243 = field1440[var2 + 1];
                            field1440[var2++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 4011) {
                            var2 -= 2;
                            int var244 = field1440[var2];
                            int var245 = field1440[var2 + 1];
                            field1440[var2++] = var244 % var245;
                            continue;
                        }
                        if (var625 == 4012) {
                            var2 -= 2;
                            int var246 = field1440[var2];
                            int var247 = field1440[var2 + 1];
                            if (var246 == 0) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var625 == 4013) {
                            var2 -= 2;
                            int var248 = field1440[var2];
                            int var249 = field1440[var2 + 1];
                            if (var248 == 0) {
                                field1440[var2++] = 0;
                            } else if (var249 == 0) {
                                field1440[var2++] = Integer.MAX_VALUE;
                            } else {
                                field1440[var2++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var625 == 4014) {
                            var2 -= 2;
                            int var250 = field1440[var2];
                            int var251 = field1440[var2 + 1];
                            field1440[var2++] = var250 & var251;
                            continue;
                        }
                        if (var625 == 4015) {
                            var2 -= 2;
                            int var252 = field1440[var2];
                            int var253 = field1440[var2 + 1];
                            field1440[var2++] = var252 | var253;
                            continue;
                        }
                        if (var625 == 4016) {
                            var2 -= 2;
                            int var254 = field1440[var2];
                            int var255 = field1440[var2 + 1];
                            field1440[var2++] = var254 < var255 ? var254 : var255;
                            continue;
                        }
                        if (var625 == 4017) {
                            var2 -= 2;
                            int var256 = field1440[var2];
                            int var257 = field1440[var2 + 1];
                            field1440[var2++] = var256 > var257 ? var256 : var257;
                            continue;
                        }
                        if (var625 == 4018) {
                            var2 -= 3;
                            long var258 = (long) field1440[var2];
                            long var260 = (long) field1440[var2 + 1];
                            long var262 = (long) field1440[var2 + 2];
                            field1440[var2++] = (int) (var258 * var262 / var260);
                            continue;
                        }
                    } else if (var625 < 4200) {
                        if (var625 == 4100) {
                            var3--;
                            String var264 = field1449[var3];
                            var2--;
                            int var265 = field1440[var2];
                            field1449[var3++] = var264 + var265;
                            continue;
                        }
                        if (var625 == 4101) {
                            var3 -= 2;
                            String var266 = field1449[var3];
                            String var267 = field1449[var3 + 1];
                            field1449[var3++] = var266 + var267;
                            continue;
                        }
                        if (var625 == 4102) {
                            var3--;
                            String var268 = field1449[var3];
                            var2--;
                            int var269 = field1440[var2];
                            field1449[var3++] = var268 + class175.method1212((byte) -123, var269, true);
                            continue;
                        }
                        if (var625 == 4103) {
                            var3--;
                            String var270 = field1449[var3];
                            field1449[var3++] = var270.toLowerCase();
                            continue;
                        }
                        if (var625 == 4104) {
                            var2--;
                            int var271 = field1440[var2];
                            long var272 = ((long) var271 + 11745L) * 86400000L;
                            field1437.setTime(new Date(var272));
                            int var274 = field1437.get(5);
                            int var275 = field1437.get(2);
                            int var276 = field1437.get(1);
                            field1449[var3++] = var274 + "-" + field1458[var275] + "-" + var276;
                            continue;
                        }
                        if (var625 == 4105) {
                            var3 -= 2;
                            String var277 = field1449[var3];
                            String var278 = field1449[var3 + 1];
                            if (class187.field2619.field5556 != null && class187.field2619.field5556.field3821) {
                                field1449[var3++] = var278;
                                continue;
                            }
                            field1449[var3++] = var277;
                            continue;
                        }
                        if (var625 == 4106) {
                            var2--;
                            int var279 = field1440[var2];
                            field1449[var3++] = Integer.toString(var279);
                            continue;
                        }
                        if (var625 == 4107) {
                            var3 -= 2;
                            field1440[var2++] = class388.method2453(class153.field2073, 32767, field1449[var3 + 1], field1449[var3]);
                            continue;
                        }
                        if (var625 == 4108) {
                            var3--;
                            String var280 = field1449[var3];
                            var2 -= 2;
                            int var281 = field1440[var2];
                            int var282 = field1440[var2 + 1];
                            class365 var283 = class378.method2393(class385.field5628, (byte) 78, 0, var282);
                            field1440[var2++] = var283.method2325(var280, class115.field1559, var281, (byte) 27);
                            continue;
                        }
                        if (var625 == 4109) {
                            var3--;
                            String var284 = field1449[var3];
                            var2 -= 2;
                            int var285 = field1440[var2];
                            int var286 = field1440[var2 + 1];
                            class365 var287 = class378.method2393(class385.field5628, (byte) 74, 0, var286);
                            field1440[var2++] = var287.method2328(var285, var284, class115.field1559, (byte) -56);
                            continue;
                        }
                        if (var625 == 4110) {
                            var3 -= 2;
                            String var288 = field1449[var3];
                            String var289 = field1449[var3 + 1];
                            var2--;
                            if (field1440[var2] == 1) {
                                field1449[var3++] = var288;
                            } else {
                                field1449[var3++] = var289;
                            }
                            continue;
                        }
                        if (var625 == 4111) {
                            var3--;
                            String var290 = field1449[var3];
                            field1449[var3++] = class51.method393((byte) -112, var290);
                            continue;
                        }
                        if (var625 == 4112) {
                            var3--;
                            String var291 = field1449[var3];
                            var2--;
                            int var292 = field1440[var2];
                            if (var292 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field1449[var3++] = var291 + (char) var292;
                            continue;
                        }
                        if (var625 == 4113) {
                            var2--;
                            int var293 = field1440[var2];
                            field1440[var2++] = class157.method1064((char) var293, (byte) -79) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4114) {
                            var2--;
                            int var294 = field1440[var2];
                            field1440[var2++] = class454.method2811(false, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4115) {
                            var2--;
                            int var295 = field1440[var2];
                            field1440[var2++] = class13.method202((char) var295, true) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4116) {
                            var2--;
                            int var296 = field1440[var2];
                            field1440[var2++] = class278.method1891(0, (char) var296) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4117) {
                            var3--;
                            String var297 = field1449[var3];
                            if (var297 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var297.length();
                            }
                            continue;
                        }
                        if (var625 == 4118) {
                            var3--;
                            String var298 = field1449[var3];
                            var2 -= 2;
                            int var299 = field1440[var2];
                            int var300 = field1440[var2 + 1];
                            field1449[var3++] = var298.substring(var299, var300);
                            continue;
                        }
                        if (var625 == 4119) {
                            var3--;
                            String var301 = field1449[var3];
                            StringBuffer var302 = new StringBuffer(var301.length());
                            boolean var303 = false;
                            for (int var304 = 0; var304 < var301.length(); var304++) {
                                char var305 = var301.charAt(var304);
                                if (var305 == '<') {
                                    var303 = true;
                                } else if (var305 == '>') {
                                    var303 = false;
                                } else if (!var303) {
                                    var302.append(var305);
                                }
                            }
                            field1449[var3++] = var302.toString();
                            continue;
                        }
                        if (var625 == 4120) {
                            var3--;
                            String var306 = field1449[var3];
                            var2 -= 2;
                            int var307 = field1440[var2];
                            int var308 = field1440[var2 + 1];
                            field1440[var2++] = var306.indexOf(var307, var308);
                            continue;
                        }
                        if (var625 == 4121) {
                            var3 -= 2;
                            String var309 = field1449[var3];
                            String var310 = field1449[var3 + 1];
                            var2--;
                            int var311 = field1440[var2];
                            field1440[var2++] = var309.indexOf(var310, var311);
                            continue;
                        }
                        if (var625 == 4122) {
                            var2--;
                            int var312 = field1440[var2];
                            field1440[var2++] = Character.toLowerCase((char) var312);
                            continue;
                        }
                        if (var625 == 4123) {
                            var2--;
                            int var313 = field1440[var2];
                            field1440[var2++] = Character.toUpperCase((char) var313);
                            continue;
                        }
                        if (var625 == 4124) {
                            var2--;
                            boolean var314 = field1440[var2] != 0;
                            var2--;
                            int var315 = field1440[var2];
                            field1449[var3++] = class380.method2405(var314, 0, class153.field2073, 0, (long) var315);
                            continue;
                        }
                        if (var625 == 4125) {
                            var3--;
                            String var316 = field1449[var3];
                            var2--;
                            int var317 = field1440[var2];
                            class365 var318 = class378.method2393(class385.field5628, (byte) 103, 0, var317);
                            field1440[var2++] = var318.method2320(class115.field1559, 114, var316);
                            continue;
                        }
                    } else if (var625 < 4300) {
                        if (var625 == 4200) {
                            var2--;
                            int var319 = field1440[var2];
                            field1449[var3++] = class157.field2119.method176((byte) -119, var319).field6145;
                            continue;
                        }
                        if (var625 == 4201) {
                            var2 -= 2;
                            int var320 = field1440[var2];
                            int var321 = field1440[var2 + 1];
                            class427 var322 = class157.field2119.method176((byte) -54, var320);
                            if (var321 >= 1 && var321 <= 5 && var322.field6158[var321 - 1] != null) {
                                field1449[var3++] = var322.field6158[var321 - 1];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 4202) {
                            var2 -= 2;
                            int var323 = field1440[var2];
                            int var324 = field1440[var2 + 1];
                            class427 var325 = class157.field2119.method176((byte) -39, var323);
                            if (var324 >= 1 && var324 <= 5 && var325.field6213[var324 - 1] != null) {
                                field1449[var3++] = var325.field6213[var324 - 1];
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 4203) {
                            var2--;
                            int var326 = field1440[var2];
                            field1440[var2++] = class157.field2119.method176((byte) -63, var326).field6181;
                            continue;
                        }
                        if (var625 == 4204) {
                            var2--;
                            int var327 = field1440[var2];
                            field1440[var2++] = class157.field2119.method176((byte) -120, var327).field6165 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4205) {
                            var2--;
                            int var328 = field1440[var2];
                            class427 var329 = class157.field2119.method176((byte) -101, var328);
                            if (var329.field6178 == -1 && var329.field6190 >= 0) {
                                field1440[var2++] = var329.field6190;
                                continue;
                            }
                            field1440[var2++] = var328;
                            continue;
                        }
                        if (var625 == 4206) {
                            var2--;
                            int var330 = field1440[var2];
                            class427 var331 = class157.field2119.method176((byte) -126, var330);
                            if (var331.field6178 >= 0 && var331.field6190 >= 0) {
                                field1440[var2++] = var331.field6190;
                                continue;
                            }
                            field1440[var2++] = var330;
                            continue;
                        }
                        if (var625 == 4207) {
                            var2--;
                            int var332 = field1440[var2];
                            field1440[var2++] = class157.field2119.method176((byte) -65, var332).field6197 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4208) {
                            var2 -= 2;
                            int var333 = field1440[var2];
                            int var334 = field1440[var2 + 1];
                            class294 var335 = class320.method2109(var334, (byte) -107);
                            if (var335.method1953((byte) 88)) {
                                field1449[var3++] = class157.field2119.method176((byte) -76, var333).method2622(var335.field4273, var334, -22048);
                            } else {
                                field1440[var2++] = class157.field2119.method176((byte) -89, var333).method2627(var335.field4270, 128, var334);
                            }
                            continue;
                        }
                        if (var625 == 4209) {
                            var2 -= 2;
                            int var336 = field1440[var2];
                            int var337 = field1440[var2 + 1] - 1;
                            class427 var338 = class157.field2119.method176((byte) -112, var336);
                            if (var338.field6191 == var337) {
                                field1440[var2++] = var338.field6164;
                            } else if (var338.field6160 == var337) {
                                field1440[var2++] = var338.field6214;
                            } else {
                                field1440[var2++] = -1;
                            }
                            continue;
                        }
                        if (var625 == 4210) {
                            var3--;
                            String var339 = field1449[var3];
                            var2--;
                            int var340 = field1440[var2];
                            class175.method1215(false, var339, var340 == 1);
                            field1440[var2++] = class127.field1684;
                            continue;
                        }
                        if (var625 == 4211) {
                            if (class92.field1137 != null && class178.field2512 < class127.field1684) {
                                field1440[var2++] = class92.field1137[class178.field2512++] & 0xFFFF;
                                continue;
                            }
                            field1440[var2++] = -1;
                            continue;
                        }
                        if (var625 == 4212) {
                            class178.field2512 = 0;
                            continue;
                        }
                    } else if (var625 < 4400) {
                        if (var625 == 4300) {
                            var2 -= 2;
                            int var341 = field1440[var2];
                            int var342 = field1440[var2 + 1];
                            class294 var343 = class320.method2109(var342, (byte) -119);
                            if (var343.method1953((byte) 88)) {
                                field1449[var3++] = class295.method1963(119, var341).method2141(10, var343.field4273, var342);
                            } else {
                                field1440[var2++] = class295.method1963(103, var341).method2135((byte) 20, var343.field4270, var342);
                            }
                            continue;
                        }
                    } else if (var625 < 4500) {
                        if (var625 == 4400) {
                            var2 -= 2;
                            int var344 = field1440[var2];
                            int var345 = field1440[var2 + 1];
                            class294 var346 = class320.method2109(var345, (byte) -115);
                            if (var346.method1953((byte) 88)) {
                                field1449[var3++] = class450.method2785(var344, (byte) 87).method1241(var346.field4273, var345, 2);
                            } else {
                                field1440[var2++] = class450.method2785(var344, (byte) 103).method1232(-36, var345, var346.field4270);
                            }
                            continue;
                        }
                    } else if (var625 < 4600) {
                        if (var625 == 4500) {
                            var2 -= 2;
                            int var347 = field1440[var2];
                            int var348 = field1440[var2 + 1];
                            class294 var349 = class320.method2109(var348, (byte) -96);
                            if (var349.method1953((byte) 88)) {
                                field1449[var3++] = class132.method885(var347, -1).method2270(4, var349.field4273, var348);
                            } else {
                                field1440[var2++] = class132.method885(var347, -1).method2266(var348, var349.field4270, false);
                            }
                            continue;
                        }
                    } else if (var625 < 4700) {
                        if (var625 == 4600) {
                            var2--;
                            int var350 = field1440[var2];
                            class446 var351 = class286.method1923((byte) 59, var350);
                            if (var351.field6532 != null && var351.field6532.length > 0) {
                                int var352 = 0;
                                int var353 = var351.field6497[0];
                                for (int var354 = 1; var354 < var351.field6532.length; var354++) {
                                    if (var351.field6497[var354] > var353) {
                                        var352 = var354;
                                        var353 = var351.field6497[var354];
                                    }
                                }
                                field1440[var2++] = var351.field6532[var352];
                                continue;
                            }
                            field1440[var2++] = var351.field6521;
                            continue;
                        }
                    } else if (var625 < 5100) {
                        if (var625 == 5000) {
                            field1440[var2++] = class195.field2749;
                            continue;
                        }
                        if (var625 == 5001) {
                            var2 -= 3;
                            class195.field2749 = field1440[var2];
                            class86.field1069 = field1440[var2 + 1];
                            class266.field3955 = field1440[var2 + 2];
                            field1448++;
                            class257.method1773((byte) -10, class184.field2597);
                            class159.field2132.method1727(-128, class195.field2749);
                            class159.field2132.method1727(-128, class86.field1069);
                            class159.field2132.method1727(-128, class266.field3955);
                            continue;
                        }
                        if (var625 == 5002) {
                            var3 -= 2;
                            String var355 = field1449[var3];
                            String var356 = field1449[var3 + 1];
                            var2 -= 2;
                            int var357 = field1440[var2];
                            int var358 = field1440[var2 + 1];
                            if (var356 == null) {
                                var356 = "";
                            }
                            if (var356.length() > 80) {
                                var356 = var356.substring(0, 80);
                            }
                            field1452++;
                            class257.method1773((byte) -10, class458.field6777);
                            class159.field2132.method1727(-128, class248.method1646(var355, (byte) -109) + class248.method1646(var356, (byte) -52) + 2);
                            class159.field2132.method1712(var355, 98);
                            class159.field2132.method1727(-128, var357 - 1);
                            class159.field2132.method1727(-128, var358);
                            class159.field2132.method1712(var356, 89);
                            continue;
                        }
                        if (var625 == 5003) {
                            var2--;
                            int var359 = field1440[var2];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = class455.field6732[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field1449[var3++] = var360;
                            continue;
                        }
                        if (var625 == 5004) {
                            var2--;
                            int var361 = field1440[var2];
                            int var362 = -1;
                            if (var361 < 100 && class455.field6732[var361] != null) {
                                var362 = class256.field3785[var361];
                            }
                            field1440[var2++] = var362;
                            continue;
                        }
                        if (var625 == 5005) {
                            field1440[var2++] = class86.field1069;
                            continue;
                        }
                        if (var625 == 5008) {
                            var3--;
                            String var363 = field1449[var3];
                            if (class42.field564 == 0 && (class236.field3523 && !class395.field5747 || class74.field943)) {
                                continue;
                            }
                            String var364 = var363.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class336.field4963.method2543(false, 0))) {
                                var365 = 0;
                                var363 = var363.substring(class336.field4963.method2543(false, 0).length());
                            } else if (var364.startsWith(class13.field225.method2543(false, 0))) {
                                var365 = 1;
                                var363 = var363.substring(class13.field225.method2543(false, 0).length());
                            } else if (var364.startsWith(class401.field5800.method2543(false, 0))) {
                                var365 = 2;
                                var363 = var363.substring(class401.field5800.method2543(false, 0).length());
                            } else if (var364.startsWith(class33.field471.method2543(false, 0))) {
                                var365 = 3;
                                var363 = var363.substring(class33.field471.method2543(false, 0).length());
                            } else if (var364.startsWith(class177.field2450.method2543(false, 0))) {
                                var365 = 4;
                                var363 = var363.substring(class177.field2450.method2543(false, 0).length());
                            } else if (var364.startsWith(class464.field6836.method2543(false, 0))) {
                                var365 = 5;
                                var363 = var363.substring(class464.field6836.method2543(false, 0).length());
                            } else if (var364.startsWith(class170.field2222.method2543(false, 0))) {
                                var365 = 6;
                                var363 = var363.substring(class170.field2222.method2543(false, 0).length());
                            } else if (var364.startsWith(class118.field1588.method2543(false, 0))) {
                                var365 = 7;
                                var363 = var363.substring(class118.field1588.method2543(false, 0).length());
                            } else if (var364.startsWith(class247.field3645.method2543(false, 0))) {
                                var365 = 8;
                                var363 = var363.substring(class247.field3645.method2543(false, 0).length());
                            } else if (var364.startsWith(class368.field5317.method2543(false, 0))) {
                                var365 = 9;
                                var363 = var363.substring(class368.field5317.method2543(false, 0).length());
                            } else if (var364.startsWith(class143.field1943.method2543(false, 0))) {
                                var365 = 10;
                                var363 = var363.substring(class143.field1943.method2543(false, 0).length());
                            } else if (var364.startsWith(class136.field1859.method2543(false, 0))) {
                                var365 = 11;
                                var363 = var363.substring(class136.field1859.method2543(false, 0).length());
                            } else if (class153.field2073 != 0) {
                                if (var364.startsWith(class336.field4963.method2543(false, class153.field2073))) {
                                    var365 = 0;
                                    var363 = var363.substring(class336.field4963.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class13.field225.method2543(false, class153.field2073))) {
                                    var365 = 1;
                                    var363 = var363.substring(class13.field225.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class401.field5800.method2543(false, class153.field2073))) {
                                    var365 = 2;
                                    var363 = var363.substring(class401.field5800.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class33.field471.method2543(false, class153.field2073))) {
                                    var365 = 3;
                                    var363 = var363.substring(class33.field471.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class177.field2450.method2543(false, class153.field2073))) {
                                    var365 = 4;
                                    var363 = var363.substring(class177.field2450.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class464.field6836.method2543(false, class153.field2073))) {
                                    var365 = 5;
                                    var363 = var363.substring(class464.field6836.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class170.field2222.method2543(false, class153.field2073))) {
                                    var365 = 6;
                                    var363 = var363.substring(class170.field2222.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class118.field1588.method2543(false, class153.field2073))) {
                                    var365 = 7;
                                    var363 = var363.substring(class118.field1588.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class247.field3645.method2543(false, class153.field2073))) {
                                    var365 = 8;
                                    var363 = var363.substring(class247.field3645.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class368.field5317.method2543(false, class153.field2073))) {
                                    var365 = 9;
                                    var363 = var363.substring(class368.field5317.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class143.field1943.method2543(false, class153.field2073))) {
                                    var365 = 10;
                                    var363 = var363.substring(class143.field1943.method2543(false, class153.field2073).length());
                                } else if (var364.startsWith(class136.field1859.method2543(false, class153.field2073))) {
                                    var365 = 11;
                                    var363 = var363.substring(class136.field1859.method2543(false, class153.field2073).length());
                                }
                            }
                            String var366 = var363.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class245.field3621.method2543(false, 0))) {
                                var367 = 1;
                                var363 = var363.substring(class245.field3621.method2543(false, 0).length());
                            } else if (var366.startsWith(class282.field4145.method2543(false, 0))) {
                                var367 = 2;
                                var363 = var363.substring(class282.field4145.method2543(false, 0).length());
                            } else if (var366.startsWith(class247.field3646.method2543(false, 0))) {
                                var367 = 3;
                                var363 = var363.substring(class247.field3646.method2543(false, 0).length());
                            } else if (var366.startsWith(class327.field4878.method2543(false, 0))) {
                                var367 = 4;
                                var363 = var363.substring(class327.field4878.method2543(false, 0).length());
                            } else if (var366.startsWith(class11.field149.method2543(false, 0))) {
                                var367 = 5;
                                var363 = var363.substring(class11.field149.method2543(false, 0).length());
                            } else if (class153.field2073 != 0) {
                                if (var366.startsWith(class245.field3621.method2543(false, class153.field2073))) {
                                    var367 = 1;
                                    var363 = var363.substring(class245.field3621.method2543(false, class153.field2073).length());
                                } else if (var366.startsWith(class282.field4145.method2543(false, class153.field2073))) {
                                    var367 = 2;
                                    var363 = var363.substring(class282.field4145.method2543(false, class153.field2073).length());
                                } else if (var366.startsWith(class247.field3646.method2543(false, class153.field2073))) {
                                    var367 = 3;
                                    var363 = var363.substring(class247.field3646.method2543(false, class153.field2073).length());
                                } else if (var366.startsWith(class327.field4878.method2543(false, class153.field2073))) {
                                    var367 = 4;
                                    var363 = var363.substring(class327.field4878.method2543(false, class153.field2073).length());
                                } else if (var366.startsWith(class11.field149.method2543(false, class153.field2073))) {
                                    var367 = 5;
                                    var363 = var363.substring(class11.field149.method2543(false, class153.field2073).length());
                                }
                            }
                            field1447++;
                            class257.method1773((byte) -10, class421.field6093);
                            class159.field2132.method1727(-128, 0);
                            int var368 = class159.field2132.field3762;
                            class159.field2132.method1727(-128, var365);
                            class159.field2132.method1727(-128, var367);
                            class76.method534(class159.field2132, var363, 105);
                            class159.field2132.method1753(class159.field2132.field3762 - var368, (byte) -120);
                            continue;
                        }
                        if (var625 == 5009) {
                            var3 -= 2;
                            String var369 = field1449[var3];
                            String var370 = field1449[var3 + 1];
                            if (class42.field564 != 0 || (!class236.field3523 || class395.field5747) && !class74.field943) {
                                field1457++;
                                class257.method1773((byte) -10, class192.field2687);
                                class159.field2132.method1727(-128, 0);
                                int var371 = class159.field2132.field3762;
                                class159.field2132.method1712(var369, -25);
                                class76.method534(class159.field2132, var370, 114);
                                class159.field2132.method1753(class159.field2132.field3762 - var371, (byte) -125);
                            }
                            continue;
                        }
                        if (var625 == 5010) {
                            var2--;
                            int var372 = field1440[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class146.field1981[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field1449[var3++] = var373;
                            continue;
                        }
                        if (var625 == 5011) {
                            var2--;
                            int var374 = field1440[var2];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = class303.field4439[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field1449[var3++] = var375;
                            continue;
                        }
                        if (var625 == 5012) {
                            var2--;
                            int var376 = field1440[var2];
                            int var377 = -1;
                            if (var376 < 100) {
                                var377 = class234.field3513[var376];
                            }
                            field1440[var2++] = var377;
                            continue;
                        }
                        if (var625 == 5015) {
                            String var378;
                            if (class187.field2619 == null || class187.field2619.field5572 == null) {
                                var378 = class216.field3087;
                            } else {
                                var378 = class187.field2619.method2408(-119, true);
                            }
                            field1449[var3++] = var378;
                            continue;
                        }
                        if (var625 == 5016) {
                            field1440[var2++] = class266.field3955;
                            continue;
                        }
                        if (var625 == 5017) {
                            field1440[var2++] = class9.field124;
                            continue;
                        }
                        if (var625 == 5018) {
                            var2--;
                            int var379 = field1440[var2];
                            int var380 = 0;
                            if (var379 < 100 && class455.field6732[var379] != null) {
                                var380 = class256.field3785[var379];
                            }
                            field1440[var2++] = var380;
                            continue;
                        }
                        if (var625 == 5019) {
                            var2--;
                            int var381 = field1440[var2];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = class332.field4932[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field1449[var3++] = var382;
                            continue;
                        }
                        if (var625 == 5020) {
                            String var383;
                            if (class187.field2619 == null || class187.field2619.field5572 == null) {
                                var383 = class216.field3087;
                            } else {
                                var383 = class187.field2619.method2412(false, -1);
                            }
                            field1449[var3++] = var383;
                            continue;
                        }
                        if (var625 == 5050) {
                            var2--;
                            int var384 = field1440[var2];
                            field1449[var3++] = class38.method339((byte) 125, var384).field5118;
                            continue;
                        }
                        if (var625 == 5051) {
                            var2--;
                            int var385 = field1440[var2];
                            class349 var386 = class38.method339((byte) 107, var385);
                            if (var386.field5123 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var386.field5123.length;
                            }
                            continue;
                        }
                        if (var625 == 5052) {
                            var2 -= 2;
                            int var387 = field1440[var2];
                            int var388 = field1440[var2 + 1];
                            class349 var389 = class38.method339((byte) -84, var387);
                            int var390 = var389.field5123[var388];
                            field1440[var2++] = var390;
                            continue;
                        }
                        if (var625 == 5053) {
                            var2--;
                            int var391 = field1440[var2];
                            class349 var392 = class38.method339((byte) -108, var391);
                            if (var392.field5127 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var392.field5127.length;
                            }
                            continue;
                        }
                        if (var625 == 5054) {
                            var2 -= 2;
                            int var393 = field1440[var2];
                            int var394 = field1440[var2 + 1];
                            field1440[var2++] = class38.method339((byte) 101, var393).field5127[var394];
                            continue;
                        }
                        if (var625 == 5055) {
                            var2--;
                            int var395 = field1440[var2];
                            field1449[var3++] = class51.method399((byte) -28, var395).method1032(1);
                            continue;
                        }
                        if (var625 == 5056) {
                            var2--;
                            int var396 = field1440[var2];
                            class150 var397 = class51.method399((byte) -28, var396);
                            if (var397.field2034 == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var397.field2034.length;
                            }
                            continue;
                        }
                        if (var625 == 5057) {
                            var2 -= 2;
                            int var398 = field1440[var2];
                            int var399 = field1440[var2 + 1];
                            field1440[var2++] = class51.method399((byte) -28, var398).field2034[var399];
                            continue;
                        }
                        if (var625 == 5058) {
                            field1441 = new class141();
                            var2--;
                            field1441.field1923 = field1440[var2];
                            field1441.field1925 = class51.method399((byte) -28, field1441.field1923);
                            field1441.field1920 = new int[field1441.field1925.method1031((byte) 121)];
                            continue;
                        }
                        if (var625 == 5059) {
                            field1446++;
                            class257.method1773((byte) -10, class325.field4784);
                            class159.field2132.method1727(-128, 0);
                            int var400 = class159.field2132.field3762;
                            class159.field2132.method1727(-128, 0);
                            class159.field2132.method1750((byte) 0, field1441.field1923);
                            field1441.field1925.method1029(false, field1441.field1920, class159.field2132);
                            class159.field2132.method1753(class159.field2132.field3762 - var400, (byte) -7);
                            continue;
                        }
                        if (var625 == 5060) {
                            var3--;
                            String var401 = field1449[var3];
                            field1443++;
                            class257.method1773((byte) -10, class343.field5045);
                            class159.field2132.method1727(-128, 0);
                            int var402 = class159.field2132.field3762;
                            class159.field2132.method1712(var401, -61);
                            class159.field2132.method1750((byte) 0, field1441.field1923);
                            field1441.field1925.method1029(false, field1441.field1920, class159.field2132);
                            class159.field2132.method1753(class159.field2132.field3762 - var402, (byte) 52);
                            continue;
                        }
                        if (var625 == 5061) {
                            field1446++;
                            class257.method1773((byte) -10, class325.field4784);
                            class159.field2132.method1727(-128, 0);
                            int var403 = class159.field2132.field3762;
                            class159.field2132.method1727(-128, 1);
                            class159.field2132.method1750((byte) 0, field1441.field1923);
                            field1441.field1925.method1029(false, field1441.field1920, class159.field2132);
                            class159.field2132.method1753(class159.field2132.field3762 - var403, (byte) 42);
                            continue;
                        }
                        if (var625 == 5062) {
                            var2 -= 2;
                            int var404 = field1440[var2];
                            int var405 = field1440[var2 + 1];
                            field1440[var2++] = class38.method339((byte) 117, var404).field5122[var405];
                            continue;
                        }
                        if (var625 == 5063) {
                            var2 -= 2;
                            int var406 = field1440[var2];
                            int var407 = field1440[var2 + 1];
                            field1440[var2++] = class38.method339((byte) -78, var406).field5120[var407];
                            continue;
                        }
                        if (var625 == 5064) {
                            var2 -= 2;
                            int var408 = field1440[var2];
                            int var409 = field1440[var2 + 1];
                            if (var409 == -1) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = class38.method339((byte) -98, var408).method2249((char) var409, -1);
                            }
                            continue;
                        }
                        if (var625 == 5065) {
                            var2 -= 2;
                            int var410 = field1440[var2];
                            int var411 = field1440[var2 + 1];
                            if (var411 == -1) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = class38.method339((byte) 126, var410).method2247(0, (char) var411);
                            }
                            continue;
                        }
                        if (var625 == 5066) {
                            var2--;
                            int var412 = field1440[var2];
                            field1440[var2++] = class51.method399((byte) -28, var412).method1031((byte) 112);
                            continue;
                        }
                        if (var625 == 5067) {
                            var2 -= 2;
                            int var413 = field1440[var2];
                            int var414 = field1440[var2 + 1];
                            int var415 = class51.method399((byte) -28, var413).method1033(var414, (byte) -75);
                            field1440[var2++] = var415;
                            continue;
                        }
                        if (var625 == 5068) {
                            var2 -= 2;
                            int var416 = field1440[var2];
                            int var417 = field1440[var2 + 1];
                            field1441.field1920[var416] = var417;
                            continue;
                        }
                        if (var625 == 5069) {
                            var2 -= 2;
                            int var418 = field1440[var2];
                            int var419 = field1440[var2 + 1];
                            field1441.field1920[var418] = var419;
                            continue;
                        }
                        if (var625 == 5070) {
                            var2 -= 3;
                            int var420 = field1440[var2];
                            int var421 = field1440[var2 + 1];
                            int var422 = field1440[var2 + 2];
                            class150 var423 = class51.method399((byte) -28, var420);
                            if (var423.method1033(var421, (byte) 73) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field1440[var2++] = var423.method1026((byte) 103, var421, var422);
                            continue;
                        }
                        if (var625 == 5071) {
                            var3--;
                            String var424 = field1449[var3];
                            var2--;
                            boolean var425 = field1440[var2] == 1;
                            class247.method1636(98, var425, var424);
                            field1440[var2++] = class127.field1684;
                            continue;
                        }
                        if (var625 == 5072) {
                            if (class92.field1137 != null && class178.field2512 < class127.field1684) {
                                field1440[var2++] = class92.field1137[class178.field2512++] & 0xFFFF;
                                continue;
                            }
                            field1440[var2++] = -1;
                            continue;
                        }
                        if (var625 == 5073) {
                            class178.field2512 = 0;
                            continue;
                        }
                    } else if (var625 < 5200) {
                        if (var625 == 5100) {
                            if (class436.field6368.method256(-82, 86)) {
                                field1440[var2++] = 1;
                            } else {
                                field1440[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5101) {
                            if (class436.field6368.method256(-90, 82)) {
                                field1440[var2++] = 1;
                            } else {
                                field1440[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5102) {
                            if (class436.field6368.method256(-127, 81)) {
                                field1440[var2++] = 1;
                            } else {
                                field1440[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var625 < 5300) {
                        if (var625 == 5200) {
                            var2--;
                            class371.method2360(-27751, field1440[var2]);
                            continue;
                        }
                        if (var625 == 5201) {
                            field1440[var2++] = class283.method1908(-121);
                            continue;
                        }
                        if (var625 == 5205) {
                            var2--;
                            class296.method1970(-1, false, field1440[var2], (byte) 92, -1);
                            continue;
                        }
                        if (var625 == 5206) {
                            var2--;
                            int var426 = field1440[var2];
                            class239 var427 = class66.method480(var426 >> 14 & 0x3FFF, var426 & 0x3FFF);
                            if (var427 == null) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = var427.field3541;
                            }
                            continue;
                        }
                        if (var625 == 5207) {
                            var2--;
                            class239 var428 = class66.method492(field1440[var2]);
                            if (var428 != null && var428.field3544 != null) {
                                field1449[var3++] = var428.field3544;
                                continue;
                            }
                            field1449[var3++] = "";
                            continue;
                        }
                        if (var625 == 5208) {
                            field1440[var2++] = class109.field1481;
                            field1440[var2++] = class233.field3493;
                            continue;
                        }
                        if (var625 == 5209) {
                            field1440[var2++] = class66.field870 + class344.field5064;
                            field1440[var2++] = class66.field860 + class134.field1843;
                            continue;
                        }
                        if (var625 == 5210) {
                            var2--;
                            int var429 = field1440[var2];
                            class239 var430 = class66.method492(var429);
                            if (var430 == null) {
                                field1440[var2++] = 0;
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var430.field3552 >> 14 & 0x3FFF;
                                field1440[var2++] = var430.field3552 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var625 == 5211) {
                            var2--;
                            int var431 = field1440[var2];
                            class239 var432 = class66.method492(var431);
                            if (var432 == null) {
                                field1440[var2++] = 0;
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var432.field3547 - var432.field3557;
                                field1440[var2++] = var432.field3555 - var432.field3550;
                            }
                            continue;
                        }
                        if (var625 == 5212) {
                            class376 var433 = class421.method2598(120);
                            if (var433 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = var433.field5483;
                                int var434 = var433.field5495 << 28 | class66.field870 + var433.field5484 << 14 | class66.field860 + var433.field5497;
                                field1440[var2++] = var434;
                            }
                            continue;
                        }
                        if (var625 == 5213) {
                            class376 var435 = class227.method1557(112);
                            if (var435 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = var435.field5483;
                                int var436 = var435.field5495 << 28 | class66.field870 + var435.field5484 << 14 | class66.field860 + var435.field5497;
                                field1440[var2++] = var436;
                            }
                            continue;
                        }
                        if (var625 == 5214) {
                            var2--;
                            int var437 = field1440[var2];
                            class239 var438 = class104.method726(-279);
                            if (var438 != null) {
                                boolean var439 = var438.method1610((byte) -127, var437 & 0x3FFF, var437 >> 28 & 0x3, field1459, var437 >> 14 & 0x3FFF);
                                if (var439) {
                                    class400.method2502(-128, field1459[1], field1459[2]);
                                }
                            }
                            continue;
                        }
                        if (var625 == 5215) {
                            var2 -= 2;
                            int var440 = field1440[var2];
                            int var441 = field1440[var2 + 1];
                            class15 var442 = class66.method487(var440 >> 14 & 0x3FFF, var440 & 0x3FFF);
                            boolean var443 = false;
                            for (class239 var444 = (class239) var442.method209(28); var444 != null; var444 = (class239) var442.method217(-27864)) {
                                if (var444.field3541 == var441) {
                                    var443 = true;
                                    break;
                                }
                            }
                            if (var443) {
                                field1440[var2++] = 1;
                            } else {
                                field1440[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5218) {
                            var2--;
                            int var445 = field1440[var2];
                            class239 var446 = class66.method492(var445);
                            if (var446 == null) {
                                field1440[var2++] = -1;
                            } else {
                                field1440[var2++] = var446.field3556;
                            }
                            continue;
                        }
                        if (var625 == 5220) {
                            field1440[var2++] = class41.field549 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5221) {
                            var2--;
                            int var447 = field1440[var2];
                            class400.method2502(-118, var447 >> 14 & 0x3FFF, var447 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5222) {
                            class239 var448 = class104.method726(-279);
                            if (var448 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = -1;
                            } else {
                                boolean var449 = var448.method1611(class66.field860 + class134.field1843, class66.field870 + class344.field5064, 0, field1459);
                                if (var449) {
                                    field1440[var2++] = field1459[1];
                                    field1440[var2++] = field1459[2];
                                } else {
                                    field1440[var2++] = -1;
                                    field1440[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5223) {
                            var2 -= 2;
                            int var450 = field1440[var2];
                            int var451 = field1440[var2 + 1];
                            class296.method1970(var451 >> 14 & 0x3FFF, false, var450, (byte) 92, var451 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5224) {
                            var2--;
                            int var452 = field1440[var2];
                            class239 var453 = class104.method726(-279);
                            if (var453 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = -1;
                            } else {
                                boolean var454 = var453.method1610((byte) -127, var452 & 0x3FFF, var452 >> 28 & 0x3, field1459, var452 >> 14 & 0x3FFF);
                                if (var454) {
                                    field1440[var2++] = field1459[1];
                                    field1440[var2++] = field1459[2];
                                } else {
                                    field1440[var2++] = -1;
                                    field1440[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5225) {
                            var2--;
                            int var455 = field1440[var2];
                            class239 var456 = class104.method726(-279);
                            if (var456 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = -1;
                            } else {
                                boolean var457 = var456.method1611(var455 & 0x3FFF, var455 >> 14 & 0x3FFF, 0, field1459);
                                if (var457) {
                                    field1440[var2++] = field1459[1];
                                    field1440[var2++] = field1459[2];
                                } else {
                                    field1440[var2++] = -1;
                                    field1440[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5226) {
                            var2--;
                            class316.method2085(-112, field1440[var2]);
                            continue;
                        }
                        if (var625 == 5227) {
                            var2 -= 2;
                            int var458 = field1440[var2];
                            int var459 = field1440[var2 + 1];
                            class296.method1970(var459 >> 14 & 0x3FFF, true, var458, (byte) 92, var459 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5228) {
                            var2--;
                            class7.field101 = field1440[var2] == 1;
                            continue;
                        }
                        if (var625 == 5229) {
                            field1440[var2++] = class7.field101 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5230) {
                            var2--;
                            int var460 = field1440[var2];
                            class155.method1056(123, var460);
                            continue;
                        }
                        if (var625 == 5231) {
                            var2 -= 2;
                            int var461 = field1440[var2];
                            boolean var462 = field1440[var2 + 1] == 1;
                            if (class465.field6847 == null) {
                                continue;
                            }
                            class264 var463 = class465.field6847.method609((long) var461, 107);
                            if (var463 != null && !var462) {
                                var463.method1820(-25246);
                                continue;
                            }
                            if (var463 == null && var462) {
                                class264 var464 = new class264();
                                class465.field6847.method606(1, var464, (long) var461);
                            }
                            continue;
                        }
                        if (var625 == 5232) {
                            var2--;
                            int var465 = field1440[var2];
                            if (class465.field6847 == null) {
                                field1440[var2++] = 0;
                            } else {
                                class264 var466 = class465.field6847.method609((long) var465, 89);
                                field1440[var2++] = var466 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5233) {
                            var2 -= 2;
                            int var467 = field1440[var2];
                            boolean var468 = field1440[var2 + 1] == 1;
                            if (class188.field2633 == null) {
                                continue;
                            }
                            class264 var469 = class188.field2633.method609((long) var467, 73);
                            if (var469 != null && !var468) {
                                var469.method1820(-25246);
                                continue;
                            }
                            if (var469 == null && var468) {
                                class264 var470 = new class264();
                                class188.field2633.method606(1, var470, (long) var467);
                            }
                            continue;
                        }
                        if (var625 == 5234) {
                            var2--;
                            int var471 = field1440[var2];
                            if (class188.field2633 == null) {
                                field1440[var2++] = 0;
                            } else {
                                class264 var472 = class188.field2633.method609((long) var471, 66);
                                field1440[var2++] = var472 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5235) {
                            field1440[var2++] = class66.field848 == null ? -1 : class66.field848.field3541;
                            continue;
                        }
                    } else if (var625 < 5400) {
                        if (var625 == 5300) {
                            var2 -= 2;
                            int var473 = field1440[var2];
                            int var474 = field1440[var2 + 1];
                            class370.method2358(3, var473, var474, false, -4);
                            field1440[var2++] = class359.field5222 == null ? 0 : 1;
                            continue;
                        }
                        if (var625 == 5301) {
                            if (class359.field5222 != null) {
                                class370.method2358(class223.field3361, -1, -1, false, -4);
                            }
                            continue;
                        }
                        if (var625 == 5302) {
                            class429[] var475 = class92.method625(768);
                            field1440[var2++] = var475.length;
                            continue;
                        }
                        if (var625 == 5303) {
                            var2--;
                            int var476 = field1440[var2];
                            class429[] var477 = class92.method625(768);
                            field1440[var2++] = var477[var476].field6234;
                            field1440[var2++] = var477[var476].field6235;
                            continue;
                        }
                        if (var625 == 5305) {
                            int var478 = class189.field2643;
                            int var479 = class10.field134;
                            int var480 = -1;
                            class429[] var481 = class92.method625(768);
                            for (int var482 = 0; var482 < var481.length; var482++) {
                                class429 var483 = var481[var482];
                                if (var483.field6234 == var478 && var483.field6235 == var479) {
                                    var480 = var482;
                                    break;
                                }
                            }
                            field1440[var2++] = var480;
                            continue;
                        }
                        if (var625 == 5306) {
                            field1440[var2++] = class329.method2151(0);
                            continue;
                        }
                        if (var625 == 5307) {
                            var2--;
                            int var484 = field1440[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class370.method2358(var484, -1, -1, false, -4);
                            }
                            continue;
                        }
                        if (var625 == 5308) {
                            field1440[var2++] = class223.field3361;
                            continue;
                        }
                        if (var625 == 5309) {
                            var2--;
                            int var485 = field1440[var2];
                            if (var485 >= 1 && var485 <= 2) {
                                class223.field3361 = var485;
                                class53.method414(class267.field3963, true);
                            }
                            continue;
                        }
                    } else if (var625 < 5500) {
                        if (var625 == 5400) {
                            var3 -= 2;
                            String var486 = field1449[var3];
                            String var487 = field1449[var3 + 1];
                            var2--;
                            int var488 = field1440[var2];
                            field1436++;
                            class257.method1773((byte) -10, class58.field713);
                            class159.field2132.method1727(-128, class248.method1646(var486, (byte) -98) + class248.method1646(var487, (byte) 96) + 1);
                            class159.field2132.method1712(var486, 107);
                            class159.field2132.method1712(var487, 116);
                            class159.field2132.method1727(-128, var488);
                            continue;
                        }
                        if (var625 == 5401) {
                            var2 -= 2;
                            class213.field3007[field1440[var2]] = (short) class289.method1932(field1440[var2 + 1], true);
                            class157.field2119.method183((byte) 117);
                            class157.field2119.method180(-92);
                            class35.method327((byte) 121);
                            class234.method1587((byte) -85);
                            class51.method400(-71);
                            continue;
                        }
                        if (var625 == 5405) {
                            var2 -= 2;
                            int var489 = field1440[var2];
                            int var490 = field1440[var2 + 1];
                            if (var489 >= 0 && var489 < 2) {
                                class118.field1592[var489] = new int[var490 << 1][4];
                            }
                            continue;
                        }
                        if (var625 == 5406) {
                            var2 -= 7;
                            int var491 = field1440[var2];
                            int var492 = field1440[var2 + 1] << 1;
                            int var493 = field1440[var2 + 2];
                            int var494 = field1440[var2 + 3];
                            int var495 = field1440[var2 + 4];
                            int var496 = field1440[var2 + 5];
                            int var497 = field1440[var2 + 6];
                            if (var491 >= 0 && var491 < 2 && class118.field1592[var491] != null && var492 >= 0 && var492 < class118.field1592[var491].length) {
                                class118.field1592[var491][var492] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128, var497 };
                                class118.field1592[var491][var492 + 1] = new int[] { (var495 >> 14 & 0x3FFF) * 128, var496, (var495 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var625 == 5407) {
                            var2--;
                            int var498 = class118.field1592[field1440[var2]].length >> 1;
                            field1440[var2++] = var498;
                            continue;
                        }
                        if (var625 == 5411) {
                            if (class359.field5222 != null) {
                                class370.method2358(class223.field3361, -1, -1, false, -4);
                            }
                            if (class279.field4116 == null) {
                                String var499 = class82.field1009 == null ? class188.method1286((byte) 83) : class82.field1009;
                                class69.method510(class267.field3963, false, var499, class118.field1594 == 1, 2);
                            } else {
                                class387.method2445(-22716);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var625 == 5419) {
                            String var500 = "";
                            if (class308.field4551 != null) {
                                if (class308.field4551.field5129 == null) {
                                    var500 = class376.method2381(-72770111, class308.field4551.field5132);
                                } else {
                                    var500 = (String) class308.field4551.field5129;
                                }
                            }
                            field1449[var3++] = var500;
                            continue;
                        }
                        if (var625 == 5420) {
                            field1440[var2++] = class341.field5007 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5421) {
                            if (class359.field5222 != null) {
                                class370.method2358(class223.field3361, -1, -1, false, -4);
                            }
                            var3--;
                            String var501 = field1449[var3];
                            var2--;
                            boolean var502 = field1440[var2] == 1;
                            String var503 = class188.method1286((byte) -120) + var501;
                            class69.method510(class267.field3963, var502, var503, class118.field1594 == 1, 2);
                            continue;
                        }
                        if (var625 == 5422) {
                            var3 -= 2;
                            String var504 = field1449[var3];
                            String var505 = field1449[var3 + 1];
                            var2--;
                            int var506 = field1440[var2];
                            if (var504.length() > 0) {
                                if (class452.field6673 == null) {
                                    class452.field6673 = new String[class36.field509[class408.field5869.field1478]];
                                }
                                class452.field6673[var506] = var504;
                            }
                            if (var505.length() > 0) {
                                if (class209.field2948 == null) {
                                    class209.field2948 = new String[class36.field509[class408.field5869.field1478]];
                                }
                                class209.field2948[var506] = var505;
                            }
                            continue;
                        }
                        if (var625 == 5423) {
                            var3--;
                            System.out.println(field1449[var3]);
                            continue;
                        }
                        if (var625 == 5424) {
                            var2 -= 11;
                            class225.field3370 = field1440[var2];
                            class311.field4588 = field1440[var2 + 1];
                            class141.field1915 = field1440[var2 + 2];
                            class281.field4129 = field1440[var2 + 3];
                            class317.field4652 = field1440[var2 + 4];
                            class294.field4269 = field1440[var2 + 5];
                            class214.field3027 = field1440[var2 + 6];
                            class186.field2609 = field1440[var2 + 7];
                            class1.field17 = field1440[var2 + 8];
                            class304.field4448 = field1440[var2 + 9];
                            class199.field2817 = field1440[var2 + 10];
                            class257.field3813.method708(class317.field4652, (byte) -119);
                            class257.field3813.method708(class294.field4269, (byte) -127);
                            class257.field3813.method708(class214.field3027, (byte) -118);
                            class257.field3813.method708(class186.field2609, (byte) -120);
                            class257.field3813.method708(class1.field17, (byte) -92);
                            class452.field6676 = null;
                            class336.field4966 = null;
                            class386.field5644 = null;
                            class104.field1387 = null;
                            class83.field1022 = null;
                            class429.field6239 = null;
                            class22.field311 = null;
                            class148.field2016 = null;
                            class92.field1144 = true;
                            continue;
                        }
                        if (var625 == 5425) {
                            class99.method655(126);
                            class92.field1144 = false;
                            continue;
                        }
                        if (var625 == 5426) {
                            var2 -= 2;
                            class458.field6762 = field1440[var2];
                            class452.field6668 = field1440[var2 + 1];
                            continue;
                        }
                        if (var625 == 5427) {
                            var2 -= 2;
                            class383.field5615 = field1440[var2 + 1];
                            continue;
                        }
                        if (var625 == 5428) {
                            var2 -= 2;
                            int var507 = field1440[var2];
                            int var508 = field1440[var2 + 1];
                            field1440[var2++] = class130.method877(var508, var507, (byte) 94) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5429) {
                            var3--;
                            class451.method2804(118, false, field1449[var3]);
                            continue;
                        }
                    } else if (var625 < 5600) {
                        if (var625 == 5500) {
                            var2 -= 4;
                            int var509 = field1440[var2];
                            int var510 = field1440[var2 + 1];
                            int var511 = field1440[var2 + 2];
                            int var512 = field1440[var2 + 3];
                            class369.method2345((var509 >> 14 & 0x3FFF) - class28.field399, var511, false, false, (var509 & 0x3FFF) - class134.field1846, var510, var512);
                            continue;
                        }
                        if (var625 == 5501) {
                            var2 -= 4;
                            int var513 = field1440[var2];
                            int var514 = field1440[var2 + 1];
                            int var515 = field1440[var2 + 2];
                            int var516 = field1440[var2 + 3];
                            class326.method2131(var514, (var513 >> 14 & 0x3FFF) - class28.field399, var516, 16383, (var513 & 0x3FFF) - class134.field1846, var515);
                            continue;
                        }
                        if (var625 == 5502) {
                            var2 -= 6;
                            int var517 = field1440[var2];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class244.field3612 = var517;
                            int var518 = field1440[var2 + 1];
                            if (var518 + 1 >= class118.field1592[class244.field3612].length >> 1) {
                                throw new RuntimeException();
                            }
                            class265.field3930 = var518;
                            class167.field2204 = 0;
                            class234.field3514 = field1440[var2 + 2];
                            class3.field46 = field1440[var2 + 3];
                            int var519 = field1440[var2 + 4];
                            if (var519 >= 2) {
                                throw new RuntimeException();
                            }
                            class447.field6538 = var519;
                            int var520 = field1440[var2 + 5];
                            if (var520 + 1 >= class118.field1592[class447.field6538].length >> 1) {
                                throw new RuntimeException();
                            }
                            class244.field3618 = var520;
                            class28.field402 = 3;
                            continue;
                        }
                        if (var625 == 5503) {
                            class137.method912(1);
                            continue;
                        }
                        if (var625 == 5504) {
                            var2 -= 2;
                            class430.method2647(field1440[var2 + 1], 0, field1440[var2], -1);
                            continue;
                        }
                        if (var625 == 5505) {
                            field1440[var2++] = (int) class170.field2220 >> 3;
                            continue;
                        }
                        if (var625 == 5506) {
                            field1440[var2++] = (int) class1.field19 >> 3;
                            continue;
                        }
                        if (var625 == 5507) {
                            class332.method2172(-36);
                            continue;
                        }
                        if (var625 == 5508) {
                            class4.method36((byte) 65);
                            continue;
                        }
                        if (var625 == 5509) {
                            class4.method35((byte) 84);
                            continue;
                        }
                        if (var625 == 5510) {
                            class141.method935(-65);
                            continue;
                        }
                        if (var625 == 5511) {
                            var2--;
                            int var521 = field1440[var2];
                            int var522 = var521 >> 14 & 0x3FFF;
                            int var523 = var521 & 0x3FFF;
                            int var524 = var522 - class28.field399;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class195.field2745) {
                                var524 = class195.field2745;
                            }
                            int var525 = var523 - class134.field1846;
                            if (var525 < 0) {
                                var525 = 0;
                            } else if (var525 >= class78.field984) {
                                var525 = class78.field984;
                            }
                            class152.field2056 = var524 * 128 + 64;
                            class188.field2629 = var525 * 128 + 64;
                            class28.field402 = 4;
                            continue;
                        }
                        if (var625 == 5512) {
                            class308.method2058((byte) -124);
                            continue;
                        }
                    } else if (var625 < 5700) {
                        if (var625 == 5600) {
                            var3 -= 2;
                            String var526 = field1449[var3];
                            String var527 = field1449[var3 + 1];
                            var2--;
                            int var528 = field1440[var2];
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0 && class337.field4971 == 0) {
                                class33.method319(-92, var527, var526, var528);
                            }
                            continue;
                        }
                        if (var625 == 5601) {
                            class307.method2049(-116);
                            continue;
                        }
                        if (var625 == 5602) {
                            if (class125.field1668 == 0) {
                                class92.field1150 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5603) {
                            var2 -= 4;
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0 && class337.field4971 == 0) {
                                class452.method2807(field1440[var2 + 2], field1440[var2 + 3], -24814, field1440[var2], field1440[var2 + 1]);
                            }
                            continue;
                        }
                        if (var625 == 5604) {
                            var3--;
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0 && class337.field4971 == 0) {
                                class454.method2817(class91.method619(109, field1449[var3]), 115);
                            }
                            continue;
                        }
                        if (var625 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0 && class337.field4971 == 0) {
                                class59.method452(field1440[var2 + 4] == 1, field1449[var3 + 1], field1440[var2 + 6] == 1, field1440[var2 + 3], field1440[var2 + 5] == 1, -96, field1449[var3 + 2], field1440[var2], field1440[var2 + 2], field1440[var2 + 1], class91.method619(-111, field1449[var3]));
                            }
                            continue;
                        }
                        if (var625 == 5606) {
                            if (class22.field310 == 0) {
                                class244.field3616 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5607) {
                            field1440[var2++] = class92.field1150;
                            continue;
                        }
                        if (var625 == 5608) {
                            field1440[var2++] = class51.field641;
                            continue;
                        }
                        if (var625 == 5609) {
                            field1440[var2++] = class244.field3616;
                            continue;
                        }
                        if (var625 == 5610) {
                            for (int var529 = 0; var529 < 5; var529++) {
                                field1449[var3++] = class404.field5852.length > var529 ? class187.method1281(class404.field5852[var529], 19990) : "";
                            }
                            class404.field5852 = null;
                            continue;
                        }
                        if (var625 == 5611) {
                            field1440[var2++] = class307.field4525;
                            continue;
                        }
                    } else if (var625 < 6100) {
                        if (var625 == 6001) {
                            var2--;
                            int var530 = field1440[var2];
                            if (var530 < 1) {
                                var530 = 1;
                            }
                            if (var530 > 4) {
                                var530 = 4;
                            }
                            class52.field652 = var530;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6002) {
                            var2--;
                            class46.method383(field1440[var2] == 1, (byte) 101);
                            class373.method2373(-10);
                            class437.method2691(-1);
                            class51.method395((byte) 19);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6003) {
                            var2--;
                            class323.field4773 = field1440[var2] == 1;
                            class51.method395((byte) 19);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6005) {
                            var2--;
                            class367.field5307 = field1440[var2] == 1;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6006) {
                            var2--;
                            class231.field3482 = field1440[var2] == 1;
                            class74.field942.method79(!class231.field3482);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6007) {
                            var2--;
                            class337.field4974 = field1440[var2];
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6008) {
                            var2--;
                            class62.field826 = field1440[var2] == 1;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6009) {
                            var2--;
                            class403.field5834 = field1440[var2] == 1;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6010) {
                            var2--;
                            class182.field2561 = field1440[var2] == 1;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6011) {
                            var2--;
                            int var531 = field1440[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class213.field3010 = var531;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6012) {
                            var2--;
                            class307.field4535 = field1440[var2] == 1;
                            class354.method2262((byte) 119);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6014) {
                            var2--;
                            class13.field224 = field1440[var2] == 1;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6015) {
                            var2--;
                            class76.field969 = field1440[var2] == 1;
                            class437.method2691(-1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6016) {
                            var2--;
                            int var532 = field1440[var2];
                            if (var532 < 0 || var532 > 2) {
                                var532 = 0;
                            }
                            class275.field4077 = var532;
                            class166.method1094((byte) 84);
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6017) {
                            var2--;
                            class134.field1847 = field1440[var2] == 1;
                            class115.method802((byte) -63);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6018) {
                            var2--;
                            int var533 = field1440[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class372.field5437 = var533;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6019) {
                            var2--;
                            int var534 = field1440[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 255) {
                                var534 = 255;
                            }
                            if (class450.field6629 != var534) {
                                if (class450.field6629 == 0 && class343.field5048 != -1) {
                                    class339.method2190(0, 0, false, var534, class454.field6706, class343.field5048);
                                    class29.field408 = false;
                                } else if (var534 == 0) {
                                    class282.method1904((byte) 72);
                                    class29.field408 = false;
                                } else {
                                    class370.method2356((byte) 49, var534);
                                }
                                class450.field6629 = var534;
                            }
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6020) {
                            var2--;
                            int var535 = field1440[var2];
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 127) {
                                var535 = 127;
                            }
                            class178.field2539 = var535;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6021) {
                            var2--;
                            class22.field317 = field1440[var2] == 1;
                            class51.method395((byte) 19);
                            continue;
                        }
                        if (var625 == 6023) {
                            var2--;
                            int var536 = field1440[var2];
                            boolean var537 = false;
                            if (var536 < 0) {
                                var536 = 0;
                            }
                            if (var536 > 2) {
                                var536 = 2;
                            }
                            if (class451.field6661 < 96) {
                                var536 = 0;
                                var537 = true;
                            }
                            class106.method757(var536, -1);
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            field1440[var2++] = var537 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 6024) {
                            var2--;
                            int var538 = field1440[var2];
                            if (var538 < 0 || var538 > 2) {
                                var538 = 0;
                            }
                            class79.field993 = var538;
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6025) {
                            var2--;
                            int var539 = field1440[var2];
                            if (var539 < 0 || var539 > class313.method2068(-126, class451.field6661)) {
                                var539 = 0;
                            }
                            class376.field5491 = var539;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6027) {
                            var2--;
                            int var540 = field1440[var2];
                            if (var540 < 0 || var540 > 1) {
                                var540 = 0;
                            }
                            class419.method2592(32, var540 == 1);
                            continue;
                        }
                        if (var625 == 6028) {
                            var2--;
                            class79.field990 = field1440[var2] != 0;
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6029) {
                            var2--;
                            class337.field4974 = field1440[var2];
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6030) {
                            var2--;
                            class29.field418 = field1440[var2] != 0;
                            class53.method414(class267.field3963, true);
                            class437.method2691(-1);
                            continue;
                        }
                        if (var625 == 6031) {
                            var2--;
                            int var541 = field1440[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class358.method2280(var541, true);
                            continue;
                        }
                        if (var625 == 6032) {
                            var2--;
                            int var542 = field1440[var2];
                            if (var542 < 0 || var542 > 3) {
                                var542 = 2;
                            }
                            class322.field4739 = var542;
                            class53.method414(class267.field3963, true);
                            class175.field2399 = false;
                            continue;
                        }
                        if (var625 == 6033) {
                            var2--;
                            int var543 = field1440[var2];
                            if (var543 < 0 || var543 > 4) {
                                var543 = 2;
                            }
                            class329.field4900 = var543;
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                    } else if (var625 < 6200) {
                        if (var625 == 6101) {
                            field1440[var2++] = class52.field652;
                            continue;
                        }
                        if (var625 == 6102) {
                            field1440[var2++] = class163.method1082((byte) 95) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6103) {
                            field1440[var2++] = class323.field4773 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6105) {
                            field1440[var2++] = class367.field5307 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6106) {
                            field1440[var2++] = class231.field3482 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6107) {
                            field1440[var2++] = class337.field4974;
                            continue;
                        }
                        if (var625 == 6108) {
                            field1440[var2++] = class62.field826 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6109) {
                            field1440[var2++] = class403.field5834 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6110) {
                            field1440[var2++] = class182.field2561 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6111) {
                            field1440[var2++] = class213.field3010;
                            continue;
                        }
                        if (var625 == 6112) {
                            field1440[var2++] = class307.field4535 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6114) {
                            field1440[var2++] = class13.field224 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6115) {
                            field1440[var2++] = class76.field969 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6116) {
                            field1440[var2++] = class275.field4077;
                            continue;
                        }
                        if (var625 == 6117) {
                            field1440[var2++] = class134.field1847 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6118) {
                            field1440[var2++] = class372.field5437;
                            continue;
                        }
                        if (var625 == 6119) {
                            field1440[var2++] = class450.field6629;
                            continue;
                        }
                        if (var625 == 6120) {
                            field1440[var2++] = class178.field2539;
                            continue;
                        }
                        if (var625 == 6121) {
                            field1440[var2++] = class74.field942.method135() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6123) {
                            field1440[var2++] = class145.method1007(-14164);
                            continue;
                        }
                        if (var625 == 6124) {
                            field1440[var2++] = class79.field993;
                            continue;
                        }
                        if (var625 == 6125) {
                            field1440[var2++] = class376.field5491;
                            continue;
                        }
                        if (var625 == 6126) {
                            field1440[var2++] = class74.field942.method117() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6127) {
                            field1440[var2++] = class436.field6366 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6128) {
                            field1440[var2++] = class79.field990 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6129) {
                            field1440[var2++] = class337.field4974;
                            continue;
                        }
                        if (var625 == 6130) {
                            field1440[var2++] = class29.field418 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6131) {
                            field1440[var2++] = class118.field1594;
                            continue;
                        }
                        if (var625 == 6132) {
                            field1440[var2++] = class322.field4739;
                            continue;
                        }
                        if (var625 == 6133) {
                            field1440[var2++] = class341.field5007 == 1 || class341.field5007 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6134) {
                            field1440[var2++] = class313.method2068(-25, class451.field6661);
                            continue;
                        }
                        if (var625 == 6135) {
                            field1440[var2++] = class329.field4900;
                            continue;
                        }
                    } else if (var625 < 6300) {
                        if (var625 == 6200) {
                            var2 -= 2;
                            class212.field2990 = (short) field1440[var2];
                            if (class212.field2990 <= 0) {
                                class212.field2990 = 256;
                            }
                            class251.field3693 = (short) field1440[var2 + 1];
                            if (class251.field3693 <= 0) {
                                class251.field3693 = 205;
                            }
                            continue;
                        }
                        if (var625 == 6201) {
                            var2 -= 2;
                            class11.field153 = (short) field1440[var2];
                            if (class11.field153 <= 0) {
                                class11.field153 = 256;
                            }
                            class115.field1563 = (short) field1440[var2 + 1];
                            if (class115.field1563 <= 0) {
                                class115.field1563 = 320;
                            }
                            continue;
                        }
                        if (var625 == 6202) {
                            var2 -= 4;
                            class242.field3588 = (short) field1440[var2];
                            if (class242.field3588 <= 0) {
                                class242.field3588 = 1;
                            }
                            class345.field5076 = (short) field1440[var2 + 1];
                            if (class345.field5076 <= 0) {
                                class345.field5076 = 32767;
                            } else if (class345.field5076 < class242.field3588) {
                                class345.field5076 = class242.field3588;
                            }
                            class359.field5213 = (short) field1440[var2 + 2];
                            if (class359.field5213 <= 0) {
                                class359.field5213 = 1;
                            }
                            class142.field1934 = (short) field1440[var2 + 3];
                            if (class142.field1934 <= 0) {
                                class142.field1934 = 32767;
                            } else if (class142.field1934 < class359.field5213) {
                                class142.field1934 = class359.field5213;
                            }
                            continue;
                        }
                        if (var625 == 6203) {
                            class346.method2242(0, false, 334, class163.field2162.field3233, class163.field2162.field3352, 0);
                            field1440[var2++] = class3.field45;
                            field1440[var2++] = class127.field1685;
                            continue;
                        }
                        if (var625 == 6204) {
                            field1440[var2++] = class11.field153;
                            field1440[var2++] = class115.field1563;
                            continue;
                        }
                        if (var625 == 6205) {
                            field1440[var2++] = class212.field2990;
                            field1440[var2++] = class251.field3693;
                            continue;
                        }
                    } else if (var625 < 6400) {
                        if (var625 == 6300) {
                            field1440[var2++] = (int) (class43.method364(-16756) / 60000L);
                            continue;
                        }
                        if (var625 == 6301) {
                            field1440[var2++] = (int) (class43.method364(-16756) / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6302) {
                            var2 -= 3;
                            int var544 = field1440[var2];
                            int var545 = field1440[var2 + 1];
                            int var546 = field1440[var2 + 2];
                            field1437.clear();
                            field1437.set(11, 12);
                            field1437.set(var546, var545, var544);
                            field1440[var2++] = (int) (field1437.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6303) {
                            field1437.clear();
                            field1437.setTime(new Date(class43.method364(-16756)));
                            field1440[var2++] = field1437.get(1);
                            continue;
                        }
                        if (var625 == 6304) {
                            var2--;
                            int var547 = field1440[var2];
                            boolean var548 = true;
                            if (var547 < 0) {
                                var548 = (var547 + 1) % 4 == 0;
                            } else if (var547 < 1582) {
                                var548 = var547 % 4 == 0;
                            } else if (var547 % 4 != 0) {
                                var548 = false;
                            } else if (var547 % 100 != 0) {
                                var548 = true;
                            } else if (var547 % 400 != 0) {
                                var548 = false;
                            }
                            field1440[var2++] = var548 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6500) {
                        if (var625 == 6405) {
                            field1440[var2++] = class357.method2274(25) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6406) {
                            field1440[var2++] = class446.method2745((byte) 9) ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6600) {
                        if (var625 == 6500) {
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0) {
                                field1440[var2++] = class466.method2873(-76) == -1 ? 0 : 1;
                                continue;
                            }
                            field1440[var2++] = 1;
                            continue;
                        }
                        if (var625 == 6501) {
                            class177 var549 = class206.method1414(-102);
                            if (var549 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = 0;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var549.field2445;
                                field1440[var2++] = var549.field1845;
                                field1449[var3++] = var549.field2451;
                                class153 var550 = var549.method1229(false);
                                field1440[var2++] = var550.field2068;
                                field1449[var3++] = var550.field2070;
                                field1440[var2++] = var549.field1838;
                                field1440[var2++] = var549.field2446;
                            }
                            continue;
                        }
                        if (var625 == 6502) {
                            class177 var551 = class46.method376(-23072);
                            if (var551 == null) {
                                field1440[var2++] = -1;
                                field1440[var2++] = 0;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var551.field2445;
                                field1440[var2++] = var551.field1845;
                                field1449[var3++] = var551.field2451;
                                class153 var552 = var551.method1229(false);
                                field1440[var2++] = var552.field2068;
                                field1449[var3++] = var552.field2070;
                                field1440[var2++] = var551.field1838;
                                field1440[var2++] = var551.field2446;
                            }
                            continue;
                        }
                        if (var625 == 6503) {
                            var2--;
                            int var553 = field1440[var2];
                            if (class120.field1610 == 10 && class299.field4355 == 0 && class125.field1668 == 0 && class22.field310 == 0) {
                                field1440[var2++] = class104.method729((byte) 78, var553) ? 1 : 0;
                                continue;
                            }
                            field1440[var2++] = 0;
                            continue;
                        }
                        if (var625 == 6504) {
                            var2--;
                            class14.field234 = field1440[var2];
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6505) {
                            field1440[var2++] = class14.field234;
                            continue;
                        }
                        if (var625 == 6506) {
                            var2--;
                            int var554 = field1440[var2];
                            class177 var555 = class288.method1929((byte) 14, var554);
                            if (var555 == null) {
                                field1440[var2++] = -1;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1449[var3++] = "";
                                field1440[var2++] = 0;
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = var555.field1845;
                                field1449[var3++] = var555.field2451;
                                class153 var556 = var555.method1229(false);
                                field1440[var2++] = var556.field2068;
                                field1449[var3++] = var556.field2070;
                                field1440[var2++] = var555.field1838;
                                field1440[var2++] = var555.field2446;
                            }
                            continue;
                        }
                        if (var625 == 6507) {
                            var2 -= 4;
                            int var557 = field1440[var2];
                            boolean var558 = field1440[var2 + 1] == 1;
                            int var559 = field1440[var2 + 2];
                            boolean var560 = field1440[var2 + 3] == 1;
                            class110.method780(var560, var559, var558, 19381, var557);
                            continue;
                        }
                        if (var625 == 6508) {
                            class296.method1971(1);
                            continue;
                        }
                        if (var625 == 6509) {
                            if (class120.field1610 == 10) {
                                var2--;
                                class157.field2118 = field1440[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var625 < 6700) {
                        if (var625 == 6600) {
                            var2--;
                            class400.field5790 = field1440[var2] == 1;
                            class53.method414(class267.field3963, true);
                            continue;
                        }
                        if (var625 == 6601) {
                            field1440[var2++] = class400.field5790 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6800 && class38.field531 == 2) {
                        if (var625 == 6700) {
                            int var561 = class252.field3703.method612(2);
                            if (class318.field4672 != -1) {
                                var561++;
                            }
                            field1440[var2++] = var561;
                            continue;
                        }
                        if (var625 == 6701) {
                            var2--;
                            int var562 = field1440[var2];
                            if (class318.field4672 != -1) {
                                if (var562 == 0) {
                                    field1440[var2++] = class318.field4672;
                                    continue;
                                }
                                var562--;
                            }
                            class182 var563 = (class182) class252.field3703.method608((byte) 125);
                            while (var562-- > 0) {
                                var563 = (class182) class252.field3703.method604(-106);
                            }
                            field1440[var2++] = var563.field2564;
                            continue;
                        }
                        if (var625 == 6702) {
                            var2--;
                            int var564 = field1440[var2];
                            if (class444.field6470[var564] == null) {
                                field1449[var3++] = "";
                            } else {
                                String var565 = class444.field6470[var564][0].field3304;
                                if (var565 == null) {
                                    field1449[var3++] = "";
                                } else {
                                    field1449[var3++] = var565.substring(0, var565.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var625 == 6703) {
                            var2--;
                            int var566 = field1440[var2];
                            if (class444.field6470[var566] == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = class444.field6470[var566].length;
                            }
                            continue;
                        }
                        if (var625 == 6704) {
                            var2 -= 2;
                            int var567 = field1440[var2];
                            int var568 = field1440[var2 + 1];
                            if (class444.field6470[var567] == null) {
                                field1449[var3++] = "";
                            } else {
                                String var569 = class444.field6470[var567][var568].field3304;
                                if (var569 == null) {
                                    field1449[var3++] = "";
                                } else {
                                    field1449[var3++] = var569;
                                }
                            }
                            continue;
                        }
                        if (var625 == 6705) {
                            var2 -= 2;
                            int var570 = field1440[var2];
                            int var571 = field1440[var2 + 1];
                            if (class444.field6470[var570] == null) {
                                field1440[var2++] = 0;
                            } else {
                                field1440[var2++] = class444.field6470[var570][var571].field3308;
                            }
                            continue;
                        }
                        if (var625 == 6706) {
                            continue;
                        }
                        if (var625 == 6707) {
                            var2 -= 3;
                            int var572 = field1440[var2];
                            int var573 = field1440[var2 + 1];
                            int var574 = field1440[var2 + 2];
                            class93.method631(1, var572 << 16 | var573, var574, true, "");
                            continue;
                        }
                        if (var625 == 6708) {
                            var2 -= 3;
                            int var575 = field1440[var2];
                            int var576 = field1440[var2 + 1];
                            int var577 = field1440[var2 + 2];
                            class93.method631(2, var575 << 16 | var576, var577, true, "");
                            continue;
                        }
                        if (var625 == 6709) {
                            var2 -= 3;
                            int var578 = field1440[var2];
                            int var579 = field1440[var2 + 1];
                            int var580 = field1440[var2 + 2];
                            class93.method631(3, var578 << 16 | var579, var580, true, "");
                            continue;
                        }
                        if (var625 == 6710) {
                            var2 -= 3;
                            int var581 = field1440[var2];
                            int var582 = field1440[var2 + 1];
                            int var583 = field1440[var2 + 2];
                            class93.method631(4, var581 << 16 | var582, var583, true, "");
                            continue;
                        }
                        if (var625 == 6711) {
                            var2 -= 3;
                            int var584 = field1440[var2];
                            int var585 = field1440[var2 + 1];
                            int var586 = field1440[var2 + 2];
                            class93.method631(5, var584 << 16 | var585, var586, true, "");
                            continue;
                        }
                        if (var625 == 6712) {
                            var2 -= 3;
                            int var587 = field1440[var2];
                            int var588 = field1440[var2 + 1];
                            int var589 = field1440[var2 + 2];
                            class93.method631(6, var587 << 16 | var588, var589, true, "");
                            continue;
                        }
                        if (var625 == 6713) {
                            var2 -= 3;
                            int var590 = field1440[var2];
                            int var591 = field1440[var2 + 1];
                            int var592 = field1440[var2 + 2];
                            class93.method631(7, var590 << 16 | var591, var592, true, "");
                            continue;
                        }
                        if (var625 == 6714) {
                            var2 -= 3;
                            int var593 = field1440[var2];
                            int var594 = field1440[var2 + 1];
                            int var595 = field1440[var2 + 2];
                            class93.method631(8, var593 << 16 | var594, var595, true, "");
                            continue;
                        }
                        if (var625 == 6715) {
                            var2 -= 3;
                            int var596 = field1440[var2];
                            int var597 = field1440[var2 + 1];
                            int var598 = field1440[var2 + 2];
                            class93.method631(9, var596 << 16 | var597, var598, true, "");
                            continue;
                        }
                        if (var625 == 6716) {
                            var2 -= 3;
                            int var599 = field1440[var2];
                            int var600 = field1440[var2 + 1];
                            int var601 = field1440[var2 + 2];
                            class93.method631(10, var599 << 16 | var600, var601, true, "");
                            continue;
                        }
                        if (var625 == 6717) {
                            var2 -= 3;
                            int var602 = field1440[var2];
                            int var603 = field1440[var2 + 1];
                            int var604 = field1440[var2 + 2];
                            class223 var605 = class99.method654(-1, var602 << 16 | var603, var604);
                            class25.method257(60);
                            class332 var606 = client.method1811(var605);
                            class142.method938(var606.method2162(-116), var602 << 16 | var603, var605.field3335, var605.field3246, (byte) 52, var604, var606.field4927);
                            continue;
                        }
                    } else if (var625 < 6900) {
                        if (var625 == 6800) {
                            var2--;
                            int var607 = field1440[var2];
                            class110 var608 = class443.method2721(-12, var607);
                            if (var608.field1487 == null) {
                                field1449[var3++] = "";
                            } else {
                                field1449[var3++] = var608.field1487;
                            }
                            continue;
                        }
                        if (var625 == 6801) {
                            var2--;
                            int var609 = field1440[var2];
                            class110 var610 = class443.method2721(-12, var609);
                            field1440[var2++] = var610.field1502;
                            continue;
                        }
                        if (var625 == 6802) {
                            var2--;
                            int var611 = field1440[var2];
                            class110 var612 = class443.method2721(-12, var611);
                            field1440[var2++] = var612.field1514;
                            continue;
                        }
                        if (var625 == 6803) {
                            var2--;
                            int var613 = field1440[var2];
                            class110 var614 = class443.method2721(-12, var613);
                            field1440[var2++] = var614.field1530;
                            continue;
                        }
                        if (var625 == 6804) {
                            var2 -= 2;
                            int var615 = field1440[var2];
                            int var616 = field1440[var2 + 1];
                            class294 var617 = class320.method2109(var616, (byte) -97);
                            if (var617.method1953((byte) 88)) {
                                field1449[var3++] = class443.method2721(-12, var615).method789(var617.field4273, var616, 127);
                            } else {
                                field1440[var2++] = class443.method2721(-12, var615).method783((byte) 127, var617.field4270, var616);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var624) {
            if (arg0.field4348 == null) {
                StringBuffer var622 = new StringBuffer(30);
                var622.append("CS2: ").append(arg0.field3907).append(" ");
                for (int var623 = field1451 - 1; var623 >= 0; var623--) {
                    var622.append("v: ").append(field1444[var623].field3989.field3907).append(" ");
                }
                var622.append("op: ").append(var7);
                class365.method2331(var622.toString(), var624, 28692);
            } else {
                class328.method2147(128, "Clientscript error in: " + arg0.field4348);
                StringBuffer var619 = new StringBuffer(30);
                var619.append("Clientscript error in: ").append(arg0.field4348).append("\n");
                for (int var620 = field1451 - 1; var620 >= 0; var620--) {
                    var619.append("via: ").append(field1444[var620].field3989.field4348).append("\n");
                }
                var619.append("Op: ").append(var7).append("\n");
                String var621 = var624.getMessage();
                if (var621 != null && var621.length() > 0) {
                    var619.append("Message: ").append(var621).append("\n");
                }
                class365.method2331(var619.toString(), var624, 28692);
                class419.method2593(30444, var619.toString());
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqp;)V", line = 6938)
    public static final void method762(class288 arg0) {
        method766(arg0, 200000);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljm;II)V", line = 6947)
    public static final void method763(class167 arg0, int arg1, int arg2) {
        class299 var3 = class253.method1669(arg1, -7, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field1456 = new int[var3.field4346];
        field1438 = new String[var3.field4354];
        if (class423.field6111 == var3.field4352 || class99.field1232 == var3.field4352 || class42.field561 == var3.field4352) {
            int var4 = 0;
            int var5 = 0;
            if (class418.field6031 != null) {
                var4 = class418.field6031.field3288;
                var5 = class418.field6031.field3362;
            }
            field1456[0] = class223.field3295.method411(0) - var4;
            field1456[1] = class223.field3295.method415(-72) - var5;
        }
        method761(var3, 200000);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 6976)
    public static final void method764(int arg0) {
        if (arg0 == -1 || !class103.method695(arg0, -121)) {
            return;
        }
        class223[] var1 = class444.field6470[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class223 var3 = var1[var2];
            if (var3.field3284 != null) {
                class288 var4 = new class288();
                var4.field4217 = var3;
                var4.field4218 = var3.field3284;
                method766(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V", line = 7005)
    public static void method765() {
        field1456 = null;
        field1438 = null;
        field1445 = null;
        field1442 = null;
        field1440 = null;
        field1449 = null;
        field1444 = null;
        field1439 = null;
        field1453 = null;
        field1441 = null;
        field1437 = null;
        field1458 = null;
        field1459 = null;
        field1461 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqp;I)V", line = 7023)
    private static final void method766(class288 arg0, int arg1) {
        Object[] var2 = arg0.field4218;
        int var3 = (Integer) var2[0];
        class299 var4 = class141.method933(var3, -20227);
        if (var4 == null) {
            return;
        }
        field1456 = new int[var4.field4346];
        int var5 = 0;
        field1438 = new String[var4.field4354];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4220;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4222;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4217 == null ? -1 : arg0.field4217.field3223;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4219;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4217 == null ? -1 : arg0.field4217.field3270;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4224 == null ? -1 : arg0.field4224.field3223;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4224 == null ? -1 : arg0.field4224.field3270;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4215;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4226;
                }
                field1456[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4216;
                }
                field1438[var6++] = var9;
            }
        }
        method761(var4, arg1);
    }
}
