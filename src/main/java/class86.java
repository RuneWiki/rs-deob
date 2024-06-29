import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class86 extends class170 {

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "Le;")
    public class125 field1374;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "Lsc;")
    public static class181 field1368 = class149.method967(255, "<img=0>");

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "[Lvf;")
    public static class230[] field1373 = new class230[2048];

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Ldf;")
    public static class117 field1366;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "[[[I")
    public static int[][][] field1365;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
    public static final int method576(int arg0, boolean arg1) {
        field1362++;
        if (arg0 > -62) {
            return -88;
        }
        long var2 = class213.method1414(-9292);
        for (class236 var4 = arg1 ? (class236) class143.field2314.method1418(0) : (class236) class143.field2314.method1421(false); var4 != null; var4 = (class236) class143.field2314.method1421(false)) {
            if (var2 > (var4.field4105 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4105 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field606;
                    class196.field3426[var5] = class107.field1751[var5];
                    var4.method290((byte) -48);
                    return var5;
                }
                var4.method290((byte) -48);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILoh;)V")
    public static final void method577(int arg0, int arg1, class94 arg2) {
        Object[] var3 = arg2.field1489;
        field1364++;
        int var4 = (Integer) var3[0];
        class87 var5 = class217.method1444(var4, 22718);
        if (var5 == null) {
            return;
        }
        class64.field1048 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field1375;
        int var9 = -1;
        int[] var11 = var5.field1382;
        try {
            class187.field3314 = new class181[var5.field1379];
            int var12 = 0;
            int var13 = 0;
            class107.field1747 = new int[var5.field1386];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field1500;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field1496;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field1488 == null ? -1 : arg2.field1488.field2987;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field1485;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field1488 == null ? -1 : arg2.field1488.field2934;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field1486 == null ? -1 : arg2.field1486.field2987;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field1486 == null ? -1 : arg2.field1486.field2934;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field1497;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field1498;
                    }
                    class107.field1747[var12++] = var16;
                } else if (var3[var14] instanceof class181) {
                    class181 var15 = (class181) var3[var14];
                    if (var15.method1202(class77.field1249, -4557)) {
                        var15 = arg2.field1495;
                    }
                    class187.field3314[var13++] = var15;
                }
            }
            int var17 = 0;
            label3389: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var10 = var8[var9];
                if (var10 < 100) {
                    if (var10 == 0) {
                        class89.field1412[var6++] = var11[var9];
                        continue;
                    }
                    if (var10 == 1) {
                        int var18 = var11[var9];
                        class89.field1412[var6++] = class196.field3426[var18];
                        continue;
                    }
                    int var10000;
                    if (var10 == 2) {
                        int var19 = var11[var9];
                        var10000 = arg0 - 121;
                        var6--;
                        class152.method989(var10000, var19, class89.field1412[var6]);
                        continue;
                    }
                    if (var10 == 3) {
                        class265.field4626[var7++] = var5.field1390[var9];
                        continue;
                    }
                    if (var10 == 6) {
                        var9 += var11[var9];
                        continue;
                    }
                    if (var10 == 7) {
                        var6 -= 2;
                        if (class89.field1412[var6 + 1] != class89.field1412[var6]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 8) {
                        var6 -= 2;
                        if (class89.field1412[var6 + 1] == class89.field1412[var6]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 9) {
                        var6 -= 2;
                        if (class89.field1412[var6] < class89.field1412[var6 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 10) {
                        var6 -= 2;
                        if (class89.field1412[var6] > class89.field1412[var6 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 21) {
                        if (class64.field1048 == 0) {
                            return;
                        }
                        class43 var20 = class1.field4[--class64.field1048];
                        var5 = var20.field679;
                        var11 = var5.field1382;
                        class107.field1747 = var20.field676;
                        var8 = var5.field1375;
                        class187.field3314 = var20.field675;
                        var9 = var20.field673;
                        continue;
                    }
                    if (var10 == 25) {
                        int var21 = var11[var9];
                        class89.field1412[var6++] = class91.method609((byte) 109, var21);
                        continue;
                    }
                    if (var10 == 27) {
                        int var22 = var11[var9];
                        var10000 = arg0 ^ 0xFFFFFF81;
                        var6--;
                        class23.method206(var10000, var22, class89.field1412[var6]);
                        continue;
                    }
                    if (var10 == 31) {
                        var6 -= 2;
                        if (class89.field1412[var6] <= class89.field1412[var6 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 32) {
                        var6 -= 2;
                        if (class89.field1412[var6 + 1] <= class89.field1412[var6]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var10 == 33) {
                        class89.field1412[var6++] = class107.field1747[var11[var9]];
                        continue;
                    }
                    int var10001;
                    if (var10 == 34) {
                        var10001 = var11[var9];
                        var6--;
                        class107.field1747[var10001] = class89.field1412[var6];
                        continue;
                    }
                    if (var10 == 35) {
                        class265.field4626[var7++] = class187.field3314[var11[var9]];
                        continue;
                    }
                    if (var10 == 36) {
                        var10001 = var11[var9];
                        var7--;
                        class187.field3314[var10001] = class265.field4626[var7];
                        continue;
                    }
                    if (var10 == 37) {
                        int var23 = var11[var9];
                        var7 -= var23;
                        class181 var24 = class173.method1150(class265.field4626, var23, var7, -1049215800);
                        class265.field4626[var7++] = var24;
                        continue;
                    }
                    if (var10 == 38) {
                        var6--;
                        continue;
                    }
                    if (var10 == 39) {
                        var7--;
                        continue;
                    }
                    if (var10 == 40) {
                        int var25 = var11[var9];
                        class87 var26 = class217.method1444(var25, 22718);
                        int[] var27 = new int[var26.field1386];
                        class181[] var28 = new class181[var26.field1379];
                        for (int var29 = 0; var29 < var26.field1377; var29++) {
                            var27[var29] = class89.field1412[var6 + var29 - var26.field1377];
                        }
                        for (int var30 = 0; var30 < var26.field1388; var30++) {
                            var28[var30] = class265.field4626[var7 + var30 - var26.field1388];
                        }
                        var6 -= var26.field1377;
                        var7 -= var26.field1388;
                        class43 var31 = new class43();
                        var31.field673 = var9;
                        var31.field676 = class107.field1747;
                        var31.field675 = class187.field3314;
                        var31.field679 = var5;
                        if (class64.field1048 >= class1.field4.length) {
                            throw new RuntimeException();
                        }
                        var9 = -1;
                        var5 = var26;
                        class1.field4[class64.field1048++] = var31;
                        class107.field1747 = var27;
                        class187.field3314 = var28;
                        var8 = var26.field1375;
                        var11 = var26.field1382;
                        continue;
                    }
                    if (var10 == 42) {
                        class89.field1412[var6++] = class192.field3374[var11[var9]];
                        continue;
                    }
                    if (var10 == 43) {
                        int var32 = var11[var9];
                        var6--;
                        class192.field3374[var32] = class89.field1412[var6];
                        class177.method1179(var32, true);
                        continue;
                    }
                    if (var10 == 44) {
                        int var33 = var11[var9] >> 16;
                        int var34 = var11[var9] & 0xFFFF;
                        var6--;
                        int var35 = class89.field1412[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class259.field4530[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3389;
                                }
                                class248.field4330[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var10 == 45) {
                        int var38 = var11[var9];
                        var6--;
                        int var39 = class89.field1412[var6];
                        if (var39 >= 0 && class259.field4530[var38] > var39) {
                            class89.field1412[var6++] = class248.field4330[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var10 == 46) {
                        int var40 = var11[var9];
                        var6 -= 2;
                        int var41 = class89.field1412[var6];
                        if (var41 >= 0 && var41 < class259.field4530[var40]) {
                            class248.field4330[var40][var41] = class89.field1412[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var10 == 47) {
                        class181 var42 = class18.field321[var11[var9]];
                        if (var42 == null) {
                            var42 = class20.field359;
                        }
                        class265.field4626[var7++] = var42;
                        continue;
                    }
                    if (var10 == 48) {
                        int var43 = var11[var9];
                        var7--;
                        class18.field321[var43] = class265.field4626[var7];
                        class262.method1782(var43, (byte) -50);
                        continue;
                    }
                    if (var10 == 51) {
                        class214 var44 = var5.field1381[var11[var9]];
                        var6--;
                        class124 var45 = (class124) var44.method1424(true, (long) class89.field1412[var6]);
                        if (var45 != null) {
                            var9 += var45.field2029;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var9] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var10 < 300) {
                    if (var10 == 100) {
                        var6 -= 3;
                        int var47 = class89.field1412[var6];
                        int var48 = class89.field1412[var6 + 1];
                        int var49 = class89.field1412[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class175 var50 = class52.method394(var47, false);
                        if (var50.field3066 == null) {
                            var50.field3066 = new class175[var49 + 1];
                        }
                        if (var50.field3066.length <= var49) {
                            class175[] var51 = new class175[var49 + 1];
                            for (int var52 = 0; var52 < var50.field3066.length; var52++) {
                                var51[var52] = var50.field3066[var52];
                            }
                            var50.field3066 = var51;
                        }
                        if (var49 > 0 && var50.field3066[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class175 var53 = new class175();
                        var53.field2972 = true;
                        var53.field3069 = var48;
                        var53.field2934 = var49;
                        var53.field2958 = var53.field2987 = var50.field2987;
                        var50.field3066[var49] = var53;
                        if (var46) {
                            class187.field3311 = var53;
                        } else {
                            class188.field3319 = var53;
                        }
                        class218.method1453((byte) -68, var50);
                        continue;
                    }
                    if (var10 == 101) {
                        class175 var54 = var46 ? class187.field3311 : class188.field3319;
                        if (var54.field2934 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class175 var55 = class52.method394(var54.field2987, false);
                        var55.field3066[var54.field2934] = null;
                        class218.method1453((byte) -78, var55);
                        continue;
                    }
                    if (var10 == 102) {
                        var6--;
                        class175 var56 = class52.method394(class89.field1412[var6], false);
                        var56.field3066 = null;
                        class218.method1453((byte) -111, var56);
                        continue;
                    }
                    if (var10 == 200) {
                        var6 -= 2;
                        int var57 = class89.field1412[var6];
                        int var58 = class89.field1412[var6 + 1];
                        class175 var59 = class26.method221(var57, arg0 - 24806, var58);
                        if (var59 != null && var58 != -1) {
                            class89.field1412[var6++] = 1;
                            if (var46) {
                                class187.field3311 = var59;
                            } else {
                                class188.field3319 = var59;
                            }
                            continue;
                        }
                        class89.field1412[var6++] = 0;
                        continue;
                    }
                    if (var10 == 201) {
                        var6--;
                        int var60 = class89.field1412[var6];
                        class175 var61 = class52.method394(var60, false);
                        if (var61 == null) {
                            class89.field1412[var6++] = 0;
                        } else {
                            class89.field1412[var6++] = 1;
                            if (var46) {
                                class187.field3311 = var61;
                            } else {
                                class188.field3319 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var10 < 500) {
                    if (var10 == 403) {
                        var6 -= 2;
                        int var439 = class89.field1412[var6];
                        if (var439 >= 7) {
                            var439 -= 7;
                        }
                        int var440 = class89.field1412[var6 + 1];
                        class258.field4507.field1905.method1153(var440, (byte) 123, var439);
                        continue;
                    }
                    if (var10 == 404) {
                        var6 -= 2;
                        int var441 = class89.field1412[var6];
                        int var442 = class89.field1412[var6 + 1];
                        class258.field4507.field1905.method1151((byte) -100, var442, var441);
                        continue;
                    }
                    if (var10 == 410) {
                        var6--;
                        boolean var443 = class89.field1412[var6] != 0;
                        class258.field4507.field1905.method1146(var443, 90);
                        continue;
                    }
                } else if (!(var10 < 1000 || var10 >= 1100) || !(var10 < 2000 || var10 >= 2100)) {
                    class175 var433;
                    if (var10 >= 2000) {
                        var10 -= 1000;
                        var6--;
                        var433 = class52.method394(class89.field1412[var6], false);
                    } else {
                        var433 = var46 ? class187.field3311 : class188.field3319;
                    }
                    if (var10 == 1000) {
                        var6 -= 4;
                        var433.field2993 = class89.field1412[var6];
                        var433.field3002 = class89.field1412[var6 + 1];
                        int var434 = class89.field1412[var6 + 2];
                        if (var434 < 0) {
                            var434 = 0;
                        } else if (var434 > 5) {
                            var434 = 5;
                        }
                        int var435 = class89.field1412[var6 + 3];
                        if (var435 < 0) {
                            var435 = 0;
                        } else if (var435 > 5) {
                            var435 = 5;
                        }
                        var433.field2954 = (byte) var435;
                        var433.field3040 = (byte) var434;
                        class218.method1453((byte) -96, var433);
                        class108.method725(var433, 0);
                        continue;
                    }
                    if (var10 == 1001) {
                        var6 -= 4;
                        var433.field3072 = class89.field1412[var6];
                        var433.field2996 = class89.field1412[var6 + 1];
                        var433.field3031 = 0;
                        var433.field3077 = 0;
                        int var436 = class89.field1412[var6 + 2];
                        int var437 = class89.field1412[var6 + 3];
                        if (var436 < 0) {
                            var436 = 0;
                        } else if (var436 > 4) {
                            var436 = 4;
                        }
                        if (var437 < 0) {
                            var437 = 0;
                        } else if (var437 > 4) {
                            var437 = 4;
                        }
                        var433.field3084 = (byte) var437;
                        var433.field3083 = (byte) var436;
                        class218.method1453((byte) -93, var433);
                        class108.method725(var433, 0);
                        if (var433.field3069 == 0) {
                            class66.method469(var433, false, 268100240);
                        }
                        continue;
                    }
                    if (var10 == 1003) {
                        var6--;
                        boolean var438 = class89.field1412[var6] == 1;
                        if (var433.field2944 != var438) {
                            var433.field2944 = var438;
                            class218.method1453((byte) -87, var433);
                        }
                        continue;
                    }
                    if (var10 == 1004) {
                        var6 -= 2;
                        var433.field3060 = class89.field1412[var6];
                        var433.field2926 = class89.field1412[var6 + 1];
                        class218.method1453((byte) -116, var433);
                        class108.method725(var433, 0);
                        if (var433.field3069 == 0) {
                            class66.method469(var433, false, arg0 + 268100241);
                        }
                        continue;
                    }
                } else if (!(var10 < 1100 || var10 >= 1200) || !(var10 < 2100 || var10 >= 2200)) {
                    class175 var430;
                    if (var10 >= 2000) {
                        var6--;
                        var430 = class52.method394(class89.field1412[var6], false);
                        var10 -= 1000;
                    } else {
                        var430 = var46 ? class187.field3311 : class188.field3319;
                    }
                    if (var10 == 1100) {
                        var6 -= 2;
                        var430.field3014 = class89.field1412[var6];
                        if (var430.field2933 - var430.field3057 < var430.field3014) {
                            var430.field3014 = var430.field2933 - var430.field3057;
                        }
                        if (var430.field3014 < 0) {
                            var430.field3014 = 0;
                        }
                        var430.field2946 = class89.field1412[var6 + 1];
                        if (var430.field3033 - var430.field3041 < var430.field2946) {
                            var430.field2946 = var430.field3033 - var430.field3041;
                        }
                        if (var430.field2946 < 0) {
                            var430.field2946 = 0;
                        }
                        class218.method1453((byte) -109, var430);
                        continue;
                    }
                    if (var10 == 1101) {
                        var6--;
                        var430.field2969 = class89.field1412[var6];
                        class218.method1453((byte) -88, var430);
                        continue;
                    }
                    if (var10 == 1102) {
                        var6--;
                        var430.field3052 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -111, var430);
                        continue;
                    }
                    if (var10 == 1103) {
                        var6--;
                        var430.field3051 = class89.field1412[var6];
                        class218.method1453((byte) -112, var430);
                        continue;
                    }
                    if (var10 == 1104) {
                        var6--;
                        var430.field3001 = class89.field1412[var6];
                        class218.method1453((byte) -92, var430);
                        continue;
                    }
                    if (var10 == 1105) {
                        var6--;
                        var430.field2992 = class89.field1412[var6];
                        class218.method1453((byte) -83, var430);
                        continue;
                    }
                    if (var10 == 1106) {
                        var6--;
                        var430.field2924 = class89.field1412[var6];
                        class218.method1453((byte) -110, var430);
                        continue;
                    }
                    if (var10 == 1107) {
                        var6--;
                        var430.field2990 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -70, var430);
                        continue;
                    }
                    if (var10 == 1108) {
                        var430.field3017 = 1;
                        var6--;
                        var430.field2966 = class89.field1412[var6];
                        class218.method1453((byte) -85, var430);
                        continue;
                    }
                    if (var10 == 1109) {
                        var6 -= 6;
                        var430.field3004 = class89.field1412[var6];
                        var430.field2963 = class89.field1412[var6 + 1];
                        var430.field2967 = class89.field1412[var6 + 2];
                        var430.field3048 = class89.field1412[var6 + 3];
                        var430.field2931 = class89.field1412[var6 + 4];
                        var430.field2927 = class89.field1412[var6 + 5];
                        class218.method1453((byte) -123, var430);
                        continue;
                    }
                    if (var10 == 1110) {
                        var6--;
                        int var431 = class89.field1412[var6];
                        if (var430.field3063 != var431) {
                            var430.field2998 = 0;
                            var430.field3063 = var431;
                            var430.field3038 = 0;
                            class218.method1453((byte) -121, var430);
                        }
                        continue;
                    }
                    if (var10 == 1111) {
                        var6--;
                        var430.field2950 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -75, var430);
                        continue;
                    }
                    if (var10 == 1112) {
                        var7--;
                        class181 var432 = class265.field4626[var7];
                        if (!var432.method1202(var430.field3053, -4557)) {
                            var430.field3053 = var432;
                            class218.method1453((byte) -102, var430);
                        }
                        continue;
                    }
                    if (var10 == 1113) {
                        var6--;
                        var430.field2980 = class89.field1412[var6];
                        class218.method1453((byte) -116, var430);
                        continue;
                    }
                    if (var10 == 1114) {
                        var6 -= 3;
                        var430.field3034 = class89.field1412[var6];
                        var430.field3022 = class89.field1412[var6 + 1];
                        var430.field3054 = class89.field1412[var6 + 2];
                        class218.method1453((byte) -107, var430);
                        continue;
                    }
                    if (var10 == 1115) {
                        var6--;
                        var430.field2940 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -92, var430);
                        continue;
                    }
                    if (var10 == 1116) {
                        var6--;
                        var430.field3018 = class89.field1412[var6];
                        class218.method1453((byte) -107, var430);
                        continue;
                    }
                    if (var10 == 1117) {
                        var6--;
                        var430.field3056 = class89.field1412[var6];
                        class218.method1453((byte) -111, var430);
                        continue;
                    }
                    if (var10 == 1118) {
                        var6--;
                        var430.field3085 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -124, var430);
                        continue;
                    }
                    if (var10 == 1119) {
                        var6--;
                        var430.field3047 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -73, var430);
                        continue;
                    }
                    if (var10 == 1120) {
                        var6 -= 2;
                        var430.field2933 = class89.field1412[var6];
                        var430.field3033 = class89.field1412[var6 + 1];
                        class218.method1453((byte) -76, var430);
                        if (var430.field3069 == 0) {
                            class66.method469(var430, false, arg0 + 268100241);
                        }
                        continue;
                    }
                    if (var10 == 1121) {
                        var6 -= 2;
                        class218.method1453((byte) -87, var430);
                        continue;
                    }
                    if (var10 == 1122) {
                        var6--;
                        var430.field2962 = class89.field1412[var6] == 1;
                        class218.method1453((byte) -68, var430);
                        continue;
                    }
                } else if (var10 >= 1200 && var10 < 1300 || var10 >= 2200 && var10 < 2300) {
                    class175 var426;
                    if (var10 < 2000) {
                        var426 = var46 ? class187.field3311 : class188.field3319;
                    } else {
                        var10 -= 1000;
                        var6--;
                        var426 = class52.method394(class89.field1412[var6], false);
                    }
                    class218.method1453((byte) -96, var426);
                    if (var10 == 1200 || var10 == 1205) {
                        var6 -= 2;
                        int var427 = class89.field1412[var6 + 1];
                        int var428 = class89.field1412[var6];
                        if (var428 == -1) {
                            var426.field2966 = -1;
                            var426.field2975 = -1;
                            var426.field3017 = 1;
                        } else {
                            var426.field3075 = var427;
                            var426.field2975 = var428;
                            class99 var429 = class237.method1620(-29539, var428);
                            var426.field2931 = var429.field1636;
                            var426.field3048 = var429.field1593;
                            if (var10 == 1205) {
                                var426.field3035 = false;
                            } else {
                                var426.field3035 = true;
                            }
                            var426.field2963 = var429.field1664;
                            var426.field2967 = var429.field1627;
                            var426.field2927 = var429.field1614;
                            if (var426.field3031 > 0) {
                                var426.field2927 = var426.field2927 * 32 / var426.field3031;
                            } else if (var426.field3072 > 0) {
                                var426.field2927 = var426.field2927 * 32 / var426.field3072;
                            }
                            var426.field3004 = var429.field1655;
                        }
                        continue;
                    }
                    if (var10 == 1201) {
                        var426.field3017 = 2;
                        var6--;
                        var426.field2966 = class89.field1412[var6];
                        continue;
                    }
                    if (var10 == 1202) {
                        var426.field3017 = 3;
                        var426.field2966 = class258.field4507.field1905.method1140((byte) 111);
                        continue;
                    }
                    if (var10 == 1203) {
                        var426.field3017 = 6;
                        var6--;
                        var426.field2966 = class89.field1412[var6];
                        continue;
                    }
                    if (var10 == 1204) {
                        var426.field3017 = 5;
                        var6--;
                        var426.field2966 = class89.field1412[var6];
                        continue;
                    }
                } else if ((var10 < 1300 || var10 >= 1400) && (var10 < 2300 || var10 >= 2400)) {
                    if (var10 >= 1400 && var10 < 1500 || var10 >= 2400 && var10 < 2500) {
                        class175 var419;
                        if (var10 >= 2000) {
                            var10 -= 1000;
                            var6--;
                            var419 = class52.method394(class89.field1412[var6], false);
                        } else {
                            var419 = var46 ? class187.field3311 : class188.field3319;
                        }
                        var7--;
                        class181 var420 = class265.field4626[var7];
                        int[] var421 = null;
                        if (var420.method1226(-458531486) > 0 && var420.method1217(var420.method1226(-458531486) - 1, true) == 89) {
                            var6--;
                            int var422 = class89.field1412[var6];
                            if (var422 > 0) {
                                var421 = new int[var422];
                                while (var422-- > 0) {
                                    var6--;
                                    var421[var422] = class89.field1412[var6];
                                }
                            }
                            var420 = var420.method1235(0, 65, var420.method1226(-458531486) - 1);
                        }
                        Object[] var423 = new Object[var420.method1226(-458531486) + 1];
                        for (int var424 = var423.length - 1; var424 >= 1; var424--) {
                            if (var420.method1217(var424 - 1, true) == 115) {
                                var7--;
                                var423[var424] = class265.field4626[var7];
                            } else {
                                var6--;
                                var423[var424] = Integer.valueOf(class89.field1412[var6]);
                            }
                        }
                        var6--;
                        int var425 = class89.field1412[var6];
                        if (var425 == -1) {
                            var423 = null;
                        } else {
                            var423[0] = Integer.valueOf(var425);
                        }
                        if (var10 == 1400) {
                            var419.field3011 = var423;
                        } else if (var10 == 1401) {
                            var419.field2986 = var423;
                        } else if (var10 == 1402) {
                            var419.field2970 = var423;
                        } else if (var10 == 1403) {
                            var419.field2943 = var423;
                        } else if (var10 == 1404) {
                            var419.field3025 = var423;
                        } else if (var10 == 1405) {
                            var419.field2928 = var423;
                        } else if (var10 == 1406) {
                            var419.field2959 = var423;
                        } else if (var10 == 1407) {
                            var419.field3080 = var423;
                            var419.field2984 = var421;
                        } else if (var10 == 1408) {
                            var419.field2961 = var423;
                        } else if (var10 == 1409) {
                            var419.field2957 = var423;
                        } else if (var10 == 1410) {
                            var419.field3009 = var423;
                        } else if (var10 == 1411) {
                            var419.field2951 = var423;
                        } else if (var10 == 1412) {
                            var419.field2956 = var423;
                        } else if (var10 == 1414) {
                            var419.field2942 = var421;
                            var419.field3076 = var423;
                        } else if (var10 == 1415) {
                            var419.field2941 = var421;
                            var419.field3015 = var423;
                        } else if (var10 == 1416) {
                            var419.field3045 = var423;
                        } else if (var10 == 1417) {
                            var419.field2964 = var423;
                        } else if (var10 == 1418) {
                            var419.field2952 = var423;
                        } else if (var10 == 1419) {
                            var419.field2932 = var423;
                        } else if (var10 == 1420) {
                            var419.field2937 = var423;
                        } else if (var10 == 1421) {
                            var419.field3029 = var423;
                        } else if (var10 == 1422) {
                            var419.field3050 = var423;
                        } else if (var10 == 1423) {
                            var419.field2978 = var423;
                        } else if (var10 == 1424) {
                            var419.field2977 = var423;
                        } else if (var10 == 1425) {
                            var419.field2989 = var423;
                        } else if (var10 == 1426) {
                            var419.field3013 = var423;
                        } else if (var10 == 1427) {
                            var419.field3026 = var423;
                        } else if (var10 == 1428) {
                            var419.field2948 = var423;
                            var419.field3028 = var421;
                        } else if (var10 == 1429) {
                            var419.field3068 = var421;
                            var419.field3023 = var423;
                        }
                        var419.field2955 = true;
                        continue;
                    }
                    if (var10 < 1600) {
                        class175 var418 = var46 ? class187.field3311 : class188.field3319;
                        if (var10 == 1500) {
                            class89.field1412[var6++] = var418.field2929;
                            continue;
                        }
                        if (var10 == 1501) {
                            class89.field1412[var6++] = var418.field3036;
                            continue;
                        }
                        if (var10 == 1502) {
                            class89.field1412[var6++] = var418.field3057;
                            continue;
                        }
                        if (var10 == 1503) {
                            class89.field1412[var6++] = var418.field3041;
                            continue;
                        }
                        if (var10 == 1504) {
                            class89.field1412[var6++] = var418.field2944 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 1505) {
                            class89.field1412[var6++] = var418.field2958;
                            continue;
                        }
                    } else if (var10 < 1700) {
                        class175 var417 = var46 ? class187.field3311 : class188.field3319;
                        if (var10 == 1600) {
                            class89.field1412[var6++] = var417.field3014;
                            continue;
                        }
                        if (var10 == 1601) {
                            class89.field1412[var6++] = var417.field2946;
                            continue;
                        }
                        if (var10 == 1602) {
                            class265.field4626[var7++] = var417.field3053;
                            continue;
                        }
                        if (var10 == 1603) {
                            class89.field1412[var6++] = var417.field2933;
                            continue;
                        }
                        if (var10 == 1604) {
                            class89.field1412[var6++] = var417.field3033;
                            continue;
                        }
                        if (var10 == 1605) {
                            class89.field1412[var6++] = var417.field2927;
                            continue;
                        }
                        if (var10 == 1606) {
                            class89.field1412[var6++] = var417.field2967;
                            continue;
                        }
                        if (var10 == 1607) {
                            class89.field1412[var6++] = var417.field2931;
                            continue;
                        }
                        if (var10 == 1608) {
                            class89.field1412[var6++] = var417.field3048;
                            continue;
                        }
                        if (var10 == 1609) {
                            class89.field1412[var6++] = var417.field3051;
                            continue;
                        }
                    } else if (var10 < 1800) {
                        class175 var416 = var46 ? class187.field3311 : class188.field3319;
                        if (var10 == 1700) {
                            class89.field1412[var6++] = var416.field2975;
                            continue;
                        }
                        if (var10 == 1701) {
                            if (var416.field2975 == -1) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = var416.field3075;
                            }
                            continue;
                        }
                        if (var10 == 1702) {
                            class89.field1412[var6++] = var416.field2934;
                            continue;
                        }
                    } else if (var10 < 1900) {
                        class175 var414 = var46 ? class187.field3311 : class188.field3319;
                        if (var10 == 1800) {
                            class89.field1412[var6++] = class229.method1502((byte) -74, client.method1058(var414));
                            continue;
                        }
                        if (var10 == 1801) {
                            var6--;
                            int var415 = class89.field1412[var6];
                            int var452 = var415 - 1;
                            if (var414.field3016 != null && var414.field3016.length > var452 && var414.field3016[var452] != null) {
                                class265.field4626[var7++] = var414.field3016[var452];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 1802) {
                            if (var414.field3007 == null) {
                                class265.field4626[var7++] = class59.field892;
                            } else {
                                class265.field4626[var7++] = var414.field3007;
                            }
                            continue;
                        }
                    } else if (var10 < 2600) {
                        var6--;
                        class175 var413 = class52.method394(class89.field1412[var6], false);
                        if (var10 == 2500) {
                            class89.field1412[var6++] = var413.field2929;
                            continue;
                        }
                        if (var10 == 2501) {
                            class89.field1412[var6++] = var413.field3036;
                            continue;
                        }
                        if (var10 == 2502) {
                            class89.field1412[var6++] = var413.field3057;
                            continue;
                        }
                        if (var10 == 2503) {
                            class89.field1412[var6++] = var413.field3041;
                            continue;
                        }
                        if (var10 == 2504) {
                            class89.field1412[var6++] = var413.field2944 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 2505) {
                            class89.field1412[var6++] = var413.field2958;
                            continue;
                        }
                    } else if (var10 < 2700) {
                        var6--;
                        class175 var412 = class52.method394(class89.field1412[var6], false);
                        if (var10 == 2600) {
                            class89.field1412[var6++] = var412.field3014;
                            continue;
                        }
                        if (var10 == 2601) {
                            class89.field1412[var6++] = var412.field2946;
                            continue;
                        }
                        if (var10 == 2602) {
                            class265.field4626[var7++] = var412.field3053;
                            continue;
                        }
                        if (var10 == 2603) {
                            class89.field1412[var6++] = var412.field2933;
                            continue;
                        }
                        if (var10 == 2604) {
                            class89.field1412[var6++] = var412.field3033;
                            continue;
                        }
                        if (var10 == 2605) {
                            class89.field1412[var6++] = var412.field2927;
                            continue;
                        }
                        if (var10 == 2606) {
                            class89.field1412[var6++] = var412.field2967;
                            continue;
                        }
                        if (var10 == 2607) {
                            class89.field1412[var6++] = var412.field2931;
                            continue;
                        }
                        if (var10 == 2608) {
                            class89.field1412[var6++] = var412.field3048;
                            continue;
                        }
                        if (var10 == 2609) {
                            class89.field1412[var6++] = var412.field3051;
                            continue;
                        }
                    } else if (var10 < 2800) {
                        if (var10 == 2700) {
                            var6--;
                            class175 var66 = class52.method394(class89.field1412[var6], false);
                            class89.field1412[var6++] = var66.field2975;
                            continue;
                        }
                        if (var10 == 2701) {
                            var6--;
                            class175 var67 = class52.method394(class89.field1412[var6], false);
                            if (var67.field2975 == -1) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = var67.field3075;
                            }
                            continue;
                        }
                        if (var10 == 2702) {
                            var6--;
                            int var68 = class89.field1412[var6];
                            class228 var69 = (class228) class165.field2807.method1424(true, (long) var68);
                            if (var69 == null) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = 1;
                            }
                            continue;
                        }
                        if (var10 == 2703) {
                            var6--;
                            class175 var70 = class52.method394(class89.field1412[var6], false);
                            if (var70.field3066 == null) {
                                class89.field1412[var6++] = 0;
                                continue;
                            }
                            int var71 = var70.field3066.length;
                            for (int var72 = 0; var72 < var70.field3066.length; var72++) {
                                if (var70.field3066[var72] == null) {
                                    var71 = var72;
                                    break;
                                }
                            }
                            class89.field1412[var6++] = var71;
                            continue;
                        }
                        if (var10 == 2704 || var10 == 2705) {
                            var6 -= 2;
                            int var73 = class89.field1412[var6];
                            int var74 = class89.field1412[var6 + 1];
                            class228 var75 = (class228) class165.field2807.method1424(true, (long) var73);
                            if (var75 != null && var75.field3913 == var74) {
                                class89.field1412[var6++] = 1;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                    } else if (var10 < 2900) {
                        var6--;
                        class175 var76 = class52.method394(class89.field1412[var6], false);
                        if (var10 == 2800) {
                            class89.field1412[var6++] = class229.method1502((byte) -74, client.method1058(var76));
                            continue;
                        }
                        if (var10 == 2801) {
                            var6--;
                            int var77 = class89.field1412[var6];
                            int var451 = var77 - 1;
                            if (var76.field3016 != null && var76.field3016.length > var451 && var76.field3016[var451] != null) {
                                class265.field4626[var7++] = var76.field3016[var451];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 2802) {
                            if (var76.field3007 == null) {
                                class265.field4626[var7++] = class59.field892;
                            } else {
                                class265.field4626[var7++] = var76.field3007;
                            }
                            continue;
                        }
                    } else if (var10 < 3200) {
                        if (var10 == 3100) {
                            var7--;
                            class181 var78 = class265.field4626[var7];
                            class202.method1357(var78, 0, (byte) -124, class59.field892);
                            continue;
                        }
                        if (var10 == 3101) {
                            var6 -= 2;
                            class250.method1699((byte) 61, class89.field1412[var6], class258.field4507, class89.field1412[var6 + 1]);
                            continue;
                        }
                        if (var10 == 3103) {
                            class244.method1649(87);
                            continue;
                        }
                        if (var10 == 3104) {
                            class222.field3851++;
                            int var79 = 0;
                            var7--;
                            class181 var80 = class265.field4626[var7];
                            if (var80.method1242(29040)) {
                                var79 = var80.method1234(false);
                            }
                            class141.field2275.method541(239, -80);
                            class141.field2275.method1544(var79, arg0 - 3164);
                            continue;
                        }
                        if (var10 == 3105) {
                            class201.field3475++;
                            var7--;
                            class181 var81 = class265.field4626[var7];
                            class141.field2275.method541(148, arg0 ^ 0xFFFFFF88);
                            class141.field2275.method1511(false, var81.method1197(-118));
                            continue;
                        }
                        if (var10 == 3106) {
                            class121.field1977++;
                            var7--;
                            class181 var82 = class265.field4626[var7];
                            class141.field2275.method541(234, -95);
                            class141.field2275.method1538(var82.method1226(-458531486) + 1, (byte) 119);
                            class141.field2275.method1550(var82, 96);
                            continue;
                        }
                        if (var10 == 3107) {
                            var7--;
                            class181 var83 = class265.field4626[var7];
                            var6--;
                            int var84 = class89.field1412[var6];
                            class100.method669(var84, var83, (byte) 127);
                            continue;
                        }
                        if (var10 == 3108) {
                            var6 -= 3;
                            int var85 = class89.field1412[var6];
                            int var86 = class89.field1412[var6 + 2];
                            int var87 = class89.field1412[var6 + 1];
                            class175 var88 = class52.method394(var86, false);
                            class57.method413(var87, var88, var85, arg0 ^ 0xFFFFFF7F);
                            continue;
                        }
                        if (var10 == 3109) {
                            var6 -= 2;
                            int var89 = class89.field1412[var6 + 1];
                            int var90 = class89.field1412[var6];
                            class175 var91 = var46 ? class187.field3311 : class188.field3319;
                            class57.method413(var89, var91, var90, 128);
                            continue;
                        }
                        if (var10 == 3110) {
                            class208.field3562++;
                            var6--;
                            int var92 = class89.field1412[var6];
                            class141.field2275.method541(56, 86);
                            class141.field2275.method1534(arg0 + 1, var92);
                            continue;
                        }
                    } else if (var10 < 3300) {
                        if (var10 == 3200) {
                            var6 -= 3;
                            class45.method302((byte) 48, class89.field1412[var6], class89.field1412[var6 + 2], class89.field1412[var6 + 1]);
                            continue;
                        }
                        if (var10 == 3201) {
                            var6--;
                            class145.method947(class89.field1412[var6], true);
                            continue;
                        }
                        if (var10 == 3202) {
                            var6 -= 2;
                            class77.method532(class89.field1412[var6 + 1], 6848, class89.field1412[var6]);
                            continue;
                        }
                    } else if (var10 < 3400) {
                        if (var10 == 3300) {
                            class89.field1412[var6++] = class237.field4125;
                            continue;
                        }
                        if (var10 == 3301) {
                            var6 -= 2;
                            int var385 = class89.field1412[var6];
                            int var386 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class111.method740((byte) -91, var386, var385);
                            continue;
                        }
                        if (var10 == 3302) {
                            var6 -= 2;
                            int var387 = class89.field1412[var6];
                            int var388 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class212.method1409(3, var388, var387);
                            continue;
                        }
                        if (var10 == 3303) {
                            var6 -= 2;
                            int var389 = class89.field1412[var6];
                            int var390 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class248.method1694(var390, var389, -6);
                            continue;
                        }
                        if (var10 == 3304) {
                            var6--;
                            int var391 = class89.field1412[var6];
                            class89.field1412[var6++] = class26.method222(var391, (byte) -9).field2111;
                            continue;
                        }
                        if (var10 == 3305) {
                            var6--;
                            int var392 = class89.field1412[var6];
                            class89.field1412[var6++] = class184.field3265[var392];
                            continue;
                        }
                        if (var10 == 3306) {
                            var6--;
                            int var393 = class89.field1412[var6];
                            class89.field1412[var6++] = class123.field2022[var393];
                            continue;
                        }
                        if (var10 == 3307) {
                            var6--;
                            int var394 = class89.field1412[var6];
                            class89.field1412[var6++] = class242.field4209[var394];
                            continue;
                        }
                        if (var10 == 3308) {
                            int var395 = (class258.field4507.field2681 >> 7) + class222.field3844;
                            int var396 = class38.field581;
                            int var397 = (class258.field4507.field2654 >> 7) + class253.field4420;
                            class89.field1412[var6++] = (var396 << 28) + (var397 << 14) + var395;
                            continue;
                        }
                        if (var10 == 3309) {
                            var6--;
                            int var398 = class89.field1412[var6];
                            class89.field1412[var6++] = class5.method43(var398, 268434598) >> 14;
                            continue;
                        }
                        if (var10 == 3310) {
                            var6--;
                            int var399 = class89.field1412[var6];
                            class89.field1412[var6++] = var399 >> 28;
                            continue;
                        }
                        if (var10 == 3311) {
                            var6--;
                            int var400 = class89.field1412[var6];
                            class89.field1412[var6++] = class5.method43(16383, var400);
                            continue;
                        }
                        if (var10 == 3312) {
                            class89.field1412[var6++] = class213.field3664 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3313) {
                            var6 -= 2;
                            int var401 = class89.field1412[var6] + 32768;
                            int var402 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class111.method740((byte) -91, var402, var401);
                            continue;
                        }
                        if (var10 == 3314) {
                            var6 -= 2;
                            int var403 = class89.field1412[var6 + 1];
                            int var404 = class89.field1412[var6] + 32768;
                            class89.field1412[var6++] = class212.method1409(3, var403, var404);
                            continue;
                        }
                        if (var10 == 3315) {
                            var6 -= 2;
                            int var405 = class89.field1412[var6] + 32768;
                            int var406 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class248.method1694(var406, var405, 120);
                            continue;
                        }
                        if (var10 == 3316) {
                            if (class264.field4594 < 2) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = class264.field4594;
                            }
                            continue;
                        }
                        if (var10 == 3317) {
                            class89.field1412[var6++] = class102.field1701;
                            continue;
                        }
                        if (var10 == 3318) {
                            class89.field1412[var6++] = class62.field947;
                            continue;
                        }
                        if (var10 == 3321) {
                            class89.field1412[var6++] = class55.field848;
                            continue;
                        }
                        if (var10 == 3322) {
                            class89.field1412[var6++] = class75.field1201;
                            continue;
                        }
                        if (var10 == 3323) {
                            if (class237.field4120 >= 5 && class237.field4120 <= 9) {
                                class89.field1412[var6++] = 1;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3324) {
                            if (class237.field4120 >= 5 && class237.field4120 <= 9) {
                                class89.field1412[var6++] = class237.field4120;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3325) {
                            if (class232.field4062 > 0) {
                                class89.field1412[var6++] = 1;
                            } else {
                                class89.field1412[var6++] = 0;
                            }
                            continue;
                        }
                        if (var10 == 3326) {
                            class89.field1412[var6++] = class258.field4507.field1919;
                            continue;
                        }
                        if (var10 == 3327) {
                            class89.field1412[var6++] = class258.field4507.field1905.field2909 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3328) {
                            class89.field1412[var6++] = class116.field1914;
                            continue;
                        }
                        if (var10 == 3329) {
                            class89.field1412[var6++] = class11.field241;
                            continue;
                        }
                        if (var10 == 3330) {
                            var6--;
                            int var407 = class89.field1412[var6];
                            class89.field1412[var6++] = class165.method1100(var407, false);
                            continue;
                        }
                        if (var10 == 3331) {
                            var6 -= 2;
                            int var408 = class89.field1412[var6];
                            int var409 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class39.method284(-61, var408, false, var409);
                            continue;
                        }
                        if (var10 == 3332) {
                            var6 -= 2;
                            int var410 = class89.field1412[var6];
                            int var411 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class39.method284(-67, var410, true, var411);
                            continue;
                        }
                        if (var10 == 3333) {
                            class89.field1412[var6++] = class115.field1859;
                            continue;
                        }
                    } else if (var10 < 3500) {
                        if (var10 == 3400) {
                            var6 -= 2;
                            int var370 = class89.field1412[var6];
                            int var371 = class89.field1412[var6 + 1];
                            class136 var372 = class51.method382(true, var370);
                            class265.field4626[var7++] = var372.method874((byte) 50, var371);
                            continue;
                        }
                        if (var10 == 3408) {
                            var6 -= 4;
                            int var373 = class89.field1412[var6];
                            int var374 = class89.field1412[var6 + 1];
                            int var375 = class89.field1412[var6 + 3];
                            int var376 = class89.field1412[var6 + 2];
                            class136 var377 = class51.method382(true, var376);
                            if (var377.field2222 == var373 && var377.field2227 == var374) {
                                if (var374 == 115) {
                                    class265.field4626[var7++] = var377.method874((byte) 39, var375);
                                } else {
                                    class89.field1412[var6++] = var377.method872(false, var375);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var10 == 3409) {
                            var6 -= 3;
                            int var378 = class89.field1412[var6];
                            int var379 = class89.field1412[var6 + 1];
                            int var380 = class89.field1412[var6 + 2];
                            class136 var381 = class51.method382(true, var379);
                            if (var381.field2227 != var378) {
                                throw new RuntimeException("C3409-1");
                            }
                            class89.field1412[var6++] = var381.method878(var380, false) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3410) {
                            var6--;
                            int var382 = class89.field1412[var6];
                            var7--;
                            class181 var383 = class265.field4626[var7];
                            class136 var384 = class51.method382(true, var382);
                            if (var384.field2227 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class89.field1412[var6++] = var384.method871((byte) 56, var383) ? 1 : 0;
                            continue;
                        }
                    } else if (var10 < 3700) {
                        if (var10 == 3600) {
                            if (class12.field250 == 0) {
                                class89.field1412[var6++] = -2;
                            } else if (class12.field250 == 1) {
                                class89.field1412[var6++] = -1;
                            } else {
                                class89.field1412[var6++] = class149.field2483;
                            }
                            continue;
                        }
                        if (var10 == 3601) {
                            var6--;
                            int var348 = class89.field1412[var6];
                            if (class12.field250 == 2 && var348 < class149.field2483) {
                                class265.field4626[var7++] = class5.field100[var348];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 3602) {
                            var6--;
                            int var349 = class89.field1412[var6];
                            if (class12.field250 == 2 && class149.field2483 > var349) {
                                class89.field1412[var6++] = class140.field2272[var349];
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3603) {
                            var6--;
                            int var350 = class89.field1412[var6];
                            if (class12.field250 == 2 && class149.field2483 > var350) {
                                class89.field1412[var6++] = class190.field3352[var350];
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3604) {
                            var7--;
                            class181 var351 = class265.field4626[var7];
                            var6--;
                            int var352 = class89.field1412[var6];
                            class193.method1326(var351, (byte) 87, var352);
                            continue;
                        }
                        if (var10 == 3605) {
                            var7--;
                            class181 var353 = class265.field4626[var7];
                            class203.method1361(arg0 ^ 0xFFFFFF8E, var353.method1197(-112));
                            continue;
                        }
                        if (var10 == 3606) {
                            var7--;
                            class181 var354 = class265.field4626[var7];
                            class113.method751(var354.method1197(-108), 85);
                            continue;
                        }
                        if (var10 == 3607) {
                            var7--;
                            class181 var355 = class265.field4626[var7];
                            class253.method1720((byte) 99, var355.method1197(-124));
                            continue;
                        }
                        if (var10 == 3608) {
                            var7--;
                            class181 var356 = class265.field4626[var7];
                            class63.method450(var356.method1197(-113), 5463);
                            continue;
                        }
                        if (var10 == 3609) {
                            var7--;
                            class181 var357 = class265.field4626[var7];
                            if (var357.method1230(false, class255.field4464) || var357.method1230(false, class232.field4056)) {
                                var357 = var357.method1215(arg0 ^ 0xFFFFFF8E, 7);
                            }
                            class89.field1412[var6++] = class177.method1185(0, var357) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3610) {
                            var6--;
                            int var358 = class89.field1412[var6];
                            if (class12.field250 == 2 && var358 < class149.field2483) {
                                class265.field4626[var7++] = class175.field2947[var358];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 3611) {
                            if (class97.field1564 == null) {
                                class265.field4626[var7++] = class59.field892;
                            } else {
                                class265.field4626[var7++] = class97.field1564.method1223((byte) -57);
                            }
                            continue;
                        }
                        if (var10 == 3612) {
                            if (class97.field1564 == null) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = class127.field2104;
                            }
                            continue;
                        }
                        if (var10 == 3613) {
                            var6--;
                            int var359 = class89.field1412[var6];
                            if (class97.field1564 != null && var359 < class127.field2104) {
                                class265.field4626[var7++] = class61.field933[var359].field4219.method1223((byte) -57);
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 3614) {
                            var6--;
                            int var360 = class89.field1412[var6];
                            if (class97.field1564 != null && class127.field2104 > var360) {
                                class89.field1412[var6++] = class61.field933[var360].field4216;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3615) {
                            var6--;
                            int var361 = class89.field1412[var6];
                            if (class97.field1564 != null && class127.field2104 > var361) {
                                class89.field1412[var6++] = class61.field933[var361].field4218;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3616) {
                            class89.field1412[var6++] = class218.field3739;
                            continue;
                        }
                        if (var10 == 3617) {
                            var7--;
                            class181 var362 = class265.field4626[var7];
                            class173.method1148(var362, (byte) 35);
                            continue;
                        }
                        if (var10 == 3618) {
                            class89.field1412[var6++] = class152.field2530;
                            continue;
                        }
                        if (var10 == 3619) {
                            var7--;
                            class181 var363 = class265.field4626[var7];
                            class181.method1228(var363.method1197(-123), false);
                            continue;
                        }
                        if (var10 == 3620) {
                            class229.method1500(true);
                            continue;
                        }
                        if (var10 == 3621) {
                            if (class12.field250 == 0) {
                                class89.field1412[var6++] = -1;
                            } else {
                                class89.field1412[var6++] = class221.field3815;
                            }
                            continue;
                        }
                        if (var10 == 3622) {
                            var6--;
                            int var364 = class89.field1412[var6];
                            if (class12.field250 != 0 && class221.field3815 > var364) {
                                class265.field4626[var7++] = class19.method184(-26890, class256.field4483[var364]).method1223((byte) -57);
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 3623) {
                            var7--;
                            class181 var365 = class265.field4626[var7];
                            if (var365.method1230(false, class255.field4464) || var365.method1230(false, class232.field4056)) {
                                var365 = var365.method1215(106, 7);
                            }
                            class89.field1412[var6++] = class140.method891(-4241, var365) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3624) {
                            var6--;
                            int var366 = class89.field1412[var6];
                            if (class61.field933 != null && var366 < class127.field2104 && class61.field933[var366].field4219.method1227(arg0 + 30094, class258.field4507.field1883)) {
                                class89.field1412[var6++] = 1;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3625) {
                            if (class190.field3362 == null) {
                                class265.field4626[var7++] = class59.field892;
                            } else {
                                class265.field4626[var7++] = class190.field3362.method1223((byte) -57);
                            }
                            continue;
                        }
                        if (var10 == 3626) {
                            var6--;
                            int var367 = class89.field1412[var6];
                            if (class97.field1564 != null && var367 < class127.field2104) {
                                class265.field4626[var7++] = class61.field933[var367].field4222;
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 3627) {
                            var6--;
                            int var368 = class89.field1412[var6];
                            if (class12.field250 == 2 && var368 >= 0 && class149.field2483 > var368) {
                                class89.field1412[var6++] = class248.field4331[var368] ? 1 : 0;
                                continue;
                            }
                            class89.field1412[var6++] = 0;
                            continue;
                        }
                        if (var10 == 3628) {
                            var7--;
                            class181 var369 = class265.field4626[var7];
                            if (var369.method1230(false, class255.field4464) || var369.method1230(false, class232.field4056)) {
                                var369 = var369.method1215(119, 7);
                            }
                            class89.field1412[var6++] = class230.method1557(var369, 0);
                            continue;
                        }
                    } else if (var10 < 4000) {
                        if (var10 == 3903) {
                            var6--;
                            int var93 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var93].method177(false);
                            continue;
                        }
                        if (var10 == 3904) {
                            var6--;
                            int var94 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var94].field343;
                            continue;
                        }
                        if (var10 == 3905) {
                            var6--;
                            int var95 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var95].field337;
                            continue;
                        }
                        if (var10 == 3906) {
                            var6--;
                            int var96 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var96].field336;
                            continue;
                        }
                        if (var10 == 3907) {
                            var6--;
                            int var97 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var97].field350;
                            continue;
                        }
                        if (var10 == 3908) {
                            var6--;
                            int var98 = class89.field1412[var6];
                            class89.field1412[var6++] = class69.field1112[var98].field330;
                            continue;
                        }
                        if (var10 == 3910) {
                            var6--;
                            int var99 = class89.field1412[var6];
                            int var100 = class69.field1112[var99].method180(arg0 + 8);
                            class89.field1412[var6++] = var100 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3911) {
                            var6--;
                            int var101 = class89.field1412[var6];
                            int var102 = class69.field1112[var101].method180(7);
                            class89.field1412[var6++] = var102 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3912) {
                            var6--;
                            int var103 = class89.field1412[var6];
                            int var104 = class69.field1112[var103].method180(arg0 + 8);
                            class89.field1412[var6++] = var104 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 3913) {
                            var6--;
                            int var105 = class89.field1412[var6];
                            int var106 = class69.field1112[var105].method180(7);
                            class89.field1412[var6++] = var106 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var10 < 4100) {
                        if (var10 == 4000) {
                            var6 -= 2;
                            int var107 = class89.field1412[var6];
                            int var108 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = var107 + var108;
                            continue;
                        }
                        if (var10 == 4001) {
                            var6 -= 2;
                            int var109 = class89.field1412[var6];
                            int var110 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = var109 - var110;
                            continue;
                        }
                        if (var10 == 4002) {
                            var6 -= 2;
                            int var111 = class89.field1412[var6];
                            int var112 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = var111 * var112;
                            continue;
                        }
                        if (var10 == 4003) {
                            var6 -= 2;
                            int var113 = class89.field1412[var6 + 1];
                            int var114 = class89.field1412[var6];
                            class89.field1412[var6++] = var114 / var113;
                            continue;
                        }
                        if (var10 == 4004) {
                            var6--;
                            int var115 = class89.field1412[var6];
                            class89.field1412[var6++] = (int) (Math.random() * (double) var115);
                            continue;
                        }
                        if (var10 == 4005) {
                            var6--;
                            int var116 = class89.field1412[var6];
                            class89.field1412[var6++] = (int) ((double) (var116 + 1) * Math.random());
                            continue;
                        }
                        if (var10 == 4006) {
                            var6 -= 5;
                            int var117 = class89.field1412[var6 + 1];
                            int var118 = class89.field1412[var6];
                            int var119 = class89.field1412[var6 + 2];
                            int var120 = class89.field1412[var6 + 4];
                            int var121 = class89.field1412[var6 + 3];
                            class89.field1412[var6++] = (var117 - var118) * (var120 - var119) / (var121 - var119) + var118;
                            continue;
                        }
                        if (var10 == 4007) {
                            var6 -= 2;
                            long var122 = (long) class89.field1412[var6];
                            long var124 = (long) class89.field1412[var6 + 1];
                            class89.field1412[var6++] = (int) (var122 * var124 / 100L + var122);
                            continue;
                        }
                        if (var10 == 4008) {
                            var6 -= 2;
                            int var126 = class89.field1412[var6];
                            int var127 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class185.method1291(var126, 0x1 << var127);
                            continue;
                        }
                        if (var10 == 4009) {
                            var6 -= 2;
                            int var128 = class89.field1412[var6 + 1];
                            int var129 = class89.field1412[var6];
                            class89.field1412[var6++] = class5.method43(var129, -(0x1 << var128) - 1);
                            continue;
                        }
                        if (var10 == 4010) {
                            var6 -= 2;
                            int var130 = class89.field1412[var6];
                            int var131 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class5.method43(var130, 0x1 << var131) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var10 == 4011) {
                            var6 -= 2;
                            int var132 = class89.field1412[var6 + 1];
                            int var133 = class89.field1412[var6];
                            class89.field1412[var6++] = var133 % var132;
                            continue;
                        }
                        if (var10 == 4012) {
                            var6 -= 2;
                            int var134 = class89.field1412[var6];
                            int var135 = class89.field1412[var6 + 1];
                            if (var134 == 0) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = (int) Math.pow((double) var134, (double) var135);
                            }
                            continue;
                        }
                        if (var10 == 4013) {
                            var6 -= 2;
                            int var136 = class89.field1412[var6];
                            int var137 = class89.field1412[var6 + 1];
                            if (var136 == 0) {
                                class89.field1412[var6++] = 0;
                            } else if (var137 == 0) {
                                class89.field1412[var6++] = Integer.MAX_VALUE;
                            } else {
                                class89.field1412[var6++] = (int) Math.pow((double) var136, 1.0D / (double) var137);
                            }
                            continue;
                        }
                        if (var10 == 4014) {
                            var6 -= 2;
                            int var138 = class89.field1412[var6];
                            int var139 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = class5.method43(var139, var138);
                            continue;
                        }
                        if (var10 == 4015) {
                            var6 -= 2;
                            int var140 = class89.field1412[var6 + 1];
                            int var141 = class89.field1412[var6];
                            class89.field1412[var6++] = class185.method1291(var140, var141);
                            continue;
                        }
                        if (var10 == 4016) {
                            var6 -= 2;
                            int var142 = class89.field1412[var6 + 1];
                            int var143 = class89.field1412[var6];
                            class89.field1412[var6++] = var142 > var143 ? var143 : var142;
                            continue;
                        }
                        if (var10 == 4017) {
                            var6 -= 2;
                            int var144 = class89.field1412[var6 + 1];
                            int var145 = class89.field1412[var6];
                            class89.field1412[var6++] = var145 > var144 ? var145 : var144;
                            continue;
                        }
                        if (var10 == 4018) {
                            var6 -= 3;
                            long var146 = (long) class89.field1412[var6];
                            long var148 = (long) class89.field1412[var6 + 1];
                            long var150 = (long) class89.field1412[var6 + 2];
                            class89.field1412[var6++] = (int) (var146 * var150 / var148);
                            continue;
                        }
                    } else if (var10 < 4200) {
                        if (var10 == 4100) {
                            var6--;
                            int var152 = class89.field1412[var6];
                            var7--;
                            class181 var153 = class265.field4626[var7];
                            class265.field4626[var7++] = class175.method1164(new class181[] { var153, class169.method1119((byte) -103, var152) }, (byte) 123);
                            continue;
                        }
                        if (var10 == 4101) {
                            var7 -= 2;
                            class181 var154 = class265.field4626[var7 + 1];
                            class181 var155 = class265.field4626[var7];
                            class265.field4626[var7++] = class175.method1164(new class181[] { var155, var154 }, (byte) 124);
                            continue;
                        }
                        if (var10 == 4102) {
                            var7--;
                            class181 var156 = class265.field4626[var7];
                            var6--;
                            int var157 = class89.field1412[var6];
                            class265.field4626[var7++] = class175.method1164(new class181[] { var156, class255.method1737(true, true, var157) }, (byte) 123);
                            continue;
                        }
                        if (var10 == 4103) {
                            var7--;
                            class181 var158 = class265.field4626[var7];
                            class265.field4626[var7++] = var158.method1216(class102.method690(arg0, 90));
                            continue;
                        }
                        if (var10 == 4104) {
                            var6--;
                            int var159 = class89.field1412[var6];
                            long var160 = ((long) var159 + 11745L) * 86400000L;
                            class33.field530.setTime(new Date(var160));
                            int var162 = class33.field530.get(5);
                            int var163 = class33.field530.get(2);
                            int var164 = class33.field530.get(1);
                            class265.field4626[var7++] = class175.method1164(new class181[] { class169.method1119((byte) 114, var162), class33.field536, class149.field2486[var163], class33.field536, class169.method1119((byte) -128, var164) }, (byte) 125);
                            continue;
                        }
                        if (var10 == 4105) {
                            var7 -= 2;
                            class181 var165 = class265.field4626[var7 + 1];
                            class181 var166 = class265.field4626[var7];
                            if (class258.field4507.field1905 != null && class258.field4507.field1905.field2909) {
                                class265.field4626[var7++] = var165;
                                continue;
                            }
                            class265.field4626[var7++] = var166;
                            continue;
                        }
                        if (var10 == 4106) {
                            var6--;
                            int var167 = class89.field1412[var6];
                            class265.field4626[var7++] = class169.method1119((byte) 39, var167);
                            continue;
                        }
                        if (var10 == 4107) {
                            var7 -= 2;
                            class89.field1412[var6++] = class265.field4626[var7].method1222(class265.field4626[var7 + 1], 0);
                            continue;
                        }
                        if (var10 == 4108) {
                            var6 -= 2;
                            var7--;
                            class181 var168 = class265.field4626[var7];
                            int var169 = class89.field1412[var6 + 1];
                            int var170 = class89.field1412[var6];
                            byte[] var171 = class71.field1132.method89(0, var169, 99);
                            class14 var172 = new class14(var171);
                            var172.method1665(class156.field2610, (int[]) null);
                            class89.field1412[var6++] = var172.method1664(var168, var170);
                            continue;
                        }
                        if (var10 == 4109) {
                            var6 -= 2;
                            var7--;
                            class181 var173 = class265.field4626[var7];
                            int var174 = class89.field1412[var6];
                            int var175 = class89.field1412[var6 + 1];
                            byte[] var176 = class71.field1132.method89(0, var175, arg0 + 123);
                            class14 var177 = new class14(var176);
                            var177.method1665(class156.field2610, (int[]) null);
                            class89.field1412[var6++] = var177.method1676(var173, var174);
                            continue;
                        }
                        if (var10 == 4110) {
                            var7 -= 2;
                            class181 var178 = class265.field4626[var7 + 1];
                            class181 var179 = class265.field4626[var7];
                            var6--;
                            if (class89.field1412[var6] == 1) {
                                class265.field4626[var7++] = var179;
                            } else {
                                class265.field4626[var7++] = var178;
                            }
                            continue;
                        }
                        if (var10 == 4111) {
                            var7--;
                            class181 var180 = class265.field4626[var7];
                            class265.field4626[var7++] = class245.method1657(var180);
                            continue;
                        }
                        if (var10 == 4112) {
                            var7--;
                            class181 var181 = class265.field4626[var7];
                            var6--;
                            int var182 = class89.field1412[var6];
                            if (var182 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class265.field4626[var7++] = var181.method1203(var182, 19629);
                            continue;
                        }
                        if (var10 == 4113) {
                            var6--;
                            int var183 = class89.field1412[var6];
                            class89.field1412[var6++] = class39.method282(arg0 - 36, var183) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4114) {
                            var6--;
                            int var184 = class89.field1412[var6];
                            class89.field1412[var6++] = class222.method1474(var184, (byte) 64) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4115) {
                            var6--;
                            int var185 = class89.field1412[var6];
                            class89.field1412[var6++] = class100.method672(863, var185) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4116) {
                            var6--;
                            int var186 = class89.field1412[var6];
                            class89.field1412[var6++] = class11.method110(class102.method690(arg0, 5247), var186) ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4117) {
                            var7--;
                            class181 var187 = class265.field4626[var7];
                            if (var187 == null) {
                                class89.field1412[var6++] = 0;
                            } else {
                                class89.field1412[var6++] = var187.method1226(-458531486);
                            }
                            continue;
                        }
                        if (var10 == 4118) {
                            var6 -= 2;
                            var7--;
                            class181 var188 = class265.field4626[var7];
                            int var189 = class89.field1412[var6];
                            int var190 = class89.field1412[var6 + 1];
                            class265.field4626[var7++] = var188.method1235(var189, 94, var190);
                            continue;
                        }
                        if (var10 == 4119) {
                            var7--;
                            class181 var191 = class265.field4626[var7];
                            class181 var192 = class232.method1602(var191.method1226(arg0 - 458531485), (byte) 61);
                            boolean var193 = false;
                            for (int var194 = 0; var194 < var191.method1226(arg0 - 458531485); var194++) {
                                int var195 = var191.method1217(var194, true);
                                if (var195 == 60) {
                                    var193 = true;
                                } else if (var195 == 62) {
                                    var193 = false;
                                } else if (!var193) {
                                    var192.method1225((byte) 104, var195);
                                }
                            }
                            var192.method1221(1);
                            class265.field4626[var7++] = var192;
                            continue;
                        }
                        if (var10 == 4120) {
                            var7--;
                            class181 var196 = class265.field4626[var7];
                            var6 -= 2;
                            int var197 = class89.field1412[var6];
                            int var198 = class89.field1412[var6 + 1];
                            class89.field1412[var6++] = var196.method1208(var197, (byte) 67, var198);
                            continue;
                        }
                        if (var10 == 4121) {
                            var7 -= 2;
                            class181 var199 = class265.field4626[var7 + 1];
                            var6--;
                            int var200 = class89.field1412[var6];
                            class181 var201 = class265.field4626[var7];
                            class89.field1412[var6++] = var201.method1206(var200, var199, (byte) 127);
                            continue;
                        }
                        if (var10 == 4122) {
                            var6--;
                            int var202 = class89.field1412[var6];
                            class89.field1412[var6++] = class137.method883(var202, 19284);
                            continue;
                        }
                        if (var10 == 4123) {
                            var6--;
                            int var203 = class89.field1412[var6];
                            class89.field1412[var6++] = class75.method526(254, var203);
                            continue;
                        }
                    } else if (var10 < 4300) {
                        if (var10 == 4200) {
                            var6--;
                            int var329 = class89.field1412[var6];
                            class265.field4626[var7++] = class237.method1620(arg0 - 29538, var329).field1652;
                            continue;
                        }
                        if (var10 == 4201) {
                            var6 -= 2;
                            int var330 = class89.field1412[var6];
                            int var331 = class89.field1412[var6 + 1];
                            class99 var332 = class237.method1620(-29539, var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field1595[var331 - 1] != null) {
                                class265.field4626[var7++] = var332.field1595[var331 - 1];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 4202) {
                            var6 -= 2;
                            int var333 = class89.field1412[var6];
                            int var334 = class89.field1412[var6 + 1];
                            class99 var335 = class237.method1620(-29539, var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field1608[var334 - 1] != null) {
                                class265.field4626[var7++] = var335.field1608[var334 - 1];
                                continue;
                            }
                            class265.field4626[var7++] = class59.field892;
                            continue;
                        }
                        if (var10 == 4203) {
                            var6--;
                            int var336 = class89.field1412[var6];
                            class89.field1412[var6++] = class237.method1620(arg0 - 29538, var336).field1594;
                            continue;
                        }
                        if (var10 == 4204) {
                            var6--;
                            int var337 = class89.field1412[var6];
                            class89.field1412[var6++] = class237.method1620(-29539, var337).field1639 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4205) {
                            var6--;
                            int var338 = class89.field1412[var6];
                            class99 var339 = class237.method1620(-29539, var338);
                            if (var339.field1642 == -1 && var339.field1631 >= 0) {
                                class89.field1412[var6++] = var339.field1631;
                                continue;
                            }
                            class89.field1412[var6++] = var338;
                            continue;
                        }
                        if (var10 == 4206) {
                            var6--;
                            int var340 = class89.field1412[var6];
                            class99 var341 = class237.method1620(-29539, var340);
                            if (var341.field1642 >= 0 && var341.field1631 >= 0) {
                                class89.field1412[var6++] = var341.field1631;
                                continue;
                            }
                            class89.field1412[var6++] = var340;
                            continue;
                        }
                        if (var10 == 4207) {
                            var6--;
                            int var342 = class89.field1412[var6];
                            class89.field1412[var6++] = class237.method1620(-29539, var342).field1616 ? 1 : 0;
                            continue;
                        }
                        if (var10 == 4208) {
                            var6 -= 2;
                            int var343 = class89.field1412[var6];
                            int var344 = class89.field1412[var6 + 1];
                            class93 var345 = class44.method299(var344, -70);
                            if (var345.method616(arg0 ^ 0xFFFFFFA9)) {
                                class265.field4626[var7++] = class237.method1620(-29539, var343).method651(var345.field1482, var344, class102.method690(arg0, -1));
                            } else {
                                class89.field1412[var6++] = class237.method1620(-29539, var343).method653(var345.field1483, var344, true);
                            }
                            continue;
                        }
                        if (var10 == 4210) {
                            var7--;
                            class181 var346 = class265.field4626[var7];
                            var6--;
                            int var347 = class89.field1412[var6];
                            class19.method178(var346, var347 == 1, (byte) 98);
                            class89.field1412[var6++] = class115.field1877;
                            continue;
                        }
                        if (var10 == 4211) {
                            if (class99.field1610 != null && class115.field1877 > class2.field60) {
                                class89.field1412[var6++] = class5.method43(65535, class99.field1610[class2.field60++]);
                                continue;
                            }
                            class89.field1412[var6++] = -1;
                            continue;
                        }
                        if (var10 == 4212) {
                            class2.field60 = 0;
                            continue;
                        }
                    } else if (var10 >= 4400) {
                        if (var10 < 4500) {
                            if (var10 == 4400) {
                                var6 -= 2;
                                int var204 = class89.field1412[var6 + 1];
                                int var205 = class89.field1412[var6];
                                class93 var206 = class44.method299(var204, arg0 + 92);
                                if (var206.method616(arg0 + 77)) {
                                    class265.field4626[var7++] = class62.method442((byte) 79, var205).method959(class102.method690(arg0, 44), var206.field1482, var204);
                                } else {
                                    class89.field1412[var6++] = class62.method442((byte) 79, var205).method955(-120, var206.field1483, var204);
                                }
                                continue;
                            }
                        } else if (var10 >= 4600) {
                            if (var10 < 5100) {
                                if (var10 == 5000) {
                                    class89.field1412[var6++] = class109.field1781;
                                    continue;
                                }
                                if (var10 == 5001) {
                                    var6 -= 3;
                                    class203.field3505++;
                                    class109.field1781 = class89.field1412[var6];
                                    class123.field2018 = class89.field1412[var6 + 1];
                                    class221.field3819 = class89.field1412[var6 + 2];
                                    class141.field2275.method541(82, 100);
                                    class141.field2275.method1538(class109.field1781, (byte) 79);
                                    class141.field2275.method1538(class123.field2018, (byte) 77);
                                    class141.field2275.method1538(class221.field3819, (byte) -117);
                                    continue;
                                }
                                if (var10 == 5002) {
                                    class109.field1786++;
                                    var6 -= 2;
                                    var7--;
                                    class181 var207 = class265.field4626[var7];
                                    int var208 = class89.field1412[var6];
                                    int var209 = class89.field1412[var6 + 1];
                                    class141.field2275.method541(83, 113);
                                    class141.field2275.method1511(false, var207.method1197(-112));
                                    class141.field2275.method1538(var208 - 1, (byte) 109);
                                    class141.field2275.method1538(var209, (byte) -118);
                                    continue;
                                }
                                if (var10 == 5003) {
                                    class181 var210 = null;
                                    var6--;
                                    int var211 = class89.field1412[var6];
                                    if (var211 < 100) {
                                        var210 = class110.field1809[var211];
                                    }
                                    if (var210 == null) {
                                        var210 = class59.field892;
                                    }
                                    class265.field4626[var7++] = var210;
                                    continue;
                                }
                                if (var10 == 5004) {
                                    var6--;
                                    int var212 = class89.field1412[var6];
                                    int var213 = -1;
                                    if (var212 < 100 && class110.field1809[var212] != null) {
                                        var213 = class91.field1452[var212];
                                    }
                                    class89.field1412[var6++] = var213;
                                    continue;
                                }
                                if (var10 == 5005) {
                                    class89.field1412[var6++] = class123.field2018;
                                    continue;
                                }
                                if (var10 == 5008) {
                                    var7--;
                                    class181 var214 = class265.field4626[var7];
                                    if (var214.method1230(false, class191.field3365)) {
                                        class18.method171(false, var214);
                                        continue;
                                    }
                                    if (class264.field4594 == 0 && (class116.field1914 == 1 || class11.field241 == 1)) {
                                        continue;
                                    }
                                    byte var215 = 0;
                                    class33.field526++;
                                    class181 var216 = var214.method1216(-91);
                                    if (var216.method1230(false, class236.field4098)) {
                                        var214 = var214.method1215(114, class236.field4098.method1226(-458531486));
                                        var215 = 0;
                                    } else if (var216.method1230(false, class107.field1760)) {
                                        var214 = var214.method1215(127, class107.field1760.method1226(-458531486));
                                        var215 = 1;
                                    } else if (var216.method1230(false, class5.field104)) {
                                        var215 = 2;
                                        var214 = var214.method1215(115, class5.field104.method1226(arg0 ^ 0x1B54A29D));
                                    } else if (var216.method1230(false, class203.field3502)) {
                                        var214 = var214.method1215(116, class203.field3502.method1226(-458531486));
                                        var215 = 3;
                                    } else if (var216.method1230(false, class94.field1513)) {
                                        var215 = 4;
                                        var214 = var214.method1215(106, class94.field1513.method1226(-458531486));
                                    } else if (var216.method1230(false, class45.field691)) {
                                        var215 = 5;
                                        var214 = var214.method1215(105, class45.field691.method1226(-458531486));
                                    } else if (var216.method1230(false, class76.field1231)) {
                                        var214 = var214.method1215(110, class76.field1231.method1226(-458531486));
                                        var215 = 6;
                                    } else if (var216.method1230(false, class222.field3842)) {
                                        var214 = var214.method1215(113, class222.field3842.method1226(-458531486));
                                        var215 = 7;
                                    } else if (var216.method1230(false, class92.field1460)) {
                                        var215 = 8;
                                        var214 = var214.method1215(116, class92.field1460.method1226(-458531486));
                                    } else if (var216.method1230(false, class74.field1191)) {
                                        var214 = var214.method1215(124, class74.field1191.method1226(-458531486));
                                        var215 = 9;
                                    } else if (var216.method1230(false, class161.field2743)) {
                                        var214 = var214.method1215(114, class161.field2743.method1226(-458531486));
                                        var215 = 10;
                                    } else if (var216.method1230(false, class238.field4141)) {
                                        var215 = 11;
                                        var214 = var214.method1215(115, class238.field4141.method1226(-458531486));
                                    } else if (class196.field3431 != 0) {
                                        if (var216.method1230(false, class236.field4103)) {
                                            var215 = 0;
                                            var214 = var214.method1215(arg0 ^ 0xFFFFFF8C, class236.field4103.method1226(-458531486));
                                        } else if (var216.method1230(false, class107.field1744)) {
                                            var214 = var214.method1215(104, class107.field1744.method1226(-458531486));
                                            var215 = 1;
                                        } else if (var216.method1230(false, class5.field110)) {
                                            var215 = 2;
                                            var214 = var214.method1215(arg0 ^ 0xFFFFFF9A, class5.field110.method1226(arg0 - 458531485));
                                        } else if (var216.method1230(false, class203.field3486)) {
                                            var214 = var214.method1215(arg0 + 113, class203.field3486.method1226(-458531486));
                                            var215 = 3;
                                        } else if (var216.method1230(false, class94.field1504)) {
                                            var214 = var214.method1215(122, class94.field1504.method1226(-458531486));
                                            var215 = 4;
                                        } else if (var216.method1230(false, class45.field698)) {
                                            var215 = 5;
                                            var214 = var214.method1215(120, class45.field698.method1226(-458531486));
                                        } else if (var216.method1230(false, class76.field1227)) {
                                            var215 = 6;
                                            var214 = var214.method1215(101, class76.field1227.method1226(-458531486));
                                        } else if (var216.method1230(false, class222.field3831)) {
                                            var214 = var214.method1215(arg0 + 121, class222.field3831.method1226(-458531486));
                                            var215 = 7;
                                        } else if (var216.method1230(false, class92.field1464)) {
                                            var215 = 8;
                                            var214 = var214.method1215(arg0 ^ 0xFFFFFF80, class92.field1464.method1226(-458531486));
                                        } else if (var216.method1230(false, class74.field1182)) {
                                            var215 = 9;
                                            var214 = var214.method1215(121, class74.field1182.method1226(-458531486));
                                        } else if (var216.method1230(false, class161.field2746)) {
                                            var215 = 10;
                                            var214 = var214.method1215(119, class161.field2746.method1226(-458531486));
                                        } else if (var216.method1230(false, class238.field4130)) {
                                            var215 = 11;
                                            var214 = var214.method1215(114, class238.field4130.method1226(-458531486));
                                        }
                                    }
                                    byte var217 = 0;
                                    class181 var218 = var214.method1216(-91);
                                    if (var218.method1230(false, class143.field2316)) {
                                        var217 = 1;
                                        var214 = var214.method1215(arg0 + 119, class143.field2316.method1226(arg0 ^ 0x1B54A29D));
                                    } else if (var218.method1230(false, class136.field2224)) {
                                        var217 = 2;
                                        var214 = var214.method1215(102, class136.field2224.method1226(-458531486));
                                    } else if (var218.method1230(false, class61.field930)) {
                                        var217 = 3;
                                        var214 = var214.method1215(102, class61.field930.method1226(-458531486));
                                    } else if (var218.method1230(false, class177.field3115)) {
                                        var217 = 4;
                                        var214 = var214.method1215(103, class177.field3115.method1226(-458531486));
                                    } else if (var218.method1230(false, class25.field428)) {
                                        var214 = var214.method1215(118, class25.field428.method1226(-458531486));
                                        var217 = 5;
                                    } else if (class196.field3431 != 0) {
                                        if (var218.method1230(false, class143.field2329)) {
                                            var214 = var214.method1215(109, class143.field2329.method1226(-458531486));
                                            var217 = 1;
                                        } else if (var218.method1230(false, class136.field2216)) {
                                            var214 = var214.method1215(108, class136.field2216.method1226(-458531486));
                                            var217 = 2;
                                        } else if (var218.method1230(false, class61.field944)) {
                                            var214 = var214.method1215(arg0 + 123, class61.field944.method1226(-458531486));
                                            var217 = 3;
                                        } else if (var218.method1230(false, class177.field3097)) {
                                            var217 = 4;
                                            var214 = var214.method1215(107, class177.field3097.method1226(arg0 ^ 0x1B54A29D));
                                        } else if (var218.method1230(false, class25.field443)) {
                                            var217 = 5;
                                            var214 = var214.method1215(arg0 + 113, class25.field443.method1226(arg0 + -458531485));
                                        }
                                    }
                                    class141.field2275.method541(70, 85);
                                    class141.field2275.method1538(0, (byte) -62);
                                    int var219 = class141.field2275.field3933;
                                    class141.field2275.method1538(var215, (byte) 56);
                                    class141.field2275.method1538(var217, (byte) -94);
                                    class250.method1708(var214, 0, class141.field2275);
                                    class141.field2275.method1553(class141.field2275.field3933 - var219, false);
                                    continue;
                                }
                                if (var10 == 5009) {
                                    var7 -= 2;
                                    class181 var220 = class265.field4626[var7];
                                    class181 var221 = class265.field4626[var7 + 1];
                                    if (class264.field4594 != 0 || class116.field1914 != 1 && class11.field241 != 1) {
                                        class141.field2275.method541(183, 116);
                                        class141.field2275.method1538(0, (byte) 123);
                                        int var222 = class141.field2275.field3933;
                                        class111.field1827++;
                                        class141.field2275.method1511(false, var220.method1197(-119));
                                        class250.method1708(var221, 0, class141.field2275);
                                        class141.field2275.method1553(class141.field2275.field3933 - var222, false);
                                    }
                                    continue;
                                }
                                if (var10 == 5010) {
                                    var6--;
                                    int var223 = class89.field1412[var6];
                                    class181 var224 = null;
                                    if (var223 < 100) {
                                        var224 = class78.field1256[var223];
                                    }
                                    if (var224 == null) {
                                        var224 = class59.field892;
                                    }
                                    class265.field4626[var7++] = var224;
                                    continue;
                                }
                                if (var10 == 5011) {
                                    var6--;
                                    int var225 = class89.field1412[var6];
                                    class181 var226 = null;
                                    if (var225 < 100) {
                                        var226 = class91.field1445[var225];
                                    }
                                    if (var226 == null) {
                                        var226 = class59.field892;
                                    }
                                    class265.field4626[var7++] = var226;
                                    continue;
                                }
                                if (var10 == 5012) {
                                    var6--;
                                    int var227 = class89.field1412[var6];
                                    int var228 = -1;
                                    if (var227 < 100) {
                                        var228 = class74.field1181[var227];
                                    }
                                    class89.field1412[var6++] = var228;
                                    continue;
                                }
                                if (var10 == 5015) {
                                    class181 var229;
                                    if (class258.field4507 == null || class258.field4507.field1883 == null) {
                                        var229 = class241.field4191;
                                    } else {
                                        var229 = class258.field4507.method770(101);
                                    }
                                    class265.field4626[var7++] = var229;
                                    continue;
                                }
                                if (var10 == 5016) {
                                    class89.field1412[var6++] = class221.field3819;
                                    continue;
                                }
                                if (var10 == 5017) {
                                    class89.field1412[var6++] = class264.field4591;
                                    continue;
                                }
                                if (var10 == 5050) {
                                    var6--;
                                    int var230 = class89.field1412[var6];
                                    class265.field4626[var7++] = class41.method291(var230, 0).field1872;
                                    continue;
                                }
                                if (var10 == 5051) {
                                    var6--;
                                    int var231 = class89.field1412[var6];
                                    class115 var232 = class41.method291(var231, ~arg0);
                                    if (var232.field1860 == null) {
                                        class89.field1412[var6++] = 0;
                                    } else {
                                        class89.field1412[var6++] = var232.field1860.length;
                                    }
                                    continue;
                                }
                                if (var10 == 5052) {
                                    var6 -= 2;
                                    int var233 = class89.field1412[var6];
                                    int var234 = class89.field1412[var6 + 1];
                                    class115 var235 = class41.method291(var233, 0);
                                    int var236 = var235.field1860[var234];
                                    class89.field1412[var6++] = var236;
                                    continue;
                                }
                                if (var10 == 5053) {
                                    var6--;
                                    int var237 = class89.field1412[var6];
                                    class115 var238 = class41.method291(var237, 0);
                                    if (var238.field1869 == null) {
                                        class89.field1412[var6++] = 0;
                                    } else {
                                        class89.field1412[var6++] = var238.field1869.length;
                                    }
                                    continue;
                                }
                                if (var10 == 5054) {
                                    var6 -= 2;
                                    int var239 = class89.field1412[var6];
                                    int var240 = class89.field1412[var6 + 1];
                                    class89.field1412[var6++] = class41.method291(var239, 0).field1869[var240];
                                    continue;
                                }
                                if (var10 == 5055) {
                                    var6--;
                                    int var241 = class89.field1412[var6];
                                    class265.field4626[var7++] = class188.method1301(var241, (byte) 79).method1489((byte) 107);
                                    continue;
                                }
                                if (var10 == 5056) {
                                    var6--;
                                    int var242 = class89.field1412[var6];
                                    class227 var243 = class188.method1301(var242, (byte) 79);
                                    if (var243.field3893 == null) {
                                        class89.field1412[var6++] = 0;
                                    } else {
                                        class89.field1412[var6++] = var243.field3893.length;
                                    }
                                    continue;
                                }
                                if (var10 == 5057) {
                                    var6 -= 2;
                                    int var244 = class89.field1412[var6];
                                    int var245 = class89.field1412[var6 + 1];
                                    class89.field1412[var6++] = class188.method1301(var244, (byte) 79).field3893[var245];
                                    continue;
                                }
                                if (var10 == 5058) {
                                    class157.field2678 = new class35();
                                    var6--;
                                    class157.field2678.field555 = class89.field1412[var6];
                                    class157.field2678.field547 = class188.method1301(class157.field2678.field555, (byte) 79);
                                    class157.field2678.field551 = new int[class157.field2678.field547.method1495((byte) -127)];
                                    continue;
                                }
                                if (var10 == 5059) {
                                    class23.field404++;
                                    class141.field2275.method541(151, 66);
                                    class141.field2275.method1538(0, (byte) -58);
                                    int var246 = class141.field2275.field3933;
                                    class141.field2275.method1538(0, (byte) 96);
                                    class141.field2275.method1534(0, class157.field2678.field555);
                                    class157.field2678.field547.method1492(class141.field2275, class157.field2678.field551, (byte) -112);
                                    class141.field2275.method1553(class141.field2275.field3933 - var246, false);
                                    continue;
                                }
                                if (var10 == 5060) {
                                    class254.field4451++;
                                    var7--;
                                    class181 var247 = class265.field4626[var7];
                                    class141.field2275.method541(126, 83);
                                    class141.field2275.method1538(0, (byte) 69);
                                    int var248 = class141.field2275.field3933;
                                    class141.field2275.method1511(false, var247.method1197(-106));
                                    class141.field2275.method1534(0, class157.field2678.field555);
                                    class157.field2678.field547.method1492(class141.field2275, class157.field2678.field551, (byte) -128);
                                    class141.field2275.method1553(class141.field2275.field3933 - var248, false);
                                    continue;
                                }
                                if (var10 == 5061) {
                                    class141.field2275.method541(151, -83);
                                    class141.field2275.method1538(0, (byte) 106);
                                    class23.field404++;
                                    int var249 = class141.field2275.field3933;
                                    class141.field2275.method1538(1, (byte) -124);
                                    class141.field2275.method1534(0, class157.field2678.field555);
                                    class157.field2678.field547.method1492(class141.field2275, class157.field2678.field551, (byte) 95);
                                    class141.field2275.method1553(class141.field2275.field3933 - var249, false);
                                    continue;
                                }
                                if (var10 == 5062) {
                                    var6 -= 2;
                                    int var250 = class89.field1412[var6];
                                    int var251 = class89.field1412[var6 + 1];
                                    class89.field1412[var6++] = class41.method291(var250, class102.method690(arg0, -1)).field1875[var251];
                                    continue;
                                }
                                if (var10 == 5063) {
                                    var6 -= 2;
                                    int var252 = class89.field1412[var6];
                                    int var253 = class89.field1412[var6 + 1];
                                    class89.field1412[var6++] = class41.method291(var252, class102.method690(arg0, -1)).field1868[var253];
                                    continue;
                                }
                                if (var10 == 5064) {
                                    var6 -= 2;
                                    int var254 = class89.field1412[var6];
                                    int var255 = class89.field1412[var6 + 1];
                                    if (var255 == -1) {
                                        class89.field1412[var6++] = -1;
                                    } else {
                                        class89.field1412[var6++] = class41.method291(var254, 0).method764((byte) 126, var255);
                                    }
                                    continue;
                                }
                                if (var10 == 5065) {
                                    var6 -= 2;
                                    int var256 = class89.field1412[var6 + 1];
                                    int var257 = class89.field1412[var6];
                                    if (var256 == -1) {
                                        class89.field1412[var6++] = -1;
                                    } else {
                                        class89.field1412[var6++] = class41.method291(var257, arg0 + 1).method765(var256, arg0 - 100);
                                    }
                                    continue;
                                }
                                if (var10 == 5066) {
                                    var6--;
                                    int var258 = class89.field1412[var6];
                                    class89.field1412[var6++] = class188.method1301(var258, (byte) 79).method1495((byte) 54);
                                    continue;
                                }
                                if (var10 == 5067) {
                                    var6 -= 2;
                                    int var259 = class89.field1412[var6];
                                    int var260 = class89.field1412[var6 + 1];
                                    int var261 = class188.method1301(var259, (byte) 79).method1493((byte) -82, var260);
                                    class89.field1412[var6++] = var261;
                                    continue;
                                }
                                if (var10 == 5068) {
                                    var6 -= 2;
                                    int var262 = class89.field1412[var6];
                                    int var263 = class89.field1412[var6 + 1];
                                    class157.field2678.field551[var262] = var263;
                                    continue;
                                }
                                if (var10 == 5069) {
                                    var6 -= 2;
                                    int var264 = class89.field1412[var6];
                                    int var265 = class89.field1412[var6 + 1];
                                    class157.field2678.field551[var264] = var265;
                                    continue;
                                }
                                if (var10 == 5070) {
                                    var6 -= 3;
                                    int var266 = class89.field1412[var6 + 1];
                                    int var267 = class89.field1412[var6];
                                    int var268 = class89.field1412[var6 + 2];
                                    class227 var269 = class188.method1301(var267, (byte) 79);
                                    if (var269.method1493((byte) -82, var266) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class89.field1412[var6++] = var269.method1488(var268, var266, (byte) 125);
                                    continue;
                                }
                            } else if (var10 < 5200) {
                                if (var10 == 5100) {
                                    if (class68.field1095[86]) {
                                        class89.field1412[var6++] = 1;
                                    } else {
                                        class89.field1412[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var10 == 5101) {
                                    if (class68.field1095[82]) {
                                        class89.field1412[var6++] = 1;
                                    } else {
                                        class89.field1412[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var10 == 5102) {
                                    if (class68.field1095[81]) {
                                        class89.field1412[var6++] = 1;
                                    } else {
                                        class89.field1412[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var10 < 5300) {
                                if (var10 == 5200) {
                                    var6--;
                                    class114.method755(class89.field1412[var6], 20061);
                                    continue;
                                }
                                if (var10 == 5201) {
                                    class89.field1412[var6++] = class84.method571(33);
                                    continue;
                                }
                                if (var10 == 5202) {
                                    var6--;
                                    class219.method1458((byte) -128, class89.field1412[var6]);
                                    continue;
                                }
                                if (var10 == 5203) {
                                    var7--;
                                    class265.method1792(class265.field4626[var7], 1196741633);
                                    continue;
                                }
                                if (var10 == 5204) {
                                    class265.field4626[var7 - 1] = class217.method1436(0, class265.field4626[var7 - 1]);
                                    continue;
                                }
                                if (var10 == 5205) {
                                    var7--;
                                    class254.method1726(true, class265.field4626[var7]);
                                    continue;
                                }
                                if (var10 == 5206) {
                                    var6--;
                                    int var270 = class89.field1412[var6];
                                    class120 var271 = class58.method421(var270 >> 14 & 0x3FFF, (byte) -96, var270 & 0x3FFF);
                                    if (var271 == null) {
                                        class265.field4626[var7++] = class59.field892;
                                    } else {
                                        class265.field4626[var7++] = var271.field1969;
                                    }
                                    continue;
                                }
                                if (var10 == 5207) {
                                    var7--;
                                    class120 var272 = class168.method1115(class265.field4626[var7], -112);
                                    if (var272 != null && var272.field1960 != null) {
                                        class265.field4626[var7++] = var272.field1960;
                                        continue;
                                    }
                                    class265.field4626[var7++] = class59.field892;
                                    continue;
                                }
                            } else if (var10 < 5400) {
                                if (var10 == 5306) {
                                    class89.field1412[var6++] = class76.method529((byte) 116);
                                    continue;
                                }
                            } else if (var10 < 5500) {
                                if (var10 == 5400) {
                                    class259.field4515++;
                                    var7 -= 2;
                                    class181 var303 = class265.field4626[var7];
                                    class181 var304 = class265.field4626[var7 + 1];
                                    var6--;
                                    int var305 = class89.field1412[var6];
                                    class141.field2275.method541(45, arg0 ^ 0xFFFFFFD1);
                                    class141.field2275.method1538(class78.method539((byte) 106, var303) + class78.method539((byte) 101, var304) + 1, (byte) 50);
                                    class141.field2275.method1550(var303, arg0 ^ 0xFFFFFF80);
                                    class141.field2275.method1550(var304, 91);
                                    class141.field2275.method1538(var305, (byte) -75);
                                    continue;
                                }
                                if (var10 == 5401) {
                                    var6 -= 2;
                                    class259.field4514[class89.field1412[var6]] = (short) class13.method128(class89.field1412[var6 + 1], 16743986);
                                    class88.method589(-386);
                                    class125.method810(arg0 + 16776961);
                                    class57.method418((byte) -120);
                                    class136.method881(arg0 + 2001);
                                    class38.method274(false);
                                    continue;
                                }
                                if (var10 == 5405) {
                                    var6 -= 2;
                                    int var306 = class89.field1412[var6];
                                    int var307 = class89.field1412[var6 + 1];
                                    if (var306 >= 0 && var306 < 2) {
                                        class221.field3822[var306] = new int[var307 << 1][4];
                                    }
                                    continue;
                                }
                                if (var10 == 5406) {
                                    var6 -= 7;
                                    int var308 = class89.field1412[var6 + 2];
                                    int var309 = class89.field1412[var6 + 3];
                                    int var310 = class89.field1412[var6];
                                    int var311 = class89.field1412[var6 + 1] << 1;
                                    int var312 = class89.field1412[var6 + 4];
                                    int var313 = class89.field1412[var6 + 6];
                                    int var314 = class89.field1412[var6 + 5];
                                    if (var310 >= 0 && var310 < 2 && class221.field3822[var310] != null && var311 >= 0 && var311 < class221.field3822[var310].length) {
                                        class221.field3822[var310][var311] = new int[] { class5.method43(var308 >> 14, 16383) * 128, var309, class5.method43(var308, 16383) * 128, var313 };
                                        class221.field3822[var310][var311 + 1] = new int[] { class5.method43(16383, var312 >> 14) * 128, var314, class5.method43(16383, var312) * 128 };
                                    }
                                    continue;
                                }
                                if (var10 == 5407) {
                                    var6--;
                                    int var315 = class221.field3822[class89.field1412[var6]].length >> 1;
                                    class89.field1412[var6++] = var315;
                                    continue;
                                }
                                if (var10 == 5408) {
                                    class89.field1412[var6++] = 0;
                                    continue;
                                }
                                if (var10 == 5409) {
                                    class110.method733((byte) 79);
                                    continue;
                                }
                                if (var10 == 5411) {
                                    if (class43.field677 == null) {
                                        class145.method944((byte) -81, false, class220.method1465((byte) 107));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var10 == 5419) {
                                    class181 var316 = class59.field892;
                                    if (class131.field2174 != null) {
                                        var316 = class237.method1622(-117, class131.field2174.field1932);
                                        try {
                                            if (class131.field2174.field1935 != null) {
                                                byte[] var317 = ((String) class131.field2174.field1935).getBytes("ISO-8859-1");
                                                var316 = class1.method9(0, -1, var317.length, var317);
                                            }
                                        } catch (UnsupportedEncodingException var448) {
                                        }
                                    }
                                    class265.field4626[var7++] = var316;
                                    continue;
                                }
                                if (var10 == 5420) {
                                    class89.field1412[var6++] = class85.field1359 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 5421) {
                                    var7--;
                                    class181 var318 = class265.field4626[var7];
                                    var6--;
                                    boolean var319 = class89.field1412[var6] == 1;
                                    class145.method944((byte) -86, var319, class175.method1164(new class181[] { class220.method1465((byte) 119), var318 }, (byte) 124));
                                    continue;
                                }
                                if (var10 == 5422) {
                                    var7 -= 2;
                                    class181 var320 = class265.field4626[var7];
                                    class181 var321 = class265.field4626[var7 + 1];
                                    var6--;
                                    int var322 = class89.field1412[var6];
                                    if (var320.method1226(-458531486) > 0) {
                                        if (class240.field4167 == null) {
                                            class240.field4167 = new class181[class227.field3907[class65.field1069]];
                                        }
                                        class240.field4167[var322] = var320;
                                    }
                                    if (var321.method1226(-458531486) > 0) {
                                        if (class180.field3139 == null) {
                                            class180.field3139 = new class181[class227.field3907[class65.field1069]];
                                        }
                                        class180.field3139[var322] = var321;
                                    }
                                    continue;
                                }
                            } else if (var10 < 5600) {
                                if (var10 == 5500) {
                                    var6 -= 4;
                                    int var273 = class89.field1412[var6];
                                    int var274 = class89.field1412[var6 + 1];
                                    int var275 = class89.field1412[var6 + 2];
                                    int var276 = class89.field1412[var6 + 3];
                                    class74.method515(false, var275, ((var273 & 0xFFFE65C) >> 14) - class253.field4420, (var273 & 0x3FFF) - class222.field3844, arg0 ^ 0xFFFFFFE0, var274, var276);
                                    continue;
                                }
                                if (var10 == 5501) {
                                    var6 -= 4;
                                    int var277 = class89.field1412[var6];
                                    int var278 = class89.field1412[var6 + 2];
                                    int var279 = class89.field1412[var6 + 1];
                                    int var280 = class89.field1412[var6 + 3];
                                    class210.method1392(var278, (var277 >> 14 & 0x3FFF) - class253.field4420, var279, var280, (var277 & 0x3FFF) - class222.field3844, -1845493760);
                                    continue;
                                }
                                if (var10 == 5502) {
                                    var6 -= 6;
                                    int var281 = class89.field1412[var6];
                                    if (var281 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class123.field2017 = var281;
                                    int var282 = class89.field1412[var6 + 1];
                                    if ((var282 + 1) >= (class221.field3822[class123.field2017].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class108.field1768 = 0;
                                    class138.field2256 = var282;
                                    class229.field3923 = class89.field1412[var6 + 2];
                                    class62.field953 = class89.field1412[var6 + 3];
                                    int var283 = class89.field1412[var6 + 4];
                                    if (var283 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class193.field3387 = var283;
                                    int var284 = class89.field1412[var6 + 5];
                                    if (class221.field3822[class193.field3387].length >> 1 <= var284 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class110.field1792 = 3;
                                    class189.field3339 = var284;
                                    continue;
                                }
                                if (var10 == 5503) {
                                    class145.method938(true);
                                    continue;
                                }
                                if (var10 == 5504) {
                                    var6 -= 2;
                                    class113.field1845 = class89.field1412[var6];
                                    class214.field3682 = class89.field1412[var6 + 1];
                                    class236.method1616((byte) 57);
                                    continue;
                                }
                                if (var10 == 5505) {
                                    class89.field1412[var6++] = class113.field1845;
                                    continue;
                                }
                                if (var10 == 5506) {
                                    class89.field1412[var6++] = class214.field3682;
                                    continue;
                                }
                            } else if (var10 < 5700) {
                                if (var10 == 5600) {
                                    var7 -= 2;
                                    class181 var285 = class265.field4626[var7];
                                    class181 var286 = class265.field4626[var7 + 1];
                                    var6--;
                                    int var287 = class89.field1412[var6];
                                    if (class5.field106 == 10 && class25.field451 == 0 && class47.field743 == 0) {
                                        class2.method25(var285, var287, var286, (byte) 65);
                                    }
                                    continue;
                                }
                                if (var10 == 5601) {
                                    class100.method671(arg0 + 96);
                                    continue;
                                }
                                if (var10 == 5602) {
                                    if (class25.field451 == 0) {
                                        class102.field1704 = -2;
                                    }
                                    continue;
                                }
                                if (var10 == 5603) {
                                    var6 -= 4;
                                    if (class5.field106 == 10 && class25.field451 == 0 && class47.field743 == 0) {
                                        class57.method412((byte) 79, class89.field1412[var6 + 1], class89.field1412[var6 + 3], class89.field1412[var6], class89.field1412[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var10 == 5604) {
                                    var7--;
                                    if (class5.field106 == 10 && class25.field451 == 0 && class47.field743 == 0) {
                                        class51.method384(class265.field4626[var7].method1197(-113), arg0 + 1);
                                    }
                                    continue;
                                }
                                if (var10 == 5605) {
                                    var7 -= 2;
                                    var6 -= 4;
                                    if (class5.field106 == 10 && class25.field451 == 0 && class47.field743 == 0) {
                                        class140.method899(class265.field4626[var7].method1197(-115), class89.field1412[var6 + 1], class89.field1412[var6 + 3], class89.field1412[var6 + 2], class265.field4626[var7 + 1], 0, class89.field1412[var6]);
                                    }
                                    continue;
                                }
                                if (var10 == 5606) {
                                    if (class47.field743 == 0) {
                                        class234.field4075 = -2;
                                    }
                                    continue;
                                }
                                if (var10 == 5607) {
                                    class89.field1412[var6++] = class102.field1704;
                                    continue;
                                }
                                if (var10 == 5608) {
                                    class89.field1412[var6++] = class100.field1685;
                                    continue;
                                }
                                if (var10 == 5609) {
                                    class89.field1412[var6++] = class234.field4075;
                                    continue;
                                }
                                if (var10 == 5610) {
                                    for (int var288 = 0; var288 < 5; var288++) {
                                        class265.field4626[var7++] = var288 < class58.field879.length ? class58.field879[var288] : class59.field892;
                                    }
                                    class58.field879 = null;
                                    continue;
                                }
                            } else if (var10 < 6100) {
                                if (var10 == 6001) {
                                    var6--;
                                    int var297 = class89.field1412[var6];
                                    if (var297 < 1) {
                                        var297 = 1;
                                    }
                                    if (var297 > 4) {
                                        var297 = 4;
                                    }
                                    class209.field3590 = var297;
                                    if (class209.field3590 == 1) {
                                        class72.method499(0.9F);
                                    }
                                    if (class209.field3590 == 2) {
                                        class72.method499(0.8F);
                                    }
                                    if (class209.field3590 == 3) {
                                        class72.method499(0.7F);
                                    }
                                    if (class209.field3590 == 4) {
                                        class72.method499(0.6F);
                                    }
                                    class125.method810(16776960);
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6002) {
                                    var6--;
                                    class209.method1385(class89.field1412[var6] == 1, (byte) 119);
                                    class7.method53(-9437);
                                    class242.method1645((byte) -107);
                                    class78.method540(0);
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6003) {
                                    var6--;
                                    class8.field140 = class89.field1412[var6] == 1;
                                    class78.method540(0);
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6005) {
                                    var6--;
                                    class239.field4165 = class89.field1412[var6] == 1;
                                    class242.method1645((byte) -107);
                                    class120.method788(class224.field3870, arg0 ^ 0xFFFFB069);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6006) {
                                    var6--;
                                    class180.field3140 = class89.field1412[var6] == 1;
                                    ((class145) class72.field1157).method936(-1, !class180.field3140);
                                    class120.method788(class224.field3870, arg0 ^ 0xFFFFB069);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6007) {
                                    var6--;
                                    class207.field3552 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, arg0 ^ 0xFFFFB069);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6008) {
                                    var6--;
                                    class148.field2481 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6009) {
                                    var6--;
                                    class73.field1166 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6010) {
                                    var6--;
                                    class239.field4154 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, arg0 + 20375);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6011) {
                                    var6--;
                                    int var298 = class89.field1412[var6];
                                    if (var298 < 0 || var298 > 2) {
                                        var298 = 0;
                                    }
                                    class184.field3252 = var298;
                                    class120.method788(class224.field3870, arg0 ^ 0xFFFFB069);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6012) {
                                    var6--;
                                    class254.field4445 = class89.field1412[var6] == 1;
                                    if (class209.field3590 == 1) {
                                        class72.method499(0.9F);
                                    }
                                    if (class209.field3590 == 2) {
                                        class72.method499(0.8F);
                                    }
                                    if (class209.field3590 == 3) {
                                        class72.method499(0.7F);
                                    }
                                    if (class209.field3590 == 4) {
                                        class72.method499(0.6F);
                                    }
                                    class242.method1645((byte) -107);
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6014) {
                                    var6--;
                                    class78.field1268 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6015) {
                                    var6--;
                                    class77.field1241 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6016) {
                                    var6--;
                                    int var299 = class89.field1412[var6];
                                    if (var299 < 0 || var299 > 2) {
                                        var299 = 0;
                                    }
                                    class242.field4212 = var299;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6017) {
                                    var6--;
                                    class82.field1317 = class89.field1412[var6] == 1;
                                    class108.method722((byte) 86);
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6018) {
                                    var6--;
                                    int var300 = class89.field1412[var6];
                                    if (var300 < 0) {
                                        var300 = 0;
                                    }
                                    if (var300 > 127) {
                                        var300 = 127;
                                    }
                                    class173.field2911 = var300;
                                    class120.method788(class224.field3870, arg0 + 20375);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6019) {
                                    var6--;
                                    int var301 = class89.field1412[var6];
                                    if (var301 < 0) {
                                        var301 = 0;
                                    }
                                    if (var301 > 255) {
                                        var301 = 255;
                                    }
                                    if (class94.field1502 != var301) {
                                        if (class94.field1502 == 0 && class152.field2527 != -1) {
                                            class121.method793(class152.field2527, false, 0, false, var301, class13.field266);
                                            class148.field2479 = false;
                                        } else if (var301 == 0) {
                                            class21.method191(5495);
                                            class148.field2479 = false;
                                        } else {
                                            class216.method1433(var301, 0);
                                        }
                                        class94.field1502 = var301;
                                    }
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6020) {
                                    var6--;
                                    int var302 = class89.field1412[var6];
                                    if (var302 < 0) {
                                        var302 = 0;
                                    }
                                    if (var302 > 127) {
                                        var302 = 127;
                                    }
                                    class55.field849 = var302;
                                    class120.method788(class224.field3870, 20374);
                                    class132.field2179 = false;
                                    continue;
                                }
                                if (var10 == 6021) {
                                    var6--;
                                    class38.field596 = class89.field1412[var6] == 1;
                                    class78.method540(0);
                                    continue;
                                }
                                if (var10 == 6022) {
                                    var6--;
                                    class264.field4614 = class89.field1412[var6] == 1;
                                    class120.method788(class224.field3870, arg0 ^ 0xFFFFB069);
                                    class95.method625(0, 2);
                                    continue;
                                }
                            } else if (var10 < 6200) {
                                if (var10 == 6101) {
                                    class89.field1412[var6++] = class209.field3590;
                                    continue;
                                }
                                if (var10 == 6102) {
                                    class89.field1412[var6++] = class219.method1460(class102.method690(arg0, -51885666)) ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6103) {
                                    class89.field1412[var6++] = class8.field140 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6105) {
                                    class89.field1412[var6++] = class239.field4165 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6106) {
                                    class89.field1412[var6++] = class180.field3140 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6107) {
                                    class89.field1412[var6++] = class207.field3552 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6108) {
                                    class89.field1412[var6++] = class148.field2481 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6109) {
                                    class89.field1412[var6++] = class73.field1166 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6110) {
                                    class89.field1412[var6++] = class239.field4154 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6111) {
                                    class89.field1412[var6++] = class184.field3252;
                                    continue;
                                }
                                if (var10 == 6112) {
                                    class89.field1412[var6++] = class254.field4445 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6114) {
                                    class89.field1412[var6++] = class78.field1268 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6115) {
                                    class89.field1412[var6++] = class77.field1241 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6116) {
                                    class89.field1412[var6++] = class242.field4212;
                                    continue;
                                }
                                if (var10 == 6117) {
                                    class89.field1412[var6++] = class82.field1317 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6118) {
                                    class89.field1412[var6++] = class173.field2911;
                                    continue;
                                }
                                if (var10 == 6119) {
                                    class89.field1412[var6++] = class94.field1502;
                                    continue;
                                }
                                if (var10 == 6120) {
                                    class89.field1412[var6++] = class55.field849;
                                    continue;
                                }
                                if (var10 == 6121) {
                                    class89.field1412[var6++] = 0;
                                    continue;
                                }
                                if (var10 == 6122) {
                                    class89.field1412[var6++] = class264.field4614 ? 1 : 0;
                                    continue;
                                }
                            } else if (var10 < 6300) {
                                if (var10 == 6200) {
                                    var6 -= 2;
                                    class200.field3454 = (short) class89.field1412[var6];
                                    if (class200.field3454 <= 0) {
                                        class200.field3454 = 256;
                                    }
                                    class94.field1506 = (short) class89.field1412[var6 + 1];
                                    if (class94.field1506 <= 0) {
                                        class94.field1506 = 205;
                                    }
                                    continue;
                                }
                                if (var10 == 6201) {
                                    var6 -= 2;
                                    class66.field1080 = (short) class89.field1412[var6];
                                    if (class66.field1080 <= 0) {
                                        class66.field1080 = 256;
                                    }
                                    class99.field1619 = (short) class89.field1412[var6 + 1];
                                    if (class99.field1619 <= 0) {
                                        class99.field1619 = 320;
                                    }
                                    continue;
                                }
                                if (var10 == 6202) {
                                    var6 -= 4;
                                    class84.field1334 = (short) class89.field1412[var6];
                                    if (class84.field1334 <= 0) {
                                        class84.field1334 = 1;
                                    }
                                    class189.field3336 = (short) class89.field1412[var6 + 1];
                                    if (class189.field3336 <= 0) {
                                        class189.field3336 = 32767;
                                    } else if (class84.field1334 > class189.field3336) {
                                        class189.field3336 = class84.field1334;
                                    }
                                    class92.field1467 = (short) class89.field1412[var6 + 2];
                                    if (class92.field1467 <= 0) {
                                        class92.field1467 = 1;
                                    }
                                    class127.field2105 = (short) class89.field1412[var6 + 3];
                                    if (class127.field2105 <= 0) {
                                        class127.field2105 = 32767;
                                    } else if (class92.field1467 > class127.field2105) {
                                        class127.field2105 = class92.field1467;
                                    }
                                    continue;
                                }
                                if (var10 == 6203) {
                                    class2.method20(class143.field2323.field3041, false, class143.field2323.field3057, 0, 0, (byte) 125);
                                    class89.field1412[var6++] = class96.field1546;
                                    class89.field1412[var6++] = class238.field4140;
                                    continue;
                                }
                                if (var10 == 6204) {
                                    class89.field1412[var6++] = class66.field1080;
                                    class89.field1412[var6++] = class99.field1619;
                                    continue;
                                }
                                if (var10 == 6205) {
                                    class89.field1412[var6++] = class200.field3454;
                                    class89.field1412[var6++] = class94.field1506;
                                    continue;
                                }
                            } else if (var10 < 6400) {
                                if (var10 == 6300) {
                                    class89.field1412[var6++] = (int) (class213.method1414(arg0 - 9291) / 60000L);
                                    continue;
                                }
                                if (var10 == 6301) {
                                    class89.field1412[var6++] = (int) (class213.method1414(-9292) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var10 == 6302) {
                                    var6 -= 3;
                                    int var289 = class89.field1412[var6];
                                    int var290 = class89.field1412[var6 + 1];
                                    int var291 = class89.field1412[var6 + 2];
                                    class33.field530.clear();
                                    class33.field530.set(11, 12);
                                    class33.field530.set(var291, var290, var289);
                                    class89.field1412[var6++] = (int) (class33.field530.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var10 == 6303) {
                                    class33.field530.clear();
                                    class33.field530.setTime(new Date(class213.method1414(arg0 - 9291)));
                                    class89.field1412[var6++] = class33.field530.get(1);
                                    continue;
                                }
                                if (var10 == 6304) {
                                    var6--;
                                    int var292 = class89.field1412[var6];
                                    boolean var293 = true;
                                    if (var292 < 0) {
                                        var293 = (var292 + 1) % 4 == 0;
                                    } else if (var292 < 1582) {
                                        var293 = (var292 % 4) == 0;
                                    } else if (var292 % 4 != 0) {
                                        var293 = false;
                                    } else if (var292 % 100 != 0) {
                                        var293 = true;
                                    } else if ((var292 % 400) != 0) {
                                        var293 = false;
                                    }
                                    class89.field1412[var6++] = var293 ? 1 : 0;
                                    continue;
                                }
                            } else if (var10 < 6500) {
                                if (var10 == 6400) {
                                    class89.field1412[var6++] = class163.field2778 ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6401) {
                                    var7--;
                                    class181 var294 = class265.field4626[var7];
                                    var6--;
                                    int var295 = class89.field1412[var6];
                                    String var296;
                                    try {
                                        var296 = new String(var294.method1247(126), "ISO-8859-1");
                                    } catch (UnsupportedEncodingException var449) {
                                        var296 = new String(var294.method1247(113));
                                    }
                                    if (class163.field2778) {
                                        if (!browsercontrol.iscreated()) {
                                            browsercontrol.create("about:blank");
                                        }
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate(var296);
                                            class90.field1437 = var295;
                                            class95.method625(0, 2);
                                        }
                                    }
                                    continue;
                                }
                                if (var10 == 6402) {
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate("about:blank");
                                        browsercontrol.hide();
                                        class90.field1437 = 0;
                                        class95.method625(0, 2);
                                    }
                                    continue;
                                }
                                if (var10 == 6403) {
                                    class265.field4626[var7++] = class79.field1277;
                                    continue;
                                }
                                if (var10 == 6404) {
                                    class265.field4626[var7++] = class224.field3869;
                                    continue;
                                }
                                if (var10 == 6405) {
                                    class89.field1412[var6++] = class33.method259(124) ? 1 : 0;
                                    continue;
                                }
                                if (var10 == 6406) {
                                    class89.field1412[var6++] = class4.method38(false) ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var10 == 4500) {
                            var6 -= 2;
                            int var323 = class89.field1412[var6];
                            int var324 = class89.field1412[var6 + 1];
                            class93 var325 = class44.method299(var324, -4);
                            if (var325.method616(-52)) {
                                class265.field4626[var7++] = class152.method987(var323, 26).method1429(var325.field1482, 108, var324);
                            } else {
                                class89.field1412[var6++] = class152.method987(var323, 26).method1427(var324, 0, var325.field1483);
                            }
                            continue;
                        }
                    } else if (var10 == 4300) {
                        var6 -= 2;
                        int var326 = class89.field1412[var6 + 1];
                        int var327 = class89.field1412[var6];
                        class93 var328 = class44.method299(var326, arg0 ^ 0xFFFFFFA9);
                        if (var328.method616(55)) {
                            class265.field4626[var7++] = class9.method75(-1, var327).method453(var326, false, var328.field1482);
                        } else {
                            class89.field1412[var6++] = class9.method75(arg0, var327).method459(var326, var328.field1483, (byte) 110);
                        }
                        continue;
                    }
                } else {
                    class175 var62;
                    if (var10 >= 2000) {
                        var10 -= 1000;
                        var6--;
                        var62 = class52.method394(class89.field1412[var6], false);
                    } else {
                        var62 = var46 ? class187.field3311 : class188.field3319;
                    }
                    if (var10 == 1300) {
                        var6--;
                        int var63 = class89.field1412[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            int var10002 = arg0 + 29328;
                            var7--;
                            var62.method1165(var63, var10002, class265.field4626[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var10 == 1301) {
                        var6 -= 2;
                        int var64 = class89.field1412[var6];
                        int var65 = class89.field1412[var6 + 1];
                        var62.field3019 = class26.method221(var64, -24807, var65);
                        continue;
                    }
                    if (var10 == 1302) {
                        var6--;
                        var62.field2925 = class89.field1412[var6] == 1;
                        continue;
                    }
                    if (var10 == 1303) {
                        var6--;
                        var62.field3043 = class89.field1412[var6];
                        continue;
                    }
                    if (var10 == 1304) {
                        var6--;
                        var62.field2949 = class89.field1412[var6];
                        continue;
                    }
                    if (var10 == 1305) {
                        var7--;
                        var62.field3007 = class265.field4626[var7];
                        continue;
                    }
                    if (var10 == 1306) {
                        var7--;
                        var62.field3059 = class265.field4626[var7];
                        continue;
                    }
                    if (var10 == 1307) {
                        var62.field3016 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var450) {
            if (var5.field1380 == null) {
                if (class113.field1840 != 0) {
                    class202.method1357(class151.field2522, 0, (byte) -128, class59.field892);
                }
                class83.method565(var450, "CS2 - scr:" + var5.field606 + " op:" + arg0, arg0 + 120);
            } else {
                class181 var445 = class232.method1602(30, (byte) 61);
                var445.method1239(class258.field4506, 0).method1239(var5.field1380, 0);
                for (int var446 = class64.field1048 - 1; var446 >= 0; var446--) {
                    var445.method1239(class246.field4291, 0).method1239(class1.field4[var446].field679.field1380, 0);
                }
                if (arg0 == 40) {
                    int var447 = var11[var9];
                    var445.method1239(class108.field1769, 0).method1239(class169.method1119((byte) 60, var447), 0);
                }
                if (class113.field1840 != 0) {
                    class202.method1357(class175.method1164(new class181[] { class161.field2756, var5.field1380 }, (byte) 124), 0, (byte) -101, class59.field892);
                }
                class83.method565(var450, "CS2 - scr:" + var5.field606 + " op:" + arg0 + new String(var445.method1247(113)), 125);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static final void method578(int arg0) {
        class69.field1101.method1790(0);
        if (arg0 == -962871295) {
            field1371++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1366 = null;
        field1365 = null;
        field1368 = null;
        field1373 = null;
        if (arg0 != 2) {
            field1370 = 68;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method580(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field1369++;
        if (arg0 == var2) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 14119) {
            method582(23);
        }
        field1367++;
        int var6 = arg4 - arg5;
        int var7 = arg0 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class175.method1171(arg5, arg4, 37, arg1, arg2);
            }
        } else if (var6 == 0) {
            class187.method1297(arg5, arg1, arg2, arg0, -104);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg5;
                int var10 = arg0;
                arg5 = var9;
                arg0 = arg4;
                arg4 = var10;
            }
            if (arg0 < arg2) {
                int var11 = arg5;
                int var12 = arg2;
                arg5 = arg4;
                arg4 = var11;
                arg2 = arg0;
                arg0 = var12;
            }
            int var13 = arg5;
            int var14 = arg0 - arg2;
            int var15 = arg4 - arg5;
            int var16 = arg5 < arg4 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg2; var18 <= arg0; var18++) {
                    class149.field2507[var18][var13] = arg1;
                    var17 += var15;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    class149.field2507[var13][var19] = arg1;
                    var17 += var15;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
    public static final void method582(int arg0) {
        class2.field55.method32((byte) 70);
        for (int var1 = 0; var1 < 32; var1++) {
            class149.field2491[var1] = 0L;
        }
        field1363++;
        int var2 = 0;
        if (arg0 != -20898) {
            return;
        }
        while (var2 < 32) {
            class164.field2790[var2] = 0L;
            var2++;
        }
        class186.field3295 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BZ)V")
    public static final void method583(byte arg0, boolean arg1) {
        field1372++;
        for (class264 var2 = (class264) class94.field1493.method1686((byte) -83); var2 != null; var2 = (class264) class94.field1493.method1683(140)) {
            if (var2.field4606 != null) {
                class90.field1420.method696(var2.field4606);
                var2.field4606 = null;
            }
            if (var2.field4604 != null) {
                class90.field1420.method696(var2.field4604);
                var2.field4604 = null;
            }
            var2.method290((byte) -48);
        }
        if (arg0 != 63) {
            method579(-106);
        }
        if (!arg1) {
            return;
        }
        for (class264 var3 = (class264) class7.field118.method1686((byte) -83); var3 != null; var3 = (class264) class7.field118.method1683(140)) {
            if (var3.field4606 != null) {
                class90.field1420.method696(var3.field4606);
                var3.field4606 = null;
            }
            var3.method290((byte) -48);
        }
        for (class264 var4 = (class264) class123.field2014.method1418(0); var4 != null; var4 = (class264) class123.field2014.method1421(false)) {
            if (var4.field4606 != null) {
                class90.field1420.method696(var4.field4606);
                var4.field4606 = null;
            }
            var4.method290((byte) -48);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Le;)V")
    public class86(class125 arg0) {
        this.field1374 = arg0;
    }
}
