import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class212 extends class61 {

    @OriginalMember(owner = "client!re", name = "x", descriptor = "[I")
    public int[] field3679 = new int[1];

    @OriginalMember(owner = "client!re", name = "D", descriptor = "[I")
    public int[] field3685 = new int[] { -1 };

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Leb;")
    public static class230 field3681 = class68.method589(0, "<br>");

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Leb;")
    public static class230 field3683 = class68.method589(0, "b12_full");

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3681 = null;
        field3683 = null;
        if (arg0 <= 28) {
            field3683 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public static final void method1472(int arg0) {
        for (class150 var1 = (class150) client.field2708.method392(0); var1 != null; var1 = (class150) client.field2708.method390(-1)) {
            int var2 = var1.field2681;
            if (class202.method1422(var2, true)) {
                boolean var3 = true;
                class245[] var4 = class99.field1839[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4216;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1166;
                    class245 var7 = class155.method1183(var6, arg0 ^ 0x5739);
                    if (var7 != null) {
                        class92.method777((byte) -65, var7);
                    }
                }
            }
        }
        field3678++;
        if (arg0 != 22312) {
            method1475(24, -39);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLng;I)V")
    public static final void method1473(byte arg0, class75 arg1, int arg2) {
        field3680++;
        Object[] var3 = arg1.field1364;
        int var4 = (Integer) var3[0];
        class228 var5 = class265.method1834((byte) -118, var4);
        if (arg0 > -45 || var5 == null) {
            return;
        }
        class231.field4017 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field3926;
        int[] var9 = var5.field3930;
        byte var10 = -1;
        int var11 = -1;
        try {
            class243.field4166 = new class230[var5.field3936];
            int var12 = 0;
            class145.field2601 = new int[var5.field3931];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field1359;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field1362;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field1354 == null ? -1 : arg1.field1354.field4362;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field1358;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field1354 == null ? -1 : arg1.field1354.field4313;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field1367 == null ? -1 : arg1.field1367.field4362;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field1367 == null ? -1 : arg1.field1367.field4313;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field1357;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field1360;
                    }
                    class145.field2601[var12++] = var16;
                } else if (var3[var14] instanceof class230) {
                    class230 var15 = (class230) var3[var14];
                    if (var15.method1585(class58.field1111, 63)) {
                        var15 = arg1.field1369;
                    }
                    class243.field4166[var13++] = var15;
                }
            }
            int var17 = 0;
            label3582: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var472 = var8[var11];
                if (var472 < 100) {
                    if (var472 == 0) {
                        class138.field2476[var6++] = var9[var11];
                        continue;
                    }
                    if (var472 == 1) {
                        int var18 = var9[var11];
                        class138.field2476[var6++] = class99.field1838[var18];
                        continue;
                    }
                    if (var472 == 2) {
                        int var19 = var9[var11];
                        var6--;
                        class255.method1792(var19, class138.field2476[var6], 0);
                        continue;
                    }
                    if (var472 == 3) {
                        class82.field1480[var7++] = var5.field3925[var11];
                        continue;
                    }
                    if (var472 == 6) {
                        var11 += var9[var11];
                        continue;
                    }
                    if (var472 == 7) {
                        var6 -= 2;
                        if (class138.field2476[var6 + 1] != class138.field2476[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 8) {
                        var6 -= 2;
                        if (class138.field2476[var6 + 1] == class138.field2476[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 9) {
                        var6 -= 2;
                        if (class138.field2476[var6] < class138.field2476[var6 + 1]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 10) {
                        var6 -= 2;
                        if (class138.field2476[var6] > class138.field2476[var6 + 1]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 21) {
                        if (class231.field4017 == 0) {
                            return;
                        }
                        class106 var20 = class80.field1462[--class231.field4017];
                        class243.field4166 = var20.field1919;
                        var11 = var20.field1916;
                        var5 = var20.field1918;
                        var8 = var5.field3926;
                        class145.field2601 = var20.field1922;
                        var9 = var5.field3930;
                        continue;
                    }
                    if (var472 == 25) {
                        int var21 = var9[var11];
                        class138.field2476[var6++] = class134.method1044(25, var21);
                        continue;
                    }
                    if (var472 == 27) {
                        int var22 = var9[var11];
                        var6--;
                        class4.method45((byte) 92, var22, class138.field2476[var6]);
                        continue;
                    }
                    if (var472 == 31) {
                        var6 -= 2;
                        if (class138.field2476[var6] <= class138.field2476[var6 + 1]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 32) {
                        var6 -= 2;
                        if (class138.field2476[var6 + 1] <= class138.field2476[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var472 == 33) {
                        class138.field2476[var6++] = class145.field2601[var9[var11]];
                        continue;
                    }
                    int var10001;
                    if (var472 == 34) {
                        var10001 = var9[var11];
                        var6--;
                        class145.field2601[var10001] = class138.field2476[var6];
                        continue;
                    }
                    if (var472 == 35) {
                        class82.field1480[var7++] = class243.field4166[var9[var11]];
                        continue;
                    }
                    if (var472 == 36) {
                        var10001 = var9[var11];
                        var7--;
                        class243.field4166[var10001] = class82.field1480[var7];
                        continue;
                    }
                    if (var472 == 37) {
                        int var23 = var9[var11];
                        var7 -= var23;
                        class230 var24 = class197.method1408(true, var23, class82.field1480, var7);
                        class82.field1480[var7++] = var24;
                        continue;
                    }
                    if (var472 == 38) {
                        var6--;
                        continue;
                    }
                    if (var472 == 39) {
                        var7--;
                        continue;
                    }
                    if (var472 == 40) {
                        int var25 = var9[var11];
                        class228 var26 = class265.method1834((byte) -115, var25);
                        class230[] var27 = new class230[var26.field3936];
                        int[] var28 = new int[var26.field3931];
                        for (int var29 = 0; var29 < var26.field3932; var29++) {
                            var28[var29] = class138.field2476[var6 + var29 - var26.field3932];
                        }
                        for (int var30 = 0; var30 < var26.field3937; var30++) {
                            var27[var30] = class82.field1480[var7 + var30 - var26.field3937];
                        }
                        var6 -= var26.field3932;
                        var7 -= var26.field3937;
                        class106 var31 = new class106();
                        var31.field1916 = var11;
                        var31.field1922 = class145.field2601;
                        var31.field1919 = class243.field4166;
                        var31.field1918 = var5;
                        if (class80.field1462.length <= class231.field4017) {
                            throw new RuntimeException();
                        }
                        var11 = -1;
                        var5 = var26;
                        class80.field1462[class231.field4017++] = var31;
                        class145.field2601 = var28;
                        var8 = var26.field3926;
                        class243.field4166 = var27;
                        var9 = var26.field3930;
                        continue;
                    }
                    if (var472 == 42) {
                        class138.field2476[var6++] = class124.field2186[var9[var11]];
                        continue;
                    }
                    if (var472 == 43) {
                        int var32 = var9[var11];
                        var6--;
                        class124.field2186[var32] = class138.field2476[var6];
                        class38.method345(var32, (byte) 53);
                        continue;
                    }
                    if (var472 == 44) {
                        var6--;
                        int var33 = class138.field2476[var6];
                        int var34 = var9[var11] & 0xFFFF;
                        int var35 = var9[var11] >> 16;
                        if (var33 >= 0 && var33 <= 5000) {
                            class170.field3019[var35] = var33;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var33 <= var37) {
                                    continue label3582;
                                }
                                class182.field3171[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 45) {
                        var6--;
                        int var38 = class138.field2476[var6];
                        int var39 = var9[var11];
                        if (var38 >= 0 && class170.field3019[var39] > var38) {
                            class138.field2476[var6++] = class182.field3171[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 46) {
                        var6 -= 2;
                        int var40 = var9[var11];
                        int var41 = class138.field2476[var6];
                        if (var41 >= 0 && class170.field3019[var40] > var41) {
                            class182.field3171[var40][var41] = class138.field2476[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 47) {
                        class230 var42 = class263.field4669[var9[var11]];
                        if (var42 == null) {
                            var42 = class53.field923;
                        }
                        class82.field1480[var7++] = var42;
                        continue;
                    }
                    if (var472 == 48) {
                        int var43 = var9[var11];
                        var7--;
                        class263.field4669[var43] = class82.field1480[var7];
                        class273.method1861(var43, 121);
                        continue;
                    }
                    if (var472 == 51) {
                        class46 var44 = var5.field3928[var9[var11]];
                        var6--;
                        class244 var45 = (class244) var44.method394((long) class138.field2476[var6], -21083);
                        if (var45 != null) {
                            var11 += var45.field4189;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var11] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var472 < 300) {
                    if (var472 == 100) {
                        var6 -= 3;
                        int var47 = class138.field2476[var6];
                        int var48 = class138.field2476[var6 + 1];
                        int var49 = class138.field2476[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class245 var50 = class155.method1183(var47, 17);
                        if (var50.field4318 == null) {
                            var50.field4318 = new class245[var49 + 1];
                        }
                        if (var49 >= var50.field4318.length) {
                            class245[] var51 = new class245[var49 + 1];
                            for (int var52 = 0; var52 < var50.field4318.length; var52++) {
                                var51[var52] = var50.field4318[var52];
                            }
                            var50.field4318 = var51;
                        }
                        if (var49 > 0 && var50.field4318[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class245 var53 = new class245();
                        var53.field4216 = true;
                        var53.field4306 = var48;
                        var53.field4313 = var49;
                        var53.field4245 = var53.field4362 = var50.field4362;
                        var50.field4318[var49] = var53;
                        if (var46) {
                            class273.field4804 = var53;
                        } else {
                            class142.field2564 = var53;
                        }
                        class92.method777((byte) -65, var50);
                        continue;
                    }
                    if (var472 == 101) {
                        class245 var54 = var46 ? class273.field4804 : class142.field2564;
                        if (var54.field4313 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class245 var55 = class155.method1183(var54.field4362, 17);
                        var55.field4318[var54.field4313] = null;
                        class92.method777((byte) -65, var55);
                        continue;
                    }
                    if (var472 == 102) {
                        var6--;
                        class245 var56 = class155.method1183(class138.field2476[var6], 17);
                        var56.field4318 = null;
                        class92.method777((byte) -65, var56);
                        continue;
                    }
                    if (var472 == 200) {
                        var6 -= 2;
                        int var57 = class138.field2476[var6];
                        int var58 = class138.field2476[var6 + 1];
                        class245 var59 = class7.method67(var58, var57, (byte) -69);
                        if (var59 != null && var58 != -1) {
                            class138.field2476[var6++] = 1;
                            if (var46) {
                                class273.field4804 = var59;
                            } else {
                                class142.field2564 = var59;
                            }
                            continue;
                        }
                        class138.field2476[var6++] = 0;
                        continue;
                    }
                    if (var472 == 201) {
                        var6--;
                        int var60 = class138.field2476[var6];
                        class245 var61 = class155.method1183(var60, 17);
                        if (var61 == null) {
                            class138.field2476[var6++] = 0;
                        } else {
                            class138.field2476[var6++] = 1;
                            if (var46) {
                                class273.field4804 = var61;
                            } else {
                                class142.field2564 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var472 < 500) {
                    if (var472 == 403) {
                        var6 -= 2;
                        int var461 = class138.field2476[var6];
                        if (var461 >= 7) {
                            var461 -= 7;
                        }
                        int var462 = class138.field2476[var6 + 1];
                        class56.field1033.field4626.method142(69, var462, var461);
                        continue;
                    }
                    if (var472 == 404) {
                        var6 -= 2;
                        int var463 = class138.field2476[var6];
                        int var464 = class138.field2476[var6 + 1];
                        class56.field1033.field4626.method144(0, var464, var463);
                        continue;
                    }
                    if (var472 == 410) {
                        var6--;
                        boolean var465 = class138.field2476[var6] != 0;
                        class56.field1033.field4626.method143(var465, 31264);
                        continue;
                    }
                } else if (!(var472 < 1000 || var472 >= 1100) || !(var472 < 2000 || var472 >= 2100)) {
                    class245 var455;
                    if (var472 < 2000) {
                        var455 = var46 ? class273.field4804 : class142.field2564;
                    } else {
                        var472 -= 1000;
                        var6--;
                        var455 = class155.method1183(class138.field2476[var6], 17);
                    }
                    if (var472 == 1000) {
                        var6 -= 4;
                        var455.field4349 = class138.field2476[var6];
                        var455.field4262 = class138.field2476[var6 + 1];
                        int var456 = class138.field2476[var6 + 3];
                        int var457 = class138.field2476[var6 + 2];
                        if (var456 < 0) {
                            var456 = 0;
                        } else if (var456 > 5) {
                            var456 = 5;
                        }
                        if (var457 < 0) {
                            var457 = 0;
                        } else if (var457 > 5) {
                            var457 = 5;
                        }
                        var455.field4315 = (byte) var457;
                        var455.field4317 = (byte) var456;
                        class92.method777((byte) -65, var455);
                        class115.method918(var455, (byte) 122);
                        if (var455.field4313 == -1) {
                            class125.method982(11, var455.field4362);
                        }
                        continue;
                    }
                    if (var472 == 1001) {
                        var6 -= 4;
                        var455.field4251 = class138.field2476[var6];
                        var455.field4266 = class138.field2476[var6 + 1];
                        var455.field4218 = 0;
                        var455.field4247 = 0;
                        int var458 = class138.field2476[var6 + 3];
                        int var459 = class138.field2476[var6 + 2];
                        if (var458 < 0) {
                            var458 = 0;
                        } else if (var458 > 4) {
                            var458 = 4;
                        }
                        if (var459 < 0) {
                            var459 = 0;
                        } else if (var459 > 4) {
                            var459 = 4;
                        }
                        var455.field4273 = (byte) var458;
                        var455.field4345 = (byte) var459;
                        class92.method777((byte) -65, var455);
                        class115.method918(var455, (byte) 109);
                        if (var455.field4306 == 0) {
                            class8.method84(var455, false, -58);
                        }
                        continue;
                    }
                    if (var472 == 1003) {
                        var6--;
                        boolean var460 = class138.field2476[var6] == 1;
                        if (var460 != var455.field4207) {
                            var455.field4207 = var460;
                            class92.method777((byte) -65, var455);
                        }
                        if (var455.field4313 == -1) {
                            class4.method40((byte) -66, var455.field4362);
                        }
                        continue;
                    }
                    if (var472 == 1004) {
                        var6 -= 2;
                        var455.field4227 = class138.field2476[var6];
                        var455.field4275 = class138.field2476[var6 + 1];
                        class92.method777((byte) -65, var455);
                        class115.method918(var455, (byte) 124);
                        if (var455.field4306 == 0) {
                            class8.method84(var455, false, -34);
                        }
                        continue;
                    }
                } else if (var472 >= 1100 && var472 < 1200 || var472 >= 2100 && var472 < 2200) {
                    class245 var62;
                    if (var472 >= 2000) {
                        var6--;
                        var62 = class155.method1183(class138.field2476[var6], 17);
                        var472 -= 1000;
                    } else {
                        var62 = var46 ? class273.field4804 : class142.field2564;
                    }
                    if (var472 == 1100) {
                        var6 -= 2;
                        var62.field4332 = class138.field2476[var6];
                        if (var62.field4332 > var62.field4298 - var62.field4325) {
                            var62.field4332 = var62.field4298 - var62.field4325;
                        }
                        if (var62.field4332 < 0) {
                            var62.field4332 = 0;
                        }
                        var62.field4351 = class138.field2476[var6 + 1];
                        if (var62.field4351 > (var62.field4339 - var62.field4307)) {
                            var62.field4351 = var62.field4339 - var62.field4307;
                        }
                        if (var62.field4351 < 0) {
                            var62.field4351 = 0;
                        }
                        class92.method777((byte) -65, var62);
                        if (var62.field4313 == -1) {
                            class201.method1418(var62.field4362, -15671);
                        }
                        continue;
                    }
                    if (var472 == 1101) {
                        var6--;
                        var62.field4305 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        if (var62.field4313 == -1) {
                            class147.method1123(-3741, var62.field4362);
                        }
                        continue;
                    }
                    if (var472 == 1102) {
                        var6--;
                        var62.field4235 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1103) {
                        var6--;
                        var62.field4199 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1104) {
                        var6--;
                        var62.field4201 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1105) {
                        var6--;
                        var62.field4322 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1106) {
                        var6--;
                        var62.field4341 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1107) {
                        var6--;
                        var62.field4257 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1108) {
                        var62.field4205 = 1;
                        var6--;
                        var62.field4264 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        if (var62.field4313 == -1) {
                            class6.method63(var62.field4362, 64);
                        }
                        continue;
                    }
                    if (var472 == 1109) {
                        var6 -= 6;
                        var62.field4353 = class138.field2476[var6];
                        var62.field4244 = class138.field2476[var6 + 1];
                        var62.field4206 = class138.field2476[var6 + 2];
                        var62.field4256 = class138.field2476[var6 + 3];
                        var62.field4354 = class138.field2476[var6 + 4];
                        var62.field4290 = class138.field2476[var6 + 5];
                        class92.method777((byte) -65, var62);
                        if (var62.field4313 == -1) {
                            class24.method253(var62.field4362, false);
                            class5.method52(0, var62.field4362);
                        }
                        continue;
                    }
                    if (var472 == 1110) {
                        var6--;
                        int var63 = class138.field2476[var6];
                        if (var62.field4233 != var63) {
                            var62.field4271 = 0;
                            var62.field4368 = 0;
                            var62.field4233 = var63;
                            class92.method777((byte) -65, var62);
                        }
                        if (var62.field4313 == -1) {
                            class53.method421(var62.field4362, (byte) -40);
                        }
                        continue;
                    }
                    if (var472 == 1111) {
                        var6--;
                        var62.field4268 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1112) {
                        var7--;
                        class230 var64 = class82.field1480[var7];
                        if (!var64.method1585(var62.field4203, -77)) {
                            var62.field4203 = var64;
                            class92.method777((byte) -65, var62);
                        }
                        if (var62.field4313 == -1) {
                            class215.method1485(118, var62.field4362);
                        }
                        continue;
                    }
                    if (var472 == 1113) {
                        var6--;
                        var62.field4324 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1114) {
                        var6 -= 3;
                        var62.field4287 = class138.field2476[var6];
                        var62.field4269 = class138.field2476[var6 + 1];
                        var62.field4253 = class138.field2476[var6 + 2];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1115) {
                        var6--;
                        var62.field4210 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1116) {
                        var6--;
                        var62.field4238 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1117) {
                        var6--;
                        var62.field4229 = class138.field2476[var6];
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1118) {
                        var6--;
                        var62.field4263 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1119) {
                        var6--;
                        var62.field4335 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1120) {
                        var6 -= 2;
                        var62.field4298 = class138.field2476[var6];
                        var62.field4339 = class138.field2476[var6 + 1];
                        class92.method777((byte) -65, var62);
                        if (var62.field4306 == 0) {
                            class8.method84(var62, false, -29);
                        }
                        continue;
                    }
                    if (var472 == 1121) {
                        var6 -= 2;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                    if (var472 == 1122) {
                        var6--;
                        var62.field4289 = class138.field2476[var6] == 1;
                        class92.method777((byte) -65, var62);
                        continue;
                    }
                } else if (var472 >= 1200 && var472 < 1300 || var472 >= 2200 && var472 < 2300) {
                    class245 var451;
                    if (var472 >= 2000) {
                        var472 -= 1000;
                        var6--;
                        var451 = class155.method1183(class138.field2476[var6], 17);
                    } else {
                        var451 = var46 ? class273.field4804 : class142.field2564;
                    }
                    class92.method777((byte) -65, var451);
                    if (var472 == 1200 || var472 == 1205) {
                        var6 -= 2;
                        int var452 = class138.field2476[var6 + 1];
                        int var453 = class138.field2476[var6];
                        if (var451.field4313 == -1) {
                            class128.method1007((byte) 89, var451.field4362);
                            class24.method253(var451.field4362, false);
                            class5.method52(0, var451.field4362);
                        }
                        if (var453 == -1) {
                            var451.field4260 = -1;
                            var451.field4205 = 1;
                            var451.field4264 = -1;
                        } else {
                            var451.field4260 = var453;
                            var451.field4311 = var452;
                            class12 var454 = class214.method1484(var453, -1);
                            var451.field4256 = var454.field233;
                            var451.field4354 = var454.field234;
                            if (var472 == 1205) {
                                var451.field4239 = false;
                            } else {
                                var451.field4239 = true;
                            }
                            var451.field4290 = var454.field223;
                            var451.field4244 = var454.field202;
                            var451.field4353 = var454.field201;
                            var451.field4206 = var454.field169;
                            if (var451.field4247 > 0) {
                                var451.field4290 = var451.field4290 * 32 / var451.field4247;
                            } else if (var451.field4251 > 0) {
                                var451.field4290 = var451.field4290 * 32 / var451.field4251;
                            }
                        }
                        continue;
                    }
                    if (var472 == 1201) {
                        var451.field4205 = 2;
                        var6--;
                        var451.field4264 = class138.field2476[var6];
                        if (var451.field4313 == -1) {
                            class6.method63(var451.field4362, 64);
                        }
                        continue;
                    }
                    if (var472 == 1202) {
                        var451.field4205 = 3;
                        var451.field4264 = class56.field1033.field4626.method134(121);
                        if (var451.field4313 == -1) {
                            class6.method63(var451.field4362, 64);
                        }
                        continue;
                    }
                    if (var472 == 1203) {
                        var451.field4205 = 6;
                        var6--;
                        var451.field4264 = class138.field2476[var6];
                        if (var451.field4313 == -1) {
                            class6.method63(var451.field4362, 64);
                        }
                        continue;
                    }
                    if (var472 == 1204) {
                        var451.field4205 = 5;
                        var6--;
                        var451.field4264 = class138.field2476[var6];
                        if (var451.field4313 == -1) {
                            class6.method63(var451.field4362, 64);
                        }
                        continue;
                    }
                } else if ((var472 < 1300 || var472 >= 1400) && (var472 < 2300 || var472 >= 2400)) {
                    if (var472 >= 1400 && var472 < 1500 || var472 >= 2400 && var472 < 2500) {
                        class245 var444;
                        if (var472 < 2000) {
                            var444 = var46 ? class273.field4804 : class142.field2564;
                        } else {
                            var472 -= 1000;
                            var6--;
                            var444 = class155.method1183(class138.field2476[var6], 17);
                        }
                        int[] var445 = null;
                        var7--;
                        class230 var446 = class82.field1480[var7];
                        if (var446.method1635(-34) > 0 && var446.method1609(var446.method1635(-60) - 1, (byte) -120) == 89) {
                            var6--;
                            int var447 = class138.field2476[var6];
                            if (var447 > 0) {
                                var445 = new int[var447];
                                while ((var447--) > 0) {
                                    var6--;
                                    var445[var447] = class138.field2476[var6];
                                }
                            }
                            var446 = var446.method1597(0, 0, var446.method1635(-74) - 1);
                        }
                        Object[] var448 = new Object[var446.method1635(-64) + 1];
                        for (int var449 = var448.length - 1; var449 >= 1; var449--) {
                            if (var446.method1609(var449 - 1, (byte) -120) == 115) {
                                var7--;
                                var448[var449] = class82.field1480[var7];
                            } else {
                                var6--;
                                var448[var449] = Integer.valueOf(class138.field2476[var6]);
                            }
                        }
                        var6--;
                        int var450 = class138.field2476[var6];
                        if (var450 == -1) {
                            var448 = null;
                        } else {
                            var448[0] = Integer.valueOf(var450);
                        }
                        var444.field4365 = true;
                        if (var472 == 1400) {
                            var444.field4278 = var448;
                        } else if (var472 == 1401) {
                            var444.field4261 = var448;
                        } else if (var472 == 1402) {
                            var444.field4232 = var448;
                        } else if (var472 == 1403) {
                            var444.field4346 = var448;
                        } else if (var472 == 1404) {
                            var444.field4356 = var448;
                        } else if (var472 == 1405) {
                            var444.field4350 = var448;
                        } else if (var472 == 1406) {
                            var444.field4221 = var448;
                        } else if (var472 == 1407) {
                            var444.field4329 = var448;
                            var444.field4309 = var445;
                        } else if (var472 == 1408) {
                            var444.field4334 = var448;
                        } else if (var472 == 1409) {
                            var444.field4316 = var448;
                        } else if (var472 == 1410) {
                            var444.field4361 = var448;
                        } else if (var472 == 1411) {
                            var444.field4319 = var448;
                        } else if (var472 == 1412) {
                            var444.field4299 = var448;
                        } else if (var472 == 1414) {
                            var444.field4348 = var445;
                            var444.field4220 = var448;
                        } else if (var472 == 1415) {
                            var444.field4366 = var448;
                            var444.field4342 = var445;
                        } else if (var472 == 1416) {
                            var444.field4310 = var448;
                        } else if (var472 == 1417) {
                            var444.field4214 = var448;
                        } else if (var472 == 1418) {
                            var444.field4357 = var448;
                        } else if (var472 == 1419) {
                            var444.field4224 = var448;
                        } else if (var472 == 1420) {
                            var444.field4230 = var448;
                        } else if (var472 == 1421) {
                            var444.field4240 = var448;
                        } else if (var472 == 1422) {
                            var444.field4280 = var448;
                        } else if (var472 == 1423) {
                            var444.field4312 = var448;
                        } else if (var472 == 1424) {
                            var444.field4243 = var448;
                        } else if (var472 == 1425) {
                            var444.field4258 = var448;
                        } else if (var472 == 1426) {
                            var444.field4363 = var448;
                        } else if (var472 == 1427) {
                            var444.field4237 = var448;
                        } else if (var472 == 1428) {
                            var444.field4333 = var448;
                            var444.field4281 = var445;
                        } else if (var472 == 1429) {
                            var444.field4283 = var445;
                            var444.field4231 = var448;
                        }
                        continue;
                    }
                    if (var472 < 1600) {
                        class245 var443 = var46 ? class273.field4804 : class142.field2564;
                        if (var472 == 1500) {
                            class138.field2476[var6++] = var443.field4252;
                            continue;
                        }
                        if (var472 == 1501) {
                            class138.field2476[var6++] = var443.field4223;
                            continue;
                        }
                        if (var472 == 1502) {
                            class138.field2476[var6++] = var443.field4325;
                            continue;
                        }
                        if (var472 == 1503) {
                            class138.field2476[var6++] = var443.field4307;
                            continue;
                        }
                        if (var472 == 1504) {
                            class138.field2476[var6++] = var443.field4207 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 1505) {
                            class138.field2476[var6++] = var443.field4245;
                            continue;
                        }
                    } else if (var472 < 1700) {
                        class245 var69 = var46 ? class273.field4804 : class142.field2564;
                        if (var472 == 1600) {
                            class138.field2476[var6++] = var69.field4332;
                            continue;
                        }
                        if (var472 == 1601) {
                            class138.field2476[var6++] = var69.field4351;
                            continue;
                        }
                        if (var472 == 1602) {
                            class82.field1480[var7++] = var69.field4203;
                            continue;
                        }
                        if (var472 == 1603) {
                            class138.field2476[var6++] = var69.field4298;
                            continue;
                        }
                        if (var472 == 1604) {
                            class138.field2476[var6++] = var69.field4339;
                            continue;
                        }
                        if (var472 == 1605) {
                            class138.field2476[var6++] = var69.field4290;
                            continue;
                        }
                        if (var472 == 1606) {
                            class138.field2476[var6++] = var69.field4206;
                            continue;
                        }
                        if (var472 == 1607) {
                            class138.field2476[var6++] = var69.field4354;
                            continue;
                        }
                        if (var472 == 1608) {
                            class138.field2476[var6++] = var69.field4256;
                            continue;
                        }
                        if (var472 == 1609) {
                            class138.field2476[var6++] = var69.field4199;
                            continue;
                        }
                    } else if (var472 < 1800) {
                        class245 var70 = var46 ? class273.field4804 : class142.field2564;
                        if (var472 == 1700) {
                            class138.field2476[var6++] = var70.field4260;
                            continue;
                        }
                        if (var472 == 1701) {
                            if (var70.field4260 == -1) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = var70.field4311;
                            }
                            continue;
                        }
                        if (var472 == 1702) {
                            class138.field2476[var6++] = var70.field4313;
                            continue;
                        }
                    } else if (var472 < 1900) {
                        class245 var441 = var46 ? class273.field4804 : class142.field2564;
                        if (var472 == 1800) {
                            class138.field2476[var6++] = class95.method810(client.method1167(var441), -118);
                            continue;
                        }
                        if (var472 == 1801) {
                            var6--;
                            int var442 = class138.field2476[var6];
                            int var474 = var442 - 1;
                            if (var441.field4202 != null && var441.field4202.length > var474 && var441.field4202[var474] != null) {
                                class82.field1480[var7++] = var441.field4202[var474];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 1802) {
                            if (var441.field4364 == null) {
                                class82.field1480[var7++] = class76.field1381;
                            } else {
                                class82.field1480[var7++] = var441.field4364;
                            }
                            continue;
                        }
                    } else if (var472 < 2600) {
                        var6--;
                        class245 var440 = class155.method1183(class138.field2476[var6], 17);
                        if (var472 == 2500) {
                            class138.field2476[var6++] = var440.field4252;
                            continue;
                        }
                        if (var472 == 2501) {
                            class138.field2476[var6++] = var440.field4223;
                            continue;
                        }
                        if (var472 == 2502) {
                            class138.field2476[var6++] = var440.field4325;
                            continue;
                        }
                        if (var472 == 2503) {
                            class138.field2476[var6++] = var440.field4307;
                            continue;
                        }
                        if (var472 == 2504) {
                            class138.field2476[var6++] = var440.field4207 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 2505) {
                            class138.field2476[var6++] = var440.field4245;
                            continue;
                        }
                    } else if (var472 < 2700) {
                        var6--;
                        class245 var71 = class155.method1183(class138.field2476[var6], 17);
                        if (var472 == 2600) {
                            class138.field2476[var6++] = var71.field4332;
                            continue;
                        }
                        if (var472 == 2601) {
                            class138.field2476[var6++] = var71.field4351;
                            continue;
                        }
                        if (var472 == 2602) {
                            class82.field1480[var7++] = var71.field4203;
                            continue;
                        }
                        if (var472 == 2603) {
                            class138.field2476[var6++] = var71.field4298;
                            continue;
                        }
                        if (var472 == 2604) {
                            class138.field2476[var6++] = var71.field4339;
                            continue;
                        }
                        if (var472 == 2605) {
                            class138.field2476[var6++] = var71.field4290;
                            continue;
                        }
                        if (var472 == 2606) {
                            class138.field2476[var6++] = var71.field4206;
                            continue;
                        }
                        if (var472 == 2607) {
                            class138.field2476[var6++] = var71.field4354;
                            continue;
                        }
                        if (var472 == 2608) {
                            class138.field2476[var6++] = var71.field4256;
                            continue;
                        }
                        if (var472 == 2609) {
                            class138.field2476[var6++] = var71.field4199;
                            continue;
                        }
                    } else if (var472 < 2800) {
                        if (var472 == 2700) {
                            var6--;
                            class245 var72 = class155.method1183(class138.field2476[var6], 17);
                            class138.field2476[var6++] = var72.field4260;
                            continue;
                        }
                        if (var472 == 2701) {
                            var6--;
                            class245 var73 = class155.method1183(class138.field2476[var6], 17);
                            if (var73.field4260 == -1) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = var73.field4311;
                            }
                            continue;
                        }
                        if (var472 == 2702) {
                            var6--;
                            int var74 = class138.field2476[var6];
                            class150 var75 = (class150) client.field2708.method394((long) var74, -21083);
                            if (var75 == null) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = 1;
                            }
                            continue;
                        }
                        if (var472 == 2703) {
                            var6--;
                            class245 var76 = class155.method1183(class138.field2476[var6], 17);
                            if (var76.field4318 == null) {
                                class138.field2476[var6++] = 0;
                                continue;
                            }
                            int var77 = var76.field4318.length;
                            for (int var78 = 0; var78 < var76.field4318.length; var78++) {
                                if (var76.field4318[var78] == null) {
                                    var77 = var78;
                                    break;
                                }
                            }
                            class138.field2476[var6++] = var77;
                            continue;
                        }
                        if (var472 == 2704 || var472 == 2705) {
                            var6 -= 2;
                            int var79 = class138.field2476[var6];
                            int var80 = class138.field2476[var6 + 1];
                            class150 var81 = (class150) client.field2708.method394((long) var79, -21083);
                            if (var81 != null && var81.field2681 == var80) {
                                class138.field2476[var6++] = 1;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                    } else if (var472 < 2900) {
                        var6--;
                        class245 var438 = class155.method1183(class138.field2476[var6], 17);
                        if (var472 == 2800) {
                            class138.field2476[var6++] = class95.method810(client.method1167(var438), -122);
                            continue;
                        }
                        if (var472 == 2801) {
                            var6--;
                            int var439 = class138.field2476[var6];
                            int var473 = var439 - 1;
                            if (var438.field4202 != null && var473 < var438.field4202.length && var438.field4202[var473] != null) {
                                class82.field1480[var7++] = var438.field4202[var473];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 2802) {
                            if (var438.field4364 == null) {
                                class82.field1480[var7++] = class76.field1381;
                            } else {
                                class82.field1480[var7++] = var438.field4364;
                            }
                            continue;
                        }
                    } else if (var472 < 3200) {
                        if (var472 == 3100) {
                            var7--;
                            class230 var82 = class82.field1480[var7];
                            class227.method1565(class76.field1381, (byte) 88, 0, var82);
                            continue;
                        }
                        if (var472 == 3101) {
                            var6 -= 2;
                            class139.method1068(class56.field1033, class138.field2476[var6 + 1], class138.field2476[var6], 77);
                            continue;
                        }
                        if (var472 == 3103) {
                            class200.method1410(false);
                            continue;
                        }
                        if (var472 == 3104) {
                            class99.field1824++;
                            var7--;
                            class230 var83 = class82.field1480[var7];
                            int var84 = 0;
                            if (var83.method1629((byte) -81)) {
                                var84 = var83.method1584((byte) -116);
                            }
                            class153.field2747.method978(32, 244);
                            class153.field2747.method165(var84, 1380186760);
                            continue;
                        }
                        if (var472 == 3105) {
                            class88.field1531++;
                            var7--;
                            class230 var85 = class82.field1480[var7];
                            class153.field2747.method978(-127, 75);
                            class153.field2747.method148(var85.method1587(64), (byte) 126);
                            continue;
                        }
                        if (var472 == 3106) {
                            class29.field530++;
                            var7--;
                            class230 var86 = class82.field1480[var7];
                            class153.field2747.method978(7, 191);
                            class153.field2747.method170((byte) 115, var86.method1635(-35) + 1);
                            class153.field2747.method197(0, var86);
                            continue;
                        }
                        if (var472 == 3107) {
                            var6--;
                            int var87 = class138.field2476[var6];
                            var7--;
                            class230 var88 = class82.field1480[var7];
                            class243.method1697(var88, var87, (byte) 56);
                            continue;
                        }
                        if (var472 == 3108) {
                            var6 -= 3;
                            int var89 = class138.field2476[var6];
                            int var90 = class138.field2476[var6 + 1];
                            int var91 = class138.field2476[var6 + 2];
                            class245 var92 = class155.method1183(var91, 17);
                            class163.method1219(var89, var90, (byte) 31, var92);
                            continue;
                        }
                        if (var472 == 3109) {
                            var6 -= 2;
                            int var93 = class138.field2476[var6];
                            int var94 = class138.field2476[var6 + 1];
                            class245 var95 = var46 ? class273.field4804 : class142.field2564;
                            class163.method1219(var93, var94, (byte) 31, var95);
                            continue;
                        }
                        if (var472 == 3110) {
                            var6--;
                            int var96 = class138.field2476[var6];
                            class14.field288++;
                            class153.field2747.method978(89, 180);
                            class153.field2747.method181(-20053, var96);
                            continue;
                        }
                    } else if (var472 < 3300) {
                        if (var472 == 3200) {
                            var6 -= 3;
                            class214.method1478((byte) -78, class138.field2476[var6 + 1], class138.field2476[var6], class138.field2476[var6 + 2]);
                            continue;
                        }
                        if (var472 == 3201) {
                            var6--;
                            class268.method1846(0, class138.field2476[var6]);
                            continue;
                        }
                        if (var472 == 3202) {
                            var6 -= 2;
                            class202.method1421(class138.field2476[var6 + 1], class138.field2476[var6], (byte) -103);
                            continue;
                        }
                    } else if (var472 < 3400) {
                        if (var472 == 3300) {
                            class138.field2476[var6++] = class259.field4584;
                            continue;
                        }
                        if (var472 == 3301) {
                            var6 -= 2;
                            int var97 = class138.field2476[var6];
                            int var98 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class203.method1426(var98, var97, 2047);
                            continue;
                        }
                        if (var472 == 3302) {
                            var6 -= 2;
                            int var99 = class138.field2476[var6];
                            int var100 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class104.method875(var100, var99, (byte) 122);
                            continue;
                        }
                        if (var472 == 3303) {
                            var6 -= 2;
                            int var101 = class138.field2476[var6];
                            int var102 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class97.method830(var102, 10387, var101);
                            continue;
                        }
                        if (var472 == 3304) {
                            var6--;
                            int var103 = class138.field2476[var6];
                            class138.field2476[var6++] = class182.method1309(-95, var103).field2971;
                            continue;
                        }
                        if (var472 == 3305) {
                            var6--;
                            int var104 = class138.field2476[var6];
                            class138.field2476[var6++] = class49.field870[var104];
                            continue;
                        }
                        if (var472 == 3306) {
                            var6--;
                            int var105 = class138.field2476[var6];
                            class138.field2476[var6++] = class203.field3578[var105];
                            continue;
                        }
                        if (var472 == 3307) {
                            var6--;
                            int var106 = class138.field2476[var6];
                            class138.field2476[var6++] = class192.field3399[var106];
                            continue;
                        }
                        if (var472 == 3308) {
                            int var107 = class124.field2174;
                            int var108 = (class56.field1033.field2274 >> 7) + class272.field4795;
                            int var109 = (class56.field1033.field2300 >> 7) + class155.field2759;
                            class138.field2476[var6++] = (var107 << 28) + (var108 << 14) + var109;
                            continue;
                        }
                        if (var472 == 3309) {
                            var6--;
                            int var110 = class138.field2476[var6];
                            class138.field2476[var6++] = class189.method1350(var110, 268421645) >> 14;
                            continue;
                        }
                        if (var472 == 3310) {
                            var6--;
                            int var111 = class138.field2476[var6];
                            class138.field2476[var6++] = var111 >> 28;
                            continue;
                        }
                        if (var472 == 3311) {
                            var6--;
                            int var112 = class138.field2476[var6];
                            class138.field2476[var6++] = class189.method1350(16383, var112);
                            continue;
                        }
                        if (var472 == 3312) {
                            class138.field2476[var6++] = class222.field3805 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3313) {
                            var6 -= 2;
                            int var113 = class138.field2476[var6 + 1];
                            int var114 = class138.field2476[var6] + 32768;
                            class138.field2476[var6++] = class203.method1426(var113, var114, 2047);
                            continue;
                        }
                        if (var472 == 3314) {
                            var6 -= 2;
                            int var115 = class138.field2476[var6 + 1];
                            int var116 = class138.field2476[var6] + 32768;
                            class138.field2476[var6++] = class104.method875(var115, var116, (byte) 114);
                            continue;
                        }
                        if (var472 == 3315) {
                            var6 -= 2;
                            int var117 = class138.field2476[var6 + 1];
                            int var118 = class138.field2476[var6] + 32768;
                            class138.field2476[var6++] = class97.method830(var117, 10387, var118);
                            continue;
                        }
                        if (var472 == 3316) {
                            if (class30.field545 < 2) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = class30.field545;
                            }
                            continue;
                        }
                        if (var472 == 3317) {
                            class138.field2476[var6++] = class66.field1239;
                            continue;
                        }
                        if (var472 == 3318) {
                            class138.field2476[var6++] = class7.field92;
                            continue;
                        }
                        if (var472 == 3321) {
                            class138.field2476[var6++] = class171.field3037;
                            continue;
                        }
                        if (var472 == 3322) {
                            class138.field2476[var6++] = class107.field1928;
                            continue;
                        }
                        if (var472 == 3323) {
                            if (class24.field452 >= 5 && class24.field452 <= 9) {
                                class138.field2476[var6++] = 1;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3324) {
                            if (class24.field452 >= 5 && class24.field452 <= 9) {
                                class138.field2476[var6++] = class24.field452;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3325) {
                            class138.field2476[var6++] = class80.field1460 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3326) {
                            class138.field2476[var6++] = class56.field1033.field4602;
                            continue;
                        }
                        if (var472 == 3327) {
                            class138.field2476[var6++] = class56.field1033.field4626.field244 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3328) {
                            class138.field2476[var6++] = class48.field841;
                            continue;
                        }
                        if (var472 == 3329) {
                            class138.field2476[var6++] = class22.field433;
                            continue;
                        }
                        if (var472 == 3330) {
                            var6--;
                            int var119 = class138.field2476[var6];
                            class138.field2476[var6++] = class237.method1663(false, var119);
                            continue;
                        }
                        if (var472 == 3331) {
                            var6 -= 2;
                            int var120 = class138.field2476[var6 + 1];
                            int var121 = class138.field2476[var6];
                            class138.field2476[var6++] = class65.method573(false, -88, var120, var121);
                            continue;
                        }
                        if (var472 == 3332) {
                            var6 -= 2;
                            int var122 = class138.field2476[var6];
                            int var123 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class65.method573(true, -128, var123, var122);
                            continue;
                        }
                        if (var472 == 3333) {
                            class138.field2476[var6++] = class214.field3712;
                            continue;
                        }
                        if (var472 == 3335) {
                            class138.field2476[var6++] = class226.field3896;
                            continue;
                        }
                    } else if (var472 < 3500) {
                        if (var472 == 3400) {
                            var6 -= 2;
                            int var124 = class138.field2476[var6];
                            int var125 = class138.field2476[var6 + 1];
                            class77 var126 = class249.method1742(-10314, var124);
                            class82.field1480[var7++] = var126.method642((byte) -96, var125);
                            continue;
                        }
                        if (var472 == 3408) {
                            var6 -= 4;
                            int var127 = class138.field2476[var6];
                            int var128 = class138.field2476[var6 + 1];
                            int var129 = class138.field2476[var6 + 2];
                            int var130 = class138.field2476[var6 + 3];
                            class77 var131 = class249.method1742(-10314, var129);
                            if (var131.field1386 == var127 && var131.field1393 == var128) {
                                if (var128 == 115) {
                                    class82.field1480[var7++] = var131.method642((byte) -128, var130);
                                } else {
                                    class138.field2476[var6++] = var131.method637(var130, 0);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var472 == 3409) {
                            var6 -= 3;
                            int var132 = class138.field2476[var6];
                            int var133 = class138.field2476[var6 + 1];
                            int var134 = class138.field2476[var6 + 2];
                            if (var133 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class77 var135 = class249.method1742(-10314, var133);
                            if (var135.field1393 != var132) {
                                throw new RuntimeException("C3409-1");
                            }
                            class138.field2476[var6++] = var135.method635(var134, 99) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3410) {
                            var6--;
                            int var136 = class138.field2476[var6];
                            var7--;
                            class230 var137 = class82.field1480[var7];
                            if (var136 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class77 var138 = class249.method1742(-10314, var136);
                            if (var138.field1393 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class138.field2476[var6++] = var138.method638(var137, (byte) -121) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3411) {
                            var6--;
                            int var139 = class138.field2476[var6];
                            class77 var140 = class249.method1742(-10314, var139);
                            class138.field2476[var6++] = var140.field1397.method395(111);
                            continue;
                        }
                    } else if (var472 < 3700) {
                        if (var472 == 3600) {
                            if (class187.field3277 == 0) {
                                class138.field2476[var6++] = -2;
                            } else if (class187.field3277 == 1) {
                                class138.field2476[var6++] = -1;
                            } else {
                                class138.field2476[var6++] = class273.field4805;
                            }
                            continue;
                        }
                        if (var472 == 3601) {
                            var6--;
                            int var416 = class138.field2476[var6];
                            if (class187.field3277 == 2 && var416 < class273.field4805) {
                                class82.field1480[var7++] = class12.field239[var416];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 3602) {
                            var6--;
                            int var417 = class138.field2476[var6];
                            if (class187.field3277 == 2 && class273.field4805 > var417) {
                                class138.field2476[var6++] = class268.field4750[var417];
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3603) {
                            var6--;
                            int var418 = class138.field2476[var6];
                            if (class187.field3277 == 2 && class273.field4805 > var418) {
                                class138.field2476[var6++] = class59.field1130[var418];
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3604) {
                            var7--;
                            class230 var419 = class82.field1480[var7];
                            var6--;
                            int var420 = class138.field2476[var6];
                            class180.method1304(var419, 2037412908, var420);
                            continue;
                        }
                        if (var472 == 3605) {
                            var7--;
                            class230 var421 = class82.field1480[var7];
                            class112.method904(var421.method1587(101), 16934);
                            continue;
                        }
                        if (var472 == 3606) {
                            var7--;
                            class230 var422 = class82.field1480[var7];
                            class109.method892(var422.method1587(96), (byte) 127);
                            continue;
                        }
                        if (var472 == 3607) {
                            var7--;
                            class230 var423 = class82.field1480[var7];
                            class217.method1500(var423.method1587(97), 60);
                            continue;
                        }
                        if (var472 == 3608) {
                            var7--;
                            class230 var424 = class82.field1480[var7];
                            class1.method3(var424.method1587(87), true);
                            continue;
                        }
                        if (var472 == 3609) {
                            var7--;
                            class230 var425 = class82.field1480[var7];
                            if (var425.method1603(class190.field3357, 0) || var425.method1603(class17.field377, 0)) {
                                var425 = var425.method1619(-28, 7);
                            }
                            class138.field2476[var6++] = class39.method349(126, var425) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3610) {
                            var6--;
                            int var426 = class138.field2476[var6];
                            if (class187.field3277 == 2 && var426 < class273.field4805) {
                                class82.field1480[var7++] = class180.field3153[var426];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 3611) {
                            if (class156.field2790 == null) {
                                class82.field1480[var7++] = class76.field1381;
                            } else {
                                class82.field1480[var7++] = class156.field2790.method1623(-30947);
                            }
                            continue;
                        }
                        if (var472 == 3612) {
                            if (class156.field2790 == null) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = class124.field2170;
                            }
                            continue;
                        }
                        if (var472 == 3613) {
                            var6--;
                            int var427 = class138.field2476[var6];
                            if (class156.field2790 != null && class124.field2170 > var427) {
                                class82.field1480[var7++] = class182.field3175[var427].field2410.method1623(-30947);
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 3614) {
                            var6--;
                            int var428 = class138.field2476[var6];
                            if (class156.field2790 != null && class124.field2170 > var428) {
                                class138.field2476[var6++] = class182.field3175[var428].field2413;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3615) {
                            var6--;
                            int var429 = class138.field2476[var6];
                            if (class156.field2790 != null && var429 < class124.field2170) {
                                class138.field2476[var6++] = class182.field3175[var429].field2407;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3616) {
                            class138.field2476[var6++] = class259.field4582;
                            continue;
                        }
                        if (var472 == 3617) {
                            var7--;
                            class230 var430 = class82.field1480[var7];
                            class36.method328(-28824, var430);
                            continue;
                        }
                        if (var472 == 3618) {
                            class138.field2476[var6++] = class247.field4389;
                            continue;
                        }
                        if (var472 == 3619) {
                            var7--;
                            class230 var431 = class82.field1480[var7];
                            class48.method401(var431.method1587(68), 120);
                            continue;
                        }
                        if (var472 == 3620) {
                            class16.method209(false);
                            continue;
                        }
                        if (var472 == 3621) {
                            if (class187.field3277 == 0) {
                                class138.field2476[var6++] = -1;
                            } else {
                                class138.field2476[var6++] = class45.field796;
                            }
                            continue;
                        }
                        if (var472 == 3622) {
                            var6--;
                            int var432 = class138.field2476[var6];
                            if (class187.field3277 != 0 && class45.field796 > var432) {
                                class82.field1480[var7++] = class113.method906(class145.field2607[var432], (byte) -99).method1623(-30947);
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 3623) {
                            var7--;
                            class230 var433 = class82.field1480[var7];
                            if (var433.method1603(class190.field3357, 0) || var433.method1603(class17.field377, 0)) {
                                var433 = var433.method1619(-82, 7);
                            }
                            class138.field2476[var6++] = class142.method1088((byte) 127, var433) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3624) {
                            var6--;
                            int var434 = class138.field2476[var6];
                            if (class182.field3175 != null && class124.field2170 > var434 && class182.field3175[var434].field2410.method1612((byte) 15, class56.field1033.field4620)) {
                                class138.field2476[var6++] = 1;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3625) {
                            if (class105.field1906 == null) {
                                class82.field1480[var7++] = class76.field1381;
                            } else {
                                class82.field1480[var7++] = class105.field1906.method1623(-30947);
                            }
                            continue;
                        }
                        if (var472 == 3626) {
                            var6--;
                            int var435 = class138.field2476[var6];
                            if (class156.field2790 != null && class124.field2170 > var435) {
                                class82.field1480[var7++] = class182.field3175[var435].field2409;
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 3627) {
                            var6--;
                            int var436 = class138.field2476[var6];
                            if (class187.field3277 == 2 && var436 >= 0 && var436 < class273.field4805) {
                                class138.field2476[var6++] = class114.field2040[var436] ? 1 : 0;
                                continue;
                            }
                            class138.field2476[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3628) {
                            var7--;
                            class230 var437 = class82.field1480[var7];
                            if (var437.method1603(class190.field3357, 0) || var437.method1603(class17.field377, 0)) {
                                var437 = var437.method1619(-19, 7);
                            }
                            class138.field2476[var6++] = class221.method1511(true, var437);
                            continue;
                        }
                    } else if (var472 < 4000) {
                        if (var472 == 3903) {
                            var6--;
                            int var141 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var141].method1645(8);
                            continue;
                        }
                        if (var472 == 3904) {
                            var6--;
                            int var142 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var142].field4024;
                            continue;
                        }
                        if (var472 == 3905) {
                            var6--;
                            int var143 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var143].field4032;
                            continue;
                        }
                        if (var472 == 3906) {
                            var6--;
                            int var144 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var144].field4030;
                            continue;
                        }
                        if (var472 == 3907) {
                            var6--;
                            int var145 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var145].field4028;
                            continue;
                        }
                        if (var472 == 3908) {
                            var6--;
                            int var146 = class138.field2476[var6];
                            class138.field2476[var6++] = class89.field1549[var146].field4035;
                            continue;
                        }
                        if (var472 == 3910) {
                            var6--;
                            int var147 = class138.field2476[var6];
                            int var148 = class89.field1549[var147].method1643(74);
                            class138.field2476[var6++] = var148 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3911) {
                            var6--;
                            int var149 = class138.field2476[var6];
                            int var150 = class89.field1549[var149].method1643(86);
                            class138.field2476[var6++] = var150 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3912) {
                            var6--;
                            int var151 = class138.field2476[var6];
                            int var152 = class89.field1549[var151].method1643(60);
                            class138.field2476[var6++] = var152 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3913) {
                            var6--;
                            int var153 = class138.field2476[var6];
                            int var154 = class89.field1549[var153].method1643(107);
                            class138.field2476[var6++] = var154 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var472 < 4100) {
                        if (var472 == 4000) {
                            var6 -= 2;
                            int var371 = class138.field2476[var6 + 1];
                            int var372 = class138.field2476[var6];
                            class138.field2476[var6++] = var371 + var372;
                            continue;
                        }
                        if (var472 == 4001) {
                            var6 -= 2;
                            int var373 = class138.field2476[var6];
                            int var374 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var373 - var374;
                            continue;
                        }
                        if (var472 == 4002) {
                            var6 -= 2;
                            int var375 = class138.field2476[var6];
                            int var376 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var375 * var376;
                            continue;
                        }
                        if (var472 == 4003) {
                            var6 -= 2;
                            int var377 = class138.field2476[var6];
                            int var378 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var377 / var378;
                            continue;
                        }
                        if (var472 == 4004) {
                            var6--;
                            int var379 = class138.field2476[var6];
                            class138.field2476[var6++] = (int) ((double) var379 * Math.random());
                            continue;
                        }
                        if (var472 == 4005) {
                            var6--;
                            int var380 = class138.field2476[var6];
                            class138.field2476[var6++] = (int) ((double) (var380 + 1) * Math.random());
                            continue;
                        }
                        if (var472 == 4006) {
                            var6 -= 5;
                            int var381 = class138.field2476[var6 + 3];
                            int var382 = class138.field2476[var6];
                            int var383 = class138.field2476[var6 + 2];
                            int var384 = class138.field2476[var6 + 1];
                            int var385 = class138.field2476[var6 + 4];
                            class138.field2476[var6++] = (var385 - var383) * (var384 - var382) / (var381 - var383) + var382;
                            continue;
                        }
                        if (var472 == 4007) {
                            var6 -= 2;
                            long var386 = (long) class138.field2476[var6];
                            long var388 = (long) class138.field2476[var6 + 1];
                            class138.field2476[var6++] = (int) (var386 * var388 / 100L + var386);
                            continue;
                        }
                        if (var472 == 4008) {
                            var6 -= 2;
                            int var390 = class138.field2476[var6];
                            int var391 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class177.method1290(var390, 0x1 << var391);
                            continue;
                        }
                        if (var472 == 4009) {
                            var6 -= 2;
                            int var392 = class138.field2476[var6 + 1];
                            int var393 = class138.field2476[var6];
                            class138.field2476[var6++] = class189.method1350(var393, -(0x1 << var392) - 1);
                            continue;
                        }
                        if (var472 == 4010) {
                            var6 -= 2;
                            int var394 = class138.field2476[var6 + 1];
                            int var395 = class138.field2476[var6];
                            class138.field2476[var6++] = class189.method1350(0x1 << var394, var395) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var472 == 4011) {
                            var6 -= 2;
                            int var396 = class138.field2476[var6];
                            int var397 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var396 % var397;
                            continue;
                        }
                        if (var472 == 4012) {
                            var6 -= 2;
                            int var398 = class138.field2476[var6 + 1];
                            int var399 = class138.field2476[var6];
                            if (var399 == 0) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = (int) Math.pow((double) var399, (double) var398);
                            }
                            continue;
                        }
                        if (var472 == 4013) {
                            var6 -= 2;
                            int var400 = class138.field2476[var6];
                            int var401 = class138.field2476[var6 + 1];
                            if (var400 == 0) {
                                class138.field2476[var6++] = 0;
                            } else if (var401 == 0) {
                                class138.field2476[var6++] = Integer.MAX_VALUE;
                            } else {
                                class138.field2476[var6++] = (int) Math.pow((double) var400, 1.0D / (double) var401);
                            }
                            continue;
                        }
                        if (var472 == 4014) {
                            var6 -= 2;
                            int var402 = class138.field2476[var6];
                            int var403 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class189.method1350(var402, var403);
                            continue;
                        }
                        if (var472 == 4015) {
                            var6 -= 2;
                            int var404 = class138.field2476[var6];
                            int var405 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = class177.method1290(var404, var405);
                            continue;
                        }
                        if (var472 == 4016) {
                            var6 -= 2;
                            int var406 = class138.field2476[var6];
                            int var407 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var407 <= var406 ? var407 : var406;
                            continue;
                        }
                        if (var472 == 4017) {
                            var6 -= 2;
                            int var408 = class138.field2476[var6];
                            int var409 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var408 > var409 ? var408 : var409;
                            continue;
                        }
                        if (var472 == 4018) {
                            var6 -= 3;
                            long var410 = (long) class138.field2476[var6 + 1];
                            long var412 = (long) class138.field2476[var6];
                            long var414 = (long) class138.field2476[var6 + 2];
                            class138.field2476[var6++] = (int) (var412 * var414 / var410);
                            continue;
                        }
                    } else if (var472 < 4200) {
                        if (var472 == 4100) {
                            var7--;
                            class230 var319 = class82.field1480[var7];
                            var6--;
                            int var320 = class138.field2476[var6];
                            class82.field1480[var7++] = class173.method1267((byte) 59, new class230[] { var319, class37.method340(var320, (byte) -26) });
                            continue;
                        }
                        if (var472 == 4101) {
                            var7 -= 2;
                            class230 var321 = class82.field1480[var7];
                            class230 var322 = class82.field1480[var7 + 1];
                            class82.field1480[var7++] = class173.method1267((byte) 59, new class230[] { var321, var322 });
                            continue;
                        }
                        if (var472 == 4102) {
                            var7--;
                            class230 var323 = class82.field1480[var7];
                            var6--;
                            int var324 = class138.field2476[var6];
                            class82.field1480[var7++] = class173.method1267((byte) 59, new class230[] { var323, class149.method1132(10, var324, true) });
                            continue;
                        }
                        if (var472 == 4103) {
                            var7--;
                            class230 var325 = class82.field1480[var7];
                            class82.field1480[var7++] = var325.method1592(4052);
                            continue;
                        }
                        if (var472 == 4104) {
                            var6--;
                            int var326 = class138.field2476[var6];
                            long var327 = (long) var326 * 86400000L + 1014768000000L;
                            class67.field1263.setTime(new Date(var327));
                            int var329 = class67.field1263.get(5);
                            int var330 = class67.field1263.get(2);
                            int var331 = class67.field1263.get(1);
                            class82.field1480[var7++] = class173.method1267((byte) 59, new class230[] { class37.method340(var329, (byte) -26), class139.field2486, class125.field2190[var330], class139.field2486, class37.method340(var331, (byte) -26) });
                            continue;
                        }
                        if (var472 == 4105) {
                            var7 -= 2;
                            class230 var332 = class82.field1480[var7 + 1];
                            class230 var333 = class82.field1480[var7];
                            if (class56.field1033.field4626 != null && class56.field1033.field4626.field244) {
                                class82.field1480[var7++] = var332;
                                continue;
                            }
                            class82.field1480[var7++] = var333;
                            continue;
                        }
                        if (var472 == 4106) {
                            var6--;
                            int var334 = class138.field2476[var6];
                            class82.field1480[var7++] = class37.method340(var334, (byte) -26);
                            continue;
                        }
                        if (var472 == 4107) {
                            var7 -= 2;
                            class138.field2476[var6++] = class82.field1480[var7].method1610(class82.field1480[var7 + 1], (byte) -91);
                            continue;
                        }
                        if (var472 == 4108) {
                            var6 -= 2;
                            int var335 = class138.field2476[var6];
                            int var336 = class138.field2476[var6 + 1];
                            var7--;
                            class230 var337 = class82.field1480[var7];
                            byte[] var338 = class131.field2351.method1546(0, (byte) -100, var336);
                            class83 var339 = new class83(var338);
                            var339.method785(class175.field3072, (int[]) null);
                            class138.field2476[var6++] = var339.method804(var337, var335);
                            continue;
                        }
                        if (var472 == 4109) {
                            var7--;
                            class230 var340 = class82.field1480[var7];
                            var6 -= 2;
                            int var341 = class138.field2476[var6 + 1];
                            int var342 = class138.field2476[var6];
                            byte[] var343 = class131.field2351.method1546(0, (byte) -100, var341);
                            class83 var344 = new class83(var343);
                            var344.method785(class175.field3072, (int[]) null);
                            class138.field2476[var6++] = var344.method803(var340, var342);
                            continue;
                        }
                        if (var472 == 4110) {
                            var7 -= 2;
                            class230 var345 = class82.field1480[var7 + 1];
                            class230 var346 = class82.field1480[var7];
                            var6--;
                            if (class138.field2476[var6] == 1) {
                                class82.field1480[var7++] = var346;
                            } else {
                                class82.field1480[var7++] = var345;
                            }
                            continue;
                        }
                        if (var472 == 4111) {
                            var7--;
                            class230 var347 = class82.field1480[var7];
                            class82.field1480[var7++] = class93.method793(var347);
                            continue;
                        }
                        if (var472 == 4112) {
                            var6--;
                            int var348 = class138.field2476[var6];
                            var7--;
                            class230 var349 = class82.field1480[var7];
                            if (var348 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class82.field1480[var7++] = var349.method1589(var348, (byte) 107);
                            continue;
                        }
                        if (var472 == 4113) {
                            var6--;
                            int var350 = class138.field2476[var6];
                            class138.field2476[var6++] = class6.method60((byte) -85, var350) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4114) {
                            var6--;
                            int var351 = class138.field2476[var6];
                            class138.field2476[var6++] = class116.method936(97, var351) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4115) {
                            var6--;
                            int var352 = class138.field2476[var6];
                            class138.field2476[var6++] = class171.method1257(false, var352) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4116) {
                            var6--;
                            int var353 = class138.field2476[var6];
                            class138.field2476[var6++] = class96.method816(-58, var353) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4117) {
                            var7--;
                            class230 var354 = class82.field1480[var7];
                            if (var354 == null) {
                                class138.field2476[var6++] = 0;
                            } else {
                                class138.field2476[var6++] = var354.method1635(-63);
                            }
                            continue;
                        }
                        if (var472 == 4118) {
                            var6 -= 2;
                            var7--;
                            class230 var355 = class82.field1480[var7];
                            int var356 = class138.field2476[var6];
                            int var357 = class138.field2476[var6 + 1];
                            class82.field1480[var7++] = var355.method1597(0, var356, var357);
                            continue;
                        }
                        if (var472 == 4119) {
                            var7--;
                            class230 var358 = class82.field1480[var7];
                            boolean var359 = false;
                            class230 var360 = class214.method1481(0, var358.method1635(-67));
                            for (int var361 = 0; var358.method1635(-62) > var361; var361++) {
                                int var362 = var358.method1609(var361, (byte) -120);
                                if (var362 == 60) {
                                    var359 = true;
                                } else if (var362 == 62) {
                                    var359 = false;
                                } else if (!var359) {
                                    var360.method1599(var362, 122);
                                }
                            }
                            var360.method1631(-96);
                            class82.field1480[var7++] = var360;
                            continue;
                        }
                        if (var472 == 4120) {
                            var6 -= 2;
                            var7--;
                            class230 var363 = class82.field1480[var7];
                            int var364 = class138.field2476[var6];
                            int var365 = class138.field2476[var6 + 1];
                            class138.field2476[var6++] = var363.method1617(var365, (byte) -68, var364);
                            continue;
                        }
                        if (var472 == 4121) {
                            var7 -= 2;
                            class230 var366 = class82.field1480[var7];
                            class230 var367 = class82.field1480[var7 + 1];
                            var6--;
                            int var368 = class138.field2476[var6];
                            class138.field2476[var6++] = var366.method1582(15000, var368, var367);
                            continue;
                        }
                        if (var472 == 4122) {
                            var6--;
                            int var369 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1642(var369, -91);
                            continue;
                        }
                        if (var472 == 4123) {
                            var6--;
                            int var370 = class138.field2476[var6];
                            class138.field2476[var6++] = class144.method1101(var370, (byte) 119);
                            continue;
                        }
                    } else if (var472 < 4300) {
                        if (var472 == 4200) {
                            var6--;
                            int var300 = class138.field2476[var6];
                            class82.field1480[var7++] = class214.method1484(var300, -1).field191;
                            continue;
                        }
                        if (var472 == 4201) {
                            var6 -= 2;
                            int var301 = class138.field2476[var6 + 1];
                            int var302 = class138.field2476[var6];
                            class12 var303 = class214.method1484(var302, -1);
                            if (var301 >= 1 && var301 <= 5 && var303.field187[var301 - 1] != null) {
                                class82.field1480[var7++] = var303.field187[var301 - 1];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 4202) {
                            var6 -= 2;
                            int var304 = class138.field2476[var6];
                            int var305 = class138.field2476[var6 + 1];
                            class12 var306 = class214.method1484(var304, -1);
                            if (var305 >= 1 && var305 <= 5 && var306.field221[var305 - 1] != null) {
                                class82.field1480[var7++] = var306.field221[var305 - 1];
                                continue;
                            }
                            class82.field1480[var7++] = class76.field1381;
                            continue;
                        }
                        if (var472 == 4203) {
                            var6--;
                            int var307 = class138.field2476[var6];
                            class138.field2476[var6++] = class214.method1484(var307, -1).field211;
                            continue;
                        }
                        if (var472 == 4204) {
                            var6--;
                            int var308 = class138.field2476[var6];
                            class138.field2476[var6++] = class214.method1484(var308, -1).field213 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4205) {
                            var6--;
                            int var309 = class138.field2476[var6];
                            class12 var310 = class214.method1484(var309, -1);
                            if (var310.field192 == -1 && var310.field232 >= 0) {
                                class138.field2476[var6++] = var310.field232;
                                continue;
                            }
                            class138.field2476[var6++] = var309;
                            continue;
                        }
                        if (var472 == 4206) {
                            var6--;
                            int var311 = class138.field2476[var6];
                            class12 var312 = class214.method1484(var311, -1);
                            if (var312.field192 >= 0 && var312.field232 >= 0) {
                                class138.field2476[var6++] = var312.field232;
                                continue;
                            }
                            class138.field2476[var6++] = var311;
                            continue;
                        }
                        if (var472 == 4207) {
                            var6--;
                            int var313 = class138.field2476[var6];
                            class138.field2476[var6++] = class214.method1484(var313, -1).field171 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4208) {
                            var6 -= 2;
                            int var314 = class138.field2476[var6];
                            int var315 = class138.field2476[var6 + 1];
                            class6 var316 = class155.method1180(-115, var315);
                            if (var316.method58((byte) -87)) {
                                class82.field1480[var7++] = class214.method1484(var314, -1).method127(false, var316.field78, var315);
                            } else {
                                class138.field2476[var6++] = class214.method1484(var314, -1).method128(var315, (byte) 79, var316.field74);
                            }
                            continue;
                        }
                        if (var472 == 4210) {
                            var7--;
                            class230 var317 = class82.field1480[var7];
                            var6--;
                            int var318 = class138.field2476[var6];
                            class142.method1089(var318 == 1, var317, 16);
                            class138.field2476[var6++] = class161.field2877;
                            continue;
                        }
                        if (var472 == 4211) {
                            if (class48.field844 != null && class161.field2877 > class60.field1154) {
                                class138.field2476[var6++] = class189.method1350(65535, class48.field844[class60.field1154++]);
                                continue;
                            }
                            class138.field2476[var6++] = -1;
                            continue;
                        }
                        if (var472 == 4212) {
                            class60.field1154 = 0;
                            continue;
                        }
                    } else if (var472 < 4400) {
                        if (var472 == 4300) {
                            var6 -= 2;
                            int var290 = class138.field2476[var6 + 1];
                            int var291 = class138.field2476[var6];
                            class6 var292 = class155.method1180(-96, var290);
                            if (var292.method58((byte) -87)) {
                                class82.field1480[var7++] = class232.method1640(-124, var291).method818((byte) 12, var292.field78, var290);
                            } else {
                                class138.field2476[var6++] = class232.method1640(-112, var291).method828(-18231, var290, var292.field74);
                            }
                            continue;
                        }
                        if (var472 == 4301) {
                            var6--;
                            int var293 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-60, var293).field1768;
                            continue;
                        }
                        if (var472 == 4302) {
                            var6--;
                            int var294 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-67, var294).field1794;
                            continue;
                        }
                        if (var472 == 4303) {
                            var6--;
                            int var295 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-99, var295).field1777;
                            continue;
                        }
                        if (var472 == 4304) {
                            var6--;
                            int var296 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-93, var296).field1796;
                            continue;
                        }
                        if (var472 == 4305) {
                            var6--;
                            int var297 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-67, var297).field1791;
                            continue;
                        }
                        if (var472 == 4306) {
                            var6--;
                            int var298 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-78, var298).field1784;
                            continue;
                        }
                        if (var472 == 4307) {
                            var6--;
                            int var299 = class138.field2476[var6];
                            class138.field2476[var6++] = class232.method1640(-91, var299).field1770;
                            continue;
                        }
                    } else if (var472 >= 4500) {
                        if (var472 >= 4600) {
                            if (var472 < 5100) {
                                if (var472 == 5000) {
                                    class138.field2476[var6++] = class102.field1867;
                                    continue;
                                }
                                if (var472 == 5001) {
                                    var6 -= 3;
                                    class162.field2887++;
                                    class102.field1867 = class138.field2476[var6];
                                    class106.field1925 = class138.field2476[var6 + 1];
                                    class7.field117 = class138.field2476[var6 + 2];
                                    class153.field2747.method978(14, 163);
                                    class153.field2747.method170((byte) 123, class102.field1867);
                                    class153.field2747.method170((byte) 115, class106.field1925);
                                    class153.field2747.method170((byte) 116, class7.field117);
                                    continue;
                                }
                                if (var472 == 5002) {
                                    var7--;
                                    class230 var221 = class82.field1480[var7];
                                    class271.field4791++;
                                    var6 -= 2;
                                    int var222 = class138.field2476[var6];
                                    int var223 = class138.field2476[var6 + 1];
                                    class153.field2747.method978(-126, 10);
                                    class153.field2747.method148(var221.method1587(93), (byte) 127);
                                    class153.field2747.method170((byte) 112, var222 - 1);
                                    class153.field2747.method170((byte) 114, var223);
                                    continue;
                                }
                                if (var472 == 5003) {
                                    var6--;
                                    int var224 = class138.field2476[var6];
                                    class230 var225 = null;
                                    if (var224 < 100) {
                                        var225 = class160.field2868[var224];
                                    }
                                    if (var225 == null) {
                                        var225 = class76.field1381;
                                    }
                                    class82.field1480[var7++] = var225;
                                    continue;
                                }
                                if (var472 == 5004) {
                                    int var226 = -1;
                                    var6--;
                                    int var227 = class138.field2476[var6];
                                    if (var227 < 100 && class160.field2868[var227] != null) {
                                        var226 = class106.field1926[var227];
                                    }
                                    class138.field2476[var6++] = var226;
                                    continue;
                                }
                                if (var472 == 5005) {
                                    class138.field2476[var6++] = class106.field1925;
                                    continue;
                                }
                                if (var472 == 5008) {
                                    var7--;
                                    class230 var228 = class82.field1480[var7];
                                    if (var228.method1603(class163.field2897, 0)) {
                                        class121.method957(var228, -128);
                                        continue;
                                    }
                                    if (class30.field545 == 0 && (class48.field841 == 1 || class22.field433 == 1)) {
                                        continue;
                                    }
                                    class105.field1910++;
                                    byte var229 = 0;
                                    class230 var230 = var228.method1592(4052);
                                    if (var230.method1603(class157.field2814, 0)) {
                                        var229 = 0;
                                        var228 = var228.method1619(-115, class157.field2814.method1635(-127));
                                    } else if (var230.method1603(class264.field4692, 0)) {
                                        var228 = var228.method1619(-68, class264.field4692.method1635(-84));
                                        var229 = 1;
                                    } else if (var230.method1603(class142.field2565, 0)) {
                                        var229 = 2;
                                        var228 = var228.method1619(-55, class142.field2565.method1635(-17));
                                    } else if (var230.method1603(class14.field310, 0)) {
                                        var228 = var228.method1619(-18, class14.field310.method1635(-96));
                                        var229 = 3;
                                    } else if (var230.method1603(class14.field304, 0)) {
                                        var228 = var228.method1619(-52, class14.field304.method1635(-36));
                                        var229 = 4;
                                    } else if (var230.method1603(class216.field3729, 0)) {
                                        var228 = var228.method1619(-103, class216.field3729.method1635(-51));
                                        var229 = 5;
                                    } else if (var230.method1603(class60.field1139, 0)) {
                                        var228 = var228.method1619(-96, class60.field1139.method1635(-76));
                                        var229 = 6;
                                    } else if (var230.method1603(class53.field910, 0)) {
                                        var228 = var228.method1619(-34, class53.field910.method1635(-98));
                                        var229 = 7;
                                    } else if (var230.method1603(class70.field1294, 0)) {
                                        var229 = 8;
                                        var228 = var228.method1619(-101, class70.field1294.method1635(-53));
                                    } else if (var230.method1603(class28.field518, 0)) {
                                        var229 = 9;
                                        var228 = var228.method1619(-105, class28.field518.method1635(-30));
                                    } else if (var230.method1603(class248.field4402, 0)) {
                                        var229 = 10;
                                        var228 = var228.method1619(-124, class248.field4402.method1635(-32));
                                    } else if (var230.method1603(class156.field2779, 0)) {
                                        var228 = var228.method1619(-85, class156.field2779.method1635(-127));
                                        var229 = 11;
                                    } else if (class226.field3896 != 0) {
                                        if (var230.method1603(class157.field2801, 0)) {
                                            var229 = 0;
                                            var228 = var228.method1619(-89, class157.field2801.method1635(-19));
                                        } else if (var230.method1603(class264.field4687, 0)) {
                                            var228 = var228.method1619(-60, class264.field4687.method1635(-66));
                                            var229 = 1;
                                        } else if (var230.method1603(class142.field2567, 0)) {
                                            var228 = var228.method1619(-44, class142.field2567.method1635(-75));
                                            var229 = 2;
                                        } else if (var230.method1603(class14.field326, 0)) {
                                            var229 = 3;
                                            var228 = var228.method1619(-47, class14.field326.method1635(-122));
                                        } else if (var230.method1603(class14.field306, 0)) {
                                            var229 = 4;
                                            var228 = var228.method1619(-102, class14.field306.method1635(-41));
                                        } else if (var230.method1603(class216.field3733, 0)) {
                                            var228 = var228.method1619(-71, class216.field3733.method1635(-63));
                                            var229 = 5;
                                        } else if (var230.method1603(class60.field1151, 0)) {
                                            var229 = 6;
                                            var228 = var228.method1619(-91, class60.field1151.method1635(-111));
                                        } else if (var230.method1603(class53.field911, 0)) {
                                            var229 = 7;
                                            var228 = var228.method1619(-38, class53.field911.method1635(-86));
                                        } else if (var230.method1603(class70.field1295, 0)) {
                                            var229 = 8;
                                            var228 = var228.method1619(-55, class70.field1295.method1635(-55));
                                        } else if (var230.method1603(class28.field510, 0)) {
                                            var228 = var228.method1619(-12, class28.field510.method1635(-76));
                                            var229 = 9;
                                        } else if (var230.method1603(class248.field4394, 0)) {
                                            var229 = 10;
                                            var228 = var228.method1619(-21, class248.field4394.method1635(-71));
                                        } else if (var230.method1603(class156.field2787, 0)) {
                                            var228 = var228.method1619(-38, class156.field2787.method1635(-38));
                                            var229 = 11;
                                        }
                                    }
                                    class230 var231 = var228.method1592(4052);
                                    byte var232 = 0;
                                    if (var231.method1603(class88.field1527, 0)) {
                                        var232 = 1;
                                        var228 = var228.method1619(-25, class88.field1527.method1635(-66));
                                    } else if (var231.method1603(class169.field2993, 0)) {
                                        var228 = var228.method1619(-127, class169.field2993.method1635(-124));
                                        var232 = 2;
                                    } else if (var231.method1603(class52.field903, 0)) {
                                        var232 = 3;
                                        var228 = var228.method1619(-52, class52.field903.method1635(-90));
                                    } else if (var231.method1603(class42.field766, 0)) {
                                        var228 = var228.method1619(-58, class42.field766.method1635(-52));
                                        var232 = 4;
                                    } else if (var231.method1603(class160.field2856, 0)) {
                                        var228 = var228.method1619(-16, class160.field2856.method1635(-49));
                                        var232 = 5;
                                    } else if (class226.field3896 != 0) {
                                        if (var231.method1603(class88.field1539, 0)) {
                                            var232 = 1;
                                            var228 = var228.method1619(-12, class88.field1539.method1635(-40));
                                        } else if (var231.method1603(class169.field2989, 0)) {
                                            var232 = 2;
                                            var228 = var228.method1619(-67, class169.field2989.method1635(-104));
                                        } else if (var231.method1603(class52.field901, 0)) {
                                            var228 = var228.method1619(-101, class52.field901.method1635(-72));
                                            var232 = 3;
                                        } else if (var231.method1603(class42.field763, 0)) {
                                            var232 = 4;
                                            var228 = var228.method1619(-101, class42.field763.method1635(-38));
                                        } else if (var231.method1603(class160.field2857, 0)) {
                                            var232 = 5;
                                            var228 = var228.method1619(-18, class160.field2857.method1635(-103));
                                        }
                                    }
                                    class153.field2747.method978(21, 157);
                                    class153.field2747.method170((byte) 125, 0);
                                    int var233 = class153.field2747.field318;
                                    class153.field2747.method170((byte) 124, var229);
                                    class153.field2747.method170((byte) 123, var232);
                                    class22.method245((byte) -92, var228, class153.field2747);
                                    class153.field2747.method179(class153.field2747.field318 - var233, -111);
                                    continue;
                                }
                                if (var472 == 5009) {
                                    var7 -= 2;
                                    class230 var234 = class82.field1480[var7];
                                    class230 var235 = class82.field1480[var7 + 1];
                                    if (class30.field545 != 0 || class48.field841 != 1 && class22.field433 != 1) {
                                        class153.field2747.method978(-127, 217);
                                        class153.field2747.method170((byte) 117, 0);
                                        class77.field1399++;
                                        int var236 = class153.field2747.field318;
                                        class153.field2747.method148(var234.method1587(79), (byte) 123);
                                        class22.method245((byte) -96, var235, class153.field2747);
                                        class153.field2747.method179(class153.field2747.field318 - var236, -50);
                                    }
                                    continue;
                                }
                                if (var472 == 5010) {
                                    class230 var237 = null;
                                    var6--;
                                    int var238 = class138.field2476[var6];
                                    if (var238 < 100) {
                                        var237 = class39.field723[var238];
                                    }
                                    if (var237 == null) {
                                        var237 = class76.field1381;
                                    }
                                    class82.field1480[var7++] = var237;
                                    continue;
                                }
                                if (var472 == 5011) {
                                    var6--;
                                    int var239 = class138.field2476[var6];
                                    class230 var240 = null;
                                    if (var239 < 100) {
                                        var240 = class204.field3608[var239];
                                    }
                                    if (var240 == null) {
                                        var240 = class76.field1381;
                                    }
                                    class82.field1480[var7++] = var240;
                                    continue;
                                }
                                if (var472 == 5012) {
                                    var6--;
                                    int var241 = class138.field2476[var6];
                                    int var242 = -1;
                                    if (var241 < 100) {
                                        var242 = class40.field727[var241];
                                    }
                                    class138.field2476[var6++] = var242;
                                    continue;
                                }
                                if (var472 == 5015) {
                                    class230 var243;
                                    if (class56.field1033 == null || class56.field1033.field4620 == null) {
                                        var243 = class89.field1579;
                                    } else {
                                        var243 = class56.field1033.method1806((byte) 76);
                                    }
                                    class82.field1480[var7++] = var243;
                                    continue;
                                }
                                if (var472 == 5016) {
                                    class138.field2476[var6++] = class7.field117;
                                    continue;
                                }
                                if (var472 == 5017) {
                                    class138.field2476[var6++] = class248.field4395;
                                    continue;
                                }
                                if (var472 == 5050) {
                                    var6--;
                                    int var244 = class138.field2476[var6];
                                    class82.field1480[var7++] = class117.method942(var244, true).field3264;
                                    continue;
                                }
                                if (var472 == 5051) {
                                    var6--;
                                    int var245 = class138.field2476[var6];
                                    class186 var246 = class117.method942(var245, true);
                                    if (var246.field3269 == null) {
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var246.field3269.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5052) {
                                    var6 -= 2;
                                    int var247 = class138.field2476[var6 + 1];
                                    int var248 = class138.field2476[var6];
                                    class186 var249 = class117.method942(var248, true);
                                    int var250 = var249.field3269[var247];
                                    class138.field2476[var6++] = var250;
                                    continue;
                                }
                                if (var472 == 5053) {
                                    var6--;
                                    int var251 = class138.field2476[var6];
                                    class186 var252 = class117.method942(var251, true);
                                    if (var252.field3268 == null) {
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var252.field3268.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5054) {
                                    var6 -= 2;
                                    int var253 = class138.field2476[var6 + 1];
                                    int var254 = class138.field2476[var6];
                                    class138.field2476[var6++] = class117.method942(var254, true).field3268[var253];
                                    continue;
                                }
                                if (var472 == 5055) {
                                    var6--;
                                    int var255 = class138.field2476[var6];
                                    class82.field1480[var7++] = class13.method136((byte) 81, var255).method282((byte) 107);
                                    continue;
                                }
                                if (var472 == 5056) {
                                    var6--;
                                    int var256 = class138.field2476[var6];
                                    class31 var257 = class13.method136((byte) 112, var256);
                                    if (var257.field579 == null) {
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var257.field579.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5057) {
                                    var6 -= 2;
                                    int var258 = class138.field2476[var6];
                                    int var259 = class138.field2476[var6 + 1];
                                    class138.field2476[var6++] = class13.method136((byte) 95, var258).field579[var259];
                                    continue;
                                }
                                if (var472 == 5058) {
                                    class185.field3254 = new class131();
                                    var6--;
                                    class185.field3254.field2345 = class138.field2476[var6];
                                    class185.field3254.field2355 = class13.method136((byte) 95, class185.field3254.field2345);
                                    class185.field3254.field2347 = new int[class185.field3254.field2355.method291((byte) -113)];
                                    continue;
                                }
                                if (var472 == 5059) {
                                    class153.field2747.method978(-125, 215);
                                    class153.field2747.method170((byte) 112, 0);
                                    int var260 = class153.field2747.field318;
                                    class13.field257++;
                                    class153.field2747.method170((byte) 116, 0);
                                    class153.field2747.method181(-20053, class185.field3254.field2345);
                                    class185.field3254.field2355.method288(class185.field3254.field2347, (byte) -120, class153.field2747);
                                    class153.field2747.method179(class153.field2747.field318 - var260, -114);
                                    continue;
                                }
                                if (var472 == 5060) {
                                    class113.field2028++;
                                    var7--;
                                    class230 var261 = class82.field1480[var7];
                                    class153.field2747.method978(-126, 72);
                                    class153.field2747.method170((byte) 127, 0);
                                    int var262 = class153.field2747.field318;
                                    class153.field2747.method148(var261.method1587(65), (byte) 121);
                                    class153.field2747.method181(-20053, class185.field3254.field2345);
                                    class185.field3254.field2355.method288(class185.field3254.field2347, (byte) -126, class153.field2747);
                                    class153.field2747.method179(class153.field2747.field318 - var262, -101);
                                    continue;
                                }
                                if (var472 == 5061) {
                                    class13.field257++;
                                    class153.field2747.method978(102, 215);
                                    class153.field2747.method170((byte) 112, 0);
                                    int var263 = class153.field2747.field318;
                                    class153.field2747.method170((byte) 119, 1);
                                    class153.field2747.method181(-20053, class185.field3254.field2345);
                                    class185.field3254.field2355.method288(class185.field3254.field2347, (byte) -102, class153.field2747);
                                    class153.field2747.method179(class153.field2747.field318 - var263, -16);
                                    continue;
                                }
                                if (var472 == 5062) {
                                    var6 -= 2;
                                    int var264 = class138.field2476[var6];
                                    int var265 = class138.field2476[var6 + 1];
                                    class138.field2476[var6++] = class117.method942(var264, true).field3271[var265];
                                    continue;
                                }
                                if (var472 == 5063) {
                                    var6 -= 2;
                                    int var266 = class138.field2476[var6];
                                    int var267 = class138.field2476[var6 + 1];
                                    class138.field2476[var6++] = class117.method942(var266, true).field3262[var267];
                                    continue;
                                }
                                if (var472 == 5064) {
                                    var6 -= 2;
                                    int var268 = class138.field2476[var6];
                                    int var269 = class138.field2476[var6 + 1];
                                    if (var269 == -1) {
                                        class138.field2476[var6++] = -1;
                                    } else {
                                        class138.field2476[var6++] = class117.method942(var268, true).method1333(-4, var269);
                                    }
                                    continue;
                                }
                                if (var472 == 5065) {
                                    var6 -= 2;
                                    int var270 = class138.field2476[var6];
                                    int var271 = class138.field2476[var6 + 1];
                                    if (var271 == -1) {
                                        class138.field2476[var6++] = -1;
                                    } else {
                                        class138.field2476[var6++] = class117.method942(var270, true).method1334(-127, var271);
                                    }
                                    continue;
                                }
                                if (var472 == 5066) {
                                    var6--;
                                    int var272 = class138.field2476[var6];
                                    class138.field2476[var6++] = class13.method136((byte) 112, var272).method291((byte) -113);
                                    continue;
                                }
                                if (var472 == 5067) {
                                    var6 -= 2;
                                    int var273 = class138.field2476[var6 + 1];
                                    int var274 = class138.field2476[var6];
                                    int var275 = class13.method136((byte) 57, var274).method289(var273, -121);
                                    class138.field2476[var6++] = var275;
                                    continue;
                                }
                                if (var472 == 5068) {
                                    var6 -= 2;
                                    int var276 = class138.field2476[var6];
                                    int var277 = class138.field2476[var6 + 1];
                                    class185.field3254.field2347[var276] = var277;
                                    continue;
                                }
                                if (var472 == 5069) {
                                    var6 -= 2;
                                    int var278 = class138.field2476[var6];
                                    int var279 = class138.field2476[var6 + 1];
                                    class185.field3254.field2347[var278] = var279;
                                    continue;
                                }
                                if (var472 == 5070) {
                                    var6 -= 3;
                                    int var280 = class138.field2476[var6 + 2];
                                    int var281 = class138.field2476[var6];
                                    int var282 = class138.field2476[var6 + 1];
                                    class31 var283 = class13.method136((byte) 50, var281);
                                    if (var283.method289(var282, -126) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class138.field2476[var6++] = var283.method285(-1, var282, var280);
                                    continue;
                                }
                            } else if (var472 < 5200) {
                                if (var472 == 5100) {
                                    if (class28.field515[86]) {
                                        class138.field2476[var6++] = 1;
                                    } else {
                                        class138.field2476[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5101) {
                                    if (class28.field515[82]) {
                                        class138.field2476[var6++] = 1;
                                    } else {
                                        class138.field2476[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5102) {
                                    if (class28.field515[81]) {
                                        class138.field2476[var6++] = 1;
                                    } else {
                                        class138.field2476[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var472 < 5300) {
                                if (var472 == 5200) {
                                    var6--;
                                    class131.method1033(class138.field2476[var6], 75);
                                    continue;
                                }
                                if (var472 == 5201) {
                                    class138.field2476[var6++] = class97.method822((byte) 55);
                                    continue;
                                }
                                if (var472 == 5202) {
                                    var6--;
                                    class130.method1029(class138.field2476[var6], (byte) 72);
                                    continue;
                                }
                                if (var472 == 5203) {
                                    var7--;
                                    class237.method1664(class82.field1480[var7], 31);
                                    continue;
                                }
                                if (var472 == 5204) {
                                    class82.field1480[var7 - 1] = class12.method122((byte) 82, class82.field1480[var7 - 1]);
                                    continue;
                                }
                                if (var472 == 5205) {
                                    var7--;
                                    class258.method1801((byte) -109, class82.field1480[var7]);
                                    continue;
                                }
                                if (var472 == 5206) {
                                    var6--;
                                    int var218 = class138.field2476[var6];
                                    class189 var219 = client.method1165(var218 & 0x3FFF, (var218 & 0xFFFEC85) >> 14, false);
                                    if (var219 == null) {
                                        class82.field1480[var7++] = class76.field1381;
                                    } else {
                                        class82.field1480[var7++] = var219.field3321;
                                    }
                                    continue;
                                }
                                if (var472 == 5207) {
                                    var7--;
                                    class189 var220 = class22.method244(0, class82.field1480[var7]);
                                    if (var220 != null && var220.field3333 != null) {
                                        class82.field1480[var7++] = var220.field3333;
                                        continue;
                                    }
                                    class82.field1480[var7++] = class76.field1381;
                                    continue;
                                }
                            } else if (var472 < 5400) {
                                if (var472 == 5300) {
                                    var6 -= 2;
                                    class138.field2476[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5301) {
                                    continue;
                                }
                                if (var472 == 5302) {
                                    class138.field2476[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5303) {
                                    var6--;
                                    class138.field2476[var6++] = 0;
                                    class138.field2476[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5305) {
                                    byte var155 = -1;
                                    class138.field2476[var6++] = var155;
                                    continue;
                                }
                                if (var472 == 5306) {
                                    class138.field2476[var6++] = class55.method444((byte) 123);
                                    continue;
                                }
                                if (var472 == 5307) {
                                    var6--;
                                    int var156 = class138.field2476[var6];
                                    if (var156 < 0 || var156 > 2) {
                                        var156 = 0;
                                    }
                                    class37.method335((byte) 106, var156, -1, false, -1);
                                    continue;
                                }
                                if (var472 == 5308) {
                                    class138.field2476[var6++] = class190.field3354;
                                    continue;
                                }
                                if (var472 == 5309) {
                                    var6--;
                                    int var157 = class138.field2476[var6];
                                    if (var157 < 0 || var157 > 2) {
                                        var157 = 0;
                                    }
                                    class190.field3354 = var157;
                                    class108.method887(class184.field3228, 33);
                                    continue;
                                }
                            } else if (var472 < 5500) {
                                if (var472 == 5400) {
                                    class190.field3344++;
                                    var7 -= 2;
                                    class230 var197 = class82.field1480[var7];
                                    class230 var198 = class82.field1480[var7 + 1];
                                    var6--;
                                    int var199 = class138.field2476[var6];
                                    class153.field2747.method978(-127, 124);
                                    class153.field2747.method170((byte) 116, (class17.method217((byte) 76, var197) + class17.method217((byte) -95, var198)) + 1);
                                    class153.field2747.method197(0, var197);
                                    class153.field2747.method197(0, var198);
                                    class153.field2747.method170((byte) 122, var199);
                                    continue;
                                }
                                if (var472 == 5401) {
                                    var6 -= 2;
                                    class168.field2969[class138.field2476[var6]] = (short) class38.method344(class138.field2476[var6 + 1], (byte) -45);
                                    class216.method1489(-126);
                                    class112.method898(23267);
                                    class107.method883(83);
                                    class138.method1066(-1);
                                    class229.method1580(-100);
                                    continue;
                                }
                                if (var472 == 5405) {
                                    var6 -= 2;
                                    int var200 = class138.field2476[var6];
                                    int var201 = class138.field2476[var6 + 1];
                                    if (var200 >= 0 && var200 < 2) {
                                        class84.field1490[var200] = new int[var201 << 1][4];
                                    }
                                    continue;
                                }
                                if (var472 == 5406) {
                                    var6 -= 7;
                                    int var202 = class138.field2476[var6];
                                    int var203 = class138.field2476[var6 + 1] << 1;
                                    int var204 = class138.field2476[var6 + 2];
                                    int var205 = class138.field2476[var6 + 3];
                                    int var206 = class138.field2476[var6 + 4];
                                    int var207 = class138.field2476[var6 + 5];
                                    int var208 = class138.field2476[var6 + 6];
                                    if (var202 >= 0 && var202 < 2 && class84.field1490[var202] != null && var203 >= 0 && class84.field1490[var202].length > var203) {
                                        class84.field1490[var202][var203] = new int[] { class189.method1350(16383, var204 >> 14) * 128, var205, class189.method1350(var204, 16383) * 128, var208 };
                                        class84.field1490[var202][var203 + 1] = new int[] { (class189.method1350(var206, 268428939) >> 14) * 128, var207, class189.method1350(var206, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var472 == 5407) {
                                    var6--;
                                    int var209 = class84.field1490[class138.field2476[var6]].length >> 1;
                                    class138.field2476[var6++] = var209;
                                    continue;
                                }
                                if (var472 == 5411) {
                                    if (class267.field4736 == null) {
                                        class23.method250(class156.method1191(-15168), false, (byte) -85);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var472 == 5419) {
                                    class230 var210 = class76.field1381;
                                    if (class39.field722 != null) {
                                        var210 = class255.method1789(255, class39.field722.field3420);
                                        try {
                                            if (class39.field722.field3423 != null) {
                                                byte[] var211 = ((String) class39.field722.field3423).getBytes("ISO-8859-1");
                                                var210 = class197.method1398(0, true, var211, var211.length);
                                            }
                                        } catch (UnsupportedEncodingException var470) {
                                        }
                                    }
                                    class82.field1480[var7++] = var210;
                                    continue;
                                }
                                if (var472 == 5420) {
                                    class138.field2476[var6++] = class129.field2314 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 5421) {
                                    var7--;
                                    class230 var212 = class82.field1480[var7];
                                    var6--;
                                    boolean var213 = class138.field2476[var6] == 1;
                                    class230 var214 = class173.method1267((byte) 59, new class230[] { class156.method1191(-15168), var212 });
                                    if (class267.field4736 != null || var213 && class129.field2314 != 3 && class129.field2330.startsWith("win") && !class156.field2789) {
                                        class171.field3030 = var214;
                                        class97.field1750 = var213;
                                        class172.field3040 = class184.field3228.method1017((byte) -54, new String(var214.method1622(-6274), "ISO-8859-1"));
                                        continue;
                                    }
                                    class23.method250(var214, var213, (byte) -110);
                                    continue;
                                }
                                if (var472 == 5422) {
                                    var7 -= 2;
                                    class230 var215 = class82.field1480[var7];
                                    var6--;
                                    int var216 = class138.field2476[var6];
                                    class230 var217 = class82.field1480[var7 + 1];
                                    if (var215.method1635(-128) > 0) {
                                        if (class72.field1307 == null) {
                                            class72.field1307 = new class230[class106.field1923[class144.field2580]];
                                        }
                                        class72.field1307[var216] = var215;
                                    }
                                    if (var217.method1635(-30) > 0) {
                                        if (class103.field1889 == null) {
                                            class103.field1889 = new class230[class106.field1923[class144.field2580]];
                                        }
                                        class103.field1889[var216] = var217;
                                    }
                                    continue;
                                }
                                if (var472 == 5423) {
                                    var7--;
                                    class82.field1480[var7].method1613((byte) 49);
                                    continue;
                                }
                            } else if (var472 < 5600) {
                                if (var472 == 5500) {
                                    var6 -= 4;
                                    int var185 = class138.field2476[var6 + 1];
                                    int var186 = class138.field2476[var6];
                                    int var187 = class138.field2476[var6 + 2];
                                    int var188 = class138.field2476[var6 + 3];
                                    class70.method606(((var186 & 0xFFFD684) >> 14) - class272.field4795, var188, false, 128, var185, var187, (var186 & 0x3FFF) - class155.field2759);
                                    continue;
                                }
                                if (var472 == 5501) {
                                    var6 -= 4;
                                    int var189 = class138.field2476[var6];
                                    int var190 = class138.field2476[var6 + 1];
                                    int var191 = class138.field2476[var6 + 2];
                                    int var192 = class138.field2476[var6 + 3];
                                    class16.method213((var189 & 0x3FFF) - class155.field2759, var192, ((var189 & 0xFFFF327) >> 14) - class272.field4795, (byte) -108, var190, var191);
                                    continue;
                                }
                                if (var472 == 5502) {
                                    var6 -= 6;
                                    int var193 = class138.field2476[var6];
                                    if (var193 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class202.field3572 = var193;
                                    int var194 = class138.field2476[var6 + 1];
                                    if ((var194 + 1) >= (class84.field1490[class202.field3572].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class272.field4801 = var194;
                                    class8.field139 = 0;
                                    class123.field2164 = class138.field2476[var6 + 2];
                                    class215.field3722 = class138.field2476[var6 + 3];
                                    int var195 = class138.field2476[var6 + 4];
                                    if (var195 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class33.field616 = var195;
                                    int var196 = class138.field2476[var6 + 5];
                                    if (var196 + 1 >= class84.field1490[class33.field616].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class229.field3948 = 3;
                                    class266.field4731 = var196;
                                    continue;
                                }
                                if (var472 == 5503) {
                                    class200.method1412(-75);
                                    continue;
                                }
                                if (var472 == 5504) {
                                    var6 -= 2;
                                    class71.field1298 = class138.field2476[var6];
                                    class34.field641 = class138.field2476[var6 + 1];
                                    class146.method1119((byte) -48);
                                    continue;
                                }
                                if (var472 == 5505) {
                                    class138.field2476[var6++] = class71.field1298;
                                    continue;
                                }
                                if (var472 == 5506) {
                                    class138.field2476[var6++] = class34.field641;
                                    continue;
                                }
                            } else if (var472 < 5700) {
                                if (var472 == 5600) {
                                    var6--;
                                    int var158 = class138.field2476[var6];
                                    var7 -= 2;
                                    class230 var159 = class82.field1480[var7 + 1];
                                    class230 var160 = class82.field1480[var7];
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0 && class178.field3126 == 0) {
                                        class82.method668(var160, (byte) 69, var158, var159);
                                    }
                                    continue;
                                }
                                if (var472 == 5601) {
                                    class77.method641(-47);
                                    continue;
                                }
                                if (var472 == 5602) {
                                    if (class178.field3138 == 0) {
                                        class159.field2831 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5603) {
                                    var6 -= 4;
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0 && class178.field3126 == 0) {
                                        class142.method1087(class138.field2476[var6 + 2], (byte) 95, class138.field2476[var6], class138.field2476[var6 + 1], class138.field2476[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var472 == 5604) {
                                    var7--;
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0 && class178.field3126 == 0) {
                                        class104.method874(class82.field1480[var7].method1587(127), -14163);
                                    }
                                    continue;
                                }
                                if (var472 == 5605) {
                                    var6 -= 4;
                                    var7 -= 2;
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0 && class178.field3126 == 0) {
                                        class254.method1782(class138.field2476[var6 + 1], class138.field2476[var6 + 2], class82.field1480[var7 + 1], class138.field2476[var6 + 3], (byte) -118, class138.field2476[var6], class82.field1480[var7].method1587(77));
                                    }
                                    continue;
                                }
                                if (var472 == 5606) {
                                    if (class214.field3716 == 0) {
                                        class146.field2639 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5607) {
                                    class138.field2476[var6++] = class159.field2831;
                                    continue;
                                }
                                if (var472 == 5608) {
                                    class138.field2476[var6++] = class134.field2423;
                                    continue;
                                }
                                if (var472 == 5609) {
                                    class138.field2476[var6++] = class146.field2639;
                                    continue;
                                }
                                if (var472 == 5610) {
                                    for (int var161 = 0; var161 < 5; var161++) {
                                        class82.field1480[var7++] = class222.field3801.length <= var161 ? class76.field1381 : class222.field3801[var161].method1623(-30947);
                                    }
                                    class222.field3801 = null;
                                    continue;
                                }
                                if (var472 == 5611) {
                                    class138.field2476[var6++] = class17.field387;
                                    continue;
                                }
                            } else if (var472 < 6100) {
                                if (var472 == 6001) {
                                    var6--;
                                    int var162 = class138.field2476[var6];
                                    if (var162 < 1) {
                                        var162 = 1;
                                    }
                                    if (var162 > 4) {
                                        var162 = 4;
                                    }
                                    class196.field3510 = var162;
                                    if (class196.field3510 == 1) {
                                        class3.method16(0.9F);
                                    }
                                    if (class196.field3510 == 2) {
                                        class3.method16(0.8F);
                                    }
                                    if (class196.field3510 == 3) {
                                        class3.method16(0.7F);
                                    }
                                    if (class196.field3510 == 4) {
                                        class3.method16(0.6F);
                                    }
                                    class112.method898(23267);
                                    class108.method887(class184.field3228, 42);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6002) {
                                    var6--;
                                    class123.method959(1, class138.field2476[var6] == 1);
                                    class9.method88(-100);
                                    class217.method1493(0);
                                    class127.method999((byte) 97);
                                    class108.method887(class184.field3228, 66);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6003) {
                                    var6--;
                                    class42.field774 = class138.field2476[var6] == 1;
                                    class127.method999((byte) 97);
                                    class108.method887(class184.field3228, 124);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6005) {
                                    var6--;
                                    class123.field2163 = class138.field2476[var6] == 1;
                                    class217.method1493(0);
                                    class108.method887(class184.field3228, 34);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6006) {
                                    var6--;
                                    class191.field3372 = class138.field2476[var6] == 1;
                                    ((class89) class3.field15).method724(-103, !class191.field3372);
                                    class108.method887(class184.field3228, 60);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6007) {
                                    var6--;
                                    class154.field2748 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 91);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6008) {
                                    var6--;
                                    class249.field4425 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 113);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6009) {
                                    var6--;
                                    class99.field1833 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 126);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6010) {
                                    var6--;
                                    class263.field4672 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 115);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6011) {
                                    var6--;
                                    int var163 = class138.field2476[var6];
                                    if (var163 < 0 || var163 > 2) {
                                        var163 = 0;
                                    }
                                    class206.field3633 = var163;
                                    class108.method887(class184.field3228, 82);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6012) {
                                    var6--;
                                    class8.field126 = class138.field2476[var6] == 1;
                                    if (class196.field3510 == 1) {
                                        class3.method16(0.9F);
                                    }
                                    if (class196.field3510 == 2) {
                                        class3.method16(0.8F);
                                    }
                                    if (class196.field3510 == 3) {
                                        class3.method16(0.7F);
                                    }
                                    if (class196.field3510 == 4) {
                                        class3.method16(0.6F);
                                    }
                                    class217.method1493(0);
                                    class108.method887(class184.field3228, 100);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6014) {
                                    var6--;
                                    class47.field837 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 119);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6015) {
                                    var6--;
                                    class246.field4377 = class138.field2476[var6] == 1;
                                    class108.method887(class184.field3228, 68);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6016) {
                                    var6--;
                                    int var164 = class138.field2476[var6];
                                    if (var164 < 0 || var164 > 2) {
                                        var164 = 0;
                                    }
                                    class23.field437 = var164;
                                    class108.method887(class184.field3228, 110);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6017) {
                                    var6--;
                                    class127.field2228 = class138.field2476[var6] == 1;
                                    class123.method966(2048);
                                    class108.method887(class184.field3228, 60);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6018) {
                                    var6--;
                                    int var165 = class138.field2476[var6];
                                    if (var165 < 0) {
                                        var165 = 0;
                                    }
                                    if (var165 > 127) {
                                        var165 = 127;
                                    }
                                    class97.field1790 = var165;
                                    class108.method887(class184.field3228, 52);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6019) {
                                    var6--;
                                    int var166 = class138.field2476[var6];
                                    if (var166 < 0) {
                                        var166 = 0;
                                    }
                                    if (var166 > 255) {
                                        var166 = 255;
                                    }
                                    if (class16.field365 != var166) {
                                        if (class16.field365 == 0 && class106.field1927 != -1) {
                                            class204.method1434(var166, class106.field1927, (byte) 40, 0, false, class197.field3528);
                                            class110.field1978 = false;
                                        } else if (var166 == 0) {
                                            class7.method72(-40);
                                            class110.field1978 = false;
                                        } else {
                                            class136.method1050((byte) -102, var166);
                                        }
                                        class16.field365 = var166;
                                    }
                                    class108.method887(class184.field3228, 93);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6020) {
                                    var6--;
                                    int var167 = class138.field2476[var6];
                                    if (var167 < 0) {
                                        var167 = 0;
                                    }
                                    if (var167 > 127) {
                                        var167 = 127;
                                    }
                                    class231.field4020 = var167;
                                    class108.method887(class184.field3228, 112);
                                    class270.field4778 = false;
                                    continue;
                                }
                                if (var472 == 6021) {
                                    var6--;
                                    class37.field702 = class138.field2476[var6] == 1;
                                    class127.method999((byte) 97);
                                    continue;
                                }
                            } else if (var472 < 6200) {
                                if (var472 == 6101) {
                                    class138.field2476[var6++] = class196.field3510;
                                    continue;
                                }
                                if (var472 == 6102) {
                                    class138.field2476[var6++] = class179.method1302(106) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6103) {
                                    class138.field2476[var6++] = class42.field774 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6105) {
                                    class138.field2476[var6++] = class123.field2163 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6106) {
                                    class138.field2476[var6++] = class191.field3372 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6107) {
                                    class138.field2476[var6++] = class154.field2748 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6108) {
                                    class138.field2476[var6++] = class249.field4425 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6109) {
                                    class138.field2476[var6++] = class99.field1833 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6110) {
                                    class138.field2476[var6++] = class263.field4672 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6111) {
                                    class138.field2476[var6++] = class206.field3633;
                                    continue;
                                }
                                if (var472 == 6112) {
                                    class138.field2476[var6++] = class8.field126 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6114) {
                                    class138.field2476[var6++] = class47.field837 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6115) {
                                    class138.field2476[var6++] = class246.field4377 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6116) {
                                    class138.field2476[var6++] = class23.field437;
                                    continue;
                                }
                                if (var472 == 6117) {
                                    class138.field2476[var6++] = class127.field2228 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6118) {
                                    class138.field2476[var6++] = class97.field1790;
                                    continue;
                                }
                                if (var472 == 6119) {
                                    class138.field2476[var6++] = class16.field365;
                                    continue;
                                }
                                if (var472 == 6120) {
                                    class138.field2476[var6++] = class231.field4020;
                                    continue;
                                }
                                if (var472 == 6121) {
                                    class138.field2476[var6++] = 0;
                                    continue;
                                }
                            } else if (var472 < 6300) {
                                if (var472 == 6200) {
                                    var6 -= 2;
                                    class187.field3276 = (short) class138.field2476[var6];
                                    if (class187.field3276 <= 0) {
                                        class187.field3276 = 256;
                                    }
                                    class197.field3536 = (short) class138.field2476[var6 + 1];
                                    if (class197.field3536 <= 0) {
                                        class197.field3536 = 205;
                                    }
                                    continue;
                                }
                                if (var472 == 6201) {
                                    var6 -= 2;
                                    class237.field4102 = (short) class138.field2476[var6];
                                    if (class237.field4102 <= 0) {
                                        class237.field4102 = 256;
                                    }
                                    class176.field3094 = (short) class138.field2476[var6 + 1];
                                    if (class176.field3094 <= 0) {
                                        class176.field3094 = 320;
                                    }
                                    continue;
                                }
                                if (var472 == 6202) {
                                    var6 -= 4;
                                    class158.field2824 = (short) class138.field2476[var6];
                                    if (class158.field2824 <= 0) {
                                        class158.field2824 = 1;
                                    }
                                    class150.field2679 = (short) class138.field2476[var6 + 1];
                                    if (class150.field2679 <= 0) {
                                        class150.field2679 = 32767;
                                    } else if (class158.field2824 > class150.field2679) {
                                        class150.field2679 = class158.field2824;
                                    }
                                    class132.field2400 = (short) class138.field2476[var6 + 2];
                                    if (class132.field2400 <= 0) {
                                        class132.field2400 = 1;
                                    }
                                    class23.field443 = (short) class138.field2476[var6 + 3];
                                    if (class23.field443 <= 0) {
                                        class23.field443 = 32767;
                                    } else if (class23.field443 < class132.field2400) {
                                        class23.field443 = class132.field2400;
                                    }
                                    continue;
                                }
                                if (var472 == 6203) {
                                    class92.method778(117, 0, class203.field3575.field4307, 0, class203.field3575.field4325, false);
                                    class138.field2476[var6++] = class227.field3917;
                                    class138.field2476[var6++] = class9.field161;
                                    continue;
                                }
                                if (var472 == 6204) {
                                    class138.field2476[var6++] = class237.field4102;
                                    class138.field2476[var6++] = class176.field3094;
                                    continue;
                                }
                                if (var472 == 6205) {
                                    class138.field2476[var6++] = class187.field3276;
                                    class138.field2476[var6++] = class197.field3536;
                                    continue;
                                }
                            } else if (var472 < 6400) {
                                if (var472 == 6300) {
                                    class138.field2476[var6++] = (int) (class201.method1419(5) / 60000L);
                                    continue;
                                }
                                if (var472 == 6301) {
                                    class138.field2476[var6++] = (int) (class201.method1419(5) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6302) {
                                    var6 -= 3;
                                    int var180 = class138.field2476[var6];
                                    int var181 = class138.field2476[var6 + 1];
                                    int var182 = class138.field2476[var6 + 2];
                                    class67.field1263.clear();
                                    class67.field1263.set(11, 12);
                                    class67.field1263.set(var182, var181, var180);
                                    class138.field2476[var6++] = (int) (class67.field1263.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6303) {
                                    class67.field1263.clear();
                                    class67.field1263.setTime(new Date(class201.method1419(5)));
                                    class138.field2476[var6++] = class67.field1263.get(1);
                                    continue;
                                }
                                if (var472 == 6304) {
                                    var6--;
                                    int var183 = class138.field2476[var6];
                                    boolean var184 = true;
                                    if (var183 < 0) {
                                        var184 = (var183 + 1) % 4 == 0;
                                    } else if (var183 < 1582) {
                                        var184 = var183 % 4 == 0;
                                    } else if (var183 % 4 != 0) {
                                        var184 = false;
                                    } else if (var183 % 100 != 0) {
                                        var184 = true;
                                    } else if ((var183 % 400) != 0) {
                                        var184 = false;
                                    }
                                    class138.field2476[var6++] = var184 ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6500) {
                                if (var472 == 6405) {
                                    class138.field2476[var6++] = class183.method1314((byte) 93) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6406) {
                                    class138.field2476[var6++] = class112.method901(85) ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6600) {
                                if (var472 == 6500) {
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0) {
                                        class138.field2476[var6++] = class18.method224((byte) 63) ? 1 : 0;
                                        continue;
                                    }
                                    class138.field2476[var6++] = 1;
                                    continue;
                                }
                                if (var472 == 6501) {
                                    class23 var168 = class244.method1704((byte) 52);
                                    if (var168 == null) {
                                        class138.field2476[var6++] = -1;
                                        class138.field2476[var6++] = 0;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var168.field442;
                                        class138.field2476[var6++] = var168.field2130;
                                        class82.field1480[var7++] = var168.field438;
                                        class203 var169 = var168.method247(127);
                                        class138.field2476[var6++] = var169.field3577;
                                        class82.field1480[var7++] = var169.field3579;
                                        class138.field2476[var6++] = var168.field2127;
                                    }
                                    continue;
                                }
                                if (var472 == 6502) {
                                    class23 var170 = class225.method1552(true);
                                    if (var170 == null) {
                                        class138.field2476[var6++] = -1;
                                        class138.field2476[var6++] = 0;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var170.field442;
                                        class138.field2476[var6++] = var170.field2130;
                                        class82.field1480[var7++] = var170.field438;
                                        class203 var171 = var170.method247(127);
                                        class138.field2476[var6++] = var171.field3577;
                                        class82.field1480[var7++] = var171.field3579;
                                        class138.field2476[var6++] = var170.field2127;
                                    }
                                    continue;
                                }
                                if (var472 == 6503) {
                                    var6--;
                                    int var172 = class138.field2476[var6];
                                    if (class57.field1057 == 10 && class231.field4018 == 0 && class178.field3138 == 0 && class214.field3716 == 0) {
                                        class138.field2476[var6++] = class150.method1133(var172, 30621) ? 1 : 0;
                                        continue;
                                    }
                                    class138.field2476[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 6504) {
                                    var6--;
                                    class8.field129 = class138.field2476[var6];
                                    class108.method887(class184.field3228, 112);
                                    continue;
                                }
                                if (var472 == 6505) {
                                    class138.field2476[var6++] = class8.field129;
                                    continue;
                                }
                                if (var472 == 6506) {
                                    var6--;
                                    int var173 = class138.field2476[var6];
                                    class23 var174 = class261.method1812(99, var173);
                                    if (var174 == null) {
                                        class138.field2476[var6++] = -1;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                        class82.field1480[var7++] = class76.field1381;
                                        class138.field2476[var6++] = 0;
                                    } else {
                                        class138.field2476[var6++] = var174.field2130;
                                        class82.field1480[var7++] = var174.field438;
                                        class203 var175 = var174.method247(127);
                                        class138.field2476[var6++] = var175.field3577;
                                        class82.field1480[var7++] = var175.field3579;
                                        class138.field2476[var6++] = var174.field2127;
                                    }
                                    continue;
                                }
                                if (var472 == 6507) {
                                    var6 -= 4;
                                    int var176 = class138.field2476[var6];
                                    boolean var177 = class138.field2476[var6 + 1] == 1;
                                    boolean var178 = class138.field2476[var6 + 3] == 1;
                                    int var179 = class138.field2476[var6 + 2];
                                    class65.method572(var178, var176, var179, (byte) -127, var177);
                                    continue;
                                }
                            }
                        } else if (var472 == 4500) {
                            var6 -= 2;
                            int var284 = class138.field2476[var6 + 1];
                            int var285 = class138.field2476[var6];
                            class6 var286 = class155.method1180(-125, var284);
                            if (var286.method58((byte) -87)) {
                                class82.field1480[var7++] = class244.method1701(18555, var285).method1254(0, var286.field78, var284);
                            } else {
                                class138.field2476[var6++] = class244.method1701(18555, var285).method1250(var284, 21597, var286.field74);
                            }
                            continue;
                        }
                    } else if (var472 == 4400) {
                        var6 -= 2;
                        int var287 = class138.field2476[var6];
                        int var288 = class138.field2476[var6 + 1];
                        class6 var289 = class155.method1180(-124, var288);
                        if (var289.method58((byte) -87)) {
                            class82.field1480[var7++] = class251.method1776(var287, 65280).method1378(var288, var289.field78, -98);
                        } else {
                            class138.field2476[var6++] = class251.method1776(var287, 65280).method1383(var288, var289.field74, 2);
                        }
                        continue;
                    }
                } else {
                    class245 var65;
                    if (var472 < 2000) {
                        var65 = var46 ? class273.field4804 : class142.field2564;
                    } else {
                        var6--;
                        var65 = class155.method1183(class138.field2476[var6], 17);
                        var472 -= 1000;
                    }
                    if (var472 == 1300) {
                        var6--;
                        int var66 = class138.field2476[var6] - 1;
                        if (var66 >= 0 && var66 <= 9) {
                            var7--;
                            var65.method1716(class82.field1480[var7], var66, 0);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var472 == 1301) {
                        var6 -= 2;
                        int var67 = class138.field2476[var6];
                        int var68 = class138.field2476[var6 + 1];
                        var65.field4248 = class7.method67(var68, var67, (byte) -69);
                        continue;
                    }
                    if (var472 == 1302) {
                        var6--;
                        var65.field4249 = class138.field2476[var6] == 1;
                        continue;
                    }
                    if (var472 == 1303) {
                        var6--;
                        var65.field4228 = class138.field2476[var6];
                        continue;
                    }
                    if (var472 == 1304) {
                        var6--;
                        var65.field4323 = class138.field2476[var6];
                        continue;
                    }
                    if (var472 == 1305) {
                        var7--;
                        var65.field4364 = class82.field1480[var7];
                        continue;
                    }
                    if (var472 == 1306) {
                        var7--;
                        var65.field4246 = class82.field1480[var7];
                        continue;
                    }
                    if (var472 == 1307) {
                        var65.field4202 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var471) {
            if (var5.field3927 == null) {
                if (class269.field4768 != 0) {
                    class227.method1565(class76.field1381, (byte) 45, 0, class155.field2772);
                }
                class154.method1177(var471, (byte) -46, "CS2 - scr:" + var5.field1166 + " op:" + var10);
            } else {
                class230 var467 = class214.method1481(0, 30);
                var467.method1606((byte) 41, class48.field851).method1606((byte) 41, var5.field3927);
                for (int var468 = class231.field4017 - 1; var468 >= 0; var468--) {
                    var467.method1606((byte) 41, class272.field4799).method1606((byte) 41, class80.field1462[var468].field1918.field3927);
                }
                if (var10 == 40) {
                    int var469 = var9[var11];
                    var467.method1606((byte) 41, class45.field795).method1606((byte) 41, class37.method340(var469, (byte) -26));
                }
                if (class269.field4768 != 0) {
                    class227.method1565(class76.field1381, (byte) 18, 0, class173.method1267((byte) 59, new class230[] { class147.field2657, var5.field3927 }));
                }
                class154.method1177(var471, (byte) -54, "CS2 - scr:" + var5.field1166 + " op:" + var10 + new String(var467.method1622(-6274)));
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IS)Z")
    public static final boolean method1474(int arg0, short arg1) {
        field3684++;
        if (arg1 == 44 || arg1 == 46 || arg1 == 26 || arg1 == 7 || arg1 == 25 || arg1 == 33 || arg1 == 14 || arg1 == 5) {
            return true;
        } else if (arg1 == 24 || arg1 == 42 || arg1 == 1003 || arg1 == 1001) {
            return true;
        } else if (arg1 == 31 || arg1 == 30 || arg1 == 23 || arg1 == 45 || arg1 == 22) {
            return true;
        } else if (arg0 > -41) {
            return false;
        } else {
            return arg1 == 1 || arg1 == 28 || arg1 == 18 || arg1 == 29 || arg1 == 47 || arg1 == 36;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)Z")
    public static final boolean method1475(int arg0, int arg1) {
        field3682++;
        if (arg1 == 13892) {
            return (arg0 & -arg0) == arg0;
        } else {
            return false;
        }
    }
}
