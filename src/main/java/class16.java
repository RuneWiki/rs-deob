import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class16 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lbh;")
    public static class234 field193 = new class234();

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lqi;")
    public static class216 field196 = new class216(new byte[5000]);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Ljava/lang/String;")
    public String field199;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method96(int arg0) {
        if (arg0 > 64) {
            field193 = null;
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    private static final boolean method97(boolean arg0, String arg1) {
        field200++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class185.field2675; var2++) {
            if (arg1.equalsIgnoreCase(class199.field2835[var2])) {
                return true;
            }
        }
        if (arg0) {
            method98(-60, 81, (class11) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILlg;)V")
    public static final void method98(int arg0, int arg1, class11 arg2) {
        int var3 = -96 % ((-arg1 - 28) / 32);
        Object[] var4 = arg2.field143;
        field198++;
        int var5 = (Integer) var4[0];
        class286 var6 = class166.method1086(-118, var5);
        if (var6 == null) {
            return;
        }
        int var7 = 0;
        class96.field1282 = 0;
        int var8 = 0;
        int var9 = -1;
        int[] var10 = var6.field4425;
        int[] var11 = var6.field4429;
        byte var12 = -1;
        try {
            class32.field379 = new int[var6.field4419];
            class165.field2377 = new String[var6.field4427];
            int var13 = 0;
            int var14 = 0;
            for (int var15 = 1; var15 < var4.length; var15++) {
                if (var4[var15] instanceof Integer) {
                    int var16 = (Integer) var4[var15];
                    if (var16 == -2147483647) {
                        var16 = arg2.field147;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field140;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field145 == null ? -1 : arg2.field145.field1025;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field146;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field145 == null ? -1 : arg2.field145.field963;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field153 == null ? -1 : arg2.field153.field1025;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field153 == null ? -1 : arg2.field153.field963;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field149;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field142;
                    }
                    class32.field379[var14++] = var16;
                } else if (var4[var15] instanceof String) {
                    String var17 = (String) var4[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg2.field150;
                    }
                    class165.field2377[var13++] = var17;
                }
            }
            int var18 = 0;
            label4009: while (true) {
                var18++;
                if (var18 > arg0) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var518 = var10[var9];
                if (var518 < 100) {
                    if (var518 == 0) {
                        class169.field2434[var7++] = var11[var9];
                        continue;
                    }
                    if (var518 == 1) {
                        int var19 = var11[var9];
                        class169.field2434[var7++] = class164.field2358[var19];
                        continue;
                    }
                    if (var518 == 2) {
                        int var20 = var11[var9];
                        var7--;
                        class220.method1431(class169.field2434[var7], var20, 109);
                        continue;
                    }
                    if (var518 == 3) {
                        class289.field4500[var8++] = var6.field4422[var9];
                        continue;
                    }
                    if (var518 == 6) {
                        var9 += var11[var9];
                        continue;
                    }
                    if (var518 == 7) {
                        var7 -= 2;
                        if (class169.field2434[var7 + 1] != class169.field2434[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 8) {
                        var7 -= 2;
                        if (class169.field2434[var7 + 1] == class169.field2434[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 9) {
                        var7 -= 2;
                        if (class169.field2434[var7 + 1] > class169.field2434[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 10) {
                        var7 -= 2;
                        if (class169.field2434[var7 + 1] < class169.field2434[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 21) {
                        if (class96.field1282 == 0) {
                            return;
                        }
                        class104 var21 = class232.field3346[--class96.field1282];
                        class165.field2377 = var21.field1409;
                        var9 = var21.field1414;
                        var6 = var21.field1420;
                        var11 = var6.field4429;
                        var10 = var6.field4425;
                        class32.field379 = var21.field1412;
                        continue;
                    }
                    if (var518 == 25) {
                        int var22 = var11[var9];
                        class169.field2434[var7++] = class48.method292((byte) -66, var22);
                        continue;
                    }
                    if (var518 == 27) {
                        int var23 = var11[var9];
                        var7--;
                        class153.method1004(class169.field2434[var7], var23, 12);
                        continue;
                    }
                    if (var518 == 31) {
                        var7 -= 2;
                        if (class169.field2434[var7 + 1] >= class169.field2434[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 32) {
                        var7 -= 2;
                        if (class169.field2434[var7] >= class169.field2434[var7 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var518 == 33) {
                        class169.field2434[var7++] = class32.field379[var11[var9]];
                        continue;
                    }
                    int var10001;
                    if (var518 == 34) {
                        var10001 = var11[var9];
                        var7--;
                        class32.field379[var10001] = class169.field2434[var7];
                        continue;
                    }
                    if (var518 == 35) {
                        class289.field4500[var8++] = class165.field2377[var11[var9]];
                        continue;
                    }
                    if (var518 == 36) {
                        var10001 = var11[var9];
                        var8--;
                        class165.field2377[var10001] = class289.field4500[var8];
                        continue;
                    }
                    if (var518 == 37) {
                        int var24 = var11[var9];
                        var8 -= var24;
                        String var25 = class204.method1318((byte) -125, var24, var8, class289.field4500);
                        class289.field4500[var8++] = var25;
                        continue;
                    }
                    if (var518 == 38) {
                        var7--;
                        continue;
                    }
                    if (var518 == 39) {
                        var8--;
                        continue;
                    }
                    if (var518 == 40) {
                        int var26 = var11[var9];
                        class286 var27 = class166.method1086(-126, var26);
                        int[] var28 = new int[var27.field4419];
                        String[] var29 = new String[var27.field4427];
                        for (int var30 = 0; var30 < var27.field4421; var30++) {
                            var28[var30] = class169.field2434[var7 - (var27.field4421 - var30)];
                        }
                        for (int var31 = 0; var31 < var27.field4420; var31++) {
                            var29[var31] = class289.field4500[var8 + var31 - var27.field4420];
                        }
                        var8 -= var27.field4420;
                        var7 -= var27.field4421;
                        class104 var32 = new class104();
                        var32.field1412 = class32.field379;
                        var32.field1420 = var6;
                        var32.field1409 = class165.field2377;
                        var32.field1414 = var9;
                        if (class96.field1282 >= class232.field3346.length) {
                            throw new RuntimeException();
                        }
                        var9 = -1;
                        var6 = var27;
                        class232.field3346[class96.field1282++] = var32;
                        class32.field379 = var28;
                        var11 = var27.field4429;
                        var10 = var27.field4425;
                        class165.field2377 = var29;
                        continue;
                    }
                    if (var518 == 42) {
                        class169.field2434[var7++] = class165.field2366[var11[var9]];
                        continue;
                    }
                    if (var518 == 43) {
                        int var33 = var11[var9];
                        var7--;
                        class165.field2366[var33] = class169.field2434[var7];
                        class94.method568(var33, 0);
                        continue;
                    }
                    if (var518 == 44) {
                        int var34 = var11[var9] >> 16;
                        int var35 = var11[var9] & 0xFFFF;
                        var7--;
                        int var36 = class169.field2434[var7];
                        if (var36 >= 0 && var36 <= 5000) {
                            byte var37 = -1;
                            class2.field34[var34] = var36;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var36 <= var38) {
                                    continue label4009;
                                }
                                class137.field1996[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var518 == 45) {
                        int var39 = var11[var9];
                        var7--;
                        int var40 = class169.field2434[var7];
                        if (var40 >= 0 && class2.field34[var39] > var40) {
                            class169.field2434[var7++] = class137.field1996[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var518 == 46) {
                        var7 -= 2;
                        int var41 = var11[var9];
                        int var42 = class169.field2434[var7];
                        if (var42 >= 0 && class2.field34[var41] > var42) {
                            class137.field1996[var41][var42] = class169.field2434[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var518 == 47) {
                        String var43 = class150.field2189[var11[var9]];
                        if (var43 == null) {
                            var43 = "null";
                        }
                        class289.field4500[var8++] = var43;
                        continue;
                    }
                    if (var518 == 48) {
                        int var44 = var11[var9];
                        var8--;
                        class150.field2189[var44] = class289.field4500[var8];
                        class32.method201(var44, false);
                        continue;
                    }
                    if (var518 == 51) {
                        class284 var45 = var6.field4418[var11[var9]];
                        var7--;
                        class138 var46 = (class138) var45.method1895((long) class169.field2434[var7], -124);
                        if (var46 != null) {
                            var9 += var46.field2013;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var11[var9] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var518 < 300) {
                    if (var518 == 100) {
                        var7 -= 3;
                        int var48 = class169.field2434[var7];
                        int var49 = class169.field2434[var7 + 2];
                        int var50 = class169.field2434[var7 + 1];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class82 var51 = class182.method1187((byte) -41, var48);
                        if (var51.field1034 == null) {
                            var51.field1034 = new class82[var49 + 1];
                        }
                        if (var51.field1034.length <= var49) {
                            class82[] var52 = new class82[var49 + 1];
                            for (int var53 = 0; var53 < var51.field1034.length; var53++) {
                                var52[var53] = var51.field1034[var53];
                            }
                            var51.field1034 = var52;
                        }
                        if (var49 > 0 && var51.field1034[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class82 var54 = new class82();
                        var54.field1126 = true;
                        var54.field1026 = var50;
                        var54.field1101 = var54.field1025 = var51.field1025;
                        var54.field963 = var49;
                        var51.field1034[var49] = var54;
                        if (var47) {
                            class38.field462 = var54;
                        } else {
                            class219.field3108 = var54;
                        }
                        class255.method1632(16711680, var51);
                        continue;
                    }
                    if (var518 == 101) {
                        class82 var55 = var47 ? class38.field462 : class219.field3108;
                        if (var55.field963 == -1) {
                            if (!var47) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class82 var56 = class182.method1187((byte) -41, var55.field1025);
                        var56.field1034[var55.field963] = null;
                        class255.method1632(16711680, var56);
                        continue;
                    }
                    if (var518 == 102) {
                        var7--;
                        class82 var57 = class182.method1187((byte) -41, class169.field2434[var7]);
                        var57.field1034 = null;
                        class255.method1632(16711680, var57);
                        continue;
                    }
                    if (var518 == 200) {
                        var7 -= 2;
                        int var58 = class169.field2434[var7];
                        int var59 = class169.field2434[var7 + 1];
                        class82 var60 = class112.method694(var59, false, var58);
                        if (var60 != null && var59 != -1) {
                            class169.field2434[var7++] = 1;
                            if (var47) {
                                class38.field462 = var60;
                            } else {
                                class219.field3108 = var60;
                            }
                            continue;
                        }
                        class169.field2434[var7++] = 0;
                        continue;
                    }
                    if (var518 == 201) {
                        var7--;
                        int var61 = class169.field2434[var7];
                        class82 var62 = class182.method1187((byte) -41, var61);
                        if (var62 == null) {
                            class169.field2434[var7++] = 0;
                        } else {
                            class169.field2434[var7++] = 1;
                            if (var47) {
                                class38.field462 = var62;
                            } else {
                                class219.field3108 = var62;
                            }
                        }
                        continue;
                    }
                } else if (var518 < 500) {
                    if (var518 == 403) {
                        var7 -= 2;
                        int var63 = class169.field2434[var7 + 1];
                        int var64 = class169.field2434[var7];
                        for (int var65 = 0; var65 < class185.field2682.length; var65++) {
                            if (class185.field2682[var65] == var64) {
                                class177.field2507.field3468.method870(Integer.MIN_VALUE, var63, var65);
                                continue label4009;
                            }
                        }
                        int var66 = 0;
                        while (true) {
                            if (var66 >= class173.field2483.length) {
                                continue label4009;
                            }
                            if (class173.field2483[var66] == var64) {
                                class177.field2507.field3468.method870(Integer.MIN_VALUE, var63, var66);
                                continue label4009;
                            }
                            var66++;
                        }
                    }
                    if (var518 == 404) {
                        var7 -= 2;
                        int var67 = class169.field2434[var7];
                        int var68 = class169.field2434[var7 + 1];
                        class177.field2507.field3468.method871(var68, -124, var67);
                        continue;
                    }
                    if (var518 == 410) {
                        var7--;
                        boolean var69 = class169.field2434[var7] != 0;
                        class177.field2507.field3468.method876(var69, (byte) 40);
                        continue;
                    }
                } else if (var518 >= 1000 && var518 < 1100 || var518 >= 2000 && var518 < 2100) {
                    class82 var70;
                    if (var518 < 2000) {
                        var70 = var47 ? class38.field462 : class219.field3108;
                    } else {
                        var7--;
                        var70 = class182.method1187((byte) -41, class169.field2434[var7]);
                        var518 -= 1000;
                    }
                    if (var518 == 1000) {
                        var7 -= 4;
                        var70.field1112 = class169.field2434[var7];
                        var70.field1089 = class169.field2434[var7 + 1];
                        int var71 = class169.field2434[var7 + 3];
                        int var72 = class169.field2434[var7 + 2];
                        if (var72 < 0) {
                            var72 = 0;
                        } else if (var72 > 5) {
                            var72 = 5;
                        }
                        var70.field1076 = (byte) var72;
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 5) {
                            var71 = 5;
                        }
                        var70.field1057 = (byte) var71;
                        class255.method1632(16711680, var70);
                        class240.method1564(var70, -105);
                        if (var70.field963 == -1) {
                            class271.method1739(var70.field1025, 1);
                        }
                        continue;
                    }
                    if (var518 == 1001) {
                        var7 -= 4;
                        var70.field997 = class169.field2434[var7];
                        var70.field1060 = class169.field2434[var7 + 1];
                        var70.field1094 = 0;
                        var70.field983 = 0;
                        int var73 = class169.field2434[var7 + 3];
                        int var74 = class169.field2434[var7 + 2];
                        if (var74 < 0) {
                            var74 = 0;
                        } else if (var74 > 4) {
                            var74 = 4;
                        }
                        var70.field1020 = (byte) var74;
                        if (var73 < 0) {
                            var73 = 0;
                        } else if (var73 > 4) {
                            var73 = 4;
                        }
                        var70.field1049 = (byte) var73;
                        class255.method1632(16711680, var70);
                        class240.method1564(var70, -105);
                        if (var70.field1026 == 0) {
                            class54.method324((byte) 65, var70, false);
                        }
                        continue;
                    }
                    if (var518 == 1003) {
                        var7--;
                        boolean var75 = class169.field2434[var7] == 1;
                        if (var70.field1013 != var75) {
                            var70.field1013 = var75;
                            class255.method1632(16711680, var70);
                        }
                        if (var70.field963 == -1) {
                            class164.method1075(var70.field1025, -67);
                        }
                        continue;
                    }
                    if (var518 == 1004) {
                        var7 -= 2;
                        var70.field1105 = class169.field2434[var7];
                        var70.field1006 = class169.field2434[var7 + 1];
                        class255.method1632(16711680, var70);
                        class240.method1564(var70, -105);
                        if (var70.field1026 == 0) {
                            class54.method324((byte) 84, var70, false);
                        }
                        continue;
                    }
                    if (var518 == 1005) {
                        var7--;
                        var70.field1121 = class169.field2434[var7] == 1;
                        continue;
                    }
                } else if (!(var518 < 1100 || var518 >= 1200) || !(var518 < 2100 || var518 >= 2200)) {
                    class82 var509;
                    if (var518 < 2000) {
                        var509 = var47 ? class38.field462 : class219.field3108;
                    } else {
                        var518 -= 1000;
                        var7--;
                        var509 = class182.method1187((byte) -41, class169.field2434[var7]);
                    }
                    if (var518 == 1100) {
                        var7 -= 2;
                        var509.field1125 = class169.field2434[var7];
                        if (var509.field1125 > var509.field1113 - var509.field1131) {
                            var509.field1125 = var509.field1113 - var509.field1131;
                        }
                        if (var509.field1125 < 0) {
                            var509.field1125 = 0;
                        }
                        var509.field1018 = class169.field2434[var7 + 1];
                        if ((var509.field1079 - var509.field1048) < var509.field1018) {
                            var509.field1018 = var509.field1079 - var509.field1048;
                        }
                        if (var509.field1018 < 0) {
                            var509.field1018 = 0;
                        }
                        class255.method1632(16711680, var509);
                        if (var509.field963 == -1) {
                            class216.method1389(var509.field1025, true);
                        }
                        continue;
                    }
                    if (var518 == 1101) {
                        var7--;
                        var509.field1134 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        if (var509.field963 == -1) {
                            class141.method916(-126, var509.field1025);
                        }
                        continue;
                    }
                    if (var518 == 1102) {
                        var7--;
                        var509.field1108 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1103) {
                        var7--;
                        var509.field1044 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1104) {
                        var7--;
                        var509.field1067 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1105) {
                        var7--;
                        var509.field1078 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1106) {
                        var7--;
                        var509.field1014 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1107) {
                        var7--;
                        var509.field1106 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1108) {
                        var509.field1098 = 1;
                        var7--;
                        var509.field974 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        if (var509.field963 == -1) {
                            class112.method695(var509.field1025, 0);
                        }
                        continue;
                    }
                    if (var518 == 1109) {
                        var7 -= 6;
                        var509.field1086 = class169.field2434[var7];
                        var509.field1046 = class169.field2434[var7 + 1];
                        var509.field964 = class169.field2434[var7 + 2];
                        var509.field1141 = class169.field2434[var7 + 3];
                        var509.field1085 = class169.field2434[var7 + 4];
                        var509.field1133 = class169.field2434[var7 + 5];
                        class255.method1632(16711680, var509);
                        if (var509.field963 == -1) {
                            class284.method1893(var509.field1025, (byte) 123);
                            class6.method36(10, var509.field1025);
                        }
                        continue;
                    }
                    if (var518 == 1110) {
                        var7--;
                        int var510 = class169.field2434[var7];
                        if (var509.field969 != var510) {
                            var509.field1043 = 0;
                            var509.field969 = var510;
                            var509.field1092 = 1;
                            var509.field1088 = 0;
                            class255.method1632(16711680, var509);
                        }
                        if (var509.field963 == -1) {
                            class61.method375(true, var509.field1025);
                        }
                        continue;
                    }
                    if (var518 == 1111) {
                        var7--;
                        var509.field1083 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1112) {
                        var8--;
                        String var511 = class289.field4500[var8];
                        if (!var511.equals(var509.field1123)) {
                            var509.field1123 = var511;
                            class255.method1632(16711680, var509);
                        }
                        if (var509.field963 == -1) {
                            class178.method1151(-1, var509.field1025);
                        }
                        continue;
                    }
                    if (var518 == 1113) {
                        var7--;
                        var509.field988 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1114) {
                        var7 -= 3;
                        var509.field1091 = class169.field2434[var7];
                        var509.field1065 = class169.field2434[var7 + 1];
                        var509.field1093 = class169.field2434[var7 + 2];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1115) {
                        var7--;
                        var509.field1001 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1116) {
                        var7--;
                        var509.field1047 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1117) {
                        var7--;
                        var509.field1012 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1118) {
                        var7--;
                        var509.field1062 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1119) {
                        var7--;
                        var509.field1097 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1120) {
                        var7 -= 2;
                        var509.field1113 = class169.field2434[var7];
                        var509.field1079 = class169.field2434[var7 + 1];
                        class255.method1632(16711680, var509);
                        if (var509.field1026 == 0) {
                            class54.method324((byte) 104, var509, false);
                        }
                        continue;
                    }
                    if (var518 == 1121) {
                        var7 -= 2;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1122) {
                        var7--;
                        var509.field1040 = class169.field2434[var7] == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                    if (var518 == 1123) {
                        var7--;
                        var509.field1133 = class169.field2434[var7];
                        class255.method1632(16711680, var509);
                        if (var509.field963 == -1) {
                            class284.method1893(var509.field1025, (byte) -26);
                        }
                        continue;
                    }
                    if (var518 == 1124) {
                        var7--;
                        int var512 = class169.field2434[var7];
                        var509.field1004 = var512 == 1;
                        class255.method1632(16711680, var509);
                        continue;
                    }
                } else if (var518 >= 1200 && var518 < 1300 || var518 >= 2200 && var518 < 2300) {
                    class82 var505;
                    if (var518 < 2000) {
                        var505 = var47 ? class38.field462 : class219.field3108;
                    } else {
                        var518 -= 1000;
                        var7--;
                        var505 = class182.method1187((byte) -41, class169.field2434[var7]);
                    }
                    class255.method1632(16711680, var505);
                    if (var518 == 1200 || var518 == 1205 || var518 == 1208 || var518 == 1209) {
                        var7 -= 2;
                        int var506 = class169.field2434[var7 + 1];
                        int var507 = class169.field2434[var7];
                        if (var505.field963 == -1) {
                            class167.method1095((byte) 113, var505.field1025);
                            class284.method1893(var505.field1025, (byte) -101);
                            class6.method36(10, var505.field1025);
                        }
                        if (var507 == -1) {
                            var505.field1098 = 1;
                            var505.field974 = -1;
                            var505.field1024 = -1;
                            continue;
                        }
                        var505.field987 = var506;
                        if (var518 == 1208 || var518 == 1209) {
                            var505.field1055 = true;
                        } else {
                            var505.field1055 = false;
                        }
                        var505.field1024 = var507;
                        class229 var508 = class36.method224(var507, 75);
                        var505.field964 = var508.field3283;
                        if (var518 == 1205) {
                            var505.field1054 = false;
                        } else {
                            var505.field1054 = true;
                        }
                        var505.field1046 = var508.field3237;
                        var505.field1085 = var508.field3281;
                        var505.field1133 = var508.field3271;
                        var505.field1086 = var508.field3280;
                        var505.field1141 = var508.field3279;
                        if (var505.field983 > 0) {
                            var505.field1133 = var505.field1133 * 32 / var505.field983;
                        } else if (var505.field997 > 0) {
                            var505.field1133 = var505.field1133 * 32 / var505.field997;
                        }
                        continue;
                    }
                    if (var518 == 1201) {
                        var505.field1098 = 2;
                        var7--;
                        var505.field974 = class169.field2434[var7];
                        if (var505.field963 == -1) {
                            class112.method695(var505.field1025, 0);
                        }
                        continue;
                    }
                    if (var518 == 1202) {
                        var505.field1098 = 3;
                        var505.field974 = class177.field2507.field3468.method873((byte) 93);
                        if (var505.field963 == -1) {
                            class112.method695(var505.field1025, 0);
                        }
                        continue;
                    }
                    if (var518 == 1203) {
                        var505.field1098 = 6;
                        var7--;
                        var505.field974 = class169.field2434[var7];
                        if (var505.field963 == -1) {
                            class112.method695(var505.field1025, 0);
                        }
                        continue;
                    }
                    if (var518 == 1204) {
                        var505.field1098 = 5;
                        var7--;
                        var505.field974 = class169.field2434[var7];
                        if (var505.field963 == -1) {
                            class112.method695(var505.field1025, 0);
                        }
                        continue;
                    }
                    if (var518 == 1206) {
                        var7 -= 4;
                        var505.field1071 = class169.field2434[var7];
                        var505.field1129 = class169.field2434[var7 + 1];
                        var505.field986 = class169.field2434[var7 + 2];
                        var505.field1050 = class169.field2434[var7 + 3];
                        class255.method1632(16711680, var505);
                        continue;
                    }
                    if (var518 == 1207) {
                        var7 -= 2;
                        var505.field1023 = class169.field2434[var7];
                        var505.field1028 = class169.field2434[var7 + 1];
                        class255.method1632(16711680, var505);
                        continue;
                    }
                } else if (var518 >= 1300 && var518 < 1400 || var518 >= 2300 && var518 < 2400) {
                    class82 var499;
                    if (var518 >= 2000) {
                        var518 -= 1000;
                        var7--;
                        var499 = class182.method1187((byte) -41, class169.field2434[var7]);
                    } else {
                        var499 = var47 ? class38.field462 : class219.field3108;
                    }
                    if (var518 == 1300) {
                        var7--;
                        int var500 = class169.field2434[var7] - 1;
                        if (var500 >= 0 && var500 <= 9) {
                            var8--;
                            var499.method487(class289.field4500[var8], -46, var500);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var518 == 1301) {
                        var7 -= 2;
                        int var501 = class169.field2434[var7];
                        int var502 = class169.field2434[var7 + 1];
                        var499.field1036 = class112.method694(var502, false, var501);
                        continue;
                    }
                    if (var518 == 1302) {
                        var7--;
                        var499.field1056 = class169.field2434[var7] == 1;
                        continue;
                    }
                    if (var518 == 1303) {
                        var7--;
                        var499.field1117 = class169.field2434[var7];
                        continue;
                    }
                    if (var518 == 1304) {
                        var7--;
                        var499.field1095 = class169.field2434[var7];
                        continue;
                    }
                    if (var518 == 1305) {
                        var8--;
                        var499.field1021 = class289.field4500[var8];
                        continue;
                    }
                    if (var518 == 1306) {
                        var8--;
                        var499.field1137 = class289.field4500[var8];
                        continue;
                    }
                    if (var518 == 1307) {
                        var499.field1010 = null;
                        continue;
                    }
                    if (var518 == 1308) {
                        var7--;
                        var499.field1015 = class169.field2434[var7];
                        var7--;
                        var499.field1077 = class169.field2434[var7];
                        continue;
                    }
                    if (var518 == 1309) {
                        var7--;
                        int var503 = class169.field2434[var7];
                        var7--;
                        int var504 = class169.field2434[var7];
                        if (var504 >= 1 && var504 <= 10) {
                            var499.method484(var504 - 1, var503, false);
                        }
                        continue;
                    }
                    if (var518 == 1310) {
                        var8--;
                        var499.field1059 = class289.field4500[var8];
                        continue;
                    }
                } else {
                    if (var518 >= 1400 && var518 < 1500 || var518 >= 2400 && var518 < 2500) {
                        class82 var492;
                        if (var518 >= 2000) {
                            var7--;
                            var492 = class182.method1187((byte) -41, class169.field2434[var7]);
                            var518 -= 1000;
                        } else {
                            var492 = var47 ? class38.field462 : class219.field3108;
                        }
                        var8--;
                        String var493 = class289.field4500[var8];
                        int[] var494 = null;
                        if (var493.length() > 0 && var493.charAt(var493.length() - 1) == 'Y') {
                            var7--;
                            int var495 = class169.field2434[var7];
                            if (var495 > 0) {
                                var494 = new int[var495];
                                while (var495-- > 0) {
                                    var7--;
                                    var494[var495] = class169.field2434[var7];
                                }
                            }
                            var493 = var493.substring(0, var493.length() - 1);
                        }
                        Object[] var496 = new Object[var493.length() + 1];
                        for (int var497 = var496.length - 1; var497 >= 1; var497--) {
                            if (var493.charAt(var497 - 1) == 's') {
                                var8--;
                                var496[var497] = class289.field4500[var8];
                            } else {
                                var7--;
                                var496[var497] = Integer.valueOf(class169.field2434[var7]);
                            }
                        }
                        var7--;
                        int var498 = class169.field2434[var7];
                        if (var498 == -1) {
                            var496 = null;
                        } else {
                            var496[0] = Integer.valueOf(var498);
                        }
                        if (var518 == 1400) {
                            var492.field1053 = var496;
                        } else if (var518 == 1401) {
                            var492.field1081 = var496;
                        } else if (var518 == 1402) {
                            var492.field1007 = var496;
                        } else if (var518 == 1403) {
                            var492.field1029 = var496;
                        } else if (var518 == 1404) {
                            var492.field1104 = var496;
                        } else if (var518 == 1405) {
                            var492.field1069 = var496;
                        } else if (var518 == 1406) {
                            var492.field1068 = var496;
                        } else if (var518 == 1407) {
                            var492.field971 = var496;
                            var492.field1127 = var494;
                        } else if (var518 == 1408) {
                            var492.field985 = var496;
                        } else if (var518 == 1409) {
                            var492.field1109 = var496;
                        } else if (var518 == 1410) {
                            var492.field1051 = var496;
                        } else if (var518 == 1411) {
                            var492.field981 = var496;
                        } else if (var518 == 1412) {
                            var492.field1003 = var496;
                        } else if (var518 == 1414) {
                            var492.field1058 = var494;
                            var492.field998 = var496;
                        } else if (var518 == 1415) {
                            var492.field1052 = var496;
                            var492.field1122 = var494;
                        } else if (var518 == 1416) {
                            var492.field1100 = var496;
                        } else if (var518 == 1417) {
                            var492.field1061 = var496;
                        } else if (var518 == 1418) {
                            var492.field1039 = var496;
                        } else if (var518 == 1419) {
                            var492.field1016 = var496;
                        } else if (var518 == 1420) {
                            var492.field1075 = var496;
                        } else if (var518 == 1421) {
                            var492.field1099 = var496;
                        } else if (var518 == 1422) {
                            var492.field1132 = var496;
                        } else if (var518 == 1423) {
                            var492.field972 = var496;
                        } else if (var518 == 1424) {
                            var492.field979 = var496;
                        } else if (var518 == 1425) {
                            var492.field1087 = var496;
                        } else if (var518 == 1426) {
                            var492.field1022 = var496;
                        } else if (var518 == 1427) {
                            var492.field1064 = var496;
                        } else if (var518 == 1428) {
                            var492.field1120 = var494;
                            var492.field1019 = var496;
                        } else if (var518 == 1429) {
                            var492.field1070 = var496;
                            var492.field968 = var494;
                        }
                        var492.field976 = true;
                        continue;
                    }
                    if (var518 < 1600) {
                        class82 var76 = var47 ? class38.field462 : class219.field3108;
                        if (var518 == 1500) {
                            class169.field2434[var7++] = var76.field1000;
                            continue;
                        }
                        if (var518 == 1501) {
                            class169.field2434[var7++] = var76.field1096;
                            continue;
                        }
                        if (var518 == 1502) {
                            class169.field2434[var7++] = var76.field1131;
                            continue;
                        }
                        if (var518 == 1503) {
                            class169.field2434[var7++] = var76.field1048;
                            continue;
                        }
                        if (var518 == 1504) {
                            class169.field2434[var7++] = var76.field1013 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 1505) {
                            class169.field2434[var7++] = var76.field1101;
                            continue;
                        }
                    } else if (var518 < 1700) {
                        class82 var77 = var47 ? class38.field462 : class219.field3108;
                        if (var518 == 1600) {
                            class169.field2434[var7++] = var77.field1125;
                            continue;
                        }
                        if (var518 == 1601) {
                            class169.field2434[var7++] = var77.field1018;
                            continue;
                        }
                        if (var518 == 1602) {
                            class289.field4500[var8++] = var77.field1123;
                            continue;
                        }
                        if (var518 == 1603) {
                            class169.field2434[var7++] = var77.field1113;
                            continue;
                        }
                        if (var518 == 1604) {
                            class169.field2434[var7++] = var77.field1079;
                            continue;
                        }
                        if (var518 == 1605) {
                            class169.field2434[var7++] = var77.field1133;
                            continue;
                        }
                        if (var518 == 1606) {
                            class169.field2434[var7++] = var77.field964;
                            continue;
                        }
                        if (var518 == 1607) {
                            class169.field2434[var7++] = var77.field1085;
                            continue;
                        }
                        if (var518 == 1608) {
                            class169.field2434[var7++] = var77.field1141;
                            continue;
                        }
                        if (var518 == 1609) {
                            class169.field2434[var7++] = var77.field1044;
                            continue;
                        }
                        if (var518 == 1610) {
                            class169.field2434[var7++] = var77.field1086;
                            continue;
                        }
                        if (var518 == 1611) {
                            class169.field2434[var7++] = var77.field1046;
                            continue;
                        }
                        if (var518 == 1612) {
                            class169.field2434[var7++] = var77.field1078;
                            continue;
                        }
                    } else if (var518 < 1800) {
                        class82 var78 = var47 ? class38.field462 : class219.field3108;
                        if (var518 == 1700) {
                            class169.field2434[var7++] = var78.field1024;
                            continue;
                        }
                        if (var518 == 1701) {
                            if (var78.field1024 == -1) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = var78.field987;
                            }
                            continue;
                        }
                        if (var518 == 1702) {
                            class169.field2434[var7++] = var78.field963;
                            continue;
                        }
                    } else if (var518 < 1900) {
                        class82 var79 = var47 ? class38.field462 : class219.field3108;
                        if (var518 == 1800) {
                            class169.field2434[var7++] = client.method1920(var79).method1159(false);
                            continue;
                        }
                        if (var518 == 1801) {
                            var7--;
                            int var80 = class169.field2434[var7];
                            int var519 = var80 - 1;
                            if (var79.field1010 != null && var79.field1010.length > var519 && var79.field1010[var519] != null) {
                                class289.field4500[var8++] = var79.field1010[var519];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 1802) {
                            if (var79.field1021 == null) {
                                class289.field4500[var8++] = "";
                            } else {
                                class289.field4500[var8++] = var79.field1021;
                            }
                            continue;
                        }
                    } else if (var518 < 2600) {
                        var7--;
                        class82 var81 = class182.method1187((byte) -41, class169.field2434[var7]);
                        if (var518 == 2500) {
                            class169.field2434[var7++] = var81.field1000;
                            continue;
                        }
                        if (var518 == 2501) {
                            class169.field2434[var7++] = var81.field1096;
                            continue;
                        }
                        if (var518 == 2502) {
                            class169.field2434[var7++] = var81.field1131;
                            continue;
                        }
                        if (var518 == 2503) {
                            class169.field2434[var7++] = var81.field1048;
                            continue;
                        }
                        if (var518 == 2504) {
                            class169.field2434[var7++] = var81.field1013 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 2505) {
                            class169.field2434[var7++] = var81.field1101;
                            continue;
                        }
                    } else if (var518 < 2700) {
                        var7--;
                        class82 var491 = class182.method1187((byte) -41, class169.field2434[var7]);
                        if (var518 == 2600) {
                            class169.field2434[var7++] = var491.field1125;
                            continue;
                        }
                        if (var518 == 2601) {
                            class169.field2434[var7++] = var491.field1018;
                            continue;
                        }
                        if (var518 == 2602) {
                            class289.field4500[var8++] = var491.field1123;
                            continue;
                        }
                        if (var518 == 2603) {
                            class169.field2434[var7++] = var491.field1113;
                            continue;
                        }
                        if (var518 == 2604) {
                            class169.field2434[var7++] = var491.field1079;
                            continue;
                        }
                        if (var518 == 2605) {
                            class169.field2434[var7++] = var491.field1133;
                            continue;
                        }
                        if (var518 == 2606) {
                            class169.field2434[var7++] = var491.field964;
                            continue;
                        }
                        if (var518 == 2607) {
                            class169.field2434[var7++] = var491.field1085;
                            continue;
                        }
                        if (var518 == 2608) {
                            class169.field2434[var7++] = var491.field1141;
                            continue;
                        }
                        if (var518 == 2609) {
                            class169.field2434[var7++] = var491.field1044;
                            continue;
                        }
                        if (var518 == 2610) {
                            class169.field2434[var7++] = var491.field1086;
                            continue;
                        }
                        if (var518 == 2611) {
                            class169.field2434[var7++] = var491.field1046;
                            continue;
                        }
                        if (var518 == 2612) {
                            class169.field2434[var7++] = var491.field1078;
                            continue;
                        }
                    } else if (var518 < 2800) {
                        if (var518 == 2700) {
                            var7--;
                            class82 var481 = class182.method1187((byte) -41, class169.field2434[var7]);
                            class169.field2434[var7++] = var481.field1024;
                            continue;
                        }
                        if (var518 == 2701) {
                            var7--;
                            class82 var482 = class182.method1187((byte) -41, class169.field2434[var7]);
                            if (var482.field1024 == -1) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = var482.field987;
                            }
                            continue;
                        }
                        if (var518 == 2702) {
                            var7--;
                            int var483 = class169.field2434[var7];
                            class166 var484 = (class166) class189.field2705.method1895((long) var483, -113);
                            if (var484 == null) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = 1;
                            }
                            continue;
                        }
                        if (var518 == 2703) {
                            var7--;
                            class82 var485 = class182.method1187((byte) -41, class169.field2434[var7]);
                            if (var485.field1034 == null) {
                                class169.field2434[var7++] = 0;
                                continue;
                            }
                            int var486 = var485.field1034.length;
                            for (int var487 = 0; var487 < var485.field1034.length; var487++) {
                                if (var485.field1034[var487] == null) {
                                    var486 = var487;
                                    break;
                                }
                            }
                            class169.field2434[var7++] = var486;
                            continue;
                        }
                        if (var518 == 2704 || var518 == 2705) {
                            var7 -= 2;
                            int var488 = class169.field2434[var7 + 1];
                            int var489 = class169.field2434[var7];
                            class166 var490 = (class166) class189.field2705.method1895((long) var489, -119);
                            if (var490 != null && var490.field2395 == var488) {
                                class169.field2434[var7++] = 1;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                    } else if (var518 < 2900) {
                        var7--;
                        class82 var479 = class182.method1187((byte) -41, class169.field2434[var7]);
                        if (var518 == 2800) {
                            class169.field2434[var7++] = client.method1920(var479).method1159(false);
                            continue;
                        }
                        if (var518 == 2801) {
                            var7--;
                            int var480 = class169.field2434[var7];
                            int var520 = var480 - 1;
                            if (var479.field1010 != null && var479.field1010.length > var520 && var479.field1010[var520] != null) {
                                class289.field4500[var8++] = var479.field1010[var520];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 2802) {
                            if (var479.field1021 == null) {
                                class289.field4500[var8++] = "";
                            } else {
                                class289.field4500[var8++] = var479.field1021;
                            }
                            continue;
                        }
                    } else if (var518 < 3200) {
                        if (var518 == 3100) {
                            var8--;
                            String var82 = class289.field4500[var8];
                            class225.method1455(var82, 15, "", 0);
                            continue;
                        }
                        if (var518 == 3101) {
                            var7 -= 2;
                            class203.method1312(class169.field2434[var7], class177.field2507, class169.field2434[var7 + 1], (byte) 107);
                            continue;
                        }
                        if (var518 == 3103) {
                            class142.method922((byte) 114);
                            continue;
                        }
                        if (var518 == 3104) {
                            class269.field3930++;
                            var8--;
                            String var83 = class289.field4500[var8];
                            int var84 = 0;
                            if (class229.method1481(var83, -128)) {
                                var84 = class101.method623(105, var83);
                            }
                            class94.field1259.method592(173, false);
                            class94.field1259.method1410(var84, (byte) 105);
                            continue;
                        }
                        if (var518 == 3105) {
                            class166.field2388++;
                            var8--;
                            String var85 = class289.field4500[var8];
                            class94.field1259.method592(68, false);
                            class94.field1259.method1379(-74, class60.method370((byte) -8, var85));
                            continue;
                        }
                        if (var518 == 3106) {
                            class170.field2442++;
                            var8--;
                            String var86 = class289.field4500[var8];
                            class94.field1259.method592(208, false);
                            class94.field1259.method1373(var86.length() + 1, -13985);
                            class94.field1259.method1353(var86, (byte) -115);
                            continue;
                        }
                        if (var518 == 3107) {
                            var8--;
                            String var87 = class289.field4500[var8];
                            var7--;
                            int var88 = class169.field2434[var7];
                            class51.method305(var88, var87, (byte) 38);
                            continue;
                        }
                        if (var518 == 3108) {
                            var7 -= 3;
                            int var89 = class169.field2434[var7];
                            int var90 = class169.field2434[var7 + 1];
                            int var91 = class169.field2434[var7 + 2];
                            class82 var92 = class182.method1187((byte) -41, var91);
                            class54.method326(var92, var90, 123, var89);
                            continue;
                        }
                        if (var518 == 3109) {
                            var7 -= 2;
                            int var93 = class169.field2434[var7];
                            int var94 = class169.field2434[var7 + 1];
                            class82 var95 = var47 ? class38.field462 : class219.field3108;
                            class54.method326(var95, var94, 120, var93);
                            continue;
                        }
                        if (var518 == 3110) {
                            class258.field3748++;
                            var7--;
                            int var96 = class169.field2434[var7];
                            class94.field1259.method592(0, false);
                            class94.field1259.method1387(var96, 4);
                            continue;
                        }
                    } else if (var518 < 3300) {
                        if (var518 == 3200) {
                            var7 -= 3;
                            class222.method1442(class169.field2434[var7 + 2], class169.field2434[var7 + 1], 255, -1, class169.field2434[var7]);
                            continue;
                        }
                        if (var518 == 3201) {
                            var7--;
                            class42.method262(true, class169.field2434[var7], 255);
                            continue;
                        }
                        if (var518 == 3202) {
                            var7 -= 2;
                            class72.method444((byte) -68, class169.field2434[var7 + 1], 255, class169.field2434[var7]);
                            continue;
                        }
                    } else if (var518 < 3400) {
                        if (var518 == 3300) {
                            class169.field2434[var7++] = class198.field2819;
                            continue;
                        }
                        if (var518 == 3301) {
                            var7 -= 2;
                            int var97 = class169.field2434[var7];
                            int var98 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class188.method1236(var97, var98, -119);
                            continue;
                        }
                        if (var518 == 3302) {
                            var7 -= 2;
                            int var99 = class169.field2434[var7];
                            int var100 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class251.method1616(var99, var100, 128);
                            continue;
                        }
                        if (var518 == 3303) {
                            var7 -= 2;
                            int var101 = class169.field2434[var7];
                            int var102 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class144.method932(var101, (byte) 119, var102);
                            continue;
                        }
                        if (var518 == 3304) {
                            var7--;
                            int var103 = class169.field2434[var7];
                            class169.field2434[var7++] = class144.method930(var103, 0).field2551;
                            continue;
                        }
                        if (var518 == 3305) {
                            var7--;
                            int var104 = class169.field2434[var7];
                            class169.field2434[var7++] = class283.field4312[var104];
                            continue;
                        }
                        if (var518 == 3306) {
                            var7--;
                            int var105 = class169.field2434[var7];
                            class169.field2434[var7++] = class124.field1786[var105];
                            continue;
                        }
                        if (var518 == 3307) {
                            var7--;
                            int var106 = class169.field2434[var7];
                            class169.field2434[var7++] = class54.field637[var106];
                            continue;
                        }
                        if (var518 == 3308) {
                            int var107 = class199.field2833;
                            int var108 = (class177.field2507.field4563 >> 7) + class110.field1473;
                            int var109 = (class177.field2507.field4553 >> 7) + class166.field2383;
                            class169.field2434[var7++] = (var108 << 14) + (var107 << 28) + var109;
                            continue;
                        }
                        if (var518 == 3309) {
                            var7--;
                            int var110 = class169.field2434[var7];
                            class169.field2434[var7++] = class5.method26(var110, 268431439) >> 14;
                            continue;
                        }
                        if (var518 == 3310) {
                            var7--;
                            int var111 = class169.field2434[var7];
                            class169.field2434[var7++] = var111 >> 28;
                            continue;
                        }
                        if (var518 == 3311) {
                            var7--;
                            int var112 = class169.field2434[var7];
                            class169.field2434[var7++] = class5.method26(var112, 16383);
                            continue;
                        }
                        if (var518 == 3312) {
                            class169.field2434[var7++] = class263.field3809 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3313) {
                            var7 -= 2;
                            int var113 = class169.field2434[var7] + 32768;
                            int var114 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class188.method1236(var113, var114, -127);
                            continue;
                        }
                        if (var518 == 3314) {
                            var7 -= 2;
                            int var115 = class169.field2434[var7 + 1];
                            int var116 = class169.field2434[var7] + 32768;
                            class169.field2434[var7++] = class251.method1616(var116, var115, 128);
                            continue;
                        }
                        if (var518 == 3315) {
                            var7 -= 2;
                            int var117 = class169.field2434[var7] + 32768;
                            int var118 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class144.method932(var117, (byte) 106, var118);
                            continue;
                        }
                        if (var518 == 3316) {
                            if (class88.field1192 >= 2) {
                                class169.field2434[var7++] = class88.field1192;
                            } else {
                                class169.field2434[var7++] = 0;
                            }
                            continue;
                        }
                        if (var518 == 3317) {
                            class169.field2434[var7++] = class206.field2931;
                            continue;
                        }
                        if (var518 == 3318) {
                            class169.field2434[var7++] = class210.field2952;
                            continue;
                        }
                        if (var518 == 3321) {
                            class169.field2434[var7++] = class260.field3790;
                            continue;
                        }
                        if (var518 == 3322) {
                            class169.field2434[var7++] = class103.field1399;
                            continue;
                        }
                        if (var518 == 3323) {
                            if (class88.field1191 >= 5 && class88.field1191 <= 9) {
                                class169.field2434[var7++] = 1;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3324) {
                            if (class88.field1191 >= 5 && class88.field1191 <= 9) {
                                class169.field2434[var7++] = class88.field1191;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3325) {
                            class169.field2434[var7++] = class204.field2899 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3326) {
                            class169.field2434[var7++] = class177.field2507.field3472;
                            continue;
                        }
                        if (var518 == 3327) {
                            class169.field2434[var7++] = class177.field2507.field3468.field1964 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3328) {
                            class169.field2434[var7++] = class252.field3647 && !class143.field2048 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3329) {
                            class169.field2434[var7++] = class44.field527 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3330) {
                            var7--;
                            int var119 = class169.field2434[var7];
                            class169.field2434[var7++] = class267.method1705(95, var119);
                            continue;
                        }
                        if (var518 == 3331) {
                            var7 -= 2;
                            int var120 = class169.field2434[var7];
                            int var121 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class185.method1200(var120, false, var121, (byte) 81);
                            continue;
                        }
                        if (var518 == 3332) {
                            var7 -= 2;
                            int var122 = class169.field2434[var7];
                            int var123 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class185.method1200(var122, true, var123, (byte) 76);
                            continue;
                        }
                        if (var518 == 3333) {
                            class169.field2434[var7++] = class66.field787;
                            continue;
                        }
                        if (var518 == 3335) {
                            class169.field2434[var7++] = class146.field2156;
                            continue;
                        }
                        if (var518 == 3336) {
                            var7 -= 4;
                            int var124 = class169.field2434[var7 + 2];
                            int var125 = class169.field2434[var7];
                            int var126 = class169.field2434[var7 + 3];
                            int var127 = class169.field2434[var7 + 1];
                            int var128 = (var127 << 14) + var125;
                            int var129 = (var124 << 28) + var128;
                            int var130 = var126 + var129;
                            class169.field2434[var7++] = var130;
                            continue;
                        }
                        if (var518 == 3337) {
                            class169.field2434[var7++] = class133.field1939;
                            continue;
                        }
                    } else if (var518 < 3500) {
                        if (var518 == 3400) {
                            var7 -= 2;
                            int var131 = class169.field2434[var7 + 1];
                            int var132 = class169.field2434[var7];
                            class203 var133 = class253.method1622(-122, var132);
                            class289.field4500[var8++] = var133.method1303(-5, var131);
                            continue;
                        }
                        if (var518 == 3408) {
                            var7 -= 4;
                            int var134 = class169.field2434[var7];
                            int var135 = class169.field2434[var7 + 2];
                            int var136 = class169.field2434[var7 + 3];
                            int var137 = class169.field2434[var7 + 1];
                            class203 var138 = class253.method1622(-86, var135);
                            if (var138.field2887 == var134 && var138.field2877 == var137) {
                                if (var137 == 115) {
                                    class289.field4500[var8++] = var138.method1303(-5, var136);
                                } else {
                                    class169.field2434[var7++] = var138.method1307(var136, (byte) -22);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var518 == 3409) {
                            var7 -= 3;
                            int var139 = class169.field2434[var7 + 2];
                            int var140 = class169.field2434[var7];
                            int var141 = class169.field2434[var7 + 1];
                            if (var141 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class203 var142 = class253.method1622(-86, var141);
                            if (var142.field2877 != var140) {
                                throw new RuntimeException("C3409-1");
                            }
                            class169.field2434[var7++] = var142.method1309(var139, -24204) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3410) {
                            var7--;
                            int var143 = class169.field2434[var7];
                            var8--;
                            String var144 = class289.field4500[var8];
                            if (var143 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class203 var145 = class253.method1622(-48, var143);
                            if (var145.field2877 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class169.field2434[var7++] = var145.method1310(true, var144) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3411) {
                            var7--;
                            int var146 = class169.field2434[var7];
                            class203 var147 = class253.method1622(-127, var146);
                            class169.field2434[var7++] = var147.field2869.method1892(false);
                            continue;
                        }
                    } else if (var518 < 3700) {
                        if (var518 == 3600) {
                            if (class259.field3776 == 0) {
                                class169.field2434[var7++] = -2;
                            } else if (class259.field3776 == 1) {
                                class169.field2434[var7++] = -1;
                            } else {
                                class169.field2434[var7++] = class144.field2064;
                            }
                            continue;
                        }
                        if (var518 == 3601) {
                            var7--;
                            int var455 = class169.field2434[var7];
                            if (class259.field3776 == 2 && class144.field2064 > var455) {
                                class289.field4500[var8++] = class82.field990[var455];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 3602) {
                            var7--;
                            int var456 = class169.field2434[var7];
                            if (class259.field3776 == 2 && var456 < class144.field2064) {
                                class169.field2434[var7++] = class143.field2046[var456];
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3603) {
                            var7--;
                            int var457 = class169.field2434[var7];
                            if (class259.field3776 == 2 && var457 < class144.field2064) {
                                class169.field2434[var7++] = class274.field4102[var457];
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3604) {
                            var8--;
                            String var458 = class289.field4500[var8];
                            var7--;
                            int var459 = class169.field2434[var7];
                            class248.method1601(false, var459, var458);
                            continue;
                        }
                        if (var518 == 3605) {
                            var8--;
                            String var460 = class289.field4500[var8];
                            class142.method923(class60.method370((byte) -8, var460), -201);
                            continue;
                        }
                        if (var518 == 3606) {
                            var8--;
                            String var461 = class289.field4500[var8];
                            class159.method1062(class60.method370((byte) -8, var461), 94);
                            continue;
                        }
                        if (var518 == 3607) {
                            var8--;
                            String var462 = class289.field4500[var8];
                            class259.method1655(class60.method370((byte) -8, var462), (byte) 95, false);
                            continue;
                        }
                        if (var518 == 3608) {
                            var8--;
                            String var463 = class289.field4500[var8];
                            class291.method1951(class60.method370((byte) -8, var463), 20697);
                            continue;
                        }
                        if (var518 == 3609) {
                            var8--;
                            String var464 = class289.field4500[var8];
                            if (var464.startsWith("<img=0>") || var464.startsWith("<img=1>")) {
                                var464 = var464.substring(7);
                            }
                            class169.field2434[var7++] = class203.method1306(-117, var464) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3610) {
                            var7--;
                            int var465 = class169.field2434[var7];
                            if (class259.field3776 == 2 && class144.field2064 > var465) {
                                class289.field4500[var8++] = class59.field691[var465];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 3611) {
                            if (class66.field776 == null) {
                                class289.field4500[var8++] = "";
                            } else {
                                class289.field4500[var8++] = class107.method674(class66.field776, (byte) -118);
                            }
                            continue;
                        }
                        if (var518 == 3612) {
                            if (class66.field776 == null) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = class34.field401;
                            }
                            continue;
                        }
                        if (var518 == 3613) {
                            var7--;
                            int var466 = class169.field2434[var7];
                            if (class66.field776 != null && class34.field401 > var466) {
                                class289.field4500[var8++] = class107.method674(class38.field455[var466].field709, (byte) -108);
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 3614) {
                            var7--;
                            int var467 = class169.field2434[var7];
                            if (class66.field776 != null && class34.field401 > var467) {
                                class169.field2434[var7++] = class38.field455[var467].field706;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3615) {
                            var7--;
                            int var468 = class169.field2434[var7];
                            if (class66.field776 != null && class34.field401 > var468) {
                                class169.field2434[var7++] = class38.field455[var468].field717;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3616) {
                            class169.field2434[var7++] = class95.field1278;
                            continue;
                        }
                        if (var518 == 3617) {
                            var8--;
                            String var469 = class289.field4500[var8];
                            class99.method596(var469, (byte) 80);
                            continue;
                        }
                        if (var518 == 3618) {
                            class169.field2434[var7++] = class112.field1486;
                            continue;
                        }
                        if (var518 == 3619) {
                            var8--;
                            String var470 = class289.field4500[var8];
                            class179.method1167(class60.method370((byte) -8, var470), 0);
                            continue;
                        }
                        if (var518 == 3620) {
                            class17.method106(68);
                            continue;
                        }
                        if (var518 == 3621) {
                            if (class259.field3776 == 0) {
                                class169.field2434[var7++] = -1;
                            } else {
                                class169.field2434[var7++] = class185.field2675;
                            }
                            continue;
                        }
                        if (var518 == 3622) {
                            var7--;
                            int var471 = class169.field2434[var7];
                            if (class259.field3776 != 0 && var471 < class185.field2675) {
                                class289.field4500[var8++] = class110.method686(class209.field2945[var471], true);
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 3623) {
                            var8--;
                            String var472 = class289.field4500[var8];
                            if (var472.startsWith("<img=0>") || var472.startsWith("<img=1>")) {
                                var472 = var472.substring(7);
                            }
                            class169.field2434[var7++] = method97(false, var472) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3624) {
                            var7--;
                            int var473 = class169.field2434[var7];
                            if (class38.field455 != null && class34.field401 > var473 && class38.field455[var473].field709.equalsIgnoreCase(class177.field2507.field3466)) {
                                class169.field2434[var7++] = 1;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3625) {
                            if (class17.field211 == null) {
                                class289.field4500[var8++] = "";
                            } else {
                                class289.field4500[var8++] = class107.method674(class17.field211, (byte) -99);
                            }
                            continue;
                        }
                        if (var518 == 3626) {
                            var7--;
                            int var474 = class169.field2434[var7];
                            if (class66.field776 != null && var474 < class34.field401) {
                                class289.field4500[var8++] = class38.field455[var474].field714;
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 3627) {
                            var7--;
                            int var475 = class169.field2434[var7];
                            if (class259.field3776 == 2 && var475 >= 0 && var475 < class144.field2064) {
                                class169.field2434[var7++] = class287.field4455[var475] ? 1 : 0;
                                continue;
                            }
                            class169.field2434[var7++] = 0;
                            continue;
                        }
                        if (var518 == 3628) {
                            var8--;
                            String var476 = class289.field4500[var8];
                            if (var476.startsWith("<img=0>") || var476.startsWith("<img=1>")) {
                                var476 = var476.substring(7);
                            }
                            class169.field2434[var7++] = class249.method1604(var476, true);
                            continue;
                        }
                        if (var518 == 3629) {
                            class169.field2434[var7++] = class117.field1654;
                            continue;
                        }
                        if (var518 == 3630) {
                            var8--;
                            String var477 = class289.field4500[var8];
                            class259.method1655(class60.method370((byte) -8, var477), (byte) 114, true);
                            continue;
                        }
                        if (var518 == 3631) {
                            var7--;
                            int var478 = class169.field2434[var7];
                            class169.field2434[var7++] = class260.field3781[var478] ? 1 : 0;
                            continue;
                        }
                    } else if (var518 < 4000) {
                        if (var518 == 3903) {
                            var7--;
                            int var441 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var441].method514((byte) 4);
                            continue;
                        }
                        if (var518 == 3904) {
                            var7--;
                            int var442 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var442].field1199;
                            continue;
                        }
                        if (var518 == 3905) {
                            var7--;
                            int var443 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var443].field1195;
                            continue;
                        }
                        if (var518 == 3906) {
                            var7--;
                            int var444 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var444].field1201;
                            continue;
                        }
                        if (var518 == 3907) {
                            var7--;
                            int var445 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var445].field1187;
                            continue;
                        }
                        if (var518 == 3908) {
                            var7--;
                            int var446 = class169.field2434[var7];
                            class169.field2434[var7++] = class95.field1268[var446].field1203;
                            continue;
                        }
                        if (var518 == 3910) {
                            var7--;
                            int var447 = class169.field2434[var7];
                            int var448 = class95.field1268[var447].method515((byte) -91);
                            class169.field2434[var7++] = var448 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3911) {
                            var7--;
                            int var449 = class169.field2434[var7];
                            int var450 = class95.field1268[var449].method515((byte) -91);
                            class169.field2434[var7++] = var450 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3912) {
                            var7--;
                            int var451 = class169.field2434[var7];
                            int var452 = class95.field1268[var451].method515((byte) -91);
                            class169.field2434[var7++] = var452 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 3913) {
                            var7--;
                            int var453 = class169.field2434[var7];
                            int var454 = class95.field1268[var453].method515((byte) -91);
                            class169.field2434[var7++] = var454 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var518 < 4100) {
                        if (var518 == 4000) {
                            var7 -= 2;
                            int var396 = class169.field2434[var7];
                            int var397 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var396 + var397;
                            continue;
                        }
                        if (var518 == 4001) {
                            var7 -= 2;
                            int var398 = class169.field2434[var7];
                            int var399 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var398 - var399;
                            continue;
                        }
                        if (var518 == 4002) {
                            var7 -= 2;
                            int var400 = class169.field2434[var7 + 1];
                            int var401 = class169.field2434[var7];
                            class169.field2434[var7++] = var400 * var401;
                            continue;
                        }
                        if (var518 == 4003) {
                            var7 -= 2;
                            int var402 = class169.field2434[var7 + 1];
                            int var403 = class169.field2434[var7];
                            class169.field2434[var7++] = var403 / var402;
                            continue;
                        }
                        if (var518 == 4004) {
                            var7--;
                            int var404 = class169.field2434[var7];
                            class169.field2434[var7++] = (int) ((double) var404 * Math.random());
                            continue;
                        }
                        if (var518 == 4005) {
                            var7--;
                            int var405 = class169.field2434[var7];
                            class169.field2434[var7++] = (int) (Math.random() * (double) (var405 + 1));
                            continue;
                        }
                        if (var518 == 4006) {
                            var7 -= 5;
                            int var406 = class169.field2434[var7];
                            int var407 = class169.field2434[var7 + 1];
                            int var408 = class169.field2434[var7 + 2];
                            int var409 = class169.field2434[var7 + 3];
                            int var410 = class169.field2434[var7 + 4];
                            class169.field2434[var7++] = (var407 - var406) * (var410 - var408) / (var409 - var408) + var406;
                            continue;
                        }
                        if (var518 == 4007) {
                            var7 -= 2;
                            long var411 = (long) class169.field2434[var7 + 1];
                            long var413 = (long) class169.field2434[var7];
                            class169.field2434[var7++] = (int) (var411 * var413 / 100L + var413);
                            continue;
                        }
                        if (var518 == 4008) {
                            var7 -= 2;
                            int var415 = class169.field2434[var7 + 1];
                            int var416 = class169.field2434[var7];
                            class169.field2434[var7++] = class220.method1432(0x1 << var415, var416);
                            continue;
                        }
                        if (var518 == 4009) {
                            var7 -= 2;
                            int var417 = class169.field2434[var7];
                            int var418 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class5.method26(-(0x1 << var418) - 1, var417);
                            continue;
                        }
                        if (var518 == 4010) {
                            var7 -= 2;
                            int var419 = class169.field2434[var7];
                            int var420 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class5.method26(0x1 << var420, var419) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var518 == 4011) {
                            var7 -= 2;
                            int var421 = class169.field2434[var7];
                            int var422 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var421 % var422;
                            continue;
                        }
                        if (var518 == 4012) {
                            var7 -= 2;
                            int var423 = class169.field2434[var7];
                            int var424 = class169.field2434[var7 + 1];
                            if (var423 == 0) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = (int) Math.pow((double) var423, (double) var424);
                            }
                            continue;
                        }
                        if (var518 == 4013) {
                            var7 -= 2;
                            int var425 = class169.field2434[var7];
                            int var426 = class169.field2434[var7 + 1];
                            if (var425 == 0) {
                                class169.field2434[var7++] = 0;
                            } else if (var426 == 0) {
                                class169.field2434[var7++] = Integer.MAX_VALUE;
                            } else {
                                class169.field2434[var7++] = (int) Math.pow((double) var425, 1.0D / (double) var426);
                            }
                            continue;
                        }
                        if (var518 == 4014) {
                            var7 -= 2;
                            int var427 = class169.field2434[var7];
                            int var428 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class5.method26(var427, var428);
                            continue;
                        }
                        if (var518 == 4015) {
                            var7 -= 2;
                            int var429 = class169.field2434[var7];
                            int var430 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class220.method1432(var429, var430);
                            continue;
                        }
                        if (var518 == 4016) {
                            var7 -= 2;
                            int var431 = class169.field2434[var7];
                            int var432 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var432 > var431 ? var431 : var432;
                            continue;
                        }
                        if (var518 == 4017) {
                            var7 -= 2;
                            int var433 = class169.field2434[var7];
                            int var434 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var433 > var434 ? var433 : var434;
                            continue;
                        }
                        if (var518 == 4018) {
                            var7 -= 3;
                            long var435 = (long) class169.field2434[var7 + 1];
                            long var437 = (long) class169.field2434[var7];
                            long var439 = (long) class169.field2434[var7 + 2];
                            class169.field2434[var7++] = (int) (var437 * var439 / var435);
                            continue;
                        }
                    } else if (var518 < 4200) {
                        if (var518 == 4100) {
                            var8--;
                            String var148 = class289.field4500[var8];
                            var7--;
                            int var149 = class169.field2434[var7];
                            class289.field4500[var8++] = var148 + var149;
                            continue;
                        }
                        if (var518 == 4101) {
                            var8 -= 2;
                            String var150 = class289.field4500[var8];
                            String var151 = class289.field4500[var8 + 1];
                            class289.field4500[var8++] = var150 + var151;
                            continue;
                        }
                        if (var518 == 4102) {
                            var8--;
                            String var152 = class289.field4500[var8];
                            var7--;
                            int var153 = class169.field2434[var7];
                            class289.field4500[var8++] = var152 + class259.method1659((byte) 36, true, var153);
                            continue;
                        }
                        if (var518 == 4103) {
                            var8--;
                            String var154 = class289.field4500[var8];
                            class289.field4500[var8++] = var154.toLowerCase();
                            continue;
                        }
                        if (var518 == 4104) {
                            var7--;
                            int var155 = class169.field2434[var7];
                            long var156 = ((long) var155 + 11745L) * 86400000L;
                            class224.field3159.setTime(new Date(var156));
                            int var158 = class224.field3159.get(5);
                            int var159 = class224.field3159.get(2);
                            int var160 = class224.field3159.get(1);
                            class289.field4500[var8++] = var158 + "-" + class192.field2761[var159] + "-" + var160;
                            continue;
                        }
                        if (var518 == 4105) {
                            var8 -= 2;
                            String var161 = class289.field4500[var8 + 1];
                            String var162 = class289.field4500[var8];
                            if (class177.field2507.field3468 != null && class177.field2507.field3468.field1964) {
                                class289.field4500[var8++] = var161;
                                continue;
                            }
                            class289.field4500[var8++] = var162;
                            continue;
                        }
                        if (var518 == 4106) {
                            var7--;
                            int var163 = class169.field2434[var7];
                            class289.field4500[var8++] = Integer.toString(var163);
                            continue;
                        }
                        if (var518 == 4107) {
                            var8 -= 2;
                            class169.field2434[var7++] = class151.method993(class188.method1237(class289.field4500[var8 + 1], class289.field4500[var8], class146.field2156, (byte) -1), 0);
                            continue;
                        }
                        if (var518 == 4108) {
                            var7 -= 2;
                            int var164 = class169.field2434[var7];
                            var8--;
                            String var165 = class289.field4500[var8];
                            int var166 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class136.method888(var166, 4759).method544(var165, var164);
                            continue;
                        }
                        if (var518 == 4109) {
                            var8--;
                            String var167 = class289.field4500[var8];
                            var7 -= 2;
                            int var168 = class169.field2434[var7];
                            int var169 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = class136.method888(var169, 4759).method520(var167, var168);
                            continue;
                        }
                        if (var518 == 4110) {
                            var8 -= 2;
                            String var170 = class289.field4500[var8];
                            String var171 = class289.field4500[var8 + 1];
                            var7--;
                            if (class169.field2434[var7] == 1) {
                                class289.field4500[var8++] = var170;
                            } else {
                                class289.field4500[var8++] = var171;
                            }
                            continue;
                        }
                        if (var518 == 4111) {
                            var8--;
                            String var172 = class289.field4500[var8];
                            class289.field4500[var8++] = class89.method532(var172);
                            continue;
                        }
                        if (var518 == 4112) {
                            var8--;
                            String var173 = class289.field4500[var8];
                            var7--;
                            int var174 = class169.field2434[var7];
                            if (var174 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class289.field4500[var8++] = var173 + (char) var174;
                            continue;
                        }
                        if (var518 == 4113) {
                            var7--;
                            int var175 = class169.field2434[var7];
                            class169.field2434[var7++] = class172.method1124((char) var175, -339) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4114) {
                            var7--;
                            int var176 = class169.field2434[var7];
                            class169.field2434[var7++] = class247.method1591((char) var176, -28401) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4115) {
                            var7--;
                            int var177 = class169.field2434[var7];
                            class169.field2434[var7++] = class127.method836(false, (char) var177) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4116) {
                            var7--;
                            int var178 = class169.field2434[var7];
                            class169.field2434[var7++] = class110.method685((char) var178, false) ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4117) {
                            var8--;
                            String var179 = class289.field4500[var8];
                            if (var179 == null) {
                                class169.field2434[var7++] = 0;
                            } else {
                                class169.field2434[var7++] = var179.length();
                            }
                            continue;
                        }
                        if (var518 == 4118) {
                            var7 -= 2;
                            int var180 = class169.field2434[var7];
                            var8--;
                            String var181 = class289.field4500[var8];
                            int var182 = class169.field2434[var7 + 1];
                            class289.field4500[var8++] = var181.substring(var180, var182);
                            continue;
                        }
                        if (var518 == 4119) {
                            var8--;
                            String var183 = class289.field4500[var8];
                            StringBuffer var184 = new StringBuffer(var183.length());
                            boolean var185 = false;
                            for (int var186 = 0; var186 < var183.length(); var186++) {
                                char var187 = var183.charAt(var186);
                                if (var187 == '<') {
                                    var185 = true;
                                } else if (var187 == '>') {
                                    var185 = false;
                                } else if (!var185) {
                                    var184.append(var187);
                                }
                            }
                            class289.field4500[var8++] = var184.toString();
                            continue;
                        }
                        if (var518 == 4120) {
                            var7 -= 2;
                            var8--;
                            String var188 = class289.field4500[var8];
                            int var189 = class169.field2434[var7];
                            int var190 = class169.field2434[var7 + 1];
                            class169.field2434[var7++] = var188.indexOf(var189, var190);
                            continue;
                        }
                        if (var518 == 4121) {
                            var8 -= 2;
                            String var191 = class289.field4500[var8 + 1];
                            var7--;
                            int var192 = class169.field2434[var7];
                            String var193 = class289.field4500[var8];
                            class169.field2434[var7++] = var193.indexOf(var191, var192);
                            continue;
                        }
                        if (var518 == 4122) {
                            var7--;
                            int var194 = class169.field2434[var7];
                            class169.field2434[var7++] = Character.toLowerCase((char) var194);
                            continue;
                        }
                        if (var518 == 4123) {
                            var7--;
                            int var195 = class169.field2434[var7];
                            class169.field2434[var7++] = Character.toUpperCase((char) var195);
                            continue;
                        }
                        if (var518 == 4124) {
                            var7--;
                            boolean var196 = class169.field2434[var7] != 0;
                            var7--;
                            int var197 = class169.field2434[var7];
                            class289.field4500[var8++] = class188.method1239(var196, 0, (long) var197, -3570, class146.field2156);
                            continue;
                        }
                    } else if (var518 < 4300) {
                        if (var518 == 4200) {
                            var7--;
                            int var198 = class169.field2434[var7];
                            class289.field4500[var8++] = class36.method224(var198, 29).field3235;
                            continue;
                        }
                        if (var518 == 4201) {
                            var7 -= 2;
                            int var199 = class169.field2434[var7 + 1];
                            int var200 = class169.field2434[var7];
                            class229 var201 = class36.method224(var200, 35);
                            if (var199 >= 1 && var199 <= 5 && var201.field3285[var199 - 1] != null) {
                                class289.field4500[var8++] = var201.field3285[var199 - 1];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 4202) {
                            var7 -= 2;
                            int var202 = class169.field2434[var7 + 1];
                            int var203 = class169.field2434[var7];
                            class229 var204 = class36.method224(var203, 99);
                            if (var202 >= 1 && var202 <= 5 && var204.field3287[var202 - 1] != null) {
                                class289.field4500[var8++] = var204.field3287[var202 - 1];
                                continue;
                            }
                            class289.field4500[var8++] = "";
                            continue;
                        }
                        if (var518 == 4203) {
                            var7--;
                            int var205 = class169.field2434[var7];
                            class169.field2434[var7++] = class36.method224(var205, 101).field3254;
                            continue;
                        }
                        if (var518 == 4204) {
                            var7--;
                            int var206 = class169.field2434[var7];
                            class169.field2434[var7++] = class36.method224(var206, 100).field3263 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4205) {
                            var7--;
                            int var207 = class169.field2434[var7];
                            class229 var208 = class36.method224(var207, 34);
                            if (var208.field3284 == -1 && var208.field3238 >= 0) {
                                class169.field2434[var7++] = var208.field3238;
                                continue;
                            }
                            class169.field2434[var7++] = var207;
                            continue;
                        }
                        if (var518 == 4206) {
                            var7--;
                            int var209 = class169.field2434[var7];
                            class229 var210 = class36.method224(var209, 62);
                            if (var210.field3284 >= 0 && var210.field3238 >= 0) {
                                class169.field2434[var7++] = var210.field3238;
                                continue;
                            }
                            class169.field2434[var7++] = var209;
                            continue;
                        }
                        if (var518 == 4207) {
                            var7--;
                            int var211 = class169.field2434[var7];
                            class169.field2434[var7++] = class36.method224(var211, 122).field3234 ? 1 : 0;
                            continue;
                        }
                        if (var518 == 4208) {
                            var7 -= 2;
                            int var212 = class169.field2434[var7 + 1];
                            int var213 = class169.field2434[var7];
                            class139 var214 = method99(var212, -31836);
                            if (var214.method910(-116)) {
                                class289.field4500[var8++] = class36.method224(var213, 79).method1493(var214.field2018, false, var212);
                            } else {
                                class169.field2434[var7++] = class36.method224(var213, 22).method1495(var214.field2019, var212, (byte) 67);
                            }
                            continue;
                        }
                        if (var518 == 4210) {
                            var8--;
                            String var215 = class289.field4500[var8];
                            var7--;
                            int var216 = class169.field2434[var7];
                            class170.method1114(var215, var216 == 1, 95);
                            class169.field2434[var7++] = class210.field2954;
                            continue;
                        }
                        if (var518 == 4211) {
                            if (class181.field2582 != null && class209.field2943 < class210.field2954) {
                                class169.field2434[var7++] = class5.method26(class181.field2582[class209.field2943++], 65535);
                                continue;
                            }
                            class169.field2434[var7++] = -1;
                            continue;
                        }
                        if (var518 == 4212) {
                            class209.field2943 = 0;
                            continue;
                        }
                    } else if (var518 >= 4400) {
                        if (var518 >= 4500) {
                            if (var518 < 4600) {
                                if (var518 == 4500) {
                                    var7 -= 2;
                                    int var217 = class169.field2434[var7 + 1];
                                    int var218 = class169.field2434[var7];
                                    class139 var219 = method99(var217, -31836);
                                    if (var219.method910(-116)) {
                                        class289.field4500[var8++] = class3.method18(14551, var218).method364(var219.field2018, (byte) 81, var217);
                                    } else {
                                        class169.field2434[var7++] = class3.method18(14551, var218).method366(9368, var219.field2019, var217);
                                    }
                                    continue;
                                }
                            } else if (var518 < 5100) {
                                if (var518 == 5000) {
                                    class169.field2434[var7++] = class189.field2721;
                                    continue;
                                }
                                if (var518 == 5001) {
                                    class118.field1665++;
                                    var7 -= 3;
                                    class189.field2721 = class169.field2434[var7];
                                    class66.field790 = class169.field2434[var7 + 1];
                                    class219.field3101 = class169.field2434[var7 + 2];
                                    class94.field1259.method592(179, false);
                                    class94.field1259.method1373(class189.field2721, -13985);
                                    class94.field1259.method1373(class66.field790, -13985);
                                    class94.field1259.method1373(class219.field3101, -13985);
                                    continue;
                                }
                                if (var518 == 5002) {
                                    class29.field349++;
                                    var8--;
                                    String var220 = class289.field4500[var8];
                                    var7 -= 2;
                                    int var221 = class169.field2434[var7];
                                    int var222 = class169.field2434[var7 + 1];
                                    class94.field1259.method592(170, false);
                                    class94.field1259.method1379(-115, class60.method370((byte) -8, var220));
                                    class94.field1259.method1373(var221 - 1, -13985);
                                    class94.field1259.method1373(var222, -13985);
                                    continue;
                                }
                                if (var518 == 5003) {
                                    var7--;
                                    int var223 = class169.field2434[var7];
                                    String var224 = null;
                                    if (var223 < 100) {
                                        var224 = class87.field1176[var223];
                                    }
                                    if (var224 == null) {
                                        var224 = "";
                                    }
                                    class289.field4500[var8++] = var224;
                                    continue;
                                }
                                if (var518 == 5004) {
                                    var7--;
                                    int var225 = class169.field2434[var7];
                                    int var226 = -1;
                                    if (var225 < 100 && class87.field1176[var225] != null) {
                                        var226 = class195.field2782[var225];
                                    }
                                    class169.field2434[var7++] = var226;
                                    continue;
                                }
                                if (var518 == 5005) {
                                    class169.field2434[var7++] = class66.field790;
                                    continue;
                                }
                                if (var518 == 5008) {
                                    var8--;
                                    String var227 = class289.field4500[var8];
                                    if (var227.startsWith("::")) {
                                        class200.method1286(var227, true);
                                        continue;
                                    }
                                    if (class88.field1192 == 0 && (class252.field3647 && !class143.field2048 || class44.field527)) {
                                        continue;
                                    }
                                    String var228 = var227.toLowerCase();
                                    class273.field4005++;
                                    byte var229 = 0;
                                    byte var230 = 0;
                                    if (var228.startsWith(class48.field559)) {
                                        var230 = 0;
                                        var227 = var227.substring(class48.field559.length());
                                    } else if (var228.startsWith(class157.field2260)) {
                                        var227 = var227.substring(class157.field2260.length());
                                        var230 = 1;
                                    } else if (var228.startsWith(class32.field383)) {
                                        var227 = var227.substring(class32.field383.length());
                                        var230 = 2;
                                    } else if (var228.startsWith(class224.field3162)) {
                                        var227 = var227.substring(class224.field3162.length());
                                        var230 = 3;
                                    } else if (var228.startsWith(class19.field226)) {
                                        var230 = 4;
                                        var227 = var227.substring(class19.field226.length());
                                    } else if (var228.startsWith(class129.field1854)) {
                                        var230 = 5;
                                        var227 = var227.substring(class129.field1854.length());
                                    } else if (var228.startsWith(class196.field2787)) {
                                        var227 = var227.substring(class196.field2787.length());
                                        var230 = 6;
                                    } else if (var228.startsWith(class247.field3598)) {
                                        var227 = var227.substring(class247.field3598.length());
                                        var230 = 7;
                                    } else if (var228.startsWith(class109.field1470)) {
                                        var230 = 8;
                                        var227 = var227.substring(class109.field1470.length());
                                    } else if (var228.startsWith(class109.field1464)) {
                                        var230 = 9;
                                        var227 = var227.substring(class109.field1464.length());
                                    } else if (var228.startsWith(class49.field564)) {
                                        var227 = var227.substring(class49.field564.length());
                                        var230 = 10;
                                    } else if (var228.startsWith(class202.field2860)) {
                                        var230 = 11;
                                        var227 = var227.substring(class202.field2860.length());
                                    } else if (class146.field2156 != 0) {
                                        if (var228.startsWith(class12.field157)) {
                                            var227 = var227.substring(class12.field157.length());
                                            var230 = 0;
                                        } else if (var228.startsWith(class257.field3729)) {
                                            var227 = var227.substring(class257.field3729.length());
                                            var230 = 1;
                                        } else if (var228.startsWith(class260.field3780)) {
                                            var230 = 2;
                                            var227 = var227.substring(class260.field3780.length());
                                        } else if (var228.startsWith(class209.field2949)) {
                                            var230 = 3;
                                            var227 = var227.substring(class209.field2949.length());
                                        } else if (var228.startsWith(class105.field1434)) {
                                            var227 = var227.substring(class105.field1434.length());
                                            var230 = 4;
                                        } else if (var228.startsWith(class259.field3762)) {
                                            var227 = var227.substring(class259.field3762.length());
                                            var230 = 5;
                                        } else if (var228.startsWith(class269.field3927)) {
                                            var230 = 6;
                                            var227 = var227.substring(class269.field3927.length());
                                        } else if (var228.startsWith(class277.field4212)) {
                                            var230 = 7;
                                            var227 = var227.substring(class277.field4212.length());
                                        } else if (var228.startsWith(class35.field407)) {
                                            var230 = 8;
                                            var227 = var227.substring(class35.field407.length());
                                        } else if (var228.startsWith(class124.field1789)) {
                                            var230 = 9;
                                            var227 = var227.substring(class124.field1789.length());
                                        } else if (var228.startsWith(class279.field4243)) {
                                            var227 = var227.substring(class279.field4243.length());
                                            var230 = 10;
                                        } else if (var228.startsWith(class260.field3788)) {
                                            var230 = 11;
                                            var227 = var227.substring(class260.field3788.length());
                                        }
                                    }
                                    String var231 = var227.toLowerCase();
                                    if (var231.startsWith(class248.field3615)) {
                                        var229 = 1;
                                        var227 = var227.substring(class248.field3615.length());
                                    } else if (var231.startsWith(class271.field3971)) {
                                        var229 = 2;
                                        var227 = var227.substring(class271.field3971.length());
                                    } else if (var231.startsWith(class258.field3754)) {
                                        var227 = var227.substring(class258.field3754.length());
                                        var229 = 3;
                                    } else if (var231.startsWith(class9.field127)) {
                                        var227 = var227.substring(class9.field127.length());
                                        var229 = 4;
                                    } else if (var231.startsWith(class170.field2443)) {
                                        var229 = 5;
                                        var227 = var227.substring(class170.field2443.length());
                                    } else if (class146.field2156 != 0) {
                                        if (var231.startsWith(class154.field2235)) {
                                            var227 = var227.substring(class154.field2235.length());
                                            var229 = 1;
                                        } else if (var231.startsWith(class153.field2214)) {
                                            var229 = 2;
                                            var227 = var227.substring(class153.field2214.length());
                                        } else if (var231.startsWith(class146.field2151)) {
                                            var227 = var227.substring(class146.field2151.length());
                                            var229 = 3;
                                        } else if (var231.startsWith(class12.field156)) {
                                            var229 = 4;
                                            var227 = var227.substring(class12.field156.length());
                                        } else if (var231.startsWith(class259.field3775)) {
                                            var227 = var227.substring(class259.field3775.length());
                                            var229 = 5;
                                        }
                                    }
                                    class94.field1259.method592(3, false);
                                    class94.field1259.method1373(0, -13985);
                                    int var232 = class94.field1259.field3021;
                                    class94.field1259.method1373(var230, -13985);
                                    class94.field1259.method1373(var229, -13985);
                                    class27.method163((byte) 127, var227, class94.field1259);
                                    class94.field1259.method1371(-108, class94.field1259.field3021 - var232);
                                    continue;
                                }
                                if (var518 == 5009) {
                                    var8 -= 2;
                                    String var233 = class289.field4500[var8 + 1];
                                    String var234 = class289.field4500[var8];
                                    if (class88.field1192 != 0 || (!class252.field3647 || class143.field2048) && !class44.field527) {
                                        class94.field1259.method592(181, false);
                                        class246.field3583++;
                                        class94.field1259.method1373(0, -13985);
                                        int var235 = class94.field1259.field3021;
                                        class94.field1259.method1379(-11, class60.method370((byte) -8, var234));
                                        class27.method163((byte) 116, var233, class94.field1259);
                                        class94.field1259.method1371(-109, class94.field1259.field3021 - var235);
                                    }
                                    continue;
                                }
                                if (var518 == 5010) {
                                    var7--;
                                    int var236 = class169.field2434[var7];
                                    String var237 = null;
                                    if (var236 < 100) {
                                        var237 = class39.field471[var236];
                                    }
                                    if (var237 == null) {
                                        var237 = "";
                                    }
                                    class289.field4500[var8++] = var237;
                                    continue;
                                }
                                if (var518 == 5011) {
                                    var7--;
                                    int var238 = class169.field2434[var7];
                                    String var239 = null;
                                    if (var238 < 100) {
                                        var239 = class96.field1286[var238];
                                    }
                                    if (var239 == null) {
                                        var239 = "";
                                    }
                                    class289.field4500[var8++] = var239;
                                    continue;
                                }
                                if (var518 == 5012) {
                                    var7--;
                                    int var240 = class169.field2434[var7];
                                    int var241 = -1;
                                    if (var240 < 100) {
                                        var241 = class3.field37[var240];
                                    }
                                    class169.field2434[var7++] = var241;
                                    continue;
                                }
                                if (var518 == 5015) {
                                    String var242;
                                    if (class177.field2507 == null || class177.field2507.field3466 == null) {
                                        var242 = class280.field4256;
                                    } else {
                                        var242 = class177.field2507.method1557(104);
                                    }
                                    class289.field4500[var8++] = var242;
                                    continue;
                                }
                                if (var518 == 5016) {
                                    class169.field2434[var7++] = class219.field3101;
                                    continue;
                                }
                                if (var518 == 5017) {
                                    class169.field2434[var7++] = class217.field3073;
                                    continue;
                                }
                                if (var518 == 5050) {
                                    var7--;
                                    int var243 = class169.field2434[var7];
                                    class289.field4500[var8++] = class259.method1662(var243, 0).field3388;
                                    continue;
                                }
                                if (var518 == 5051) {
                                    var7--;
                                    int var244 = class169.field2434[var7];
                                    class235 var245 = class259.method1662(var244, 0);
                                    if (var245.field3384 == null) {
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var245.field3384.length;
                                    }
                                    continue;
                                }
                                if (var518 == 5052) {
                                    var7 -= 2;
                                    int var246 = class169.field2434[var7 + 1];
                                    int var247 = class169.field2434[var7];
                                    class235 var248 = class259.method1662(var247, 0);
                                    int var249 = var248.field3384[var246];
                                    class169.field2434[var7++] = var249;
                                    continue;
                                }
                                if (var518 == 5053) {
                                    var7--;
                                    int var250 = class169.field2434[var7];
                                    class235 var251 = class259.method1662(var250, 0);
                                    if (var251.field3389 == null) {
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var251.field3389.length;
                                    }
                                    continue;
                                }
                                if (var518 == 5054) {
                                    var7 -= 2;
                                    int var252 = class169.field2434[var7 + 1];
                                    int var253 = class169.field2434[var7];
                                    class169.field2434[var7++] = class259.method1662(var253, 0).field3389[var252];
                                    continue;
                                }
                                if (var518 == 5055) {
                                    var7--;
                                    int var254 = class169.field2434[var7];
                                    class289.field4500[var8++] = class20.method123(32767, var254).method1469(false);
                                    continue;
                                }
                                if (var518 == 5056) {
                                    var7--;
                                    int var255 = class169.field2434[var7];
                                    class226 var256 = class20.method123(32767, var255);
                                    if (var256.field3180 == null) {
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var256.field3180.length;
                                    }
                                    continue;
                                }
                                if (var518 == 5057) {
                                    var7 -= 2;
                                    int var257 = class169.field2434[var7];
                                    int var258 = class169.field2434[var7 + 1];
                                    class169.field2434[var7++] = class20.method123(32767, var257).field3180[var258];
                                    continue;
                                }
                                if (var518 == 5058) {
                                    class37.field434 = new class23();
                                    var7--;
                                    class37.field434.field277 = class169.field2434[var7];
                                    class37.field434.field285 = class20.method123(32767, class37.field434.field277);
                                    class37.field434.field279 = new int[class37.field434.field285.method1462((byte) -75)];
                                    continue;
                                }
                                if (var518 == 5059) {
                                    class94.field1259.method592(184, false);
                                    class153.field2215++;
                                    class94.field1259.method1373(0, -13985);
                                    int var259 = class94.field1259.field3021;
                                    class94.field1259.method1373(0, -13985);
                                    class94.field1259.method1387(class37.field434.field277, 4);
                                    class37.field434.field285.method1464(class94.field1259, -1, class37.field434.field279);
                                    class94.field1259.method1371(108, class94.field1259.field3021 - var259);
                                    continue;
                                }
                                if (var518 == 5060) {
                                    var8--;
                                    String var260 = class289.field4500[var8];
                                    class94.field1259.method592(238, false);
                                    class150.field2176++;
                                    class94.field1259.method1373(0, -13985);
                                    int var261 = class94.field1259.field3021;
                                    class94.field1259.method1379(-36, class60.method370((byte) -8, var260));
                                    class94.field1259.method1387(class37.field434.field277, 4);
                                    class37.field434.field285.method1464(class94.field1259, -1, class37.field434.field279);
                                    class94.field1259.method1371(99, class94.field1259.field3021 - var261);
                                    continue;
                                }
                                if (var518 == 5061) {
                                    class153.field2215++;
                                    class94.field1259.method592(184, false);
                                    class94.field1259.method1373(0, -13985);
                                    int var262 = class94.field1259.field3021;
                                    class94.field1259.method1373(1, -13985);
                                    class94.field1259.method1387(class37.field434.field277, 4);
                                    class37.field434.field285.method1464(class94.field1259, -1, class37.field434.field279);
                                    class94.field1259.method1371(117, class94.field1259.field3021 - var262);
                                    continue;
                                }
                                if (var518 == 5062) {
                                    var7 -= 2;
                                    int var263 = class169.field2434[var7];
                                    int var264 = class169.field2434[var7 + 1];
                                    class169.field2434[var7++] = class259.method1662(var263, 0).field3386[var264];
                                    continue;
                                }
                                if (var518 == 5063) {
                                    var7 -= 2;
                                    int var265 = class169.field2434[var7];
                                    int var266 = class169.field2434[var7 + 1];
                                    class169.field2434[var7++] = class259.method1662(var265, 0).field3385[var266];
                                    continue;
                                }
                                if (var518 == 5064) {
                                    var7 -= 2;
                                    int var267 = class169.field2434[var7];
                                    int var268 = class169.field2434[var7 + 1];
                                    if (var268 == -1) {
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        class169.field2434[var7++] = class259.method1662(var267, 0).method1539(47, (char) var268);
                                    }
                                    continue;
                                }
                                if (var518 == 5065) {
                                    var7 -= 2;
                                    int var269 = class169.field2434[var7];
                                    int var270 = class169.field2434[var7 + 1];
                                    if (var270 == -1) {
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        class169.field2434[var7++] = class259.method1662(var269, 0).method1537(-103, (char) var270);
                                    }
                                    continue;
                                }
                                if (var518 == 5066) {
                                    var7--;
                                    int var271 = class169.field2434[var7];
                                    class169.field2434[var7++] = class20.method123(32767, var271).method1462((byte) 118);
                                    continue;
                                }
                                if (var518 == 5067) {
                                    var7 -= 2;
                                    int var272 = class169.field2434[var7];
                                    int var273 = class169.field2434[var7 + 1];
                                    int var274 = class20.method123(32767, var272).method1459(var273, 84);
                                    class169.field2434[var7++] = var274;
                                    continue;
                                }
                                if (var518 == 5068) {
                                    var7 -= 2;
                                    int var275 = class169.field2434[var7];
                                    int var276 = class169.field2434[var7 + 1];
                                    class37.field434.field279[var275] = var276;
                                    continue;
                                }
                                if (var518 == 5069) {
                                    var7 -= 2;
                                    int var277 = class169.field2434[var7 + 1];
                                    int var278 = class169.field2434[var7];
                                    class37.field434.field279[var278] = var277;
                                    continue;
                                }
                                if (var518 == 5070) {
                                    var7 -= 3;
                                    int var279 = class169.field2434[var7];
                                    int var280 = class169.field2434[var7 + 1];
                                    int var281 = class169.field2434[var7 + 2];
                                    class226 var282 = class20.method123(32767, var279);
                                    if (var282.method1459(var280, -52) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class169.field2434[var7++] = var282.method1463(var280, false, var281);
                                    continue;
                                }
                                if (var518 == 5071) {
                                    var8--;
                                    String var283 = class289.field4500[var8];
                                    var7--;
                                    boolean var284 = class169.field2434[var7] == 1;
                                    class164.method1079(var284, -25339, var283);
                                    class169.field2434[var7++] = class210.field2954;
                                    continue;
                                }
                                if (var518 == 5072) {
                                    if (class181.field2582 != null && class209.field2943 < class210.field2954) {
                                        class169.field2434[var7++] = class5.method26(class181.field2582[class209.field2943++], 65535);
                                        continue;
                                    }
                                    class169.field2434[var7++] = -1;
                                    continue;
                                }
                                if (var518 == 5073) {
                                    class209.field2943 = 0;
                                    continue;
                                }
                            } else if (var518 < 5200) {
                                if (var518 == 5100) {
                                    if (class260.field3784[86]) {
                                        class169.field2434[var7++] = 1;
                                    } else {
                                        class169.field2434[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var518 == 5101) {
                                    if (class260.field3784[82]) {
                                        class169.field2434[var7++] = 1;
                                    } else {
                                        class169.field2434[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var518 == 5102) {
                                    if (class260.field3784[81]) {
                                        class169.field2434[var7++] = 1;
                                    } else {
                                        class169.field2434[var7++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var518 < 5300) {
                                if (var518 == 5200) {
                                    var7--;
                                    class4.method25(class169.field2434[var7], true);
                                    continue;
                                }
                                if (var518 == 5201) {
                                    class169.field2434[var7++] = class91.method552(1060);
                                    continue;
                                }
                                if (var518 == 5202) {
                                    var7--;
                                    class28.method173(class169.field2434[var7], true);
                                    continue;
                                }
                                if (var518 == 5203) {
                                    var8--;
                                    class266.method1700((byte) 120, class289.field4500[var8]);
                                    continue;
                                }
                                if (var518 == 5204) {
                                    class289.field4500[var8 - 1] = class276.method1782(-1, class289.field4500[var8 - 1]);
                                    continue;
                                }
                                if (var518 == 5205) {
                                    var7--;
                                    class202.method1300(class169.field2434[var7], -1, 7816, -1);
                                    continue;
                                }
                                if (var518 == 5206) {
                                    var7--;
                                    int var285 = class169.field2434[var7];
                                    class71 var286 = class11.method77((byte) 61, var285 & 0x3FFF, var285 >> 14 & 0x3FFF);
                                    if (var286 == null) {
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        class169.field2434[var7++] = var286.field842;
                                    }
                                    continue;
                                }
                                if (var518 == 5207) {
                                    var7--;
                                    class71 var287 = class233.method1520(class169.field2434[var7], 64);
                                    if (var287 != null && var287.field852 != null) {
                                        class289.field4500[var8++] = var287.field852;
                                        continue;
                                    }
                                    class289.field4500[var8++] = "";
                                    continue;
                                }
                                if (var518 == 5208) {
                                    class169.field2434[var7++] = class185.field2661;
                                    class169.field2434[var7++] = class2.field31;
                                    continue;
                                }
                                if (var518 == 5209) {
                                    class169.field2434[var7++] = class261.field3800 + class230.field3313;
                                    class169.field2434[var7++] = class133.field1940 - (class271.field3963 - class1.field1) - 1;
                                    continue;
                                }
                                if (var518 == 5210) {
                                    var7--;
                                    int var288 = class169.field2434[var7];
                                    class71 var289 = class233.method1520(var288, 64);
                                    if (var289 == null) {
                                        class169.field2434[var7++] = 0;
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = class5.method26(268419220, var289.field833) >> 14;
                                        class169.field2434[var7++] = class5.method26(var289.field833, 16383);
                                    }
                                    continue;
                                }
                                if (var518 == 5211) {
                                    var7--;
                                    int var290 = class169.field2434[var7];
                                    class71 var291 = class233.method1520(var290, 64);
                                    if (var291 == null) {
                                        class169.field2434[var7++] = 0;
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var291.field851 - var291.field826;
                                        class169.field2434[var7++] = var291.field850 - var291.field846;
                                    }
                                    continue;
                                }
                                if (var518 == 5212) {
                                    int var292 = class118.method762(0);
                                    int var293 = 0;
                                    String var294;
                                    if (var292 == -1) {
                                        var294 = "";
                                    } else {
                                        var294 = class200.field2840.field2229[var292];
                                        var293 = class200.field2840.method1006(-116, var292);
                                    }
                                    String var295 = class138.method902(var294, " ", (byte) -120, "<br>");
                                    class289.field4500[var8++] = var295;
                                    class169.field2434[var7++] = var293;
                                    continue;
                                }
                                if (var518 == 5213) {
                                    int var296 = class17.method103((byte) 93);
                                    int var297 = 0;
                                    String var298;
                                    if (var296 == -1) {
                                        var298 = "";
                                    } else {
                                        var298 = class200.field2840.field2229[var296];
                                        var297 = class200.field2840.method1006(-42, var296);
                                    }
                                    String var299 = class138.method902(var298, " ", (byte) -120, "<br>");
                                    class289.field4500[var8++] = var299;
                                    class169.field2434[var7++] = var297;
                                    continue;
                                }
                                if (var518 == 5214) {
                                    var7--;
                                    int var300 = class169.field2434[var7];
                                    class71 var301 = class217.method1413((byte) -111);
                                    if (var301 != null) {
                                        int[] var302 = var301.method434(var300 & 0x3FFF, (var300 & 0xFFFDA8A) >> 14, -1, (var300 & 0x36915B10) >> 28);
                                        if (var302 != null) {
                                            class68.method415((byte) 2, var302[2], var302[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var518 == 5215) {
                                    var7 -= 2;
                                    int var303 = class169.field2434[var7];
                                    int var304 = class169.field2434[var7 + 1];
                                    class259 var305 = class127.method826((var303 & 0xFFFEA2C) >> 14, var303 & 0x3FFF, 10);
                                    boolean var306 = false;
                                    for (class71 var307 = (class71) var305.method1657((byte) 122); var307 != null; var307 = (class71) var305.method1658(-30630)) {
                                        if (var307.field842 == var304) {
                                            var306 = true;
                                            break;
                                        }
                                    }
                                    if (var306) {
                                        class169.field2434[var7++] = 1;
                                    } else {
                                        class169.field2434[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var518 == 5216) {
                                    var7--;
                                    int var308 = class169.field2434[var7];
                                    class270.method1729(true, var308);
                                    continue;
                                }
                                if (var518 == 5217) {
                                    var7--;
                                    int var309 = class169.field2434[var7];
                                    if (class17.method101(var309, -106)) {
                                        class169.field2434[var7++] = 1;
                                    } else {
                                        class169.field2434[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var518 == 5218) {
                                    var7--;
                                    int var310 = class169.field2434[var7];
                                    class71 var311 = class233.method1520(var310, 64);
                                    if (var311 == null) {
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        class169.field2434[var7++] = var311.field829;
                                    }
                                    continue;
                                }
                                if (var518 == 5219) {
                                    var8--;
                                    class229.method1491(class289.field4500[var8], 2118561532);
                                    continue;
                                }
                                if (var518 == 5220) {
                                    class169.field2434[var7++] = class116.field1613 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 5221) {
                                    var7--;
                                    int var312 = class169.field2434[var7];
                                    class68.method415((byte) 2, var312 & 0x3FFF, (var312 & 0xFFFCB75) >> 14);
                                    continue;
                                }
                                if (var518 == 5222) {
                                    class71 var313 = class217.method1413((byte) -111);
                                    if (var313 == null) {
                                        class169.field2434[var7++] = -1;
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        int[] var314 = var313.method441(107, class133.field1940 + class1.field1 - class271.field3963 - 1, class261.field3800 - -class230.field3313);
                                        if (var314 == null) {
                                            class169.field2434[var7++] = -1;
                                            class169.field2434[var7++] = -1;
                                        } else {
                                            class169.field2434[var7++] = var314[1];
                                            class169.field2434[var7++] = var314[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var518 == 5223) {
                                    var7 -= 2;
                                    int var315 = class169.field2434[var7];
                                    int var316 = class169.field2434[var7 + 1];
                                    class202.method1300(var315, var316 & 0x3FFF, 7816, var316 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var518 == 5224) {
                                    var7--;
                                    int var317 = class169.field2434[var7];
                                    class71 var318 = class217.method1413((byte) -111);
                                    if (var318 == null) {
                                        class169.field2434[var7++] = -1;
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        int[] var319 = var318.method434(var317 & 0x3FFF, var317 >> 14 & 0x3FFF, -1, var317 >> 28 & 0x3);
                                        if (var319 == null) {
                                            class169.field2434[var7++] = -1;
                                            class169.field2434[var7++] = -1;
                                        } else {
                                            class169.field2434[var7++] = var319[1];
                                            class169.field2434[var7++] = var319[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var518 == 5225) {
                                    var7--;
                                    int var320 = class169.field2434[var7];
                                    class71 var321 = class217.method1413((byte) -111);
                                    if (var321 == null) {
                                        class169.field2434[var7++] = -1;
                                        class169.field2434[var7++] = -1;
                                    } else {
                                        int[] var322 = var321.method441(50, var320 & 0x3FFF, var320 >> 14 & 0x3FFF);
                                        if (var322 == null) {
                                            class169.field2434[var7++] = -1;
                                            class169.field2434[var7++] = -1;
                                        } else {
                                            class169.field2434[var7++] = var322[1];
                                            class169.field2434[var7++] = var322[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var518 < 5400) {
                                if (var518 == 5300) {
                                    var7 -= 2;
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 5301) {
                                    continue;
                                }
                                if (var518 == 5302) {
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 5303) {
                                    var7--;
                                    class169.field2434[var7++] = 0;
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 5305) {
                                    byte var323 = -1;
                                    class169.field2434[var7++] = var323;
                                    continue;
                                }
                                if (var518 == 5306) {
                                    class169.field2434[var7++] = class285.method1903(32113);
                                    continue;
                                }
                                if (var518 == 5307) {
                                    var7--;
                                    int var324 = class169.field2434[var7];
                                    if (var324 < 0 || var324 > 2) {
                                        var324 = 0;
                                    }
                                    class34.method212(-1, false, (byte) -41, var324, -1);
                                    continue;
                                }
                                if (var518 == 5308) {
                                    class169.field2434[var7++] = class118.field1666;
                                    continue;
                                }
                                if (var518 == 5309) {
                                    var7--;
                                    int var325 = class169.field2434[var7];
                                    if (var325 < 0 || var325 > 2) {
                                        var325 = 0;
                                    }
                                    class118.field1666 = var325;
                                    class123.method807(class115.field1592, true);
                                    continue;
                                }
                            } else if (var518 < 5500) {
                                if (var518 == 5400) {
                                    var7--;
                                    int var326 = class169.field2434[var7];
                                    var8 -= 2;
                                    String var327 = class289.field4500[var8];
                                    String var328 = class289.field4500[var8 + 1];
                                    class94.field1259.method592(108, false);
                                    class107.field1445++;
                                    class94.field1259.method1373((class109.method681(var327, -2795) + class109.method681(var328, -2795)) + 1, -13985);
                                    class94.field1259.method1353(var327, (byte) -115);
                                    class94.field1259.method1353(var328, (byte) -115);
                                    class94.field1259.method1373(var326, -13985);
                                    continue;
                                }
                                if (var518 == 5401) {
                                    var7 -= 2;
                                    class255.field3685[class169.field2434[var7]] = (short) class97.method580((byte) -101, class169.field2434[var7 + 1]);
                                    class202.method1298(13);
                                    class14.method85(100);
                                    class135.method883((byte) -76);
                                    class75.method461((byte) 110);
                                    class116.method746(0);
                                    continue;
                                }
                                if (var518 == 5405) {
                                    var7 -= 2;
                                    int var329 = class169.field2434[var7];
                                    int var330 = class169.field2434[var7 + 1];
                                    if (var329 >= 0 && var329 < 2) {
                                        class36.field419[var329] = new int[var330 << 1][4];
                                    }
                                    continue;
                                }
                                if (var518 == 5406) {
                                    var7 -= 7;
                                    int var331 = class169.field2434[var7 + 2];
                                    int var332 = class169.field2434[var7 + 1] << 1;
                                    int var333 = class169.field2434[var7];
                                    int var334 = class169.field2434[var7 + 4];
                                    int var335 = class169.field2434[var7 + 3];
                                    int var336 = class169.field2434[var7 + 5];
                                    int var337 = class169.field2434[var7 + 6];
                                    if (var333 >= 0 && var333 < 2 && class36.field419[var333] != null && var332 >= 0 && class36.field419[var333].length > var332) {
                                        class36.field419[var333][var332] = new int[] { (class5.method26(268423811, var331) >> 14) * 128, var335, class5.method26(16383, var331) * 128, var337 };
                                        class36.field419[var333][var332 + 1] = new int[] { (class5.method26(268422376, var334) >> 14) * 128, var336, class5.method26(16383, var334) * 128 };
                                    }
                                    continue;
                                }
                                if (var518 == 5407) {
                                    var7--;
                                    int var338 = class36.field419[class169.field2434[var7]].length >> 1;
                                    class169.field2434[var7++] = var338;
                                    continue;
                                }
                                if (var518 == 5411) {
                                    if (class202.field2858 == null) {
                                        class96.method575(false, class251.method1612(-113), 1);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var518 == 5419) {
                                    String var339 = "";
                                    if (class84.field1159 != null) {
                                        if (class84.field1159.field958 == null) {
                                            var339 = class129.method842(class84.field1159.field957, (byte) -88);
                                        } else {
                                            var339 = (String) class84.field1159.field958;
                                        }
                                    }
                                    class289.field4500[var8++] = var339;
                                    continue;
                                }
                                if (var518 == 5420) {
                                    class169.field2434[var7++] = class56.field659 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 5421) {
                                    var8--;
                                    String var340 = class289.field4500[var8];
                                    var7--;
                                    boolean var341 = class169.field2434[var7] == 1;
                                    String var342 = class251.method1612(99) + var340;
                                    if (class202.field2858 == null && (!var341 || class56.field659 == 3 || !class56.field666.startsWith("win") || class227.field3204)) {
                                        class96.method575(var341, var342, 1);
                                        continue;
                                    }
                                    class171.field2445 = var342;
                                    class238.field3425 = var341;
                                    class226.field3186 = class115.field1592.method352(var342, 5557);
                                    continue;
                                }
                                if (var518 == 5422) {
                                    var8 -= 2;
                                    String var343 = class289.field4500[var8 + 1];
                                    var7--;
                                    int var344 = class169.field2434[var7];
                                    String var345 = class289.field4500[var8];
                                    if (var345.length() > 0) {
                                        if (class276.field4200 == null) {
                                            class276.field4200 = new String[class116.field1599[class5.field67]];
                                        }
                                        class276.field4200[var344] = var345;
                                    }
                                    if (var343.length() > 0) {
                                        if (class202.field2865 == null) {
                                            class202.field2865 = new String[class116.field1599[class5.field67]];
                                        }
                                        class202.field2865[var344] = var343;
                                    }
                                    continue;
                                }
                                if (var518 == 5423) {
                                    var8--;
                                    System.out.println(class289.field4500[var8]);
                                    continue;
                                }
                                if (var518 == 5424) {
                                    var7 -= 11;
                                    class289.field4502 = class169.field2434[var7];
                                    class181.field2583 = class169.field2434[var7 + 1];
                                    class164.field2350 = class169.field2434[var7 + 2];
                                    class110.field1479 = class169.field2434[var7 + 3];
                                    class274.field4104 = class169.field2434[var7 + 4];
                                    class35.field413 = class169.field2434[var7 + 5];
                                    class178.field2532 = class169.field2434[var7 + 6];
                                    class61.field726 = class169.field2434[var7 + 7];
                                    class34.field399 = class169.field2434[var7 + 8];
                                    class55.field649 = class169.field2434[var7 + 9];
                                    class257.field3734 = class169.field2434[var7 + 10];
                                    class120.field1705.method1842(class274.field4104, -5012);
                                    class120.field1705.method1842(class35.field413, -5012);
                                    class120.field1705.method1842(class178.field2532, -5012);
                                    class120.field1705.method1842(class61.field726, -5012);
                                    class120.field1705.method1842(class34.field399, -5012);
                                    class154.field2226 = true;
                                    continue;
                                }
                                if (var518 == 5425) {
                                    class251.method1618(64);
                                    class154.field2226 = false;
                                    continue;
                                }
                                if (var518 == 5426) {
                                    var7--;
                                    class41.field504 = class169.field2434[var7];
                                    continue;
                                }
                                if (var518 == 5427) {
                                    var7 -= 2;
                                    class167.field2403 = class169.field2434[var7];
                                    class263.field3816 = class169.field2434[var7 + 1];
                                    continue;
                                }
                                if (var518 == 5428) {
                                    var7 -= 2;
                                    int var346 = class169.field2434[var7];
                                    int var347 = class169.field2434[var7 + 1];
                                    class169.field2434[var7++] = class135.method882(var347, var346, 5595) ? 1 : 0;
                                    continue;
                                }
                            } else if (var518 < 5600) {
                                if (var518 == 5500) {
                                    var7 -= 4;
                                    int var378 = class169.field2434[var7 + 3];
                                    int var379 = class169.field2434[var7];
                                    int var380 = class169.field2434[var7 + 2];
                                    int var381 = class169.field2434[var7 + 1];
                                    class23.method140(var378, var380, (var379 & 0x3FFF) - class166.field2383, false, 13015, var381, ((var379 & 0xFFFEB5C) >> 14) - class110.field1473);
                                    continue;
                                }
                                if (var518 == 5501) {
                                    var7 -= 4;
                                    int var382 = class169.field2434[var7];
                                    int var383 = class169.field2434[var7 + 1];
                                    int var384 = class169.field2434[var7 + 2];
                                    int var385 = class169.field2434[var7 + 3];
                                    class54.method331(var383, (var382 & 0x3FFF) - class166.field2383, var384, (var382 >> 14 & 0x3FFF) - class110.field1473, 120, var385);
                                    continue;
                                }
                                if (var518 == 5502) {
                                    var7 -= 6;
                                    int var386 = class169.field2434[var7];
                                    if (var386 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class202.field2866 = var386;
                                    int var387 = class169.field2434[var7 + 1];
                                    if (var387 + 1 >= class36.field419[class202.field2866].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class216.field3013 = 0;
                                    class158.field2290 = var387;
                                    class5.field70 = class169.field2434[var7 + 2];
                                    class133.field1942 = class169.field2434[var7 + 3];
                                    int var388 = class169.field2434[var7 + 4];
                                    if (var388 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class32.field381 = var388;
                                    int var389 = class169.field2434[var7 + 5];
                                    if (class36.field419[class32.field381].length >> 1 <= var389 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class4.field61 = 3;
                                    class79.field940 = var389;
                                    continue;
                                }
                                if (var518 == 5503) {
                                    class232.method1514(0);
                                    continue;
                                }
                                if (var518 == 5504) {
                                    var7 -= 2;
                                    class108.method679(class169.field2434[var7], class169.field2434[var7 + 1], -58);
                                    continue;
                                }
                                if (var518 == 5505) {
                                    class169.field2434[var7++] = (int) class159.field2310;
                                    continue;
                                }
                                if (var518 == 5506) {
                                    class169.field2434[var7++] = (int) class274.field4085;
                                    continue;
                                }
                                if (var518 == 5507) {
                                    class136.method885(50);
                                    continue;
                                }
                                if (var518 == 5508) {
                                    class273.method1757((byte) -8);
                                    continue;
                                }
                                if (var518 == 5509) {
                                    class280.method1840((byte) -88);
                                    continue;
                                }
                                if (var518 == 5510) {
                                    class280.method1835((byte) 46);
                                    continue;
                                }
                                if (var518 == 5512) {
                                    class7.method42(0);
                                    continue;
                                }
                            } else if (var518 < 5700) {
                                if (var518 == 5600) {
                                    var8 -= 2;
                                    String var374 = class289.field4500[var8 + 1];
                                    var7--;
                                    int var375 = class169.field2434[var7];
                                    String var376 = class289.field4500[var8];
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0 && class97.field1290 == 0) {
                                        class33.method206(var375, var376, var374, (byte) 117);
                                    }
                                    continue;
                                }
                                if (var518 == 5601) {
                                    class100.method611(31982);
                                    continue;
                                }
                                if (var518 == 5602) {
                                    if (class240.field3484 == 0) {
                                        class20.field247 = -2;
                                    }
                                    continue;
                                }
                                if (var518 == 5603) {
                                    var7 -= 4;
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0 && class97.field1290 == 0) {
                                        class168.method1104(0, class169.field2434[var7], class169.field2434[var7 + 1], class169.field2434[var7 + 2], class169.field2434[var7 + 3]);
                                    }
                                    continue;
                                }
                                if (var518 == 5604) {
                                    var8--;
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0 && class97.field1290 == 0) {
                                        class285.method1900(class60.method370((byte) -8, class289.field4500[var8]), -718);
                                    }
                                    continue;
                                }
                                if (var518 == 5605) {
                                    var7 -= 7;
                                    var8 -= 3;
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0 && class97.field1290 == 0) {
                                        class233.method1519(class169.field2434[var7 + 4] == 1, class289.field4500[var8 + 2], class169.field2434[var7], class169.field2434[var7 + 2], class60.method370((byte) -8, class289.field4500[var8]), class169.field2434[var7 + 6] == 1, class169.field2434[var7 + 3], 18141, class289.field4500[var8 + 1], class169.field2434[var7 + 1], class169.field2434[var7 + 5] == 1);
                                    }
                                    continue;
                                }
                                if (var518 == 5606) {
                                    if (class252.field3653 == 0) {
                                        class143.field2050 = -2;
                                    }
                                    continue;
                                }
                                if (var518 == 5607) {
                                    class169.field2434[var7++] = class20.field247;
                                    continue;
                                }
                                if (var518 == 5608) {
                                    class169.field2434[var7++] = class37.field422;
                                    continue;
                                }
                                if (var518 == 5609) {
                                    class169.field2434[var7++] = class143.field2050;
                                    continue;
                                }
                                if (var518 == 5610) {
                                    for (int var377 = 0; var377 < 5; var377++) {
                                        class289.field4500[var8++] = var377 >= class212.field2969.length ? "" : class107.method674(class212.field2969[var377], (byte) -93);
                                    }
                                    class212.field2969 = null;
                                    continue;
                                }
                                if (var518 == 5611) {
                                    class169.field2434[var7++] = class125.field1796;
                                    continue;
                                }
                            } else if (var518 < 6100) {
                                if (var518 == 6001) {
                                    var7--;
                                    int var365 = class169.field2434[var7];
                                    if (var365 < 1) {
                                        var365 = 1;
                                    }
                                    if (var365 > 4) {
                                        var365 = 4;
                                    }
                                    class204.field2906 = var365;
                                    if (class204.field2906 == 1) {
                                        class297.method1979(0.9F);
                                    }
                                    if (class204.field2906 == 2) {
                                        class297.method1979(0.8F);
                                    }
                                    if (class204.field2906 == 3) {
                                        class297.method1979(0.7F);
                                    }
                                    if (class204.field2906 == 4) {
                                        class297.method1979(0.6F);
                                    }
                                    class14.method85(99);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6002) {
                                    var7--;
                                    class131.method861((byte) 99, class169.field2434[var7] == 1);
                                    class179.method1163(-13869);
                                    class219.method1424(25);
                                    class90.method548(870);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6003) {
                                    var7--;
                                    class165.field2370 = class169.field2434[var7] == 1;
                                    class90.method548(870);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6005) {
                                    var7--;
                                    class149.field2169 = class169.field2434[var7] == 1;
                                    class219.method1424(25);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6006) {
                                    var7--;
                                    class94.field1258 = class169.field2434[var7] == 1;
                                    ((class119) class297.field4685).method780(19592, !class94.field1258);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6007) {
                                    var7--;
                                    class164.field2353 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6008) {
                                    var7--;
                                    class3.field39 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6009) {
                                    var7--;
                                    class234.field3375 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6010) {
                                    var7--;
                                    class284.field4342 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6011) {
                                    var7--;
                                    int var366 = class169.field2434[var7];
                                    if (var366 < 0 || var366 > 2) {
                                        var366 = 0;
                                    }
                                    class99.field1347 = var366;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6012) {
                                    var7--;
                                    class91.field1241 = class169.field2434[var7] == 1;
                                    if (class204.field2906 == 1) {
                                        class297.method1979(0.9F);
                                    }
                                    if (class204.field2906 == 2) {
                                        class297.method1979(0.8F);
                                    }
                                    if (class204.field2906 == 3) {
                                        class297.method1979(0.7F);
                                    }
                                    if (class204.field2906 == 4) {
                                        class297.method1979(0.6F);
                                    }
                                    class219.method1424(25);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6014) {
                                    var7--;
                                    class193.field2772 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6015) {
                                    var7--;
                                    class14.field174 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6016) {
                                    var7--;
                                    int var367 = class169.field2434[var7];
                                    if (var367 < 0 || var367 > 2) {
                                        var367 = 0;
                                    }
                                    class54.field624 = var367;
                                    continue;
                                }
                                if (var518 == 6017) {
                                    var7--;
                                    class287.field4461 = class169.field2434[var7] == 1;
                                    class167.method1100(false);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6018) {
                                    var7--;
                                    int var368 = class169.field2434[var7];
                                    if (var368 < 0) {
                                        var368 = 0;
                                    }
                                    if (var368 > 127) {
                                        var368 = 127;
                                    }
                                    class254.field3663 = var368;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6019) {
                                    var7--;
                                    int var369 = class169.field2434[var7];
                                    if (var369 < 0) {
                                        var369 = 0;
                                    }
                                    if (var369 > 255) {
                                        var369 = 255;
                                    }
                                    if (class137.field1989 != var369) {
                                        if (class137.field1989 == 0 && class34.field400 != -1) {
                                            class172.method1121(0, class34.field400, class163.field2346, 68, var369, false);
                                            class19.field240 = false;
                                        } else if (var369 == 0) {
                                            class6.method35(71);
                                            class19.field240 = false;
                                        } else {
                                            class38.method243(var369, -19);
                                        }
                                        class137.field1989 = var369;
                                    }
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6020) {
                                    var7--;
                                    int var370 = class169.field2434[var7];
                                    if (var370 < 0) {
                                        var370 = 0;
                                    }
                                    if (var370 > 127) {
                                        var370 = 127;
                                    }
                                    class95.field1277 = var370;
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    continue;
                                }
                                if (var518 == 6021) {
                                    var7--;
                                    class139.field2022 = class169.field2434[var7] == 1;
                                    class90.method548(870);
                                    continue;
                                }
                                if (var518 == 6023) {
                                    var7--;
                                    int var371 = class169.field2434[var7];
                                    boolean var372 = false;
                                    if (var371 < 0) {
                                        var371 = 0;
                                    }
                                    if (var371 > 2) {
                                        var371 = 2;
                                    }
                                    if (class224.field3163 < 96) {
                                        var372 = true;
                                        var371 = 0;
                                    }
                                    class162.method1069(var371);
                                    class123.method807(class115.field1592, true);
                                    class115.field1596 = false;
                                    class169.field2434[var7++] = var372 ? 0 : 1;
                                    continue;
                                }
                                if (var518 == 6024) {
                                    var7--;
                                    int var373 = class169.field2434[var7];
                                    if (var373 < 0 || var373 > 2) {
                                        var373 = 0;
                                    }
                                    class115.field1590 = var373;
                                    class123.method807(class115.field1592, true);
                                    continue;
                                }
                                if (var518 == 6027) {
                                    var7--;
                                    continue;
                                }
                                if (var518 == 6028) {
                                    var7--;
                                    class172.field2461 = class169.field2434[var7] != 0;
                                    class123.method807(class115.field1592, true);
                                    continue;
                                }
                            } else if (var518 < 6200) {
                                if (var518 == 6101) {
                                    class169.field2434[var7++] = class204.field2906;
                                    continue;
                                }
                                if (var518 == 6102) {
                                    class169.field2434[var7++] = class176.method1141(1) ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6103) {
                                    class169.field2434[var7++] = class165.field2370 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6105) {
                                    class169.field2434[var7++] = class149.field2169 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6106) {
                                    class169.field2434[var7++] = class94.field1258 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6107) {
                                    class169.field2434[var7++] = class164.field2353 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6108) {
                                    class169.field2434[var7++] = class3.field39 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6109) {
                                    class169.field2434[var7++] = class234.field3375 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6110) {
                                    class169.field2434[var7++] = class284.field4342 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6111) {
                                    class169.field2434[var7++] = class99.field1347;
                                    continue;
                                }
                                if (var518 == 6112) {
                                    class169.field2434[var7++] = class91.field1241 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6114) {
                                    class169.field2434[var7++] = class193.field2772 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6115) {
                                    class169.field2434[var7++] = class14.field174 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6116) {
                                    class169.field2434[var7++] = class54.field624;
                                    continue;
                                }
                                if (var518 == 6117) {
                                    class169.field2434[var7++] = class287.field4461 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6118) {
                                    class169.field2434[var7++] = class254.field3663;
                                    continue;
                                }
                                if (var518 == 6119) {
                                    class169.field2434[var7++] = class137.field1989;
                                    continue;
                                }
                                if (var518 == 6120) {
                                    class169.field2434[var7++] = class95.field1277;
                                    continue;
                                }
                                if (var518 == 6121) {
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 6123) {
                                    class169.field2434[var7++] = class162.method1070();
                                    continue;
                                }
                                if (var518 == 6124) {
                                    class169.field2434[var7++] = class115.field1590;
                                    continue;
                                }
                                if (var518 == 6126) {
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 6127) {
                                    class169.field2434[var7++] = class258.field3756 ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6128) {
                                    class169.field2434[var7++] = class172.field2461 ? 1 : 0;
                                    continue;
                                }
                            } else if (var518 < 6300) {
                                if (var518 == 6200) {
                                    var7 -= 2;
                                    class99.field1348 = (short) class169.field2434[var7];
                                    if (class99.field1348 <= 0) {
                                        class99.field1348 = 256;
                                    }
                                    class11.field144 = (short) class169.field2434[var7 + 1];
                                    if (class11.field144 <= 0) {
                                        class11.field144 = 205;
                                    }
                                    continue;
                                }
                                if (var518 == 6201) {
                                    var7 -= 2;
                                    class163.field2343 = (short) class169.field2434[var7];
                                    if (class163.field2343 <= 0) {
                                        class163.field2343 = 256;
                                    }
                                    class61.field727 = (short) class169.field2434[var7 + 1];
                                    if (class61.field727 <= 0) {
                                        class61.field727 = 320;
                                    }
                                    continue;
                                }
                                if (var518 == 6202) {
                                    var7 -= 4;
                                    class59.field690 = (short) class169.field2434[var7];
                                    if (class59.field690 <= 0) {
                                        class59.field690 = 1;
                                    }
                                    class70.field819 = (short) class169.field2434[var7 + 1];
                                    if (class70.field819 <= 0) {
                                        class70.field819 = 32767;
                                    } else if (class70.field819 < class59.field690) {
                                        class70.field819 = class59.field690;
                                    }
                                    class170.field2436 = (short) class169.field2434[var7 + 2];
                                    if (class170.field2436 <= 0) {
                                        class170.field2436 = 1;
                                    }
                                    class61.field731 = (short) class169.field2434[var7 + 3];
                                    if (class61.field731 <= 0) {
                                        class61.field731 = 32767;
                                    } else if (class170.field2436 > class61.field731) {
                                        class61.field731 = class170.field2436;
                                    }
                                    continue;
                                }
                                if (var518 == 6203) {
                                    class243.method1580(class173.field2476.field1131, (byte) 107, 0, class173.field2476.field1048, 0, false);
                                    class169.field2434[var7++] = class181.field2584;
                                    class169.field2434[var7++] = class292.field4623;
                                    continue;
                                }
                                if (var518 == 6204) {
                                    class169.field2434[var7++] = class163.field2343;
                                    class169.field2434[var7++] = class61.field727;
                                    continue;
                                }
                                if (var518 == 6205) {
                                    class169.field2434[var7++] = class99.field1348;
                                    class169.field2434[var7++] = class11.field144;
                                    continue;
                                }
                            } else if (var518 < 6400) {
                                if (var518 == 6300) {
                                    class169.field2434[var7++] = (int) (class86.method509(false) / 60000L);
                                    continue;
                                }
                                if (var518 == 6301) {
                                    class169.field2434[var7++] = (int) (class86.method509(false) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var518 == 6302) {
                                    var7 -= 3;
                                    int var348 = class169.field2434[var7];
                                    int var349 = class169.field2434[var7 + 1];
                                    int var350 = class169.field2434[var7 + 2];
                                    class224.field3159.clear();
                                    class224.field3159.set(11, 12);
                                    class224.field3159.set(var350, var349, var348);
                                    class169.field2434[var7++] = (int) (class224.field3159.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var518 == 6303) {
                                    class224.field3159.clear();
                                    class224.field3159.setTime(new Date(class86.method509(false)));
                                    class169.field2434[var7++] = class224.field3159.get(1);
                                    continue;
                                }
                                if (var518 == 6304) {
                                    var7--;
                                    int var351 = class169.field2434[var7];
                                    boolean var352 = true;
                                    if (var351 < 0) {
                                        var352 = (var351 + 1) % 4 == 0;
                                    } else if (var351 < 1582) {
                                        var352 = (var351 % 4) == 0;
                                    } else if (var351 % 4 != 0) {
                                        var352 = false;
                                    } else if (var351 % 100 != 0) {
                                        var352 = true;
                                    } else if ((var351 % 400) != 0) {
                                        var352 = false;
                                    }
                                    class169.field2434[var7++] = var352 ? 1 : 0;
                                    continue;
                                }
                            } else if (var518 < 6500) {
                                if (var518 == 6405) {
                                    class169.field2434[var7++] = class259.method1654(124) ? 1 : 0;
                                    continue;
                                }
                                if (var518 == 6406) {
                                    class169.field2434[var7++] = class103.method627(-8113) ? 1 : 0;
                                    continue;
                                }
                            } else if (var518 < 6600) {
                                if (var518 == 6500) {
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0) {
                                        class169.field2434[var7++] = class33.method211((byte) -87) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class169.field2434[var7++] = 1;
                                    continue;
                                }
                                if (var518 == 6501) {
                                    class176 var353 = class30.method181((byte) 96);
                                    if (var353 == null) {
                                        class169.field2434[var7++] = -1;
                                        class169.field2434[var7++] = 0;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var353.field2503;
                                        class169.field2434[var7++] = var353.field274;
                                        class289.field4500[var8++] = var353.field2494;
                                        class16 var354 = var353.method1142((byte) -25);
                                        class169.field2434[var7++] = var354.field191;
                                        class289.field4500[var8++] = var354.field199;
                                        class169.field2434[var7++] = var353.field266;
                                    }
                                    continue;
                                }
                                if (var518 == 6502) {
                                    class176 var355 = class163.method1074(0);
                                    if (var355 == null) {
                                        class169.field2434[var7++] = -1;
                                        class169.field2434[var7++] = 0;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var355.field2503;
                                        class169.field2434[var7++] = var355.field274;
                                        class289.field4500[var8++] = var355.field2494;
                                        class16 var356 = var355.method1142((byte) -25);
                                        class169.field2434[var7++] = var356.field191;
                                        class289.field4500[var8++] = var356.field199;
                                        class169.field2434[var7++] = var355.field266;
                                    }
                                    continue;
                                }
                                if (var518 == 6503) {
                                    var7--;
                                    int var357 = class169.field2434[var7];
                                    if (class141.field2034 == 10 && class233.field3361 == 0 && class240.field3484 == 0 && class252.field3653 == 0) {
                                        class169.field2434[var7++] = class17.method104(false, var357) ? 1 : 0;
                                        continue;
                                    }
                                    class169.field2434[var7++] = 0;
                                    continue;
                                }
                                if (var518 == 6504) {
                                    var7--;
                                    class115.field1597 = class169.field2434[var7];
                                    class123.method807(class115.field1592, true);
                                    continue;
                                }
                                if (var518 == 6505) {
                                    class169.field2434[var7++] = class115.field1597;
                                    continue;
                                }
                                if (var518 == 6506) {
                                    var7--;
                                    int var358 = class169.field2434[var7];
                                    class176 var359 = class60.method371(var358, 128);
                                    if (var359 == null) {
                                        class169.field2434[var7++] = -1;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                        class289.field4500[var8++] = "";
                                        class169.field2434[var7++] = 0;
                                    } else {
                                        class169.field2434[var7++] = var359.field274;
                                        class289.field4500[var8++] = var359.field2494;
                                        class16 var360 = var359.method1142((byte) -25);
                                        class169.field2434[var7++] = var360.field191;
                                        class289.field4500[var8++] = var360.field199;
                                        class169.field2434[var7++] = var359.field266;
                                    }
                                    continue;
                                }
                                if (var518 == 6507) {
                                    var7 -= 4;
                                    boolean var361 = class169.field2434[var7 + 1] == 1;
                                    int var362 = class169.field2434[var7];
                                    boolean var363 = class169.field2434[var7 + 3] == 1;
                                    int var364 = class169.field2434[var7 + 2];
                                    class138.method901(127, var361, var364, var362, var363);
                                    continue;
                                }
                            } else if (var518 < 6700) {
                                if (var518 == 6600) {
                                    var7--;
                                    class254.field3666 = class169.field2434[var7] == 1;
                                    class123.method807(class115.field1592, true);
                                    continue;
                                }
                                if (var518 == 6601) {
                                    class169.field2434[var7++] = class254.field3666 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var518 == 4400) {
                            var7 -= 2;
                            int var390 = class169.field2434[var7 + 1];
                            int var391 = class169.field2434[var7];
                            class139 var392 = method99(var390, -31836);
                            if (var392.method910(-116)) {
                                class289.field4500[var8++] = class164.method1081(0, var391).method1754(var392.field2018, -1, var390);
                            } else {
                                class169.field2434[var7++] = class164.method1081(0, var391).method1748(true, var390, var392.field2019);
                            }
                            continue;
                        }
                    } else if (var518 == 4300) {
                        var7 -= 2;
                        int var393 = class169.field2434[var7];
                        int var394 = class169.field2434[var7 + 1];
                        class139 var395 = method99(var394, -31836);
                        if (var395.method910(-116)) {
                            class289.field4500[var8++] = class165.method1084(-84, var393).method1709(false, var395.field2018, var394);
                        } else {
                            class169.field2434[var7++] = class165.method1084(-47, var393).method1713(var395.field2019, var394, false);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var517) {
            if (var6.field4426 == null) {
                if (class200.field2851 != 0) {
                    class225.method1455("Clientscript error - check log for details", 74, "", 0);
                }
                class142.method918(-1, var517, "CS2 - scr:" + var6.field4489 + " op:" + var12);
            } else {
                StringBuffer var514 = new StringBuffer(30);
                var514.append("%0a - in: ").append(var6.field4426);
                for (int var515 = class96.field1282 - 1; var515 >= 0; var515--) {
                    var514.append("%0a - via: ").append(class232.field3346[var515].field1420.field4426);
                }
                if (var12 == 40) {
                    int var516 = var11[var9];
                    var514.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var516));
                }
                if (class200.field2851 != 0) {
                    class225.method1455("Clientscript error in: " + var6.field4426, -26, "", 0);
                }
                class142.method918(-1, var517, "CS2 - scr:" + var6.field4489 + " op:" + var12 + var514.toString());
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lti;")
    public static final class139 method99(int arg0, int arg1) {
        field192++;
        if (arg1 != -31836) {
            return null;
        }
        class139 var2 = (class139) class26.field299.method1567((long) arg0, 8);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field68.method1861(arg0, 11, 1);
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method909(0, new class216(var3));
        }
        class26.field299.method1568((byte) -117, var4, (long) arg0);
        return var4;
    }
}
