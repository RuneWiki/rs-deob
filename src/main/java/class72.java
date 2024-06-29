import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class72 {

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Leg;")
    private static class37 field1143 = class174.method1167("Loading world list data", 61);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Leg;")
    public static class37 field1136 = field1143;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lbf;")
    public static class202 field1135 = new class202(30);

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljl;")
    public static class101 field1139;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class178.field2972 <= arg0 && arg2 <= class217.field3741 && class286.field5050 <= arg3 && arg1 <= class96.field1507) {
            if (arg4 == 1) {
                class158.method1078(arg5, arg1, arg0, (byte) 82, arg3, arg2);
            } else {
                class61.method438(arg5, arg4, arg3, arg0, (byte) 101, arg2, arg1);
            }
        } else if (arg4 == 1) {
            class121.method854(arg2, arg3, arg5, arg0, arg6 - 1190, arg1);
        } else {
            class111.method778(arg6 - 1172, arg2, arg5, arg0, arg4, arg3, arg1);
        }
        field1137++;
        if (arg6 != 1300) {
            method489(52, false, 81, (class101) null, (class101) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZILec;)V")
    public static final void method487(boolean arg0, int arg1, class85 arg2) {
        field1144++;
        Object[] var3 = arg2.field1339;
        int var4 = (Integer) var3[0];
        class9 var5 = class170.method1134((byte) -22, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        class217.field3727 = 0;
        if (!arg0) {
            return;
        }
        int[] var9 = var5.field146;
        byte var10 = -1;
        int[] var11 = var5.field161;
        try {
            int var12 = 0;
            class146.field2484 = new int[var5.field153];
            class180.field3011 = new class37[var5.field162];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field1332;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field1340;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field1346 == null ? -1 : arg2.field1346.field4211;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field1335;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field1346 == null ? -1 : arg2.field1346.field4120;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field1329 == null ? -1 : arg2.field1329.field4211;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field1329 == null ? -1 : arg2.field1329.field4120;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field1338;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field1341;
                    }
                    class146.field2484[var12++] = var15;
                } else if (var3[var14] instanceof class37) {
                    class37 var16 = (class37) var3[var14];
                    if (var16.method223(class9.field151, (byte) 63)) {
                        var16 = arg2.field1328;
                    }
                    class180.field3011[var13++] = var16;
                }
            }
            int var17 = 0;
            label3825: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var494 = var11[var7];
                if (var494 < 100) {
                    if (var494 == 0) {
                        class254.field4519[var6++] = var9[var7];
                        continue;
                    }
                    if (var494 == 1) {
                        int var18 = var9[var7];
                        class254.field4519[var6++] = class153.field2571[var18];
                        continue;
                    }
                    if (var494 == 2) {
                        int var19 = var9[var7];
                        var6--;
                        class98.method635(class254.field4519[var6], var19, (byte) 124);
                        continue;
                    }
                    if (var494 == 3) {
                        class10.field169[var8++] = var5.field159[var7];
                        continue;
                    }
                    if (var494 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var494 == 7) {
                        var6 -= 2;
                        if (class254.field4519[var6 + 1] != class254.field4519[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 8) {
                        var6 -= 2;
                        if (class254.field4519[var6 + 1] == class254.field4519[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 9) {
                        var6 -= 2;
                        if (class254.field4519[var6] < class254.field4519[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 10) {
                        var6 -= 2;
                        if (class254.field4519[var6] > class254.field4519[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 21) {
                        if (class217.field3727 == 0) {
                            return;
                        }
                        class280 var20 = class226.field3877[--class217.field3727];
                        var5 = var20.field4946;
                        var11 = var5.field161;
                        class180.field3011 = var20.field4942;
                        class146.field2484 = var20.field4937;
                        var9 = var5.field146;
                        var7 = var20.field4939;
                        continue;
                    }
                    if (var494 == 25) {
                        int var21 = var9[var7];
                        class254.field4519[var6++] = class83.method556(1522, var21);
                        continue;
                    }
                    if (var494 == 27) {
                        int var22 = var9[var7];
                        var6--;
                        class36.method211(class254.field4519[var6], -1, var22);
                        continue;
                    }
                    if (var494 == 31) {
                        var6 -= 2;
                        if (class254.field4519[var6 + 1] >= class254.field4519[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 32) {
                        var6 -= 2;
                        if (class254.field4519[var6 + 1] <= class254.field4519[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 33) {
                        class254.field4519[var6++] = class146.field2484[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var494 == 34) {
                        var10001 = var9[var7];
                        var6--;
                        class146.field2484[var10001] = class254.field4519[var6];
                        continue;
                    }
                    if (var494 == 35) {
                        class10.field169[var8++] = class180.field3011[var9[var7]];
                        continue;
                    }
                    if (var494 == 36) {
                        var10001 = var9[var7];
                        var8--;
                        class180.field3011[var10001] = class10.field169[var8];
                        continue;
                    }
                    if (var494 == 37) {
                        int var23 = var9[var7];
                        var8 -= var23;
                        class37 var24 = class144.method1006(var23, var8, class10.field169, (byte) -6);
                        class10.field169[var8++] = var24;
                        continue;
                    }
                    if (var494 == 38) {
                        var6--;
                        continue;
                    }
                    if (var494 == 39) {
                        var8--;
                        continue;
                    }
                    if (var494 == 40) {
                        int var25 = var9[var7];
                        class9 var26 = class170.method1134((byte) -22, var25);
                        class37[] var27 = new class37[var26.field162];
                        int[] var28 = new int[var26.field153];
                        for (int var29 = 0; var29 < var26.field155; var29++) {
                            var28[var29] = class254.field4519[var6 + var29 - var26.field155];
                        }
                        for (int var30 = 0; var30 < var26.field160; var30++) {
                            var27[var30] = class10.field169[var8 + var30 - var26.field160];
                        }
                        var6 -= var26.field155;
                        var8 -= var26.field160;
                        class280 var31 = new class280();
                        var31.field4946 = var5;
                        var31.field4942 = class180.field3011;
                        var31.field4939 = var7;
                        var31.field4937 = class146.field2484;
                        if (class226.field3877.length <= class217.field3727) {
                            throw new RuntimeException();
                        }
                        class226.field3877[class217.field3727++] = var31;
                        var5 = var26;
                        class180.field3011 = var27;
                        var11 = var26.field161;
                        var9 = var26.field146;
                        class146.field2484 = var28;
                        var7 = -1;
                        continue;
                    }
                    if (var494 == 42) {
                        class254.field4519[var6++] = class166.field2753[var9[var7]];
                        continue;
                    }
                    if (var494 == 43) {
                        int var32 = var9[var7];
                        var6--;
                        class166.field2753[var32] = class254.field4519[var6];
                        class273.method1827(116, var32);
                        continue;
                    }
                    if (var494 == 44) {
                        int var33 = var9[var7] >> 16;
                        var6--;
                        int var34 = class254.field4519[var6];
                        int var35 = var9[var7] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class263.field4634[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label3825;
                                }
                                class282.field4983[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 45) {
                        int var38 = var9[var7];
                        var6--;
                        int var39 = class254.field4519[var6];
                        if (var39 >= 0 && var39 < class263.field4634[var38]) {
                            class254.field4519[var6++] = class282.field4983[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 46) {
                        var6 -= 2;
                        int var40 = var9[var7];
                        int var41 = class254.field4519[var6];
                        if (var41 >= 0 && class263.field4634[var40] > var41) {
                            class282.field4983[var40][var41] = class254.field4519[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 47) {
                        class37 var42 = class230.field3935[var9[var7]];
                        if (var42 == null) {
                            var42 = class20.field264;
                        }
                        class10.field169[var8++] = var42;
                        continue;
                    }
                    if (var494 == 48) {
                        int var43 = var9[var7];
                        var8--;
                        class230.field3935[var43] = class10.field169[var8];
                        class5.method32(false, var43);
                        continue;
                    }
                    if (var494 == 51) {
                        class140 var44 = var5.field150[var9[var7]];
                        var6--;
                        class120 var45 = (class120) var44.method992((byte) 125, (long) class254.field4519[var6]);
                        if (var45 != null) {
                            var7 += var45.field2027;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var494 < 300) {
                    if (var494 == 100) {
                        var6 -= 3;
                        int var47 = class254.field4519[var6];
                        int var48 = class254.field4519[var6 + 2];
                        int var49 = class254.field4519[var6 + 1];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class237 var50 = class156.method1066(-78, var47);
                        if (var50.field4194 == null) {
                            var50.field4194 = new class237[var48 + 1];
                        }
                        if (var48 >= var50.field4194.length) {
                            class237[] var51 = new class237[var48 + 1];
                            for (int var52 = 0; var52 < var50.field4194.length; var52++) {
                                var51[var52] = var50.field4194[var52];
                            }
                            var50.field4194 = var51;
                        }
                        if (var48 > 0 && var50.field4194[var48 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var48 - 1));
                        }
                        class237 var53 = new class237();
                        var53.field4129 = true;
                        var53.field4171 = var53.field4211 = var50.field4211;
                        var53.field4120 = var48;
                        var53.field4228 = var49;
                        var50.field4194[var48] = var53;
                        if (var46) {
                            class67.field1059 = var53;
                        } else {
                            class247.field4443 = var53;
                        }
                        class121.method856(24665, var50);
                        continue;
                    }
                    if (var494 == 101) {
                        class237 var54 = var46 ? class67.field1059 : class247.field4443;
                        if (var54.field4120 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class237 var55 = class156.method1066(-108, var54.field4211);
                        var55.field4194[var54.field4120] = null;
                        class121.method856(24665, var55);
                        continue;
                    }
                    if (var494 == 102) {
                        var6--;
                        class237 var56 = class156.method1066(-107, class254.field4519[var6]);
                        var56.field4194 = null;
                        class121.method856(24665, var56);
                        continue;
                    }
                    if (var494 == 200) {
                        var6 -= 2;
                        int var57 = class254.field4519[var6];
                        int var58 = class254.field4519[var6 + 1];
                        class237 var59 = class47.method309(128, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class254.field4519[var6++] = 1;
                            if (var46) {
                                class67.field1059 = var59;
                            } else {
                                class247.field4443 = var59;
                            }
                            continue;
                        }
                        class254.field4519[var6++] = 0;
                        continue;
                    }
                    if (var494 == 201) {
                        var6--;
                        int var60 = class254.field4519[var6];
                        class237 var61 = class156.method1066(-111, var60);
                        if (var61 == null) {
                            class254.field4519[var6++] = 0;
                        } else {
                            class254.field4519[var6++] = 1;
                            if (var46) {
                                class67.field1059 = var61;
                            } else {
                                class247.field4443 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var494 < 500) {
                    if (var494 == 403) {
                        var6 -= 2;
                        int var62 = class254.field4519[var6];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        int var63 = class254.field4519[var6 + 1];
                        class82.field1285.field3217.method1916(var63, -8236, var62);
                        continue;
                    }
                    if (var494 == 404) {
                        var6 -= 2;
                        int var64 = class254.field4519[var6 + 1];
                        int var65 = class254.field4519[var6];
                        class82.field1285.field3217.method1909(var64, var65, -13);
                        continue;
                    }
                    if (var494 == 410) {
                        var6--;
                        boolean var66 = class254.field4519[var6] != 0;
                        class82.field1285.field3217.method1912(var66, (byte) 112);
                        continue;
                    }
                } else if (!(var494 < 1000 || var494 >= 1100) || !(var494 < 2000 || var494 >= 2100)) {
                    class237 var67;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var6--;
                        var67 = class156.method1066(-117, class254.field4519[var6]);
                    } else {
                        var67 = var46 ? class67.field1059 : class247.field4443;
                    }
                    if (var494 == 1000) {
                        var6 -= 4;
                        var67.field4185 = class254.field4519[var6];
                        var67.field4072 = class254.field4519[var6 + 1];
                        int var68 = class254.field4519[var6 + 3];
                        if (var68 < 0) {
                            var68 = 0;
                        } else if (var68 > 5) {
                            var68 = 5;
                        }
                        int var69 = class254.field4519[var6 + 2];
                        var67.field4086 = (byte) var68;
                        if (var69 < 0) {
                            var69 = 0;
                        } else if (var69 > 5) {
                            var69 = 5;
                        }
                        var67.field4222 = (byte) var69;
                        class121.method856(24665, var67);
                        class18.method124((byte) 63, var67);
                        if (var67.field4120 == -1) {
                            class194.method1342(var67.field4211, 11);
                        }
                        continue;
                    }
                    if (var494 == 1001) {
                        var6 -= 4;
                        var67.field4141 = class254.field4519[var6];
                        var67.field4172 = class254.field4519[var6 + 1];
                        var67.field4186 = 0;
                        var67.field4073 = 0;
                        int var70 = class254.field4519[var6 + 3];
                        int var71 = class254.field4519[var6 + 2];
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 4) {
                            var70 = 4;
                        }
                        var67.field4134 = (byte) var70;
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 4) {
                            var71 = 4;
                        }
                        var67.field4218 = (byte) var71;
                        class121.method856(24665, var67);
                        class18.method124((byte) 63, var67);
                        if (var67.field4228 == 0) {
                            class272.method1823(75, false, var67);
                        }
                        continue;
                    }
                    if (var494 == 1003) {
                        var6--;
                        boolean var72 = class254.field4519[var6] == 1;
                        if (var67.field4133 != var72) {
                            var67.field4133 = var72;
                            class121.method856(24665, var67);
                        }
                        if (var67.field4120 == -1) {
                            class196.method1367(-105, var67.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1004) {
                        var6 -= 2;
                        var67.field4221 = class254.field4519[var6];
                        var67.field4102 = class254.field4519[var6 + 1];
                        class121.method856(24665, var67);
                        class18.method124((byte) 63, var67);
                        if (var67.field4228 == 0) {
                            class272.method1823(21, false, var67);
                        }
                        continue;
                    }
                } else if (var494 >= 1100 && var494 < 1200 || var494 >= 2100 && var494 < 2200) {
                    class237 var485;
                    if (var494 >= 2000) {
                        var6--;
                        var485 = class156.method1066(-93, class254.field4519[var6]);
                        var494 -= 1000;
                    } else {
                        var485 = var46 ? class67.field1059 : class247.field4443;
                    }
                    if (var494 == 1100) {
                        var6 -= 2;
                        var485.field4136 = class254.field4519[var6];
                        if ((var485.field4132 - var485.field4067) < var485.field4136) {
                            var485.field4136 = var485.field4132 - var485.field4067;
                        }
                        if (var485.field4136 < 0) {
                            var485.field4136 = 0;
                        }
                        var485.field4122 = class254.field4519[var6 + 1];
                        if (var485.field4090 - var485.field4206 < var485.field4122) {
                            var485.field4122 = var485.field4090 - var485.field4206;
                        }
                        if (var485.field4122 < 0) {
                            var485.field4122 = 0;
                        }
                        class121.method856(24665, var485);
                        if (var485.field4120 == -1) {
                            class84.method558(var485.field4211, (byte) 121);
                        }
                        continue;
                    }
                    if (var494 == 1101) {
                        var6--;
                        var485.field4124 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        if (var485.field4120 == -1) {
                            class124.method894(-22948, var485.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1102) {
                        var6--;
                        var485.field4103 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1103) {
                        var6--;
                        var485.field4125 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1104) {
                        var6--;
                        var485.field4115 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1105) {
                        var6--;
                        var485.field4104 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1106) {
                        var6--;
                        var485.field4163 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1107) {
                        var6--;
                        var485.field4131 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1108) {
                        var485.field4119 = 1;
                        var6--;
                        var485.field4085 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        if (var485.field4120 == -1) {
                            class8.method49((byte) -96, var485.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1109) {
                        var6 -= 6;
                        var485.field4199 = class254.field4519[var6];
                        var485.field4130 = class254.field4519[var6 + 1];
                        var485.field4107 = class254.field4519[var6 + 2];
                        var485.field4145 = class254.field4519[var6 + 3];
                        var485.field4162 = class254.field4519[var6 + 4];
                        var485.field4192 = class254.field4519[var6 + 5];
                        class121.method856(24665, var485);
                        if (var485.field4120 == -1) {
                            class117.method838(10, var485.field4211);
                            class137.method970((byte) -65, var485.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1110) {
                        var6--;
                        int var486 = class254.field4519[var6];
                        if (var485.field4181 != var486) {
                            var485.field4181 = var486;
                            var485.field4165 = 0;
                            var485.field4110 = 0;
                            class121.method856(24665, var485);
                        }
                        if (var485.field4120 == -1) {
                            class28.method160(var485.field4211, 103);
                        }
                        continue;
                    }
                    if (var494 == 1111) {
                        var6--;
                        var485.field4089 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1112) {
                        var8--;
                        class37 var487 = class10.field169[var8];
                        if (!var487.method223(var485.field4098, (byte) 63)) {
                            var485.field4098 = var487;
                            class121.method856(24665, var485);
                        }
                        if (var485.field4120 == -1) {
                            class252.method1724((byte) 31, var485.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1113) {
                        var6--;
                        var485.field4173 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1114) {
                        var6 -= 3;
                        var485.field4087 = class254.field4519[var6];
                        var485.field4118 = class254.field4519[var6 + 1];
                        var485.field4078 = class254.field4519[var6 + 2];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1115) {
                        var6--;
                        var485.field4164 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1116) {
                        var6--;
                        var485.field4195 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1117) {
                        var6--;
                        var485.field4144 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1118) {
                        var6--;
                        var485.field4168 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1119) {
                        var6--;
                        var485.field4139 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1120) {
                        var6 -= 2;
                        var485.field4132 = class254.field4519[var6];
                        var485.field4090 = class254.field4519[var6 + 1];
                        class121.method856(24665, var485);
                        if (var485.field4228 == 0) {
                            class272.method1823(70, false, var485);
                        }
                        continue;
                    }
                    if (var494 == 1121) {
                        var6 -= 2;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1122) {
                        var6--;
                        var485.field4146 = class254.field4519[var6] == 1;
                        class121.method856(24665, var485);
                        continue;
                    }
                    if (var494 == 1123) {
                        var6--;
                        var485.field4192 = class254.field4519[var6];
                        class121.method856(24665, var485);
                        if (var485.field4120 == -1) {
                            class117.method838(10, var485.field4211);
                        }
                        continue;
                    }
                } else if (var494 >= 1200 && var494 < 1300 || var494 >= 2200 && var494 < 2300) {
                    class237 var481;
                    if (var494 < 2000) {
                        var481 = var46 ? class67.field1059 : class247.field4443;
                    } else {
                        var6--;
                        var481 = class156.method1066(-95, class254.field4519[var6]);
                        var494 -= 1000;
                    }
                    class121.method856(24665, var481);
                    if (var494 == 1200 || var494 == 1205) {
                        var6 -= 2;
                        int var482 = class254.field4519[var6 + 1];
                        int var483 = class254.field4519[var6];
                        if (var481.field4120 == -1) {
                            class184.method1232((byte) -94, var481.field4211);
                            class117.method838(10, var481.field4211);
                            class137.method970((byte) -95, var481.field4211);
                        }
                        if (var483 == -1) {
                            var481.field4119 = 1;
                            var481.field4080 = -1;
                            var481.field4085 = -1;
                        } else {
                            var481.field4200 = var482;
                            var481.field4080 = var483;
                            class241 var484 = class9.method52(true, var483);
                            var481.field4192 = var484.field4352;
                            var481.field4145 = var484.field4289;
                            var481.field4107 = var484.field4343;
                            if (var494 == 1205) {
                                var481.field4127 = false;
                            } else {
                                var481.field4127 = true;
                            }
                            var481.field4162 = var484.field4348;
                            var481.field4130 = var484.field4330;
                            if (var481.field4073 > 0) {
                                var481.field4192 = var481.field4192 * 32 / var481.field4073;
                            } else if (var481.field4141 > 0) {
                                var481.field4192 = var481.field4192 * 32 / var481.field4141;
                            }
                            var481.field4199 = var484.field4339;
                        }
                        continue;
                    }
                    if (var494 == 1201) {
                        var481.field4119 = 2;
                        var6--;
                        var481.field4085 = class254.field4519[var6];
                        if (var481.field4120 == -1) {
                            class8.method49((byte) -93, var481.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1202) {
                        var481.field4119 = 3;
                        var481.field4085 = class82.field1285.field3217.method1904((byte) 66);
                        if (var481.field4120 == -1) {
                            class8.method49((byte) -118, var481.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1203) {
                        var481.field4119 = 6;
                        var6--;
                        var481.field4085 = class254.field4519[var6];
                        if (var481.field4120 == -1) {
                            class8.method49((byte) -85, var481.field4211);
                        }
                        continue;
                    }
                    if (var494 == 1204) {
                        var481.field4119 = 5;
                        var6--;
                        var481.field4085 = class254.field4519[var6];
                        if (var481.field4120 == -1) {
                            class8.method49((byte) -50, var481.field4211);
                        }
                        continue;
                    }
                } else if ((var494 < 1300 || var494 >= 1400) && (var494 < 2300 || var494 >= 2400)) {
                    if (var494 >= 1400 && var494 < 1500 || var494 >= 2400 && var494 < 2500) {
                        class237 var77;
                        if (var494 >= 2000) {
                            var494 -= 1000;
                            var6--;
                            var77 = class156.method1066(-108, class254.field4519[var6]);
                        } else {
                            var77 = var46 ? class67.field1059 : class247.field4443;
                        }
                        var8--;
                        class37 var78 = class10.field169[var8];
                        int[] var79 = null;
                        if (var78.method222((byte) 88) > 0 && var78.method215((byte) -62, var78.method222((byte) 110) - 1) == 89) {
                            var6--;
                            int var80 = class254.field4519[var6];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while ((var80--) > 0) {
                                    var6--;
                                    var79[var80] = class254.field4519[var6];
                                }
                            }
                            var78 = var78.method247(0, var78.method222((byte) -120) - 1, 0);
                        }
                        Object[] var81 = new Object[var78.method222((byte) 118) + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.method215((byte) -101, var82 - 1) == 115) {
                                var8--;
                                var81[var82] = class10.field169[var8];
                            } else {
                                var6--;
                                var81[var82] = Integer.valueOf(class254.field4519[var6]);
                            }
                        }
                        var6--;
                        int var83 = class254.field4519[var6];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var494 == 1400) {
                            var77.field4135 = var81;
                        } else if (var494 == 1401) {
                            var77.field4097 = var81;
                        } else if (var494 == 1402) {
                            var77.field4114 = var81;
                        } else if (var494 == 1403) {
                            var77.field4095 = var81;
                        } else if (var494 == 1404) {
                            var77.field4208 = var81;
                        } else if (var494 == 1405) {
                            var77.field4217 = var81;
                        } else if (var494 == 1406) {
                            var77.field4150 = var81;
                        } else if (var494 == 1407) {
                            var77.field4177 = var81;
                            var77.field4092 = var79;
                        } else if (var494 == 1408) {
                            var77.field4202 = var81;
                        } else if (var494 == 1409) {
                            var77.field4227 = var81;
                        } else if (var494 == 1410) {
                            var77.field4138 = var81;
                        } else if (var494 == 1411) {
                            var77.field4143 = var81;
                        } else if (var494 == 1412) {
                            var77.field4184 = var81;
                        } else if (var494 == 1414) {
                            var77.field4088 = var79;
                            var77.field4093 = var81;
                        } else if (var494 == 1415) {
                            var77.field4178 = var81;
                            var77.field4225 = var79;
                        } else if (var494 == 1416) {
                            var77.field4166 = var81;
                        } else if (var494 == 1417) {
                            var77.field4082 = var81;
                        } else if (var494 == 1418) {
                            var77.field4142 = var81;
                        } else if (var494 == 1419) {
                            var77.field4176 = var81;
                        } else if (var494 == 1420) {
                            var77.field4105 = var81;
                        } else if (var494 == 1421) {
                            var77.field4223 = var81;
                        } else if (var494 == 1422) {
                            var77.field4106 = var81;
                        } else if (var494 == 1423) {
                            var77.field4109 = var81;
                        } else if (var494 == 1424) {
                            var77.field4075 = var81;
                        } else if (var494 == 1425) {
                            var77.field4153 = var81;
                        } else if (var494 == 1426) {
                            var77.field4070 = var81;
                        } else if (var494 == 1427) {
                            var77.field4226 = var81;
                        } else if (var494 == 1428) {
                            var77.field4161 = var81;
                            var77.field4212 = var79;
                        } else if (var494 == 1429) {
                            var77.field4203 = var81;
                            var77.field4084 = var79;
                        }
                        var77.field4224 = true;
                        continue;
                    }
                    if (var494 < 1600) {
                        class237 var84 = var46 ? class67.field1059 : class247.field4443;
                        if (var494 == 1500) {
                            class254.field4519[var6++] = var84.field4183;
                            continue;
                        }
                        if (var494 == 1501) {
                            class254.field4519[var6++] = var84.field4074;
                            continue;
                        }
                        if (var494 == 1502) {
                            class254.field4519[var6++] = var84.field4067;
                            continue;
                        }
                        if (var494 == 1503) {
                            class254.field4519[var6++] = var84.field4206;
                            continue;
                        }
                        if (var494 == 1504) {
                            class254.field4519[var6++] = var84.field4133 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 1505) {
                            class254.field4519[var6++] = var84.field4171;
                            continue;
                        }
                    } else if (var494 < 1700) {
                        class237 var480 = var46 ? class67.field1059 : class247.field4443;
                        if (var494 == 1600) {
                            class254.field4519[var6++] = var480.field4136;
                            continue;
                        }
                        if (var494 == 1601) {
                            class254.field4519[var6++] = var480.field4122;
                            continue;
                        }
                        if (var494 == 1602) {
                            class10.field169[var8++] = var480.field4098;
                            continue;
                        }
                        if (var494 == 1603) {
                            class254.field4519[var6++] = var480.field4132;
                            continue;
                        }
                        if (var494 == 1604) {
                            class254.field4519[var6++] = var480.field4090;
                            continue;
                        }
                        if (var494 == 1605) {
                            class254.field4519[var6++] = var480.field4192;
                            continue;
                        }
                        if (var494 == 1606) {
                            class254.field4519[var6++] = var480.field4107;
                            continue;
                        }
                        if (var494 == 1607) {
                            class254.field4519[var6++] = var480.field4162;
                            continue;
                        }
                        if (var494 == 1608) {
                            class254.field4519[var6++] = var480.field4145;
                            continue;
                        }
                        if (var494 == 1609) {
                            class254.field4519[var6++] = var480.field4125;
                            continue;
                        }
                        if (var494 == 1610) {
                            class254.field4519[var6++] = var480.field4199;
                            continue;
                        }
                        if (var494 == 1611) {
                            class254.field4519[var6++] = var480.field4130;
                            continue;
                        }
                    } else if (var494 < 1800) {
                        class237 var85 = var46 ? class67.field1059 : class247.field4443;
                        if (var494 == 1700) {
                            class254.field4519[var6++] = var85.field4080;
                            continue;
                        }
                        if (var494 == 1701) {
                            if (var85.field4080 == -1) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = var85.field4200;
                            }
                            continue;
                        }
                        if (var494 == 1702) {
                            class254.field4519[var6++] = var85.field4120;
                            continue;
                        }
                    } else if (var494 < 1900) {
                        class237 var478 = var46 ? class67.field1059 : class247.field4443;
                        if (var494 == 1800) {
                            class254.field4519[var6++] = class285.method1910(client.method787(var478), -19253);
                            continue;
                        }
                        if (var494 == 1801) {
                            var6--;
                            int var479 = class254.field4519[var6];
                            int var496 = var479 - 1;
                            if (var478.field4076 != null && var496 < var478.field4076.length && var478.field4076[var496] != null) {
                                class10.field169[var8++] = var478.field4076[var496];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 1802) {
                            if (var478.field4188 == null) {
                                class10.field169[var8++] = class123.field2061;
                            } else {
                                class10.field169[var8++] = var478.field4188;
                            }
                            continue;
                        }
                    } else if (var494 < 2600) {
                        var6--;
                        class237 var86 = class156.method1066(-106, class254.field4519[var6]);
                        if (var494 == 2500) {
                            class254.field4519[var6++] = var86.field4183;
                            continue;
                        }
                        if (var494 == 2501) {
                            class254.field4519[var6++] = var86.field4074;
                            continue;
                        }
                        if (var494 == 2502) {
                            class254.field4519[var6++] = var86.field4067;
                            continue;
                        }
                        if (var494 == 2503) {
                            class254.field4519[var6++] = var86.field4206;
                            continue;
                        }
                        if (var494 == 2504) {
                            class254.field4519[var6++] = var86.field4133 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 2505) {
                            class254.field4519[var6++] = var86.field4171;
                            continue;
                        }
                    } else if (var494 < 2700) {
                        var6--;
                        class237 var87 = class156.method1066(-121, class254.field4519[var6]);
                        if (var494 == 2600) {
                            class254.field4519[var6++] = var87.field4136;
                            continue;
                        }
                        if (var494 == 2601) {
                            class254.field4519[var6++] = var87.field4122;
                            continue;
                        }
                        if (var494 == 2602) {
                            class10.field169[var8++] = var87.field4098;
                            continue;
                        }
                        if (var494 == 2603) {
                            class254.field4519[var6++] = var87.field4132;
                            continue;
                        }
                        if (var494 == 2604) {
                            class254.field4519[var6++] = var87.field4090;
                            continue;
                        }
                        if (var494 == 2605) {
                            class254.field4519[var6++] = var87.field4192;
                            continue;
                        }
                        if (var494 == 2606) {
                            class254.field4519[var6++] = var87.field4107;
                            continue;
                        }
                        if (var494 == 2607) {
                            class254.field4519[var6++] = var87.field4162;
                            continue;
                        }
                        if (var494 == 2608) {
                            class254.field4519[var6++] = var87.field4145;
                            continue;
                        }
                        if (var494 == 2609) {
                            class254.field4519[var6++] = var87.field4125;
                            continue;
                        }
                        if (var494 == 2610) {
                            class254.field4519[var6++] = var87.field4199;
                            continue;
                        }
                        if (var494 == 2611) {
                            class254.field4519[var6++] = var87.field4130;
                            continue;
                        }
                    } else if (var494 < 2800) {
                        if (var494 == 2700) {
                            var6--;
                            class237 var468 = class156.method1066(-74, class254.field4519[var6]);
                            class254.field4519[var6++] = var468.field4080;
                            continue;
                        }
                        if (var494 == 2701) {
                            var6--;
                            class237 var469 = class156.method1066(-87, class254.field4519[var6]);
                            if (var469.field4080 == -1) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = var469.field4200;
                            }
                            continue;
                        }
                        if (var494 == 2702) {
                            var6--;
                            int var470 = class254.field4519[var6];
                            class190 var471 = (class190) class120.field2022.method992((byte) 125, (long) var470);
                            if (var471 == null) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = 1;
                            }
                            continue;
                        }
                        if (var494 == 2703) {
                            var6--;
                            class237 var472 = class156.method1066(-81, class254.field4519[var6]);
                            if (var472.field4194 == null) {
                                class254.field4519[var6++] = 0;
                                continue;
                            }
                            int var473 = var472.field4194.length;
                            for (int var474 = 0; var474 < var472.field4194.length; var474++) {
                                if (var472.field4194[var474] == null) {
                                    var473 = var474;
                                    break;
                                }
                            }
                            class254.field4519[var6++] = var473;
                            continue;
                        }
                        if (var494 == 2704 || var494 == 2705) {
                            var6 -= 2;
                            int var475 = class254.field4519[var6 + 1];
                            int var476 = class254.field4519[var6];
                            class190 var477 = (class190) class120.field2022.method992((byte) 125, (long) var476);
                            if (var477 != null && var477.field3259 == var475) {
                                class254.field4519[var6++] = 1;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                    } else if (var494 < 2900) {
                        var6--;
                        class237 var466 = class156.method1066(-121, class254.field4519[var6]);
                        if (var494 == 2800) {
                            class254.field4519[var6++] = class285.method1910(client.method787(var466), -19253);
                            continue;
                        }
                        if (var494 == 2801) {
                            var6--;
                            int var467 = class254.field4519[var6];
                            int var495 = var467 - 1;
                            if (var466.field4076 != null && var466.field4076.length > var495 && var466.field4076[var495] != null) {
                                class10.field169[var8++] = var466.field4076[var495];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 2802) {
                            if (var466.field4188 == null) {
                                class10.field169[var8++] = class123.field2061;
                            } else {
                                class10.field169[var8++] = var466.field4188;
                            }
                            continue;
                        }
                    } else if (var494 < 3200) {
                        if (var494 == 3100) {
                            var8--;
                            class37 var88 = class10.field169[var8];
                            class274.method1839((byte) -82, 0, class123.field2061, var88);
                            continue;
                        }
                        if (var494 == 3101) {
                            var6 -= 2;
                            class112.method803(class254.field4519[var6 + 1], class82.field1285, 239, class254.field4519[var6]);
                            continue;
                        }
                        if (var494 == 3103) {
                            class169.method1131(-8);
                            continue;
                        }
                        if (var494 == 3104) {
                            var8--;
                            class37 var89 = class10.field169[var8];
                            class243.field4371++;
                            int var90 = 0;
                            if (var89.method228(-60)) {
                                var90 = var89.method231((byte) 101);
                            }
                            class273.field4778.method1697(144, 104);
                            class273.field4778.method1272(27862, var90);
                            continue;
                        }
                        if (var494 == 3105) {
                            class64.field1041++;
                            var8--;
                            class37 var91 = class10.field169[var8];
                            class273.field4778.method1697(158, 116);
                            class273.field4778.method1256(var91.method217((byte) -102), (byte) 84);
                            continue;
                        }
                        if (var494 == 3106) {
                            class182.field3038++;
                            var8--;
                            class37 var92 = class10.field169[var8];
                            class273.field4778.method1697(240, 97);
                            class273.field4778.method1292(var92.method222((byte) 123) + 1, (byte) -64);
                            class273.field4778.method1289(var92, -76);
                            continue;
                        }
                        if (var494 == 3107) {
                            var6--;
                            int var93 = class254.field4519[var6];
                            var8--;
                            class37 var94 = class10.field169[var8];
                            class169.method1133(var93, var94, (byte) 23);
                            continue;
                        }
                        if (var494 == 3108) {
                            var6 -= 3;
                            int var95 = class254.field4519[var6];
                            int var96 = class254.field4519[var6 + 1];
                            int var97 = class254.field4519[var6 + 2];
                            class237 var98 = class156.method1066(-85, var97);
                            class33.method192(var98, var95, 4096, var96);
                            continue;
                        }
                        if (var494 == 3109) {
                            var6 -= 2;
                            int var99 = class254.field4519[var6];
                            int var100 = class254.field4519[var6 + 1];
                            class237 var101 = var46 ? class67.field1059 : class247.field4443;
                            class33.method192(var101, var99, 4096, var100);
                            continue;
                        }
                        if (var494 == 3110) {
                            var6--;
                            int var102 = class254.field4519[var6];
                            class39.field628++;
                            class273.field4778.method1697(199, 94);
                            class273.field4778.method1294(var102, -26655);
                            continue;
                        }
                    } else if (var494 < 3300) {
                        if (var494 == 3200) {
                            var6 -= 3;
                            class79.method534(class254.field4519[var6 + 1], (byte) 125, class254.field4519[var6 + 2], class254.field4519[var6]);
                            continue;
                        }
                        if (var494 == 3201) {
                            var6--;
                            class10.method69(class254.field4519[var6], (byte) 89);
                            continue;
                        }
                        if (var494 == 3202) {
                            var6 -= 2;
                            class48.method316((byte) -117, class254.field4519[var6], class254.field4519[var6 + 1]);
                            continue;
                        }
                    } else if (var494 < 3400) {
                        if (var494 == 3300) {
                            class254.field4519[var6++] = field1146;
                            continue;
                        }
                        if (var494 == 3301) {
                            var6 -= 2;
                            int var103 = class254.field4519[var6 + 1];
                            int var104 = class254.field4519[var6];
                            class254.field4519[var6++] = class110.method775(-1, var104, var103);
                            continue;
                        }
                        if (var494 == 3302) {
                            var6 -= 2;
                            int var105 = class254.field4519[var6];
                            int var106 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class99.method641(var105, -750180895, var106);
                            continue;
                        }
                        if (var494 == 3303) {
                            var6 -= 2;
                            int var107 = class254.field4519[var6 + 1];
                            int var108 = class254.field4519[var6];
                            class254.field4519[var6++] = class41.method276((byte) 43, var107, var108);
                            continue;
                        }
                        if (var494 == 3304) {
                            var6--;
                            int var109 = class254.field4519[var6];
                            class254.field4519[var6++] = class285.method1913((byte) -111, var109).field4757;
                            continue;
                        }
                        if (var494 == 3305) {
                            var6--;
                            int var110 = class254.field4519[var6];
                            class254.field4519[var6++] = class158.field2628[var110];
                            continue;
                        }
                        if (var494 == 3306) {
                            var6--;
                            int var111 = class254.field4519[var6];
                            class254.field4519[var6++] = class264.field4640[var111];
                            continue;
                        }
                        if (var494 == 3307) {
                            var6--;
                            int var112 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.field2508[var112];
                            continue;
                        }
                        if (var494 == 3308) {
                            int var113 = class237.field4140;
                            int var114 = (class82.field1285.field1799 >> 7) + class40.field642;
                            int var115 = (class82.field1285.field1793 >> 7) + class144.field2456;
                            class254.field4519[var6++] = (var113 << 28) + (var114 << 14) + var115;
                            continue;
                        }
                        if (var494 == 3309) {
                            var6--;
                            int var116 = class254.field4519[var6];
                            class254.field4519[var6++] = class96.method626(var116, 268421784) >> 14;
                            continue;
                        }
                        if (var494 == 3310) {
                            var6--;
                            int var117 = class254.field4519[var6];
                            class254.field4519[var6++] = var117 >> 28;
                            continue;
                        }
                        if (var494 == 3311) {
                            var6--;
                            int var118 = class254.field4519[var6];
                            class254.field4519[var6++] = class96.method626(16383, var118);
                            continue;
                        }
                        if (var494 == 3312) {
                            class254.field4519[var6++] = class146.field2483 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3313) {
                            var6 -= 2;
                            int var119 = class254.field4519[var6] + 32768;
                            int var120 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class110.method775(-1, var119, var120);
                            continue;
                        }
                        if (var494 == 3314) {
                            var6 -= 2;
                            int var121 = class254.field4519[var6 + 1];
                            int var122 = class254.field4519[var6] + 32768;
                            class254.field4519[var6++] = class99.method641(var122, -750180895, var121);
                            continue;
                        }
                        if (var494 == 3315) {
                            var6 -= 2;
                            int var123 = class254.field4519[var6] + 32768;
                            int var124 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class41.method276((byte) 43, var124, var123);
                            continue;
                        }
                        if (var494 == 3316) {
                            if (class127.field2129 >= 2) {
                                class254.field4519[var6++] = class127.field2129;
                            } else {
                                class254.field4519[var6++] = 0;
                            }
                            continue;
                        }
                        if (var494 == 3317) {
                            class254.field4519[var6++] = class96.field1501;
                            continue;
                        }
                        if (var494 == 3318) {
                            class254.field4519[var6++] = class74.field1164;
                            continue;
                        }
                        if (var494 == 3321) {
                            class254.field4519[var6++] = class243.field4370;
                            continue;
                        }
                        if (var494 == 3322) {
                            class254.field4519[var6++] = class230.field3943;
                            continue;
                        }
                        if (var494 == 3323) {
                            if (class163.field2690 >= 5 && class163.field2690 <= 9) {
                                class254.field4519[var6++] = 1;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3324) {
                            if (class163.field2690 >= 5 && class163.field2690 <= 9) {
                                class254.field4519[var6++] = class163.field2690;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3325) {
                            class254.field4519[var6++] = class125.field2094 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3326) {
                            class254.field4519[var6++] = class82.field1285.field3241;
                            continue;
                        }
                        if (var494 == 3327) {
                            class254.field4519[var6++] = class82.field1285.field3217.field5030 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3328) {
                            class254.field4519[var6++] = class96.field1505 && !class203.field3474 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3329) {
                            class254.field4519[var6++] = class171.field2880 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3330) {
                            var6--;
                            int var125 = class254.field4519[var6];
                            class254.field4519[var6++] = class163.method1095(23, var125);
                            continue;
                        }
                        if (var494 == 3331) {
                            var6 -= 2;
                            int var126 = class254.field4519[var6];
                            int var127 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class153.method1047(false, -24205, var126, var127);
                            continue;
                        }
                        if (var494 == 3332) {
                            var6 -= 2;
                            int var128 = class254.field4519[var6 + 1];
                            int var129 = class254.field4519[var6];
                            class254.field4519[var6++] = class153.method1047(true, -24205, var129, var128);
                            continue;
                        }
                        if (var494 == 3333) {
                            class254.field4519[var6++] = class7.field121;
                            continue;
                        }
                        if (var494 == 3335) {
                            class254.field4519[var6++] = class181.field3023;
                            continue;
                        }
                    } else if (var494 < 3500) {
                        if (var494 == 3400) {
                            var6 -= 2;
                            int var449 = class254.field4519[var6 + 1];
                            int var450 = class254.field4519[var6];
                            class10 var451 = class174.method1165((byte) 18, var450);
                            class10.field169[var8++] = var451.method68(var449, 89);
                            continue;
                        }
                        if (var494 == 3408) {
                            var6 -= 4;
                            int var452 = class254.field4519[var6];
                            int var453 = class254.field4519[var6 + 1];
                            int var454 = class254.field4519[var6 + 2];
                            int var455 = class254.field4519[var6 + 3];
                            class10 var456 = class174.method1165((byte) 18, var454);
                            if (var456.field183 == var452 && var456.field177 == var453) {
                                if (var453 == 115) {
                                    class10.field169[var8++] = var456.method68(var455, 64);
                                } else {
                                    class254.field4519[var6++] = var456.method67(var455, -1);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var494 == 3409) {
                            var6 -= 3;
                            int var457 = class254.field4519[var6];
                            int var458 = class254.field4519[var6 + 1];
                            int var459 = class254.field4519[var6 + 2];
                            if (var458 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class10 var460 = class174.method1165((byte) 18, var458);
                            if (var460.field177 != var457) {
                                throw new RuntimeException("C3409-1");
                            }
                            class254.field4519[var6++] = var460.method61(var459, (byte) 74) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3410) {
                            var6--;
                            int var461 = class254.field4519[var6];
                            var8--;
                            class37 var462 = class10.field169[var8];
                            if (var461 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class10 var463 = class174.method1165((byte) 18, var461);
                            if (var463.field177 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class254.field4519[var6++] = var463.method64((byte) -44, var462) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3411) {
                            var6--;
                            int var464 = class254.field4519[var6];
                            class10 var465 = class174.method1165((byte) 18, var464);
                            class254.field4519[var6++] = var465.field171.method987((byte) 125);
                            continue;
                        }
                    } else if (var494 < 3700) {
                        if (var494 == 3600) {
                            if (class69.field1093 == 0) {
                                class254.field4519[var6++] = -2;
                            } else if (class69.field1093 == 1) {
                                class254.field4519[var6++] = -1;
                            } else {
                                class254.field4519[var6++] = class242.field4363;
                            }
                            continue;
                        }
                        if (var494 == 3601) {
                            var6--;
                            int var427 = class254.field4519[var6];
                            if (class69.field1093 == 2 && var427 < class242.field4363) {
                                class10.field169[var8++] = class22.field289[var427];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 3602) {
                            var6--;
                            int var428 = class254.field4519[var6];
                            if (class69.field1093 == 2 && var428 < class242.field4363) {
                                class254.field4519[var6++] = class77.field1203[var428];
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3603) {
                            var6--;
                            int var429 = class254.field4519[var6];
                            if (class69.field1093 == 2 && class242.field4363 > var429) {
                                class254.field4519[var6++] = class213.field3681[var429];
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3604) {
                            var6--;
                            int var430 = class254.field4519[var6];
                            var8--;
                            class37 var431 = class10.field169[var8];
                            class51.method331(var431, var430, -12562);
                            continue;
                        }
                        if (var494 == 3605) {
                            var8--;
                            class37 var432 = class10.field169[var8];
                            class94.method615(var432.method217((byte) -102), (byte) -103);
                            continue;
                        }
                        if (var494 == 3606) {
                            var8--;
                            class37 var433 = class10.field169[var8];
                            class264.method1784((byte) 27, var433.method217((byte) -102));
                            continue;
                        }
                        if (var494 == 3607) {
                            var8--;
                            class37 var434 = class10.field169[var8];
                            class181.method1199((byte) -59, var434.method217((byte) -102));
                            continue;
                        }
                        if (var494 == 3608) {
                            var8--;
                            class37 var435 = class10.field169[var8];
                            class168.method1125(106, var435.method217((byte) -102));
                            continue;
                        }
                        if (var494 == 3609) {
                            var8--;
                            class37 var436 = class10.field169[var8];
                            if (var436.method235(class150.field2519, 65) || var436.method235(class252.field4506, 65)) {
                                var436 = var436.method263(7, false);
                            }
                            class254.field4519[var6++] = class79.method531(var436, !arg0) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3610) {
                            var6--;
                            int var437 = class254.field4519[var6];
                            if (class69.field1093 == 2 && class242.field4363 > var437) {
                                class10.field169[var8++] = class174.field2911[var437];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 3611) {
                            if (class81.field1278 == null) {
                                class10.field169[var8++] = class123.field2061;
                            } else {
                                class10.field169[var8++] = class81.field1278.method227(-98);
                            }
                            continue;
                        }
                        if (var494 == 3612) {
                            if (class81.field1278 == null) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = class260.field4594;
                            }
                            continue;
                        }
                        if (var494 == 3613) {
                            var6--;
                            int var438 = class254.field4519[var6];
                            if (class81.field1278 != null && class260.field4594 > var438) {
                                class10.field169[var8++] = class281.field4955[var438].field668.method227(-98);
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 3614) {
                            var6--;
                            int var439 = class254.field4519[var6];
                            if (class81.field1278 != null && var439 < class260.field4594) {
                                class254.field4519[var6++] = class281.field4955[var439].field665;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3615) {
                            var6--;
                            int var440 = class254.field4519[var6];
                            if (class81.field1278 != null && class260.field4594 > var440) {
                                class254.field4519[var6++] = class281.field4955[var440].field662;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3616) {
                            class254.field4519[var6++] = class131.field2191;
                            continue;
                        }
                        if (var494 == 3617) {
                            var8--;
                            class37 var441 = class10.field169[var8];
                            class35.method200(-115, var441);
                            continue;
                        }
                        if (var494 == 3618) {
                            class254.field4519[var6++] = class239.field4257;
                            continue;
                        }
                        if (var494 == 3619) {
                            var8--;
                            class37 var442 = class10.field169[var8];
                            class271.method1815((byte) -79, var442.method217((byte) -102));
                            continue;
                        }
                        if (var494 == 3620) {
                            class153.method1045(0);
                            continue;
                        }
                        if (var494 == 3621) {
                            if (class69.field1093 == 0) {
                                class254.field4519[var6++] = -1;
                            } else {
                                class254.field4519[var6++] = class62.field1028;
                            }
                            continue;
                        }
                        if (var494 == 3622) {
                            var6--;
                            int var443 = class254.field4519[var6];
                            if (class69.field1093 != 0 && var443 < class62.field1028) {
                                class10.field169[var8++] = class35.method201(class68.field1068[var443], 2).method227(-98);
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 3623) {
                            var8--;
                            class37 var444 = class10.field169[var8];
                            if (var444.method235(class150.field2519, 65) || var444.method235(class252.field4506, 65)) {
                                var444 = var444.method263(7, !arg0);
                            }
                            class254.field4519[var6++] = class56.method363(var444, (byte) -59) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3624) {
                            var6--;
                            int var445 = class254.field4519[var6];
                            if (class281.field4955 != null && class260.field4594 > var445 && class281.field4955[var445].field668.method256(true, class82.field1285.field3235)) {
                                class254.field4519[var6++] = 1;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3625) {
                            if (class63.field1038 == null) {
                                class10.field169[var8++] = class123.field2061;
                            } else {
                                class10.field169[var8++] = class63.field1038.method227(-98);
                            }
                            continue;
                        }
                        if (var494 == 3626) {
                            var6--;
                            int var446 = class254.field4519[var6];
                            if (class81.field1278 != null && class260.field4594 > var446) {
                                class10.field169[var8++] = class281.field4955[var446].field669;
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 3627) {
                            var6--;
                            int var447 = class254.field4519[var6];
                            if (class69.field1093 == 2 && var447 >= 0 && var447 < class242.field4363) {
                                class254.field4519[var6++] = class119.field2013[var447] ? 1 : 0;
                                continue;
                            }
                            class254.field4519[var6++] = 0;
                            continue;
                        }
                        if (var494 == 3628) {
                            var8--;
                            class37 var448 = class10.field169[var8];
                            if (var448.method235(class150.field2519, 65) || var448.method235(class252.field4506, 65)) {
                                var448 = var448.method263(7, false);
                            }
                            class254.field4519[var6++] = class92.method597(var448, 0);
                            continue;
                        }
                        if (var494 == 3629) {
                            class254.field4519[var6++] = class58.field930;
                            continue;
                        }
                    } else if (var494 < 4000) {
                        if (var494 == 3903) {
                            var6--;
                            int var413 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var413].method1561(10469);
                            continue;
                        }
                        if (var494 == 3904) {
                            var6--;
                            int var414 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var414].field3863;
                            continue;
                        }
                        if (var494 == 3905) {
                            var6--;
                            int var415 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var415].field3870;
                            continue;
                        }
                        if (var494 == 3906) {
                            var6--;
                            int var416 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var416].field3866;
                            continue;
                        }
                        if (var494 == 3907) {
                            var6--;
                            int var417 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var417].field3872;
                            continue;
                        }
                        if (var494 == 3908) {
                            var6--;
                            int var418 = class254.field4519[var6];
                            class254.field4519[var6++] = class22.field284[var418].field3858;
                            continue;
                        }
                        if (var494 == 3910) {
                            var6--;
                            int var419 = class254.field4519[var6];
                            int var420 = class22.field284[var419].method1564((byte) -64);
                            class254.field4519[var6++] = var420 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3911) {
                            var6--;
                            int var421 = class254.field4519[var6];
                            int var422 = class22.field284[var421].method1564((byte) -106);
                            class254.field4519[var6++] = var422 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3912) {
                            var6--;
                            int var423 = class254.field4519[var6];
                            int var424 = class22.field284[var423].method1564((byte) 101);
                            class254.field4519[var6++] = var424 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3913) {
                            var6--;
                            int var425 = class254.field4519[var6];
                            int var426 = class22.field284[var425].method1564((byte) -85);
                            class254.field4519[var6++] = var426 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var494 < 4100) {
                        if (var494 == 4000) {
                            var6 -= 2;
                            int var368 = class254.field4519[var6 + 1];
                            int var369 = class254.field4519[var6];
                            class254.field4519[var6++] = var368 + var369;
                            continue;
                        }
                        if (var494 == 4001) {
                            var6 -= 2;
                            int var370 = class254.field4519[var6];
                            int var371 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = var370 - var371;
                            continue;
                        }
                        if (var494 == 4002) {
                            var6 -= 2;
                            int var372 = class254.field4519[var6];
                            int var373 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = var372 * var373;
                            continue;
                        }
                        if (var494 == 4003) {
                            var6 -= 2;
                            int var374 = class254.field4519[var6];
                            int var375 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = var374 / var375;
                            continue;
                        }
                        if (var494 == 4004) {
                            var6--;
                            int var376 = class254.field4519[var6];
                            class254.field4519[var6++] = (int) (Math.random() * (double) var376);
                            continue;
                        }
                        if (var494 == 4005) {
                            var6--;
                            int var377 = class254.field4519[var6];
                            class254.field4519[var6++] = (int) ((double) (var377 + 1) * Math.random());
                            continue;
                        }
                        if (var494 == 4006) {
                            var6 -= 5;
                            int var378 = class254.field4519[var6];
                            int var379 = class254.field4519[var6 + 1];
                            int var380 = class254.field4519[var6 + 2];
                            int var381 = class254.field4519[var6 + 4];
                            int var382 = class254.field4519[var6 + 3];
                            class254.field4519[var6++] = var378 + ((var379 - var378) * (var381 - var380) / (var382 - var380));
                            continue;
                        }
                        if (var494 == 4007) {
                            var6 -= 2;
                            long var383 = (long) class254.field4519[var6 + 1];
                            long var385 = (long) class254.field4519[var6];
                            class254.field4519[var6++] = (int) (var383 * var385 / 100L + var385);
                            continue;
                        }
                        if (var494 == 4008) {
                            var6 -= 2;
                            int var387 = class254.field4519[var6 + 1];
                            int var388 = class254.field4519[var6];
                            class254.field4519[var6++] = class94.method617(var388, 0x1 << var387);
                            continue;
                        }
                        if (var494 == 4009) {
                            var6 -= 2;
                            int var389 = class254.field4519[var6];
                            int var390 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class96.method626(-(0x1 << var390) - 1, var389);
                            continue;
                        }
                        if (var494 == 4010) {
                            var6 -= 2;
                            int var391 = class254.field4519[var6 + 1];
                            int var392 = class254.field4519[var6];
                            class254.field4519[var6++] = class96.method626(0x1 << var391, var392) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var494 == 4011) {
                            var6 -= 2;
                            int var393 = class254.field4519[var6];
                            int var394 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = var393 % var394;
                            continue;
                        }
                        if (var494 == 4012) {
                            var6 -= 2;
                            int var395 = class254.field4519[var6 + 1];
                            int var396 = class254.field4519[var6];
                            if (var396 == 0) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = (int) Math.pow((double) var396, (double) var395);
                            }
                            continue;
                        }
                        if (var494 == 4013) {
                            var6 -= 2;
                            int var397 = class254.field4519[var6];
                            int var398 = class254.field4519[var6 + 1];
                            if (var397 == 0) {
                                class254.field4519[var6++] = 0;
                            } else if (var398 == 0) {
                                class254.field4519[var6++] = Integer.MAX_VALUE;
                            } else {
                                class254.field4519[var6++] = (int) Math.pow((double) var397, 1.0D / (double) var398);
                            }
                            continue;
                        }
                        if (var494 == 4014) {
                            var6 -= 2;
                            int var399 = class254.field4519[var6 + 1];
                            int var400 = class254.field4519[var6];
                            class254.field4519[var6++] = class96.method626(var400, var399);
                            continue;
                        }
                        if (var494 == 4015) {
                            var6 -= 2;
                            int var401 = class254.field4519[var6];
                            int var402 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = class94.method617(var402, var401);
                            continue;
                        }
                        if (var494 == 4016) {
                            var6 -= 2;
                            int var403 = class254.field4519[var6 + 1];
                            int var404 = class254.field4519[var6];
                            class254.field4519[var6++] = var404 < var403 ? var404 : var403;
                            continue;
                        }
                        if (var494 == 4017) {
                            var6 -= 2;
                            int var405 = class254.field4519[var6 + 1];
                            int var406 = class254.field4519[var6];
                            class254.field4519[var6++] = var406 > var405 ? var406 : var405;
                            continue;
                        }
                        if (var494 == 4018) {
                            var6 -= 3;
                            long var407 = (long) class254.field4519[var6];
                            long var409 = (long) class254.field4519[var6 + 1];
                            long var411 = (long) class254.field4519[var6 + 2];
                            class254.field4519[var6++] = (int) (var407 * var411 / var409);
                            continue;
                        }
                    } else if (var494 < 4200) {
                        if (var494 == 4100) {
                            var8--;
                            class37 var316 = class10.field169[var8];
                            var6--;
                            int var317 = class254.field4519[var6];
                            class10.field169[var8++] = class156.method1061((byte) 114, new class37[] { var316, class163.method1096(var317, (byte) -35) });
                            continue;
                        }
                        if (var494 == 4101) {
                            var8 -= 2;
                            class37 var318 = class10.field169[var8 + 1];
                            class37 var319 = class10.field169[var8];
                            class10.field169[var8++] = class156.method1061((byte) -114, new class37[] { var319, var318 });
                            continue;
                        }
                        if (var494 == 4102) {
                            var8--;
                            class37 var320 = class10.field169[var8];
                            var6--;
                            int var321 = class254.field4519[var6];
                            class10.field169[var8++] = class156.method1061((byte) -55, new class37[] { var320, class10.method58(var321, true, 10) });
                            continue;
                        }
                        if (var494 == 4103) {
                            var8--;
                            class37 var322 = class10.field169[var8];
                            class10.field169[var8++] = var322.method251((byte) -24);
                            continue;
                        }
                        if (var494 == 4104) {
                            var6--;
                            int var323 = class254.field4519[var6];
                            long var324 = (long) var323 * 86400000L + 1014768000000L;
                            class159.field2647.setTime(new Date(var324));
                            int var326 = class159.field2647.get(5);
                            int var327 = class159.field2647.get(2);
                            int var328 = class159.field2647.get(1);
                            class10.field169[var8++] = class156.method1061((byte) 46, new class37[] { class163.method1096(var326, (byte) -35), class281.field4959, class201.field3424[var327], class281.field4959, class163.method1096(var328, (byte) -35) });
                            continue;
                        }
                        if (var494 == 4105) {
                            var8 -= 2;
                            class37 var329 = class10.field169[var8];
                            class37 var330 = class10.field169[var8 + 1];
                            if (class82.field1285.field3217 != null && class82.field1285.field3217.field5030) {
                                class10.field169[var8++] = var330;
                                continue;
                            }
                            class10.field169[var8++] = var329;
                            continue;
                        }
                        if (var494 == 4106) {
                            var6--;
                            int var331 = class254.field4519[var6];
                            class10.field169[var8++] = class163.method1096(var331, (byte) -35);
                            continue;
                        }
                        if (var494 == 4107) {
                            var8 -= 2;
                            class254.field4519[var6++] = class10.field169[var8].method240(class10.field169[var8 + 1], false);
                            continue;
                        }
                        if (var494 == 4108) {
                            var6 -= 2;
                            var8--;
                            class37 var332 = class10.field169[var8];
                            int var333 = class254.field4519[var6];
                            int var334 = class254.field4519[var6 + 1];
                            byte[] var335 = class69.field1094.method666(0, var334, (byte) -51);
                            class136 var336 = new class136(var335);
                            var336.method1218(class165.field2748, (int[]) null);
                            class254.field4519[var6++] = var336.method1215(var332, var333);
                            continue;
                        }
                        if (var494 == 4109) {
                            var6 -= 2;
                            int var337 = class254.field4519[var6];
                            var8--;
                            class37 var338 = class10.field169[var8];
                            int var339 = class254.field4519[var6 + 1];
                            byte[] var340 = class69.field1094.method666(0, var339, (byte) -51);
                            class136 var341 = new class136(var340);
                            var341.method1218(class165.field2748, (int[]) null);
                            class254.field4519[var6++] = var341.method1216(var338, var337);
                            continue;
                        }
                        if (var494 == 4110) {
                            var8 -= 2;
                            class37 var342 = class10.field169[var8];
                            class37 var343 = class10.field169[var8 + 1];
                            var6--;
                            if (class254.field4519[var6] == 1) {
                                class10.field169[var8++] = var342;
                            } else {
                                class10.field169[var8++] = var343;
                            }
                            continue;
                        }
                        if (var494 == 4111) {
                            var8--;
                            class37 var344 = class10.field169[var8];
                            class10.field169[var8++] = class183.method1225(var344);
                            continue;
                        }
                        if (var494 == 4112) {
                            var6--;
                            int var345 = class254.field4519[var6];
                            var8--;
                            class37 var346 = class10.field169[var8];
                            if (var345 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class10.field169[var8++] = var346.method242(var345, -67);
                            continue;
                        }
                        if (var494 == 4113) {
                            var6--;
                            int var347 = class254.field4519[var6];
                            class254.field4519[var6++] = class139.method978((byte) 60, var347) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4114) {
                            var6--;
                            int var348 = class254.field4519[var6];
                            class254.field4519[var6++] = class248.method1714(var348, -123) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4115) {
                            var6--;
                            int var349 = class254.field4519[var6];
                            class254.field4519[var6++] = class175.method1171(var349, -499336730) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4116) {
                            var6--;
                            int var350 = class254.field4519[var6];
                            class254.field4519[var6++] = class52.method338(var350, true) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4117) {
                            var8--;
                            class37 var351 = class10.field169[var8];
                            if (var351 == null) {
                                class254.field4519[var6++] = 0;
                            } else {
                                class254.field4519[var6++] = var351.method222((byte) 97);
                            }
                            continue;
                        }
                        if (var494 == 4118) {
                            var6 -= 2;
                            int var352 = class254.field4519[var6];
                            int var353 = class254.field4519[var6 + 1];
                            var8--;
                            class37 var354 = class10.field169[var8];
                            class10.field169[var8++] = var354.method247(var352, var353, 0);
                            continue;
                        }
                        if (var494 == 4119) {
                            var8--;
                            class37 var355 = class10.field169[var8];
                            class37 var356 = class235.method1612(var355.method222((byte) -119), !arg0);
                            boolean var357 = false;
                            for (int var358 = 0; var358 < var355.method222((byte) -5); var358++) {
                                int var359 = var355.method215((byte) -43, var358);
                                if (var359 == 60) {
                                    var357 = true;
                                } else if (var359 == 62) {
                                    var357 = false;
                                } else if (!var357) {
                                    var356.method216(-8946, var359);
                                }
                            }
                            var356.method250((byte) -123);
                            class10.field169[var8++] = var356;
                            continue;
                        }
                        if (var494 == 4120) {
                            var6 -= 2;
                            var8--;
                            class37 var360 = class10.field169[var8];
                            int var361 = class254.field4519[var6];
                            int var362 = class254.field4519[var6 + 1];
                            class254.field4519[var6++] = var360.method246(var361, (byte) 59, var362);
                            continue;
                        }
                        if (var494 == 4121) {
                            var8 -= 2;
                            class37 var363 = class10.field169[var8];
                            var6--;
                            int var364 = class254.field4519[var6];
                            class37 var365 = class10.field169[var8 + 1];
                            class254.field4519[var6++] = var363.method239(var365, var364, 255);
                            continue;
                        }
                        if (var494 == 4122) {
                            var6--;
                            int var366 = class254.field4519[var6];
                            class254.field4519[var6++] = class257.method1751(var366, (byte) -122);
                            continue;
                        }
                        if (var494 == 4123) {
                            var6--;
                            int var367 = class254.field4519[var6];
                            class254.field4519[var6++] = class98.method634((byte) 60, var367);
                            continue;
                        }
                    } else if (var494 < 4300) {
                        if (var494 == 4200) {
                            var6--;
                            int var130 = class254.field4519[var6];
                            class10.field169[var8++] = class9.method52(true, var130).field4325;
                            continue;
                        }
                        if (var494 == 4201) {
                            var6 -= 2;
                            int var131 = class254.field4519[var6 + 1];
                            int var132 = class254.field4519[var6];
                            class241 var133 = class9.method52(arg0, var132);
                            if (var131 >= 1 && var131 <= 5 && var133.field4292[var131 - 1] != null) {
                                class10.field169[var8++] = var133.field4292[var131 - 1];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 4202) {
                            var6 -= 2;
                            int var134 = class254.field4519[var6 + 1];
                            int var135 = class254.field4519[var6];
                            class241 var136 = class9.method52(true, var135);
                            if (var134 >= 1 && var134 <= 5 && var136.field4297[var134 - 1] != null) {
                                class10.field169[var8++] = var136.field4297[var134 - 1];
                                continue;
                            }
                            class10.field169[var8++] = class123.field2061;
                            continue;
                        }
                        if (var494 == 4203) {
                            var6--;
                            int var137 = class254.field4519[var6];
                            class254.field4519[var6++] = class9.method52(true, var137).field4313;
                            continue;
                        }
                        if (var494 == 4204) {
                            var6--;
                            int var138 = class254.field4519[var6];
                            class254.field4519[var6++] = class9.method52(true, var138).field4316 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4205) {
                            var6--;
                            int var139 = class254.field4519[var6];
                            class241 var140 = class9.method52(true, var139);
                            if (var140.field4290 == -1 && var140.field4353 >= 0) {
                                class254.field4519[var6++] = var140.field4353;
                                continue;
                            }
                            class254.field4519[var6++] = var139;
                            continue;
                        }
                        if (var494 == 4206) {
                            var6--;
                            int var141 = class254.field4519[var6];
                            class241 var142 = class9.method52(true, var141);
                            if (var142.field4290 >= 0 && var142.field4353 >= 0) {
                                class254.field4519[var6++] = var142.field4353;
                                continue;
                            }
                            class254.field4519[var6++] = var141;
                            continue;
                        }
                        if (var494 == 4207) {
                            var6--;
                            int var143 = class254.field4519[var6];
                            class254.field4519[var6++] = class9.method52(true, var143).field4350 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4208) {
                            var6 -= 2;
                            int var144 = class254.field4519[var6];
                            int var145 = class254.field4519[var6 + 1];
                            class118 var146 = class29.method168(11, var145);
                            if (var146.method842(28253)) {
                                class10.field169[var8++] = class9.method52(true, var144).method1660(var145, 1, var146.field1999);
                            } else {
                                class254.field4519[var6++] = class9.method52(true, var144).method1654(1, var146.field2003, var145);
                            }
                            continue;
                        }
                        if (var494 == 4210) {
                            var8--;
                            class37 var147 = class10.field169[var8];
                            var6--;
                            int var148 = class254.field4519[var6];
                            class42.method277(var147, -1, ~var148 == -2);
                            class254.field4519[var6++] = class288.field5069;
                            continue;
                        }
                        if (var494 == 4211) {
                            if (class73.field1157 != null && class127.field2128 < class288.field5069) {
                                class254.field4519[var6++] = class96.method626(65535, class73.field1157[class127.field2128++]);
                                continue;
                            }
                            class254.field4519[var6++] = -1;
                            continue;
                        }
                        if (var494 == 4212) {
                            class127.field2128 = 0;
                            continue;
                        }
                    } else if (var494 < 4400) {
                        if (var494 == 4300) {
                            var6 -= 2;
                            int var149 = class254.field4519[var6];
                            int var150 = class254.field4519[var6 + 1];
                            class118 var151 = class29.method168(11, var150);
                            if (var151.method842(28253)) {
                                class10.field169[var8++] = class148.method1022(var149, (byte) -116).method1846(105, var151.field1999, var150);
                            } else {
                                class254.field4519[var6++] = class148.method1022(var149, (byte) -116).method1855(var150, (byte) 27, var151.field2003);
                            }
                            continue;
                        }
                        if (var494 == 4301) {
                            var6--;
                            int var152 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var152, (byte) -116).field4885;
                            continue;
                        }
                        if (var494 == 4302) {
                            var6--;
                            int var153 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var153, (byte) -116).field4868;
                            continue;
                        }
                        if (var494 == 4303) {
                            var6--;
                            int var154 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var154, (byte) -116).field4840;
                            continue;
                        }
                        if (var494 == 4304) {
                            var6--;
                            int var155 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var155, (byte) -116).field4869;
                            continue;
                        }
                        if (var494 == 4305) {
                            var6--;
                            int var156 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var156, (byte) -116).field4878;
                            continue;
                        }
                        if (var494 == 4306) {
                            var6--;
                            int var157 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var157, (byte) -116).field4877;
                            continue;
                        }
                        if (var494 == 4307) {
                            var6--;
                            int var158 = class254.field4519[var6];
                            class254.field4519[var6++] = class148.method1022(var158, (byte) -116).field4834;
                            continue;
                        }
                    } else if (var494 >= 4500) {
                        if (var494 >= 4600) {
                            if (var494 < 5100) {
                                if (var494 == 5000) {
                                    class254.field4519[var6++] = class5.field90;
                                    continue;
                                }
                                if (var494 == 5001) {
                                    var6 -= 3;
                                    class127.field2131++;
                                    class5.field90 = class254.field4519[var6];
                                    class93.field1467 = class254.field4519[var6 + 1];
                                    class254.field4517 = class254.field4519[var6 + 2];
                                    class273.field4778.method1697(207, 107);
                                    class273.field4778.method1292(class5.field90, (byte) -64);
                                    class273.field4778.method1292(class93.field1467, (byte) -64);
                                    class273.field4778.method1292(class254.field4517, (byte) -64);
                                    continue;
                                }
                                if (var494 == 5002) {
                                    var6 -= 2;
                                    int var159 = class254.field4519[var6 + 1];
                                    var8--;
                                    class37 var160 = class10.field169[var8];
                                    class228.field3924++;
                                    int var161 = class254.field4519[var6];
                                    class273.field4778.method1697(115, 125);
                                    class273.field4778.method1256(var160.method217((byte) -102), (byte) 84);
                                    class273.field4778.method1292(var161 - 1, (byte) -64);
                                    class273.field4778.method1292(var159, (byte) -64);
                                    continue;
                                }
                                if (var494 == 5003) {
                                    class37 var162 = null;
                                    var6--;
                                    int var163 = class254.field4519[var6];
                                    if (var163 < 100) {
                                        var162 = class143.field2435[var163];
                                    }
                                    if (var162 == null) {
                                        var162 = class123.field2061;
                                    }
                                    class10.field169[var8++] = var162;
                                    continue;
                                }
                                if (var494 == 5004) {
                                    var6--;
                                    int var164 = class254.field4519[var6];
                                    int var165 = -1;
                                    if (var164 < 100 && class143.field2435[var164] != null) {
                                        var165 = class146.field2486[var164];
                                    }
                                    class254.field4519[var6++] = var165;
                                    continue;
                                }
                                if (var494 == 5005) {
                                    class254.field4519[var6++] = class93.field1467;
                                    continue;
                                }
                                if (var494 == 5008) {
                                    var8--;
                                    class37 var166 = class10.field169[var8];
                                    if (var166.method235(class94.field1479, 65)) {
                                        class154.method1057(27649, var166);
                                        continue;
                                    }
                                    if (class127.field2129 == 0 && (class96.field1505 && !class203.field3474 || class171.field2880)) {
                                        continue;
                                    }
                                    class37 var167 = var166.method251((byte) -119);
                                    byte var168 = 0;
                                    if (var167.method235(class259.field4576, 65)) {
                                        var168 = 0;
                                        var166 = var166.method263(class259.field4576.method222((byte) -67), false);
                                    } else if (var167.method235(class59.field980, 65)) {
                                        var166 = var166.method263(class59.field980.method222((byte) -16), false);
                                        var168 = 1;
                                    } else if (var167.method235(class246.field4419, 65)) {
                                        var166 = var166.method263(class246.field4419.method222((byte) -118), false);
                                        var168 = 2;
                                    } else if (var167.method235(class247.field4449, 65)) {
                                        var166 = var166.method263(class247.field4449.method222((byte) -95), !arg0);
                                        var168 = 3;
                                    } else if (var167.method235(class60.field988, 65)) {
                                        var168 = 4;
                                        var166 = var166.method263(class60.field988.method222((byte) -49), !arg0);
                                    } else if (var167.method235(class118.field2005, 65)) {
                                        var166 = var166.method263(class118.field2005.method222((byte) 108), false);
                                        var168 = 5;
                                    } else if (var167.method235(class241.field4323, 65)) {
                                        var166 = var166.method263(class241.field4323.method222((byte) 102), false);
                                        var168 = 6;
                                    } else if (var167.method235(class263.field4631, 65)) {
                                        var166 = var166.method263(class263.field4631.method222((byte) -30), false);
                                        var168 = 7;
                                    } else if (var167.method235(class203.field3465, 65)) {
                                        var166 = var166.method263(class203.field3465.method222((byte) -64), false);
                                        var168 = 8;
                                    } else if (var167.method235(class238.field4236, 65)) {
                                        var168 = 9;
                                        var166 = var166.method263(class238.field4236.method222((byte) -15), !arg0);
                                    } else if (var167.method235(class59.field964, 65)) {
                                        var168 = 10;
                                        var166 = var166.method263(class59.field964.method222((byte) -72), false);
                                    } else if (var167.method235(class197.field3346, 65)) {
                                        var166 = var166.method263(class197.field3346.method222((byte) -79), false);
                                        var168 = 11;
                                    } else if (class181.field3023 != 0) {
                                        if (var167.method235(class259.field4591, 65)) {
                                            var168 = 0;
                                            var166 = var166.method263(class259.field4591.method222((byte) 113), false);
                                        } else if (var167.method235(class59.field974, 65)) {
                                            var168 = 1;
                                            var166 = var166.method263(class59.field974.method222((byte) 84), false);
                                        } else if (var167.method235(class246.field4417, 65)) {
                                            var168 = 2;
                                            var166 = var166.method263(class246.field4417.method222((byte) -9), !arg0);
                                        } else if (var167.method235(class247.field4442, 65)) {
                                            var168 = 3;
                                            var166 = var166.method263(class247.field4442.method222((byte) -45), false);
                                        } else if (var167.method235(class60.field992, 65)) {
                                            var168 = 4;
                                            var166 = var166.method263(class60.field992.method222((byte) -27), false);
                                        } else if (var167.method235(class118.field2008, 65)) {
                                            var168 = 5;
                                            var166 = var166.method263(class118.field2008.method222((byte) -100), false);
                                        } else if (var167.method235(class241.field4346, 65)) {
                                            var166 = var166.method263(class241.field4346.method222((byte) -65), !arg0);
                                            var168 = 6;
                                        } else if (var167.method235(class263.field4633, 65)) {
                                            var168 = 7;
                                            var166 = var166.method263(class263.field4633.method222((byte) -106), false);
                                        } else if (var167.method235(class203.field3464, 65)) {
                                            var168 = 8;
                                            var166 = var166.method263(class203.field3464.method222((byte) -73), false);
                                        } else if (var167.method235(class238.field4234, 65)) {
                                            var168 = 9;
                                            var166 = var166.method263(class238.field4234.method222((byte) 118), false);
                                        } else if (var167.method235(class59.field971, 65)) {
                                            var168 = 10;
                                            var166 = var166.method263(class59.field971.method222((byte) 96), false);
                                        } else if (var167.method235(class197.field3349, 65)) {
                                            var168 = 11;
                                            var166 = var166.method263(class197.field3349.method222((byte) -27), false);
                                        }
                                    }
                                    class37 var169 = var166.method251((byte) -32);
                                    byte var170 = 0;
                                    if (var169.method235(class99.field1544, 65)) {
                                        var170 = 1;
                                        var166 = var166.method263(class99.field1544.method222((byte) -22), false);
                                    } else if (var169.method235(class173.field2895, 65)) {
                                        var170 = 2;
                                        var166 = var166.method263(class173.field2895.method222((byte) 90), false);
                                    } else if (var169.method235(class159.field2654, 65)) {
                                        var170 = 3;
                                        var166 = var166.method263(class159.field2654.method222((byte) -99), false);
                                    } else if (var169.method235(class29.field416, 65)) {
                                        var166 = var166.method263(class29.field416.method222((byte) -106), !arg0);
                                        var170 = 4;
                                    } else if (var169.method235(class111.field1855, 65)) {
                                        var166 = var166.method263(class111.field1855.method222((byte) -92), false);
                                        var170 = 5;
                                    } else if (class181.field3023 != 0) {
                                        if (var169.method235(class99.field1545, 65)) {
                                            var166 = var166.method263(class99.field1545.method222((byte) -70), false);
                                            var170 = 1;
                                        } else if (var169.method235(class173.field2899, 65)) {
                                            var166 = var166.method263(class173.field2899.method222((byte) -112), false);
                                            var170 = 2;
                                        } else if (var169.method235(class159.field2651, 65)) {
                                            var170 = 3;
                                            var166 = var166.method263(class159.field2651.method222((byte) 99), false);
                                        } else if (var169.method235(class29.field423, 65)) {
                                            var166 = var166.method263(class29.field423.method222((byte) 104), false);
                                            var170 = 4;
                                        } else if (var169.method235(class111.field1851, 65)) {
                                            var166 = var166.method263(class111.field1851.method222((byte) 113), !arg0);
                                            var170 = 5;
                                        }
                                    }
                                    class191.field3282++;
                                    class273.field4778.method1697(24, 93);
                                    class273.field4778.method1292(0, (byte) -64);
                                    int var171 = class273.field4778.field3169;
                                    class273.field4778.method1292(var168, (byte) -64);
                                    class273.field4778.method1292(var170, (byte) -64);
                                    class271.method1819(var166, class273.field4778, 118);
                                    class273.field4778.method1296(252, class273.field4778.field3169 - var171);
                                    continue;
                                }
                                if (var494 == 5009) {
                                    var8 -= 2;
                                    class37 var172 = class10.field169[var8];
                                    class37 var173 = class10.field169[var8 + 1];
                                    if (class127.field2129 != 0 || (!class96.field1505 || class203.field3474) && !class171.field2880) {
                                        class203.field3472++;
                                        class273.field4778.method1697(45, 110);
                                        class273.field4778.method1292(0, (byte) -64);
                                        int var174 = class273.field4778.field3169;
                                        class273.field4778.method1256(var172.method217((byte) -102), (byte) 84);
                                        class271.method1819(var173, class273.field4778, 77);
                                        class273.field4778.method1296(252, class273.field4778.field3169 - var174);
                                    }
                                    continue;
                                }
                                if (var494 == 5010) {
                                    var6--;
                                    int var175 = class254.field4519[var6];
                                    class37 var176 = null;
                                    if (var175 < 100) {
                                        var176 = class84.field1320[var175];
                                    }
                                    if (var176 == null) {
                                        var176 = class123.field2061;
                                    }
                                    class10.field169[var8++] = var176;
                                    continue;
                                }
                                if (var494 == 5011) {
                                    var6--;
                                    int var177 = class254.field4519[var6];
                                    class37 var178 = null;
                                    if (var177 < 100) {
                                        var178 = class36.field523[var177];
                                    }
                                    if (var178 == null) {
                                        var178 = class123.field2061;
                                    }
                                    class10.field169[var8++] = var178;
                                    continue;
                                }
                                if (var494 == 5012) {
                                    var6--;
                                    int var179 = class254.field4519[var6];
                                    int var180 = -1;
                                    if (var179 < 100) {
                                        var180 = class39.field626[var179];
                                    }
                                    class254.field4519[var6++] = var180;
                                    continue;
                                }
                                if (var494 == 5015) {
                                    class37 var181;
                                    if (class82.field1285 == null || class82.field1285.field3235 == null) {
                                        var181 = class179.field2990;
                                    } else {
                                        var181 = class82.field1285.method1306((byte) 88);
                                    }
                                    class10.field169[var8++] = var181;
                                    continue;
                                }
                                if (var494 == 5016) {
                                    class254.field4519[var6++] = class254.field4517;
                                    continue;
                                }
                                if (var494 == 5017) {
                                    class254.field4519[var6++] = class198.field3362;
                                    continue;
                                }
                                if (var494 == 5050) {
                                    var6--;
                                    int var182 = class254.field4519[var6];
                                    class10.field169[var8++] = class5.method34(var182, (byte) 99).field4504;
                                    continue;
                                }
                                if (var494 == 5051) {
                                    var6--;
                                    int var183 = class254.field4519[var6];
                                    class252 var184 = class5.method34(var183, (byte) 86);
                                    if (var184.field4500 == null) {
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var184.field4500.length;
                                    }
                                    continue;
                                }
                                if (var494 == 5052) {
                                    var6 -= 2;
                                    int var185 = class254.field4519[var6];
                                    int var186 = class254.field4519[var6 + 1];
                                    class252 var187 = class5.method34(var185, (byte) 100);
                                    int var188 = var187.field4500[var186];
                                    class254.field4519[var6++] = var188;
                                    continue;
                                }
                                if (var494 == 5053) {
                                    var6--;
                                    int var189 = class254.field4519[var6];
                                    class252 var190 = class5.method34(var189, (byte) 101);
                                    if (var190.field4509 == null) {
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var190.field4509.length;
                                    }
                                    continue;
                                }
                                if (var494 == 5054) {
                                    var6 -= 2;
                                    int var191 = class254.field4519[var6];
                                    int var192 = class254.field4519[var6 + 1];
                                    class254.field4519[var6++] = class5.method34(var191, (byte) 79).field4509[var192];
                                    continue;
                                }
                                if (var494 == 5055) {
                                    var6--;
                                    int var193 = class254.field4519[var6];
                                    class10.field169[var8++] = class1.method2(var193, (byte) 126).method179((byte) -96);
                                    continue;
                                }
                                if (var494 == 5056) {
                                    var6--;
                                    int var194 = class254.field4519[var6];
                                    class30 var195 = class1.method2(var194, (byte) 66);
                                    if (var195.field436 == null) {
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var195.field436.length;
                                    }
                                    continue;
                                }
                                if (var494 == 5057) {
                                    var6 -= 2;
                                    int var196 = class254.field4519[var6 + 1];
                                    int var197 = class254.field4519[var6];
                                    class254.field4519[var6++] = class1.method2(var197, (byte) -92).field436[var196];
                                    continue;
                                }
                                if (var494 == 5058) {
                                    class41.field656 = new class178();
                                    var6--;
                                    class41.field656.field2978 = class254.field4519[var6];
                                    class41.field656.field2967 = class1.method2(class41.field656.field2978, (byte) -100);
                                    class41.field656.field2977 = new int[class41.field656.field2967.method178(false)];
                                    continue;
                                }
                                if (var494 == 5059) {
                                    class121.field2047++;
                                    class273.field4778.method1697(213, 116);
                                    class273.field4778.method1292(0, (byte) -64);
                                    int var198 = class273.field4778.field3169;
                                    class273.field4778.method1292(0, (byte) -64);
                                    class273.field4778.method1294(class41.field656.field2978, -26655);
                                    class41.field656.field2967.method172(107, class41.field656.field2977, class273.field4778);
                                    class273.field4778.method1296(252, class273.field4778.field3169 - var198);
                                    continue;
                                }
                                if (var494 == 5060) {
                                    class117.field1992++;
                                    var8--;
                                    class37 var199 = class10.field169[var8];
                                    class273.field4778.method1697(219, 108);
                                    class273.field4778.method1292(0, (byte) -64);
                                    int var200 = class273.field4778.field3169;
                                    class273.field4778.method1256(var199.method217((byte) -102), (byte) 84);
                                    class273.field4778.method1294(class41.field656.field2978, -26655);
                                    class41.field656.field2967.method172(107, class41.field656.field2977, class273.field4778);
                                    class273.field4778.method1296(252, class273.field4778.field3169 - var200);
                                    continue;
                                }
                                if (var494 == 5061) {
                                    class121.field2047++;
                                    class273.field4778.method1697(213, 107);
                                    class273.field4778.method1292(0, (byte) -64);
                                    int var201 = class273.field4778.field3169;
                                    class273.field4778.method1292(1, (byte) -64);
                                    class273.field4778.method1294(class41.field656.field2978, -26655);
                                    class41.field656.field2967.method172(107, class41.field656.field2977, class273.field4778);
                                    class273.field4778.method1296(252, class273.field4778.field3169 - var201);
                                    continue;
                                }
                                if (var494 == 5062) {
                                    var6 -= 2;
                                    int var202 = class254.field4519[var6];
                                    int var203 = class254.field4519[var6 + 1];
                                    class254.field4519[var6++] = class5.method34(var202, (byte) 60).field4497[var203];
                                    continue;
                                }
                                if (var494 == 5063) {
                                    var6 -= 2;
                                    int var204 = class254.field4519[var6];
                                    int var205 = class254.field4519[var6 + 1];
                                    class254.field4519[var6++] = class5.method34(var204, (byte) -112).field4489[var205];
                                    continue;
                                }
                                if (var494 == 5064) {
                                    var6 -= 2;
                                    int var206 = class254.field4519[var6];
                                    int var207 = class254.field4519[var6 + 1];
                                    if (var207 == -1) {
                                        class254.field4519[var6++] = -1;
                                    } else {
                                        class254.field4519[var6++] = class5.method34(var206, (byte) 115).method1718(2134030310, var207);
                                    }
                                    continue;
                                }
                                if (var494 == 5065) {
                                    var6 -= 2;
                                    int var208 = class254.field4519[var6];
                                    int var209 = class254.field4519[var6 + 1];
                                    if (var209 == -1) {
                                        class254.field4519[var6++] = -1;
                                    } else {
                                        class254.field4519[var6++] = class5.method34(var208, (byte) 116).method1728(-7028, var209);
                                    }
                                    continue;
                                }
                                if (var494 == 5066) {
                                    var6--;
                                    int var210 = class254.field4519[var6];
                                    class254.field4519[var6++] = class1.method2(var210, (byte) 120).method178(false);
                                    continue;
                                }
                                if (var494 == 5067) {
                                    var6 -= 2;
                                    int var211 = class254.field4519[var6];
                                    int var212 = class254.field4519[var6 + 1];
                                    int var213 = class1.method2(var211, (byte) -106).method171(var212, false);
                                    class254.field4519[var6++] = var213;
                                    continue;
                                }
                                if (var494 == 5068) {
                                    var6 -= 2;
                                    int var214 = class254.field4519[var6];
                                    int var215 = class254.field4519[var6 + 1];
                                    class41.field656.field2977[var214] = var215;
                                    continue;
                                }
                                if (var494 == 5069) {
                                    var6 -= 2;
                                    int var216 = class254.field4519[var6 + 1];
                                    int var217 = class254.field4519[var6];
                                    class41.field656.field2977[var217] = var216;
                                    continue;
                                }
                                if (var494 == 5070) {
                                    var6 -= 3;
                                    int var218 = class254.field4519[var6];
                                    int var219 = class254.field4519[var6 + 2];
                                    int var220 = class254.field4519[var6 + 1];
                                    class30 var221 = class1.method2(var218, (byte) 56);
                                    if (var221.method171(var220, false) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class254.field4519[var6++] = var221.method176(var219, var220, (byte) 64);
                                    continue;
                                }
                                if (var494 == 5071) {
                                    var8--;
                                    class37 var222 = class10.field169[var8];
                                    var6--;
                                    boolean var223 = class254.field4519[var6] == 1;
                                    class144.method1009(var223, var222, false);
                                    class254.field4519[var6++] = class288.field5069;
                                    continue;
                                }
                                if (var494 == 5072) {
                                    if (class73.field1157 != null && class288.field5069 > class127.field2128) {
                                        class254.field4519[var6++] = class96.method626(class73.field1157[class127.field2128++], 65535);
                                        continue;
                                    }
                                    class254.field4519[var6++] = -1;
                                    continue;
                                }
                                if (var494 == 5073) {
                                    class127.field2128 = 0;
                                    continue;
                                }
                            } else if (var494 < 5200) {
                                if (var494 == 5100) {
                                    if (class158.field2625[86]) {
                                        class254.field4519[var6++] = 1;
                                    } else {
                                        class254.field4519[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var494 == 5101) {
                                    if (class158.field2625[82]) {
                                        class254.field4519[var6++] = 1;
                                    } else {
                                        class254.field4519[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var494 == 5102) {
                                    if (class158.field2625[81]) {
                                        class254.field4519[var6++] = 1;
                                    } else {
                                        class254.field4519[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var494 < 5300) {
                                if (var494 == 5200) {
                                    var6--;
                                    class13.method100(true, class254.field4519[var6]);
                                    continue;
                                }
                                if (var494 == 5201) {
                                    class254.field4519[var6++] = class51.method329(37);
                                    continue;
                                }
                                if (var494 == 5202) {
                                    var6--;
                                    class102.method689(class254.field4519[var6], 24530);
                                    continue;
                                }
                                if (var494 == 5203) {
                                    var8--;
                                    class281.method1886(true, class10.field169[var8]);
                                    continue;
                                }
                                if (var494 == 5204) {
                                    class10.field169[var8 - 1] = class255.method1740(0, class10.field169[var8 - 1]);
                                    continue;
                                }
                                if (var494 == 5205) {
                                    var8--;
                                    class98.method638(-10, class10.field169[var8]);
                                    continue;
                                }
                                if (var494 == 5206) {
                                    var6--;
                                    int var289 = class254.field4519[var6];
                                    class7 var290 = class134.method964(-8239, (var289 & 0xFFFDA00) >> 14, var289 & 0x3FFF);
                                    if (var290 == null) {
                                        class10.field169[var8++] = class123.field2061;
                                    } else {
                                        class10.field169[var8++] = var290.field114;
                                    }
                                    continue;
                                }
                                if (var494 == 5207) {
                                    var8--;
                                    class7 var291 = class167.method1121(-85, class10.field169[var8]);
                                    if (var291 != null && var291.field115 != null) {
                                        class10.field169[var8++] = var291.field115;
                                        continue;
                                    }
                                    class10.field169[var8++] = class123.field2061;
                                    continue;
                                }
                                if (var494 == 5208) {
                                    class254.field4519[var6++] = class69.field1106;
                                    class254.field4519[var6++] = class126.field2126;
                                    continue;
                                }
                                if (var494 == 5209) {
                                    class254.field4519[var6++] = class217.field3738 + class13.field205;
                                    class254.field4519[var6++] = class118.field2004 + class228.field3921 - class28.field414 - 1;
                                    continue;
                                }
                                if (var494 == 5210) {
                                    class7 var292 = class269.method1801((byte) 37);
                                    if (var292 == null) {
                                        class254.field4519[var6++] = 0;
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var292.field126 * 64;
                                        class254.field4519[var6++] = var292.field110 * 64;
                                    }
                                    continue;
                                }
                                if (var494 == 5211) {
                                    class7 var293 = class269.method1801((byte) 66);
                                    if (var293 == null) {
                                        class254.field4519[var6++] = 0;
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var293.field120 - var293.field113;
                                        class254.field4519[var6++] = var293.field116 - var293.field117;
                                    }
                                    continue;
                                }
                                if (var494 == 5212) {
                                    int var294 = class44.method293(-1627);
                                    int var295 = 0;
                                    class37 var296;
                                    if (var294 == -1) {
                                        var296 = class123.field2061;
                                    } else {
                                        var296 = class146.field2477.field67[var294];
                                        var295 = class146.field2477.method30((byte) 49, var294);
                                    }
                                    class37 var297 = var296.method214((byte) 68, class277.field4901, class254.field4512);
                                    class10.field169[var8++] = var297;
                                    class254.field4519[var6++] = var295;
                                    continue;
                                }
                                if (var494 == 5213) {
                                    int var298 = class241.method1659(-4);
                                    int var299 = 0;
                                    class37 var300;
                                    if (var298 == -1) {
                                        var300 = class123.field2061;
                                    } else {
                                        var300 = class146.field2477.field67[var298];
                                        var299 = class146.field2477.method30((byte) 42, var298);
                                    }
                                    class37 var301 = var300.method214((byte) 68, class277.field4901, class254.field4512);
                                    class10.field169[var8++] = var301;
                                    class254.field4519[var6++] = var299;
                                    continue;
                                }
                                if (var494 == 5214) {
                                    var6--;
                                    int var302 = class254.field4519[var6];
                                    class28.method159(-123, var302 & 0x3FFF, (var302 & 0xFFFCE08) >> 14);
                                    continue;
                                }
                                if (var494 == 5215) {
                                    var6--;
                                    int var303 = class254.field4519[var6];
                                    var8--;
                                    class37 var304 = class10.field169[var8];
                                    class171 var305 = class227.method1581(var303 & 0x3FFF, var303 >> 14 & 0x3FFF, -74);
                                    boolean var306 = false;
                                    for (class7 var307 = (class7) var305.method1148(19271); var307 != null; var307 = (class7) var305.method1142(2682)) {
                                        if (var307.field114.method256(true, var304)) {
                                            var306 = true;
                                            break;
                                        }
                                    }
                                    if (var306) {
                                        class254.field4519[var6++] = 1;
                                    } else {
                                        class254.field4519[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var494 == 5216) {
                                    var6--;
                                    int var308 = class254.field4519[var6];
                                    class267.method1793(-30, var308);
                                    continue;
                                }
                                if (var494 == 5217) {
                                    var6--;
                                    int var309 = class254.field4519[var6];
                                    if (class112.method804(!arg0, var309)) {
                                        class254.field4519[var6++] = 1;
                                    } else {
                                        class254.field4519[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var494 < 5400) {
                                if (var494 == 5300) {
                                    var6 -= 2;
                                    class254.field4519[var6++] = 0;
                                    continue;
                                }
                                if (var494 == 5301) {
                                    continue;
                                }
                                if (var494 == 5302) {
                                    class254.field4519[var6++] = 0;
                                    continue;
                                }
                                if (var494 == 5303) {
                                    var6--;
                                    class254.field4519[var6++] = 0;
                                    class254.field4519[var6++] = 0;
                                    continue;
                                }
                                if (var494 == 5305) {
                                    byte var224 = -1;
                                    class254.field4519[var6++] = var224;
                                    continue;
                                }
                                if (var494 == 5306) {
                                    class254.field4519[var6++] = class130.method921(-113);
                                    continue;
                                }
                                if (var494 == 5307) {
                                    var6--;
                                    int var225 = class254.field4519[var6];
                                    if (var225 < 0 || var225 > 2) {
                                        var225 = 0;
                                    }
                                    class80.method540(-1, var225, false, 19661088, -1);
                                    continue;
                                }
                                if (var494 == 5308) {
                                    class254.field4519[var6++] = class121.field2037;
                                    continue;
                                }
                                if (var494 == 5309) {
                                    var6--;
                                    int var226 = class254.field4519[var6];
                                    if (var226 < 0 || var226 > 2) {
                                        var226 = 0;
                                    }
                                    class121.field2037 = var226;
                                    class79.method532(class177.field2957, true);
                                    continue;
                                }
                            } else if (var494 < 5500) {
                                if (var494 == 5400) {
                                    class111.field1848++;
                                    var8 -= 2;
                                    class37 var268 = class10.field169[var8 + 1];
                                    class37 var269 = class10.field169[var8];
                                    var6--;
                                    int var270 = class254.field4519[var6];
                                    class273.field4778.method1697(143, 98);
                                    class273.field4778.method1292(class50.method327(-54, var269) + class50.method327(73, var268) + 1, (byte) -64);
                                    class273.field4778.method1289(var269, -94);
                                    class273.field4778.method1289(var268, -97);
                                    class273.field4778.method1292(var270, (byte) -64);
                                    continue;
                                }
                                if (var494 == 5401) {
                                    var6 -= 2;
                                    class146.field2481[class254.field4519[var6]] = (short) class62.method444((byte) 88, class254.field4519[var6 + 1]);
                                    class278.method1875(28809);
                                    class86.method567((byte) -102);
                                    class274.method1838((byte) -74);
                                    class5.method36(arg0);
                                    class176.method1178(false);
                                    continue;
                                }
                                if (var494 == 5405) {
                                    var6 -= 2;
                                    int var271 = class254.field4519[var6 + 1];
                                    int var272 = class254.field4519[var6];
                                    if (var272 >= 0 && var272 < 2) {
                                        class174.field2912[var272] = new int[var271 << 1][4];
                                    }
                                    continue;
                                }
                                if (var494 == 5406) {
                                    var6 -= 7;
                                    int var273 = class254.field4519[var6];
                                    int var274 = class254.field4519[var6 + 2];
                                    int var275 = class254.field4519[var6 + 1] << 1;
                                    int var276 = class254.field4519[var6 + 3];
                                    int var277 = class254.field4519[var6 + 5];
                                    int var278 = class254.field4519[var6 + 4];
                                    int var279 = class254.field4519[var6 + 6];
                                    if (var273 >= 0 && var273 < 2 && class174.field2912[var273] != null && var275 >= 0 && class174.field2912[var273].length > var275) {
                                        class174.field2912[var273][var275] = new int[] { (class96.method626(268423814, var274) >> 14) * 128, var276, class96.method626(16383, var274) * 128, var279 };
                                        class174.field2912[var273][var275 + 1] = new int[] { (class96.method626(268419592, var278) >> 14) * 128, var277, class96.method626(var278, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var494 == 5407) {
                                    var6--;
                                    int var280 = class174.field2912[class254.field4519[var6]].length >> 1;
                                    class254.field4519[var6++] = var280;
                                    continue;
                                }
                                if (var494 == 5411) {
                                    if (class71.field1114 == null) {
                                        class234.method1608(class237.method1624(-1), 4, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var494 == 5419) {
                                    class37 var281 = class123.field2061;
                                    if (class187.field3198 != null) {
                                        var281 = class150.method1025(class187.field3198.field4487, 15722);
                                        try {
                                            if (class187.field3198.field4483 != null) {
                                                byte[] var282 = ((String) class187.field3198.field4483).getBytes("ISO-8859-1");
                                                var281 = class80.method545(var282.length, 0, var282, (byte) -19);
                                            }
                                        } catch (UnsupportedEncodingException var492) {
                                        }
                                    }
                                    class10.field169[var8++] = var281;
                                    continue;
                                }
                                if (var494 == 5420) {
                                    class254.field4519[var6++] = class207.field3500 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 5421) {
                                    var8--;
                                    class37 var283 = class10.field169[var8];
                                    var6--;
                                    boolean var284 = class254.field4519[var6] == 1;
                                    class37 var285 = class156.method1061((byte) -118, new class37[] { class237.method1624(-1), var283 });
                                    if (class71.field1114 != null || var284 && class207.field3500 != 3 && class207.field3506.startsWith("win") && !class5.field85) {
                                        class179.field2988 = var284;
                                        class144.field2462 = var285;
                                        class123.field2070 = class177.field2957.method1424(16, new String(var285.method261((byte) -6), "ISO-8859-1"));
                                        continue;
                                    }
                                    class234.method1608(var285, 4, var284);
                                    continue;
                                }
                                if (var494 == 5422) {
                                    var8 -= 2;
                                    class37 var286 = class10.field169[var8];
                                    var6--;
                                    int var287 = class254.field4519[var6];
                                    class37 var288 = class10.field169[var8 + 1];
                                    if (var286.method222((byte) 85) > 0) {
                                        if (class19.field255 == null) {
                                            class19.field255 = new class37[class107.field1670[class132.field2221]];
                                        }
                                        class19.field255[var287] = var286;
                                    }
                                    if (var288.method222((byte) 106) > 0) {
                                        if (class269.field4705 == null) {
                                            class269.field4705 = new class37[class107.field1670[class132.field2221]];
                                        }
                                        class269.field4705[var287] = var288;
                                    }
                                    continue;
                                }
                                if (var494 == 5423) {
                                    var8--;
                                    class10.field169[var8].method237((byte) -100);
                                    continue;
                                }
                            } else if (var494 < 5600) {
                                if (var494 == 5500) {
                                    var6 -= 4;
                                    int var256 = class254.field4519[var6];
                                    int var257 = class254.field4519[var6 + 2];
                                    int var258 = class254.field4519[var6 + 1];
                                    int var259 = class254.field4519[var6 + 3];
                                    class241.method1653(var258, var257, 100, var259, ((var256 & 0xFFFD8D2) >> 14) - class40.field642, false, (var256 & 0x3FFF) - class144.field2456);
                                    continue;
                                }
                                if (var494 == 5501) {
                                    var6 -= 4;
                                    int var260 = class254.field4519[var6];
                                    int var261 = class254.field4519[var6 + 2];
                                    int var262 = class254.field4519[var6 + 3];
                                    int var263 = class254.field4519[var6 + 1];
                                    class236.method1616(((var260 & 0xFFFD9F9) >> 14) - class40.field642, (var260 & 0x3FFF) + -class144.field2456, var262, (byte) -97, var263, var261);
                                    continue;
                                }
                                if (var494 == 5502) {
                                    var6 -= 6;
                                    int var264 = class254.field4519[var6];
                                    if (var264 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class100.field1548 = var264;
                                    int var265 = class254.field4519[var6 + 1];
                                    if (class174.field2912[class100.field1548].length >> 1 <= var265 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class41.field651 = 0;
                                    class89.field1424 = var265;
                                    class45.field701 = class254.field4519[var6 + 2];
                                    class201.field3418 = class254.field4519[var6 + 3];
                                    int var266 = class254.field4519[var6 + 4];
                                    if (var266 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class213.field3682 = var266;
                                    int var267 = class254.field4519[var6 + 5];
                                    if (var267 + 1 >= class174.field2912[class213.field3682].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class223.field3837 = var267;
                                    class273.field4794 = 3;
                                    continue;
                                }
                                if (var494 == 5503) {
                                    class272.method1824((byte) 81);
                                    continue;
                                }
                                if (var494 == 5504) {
                                    var6 -= 2;
                                    class10.field166 = class254.field4519[var6];
                                    class25.field355 = class254.field4519[var6 + 1];
                                    class256.method1744(19044);
                                    continue;
                                }
                                if (var494 == 5505) {
                                    class254.field4519[var6++] = class10.field166;
                                    continue;
                                }
                                if (var494 == 5506) {
                                    class254.field4519[var6++] = class25.field355;
                                    continue;
                                }
                            } else if (var494 < 5700) {
                                if (var494 == 5600) {
                                    var8 -= 2;
                                    class37 var252 = class10.field169[var8];
                                    var6--;
                                    int var253 = class254.field4519[var6];
                                    class37 var254 = class10.field169[var8 + 1];
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0 && class178.field2979 == 0) {
                                        class267.method1789(var254, 525, var252, var253);
                                    }
                                    continue;
                                }
                                if (var494 == 5601) {
                                    class151.method1033(false);
                                    continue;
                                }
                                if (var494 == 5602) {
                                    if (class246.field4420 == 0) {
                                        class168.field2808 = -2;
                                    }
                                    continue;
                                }
                                if (var494 == 5603) {
                                    var6 -= 4;
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0 && class178.field2979 == 0) {
                                        class278.method1872(class254.field4519[var6], class254.field4519[var6 + 2], class254.field4519[var6 + 3], (byte) -112, class254.field4519[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var494 == 5604) {
                                    var8--;
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0 && class178.field2979 == 0) {
                                        class153.method1049(class10.field169[var8].method217((byte) -102), 0);
                                    }
                                    continue;
                                }
                                if (var494 == 5605) {
                                    var8 -= 2;
                                    var6 -= 4;
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0 && class178.field2979 == 0) {
                                        class284.method1903(10, class10.field169[var8 + 1], class254.field4519[var6 + 2], class10.field169[var8].method217((byte) -102), class254.field4519[var6 + 3], class254.field4519[var6 + 1], class254.field4519[var6]);
                                    }
                                    continue;
                                }
                                if (var494 == 5606) {
                                    if (class79.field1223 == 0) {
                                        class235.field4056 = -2;
                                    }
                                    continue;
                                }
                                if (var494 == 5607) {
                                    class254.field4519[var6++] = class168.field2808;
                                    continue;
                                }
                                if (var494 == 5608) {
                                    class254.field4519[var6++] = class239.field4242;
                                    continue;
                                }
                                if (var494 == 5609) {
                                    class254.field4519[var6++] = class235.field4056;
                                    continue;
                                }
                                if (var494 == 5610) {
                                    for (int var255 = 0; var255 < 5; var255++) {
                                        class10.field169[var8++] = class108.field1719.length > var255 ? class108.field1719[var255].method227(-98) : class123.field2061;
                                    }
                                    class108.field1719 = null;
                                    continue;
                                }
                                if (var494 == 5611) {
                                    class254.field4519[var6++] = client.field1887;
                                    continue;
                                }
                            } else if (var494 < 6100) {
                                if (var494 == 6001) {
                                    var6--;
                                    int var227 = class254.field4519[var6];
                                    if (var227 < 1) {
                                        var227 = 1;
                                    }
                                    if (var227 > 4) {
                                        var227 = 4;
                                    }
                                    class68.field1088 = var227;
                                    if (class68.field1088 == 1) {
                                        class76.method516(0.9F);
                                    }
                                    if (class68.field1088 == 2) {
                                        class76.method516(0.8F);
                                    }
                                    if (class68.field1088 == 3) {
                                        class76.method516(0.7F);
                                    }
                                    if (class68.field1088 == 4) {
                                        class76.method516(0.6F);
                                    }
                                    class86.method567((byte) 73);
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6002) {
                                    var6--;
                                    class226.method1575(-111, ~class254.field4519[var6] == -2);
                                    class37.method249(false);
                                    class172.method1154(25);
                                    client.method790(-125);
                                    class79.method532(class177.field2957, arg0);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6003) {
                                    var6--;
                                    class198.field3366 = class254.field4519[var6] == 1;
                                    client.method790(-109);
                                    class79.method532(class177.field2957, arg0);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6005) {
                                    var6--;
                                    class271.field4754 = class254.field4519[var6] == 1;
                                    class172.method1154(25);
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6006) {
                                    var6--;
                                    class31.field461 = class254.field4519[var6] == 1;
                                    ((class107) class76.field1196).method713(!class31.field461, 255);
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6007) {
                                    var6--;
                                    client.field1895 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, arg0);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6008) {
                                    var6--;
                                    class124.field2083 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6009) {
                                    var6--;
                                    class40.field646 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6010) {
                                    var6--;
                                    class232.field4013 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6011) {
                                    var6--;
                                    int var228 = class254.field4519[var6];
                                    if (var228 < 0 || var228 > 2) {
                                        var228 = 0;
                                    }
                                    class23.field300 = var228;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6012) {
                                    var6--;
                                    class120.field2034 = class254.field4519[var6] == 1;
                                    if (class68.field1088 == 1) {
                                        class76.method516(0.9F);
                                    }
                                    if (class68.field1088 == 2) {
                                        class76.method516(0.8F);
                                    }
                                    if (class68.field1088 == 3) {
                                        class76.method516(0.7F);
                                    }
                                    if (class68.field1088 == 4) {
                                        class76.method516(0.6F);
                                    }
                                    class172.method1154(25);
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6014) {
                                    var6--;
                                    class36.field517 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6015) {
                                    var6--;
                                    class78.field1217 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6016) {
                                    var6--;
                                    int var229 = class254.field4519[var6];
                                    if (var229 < 0 || var229 > 2) {
                                        var229 = 0;
                                    }
                                    class74.field1162 = var229;
                                    continue;
                                }
                                if (var494 == 6017) {
                                    var6--;
                                    class144.field2467 = class254.field4519[var6] == 1;
                                    class273.method1826((byte) -62);
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6018) {
                                    var6--;
                                    int var230 = class254.field4519[var6];
                                    if (var230 < 0) {
                                        var230 = 0;
                                    }
                                    if (var230 > 127) {
                                        var230 = 127;
                                    }
                                    class156.field2602 = var230;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6019) {
                                    var6--;
                                    int var231 = class254.field4519[var6];
                                    if (var231 < 0) {
                                        var231 = 0;
                                    }
                                    if (var231 > 255) {
                                        var231 = 255;
                                    }
                                    if (class252.field4507 != var231) {
                                        if (class252.field4507 == 0 && class137.field2344 != -1) {
                                            class148.method1020(class92.field1449, -2744, false, class137.field2344, 0, var231);
                                            class108.field1720 = false;
                                        } else if (var231 == 0) {
                                            class255.method1742((byte) 62);
                                            class108.field1720 = false;
                                        } else {
                                            class8.method46((byte) -105, var231);
                                        }
                                        class252.field4507 = var231;
                                    }
                                    class79.method532(class177.field2957, arg0);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6020) {
                                    var6--;
                                    int var232 = class254.field4519[var6];
                                    if (var232 < 0) {
                                        var232 = 0;
                                    }
                                    if (var232 > 127) {
                                        var232 = 127;
                                    }
                                    class151.field2544 = var232;
                                    class79.method532(class177.field2957, true);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6021) {
                                    var6--;
                                    class180.field3000 = class254.field4519[var6] == 1;
                                    client.method790(-104);
                                    continue;
                                }
                                if (var494 == 6023) {
                                    var6--;
                                    int var233 = class254.field4519[var6];
                                    if (var233 < 0) {
                                        var233 = 0;
                                    }
                                    if (var233 > 2) {
                                        var233 = 2;
                                    }
                                    class193.method1328(var233);
                                    class79.method532(class177.field2957, arg0);
                                    class234.field4042 = false;
                                    continue;
                                }
                                if (var494 == 6024) {
                                    var6--;
                                    int var234 = class254.field4519[var6];
                                    if (var234 < 0 || var234 > 2) {
                                        var234 = 0;
                                    }
                                    class24.field315 = var234;
                                    class79.method532(class177.field2957, true);
                                    continue;
                                }
                            } else if (var494 < 6200) {
                                if (var494 == 6101) {
                                    class254.field4519[var6++] = class68.field1088;
                                    continue;
                                }
                                if (var494 == 6102) {
                                    class254.field4519[var6++] = method492(-2001) ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6103) {
                                    class254.field4519[var6++] = class198.field3366 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6105) {
                                    class254.field4519[var6++] = class271.field4754 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6106) {
                                    class254.field4519[var6++] = class31.field461 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6107) {
                                    class254.field4519[var6++] = client.field1895 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6108) {
                                    class254.field4519[var6++] = class124.field2083 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6109) {
                                    class254.field4519[var6++] = class40.field646 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6110) {
                                    class254.field4519[var6++] = class232.field4013 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6111) {
                                    class254.field4519[var6++] = class23.field300;
                                    continue;
                                }
                                if (var494 == 6112) {
                                    class254.field4519[var6++] = class120.field2034 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6114) {
                                    class254.field4519[var6++] = class36.field517 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6115) {
                                    class254.field4519[var6++] = class78.field1217 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6116) {
                                    class254.field4519[var6++] = class74.field1162;
                                    continue;
                                }
                                if (var494 == 6117) {
                                    class254.field4519[var6++] = class144.field2467 ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6118) {
                                    class254.field4519[var6++] = class156.field2602;
                                    continue;
                                }
                                if (var494 == 6119) {
                                    class254.field4519[var6++] = class252.field4507;
                                    continue;
                                }
                                if (var494 == 6120) {
                                    class254.field4519[var6++] = class151.field2544;
                                    continue;
                                }
                                if (var494 == 6121) {
                                    class254.field4519[var6++] = 0;
                                    continue;
                                }
                                if (var494 == 6123) {
                                    class254.field4519[var6++] = class193.method1339();
                                    continue;
                                }
                                if (var494 == 6124) {
                                    class254.field4519[var6++] = class24.field315;
                                    continue;
                                }
                            } else if (var494 < 6300) {
                                if (var494 == 6200) {
                                    var6 -= 2;
                                    class55.field841 = (short) class254.field4519[var6];
                                    if (class55.field841 <= 0) {
                                        class55.field841 = 256;
                                    }
                                    class236.field4060 = (short) class254.field4519[var6 + 1];
                                    if (class236.field4060 <= 0) {
                                        class236.field4060 = 205;
                                    }
                                    continue;
                                }
                                if (var494 == 6201) {
                                    var6 -= 2;
                                    class190.field3261 = (short) class254.field4519[var6];
                                    if (class190.field3261 <= 0) {
                                        class190.field3261 = 256;
                                    }
                                    class208.field3532 = (short) class254.field4519[var6 + 1];
                                    if (class208.field3532 <= 0) {
                                        class208.field3532 = 320;
                                    }
                                    continue;
                                }
                                if (var494 == 6202) {
                                    var6 -= 4;
                                    class13.field208 = (short) class254.field4519[var6];
                                    if (class13.field208 <= 0) {
                                        class13.field208 = 1;
                                    }
                                    class177.field2955 = (short) class254.field4519[var6 + 1];
                                    if (class177.field2955 <= 0) {
                                        class177.field2955 = 32767;
                                    } else if (class177.field2955 < class13.field208) {
                                        class177.field2955 = class13.field208;
                                    }
                                    class27.field384 = (short) class254.field4519[var6 + 2];
                                    if (class27.field384 <= 0) {
                                        class27.field384 = 1;
                                    }
                                    class126.field2124 = (short) class254.field4519[var6 + 3];
                                    if (class126.field2124 <= 0) {
                                        class126.field2124 = 32767;
                                    } else if (class126.field2124 < class27.field384) {
                                        class126.field2124 = class27.field384;
                                    }
                                    continue;
                                }
                                if (var494 == 6203) {
                                    class259.method1752(0, class60.field987.field4206, false, (byte) 93, 0, class60.field987.field4067);
                                    class254.field4519[var6++] = class272.field4772;
                                    class254.field4519[var6++] = class24.field332;
                                    continue;
                                }
                                if (var494 == 6204) {
                                    class254.field4519[var6++] = class190.field3261;
                                    class254.field4519[var6++] = class208.field3532;
                                    continue;
                                }
                                if (var494 == 6205) {
                                    class254.field4519[var6++] = class55.field841;
                                    class254.field4519[var6++] = class236.field4060;
                                    continue;
                                }
                            } else if (var494 < 6400) {
                                if (var494 == 6300) {
                                    class254.field4519[var6++] = (int) (class149.method1024(-14898) / 60000L);
                                    continue;
                                }
                                if (var494 == 6301) {
                                    class254.field4519[var6++] = (int) (class149.method1024(-14898) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var494 == 6302) {
                                    var6 -= 3;
                                    int var235 = class254.field4519[var6];
                                    int var236 = class254.field4519[var6 + 2];
                                    int var237 = class254.field4519[var6 + 1];
                                    class159.field2647.clear();
                                    class159.field2647.set(11, 12);
                                    class159.field2647.set(var236, var237, var235);
                                    class254.field4519[var6++] = (int) (class159.field2647.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var494 == 6303) {
                                    class159.field2647.clear();
                                    class159.field2647.setTime(new Date(class149.method1024(-14898)));
                                    class254.field4519[var6++] = class159.field2647.get(1);
                                    continue;
                                }
                                if (var494 == 6304) {
                                    var6--;
                                    int var238 = class254.field4519[var6];
                                    boolean var239 = true;
                                    if (var238 < 0) {
                                        var239 = ((var238 + 1) % 4) == 0;
                                    } else if (var238 < 1582) {
                                        var239 = (var238 % 4) == 0;
                                    } else if (var238 % 4 != 0) {
                                        var239 = false;
                                    } else if (var238 % 100 != 0) {
                                        var239 = true;
                                    } else if (var238 % 400 != 0) {
                                        var239 = false;
                                    }
                                    class254.field4519[var6++] = var239 ? 1 : 0;
                                    continue;
                                }
                            } else if (var494 < 6500) {
                                if (var494 == 6405) {
                                    class254.field4519[var6++] = class264.method1785(-1) ? 1 : 0;
                                    continue;
                                }
                                if (var494 == 6406) {
                                    class254.field4519[var6++] = class53.method345((byte) -23) ? 1 : 0;
                                    continue;
                                }
                            } else if (var494 < 6600) {
                                if (var494 == 6500) {
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0) {
                                        class254.field4519[var6++] = class81.method546(false) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class254.field4519[var6++] = 1;
                                    continue;
                                }
                                if (var494 == 6501) {
                                    class17 var240 = class53.method343((byte) 103);
                                    if (var240 == null) {
                                        class254.field4519[var6++] = -1;
                                        class254.field4519[var6++] = 0;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var240.field241;
                                        class254.field4519[var6++] = var240.field4609;
                                        class10.field169[var8++] = var240.field240;
                                        class64 var241 = var240.method118(0);
                                        class254.field4519[var6++] = var241.field1044;
                                        class10.field169[var8++] = var241.field1047;
                                        class254.field4519[var6++] = var240.field4613;
                                    }
                                    continue;
                                }
                                if (var494 == 6502) {
                                    class17 var242 = class126.method899((byte) 73);
                                    if (var242 == null) {
                                        class254.field4519[var6++] = -1;
                                        class254.field4519[var6++] = 0;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var242.field241;
                                        class254.field4519[var6++] = var242.field4609;
                                        class10.field169[var8++] = var242.field240;
                                        class64 var243 = var242.method118(0);
                                        class254.field4519[var6++] = var243.field1044;
                                        class10.field169[var8++] = var243.field1047;
                                        class254.field4519[var6++] = var242.field4613;
                                    }
                                    continue;
                                }
                                if (var494 == 6503) {
                                    var6--;
                                    int var244 = class254.field4519[var6];
                                    if (class232.field4011 == 10 && class113.field1918 == 0 && class246.field4420 == 0 && class79.field1223 == 0) {
                                        class254.field4519[var6++] = class187.method1285(var244, -28315) ? 1 : 0;
                                        continue;
                                    }
                                    class254.field4519[var6++] = 0;
                                    continue;
                                }
                                if (var494 == 6504) {
                                    var6--;
                                    class240.field4265 = class254.field4519[var6];
                                    class79.method532(class177.field2957, arg0);
                                    continue;
                                }
                                if (var494 == 6505) {
                                    class254.field4519[var6++] = class240.field4265;
                                    continue;
                                }
                                if (var494 == 6506) {
                                    var6--;
                                    int var245 = class254.field4519[var6];
                                    class17 var246 = class64.method449(var245, -1428);
                                    if (var246 == null) {
                                        class254.field4519[var6++] = -1;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                        class10.field169[var8++] = class123.field2061;
                                        class254.field4519[var6++] = 0;
                                    } else {
                                        class254.field4519[var6++] = var246.field4609;
                                        class10.field169[var8++] = var246.field240;
                                        class64 var247 = var246.method118(0);
                                        class254.field4519[var6++] = var247.field1044;
                                        class10.field169[var8++] = var247.field1047;
                                        class254.field4519[var6++] = var246.field4613;
                                    }
                                    continue;
                                }
                                if (var494 == 6507) {
                                    var6 -= 4;
                                    int var248 = class254.field4519[var6];
                                    boolean var249 = class254.field4519[var6 + 1] == 1;
                                    int var250 = class254.field4519[var6 + 2];
                                    boolean var251 = class254.field4519[var6 + 3] == 1;
                                    class93.method611((byte) -97, var248, var251, var249, var250);
                                    continue;
                                }
                            } else if (var494 < 6700) {
                                if (var494 == 6600) {
                                    var6--;
                                    class202.field3458 = class254.field4519[var6] == 1;
                                    class79.method532(class177.field2957, true);
                                    continue;
                                }
                                if (var494 == 6601) {
                                    class254.field4519[var6++] = class202.field3458 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var494 == 4500) {
                            var6 -= 2;
                            int var310 = class254.field4519[var6 + 1];
                            int var311 = class254.field4519[var6];
                            class118 var312 = class29.method168(11, var310);
                            if (var312.method842(28253)) {
                                class10.field169[var8++] = class102.method685((byte) 68, var311).method1036(var312.field1999, var310, (byte) -111);
                            } else {
                                class254.field4519[var6++] = class102.method685((byte) 109, var311).method1040(var310, (byte) -6, var312.field2003);
                            }
                            continue;
                        }
                    } else if (var494 == 4400) {
                        var6 -= 2;
                        int var313 = class254.field4519[var6];
                        int var314 = class254.field4519[var6 + 1];
                        class118 var315 = class29.method168(11, var314);
                        if (var315.method842(28253)) {
                            class10.field169[var8++] = class178.method1186(var313, 0).method952(var315.field1999, 8, var314);
                        } else {
                            class254.field4519[var6++] = class178.method1186(var313, 0).method955(-91, var314, var315.field2003);
                        }
                        continue;
                    }
                } else {
                    class237 var73;
                    if (var494 < 2000) {
                        var73 = var46 ? class67.field1059 : class247.field4443;
                    } else {
                        var494 -= 1000;
                        var6--;
                        var73 = class156.method1066(-66, class254.field4519[var6]);
                    }
                    if (var494 == 1300) {
                        var6--;
                        int var74 = class254.field4519[var6] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var8--;
                            var73.method1621(-126, var74, class10.field169[var8]);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var494 == 1301) {
                        var6 -= 2;
                        int var75 = class254.field4519[var6 + 1];
                        int var76 = class254.field4519[var6];
                        var73.field4215 = class47.method309(128, var76, var75);
                        continue;
                    }
                    if (var494 == 1302) {
                        var6--;
                        var73.field4111 = class254.field4519[var6] == 1;
                        continue;
                    }
                    if (var494 == 1303) {
                        var6--;
                        var73.field4155 = class254.field4519[var6];
                        continue;
                    }
                    if (var494 == 1304) {
                        var6--;
                        var73.field4216 = class254.field4519[var6];
                        continue;
                    }
                    if (var494 == 1305) {
                        var8--;
                        var73.field4188 = class10.field169[var8];
                        continue;
                    }
                    if (var494 == 1306) {
                        var8--;
                        var73.field4190 = class10.field169[var8];
                        continue;
                    }
                    if (var494 == 1307) {
                        var73.field4076 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var493) {
            if (var5.field158 == null) {
                if (class165.field2737 != 0) {
                    class274.method1839((byte) -110, 0, class123.field2061, class227.field3901);
                }
                class200.method1392(58, "CS2 - scr:" + var5.field1027 + " op:" + var10, var493);
            } else {
                class37 var489 = class235.method1612(30, false);
                var489.method238(class50.field786, (byte) -105).method238(var5.field158, (byte) -112);
                for (int var490 = class217.field3727 - 1; var490 >= 0; var490--) {
                    var489.method238(class75.field1174, (byte) -82).method238(class226.field3877[var490].field4946.field158, (byte) -92);
                }
                if (var10 == 40) {
                    int var491 = var9[var7];
                    var489.method238(class273.field4789, (byte) -80).method238(class163.method1096(var491, (byte) -35), (byte) -86);
                }
                if (class165.field2737 != 0) {
                    class274.method1839((byte) -66, 0, class123.field2061, class156.method1061((byte) 104, new class37[] { class107.field1651, var5.field158 }));
                }
                class200.method1392(58, "CS2 - scr:" + var5.field1027 + " op:" + var10 + new String(var489.method261((byte) -6)), var493);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)I")
    public static final int method488(int arg0, byte arg1) {
        field1145++;
        int var2 = 70 % ((49 - arg1) / 61);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZILjl;Ljl;)Lr;")
    public static final class63 method489(int arg0, boolean arg1, int arg2, class101 arg3, class101 arg4) {
        field1141++;
        boolean var5 = true;
        int[] var6 = arg4.method671(arg0, (byte) 49);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method679(arg0, var6[var7], -105);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method679(0, var9, -15);
                } else {
                    var10 = arg3.method679(var9, 0, -96);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg2 > -116) {
            method487(true, 110, (class85) null);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class63(arg4, arg3, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field1135 = null;
        field1143 = null;
        field1136 = null;
        field1139 = null;
        if (arg0 != -5) {
            method490((byte) -9);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjl;)V")
    public static final void method491(int arg0, class101 arg1) {
        field1140++;
        class210.field3619 = arg1;
        if (arg0 != 1) {
            field1143 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
    public static final boolean method492(int arg0) {
        field1138++;
        if (arg0 != -2001) {
            field1135 = null;
        }
        return class154.field2600;
    }
}
