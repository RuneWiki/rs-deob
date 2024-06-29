import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 extends class16 {

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lje;")
    public static class67 field1438 = class85.method592(255, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lje;")
    public static class67 field1435 = class85.method592(255, "gleiten:");

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field1432 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Lje;")
    private static class67 field1436 = class85.method592(255, "Free world");

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Lje;")
    public static class67 field1437 = field1436;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1442 = 0;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Lje;")
    public static class67 field1434 = class85.method592(255, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Lje;")
    public class67 field1440;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
    private static final boolean method511(boolean arg0, int arg1) {
        field1433++;
        if (!arg0) {
            field1434 = null;
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V")
    private static final void method512(int arg0, long arg1) {
        field1443++;
        if (arg0 != 1672) {
            method513((byte) 10, null);
        }
        if (arg1 == 0L) {
            return;
        }
        if (class137.field3087 >= 100 && class99.field2204 != 1 || class137.field3087 >= 200) {
            class88.method614(class148.field3396, class52.field1030, 118, 0);
            return;
        }
        class67 var3 = class91.method674((byte) -116, arg1).method460(arg0 - 1594);
        for (int var4 = 0; var4 < class137.field3087; var4++) {
            if (class107.field2454[var4] == arg1) {
                class88.method614(class49.method314(new class67[] { var3, class9.field211 }, 0), class52.field1030, arg0 - 1557, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class92.field2059; var5++) {
            if (class14.field244[var5] == arg1) {
                class88.method614(class49.method314(new class67[] { class24.field431, var3, class67.field1311 }, 0), class52.field1030, 69, 0);
                return;
            }
        }
        if (var3.method455(class37.field667.field1854, 18909)) {
            class88.method614(class52.field1028, class52.field1030, 62, 0);
            return;
        }
        class104.field2381[class137.field3087] = var3;
        class64.field1259++;
        class107.field2454[class137.field3087] = arg1;
        class47.field921[class137.field3087] = 0;
        class4.field71[class137.field3087] = 0;
        class27.field486 = class86.field1899;
        class137.field3087++;
        class69.field1399.method285(66, (byte) 64);
        class69.field1399.method656(-121, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLef;)V")
    public static final void method513(byte arg0, class35 arg1) {
        Object[] var2 = arg1.field630;
        field1444++;
        int var3 = (Integer) var2[0];
        class101 var4 = class150.method1152(var3, (byte) 112);
        if (var4 == null) {
            return;
        }
        class23.field420 = 0;
        int var5 = 0;
        int[] var6 = var4.field2265;
        int var7 = -1;
        int var8 = 0;
        int var9 = 121 / ((arg0 - 30) / 49);
        byte var10 = -1;
        int[] var11 = var4.field2263;
        try {
            int var12 = 0;
            class142.field3263 = new int[var4.field2257];
            int var13 = 0;
            class98.field2189 = new class67[var4.field2261];
            for (int var14 = 1; var14 < var2.length; var14++) {
                if (var2[var14] instanceof Integer) {
                    int var15 = (Integer) var2[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field653;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field657;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field640 == null ? -1 : arg1.field640.field1508;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field629;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field640 == null ? -1 : arg1.field640.field1540;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field631 == null ? -1 : arg1.field631.field1508;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field631 == null ? -1 : arg1.field631.field1540;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field641;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field642;
                    }
                    class142.field3263[var12++] = var15;
                } else if (var2[var14] instanceof class67) {
                    class67 var16 = (class67) var2[var14];
                    if (var16.method455(class103.field2349, 18909)) {
                        var16 = arg1.field632;
                    }
                    class98.field2189[var13++] = var16;
                }
            }
            int var17 = 0;
            label1962: while (true) {
                var17++;
                if (var17 > 200000) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var272 = var6[var7];
                if (var272 < 100) {
                    if (var272 == 0) {
                        class151.field3451[var5++] = var11[var7];
                        continue;
                    }
                    if (var272 == 1) {
                        int var18 = var11[var7];
                        class151.field3451[var5++] = class42.field804[var18];
                        continue;
                    }
                    if (var272 == 2) {
                        int var19 = var11[var7];
                        var5--;
                        class42.field804[var19] = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 3) {
                        class84.field1864[var8++] = var4.field2268[var7];
                        continue;
                    }
                    if (var272 == 6) {
                        var7 += var11[var7];
                        continue;
                    }
                    if (var272 == 7) {
                        var5 -= 2;
                        if (class151.field3451[var5 + 1] != class151.field3451[var5]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 8) {
                        var5 -= 2;
                        if (class151.field3451[var5 + 1] == class151.field3451[var5]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 9) {
                        var5 -= 2;
                        if (class151.field3451[var5] < class151.field3451[var5 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 10) {
                        var5 -= 2;
                        if (class151.field3451[var5] > class151.field3451[var5 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 21) {
                        if (class23.field420 == 0) {
                            return;
                        }
                        class135 var20 = class144.field3293[--class23.field420];
                        class98.field2189 = var20.field3054;
                        class142.field3263 = var20.field3062;
                        var4 = var20.field3067;
                        var6 = var4.field2265;
                        var11 = var4.field2263;
                        var7 = var20.field3072;
                        continue;
                    }
                    if (var272 == 25) {
                        int var21 = var11[var7];
                        class151.field3451[var5++] = class60.method415(var21, (byte) 58);
                        continue;
                    }
                    if (var272 == 27) {
                        int var22 = var11[var7];
                        var5--;
                        class121.method955(class151.field3451[var5], var22, 109);
                        continue;
                    }
                    if (var272 == 31) {
                        var5 -= 2;
                        if (class151.field3451[var5] <= class151.field3451[var5 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 32) {
                        var5 -= 2;
                        if (class151.field3451[var5 + 1] <= class151.field3451[var5]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var272 == 33) {
                        class151.field3451[var5++] = class142.field3263[var11[var7]];
                        continue;
                    }
                    int var10001;
                    if (var272 == 34) {
                        var10001 = var11[var7];
                        var5--;
                        class142.field3263[var10001] = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 35) {
                        class84.field1864[var8++] = class98.field2189[var11[var7]];
                        continue;
                    }
                    if (var272 == 36) {
                        var10001 = var11[var7];
                        var8--;
                        class98.field2189[var10001] = class84.field1864[var8];
                        continue;
                    }
                    if (var272 == 37) {
                        int var23 = var11[var7];
                        var8 -= var23;
                        class67 var24 = class105.method831(class84.field1864, var23, false, var8);
                        class84.field1864[var8++] = var24;
                        continue;
                    }
                    if (var272 == 38) {
                        var5--;
                        continue;
                    }
                    if (var272 == 39) {
                        var8--;
                        continue;
                    }
                    if (var272 == 40) {
                        int var25 = var11[var7];
                        class101 var26 = class150.method1152(var25, (byte) 124);
                        int[] var27 = new int[var26.field2257];
                        class67[] var28 = new class67[var26.field2261];
                        for (int var29 = 0; var29 < var26.field2285; var29++) {
                            var27[var29] = class151.field3451[var5 + var29 - var26.field2285];
                        }
                        for (int var30 = 0; var30 < var26.field2278; var30++) {
                            var28[var30] = class84.field1864[var8 + var30 - var26.field2278];
                        }
                        var8 -= var26.field2278;
                        var5 -= var26.field2285;
                        class135 var31 = new class135();
                        var31.field3072 = var7;
                        var31.field3067 = var4;
                        var4 = var26;
                        var31.field3054 = class98.field2189;
                        var7 = -1;
                        var31.field3062 = class142.field3263;
                        class144.field3293[class23.field420++] = var31;
                        class142.field3263 = var27;
                        var11 = var26.field2263;
                        class98.field2189 = var28;
                        var6 = var26.field2265;
                        continue;
                    }
                    if (var272 == 42) {
                        class151.field3451[var5++] = class104.field2389[var11[var7]];
                        continue;
                    }
                    if (var272 == 43) {
                        var10001 = var11[var7];
                        var5--;
                        class104.field2389[var10001] = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 44) {
                        int var32 = var11[var7] >> 16;
                        var5--;
                        int var33 = class151.field3451[var5];
                        int var34 = var11[var7] & 0xFFFF;
                        if (var33 >= 0 && var33 <= 5000) {
                            class142.field3267[var32] = var33;
                            byte var35 = -1;
                            if (var34 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var33) {
                                    continue label1962;
                                }
                                class133.field3001[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var272 == 45) {
                        var5--;
                        int var37 = class151.field3451[var5];
                        int var38 = var11[var7];
                        if (var37 >= 0 && var37 < class142.field3267[var38]) {
                            class151.field3451[var5++] = class133.field3001[var38][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var272 == 46) {
                        var5 -= 2;
                        int var39 = var11[var7];
                        int var40 = class151.field3451[var5];
                        if (var40 >= 0 && class142.field3267[var39] > var40) {
                            class133.field3001[var39][var40] = class151.field3451[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var272 == 47) {
                        class67 var41 = class81.field1797[var11[var7]];
                        if (var41 == null) {
                            var41 = class68.field1387;
                        }
                        class84.field1864[var8++] = var41;
                        continue;
                    }
                    if (var272 == 48) {
                        var10001 = var11[var7];
                        var8--;
                        class81.field1797[var10001] = class84.field1864[var8];
                        continue;
                    }
                }
                boolean var42;
                if (var11[var7] == 1) {
                    var42 = true;
                } else {
                    var42 = false;
                }
                if (var272 < 1000) {
                    if (var272 == 100) {
                        var5 -= 3;
                        int var254 = class151.field3451[var5];
                        int var255 = class151.field3451[var5 + 1];
                        int var256 = class151.field3451[var5 + 2];
                        if (var255 == 0) {
                            throw new RuntimeException();
                        }
                        class72 var257 = class67.method467((byte) -13, var254);
                        if (var257.field1494 == null) {
                            var257.field1494 = new class72[var256 + 1];
                        }
                        if (var256 >= var257.field1494.length) {
                            class72[] var258 = new class72[var256 + 1];
                            for (int var259 = 0; var259 < var257.field1494.length; var259++) {
                                var258[var259] = var257.field1494[var259];
                            }
                            var257.field1494 = var258;
                        }
                        if (var256 > 0 && var257.field1494[var256 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var256 - 1));
                        }
                        class72 var260 = new class72();
                        var260.field1540 = var256;
                        var260.field1470 = var260.field1508 = var257.field1508;
                        var260.field1546 = var255;
                        var260.field1485 = true;
                        var257.field1494[var256] = var260;
                        if (var42) {
                            class95.field2133 = var260;
                        } else {
                            class35.field635 = var260;
                        }
                        class23.method160((byte) -29, var257);
                        continue;
                    }
                    if (var272 == 101) {
                        class72 var261 = var42 ? class95.field2133 : class35.field635;
                        class72 var262 = class67.method467((byte) -13, var261.field1508);
                        var262.field1494[var261.field1540] = null;
                        class23.method160((byte) -29, var262);
                        continue;
                    }
                    if (var272 == 102) {
                        var5--;
                        class72 var263 = class67.method467((byte) -13, class151.field3451[var5]);
                        var263.field1494 = null;
                        class23.method160((byte) -29, var263);
                        continue;
                    }
                    if (var272 == 200) {
                        var5 -= 2;
                        int var264 = class151.field3451[var5 + 1];
                        int var265 = class151.field3451[var5];
                        class72 var266 = class106.method836(var264, var265, 13);
                        if (var266 != null && var264 != -1) {
                            class151.field3451[var5++] = 1;
                            if (var42) {
                                class95.field2133 = var266;
                            } else {
                                class35.field635 = var266;
                            }
                            continue;
                        }
                        class151.field3451[var5++] = 0;
                        continue;
                    }
                } else if (var272 >= 1000 && var272 < 1100 || var272 >= 2000 && var272 < 2100) {
                    class72 var252;
                    if (var272 >= 2000) {
                        var272 -= 1000;
                        var5--;
                        var252 = class67.method467((byte) -13, class151.field3451[var5]);
                    } else {
                        var252 = var42 ? class95.field2133 : class35.field635;
                    }
                    if (var272 == 1000) {
                        var5 -= 2;
                        var252.field1561 = class151.field3451[var5];
                        var252.field1475 = class151.field3451[var5 + 1];
                        class23.method160((byte) -29, var252);
                        continue;
                    }
                    if (var272 == 1001) {
                        var5 -= 2;
                        var252.field1576 = class151.field3451[var5];
                        var252.field1523 = class151.field3451[var5 + 1];
                        class23.method160((byte) -29, var252);
                        continue;
                    }
                    if (var272 == 1003) {
                        var5--;
                        boolean var253 = class151.field3451[var5] == 1;
                        if (var252.field1557 != var253) {
                            var252.field1557 = var253;
                            class23.method160((byte) -29, var252);
                        }
                        continue;
                    }
                } else if (var272 >= 1100 && var272 < 1200 || !(var272 < 2100 || var272 >= 2200)) {
                    class72 var249;
                    if (var272 < 2000) {
                        var249 = var42 ? class95.field2133 : class35.field635;
                    } else {
                        var5--;
                        var249 = class67.method467((byte) -13, class151.field3451[var5]);
                        var272 -= 1000;
                    }
                    if (var272 == 1100) {
                        var5 -= 2;
                        var249.field1587 = class151.field3451[var5];
                        if (var249.field1587 > var249.field1447 - var249.field1576) {
                            var249.field1587 = var249.field1447 - var249.field1576;
                        }
                        if (var249.field1587 < 0) {
                            var249.field1587 = 0;
                        }
                        var249.field1575 = class151.field3451[var5 + 1];
                        if (var249.field1575 > var249.field1449 - var249.field1523) {
                            var249.field1575 = var249.field1449 - var249.field1523;
                        }
                        if (var249.field1575 < 0) {
                            var249.field1575 = 0;
                        }
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1101) {
                        var5--;
                        var249.field1486 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1102) {
                        var5--;
                        var249.field1481 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1103) {
                        var5--;
                        var249.field1503 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1104) {
                        var5--;
                        var249.field1560 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1105) {
                        var5--;
                        var249.field1588 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1106) {
                        var5--;
                        var249.field1473 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1107) {
                        var5--;
                        var249.field1531 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1108) {
                        var249.field1504 = 1;
                        var5--;
                        var249.field1511 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1109) {
                        var5 -= 6;
                        var249.field1567 = class151.field3451[var5];
                        var249.field1539 = class151.field3451[var5 + 1];
                        var249.field1542 = class151.field3451[var5 + 2];
                        var249.field1502 = class151.field3451[var5 + 3];
                        var249.field1499 = class151.field3451[var5 + 4];
                        var249.field1461 = class151.field3451[var5 + 5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1110) {
                        var5--;
                        int var250 = class151.field3451[var5];
                        if (var249.field1536 != var250) {
                            var249.field1570 = 0;
                            var249.field1536 = var250;
                            var249.field1545 = 0;
                            class23.method160((byte) -29, var249);
                        }
                        continue;
                    }
                    if (var272 == 1111) {
                        var5--;
                        var249.field1507 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1112) {
                        var8--;
                        class67 var251 = class84.field1864[var8];
                        if (!var251.method455(var249.field1459, 18909)) {
                            var249.field1459 = var251;
                            class23.method160((byte) -29, var249);
                        }
                        continue;
                    }
                    if (var272 == 1113) {
                        var5--;
                        var249.field1513 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1114) {
                        var5 -= 3;
                        var249.field1550 = class151.field3451[var5];
                        var249.field1516 = class151.field3451[var5 + 1];
                        var249.field1479 = class151.field3451[var5 + 2];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1115) {
                        var5--;
                        var249.field1537 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1116) {
                        var5--;
                        var249.field1556 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1117) {
                        var5--;
                        var249.field1525 = class151.field3451[var5];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1118) {
                        var5--;
                        var249.field1453 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1119) {
                        var5--;
                        var249.field1573 = class151.field3451[var5] == 1;
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                    if (var272 == 1120) {
                        var5 -= 2;
                        var249.field1447 = class151.field3451[var5];
                        var249.field1449 = class151.field3451[var5 + 1];
                        class23.method160((byte) -29, var249);
                        continue;
                    }
                } else if (var272 >= 1200 && var272 < 1300 || var272 >= 2200 && var272 < 2300) {
                    class72 var43;
                    if (var272 < 2000) {
                        var43 = var42 ? class95.field2133 : class35.field635;
                    } else {
                        var272 -= 1000;
                        var5--;
                        var43 = class67.method467((byte) -13, class151.field3451[var5]);
                    }
                    class23.method160((byte) -29, var43);
                    if (var272 == 1200) {
                        var5 -= 2;
                        int var44 = class151.field3451[var5];
                        int var45 = class151.field3451[var5 + 1];
                        var43.field1515 = var45;
                        var43.field1487 = var44;
                        class103 var46 = class123.method961(var44, 1658);
                        var43.field1502 = var46.field2329;
                        var43.field1542 = var46.field2341;
                        var43.field1539 = var46.field2294;
                        var43.field1499 = var46.field2299;
                        var43.field1461 = var46.field2328;
                        var43.field1567 = var46.field2305;
                        if (var43.field1576 > 0) {
                            var43.field1461 = var43.field1461 * 32 / var43.field1576;
                        }
                        continue;
                    }
                    if (var272 == 1201) {
                        var43.field1504 = 2;
                        var5--;
                        var43.field1511 = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 1202) {
                        var43.field1504 = 3;
                        var43.field1511 = class37.field667.field1843.method489(0);
                        continue;
                    }
                } else if ((var272 < 1300 || var272 >= 1400) && (var272 < 2300 || var272 >= 2400)) {
                    if (var272 >= 1400 && var272 < 1500 || var272 >= 2400 && var272 < 2500) {
                        class72 var47;
                        if (var272 >= 2000) {
                            var5--;
                            var47 = class67.method467((byte) -13, class151.field3451[var5]);
                            var272 -= 1000;
                        } else {
                            var47 = var42 ? class95.field2133 : class35.field635;
                        }
                        int[] var48 = null;
                        var8--;
                        class67 var49 = class84.field1864[var8];
                        if (var49.method445(false) > 0 && var49.method477(var49.method445(false) - 1, (byte) 115) == 89) {
                            var5--;
                            int var50 = class151.field3451[var5];
                            if (var50 > 0) {
                                var48 = new int[var50];
                                while (var50-- > 0) {
                                    var5--;
                                    var48[var50] = class151.field3451[var5];
                                }
                            }
                            var49 = var49.method448(0, var49.method445(false) - 1, -126);
                        }
                        Object[] var51 = new Object[var49.method445(false) + 1];
                        for (int var52 = var51.length - 1; var52 >= 1; var52--) {
                            if (var49.method477(var52 - 1, (byte) 119) == 115) {
                                var8--;
                                var51[var52] = class84.field1864[var8];
                            } else {
                                var5--;
                                var51[var52] = Integer.valueOf(class151.field3451[var5]);
                            }
                        }
                        var5--;
                        int var53 = class151.field3451[var5];
                        if (var53 == -1) {
                            var51 = null;
                        } else {
                            var51[0] = Integer.valueOf(var53);
                        }
                        if (var272 == 1416) {
                            var47.field1501 = var51;
                        }
                        if (var272 == 1405) {
                            var47.field1463 = var51;
                        }
                        if (var272 == 1400) {
                            var47.field1544 = var51;
                        }
                        if (var272 == 1409) {
                            var47.field1452 = var51;
                        }
                        if (var272 == 1411) {
                            var47.field1559 = var51;
                        }
                        if (var272 == 1419) {
                            var47.field1471 = var51;
                        }
                        if (var272 == 1402) {
                            var47.field1551 = var51;
                        }
                        if (var272 == 1424) {
                            var47.field1514 = var51;
                        }
                        if (var272 == 1412) {
                            var47.field1490 = var51;
                        }
                        if (var272 == 1410) {
                            var47.field1506 = var51;
                        }
                        if (var272 == 1423) {
                            var47.field1532 = var51;
                        }
                        if (var272 == 1407) {
                            var47.field1580 = var48;
                            var47.field1565 = var51;
                        }
                        if (var272 == 1418) {
                            var47.field1521 = var51;
                        }
                        if (var272 == 1403) {
                            var47.field1476 = var51;
                        }
                        if (var272 == 1415) {
                            var47.field1517 = var51;
                            var47.field1552 = var48;
                        }
                        if (var272 == 1404) {
                            var47.field1489 = var51;
                        }
                        if (var272 == 1421) {
                            var47.field1510 = var51;
                        }
                        if (var272 == 1401) {
                            var47.field1457 = var51;
                        }
                        var47.field1519 = true;
                        if (var272 == 1408) {
                            var47.field1483 = var51;
                        }
                        if (var272 == 1414) {
                            var47.field1448 = var51;
                            var47.field1524 = var48;
                        }
                        if (var272 == 1417) {
                            var47.field1480 = var51;
                        }
                        if (var272 == 1406) {
                            var47.field1564 = var51;
                        }
                        if (var272 == 1420) {
                            var47.field1566 = var51;
                        }
                        if (var272 == 1422) {
                            var47.field1493 = var51;
                        }
                        continue;
                    }
                    if (var272 < 1600) {
                        class72 var54 = var42 ? class95.field2133 : class35.field635;
                        if (var272 == 1500) {
                            class151.field3451[var5++] = var54.field1561;
                            continue;
                        }
                        if (var272 == 1501) {
                            class151.field3451[var5++] = var54.field1475;
                            continue;
                        }
                        if (var272 == 1502) {
                            class151.field3451[var5++] = var54.field1576;
                            continue;
                        }
                        if (var272 == 1503) {
                            class151.field3451[var5++] = var54.field1523;
                            continue;
                        }
                        if (var272 == 1504) {
                            class151.field3451[var5++] = var54.field1557 ? 1 : 0;
                            continue;
                        }
                        if (var272 == 1505) {
                            class151.field3451[var5++] = var54.field1470;
                            continue;
                        }
                    } else if (var272 < 1700) {
                        class72 var55 = var42 ? class95.field2133 : class35.field635;
                        if (var272 == 1600) {
                            class151.field3451[var5++] = var55.field1587;
                            continue;
                        }
                        if (var272 == 1601) {
                            class151.field3451[var5++] = var55.field1575;
                            continue;
                        }
                        if (var272 == 1602) {
                            class84.field1864[var8++] = var55.field1459;
                            continue;
                        }
                        if (var272 == 1603) {
                            class151.field3451[var5++] = var55.field1447;
                            continue;
                        }
                        if (var272 == 1604) {
                            class151.field3451[var5++] = var55.field1449;
                            continue;
                        }
                        if (var272 == 1605) {
                            class151.field3451[var5++] = var55.field1461;
                            continue;
                        }
                        if (var272 == 1606) {
                            class151.field3451[var5++] = var55.field1542;
                            continue;
                        }
                        if (var272 == 1607) {
                            class151.field3451[var5++] = var55.field1499;
                            continue;
                        }
                        if (var272 == 1608) {
                            class151.field3451[var5++] = var55.field1502;
                            continue;
                        }
                    } else if (var272 < 1800) {
                        class72 var244 = var42 ? class95.field2133 : class35.field635;
                        if (var272 == 1700) {
                            class151.field3451[var5++] = var244.field1487;
                            continue;
                        }
                        if (var272 == 1701) {
                            if (var244.field1487 == -1) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = var244.field1515;
                            }
                            continue;
                        }
                        if (var272 == 1702) {
                            class151.field3451[var5++] = var244.field1540;
                            continue;
                        }
                    } else if (var272 < 1900) {
                        class72 var56 = var42 ? class95.field2133 : class35.field635;
                        if (var272 == 1800) {
                            class151.field3451[var5++] = class121.method954(false, class140.method1063(var56, (byte) -110));
                            continue;
                        }
                        if (var272 == 1801) {
                            var5--;
                            int var57 = class151.field3451[var5];
                            int var273 = var57 - 1;
                            if (var56.field1529 != null && var273 < var56.field1529.length && var56.field1529[var273] != null) {
                                class84.field1864[var8++] = var56.field1529[var273];
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 1802) {
                            if (var56.field1534 == null) {
                                class84.field1864[var8++] = class27.field495;
                            } else {
                                class84.field1864[var8++] = var56.field1534;
                            }
                            continue;
                        }
                    } else if (var272 < 2600) {
                        var5--;
                        class72 var58 = class67.method467((byte) -13, class151.field3451[var5]);
                        if (var272 == 2500) {
                            class151.field3451[var5++] = var58.field1561;
                            continue;
                        }
                        if (var272 == 2501) {
                            class151.field3451[var5++] = var58.field1475;
                            continue;
                        }
                        if (var272 == 2502) {
                            class151.field3451[var5++] = var58.field1576;
                            continue;
                        }
                        if (var272 == 2503) {
                            class151.field3451[var5++] = var58.field1523;
                            continue;
                        }
                        if (var272 == 2504) {
                            class151.field3451[var5++] = var58.field1557 ? 1 : 0;
                            continue;
                        }
                        if (var272 == 2505) {
                            class151.field3451[var5++] = var58.field1470;
                            continue;
                        }
                    } else if (var272 < 2700) {
                        var5--;
                        class72 var243 = class67.method467((byte) -13, class151.field3451[var5]);
                        if (var272 == 2600) {
                            class151.field3451[var5++] = var243.field1587;
                            continue;
                        }
                        if (var272 == 2601) {
                            class151.field3451[var5++] = var243.field1575;
                            continue;
                        }
                        if (var272 == 2602) {
                            class84.field1864[var8++] = var243.field1459;
                            continue;
                        }
                        if (var272 == 2603) {
                            class151.field3451[var5++] = var243.field1447;
                            continue;
                        }
                        if (var272 == 2604) {
                            class151.field3451[var5++] = var243.field1449;
                            continue;
                        }
                        if (var272 == 2605) {
                            class151.field3451[var5++] = var243.field1461;
                            continue;
                        }
                        if (var272 == 2606) {
                            class151.field3451[var5++] = var243.field1542;
                            continue;
                        }
                        if (var272 == 2607) {
                            class151.field3451[var5++] = var243.field1499;
                            continue;
                        }
                        if (var272 == 2608) {
                            class151.field3451[var5++] = var243.field1502;
                            continue;
                        }
                    } else if (var272 < 2800) {
                        if (var272 == 2700) {
                            var5--;
                            class72 var59 = class67.method467((byte) -13, class151.field3451[var5]);
                            class151.field3451[var5++] = var59.field1487;
                            continue;
                        }
                        if (var272 == 2701) {
                            var5--;
                            class72 var60 = class67.method467((byte) -13, class151.field3451[var5]);
                            if (var60.field1487 == -1) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = var60.field1515;
                            }
                            continue;
                        }
                        if (var272 == 2702) {
                            var5--;
                            int var61 = class151.field3451[var5];
                            class60 var62 = (class60) class76.field1634.method1119(28254, (long) var61);
                            if (var62 == null) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var272 < 2900) {
                        var5--;
                        class72 var63 = class67.method467((byte) -13, class151.field3451[var5]);
                        if (var272 == 2800) {
                            class151.field3451[var5++] = class121.method954(false, class140.method1063(var63, (byte) -127));
                            continue;
                        }
                        if (var272 == 2801) {
                            var5--;
                            int var64 = class151.field3451[var5];
                            int var274 = var64 - 1;
                            if (var63.field1529 != null && var274 < var63.field1529.length && var63.field1529[var274] != null) {
                                class84.field1864[var8++] = var63.field1529[var274];
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 2802) {
                            if (var63.field1534 == null) {
                                class84.field1864[var8++] = class27.field495;
                            } else {
                                class84.field1864[var8++] = var63.field1534;
                            }
                            continue;
                        }
                    } else if (var272 < 3200) {
                        if (var272 == 3100) {
                            var8--;
                            class67 var229 = class84.field1864[var8];
                            class88.method614(var229, class27.field495, 109, 0);
                            continue;
                        }
                        if (var272 == 3101) {
                            var5 -= 2;
                            class16.method112(class151.field3451[var5 + 1], class151.field3451[var5], class37.field667, true);
                            continue;
                        }
                        if (var272 == 3103) {
                            class81.method574((byte) -71);
                            continue;
                        }
                        if (var272 == 3104) {
                            class158.field3614++;
                            var8--;
                            class67 var230 = class84.field1864[var8];
                            int var231 = 0;
                            if (var230.method475((byte) -63)) {
                                var231 = var230.method469((byte) 59);
                            }
                            class69.field1399.method285(89, (byte) 64);
                            class69.field1399.method629((byte) 36, var231);
                            continue;
                        }
                        if (var272 == 3105) {
                            class116.field2609++;
                            var8--;
                            class67 var232 = class84.field1864[var8];
                            class69.field1399.method285(39, (byte) 64);
                            class69.field1399.method656(-86, var232.method476((byte) 77));
                            continue;
                        }
                        if (var272 == 3106) {
                            class86.field1915++;
                            var8--;
                            class67 var233 = class84.field1864[var8];
                            class69.field1399.method285(40, (byte) 64);
                            class69.field1399.method653(var233.method445(false) + 1, 95);
                            class69.field1399.method673(var233, -1393);
                            continue;
                        }
                        if (var272 == 3107) {
                            var5--;
                            int var234 = class151.field3451[var5];
                            var8--;
                            class67 var235 = class84.field1864[var8];
                            class99.method769(var235, 0, var234);
                            continue;
                        }
                        if (var272 == 3108) {
                            var5 -= 3;
                            int var236 = class151.field3451[var5 + 2];
                            int var237 = class151.field3451[var5];
                            int var238 = class151.field3451[var5 + 1];
                            class72 var239 = class67.method467((byte) -13, var236);
                            class159.method1230(var239, var237, true, var238);
                            continue;
                        }
                        if (var272 == 3109) {
                            var5 -= 2;
                            int var240 = class151.field3451[var5];
                            int var241 = class151.field3451[var5 + 1];
                            class72 var242 = var42 ? class95.field2133 : class35.field635;
                            class159.method1230(var242, var240, true, var241);
                            continue;
                        }
                    } else if (var272 < 3300) {
                        if (var272 == 3200) {
                            var5 -= 3;
                            class76.method541(class151.field3451[var5 + 2], class151.field3451[var5], class151.field3451[var5 + 1], 26079);
                            continue;
                        }
                        if (var272 == 3201) {
                            var5--;
                            class151.method1158((byte) 123, class151.field3451[var5]);
                            continue;
                        }
                        if (var272 == 3202) {
                            var5 -= 2;
                            class30.method196(class151.field3451[var5], -82, class151.field3451[var5 + 1]);
                            continue;
                        }
                    } else if (var272 < 3400) {
                        if (var272 == 3300) {
                            class151.field3451[var5++] = class34.field627;
                            continue;
                        }
                        if (var272 == 3301) {
                            var5 -= 2;
                            int var65 = class151.field3451[var5 + 1];
                            int var66 = class151.field3451[var5];
                            class151.field3451[var5++] = class118.method941(var65, 111, var66);
                            continue;
                        }
                        if (var272 == 3302) {
                            var5 -= 2;
                            int var67 = class151.field3451[var5];
                            int var68 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = class137.method1045(true, var68, var67);
                            continue;
                        }
                        if (var272 == 3303) {
                            var5 -= 2;
                            int var69 = class151.field3451[var5 + 1];
                            int var70 = class151.field3451[var5];
                            class151.field3451[var5++] = class84.method591(0, var69, var70);
                            continue;
                        }
                        if (var272 == 3304) {
                            var5--;
                            int var71 = class151.field3451[var5];
                            class151.field3451[var5++] = class76.method544(5, var71).field3366;
                            continue;
                        }
                        if (var272 == 3305) {
                            var5--;
                            int var72 = class151.field3451[var5];
                            class151.field3451[var5++] = class135.field3068[var72];
                            continue;
                        }
                        if (var272 == 3306) {
                            var5--;
                            int var73 = class151.field3451[var5];
                            class151.field3451[var5++] = class49.field944[var73];
                            continue;
                        }
                        if (var272 == 3307) {
                            var5--;
                            int var74 = class151.field3451[var5];
                            class151.field3451[var5++] = class134.field3011[var74];
                            continue;
                        }
                        if (var272 == 3308) {
                            int var75 = class128.field2817;
                            int var76 = (class37.field667.field2957 >> 7) + class130.field2863;
                            int var77 = (class37.field667.field2963 >> 7) + class35.field647;
                            class151.field3451[var5++] = (var75 << 28) + (var76 << 14) + var77;
                            continue;
                        }
                        if (var272 == 3309) {
                            var5--;
                            int var78 = class151.field3451[var5];
                            class151.field3451[var5++] = class34.method213(var78, 268430213) >> 14;
                            continue;
                        }
                        if (var272 == 3310) {
                            var5--;
                            int var79 = class151.field3451[var5];
                            class151.field3451[var5++] = var79 >> 28;
                            continue;
                        }
                        if (var272 == 3311) {
                            var5--;
                            int var80 = class151.field3451[var5];
                            class151.field3451[var5++] = class34.method213(var80, 16383);
                            continue;
                        }
                        if (var272 == 3312) {
                            class151.field3451[var5++] = class112.field2523 ? 1 : 0;
                            continue;
                        }
                        if (var272 == 3313) {
                            var5 -= 2;
                            int var81 = class151.field3451[var5 + 1];
                            int var82 = class151.field3451[var5] + 32768;
                            class151.field3451[var5++] = class118.method941(var81, 58, var82);
                            continue;
                        }
                        if (var272 == 3314) {
                            var5 -= 2;
                            int var83 = class151.field3451[var5] + 32768;
                            int var84 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = class137.method1045(true, var84, var83);
                            continue;
                        }
                        if (var272 == 3315) {
                            var5 -= 2;
                            int var85 = class151.field3451[var5] + 32768;
                            int var86 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = class84.method591(0, var86, var85);
                            continue;
                        }
                        if (var272 == 3316) {
                            if (class135.field3049 < 2) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = class135.field3049;
                            }
                            continue;
                        }
                        if (var272 == 3317) {
                            class151.field3451[var5++] = class2.field14;
                            continue;
                        }
                        if (var272 == 3318) {
                            class151.field3451[var5++] = class19.field366;
                            continue;
                        }
                        if (var272 == 3321) {
                            class151.field3451[var5++] = class66.field1293;
                            continue;
                        }
                        if (var272 == 3322) {
                            class151.field3451[var5++] = class2.field20;
                            continue;
                        }
                        if (var272 == 3323) {
                            if (class135.field3049 == 1) {
                                class151.field3451[var5++] = 1;
                            } else {
                                class151.field3451[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var272 < 3500) {
                        if (var272 == 3400) {
                            var5 -= 2;
                            int var219 = class151.field3451[var5];
                            int var220 = class151.field3451[var5 + 1];
                            class152 var221 = class14.method101(var219, 23022);
                            for (int var222 = 0; var222 < var221.field3470; var222++) {
                                if (var221.field3469[var222] == var220) {
                                    class84.field1864[var8++] = var221.field3474[var222];
                                    var221 = null;
                                    break;
                                }
                            }
                            if (var221 != null) {
                                class84.field1864[var8++] = var221.field3472;
                            }
                            continue;
                        }
                        if (var272 == 3408) {
                            var5 -= 4;
                            int var223 = class151.field3451[var5];
                            int var224 = class151.field3451[var5 + 2];
                            int var225 = class151.field3451[var5 + 1];
                            int var226 = class151.field3451[var5 + 3];
                            class152 var227 = class14.method101(var224, 23022);
                            if (var227.field3476 == var223 && var227.field3475 == var225) {
                                for (int var228 = 0; var228 < var227.field3470; var228++) {
                                    if (var227.field3469[var228] == var226) {
                                        if (var225 == 115) {
                                            class84.field1864[var8++] = var227.field3474[var228];
                                        } else {
                                            class151.field3451[var5++] = var227.field3466[var228];
                                        }
                                        var227 = null;
                                        break;
                                    }
                                }
                                if (var227 != null) {
                                    if (var225 == 115) {
                                        class84.field1864[var8++] = var227.field3472;
                                    } else {
                                        class151.field3451[var5++] = var227.field3467;
                                    }
                                }
                                continue;
                            }
                            if (var225 == 115) {
                                class84.field1864[var8++] = class68.field1387;
                            } else {
                                class151.field3451[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var272 < 3700) {
                        if (var272 == 3600) {
                            if (class126.field2772 == 0) {
                                class151.field3451[var5++] = -2;
                            } else if (class126.field2772 == 1) {
                                class151.field3451[var5++] = -1;
                            } else {
                                class151.field3451[var5++] = class137.field3087;
                            }
                            continue;
                        }
                        if (var272 == 3601) {
                            var5--;
                            int var201 = class151.field3451[var5];
                            if (class126.field2772 == 2 && var201 < class137.field3087) {
                                class84.field1864[var8++] = class104.field2381[var201];
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 3602) {
                            var5--;
                            int var202 = class151.field3451[var5];
                            if (class126.field2772 == 2 && var202 < class137.field3087) {
                                class151.field3451[var5++] = class47.field921[var202];
                                continue;
                            }
                            class151.field3451[var5++] = 0;
                            continue;
                        }
                        if (var272 == 3603) {
                            var5--;
                            int var203 = class151.field3451[var5];
                            if (class126.field2772 == 2 && var203 < class137.field3087) {
                                class151.field3451[var5++] = class4.field71[var203];
                                continue;
                            }
                            class151.field3451[var5++] = 0;
                            continue;
                        }
                        if (var272 == 3604) {
                            var8--;
                            class67 var204 = class84.field1864[var8];
                            var5--;
                            int var205 = class151.field3451[var5];
                            class77.method547(var204, var205, (byte) 24);
                            continue;
                        }
                        if (var272 == 3605) {
                            var8--;
                            class67 var206 = class84.field1864[var8];
                            method512(1672, var206.method476((byte) 77));
                            continue;
                        }
                        if (var272 == 3606) {
                            var8--;
                            class67 var207 = class84.field1864[var8];
                            class91.method643(-20011, var207.method476((byte) 77));
                            continue;
                        }
                        if (var272 == 3607) {
                            var8--;
                            class67 var208 = class84.field1864[var8];
                            class106.method835((byte) 98, var208.method476((byte) 77));
                            continue;
                        }
                        if (var272 == 3608) {
                            var8--;
                            class67 var209 = class84.field1864[var8];
                            class31.method199((byte) 111, var209.method476((byte) 77));
                            continue;
                        }
                        if (var272 == 3609) {
                            var8--;
                            class67 var210 = class84.field1864[var8];
                            if (var210.method454(class4.field64, (byte) -123) || var210.method454(class141.field3175, (byte) -123)) {
                                var210 = var210.method463(7, -111);
                            }
                            class151.field3451[var5++] = class47.method310(-128, var210) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 3611) {
                            if (class72.field1500 == null) {
                                class84.field1864[var8++] = class27.field495;
                            } else {
                                class84.field1864[var8++] = class72.field1500.method460(88);
                            }
                            continue;
                        }
                        if (var272 == 3612) {
                            if (class72.field1500 == null) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = class106.field2411;
                            }
                            continue;
                        }
                        if (var272 == 3613) {
                            var5--;
                            int var211 = class151.field3451[var5];
                            if (class72.field1500 != null && class106.field2411 > var211) {
                                class84.field1864[var8++] = class138.field3110[var211].field2066.method460(83);
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 3614) {
                            var5--;
                            int var212 = class151.field3451[var5];
                            if (class72.field1500 != null && var212 < class106.field2411) {
                                class151.field3451[var5++] = class138.field3110[var212].field2057;
                                continue;
                            }
                            class151.field3451[var5++] = 0;
                            continue;
                        }
                        if (var272 == 3615) {
                            var5--;
                            int var213 = class151.field3451[var5];
                            if (class72.field1500 != null && var213 < class106.field2411) {
                                class151.field3451[var5++] = class138.field3110[var213].field2052;
                                continue;
                            }
                            class151.field3451[var5++] = 0;
                            continue;
                        }
                        if (var272 == 3616) {
                            class151.field3451[var5++] = class83.field1839;
                            continue;
                        }
                        if (var272 == 3617) {
                            var8--;
                            class67 var214 = class84.field1864[var8];
                            class38.method239((byte) -105, var214);
                            continue;
                        }
                        if (var272 == 3618) {
                            class151.field3451[var5++] = class93.field2106;
                            continue;
                        }
                        if (var272 == 3619) {
                            var8--;
                            class67 var215 = class84.field1864[var8];
                            class26.method174(var215.method476((byte) 77), 0);
                            continue;
                        }
                        if (var272 == 3620) {
                            class101.method802(0);
                            continue;
                        }
                        if (var272 == 3621) {
                            if (class126.field2772 == 0) {
                                class151.field3451[var5++] = -1;
                            } else {
                                class151.field3451[var5++] = class92.field2059;
                            }
                            continue;
                        }
                        if (var272 == 3622) {
                            var5--;
                            int var216 = class151.field3451[var5];
                            if (class126.field2772 != 0 && class92.field2059 > var216) {
                                class84.field1864[var8++] = class91.method674((byte) -116, class14.field244[var216]).method460(120);
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 3623) {
                            var8--;
                            class67 var217 = class84.field1864[var8];
                            if (var217.method454(class4.field64, (byte) -123) || var217.method454(class141.field3175, (byte) -123)) {
                                var217 = var217.method463(7, -107);
                            }
                            class151.field3451[var5++] = class91.method663((byte) -74, var217) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 3624) {
                            var5--;
                            int var218 = class151.field3451[var5];
                            if (class138.field3110 != null && class106.field2411 > var218 && class138.field3110[var218].field2066.method479(63, class37.field667.field1854)) {
                                class151.field3451[var5++] = 1;
                                continue;
                            }
                            class151.field3451[var5++] = 0;
                            continue;
                        }
                        if (var272 == 3625) {
                            if (class15.field273 == null) {
                                class84.field1864[var8++] = class27.field495;
                            } else {
                                class84.field1864[var8++] = class15.field273.method460(97);
                            }
                            continue;
                        }
                    } else if (var272 < 4100) {
                        if (var272 == 4000) {
                            var5 -= 2;
                            int var168 = class151.field3451[var5];
                            int var169 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = var168 + var169;
                            continue;
                        }
                        if (var272 == 4001) {
                            var5 -= 2;
                            int var170 = class151.field3451[var5];
                            int var171 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = var170 - var171;
                            continue;
                        }
                        if (var272 == 4002) {
                            var5 -= 2;
                            int var172 = class151.field3451[var5];
                            int var173 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = var172 * var173;
                            continue;
                        }
                        if (var272 == 4003) {
                            var5 -= 2;
                            int var174 = class151.field3451[var5];
                            int var175 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = var174 / var175;
                            continue;
                        }
                        if (var272 == 4004) {
                            var5--;
                            int var176 = class151.field3451[var5];
                            class151.field3451[var5++] = (int) (Math.random() * (double) var176);
                            continue;
                        }
                        if (var272 == 4005) {
                            var5--;
                            int var177 = class151.field3451[var5];
                            class151.field3451[var5++] = (int) (Math.random() * (double) (var177 + 1));
                            continue;
                        }
                        if (var272 == 4006) {
                            var5 -= 5;
                            int var178 = class151.field3451[var5];
                            int var179 = class151.field3451[var5 + 1];
                            int var180 = class151.field3451[var5 + 3];
                            int var181 = class151.field3451[var5 + 2];
                            int var182 = class151.field3451[var5 + 4];
                            class151.field3451[var5++] = var178 + (var179 - var178) * (-var181 + var182) / (var180 - var181);
                            continue;
                        }
                        if (var272 == 4007) {
                            var5 -= 2;
                            int var183 = class151.field3451[var5];
                            int var184 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = var183 * var184 / 100 + var183;
                            continue;
                        }
                        if (var272 == 4008) {
                            var5 -= 2;
                            int var185 = class151.field3451[var5 + 1];
                            int var186 = class151.field3451[var5];
                            class151.field3451[var5++] = class82.method579(var186, 0x1 << var185);
                            continue;
                        }
                        if (var272 == 4009) {
                            var5 -= 2;
                            int var187 = class151.field3451[var5];
                            int var188 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = class34.method213(-(0x1 << var188) - 1, var187);
                            continue;
                        }
                        if (var272 == 4010) {
                            var5 -= 2;
                            int var189 = class151.field3451[var5 + 1];
                            int var190 = class151.field3451[var5];
                            class151.field3451[var5++] = class34.method213(var190, 0x1 << var189) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var272 == 4011) {
                            var5 -= 2;
                            int var191 = class151.field3451[var5 + 1];
                            int var192 = class151.field3451[var5];
                            class151.field3451[var5++] = var192 % var191;
                            continue;
                        }
                        if (var272 == 4012) {
                            var5 -= 2;
                            int var193 = class151.field3451[var5];
                            int var194 = class151.field3451[var5 + 1];
                            if (var193 == 0) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = (int) Math.pow((double) var193, (double) var194);
                            }
                            continue;
                        }
                        if (var272 == 4013) {
                            var5 -= 2;
                            int var195 = class151.field3451[var5];
                            int var196 = class151.field3451[var5 + 1];
                            if (var195 == 0) {
                                class151.field3451[var5++] = 0;
                            } else if (var196 == 0) {
                                class151.field3451[var5++] = Integer.MAX_VALUE;
                            } else {
                                class151.field3451[var5++] = (int) Math.pow((double) var195, 1.0D / (double) var196);
                            }
                            continue;
                        }
                        if (var272 == 4014) {
                            var5 -= 2;
                            int var197 = class151.field3451[var5 + 1];
                            int var198 = class151.field3451[var5];
                            class151.field3451[var5++] = class34.method213(var198, var197);
                            continue;
                        }
                        if (var272 == 4015) {
                            var5 -= 2;
                            int var199 = class151.field3451[var5];
                            int var200 = class151.field3451[var5 + 1];
                            class151.field3451[var5++] = class82.method579(var199, var200);
                            continue;
                        }
                    } else if (var272 < 4200) {
                        if (var272 == 4100) {
                            var8--;
                            class67 var87 = class84.field1864[var8];
                            var5--;
                            int var88 = class151.field3451[var5];
                            class84.field1864[var8++] = class49.method314(new class67[] { var87, class60.method420(var88, 28498) }, 0);
                            continue;
                        }
                        if (var272 == 4101) {
                            var8 -= 2;
                            class67 var89 = class84.field1864[var8];
                            class67 var90 = class84.field1864[var8 + 1];
                            class84.field1864[var8++] = class49.method314(new class67[] { var89, var90 }, 0);
                            continue;
                        }
                        if (var272 == 4102) {
                            var8--;
                            class67 var91 = class84.field1864[var8];
                            var5--;
                            int var92 = class151.field3451[var5];
                            class84.field1864[var8++] = class49.method314(new class67[] { var91, class114.method925(-1, true, var92) }, 0);
                            continue;
                        }
                        if (var272 == 4103) {
                            var8--;
                            class67 var93 = class84.field1864[var8];
                            class84.field1864[var8++] = var93.method480(-91);
                            continue;
                        }
                        if (var272 == 4104) {
                            var5--;
                            int var94 = class151.field3451[var5];
                            long var95 = (long) var94 * 86400000L + 1014768000000L;
                            class3.field39.setTime(new Date(var95));
                            int var97 = class3.field39.get(5);
                            int var98 = class3.field39.get(2);
                            int var99 = class3.field39.get(1);
                            class84.field1864[var8++] = class49.method314(new class67[] { class60.method420(var97, 28498), class92.field2070, class104.field2377[var98], class92.field2070, class60.method420(var99, 28498) }, 0);
                            continue;
                        }
                        if (var272 == 4105) {
                            var8 -= 2;
                            class67 var100 = class84.field1864[var8];
                            class67 var101 = class84.field1864[var8 + 1];
                            if (class37.field667.field1843 != null && class37.field667.field1843.field1363) {
                                class84.field1864[var8++] = var101;
                                continue;
                            }
                            class84.field1864[var8++] = var100;
                            continue;
                        }
                        if (var272 == 4106) {
                            var5--;
                            int var102 = class151.field3451[var5];
                            class84.field1864[var8++] = class60.method420(var102, 28498);
                            continue;
                        }
                        if (var272 == 4107) {
                            var8 -= 2;
                            class151.field3451[var5++] = class84.field1864[var8].method458(class84.field1864[var8 + 1], (byte) -62);
                            continue;
                        }
                        if (var272 == 4108) {
                            var5 -= 2;
                            var8--;
                            class67 var103 = class84.field1864[var8];
                            int var104 = class151.field3451[var5];
                            int var105 = class151.field3451[var5 + 1];
                            byte[] var106 = class82.field1798.method267((byte) -124, 0, var105);
                            class102 var107 = new class102(var106);
                            class151.field3451[var5++] = var107.method789(var103, var104);
                            continue;
                        }
                        if (var272 == 4109) {
                            var5 -= 2;
                            int var108 = class151.field3451[var5];
                            var8--;
                            class67 var109 = class84.field1864[var8];
                            int var110 = class151.field3451[var5 + 1];
                            byte[] var111 = class82.field1798.method267((byte) -124, 0, var110);
                            class102 var112 = new class102(var111);
                            class151.field3451[var5++] = var112.method796(var109, var108);
                            continue;
                        }
                        if (var272 == 4110) {
                            var8 -= 2;
                            class67 var113 = class84.field1864[var8 + 1];
                            class67 var114 = class84.field1864[var8];
                            var5--;
                            if (class151.field3451[var5] == 1) {
                                class84.field1864[var8++] = var114;
                            } else {
                                class84.field1864[var8++] = var113;
                            }
                            continue;
                        }
                        if (var272 == 4111) {
                            var8--;
                            class67 var115 = class84.field1864[var8];
                            class84.field1864[var8++] = class100.method785(var115);
                            continue;
                        }
                        if (var272 == 4112) {
                            var8--;
                            class67 var116 = class84.field1864[var8];
                            var5--;
                            int var117 = class151.field3451[var5];
                            class84.field1864[var8++] = var116.method478(false, var117);
                            continue;
                        }
                        if (var272 == 4113) {
                            var5--;
                            int var118 = class151.field3451[var5];
                            class151.field3451[var5++] = class128.method983(var118, -122) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 4114) {
                            var5--;
                            int var119 = class151.field3451[var5];
                            class151.field3451[var5++] = method511(true, var119) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 4115) {
                            var5--;
                            int var120 = class151.field3451[var5];
                            class151.field3451[var5++] = class137.method1046(-25905, var120) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 4116) {
                            var5--;
                            int var121 = class151.field3451[var5];
                            class151.field3451[var5++] = class147.method1136(var121, 57) ? 1 : 0;
                            continue;
                        }
                        if (var272 == 4117) {
                            var8--;
                            class67 var122 = class84.field1864[var8];
                            if (var122 == null) {
                                class151.field3451[var5++] = 0;
                            } else {
                                class151.field3451[var5++] = var122.method445(false);
                            }
                            continue;
                        }
                        if (var272 == 4118) {
                            var5 -= 2;
                            var8--;
                            class67 var123 = class84.field1864[var8];
                            int var124 = class151.field3451[var5];
                            int var125 = class151.field3451[var5 + 1];
                            class84.field1864[var8++] = var123.method448(var124, var125, -121);
                            continue;
                        }
                        if (var272 == 4119) {
                            var8--;
                            class67 var126 = class84.field1864[var8];
                            class67 var127 = class138.method1050(var126.method445(false), -89);
                            boolean var128 = false;
                            for (int var129 = 0; var126.method445(false) > var129; var129++) {
                                int var130 = var126.method477(var129, (byte) 114);
                                if (var130 == 60) {
                                    var128 = true;
                                } else if (var130 == 62) {
                                    var128 = false;
                                } else if (!var128) {
                                    var127.method483(var130, 0);
                                }
                            }
                            var127.method456((byte) 117);
                            class84.field1864[var8++] = var127;
                            continue;
                        }
                        if (var272 == 4120) {
                            var8--;
                            class67 var131 = class84.field1864[var8];
                            var5--;
                            int var132 = class151.field3451[var5];
                            class151.field3451[var5++] = var131.method465(7095, var132);
                            continue;
                        }
                    } else if (var272 < 4300) {
                        if (var272 == 4200) {
                            var5--;
                            int var133 = class151.field3451[var5];
                            class84.field1864[var8++] = class123.method961(var133, 1658).field2302;
                            continue;
                        }
                        if (var272 == 4201) {
                            var5 -= 2;
                            int var134 = class151.field3451[var5];
                            int var135 = class151.field3451[var5 + 1];
                            class103 var136 = class123.method961(var134, 1658);
                            if (var135 >= 1 && var135 <= 5 && var136.field2353[var135 - 1] != null) {
                                class84.field1864[var8++] = var136.field2353[var135 - 1];
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 4202) {
                            var5 -= 2;
                            int var137 = class151.field3451[var5];
                            int var138 = class151.field3451[var5 + 1];
                            class103 var139 = class123.method961(var137, 1658);
                            if (var138 >= 1 && var138 <= 5 && var139.field2303[var138 - 1] != null) {
                                class84.field1864[var8++] = var139.field2303[var138 - 1];
                                continue;
                            }
                            class84.field1864[var8++] = class27.field495;
                            continue;
                        }
                        if (var272 == 4203) {
                            var5--;
                            int var140 = class151.field3451[var5];
                            class151.field3451[var5++] = class123.method961(var140, 1658).field2355;
                            continue;
                        }
                        if (var272 == 4204) {
                            var5--;
                            int var141 = class151.field3451[var5];
                            class151.field3451[var5++] = class123.method961(var141, 1658).field2356 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var272 == 4205) {
                            var5--;
                            int var142 = class151.field3451[var5];
                            class103 var143 = class123.method961(var142, 1658);
                            if (var143.field2290 == -1 && var143.field2347 >= 0) {
                                class151.field3451[var5++] = var143.field2347;
                                continue;
                            }
                            class151.field3451[var5++] = var142;
                            continue;
                        }
                        if (var272 == 4206) {
                            var5--;
                            int var144 = class151.field3451[var5];
                            class103 var145 = class123.method961(var144, 1658);
                            if (var145.field2290 >= 0 && var145.field2347 >= 0) {
                                class151.field3451[var5++] = var145.field2347;
                                continue;
                            }
                            class151.field3451[var5++] = var144;
                            continue;
                        }
                        if (var272 == 4207) {
                            var5--;
                            int var146 = class151.field3451[var5];
                            class151.field3451[var5++] = class123.method961(var146, 1658).field2309 ? 1 : 0;
                            continue;
                        }
                    } else if (var272 < 5100) {
                        if (var272 == 5000) {
                            class151.field3451[var5++] = class29.field516;
                            continue;
                        }
                        if (var272 == 5001) {
                            class69.field1392++;
                            var5 -= 3;
                            class29.field516 = class151.field3451[var5];
                            class18.field342 = class151.field3451[var5 + 1];
                            class158.field3627 = class151.field3451[var5 + 2];
                            class69.field1399.method285(184, (byte) 64);
                            class69.field1399.method653(class29.field516, 47);
                            class69.field1399.method653(class18.field342, 124);
                            class69.field1399.method653(class158.field3627, 110);
                            continue;
                        }
                        if (var272 == 5002) {
                            class142.field3269++;
                            var8--;
                            class67 var147 = class84.field1864[var8];
                            var5 -= 2;
                            int var148 = class151.field3451[var5];
                            int var149 = class151.field3451[var5 + 1];
                            class69.field1399.method285(30, (byte) 64);
                            class69.field1399.method656(120, var147.method476((byte) 77));
                            class69.field1399.method653(var148 - 1, 83);
                            class69.field1399.method653(var149, 126);
                            continue;
                        }
                        if (var272 == 5003) {
                            var5--;
                            int var150 = class151.field3451[var5];
                            class67 var151 = null;
                            if (var150 < 100) {
                                var151 = class152.field3485[var150];
                            }
                            if (var151 == null) {
                                var151 = class27.field495;
                            }
                            class84.field1864[var8++] = var151;
                            continue;
                        }
                        if (var272 == 5004) {
                            var5--;
                            int var152 = class151.field3451[var5];
                            int var153 = -1;
                            if (var152 < 100 && class152.field3485[var152] != null) {
                                var153 = class14.field249[var152];
                            }
                            class151.field3451[var5++] = var153;
                            continue;
                        }
                        if (var272 == 5005) {
                            class151.field3451[var5++] = class18.field342;
                            continue;
                        }
                        if (var272 == 5008) {
                            var8--;
                            class67 var154 = class84.field1864[var8];
                            if (var154.method454(class144.field3306, (byte) -123)) {
                                class16.method114(true, var154);
                            } else {
                                class32.field569++;
                                class67 var155 = var154.method480(-91);
                                byte var156 = 0;
                                byte var157 = 0;
                                if (var155.method454(class135.field3075, (byte) -123)) {
                                    var154 = var154.method463(class135.field3075.method445(false), -120);
                                    var157 = 0;
                                } else if (var155.method454(class118.field2662, (byte) -123)) {
                                    var157 = 1;
                                    var154 = var154.method463(class118.field2662.method445(false), -118);
                                } else if (var155.method454(class16.field288, (byte) -123)) {
                                    var157 = 2;
                                    var154 = var154.method463(class16.field288.method445(false), -96);
                                } else if (var155.method454(class121.field2722, (byte) -123)) {
                                    var154 = var154.method463(class121.field2722.method445(false), -106);
                                    var157 = 3;
                                } else if (var155.method454(class120.field2704, (byte) -123)) {
                                    var154 = var154.method463(class120.field2704.method445(false), -122);
                                    var157 = 4;
                                } else if (var155.method454(class134.field3015, (byte) -123)) {
                                    var154 = var154.method463(class134.field3015.method445(false), -108);
                                    var157 = 5;
                                } else if (var155.method454(class95.field2127, (byte) -123)) {
                                    var157 = 6;
                                    var154 = var154.method463(class95.field2127.method445(false), -106);
                                } else if (var155.method454(class39.field711, (byte) -123)) {
                                    var154 = var154.method463(class39.field711.method445(false), -124);
                                    var157 = 7;
                                } else if (var155.method454(class85.field1892, (byte) -123)) {
                                    var157 = 8;
                                    var154 = var154.method463(class85.field1892.method445(false), -109);
                                } else if (var155.method454(class79.field1706, (byte) -123)) {
                                    var154 = var154.method463(class79.field1706.method445(false), -127);
                                    var157 = 9;
                                } else if (var155.method454(class116.field2610, (byte) -123)) {
                                    var154 = var154.method463(class116.field2610.method445(false), -110);
                                    var157 = 10;
                                } else if (var155.method454(class41.field779, (byte) -123)) {
                                    var154 = var154.method463(class41.field779.method445(false), -109);
                                    var157 = 11;
                                } else if (class23.field415 != 0) {
                                    if (var155.method454(class135.field3066, (byte) -123)) {
                                        var154 = var154.method463(class135.field3066.method445(false), -128);
                                        var157 = 0;
                                    } else if (var155.method454(class118.field2664, (byte) -123)) {
                                        var154 = var154.method463(class118.field2664.method445(false), -125);
                                        var157 = 1;
                                    } else if (var155.method454(class16.field292, (byte) -123)) {
                                        var154 = var154.method463(class16.field292.method445(false), -102);
                                        var157 = 2;
                                    } else if (var155.method454(class121.field2723, (byte) -123)) {
                                        var154 = var154.method463(class121.field2723.method445(false), -116);
                                        var157 = 3;
                                    } else if (var155.method454(class120.field2703, (byte) -123)) {
                                        var157 = 4;
                                        var154 = var154.method463(class120.field2703.method445(false), -116);
                                    } else if (var155.method454(class134.field3007, (byte) -123)) {
                                        var157 = 5;
                                        var154 = var154.method463(class134.field3007.method445(false), -117);
                                    } else if (var155.method454(class95.field2124, (byte) -123)) {
                                        var157 = 6;
                                        var154 = var154.method463(class95.field2124.method445(false), -92);
                                    } else if (var155.method454(class39.field710, (byte) -123)) {
                                        var154 = var154.method463(class39.field710.method445(false), -125);
                                        var157 = 7;
                                    } else if (var155.method454(class85.field1887, (byte) -123)) {
                                        var154 = var154.method463(class85.field1887.method445(false), -101);
                                        var157 = 8;
                                    } else if (var155.method454(class79.field1701, (byte) -123)) {
                                        var157 = 9;
                                        var154 = var154.method463(class79.field1701.method445(false), -128);
                                    } else if (var155.method454(class116.field2632, (byte) -123)) {
                                        var154 = var154.method463(class116.field2632.method445(false), -97);
                                        var157 = 10;
                                    } else if (var155.method454(class41.field768, (byte) -123)) {
                                        var154 = var154.method463(class41.field768.method445(false), -92);
                                        var157 = 11;
                                    }
                                }
                                class67 var158 = var154.method480(-91);
                                if (var158.method454(class55.field1064, (byte) -123)) {
                                    var156 = 1;
                                    var154 = var154.method463(class55.field1064.method445(false), -112);
                                } else if (var158.method454(class131.field2878, (byte) -123)) {
                                    var154 = var154.method463(class131.field2878.method445(false), -123);
                                    var156 = 2;
                                } else if (var158.method454(class60.field1193, (byte) -123)) {
                                    var154 = var154.method463(class60.field1193.method445(false), -110);
                                    var156 = 3;
                                } else if (var158.method454(class31.field561, (byte) -123)) {
                                    var154 = var154.method463(class31.field561.method445(false), -107);
                                    var156 = 4;
                                } else if (var158.method454(class138.field3130, (byte) -123)) {
                                    var154 = var154.method463(class138.field3130.method445(false), -127);
                                    var156 = 5;
                                } else if (class23.field415 != 0) {
                                    if (var158.method454(class55.field1078, (byte) -123)) {
                                        var154 = var154.method463(class55.field1078.method445(false), -110);
                                        var156 = 1;
                                    } else if (var158.method454(class131.field2886, (byte) -123)) {
                                        var156 = 2;
                                        var154 = var154.method463(class131.field2886.method445(false), -126);
                                    } else if (var158.method454(class60.field1197, (byte) -123)) {
                                        var156 = 3;
                                        var154 = var154.method463(class60.field1197.method445(false), -126);
                                    } else if (var158.method454(class31.field554, (byte) -123)) {
                                        var156 = 4;
                                        var154 = var154.method463(class31.field554.method445(false), -123);
                                    } else if (var158.method454(class138.field3115, (byte) -123)) {
                                        var156 = 5;
                                        var154 = var154.method463(class138.field3115.method445(false), -119);
                                    }
                                }
                                class69.field1399.method285(27, (byte) 64);
                                class69.field1399.method653(0, 64);
                                int var159 = class69.field1399.field2043;
                                class69.field1399.method653(var157, 118);
                                class69.field1399.method653(var156, 96);
                                class12.method91(class69.field1399, 88, var154);
                                class69.field1399.method617(23232, class69.field1399.field2043 - var159);
                            }
                            continue;
                        }
                        if (var272 == 5009) {
                            var8 -= 2;
                            class19.field357++;
                            class67 var160 = class84.field1864[var8];
                            class67 var161 = class84.field1864[var8 + 1];
                            class69.field1399.method285(224, (byte) 64);
                            class69.field1399.method653(0, 46);
                            int var162 = class69.field1399.field2043;
                            class69.field1399.method656(-5, var160.method476((byte) 77));
                            class12.method91(class69.field1399, 122, var161);
                            class69.field1399.method617(23232, class69.field1399.field2043 - var162);
                            continue;
                        }
                        if (var272 == 5010) {
                            var5--;
                            int var163 = class151.field3451[var5];
                            class67 var164 = null;
                            if (var163 < 100) {
                                var164 = class38.field684[var163];
                            }
                            if (var164 == null) {
                                var164 = class27.field495;
                            }
                            class84.field1864[var8++] = var164;
                            continue;
                        }
                        if (var272 == 5011) {
                            var5--;
                            int var165 = class151.field3451[var5];
                            class67 var166 = null;
                            if (var165 < 100) {
                                var166 = class144.field3320[var165];
                            }
                            if (var166 == null) {
                                var166 = class27.field495;
                            }
                            class84.field1864[var8++] = var166;
                            continue;
                        }
                        if (var272 == 5015) {
                            class67 var167;
                            if (class37.field667 == null || class37.field667.field1854 == null) {
                                var167 = class106.field2413;
                            } else {
                                var167 = class37.field667.field1854;
                            }
                            class84.field1864[var8++] = var167;
                            continue;
                        }
                        if (var272 == 5016) {
                            class151.field3451[var5++] = class158.field3627;
                            continue;
                        }
                        if (var272 == 5017) {
                            class151.field3451[var5++] = class68.field1373;
                            continue;
                        }
                    }
                } else {
                    class72 var245;
                    if (var272 >= 2000) {
                        var272 -= 1000;
                        var5--;
                        var245 = class67.method467((byte) -13, class151.field3451[var5]);
                    } else {
                        var245 = var42 ? class95.field2133 : class35.field635;
                    }
                    if (var272 == 1300) {
                        var5--;
                        int var246 = class151.field3451[var5] - 1;
                        if (var246 >= 0 && var246 <= 9) {
                            var8--;
                            var245.method525(var246, class84.field1864[var8], 0);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var272 == 1301) {
                        var5 -= 2;
                        int var247 = class151.field3451[var5];
                        int var248 = class151.field3451[var5 + 1];
                        var245.field1549 = class106.method836(var248, var247, 13);
                        continue;
                    }
                    if (var272 == 1302) {
                        var5--;
                        var245.field1469 = class151.field3451[var5] == 1;
                        continue;
                    }
                    if (var272 == 1303) {
                        var5--;
                        var245.field1543 = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 1304) {
                        var5--;
                        var245.field1548 = class151.field3451[var5];
                        continue;
                    }
                    if (var272 == 1305) {
                        var8--;
                        var245.field1534 = class84.field1864[var8];
                        continue;
                    }
                    if (var272 == 1306) {
                        var8--;
                        var245.field1569 = class84.field1864[var8];
                        continue;
                    }
                    if (var272 == 1307) {
                        var245.field1529 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var271) {
            if (var4.field2287 == null) {
                if (class41.field769 != 0) {
                    class88.method614(class81.field1796, class27.field495, 109, 0);
                }
                class112.method887(-32453, var271, "CS2 - scr:" + var4.field300 + " op:" + var10);
            } else {
                class67 var268 = class138.method1050(30, -54);
                var268.method446((byte) -125, class27.field501).method446((byte) 110, var4.field2287);
                for (int var269 = class23.field420 - 1; var269 >= 0; var269--) {
                    var268.method446((byte) 64, class142.field3264).method446((byte) 75, class144.field3293[var269].field3067.field2287);
                }
                if (var10 == 40) {
                    int var270 = var11[var7];
                    var268.method446((byte) 123, class95.field2137).method446((byte) 73, class60.method420(var270, 28498));
                }
                if (class41.field769 != 0) {
                    class88.method614(class49.method314(new class67[] { class65.field1266, var4.field2287 }, 0), class27.field495, 122, 0);
                }
                class112.method887(-32453, var271, "CS2 - scr:" + var4.field300 + " op:" + var10 + new String(var268.method447(23368)));
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
    public static final void method514(int arg0, int arg1, int arg2, int arg3) {
        field1431++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class148.field3401 = -1;
            class142.field3281 = -1;
            return;
        }
        int var4 = class114.method924(arg0, class128.field2817, arg2, -123) - arg3;
        int var5 = arg2 - class152.field3486;
        int var6 = arg0 - class101.field2274;
        int var7 = var4 - class3.field42;
        int var8 = class96.field2143[class46.field853];
        int var9 = class96.field2143[class83.field1828];
        int var10 = class96.field2148[class46.field853];
        int var11 = class96.field2148[class83.field1828];
        int var12 = var5 * var9 + var6 * var11 >> 16;
        int var13 = var5 * var11 - var6 * var9 >> 16;
        int var15 = var7 * var10 - var8 * var13 >> 16;
        int var16 = var7 * var8 + var10 * var13 >> 16;
        if (var16 < 50) {
            class148.field3401 = -1;
            class142.field3281 = -1;
        } else {
            class148.field3401 = (var12 << 9) / var16 + 256;
            class142.field3281 = (var15 << 9) / var16 + 167;
        }
        if (arg1 != 1820713769) {
            field1438 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1436 = null;
        field1437 = null;
        field1434 = null;
        int var1 = -88 % ((-arg0 - 51) / 59);
        field1438 = null;
        field1435 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z")
    public static final boolean method516(int arg0, byte arg1) {
        if (arg1 <= 16) {
            field1436 = null;
        }
        field1445++;
        return (arg0 >> 31 & 0x1) != 0;
    }
}
