import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class39 extends class121 {

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "[Lia;")
    public class56[] field966;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Loc;")
    public static class99 field959 = class48.method402((byte) -104, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field972 = 0;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "Z")
    public static boolean field973 = false;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Lod;")
    public static class101 field965 = new class101(5000);

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "Loc;")
    private static class99 field976 = class48.method402((byte) -104, "No response from server)3");

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "I")
    public static int field977 = 2;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Loc;")
    public static class99 field975 = field976;

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "Loc;")
    public static class99 field979 = class48.method402((byte) -104, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "Lsd;")
    public static class125 field978 = new class125();

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "[I")
    public static int[] field974;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lef;IIIBZI)V")
    public static final void method320(class35 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        field958++;
        long var7 = (long) ((arg1 << 16) + arg2);
        class61 var9 = (class61) class20.field488.method1001(var7, (byte) 98);
        if (var9 != null) {
            return;
        }
        class61 var10 = (class61) class7.field205.method1001(var7, (byte) -106);
        if (var10 != null) {
            return;
        }
        class61 var11 = (class61) class43.field1040.method1001(var7, (byte) 56);
        if (var11 == null) {
            if (!arg5) {
                class61 var12 = (class61) class91.field2214.method1001(var7, (byte) 56);
                if (var12 != null) {
                    return;
                }
            }
            if (arg6 != 1499) {
                method322(-2);
            }
            class61 var13 = new class61();
            var13.field1627 = arg0;
            var13.field1624 = arg3;
            var13.field1645 = arg4;
            if (arg5) {
                class20.field488.method1006(var7, var13, -113);
                class144.field3591++;
            } else {
                class48.field1171.method595(-76, var13);
                class43.field1040.method1006(var7, var13, -125);
                class84.field2115++;
            }
        } else if (arg5) {
            var11.method1010((byte) 45);
            class20.field488.method1006(var7, var11, -115);
            class84.field2115--;
            class144.field3591++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhe;BILhe;I[Ljava/lang/Object;I)V")
    public static final void method321(class54 arg0, byte arg1, int arg2, class54 arg3, int arg4, Object[] arg5, int arg6) {
        field969++;
        int var7 = (Integer) arg5[0];
        class63 var8 = class35.method310(var7, (byte) -69);
        if (var8 == null) {
            return;
        }
        if (arg1 != -54) {
            method322(-36);
        }
        int var9 = -1;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = var8.field1670;
        byte var13 = -1;
        int[] var14 = var8.field1656;
        try {
            class2.field42 = new class99[var8.field1674];
            int var15 = 0;
            class101.field2472 = new int[var8.field1672];
            int var16 = 0;
            for (int var17 = 1; var17 < arg5.length; var17++) {
                if (arg5[var17] instanceof Integer) {
                    int var18 = (Integer) arg5[var17];
                    if (var18 == -2147483647) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg2;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg0 == null ? -1 : arg0.field1293;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg4;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg0 == null ? -1 : arg0.field1390;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg3 == null ? -1 : arg3.field1293;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg3 == null ? -1 : arg3.field1390;
                    }
                    class101.field2472[var15++] = var18;
                } else if (arg5[var17] instanceof class99) {
                    class2.field42[var16++] = (class99) arg5[var17];
                }
            }
            int var19 = 0;
            label1251: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var186 = var12[var9];
                if (var186 < 100) {
                    if (var186 == 0) {
                        class30.field699[var10++] = var14[var9];
                        continue;
                    }
                    if (var186 == 1) {
                        int var20 = var14[var9];
                        class30.field699[var10++] = class94.field2283[var20];
                        continue;
                    }
                    if (var186 == 2) {
                        int var21 = var14[var9];
                        var10--;
                        class94.field2283[var21] = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 3) {
                        class30.field703[var11++] = var8.field1664[var9];
                        continue;
                    }
                    if (var186 == 6) {
                        var9 += var14[var9];
                        continue;
                    }
                    if (var186 == 7) {
                        var10 -= 2;
                        if (class30.field699[var10 + 1] != class30.field699[var10]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 8) {
                        var10 -= 2;
                        if (class30.field699[var10 + 1] == class30.field699[var10]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 9) {
                        var10 -= 2;
                        if (class30.field699[var10] < class30.field699[var10 + 1]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 10) {
                        var10 -= 2;
                        if (class30.field699[var10] > class30.field699[var10 + 1]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 21) {
                        if (class93.field2273 == 0) {
                            return;
                        }
                        class130 var22 = class101.field2467[--class93.field2273];
                        var8 = var22.field3197;
                        class101.field2472 = var22.field3186;
                        class2.field42 = var22.field3193;
                        var12 = var8.field1670;
                        var14 = var8.field1656;
                        var9 = var22.field3185;
                        continue;
                    }
                    if (var186 == 25) {
                        int var23 = var14[var9];
                        class30.field699[var10++] = class100.method856(30957, var23);
                        continue;
                    }
                    if (var186 == 27) {
                        int var24 = var14[var9];
                        var10--;
                        class52.method430(var24, -73, class30.field699[var10]);
                        continue;
                    }
                    if (var186 == 31) {
                        var10 -= 2;
                        if (class30.field699[var10] <= class30.field699[var10 + 1]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 32) {
                        var10 -= 2;
                        if (class30.field699[var10] >= class30.field699[var10 + 1]) {
                            var9 += var14[var9];
                        }
                        continue;
                    }
                    if (var186 == 33) {
                        class30.field699[var10++] = class101.field2472[var14[var9]];
                        continue;
                    }
                    int var10001;
                    if (var186 == 34) {
                        var10001 = var14[var9];
                        var10--;
                        class101.field2472[var10001] = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 35) {
                        class30.field703[var11++] = class2.field42[var14[var9]];
                        continue;
                    }
                    if (var186 == 36) {
                        var10001 = var14[var9];
                        var11--;
                        class2.field42[var10001] = class30.field703[var11];
                        continue;
                    }
                    if (var186 == 37) {
                        int var25 = var14[var9];
                        var11 -= var25;
                        class99 var26 = class1.method4(var25, false, var11, class30.field703);
                        class30.field703[var11++] = var26;
                        continue;
                    }
                    if (var186 == 38) {
                        var10--;
                        continue;
                    }
                    if (var186 == 39) {
                        var11--;
                        continue;
                    }
                    if (var186 == 40) {
                        int var27 = var14[var9];
                        class63 var28 = class35.method310(var27, (byte) -81);
                        int[] var29 = new int[var28.field1672];
                        class99[] var30 = new class99[var28.field1674];
                        for (int var31 = 0; var31 < var28.field1659; var31++) {
                            var29[var31] = class30.field699[var10 + var31 - var28.field1659];
                        }
                        for (int var32 = 0; var32 < var28.field1669; var32++) {
                            var30[var32] = class30.field703[var11 + var32 - var28.field1669];
                        }
                        var11 -= var28.field1669;
                        var10 -= var28.field1659;
                        class130 var33 = new class130();
                        var33.field3185 = var9;
                        var33.field3193 = class2.field42;
                        var33.field3197 = var8;
                        var33.field3186 = class101.field2472;
                        var8 = var28;
                        class101.field2467[class93.field2273++] = var33;
                        class101.field2472 = var29;
                        var14 = var28.field1656;
                        var9 = -1;
                        class2.field42 = var30;
                        var12 = var28.field1670;
                        continue;
                    }
                    if (var186 == 42) {
                        class30.field699[var10++] = class86.field2147[var14[var9]];
                        continue;
                    }
                    if (var186 == 43) {
                        var10001 = var14[var9];
                        var10--;
                        class86.field2147[var10001] = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 44) {
                        int var34 = var14[var9] >> 16;
                        var10--;
                        int var35 = class30.field699[var10];
                        int var36 = var14[var9] & 0xFFFF;
                        if (var35 >= 0 && var35 <= 5000) {
                            class122.field2980[var34] = var35;
                            byte var37 = -1;
                            if (var36 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var35 <= var38) {
                                    continue label1251;
                                }
                                class126.field3045[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var186 == 45) {
                        var10--;
                        int var39 = class30.field699[var10];
                        int var40 = var14[var9];
                        if (var39 >= 0 && class122.field2980[var40] > var39) {
                            class30.field699[var10++] = class126.field3045[var40][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var186 == 46) {
                        var10 -= 2;
                        int var41 = class30.field699[var10];
                        int var42 = var14[var9];
                        if (var41 >= 0 && class122.field2980[var42] > var41) {
                            class126.field3045[var42][var41] = class30.field699[var10 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var14[var9] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var186 < 1000) {
                    if (var186 == 100) {
                        var10 -= 3;
                        int var171 = class30.field699[var10 + 2];
                        int var172 = class30.field699[var10 + 1];
                        int var173 = class30.field699[var10];
                        if (var172 == 0) {
                            throw new RuntimeException();
                        }
                        class54 var174 = class63.method552(var173, (byte) 124);
                        if (var174.field1344 == null) {
                            var174.field1344 = new class54[var171 + 1];
                        }
                        if (var171 >= var174.field1344.length) {
                            class54[] var175 = new class54[var171 + 1];
                            for (int var176 = 0; var176 < var174.field1344.length; var176++) {
                                var175[var176] = var174.field1344[var176];
                            }
                            var174.field1344 = var175;
                        }
                        if (var171 > 0 && var174.field1344[var171 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var171 - 1));
                        }
                        class54 var177 = new class54();
                        var177.field1341 = var172;
                        var177.field1292 = var177.field1293 = var174.field1293;
                        var177.field1390 = var171;
                        var177.field1374 = true;
                        var174.field1344[var171] = var177;
                        if (var43) {
                            class82.field2036 = var177;
                        } else {
                            class37.field940 = var177;
                        }
                        class99.method843(var174, false);
                        continue;
                    }
                    if (var186 == 101) {
                        class54 var178 = var43 ? class82.field2036 : class37.field940;
                        class54 var179 = class63.method552(var178.field1293, (byte) 126);
                        var179.field1344[var178.field1390] = null;
                        class99.method843(var179, false);
                        continue;
                    }
                    if (var186 == 102) {
                        var10--;
                        class54 var180 = class63.method552(class30.field699[var10], (byte) 125);
                        var180.field1344 = null;
                        class99.method843(var180, false);
                        continue;
                    }
                    if (var186 == 200) {
                        var10 -= 2;
                        int var181 = class30.field699[var10 + 1];
                        int var182 = class30.field699[var10];
                        class54 var183 = class108.method927(var182, var181, 16777215);
                        if (var183 != null && var181 != -1) {
                            class30.field699[var10++] = 1;
                            if (var43) {
                                class82.field2036 = var183;
                            } else {
                                class37.field940 = var183;
                            }
                            continue;
                        }
                        class30.field699[var10++] = 0;
                        continue;
                    }
                } else if (var186 >= 1000 && var186 < 1100 || var186 >= 2000 && var186 < 2100) {
                    class54 var170;
                    if (var186 >= 2000) {
                        var10--;
                        var170 = class63.method552(class30.field699[var10], (byte) 127);
                        var186 -= 1000;
                    } else {
                        var170 = var43 ? class82.field2036 : class37.field940;
                    }
                    class99.method843(var170, false);
                    if (var186 == 1000) {
                        var10 -= 2;
                        var170.field1324 = class30.field699[var10];
                        var170.field1356 = class30.field699[var10 + 1];
                        continue;
                    }
                    if (var186 == 1001) {
                        var10 -= 2;
                        var170.field1383 = class30.field699[var10];
                        var170.field1403 = class30.field699[var10 + 1];
                        continue;
                    }
                    if (var186 == 1003) {
                        var10--;
                        var170.field1311 = class30.field699[var10] == 1;
                        continue;
                    }
                } else if (var186 >= 1100 && var186 < 1200 || !(var186 < 2100 || var186 >= 2200)) {
                    class54 var44;
                    if (var186 < 2000) {
                        var44 = var43 ? class82.field2036 : class37.field940;
                    } else {
                        var186 -= 1000;
                        var10--;
                        var44 = class63.method552(class30.field699[var10], (byte) 127);
                    }
                    class99.method843(var44, false);
                    if (var186 == 1100) {
                        var10 -= 2;
                        var44.field1296 = class30.field699[var10];
                        if (var44.field1296 > var44.field1375 - var44.field1383) {
                            var44.field1296 = var44.field1375 - var44.field1383;
                        }
                        if (var44.field1296 < 0) {
                            var44.field1296 = 0;
                        }
                        var44.field1378 = class30.field699[var10 + 1];
                        if (var44.field1300 - var44.field1403 < var44.field1378) {
                            var44.field1378 = var44.field1300 - var44.field1403;
                        }
                        if (var44.field1378 < 0) {
                            var44.field1378 = 0;
                        }
                        continue;
                    }
                    if (var186 == 1101) {
                        var10--;
                        var44.field1317 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1102) {
                        var10--;
                        var44.field1338 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1103) {
                        var10--;
                        var44.field1330 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1104) {
                        var10--;
                        var44.field1277 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1105) {
                        var10--;
                        var44.field1281 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1106) {
                        var10--;
                        var44.field1359 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1107) {
                        var10--;
                        var44.field1314 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1108) {
                        var44.field1395 = 1;
                        var10--;
                        var44.field1290 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1109) {
                        var10 -= 6;
                        var44.field1357 = class30.field699[var10];
                        var44.field1399 = class30.field699[var10 + 1];
                        var44.field1398 = class30.field699[var10 + 2];
                        var44.field1288 = class30.field699[var10 + 3];
                        var44.field1381 = class30.field699[var10 + 4];
                        var44.field1396 = class30.field699[var10 + 5];
                        continue;
                    }
                    if (var186 == 1110) {
                        var10--;
                        var44.field1321 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1111) {
                        var10--;
                        var44.field1284 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1112) {
                        var11--;
                        var44.field1372 = class30.field703[var11];
                        continue;
                    }
                    if (var186 == 1113) {
                        var10--;
                        var44.field1279 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1114) {
                        var10 -= 3;
                        var44.field1348 = class30.field699[var10];
                        var44.field1386 = class30.field699[var10 + 1];
                        var44.field1289 = class30.field699[var10 + 2];
                        continue;
                    }
                    if (var186 == 1115) {
                        var10--;
                        var44.field1308 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1116) {
                        var10--;
                        var44.field1351 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1117) {
                        var10--;
                        var44.field1397 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1118) {
                        var10--;
                        var44.field1384 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1119) {
                        var10--;
                        var44.field1405 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1120) {
                        var10 -= 2;
                        var44.field1375 = class30.field699[var10];
                        var44.field1300 = class30.field699[var10 + 1];
                        continue;
                    }
                } else if (var186 >= 1200 && var186 < 1300 || !(var186 < 2200 || var186 >= 2300)) {
                    class54 var45;
                    if (var186 >= 2000) {
                        var10--;
                        var45 = class63.method552(class30.field699[var10], (byte) 127);
                        var186 -= 1000;
                    } else {
                        var45 = var43 ? class82.field2036 : class37.field940;
                    }
                    class99.method843(var45, false);
                    if (var186 == 1200) {
                        var10 -= 2;
                        int var46 = class30.field699[var10];
                        int var47 = class30.field699[var10 + 1];
                        var45.field1391 = var47;
                        var45.field1392 = var46;
                        class143 var48 = class1.method2((byte) 115, var46);
                        var45.field1288 = var48.field3528;
                        var45.field1398 = var48.field3576;
                        var45.field1399 = var48.field3526;
                        var45.field1396 = var48.field3532;
                        var45.field1357 = var48.field3564;
                        if (var45.field1383 > 0) {
                            var45.field1396 = var45.field1396 * 32 / var45.field1383;
                        }
                        var45.field1381 = var48.field3565;
                        continue;
                    }
                    if (var186 == 1201) {
                        var45.field1395 = 2;
                        var10--;
                        var45.field1290 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1202) {
                        var45.field1395 = 3;
                        var45.field1290 = class69.field1770.field3020.method1076(127);
                        continue;
                    }
                } else if (var186 >= 1300 && var186 < 1400 || var186 >= 2300 && var186 < 2400) {
                    class54 var49;
                    if (var186 >= 2000) {
                        var186 -= 1000;
                        var10--;
                        var49 = class63.method552(class30.field699[var10], (byte) 126);
                    } else {
                        var49 = var43 ? class82.field2036 : class37.field940;
                    }
                    if (var186 == 1300) {
                        var10--;
                        int var50 = class30.field699[var10] - 1;
                        if (var50 >= 0 && var50 <= 9) {
                            var11--;
                            var49.method448(var50, (byte) -60, class30.field703[var11]);
                            continue;
                        }
                        var11--;
                        continue;
                    }
                    if (var186 == 1301) {
                        var10 -= 2;
                        int var51 = class30.field699[var10 + 1];
                        int var52 = class30.field699[var10];
                        var49.field1363 = class108.method927(var52, var51, 16777215);
                        continue;
                    }
                    if (var186 == 1302) {
                        var10--;
                        var49.field1387 = class30.field699[var10] == 1;
                        continue;
                    }
                    if (var186 == 1303) {
                        var10--;
                        var49.field1400 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1304) {
                        var10--;
                        var49.field1355 = class30.field699[var10];
                        continue;
                    }
                    if (var186 == 1305) {
                        var11--;
                        var49.field1325 = class30.field703[var11];
                        continue;
                    }
                    if (var186 == 1306) {
                        var11--;
                        var49.field1278 = class30.field703[var11];
                        continue;
                    }
                } else {
                    if (var186 >= 1400 && var186 < 1500 || var186 >= 2400 && var186 < 2500) {
                        class54 var53;
                        if (var186 < 2000) {
                            var53 = var43 ? class82.field2036 : class37.field940;
                        } else {
                            var10--;
                            var53 = class63.method552(class30.field699[var10], (byte) 127);
                            var186 -= 1000;
                        }
                        var11--;
                        class99 var54 = class30.field703[var11];
                        Object[] var55 = new Object[var54.method810(-58) + 1];
                        for (int var56 = var55.length - 1; var56 >= 1; var56--) {
                            if (var54.method825(var56 - 1, (byte) -118) == 115) {
                                var11--;
                                var55[var56] = class30.field703[var11];
                            } else {
                                var10--;
                                var55[var56] = Integer.valueOf(class30.field699[var10]);
                            }
                        }
                        var10--;
                        int var57 = class30.field699[var10];
                        if (var57 == -1) {
                            var55 = null;
                        } else {
                            var55[0] = Integer.valueOf(var57);
                        }
                        if (var186 == 1415) {
                            var53.field1358 = var55;
                        }
                        if (var186 == 1409) {
                            var53.field1346 = var55;
                        }
                        if (var186 == 1406) {
                            var53.field1340 = var55;
                        }
                        if (var186 == 1408) {
                            var53.field1353 = var55;
                        }
                        if (var186 == 1407) {
                            var53.field1369 = var55;
                        }
                        if (var186 == 1403) {
                            var53.field1322 = var55;
                        }
                        if (var186 == 1400) {
                            var53.field1406 = var55;
                        }
                        if (var186 == 1412) {
                            var53.field1328 = var55;
                        }
                        var53.field1315 = true;
                        if (var186 == 1416) {
                            var53.field1373 = var55;
                        }
                        if (var186 == 1413) {
                            var53.field1303 = var55;
                        }
                        if (var186 == 1417) {
                            var53.field1283 = var55;
                        }
                        if (var186 == 1401) {
                            var53.field1388 = var55;
                        }
                        if (var186 == 1404) {
                            var53.field1320 = var55;
                        }
                        if (var186 == 1414) {
                            var53.field1298 = var55;
                        }
                        if (var186 == 1405) {
                            var53.field1326 = var55;
                        }
                        if (var186 == 1411) {
                            var53.field1347 = var55;
                        }
                        if (var186 == 1410) {
                            var53.field1354 = var55;
                        }
                        if (var186 == 1402) {
                            var53.field1310 = var55;
                        }
                        continue;
                    }
                    if (var186 < 1600) {
                        class54 var58 = var43 ? class82.field2036 : class37.field940;
                        if (var186 == 1500) {
                            class30.field699[var10++] = var58.field1324;
                            continue;
                        }
                        if (var186 == 1501) {
                            class30.field699[var10++] = var58.field1356;
                            continue;
                        }
                        if (var186 == 1502) {
                            class30.field699[var10++] = var58.field1383;
                            continue;
                        }
                        if (var186 == 1503) {
                            class30.field699[var10++] = var58.field1403;
                            continue;
                        }
                        if (var186 == 1504) {
                            class30.field699[var10++] = var58.field1311 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 1505) {
                            class30.field699[var10++] = var58.field1292;
                            continue;
                        }
                    } else if (var186 < 1700) {
                        class54 var59 = var43 ? class82.field2036 : class37.field940;
                        if (var186 == 1600) {
                            class30.field699[var10++] = var59.field1296;
                            continue;
                        }
                        if (var186 == 1601) {
                            class30.field699[var10++] = var59.field1378;
                            continue;
                        }
                        if (var186 == 1602) {
                            class30.field703[var11++] = var59.field1372;
                            continue;
                        }
                        if (var186 == 1603) {
                            class30.field699[var10++] = var59.field1375;
                            continue;
                        }
                        if (var186 == 1604) {
                            class30.field699[var10++] = var59.field1300;
                            continue;
                        }
                        if (var186 == 1605) {
                            class30.field699[var10++] = var59.field1396;
                            continue;
                        }
                    } else if (var186 < 1800) {
                        class54 var169 = var43 ? class82.field2036 : class37.field940;
                        if (var186 == 1700) {
                            class30.field699[var10++] = var169.field1392;
                            continue;
                        }
                        if (var186 == 1701) {
                            if (var169.field1392 == -1) {
                                class30.field699[var10++] = 0;
                            } else {
                                class30.field699[var10++] = var169.field1391;
                            }
                            continue;
                        }
                        if (var186 == 1702) {
                            class30.field699[var10++] = var169.field1390;
                            continue;
                        }
                    } else if (var186 < 1900) {
                        class54 var168 = var43 ? class82.field2036 : class37.field940;
                        if (var186 == 1800) {
                            class30.field699[var10++] = class11.method121(class20.method188(var168, -604452832), arg1 + 4782);
                            continue;
                        }
                    } else if (var186 < 2600) {
                        var10--;
                        class54 var60 = class63.method552(class30.field699[var10], (byte) 127);
                        if (var186 == 2500) {
                            class30.field699[var10++] = var60.field1324;
                            continue;
                        }
                        if (var186 == 2501) {
                            class30.field699[var10++] = var60.field1356;
                            continue;
                        }
                        if (var186 == 2502) {
                            class30.field699[var10++] = var60.field1383;
                            continue;
                        }
                        if (var186 == 2503) {
                            class30.field699[var10++] = var60.field1403;
                            continue;
                        }
                        if (var186 == 2504) {
                            class30.field699[var10++] = var60.field1311 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 2505) {
                            class30.field699[var10++] = var60.field1292;
                            continue;
                        }
                    } else if (var186 < 2700) {
                        var10--;
                        class54 var167 = class63.method552(class30.field699[var10], (byte) 124);
                        if (var186 == 2600) {
                            class30.field699[var10++] = var167.field1296;
                            continue;
                        }
                        if (var186 == 2601) {
                            class30.field699[var10++] = var167.field1378;
                            continue;
                        }
                        if (var186 == 2602) {
                            class30.field703[var11++] = var167.field1372;
                            continue;
                        }
                        if (var186 == 2603) {
                            class30.field699[var10++] = var167.field1375;
                            continue;
                        }
                        if (var186 == 2604) {
                            class30.field699[var10++] = var167.field1300;
                            continue;
                        }
                        if (var186 == 2605) {
                            class30.field699[var10++] = var167.field1396;
                            continue;
                        }
                    } else if (var186 < 2800) {
                        var10--;
                        class54 var166 = class63.method552(class30.field699[var10], (byte) 124);
                        if (var186 == 2700) {
                            class30.field699[var10++] = var166.field1392;
                            continue;
                        }
                        if (var186 == 2701) {
                            if (var166.field1392 == -1) {
                                class30.field699[var10++] = 0;
                            } else {
                                class30.field699[var10++] = var166.field1391;
                            }
                            continue;
                        }
                    } else if (var186 < 2900) {
                        var10--;
                        class54 var165 = class63.method552(class30.field699[var10], (byte) 124);
                        if (var186 == 2800) {
                            class30.field699[var10++] = class11.method121(class20.method188(var165, -604452832), 4728);
                            continue;
                        }
                    } else if (var186 < 3200) {
                        if (var186 == 3100) {
                            var11--;
                            class99 var61 = class30.field703[var11];
                            class48.method400(0, var61, -77, class119.field2918);
                            continue;
                        }
                        if (var186 == 3101) {
                            var10 -= 2;
                            class27.method254(class69.field1770, class30.field699[var10], -30014, class30.field699[var10 + 1]);
                            continue;
                        }
                        if (var186 == 3102) {
                            var10--;
                            int var62 = class30.field699[var10];
                            if (var62 >= 0 && var62 < class134.field3301.length && class134.field3301[var62] != -1) {
                                class52.field1243 = true;
                                class130.field3190 = true;
                                class57.field1473 = var62;
                            }
                            continue;
                        }
                        if (var186 == 3103) {
                            class132.method1069(-126);
                            continue;
                        }
                    } else if (var186 < 3300) {
                        if (var186 == 3200) {
                            var10 -= 3;
                            class138.method1148(class30.field699[var10], class30.field699[var10 + 2], (byte) -22, class30.field699[var10 + 1]);
                            continue;
                        }
                        if (var186 == 3201) {
                            var10--;
                            class55.method460((byte) -108, class30.field699[var10]);
                            continue;
                        }
                        if (var186 == 3202) {
                            var10 -= 2;
                            class4.method22(class30.field699[var10 + 1], arg1 + 17828, class30.field699[var10]);
                            continue;
                        }
                    } else if (var186 < 3400) {
                        if (var186 == 3300) {
                            class30.field699[var10++] = class101.field2444;
                            continue;
                        }
                        if (var186 == 3301) {
                            var10 -= 2;
                            int var143 = class30.field699[var10];
                            int var144 = class30.field699[var10 + 1];
                            class30.field699[var10++] = class134.method1088((byte) -126, var144, var143);
                            continue;
                        }
                        if (var186 == 3302) {
                            var10 -= 2;
                            int var145 = class30.field699[var10 + 1];
                            int var146 = class30.field699[var10];
                            class30.field699[var10++] = class108.method923(var146, 0, var145);
                            continue;
                        }
                        if (var186 == 3303) {
                            var10 -= 2;
                            int var147 = class30.field699[var10 + 1];
                            int var148 = class30.field699[var10];
                            class30.field699[var10++] = class32.method275(var147, (byte) -38, var148);
                            continue;
                        }
                        if (var186 == 3304) {
                            var10--;
                            int var149 = class30.field699[var10];
                            class30.field699[var10++] = class21.method193(26995, var149).field3440;
                            continue;
                        }
                        if (var186 == 3305) {
                            var10--;
                            int var150 = class30.field699[var10];
                            class30.field699[var10++] = class130.field3196[var150];
                            continue;
                        }
                        if (var186 == 3306) {
                            var10--;
                            int var151 = class30.field699[var10];
                            class30.field699[var10++] = class73.field1855[var151];
                            continue;
                        }
                        if (var186 == 3307) {
                            var10--;
                            int var152 = class30.field699[var10];
                            class30.field699[var10++] = class99.field2369[var152];
                            continue;
                        }
                        if (var186 == 3308) {
                            int var153 = class84.field2116;
                            int var154 = (class69.field1770.field3115 >> 7) + class67.field1712;
                            int var155 = (class69.field1770.field3077 >> 7) + class5.field120;
                            class30.field699[var10++] = (var153 << 28) + (var154 << 14) + var155;
                            continue;
                        }
                        if (var186 == 3309) {
                            var10--;
                            int var156 = class30.field699[var10];
                            class30.field699[var10++] = class17.method171(268431470, var156) >> 14;
                            continue;
                        }
                        if (var186 == 3310) {
                            var10--;
                            int var157 = class30.field699[var10];
                            class30.field699[var10++] = var157 >> 28;
                            continue;
                        }
                        if (var186 == 3311) {
                            var10--;
                            int var158 = class30.field699[var10];
                            class30.field699[var10++] = class17.method171(var158, 16383);
                            continue;
                        }
                        if (var186 == 3312) {
                            class30.field699[var10++] = class143.field3554 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 3313) {
                            var10 -= 2;
                            int var159 = class30.field699[var10] + 32768;
                            int var160 = class30.field699[var10 + 1];
                            class30.field699[var10++] = class134.method1088((byte) -123, var160, var159);
                            continue;
                        }
                        if (var186 == 3314) {
                            var10 -= 2;
                            int var161 = class30.field699[var10 + 1];
                            int var162 = class30.field699[var10] + 32768;
                            class30.field699[var10++] = class108.method923(var162, class69.method609(arg1, -54), var161);
                            continue;
                        }
                        if (var186 == 3315) {
                            var10 -= 2;
                            int var163 = class30.field699[var10 + 1];
                            int var164 = class30.field699[var10] + 32768;
                            class30.field699[var10++] = class32.method275(var163, (byte) 115, var164);
                            continue;
                        }
                    } else if (var186 < 3700) {
                        if (var186 == 3600) {
                            if (class74.field1889 == 0) {
                                class30.field699[var10++] = -2;
                            } else if (class74.field1889 == 1) {
                                class30.field699[var10++] = -1;
                            } else {
                                class30.field699[var10++] = class9.field230;
                            }
                            continue;
                        }
                        if (var186 == 3601) {
                            var10--;
                            int var63 = class30.field699[var10];
                            if (class74.field1889 == 2 && class9.field230 > var63) {
                                class30.field703[var11++] = class17.field463[var63];
                                continue;
                            }
                            class30.field703[var11++] = class119.field2918;
                            continue;
                        }
                        if (var186 == 3602) {
                            var10--;
                            int var64 = class30.field699[var10];
                            if (class74.field1889 == 2 && var64 < class9.field230) {
                                class30.field699[var10++] = class59.field1589[var64];
                                continue;
                            }
                            class30.field699[var10++] = 0;
                            continue;
                        }
                        if (var186 == 3603) {
                            var10--;
                            int var65 = class30.field699[var10];
                            if (class74.field1889 == 2 && var65 < class9.field230) {
                                class30.field699[var10++] = class137.field3431[var65];
                                continue;
                            }
                            class30.field699[var10++] = 0;
                            continue;
                        }
                        if (var186 == 3604) {
                            var11--;
                            class99 var66 = class30.field703[var11];
                            var10--;
                            int var67 = class30.field699[var10];
                            class48.method405(223, var67, var66);
                            continue;
                        }
                    } else if (var186 < 4100) {
                        if (var186 == 4000) {
                            var10 -= 2;
                            int var68 = class30.field699[var10];
                            int var69 = class30.field699[var10 + 1];
                            class30.field699[var10++] = var68 + var69;
                            continue;
                        }
                        if (var186 == 4001) {
                            var10 -= 2;
                            int var70 = class30.field699[var10];
                            int var71 = class30.field699[var10 + 1];
                            class30.field699[var10++] = var70 - var71;
                            continue;
                        }
                        if (var186 == 4002) {
                            var10 -= 2;
                            int var72 = class30.field699[var10];
                            int var73 = class30.field699[var10 + 1];
                            class30.field699[var10++] = var72 * var73;
                            continue;
                        }
                        if (var186 == 4003) {
                            var10 -= 2;
                            int var74 = class30.field699[var10 + 1];
                            int var75 = class30.field699[var10];
                            class30.field699[var10++] = var75 / var74;
                            continue;
                        }
                        if (var186 == 4004) {
                            var10--;
                            int var76 = class30.field699[var10];
                            class30.field699[var10++] = (int) (Math.random() * (double) var76);
                            continue;
                        }
                        if (var186 == 4005) {
                            var10--;
                            int var77 = class30.field699[var10];
                            class30.field699[var10++] = (int) ((double) (var77 + 1) * Math.random());
                            continue;
                        }
                        if (var186 == 4006) {
                            var10 -= 5;
                            int var78 = class30.field699[var10];
                            int var79 = class30.field699[var10 + 1];
                            int var80 = class30.field699[var10 + 2];
                            int var81 = class30.field699[var10 + 3];
                            int var82 = class30.field699[var10 + 4];
                            class30.field699[var10++] = (var79 - var78) * (-var80 + var82) / (var81 - var80) + var78;
                            continue;
                        }
                        if (var186 == 4007) {
                            var10 -= 2;
                            int var83 = class30.field699[var10];
                            int var84 = class30.field699[var10 + 1];
                            class30.field699[var10++] = var83 + var83 * var84 / 100;
                            continue;
                        }
                        if (var186 == 4008) {
                            var10 -= 2;
                            int var85 = class30.field699[var10];
                            int var86 = class30.field699[var10 + 1];
                            class30.field699[var10++] = class88.method744(0x1 << var86, var85);
                            continue;
                        }
                        if (var186 == 4009) {
                            var10 -= 2;
                            int var87 = class30.field699[var10 + 1];
                            int var88 = class30.field699[var10];
                            class30.field699[var10++] = class17.method171(var88, -(0x1 << var87) - 1);
                            continue;
                        }
                        if (var186 == 4010) {
                            var10 -= 2;
                            int var89 = class30.field699[var10];
                            int var90 = class30.field699[var10 + 1];
                            class30.field699[var10++] = class17.method171(0x1 << var90, var89) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var186 == 4011) {
                            var10 -= 2;
                            int var91 = class30.field699[var10];
                            int var92 = class30.field699[var10 + 1];
                            class30.field699[var10++] = var91 % var92;
                            continue;
                        }
                        if (var186 == 4012) {
                            var10 -= 2;
                            int var93 = class30.field699[var10];
                            int var94 = class30.field699[var10 + 1];
                            if (var93 == 0) {
                                class30.field699[var10++] = 0;
                            } else {
                                class30.field699[var10++] = (int) Math.pow((double) var93, (double) var94);
                            }
                            continue;
                        }
                        if (var186 == 4013) {
                            var10 -= 2;
                            int var95 = class30.field699[var10];
                            int var96 = class30.field699[var10 + 1];
                            if (var95 == 0) {
                                class30.field699[var10++] = 0;
                            } else if (var96 == 0) {
                                class30.field699[var10++] = Integer.MAX_VALUE;
                            } else {
                                class30.field699[var10++] = (int) Math.pow((double) var95, 1.0D / (double) var96);
                            }
                            continue;
                        }
                        if (var186 == 4014) {
                            var10 -= 2;
                            int var97 = class30.field699[var10];
                            int var98 = class30.field699[var10 + 1];
                            class30.field699[var10++] = class17.method171(var98, var97);
                            continue;
                        }
                        if (var186 == 4015) {
                            var10 -= 2;
                            int var99 = class30.field699[var10 + 1];
                            int var100 = class30.field699[var10];
                            class30.field699[var10++] = class88.method744(var100, var99);
                            continue;
                        }
                    } else if (var186 < 4200) {
                        if (var186 == 4100) {
                            var11--;
                            class99 var101 = class30.field703[var11];
                            var10--;
                            int var102 = class30.field699[var10];
                            class30.field703[var11++] = class20.method189(new class99[] { var101, class5.method31(var102, 10) }, 84);
                            continue;
                        }
                        if (var186 == 4101) {
                            var11 -= 2;
                            class99 var103 = class30.field703[var11 + 1];
                            class99 var104 = class30.field703[var11];
                            class30.field703[var11++] = class20.method189(new class99[] { var104, var103 }, 8);
                            continue;
                        }
                        if (var186 == 4102) {
                            var11--;
                            class99 var105 = class30.field703[var11];
                            var10--;
                            int var106 = class30.field699[var10];
                            class30.field703[var11++] = class20.method189(new class99[] { var105, class60.method538(true, true, var106) }, 26);
                            continue;
                        }
                        if (var186 == 4103) {
                            var11--;
                            class99 var107 = class30.field703[var11];
                            class30.field703[var11++] = var107.method823(0);
                            continue;
                        }
                        if (var186 == 4104) {
                            var10--;
                            int var108 = class30.field699[var10];
                            long var109 = ((long) var108 + 11745L) * 86400000L;
                            class132.field3222.setTime(new Date(var109));
                            int var111 = class132.field3222.get(5);
                            int var112 = class132.field3222.get(2);
                            int var113 = class132.field3222.get(1);
                            class30.field703[var11++] = class20.method189(new class99[] { class5.method31(var111, arg1 + 64), class84.field2086, class45.field1068[var112], class84.field2086, class5.method31(var113, 10) }, 126);
                            continue;
                        }
                        if (var186 == 4105) {
                            var11 -= 2;
                            class99 var114 = class30.field703[var11 + 1];
                            class99 var115 = class30.field703[var11];
                            if (class69.field1770.field3020 != null && class69.field1770.field3020.field3235) {
                                class30.field703[var11++] = var114;
                                continue;
                            }
                            class30.field703[var11++] = var115;
                            continue;
                        }
                        if (var186 == 4106) {
                            var10--;
                            int var116 = class30.field699[var10];
                            class30.field703[var11++] = class5.method31(var116, 10);
                            continue;
                        }
                        if (var186 == 4107) {
                            var11 -= 2;
                            class30.field699[var10++] = class30.field703[var11].method824(class30.field703[var11 + 1], (byte) -70);
                            continue;
                        }
                        if (var186 == 4108) {
                            var10 -= 2;
                            var11--;
                            class99 var117 = class30.field703[var11];
                            int var118 = class30.field699[var10 + 1];
                            int var119 = class30.field699[var10];
                            byte[] var120 = class93.field2276.method903(var118, (byte) -128, 0);
                            class115 var121 = new class115(var120);
                            class30.field699[var10++] = var121.method971(var117, var119);
                            continue;
                        }
                        if (var186 == 4109) {
                            var10 -= 2;
                            var11--;
                            class99 var122 = class30.field703[var11];
                            int var123 = class30.field699[var10];
                            int var124 = class30.field699[var10 + 1];
                            byte[] var125 = class93.field2276.method903(var124, (byte) -128, 0);
                            class115 var126 = new class115(var125);
                            class30.field699[var10++] = var126.method976(var122, var123);
                            continue;
                        }
                        if (var186 == 4110) {
                            var11 -= 2;
                            class99 var127 = class30.field703[var11];
                            class99 var128 = class30.field703[var11 + 1];
                            var10--;
                            if (class30.field699[var10] == 1) {
                                class30.field703[var11++] = var127;
                            } else {
                                class30.field703[var11++] = var128;
                            }
                            continue;
                        }
                    } else if (var186 < 4300) {
                        if (var186 == 4200) {
                            var10--;
                            int var129 = class30.field699[var10];
                            class30.field703[var11++] = class1.method2((byte) 118, var129).field3551;
                            continue;
                        }
                        if (var186 == 4201) {
                            var10 -= 2;
                            int var130 = class30.field699[var10 + 1];
                            int var131 = class30.field699[var10];
                            class143 var132 = class1.method2((byte) 116, var131);
                            if (var130 >= 1 && var130 <= 5 && var132.field3571[var130 - 1] != null) {
                                class30.field703[var11++] = var132.field3571[var130 - 1];
                                continue;
                            }
                            class30.field703[var11++] = class119.field2918;
                            continue;
                        }
                        if (var186 == 4202) {
                            var10 -= 2;
                            int var133 = class30.field699[var10 + 1];
                            int var134 = class30.field699[var10];
                            class143 var135 = class1.method2((byte) -93, var134);
                            if (var133 >= 1 && var133 <= 5 && var135.field3527[var133 - 1] != null) {
                                class30.field703[var11++] = var135.field3527[var133 - 1];
                                continue;
                            }
                            class30.field703[var11++] = class119.field2918;
                            continue;
                        }
                        if (var186 == 4203) {
                            var10--;
                            int var136 = class30.field699[var10];
                            class30.field699[var10++] = class1.method2((byte) -81, var136).field3534;
                            continue;
                        }
                        if (var186 == 4204) {
                            var10--;
                            int var137 = class30.field699[var10];
                            class30.field699[var10++] = class1.method2((byte) 117, var137).field3568 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 4205) {
                            var10--;
                            int var138 = class30.field699[var10];
                            class143 var139 = class1.method2((byte) 119, var138);
                            if (var139.field3548 == -1 && var139.field3533 >= 0) {
                                class30.field699[var10++] = var139.field3533;
                                continue;
                            }
                            class30.field699[var10++] = var138;
                            continue;
                        }
                        if (var186 == 4206) {
                            var10--;
                            int var140 = class30.field699[var10];
                            class143 var141 = class1.method2((byte) 12, var140);
                            if (var141.field3548 >= 0 && var141.field3533 >= 0) {
                                class30.field699[var10++] = var141.field3533;
                                continue;
                            }
                            class30.field699[var10++] = var140;
                            continue;
                        }
                        if (var186 == 4207) {
                            var10--;
                            int var142 = class30.field699[var10];
                            class30.field699[var10++] = class1.method2((byte) 126, var142).field3544 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class72.method659(null, (byte) 119, "CS2 - nosuchop:" + var186);
                return;
            }
        } catch (Exception var185) {
            class72.method659(var185, (byte) 109, "CS2 - scr:" + var8.field1138 + " op:" + var13);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static final void method322(int arg0) {
        class91.field2226 = true;
        class89.field2207 = true;
        class91.field2243.field3476 = 0;
        class48.field1176 = 0L;
        field962++;
        class132.field3215 = 0;
        class140.method1157(1);
        class37.field936 = 0;
        class134.field3276.field1477 = 0;
        field960 = -1;
        class15.field366 = 0;
        class18.field470 = 0;
        class145.field3610 = 0;
        class57.field1465 = 0;
        class94.field2277 = 0;
        class3.field48 = 0;
        class34.field824 = 0;
        class134.field3272 = 0;
        class150.field3719 = 0;
        class109.field2686 = 0;
        class83.field2071 = 0;
        class72.field1817 = 0;
        class23.field550 = 0;
        class4.field77 = 0;
        class57.field1445 = 0;
        class9.field228 = 0;
        class125.field2995 = 0;
        class49.field1190 = 0;
        class82.field2039 = 0;
        class148.field3674 = 0;
        class60.field1599 = 0;
        class99.field2395 = 0;
        class108.field2632 = 0;
        class21.field507 = 0;
        class68.field1746 = 0;
        class68.field1761 = 0;
        client.field518 = 0;
        class36.field913 = 0;
        class142.field3517 = 0;
        class128.field3134 = 0;
        class140.field3470 = 0;
        class57.field1475 = 0;
        class112.field2805 = 0;
        class144.field3593 = 0;
        class88.field2191 = 0;
        class105.field2592 = 0;
        class99.field2413 = 0;
        class35.field887 = 0;
        class135.field3329 = 0;
        class136.field3397 = 0;
        class25.field584 = 0;
        class99.field2380 = 0;
        class143.field3549 = 0;
        class69.field1764 = 0;
        class36.field925 = 0;
        class105.field2603 = 0;
        class99.field2406 = 0;
        class37.field931 = 0;
        class25.field572 = 0;
        class46.field1127 = 0;
        class20.field496 = 0;
        class114.field2844 = 0;
        class130.field3194 = 0;
        class145.field3624 = 0;
        class35.field904 = 0;
        class149.field3690 = 0;
        class57.field1494 = 0;
        class54.field1379 = 0;
        class101.field2458 = 0;
        class79.field1940 = 0;
        class49.field1195 = 0;
        class9.field237 = 0;
        class57.field1508 = 0;
        class2.field37 = 0;
        class48.field1161 = 0;
        class91.field2228 = 0;
        class34.field826 = 0;
        class34.field815 = 0;
        class126.field3015 = 0;
        class135.field3352 = 0;
        class61.field1641 = 0;
        class105.field2564 = 0;
        class108.field2641 = 0;
        class16.field383 = 0;
        class57.field1501 = 0;
        class118.field2910 = 0;
        class109.field2661 = 0;
        class101.field2462 = 0;
        class33.field790 = 0;
        class63.field1661 = 0;
        class86.field2149 = 0;
        class133.field3244 = 0;
        class99.field2386 = 0;
        field970 = 0;
        class135.field3351 = 0;
        class140.field3461 = 0;
        class27.field660 = 0;
        class132.field3209 = 0;
        class12.field286 = 0;
        class3.field47 = 0;
        class58.field1538 = 0;
        class135.field3334 = 0;
        class9.field222 = 0;
        class122.field2973 = 0;
        class60.field1602 = 0;
        class17.field450 = 0;
        class109.field2679 = 0;
        class55.field1430 = 0;
        class108.field2634 = 0;
        class122.field2970 = 0;
        class35.field885 = 0;
        class16.field377 = 0;
        class99.field2354 = 0;
        class3.field63 = 0;
        class108.field2645 = 0;
        class135.field3354 = 0;
        class57.field1459 = 0;
        class68.field1750 = 0;
        class7.field194 = 0;
        class110.field2714 = 0;
        class46.field1121 = 0;
        class145.field3620 = 0;
        class16.field379 = 0;
        class49.field1193 = 0;
        class109.field2691 = 0;
        class150.field3712 = 0;
        class57.field1482 = 0;
        class109.field2660 = 0;
        class125.field3002 = 0;
        class16.field415 = 0;
        class138.field3438 = 0;
        class57.field1450 = 0;
        class99.field2362 = 0;
        class112.field2802 = 0;
        class37.field933 = 0;
        class121.field2962 = 0;
        class17.field447 = 0;
        class101.field2450 = 0;
        class81.field2004 = 0;
        class66.field1697 = 0;
        class59.field1565 = 0;
        class105.field2579 = 0;
        class58.field1521 = 0;
        class57.field1502 = 0;
        class110.field2729 = 0;
        class89.field2212 = 0;
        class5.field115 = 0;
        class99.field2405 = 0;
        class114.field2837 = 0;
        class32.field752 = 0;
        class105.field2589 = 0;
        class134.field3275 = 0;
        class12.field284 = 0;
        class80.field1981 = 0;
        class104.field2530 = 0;
        class20.field498 = 0;
        class108.field2644 = 0;
        class99.field2383 = 0;
        class112.field2801 = 0;
        class110.field2725 = 0;
        class125.field3005 = 0;
        class91.field2229 = 0;
        class142.field3522 = 0;
        class12.field289 = 0;
        class25.field582 = 0;
        class118.field2899 = 0;
        class109.field2670 = 0;
        class46.field1087 = 0;
        class148.field3680 = 0;
        class57.field1460 = 0;
        class23.field558 = 0;
        class127.field3079 = 0;
        field964 = 0;
        class125.field3004 = 0;
        class144.field3600 = 0;
        field963 = 0;
        class125.field3000 = 0;
        class9.field231 = 0;
        class35.field873 = 0;
        class12.field275 = 0;
        class125.field2994 = 0;
        class43.field1045 = 0;
        class33.field798 = 0;
        class93.field2262 = 0;
        class49.field1182 = 0;
        class135.field3339 = 0;
        class57.field1456 = 0;
        class133.field3238 = 0;
        class99.field2366 = 0;
        class79.field1936 = 0;
        class134.field3283 = 0;
        class16.field411 = 0;
        class49.field1181 = 0;
        class52.field1237 = 0;
        class88.field2188 = 0;
        class52.field1251 = 0;
        class48.field1170 = 0;
        class57.field1455 = 0;
        class122.field2969 = 0;
        class119.field2930 = 0;
        class42.field1034 = 0;
        class105.field2544 = 0;
        class143.field3572 = 0;
        class16.field400 = 0;
        class99.field2415 = 0;
        class143.field3538 = 0;
        class35.field899 = 0;
        class137.field3428 = 0;
        class14.field335 = 0;
        class12.field276 = 0;
        class14.field340 = 0;
        class83.field2065 = 0;
        class95.field2312 = 0;
        class34.field829 = 0;
        class135.field3330 = 0;
        class127.field3130 = 0;
        class54.field1404 = 0;
        class143.field3541 = 0;
        class137.field3426 = 0;
        class32.field767 = 0;
        class86.field2161 = 0;
        class47.field1141 = 0;
        class52.field1245 = 0;
        class35.field879 = 0;
        class72.field1836 = 0;
        class113.field2812 = 0;
        client.field512 = 0;
        class80.field1972 = 0;
        class57.field1489 = 0;
        class109.field2692 = 0;
        class53.field1264 = 0;
        class91.field2223 = 0;
        class135.field3359 = 0;
        class67.field1731 = 0;
        class46.field1098 = 0;
        class108.field2628 = 0;
        field967 = 0;
        class52.field1235 = 0;
        class101.field2452 = 0;
        class94.field2291 = 0;
        class119.field2928 = 0;
        class81.field2027 = 0;
        class105.field2576 = 0;
        class134.field3274 = 0;
        class46.field1099 = 0;
        class54.field1285 = 0;
        class4.field78 = 0;
        field969 = 0;
        class52.field1247 = 0;
        class145.field3618 = 0;
        class135.field3338 = 0;
        class68.field1754 = 0;
        class34.field833 = 0;
        class97.field2347 = 0;
        class108.field2649 = 0;
        class99.field2368 = 0;
        class21.field501 = 0;
        class133.field3247 = 0;
        class135.field3322 = 0;
        class143.field3524 = 0;
        client.field515 = 0;
        class12.field279 = 0;
        class101.field2447 = 0;
        class74.field1891 = 0;
        class27.field672 = 0;
        class111.field2762 = 0;
        class79.field1933 = 0;
        class57.field1506 = 0;
        class3.field49 = 0;
        class88.field2190 = 0;
        class97.field2342 = 0;
        class110.field2737 = 0;
        class23.field545 = 0;
        class83.field2054 = 0;
        class34.field859 = 0;
        class81.field1997 = 0;
        class55.field1424 = 0;
        class95.field2315 = 0;
        class136.field3393 = 0;
        class83.field2052 = 0;
        class83.field2070 = 0;
        class118.field2902 = 0;
        class46.field1090 = 0;
        class57.field1470 = 0;
        class16.field421 = 0;
        class132.field3210 = 0;
        class135.field3353 = 0;
        class86.field2150 = 0;
        class105.field2578 = 0;
        class66.field1705 = 0;
        class136.field3388 = 0;
        class31.field741 = 0;
        class135.field3340 = 0;
        class54.field1394 = 0;
        class99.field2359 = 0;
        class9.field238 = 0;
        class99.field2357 = 0;
        class93.field2261 = 0;
        class12.field285 = 0;
        class125.field3008 = 0;
        class86.field2155 = 0;
        class84.field2089 = 0;
        class57.field1472 = 0;
        class112.field2791 = 0;
        class99.field2353 = 0;
        class135.field3349 = 0;
        class100.field2422 = 0;
        class148.field3675 = 0;
        class137.field3413 = 0;
        class18.field471 = 0;
        class52.field1242 = 0;
        class100.field2426 = 0;
        class57.field1485 = 0;
        class27.field666 = 0;
        class149.field3695 = 0;
        class132.field3225 = 0;
        class4.field82 = 0;
        class109.field2681 = 0;
        class143.field3574 = 0;
        class112.field2795 = 0;
        class74.field1865 = 0;
        class74.field1888 = 0;
        class83.field2049 = 0;
        class140.field3457 = 0;
        class69.field1774 = 0;
        class133.field3243 = 0;
        class111.field2768 = 0;
        class105.field2553 = 0;
        class83.field2069 = 0;
        class57.field1495 = 0;
        class12.field271 = 0;
        class134.field3263 = 0;
        class87.field2172 = 0;
        class33.field785 = 0;
        class57.field1486 = 0;
        class72.field1832 = 0;
        class105.field2585 = 0;
        class14.field342 = 0;
        class142.field3511 = 0;
        class57.field1509 = 0;
        class1.field4 = 0;
        class112.field2794 = 0;
        class125.field3006 = 0;
        class27.field670 = 0;
        class12.field270 = 0;
        class99.field2397 = 0;
        class34.field813 = 0;
        class133.field3250 = 0;
        if (arg0 != 461) {
            field974 = null;
        }
        class134.field3280 = 0;
        class119.field2919 = 0;
        class99.field2382 = 0;
        class136.field3391 = 0;
        class135.field3341 = 0;
        class118.field2897 = 0;
        class79.field1930 = 0;
        class89.field2211 = 0;
        class126.field3039 = 0;
        class89.field2200 = 0;
        class69.field1784 = 0;
        class7.field186 = 0;
        class15.field357 = 0;
        class135.field3361 = 0;
        class25.field587 = 0;
        class89.field2195 = 0;
        class32.field762 = 0;
        class126.field3028 = 0;
        class15.field363 = 0;
        class99.field2358 = 0;
        class42.field1023 = 0;
        class94.field2281 = 0;
        class109.field2674 = 0;
        class99.field2379 = 0;
        class145.field3632 = 0;
        class49.field1184 = 0;
        class72.field1818 = 0;
        class121.field2949 = 0;
        class79.field1932 = 0;
        class95.field2318 = 0;
        class72.field1824 = 0;
        class105.field2574 = 0;
        class143.field3588 = 0;
        class61.field1632 = 0;
        class145.field3635 = 0;
        class43.field1047 = 0;
        class135.field3325 = 0;
        client.field517 = 0;
        class59.field1551 = 0;
        class55.field1412 = 0;
        class23.field548 = 0;
        class99.field2398 = 0;
        class57.field1464 = 0;
        class126.field3018 = 0;
        class99.field2403 = 0;
        class140.field3467 = 0;
        class121.field2958 = 0;
        class109.field2678 = 0;
        class61.field1626 = 0;
        class126.field3027 = 0;
        class1.field10 = 0;
        class59.field1570 = 0;
        class36.field919 = 0;
        class35.field876 = 0;
        class53.field1265 = 0;
        class109.field2669 = 0;
        class135.field3307 = 0;
        class79.field1929 = 0;
        class11.field255 = 0;
        class149.field3684 = 0;
        class143.field3542 = 0;
        class133.field3236 = 0;
        class33.field793 = 0;
        class54.field1318 = 0;
        class135.field3348 = 0;
        class20.field485 = 0;
        class16.field418 = 0;
        client.field525 = 0;
        class60.field1616 = 0;
        class99.field2374 = 0;
        class132.field3208 = 0;
        class70.field1794 = 0;
        class143.field3525 = 0;
        class99.field2356 = 0;
        class42.field1011 = 0;
        class132.field3213 = 0;
        class136.field3395 = 0;
        class37.field934 = 0;
        class145.field3613 = 0;
        class5.field98 = 0;
        class52.field1249 = 0;
        class86.field2158 = 0;
        class5.field88 = 0;
        class57.field1448 = 0;
        class149.field3686 = 0;
        class105.field2562 = 0;
        class101.field2445 = 0;
        field958 = 0;
        class36.field921 = 0;
        class35.field890 = 0;
        class37.field932 = 0;
        class9.field221 = 0;
        class91.field2233 = 0;
        class70.field1793 = 0;
        class135.field3335 = 0;
        class4.field84 = 0;
        class138.field3442 = 0;
        class12.field280 = 0;
        class54.field1385 = 0;
        class37.field947 = 0;
        class99.field2371 = 0;
        class135.field3328 = 0;
        class35.field896 = 0;
        class12.field278 = 0;
        class67.field1715 = 0;
        class93.field2257 = 0;
        class136.field3386 = 0;
        class150.field3701 = 0;
        class122.field2974 = 0;
        class84.field2097 = 0;
        class57.field1462 = 0;
        class135.field3306 = 0;
        class125.field3001 = 0;
        class118.field2907 = 0;
        class81.field1994 = 0;
        class142.field3514 = 0;
        class46.field1089 = 0;
        class21.field506 = 0;
        class53.field1268 = 0;
        class79.field1945 = 0;
        class107.field2622 = 0;
        class79.field1927 = 0;
        class7.field208 = 0;
        class48.field1167 = 0;
        class49.field1196 = 0;
        class107.field2617 = 0;
        class61.field1648 = 0;
        class105.field2569 = 0;
        class35.field903 = 0;
        class89.field2209 = 0;
        class1.field6 = 0;
        class7.field195 = 0;
        class119.field2938 = 0;
        class93.field2274 = 0;
        class109.field2673 = 0;
        class109.field2671 = 0;
        class57.field1479 = 0;
        class99.field2396 = 0;
        class135.field3332 = 0;
        class48.field1158 = 0;
        class69.field1786 = 0;
        class109.field2682 = 0;
        class34.field831 = 0;
        class1.field7 = 0;
        class140.field3455 = 0;
        class83.field2058 = 0;
        class57.field1457 = 0;
        class83.field2062 = 0;
        class127.field3122 = 0;
        class113.field2818 = 0;
        class99.field2360 = 0;
        class80.field1977 = 0;
        class109.field2672 = 0;
        class135.field3347 = 0;
        class23.field542 = 0;
        class68.field1762 = 0;
        class14.field329 = 0;
        class113.field2825 = 0;
        class143.field3561 = 0;
        class83.field2045 = 0;
        class49.field1183 = 0;
        class101.field2448 = 0;
        class30.field708 = 0;
        class133.field3246 = 0;
        class84.field2080 = 0;
        class111.field2784 = 0;
        class149.field3685 = 0;
        class88.field2192 = 0;
        class16.field437 = 0;
        class83.field2061 = 0;
        class69.field1788 = 0;
        class127.field3073 = 0;
        class1.field1 = 0;
        class144.field3592 = 0;
        class32.field781 = 0;
        class35.field893 = 0;
        class111.field2780 = 0;
        class35.field907 = 0;
        class5.field93 = 0;
        class5.field94 = 0;
        class134.field3262 = 0;
        class16.field434 = 0;
        class15.field369 = 0;
        class82.field2032 = 0;
        class109.field2662 = 0;
        class99.field2388 = 0;
        class109.field2690 = 0;
        class23.field546 = 0;
        class73.field1848 = 0;
        class108.field2650 = 0;
        class72.field1825 = 0;
        class109.field2676 = 0;
        class99.field2385 = 0;
        class57.field1466 = 0;
        class121.field2966 = 0;
        class46.field1112 = 0;
        class57.field1451 = 0;
        class16.field438 = 0;
        class79.field1935 = 0;
        class135.field3310 = 0;
        class126.field3029 = 0;
        class143.field3589 = 0;
        class144.field3606 = 0;
        class67.field1734 = 0;
        class99.field2375 = 0;
        class105.field2570 = 0;
        class99.field2392 = 0;
        class58.field1520 = 0;
        class108.field2629 = 0;
        class99.field2390 = 0;
        class99.field2364 = 0;
        class5.field107 = 0;
        class14.field334 = 0;
        class102.field2488 = 0;
        class35.field905 = 0;
        class109.field2683 = 0;
        class105.field2596 = 0;
        class93.field2254 = 0;
        class72.field1838 = 0;
        class33.field804 = 0;
        class99.field2378 = 0;
        class99.field2376 = 0;
        class114.field2835 = 0;
        class52.field1244 = 0;
        class143.field3582 = 0;
        class63.field1676 = 0;
        class79.field1942 = 0;
        class110.field2741 = 0;
        class72.field1835 = 0;
        class135.field3358 = 0;
        class77.field1901 = 0;
        class136.field3398 = 0;
        class145.field3637 = 0;
        class134.field3282 = 0;
        class14.field330 = 0;
        class33.field784 = 0;
        class17.field460 = 0;
        class150.field3717 = 0;
        class57.field1474 = 0;
        class105.field2584 = 0;
        class122.field2967 = 0;
        class34.field823 = 0;
        class135.field3315 = 0;
        class48.field1160 = 0;
        class7.field198 = 0;
        class105.field2550 = 0;
        class7.field193 = 0;
        class74.field1877 = 0;
        class121.field2944 = 0;
        class18.field479 = 0;
        class69.field1769 = 0;
        class74.field1893 = 0;
        class79.field1938 = 0;
        class31.field751 = 0;
        class14.field337 = 0;
        field962 = 0;
        class25.field592 = 0;
        class99.field2393 = 0;
        class125.field2997 = 0;
        class81.field2002 = 0;
        class57.field1471 = 0;
        class122.field2972 = 0;
        class37.field930 = 0;
        class138.field3441 = 0;
        class69.field1775 = 0;
        class31.field740 = 0;
        class93.field2252 = 0;
        class145.field3621 = 0;
        class83.field2046 = 0;
        class126.field3014 = 0;
        class35.field902 = 0;
        class7.field204 = 0;
        class57.field1453 = 0;
        class137.field3411 = 0;
        class109.field2680 = 0;
        client.field530 = 0;
        class134.field3277 = 0;
        class99.field2416 = 0;
        class16.field409 = 0;
        class60.field1600 = 0;
        class110.field2742 = 0;
        class137.field3409 = 0;
        class77.field1922 = 0;
        class59.field1587 = 0;
        class57.field1449 = 0;
        class143.field3547 = 0;
        class53.field1263 = 0;
        class1.field17 = 0;
        class17.field445 = 0;
        class81.field2009 = 0;
        class136.field3383 = 0;
        class91.field2218 = 0;
        class99.field2410 = 0;
        class83.field2047 = 0;
        class105.field2551 = 0;
        class4.field73 = 0;
        class99.field2401 = 0;
        class69.field1768 = 0;
        class43.field1038 = 0;
        class125.field2990 = 0;
        class105.field2548 = 0;
        class89.field2199 = 0;
        class83.field2055 = 0;
        client.field527 = 0;
        class83.field2050 = 0;
        class101.field2461 = 0;
        class122.field2976 = 0;
        class35.field906 = 0;
        class137.field3432 = 0;
        class15.field355 = 0;
        class136.field3400 = 0;
        class122.field2971 = 0;
        class48.field1164 = 0;
        class23.field559 = 0;
        class14.field332 = 0;
        class112.field2797 = 0;
        class3.field50 = 0;
        class119.field2933 = 0;
        class79.field1946 = 0;
        class48.field1157 = 0;
        class144.field3602 = 0;
        class34.field819 = 0;
        class79.field1937 = 0;
        class105.field2588 = 0;
        class18.field472 = 0;
        class114.field2858 = 0;
        client.field514 = 0;
        class42.field1033 = 0;
        class135.field3314 = 0;
        class105.field2572 = 0;
        class93.field2260 = 0;
        class133.field3240 = 0;
        class101.field2449 = 0;
        class12.field272 = 0;
        class136.field3404 = 0;
        class133.field3241 = 0;
        class135.field3305 = 0;
        class118.field2913 = 0;
        class59.field1583 = 0;
        class46.field1122 = 0;
        class101.field2460 = 0;
        class105.field2582 = 0;
        class57.field1480 = 0;
        class132.field3224 = 0;
        class2.field28 = 0;
        class16.field427 = 0;
        class99.field2352 = 0;
        class126.field3035 = 0;
        class137.field3433 = 0;
        class73.field1844 = 0;
        class135.field3316 = 0;
        class140.field3473 = 0;
        class5.field119 = 0;
        class57.field1497 = 0;
        class3.field46 = 0;
        class31.field735 = 0;
        class104.field2525 = 0;
        class5.field97 = 0;
        class100.field2435 = 0;
        class61.field1650 = 0;
        class134.field3268 = 0;
        class16.field388 = 0;
        class34.field814 = 0;
        class105.field2555 = 0;
        class14.field345 = 0;
        class53.field1259 = 0;
        class135.field3321 = 0;
        class108.field2646 = 0;
        class81.field2018 = 0;
        class73.field1840 = 0;
        class82.field2034 = 0;
        class57.field1504 = 0;
        class135.field3373 = 0;
        class63.field1660 = 0;
        class2.field32 = 0;
        class134.field3270 = 0;
        class109.field2693 = 0;
        class11.field260 = 0;
        class150.field3702 = 0;
        class45.field1066 = 0;
        class58.field1537 = 0;
        class144.field3605 = 0;
        class137.field3422 = 0;
        class122.field2975 = 0;
        class118.field2914 = 0;
        class54.field1335 = 0;
        class57.field1484 = 0;
        class150.field3724 = 0;
        class47.field1152 = 0;
        class84.field2081 = 0;
        class49.field1197 = 0;
        class140.field3464 = 0;
        class86.field2148 = 0;
        class113.field2820 = 0;
        class142.field3505 = 0;
        class57.field1476 = 0;
        class34.field817 = 0;
        class77.field1920 = 0;
        class82.field2031 = 0;
        class81.field2022 = 0;
        class57.field1488 = 0;
        class53.field1260 = 0;
        class107.field2618 = 0;
        class109.field2687 = 0;
        class31.field732 = 0;
        class99.field2363 = 0;
        class4.field79 = 0;
        class109.field2675 = 0;
        class133.field3251 = 0;
        class34.field810 = 0;
        class109.field2677 = 0;
        class93.field2268 = 0;
        class83.field2067 = 0;
        class15.field373 = 0;
        class57.field1447 = 0;
        class9.field234 = 0;
        class63.field1654 = 0;
        class135.field3319 = 0;
        class142.field3509 = 0;
        class57.field1490 = 0;
        class54.field1342 = 0;
        class42.field1037 = 0;
        class58.field1535 = 0;
        class136.field3390 = 0;
        class57.field1458 = 0;
        class15.field368 = 0;
        class144.field3597 = 0;
        class118.field2893 = 0;
        class101.field2454 = 0;
        class108.field2631 = 0;
        class2.field34 = 0;
        class82.field2037 = 0;
        class59.field1586 = 0;
        class12.field282 = 0;
        class105.field2563 = 0;
        class100.field2421 = 0;
        class102.field2477 = 0;
        class114.field2855 = 0;
        class34.field822 = 0;
        class108.field2630 = 0;
        client.field519 = 0;
        class110.field2719 = 0;
        class57.field1507 = 0;
        class9.field239 = 0;
        class140.field3472 = 0;
        class70.field1799 = 0;
        class100.field2428 = 0;
        class57.field1498 = 0;
        class66.field1700 = 0;
        class99.field2408 = 0;
        class17.field462 = 0;
        class34.field825 = 0;
        class20.field483 = 0;
        class138.field3439 = 0;
        class134.field3281 = 0;
        class57.field1511 = 0;
        class109.field2689 = 0;
        class63.field1662 = 0;
        class57.field1496 = 0;
        class135.field3363 = 0;
        class148.field3667 = 0;
        class54.field1349 = 0;
        class52.field1238 = 0;
        class150.field3720 = 0;
        class108.field2636 = 0;
        class99.field2367 = 0;
        class7.field187 = 0;
        class109.field2658 = 0;
        class2.field40 = 0;
        class67.field1727 = 0;
        class100.field2430 = 0;
        class53.field1272 = 0;
        class109.field2667 = 0;
        class150.field3713 = 0;
        class14.field348 = 0;
        class135.field3376 = 0;
        class73.field1846 = 0;
        class63.field1657 = 0;
        class150.field3708 = 0;
        class113.field2822 = 0;
        class136.field3384 = 0;
        class55.field1416 = 0;
        class109.field2659 = 0;
        class31.field745 = 0;
        class53.field1267 = 0;
        class83.field2056 = 0;
        class150.field3703 = 0;
        class57.field1467 = 0;
        class80.field1980 = 0;
        class54.field1307 = 0;
        class87.field2171 = 0;
        class68.field1744 = 0;
        class49.field1189 = 0;
        class134.field3264 = 0;
        class107.field2621 = 0;
        class99.field2412 = 0;
        class59.field1559 = 0;
        class109.field2663 = 0;
        class61.field1639 = 0;
        class133.field3237 = 0;
        class27.field663 = 0;
        class105.field2598 = 0;
        class150.field3728 = 0;
        class136.field3403 = 0;
        client.field524 = 0;
        class9.field218 = 0;
        class54.field1287 = 0;
        class100.field2418 = 0;
        class34.field821 = 0;
        class125.field3007 = 0;
        client.field516 = 0;
        class9.field223 = 0;
        class88.field2180 = 0;
        class134.field3269 = 0;
        class143.field3580 = 0;
        class57.field1461 = 0;
        class127.field3125 = 0;
        class108.field2637 = 0;
        class149.field3688 = 0;
        class34.field807 = 0;
        class57.field1452 = 0;
        class74.field1870 = 0;
        class144.field3594 = 0;
        class52.field1241 = 0;
        class104.field2540 = 0;
        class57.field1503 = 0;
        class46.field1117 = 0;
        class54.field1393 = 0;
        class145.field3633 = 0;
        class143.field3545 = 0;
        class105.field2587 = 0;
        class42.field1020 = 0;
        class110.field2726 = 0;
        class108.field2635 = 0;
        class27.field667 = 0;
        class54.field1377 = 0;
        class99.field2351 = 0;
        class127.field3098 = 0;
        class81.field1993 = 0;
        class74.field1871 = 0;
        class113.field2810 = 0;
        class93.field2265 = 0;
        class134.field3278 = 0;
        class134.field3279 = 0;
        class81.field1996 = 0;
        class109.field2666 = 0;
        class105.field2601 = 0;
        class5.field95 = 0;
        class77.field1908 = 0;
        class145.field3638 = 0;
        class25.field595 = 0;
        class111.field2767 = 0;
        class133.field3231 = 0;
        client.field526 = 0;
        class17.field461 = 0;
        class70.field1795 = 0;
        class135.field3308 = 0;
        class57.field1454 = 0;
        class135.field3317 = 0;
        class12.field268 = 0;
        class149.field3699 = 0;
        class57.field1492 = 0;
        class84.field2109 = 0;
        class94.field2286 = 0;
        class57.field1463 = 0;
        class99.field2355 = 0;
        class48.field1169 = 0;
        class57.field1468 = 0;
        class110.field2731 = 0;
        class12.field287 = 0;
        field968 = 0;
        class45.field1072 = 0;
        class135.field3320 = 0;
        class54.field1336 = 0;
        class111.field2765 = 0;
        class132.field3220 = 0;
        class87.field2164 = 0;
        class60.field1612 = 0;
        class109.field2664 = 0;
        class99.field2381 = 0;
        class57.field1446 = 0;
        class134.field3267 = 0;
        class57.field1491 = 0;
        class112.field2798 = 0;
        class135.field3362 = 0;
        class84.field2077 = 0;
        class60.field1609 = 0;
        class105.field2547 = 0;
        class89.field2203 = 0;
        class109.field2688 = 0;
        class82.field2035 = 0;
        class105.field2581 = 0;
        class47.field1153 = 0;
        class140.field3454 = 0;
        class121.field2955 = 0;
        class135.field3355 = 0;
        class7.field200 = 0;
        class108.field2633 = 0;
        class61.field1651 = 0;
        class107.field2619 = 0;
        class133.field3239 = 0;
        class81.field1998 = 0;
        class114.field2843 = 0;
        class54.field1361 = 0;
        class46.field1097 = 0;
        class20.field497 = 0;
        class9.field225 = 0;
        class79.field1943 = 0;
        class30.field713 = 0;
        class99.field2377 = 0;
        class69.field1771 = 0;
        class99.field2370 = 0;
        class45.field1082 = 0;
        class135.field3344 = 0;
        class57.field1500 = 0;
        class148.field3670 = -1;
        field965.field1477 = 0;
        class144.field3601 = 0;
        class48.field1177 = 0;
        class121.field2963 = 0;
        class67.field1719 = 0;
        class149.field3696 = -1;
        class55.field1432 = false;
        class55.field1431 = -1;
        class143.method1167(0, true);
        for (int var1 = 0; var1 < 100; var1++) {
            class81.field2003[var1] = null;
        }
        class141.field3494 = (int) (Math.random() * 100.0D) - 50;
        class46.field1130 = 0;
        class31.field748 = 0;
        class53.field1274 = (int) (Math.random() * 110.0D) - 55;
        class32.field777 = (int) (Math.random() * 120.0D) - 60;
        class140.field3478 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class14.field352 = -1;
        class143.field3585 = 0;
        class86.field2151 = 0;
        class112.field2804 = 0;
        class69.field1765 = 0;
        class23.field556 = (int) (Math.random() * 30.0D) - 20;
        class101.field2446 = 0;
        class94.field2296 = (int) (Math.random() * 80.0D) - 40;
        class121.field2957 = false;
        for (int var2 = 0; var2 < 2048; var2++) {
            class59.field1571[var2] = null;
            class58.field1524[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class149.field3691[var3] = null;
        }
        class69.field1770 = class59.field1571[2047] = new class126();
        class140.field3466.method714((byte) 76);
        class125.field3010.method714((byte) 76);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    class18.field476[var4][var10][var11] = null;
                }
            }
        }
        class105.field2546 = new class83();
        class74.field1889 = 0;
        class9.field230 = 0;
        for (int var5 = 0; var5 < class59.field1556; var5++) {
            class49 var9 = class105.method899(arg0 ^ 0x1F5, var5);
            if (var9 != null && var9.field1199 == 0) {
                class111.field2777[var5] = 0;
                class94.field2283[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class86.field2147.length; var6++) {
            class86.field2147[var6] = -1;
        }
        for (int var7 = 0; var7 < class134.field3301.length; var7++) {
            if (class134.field3301[var7] != -1) {
                class83.method719(class134.field3301[var7], 72);
                class134.field3301[var7] = -1;
            }
        }
        class83.method719(class127.field3110, 71);
        class127.field3110 = -1;
        class83.method719(class87.field2162, 71);
        class87.field2162 = -1;
        class83.method719(class23.field555, 90);
        class23.field555 = -1;
        class83.method719(class119.field2923, 84);
        class119.field2923 = -1;
        class83.method719(class36.field916, 56);
        class36.field916 = -1;
        class83.method719(class27.field679, 93);
        class27.field679 = -1;
        class83.method719(class42.field1015, 123);
        class31.field731 = -1;
        class3.field56 = 0;
        class42.field1015 = -1;
        class93.field2251 = null;
        class55.field1432 = false;
        class132.field3214 = 0;
        class77.field1923 = -1;
        class30.field712 = false;
        class57.field1473 = 3;
        class126.field3032.method1075(null, true, new int[5], false, -1);
        for (int var8 = 0; var8 < 5; var8++) {
            class121.field2960[var8] = null;
            class125.field3011[var8] = false;
        }
        class105.method896(2070);
        class143.field3587 = true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)Z")
    public static final boolean method323(int arg0, int arg1, int arg2, int arg3) {
        field964++;
        int var4 = class68.field1757.method50(class84.field2116, arg1, arg2, arg0);
        int var5 = arg0 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 & 0x1F;
        int var7 = var4 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class16 var8 = class83.method717(6, var5);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field425;
                var9 = var8.field376;
            } else {
                var9 = var8.field425;
                var10 = var8.field376;
            }
            int var11 = var8.field407;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class52.method432(true, 0, class69.field1770.field3096[0], var11, arg2, var9, var10, arg1, class69.field1770.field3100[0], (byte) 94, 0, 2);
        } else {
            class52.method432(true, var7, class69.field1770.field3096[0], 0, arg2, 0, 0, arg1, class69.field1770.field3100[0], (byte) 118, var6 + 1, 2);
        }
        class52.field1240 = 2;
        class97.field2334 = class4.field75;
        class47.field1137 = arg3;
        class119.field2920 = class23.field540;
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
    public final boolean method324(int arg0, int arg1) {
        field967++;
        if (arg0 != 0) {
            method321(null, (byte) -69, -6, null, -84, null, 45);
        }
        return this.field966[arg1].field1440;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method325(byte arg0, byte[] arg1) {
        field968++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 != -72) {
            method323(22, 81, 125, -41);
        }
        class116.method990(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lpc;Lpc;IZ)V")
    public class39(class105 arg0, class105 arg1, int arg2, boolean arg3) {
        class83 var5 = new class83();
        int var6 = arg0.method892(true, arg2);
        this.field966 = new class56[var6];
        int[] var7 = arg0.method908(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class27 var9 = null;
            byte[] var10 = arg0.method903(arg2, (byte) -128, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class27 var12 = (class27) var5.method722(111); var12 != null; var12 = (class27) var5.method716(true)) {
                if (var12.field675 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method890(var11, 0, (byte) -101);
                } else {
                    var13 = arg1.method890(0, var11, (byte) -105);
                }
                var9 = new class27(var11, var13);
                var5.method720(var9, 0);
            }
            this.field966[var7[var8]] = new class56(var10, var9);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
    public static void method326(boolean arg0) {
        field979 = null;
        field975 = null;
        field965 = null;
        field959 = null;
        field976 = null;
        field978 = null;
        field974 = null;
        if (arg0) {
            method326(false);
        }
    }
}
